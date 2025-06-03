/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.models.User
 *  java.lang.Boolean
 *  java.lang.Object
 *  retrofit2.Call
 *  retrofit2.http.GET
 *  retrofit2.http.Query
 */
package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AccountService {
    @GET(value="/1.1/account/verify_credentials.json")
    public Call<User> verifyCredentials(@Query(value="include_entities") Boolean var1, @Query(value="skip_status") Boolean var2, @Query(value="include_email") Boolean var3);
}

