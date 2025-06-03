/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewConfiguration
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.Long
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationHandler
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.lang.reflect.Proxy
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */
package com.appsflyer.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1oSDK;
import com.appsflyer.internal.AFb1uSDK;
import com.appsflyer.internal.AFe1xSDK;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class AFe1wSDK {
    public volatile String AFInAppEventParameterName;
    public volatile boolean AFInAppEventType = false;
    @NonNull
    public final AFb1bSDK AFKeystoreWrapper;
    private boolean afErrorLog = false;
    @NonNull
    private final AFe1xSDK afInfoLog;
    Map<String, Object> valueOf;
    public volatile String values;

    public AFe1wSDK(@NonNull AFb1bSDK aFb1bSDK, @NonNull AFe1xSDK aFe1xSDK) {
        this.AFKeystoreWrapper = aFb1bSDK;
        this.afInfoLog = aFe1xSDK;
    }

    private static boolean AFInAppEventParameterName(Context context) {
        if (!AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) && !AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)) {
            AFa1eSDK.valueOf();
            if (AFa1eSDK.AFInAppEventParameterName(context)) {
                return false;
            }
        }
        return true;
    }

    private boolean values() {
        Map<String, Object> map = this.valueOf;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        return false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        Exception exception222;
        Context context = this.AFKeystoreWrapper.AFInAppEventType;
        {
            catch (Exception exception222) {}
        }
        try {
            return (Map)((Class)AFb1oSDK.values((ViewConfiguration.getLongPressTimeout() >> 16) + 37, View.getDefaultSize((int)0, (int)0) + 87, (char)(TextUtils.indexOf((CharSequence)"", (char)'0', (int)0, (int)0) + 1))).getDeclaredConstructor(new Class[]{Map.class, Context.class}).newInstance(new Object[]{map, context});
        }
        catch (Throwable throwable) {
            context = throwable.getCause();
            if (context == null) throw throwable;
            throw context;
        }
        AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", (Throwable)exception222);
        return new HashMap();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean AFInAppEventParameterName() {
        block8 : {
            try {
                Class.forName((String)"com.appsflyer.lvl.AppsFlyerLVL");
                var1_1 = System.currentTimeMillis();
                var6_2 = this.afInfoLog;
                var3_3 = this.AFKeystoreWrapper.AFInAppEventType;
                var5_10 = new AFe1xSDK.AFa1vSDK(this, var1_1){
                    private /* synthetic */ long AFInAppEventType;
                    private /* synthetic */ AFe1wSDK AFKeystoreWrapper;
                    {
                        this.AFKeystoreWrapper = aFe1wSDK;
                        this.AFInAppEventType = l8;
                    }

                    @Override
                    public final void AFInAppEventParameterName(String string2, Exception exception) {
                        String string3;
                        this.AFKeystoreWrapper.valueOf = new ConcurrentHashMap();
                        String string4 = string3 = exception.getMessage();
                        if (string3 == null) {
                            string4 = "unknown";
                        }
                        this.AFKeystoreWrapper.valueOf.put((Object)"error", (Object)string4);
                        AFLogger.afErrorLog(string2, (Throwable)exception, true, true, false);
                    }

                    @Override
                    public final void AFInAppEventParameterName(@NonNull String string2, @NonNull String string3) {
                        this.AFKeystoreWrapper.valueOf = new ConcurrentHashMap();
                        this.AFKeystoreWrapper.valueOf.put((Object)"signedData", (Object)string2);
                        this.AFKeystoreWrapper.valueOf.put((Object)"signature", (Object)string3);
                        long l8 = System.currentTimeMillis();
                        long l9 = this.AFInAppEventType;
                        this.AFKeystoreWrapper.valueOf.put((Object)"ttr", (Object)(l8 - l9));
                        AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                    }
                };
            }
            catch (ClassNotFoundException var3_9) {}
            try {
                var7_11 = Class.forName((String)"com.appsflyer.lvl.AppsFlyerLVL");
                var4_12 = Class.forName((String)"com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                var7_11 = var7_11.getMethod("checkLicense", new Class[]{Long.TYPE, Context.class, var4_12});
                var6_2 = new InvocationHandler((AFe1xSDK)var6_2, var5_10){
                    private /* synthetic */ AFe1xSDK.AFa1vSDK AFInAppEventParameterName;
                    private /* synthetic */ AFe1xSDK AFInAppEventType;
                    {
                        this.AFInAppEventType = aFe1xSDK;
                        this.AFInAppEventParameterName = aFa1vSDK;
                    }

                    /*
                     * Enabled aggressive block sorting
                     */
                    public final Object invoke(Object object, Method object2, Object[] object3) {
                        block11 : {
                            block10 : {
                                block9 : {
                                    if (!object2.getName().equals((Object)"onLvlResult")) break block9;
                                    object = object3[0];
                                    object = object != null ? (String)object : null;
                                    object2 = object3[1];
                                    object2 = object2 != null ? (String)object2 : null;
                                    object3 = this.AFInAppEventParameterName;
                                    if (object3 != null) {
                                        if (object != null && object2 != null) {
                                            object3.AFInAppEventParameterName((String)object, (String)object2);
                                            return null;
                                        }
                                        object = object2 == null ? new Exception("AFLVL Invalid signature") : new Exception("AFLVL Invalid signedData");
                                        object3.AFInAppEventParameterName("onLvlResult with error", (Exception)object);
                                        return null;
                                    }
                                    object = "onLvlResult invocation succeeded, but listener is null";
                                    break block10;
                                }
                                object2 = object2.getName();
                                object = "onLvlFailure";
                                if (!object2.equals((Object)"onLvlFailure")) break block11;
                                AFe1xSDK.AFa1vSDK aFa1vSDK = this.AFInAppEventParameterName;
                                if (aFa1vSDK != null) {
                                    object2 = object3[0];
                                    if (object2 != null) {
                                        object2 = (Exception)object2;
                                        object = "onLvlFailure with exception";
                                    } else {
                                        object2 = new Exception("unknown");
                                    }
                                    aFa1vSDK.AFInAppEventParameterName((String)object, (Exception)object2);
                                    return null;
                                }
                                object = "onLvlFailure: listener is null";
                            }
                            AFLogger.afDebugLog((String)object);
                            return null;
                        }
                        object = this.AFInAppEventParameterName;
                        if (object != null) {
                            object.AFInAppEventParameterName("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
                        }
                        return null;
                    }
                };
                var7_11.invoke((Object)null, new Object[]{var1_1, var3_3, Proxy.newProxyInstance((ClassLoader)var4_12.getClassLoader(), (Class[])new Class[]{var4_12}, (InvocationHandler)var6_2)});
                ** GOTO lbl33
            }
            catch (InvocationTargetException var3_4) {
            }
            catch (IllegalAccessException var3_5) {
                ** GOTO lbl26
            }
            catch (NoSuchMethodException var3_6) {
                ** GOTO lbl28
            }
            catch (ClassNotFoundException var3_7) {
                ** GOTO lbl30
            }
            var4_13 = var3_4.getClass();
            break block8;
lbl26: // 1 sources:
            var4_13 = var3_5.getClass();
            break block8;
lbl28: // 1 sources:
            var4_13 = var3_6.getClass();
            break block8;
lbl30: // 1 sources:
            var4_13 = var3_7.getClass();
        }
        var5_10.AFInAppEventParameterName(var4_13.getSimpleName(), (Exception)var3_8);
lbl33: // 2 sources:
        this.afErrorLog = true;
        return this.afErrorLog;
        this.afErrorLog = false;
        return this.afErrorLog;
    }

    public final boolean AFInAppEventType() {
        if (this.afErrorLog && !this.values()) {
            return true;
        }
        return false;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final String valueOf(AFb1dSDK var1_1) {
        block11 : {
            block15 : {
                block16 : {
                    block14 : {
                        block13 : {
                            block12 : {
                                var2_2 = AppsFlyerProperties.getInstance().getBoolean("collectIMEI", false);
                                var3_3 = var1_1.values("imeiCached", null);
                                if (!var2_2 || !AFb1uSDK.values(this.values)) break block15;
                                var4_4 = this.AFKeystoreWrapper.AFInAppEventType;
                                if (var4_4 == null || !AFe1wSDK.AFInAppEventParameterName((Context)var4_4)) ** GOTO lbl-1000
                                try {
                                    var4_4 = (TelephonyManager)var4_4.getSystemService("phone");
                                    var4_4 = (String)var4_4.getClass().getMethod("getDeviceId", new Class[0]).invoke(var4_4, new Object[0]);
                                    if (var4_4 != null) {
                                        var3_3 = var4_4;
                                        break block11;
                                    }
                                    if (var3_3 == null) break block12;
                                    AFLogger.afDebugLog("use cached IMEI: ".concat((String)var3_3));
                                    break block11;
                                }
                                catch (Exception var5_5) {
                                    break block13;
                                }
                                catch (InvocationTargetException var5_6) {
                                    break block14;
                                }
                            }
                            var3_3 = null;
                            break block11;
                        }
                        if (var3_3 != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat((String)var3_3));
                        } else {
                            var3_3 = null;
                        }
                        var4_4 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                        break block16;
                    }
                    if (var3_3 != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat((String)var3_3));
                    } else {
                        var3_3 = null;
                    }
                    var4_4 = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                }
                var4_4.append(var5_7.getMessage());
                AFLogger.afErrorLog(var4_4.toString(), (Throwable)var5_7);
                break block11;
            }
            if (this.values != null) {
                var3_3 = this.values;
            } else lbl-1000: // 2 sources:
            {
                var3_3 = null;
            }
        }
        if (!AFb1uSDK.values((String)var3_3)) {
            var1_1.AFInAppEventParameterName("imeiCached", (String)var3_3);
            return var3_3;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @NonNull
    public final Map<String, Object> valueOf() {
        HashMap hashMap = new HashMap();
        if (!this.values()) {
            HashMap hashMap2;
            if (!this.afErrorLog) {
                return hashMap;
            }
            this.valueOf = hashMap2 = new HashMap();
            hashMap2.put((Object)"error", (Object)"operation timed out.");
        }
        hashMap.put((Object)"lvl", this.valueOf);
        return hashMap;
    }

}

