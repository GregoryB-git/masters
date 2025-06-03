/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1kSDK;
import java.io.IOException;

public class HttpException
extends IOException {
    private final AFc1kSDK valueOf;

    public HttpException(@NonNull Throwable throwable, @NonNull AFc1kSDK aFc1kSDK) {
        super(throwable.getMessage(), throwable);
        this.valueOf = aFc1kSDK;
    }

    @NonNull
    public AFc1kSDK getMetrics() {
        return this.valueOf;
    }
}

