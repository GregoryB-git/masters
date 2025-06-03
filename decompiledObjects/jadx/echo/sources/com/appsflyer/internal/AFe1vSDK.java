package com.appsflyer.internal;

import java.text.SimpleDateFormat;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public interface AFe1vSDK {
    @NotNull
    String AFInAppEventParameterName();

    void AFInAppEventParameterName(@NotNull Map<String, Object> map);

    String AFInAppEventType();

    void AFInAppEventType(@NotNull Map<String, Object> map);

    void AFInAppEventType(boolean z7, @NotNull Map<String, Object> map, int i7);

    String AFKeystoreWrapper();

    void AFKeystoreWrapper(@NotNull Map<String, Object> map, boolean z7);

    String AFLogger();

    boolean afDebugLog();

    boolean afErrorLog();

    String afInfoLog();

    boolean afRDLog();

    long valueOf();

    void valueOf(@NotNull Map<String, ? extends Object> map);

    void valueOf(@NotNull Map<String, Object> map, @NotNull String str);

    long values();

    String values(@NotNull SimpleDateFormat simpleDateFormat);

    void values(@NotNull Map<String, Object> map);

    void values(@NotNull Map<String, Object> map, String str);
}
