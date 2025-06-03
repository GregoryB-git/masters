// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import androidx.annotation.NonNull;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import com.appsflyer.attribution.AppsFlyerRequestListener;

public abstract class AFa1qSDK
{
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
    
    public AFa1qSDK(final String afDebugLog, final String afRDLog, final Boolean b) {
        this.AFKeystoreWrapper = new HashMap<String, Object>();
        this.afDebugLog = afDebugLog;
        this.afRDLog = afRDLog;
        this.AFLogger$LogLevel = (b == null || b);
    }
    
    @NonNull
    public static String AFInAppEventParameterName(final String s) {
        final String values = AFa1eSDK.valueOf().AFInAppEventType().AFInAppEventParameterName().values();
        String string = s;
        if (values != null) {
            string = Uri.parse(s).buildUpon().appendQueryParameter("channel", values).build().toString();
        }
        return string;
    }
    
    public static boolean AFInAppEventType(final double n) {
        if (n < 0.0) {
            return false;
        }
        if (n >= 1.0) {
            return false;
        }
        if (n == 0.0) {
            return true;
        }
        final int n2 = (int)(1.0 / n);
        if (n2 + 1 > 0) {
            return (int)(Math.random() * n2 + 1.0) != n2;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }
    
    public final AFa1qSDK AFInAppEventParameterName(final int i) {
        this.AFLogger = i;
        final Map<String, Object> afKeystoreWrapper = this.AFKeystoreWrapper;
        // monitorenter(afKeystoreWrapper)
        while (true) {
            try {
                if (this.AFKeystoreWrapper.containsKey("counter")) {
                    this.AFKeystoreWrapper.put("counter", Integer.toString(i));
                }
                if (this.AFKeystoreWrapper.containsKey("launch_counter")) {
                    this.AFKeystoreWrapper.put("launch_counter", Integer.toString(i));
                }
                // monitorexit(afKeystoreWrapper)
                return this;
                // monitorexit(afKeystoreWrapper)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean AFInAppEventParameterName() {
        return this.afDebugLog == null && this.AFInAppEventType == null;
    }
    
    public abstract AFd1vSDK AFInAppEventType();
    
    public AFa1qSDK AFKeystoreWrapper(final String afRDLog) {
        this.afRDLog = afRDLog;
        return this;
    }
    
    public final AFa1qSDK AFKeystoreWrapper(final String s, final Object o) {
        synchronized (this.AFKeystoreWrapper) {
            this.AFKeystoreWrapper.put(s, o);
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
    
    public final AFa1qSDK valueOf(final byte[] afVersionDeclaration) {
        this.AFVersionDeclaration = afVersionDeclaration;
        return this;
    }
    
    public final Map<String, Object> valueOf() {
        return this.AFKeystoreWrapper;
    }
    
    public final AFa1qSDK values(final Map<String, ?> map) {
        synchronized (map) {
            this.AFKeystoreWrapper.putAll(map);
            return this;
        }
    }
    
    public final boolean values() {
        return this.AFLogger$LogLevel;
    }
}
