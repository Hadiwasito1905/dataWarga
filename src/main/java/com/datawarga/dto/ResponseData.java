package com.datawarga.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data
@Builder
public class ResponseData<T> {
    private boolean success;
    private String messages;
    private T data;

}
