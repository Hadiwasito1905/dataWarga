package com.datawarga.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ListDataResponse<T> {
    private T Warga;
    private Integer Total;
}
