/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.L2
 *  java.lang.Boolean
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Map
 *  org.json.JSONObject
 */
package com.yandex.metrica;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.ModulesFacade;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.ob.L2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class p {
    private static final List<String> a = Arrays.asList((Object[])new String[]{"yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url"});

    public static void a(Context context, IIdentifierCallback iIdentifierCallback) {
        p.a(context, iIdentifierCallback, a);
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback, @NonNull List<String> list) {
        L2.a((Context)context, (IIdentifierCallback)iIdentifierCallback, (List)new ArrayList(list));
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback, String ... stringArray) {
        p.a(context, iIdentifierCallback, (List<String>)Arrays.asList((Object[])stringArray));
    }

    @Deprecated
    @NonNull
    public static YandexMetricaConfig cpcwh(YandexMetricaConfig yandexMetricaConfig, String string2) {
        return L2.a((YandexMetricaConfig)yandexMetricaConfig, (String)string2);
    }

    @NonNull
    public static String gcni(@NonNull Context context) {
        return L2.a((Context)context);
    }

    @Nullable
    public static String gdid(@NonNull Context context) {
        return L2.b((Context)context);
    }

    @NonNull
    public static String gmsvn(int n) {
        return L2.a((int)n);
    }

    public static void guc(@NonNull Ucc ucc, boolean bl) {
        L2.a((Ucc)ucc, (boolean)bl);
    }

    @Nullable
    public static String guid(@NonNull Context context) {
        return L2.d((Context)context);
    }

    @Deprecated(since="Use ModulesFacade.isActivatedForApp")
    public static boolean iifa() {
        return ModulesFacade.isActivatedForApp();
    }

    @NonNull
    public static String mpn(Context context) {
        return L2.c((Context)context);
    }

    @Nullable
    public static String pgai() {
        try {
            String string2 = (String)L2.a().get();
            return string2;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @Nullable
    public static Boolean plat() {
        try {
            Boolean bl = (Boolean)L2.b().get();
            return bl;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @Deprecated(since="Use ModulesFacade.reportEvent")
    public static void rce(int n, String string2, String string3, Map<String, String> map) {
        ModulesFacade.reportEvent(n, string2, string3, map);
    }

    public static void rlse(@NonNull Context context, @Nullable Map<String, Object> map) {
        L2.a((Context)context, map);
    }

    @Deprecated(since="Use ModulesFacade.sendEventsBuffer")
    public static void seb() {
        ModulesFacade.sendEventsBuffer();
    }

    @Deprecated(since="Will be removed in next major release")
    public static void slte(Context context, boolean bl) {
        L2.a((Context)context, (boolean)bl);
    }

    @NonNull
    public static String u(@NonNull String string2) {
        return L2.a((String)string2);
    }

    public static interface Ucc {
        public void onError(@NonNull String var1);

        public void onResult(@NonNull JSONObject var1);
    }
}

