/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  retrofit2.Response
 */
package com.twitter.sdk.android.core;

import retrofit2.Response;

public class Result<T> {
    public final T data;
    public final Response response;

    public Result(T t, Response response) {
        this.data = t;
        this.response = response;
    }
}

