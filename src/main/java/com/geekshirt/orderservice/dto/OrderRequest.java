package com.geekshirt.orderservice.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
@ApiModel(description = "Class representing a order to be processed")
public class OrderRequest {
    @ApiModelProperty(notes = "Account Id", example = "987162991271", required = true)
    private String accountId;
}
