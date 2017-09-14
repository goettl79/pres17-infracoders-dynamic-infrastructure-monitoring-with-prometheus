package com.infralovers;

import okhttp3.*;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SyntheticTest {

    @Test
    public void putLoadService() throws Exception {
        List<String> serviceUrls = Arrays.asList(
                "http://gitblit.infralovers.com/",
                "http://gitblit.infralovers.com/repositories/",
                "http://gitblit.infralovers.com/filestore/",
                "http://gitblit.infralovers.com/activity/",
                "http://gitblit.infralovers.com/lucene/",
                "http://gitblit.infralovers.com/summary/"
        );
        runUserSimulation(serviceUrls);
    }

    private void runUserSimulation(List<String> serviceUrls) {
        List<String> randomPerformanceData = new ArrayList<>();
        for (int i = 0; i < 50000; i++) {
            randomPerformanceData.addAll(serviceUrls);
        }

        randomPerformanceData.parallelStream().forEach(service -> {
            try {
                Response response = client.newCall(new Request.Builder().url(service).cacheControl(CacheControl.FORCE_NETWORK).build()).execute();
                response.body().close();
                // Assert.assertThat(response.code(), CoreMatchers.equalTo(200));
            } catch (IOException e) {
                Assert.fail("Could not read IO " + e.toString());
            }
        });
    }

    private OkHttpClient client;

    @Before
    public void checkEnvironmentVariablesWereSet() {
        client = new OkHttpClient.Builder().build();
    }

}

