package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public final class AFc1dSDK {

    @NotNull
    private static final List<String> afDebugLog;
    private static AFc1fSDK afErrorLog;

    @NotNull
    public final V5.h AFInAppEventType;

    @NotNull
    private final AFb1dSDK AFLogger;

    @NotNull
    private final V5.h afRDLog;

    @NotNull
    private final AFb1gSDK valueOf;

    @NotNull
    public static final AFa1zSDK values = new AFa1zSDK(0);

    @NotNull
    public static String AFInAppEventParameterName = "https://%scdn-%ssettings.%s/android/v1/%s/settings";

    @NotNull
    public static String AFKeystoreWrapper = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    @Metadata
    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFc1aSDK.values().length];
            iArr[AFc1aSDK.DEFAULT.ordinal()] = 1;
            iArr[AFc1aSDK.API.ordinal()] = 2;
            iArr[AFc1aSDK.RC.ordinal()] = 3;
            values = iArr;
        }
    }

    @Metadata
    public static final class AFa1wSDK extends kotlin.jvm.internal.l implements g6.a {
        public AFa1wSDK() {
            super(0);
        }

        @Override // g6.a
        public final /* synthetic */ Object invoke() {
            String packageName = AFc1dSDK.this.valueOf.valueOf.AFInAppEventType.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AFc1dSDK.values(packageName, AFc1dSDK.AFKeystoreWrapper(AFc1dSDK.this));
        }
    }

    @Metadata
    public static final class AFa1xSDK extends kotlin.jvm.internal.l implements g6.a {
        public AFa1xSDK() {
            super(0);
        }

        @Override // g6.a
        public final /* synthetic */ Object invoke() {
            CharSequence f02;
            boolean F6;
            CharSequence f03;
            String AFInAppEventType = AFa1eSDK.AFInAppEventType(AFc1dSDK.this.AFLogger, AFc1dSDK.this.valueOf.values());
            if (AFInAppEventType != null) {
                F6 = kotlin.text.s.F(AFInAppEventType);
                if (!F6) {
                    f03 = kotlin.text.s.f0(AFInAppEventType);
                    String obj = f03.toString();
                    List list = AFc1dSDK.afDebugLog;
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = obj.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (list.contains(lowerCase)) {
                        x xVar = x.f16233a;
                        String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "");
                        AFLogger.afWarnLog(format);
                        AFInAppEventType = "";
                    } else {
                        AFInAppEventType = "-".concat(obj);
                    }
                }
            }
            f02 = kotlin.text.s.f0(AFInAppEventType != null ? AFInAppEventType : "");
            return f02.toString();
        }
    }

    @Metadata
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(byte b7) {
            this();
        }
    }

    static {
        List<String> i7;
        i7 = W5.o.i("googleplay", "playstore", "googleplaystore");
        afDebugLog = i7;
    }

    public AFc1dSDK(@NotNull AFb1gSDK aFb1gSDK, @NotNull AFb1dSDK aFb1dSDK) {
        V5.h a7;
        V5.h a8;
        Intrinsics.checkNotNullParameter(aFb1gSDK, "");
        Intrinsics.checkNotNullParameter(aFb1dSDK, "");
        this.valueOf = aFb1gSDK;
        this.AFLogger = aFb1dSDK;
        a7 = V5.j.a(new AFa1xSDK());
        this.afRDLog = a7;
        a8 = V5.j.a(new AFa1wSDK());
        this.AFInAppEventType = a8;
    }

    public static final /* synthetic */ String AFKeystoreWrapper(AFc1dSDK aFc1dSDK) {
        return (String) aFc1dSDK.afRDLog.getValue();
    }

    @NotNull
    public final String AFInAppEventParameterName() {
        int i7 = AFa1vSDK.values[(AFInAppEventType() ? AFc1aSDK.DEFAULT : AFc1aSDK.API).ordinal()];
        if (i7 == 1) {
            return "appsflyersdk.com";
        }
        if (i7 != 2) {
            if (i7 == 3) {
                return "";
            }
            throw new V5.l();
        }
        AFc1fSDK aFc1fSDK = afErrorLog;
        String str = aFc1fSDK != null ? aFc1fSDK.valueOf : null;
        return str == null ? "" : str;
    }

    @NotNull
    public final String valueOf() {
        int i7 = AFa1vSDK.values[(AFInAppEventType() ? AFc1aSDK.DEFAULT : AFc1aSDK.API).ordinal()];
        if (i7 == 1) {
            return (String) this.AFInAppEventType.getValue();
        }
        if (i7 != 2) {
            if (i7 == 3) {
                return "";
            }
            throw new V5.l();
        }
        AFc1fSDK aFc1fSDK = afErrorLog;
        String str = aFc1fSDK != null ? aFc1fSDK.AFInAppEventParameterName : null;
        return str == null ? "" : str;
    }

    public static boolean AFInAppEventType() {
        return afErrorLog == null;
    }

    public static final void valueOf(AFc1fSDK aFc1fSDK) {
        afErrorLog = aFc1fSDK;
    }

    public static final /* synthetic */ String values(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        String obj = sb2.toString();
        Intrinsics.checkNotNullParameter(obj, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = obj.getBytes(kotlin.text.b.f16240b);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String encodeToString = Base64.encodeToString(digest, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        String lowerCase = encodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String substring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(substring, "");
        sb.append(substring);
        sb.append('-');
        return sb.toString();
    }
}
