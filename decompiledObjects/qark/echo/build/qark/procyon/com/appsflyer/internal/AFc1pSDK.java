// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import W5.C;
import android.text.TextUtils;
import V5.m;
import V5.q;
import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class AFc1pSDK extends AFa1aSDK
{
    @NotNull
    private static AFa1xSDK afErrorLog;
    
    static {
        AFc1pSDK.afErrorLog = new AFa1xSDK((byte)0);
    }
    
    private AFc1pSDK(final String s, final Map<String, String> map, final byte[] array, final String s2, final boolean b) {
        super(s, array, s2, map, false);
    }
    
    @NotNull
    public static final AFc1pSDK AFInAppEventParameterName(@NotNull final String s, final String str, @NotNull final String s2, @NotNull final String s3) {
        Intrinsics.checkNotNullParameter(s, "");
        Intrinsics.checkNotNullParameter(s2, "");
        Intrinsics.checkNotNullParameter(s3, "");
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFc1oSDK.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()));
        sb.append(s);
        sb.append(s2);
        sb.append("?device_id=");
        sb.append(str);
        final String string = sb.toString();
        final String value = String.valueOf(System.currentTimeMillis());
        final m a = q.a("Connection", "close");
        final m a2 = q.a("af_request_epoch_ms", value);
        Intrinsics.checkNotNullParameter(s, "");
        Intrinsics.checkNotNullParameter(s2, "");
        Intrinsics.checkNotNullParameter(s3, "");
        Intrinsics.checkNotNullParameter(value, "");
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append(s2);
        final AFc1pSDK aFc1pSDK = new AFc1pSDK(string, C.f(a, a2, q.a("af_sig", AFc1nSDK.valueOf(TextUtils.join((CharSequence)"\u2063", (Object[])new String[] { value, str, sb2.toString() }), s3))));
        aFc1pSDK.values(10000);
        return aFc1pSDK;
    }
    
    @Metadata
    public static final class AFa1xSDK
    {
        private AFa1xSDK() {
        }
    }
}
