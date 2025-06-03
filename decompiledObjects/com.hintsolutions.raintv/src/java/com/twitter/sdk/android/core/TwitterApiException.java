/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonSyntaxException
 *  com.google.gson.TypeAdapterFactory
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  retrofit2.Response
 */
package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapterFactory;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterRateLimit;
import com.twitter.sdk.android.core.models.ApiError;
import com.twitter.sdk.android.core.models.ApiErrors;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import retrofit2.Response;

public class TwitterApiException
extends TwitterException {
    public static final int DEFAULT_ERROR_CODE = 0;
    private final ApiError apiError;
    private final int code;
    private final Response response;
    private final TwitterRateLimit twitterRateLimit;

    public TwitterApiException(Response response) {
        this(response, TwitterApiException.readApiError(response), TwitterApiException.readApiRateLimit(response), response.code());
    }

    public TwitterApiException(Response response, ApiError apiError, TwitterRateLimit twitterRateLimit, int n) {
        super(TwitterApiException.createExceptionMessage(n));
        this.apiError = apiError;
        this.twitterRateLimit = twitterRateLimit;
        this.code = n;
        this.response = response;
    }

    public static String createExceptionMessage(int n) {
        return a.f("HTTP request failed, Status: ", n);
    }

    public static ApiError parseApiError(String string2) {
        Object object = new GsonBuilder().registerTypeAdapterFactory((TypeAdapterFactory)new SafeListAdapter()).registerTypeAdapterFactory((TypeAdapterFactory)new SafeMapAdapter()).create();
        try {
            object = (ApiErrors)object.fromJson(string2, ApiErrors.class);
            if (!((ApiErrors)object).errors.isEmpty()) {
                object = (ApiError)((ApiErrors)object).errors.get(0);
                return object;
            }
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            object = Twitter.getLogger();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid json: ");
            stringBuilder.append(string2);
            object.e("Twitter", stringBuilder.toString(), jsonSyntaxException);
        }
        return null;
    }

    public static ApiError readApiError(Response object) {
        try {
            object = object.errorBody().source().buffer().clone().readUtf8();
            if (!TextUtils.isEmpty((CharSequence)object)) {
                object = TwitterApiException.parseApiError((String)object);
                return object;
            }
        }
        catch (Exception exception) {
            Twitter.getLogger().e("Twitter", "Unexpected response", exception);
        }
        return null;
    }

    public static TwitterRateLimit readApiRateLimit(Response response) {
        return new TwitterRateLimit(response.headers());
    }

    public int getErrorCode() {
        ApiError apiError = this.apiError;
        int n = apiError == null ? 0 : apiError.code;
        return n;
    }

    public String getErrorMessage() {
        Object object = this.apiError;
        object = object == null ? null : ((ApiError)object).message;
        return object;
    }

    public Response getResponse() {
        return this.response;
    }

    public int getStatusCode() {
        return this.code;
    }

    public TwitterRateLimit getTwitterRateLimit() {
        return this.twitterRateLimit;
    }
}

