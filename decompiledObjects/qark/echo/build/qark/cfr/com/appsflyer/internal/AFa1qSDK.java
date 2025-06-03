/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 */
package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1vSDK;
import java.util.HashMap;
import java.util.Map;

public abstract class AFa1qSDK {
    public AppsFlyerRequestListener AFInAppEventParameterName;
    public String AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper = new HashMap();
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

    public AFa1qSDK(String string2, String string3, Boolean bl) {
        this.afDebugLog = string2;
        this.afRDLog = string3;
        boolean bl2 = bl != null ? bl : true;
        this.AFLogger$LogLevel = bl2;
    }

    @NonNull
    public static String AFInAppEventParameterName(String string2) {
        String string3 = AFa1eSDK.valueOf().AFInAppEventType().AFInAppEventParameterName().values();
        String string4 = string2;
        if (string3 != null) {
            string4 = Uri.parse((String)string2).buildUpon().appendQueryParameter("channel", string3).build().toString();
        }
        return string4;
    }

    public static boolean AFInAppEventType(double d8) {
        if (d8 >= 0.0) {
            if (d8 >= 1.0) {
                return false;
            }
            if (d8 == 0.0) {
                return true;
            }
            int n8 = (int)(1.0 / d8);
            if (n8 + 1 > 0) {
                if ((int)(Math.random() * (double)n8 + 1.0) != n8) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Unsupported max value");
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFa1qSDK AFInAppEventParameterName(int n8) {
        this.AFLogger = n8;
        Map<String, Object> map = this.AFKeystoreWrapper;
        synchronized (map) {
            try {
                if (this.AFKeystoreWrapper.containsKey((Object)"counter")) {
                    this.AFKeystoreWrapper.put((Object)"counter", (Object)Integer.toString((int)n8));
                }
                if (this.AFKeystoreWrapper.containsKey((Object)"launch_counter")) {
                    this.AFKeystoreWrapper.put((Object)"launch_counter", (Object)Integer.toString((int)n8));
                }
                return this;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final boolean AFInAppEventParameterName() {
        if (this.afDebugLog == null && this.AFInAppEventType == null) {
            return true;
        }
        return false;
    }

    public abstract AFd1vSDK AFInAppEventType();

    public AFa1qSDK AFKeystoreWrapper(String string2) {
        this.afRDLog = string2;
        return this;
    }

    public final AFa1qSDK AFKeystoreWrapper(String string2, Object object) {
        Map<String, Object> map = this.AFKeystoreWrapper;
        synchronized (map) {
            this.AFKeystoreWrapper.put((Object)string2, object);
            return this;
        }
    }

    public final byte[] AFKeystoreWrapper() {
        return this.AFVersionDeclaration;
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

    public final AFa1qSDK valueOf(byte[] arrby) {
        this.AFVersionDeclaration = arrby;
        return this;
    }

    public final Map<String, Object> valueOf() {
        return this.AFKeystoreWrapper;
    }

    public final AFa1qSDK values(Map<String, ?> map) {
        synchronized (map) {
            this.AFKeystoreWrapper.putAll(map);
            return this;
        }
    }

    public final boolean values() {
        return this.AFLogger$LogLevel;
    }
}

