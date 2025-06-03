/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.appsflyer.internal;

import android.content.pm.PackageManager;
import com.appsflyer.internal.AFc1xSDK;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public interface AFb1tSDK {
    public void AFInAppEventParameterName();

    public void AFInAppEventParameterName(String var1);

    public void AFInAppEventParameterName(@NotNull String var1, int var2, @NotNull String var3);

    public void AFInAppEventParameterName(@NotNull String var1, @NotNull String var2);

    public /* varargs */ void AFInAppEventParameterName(@NotNull String var1, @NotNull String ... var2);

    public void AFInAppEventType();

    public void AFInAppEventType(@NotNull Throwable var1);

    public void AFKeystoreWrapper();

    public boolean afInfoLog();

    public void valueOf();

    public void valueOf(String var1, PackageManager var2, AFc1xSDK var3);

    public void valueOf(@NotNull String var1, @NotNull String var2);

    public void values();
}

