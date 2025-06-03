// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import com.appsflyer.AFLogger;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AppsFlyerProperties;
import android.content.Context;
import java.util.Map;
import androidx.annotation.NonNull;

public final class AFe1wSDK
{
    public volatile String AFInAppEventParameterName;
    public volatile boolean AFInAppEventType;
    @NonNull
    public final AFb1bSDK AFKeystoreWrapper;
    private boolean afErrorLog;
    @NonNull
    private final AFe1xSDK afInfoLog;
    Map<String, Object> valueOf;
    public volatile String values;
    
    public AFe1wSDK(@NonNull final AFb1bSDK afKeystoreWrapper, @NonNull final AFe1xSDK afInfoLog) {
        this.afErrorLog = false;
        this.AFInAppEventType = false;
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.afInfoLog = afInfoLog;
    }
    
    private static boolean AFInAppEventParameterName(final Context context) {
        if (!AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false)) {
            if (!AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)) {
                AFa1eSDK.valueOf();
                if (AFa1eSDK.AFInAppEventParameterName(context)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean values() {
        final Map<String, Object> valueOf = this.valueOf;
        return valueOf != null && !valueOf.isEmpty();
    }
    
    public final Map<String, Object> AFInAppEventParameterName(final Map<String, Object> map) {
        while (true) {
            try {
                final Context afInAppEventType = this.AFKeystoreWrapper.AFInAppEventType;
                try {
                    return ((Class)AFb1oSDK.values((ViewConfiguration.getLongPressTimeout() >> 16) + 37, View.getDefaultSize(0, 0) + 87, (char)(TextUtils.indexOf((CharSequence)"", '0', 0, 0) + 1))).getDeclaredConstructor(Map.class, Context.class).newInstance(map, afInAppEventType);
                }
                finally {
                    final Throwable t;
                    final Throwable cause = t.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                }
                final Exception ex;
                AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", ex);
                return new HashMap<String, Object>();
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public final boolean AFInAppEventParameterName() {
    Label_0211_Outer:
        while (true) {
            while (true) {
                try {
                    Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                    final long currentTimeMillis = System.currentTimeMillis();
                    final AFe1xSDK afInfoLog = this.afInfoLog;
                    final Context afInAppEventType = this.AFKeystoreWrapper.AFInAppEventType;
                    final AFe1xSDK.AFa1vSDK aFa1vSDK = new AFe1xSDK.AFa1vSDK() {
                        @Override
                        public final void AFInAppEventParameterName(final String s, final Exception ex) {
                            AFe1wSDK.this.valueOf = new ConcurrentHashMap<String, Object>();
                            String message;
                            if ((message = ex.getMessage()) == null) {
                                message = "unknown";
                            }
                            AFe1wSDK.this.valueOf.put("error", message);
                            AFLogger.afErrorLog(s, ex, true, true, false);
                        }
                        
                        @Override
                        public final void AFInAppEventParameterName(@NonNull final String s, @NonNull final String s2) {
                            (AFe1wSDK.this.valueOf = new ConcurrentHashMap<String, Object>()).put("signedData", s);
                            AFe1wSDK.this.valueOf.put("signature", s2);
                            AFe1wSDK.this.valueOf.put("ttr", System.currentTimeMillis() - currentTimeMillis);
                            AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                        }
                    };
                    Label_0154: {
                        while (true) {
                            try {
                                final Class<?> forName = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                                final Class<?> forName2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                                forName.getMethod("checkLicense", Long.TYPE, Context.class, forName2).invoke(null, currentTimeMillis, afInAppEventType, Proxy.newProxyInstance(forName2.getClassLoader(), new Class[] { forName2 }, new InvocationHandler() {
                                    private /* synthetic */ AFa1vSDK AFInAppEventParameterName = aFa1vSDK;
                                    
                                    @Override
                                    public final Object invoke(Object o, final Method method, final Object[] array) {
                                        String s3;
                                        if (method.getName().equals("onLvlResult")) {
                                            o = array[0];
                                            String s;
                                            if (o != null) {
                                                s = (String)o;
                                            }
                                            else {
                                                s = null;
                                            }
                                            final Object o2 = array[1];
                                            String s2;
                                            if (o2 != null) {
                                                s2 = (String)o2;
                                            }
                                            else {
                                                s2 = null;
                                            }
                                            final AFa1vSDK afInAppEventParameterName = this.AFInAppEventParameterName;
                                            if (afInAppEventParameterName != null) {
                                                if (s != null && s2 != null) {
                                                    afInAppEventParameterName.AFInAppEventParameterName(s, s2);
                                                    return null;
                                                }
                                                if (s2 == null) {
                                                    o = new Exception("AFLVL Invalid signature");
                                                }
                                                else {
                                                    o = new Exception("AFLVL Invalid signedData");
                                                }
                                                afInAppEventParameterName.AFInAppEventParameterName("onLvlResult with error", (Exception)o);
                                                return null;
                                            }
                                            else {
                                                s3 = "onLvlResult invocation succeeded, but listener is null";
                                            }
                                        }
                                        else {
                                            final String name = method.getName();
                                            String s4 = "onLvlFailure";
                                            if (!name.equals("onLvlFailure")) {
                                                final AFa1vSDK afInAppEventParameterName2 = this.AFInAppEventParameterName;
                                                if (afInAppEventParameterName2 != null) {
                                                    afInAppEventParameterName2.AFInAppEventParameterName("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
                                                }
                                                return null;
                                            }
                                            final AFa1vSDK afInAppEventParameterName3 = this.AFInAppEventParameterName;
                                            if (afInAppEventParameterName3 != null) {
                                                final Object o3 = array[0];
                                                Exception ex;
                                                if (o3 != null) {
                                                    ex = (Exception)o3;
                                                    s4 = "onLvlFailure with exception";
                                                }
                                                else {
                                                    ex = new Exception("unknown");
                                                }
                                                afInAppEventParameterName3.AFInAppEventParameterName(s4, ex);
                                                return null;
                                            }
                                            s3 = "onLvlFailure: listener is null";
                                        }
                                        AFLogger.afDebugLog(s3);
                                        return null;
                                    }
                                }));
                            }
                            catch (InvocationTargetException ex) {
                                break Label_0154;
                            }
                            catch (IllegalAccessException ex) {
                                Class<? extends InvocationTargetException> clazz = ex.getClass();
                                ((AFe1xSDK.AFa1vSDK)aFa1vSDK).AFInAppEventParameterName(clazz.getSimpleName(), ex);
                                break Label_0154;
                                clazz = ex.getClass();
                                continue Label_0211_Outer;
                            }
                            catch (NoSuchMethodException ex2) {
                                final InvocationTargetException ex;
                                final Class<? extends InvocationTargetException> clazz = ex.getClass();
                                continue Label_0211_Outer;
                            }
                            catch (ClassNotFoundException ex3) {
                                final InvocationTargetException ex;
                                final Class<? extends InvocationTargetException> clazz = ex.getClass();
                                continue Label_0211_Outer;
                            }
                            break;
                        }
                    }
                    this.afErrorLog = true;
                    return this.afErrorLog;
                    this.afErrorLog = false;
                    return this.afErrorLog;
                }
                catch (ClassNotFoundException ex4) {}
                continue;
            }
        }
    }
    
    public final boolean AFInAppEventType() {
        return this.afErrorLog && !this.values();
    }
    
    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType;
    }
    
    public final String valueOf(final AFb1dSDK aFb1dSDK) {
        final boolean boolean1 = AppsFlyerProperties.getInstance().getBoolean("collectIMEI", false);
        String str = aFb1dSDK.values("imeiCached", null);
        Label_0240: {
            if (boolean1 && AFb1uSDK.values(this.values)) {
                final Context afInAppEventType = this.AFKeystoreWrapper.AFInAppEventType;
                if (afInAppEventType != null && AFInAppEventParameterName(afInAppEventType)) {
                    while (true) {
                        while (true) {
                            StringBuilder sb = null;
                            Label_0133: {
                                try {
                                    final TelephonyManager obj = (TelephonyManager)afInAppEventType.getSystemService("phone");
                                    final String s = (String)obj.getClass().getMethod("getDeviceId", (Class<?>[])new Class[0]).invoke(obj, new Object[0]);
                                    if (s != null) {
                                        str = s;
                                        break Label_0240;
                                    }
                                    if (str != null) {
                                        AFLogger.afDebugLog("use cached IMEI: ".concat(str));
                                        break Label_0135;
                                    }
                                    break Label_0133;
                                }
                                catch (Exception ex) {
                                    if (str != null) {
                                        AFLogger.afDebugLog("use cached IMEI: ".concat(str));
                                    }
                                    else {
                                        str = null;
                                    }
                                    sb = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                                    break Label_0133;
                                    break Label_0240;
                                    str = null;
                                    continue;
                                }
                                catch (InvocationTargetException ex2) {
                                    if (str != null) {
                                        AFLogger.afDebugLog("use cached IMEI: ".concat(str));
                                    }
                                    else {
                                        str = null;
                                    }
                                    sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                                }
                            }
                            final Exception ex;
                            sb.append(ex.getMessage());
                            AFLogger.afErrorLog(sb.toString(), ex);
                            continue;
                        }
                    }
                }
            }
            else if (this.values != null) {
                str = this.values;
                break Label_0240;
            }
            str = null;
        }
        if (!AFb1uSDK.values(str)) {
            aFb1dSDK.AFInAppEventParameterName("imeiCached", str);
            return str;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }
    
    @NonNull
    public final Map<String, Object> valueOf() {
        final HashMap<String, Map<String, Object>> hashMap = new HashMap<String, Map<String, Object>>();
        if (!this.values()) {
            if (!this.afErrorLog) {
                return (Map<String, Object>)hashMap;
            }
            (this.valueOf = new HashMap<String, Object>()).put("error", "operation timed out.");
        }
        hashMap.put("lvl", this.valueOf);
        return (Map<String, Object>)hashMap;
    }
}
