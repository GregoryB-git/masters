// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
import androidx.annotation.NonNull;

public class AFa1aSDK
{
    private static String AFLogger;
    private static String afRDLog;
    @NonNull
    public final String AFInAppEventParameterName;
    public boolean AFInAppEventType;
    @NonNull
    public final Map<String, String> AFKeystoreWrapper;
    private final boolean AFVersionDeclaration;
    public int afDebugLog;
    private final byte[] afErrorLog;
    private final boolean afInfoLog;
    private boolean getLevel;
    @NonNull
    public final String valueOf;
    public boolean values;
    
    public AFa1aSDK() {
    }
    
    public AFa1aSDK(final String s, final String s2) {
        this(s, null, s2, new HashMap<String, String>(), false);
    }
    
    public AFa1aSDK(final String s, final byte[] array, final String s2, final Map<String, String> map, final boolean b) {
        this(s, array, s2, map, b, true);
    }
    
    public AFa1aSDK(final String valueOf, final byte[] afErrorLog, final String afInAppEventParameterName, final Map<String, String> afKeystoreWrapper, final boolean afInfoLog, final boolean afVersionDeclaration) {
        this.getLevel = true;
        this.values = false;
        this.AFInAppEventType = true;
        this.afDebugLog = -1;
        this.valueOf = valueOf;
        this.afErrorLog = afErrorLog;
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.afInfoLog = afInfoLog;
        this.AFVersionDeclaration = afVersionDeclaration;
    }
    
    public static void AFInAppEventType(final String afLogger) {
        AFa1aSDK.AFLogger = afLogger;
        if (afLogger == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < afLogger.length(); ++i) {
            if (i != 0 && i != afLogger.length() - 1) {
                sb.append("*");
            }
            else {
                sb.append(afLogger.charAt(i));
            }
        }
        AFa1aSDK.afRDLog = sb.toString();
    }
    
    public static void values(final String s) {
        if (AFa1aSDK.AFLogger == null) {
            AFInAppEventType(AFa1eSDK.valueOf().AFInAppEventType().afWarnLog().AFInAppEventParameterName);
        }
        final String afLogger = AFa1aSDK.AFLogger;
        if (afLogger != null) {
            com.appsflyer.AFLogger.afInfoLog(s.replace(afLogger, AFa1aSDK.afRDLog));
        }
    }
    
    public final boolean AFInAppEventParameterName() {
        return this.values;
    }
    
    public final boolean AFInAppEventType() {
        return this.getLevel;
    }
    
    public final boolean AFKeystoreWrapper() {
        return this.afInfoLog;
    }
    
    public final boolean afDebugLog() {
        return this.AFInAppEventType;
    }
    
    public final byte[] valueOf() {
        return this.afErrorLog;
    }
    
    public final AFa1aSDK values(final int afDebugLog) {
        this.afDebugLog = afDebugLog;
        return this;
    }
    
    public final boolean values() {
        return this.AFVersionDeclaration;
    }
}
