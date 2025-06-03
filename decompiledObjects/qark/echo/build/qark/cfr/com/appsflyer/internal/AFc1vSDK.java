/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFc1zSDK;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public interface AFc1vSDK {
    public /* varargs */ boolean AFInAppEventParameterName(@NotNull String ... var1);

    public int AFInAppEventType();

    @NotNull
    public List<AFc1zSDK> AFKeystoreWrapper();

    public String values(@NotNull Throwable var1, @NotNull String var2);

    public boolean values();
}

