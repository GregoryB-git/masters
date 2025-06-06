package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1kSDK;
import java.io.IOException;

/* loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFc1kSDK valueOf;

    public HttpException(@NonNull Throwable th, @NonNull AFc1kSDK aFc1kSDK) {
        super(th.getMessage(), th);
        this.valueOf = aFc1kSDK;
    }

    @NonNull
    public AFc1kSDK getMetrics() {
        return this.valueOf;
    }
}
