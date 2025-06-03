/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 */
package com.appsflyer;

import android.util.Log;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFc1wSDK;
import com.appsflyer.internal.AFc1xSDK;

public class AFLogger {
    private static final long AFKeystoreWrapper = System.currentTimeMillis();

    public static void AFInAppEventType(String string2) {
        if (!AFLogger.AFInAppEventType()) {
            Log.d((String)"AppsFlyer_6.12.2", (String)AFLogger.valueOf(string2, false));
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("F", string2);
    }

    private static boolean AFInAppEventType() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    private static boolean AFInAppEventType(LogLevel logLevel) {
        if (logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return true;
        }
        return false;
    }

    public static void AFKeystoreWrapper(String string2) {
        if (AFLogger.AFInAppEventType(LogLevel.WARNING)) {
            Log.w((String)"AppsFlyer_6.12.2", (String)AFLogger.valueOf(string2, false));
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("W", AFLogger.valueOf(string2, true));
    }

    public static void afDebugLog(String string2) {
        if (AFLogger.AFInAppEventType(LogLevel.DEBUG)) {
            Log.d((String)"AppsFlyer_6.12.2", (String)AFLogger.valueOf(string2, false));
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("D", AFLogger.valueOf(string2, true));
    }

    public static void afErrorLog(String string2, Throwable throwable) {
        AFLogger.afErrorLog(string2, throwable, true, false, true);
    }

    public static void afErrorLog(String string2, Throwable throwable, boolean bl) {
        AFLogger.afErrorLog(string2, throwable, true, bl, true);
    }

    public static void afErrorLog(String string2, Throwable throwable, boolean bl, boolean bl2) {
        AFLogger.afErrorLog(string2, throwable, true, bl, bl2);
    }

    public static void afErrorLog(String string2, Throwable throwable, boolean bl, boolean bl2, boolean bl3) {
        String string3 = string2;
        if (string2 == null) {
            string2 = new StringBuilder();
            string2.append(throwable.getClass().getSimpleName());
            string2.append(" at ");
            string2.append(throwable.getStackTrace()[0].toString());
            string3 = string2.toString();
        }
        if (AFLogger.AFInAppEventType(LogLevel.ERROR)) {
            string2 = AFLogger.valueOf(string3, false);
            if (bl2) {
                Log.e((String)"AppsFlyer_6.12.2", (String)string2, (Throwable)throwable);
            } else if (bl) {
                Log.d((String)"AppsFlyer_6.12.2", (String)string2);
            }
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventType(throwable);
        if (bl3) {
            AFa1eSDK.valueOf().AFInAppEventType().onConversionDataSuccess().AFKeystoreWrapper(throwable, string3);
        }
    }

    @Deprecated
    public static void afErrorLog(Throwable throwable) {
        AFLogger.afErrorLogForExcManagerOnly("Unknown", throwable);
    }

    public static void afErrorLogForExcManagerOnly(String string2, Throwable throwable) {
        AFLogger.afErrorLogForExcManagerOnly(string2, throwable, false);
    }

    public static void afErrorLogForExcManagerOnly(String string2, Throwable throwable, boolean bl) {
        AFLogger.afErrorLog(string2, throwable, false, false, bl ^ true);
    }

    public static void afInfoLog(String string2) {
        AFLogger.afInfoLog(string2, true);
    }

    public static void afInfoLog(String string2, boolean bl) {
        if (AFLogger.AFInAppEventType(LogLevel.INFO)) {
            Log.i((String)"AppsFlyer_6.12.2", (String)AFLogger.valueOf(string2, false));
        }
        if (bl) {
            AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("I", AFLogger.valueOf(string2, true));
        }
    }

    public static void afRDLog(String string2) {
        if (AFLogger.AFInAppEventType(LogLevel.VERBOSE)) {
            Log.v((String)"AppsFlyer_6.12.2", (String)AFLogger.valueOf(string2, false));
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("V", AFLogger.valueOf(string2, true));
    }

    public static void afWarnLog(String string2) {
        AFLogger.AFKeystoreWrapper(string2);
    }

    @NonNull
    private static String valueOf(String string2, boolean bl) {
        String string3 = string2;
        if (string2 == null) {
            string3 = "null";
        }
        if (!bl && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return string3;
        }
        string2 = new StringBuilder("(");
        string2.append(System.currentTimeMillis() - AFKeystoreWrapper);
        string2.append(") [");
        string2.append(Thread.currentThread().getName());
        string2.append("] ");
        string2.append(string3);
        return string2.toString();
    }

    public static final class LogLevel
    extends Enum<LogLevel> {
        private static final /* synthetic */ LogLevel[] AFInAppEventParameterName;
        public static final /* enum */ LogLevel DEBUG;
        public static final /* enum */ LogLevel ERROR;
        public static final /* enum */ LogLevel INFO;
        public static final /* enum */ LogLevel NONE;
        public static final /* enum */ LogLevel VERBOSE;
        public static final /* enum */ LogLevel WARNING;
        private int AFKeystoreWrapper;

        static {
            LogLevel logLevel;
            LogLevel logLevel2;
            LogLevel logLevel3;
            LogLevel logLevel4;
            LogLevel logLevel5;
            LogLevel logLevel6;
            NONE = logLevel3 = new LogLevel(0);
            ERROR = logLevel6 = new LogLevel(1);
            WARNING = logLevel = new LogLevel(2);
            INFO = logLevel4 = new LogLevel(3);
            DEBUG = logLevel5 = new LogLevel(4);
            VERBOSE = logLevel2 = new LogLevel(5);
            AFInAppEventParameterName = new LogLevel[]{logLevel3, logLevel6, logLevel, logLevel4, logLevel5, logLevel2};
        }

        private LogLevel(int n9) {
            this.AFKeystoreWrapper = n9;
        }

        public static LogLevel valueOf(String string2) {
            return (LogLevel)Enum.valueOf(LogLevel.class, (String)string2);
        }

        public static LogLevel[] values() {
            return (LogLevel[])AFInAppEventParameterName.clone();
        }

        public final int getLevel() {
            return this.AFKeystoreWrapper;
        }
    }

}

