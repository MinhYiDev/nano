package com.javaweb.springbootnyano.entity.user;

import com.mysql.cj.protocol.ColumnDefinition;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@Table(name = "java_user_001")
//chỉ ra rằng các câu lệnh trong sql insert chỉ bao gồm các cột có value
//bỏ qua các cột không quá value
@DynamicInsert
//chỉ cập nhật những cột có thay đổi
@DynamicUpdate
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(255) comment 'user name'",nullable = false )
    private String userName;

    @Column(columnDefinition = "varchar(255) comment 'user email'",nullable = false ,unique = true)
    private String userEmail;
}
