package com.example.news;

import org.junit.Test;
import retrofit2.Retrofit;
import static com.example.news.api.ApiClient.getApiClient;
import static org.junit.Assert.*;

public class ApiClientTest {
    @Test
    public void testApiClient() {
        Retrofit output = getApiClient();
        assertNotNull(output);
    }

}