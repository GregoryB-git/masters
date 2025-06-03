package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
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

    public AFa1aSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }

    public static void AFInAppEventType(String str) {
        AFLogger = str;
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            if (i7 == 0 || i7 == str.length() - 1) {
                sb.append(str.charAt(i7));
            } else {
                sb.append("*");
            }
        }
        afRDLog = sb.toString();
    }

    public final boolean AFInAppEventParameterName() {
        return this.values;
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

    public final AFa1aSDK values(int i7) {
        this.afDebugLog = i7;
        return this;
    }

    public AFa1aSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z7) {
        this(str, bArr, str2, map, z7, true);
    }

    public static void values(String str) {
        if (AFLogger == null) {
            AFInAppEventType(AFa1eSDK.valueOf().AFInAppEventType().afWarnLog().AFInAppEventParameterName);
        }
        String str2 = AFLogger;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, afRDLog));
        }
    }

    public final boolean AFInAppEventType() {
        return this.getLevel;
    }

    public AFa1aSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z7, boolean z8) {
        this.getLevel = true;
        this.values = false;
        this.AFInAppEventType = true;
        this.afDebugLog = -1;
        this.valueOf = str;
        this.afErrorLog = bArr;
        this.AFInAppEventParameterName = str2;
        this.AFKeystoreWrapper = map;
        this.afInfoLog = z7;
        this.AFVersionDeclaration = z8;
    }

    public final boolean values() {
        return this.AFVersionDeclaration;
    }
}
