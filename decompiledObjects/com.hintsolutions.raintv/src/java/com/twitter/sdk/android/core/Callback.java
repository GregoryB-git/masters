/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  retrofit2.Call
 *  retrofit2.Callback
 *  retrofit2.Response
 */
package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterApiException;
import com.twitter.sdk.android.core.TwitterException;
import retrofit2.Call;
import retrofit2.Response;

public abstract class Callback<T>
implements retrofit2.Callback<T> {
    public abstract void failure(TwitterException var1);

    public final void onFailure(Call<T> call, Throwable throwable) {
        this.failure(new TwitterException("Request Failure", throwable));
    }

    public final void onResponse(Call<T> call, Response<T> response) {
        if (response.isSuccessful()) {
            this.success(new Result<Object>(response.body(), response));
        } else {
            this.failure(new TwitterApiException(response));
        }
    }

    public abstract void success(Result<T> var1);
}

