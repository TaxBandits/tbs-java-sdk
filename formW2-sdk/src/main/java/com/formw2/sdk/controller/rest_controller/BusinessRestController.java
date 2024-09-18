package com.formw2.sdk.controller.rest_controller;

import com.formw2.sdk.model.BusinessListResponse;
import com.formw2.sdk.model.CreateBusinessRequest;
import com.formw2.sdk.model.CreateBusinessResponse;
import com.formw2.sdk.retrofit.RetrofitResponse;
import com.formw2.sdk.retrofit.services.BusinessListService;
import com.formw2.sdk.retrofit.services.CreateBusinessService;
import jakarta.servlet.http.HttpServletRequest;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessRestController {

    /**
     * Get Business list from API
     * Endpoint: /businessList
     * Method: GET
     **/
    @GetMapping("/businessList")
    public RetrofitResponse<BusinessListResponse> getBusinessList(HttpServletRequest httpServletRequest) {
        String jwtToken = new OauthRestController().readJwt(httpServletRequest);
        return BusinessListService.businessList(jwtToken);
    }

    /**
     * Create a business using the API
     * Endpoint: /createBusiness
     * Method: POST
     * Parameters: CreateBusinessRequest() // Model should be NotNull
     **/
    @PostMapping("/createBusiness")
    public RetrofitResponse<CreateBusinessResponse> createBusiness(HttpServletRequest httpServletRequest, @NotNull @RequestBody CreateBusinessRequest request) {
        String jwtToken = new OauthRestController().readJwt(httpServletRequest);
        return CreateBusinessService.createBusiness(jwtToken, request);
    }

}
