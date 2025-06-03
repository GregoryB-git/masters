/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Map
 */
package com.appsflyer.internal;

import V5.m;
import V5.q;
import W5.C;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1oSDK;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFc1pSDK
extends AFa1aSDK {
    @NotNull
    private static AFa1xSDK afErrorLog = new AFa1xSDK(0);

    private /* synthetic */ AFc1pSDK(String string2, Map map) {
        this(string2, map, null, "GET", false);
    }

    private AFc1pSDK(String string2, Map<String, String> map, byte[] arrby, String string3, boolean bl) {
        super(string2, arrby, string3, map, false);
    }

    @NotNull
    public static final AFc1pSDK AFInAppEventParameterName(@NotNull String object, String string2, @NotNull String string3, @NotNull String string4) {
        Intrinsics.checkNotNullParameter(object, "");
        Intrinsics.checkNotNullParameter(string3, "");
        Intrinsics.checkNotNullParameter(string4, "");
        Object object2 = new StringBuilder();
        object2.append(String.format((String)AFc1oSDK.AFInAppEventParameterName, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()}));
        object2.append((String)object);
        object2.append(string3);
        object2.append("?device_id=");
        object2.append(string2);
        object2 = object2.toString();
        String string5 = String.valueOf((long)System.currentTimeMillis());
        m m8 = q.a("Connection", "close");
        m m9 = q.a("af_request_epoch_ms", string5);
        Intrinsics.checkNotNullParameter(object, "");
        Intrinsics.checkNotNullParameter(string3, "");
        Intrinsics.checkNotNullParameter(string4, "");
        Intrinsics.checkNotNullParameter(string5, "");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(string3);
        object = new AFc1pSDK((String)object2, C.f(m8, m9, q.a("af_sig", AFc1nSDK.valueOf(TextUtils.join((CharSequence)"\u2063", (Object[])new String[]{string5, string2, stringBuilder.toString()}), string4))));
        object.values(10000);
        return object;
    }

    @Metadata
    public static final class AFa1xSDK {
        private AFa1xSDK() {
        }

        public /* synthetic */ AFa1xSDK(byte by) {
            this();
        }
    }

}

