/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFe1wSDK;
import java.util.HashMap;
import java.util.Map;

public class AFa1aSDK {
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

    public AFa1aSDK(String string2, String string3) {
        this(string2, null, string3, (Map<String, String>)new HashMap(), false);
    }

    public AFa1aSDK(String string2, byte[] arrby, String string3, Map<String, String> map, boolean bl) {
        this(string2, arrby, string3, map, bl, true);
    }

    public AFa1aSDK(String string2, byte[] arrby, String string3, Map<String, String> map, boolean bl, boolean bl2) {
        this.getLevel = true;
        this.values = false;
        this.AFInAppEventType = true;
        this.afDebugLog = -1;
        this.valueOf = string2;
        this.afErrorLog = arrby;
        this.AFInAppEventParameterName = string3;
        this.AFKeystoreWrapper = map;
        this.afInfoLog = bl;
        this.AFVersionDeclaration = bl2;
    }

    public static void AFInAppEventType(String string2) {
        AFLogger = string2;
        if (string2 == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = 0; i8 < string2.length(); ++i8) {
            if (i8 != 0 && i8 != string2.length() - 1) {
                stringBuilder.append("*");
                continue;
            }
            stringBuilder.append(string2.charAt(i8));
        }
        afRDLog = stringBuilder.toString();
    }

    public static void values(String string2) {
        String string3;
        if (AFLogger == null) {
            AFa1aSDK.AFInAppEventType(AFa1eSDK.valueOf().AFInAppEventType().afWarnLog().AFInAppEventParameterName);
        }
        if ((string3 = AFLogger) != null) {
            AFLogger.afInfoLog(string2.replace((CharSequence)string3, (CharSequence)afRDLog));
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

    public final AFa1aSDK values(int n8) {
        this.afDebugLog = n8;
        return this;
    }

    public final boolean values() {
        return this.AFVersionDeclaration;
    }
}

