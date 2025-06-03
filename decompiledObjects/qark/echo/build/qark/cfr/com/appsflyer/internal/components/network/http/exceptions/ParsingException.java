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
import com.appsflyer.internal.AFc1gSDK;
import java.io.IOException;

public class ParsingException
extends IOException {
    @NonNull
    private final AFc1gSDK<String> AFKeystoreWrapper;

    public ParsingException(String string2, Throwable throwable, @NonNull AFc1gSDK<String> aFc1gSDK) {
        super(string2, throwable);
        this.AFKeystoreWrapper = aFc1gSDK;
    }

    @NonNull
    public AFc1gSDK<String> getRawResponse() {
        return this.AFKeystoreWrapper;
    }
}

