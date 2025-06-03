// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1kSDK;
import java.io.IOException;

public class HttpException extends IOException
{
    private final AFc1kSDK valueOf;
    
    public HttpException(@NonNull final Throwable cause, @NonNull final AFc1kSDK valueOf) {
        super(cause.getMessage(), cause);
        this.valueOf = valueOf;
    }
    
    @NonNull
    public AFc1kSDK getMetrics() {
        return this.valueOf;
    }
}
