package com.izaan.apitests;

import base.BaseAssertion;
import com.izaan.api.GetTollCollectionList;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetTollCollectionListTest {
    @Test
    public void getTollCollectionListTest(){
        Response re= GetTollCollectionList.getTollCollectionList();

        BaseAssertion.verifyStatusCode(re,200);
        BaseAssertion.verifySpecificMessage(re,"message","success");
        BaseAssertion.verifySpecificMessage(re,"statusCode","200");
    }

}
