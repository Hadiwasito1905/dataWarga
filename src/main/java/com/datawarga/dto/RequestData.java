package com.datawarga.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestData {
    private String nama;
    private String pekerjaan;

}
