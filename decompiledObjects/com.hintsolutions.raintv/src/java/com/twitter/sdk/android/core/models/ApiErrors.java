/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.util.List
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.ApiError;
import com.twitter.sdk.android.core.models.ModelUtils;
import java.util.List;

public class ApiErrors {
    @SerializedName(value="errors")
    public final List<ApiError> errors;

    private ApiErrors() {
        this(null);
    }

    public ApiErrors(List<ApiError> list) {
        this.errors = ModelUtils.getSafeList(list);
    }
}

