// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1gSDK;
import java.io.IOException;

public class ParsingException extends IOException
{
    @NonNull
    private final AFc1gSDK<String> AFKeystoreWrapper;
    
    public ParsingException(final String message, final Throwable cause, @NonNull final AFc1gSDK<String> afKeystoreWrapper) {
        super(message, cause);
        this.AFKeystoreWrapper = afKeystoreWrapper;
    }
    
    @NonNull
    public AFc1gSDK<String> getRawResponse() {
        return this.AFKeystoreWrapper;
    }
}
