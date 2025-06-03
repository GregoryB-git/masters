package com.appsflyer.internal;

import W5.F;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public final class AFc1pSDK extends AFa1aSDK {

    @NotNull
    private static AFa1xSDK afErrorLog = new AFa1xSDK(0);

    @Metadata
    public static final class AFa1xSDK {
        private AFa1xSDK() {
        }

        public /* synthetic */ AFa1xSDK(byte b7) {
            this();
        }
    }

    private /* synthetic */ AFc1pSDK(String str, Map map) {
        this(str, map, null, "GET", false);
    }

    @NotNull
    public static final AFc1pSDK AFInAppEventParameterName(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4) {
        Map f7;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFc1oSDK.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()));
        sb.append(str);
        sb.append(str3);
        sb.append("?device_id=");
        sb.append(str2);
        String obj = sb.toString();
        String valueOf = String.valueOf(System.currentTimeMillis());
        V5.m a7 = V5.q.a("Connection", "close");
        V5.m a8 = V5.q.a("af_request_epoch_ms", valueOf);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(valueOf, "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str3);
        f7 = F.f(a7, a8, V5.q.a("af_sig", AFc1nSDK.valueOf(TextUtils.join("\u2063", new String[]{valueOf, str2, sb2.toString()}), str4)));
        AFc1pSDK aFc1pSDK = new AFc1pSDK(obj, f7);
        aFc1pSDK.values(10000);
        return aFc1pSDK;
    }

    private AFc1pSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z7) {
        super(str, bArr, str2, map, false);
    }
}
