/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.text.SimpleDateFormat
 *  java.util.Map
 */
package com.appsflyer.internal;

import java.text.SimpleDateFormat;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public interface AFe1vSDK {
    @NotNull
    public String AFInAppEventParameterName();

    public void AFInAppEventParameterName(@NotNull Map<String, Object> var1);

    public String AFInAppEventType();

    public void AFInAppEventType(@NotNull Map<String, Object> var1);

    public void AFInAppEventType(boolean var1, @NotNull Map<String, Object> var2, int var3);

    public String AFKeystoreWrapper();

    public void AFKeystoreWrapper(@NotNull Map<String, Object> var1, boolean var2);

    public String AFLogger();

    public boolean afDebugLog();

    public boolean afErrorLog();

    public String afInfoLog();

    public boolean afRDLog();

    public long valueOf();

    public void valueOf(@NotNull Map<String, ? extends Object> var1);

    public void valueOf(@NotNull Map<String, Object> var1, @NotNull String var2);

    public long values();

    public String values(@NotNull SimpleDateFormat var1);

    public void values(@NotNull Map<String, Object> var1);

    public void values(@NotNull Map<String, Object> var1, String var2);
}

