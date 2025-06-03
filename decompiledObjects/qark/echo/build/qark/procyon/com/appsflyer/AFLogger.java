// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFa1eSDK;
import android.util.Log;

public class AFLogger
{
    private static final long AFKeystoreWrapper;
    
    static {
        AFKeystoreWrapper = System.currentTimeMillis();
    }
    
    public static void AFInAppEventType(final String s) {
        if (!AFInAppEventType()) {
            Log.d("AppsFlyer_6.12.2", valueOf(s, false));
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("F", s);
    }
    
    private static boolean AFInAppEventType() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }
    
    private static boolean AFInAppEventType(final LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }
    
    public static void AFKeystoreWrapper(final String s) {
        if (AFInAppEventType(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.12.2", valueOf(s, false));
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("W", valueOf(s, true));
    }
    
    public static void afDebugLog(final String s) {
        if (AFInAppEventType(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.12.2", valueOf(s, false));
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("D", valueOf(s, true));
    }
    
    public static void afErrorLog(final String s, final Throwable t) {
        afErrorLog(s, t, true, false, true);
    }
    
    public static void afErrorLog(final String s, final Throwable t, final boolean b) {
        afErrorLog(s, t, true, b, true);
    }
    
    public static void afErrorLog(final String s, final Throwable t, final boolean b, final boolean b2) {
        afErrorLog(s, t, true, b, b2);
    }
    
    public static void afErrorLog(String value, final Throwable t, final boolean b, final boolean b2, final boolean b3) {
        String string = value;
        if (value == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(t.getClass().getSimpleName());
            sb.append(" at ");
            sb.append(t.getStackTrace()[0].toString());
            string = sb.toString();
        }
        if (AFInAppEventType(LogLevel.ERROR)) {
            value = valueOf(string, false);
            if (b2) {
                Log.e("AppsFlyer_6.12.2", value, t);
            }
            else if (b) {
                Log.d("AppsFlyer_6.12.2", value);
            }
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventType(t);
        if (b3) {
            AFa1eSDK.valueOf().AFInAppEventType().onConversionDataSuccess().AFKeystoreWrapper(t, string);
        }
    }
    
    @Deprecated
    public static void afErrorLog(final Throwable t) {
        afErrorLogForExcManagerOnly("Unknown", t);
    }
    
    public static void afErrorLogForExcManagerOnly(final String s, final Throwable t) {
        afErrorLogForExcManagerOnly(s, t, false);
    }
    
    public static void afErrorLogForExcManagerOnly(final String s, final Throwable t, final boolean b) {
        afErrorLog(s, t, false, false, b ^ true);
    }
    
    public static void afInfoLog(final String s) {
        afInfoLog(s, true);
    }
    
    public static void afInfoLog(final String s, final boolean b) {
        if (AFInAppEventType(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.12.2", valueOf(s, false));
        }
        if (b) {
            AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("I", valueOf(s, true));
        }
    }
    
    public static void afRDLog(final String s) {
        if (AFInAppEventType(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.12.2", valueOf(s, false));
        }
        AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("V", valueOf(s, true));
    }
    
    public static void afWarnLog(final String s) {
        AFKeystoreWrapper(s);
    }
    
    @NonNull
    private static String valueOf(final String s, final boolean b) {
        String str = s;
        if (s == null) {
            str = "null";
        }
        if (!b && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        final StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - AFLogger.AFKeystoreWrapper);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }
    
    public enum LogLevel
    {
        DEBUG(4), 
        ERROR(1), 
        INFO(3), 
        NONE(0), 
        VERBOSE(5), 
        WARNING(2);
        
        private int AFKeystoreWrapper;
        
        private LogLevel(final int afKeystoreWrapper) {
            this.AFKeystoreWrapper = afKeystoreWrapper;
        }
        
        public final int getLevel() {
            return this.AFKeystoreWrapper;
        }
    }
}
