package com.javaweb.springbootnyano.repository;

import com.javaweb.springbootnyano.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {
    //find username vs userEmail
    //  findByUserNameAndUserEmail
    //  UserNameAndUserEmail

    //  userNameAnduserEmail

    //    UserEntity findByUserNameAndUserEmail(String userName,String userEmail);
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    //userName
    //    UserEntity findByUserName(String userName);

    /**
     * WHERE userName LIKE %?
     */
//    List<UserEntity> findByUserNameStartingWith(String userEmail);

    /**
     * WHERE userName LIKE ?%
     */
//    List<UserEntity> findByUserNameEndingWith(String userName);

    /**
     * WHERE id < 1
     */
//    List<UserEntity> findByIdLessThan(Long id);


    //RAW JPQL
//    @Query("SELECT u FROM UserEntity u WHERE u.id = (SELECT MAX(p.id) FROM UserEntity p)")
//    List<UserEntity> findByMaxId();
//
//
//    @Query("SELECT u FROM UserEntity u WHERE u.userName = ?1 AND u.userEmail = ?2")
//    List<UserEntity> getUserEntityBy(String userName,String userEmail);
//
//    @Query("SELECT u FROM UserEntity u WHERE u.userName = :userName AND u.userEmail = :userEmail")
//    List<UserEntity> getUserEntityTwo(@Param("userName") String userName, @Param("userEmail") String userEmail);


    /**
     * UPDATE DELETE
     */
//    @Modifying
//    @Query("UPDATE UserEntity u SET u.userName = :userName")
//    int updateUserName(UserEntity userEntity);


    //native query
    /**
     * get count user
     *
     */
//    @Query(value = "SELECT COUNT(id) FROM java_user_001",nativeQuery = true)
//    long getTotalUser();


}
