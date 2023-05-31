package com.retailer.controllers.exception;

public record ErrorResponse(Integer status, String error, String message) {
}
