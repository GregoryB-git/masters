/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.text.TextUtils
 *  android.view.MotionEvent
 *  java.io.BufferedReader
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.lang.reflect.InvocationHandler
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.lang.reflect.Proxy
 *  java.net.HttpURLConnection
 *  java.net.URI
 *  java.net.URL
 *  java.nio.charset.Charset
 *  java.security.KeyStore
 *  java.security.KeyStoreException
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 *  java.util.TimeZone
 *  java.util.UUID
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import L1.a;
import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFa1bSDK;
import com.appsflyer.internal.AFa1cSDK;
import com.appsflyer.internal.AFa1dSDK;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.internal.AFa1gSDK;
import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFa1rSDK;
import com.appsflyer.internal.AFa1uSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1lSDK;
import com.appsflyer.internal.AFb1sSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFb1uSDK;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFb1wSDK;
import com.appsflyer.internal.AFb1xSDK;
import com.appsflyer.internal.AFb1zSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1cSDK;
import com.appsflyer.internal.AFc1dSDK;
import com.appsflyer.internal.AFc1fSDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1wSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFc1ySDK;
import com.appsflyer.internal.AFd1bSDK;
import com.appsflyer.internal.AFd1dSDK;
import com.appsflyer.internal.AFd1eSDK;
import com.appsflyer.internal.AFd1fSDK;
import com.appsflyer.internal.AFd1hSDK;
import com.appsflyer.internal.AFd1lSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1bSDK;
import com.appsflyer.internal.AFe1gSDK;
import com.appsflyer.internal.AFe1hSDK;
import com.appsflyer.internal.AFe1iSDK;
import com.appsflyer.internal.AFe1jSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1lSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFe1oSDK;
import com.appsflyer.internal.AFe1pSDK;
import com.appsflyer.internal.AFe1rSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.AFe1ySDK;
import com.appsflyer.internal.AFf1eSDK;
import com.appsflyer.internal.AFf1fSDK;
import com.appsflyer.internal.AFf1iSDK;
import com.appsflyer.internal.AFf1jSDK;
import com.appsflyer.internal.AFf1mSDK;
import com.appsflyer.internal.AFf1nSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1pSDK;
import com.appsflyer.internal.AFf1qSDK;
import com.appsflyer.internal.AFf1tSDK;
import com.appsflyer.internal.AFf1vSDK;
import com.appsflyer.internal.a;
import com.appsflyer.internal.b;
import com.appsflyer.internal.c;
import com.appsflyer.internal.d;
import com.appsflyer.internal.e;
import com.appsflyer.internal.f;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x2.j;

public final class AFa1eSDK
extends AppsFlyerLib {
    public static final String AFInAppEventType;
    public static final String AFKeystoreWrapper;
    private static String afErrorLog;
    private static AFa1eSDK afRDLog;
    private static int onAttributionFailure = 0;
    private static int onDeepLinking = 1;
    private static int onResponse;
    static AppsFlyerInAppPurchaseValidatorListener valueOf;
    static final String values;
    public volatile AppsFlyerConversionListener AFInAppEventParameterName = null;
    String AFLogger;
    private Map<Long, String> AFLogger$LogLevel;
    private long AFVersionDeclaration = TimeUnit.SECONDS.toMillis(5L);
    private boolean AppsFlyer2dXConversionCallback = false;
    private long afDebugLog = -1L;
    private boolean afErrorLogForExcManagerOnly = false;
    public AFa1cSDK afInfoLog;
    private long afWarnLog = -1L;
    private String getLevel;
    private Application init;
    private final Executor onAppOpenAttribution = Executors.newSingleThreadExecutor();
    private boolean onAppOpenAttributionNative;
    private String onAttributionFailureNative;
    @NonNull
    private final AFc1ySDK onConversionDataFail;
    private SharedPreferences onConversionDataSuccess;
    private boolean onDeepLinkingNative = false;
    private final AFb1xSDK onInstallConversionDataLoadedNative = new AFb1xSDK();
    private boolean onInstallConversionFailureNative;
    private Map<String, Object> onResponseErrorNative;
    private AFb1lSDK onResponseNative;

    static {
        AFa1eSDK.values();
        values = "262";
        AFKeystoreWrapper = "6.12";
        afErrorLog = "https://%sstats.%s/stats";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("6.12");
        stringBuilder.append("/androidevent?buildnumber=6.12.2&app_id=");
        AFInAppEventType = stringBuilder.toString();
        valueOf = null;
        afRDLog = new AFa1eSDK();
        onAttributionFailure = (onDeepLinking + 93) % 128;
    }

    public AFa1eSDK() {
        AFVersionDeclaration.init();
        this.onConversionDataFail = new AFc1ySDK();
        AFc1bSDK aFc1bSDK = this.AFInAppEventType().AFVersionDeclaration();
        AFa1wSDK aFa1wSDK = new AFa1wSDK(this, 0);
        aFc1bSDK.values.add((Object)aFa1wSDK);
    }

    private int AFInAppEventParameterName(AFb1dSDK aFb1dSDK) {
        onAttributionFailure = (onDeepLinking + 119) % 128;
        int n8 = this.AFKeystoreWrapper(aFb1dSDK, "appsFlyerAdRevenueCount", true);
        onAttributionFailure = (onDeepLinking + 59) % 128;
        return n8;
    }

    public static String AFInAppEventParameterName() {
        onAttributionFailure = (onDeepLinking + 3) % 128;
        String string2 = AFa1eSDK.values("AppUserId");
        onDeepLinking = (onAttributionFailure + 99) % 128;
        return string2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static String AFInAppEventParameterName(Activity var0) {
        var4_2 = null;
        var3_3 = null;
        var2_4 = var3_3;
        if (var0 == null) return var2_4;
        var6_5 = var0.getIntent();
        var2_4 = var3_3;
        if (var6_5 == null) return var2_4;
        var1_6 = AFa1eSDK.onAttributionFailure + 43;
        AFa1eSDK.onDeepLinking = var1_6 % 128;
        if (var1_6 % 2 != 0) ** GOTO lbl20
        var2_4 = var4_2;
        try {
            block2 : {
                var5_7 = var6_5.getExtras();
                var2_4 = var4_2;
                var1_6 = 96 / 0;
                var2_4 = var3_3;
                if (var5_7 == null) return var2_4;
                var3_3 = var5_7;
                break block2;
lbl20: // 1 sources:
                var2_4 = var4_2;
                var5_8 = var6_5.getExtras();
                var2_4 = var3_3;
                if (var5_8 == null) return var2_4;
                var3_3 = var5_8;
            }
            var2_4 = var4_2;
            var2_4 = var4_2 = var3_3.getString("af");
            if (var4_2 == null) return var2_4;
            var2_4 = var4_2;
            AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf((Object)var4_2)));
            var2_4 = var4_2;
            var3_3.remove("af");
            var2_4 = var4_2;
            var0.setIntent(var6_5.putExtras(var3_3));
        }
        catch (Throwable var0_1) {}
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 41) % 128;
        return var4_2;
        AFLogger.afErrorLog(var0_1.getMessage(), var0_1);
        return var2_4;
    }

    public static /* synthetic */ void AFInAppEventParameterName(AFa1eSDK aFa1eSDK) {
        onAttributionFailure = (onDeepLinking + 75) % 128;
        aFa1eSDK.afWarnLog();
        int n8 = onDeepLinking + 21;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 != 0) {
            n8 = 65 / 0;
        }
    }

    private /* synthetic */ void AFInAppEventParameterName(AFd1dSDK aFd1dSDK) {
        int n8;
        onDeepLinking = (onAttributionFailure + 111) % 128;
        if (aFd1dSDK == AFd1dSDK.values) {
            n8 = onDeepLinking + 75;
            onAttributionFailure = n8 % 128;
            if (n8 % 2 == 0) {
                this.AFInAppEventType().onConversionDataSuccess().AFInAppEventType();
            } else {
                this.AFInAppEventType().onConversionDataSuccess().AFInAppEventType();
                throw null;
            }
        }
        n8 = onDeepLinking + 81;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return;
        }
        throw null;
    }

    /*
     * Exception decompiling
     */
    private void AFInAppEventParameterName(Map<String, Object> var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[SIMPLE_IF_TAKEN]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static void AFInAppEventParameterName(@NonNull ScheduledExecutorService scheduledExecutorService, Runnable object, long l8, TimeUnit timeUnit) {
        onAttributionFailure = (onDeepLinking + 111) % 128;
        try {
            scheduledExecutorService.schedule((Runnable)object, l8, timeUnit);
        }
        catch (Throwable throwable) {
            void var0_2;
            block3 : {
                object = "scheduleJob failed with Exception";
                break block3;
                catch (RejectedExecutionException rejectedExecutionException) {
                    object = "scheduleJob failed with RejectedExecutionException Exception";
                }
            }
            AFLogger.afErrorLog((String)object, (Throwable)var0_2);
            return;
        }
        onAttributionFailure = (onDeepLinking + 125) % 128;
        return;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean AFInAppEventParameterName(Context var0) {
        block6 : {
            block4 : {
                block5 : {
                    var1_2 = AFa1eSDK.onDeepLinking + 35;
                    AFa1eSDK.onAttributionFailure = var1_2 % 128;
                    var3_3 = true;
                    if (var1_2 % 2 == 0) ** GOTO lbl10
                    try {
                        var1_2 = j.m().g(var0);
                        var2_4 = 53 / 0;
                        if (var1_2 != 0) break block4;
                        break block5;
lbl10: // 1 sources:
                        var1_2 = j.m().g(var0);
                        if (var1_2 != 0) break block4;
                    }
                    catch (Throwable var4_5) {}
                }
                var1_2 = AFa1eSDK.onDeepLinking + 107;
                AFa1eSDK.onAttributionFailure = var1_2 % 128;
                if (var1_2 % 2 == 0) return var3_3;
                return false;
            }
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 55) % 128;
            break block6;
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", var4_5);
        }
        try {
            var0.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        }
        catch (PackageManager.NameNotFoundException var0_1) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", (Throwable)var0_1);
            return false;
        }
    }

    private boolean AFInAppEventParameterName(AFa1qSDK aFa1qSDK, AFb1dSDK aFb1dSDK) {
        block7 : {
            block8 : {
                block6 : {
                    int n8;
                    boolean bl;
                    block5 : {
                        n8 = this.valueOf(aFb1dSDK, false);
                        if (n8 == 1 && !(aFa1qSDK instanceof AFe1lSDK)) {
                            onDeepLinking = (onAttributionFailure + 81) % 128;
                            bl = true;
                        } else {
                            bl = false;
                        }
                        if (aFb1dSDK.valueOf("newGPReferrerSent")) break block5;
                        int n9 = onDeepLinking;
                        int n10 = n9 + 83;
                        onAttributionFailure = n10 % 128;
                        if (!(n10 % 2 != 0 ? n8 == 0 : n8 == 1)) break block5;
                        n8 = n9 + 17;
                        onAttributionFailure = n8 % 128;
                        n8 = n8 % 2 != 0 ? 0 : 1;
                        onAttributionFailure = (n9 + 67) % 128;
                        if (n8 == 1) break block6;
                    }
                    n8 = onDeepLinking + 97;
                    onAttributionFailure = n8 % 128;
                    if (n8 % 2 != 0) break block7;
                    if (!bl) break block8;
                }
                return true;
            }
            return false;
        }
        throw null;
    }

    private int AFInAppEventType(AFb1dSDK aFb1dSDK) {
        int n8 = onAttributionFailure + 115;
        onDeepLinking = n8 % 128;
        n8 = this.AFKeystoreWrapper(aFb1dSDK, "appsFlyerAdImpressionCount", true);
        onDeepLinking = (onAttributionFailure + 83) % 128;
        return n8;
    }

    public static /* synthetic */ Application AFInAppEventType(AFa1eSDK aFa1eSDK) {
        int n8;
        int n9 = onAttributionFailure + 33;
        onDeepLinking = n8 = n9 % 128;
        aFa1eSDK = aFa1eSDK.init;
        if (n9 % 2 == 0) {
            n9 = 57 / 0;
        }
        onAttributionFailure = (n8 += 35) % 128;
        if (n8 % 2 == 0) {
            return aFa1eSDK;
        }
        throw null;
    }

    public static String AFInAppEventType(AFb1dSDK aFb1dSDK, String string2) {
        String string3 = aFb1dSDK.values("CACHED_CHANNEL", null);
        if (string3 != null) {
            int n8;
            onDeepLinking = n8 = (onAttributionFailure + 97) % 128;
            onAttributionFailure = (n8 + 115) % 128;
            return string3;
        }
        aFb1dSDK.AFInAppEventParameterName("CACHED_CHANNEL", string2);
        return string2;
    }

    private static String AFInAppEventType(String string2) {
        int n8;
        block17 : {
            block18 : {
                block16 : {
                    int n9 = onDeepLinking + 77;
                    onAttributionFailure = n8 = n9 % 128;
                    if (n9 % 2 == 0) break block16;
                    n9 = 45 / 0;
                    if (string2 != null) break block17;
                    break block18;
                }
                if (string2 != null) break block17;
            }
            onDeepLinking = (n8 + 29) % 128;
            return null;
        }
        if (string2.matches("fb\\d*?://authorize.*") && string2.contains((CharSequence)"access_token")) {
            onDeepLinking = (onAttributionFailure + 59) % 128;
            String string3 = AFa1eSDK.valueOf(string2);
            if (string3.length() == 0) {
                return string2;
            }
            ArrayList arrayList = new ArrayList();
            if (string3.contains((CharSequence)"&")) {
                arrayList = new ArrayList((Collection)Arrays.asList((Object[])string3.split("&")));
            } else {
                arrayList.add((Object)string3);
            }
            StringBuilder stringBuilder = new StringBuilder();
            arrayList = arrayList.iterator();
            onDeepLinking = (onAttributionFailure + 7) % 128;
            do {
                if (arrayList.hasNext() ^ true) {
                    return string2.replace((CharSequence)string3, (CharSequence)stringBuilder.toString());
                }
                onDeepLinking = (onAttributionFailure + 9) % 128;
                String string4 = (String)arrayList.next();
                if (string4.contains((CharSequence)"access_token")) {
                    n8 = onAttributionFailure + 95;
                    onDeepLinking = n8 % 128;
                    arrayList.remove();
                    if (n8 % 2 != 0) continue;
                    n8 = 13 / 0;
                    continue;
                }
                if (stringBuilder.length() != 0) {
                    n8 = onDeepLinking + 49;
                    onAttributionFailure = n8 % 128;
                    stringBuilder.append("&");
                    if (n8 % 2 != 0) {
                        n8 = 11 / 0;
                    }
                } else if (!string4.startsWith("?")) {
                    n8 = onDeepLinking + 35;
                    onAttributionFailure = n8 % 128;
                    stringBuilder.append("?");
                    if (n8 % 2 != 0) {
                        throw null;
                    }
                }
                stringBuilder.append(string4);
            } while (true);
        }
        onDeepLinking = (onAttributionFailure + 97) % 128;
        return string2;
    }

    public static String AFInAppEventType(SimpleDateFormat object, long l8) {
        object.setTimeZone(TimeZone.getTimeZone((String)"UTC"));
        object = object.format(new Date(l8));
        onDeepLinking = (onAttributionFailure + 43) % 128;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void AFInAppEventType(Context object) {
        void var3_8;
        AFa1uSDK.AFa1zSDK aFa1zSDK;
        block11 : {
            block10 : {
                block9 : {
                    block8 : {
                        block6 : {
                            this.onResponseErrorNative = new HashMap();
                            aFa1zSDK = new AFa1uSDK.AFa1zSDK(this, System.currentTimeMillis()){
                                private /* synthetic */ long AFKeystoreWrapper;
                                private /* synthetic */ AFa1eSDK valueOf;
                                {
                                    this.valueOf = aFa1eSDK;
                                    this.AFKeystoreWrapper = l8;
                                }

                                @Override
                                public final void AFKeystoreWrapper(String string2) {
                                    AFa1eSDK.values(this.valueOf).put((Object)"error", (Object)string2);
                                }

                                @Override
                                public final void valueOf(String string2, String string3, String string4) {
                                    if (string2 != null) {
                                        AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(string2));
                                        AFa1eSDK.values(this.valueOf).put((Object)"link", (Object)string2);
                                        if (string3 != null) {
                                            AFa1eSDK.values(this.valueOf).put((Object)"target_url", (Object)string3);
                                        }
                                        if (string4 != null) {
                                            string2 = new HashMap();
                                            string3 = new HashMap();
                                            string3.put((Object)"promo_code", (Object)string4);
                                            string2.put((Object)"deeplink_context", (Object)string3);
                                            AFa1eSDK.values(this.valueOf).put((Object)"extras", (Object)string2);
                                        }
                                    } else {
                                        AFa1eSDK.values(this.valueOf).put((Object)"link", (Object)"");
                                    }
                                    long l8 = System.currentTimeMillis();
                                    long l9 = this.AFKeystoreWrapper;
                                    AFa1eSDK.values(this.valueOf).put((Object)"ttr", (Object)String.valueOf((long)(l8 - l9)));
                                }
                            };
                            B b8 = B.a;
                            B.class.getMethod("sdkInitialize", new Class[]{Context.class}).invoke((Object)null, new Object[]{object});
                            int n8 = L1.a.a;
                            b8 = L1.a.class.getMethod("fetchDeferredAppLinkData", new Class[]{Context.class, String.class, a.a.class});
                            Object object2 = new InvocationHandler(L1.a.class, aFa1zSDK){
                                private /* synthetic */ Class AFInAppEventType;
                                private /* synthetic */ AFa1uSDK.AFa1zSDK AFKeystoreWrapper;
                                {
                                    this.AFInAppEventType = class_;
                                    this.AFKeystoreWrapper = aFa1zSDK;
                                }

                                public final Object invoke(Object object, Method object2, Object[] object3) {
                                    if (object2.getName().equals((Object)"onDeferredAppLinkDataFetched")) {
                                        object = object3[0];
                                        if (object != null) {
                                            AFa1uSDK.AFa1zSDK aFa1zSDK;
                                            object = this.AFInAppEventType.cast(object);
                                            object = (Bundle)Bundle.class.cast(this.AFInAppEventType.getMethod("getArgumentBundle", new Class[0]).invoke(object, new Object[0]));
                                            if (object != null) {
                                                object3 = object.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                                object2 = object.getString("target_url");
                                                object = (object = object.getBundle("extras")) != null && (object = object.getBundle("deeplink_context")) != null ? object.getString("promo_code") : null;
                                            } else {
                                                aFa1zSDK = null;
                                                object2 = object = aFa1zSDK;
                                                object3 = object;
                                                object = aFa1zSDK;
                                            }
                                            aFa1zSDK = this.AFKeystoreWrapper;
                                            if (aFa1zSDK != null) {
                                                aFa1zSDK.valueOf((String)object3, (String)object2, (String)object);
                                                return null;
                                            }
                                        } else {
                                            object = this.AFKeystoreWrapper;
                                            if (object != null) {
                                                object.valueOf(null, null, null);
                                            }
                                        }
                                        return null;
                                    }
                                    object = this.AFKeystoreWrapper;
                                    if (object != null) {
                                        object.AFKeystoreWrapper("onDeferredAppLinkDataFetched invocation failed");
                                    }
                                    return null;
                                }
                            };
                            object2 = Proxy.newProxyInstance((ClassLoader)a.a.class.getClassLoader(), (Class[])new Class[]{a.a.class}, (InvocationHandler)object2);
                            String string2 = object.getString(object.getResources().getIdentifier("facebook_app_id", "string", object.getPackageName()));
                            if (!(TextUtils.isEmpty((CharSequence)string2) ^ true)) break block6;
                            b8.invoke((Object)null, new Object[]{object, string2, object2});
                            onDeepLinking = (onAttributionFailure + 3) % 128;
                            return;
                        }
                        onDeepLinking = (onAttributionFailure + 93) % 128;
                        try {
                            aFa1zSDK.AFKeystoreWrapper("Facebook app id not defined in resources");
                            return;
                        }
                        catch (IllegalAccessException illegalAccessException) {
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            break block8;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            break block9;
                        }
                        catch (NoSuchMethodException noSuchMethodException) {
                            break block10;
                        }
                        object = "FB illegal access";
                        break block11;
                    }
                    object = "FB class missing error";
                    break block11;
                }
                object = "FB invocation error";
                break block11;
            }
            object = "FB method missing error";
        }
        AFLogger.afErrorLogForExcManagerOnly((String)object, (Throwable)var3_8);
        aFa1zSDK.AFKeystoreWrapper(var3_8.toString());
    }

    private void AFInAppEventType(Context object, AFe1nSDK aFe1nSDK) {
        this.AFKeystoreWrapper((Context)object);
        AFe1mSDK aFe1mSDK = this.AFInAppEventType().afDebugLog();
        object = AFa1rSDK.AFInAppEventParameterName((Context)object);
        if (aFe1mSDK.valueOf()) {
            onDeepLinking = (onAttributionFailure + 27) % 128;
            aFe1mSDK.AFInAppEventParameterName.put((Object)"api_name", (Object)aFe1nSDK.toString());
            aFe1mSDK.AFKeystoreWrapper((AFe1tSDK)((Object)object));
            onDeepLinking = (onAttributionFailure + 23) % 128;
        }
        aFe1mSDK.values();
    }

    private void AFInAppEventType(Context context, String string2, Map<String, Object> map) {
        AFe1iSDK aFe1iSDK = new AFe1iSDK();
        aFe1iSDK.afDebugLog = string2;
        aFe1iSDK.values = map;
        if (context instanceof Activity) {
            onDeepLinking = (onAttributionFailure + 103) % 128;
            context = (Activity)context;
        } else {
            onAttributionFailure = (onDeepLinking + 125) % 128;
            context = null;
        }
        this.values(aFe1iSDK, (Activity)context);
        onAttributionFailure = (onDeepLinking + 9) % 128;
    }

    private void AFInAppEventType(AFa1qSDK object) {
        onDeepLinking = (onAttributionFailure + 95) % 128;
        int n8 = object.afDebugLog == null ? 1 : 0;
        if (this.AFKeystoreWrapper()) {
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (n8 != 0) {
            onDeepLinking = (onAttributionFailure + 23) % 128;
            if (!(AppsFlyerProperties.getInstance().getBoolean("launchProtectEnabled", true) ^ true)) {
                if (this.afInfoLog()) {
                    n8 = onDeepLinking + 109;
                    onAttributionFailure = n8 % 128;
                    if (n8 % 2 == 0) {
                        object = object.AFInAppEventParameterName;
                        if (object != null) {
                            object.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        }
                        return;
                    }
                    throw null;
                }
            } else {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.afDebugLog = System.currentTimeMillis();
        }
        AFa1eSDK.AFInAppEventParameterName(this.AFInAppEventType().valueOf(), new AFa1vSDK(this, (AFa1qSDK)object, 0), 0L, TimeUnit.MILLISECONDS);
        onDeepLinking = (onAttributionFailure + 59) % 128;
    }

    private void AFInAppEventType(@NonNull AFa1qSDK aFa1qSDK, Activity activity) {
        onAttributionFailure = (onDeepLinking + 117) % 128;
        AFf1vSDK aFf1vSDK = this.AFInAppEventType().onResponseErrorNative();
        aFa1qSDK.valueOf = aFf1vSDK.values(activity);
        aFa1qSDK.afInfoLog = aFf1vSDK.valueOf(activity);
        int n8 = onDeepLinking + 13;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return;
        }
        throw null;
    }

    private /* synthetic */ void AFInAppEventType(AFf1qSDK aFf1qSDK) {
        block7 : {
            block8 : {
                int n8;
                boolean bl;
                boolean bl2;
                block5 : {
                    block6 : {
                        boolean bl3;
                        block4 : {
                            boolean bl4;
                            n8 = onAttributionFailure + 123;
                            onDeepLinking = n8 % 128;
                            bl2 = false;
                            if (n8 % 2 != 0) break block4;
                            AFb1dSDK aFb1dSDK = this.values((Context)this.init);
                            int n9 = this.AFInAppEventType().AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0);
                            bl = bl4 = aFb1dSDK.valueOf("newGPReferrerSent");
                            n8 = n9;
                            if (aFf1qSDK.afDebugLog != AFf1pSDK.AFa1zSDK.valueOf) break block5;
                            bl = bl4;
                            n8 = n9;
                            break block6;
                        }
                        AFb1dSDK aFb1dSDK = this.values((Context)this.init);
                        int n10 = this.AFInAppEventType().AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0);
                        bl = bl3 = aFb1dSDK.valueOf("newGPReferrerSent");
                        n8 = n10;
                        if (aFf1qSDK.afDebugLog != AFf1pSDK.AFa1zSDK.valueOf) break block5;
                        n8 = n10;
                        bl = bl3;
                    }
                    bl2 = true;
                }
                if (n8 != 1) break block7;
                onDeepLinking = n8 = (onAttributionFailure + 99) % 128;
                if (bl2) break block8;
                onAttributionFailure = (n8 + 35) % 128;
                if (!bl) break block7;
            }
            this.valueOf(new AFe1lSDK());
        }
        onAttributionFailure = (onDeepLinking + 113) % 128;
    }

    private static void AFInAppEventType(String string2, String string3) {
        int n8 = onDeepLinking + 43;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(string2, string3);
            return;
        }
        AppsFlyerProperties.getInstance().set(string2, string3);
        throw null;
    }

    private static void AFInAppEventType(String string2, boolean bl) {
        int n8 = onDeepLinking + 39;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(string2, bl);
            n8 = 70 / 0;
            return;
        }
        AppsFlyerProperties.getInstance().set(string2, bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int AFKeystoreWrapper(AFb1dSDK aFb1dSDK, String string2, boolean bl) {
        int n8;
        int n9 = n8 = aFb1dSDK.values(string2, 0);
        if (bl) {
            n9 = onAttributionFailure + 15;
            onDeepLinking = n9 % 128;
            n9 = n9 % 2 == 0 ? n8 + 59 : n8 + 1;
            aFb1dSDK.AFInAppEventType(string2, n9);
        }
        if (this.AFInAppEventType().afErrorLogForExcManagerOnly().afInfoLog() ^ true) {
            return n9;
        }
        n8 = onDeepLinking + 5;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName(String.valueOf((int)n9));
            return n9;
        }
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName(String.valueOf((int)n9));
        throw null;
    }

    public static /* synthetic */ long AFKeystoreWrapper(AFa1eSDK aFa1eSDK, long l8) {
        int n8 = onDeepLinking;
        int n9 = n8 + 95;
        onAttributionFailure = n9 % 128;
        aFa1eSDK.afWarnLog = l8;
        if (n9 % 2 == 0) {
            onAttributionFailure = (n8 + 77) % 128;
            return l8;
        }
        throw null;
    }

    private AFd1nSDK.AFa1xSDK AFKeystoreWrapper(Map<String, String> object) {
        object = new AFd1nSDK.AFa1xSDK(this, (Map)object){
            private /* synthetic */ AFa1eSDK AFInAppEventParameterName;
            private /* synthetic */ Map valueOf;
            {
                this.AFInAppEventParameterName = aFa1eSDK;
                this.valueOf = map;
            }

            @Override
            public final void AFKeystoreWrapper(String string2) {
                this.AFInAppEventParameterName.AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper(string2, DeepLinkResult.Error.NETWORK);
            }

            @Override
            public final void values(Map<String, String> map) {
                for (String string2 : map.keySet()) {
                    this.valueOf.put((Object)string2, (Object)((String)map.get((Object)string2)));
                }
                this.AFInAppEventParameterName.AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType(this.valueOf);
            }
        };
        int n8 = onDeepLinking + 25;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return object;
        }
        throw null;
    }

    private Runnable AFKeystoreWrapper(AFf1qSDK object) {
        onDeepLinking = (onAttributionFailure + 81) % 128;
        object = new e(this, (AFf1qSDK)((Object)object));
        int n8 = onAttributionFailure + 13;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            return object;
        }
        throw null;
    }

    private void AFKeystoreWrapper(Context context, String string2) {
        AFa1qSDK aFa1qSDK = new AFe1gSDK().AFInAppEventParameterName(this.AFInAppEventType().AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0));
        aFa1qSDK.afErrorLog = string2;
        if (string2 != null && string2.length() > 5 && this.AFInAppEventParameterName(aFa1qSDK, this.values(context))) {
            AFa1eSDK.AFInAppEventParameterName(this.AFInAppEventType().valueOf(), new AFa1vSDK(this, aFa1qSDK, 0), 5L, TimeUnit.MILLISECONDS);
            onDeepLinking = (onAttributionFailure + 63) % 128;
        }
        int n8 = onAttributionFailure + 61;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            n8 = 80 / 0;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void AFKeystoreWrapper(Context var1_1, String var2_2, Map<String, Object> var3_3, String var4_4, String var5_5) {
        block2 : {
            var6_6 = AFa1eSDK.onAttributionFailure;
            AFa1eSDK.onDeepLinking = (var6_6 + 27) % 128;
            if (var2_2 == null) ** GOTO lbl-1000
            AFa1eSDK.onDeepLinking = (var6_6 += 117) % 128;
            if (var6_6 % 2 != 0) break block2;
            var7_7 = var2_2.trim().isEmpty();
            var6_6 = 84 / 0;
            if (!var7_7) ** GOTO lbl-1000
            ** GOTO lbl-1000
        }
        if (!var2_2.trim().isEmpty()) lbl-1000: // 2 sources:
        {
            var8_8 = new AFe1iSDK();
        } else lbl-1000: // 3 sources:
        {
            var8_9 = new AFe1hSDK();
        }
        this.AFKeystoreWrapper(var1_1);
        var8_10.afDebugLog = var2_2;
        var8_10.values = var3_3;
        var8_10.afErrorLog = var4_4;
        var8_10.valueOf = var5_5;
        this.AFInAppEventType((AFa1qSDK)var8_10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void AFKeystoreWrapper(Context var1_1, Map<String, Object> var2_2, AFa1qSDK var3_3) {
        block2 : {
            var4_4 = AFa1eSDK.onAttributionFailure + 71;
            AFa1eSDK.onDeepLinking = var4_4 % 128;
            this.AFKeystoreWrapper(var1_1);
            var3_3.values(var2_2);
            var5_5 = var1_1 instanceof Activity;
            if (var4_4 % 2 != 0) break block2;
            var4_4 = 19 / 0;
            if (!var5_5) ** GOTO lbl-1000
            ** GOTO lbl-1000
        }
        if (!var5_5) lbl-1000: // 2 sources:
        {
            var1_1 = null;
        } else lbl-1000: // 2 sources:
        {
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 77) % 128;
            var1_1 = (Activity)var1_1;
        }
        this.values(var3_3, (Activity)var1_1);
    }

    private void AFKeystoreWrapper(AppsFlyerConversionListener appsFlyerConversionListener) {
        onAttributionFailure = (onDeepLinking + 99) % 128;
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.AFInAppEventParameterName = appsFlyerConversionListener;
        onAttributionFailure = (onDeepLinking + 103) % 128;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static void AFKeystoreWrapper(String var0) {
        block9 : {
            block8 : {
                try {
                    var2_3 = new JSONObject(var0).has("pid");
                    ** if (!var2_3) goto lbl-1000
                }
                catch (JSONException var0_2) {}
lbl-1000: // 1 sources:
                {
                    var1_4 = AFa1eSDK.onAttributionFailure + 21;
                    AFa1eSDK.onDeepLinking = var1_4 % 128;
                    if (var1_4 % 2 == 0) {
                        AFa1eSDK.AFInAppEventType("preInstallName", var0);
                        var1_4 = 83 / 0;
                        return;
                    }
                    AFa1eSDK.AFInAppEventType("preInstallName", var0);
                    return;
                }
lbl-1000: // 1 sources:
                {
                    break block8;
                }
                break block9;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            return;
        }
        AFLogger.afErrorLog("Error parsing JSON for preinstall", (Throwable)var0_2);
    }

    private long AFLogger(Context object) {
        onDeepLinking = (onAttributionFailure + 115) % 128;
        object = this.values((Context)object);
        long l8 = object.valueOf("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long l9 = System.currentTimeMillis();
        object.AFInAppEventParameterName("AppsFlyerTimePassedSincePrevLaunch", l9);
        if (l8 > 0L) {
            int n8 = onAttributionFailure;
            int n9 = n8 + 83;
            onDeepLinking = n9 % 128;
            l8 = n9 % 2 == 0 ? l9 / l8 : l9 - l8;
            l8 /= 1000L;
            onDeepLinking = (n8 += 15) % 128;
            if (n8 % 2 != 0) {
                return l8;
            }
            throw null;
        }
        int n10 = onDeepLinking + 65;
        onAttributionFailure = n10 % 128;
        if (n10 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    private boolean AFLogger() {
        boolean bl;
        int n8 = onAttributionFailure + 119;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            bl = this.AFInAppEventType().AFInAppEventParameterName().AFKeystoreWrapper("AF_PREINSTALL_DISABLED");
            n8 = 93 / 0;
        } else {
            bl = this.AFInAppEventType().AFInAppEventParameterName().AFKeystoreWrapper("AF_PREINSTALL_DISABLED");
        }
        n8 = onAttributionFailure + 79;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            return bl;
        }
        throw null;
    }

    private boolean AFLogger$LogLevel() {
        Map<String, Object> map = this.onResponseErrorNative;
        if (map != null) {
            onDeepLinking = (onAttributionFailure + 75) % 128;
            if (!map.isEmpty()) {
                onAttributionFailure = (onDeepLinking + 5) % 128;
                return true;
            }
        }
        return false;
    }

    @NonNull
    private AFf1pSDK[] AFVersionDeclaration() {
        onDeepLinking = (onAttributionFailure + 73) % 128;
        AFf1pSDK[] arraFf1pSDK = this.AFInAppEventType().AFLogger$LogLevel().valueOf();
        onDeepLinking = (onAttributionFailure + 43) % 128;
        return arraFf1pSDK;
    }

    public static /* synthetic */ void a(AFa1eSDK aFa1eSDK, AFd1dSDK aFd1dSDK) {
        aFa1eSDK.AFInAppEventParameterName(aFd1dSDK);
    }

    private void afDebugLog() {
        int n8;
        AFf1pSDK[] arraFf1pSDK = this.AFInAppEventType().AFLogger$LogLevel();
        AFf1qSDK aFf1qSDK = this.afErrorLog();
        Runnable runnable = this.AFKeystoreWrapper(aFf1qSDK);
        arraFf1pSDK.AFKeystoreWrapper(aFf1qSDK);
        arraFf1pSDK.AFKeystoreWrapper(new AFf1jSDK(runnable));
        arraFf1pSDK.AFKeystoreWrapper(new AFf1nSDK(runnable, this.AFInAppEventType()));
        arraFf1pSDK.AFKeystoreWrapper(new AFf1mSDK(runnable, this.AFInAppEventType()));
        if (!this.AFLogger()) {
            n8 = onAttributionFailure + 21;
            onDeepLinking = n8 % 128;
            if (n8 % 2 != 0) {
                arraFf1pSDK.values((Context)this.init, runnable, this.AFInAppEventType());
                onAttributionFailure = (onDeepLinking + 29) % 128;
            } else {
                arraFf1pSDK.values((Context)this.init, runnable, this.AFInAppEventType());
                throw null;
            }
        }
        arraFf1pSDK = arraFf1pSDK.valueOf();
        int n9 = arraFf1pSDK.length;
        n8 = 0;
        while (n8 < n9) {
            int n10 = onDeepLinking + 1;
            onAttributionFailure = n10 % 128;
            if (n10 % 2 != 0) {
                arraFf1pSDK[n8].valueOf((Context)this.init);
                n8 += 12;
            } else {
                arraFf1pSDK[n8].valueOf((Context)this.init);
                ++n8;
            }
            onAttributionFailure = (onDeepLinking + 51) % 128;
        }
    }

    private AFf1qSDK afErrorLog() {
        AFf1qSDK aFf1qSDK = new AFf1qSDK(new b(this), this.AFInAppEventType().AFInAppEventType());
        int n8 = onDeepLinking + 45;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return aFf1qSDK;
        }
        throw null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void afErrorLog(Context object) {
        int n8;
        block11 : {
            Object object2;
            block13 : {
                block14 : {
                    block12 : {
                        int n9;
                        if (AFa1fSDK.valueOf()) {
                            AFLogger.afRDLog("OPPO device found");
                            n9 = 23;
                        } else {
                            n9 = 18;
                        }
                        n8 = Build.VERSION.SDK_INT;
                        if (n8 < n9 || AFa1eSDK.valueOf("keyPropDisableAFKeystore", true)) break block11;
                        object2 = new StringBuilder("OS SDK is=");
                        object2.append(n8);
                        object2.append("; use KeyStore");
                        AFLogger.afRDLog(object2.toString());
                        object2 = new AFKeystoreWrapper((Context)object);
                        if (object2.AFKeystoreWrapper()) break block12;
                        object2.AFKeystoreWrapper = AFb1zSDK.valueOf(this.AFInAppEventType().init(), this.AFInAppEventType().values());
                        object2.values = 0;
                        break block13;
                    }
                    String string2 = object2.AFInAppEventParameterName();
                    object = object2.valueOf;
                    // MONITORENTER : object
                    ++object2.values;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf((Object)string2)));
                    Object object3 = object2.valueOf;
                    // MONITORENTER : object3
                    object2.AFInAppEventType.deleteEntry(string2);
                    // MONITOREXIT : object3
                    break block14;
                    catch (KeyStoreException keyStoreException) {
                        string2 = new StringBuilder("Exception ");
                        string2.append(keyStoreException.getMessage());
                        string2.append(" occurred");
                        AFLogger.afErrorLog(string2.toString(), (Throwable)keyStoreException);
                    }
                }
                // MONITOREXIT : object
            }
            object2.AFKeystoreWrapper(object2.AFInAppEventParameterName());
            AFa1eSDK.AFInAppEventType("KSAppsFlyerId", object2.valueOf());
            AFa1eSDK.AFInAppEventType("KSAppsFlyerRICounter", String.valueOf((int)object2.AFInAppEventType()));
            return;
        }
        object = new StringBuilder("OS SDK is=");
        object.append(n8);
        object.append("; no KeyStore usage");
        AFLogger.afRDLog(object.toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void afErrorLogForExcManagerOnly() {
        f f8;
        long l8;
        ScheduledExecutorService scheduledExecutorService;
        int n8 = onAttributionFailure + 25;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            scheduledExecutorService = this.AFInAppEventType().valueOf();
            f8 = new f(this);
            l8 = 1L;
        } else {
            scheduledExecutorService = this.AFInAppEventType().valueOf();
            f8 = new f(this);
            l8 = 0L;
        }
        AFa1eSDK.AFInAppEventParameterName(scheduledExecutorService, f8, l8, TimeUnit.MILLISECONDS);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static void afInfoLog(Context var0) {
        block7 : {
            block8 : {
                try {
                    var1_3 = var0.getPackageManager().getPackageInfo((String)var0.getPackageName(), (int)0).applicationInfo.flags;
                }
                catch (Exception var0_2) {}
                if ((var1_3 & 32768) == 0) return;
                var1_3 = AFa1eSDK.onDeepLinking + 9;
                AFa1eSDK.onAttributionFailure = var1_3 % 128;
                if (var1_3 % 2 == 0) break block8;
                var1_3 = var0.getResources().getIdentifier("appsflyer_backup_rules", "xml", var0.getPackageName());
                var2_4 = 16 / 0;
                if (var1_3 == 0) break block7;
                ** GOTO lbl19
            }
            if (var0.getResources().getIdentifier("appsflyer_backup_rules", "xml", var0.getPackageName()) == 0) break block7;
lbl19: // 2 sources:
            AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 23) % 128;
            return;
        }
        AFLogger.AFKeystoreWrapper("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
        return;
        AFLogger.afErrorLogForExcManagerOnly("checkBackupRules Exception", (Throwable)var0_2);
        AFLogger.afRDLog("checkBackupRules Exception: ".concat(String.valueOf((Object)var0_2)));
    }

    private boolean afInfoLog() {
        int n8;
        onAttributionFailure = (onDeepLinking + 93) % 128;
        if (this.afDebugLog > 0L) {
            long l8 = System.currentTimeMillis() - this.afDebugLog;
            Locale locale = Locale.US;
            Object object = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String string2 = AFa1eSDK.AFInAppEventType((SimpleDateFormat)object, this.afDebugLog);
            object = AFa1eSDK.AFInAppEventType((SimpleDateFormat)object, this.afWarnLog);
            if (l8 < this.AFVersionDeclaration) {
                onDeepLinking = (onAttributionFailure + 35) % 128;
                if (!this.isStopped()) {
                    onDeepLinking = (onAttributionFailure + 121) % 128;
                    AFLogger.afInfoLog(String.format((Locale)locale, (String)"Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", (Object[])new Object[]{string2, object, l8, this.AFVersionDeclaration}));
                    return true;
                }
            }
            if (!this.isStopped()) {
                AFLogger.afInfoLog(String.format((Locale)locale, (String)"Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", (Object[])new Object[]{string2, object, l8}));
            }
        } else if (!this.isStopped()) {
            n8 = onAttributionFailure + 11;
            onDeepLinking = n8 % 128;
            AFLogger.afInfoLog("Sending first launch for this session!");
            if (n8 % 2 == 0) {
                throw null;
            }
        }
        n8 = onDeepLinking + 59;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private static String afRDLog() {
        int n8 = onAttributionFailure + 121;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            return AFa1eSDK.values("appid");
        }
        AFa1eSDK.values("appid");
        throw null;
    }

    private void afWarnLog() {
        onAttributionFailure = (onDeepLinking + 21) % 128;
        if (AFd1lSDK.afInfoLog()) {
            int n8 = onAttributionFailure + 83;
            onDeepLinking = n8 % 128;
            if (n8 % 2 != 0) {
                return;
            }
            throw null;
        }
        Object object = this.AFInAppEventType();
        AFc1bSDK aFc1bSDK = object.AFVersionDeclaration();
        object = new AFd1lSDK((AFc1xSDK)object);
        aFc1bSDK.AFKeystoreWrapper.execute(new Runnable(aFc1bSDK, (AFd1zSDK)object){
            private /* synthetic */ AFd1zSDK AFInAppEventType;
            private /* synthetic */ AFc1bSDK AFKeystoreWrapper;
            {
                this.AFKeystoreWrapper = aFc1bSDK;
                this.AFInAppEventType = aFd1zSDK;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public final void run() {
                java.util.NavigableSet navigableSet;
                int n8;
                Object object;
                block20 : {
                    block21 : {
                        boolean bl;
                        navigableSet = this.AFKeystoreWrapper.AFLogger;
                        // MONITORENTER : navigableSet
                        if (this.AFKeystoreWrapper.afErrorLog.contains((Object)this.AFInAppEventType)) {
                            StringBuilder stringBuilder = new StringBuilder("QUEUE: tried to add already running task: ");
                            stringBuilder.append((Object)this.AFInAppEventType);
                            AFLogger.afDebugLog(stringBuilder.toString());
                            // MONITOREXIT : navigableSet
                            return;
                        }
                        if (this.AFKeystoreWrapper.AFLogger.contains((Object)this.AFInAppEventType) || this.AFKeystoreWrapper.afInfoLog.contains((Object)this.AFInAppEventType)) break block20;
                        java.util.NavigableSet navigableSet22 = this.AFKeystoreWrapper;
                        object = this.AFInAppEventType;
                        for (com.appsflyer.internal.AFd1vSDK aFd1vSDK : object.AFKeystoreWrapper) {
                            if (!navigableSet22.valueOf.contains((Object)aFd1vSDK)) continue;
                            object.AFInAppEventParameterName.add((Object)aFd1vSDK);
                        }
                        if (this.AFKeystoreWrapper.values(this.AFInAppEventType)) {
                            bl = this.AFKeystoreWrapper.AFLogger.add((Object)this.AFInAppEventType);
                        } else {
                            boolean bl2;
                            bl = bl2 = this.AFKeystoreWrapper.afInfoLog.add((Object)this.AFInAppEventType);
                            if (bl2) {
                                navigableSet22 = new StringBuilder("QUEUE: new task was blocked: ");
                                navigableSet22.append((Object)this.AFInAppEventType);
                                AFLogger.afDebugLog(navigableSet22.toString());
                                this.AFInAppEventType.AFKeystoreWrapper();
                                bl = bl2;
                            }
                        }
                        if (bl) {
                            navigableSet22 = this.AFKeystoreWrapper;
                            navigableSet22.AFLogger.addAll(navigableSet22.afDebugLog);
                            this.AFKeystoreWrapper.afDebugLog.clear();
                        } else {
                            navigableSet22 = new StringBuilder("QUEUE: task not added, it's already in the queue: ");
                            navigableSet22.append((Object)this.AFInAppEventType);
                            AFLogger.afDebugLog(navigableSet22.toString());
                        }
                        // MONITOREXIT : navigableSet
                        if (!bl) break block21;
                        this.AFKeystoreWrapper.valueOf.add((Object)this.AFInAppEventType.values);
                        navigableSet = new StringBuilder("QUEUE: new task added: ");
                        navigableSet.append((Object)this.AFInAppEventType);
                        AFLogger.afDebugLog(navigableSet.toString());
                        for (java.util.NavigableSet navigableSet22 : this.AFKeystoreWrapper.values) {
                        }
                        navigableSet = this.AFKeystoreWrapper;
                        navigableSet.AFInAppEventParameterName.submit((Runnable)navigableSet);
                        object = this.AFKeystoreWrapper;
                        navigableSet22 = object.AFLogger;
                        // MONITORENTER : navigableSet22
                        n8 = object.AFLogger.size() + object.afInfoLog.size() - 40;
                    }
                    navigableSet = new StringBuilder("QUEUE: tried to add already pending task: ");
                    navigableSet.append((Object)this.AFInAppEventType);
                    AFLogger.afWarnLog(navigableSet.toString());
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder("QUEUE: tried to add already scheduled task: ");
                stringBuilder.append((Object)this.AFInAppEventType);
                AFLogger.afDebugLog(stringBuilder.toString());
                // MONITOREXIT : navigableSet
                return;
                do {
                    block25 : {
                        block23 : {
                            boolean bl;
                            block24 : {
                                boolean bl3;
                                block22 : {
                                    if (n8 <= 0) {
                                        // MONITOREXIT : navigableSet22
                                        return;
                                    }
                                    bl = object.afInfoLog.isEmpty() ^ true;
                                    bl3 = object.AFLogger.isEmpty() ^ true;
                                    if (!bl3 || !bl) break block22;
                                    navigableSet = ((AFd1zSDK)object.AFLogger.first()).AFKeystoreWrapper((AFd1zSDK)object.afInfoLog.first()) > 0 ? object.AFLogger : object.afInfoLog;
                                    break block23;
                                }
                                if (!bl3) break block24;
                                navigableSet = object.AFLogger;
                                break block23;
                            }
                            if (!bl) break block25;
                            navigableSet = object.afInfoLog;
                        }
                        object.AFInAppEventParameterName(navigableSet);
                    }
                    --n8;
                } while (true);
            }
        });
    }

    public static /* synthetic */ void b(AFa1eSDK aFa1eSDK, AFf1qSDK aFf1qSDK) {
        aFa1eSDK.AFInAppEventType(aFf1qSDK);
    }

    public static /* synthetic */ void c(AFa1eSDK aFa1eSDK) {
        aFa1eSDK.afErrorLogForExcManagerOnly();
    }

    public static /* synthetic */ void d(AFc1xSDK aFc1xSDK) {
        AFa1eSDK.valueOf(aFc1xSDK);
    }

    public static /* synthetic */ void e(AFa1eSDK aFa1eSDK) {
        aFa1eSDK.getLevel();
    }

    public static /* synthetic */ void f(AFa1eSDK aFa1eSDK, Context context, Intent intent) {
        aFa1eSDK.values(context, intent);
    }

    private /* synthetic */ void getLevel() {
        Throwable throwable2;
        block4 : {
            block3 : {
                AFe1lSDK aFe1lSDK;
                try {
                    aFe1lSDK = new AFe1lSDK();
                    boolean bl = this.AFInAppEventParameterName(aFe1lSDK, this.values((Context)this.init));
                    if (!bl) break block3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                onDeepLinking = (onAttributionFailure + 91) % 128;
                this.valueOf(aFe1lSDK);
                onDeepLinking = (onAttributionFailure + 1) % 128;
            }
            onAttributionFailure = (onDeepLinking + 53) % 128;
            return;
        }
        AFLogger.afErrorLog(throwable2.getMessage(), throwable2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static SharedPreferences valueOf(Context var0) {
        // MONITORENTER : com.appsflyer.internal.AFa1eSDK.class
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 119) % 128;
        if (AFa1eSDK.valueOf().onConversionDataSuccess != null) ** GOTO lbl17
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 7) % 128;
        var1_3 = StrictMode.allowThreadDiskReads();
        AFa1eSDK.valueOf().onConversionDataSuccess = var0.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        {
            catch (Throwable var0_1) {
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var1_3);
                throw var0_1;
            }
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var1_3);
lbl17: // 2 sources:
        var0 = AFa1eSDK.valueOf().onConversionDataSuccess;
        return var0;
    }

    public static AFa1eSDK valueOf() {
        int n8;
        AFa1eSDK aFa1eSDK;
        int n9 = onDeepLinking + 33;
        onAttributionFailure = n8 = n9 % 128;
        if (n9 % 2 != 0) {
            aFa1eSDK = afRDLog;
            n9 = 80 / 0;
        } else {
            aFa1eSDK = afRDLog;
        }
        onDeepLinking = (n8 + 51) % 128;
        return aFa1eSDK;
    }

    private static String valueOf(String string2) {
        onDeepLinking = (onAttributionFailure + 117) % 128;
        int n8 = string2.indexOf(63);
        if (n8 == -1) {
            n8 = onAttributionFailure + 45;
            onDeepLinking = n8 % 128;
            if (n8 % 2 != 0) {
                return "";
            }
            throw null;
        }
        string2 = string2.substring(n8);
        onDeepLinking = (onAttributionFailure + 93) % 128;
        return string2;
    }

    public static /* synthetic */ void valueOf(AFa1eSDK aFa1eSDK, AFa1qSDK aFa1qSDK) {
        onAttributionFailure = (onDeepLinking + 55) % 128;
        aFa1eSDK.valueOf(aFa1qSDK);
        onAttributionFailure = (onDeepLinking + 83) % 128;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void valueOf(AFa1qSDK var1_1) {
        block20 : {
            block23 : {
                block21 : {
                    block25 : {
                        block26 : {
                            block24 : {
                                block22 : {
                                    block18 : {
                                        block19 : {
                                            block17 : {
                                                var4_2 = AFa1eSDK.onAttributionFailure + 45;
                                                AFa1eSDK.onDeepLinking = var4_2 % 128;
                                                var2_3 = false;
                                                var3_4 = 0;
                                                if (var4_2 % 2 != 0) break block17;
                                                var14_5 = this.AFInAppEventType().init().AFInAppEventType;
                                                var4_2 = 41 / 0;
                                                var13_6 = var14_5;
                                                if (var14_5 != null) break block18;
                                                break block19;
                                            }
                                            var14_5 = this.AFInAppEventType().init().AFInAppEventType;
                                            var13_6 = var14_5;
                                            if (var14_5 != null) break block18;
                                        }
                                        AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
                                        return;
                                    }
                                    var14_5 = this.values((Context)var13_6);
                                    AppsFlyerProperties.getInstance().saveProperties((AFb1dSDK)var14_5);
                                    if (!this.AFInAppEventType().afWarnLog().AFKeystoreWrapper()) {
                                        var15_7 = new StringBuilder("sendWithEvent from activity: ");
                                        var15_7.append(var13_6.getClass().getName());
                                        AFLogger.afInfoLog(var15_7.toString());
                                    }
                                    var6_8 = var1_1.AFInAppEventParameterName();
                                    var15_7 = this.AFInAppEventParameterName((AFa1qSDK)var1_1);
                                    var13_6 = (String)var15_7.get((Object)"appsflyerKey");
                                    if (var13_6 == null || var13_6.length() == 0) break block20;
                                    if (!this.isStopped()) {
                                        AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
                                    }
                                    var4_2 = this.valueOf((AFb1dSDK)var14_5, false);
                                    var16_9 = new AFf1fSDK(this.AFInAppEventType().AFInAppEventParameterName());
                                    Intrinsics.checkNotNullParameter(var1_1, "");
                                    var7_10 = var1_1.AFInAppEventParameterName();
                                    var8_11 = var1_1 instanceof AFe1oSDK;
                                    var9_12 = var1_1 instanceof AFe1kSDK;
                                    var10_13 = var1_1 instanceof AFe1gSDK;
                                    if (var1_1 instanceof AFe1lSDK || var10_13) break block21;
                                    if (!var9_12) break block22;
                                    var14_5 = AFf1fSDK.afErrorLogForExcManagerOnly;
                                    var13_6 = var14_5;
                                    if (var14_5 != null) break block23;
                                    var13_6 = var16_9.AFInAppEventType;
                                    var14_5 = AFf1fSDK.valueOf;
                                    ** GOTO lbl95
                                }
                                if (!var8_11) break block24;
                                var14_5 = AFf1fSDK.getLevel;
                                var13_6 = var14_5;
                                if (var14_5 != null) break block23;
                                var13_6 = var16_9.AFInAppEventType;
                                var14_5 = AFf1fSDK.AFInAppEventParameterName;
                                ** GOTO lbl95
                            }
                            if (!var7_10) break block25;
                            if (var4_2 >= 2) break block26;
                            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 93) % 128;
                            var14_5 = AFf1fSDK.AppsFlyer2dXConversionCallback;
                            var13_6 = var14_5;
                            if (var14_5 != null) break block23;
                            var5_14 = AFa1eSDK.onAttributionFailure + 49;
                            AFa1eSDK.onDeepLinking = var5_14 % 128;
                            if (var5_14 % 2 == 0) {
                                var16_9.AFInAppEventType.valueOf(AFf1fSDK.afRDLog);
                                throw null;
                            }
                            var13_6 = var16_9.AFInAppEventType;
                            var14_5 = AFf1fSDK.afRDLog;
                            ** GOTO lbl95
                        }
                        var14_5 = AFf1fSDK.onAppOpenAttributionNative;
                        var13_6 = var14_5;
                        if (var14_5 != null) break block23;
                        var13_6 = var16_9.AFInAppEventType;
                        var14_5 = AFf1fSDK.afErrorLog;
                        ** GOTO lbl95
                    }
                    var14_5 = AFf1fSDK.onInstallConversionDataLoadedNative;
                    var13_6 = var14_5;
                    if (var14_5 != null) break block23;
                    var13_6 = var16_9.AFInAppEventType;
                    var14_5 = AFf1fSDK.AFLogger;
                    ** GOTO lbl95
                }
                var14_5 = AFf1fSDK.afWarnLog;
                var13_6 = var14_5;
                if (var14_5 != null) break block23;
                var5_14 = AFa1eSDK.onDeepLinking + 73;
                AFa1eSDK.onAttributionFailure = var5_14 % 128;
                var13_6 = var16_9.AFInAppEventType;
                if (var5_14 % 2 != 0) {
                    var13_6 = var13_6.valueOf(AFf1fSDK.AFKeystoreWrapper);
                    var5_14 = 98 / 0;
                } else {
                    var14_5 = AFf1fSDK.AFKeystoreWrapper;
lbl95: // 6 sources:
                    var13_6 = var13_6.valueOf((String)var14_5);
                }
            }
            var14_5 = new StringBuilder();
            var14_5.append((String)var13_6);
            var14_5.append(var16_9.values.valueOf.AFInAppEventType.getPackageName());
            var13_6 = var16_9.AFInAppEventParameterName(AFf1fSDK.AFInAppEventParameterName(var14_5.toString(), var8_11));
            this.AFInAppEventParameterName((Map<String, Object>)var15_7);
            var1_1 = new AFa1ySDK(this, var1_1.AFKeystoreWrapper((String)var13_6).values(var15_7).AFInAppEventParameterName(var4_2), 0);
            if (var6_8) {
                AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 43) % 128;
                var13_6 = this.AFVersionDeclaration();
                var4_2 = var13_6.length;
                var2_3 = false;
                while (var3_4 < var4_2) {
                    var14_5 = var13_6[var3_4];
                    if (var14_5.afDebugLog == AFf1pSDK.AFa1zSDK.AFInAppEventType) {
                        var15_7 = new StringBuilder("Failed to get ");
                        var15_7.append(var14_5.AFKeystoreWrapper);
                        var15_7.append(" referrer, wait ...");
                        AFLogger.afDebugLog(var15_7.toString());
                        var2_3 = true;
                    }
                    ++var3_4;
                }
                if (this.onDeepLinkingNative) {
                    AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 27) % 128;
                    if (!this.AFLogger$LogLevel()) {
                        AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                        var2_3 = true;
                    }
                }
                if (this.AFInAppEventType().afWarnLog().AFInAppEventType()) {
                    AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 123) % 128;
                    var2_3 = true;
                }
            }
            var13_6 = this.AFInAppEventType().valueOf();
            var11_15 = var2_3 != false ? 500L : 0L;
            AFa1eSDK.AFInAppEventParameterName((ScheduledExecutorService)var13_6, (Runnable)var1_1, var11_15, TimeUnit.MILLISECONDS);
            return;
        }
        AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
        var1_1 = var1_1.AFInAppEventParameterName;
        if (var1_1 == null) return;
        var1_1.onError(41, "No dev key");
    }

    private static /* synthetic */ void valueOf(AFc1xSDK aFc1xSDK) {
        onAttributionFailure = (onDeepLinking + 87) % 128;
        aFc1xSDK.onAppOpenAttributionNative().AFInAppEventType();
        int n8 = onDeepLinking + 53;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return;
        }
        throw null;
    }

    /*
     * Exception decompiling
     */
    private static void valueOf(JSONObject var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 10[UNCONDITIONALDOLOOP]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* synthetic */ boolean valueOf(AFa1eSDK aFa1eSDK, boolean bl) {
        int n8 = onDeepLinking;
        onAttributionFailure = (n8 + 119) % 128;
        aFa1eSDK.AppsFlyer2dXConversionCallback = bl;
        onAttributionFailure = (n8 += 21) % 128;
        if (n8 % 2 == 0) {
            return bl;
        }
        throw null;
    }

    private static boolean valueOf(String string2, boolean bl) {
        int n8 = onDeepLinking + 21;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            bl = AppsFlyerProperties.getInstance().getBoolean(string2, bl);
            n8 = onAttributionFailure + 117;
            onDeepLinking = n8 % 128;
            if (n8 % 2 == 0) {
                n8 = 36 / 0;
            }
            return bl;
        }
        AppsFlyerProperties.getInstance().getBoolean(string2, bl);
        throw null;
    }

    private int values(AFb1dSDK aFb1dSDK, boolean bl) {
        int n8 = onDeepLinking + 119;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return this.AFKeystoreWrapper(aFb1dSDK, "appsFlyerInAppEventCount", bl);
        }
        this.AFKeystoreWrapper(aFb1dSDK, "appsFlyerInAppEventCount", bl);
        throw null;
    }

    private String values(Context object, String string2) {
        if (object == null) {
            int n8 = onDeepLinking + 7;
            onAttributionFailure = n8 % 128;
            if (n8 % 2 == 0) {
                return null;
            }
            throw null;
        }
        this.AFKeystoreWrapper((Context)object);
        object = this.AFInAppEventType().AFInAppEventParameterName().AFInAppEventType(string2);
        onAttributionFailure = (onDeepLinking + 63) % 128;
        return object;
    }

    private static String values(String string2) {
        int n8 = onDeepLinking + 117;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return AppsFlyerProperties.getInstance().getString(string2);
        }
        AppsFlyerProperties.getInstance().getString(string2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Deprecated
    @NonNull
    public static String values(HttpURLConnection var0) {
        block23 : {
            var7_4 = new StringBuilder();
            var4_5 = null;
            try {
                var5_6 = var0.getErrorStream();
                var3_7 = var5_6;
                if (var5_6 == null) {
                    var3_7 = var0.getInputStream();
                }
                var5_6 = new InputStreamReader((InputStream)var3_7, Charset.defaultCharset());
            }
            catch (Throwable var3_12) {
                var5_6 = null;
                ** GOTO lbl43
            }
            try {}
            catch (Throwable var3_8) {}
            break block23;
            ** GOTO lbl43
        }
        var6_14 = new BufferedReader((Reader)var5_6);
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 99) % 128;
        var1_15 = false;
        do {
            block22 : {
                var4_5 = var6_14.readLine();
                if (var4_5 == null) break block22;
                var2_16 = AFa1eSDK.onAttributionFailure + 111;
                AFa1eSDK.onDeepLinking = var2_16 % 128;
                if (var2_16 % 2 == 0) throw null;
                if (!var1_15) ** GOTO lbl46
                var3_7 = Character.valueOf((char)'\n');
                ** GOTO lbl47
            }
            var6_14.close();
            var5_6.close();
            {
                catch (Throwable var0_1) {
                    AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", var0_1);
                    break;
                }
            }
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 97) % 128;
            break;
            {
                catch (Throwable var3_13) {
                    var4_5 = var6_14;
                }
lbl43: // 4 sources:
                var6_14 = new StringBuilder("Could not read connection response from: ");
                var6_14.append(var0.getURL().toString());
                AFLogger.afErrorLog(var6_14.toString(), (Throwable)var3_7);
lbl46: // 1 sources:
                var3_7 = "";
lbl47: // 2 sources:
                var7_4.append(var3_7);
                var7_4.append(var4_5);
                var1_15 = true;
                continue;
                finally {
                    if (var4_5 != null) {
                        ** try [egrp 6[TRYBLOCK] [10 : 218->233)] { 
lbl54: // 1 sources:
                        var4_5.close();
                    }
                    if (var5_6 == null) break;
                    var5_6.close();
                }
            }
            break;
        } while (true);
        var0 = var7_4.toString();
        try {
            new JSONObject((String)var0);
            return var0;
        }
        catch (JSONException var3_9) {
            AFLogger.afErrorLogForExcManagerOnly("error while parsing readServerResponse", (Throwable)var3_9);
            var3_10 = new JSONObject();
            try {
                var3_10.put("string_response", var0);
                return var3_10.toString();
            }
            catch (JSONException var0_2) {
                AFLogger.afErrorLogForExcManagerOnly("RESPONSE_NOT_JSON error", (Throwable)var0_2);
                return new JSONObject().toString();
            }
        }
    }

    public static /* synthetic */ Map values(AFa1eSDK map) {
        int n8;
        onDeepLinking = n8 = (onAttributionFailure + 125) % 128;
        map = map.onResponseErrorNative;
        onAttributionFailure = (n8 + 47) % 128;
        return map;
    }

    public static Map<String, Object> values(Map<String, Object> map) {
        onAttributionFailure = (onDeepLinking + 73) % 128;
        if (map.containsKey((Object)"meta")) {
            int n8 = onDeepLinking + 13;
            onAttributionFailure = n8 % 128;
            map = (Map)map.get((Object)"meta");
            if (n8 % 2 == 0) {
                return map;
            }
            throw null;
        }
        HashMap hashMap = new HashMap();
        map.put((Object)"meta", (Object)hashMap);
        return hashMap;
    }

    public static void values() {
        onResponse = 139;
    }

    /*
     * Exception decompiling
     */
    private static void values(int var0, String var1_1, int var2_3, int var3_4, boolean var4_5, Object[] var5_6) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[WHILELOOP]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void values(Context context, Intent intent) {
        int n8;
        Uri uri;
        int n9;
        onDeepLinking = (onAttributionFailure + 67) % 128;
        this.AFKeystoreWrapper(context);
        AFb1sSDK aFb1sSDK = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
        AFb1dSDK aFb1dSDK = this.AFInAppEventType().values();
        if (intent != null && "android.intent.action.VIEW".equals((Object)intent.getAction())) {
            n8 = onDeepLinking + 35;
            onAttributionFailure = n8 % 128;
            if (n8 % 2 != 0) {
                intent.getData();
                throw null;
            }
            uri = intent.getData();
        } else {
            uri = null;
        }
        n8 = n9 = 0;
        if (uri != null) {
            n8 = n9;
            if (!uri.toString().isEmpty()) {
                n8 = onDeepLinking + 115;
                onAttributionFailure = n8 % 128;
                n8 = n8 % 2 != 0 ? n9 : 1;
            }
        }
        if (aFb1dSDK.valueOf("ddl_sent") && n8 != 1) {
            aFb1sSDK.AFKeystoreWrapper("No direct deep link", null);
            return;
        }
        aFb1sSDK.valueOf((Map<String, Object>)new HashMap(), intent, context);
    }

    /*
     * Exception decompiling
     */
    public final Map<String, Object> AFInAppEventParameterName(AFa1qSDK var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 21[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final AFc1xSDK AFInAppEventType() {
        int n8 = onDeepLinking;
        AFc1ySDK aFc1ySDK = this.onConversionDataFail;
        onAttributionFailure = (n8 += 5) % 128;
        if (n8 % 2 != 0) {
            n8 = 48 / 0;
        }
        return aFc1ySDK;
    }

    public final void AFInAppEventType(Context context, Intent object) {
        int n8 = onDeepLinking + 71;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            if (object.getStringExtra("appsflyer_preinstall") != null) {
                onDeepLinking = (onAttributionFailure + 23) % 128;
                AFa1eSDK.AFKeystoreWrapper(object.getStringExtra("appsflyer_preinstall"));
                onAttributionFailure = (onDeepLinking + 59) % 128;
            }
            AFLogger.afInfoLog("****** onReceive called *******");
            AppsFlyerProperties.getInstance();
            object = object.getStringExtra("referrer");
            AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf((Object)object)));
            if (object != null) {
                this.values(context).AFInAppEventParameterName("referrer", (String)object);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                appsFlyerProperties.set("AF_REFERRER", (String)object);
                appsFlyerProperties.AFKeystoreWrapper = object;
                if (AppsFlyerProperties.getInstance().AFInAppEventType()) {
                    AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    this.AFInAppEventType(context, AFe1nSDK.AFInAppEventParameterName);
                    this.AFKeystoreWrapper(context, (String)object);
                }
            }
            onAttributionFailure = (onDeepLinking + 29) % 128;
            return;
        }
        object.getStringExtra("appsflyer_preinstall");
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void AFInAppEventType(Context var1_1, String var2_3) {
        block12 : {
            block10 : {
                block11 : {
                    AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf((Object)var2_3)));
                    var4_4 = System.currentTimeMillis();
                    var6_5 = this.values(var1_1).values("extraReferrers", null);
                    if (var6_5 == null) {
                        var6_5 = new JSONObject();
                        var7_7 = new JSONArray();
                        break block10;
                    }
                    var8_8 = new JSONObject(var6_5);
                    if (var8_8.has(var2_3)) {
                        var6_5 = new JSONArray((String)var8_8.get(var2_3));
                        break block11;
                    }
                    var6_5 = new JSONArray();
                    AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 49) % 128;
                }
                var7_7 = var6_5;
                var6_5 = var8_8;
            }
            if ((long)var7_7.length() >= 5L) break block12;
            var7_7.put(var4_4);
        }
        if ((long)(var3_9 = var6_5.length()) >= 4L) {
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 53) % 128;
            AFa1eSDK.valueOf((JSONObject)var6_5);
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 1) % 128;
        }
        try {
            var6_5.put(var2_3, (Object)var7_7.toString());
            this.values(var1_1).AFInAppEventParameterName("extraReferrers", var6_5.toString());
            return;
        }
        catch (Throwable var6_6) {}
        catch (JSONException var1_2) {}
        ** finally { 
lbl35: // 1 sources:
        var1_1 = new StringBuilder("Couldn't save referrer - ");
        var1_1.append(var2_3);
        var1_1.append(": ");
        AFLogger.afErrorLog(var1_1.toString(), var6_6);
    }

    public final void AFKeystoreWrapper(@NonNull Context context) {
        int n8 = onAttributionFailure + 39;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            Object object = this.onConversionDataFail;
            if (context != null) {
                object = object.valueOf;
                if (context != null) {
                    object.AFInAppEventType = context.getApplicationContext();
                    onAttributionFailure = (onDeepLinking + 91) % 128;
                }
            }
            return;
        }
        throw null;
    }

    public final void AFKeystoreWrapper(WeakReference<Context> object) {
        Object object2;
        onAttributionFailure = (onDeepLinking + 3) % 128;
        if (object.get() == null) {
            return;
        }
        AFLogger.afInfoLog("app went to background");
        AFb1dSDK aFb1dSDK = this.values((Context)object.get());
        AppsFlyerProperties.getInstance().saveProperties(aFb1dSDK);
        long l8 = this.AFInAppEventType().afDebugLog().afWarnLog;
        HashMap hashMap = new HashMap();
        String string2 = this.AFInAppEventType().afWarnLog().AFInAppEventParameterName;
        if (string2 == null) {
            AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        Object object3 = AFa1eSDK.values("KSAppsFlyerId");
        if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
            hashMap.put((Object)"deviceTrackingDisabled", (Object)"true");
            onAttributionFailure = (onDeepLinking + 57) % 128;
        }
        if ((object2 = AFa1cSDK.AFInAppEventParameterName(((Context)object.get()).getContentResolver())) != null) {
            hashMap.put((Object)"amazon_aid", (Object)object2.valueOf);
            hashMap.put((Object)"amazon_aid_limit", (Object)String.valueOf((Object)object2.AFInAppEventType));
        }
        if ((object2 = AppsFlyerProperties.getInstance().getString("advertiserId")) != null) {
            hashMap.put((Object)"advertiserId", object2);
            onDeepLinking = (onAttributionFailure + 105) % 128;
        }
        hashMap.put((Object)"app_id", (Object)((Context)object.get()).getPackageName());
        hashMap.put((Object)"devkey", (Object)string2);
        hashMap.put((Object)"uid", (Object)AFb1zSDK.valueOf(this.AFInAppEventType().init(), this.AFInAppEventType().values()));
        hashMap.put((Object)"time_in_app", (Object)String.valueOf((long)l8));
        hashMap.put((Object)"statType", (Object)"user_closed_app");
        hashMap.put((Object)"platform", (Object)"Android");
        hashMap.put((Object)"launch_counter", (Object)Integer.toString((int)this.valueOf(aFb1dSDK, false)));
        hashMap.put((Object)"channel", (Object)this.AFInAppEventType().AFInAppEventParameterName().values());
        object = object3 != null ? object3 : "";
        hashMap.put((Object)"originalAppsflyerId", object);
        if (this.AppsFlyer2dXConversionCallback) {
            object = new AFe1bSDK();
            object.afErrorLogForExcManagerOnly = this.isStopped();
            object = new AFd1hSDK((AFe1bSDK)object.AFInAppEventParameterName(this.AFInAppEventType().AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0)).values(hashMap).AFKeystoreWrapper(String.format((String)afErrorLog, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()})), this.AFInAppEventType());
            object3 = this.AFInAppEventType().AFVersionDeclaration();
            object3.AFKeystoreWrapper.execute(new );
            return;
        }
        AFLogger.afDebugLog("Stats call is disabled, ignore ...");
        int n8 = onDeepLinking + 99;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 != 0) {
            n8 = 16 / 0;
        }
    }

    public final boolean AFKeystoreWrapper() {
        block6 : {
            int n8;
            block7 : {
                block5 : {
                    n8 = onDeepLinking + 93;
                    onAttributionFailure = n8 % 128;
                    if (n8 % 2 == 0) break block5;
                    if (!AFa1eSDK.valueOf("waitForCustomerId", false)) break block6;
                    break block7;
                }
                if (AFa1eSDK.valueOf("waitForCustomerId", false) ^ true) {
                    return false;
                }
            }
            n8 = onAttributionFailure + 67;
            onDeepLinking = n8 % 128;
            if (n8 % 2 == 0) {
                String string2 = AFa1eSDK.AFInAppEventParameterName();
                n8 = 46 / 0;
                if (string2 == null) {
                    return true;
                }
            } else if (AFa1eSDK.AFInAppEventParameterName() == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final /* varargs */ void addPushNotificationDeepLinkPath(String ... list) {
        int n8 = onDeepLinking + 95;
        onAttributionFailure = n8 % 128;
        list = Arrays.asList((Object[])list);
        if (n8 % 2 == 0) {
            List<List<String>> list2 = this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType;
            if (!list2.contains((Object)list)) {
                list2.add((Object)list);
                onAttributionFailure = (onDeepLinking + 23) % 128;
            }
            return;
        }
        this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType.contains((Object)list);
        throw null;
    }

    @Override
    public final void anonymizeUser(boolean bl) {
        onAttributionFailure = (onDeepLinking + 99) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("anonymizeUser", new String[]{String.valueOf((boolean)bl)});
        AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", bl);
        int n8 = onDeepLinking + 5;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 != 0) {
            n8 = 34 / 0;
        }
    }

    @Override
    public final void appendParametersToDeepLinkingURL(String string2, Map<String, String> map) {
        int n8 = onDeepLinking + 1;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 != 0) {
            AFb1sSDK aFb1sSDK = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
            aFb1sSDK.AFKeystoreWrapper = string2;
            aFb1sSDK.values = map;
            n8 = 14 / 0;
            return;
        }
        AFb1sSDK aFb1sSDK = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
        aFb1sSDK.AFKeystoreWrapper = string2;
        aFb1sSDK.values = map;
    }

    @Override
    public final void enableFacebookDeferredApplinks(boolean bl) {
        int n8 = onAttributionFailure;
        this.onDeepLinkingNative = bl;
        onDeepLinking = (n8 + 33) % 128;
    }

    @Override
    public final String getAppsFlyerUID(@NonNull Context object) {
        block5 : {
            int n8;
            block6 : {
                block4 : {
                    n8 = onAttributionFailure + 105;
                    onDeepLinking = n8 % 128;
                    if (n8 % 2 != 0) break block4;
                    this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("getAppsFlyerUID", new String[0]);
                    if (object != null) break block5;
                    break block6;
                }
                this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("getAppsFlyerUID", new String[0]);
                if (object != null) break block5;
            }
            n8 = onDeepLinking + 11;
            onAttributionFailure = n8 % 128;
            if (n8 % 2 == 0) {
                return null;
            }
            throw null;
        }
        this.AFKeystoreWrapper((Context)object);
        object = this.AFInAppEventType().AFInAppEventParameterName();
        return AFb1zSDK.valueOf(object.valueOf, object.AFInAppEventType);
    }

    @Override
    public final String getAttributionId(Context object) {
        try {
            object = new AFa1dSDK((Context)object, this.AFInAppEventType()).AFInAppEventType();
        }
        catch (Throwable throwable) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", throwable);
            return null;
        }
        onDeepLinking = (onAttributionFailure + 19) % 128;
        return object;
    }

    @Override
    public final String getHostName() {
        onAttributionFailure = (onDeepLinking + 63) % 128;
        String string2 = this.AFInAppEventType().onInstallConversionFailureNative().AFInAppEventParameterName();
        int n8 = onAttributionFailure + 83;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            return string2;
        }
        throw null;
    }

    @Override
    public final String getHostPrefix() {
        String string2;
        int n8 = onDeepLinking + 51;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 != 0) {
            string2 = this.AFInAppEventType().onInstallConversionFailureNative().valueOf();
            n8 = 58 / 0;
        } else {
            string2 = this.AFInAppEventType().onInstallConversionFailureNative().valueOf();
        }
        n8 = onAttributionFailure + 119;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            return string2;
        }
        throw null;
    }

    @Override
    public final String getOutOfStore(Context object) {
        block5 : {
            block6 : {
                block4 : {
                    int n8 = onDeepLinking + 45;
                    onAttributionFailure = n8 % 128;
                    if (n8 % 2 == 0) break block4;
                    String string2 = AppsFlyerProperties.getInstance().getString("api_store_value");
                    n8 = 36 / 0;
                    if (string2 == null) break block5;
                    object = string2;
                    break block6;
                }
                String string3 = AppsFlyerProperties.getInstance().getString("api_store_value");
                if (string3 == null) break block5;
                object = string3;
            }
            onAttributionFailure = (onDeepLinking + 93) % 128;
            return object;
        }
        if ((object = this.values((Context)object, "AF_STORE")) != null) {
            onDeepLinking = (onAttributionFailure + 55) % 128;
            return object;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    @Override
    public final String getSdkVersion() {
        onAttributionFailure = (onDeepLinking + 91) % 128;
        Object object = this.AFInAppEventType();
        object.afErrorLogForExcManagerOnly().AFInAppEventParameterName("getSdkVersion", new String[0]);
        object.AFInAppEventParameterName();
        object = AFb1gSDK.valueOf();
        int n8 = onAttributionFailure + 1;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            n8 = 93 / 0;
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final AppsFlyerLib init(@NonNull String string2, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context object) {
        int n8;
        if (this.onAppOpenAttributionNative) {
            return this;
        }
        this.onAppOpenAttributionNative = true;
        this.AFInAppEventType().afWarnLog().AFInAppEventParameterName = string2;
        AFa1aSDK.AFInAppEventType(string2);
        if (object != null) {
            this.init = (Application)object.getApplicationContext();
            this.AFKeystoreWrapper((Context)object);
            this.AFInAppEventType().afDebugLog().values = System.currentTimeMillis();
            this.AFInAppEventType().onConversionDataSuccess().values();
            object = new c(this);
            this.AFInAppEventType().afRDLog().AFInAppEventParameterName((AFd1bSDK)object);
            this.afDebugLog();
            this.onConversionDataFail.afWarnLog().AFInAppEventParameterName();
            onDeepLinking = (onAttributionFailure + 85) % 128;
        } else {
            AFLogger.afWarnLog("context is null, Google Install Referrer will be not initialized");
        }
        AFb1tSDK aFb1tSDK = this.AFInAppEventType().afErrorLogForExcManagerOnly();
        if (appsFlyerConversionListener == null) {
            n8 = onDeepLinking + 47;
            onAttributionFailure = n8 % 128;
            if (n8 % 2 != 0) throw null;
            object = "null";
        } else {
            onDeepLinking = (onAttributionFailure + 69) % 128;
            object = "conversionDataListener";
        }
        aFb1tSDK.AFInAppEventParameterName("init", new String[]{string2, object});
        AFLogger.AFInAppEventType(String.format((String)"Initializing AppsFlyer SDK: (v%s.%s)", (Object[])new Object[]{"6.12.2", values}));
        this.AFInAppEventParameterName = appsFlyerConversionListener;
        n8 = onAttributionFailure + 125;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) return this;
        n8 = 27 / 0;
        return this;
    }

    @Override
    public final boolean isPreInstalledApp(Context context) {
        int n8;
        onAttributionFailure = (onDeepLinking + 79) % 128;
        try {
            n8 = context.getPackageManager().getApplicationInfo((String)context.getPackageName(), (int)0).flags;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            AFLogger.afErrorLog("Could not check if app is pre installed", (Throwable)nameNotFoundException);
            return false;
        }
        if ((n8 & 1) != 0) {
            onAttributionFailure = (onDeepLinking + 1) % 128;
            return true;
        }
        onAttributionFailure = (onDeepLinking + 113) % 128;
        return false;
    }

    @Deprecated
    @Override
    public final boolean isStopped() {
        onAttributionFailure = (onDeepLinking + 49) % 128;
        boolean bl = this.AFInAppEventType().afWarnLog().AFKeystoreWrapper();
        onAttributionFailure = (onDeepLinking + 103) % 128;
        return bl;
    }

    @Override
    public final void logEvent(Context context, String string2, Map<String, Object> map) {
        int n8 = onDeepLinking + 15;
        onAttributionFailure = n8 % 128;
        this.logEvent(context, string2, map, null);
        if (n8 % 2 != 0) {
            n8 = 68 / 0;
        }
        n8 = onDeepLinking + 103;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 != 0) {
            n8 = 62 / 0;
        }
    }

    @Override
    public final void logEvent(@NonNull Context context, String string2, Map<String, Object> hashMap, AppsFlyerRequestListener hashMap2) {
        Object object;
        Object var5_5 = null;
        hashMap = hashMap == null ? null : new HashMap(hashMap);
        this.AFKeystoreWrapper(context);
        AFe1iSDK aFe1iSDK = new AFe1iSDK();
        aFe1iSDK.afDebugLog = string2;
        aFe1iSDK.AFInAppEventParameterName = hashMap2;
        if (hashMap != null && hashMap.containsKey((Object)"af_touch_obj")) {
            hashMap2 = new HashMap();
            object = hashMap.get((Object)"af_touch_obj");
            if (object instanceof MotionEvent) {
                object = (MotionEvent)object;
                HashMap hashMap3 = new HashMap();
                hashMap3.put((Object)"x", (Object)Float.valueOf((float)object.getX()));
                hashMap3.put((Object)"y", (Object)Float.valueOf((float)object.getY()));
                hashMap2.put((Object)"loc", (Object)hashMap3);
                hashMap2.put((Object)"pf", (Object)Float.valueOf((float)object.getPressure()));
                hashMap2.put((Object)"rad", (Object)Float.valueOf((float)(object.getTouchMajor() / 2.0f)));
            } else {
                hashMap2.put((Object)"error", (Object)"Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.AFKeystoreWrapper("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            hashMap2 = Collections.singletonMap((Object)"tch_data", (Object)hashMap2);
            hashMap.remove((Object)"af_touch_obj");
            aFe1iSDK.values(hashMap2);
        }
        aFe1iSDK.values = hashMap;
        object = this.AFInAppEventType().afErrorLogForExcManagerOnly();
        hashMap = hashMap2 = aFe1iSDK.values;
        if (hashMap2 == null) {
            hashMap = new HashMap();
        }
        object.AFInAppEventParameterName("logEvent", string2, new JSONObject((Map)hashMap).toString());
        if (string2 == null) {
            this.AFInAppEventType(context, AFe1nSDK.AFInAppEventType);
        }
        string2 = var5_5;
        if (context instanceof Activity) {
            string2 = (Activity)context;
        }
        this.values(aFe1iSDK, (Activity)string2);
    }

    @Override
    public final void logLocation(Context context, double d8, double d9) {
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("logLocation", String.valueOf((double)d8), String.valueOf((double)d9));
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"af_long", (Object)Double.toString((double)d9));
        hashMap.put((Object)"af_lat", (Object)Double.toString((double)d8));
        this.AFInAppEventType(context, "af_location_coordinates", (Map<String, Object>)hashMap);
        onAttributionFailure = (onDeepLinking + 115) % 128;
    }

    @Override
    public final void logSession(Context context) {
        onDeepLinking = (onAttributionFailure + 41) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("logSession", new String[0]);
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName();
        this.AFInAppEventType(context, AFe1nSDK.values);
        this.AFInAppEventType(context, null, null);
        int n8 = onDeepLinking + 47;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override
    public final void onPause(Context context) {
        onDeepLinking = (onAttributionFailure + 5) % 128;
        this.AFInAppEventType().onResponseNative().AFInAppEventType(context);
        onAttributionFailure = (onDeepLinking + 43) % 128;
    }

    @Deprecated
    @Override
    public final void performOnAppAttribution(@NonNull Context object, @NonNull URI object2) {
        block6 : {
            block7 : {
                block5 : {
                    int n8 = onDeepLinking + 121;
                    onAttributionFailure = n8 % 128;
                    if (n8 % 2 == 0) break block5;
                    n8 = 83 / 0;
                    if (object2 == null) break block6;
                    break block7;
                }
                if (object2 == null) break block6;
            }
            if (!object2.toString().isEmpty()) {
                if (object == null) {
                    object2 = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
                    StringBuilder stringBuilder = new StringBuilder("Context is \"");
                    stringBuilder.append(object);
                    stringBuilder.append("\"");
                    object2.AFKeystoreWrapper(stringBuilder.toString(), DeepLinkResult.Error.NETWORK);
                    return;
                }
                this.AFInAppEventType().AppsFlyer2dXConversionCallback().valueOf((Context)object, (Map<String, Object>)new HashMap(), Uri.parse((String)object2.toString()));
                onDeepLinking = (onAttributionFailure + 119) % 128;
                return;
            }
        }
        object = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
        StringBuilder stringBuilder = new StringBuilder("Link is \"");
        stringBuilder.append(object2);
        stringBuilder.append("\"");
        object.AFKeystoreWrapper(stringBuilder.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override
    public final void performOnDeepLinking(@NonNull Intent intent, @NonNull Context context) {
        if (intent == null) {
            this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context == null) {
            int n8 = onAttributionFailure + 125;
            onDeepLinking = n8 % 128;
            if (n8 % 2 != 0) {
                this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                onDeepLinking = (onAttributionFailure + 113) % 128;
                return;
            }
            this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            throw null;
        }
        context = context.getApplicationContext();
        this.AFKeystoreWrapper(context);
        this.AFInAppEventType().AFInAppEventType().execute((Runnable)new d(this, context, intent));
    }

    @Override
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        onDeepLinking = (onAttributionFailure + 59) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("registerConversionListener", new String[0]);
        this.AFKeystoreWrapper(appsFlyerConversionListener);
        int n8 = onAttributionFailure + 93;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            onDeepLinking = (onAttributionFailure + 113) % 128;
            AFLogger.afDebugLog("registerValidatorListener null listener");
            int n8 = onDeepLinking + 3;
            onAttributionFailure = n8 % 128;
            if (n8 % 2 == 0) {
                return;
            }
            throw null;
        }
        valueOf = appsFlyerInAppPurchaseValidatorListener;
    }

    @Override
    public final void sendAdImpression(Context context, Map<String, Object> map) {
        int n8 = this.AFInAppEventType(this.values(context));
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"ad_network", map);
        hashMap.put((Object)"adimpression_counter", (Object)n8);
        this.AFKeystoreWrapper(context, (Map<String, Object>)hashMap, new AFe1kSDK());
        onAttributionFailure = (onDeepLinking + 17) % 128;
    }

    @Override
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int n8 = this.AFInAppEventParameterName(this.values(context));
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"ad_network", map);
        hashMap.put((Object)"adrevenue_counter", (Object)n8);
        this.AFKeystoreWrapper(context, (Map<String, Object>)hashMap, new AFe1oSDK());
        n8 = onDeepLinking + 59;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override
    public final void sendInAppPurchaseData(Context object, Map<String, Object> object2, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        onDeepLinking = (onAttributionFailure + 59) % 128;
        this.AFKeystoreWrapper((Context)object);
        object = this.AFInAppEventType().afErrorLog();
        if (object.AFInAppEventParameterName((Map<String, Object>)object2, purchaseValidationCallback, "purchases")) {
            object2 = new AFd1qSDK((Map<String, Object>)object2, purchaseValidationCallback, object.values);
            object = object.valueOf;
            object.AFKeystoreWrapper.execute(new );
        }
        int n8 = onDeepLinking + 25;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override
    public final void sendPurchaseData(Context object, Map<String, Object> object2, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        onAttributionFailure = (onDeepLinking + 63) % 128;
        this.AFKeystoreWrapper((Context)object);
        object = this.AFInAppEventType().afErrorLog();
        if (object.AFInAppEventParameterName((Map<String, Object>)object2, purchaseValidationCallback, "subscriptions")) {
            object2 = new AFd1wSDK((Map<String, Object>)object2, purchaseValidationCallback, object.values);
            object = object.valueOf;
            object.AFKeystoreWrapper.execute(new );
        }
        onAttributionFailure = (onDeepLinking + 35) % 128;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void sendPushNotificationData(Activity activity) {
        block12 : {
            long l8;
            block14 : {
                long l9;
                Object object;
                block15 : {
                    StringBuilder stringBuilder;
                    block13 : {
                        int n8 = onAttributionFailure + 85;
                        onDeepLinking = n8 % 128;
                        if (n8 % 2 == 0) {
                            throw null;
                        }
                        if (activity != null && activity.getIntent() != null) {
                            object = this.AFInAppEventType().afErrorLogForExcManagerOnly();
                            String string2 = activity.getLocalClassName();
                            stringBuilder = new StringBuilder("activity_intent_");
                            stringBuilder.append(activity.getIntent().toString());
                            object.AFInAppEventParameterName("sendPushNotificationData", string2, stringBuilder.toString());
                        } else if (activity != null) {
                            onDeepLinking = (onAttributionFailure + 3) % 128;
                            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
                        } else {
                            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("sendPushNotificationData", new String[]{"activity_null"});
                        }
                        this.getLevel = object = AFa1eSDK.AFInAppEventParameterName(activity);
                        if (object == null) break block12;
                        l8 = System.currentTimeMillis();
                        if (this.AFLogger$LogLevel != null) break block13;
                        AFLogger.afInfoLog("pushes: initializing pushes history..");
                        this.AFLogger$LogLevel = new ConcurrentHashMap();
                        l9 = l8;
                        n8 = AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2);
                        if (this.AFLogger$LogLevel.size() != n8) break block14;
                        break block15;
                    }
                    try {
                        long l10 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                        stringBuilder = this.AFLogger$LogLevel.keySet().iterator();
                    }
                    finally {
                        long l11 = l8;
                    }
                }
                object = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                object.append(l9);
                object.append(")");
                AFLogger.afInfoLog(object.toString());
                this.AFLogger$LogLevel.remove((Object)l9);
            }
            this.AFLogger$LogLevel.put((Object)l8, (Object)this.getLevel);
            this.start((Context)activity);
        }
    }

    @Override
    public final void setAdditionalData(Map<String, Object> jSONObject) {
        int n8 = onAttributionFailure + 29;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            if (jSONObject != null) {
                this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAdditionalData", new String[]{jSONObject.toString()});
                jSONObject = new JSONObject(jSONObject);
                AppsFlyerProperties.getInstance().setCustomData(jSONObject.toString());
            }
            onDeepLinking = (onAttributionFailure + 99) % 128;
            return;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void setAndroidIdData(String string2) {
        int n8 = onAttributionFailure + 23;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            AFb1tSDK aFb1tSDK = this.AFInAppEventType().afErrorLogForExcManagerOnly();
            String[] arrstring = new String[]{};
            arrstring[0] = string2;
            aFb1tSDK.AFInAppEventParameterName("setAndroidIdData", arrstring);
        } else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAndroidIdData", new String[]{string2});
        }
        this.AFLogger = string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void setAppId(String string2) {
        int n8 = onAttributionFailure + 83;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            AFb1tSDK aFb1tSDK = this.AFInAppEventType().afErrorLogForExcManagerOnly();
            String[] arrstring = new String[]{};
            arrstring[1] = string2;
            aFb1tSDK.AFInAppEventParameterName("setAppId", arrstring);
        } else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAppId", new String[]{string2});
        }
        AFa1eSDK.AFInAppEventType("appid", string2);
        onAttributionFailure = (onDeepLinking + 53) % 128;
    }

    @Override
    public final void setAppInviteOneLink(String string2) {
        block4 : {
            block2 : {
                block3 : {
                    onAttributionFailure = (onDeepLinking + 53) % 128;
                    this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAppInviteOneLink", new String[]{string2});
                    AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf((Object)string2)));
                    if (string2 == null) break block2;
                    int n8 = onAttributionFailure + 91;
                    onDeepLinking = n8 % 128;
                    if (n8 % 2 != 0) break block3;
                    boolean bl = string2.equals((Object)AppsFlyerProperties.getInstance().getString("oneLinkSlug"));
                    n8 = 2 / 0;
                    if (bl) break block4;
                    break block2;
                }
                if (!(string2.equals((Object)AppsFlyerProperties.getInstance().getString("oneLinkSlug")) ^ true)) break block4;
            }
            AppsFlyerProperties.getInstance().remove("onelinkDomain");
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove("onelinkScheme");
            onDeepLinking = (onAttributionFailure + 121) % 128;
        }
        AFa1eSDK.AFInAppEventType("oneLinkSlug", string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void setCollectAndroidID(boolean bl) {
        int n8 = onAttributionFailure + 107;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectAndroidID", new String[]{String.valueOf((boolean)bl)});
        } else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectAndroidID", new String[]{String.valueOf((boolean)bl)});
        }
        AFa1eSDK.AFInAppEventType("collectAndroidId", Boolean.toString((boolean)bl));
        AFa1eSDK.AFInAppEventType("collectAndroidIdForceByUser", Boolean.toString((boolean)bl));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void setCollectIMEI(boolean bl) {
        int n8 = onAttributionFailure + 79;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            AFb1tSDK aFb1tSDK = this.AFInAppEventType().afErrorLogForExcManagerOnly();
            String[] arrstring = new String[]{};
            arrstring[0] = String.valueOf((boolean)bl);
            aFb1tSDK.AFInAppEventParameterName("setCollectIMEI", arrstring);
        } else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectIMEI", new String[]{String.valueOf((boolean)bl)});
        }
        AFa1eSDK.AFInAppEventType("collectIMEI", Boolean.toString((boolean)bl));
        AFa1eSDK.AFInAppEventType("collectIMEIForceByUser", Boolean.toString((boolean)bl));
        onAttributionFailure = (onDeepLinking + 59) % 128;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Deprecated
    @Override
    public final void setCollectOaid(boolean bl) {
        int n8 = onDeepLinking + 29;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 != 0) {
            AFb1tSDK aFb1tSDK = this.AFInAppEventType().afErrorLogForExcManagerOnly();
            String[] arrstring = new String[]{};
            arrstring[1] = String.valueOf((boolean)bl);
            aFb1tSDK.AFInAppEventParameterName("setCollectOaid", arrstring);
        } else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectOaid", new String[]{String.valueOf((boolean)bl)});
        }
        AFa1eSDK.AFInAppEventType("collectOAID", Boolean.toString((boolean)bl));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void setCurrencyCode(String string2) {
        int n8 = onAttributionFailure + 125;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            AFb1tSDK aFb1tSDK = this.AFInAppEventType().afErrorLogForExcManagerOnly();
            String[] arrstring = new String[]{};
            arrstring[1] = string2;
            aFb1tSDK.AFInAppEventParameterName("setCurrencyCode", arrstring);
        } else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCurrencyCode", new String[]{string2});
        }
        AppsFlyerProperties.getInstance().set("currencyCode", string2);
        onAttributionFailure = (onDeepLinking + 69) % 128;
    }

    @Override
    public final void setCustomerIdAndLogSession(String object, @NonNull Context context) {
        if (context != null) {
            onAttributionFailure = (onDeepLinking + 63) % 128;
            boolean bl = this.AFKeystoreWrapper();
            this.setCustomerUserId((String)object);
            if (bl) {
                Object object2 = new StringBuilder("CustomerUserId set: ");
                object2.append((String)object);
                object2.append(" - Initializing AppsFlyer Tacking");
                AFLogger.afInfoLog(object2.toString(), true);
                object2 = AppsFlyerProperties.getInstance().getReferrer(this.AFInAppEventType().values());
                this.AFInAppEventType(context, AFe1nSDK.AFKeystoreWrapper);
                object = this.AFInAppEventType().afWarnLog().AFInAppEventParameterName;
                object = object2;
                if (object2 == null) {
                    object = "";
                }
                if (context instanceof Activity) {
                    int n8 = onAttributionFailure + 29;
                    onDeepLinking = n8 % 128;
                    if (n8 % 2 == 0) {
                        ((Activity)context).getIntent();
                        n8 = 72 / 0;
                    } else {
                        ((Activity)context).getIntent();
                    }
                }
                this.AFKeystoreWrapper(context, null, null, (String)object, null);
                return;
            }
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf((Object)object)), true);
        }
    }

    @Override
    public final void setCustomerUserId(String string2) {
        onAttributionFailure = (onDeepLinking + 83) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCustomerUserId", new String[]{string2});
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf((Object)string2)));
        AFa1eSDK.AFInAppEventType("AppUserId", string2);
        AFa1eSDK.AFInAppEventType("waitForCustomerId", false);
        onAttributionFailure = (onDeepLinking + 119) % 128;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void setDebugLog(boolean var1_1) {
        block2 : {
            var2_2 = AFa1eSDK.onDeepLinking + 11;
            AFa1eSDK.onAttributionFailure = var2_2 % 128;
            if (var2_2 % 2 == 0) break block2;
            var2_2 = 83 / 0;
            if (!var1_1) ** GOTO lbl-1000
            ** GOTO lbl-1000
        }
        if (!var1_1) lbl-1000: // 2 sources:
        {
            var3_3 = AFLogger.LogLevel.NONE;
        } else lbl-1000: // 2 sources:
        {
            var3_3 = AFLogger.LogLevel.DEBUG;
        }
        this.setLogLevel(var3_3);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 103) % 128;
    }

    @Override
    public final void setDisableAdvertisingIdentifiers(boolean bl) {
        int n8 = onAttributionFailure + 15;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf((boolean)bl)));
            if (!bl) {
                onAttributionFailure = (onDeepLinking + 29) % 128;
                bl = true;
            } else {
                onAttributionFailure = (onDeepLinking + 35) % 128;
                bl = false;
            }
            AFa1cSDK.valueOf = bl;
            AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
            AppsFlyerProperties.getInstance().remove("advertiserId");
            return;
        }
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf((boolean)bl)));
        throw null;
    }

    @Override
    public final void setDisableNetworkData(boolean bl) {
        onDeepLinking = (onAttributionFailure + 15) % 128;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf((boolean)bl)));
        AFa1eSDK.AFInAppEventType("disableCollectNetworkData", bl);
        int n8 = onDeepLinking + 93;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 != 0) {
            n8 = 97 / 0;
        }
    }

    @Override
    public final void setExtension(String string2) {
        onAttributionFailure = (onDeepLinking + 81) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setExtension", new String[]{string2});
        AppsFlyerProperties.getInstance().set("sdkExtension", string2);
        int n8 = onAttributionFailure + 65;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override
    public final void setHost(String string2, @NonNull String string3) {
        if (!(AFb1uSDK.AFInAppEventType(string3) ^ true)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        onDeepLinking = (onAttributionFailure + 29) % 128;
        if (string2 != null) {
            string2 = string2.trim();
            onAttributionFailure = (onDeepLinking + 95) % 128;
        } else {
            string2 = "";
        }
        AFc1dSDK.valueOf(new AFc1fSDK(string2, string3.trim()));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void setImeiData(String string2) {
        int n8 = onDeepLinking + 27;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 != 0) {
            AFb1tSDK aFb1tSDK = this.AFInAppEventType().afErrorLogForExcManagerOnly();
            String[] arrstring = new String[]{};
            arrstring[1] = string2;
            aFb1tSDK.AFInAppEventParameterName("setImeiData", arrstring);
        } else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setImeiData", new String[]{string2});
        }
        this.AFInAppEventType().afWarnLog().values = string2;
    }

    @Override
    public final void setIsUpdate(boolean bl) {
        onDeepLinking = (onAttributionFailure + 119) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setIsUpdate", new String[]{String.valueOf((boolean)bl)});
        AppsFlyerProperties.getInstance().set("IS_UPDATE", bl);
        int n8 = onAttributionFailure + 43;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean bl;
        int n8 = logLevel.getLevel();
        int n9 = AFLogger.LogLevel.NONE.getLevel();
        boolean bl2 = bl = false;
        if (n8 > n9) {
            n8 = onDeepLinking + 85;
            onAttributionFailure = n8 % 128;
            bl2 = n8 % 2 != 0 ? bl : true;
        }
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("log", new String[]{String.valueOf((boolean)bl2)});
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        onAttributionFailure = (onDeepLinking + 95) % 128;
    }

    @Override
    public final void setMinTimeBetweenSessions(int n8) {
        int n9 = onAttributionFailure + 77;
        onDeepLinking = n9 % 128;
        if (n9 % 2 == 0) {
            this.AFVersionDeclaration = TimeUnit.SECONDS.toMillis((long)n8);
            n8 = 39 / 0;
            return;
        }
        this.AFVersionDeclaration = TimeUnit.SECONDS.toMillis((long)n8);
    }

    @Override
    public final void setOaidData(String string2) {
        onAttributionFailure = (onDeepLinking + 123) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setOaidData", new String[]{string2});
        AFa1cSDK.values = string2;
        int n8 = onAttributionFailure + 95;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            return;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final /* varargs */ void setOneLinkCustomDomain(String ... arrstring) {
        Object object;
        int n8 = onAttributionFailure + 77;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            object = new Object[]{};
            object[1] = Arrays.toString((Object[])arrstring);
            object = String.format((String)"setOneLinkCustomDomain %s", (Object[])object);
        } else {
            object = String.format((String)"setOneLinkCustomDomain %s", (Object[])new Object[]{Arrays.toString((Object[])arrstring)});
        }
        AFLogger.afDebugLog((String)object);
        this.AFInAppEventType().AppsFlyer2dXConversionCallback().afDebugLog = arrstring;
    }

    @Override
    public final void setOutOfStore(String string2) {
        int n8;
        block5 : {
            block6 : {
                block4 : {
                    n8 = onDeepLinking + 27;
                    onAttributionFailure = n8 % 128;
                    if (n8 % 2 == 0) break block4;
                    n8 = 65 / 0;
                    if (string2 == null) break block5;
                    break block6;
                }
                if (string2 == null) break block5;
            }
            string2 = string2.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set("api_store_value", string2);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf((Object)string2)), true);
            return;
        }
        AFLogger.AFKeystoreWrapper("Cannot set setOutOfStore with null");
        n8 = onDeepLinking + 91;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override
    public final void setPartnerData(@NonNull String string2, Map<String, Object> hashMap) {
        block5 : {
            block8 : {
                int n8;
                block10 : {
                    block9 : {
                        boolean bl;
                        block7 : {
                            block6 : {
                                if (this.onResponseNative == null) {
                                    this.onResponseNative = new AFb1lSDK();
                                }
                                AFb1lSDK aFb1lSDK = this.onResponseNative;
                                if (string2 == null) break block5;
                                n8 = onDeepLinking + 47;
                                onAttributionFailure = n8 % 128;
                                if (n8 % 2 == 0) break block6;
                                bl = string2.isEmpty();
                                n8 = 92 / 0;
                                if (!bl) break block7;
                                break block5;
                            }
                            if (!(string2.isEmpty() ^ true)) break block5;
                        }
                        if (hashMap == null) break block8;
                        n8 = onDeepLinking + 27;
                        onAttributionFailure = n8 % 128;
                        if (n8 % 2 == 0) break block9;
                        bl = hashMap.isEmpty();
                        n8 = 40 / 0;
                        if (!bl) break block10;
                        break block8;
                    }
                    if (hashMap.isEmpty()) break block8;
                }
                StringBuilder stringBuilder = new StringBuilder("Setting partner data for ");
                stringBuilder.append(string2);
                stringBuilder.append(": ");
                stringBuilder.append(hashMap);
                AFLogger.afDebugLog(stringBuilder.toString());
                n8 = new JSONObject(hashMap).toString().length();
                if (n8 > 1000) {
                    AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                    hashMap = new HashMap();
                    hashMap.put((Object)"error", (Object)"limit exceeded: ".concat(String.valueOf((int)n8)));
                    aFb1lSDK.AFInAppEventParameterName.put((Object)string2, (Object)hashMap);
                    return;
                }
                aFb1lSDK.values.put((Object)string2, hashMap);
                aFb1lSDK.AFInAppEventParameterName.remove((Object)string2);
                onDeepLinking = (onAttributionFailure + 77) % 128;
                return;
            }
            string2 = aFb1lSDK.values.remove((Object)string2) == null ? "Partner data is missing or `null`" : "Cleared partner data for ".concat(string2);
            AFLogger.afWarnLog(string2);
            return;
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
    }

    @Override
    public final void setPhoneNumber(String string2) {
        int n8 = onAttributionFailure + 35;
        onDeepLinking = n8 % 128;
        this.onAttributionFailureNative = AFc1nSDK.AFInAppEventType(string2);
        if (n8 % 2 != 0) {
            onAttributionFailure = (onDeepLinking + 77) % 128;
            return;
        }
        throw null;
    }

    @Override
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        onDeepLinking = (onAttributionFailure + 93) % 128;
        Objects.requireNonNull((Object)pluginInfo);
        this.AFInAppEventType().onInstallConversionDataLoadedNative().AFInAppEventParameterName(pluginInfo);
        onDeepLinking = (onAttributionFailure + 25) % 128;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final void setPreinstallAttribution(String string2, String string3, String string4) {
        int n8;
        JSONObject jSONObject;
        block9 : {
            JSONException jSONException222;
            block10 : {
                block11 : {
                    AFLogger.afDebugLog("setPreinstallAttribution API called");
                    jSONObject = new JSONObject();
                    if (string2 != null) {
                        onDeepLinking = (onAttributionFailure + 93) % 128;
                        jSONObject.put("pid", (Object)string2);
                        onDeepLinking = (onAttributionFailure + 17) % 128;
                    }
                    if (string3 != null) {
                        jSONObject.put("c", (Object)string3);
                    }
                    if (string4 == null) break block9;
                    n8 = onDeepLinking + 41;
                    onAttributionFailure = n8 % 128;
                    if (n8 % 2 == 0) {
                        jSONObject.put("af_siteid", (Object)string4);
                        break block9;
                    }
                    break block11;
                    catch (JSONException jSONException222) {
                        break block10;
                    }
                }
                jSONObject.put("af_siteid", (Object)string4);
                throw null;
            }
            AFLogger.afErrorLog(jSONException222.getMessage(), (Throwable)jSONException222);
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            return;
        }
        n8 = onDeepLinking + 117;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            AFa1eSDK.AFInAppEventType("preInstallName", jSONObject.toString());
            return;
        }
        AFa1eSDK.AFInAppEventType("preInstallName", jSONObject.toString());
        throw null;
    }

    @Override
    public final /* varargs */ void setResolveDeepLinkURLs(String ... arrstring) {
        onDeepLinking = (onAttributionFailure + 87) % 128;
        AFLogger.afDebugLog(String.format((String)"setResolveDeepLinkURLs %s", (Object[])new Object[]{Arrays.toString((Object[])arrstring)}));
        AFb1sSDK aFb1sSDK = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
        aFb1sSDK.AFLogger.clear();
        aFb1sSDK.AFLogger.addAll((Collection)Arrays.asList((Object[])arrstring));
        onAttributionFailure = (onDeepLinking + 65) % 128;
    }

    @Deprecated
    @Override
    public final /* varargs */ void setSharingFilter(@NonNull String ... arrstring) {
        onAttributionFailure = (onDeepLinking + 69) % 128;
        this.setSharingFilterForPartners(arrstring);
        onAttributionFailure = (onDeepLinking + 63) % 128;
    }

    @Deprecated
    @Override
    public final void setSharingFilterForAllPartners() {
        int n8 = onDeepLinking + 47;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 != 0) {
            String[] arrstring = new String[]{};
            arrstring[1] = "all";
            this.setSharingFilterForPartners(arrstring);
            return;
        }
        this.setSharingFilterForPartners("all");
    }

    @Override
    public final /* varargs */ void setSharingFilterForPartners(String ... arrstring) {
        this.afInfoLog = new AFa1cSDK(arrstring);
        onDeepLinking = (onAttributionFailure + 95) % 128;
    }

    @Override
    public final /* varargs */ void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String ... arrstring) {
        Object object = new ArrayList(arrstring.length + 1);
        object.add((Object)emailsCryptType.toString());
        object.addAll((Collection)Arrays.asList((Object[])arrstring));
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setUserEmails", (String[])object.toArray((Object[])new String[arrstring.length + 1]));
        AppsFlyerProperties.getInstance().set("userEmailsCryptType", emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int n8 = arrstring.length;
        onDeepLinking = (onAttributionFailure + 93) % 128;
        object = null;
        for (int i8 = 0; i8 < n8; ++i8) {
            onAttributionFailure = (onDeepLinking + 33) % 128;
            object = arrstring[i8];
            if (.valueOf[emailsCryptType.ordinal()] != 2) {
                arrayList.add((Object)AFc1nSDK.AFInAppEventType((String)object));
                object = "sha256_el_arr";
                continue;
            }
            arrayList.add(object);
            object = "plain_el_arr";
        }
        hashMap.put(object, (Object)arrayList);
        emailsCryptType = new JSONObject((Map)hashMap);
        AppsFlyerProperties.getInstance().setUserEmails(emailsCryptType.toString());
    }

    @Override
    public final /* varargs */ void setUserEmails(String ... arrstring) {
        int n8 = onAttributionFailure + 43;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setUserEmails", arrstring);
            this.setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, arrstring);
            n8 = 7 / 0;
            return;
        }
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setUserEmails", arrstring);
        this.setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, arrstring);
    }

    @Override
    public final void start(@NonNull Context context) {
        onAttributionFailure = (onDeepLinking + 61) % 128;
        this.start(context, null);
        int n8 = onAttributionFailure + 49;
        onDeepLinking = n8 % 128;
        if (n8 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override
    public final void start(@NonNull Context context, String string2) {
        onDeepLinking = (onAttributionFailure + 39) % 128;
        this.start(context, string2, null);
        onAttributionFailure = (onDeepLinking + 37) % 128;
    }

    @Override
    public final void start(@NonNull Context context, String string2, AppsFlyerRequestListener appsFlyerRequestListener) {
        block11 : {
            int n8;
            block14 : {
                AFe1mSDK aFe1mSDK;
                block13 : {
                    block12 : {
                        n8 = onDeepLinking + 57;
                        onAttributionFailure = n8 % 128;
                        if (n8 % 2 != 0) break block11;
                        if (this.AFInAppEventType().onResponseNative().AFInAppEventType()) {
                            return;
                        }
                        if (!this.onAppOpenAttributionNative) {
                            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
                            if (string2 == null) {
                                if (appsFlyerRequestListener != null) {
                                    n8 = onAttributionFailure + 75;
                                    onDeepLinking = n8 % 128;
                                    if (n8 % 2 == 0) {
                                        appsFlyerRequestListener.onError(7, "No dev key");
                                        return;
                                    }
                                    appsFlyerRequestListener.onError(41, "No dev key");
                                }
                                return;
                            }
                        }
                        this.AFKeystoreWrapper(context);
                        aFe1mSDK = this.AFInAppEventType().afDebugLog();
                        aFe1mSDK.AFKeystoreWrapper(AFa1rSDK.AFInAppEventParameterName(context));
                        this.init = (Application)context.getApplicationContext();
                        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("start", new String[]{string2});
                        String string3 = values;
                        AFLogger.afInfoLog(String.format((String)"Starting AppsFlyer: (v%s.%s)", (Object[])new Object[]{"6.12.2", string3}));
                        StringBuilder stringBuilder = new StringBuilder("Build Number: ");
                        stringBuilder.append(string3);
                        AFLogger.afInfoLog(stringBuilder.toString());
                        AppsFlyerProperties.getInstance().loadProperties(this.AFInAppEventType().values());
                        if (TextUtils.isEmpty((CharSequence)string2)) break block12;
                        onDeepLinking = (onAttributionFailure + 17) % 128;
                        this.AFInAppEventType().afWarnLog().AFInAppEventParameterName = string2;
                        AFa1aSDK.AFInAppEventType(string2);
                        break block13;
                    }
                    if (TextUtils.isEmpty((CharSequence)this.AFInAppEventType().afWarnLog().AFInAppEventParameterName)) break block14;
                }
                this.AFInAppEventType().afRDLog().AFInAppEventParameterName((AFd1bSDK)null);
                this.afWarnLog();
                AFa1eSDK.afInfoLog(this.init.getBaseContext());
                if (this.onDeepLinkingNative) {
                    this.AFInAppEventType(this.init.getApplicationContext());
                }
                this.onConversionDataFail.onResponseNative().AFKeystoreWrapper(context, new AFb1iSDK.AFa1wSDK(this, aFe1mSDK, appsFlyerRequestListener){
                    private /* synthetic */ AFa1eSDK AFInAppEventParameterName;
                    private /* synthetic */ AppsFlyerRequestListener valueOf;
                    private /* synthetic */ AFe1mSDK values;
                    {
                        this.AFInAppEventParameterName = aFa1eSDK;
                        this.values = aFe1mSDK;
                        this.valueOf = appsFlyerRequestListener;
                    }

                    @Override
                    public final void AFInAppEventType(@NonNull Context context) {
                        AFLogger.afInfoLog("onBecameBackground");
                        Object object = this.values;
                        long l8 = System.currentTimeMillis();
                        long l9 = object.afErrorLog;
                        if (l9 != 0L) {
                            l8 = l9 = l8 - l9;
                            if (l9 > 0L) {
                                l8 = l9;
                                if (l9 < 1000L) {
                                    l8 = 1000L;
                                }
                            }
                            object.afWarnLog = l8 = TimeUnit.MILLISECONDS.toSeconds(l8);
                            object.valueOf.AFInAppEventParameterName("prev_session_dur", l8);
                        } else {
                            AFLogger.afInfoLog("Metrics: fg ts is missing");
                        }
                        AFLogger.afInfoLog("callStatsBackground background call");
                        this.AFInAppEventParameterName.AFKeystoreWrapper(new WeakReference((Object)context));
                        this.AFInAppEventParameterName.AFInAppEventType().onConversionDataSuccess().valueOf();
                        object = this.AFInAppEventParameterName.AFInAppEventType().afErrorLogForExcManagerOnly();
                        if (object.afInfoLog()) {
                            object.values();
                            if (context != null && !AppsFlyerLib.getInstance().isStopped()) {
                                object.valueOf(context.getPackageName(), context.getPackageManager(), this.AFInAppEventParameterName.AFInAppEventType());
                            }
                            object.valueOf();
                        } else {
                            AFLogger.afDebugLog("RD status is OFF");
                        }
                        this.AFInAppEventParameterName.AFInAppEventType().getLevel().AFInAppEventType();
                    }

                    @Override
                    public final void values(@NonNull Activity activity) {
                        this.values.values();
                        this.AFInAppEventParameterName.AFInAppEventType().afRDLog().AFInAppEventParameterName((AFd1bSDK)null);
                        AFa1eSDK.AFInAppEventParameterName(this.AFInAppEventParameterName);
                        Object object = this.AFInAppEventParameterName;
                        int n8 = object.valueOf(object.values((Context)activity), false);
                        AFLogger.afInfoLog("onBecameForeground");
                        if (n8 < 2) {
                            this.AFInAppEventParameterName.AFInAppEventType().getLevel().AFInAppEventParameterName();
                        }
                        object = new AFe1hSDK();
                        if (activity != null) {
                            this.AFInAppEventParameterName.AFInAppEventType().AppsFlyer2dXConversionCallback().valueOf(object.valueOf(), activity.getIntent(), (Context)activity.getApplication());
                        }
                        AFa1eSDK aFa1eSDK = this.AFInAppEventParameterName;
                        object.AFInAppEventParameterName = this.valueOf;
                        aFa1eSDK.values((AFa1qSDK)object, activity);
                    }
                });
                return;
            }
            n8 = onAttributionFailure + 111;
            onDeepLinking = n8 % 128;
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (n8 % 2 != 0) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                onDeepLinking = (onAttributionFailure + 31) % 128;
                return;
            }
            throw null;
        }
        this.AFInAppEventType().onResponseNative().AFInAppEventType();
        throw null;
    }

    @Override
    public final void stop(boolean bl, Context object) {
        onDeepLinking = (onAttributionFailure + 121) % 128;
        this.AFKeystoreWrapper((Context)object);
        object = this.AFInAppEventType();
        object.afWarnLog().AFInAppEventType = bl;
        object.AFInAppEventType().submit((Runnable)new a((AFc1xSDK)object));
        if (bl) {
            onAttributionFailure = (onDeepLinking + 69) % 128;
            object.values().values("is_stop_tracking_used", true);
        }
        int n8 = onAttributionFailure + 37;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            n8 = 93 / 0;
        }
    }

    @Override
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        int n8 = onDeepLinking + 99;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 != 0) {
            this.subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            n8 = 39 / 0;
            return;
        }
        this.subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
    }

    @Override
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long l8) {
        onAttributionFailure = (onDeepLinking + 83) % 128;
        this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventParameterName = deepLinkListener;
        this.AFInAppEventType().AppsFlyer2dXConversionCallback().afInfoLog = l8;
        int n8 = onAttributionFailure + 45;
        onDeepLinking = n8 % 128;
        if (n8 % 2 == 0) {
            n8 = 87 / 0;
        }
    }

    @Override
    public final void unregisterConversionListener() {
        onDeepLinking = (onAttributionFailure + 55) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        this.AFInAppEventParameterName = null;
        onAttributionFailure = (onDeepLinking + 123) % 128;
    }

    @Override
    public final void updateServerUninstallToken(Context object, String string2) {
        this.AFKeystoreWrapper((Context)object);
        object = new AFe1ySDK((Context)object);
        if (string2 != null && !string2.trim().isEmpty()) {
            AFLogger.afInfoLog("[register] Firebase Refreshed Token = ".concat(string2));
            AFb1uSDK aFb1uSDK = object.AFInAppEventParameterName();
            if (aFb1uSDK == null || !string2.equals((Object)aFb1uSDK.valueOf)) {
                long l8 = System.currentTimeMillis();
                boolean bl = aFb1uSDK == null || l8 - aFb1uSDK.AFKeystoreWrapper > TimeUnit.SECONDS.toMillis(2L);
                aFb1uSDK = new AFb1uSDK(string2, l8, bl ^ true);
                object.values.AFInAppEventParameterName("afUninstallToken", aFb1uSDK.valueOf);
                object.values.AFInAppEventParameterName("afUninstallToken_received_time", aFb1uSDK.AFKeystoreWrapper);
                object.values.values("afUninstallToken_queued", aFb1uSDK.AFKeystoreWrapper());
                if (bl) {
                    AFe1ySDK.valueOf(string2);
                }
            }
            return;
        }
        AFLogger.afWarnLog("[register] Firebase Token is either empty or null and was not registered.");
    }

    @Override
    public final void validateAndLogInAppPurchase(Context object, String string2, String string3, String string4, String string5, String string6, Map<String, String> map) {
        Object object2 = this.AFInAppEventType().afErrorLogForExcManagerOnly();
        String string7 = map == null ? "" : map.toString();
        object2.AFInAppEventParameterName("validateAndTrackInAppPurchase", string2, string3, string4, string5, string6, string7);
        if (!this.isStopped()) {
            string7 = new StringBuilder("Validate in app called with parameters: ");
            string7.append(string4);
            string7.append(" ");
            string7.append(string5);
            string7.append(" ");
            string7.append(string6);
            AFLogger.afInfoLog(string7.toString());
        }
        if (string2 != null && string5 != null && string3 != null && string6 != null && string4 != null) {
            string7 = object.getApplicationContext();
            object2 = this.AFInAppEventType().afWarnLog().AFInAppEventParameterName;
            object = object instanceof Activity ? ((Activity)object).getIntent() : null;
            new Thread((Runnable)new AFa1gSDK((Context)string7, (String)object2, string2, string3, string4, string5, string6, map, (Intent)object)).start();
            return;
        }
        object = valueOf;
        if (object != null) {
            object.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    public final int valueOf(AFb1dSDK aFb1dSDK, boolean bl) {
        onAttributionFailure = (onDeepLinking + 9) % 128;
        int n8 = this.AFKeystoreWrapper(aFb1dSDK, "appsFlyerCount", bl);
        onAttributionFailure = (onDeepLinking + 13) % 128;
        return n8;
    }

    public final void valueOf(Context object, Map<String, Object> map, Uri uri) {
        Object object2;
        Object object3;
        this.AFKeystoreWrapper((Context)object);
        if (map.containsKey((Object)"af_deeplink") ^ true) {
            int n8 = onAttributionFailure + 29;
            onDeepLinking = n8 % 128;
            if (n8 % 2 != 0) {
                object3 = AFa1eSDK.AFInAppEventType(uri.toString());
                AFb1sSDK aFb1sSDK = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
                String string2 = aFb1sSDK.AFKeystoreWrapper;
                object2 = object3;
                if (string2 != null) {
                    object2 = object3;
                    if (aFb1sSDK.values != null) {
                        object2 = object3;
                        if (object3.contains((CharSequence)string2)) {
                            object2 = Uri.parse((String)object3).buildUpon();
                            object3 = Uri.EMPTY.buildUpon();
                            aFb1sSDK = aFb1sSDK.values.entrySet().iterator();
                            n8 = onDeepLinking + 115;
                            do {
                                onAttributionFailure = n8 % 128;
                                if (!aFb1sSDK.hasNext()) break;
                                onAttributionFailure = (onDeepLinking + 23) % 128;
                                string2 = (Map.Entry)aFb1sSDK.next();
                                object2.appendQueryParameter((String)string2.getKey(), (String)string2.getValue());
                                object3.appendQueryParameter((String)string2.getKey(), (String)string2.getValue());
                                n8 = onDeepLinking + 93;
                            } while (true);
                            object2 = object2.build().toString();
                            map.put((Object)"appended_query_params", (Object)object3.build().getEncodedQuery());
                        }
                    }
                }
                map.put((Object)"af_deeplink", object2);
            } else {
                AFa1eSDK.AFInAppEventType(uri.toString());
                object = this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper;
                throw null;
            }
        }
        object3 = new HashMap();
        object3.put((Object)"link", (Object)uri.toString());
        object2 = new AFd1nSDK(this.AFInAppEventType(), UUID.randomUUID(), uri);
        if (object2.afWarnLog()) {
            map.put((Object)"isBrandedDomain", (Object)Boolean.TRUE);
        }
        AFa1fSDK.AFInAppEventType((Context)object, object3, uri);
        if (object2.AFVersionDeclaration()) {
            object2.afInfoLog = this.AFKeystoreWrapper((Map<String, String>)object3);
            object = this.AFInAppEventType().AFVersionDeclaration();
            object.AFKeystoreWrapper.execute(new );
            return;
        }
        this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType((Map<String, String>)object3);
    }

    public final AFb1dSDK values(Context object) {
        onAttributionFailure = (onDeepLinking + 19) % 128;
        this.AFKeystoreWrapper((Context)object);
        object = this.AFInAppEventType().values();
        onAttributionFailure = (onDeepLinking + 33) % 128;
        return object;
    }

    public final void values(@NonNull AFa1qSDK object, Activity object2) {
        this.AFInAppEventType((AFa1qSDK)object, (Activity)object2);
        if (this.AFInAppEventType().afWarnLog().AFInAppEventParameterName == null) {
            int n8 = onDeepLinking + 65;
            onAttributionFailure = n8 % 128;
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            object = object.AFInAppEventParameterName;
            if (n8 % 2 == 0) {
                if (object != null) {
                    object.onError(41, "No dev key");
                }
                return;
            }
            throw null;
        }
        object2 = AppsFlyerProperties.getInstance().getReferrer(this.AFInAppEventType().values());
        if (object2 == null) {
            object2 = "";
        } else {
            onAttributionFailure = (onDeepLinking + 99) % 128;
        }
        object.afErrorLog = object2;
        this.AFInAppEventType((AFa1qSDK)object);
        onAttributionFailure = (onDeepLinking + 95) % 128;
    }

    @Override
    public final void waitForCustomerUserId(boolean bl) {
        onAttributionFailure = (onDeepLinking + 77) % 128;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf((boolean)bl)), true);
        AFa1eSDK.AFInAppEventType("waitForCustomerId", bl);
        int n8 = onDeepLinking + 45;
        onAttributionFailure = n8 % 128;
        if (n8 % 2 == 0) {
            return;
        }
        throw null;
    }

    public final class AFa1vSDK
    implements Runnable {
        private final AFa1qSDK AFInAppEventParameterName;
        private /* synthetic */ AFa1eSDK AFInAppEventType;

        private AFa1vSDK(AFa1eSDK aFa1eSDK, AFa1qSDK aFa1qSDK) {
            this.AFInAppEventType = aFa1eSDK;
            this.AFInAppEventParameterName = aFa1qSDK;
        }

        public /* synthetic */ AFa1vSDK(AFa1eSDK aFa1eSDK, AFa1qSDK aFa1qSDK, byte by) {
            this(aFa1eSDK, aFa1qSDK);
        }

        public final void run() {
            AFa1eSDK.valueOf(this.AFInAppEventType, this.AFInAppEventParameterName);
        }
    }

    public final class AFa1wSDK
    implements AFc1cSDK {
        private /* synthetic */ AFa1eSDK valueOf;

        private AFa1wSDK(AFa1eSDK aFa1eSDK) {
            this.valueOf = aFa1eSDK;
        }

        public /* synthetic */ AFa1wSDK(AFa1eSDK aFa1eSDK, byte by) {
            this(aFa1eSDK);
        }

        private boolean values() {
            if (this.valueOf.AFInAppEventParameterName != null) {
                return true;
            }
            return false;
        }

        @Override
        public final void AFInAppEventParameterName(AFd1zSDK<?> aFd1zSDK) {
        }

        @Override
        public final void AFInAppEventType(AFd1zSDK<?> object, AFd1ySDK object2) {
            if (object instanceof AFd1hSDK) {
                AFd1hSDK aFd1hSDK = (AFd1hSDK)object;
                boolean bl = object instanceof AFd1fSDK;
                if (bl && this.values()) {
                    AFd1zSDK aFd1zSDK = (AFd1fSDK)object;
                    if (aFd1zSDK.valueOf == AFd1ySDK.AFInAppEventParameterName || aFd1zSDK.AFInAppEventType == 1) {
                        aFd1zSDK = new AFe1pSDK((AFd1fSDK)aFd1zSDK, this.valueOf.AFInAppEventType().values());
                        AFc1bSDK aFc1bSDK = this.valueOf.AFInAppEventType().AFVersionDeclaration();
                        aFc1bSDK.AFKeystoreWrapper.execute(new );
                    }
                }
                if (object2 == AFd1ySDK.AFInAppEventParameterName) {
                    object2 = this.valueOf;
                    object2.values((Context)AFa1eSDK.AFInAppEventType((AFa1eSDK)object2)).AFInAppEventParameterName("sentSuccessfully", "true");
                    if (!(object instanceof AFd1eSDK) && (object = new AFe1ySDK((Context)AFa1eSDK.AFInAppEventType(this.valueOf)).AFInAppEventParameterName()) != null && object.AFKeystoreWrapper()) {
                        object = object.valueOf;
                        AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf((Object)object)));
                        AFe1ySDK.valueOf((String)object);
                    }
                    if ((object = aFd1hSDK.afErrorLog) != null && (object = AFb1vSDK.AFKeystoreWrapper((String)object.getBody())) != null) {
                        AFa1eSDK.valueOf(this.valueOf, object.optBoolean("send_background", false));
                    }
                    if (bl) {
                        AFa1eSDK.AFKeystoreWrapper(this.valueOf, System.currentTimeMillis());
                    }
                }
                return;
            }
            if (object instanceof AFe1pSDK && object2 != AFd1ySDK.AFInAppEventParameterName) {
                object = new AFe1rSDK(this.valueOf.AFInAppEventType());
                object2 = this.valueOf.AFInAppEventType().AFVersionDeclaration();
                object2.AFKeystoreWrapper.execute(new );
            }
        }

        @Override
        public final void values(AFd1zSDK<?> aFd1hSDK) {
            if (aFd1hSDK instanceof AFd1fSDK) {
                aFd1hSDK = aFd1hSDK;
                this.valueOf.AFInAppEventType().afDebugLog().AFKeystoreWrapper(aFd1hSDK.afInfoLog.AFLogger);
            }
        }
    }

    public final class AFa1ySDK
    implements Runnable {
        private /* synthetic */ AFa1eSDK valueOf;
        private final AFa1qSDK values;

        private AFa1ySDK(AFa1eSDK aFa1eSDK, AFa1qSDK aFa1qSDK) {
            this.valueOf = aFa1eSDK;
            this.values = aFa1qSDK;
        }

        public /* synthetic */ AFa1ySDK(AFa1eSDK aFa1eSDK, AFa1qSDK aFa1qSDK, byte by) {
            this(aFa1eSDK, aFa1qSDK);
        }

        public final void run() {
            AFd1hSDK aFd1hSDK2;
            AFd1hSDK aFd1hSDK2;
            if (this.values.AFInAppEventParameterName()) {
                aFd1hSDK2 = new AFd1fSDK(this.values, this.valueOf.AFInAppEventType());
                aFd1hSDK2.AFVersionDeclaration = AFa1eSDK.values(this.valueOf);
            } else {
                aFd1hSDK2 = new AFd1hSDK(this.values, this.valueOf.AFInAppEventType());
            }
            AFc1bSDK aFc1bSDK = this.valueOf.AFInAppEventType().AFVersionDeclaration();
            aFc1bSDK.AFKeystoreWrapper.execute(new );
        }
    }

}

