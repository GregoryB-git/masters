package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AFa1qSDK {
    public AppsFlyerRequestListener AFInAppEventParameterName;
    public String AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public int AFLogger;
    private final boolean AFLogger$LogLevel;
    private byte[] AFVersionDeclaration;
    String afDebugLog;
    String afErrorLog;
    String afInfoLog;
    public String afRDLog;
    String valueOf;
    Map<String, Object> values;

    public AFa1qSDK() {
        this(null, null, null);
    }

    public static boolean AFInAppEventType(double d7) {
        if (d7 < 0.0d || d7 >= 1.0d) {
            return false;
        }
        if (d7 == 0.0d) {
            return true;
        }
        int i7 = (int) (1.0d / d7);
        if (i7 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i7)) + 1.0d)) != i7;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public final AFa1qSDK AFInAppEventParameterName(int i7) {
        this.AFLogger = i7;
        synchronized (this.AFKeystoreWrapper) {
            try {
                if (this.AFKeystoreWrapper.containsKey("counter")) {
                    this.AFKeystoreWrapper.put("counter", Integer.toString(i7));
                }
                if (this.AFKeystoreWrapper.containsKey("launch_counter")) {
                    this.AFKeystoreWrapper.put("launch_counter", Integer.toString(i7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public abstract AFd1vSDK AFInAppEventType();

    public AFa1qSDK AFKeystoreWrapper(String str) {
        this.afRDLog = str;
        return this;
    }

    public boolean afDebugLog() {
        return true;
    }

    public boolean afErrorLog() {
        return true;
    }

    public boolean afInfoLog() {
        return true;
    }

    public boolean afRDLog() {
        return false;
    }

    public final AFa1qSDK valueOf(byte[] bArr) {
        this.AFVersionDeclaration = bArr;
        return this;
    }

    public final AFa1qSDK values(Map<String, ?> map) {
        synchronized (map) {
            this.AFKeystoreWrapper.putAll(map);
        }
        return this;
    }

    public AFa1qSDK(String str, String str2, Boolean bool) {
        this.AFKeystoreWrapper = new HashMap();
        this.afDebugLog = str;
        this.afRDLog = str2;
        this.AFLogger$LogLevel = bool != null ? bool.booleanValue() : true;
    }

    @NonNull
    public static String AFInAppEventParameterName(String str) {
        String values = AFa1eSDK.valueOf().AFInAppEventType().AFInAppEventParameterName().values();
        return values != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, values).build().toString() : str;
    }

    public final AFa1qSDK AFKeystoreWrapper(String str, Object obj) {
        synchronized (this.AFKeystoreWrapper) {
            this.AFKeystoreWrapper.put(str, obj);
        }
        return this;
    }

    public final Map<String, Object> valueOf() {
        return this.AFKeystoreWrapper;
    }

    public final boolean values() {
        return this.AFLogger$LogLevel;
    }

    public final boolean AFInAppEventParameterName() {
        return this.afDebugLog == null && this.AFInAppEventType == null;
    }

    public final byte[] AFKeystoreWrapper() {
        return this.AFVersionDeclaration;
    }
}
