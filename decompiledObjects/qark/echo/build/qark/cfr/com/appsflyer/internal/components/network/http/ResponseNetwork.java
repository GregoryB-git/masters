/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.appsflyer.internal.components.network.http;

import androidx.annotation.NonNull;
import java.util.List;

public interface ResponseNetwork<Body> {
    @NonNull
    public Body getBody();

    public List<String> getHeaderField(String var1);

    public int getStatusCode();

    public boolean isSuccessful();
}

