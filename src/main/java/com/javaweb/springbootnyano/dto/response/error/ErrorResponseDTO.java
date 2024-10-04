package com.javaweb.springbootnyano.dto.response.error;


import lombok.Data;

import java.util.List;


public class ErrorResponseDTO {

    private boolean status;

    private List<CustomDataErrorDTO> data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<CustomDataErrorDTO> getData() {
        return data;
    }

    public void setData(List<CustomDataErrorDTO> data) {
        this.data = data;
    }
}
