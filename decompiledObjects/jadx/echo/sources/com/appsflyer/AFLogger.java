package com.appsflyer;

import android.util.Log;
import androidx.annotation.NonNull;
import com.appsflyer.internal.AFa1eSDK;

/* loaded from: classes.dex */
public class AFLogger {
    private static final long AFKeystoreWrapper = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private int AFKeystoreWrapper;

        LogLevel(int i7) {
            this.AFKeystoreWrapper = i7;
        }

        public final int getLevel() {
            return this.AFKeystoreWrapper;
        }
    }

    public static void AFInAppEventType(String str) {
        if (!AFInAppEventType()) {
            Log.d("AppsFlyer_6.12.2", valueOf(str, false));
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("F", str);
    }

    public static void AFKeystoreWrapper(String str) {
        if (AFInAppEventType(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.12.2", valueOf(str, false));
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("W", valueOf(str, true));
    }

    public static void afDebugLog(String str) {
        if (AFInAppEventType(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.12.2", valueOf(str, false));
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("D", valueOf(str, true));
    }

    public static void afErrorLog(String str, Throwable th) {
        afErrorLog(str, th, true, false, true);
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th) {
        afErrorLogForExcManagerOnly(str, th, false);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    public static void afRDLog(String str) {
        if (AFInAppEventType(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.12.2", valueOf(str, false));
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("V", valueOf(str, true));
    }

    public static void afWarnLog(String str) {
        AFKeystoreWrapper(str);
    }

    @NonNull
    private static String valueOf(String str, boolean z7) {
        if (str == null) {
            str = "null";
        }
        if (!z7 && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - AFKeystoreWrapper);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    private static boolean AFInAppEventType() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void afErrorLog(String str, Throwable th, boolean z7) {
        afErrorLog(str, th, true, z7, true);
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th, boolean z7) {
        afErrorLog(str, th, false, false, !z7);
    }

    public static void afInfoLog(String str, boolean z7) {
        if (AFInAppEventType(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.12.2", valueOf(str, false));
        }
        if (z7) {
            AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("I", valueOf(str, true));
        }
    }

    private static boolean AFInAppEventType(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void afErrorLog(String str, Throwable th, boolean z7, boolean z8) {
        afErrorLog(str, th, true, z7, z8);
    }

    public static void afErrorLog(String str, Throwable th, boolean z7, boolean z8, boolean z9) {
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(th.getClass().getSimpleName());
            sb.append(" at ");
            sb.append(th.getStackTrace()[0].toString());
            str = sb.toString();
        }
        if (AFInAppEventType(LogLevel.ERROR)) {
            String valueOf = valueOf(str, false);
            if (z8) {
                Log.e("AppsFlyer_6.12.2", valueOf, th);
            } else if (z7) {
                Log.d("AppsFlyer_6.12.2", valueOf);
            }
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventType(th);
        if (z9) {
            AFa1eSDK.valueOf().AFInAppEventType().onConversionDataSuccess().AFKeystoreWrapper(th, str);
        }
    }

    @Deprecated
    public static void afErrorLog(Throwable th) {
        afErrorLogForExcManagerOnly("Unknown", th);
    }
}
