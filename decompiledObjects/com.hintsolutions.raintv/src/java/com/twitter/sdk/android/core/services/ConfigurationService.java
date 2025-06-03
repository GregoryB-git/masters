/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  retrofit2.Call
 *  retrofit2.http.GET
 */
package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.Configuration;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ConfigurationService {
    @GET(value="/1.1/help/configuration.json")
    public Call<Configuration> configuration();
}

