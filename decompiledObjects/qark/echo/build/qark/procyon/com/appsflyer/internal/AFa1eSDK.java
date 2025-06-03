// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.content.ContextWrapper;
import android.os.BaseBundle;
import android.net.Uri$Builder;
import java.util.UUID;
import com.appsflyer.deeplink.DeepLinkListener;
import java.util.Objects;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.concurrent.ConcurrentHashMap;
import com.appsflyer.PurchaseHandler;
import java.net.URI;
import java.util.Collections;
import android.view.MotionEvent;
import java.util.List;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import android.net.Uri;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.Intrinsics;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import java.util.Locale;
import java.security.KeyStore;
import java.security.KeyStoreException;
import com.appsflyer.AFKeystoreWrapper;
import android.os.Build$VERSION;
import org.json.JSONException;
import org.json.JSONObject;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.reflect.InvocationTargetException;
import android.text.TextUtils;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;
import L1.a;
import x1.B;
import java.util.HashMap;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import android.content.pm.PackageManager$NameNotFoundException;
import x2.j;
import android.content.Context;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import com.appsflyer.AppsFlyerProperties;
import android.os.Bundle;
import android.content.Intent;
import com.appsflyer.AFLogger;
import android.app.Activity;
import com.appsflyer.AFVersionDeclaration;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import android.app.Application;
import java.util.Map;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;

public final class AFa1eSDK extends AppsFlyerLib
{
    public static final String AFInAppEventType;
    public static final String AFKeystoreWrapper;
    private static String afErrorLog;
    private static AFa1eSDK afRDLog;
    private static int onAttributionFailure = 0;
    private static int onDeepLinking = 1;
    private static int onResponse;
    static AppsFlyerInAppPurchaseValidatorListener valueOf;
    static final String values;
    public volatile AppsFlyerConversionListener AFInAppEventParameterName;
    String AFLogger;
    private Map<Long, String> AFLogger$LogLevel;
    private long AFVersionDeclaration;
    private boolean AppsFlyer2dXConversionCallback;
    private long afDebugLog;
    private boolean afErrorLogForExcManagerOnly;
    public AFa1cSDK afInfoLog;
    private long afWarnLog;
    private String getLevel;
    private Application init;
    private final Executor onAppOpenAttribution;
    private boolean onAppOpenAttributionNative;
    private String onAttributionFailureNative;
    @NonNull
    private final AFc1ySDK onConversionDataFail;
    private SharedPreferences onConversionDataSuccess;
    private boolean onDeepLinkingNative;
    private final AFb1xSDK onInstallConversionDataLoadedNative;
    private boolean onInstallConversionFailureNative;
    private Map<String, Object> onResponseErrorNative;
    private AFb1lSDK onResponseNative;
    
    static {
        values();
        values = "262";
        AFKeystoreWrapper = "6.12";
        AFa1eSDK.afErrorLog = "https://%sstats.%s/stats";
        final StringBuilder sb = new StringBuilder();
        sb.append("6.12");
        sb.append("/androidevent?buildnumber=6.12.2&app_id=");
        AFInAppEventType = sb.toString();
        AFa1eSDK.valueOf = null;
        AFa1eSDK.afRDLog = new AFa1eSDK();
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 93) % 128;
    }
    
    public AFa1eSDK() {
        this.AFInAppEventParameterName = null;
        this.afDebugLog = -1L;
        this.afWarnLog = -1L;
        this.AFVersionDeclaration = TimeUnit.SECONDS.toMillis(5L);
        this.afErrorLogForExcManagerOnly = false;
        this.onInstallConversionDataLoadedNative = new AFb1xSDK();
        this.AppsFlyer2dXConversionCallback = false;
        this.onDeepLinkingNative = false;
        this.onAppOpenAttribution = Executors.newSingleThreadExecutor();
        com.appsflyer.AFVersionDeclaration.init();
        this.onConversionDataFail = new AFc1ySDK();
        this.AFInAppEventType().AFVersionDeclaration().values.add(new AFa1wSDK((byte)0));
    }
    
    private int AFInAppEventParameterName(final AFb1dSDK aFb1dSDK) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 119) % 128;
        final int afKeystoreWrapper = this.AFKeystoreWrapper(aFb1dSDK, "appsFlyerAdRevenueCount", true);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 59) % 128;
        return afKeystoreWrapper;
    }
    
    public static String AFInAppEventParameterName() {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 3) % 128;
        final String values = values("AppUserId");
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 99) % 128;
        return values;
    }
    
    private static String AFInAppEventParameterName(final Activity activity) {
        final String s = null;
        String string;
        final String s2 = string = null;
        if (activity == null) {
            return string;
        }
        final Intent intent = activity.getIntent();
        string = s2;
        if (intent == null) {
            return string;
        }
        final int n = AFa1eSDK.onAttributionFailure + 43;
        AFa1eSDK.onDeepLinking = n % 128;
        while (true) {
            Label_0076: {
                if (n % 2 != 0) {
                    break Label_0076;
                }
                string = s;
                try {
                    final Bundle extras = intent.getExtras();
                    string = s;
                    string = s2;
                    // iftrue(Label_0177:, extras2 == null)
                    while (true) {
                        while (true) {
                            if (extras != null) {
                                final Bundle bundle = extras;
                                string = s;
                                final String obj = string = ((BaseBundle)bundle).getString("af");
                                if (obj != null) {
                                    string = obj;
                                    AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf(obj)));
                                    string = obj;
                                    bundle.remove("af");
                                    string = obj;
                                    activity.setIntent(intent.putExtras(bundle));
                                    AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 41) % 128;
                                    return obj;
                                }
                            }
                            Label_0177: {
                                return string;
                            }
                            final Bundle extras2;
                            final Bundle bundle = extras2;
                            continue;
                        }
                        string = s;
                        final Bundle extras2 = intent.getExtras();
                        string = s2;
                        continue;
                    }
                    final Throwable t;
                    AFLogger.afErrorLog(t.getMessage(), t);
                    return string;
                }
                finally {}
            }
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public static /* synthetic */ void AFInAppEventParameterName(final AFa1eSDK aFa1eSDK) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 75) % 128;
        aFa1eSDK.afWarnLog();
        final int n = AFa1eSDK.onDeepLinking + 21;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {}
    }
    
    private void AFInAppEventParameterName(final Map<String, Object> map) {
        while (true) {
            Label_0164: {
                if (AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false)) {
                    break Label_0164;
                }
                AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 81) % 128;
                if (AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)) {
                    break Label_0164;
                }
                if (map.get("advertiserId") == null) {
                    return;
                }
                try {
                    if (AFb1uSDK.values(this.AFLogger) && map.remove("android_id") != null) {
                        final int n = AFa1eSDK.onAttributionFailure + 89;
                        AFa1eSDK.onDeepLinking = n % 128;
                        if (n % 2 != 0) {
                            com.appsflyer.AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }
                        else {
                            com.appsflyer.AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                            try {
                                throw null;
                            }
                            finally {}
                        }
                    }
                    if (AFb1uSDK.values(this.AFInAppEventType().afWarnLog().values) && map.remove("imei") != null) {
                        com.appsflyer.AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                    }
                    return;
                    final Exception ex;
                    com.appsflyer.AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", ex);
                    return;
                    AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 9) % 128;
                    return;
                }
                catch (Exception ex2) {}
            }
            final Exception ex2;
            final Exception ex = ex2;
            continue;
        }
    }
    
    private static void AFInAppEventParameterName(@NonNull final ScheduledExecutorService scheduledExecutorService, final Runnable runnable, final long n, final TimeUnit timeUnit) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 111) % 128;
        try {
            scheduledExecutorService.schedule(runnable, n, timeUnit);
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 125) % 128;
        }
        catch (RejectedExecutionException ex) {
            goto Label_0043;
        }
    }
    
    public static boolean AFInAppEventParameterName(final Context ex) {
        final int n = AFa1eSDK.onDeepLinking + 35;
        AFa1eSDK.onAttributionFailure = n % 128;
        boolean b = true;
    Label_0096_Outer:
        while (true) {
            if (n % 2 != 0) {
                while (true) {
                    try {
                        // iftrue(Label_0080:, j.m().g((Context)ex) != 0)
                        while (true) {
                            while (true) {
                                if (j.m().g((Context)ex) == 0) {
                                    final int n2 = AFa1eSDK.onDeepLinking + 107;
                                    AFa1eSDK.onAttributionFailure = n2 % 128;
                                    if (n2 % 2 != 0) {
                                        b = false;
                                    }
                                    return b;
                                }
                                Label_0080: {
                                    AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 55) % 128;
                                }
                                try {
                                    ((Context)ex).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                                    return true;
                                }
                                catch (PackageManager$NameNotFoundException ex) {
                                    AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", (Throwable)ex);
                                    return false;
                                }
                                continue Label_0096_Outer;
                            }
                            final Throwable t;
                            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", t);
                            continue Label_0096_Outer;
                        }
                    }
                    finally {}
                    final Throwable t2;
                    final Throwable t = t2;
                    continue;
                }
            }
            continue;
        }
    }
    
    private boolean AFInAppEventParameterName(final AFa1qSDK aFa1qSDK, final AFb1dSDK aFb1dSDK) {
        final int value = this.valueOf(aFb1dSDK, false);
        boolean b;
        if (value == 1 && !(aFa1qSDK instanceof AFe1lSDK)) {
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 81) % 128;
            b = true;
        }
        else {
            b = false;
        }
        Label_0145: {
            if (!aFb1dSDK.valueOf("newGPReferrerSent")) {
                final int onDeepLinking = AFa1eSDK.onDeepLinking;
                final int n = onDeepLinking + 83;
                AFa1eSDK.onAttributionFailure = n % 128;
                if (n % 2 != 0) {
                    if (value != 0) {
                        break Label_0145;
                    }
                }
                else if (value != 1) {
                    break Label_0145;
                }
                final int n2 = onDeepLinking + 17;
                AFa1eSDK.onAttributionFailure = n2 % 128;
                final boolean b2 = n2 % 2 == 0;
                AFa1eSDK.onAttributionFailure = (onDeepLinking + 67) % 128;
                if (b2) {
                    return true;
                }
            }
        }
        final int n3 = AFa1eSDK.onDeepLinking + 97;
        AFa1eSDK.onAttributionFailure = n3 % 128;
        if (n3 % 2 != 0) {
            throw null;
        }
        if (!b) {
            return false;
        }
        return true;
    }
    
    private int AFInAppEventType(final AFb1dSDK aFb1dSDK) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 115) % 128;
        final int afKeystoreWrapper = this.AFKeystoreWrapper(aFb1dSDK, "appsFlyerAdImpressionCount", true);
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 83) % 128;
        return afKeystoreWrapper;
    }
    
    public static /* synthetic */ Application AFInAppEventType(final AFa1eSDK aFa1eSDK) {
        final int n = AFa1eSDK.onAttributionFailure + 33;
        final int n2 = AFa1eSDK.onDeepLinking = n % 128;
        final Application init = aFa1eSDK.init;
        if (n % 2 == 0) {}
        final int n3 = n2 + 35;
        AFa1eSDK.onAttributionFailure = n3 % 128;
        if (n3 % 2 == 0) {
            return init;
        }
        throw null;
    }
    
    public static String AFInAppEventType(final AFb1dSDK aFb1dSDK, final String s) {
        final String values = aFb1dSDK.values("CACHED_CHANNEL", null);
        if (values != null) {
            AFa1eSDK.onAttributionFailure = ((AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 97) % 128) + 115) % 128;
            return values;
        }
        aFb1dSDK.AFInAppEventParameterName("CACHED_CHANNEL", s);
        return s;
    }
    
    private static String AFInAppEventType(final String s) {
        final int n = AFa1eSDK.onDeepLinking + 77;
        final int n2 = AFa1eSDK.onAttributionFailure = n % 128;
        Label_0052: {
            if (n % 2 != 0) {
                if (s != null) {
                    break Label_0052;
                }
            }
            else if (s != null) {
                break Label_0052;
            }
            AFa1eSDK.onDeepLinking = (n2 + 29) % 128;
            return null;
        }
        if (!s.matches("fb\\d*?://authorize.*") || !s.contains("access_token")) {
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 97) % 128;
            return s;
        }
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 59) % 128;
        final String value = valueOf(s);
        if (value.length() == 0) {
            return s;
        }
        ArrayList<String> list = new ArrayList<String>();
        if (value.contains("&")) {
            list = new ArrayList<String>(Arrays.asList(value.split("&")));
        }
        else {
            list.add(value);
        }
        final StringBuilder sb = new StringBuilder();
        final Iterator<String> iterator = list.iterator();
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 7) % 128;
        while (!(iterator.hasNext() ^ true)) {
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 9) % 128;
            final String str = iterator.next();
            if (str.contains("access_token")) {
                final int n3 = AFa1eSDK.onAttributionFailure + 95;
                AFa1eSDK.onDeepLinking = n3 % 128;
                iterator.remove();
                if (n3 % 2 == 0) {
                    continue;
                }
                continue;
            }
            else {
                if (sb.length() != 0) {
                    final int n4 = AFa1eSDK.onDeepLinking + 49;
                    AFa1eSDK.onAttributionFailure = n4 % 128;
                    sb.append("&");
                    if (n4 % 2 != 0) {}
                }
                else if (!str.startsWith("?")) {
                    final int n5 = AFa1eSDK.onDeepLinking + 35;
                    AFa1eSDK.onAttributionFailure = n5 % 128;
                    sb.append("?");
                    if (n5 % 2 != 0) {
                        throw null;
                    }
                }
                sb.append(str);
            }
        }
        return s.replace(value, sb.toString());
    }
    
    public static String AFInAppEventType(final SimpleDateFormat simpleDateFormat, final long date) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        final String format = simpleDateFormat.format(new Date(date));
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 43) % 128;
        return format;
    }
    
    private void AFInAppEventType(final Context context) {
        this.onResponseErrorNative = new HashMap<String, Object>();
        final AFa1uSDK.AFa1zSDK aFa1zSDK = new AFa1uSDK.AFa1zSDK() {
            private /* synthetic */ long AFKeystoreWrapper = System.currentTimeMillis();
            
            @Override
            public final void AFKeystoreWrapper(final String s) {
                AFa1eSDK.values(AFa1eSDK.this).put("error", s);
            }
            
            @Override
            public final void valueOf(final String str, final String s, final String value) {
                if (str != null) {
                    com.appsflyer.AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                    AFa1eSDK.values(AFa1eSDK.this).put("link", str);
                    if (s != null) {
                        AFa1eSDK.values(AFa1eSDK.this).put("target_url", s);
                    }
                    if (value != null) {
                        final HashMap<String, HashMap<String, String>> hashMap = new HashMap<String, HashMap<String, String>>();
                        final HashMap<String, String> value2 = new HashMap<String, String>();
                        value2.put("promo_code", value);
                        hashMap.put("deeplink_context", value2);
                        AFa1eSDK.values(AFa1eSDK.this).put("extras", hashMap);
                    }
                }
                else {
                    AFa1eSDK.values(AFa1eSDK.this).put("link", "");
                }
                AFa1eSDK.values(AFa1eSDK.this).put("ttr", String.valueOf(System.currentTimeMillis() - this.AFKeystoreWrapper));
            }
        };
        while (true) {
            Label_0277: {
                Label_0270: {
                    Label_0263: {
                        Label_0242: {
                            try {
                                final B a = B.a;
                                B.class.getMethod("sdkInitialize", Context.class).invoke(null, context);
                                final int a2 = L1.a.a;
                                final Method method = a.class.getMethod("fetchDeferredAppLinkData", Context.class, String.class, a.a.class);
                                final Object proxyInstance = Proxy.newProxyInstance(a.a.class.getClassLoader(), new Class[] { a.a.class }, new InvocationHandler() {
                                    private /* synthetic */ Class AFInAppEventType = a.class;
                                    private /* synthetic */ AFa1zSDK AFKeystoreWrapper = aFa1zSDK;
                                    
                                    @Override
                                    public final Object invoke(Object cast, final Method method, final Object[] array) {
                                        if (method.getName().equals("onDeferredAppLinkDataFetched")) {
                                            cast = array[0];
                                            if (cast != null) {
                                                cast = this.AFInAppEventType.cast(cast);
                                                final Bundle bundle = Bundle.class.cast(this.AFInAppEventType.getMethod("getArgumentBundle", (Class[])new Class[0]).invoke(cast, new Object[0]));
                                                String string = null;
                                                String string2 = null;
                                                String string3 = null;
                                                Label_0127: {
                                                    if (bundle != null) {
                                                        string = ((BaseBundle)bundle).getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                                        string2 = ((BaseBundle)bundle).getString("target_url");
                                                        final Bundle bundle2 = bundle.getBundle("extras");
                                                        if (bundle2 != null) {
                                                            final Bundle bundle3 = bundle2.getBundle("deeplink_context");
                                                            if (bundle3 != null) {
                                                                string3 = ((BaseBundle)bundle3).getString("promo_code");
                                                                break Label_0127;
                                                            }
                                                        }
                                                        string3 = null;
                                                    }
                                                    else {
                                                        final String s = null;
                                                        string2 = (string = s);
                                                        string3 = s;
                                                    }
                                                }
                                                final AFa1zSDK afKeystoreWrapper = this.AFKeystoreWrapper;
                                                if (afKeystoreWrapper != null) {
                                                    afKeystoreWrapper.valueOf(string, string2, string3);
                                                    return null;
                                                }
                                            }
                                            else {
                                                final AFa1zSDK afKeystoreWrapper2 = this.AFKeystoreWrapper;
                                                if (afKeystoreWrapper2 != null) {
                                                    afKeystoreWrapper2.valueOf(null, null, null);
                                                }
                                            }
                                            return null;
                                        }
                                        final AFa1zSDK afKeystoreWrapper3 = this.AFKeystoreWrapper;
                                        if (afKeystoreWrapper3 != null) {
                                            afKeystoreWrapper3.AFKeystoreWrapper("onDeferredAppLinkDataFetched invocation failed");
                                        }
                                        return null;
                                    }
                                });
                                final String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                                if (TextUtils.isEmpty((CharSequence)string) ^ true) {
                                    method.invoke(null, context, string, proxyInstance);
                                    AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 3) % 128;
                                    return;
                                }
                            }
                            catch (IllegalAccessException ex) {
                                break Label_0242;
                            }
                            catch (ClassNotFoundException ex) {
                                break Label_0263;
                            }
                            catch (InvocationTargetException ex) {
                                break Label_0270;
                            }
                            catch (NoSuchMethodException ex) {
                                break Label_0277;
                            }
                            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 93) % 128;
                            ((AFa1uSDK.AFa1zSDK)aFa1zSDK).AFKeystoreWrapper("Facebook app id not defined in resources");
                            return;
                        }
                        final String s = "FB illegal access";
                        final IllegalAccessException ex;
                        com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(s, ex);
                        ((AFa1uSDK.AFa1zSDK)aFa1zSDK).AFKeystoreWrapper(ex.toString());
                        return;
                    }
                    final String s = "FB class missing error";
                    continue;
                }
                final String s = "FB invocation error";
                continue;
            }
            final String s = "FB method missing error";
            continue;
        }
    }
    
    private void AFInAppEventType(final Context context, final AFe1nSDK aFe1nSDK) {
        this.AFKeystoreWrapper(context);
        final AFe1mSDK afDebugLog = this.AFInAppEventType().afDebugLog();
        final AFe1tSDK afInAppEventParameterName = AFa1rSDK.AFInAppEventParameterName(context);
        if (afDebugLog.valueOf()) {
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 27) % 128;
            afDebugLog.AFInAppEventParameterName.put("api_name", aFe1nSDK.toString());
            afDebugLog.AFKeystoreWrapper(afInAppEventParameterName);
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 23) % 128;
        }
        afDebugLog.values();
    }
    
    private void AFInAppEventType(final Context context, final String afDebugLog, final Map<String, Object> values) {
        final AFe1iSDK aFe1iSDK = new AFe1iSDK();
        aFe1iSDK.afDebugLog = afDebugLog;
        aFe1iSDK.values = values;
        Activity activity;
        if (context instanceof Activity) {
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 103) % 128;
            activity = (Activity)context;
        }
        else {
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 125) % 128;
            activity = null;
        }
        this.values(aFe1iSDK, activity);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 9) % 128;
    }
    
    private void AFInAppEventType(final AFa1qSDK aFa1qSDK) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 95) % 128;
        final boolean b = aFa1qSDK.afDebugLog == null;
        if (this.AFKeystoreWrapper()) {
            com.appsflyer.AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (b) {
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 23) % 128;
            if (!(AppsFlyerProperties.getInstance().getBoolean("launchProtectEnabled", true) ^ true)) {
                if (this.afInfoLog()) {
                    final int n = AFa1eSDK.onDeepLinking + 109;
                    AFa1eSDK.onAttributionFailure = n % 128;
                    if (n % 2 == 0) {
                        final AppsFlyerRequestListener afInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName;
                        if (afInAppEventParameterName != null) {
                            afInAppEventParameterName.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        }
                        return;
                    }
                    throw null;
                }
            }
            else {
                com.appsflyer.AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.afDebugLog = System.currentTimeMillis();
        }
        AFInAppEventParameterName(this.AFInAppEventType().valueOf(), new AFa1vSDK(aFa1qSDK, (byte)0), 0L, TimeUnit.MILLISECONDS);
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 59) % 128;
    }
    
    private void AFInAppEventType(@NonNull final AFa1qSDK aFa1qSDK, final Activity activity) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 117) % 128;
        final AFf1vSDK onResponseErrorNative = this.AFInAppEventType().onResponseErrorNative();
        aFa1qSDK.valueOf = onResponseErrorNative.values(activity);
        aFa1qSDK.afInfoLog = onResponseErrorNative.valueOf(activity);
        final int n = AFa1eSDK.onDeepLinking + 13;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            return;
        }
        throw null;
    }
    
    private static void AFInAppEventType(final String s, final String s2) {
        final int n = AFa1eSDK.onDeepLinking + 43;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            AppsFlyerProperties.getInstance().set(s, s2);
            return;
        }
        AppsFlyerProperties.getInstance().set(s, s2);
        throw null;
    }
    
    private static void AFInAppEventType(final String s, final boolean b) {
        final int n = AFa1eSDK.onDeepLinking + 39;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {
            AppsFlyerProperties.getInstance().set(s, b);
            return;
        }
        AppsFlyerProperties.getInstance().set(s, b);
    }
    
    private int AFKeystoreWrapper(final AFb1dSDK aFb1dSDK, final String s, final boolean b) {
        int values;
        final int n = values = aFb1dSDK.values(s, 0);
        if (b) {
            final int n2 = AFa1eSDK.onAttributionFailure + 15;
            AFa1eSDK.onDeepLinking = n2 % 128;
            if (n2 % 2 == 0) {
                values = n + 59;
            }
            else {
                values = n + 1;
            }
            aFb1dSDK.AFInAppEventType(s, values);
        }
        if (this.AFInAppEventType().afErrorLogForExcManagerOnly().afInfoLog() ^ true) {
            return values;
        }
        final int n3 = AFa1eSDK.onDeepLinking + 5;
        AFa1eSDK.onAttributionFailure = n3 % 128;
        if (n3 % 2 == 0) {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName(String.valueOf(values));
            return values;
        }
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName(String.valueOf(values));
        throw null;
    }
    
    public static /* synthetic */ long AFKeystoreWrapper(final AFa1eSDK aFa1eSDK, final long afWarnLog) {
        final int onDeepLinking = AFa1eSDK.onDeepLinking;
        final int n = onDeepLinking + 95;
        AFa1eSDK.onAttributionFailure = n % 128;
        aFa1eSDK.afWarnLog = afWarnLog;
        if (n % 2 == 0) {
            AFa1eSDK.onAttributionFailure = (onDeepLinking + 77) % 128;
            return afWarnLog;
        }
        throw null;
    }
    
    private AFd1nSDK.AFa1xSDK AFKeystoreWrapper(final Map<String, String> map) {
        final AFd1nSDK.AFa1xSDK aFa1xSDK = new AFd1nSDK.AFa1xSDK() {
            @Override
            public final void AFKeystoreWrapper(final String s) {
                AFa1eSDK.this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper(s, DeepLinkResult.Error.NETWORK);
            }
            
            @Override
            public final void values(final Map<String, String> map) {
                for (final String s : map.keySet()) {
                    map.put(s, map.get(s));
                }
                AFa1eSDK.this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType(map);
            }
        };
        final int n = AFa1eSDK.onDeepLinking + 25;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            return aFa1xSDK;
        }
        throw null;
    }
    
    private Runnable AFKeystoreWrapper(final AFf1qSDK aFf1qSDK) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 81) % 128;
        final e e = new e(this, aFf1qSDK);
        final int n = AFa1eSDK.onAttributionFailure + 13;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            return e;
        }
        throw null;
    }
    
    private void AFKeystoreWrapper(final Context context, final String afErrorLog) {
        final AFa1qSDK afInAppEventParameterName = new AFe1gSDK().AFInAppEventParameterName(this.AFInAppEventType().AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0));
        afInAppEventParameterName.afErrorLog = afErrorLog;
        if (afErrorLog != null && afErrorLog.length() > 5 && this.AFInAppEventParameterName(afInAppEventParameterName, this.values(context))) {
            AFInAppEventParameterName(this.AFInAppEventType().valueOf(), new AFa1vSDK(afInAppEventParameterName, (byte)0), 5L, TimeUnit.MILLISECONDS);
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 63) % 128;
        }
        final int n = AFa1eSDK.onAttributionFailure + 61;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 == 0) {}
    }
    
    private void AFKeystoreWrapper(final Context context, final String afDebugLog, final Map<String, Object> values, final String afErrorLog, final String valueOf) {
        final int onAttributionFailure = AFa1eSDK.onAttributionFailure;
        AFa1eSDK.onDeepLinking = (onAttributionFailure + 27) % 128;
        AFa1qSDK aFa1qSDK = null;
        Label_0101: {
            if (afDebugLog != null) {
                final int n = onAttributionFailure + 117;
                AFa1eSDK.onDeepLinking = n % 128;
                if (!((n % 2 != 0) ? afDebugLog.trim().isEmpty() : afDebugLog.trim().isEmpty())) {
                    aFa1qSDK = new AFe1iSDK();
                    break Label_0101;
                }
            }
            aFa1qSDK = new AFe1hSDK();
        }
        this.AFKeystoreWrapper(context);
        aFa1qSDK.afDebugLog = afDebugLog;
        aFa1qSDK.values = values;
        aFa1qSDK.afErrorLog = afErrorLog;
        aFa1qSDK.valueOf = valueOf;
        this.AFInAppEventType(aFa1qSDK);
    }
    
    private void AFKeystoreWrapper(final Context context, final Map<String, Object> map, final AFa1qSDK aFa1qSDK) {
        final int n = AFa1eSDK.onAttributionFailure + 71;
        AFa1eSDK.onDeepLinking = n % 128;
        this.AFKeystoreWrapper(context);
        aFa1qSDK.values(map);
        final boolean b = context instanceof Activity;
        Activity activity = null;
        Label_0084: {
            Label_0066: {
                if (n % 2 == 0) {
                    if (b) {
                        break Label_0066;
                    }
                }
                else if (b) {
                    break Label_0066;
                }
                activity = null;
                break Label_0084;
            }
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 77) % 128;
            activity = (Activity)context;
        }
        this.values(aFa1qSDK, activity);
    }
    
    private void AFKeystoreWrapper(final AppsFlyerConversionListener afInAppEventParameterName) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 99) % 128;
        if (afInAppEventParameterName == null) {
            return;
        }
        this.AFInAppEventParameterName = afInAppEventParameterName;
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 103) % 128;
    }
    
    private static void AFKeystoreWrapper(final String s) {
        Label_0075: {
            Label_0068: {
                try {
                    if (!new JSONObject(s).has("pid")) {
                        break Label_0068;
                    }
                    final int n = AFa1eSDK.onAttributionFailure + 21;
                    AFa1eSDK.onDeepLinking = n % 128;
                    if (n % 2 == 0) {
                        AFInAppEventType("preInstallName", s);
                        try {
                            return;
                        }
                        finally {}
                    }
                }
                catch (JSONException ex) {
                    break Label_0075;
                }
                AFInAppEventType("preInstallName", s);
                return;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            return;
        }
        final JSONException ex;
        AFLogger.afErrorLog("Error parsing JSON for preinstall", (Throwable)ex);
    }
    
    private long AFLogger(final Context context) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 115) % 128;
        final AFb1dSDK values = this.values(context);
        final long value = values.valueOf("AppsFlyerTimePassedSincePrevLaunch", 0L);
        final long currentTimeMillis = System.currentTimeMillis();
        values.AFInAppEventParameterName("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        if (value > 0L) {
            final int onAttributionFailure = AFa1eSDK.onAttributionFailure;
            final int n = onAttributionFailure + 83;
            AFa1eSDK.onDeepLinking = n % 128;
            long n2;
            if (n % 2 == 0) {
                n2 = currentTimeMillis / value;
            }
            else {
                n2 = currentTimeMillis - value;
            }
            final long n3 = n2 / 1000L;
            final int n4 = onAttributionFailure + 15;
            AFa1eSDK.onDeepLinking = n4 % 128;
            if (n4 % 2 != 0) {
                return n3;
            }
            throw null;
        }
        else {
            final int n5 = AFa1eSDK.onDeepLinking + 65;
            AFa1eSDK.onAttributionFailure = n5 % 128;
            if (n5 % 2 == 0) {
                return -1L;
            }
            throw null;
        }
    }
    
    private boolean AFLogger() {
        final int n = AFa1eSDK.onAttributionFailure + 119;
        AFa1eSDK.onDeepLinking = n % 128;
        boolean b;
        if (n % 2 == 0) {
            b = this.AFInAppEventType().AFInAppEventParameterName().AFKeystoreWrapper("AF_PREINSTALL_DISABLED");
        }
        else {
            b = this.AFInAppEventType().AFInAppEventParameterName().AFKeystoreWrapper("AF_PREINSTALL_DISABLED");
        }
        final int n2 = AFa1eSDK.onAttributionFailure + 79;
        AFa1eSDK.onDeepLinking = n2 % 128;
        if (n2 % 2 != 0) {
            return b;
        }
        throw null;
    }
    
    private boolean AFLogger$LogLevel() {
        final Map<String, Object> onResponseErrorNative = this.onResponseErrorNative;
        if (onResponseErrorNative != null) {
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 75) % 128;
            if (!onResponseErrorNative.isEmpty()) {
                AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 5) % 128;
                return true;
            }
        }
        return false;
    }
    
    @NonNull
    private AFf1pSDK[] AFVersionDeclaration() {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 73) % 128;
        final AFf1pSDK[] value = this.AFInAppEventType().AFLogger$LogLevel().valueOf();
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 43) % 128;
        return value;
    }
    
    private void afDebugLog() {
        final AFf1oSDK afLogger$LogLevel = this.AFInAppEventType().AFLogger$LogLevel();
        final AFf1qSDK afErrorLog = this.afErrorLog();
        final Runnable afKeystoreWrapper = this.AFKeystoreWrapper(afErrorLog);
        afLogger$LogLevel.AFKeystoreWrapper(afErrorLog);
        afLogger$LogLevel.AFKeystoreWrapper(new AFf1jSDK(afKeystoreWrapper));
        afLogger$LogLevel.AFKeystoreWrapper(new AFf1nSDK(afKeystoreWrapper, this.AFInAppEventType()));
        afLogger$LogLevel.AFKeystoreWrapper(new AFf1mSDK(afKeystoreWrapper, this.AFInAppEventType()));
        if (!this.AFLogger()) {
            final int n = AFa1eSDK.onAttributionFailure + 21;
            AFa1eSDK.onDeepLinking = n % 128;
            if (n % 2 == 0) {
                afLogger$LogLevel.values((Context)this.init, afKeystoreWrapper, this.AFInAppEventType());
                throw null;
            }
            afLogger$LogLevel.values((Context)this.init, afKeystoreWrapper, this.AFInAppEventType());
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 29) % 128;
        }
        final AFf1pSDK[] value = afLogger$LogLevel.valueOf();
        final int length = value.length;
        int i = 0;
        while (i < length) {
            final int n2 = AFa1eSDK.onDeepLinking + 1;
            AFa1eSDK.onAttributionFailure = n2 % 128;
            if (n2 % 2 != 0) {
                value[i].valueOf((Context)this.init);
                i += 12;
            }
            else {
                value[i].valueOf((Context)this.init);
                ++i;
            }
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 51) % 128;
        }
    }
    
    private AFf1qSDK afErrorLog() {
        final AFf1qSDK aFf1qSDK = new AFf1qSDK(new b(this), this.AFInAppEventType().AFInAppEventType());
        final int n = AFa1eSDK.onDeepLinking + 45;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            return aFf1qSDK;
        }
        throw null;
    }
    
    private void afErrorLog(Context valueOf) {
        int n;
        if (AFa1fSDK.valueOf()) {
            com.appsflyer.AFLogger.afRDLog("OPPO device found");
            n = 23;
        }
        else {
            n = 18;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= n && !valueOf("keyPropDisableAFKeystore", true)) {
            final StringBuilder sb = new StringBuilder("OS SDK is=");
            sb.append(sdk_INT);
            sb.append("; use KeyStore");
            com.appsflyer.AFLogger.afRDLog(sb.toString());
            AFKeystoreWrapper afKeystoreWrapper = new AFKeystoreWrapper(valueOf);
            Label_0126: {
                if (!afKeystoreWrapper.AFKeystoreWrapper()) {
                    afKeystoreWrapper.AFKeystoreWrapper = AFb1zSDK.valueOf(this.AFInAppEventType().init(), this.AFInAppEventType().values());
                    afKeystoreWrapper.values = 0;
                }
                else {
                    final String afInAppEventParameterName = afKeystoreWrapper.AFInAppEventParameterName();
                    valueOf = (Context)afKeystoreWrapper.valueOf;
                    // monitorenter(valueOf)
                    // monitorexit(valueOf)
                    Label_0294: {
                        try {
                            ++afKeystoreWrapper.values;
                            com.appsflyer.AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(afInAppEventParameterName)));
                            final AFKeystoreWrapper afKeystoreWrapper2 = afKeystoreWrapper;
                            final Object o = afKeystoreWrapper2.valueOf;
                            final Object o3;
                            final Object o2 = o3 = o;
                            synchronized (o3) {
                                final AFKeystoreWrapper afKeystoreWrapper3 = afKeystoreWrapper;
                                final KeyStore keyStore = afKeystoreWrapper3.AFInAppEventType;
                                final String s = afInAppEventParameterName;
                                keyStore.deleteEntry(s);
                            }
                        }
                        finally {
                            final AFKeystoreWrapper afKeystoreWrapper4;
                            afKeystoreWrapper = afKeystoreWrapper4;
                            break Label_0294;
                        }
                        try {
                            final AFKeystoreWrapper afKeystoreWrapper2 = afKeystoreWrapper;
                            final Object o = afKeystoreWrapper2.valueOf;
                            final Object o3;
                            final Object o2 = o3 = o;
                            // monitorenter(o3)
                            final AFKeystoreWrapper afKeystoreWrapper3 = afKeystoreWrapper;
                            final KeyStore keyStore = afKeystoreWrapper3.AFInAppEventType;
                            final String s = afInAppEventParameterName;
                            keyStore.deleteEntry(s);
                        }
                        catch (KeyStoreException ex) {
                            final StringBuilder sb2 = new StringBuilder("Exception ");
                            sb2.append(ex.getMessage());
                            sb2.append(" occurred");
                            com.appsflyer.AFLogger.afErrorLog(sb2.toString(), ex);
                        }
                        break Label_0126;
                    }
                }
                // monitorexit(valueOf)
            }
            afKeystoreWrapper.AFKeystoreWrapper(afKeystoreWrapper.AFInAppEventParameterName());
            AFInAppEventType("KSAppsFlyerId", afKeystoreWrapper.valueOf());
            AFInAppEventType("KSAppsFlyerRICounter", String.valueOf(afKeystoreWrapper.AFInAppEventType()));
            return;
        }
        final StringBuilder sb3 = new StringBuilder("OS SDK is=");
        sb3.append(sdk_INT);
        sb3.append("; no KeyStore usage");
        com.appsflyer.AFLogger.afRDLog(sb3.toString());
    }
    
    private static void afInfoLog(final Context context) {
        Label_0133: {
            Label_0126: {
                Label_0105: {
                    try {
                        if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 0x8000) == 0x0) {
                            return;
                        }
                        final int n = AFa1eSDK.onDeepLinking + 9;
                        AFa1eSDK.onAttributionFailure = n % 128;
                        if (n % 2 != 0) {
                            final int identifier = context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName());
                            try {
                                if (identifier != 0) {
                                    break Label_0105;
                                }
                                break Label_0126;
                            }
                            finally {}
                        }
                    }
                    catch (Exception obj) {
                        break Label_0133;
                    }
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) == 0) {
                        break Label_0126;
                    }
                }
                AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 23) % 128;
                return;
            }
            AFLogger.AFKeystoreWrapper("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
            return;
        }
        final Exception obj;
        AFLogger.afErrorLogForExcManagerOnly("checkBackupRules Exception", obj);
        AFLogger.afRDLog("checkBackupRules Exception: ".concat(String.valueOf(obj)));
    }
    
    private boolean afInfoLog() {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 93) % 128;
        if (this.afDebugLog > 0L) {
            final long n = System.currentTimeMillis() - this.afDebugLog;
            final Locale us = Locale.US;
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", us);
            final String afInAppEventType = AFInAppEventType(simpleDateFormat, this.afDebugLog);
            final String afInAppEventType2 = AFInAppEventType(simpleDateFormat, this.afWarnLog);
            if (n < this.AFVersionDeclaration) {
                AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 35) % 128;
                if (!this.isStopped()) {
                    AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 121) % 128;
                    com.appsflyer.AFLogger.afInfoLog(String.format(us, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", afInAppEventType, afInAppEventType2, n, this.AFVersionDeclaration));
                    return true;
                }
            }
            if (!this.isStopped()) {
                com.appsflyer.AFLogger.afInfoLog(String.format(us, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", afInAppEventType, afInAppEventType2, n));
            }
        }
        else if (!this.isStopped()) {
            final int n2 = AFa1eSDK.onAttributionFailure + 11;
            AFa1eSDK.onDeepLinking = n2 % 128;
            com.appsflyer.AFLogger.afInfoLog("Sending first launch for this session!");
            if (n2 % 2 == 0) {
                throw null;
            }
        }
        final int n3 = AFa1eSDK.onDeepLinking + 59;
        AFa1eSDK.onAttributionFailure = n3 % 128;
        if (n3 % 2 == 0) {
            return false;
        }
        throw null;
    }
    
    private static String afRDLog() {
        final int n = AFa1eSDK.onAttributionFailure + 121;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            return values("appid");
        }
        values("appid");
        throw null;
    }
    
    private void afWarnLog() {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 21) % 128;
        if (!AFd1lSDK.afInfoLog()) {
            final AFc1xSDK afInAppEventType = this.AFInAppEventType();
            final AFc1bSDK afVersionDeclaration = afInAppEventType.AFVersionDeclaration();
            afVersionDeclaration.AFKeystoreWrapper.execute(new Runnable() {
                private /* synthetic */ AFd1zSDK AFInAppEventType;
                
                @Override
                public final void run() {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     1: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //     4: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //     7: astore          6
                    //     9: aload           6
                    //    11: monitorenter   
                    //    12: aload_0        
                    //    13: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    16: getfield        com/appsflyer/internal/AFc1bSDK.afErrorLog:Ljava/util/Set;
                    //    19: aload_0        
                    //    20: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    23: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    28: ifeq            64
                    //    31: new             Ljava/lang/StringBuilder;
                    //    34: dup            
                    //    35: ldc             "QUEUE: tried to add already running task: "
                    //    37: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //    40: astore          7
                    //    42: aload           7
                    //    44: aload_0        
                    //    45: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //    51: pop            
                    //    52: aload           7
                    //    54: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //    57: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //    60: aload           6
                    //    62: monitorexit    
                    //    63: return         
                    //    64: aload_0        
                    //    65: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    68: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //    71: aload_0        
                    //    72: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    75: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    80: ifne            676
                    //    83: aload_0        
                    //    84: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    87: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //    90: aload_0        
                    //    91: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    94: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    99: ifeq            105
                    //   102: goto            676
                    //   105: aload_0        
                    //   106: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   109: astore          7
                    //   111: aload_0        
                    //   112: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   115: astore          8
                    //   117: aload           8
                    //   119: getfield        com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:Ljava/util/Set;
                    //   122: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
                    //   127: astore          9
                    //   129: aload           9
                    //   131: invokeinterface java/util/Iterator.hasNext:()Z
                    //   136: ifeq            182
                    //   139: aload           9
                    //   141: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   146: checkcast       Lcom/appsflyer/internal/AFd1vSDK;
                    //   149: astore          10
                    //   151: aload           7
                    //   153: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                    //   156: aload           10
                    //   158: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //   163: ifeq            129
                    //   166: aload           8
                    //   168: getfield        com/appsflyer/internal/AFd1zSDK.AFInAppEventParameterName:Ljava/util/Set;
                    //   171: aload           10
                    //   173: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   178: pop            
                    //   179: goto            129
                    //   182: aload_0        
                    //   183: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   186: aload_0        
                    //   187: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   190: invokestatic    com/appsflyer/internal/AFc1bSDK.values:(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)Z
                    //   193: ifeq            217
                    //   196: aload_0        
                    //   197: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   200: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   203: aload_0        
                    //   204: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   207: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   212: istore          4
                    //   214: goto            284
                    //   217: aload_0        
                    //   218: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   221: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   224: aload_0        
                    //   225: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   228: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   233: istore          5
                    //   235: iload           5
                    //   237: istore          4
                    //   239: iload           5
                    //   241: ifeq            284
                    //   244: new             Ljava/lang/StringBuilder;
                    //   247: dup            
                    //   248: ldc             "QUEUE: new task was blocked: "
                    //   250: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   253: astore          7
                    //   255: aload           7
                    //   257: aload_0        
                    //   258: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   264: pop            
                    //   265: aload           7
                    //   267: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   270: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   273: aload_0        
                    //   274: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   277: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:()V
                    //   280: iload           5
                    //   282: istore          4
                    //   284: iload           4
                    //   286: ifeq            326
                    //   289: aload_0        
                    //   290: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   293: astore          7
                    //   295: aload           7
                    //   297: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   300: aload           7
                    //   302: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                    //   305: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
                    //   310: pop            
                    //   311: aload_0        
                    //   312: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   315: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                    //   318: invokeinterface java/util/List.clear:()V
                    //   323: goto            355
                    //   326: new             Ljava/lang/StringBuilder;
                    //   329: dup            
                    //   330: ldc             "QUEUE: task not added, it's already in the queue: "
                    //   332: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   335: astore          7
                    //   337: aload           7
                    //   339: aload_0        
                    //   340: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   346: pop            
                    //   347: aload           7
                    //   349: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   352: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   355: aload           6
                    //   357: monitorexit    
                    //   358: iload           4
                    //   360: ifeq            646
                    //   363: aload_0        
                    //   364: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   367: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                    //   370: aload_0        
                    //   371: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   374: getfield        com/appsflyer/internal/AFd1zSDK.values:Lcom/appsflyer/internal/AFd1vSDK;
                    //   377: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   382: pop            
                    //   383: new             Ljava/lang/StringBuilder;
                    //   386: dup            
                    //   387: ldc             "QUEUE: new task added: "
                    //   389: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   392: astore          6
                    //   394: aload           6
                    //   396: aload_0        
                    //   397: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   400: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   403: pop            
                    //   404: aload           6
                    //   406: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   409: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   412: aload_0        
                    //   413: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   416: getfield        com/appsflyer/internal/AFc1bSDK.values:Ljava/util/List;
                    //   419: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                    //   424: astore          6
                    //   426: aload           6
                    //   428: invokeinterface java/util/Iterator.hasNext:()Z
                    //   433: ifeq            451
                    //   436: aload           6
                    //   438: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   443: checkcast       Lcom/appsflyer/internal/AFc1cSDK;
                    //   446: astore          7
                    //   448: goto            426
                    //   451: aload_0        
                    //   452: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   455: astore          6
                    //   457: aload           6
                    //   459: getfield        com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;
                    //   462: aload           6
                    //   464: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
                    //   469: pop            
                    //   470: aload_0        
                    //   471: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   474: astore          8
                    //   476: aload           8
                    //   478: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   481: astore          7
                    //   483: aload           7
                    //   485: monitorenter   
                    //   486: aload           8
                    //   488: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   491: invokeinterface java/util/Set.size:()I
                    //   496: aload           8
                    //   498: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   501: invokeinterface java/util/Set.size:()I
                    //   506: iadd           
                    //   507: bipush          40
                    //   509: isub           
                    //   510: istore_1       
                    //   511: iload_1        
                    //   512: ifle            636
                    //   515: aload           8
                    //   517: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   520: invokeinterface java/util/Set.isEmpty:()Z
                    //   525: iconst_1       
                    //   526: ixor           
                    //   527: istore_2       
                    //   528: aload           8
                    //   530: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   533: invokeinterface java/util/Set.isEmpty:()Z
                    //   538: iconst_1       
                    //   539: ixor           
                    //   540: istore_3       
                    //   541: iload_3        
                    //   542: ifeq            608
                    //   545: iload_2        
                    //   546: ifeq            608
                    //   549: aload           8
                    //   551: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   554: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                    //   559: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                    //   562: aload           8
                    //   564: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   567: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                    //   572: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                    //   575: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:(Lcom/appsflyer/internal/AFd1zSDK;)I
                    //   578: ifle            598
                    //   581: aload           8
                    //   583: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   586: astore          6
                    //   588: aload           8
                    //   590: aload           6
                    //   592: invokevirtual   com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:(Ljava/util/NavigableSet;)V
                    //   595: goto            725
                    //   598: aload           8
                    //   600: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   603: astore          6
                    //   605: goto            588
                    //   608: iload_3        
                    //   609: ifeq            622
                    //   612: aload           8
                    //   614: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   617: astore          6
                    //   619: goto            588
                    //   622: iload_2        
                    //   623: ifeq            725
                    //   626: aload           8
                    //   628: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   631: astore          6
                    //   633: goto            588
                    //   636: aload           7
                    //   638: monitorexit    
                    //   639: return         
                    //   640: aload           7
                    //   642: monitorexit    
                    //   643: aload           6
                    //   645: athrow         
                    //   646: new             Ljava/lang/StringBuilder;
                    //   649: dup            
                    //   650: ldc             "QUEUE: tried to add already pending task: "
                    //   652: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   655: astore          6
                    //   657: aload           6
                    //   659: aload_0        
                    //   660: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   663: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   666: pop            
                    //   667: aload           6
                    //   669: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   672: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
                    //   675: return         
                    //   676: new             Ljava/lang/StringBuilder;
                    //   679: dup            
                    //   680: ldc             "QUEUE: tried to add already scheduled task: "
                    //   682: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   685: astore          7
                    //   687: aload           7
                    //   689: aload_0        
                    //   690: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   693: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   696: pop            
                    //   697: aload           7
                    //   699: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   702: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   705: aload           6
                    //   707: monitorexit    
                    //   708: return         
                    //   709: aload           6
                    //   711: monitorexit    
                    //   712: aload           7
                    //   714: athrow         
                    //   715: astore          7
                    //   717: goto            709
                    //   720: astore          6
                    //   722: goto            640
                    //   725: iload_1        
                    //   726: iconst_1       
                    //   727: isub           
                    //   728: istore_1       
                    //   729: goto            511
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type
                    //  -----  -----  -----  -----  ----
                    //  12     63     715    720    Any
                    //  64     102    715    720    Any
                    //  105    129    715    720    Any
                    //  129    179    715    720    Any
                    //  182    214    715    720    Any
                    //  217    235    715    720    Any
                    //  244    280    715    720    Any
                    //  289    323    715    720    Any
                    //  326    355    715    720    Any
                    //  355    358    715    720    Any
                    //  486    511    720    646    Any
                    //  515    541    720    646    Any
                    //  549    588    720    646    Any
                    //  588    595    720    646    Any
                    //  598    605    720    646    Any
                    //  612    619    720    646    Any
                    //  626    633    720    646    Any
                    //  636    639    720    646    Any
                    //  676    708    715    720    Any
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.IllegalStateException: Expression is linked from several locations: Label_0511:
                    //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                    //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
                    //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
                    // 
                    throw new IllegalStateException("An error occurred while decompiling this method.");
                }
            });
            return;
        }
        final int n = AFa1eSDK.onAttributionFailure + 83;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            return;
        }
        throw null;
    }
    
    public static SharedPreferences valueOf(final Context context) {
        // monitorenter(AFa1eSDK.class)
        while (true) {
            try {
                AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 119) % 128;
                if (valueOf().onConversionDataSuccess == null) {
                    AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 7) % 128;
                    final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        valueOf().onConversionDataSuccess = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    }
                    finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                // monitorexit(AFa1eSDK.class)
                return valueOf().onConversionDataSuccess;
                // monitorexit(AFa1eSDK.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static AFa1eSDK valueOf() {
        final int n = AFa1eSDK.onDeepLinking + 33;
        final int n2 = AFa1eSDK.onAttributionFailure = n % 128;
        AFa1eSDK aFa1eSDK;
        if (n % 2 != 0) {
            aFa1eSDK = AFa1eSDK.afRDLog;
        }
        else {
            aFa1eSDK = AFa1eSDK.afRDLog;
        }
        AFa1eSDK.onDeepLinking = (n2 + 51) % 128;
        return aFa1eSDK;
    }
    
    private static String valueOf(String substring) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 117) % 128;
        final int index = substring.indexOf(63);
        if (index != -1) {
            substring = substring.substring(index);
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 93) % 128;
            return substring;
        }
        final int n = AFa1eSDK.onAttributionFailure + 45;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            return "";
        }
        throw null;
    }
    
    public static /* synthetic */ void valueOf(final AFa1eSDK aFa1eSDK, final AFa1qSDK aFa1qSDK) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 55) % 128;
        aFa1eSDK.valueOf(aFa1qSDK);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 83) % 128;
    }
    
    private void valueOf(final AFa1qSDK aFa1qSDK) {
        final int n = AFa1eSDK.onAttributionFailure + 45;
        AFa1eSDK.onDeepLinking = n % 128;
        boolean b = false;
        int i = 0;
        Context context = null;
        Label_0090: {
            if (n % 2 == 0) {
                if ((context = this.AFInAppEventType().init().AFInAppEventType) != null) {
                    break Label_0090;
                }
            }
            else if ((context = this.AFInAppEventType().init().AFInAppEventType) != null) {
                break Label_0090;
            }
            com.appsflyer.AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        final AFb1dSDK values = this.values(context);
        AppsFlyerProperties.getInstance().saveProperties(values);
        if (!this.AFInAppEventType().afWarnLog().AFKeystoreWrapper()) {
            final StringBuilder sb = new StringBuilder("sendWithEvent from activity: ");
            sb.append(context.getClass().getName());
            com.appsflyer.AFLogger.afInfoLog(sb.toString());
        }
        final boolean afInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        final Map<String, Object> afInAppEventParameterName2 = this.AFInAppEventParameterName(aFa1qSDK);
        final String s = afInAppEventParameterName2.get("appsflyerKey");
        if (s != null && s.length() != 0) {
            if (!this.isStopped()) {
                com.appsflyer.AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
            }
            final int value = this.valueOf(values, false);
            final AFf1fSDK aFf1fSDK = new AFf1fSDK(this.AFInAppEventType().AFInAppEventParameterName());
            Intrinsics.checkNotNullParameter(aFa1qSDK, "");
            final boolean afInAppEventParameterName3 = aFa1qSDK.AFInAppEventParameterName();
            final boolean b2 = aFa1qSDK instanceof AFe1oSDK;
            final boolean b3 = aFa1qSDK instanceof AFe1kSDK;
            final boolean b4 = aFa1qSDK instanceof AFe1gSDK;
            String str = null;
            Label_0592: {
                AFf1eSDK aFf1eSDK = null;
                String s2 = null;
                Label_0504: {
                    if (!(aFa1qSDK instanceof AFe1lSDK) && !b4) {
                        if (b3) {
                            if ((str = AFf1fSDK.afErrorLogForExcManagerOnly) == null) {
                                aFf1eSDK = aFf1fSDK.AFInAppEventType;
                                s2 = AFf1fSDK.valueOf;
                                break Label_0504;
                            }
                        }
                        else if (b2) {
                            if ((str = AFf1fSDK.getLevel) == null) {
                                aFf1eSDK = aFf1fSDK.AFInAppEventType;
                                s2 = AFf1fSDK.AFInAppEventParameterName;
                                break Label_0504;
                            }
                        }
                        else if (afInAppEventParameterName3) {
                            if (value < 2) {
                                AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 93) % 128;
                                if ((str = AFf1fSDK.AppsFlyer2dXConversionCallback) == null) {
                                    final int n2 = AFa1eSDK.onAttributionFailure + 49;
                                    AFa1eSDK.onDeepLinking = n2 % 128;
                                    if (n2 % 2 != 0) {
                                        aFf1eSDK = aFf1fSDK.AFInAppEventType;
                                        s2 = AFf1fSDK.afRDLog;
                                        break Label_0504;
                                    }
                                    aFf1fSDK.AFInAppEventType.valueOf(AFf1fSDK.afRDLog);
                                    throw null;
                                }
                            }
                            else if ((str = AFf1fSDK.onAppOpenAttributionNative) == null) {
                                aFf1eSDK = aFf1fSDK.AFInAppEventType;
                                s2 = AFf1fSDK.afErrorLog;
                                break Label_0504;
                            }
                        }
                        else if ((str = AFf1fSDK.onInstallConversionDataLoadedNative) == null) {
                            aFf1eSDK = aFf1fSDK.AFInAppEventType;
                            s2 = AFf1fSDK.AFLogger;
                            break Label_0504;
                        }
                    }
                    else if ((str = AFf1fSDK.afWarnLog) == null) {
                        final int n3 = AFa1eSDK.onDeepLinking + 73;
                        AFa1eSDK.onAttributionFailure = n3 % 128;
                        aFf1eSDK = aFf1fSDK.AFInAppEventType;
                        if (n3 % 2 == 0) {
                            s2 = AFf1fSDK.AFKeystoreWrapper;
                            break Label_0504;
                        }
                        str = aFf1eSDK.valueOf(AFf1fSDK.AFKeystoreWrapper);
                    }
                    break Label_0592;
                }
                str = aFf1eSDK.valueOf(s2);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(aFf1fSDK.values.valueOf.AFInAppEventType.getPackageName());
            final String afInAppEventParameterName4 = aFf1fSDK.AFInAppEventParameterName(AFf1fSDK.AFInAppEventParameterName(sb2.toString(), b2));
            this.AFInAppEventParameterName(afInAppEventParameterName2);
            final AFa1ySDK aFa1ySDK = new AFa1ySDK(aFa1qSDK.AFKeystoreWrapper(afInAppEventParameterName4).values(afInAppEventParameterName2).AFInAppEventParameterName(value), (byte)0);
            if (afInAppEventParameterName) {
                AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 43) % 128;
                final AFf1pSDK[] afVersionDeclaration = this.AFVersionDeclaration();
                final int length = afVersionDeclaration.length;
                b = false;
                while (i < length) {
                    final AFf1pSDK aFf1pSDK = afVersionDeclaration[i];
                    if (aFf1pSDK.afDebugLog == AFf1pSDK.AFa1zSDK.AFInAppEventType) {
                        final StringBuilder sb3 = new StringBuilder("Failed to get ");
                        sb3.append(aFf1pSDK.AFKeystoreWrapper);
                        sb3.append(" referrer, wait ...");
                        com.appsflyer.AFLogger.afDebugLog(sb3.toString());
                        b = true;
                    }
                    ++i;
                }
                if (this.onDeepLinkingNative) {
                    AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 27) % 128;
                    if (!this.AFLogger$LogLevel()) {
                        com.appsflyer.AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                        b = true;
                    }
                }
                if (this.AFInAppEventType().afWarnLog().AFInAppEventType()) {
                    AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 123) % 128;
                    b = true;
                }
            }
            final ScheduledExecutorService value2 = this.AFInAppEventType().valueOf();
            long n4;
            if (b) {
                n4 = 500L;
            }
            else {
                n4 = 0L;
            }
            AFInAppEventParameterName(value2, aFa1ySDK, n4, TimeUnit.MILLISECONDS);
            return;
        }
        com.appsflyer.AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
        final AppsFlyerRequestListener afInAppEventParameterName5 = aFa1qSDK.AFInAppEventParameterName;
        if (afInAppEventParameterName5 != null) {
            afInAppEventParameterName5.onError(41, "No dev key");
        }
    }
    
    private static void valueOf(final JSONObject p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore          12
        //     9: aload_0        
        //    10: invokevirtual   org/json/JSONObject.keys:()Ljava/util/Iterator;
        //    13: astore          8
        //    15: aload           8
        //    17: invokeinterface java/util/Iterator.hasNext:()Z
        //    22: istore_3       
        //    23: iconst_0       
        //    24: istore_1       
        //    25: iload_3        
        //    26: ifeq            151
        //    29: aload           8
        //    31: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    36: checkcast       Ljava/lang/String;
        //    39: astore          9
        //    41: new             Lorg/json/JSONArray;
        //    44: dup            
        //    45: aload_0        
        //    46: aload           9
        //    48: invokevirtual   org/json/JSONObject.get:(Ljava/lang/String;)Ljava/lang/Object;
        //    51: checkcast       Ljava/lang/String;
        //    54: invokespecial   org/json/JSONArray.<init>:(Ljava/lang/String;)V
        //    57: astore          9
        //    59: aload           9
        //    61: invokevirtual   org/json/JSONArray.length:()I
        //    64: istore_2       
        //    65: iload_1        
        //    66: iload_2        
        //    67: if_icmpge       15
        //    70: getstatic       com/appsflyer/internal/AFa1eSDK.onDeepLinking:I
        //    73: bipush          73
        //    75: iadd           
        //    76: istore_2       
        //    77: iload_2        
        //    78: sipush          128
        //    81: irem           
        //    82: putstatic       com/appsflyer/internal/AFa1eSDK.onAttributionFailure:I
        //    85: iload_2        
        //    86: iconst_2       
        //    87: irem           
        //    88: ifeq            116
        //    91: aload           12
        //    93: aload           9
        //    95: iload_1        
        //    96: invokevirtual   org/json/JSONArray.getLong:(I)J
        //    99: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   102: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   107: pop            
        //   108: iload_1        
        //   109: bipush          107
        //   111: iadd           
        //   112: istore_1       
        //   113: goto            59
        //   116: aload           12
        //   118: aload           9
        //   120: iload_1        
        //   121: invokevirtual   org/json/JSONArray.getLong:(I)J
        //   124: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   127: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   132: pop            
        //   133: iload_1        
        //   134: iconst_1       
        //   135: iadd           
        //   136: istore_1       
        //   137: goto            59
        //   140: ldc_w           "error at timeStampArr"
        //   143: aload           9
        //   145: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   148: goto            15
        //   151: aload           12
        //   153: invokestatic    java/util/Collections.sort:(Ljava/util/List;)V
        //   156: aload_0        
        //   157: invokevirtual   org/json/JSONObject.keys:()Ljava/util/Iterator;
        //   160: astore          13
        //   162: aconst_null    
        //   163: astore          8
        //   165: aload           13
        //   167: invokeinterface java/util/Iterator.hasNext:()Z
        //   172: ifeq            521
        //   175: aload           8
        //   177: ifnonnull       521
        //   180: aload           13
        //   182: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   187: checkcast       Ljava/lang/String;
        //   190: astore          11
        //   192: aload           8
        //   194: astore          10
        //   196: new             Lorg/json/JSONArray;
        //   199: dup            
        //   200: aload_0        
        //   201: aload           11
        //   203: invokevirtual   org/json/JSONObject.get:(Ljava/lang/String;)Ljava/lang/Object;
        //   206: checkcast       Ljava/lang/String;
        //   209: invokespecial   org/json/JSONArray.<init>:(Ljava/lang/String;)V
        //   212: astore          14
        //   214: iconst_0       
        //   215: istore_1       
        //   216: aload           8
        //   218: astore          9
        //   220: aload           9
        //   222: astore          10
        //   224: aload           14
        //   226: invokevirtual   org/json/JSONArray.length:()I
        //   229: istore_2       
        //   230: aload           9
        //   232: astore          8
        //   234: iload_1        
        //   235: iload_2        
        //   236: if_icmpge       165
        //   239: getstatic       com/appsflyer/internal/AFa1eSDK.onAttributionFailure:I
        //   242: bipush          13
        //   244: iadd           
        //   245: istore_2       
        //   246: iload_2        
        //   247: sipush          128
        //   250: irem           
        //   251: putstatic       com/appsflyer/internal/AFa1eSDK.onDeepLinking:I
        //   254: iload_2        
        //   255: iconst_2       
        //   256: irem           
        //   257: ifne            291
        //   260: aload           9
        //   262: astore          10
        //   264: aload           14
        //   266: iload_1        
        //   267: invokevirtual   org/json/JSONArray.getLong:(I)J
        //   270: aload           12
        //   272: iconst_1       
        //   273: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   278: checkcast       Ljava/lang/Long;
        //   281: invokevirtual   java/lang/Number.longValue:()J
        //   284: lcmp           
        //   285: ifeq            162
        //   288: goto            331
        //   291: aload           9
        //   293: astore          10
        //   295: aload           14
        //   297: iload_1        
        //   298: invokevirtual   org/json/JSONArray.getLong:(I)J
        //   301: lstore          4
        //   303: aload           9
        //   305: astore          10
        //   307: aload           12
        //   309: iconst_0       
        //   310: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   315: checkcast       Ljava/lang/Long;
        //   318: invokevirtual   java/lang/Number.longValue:()J
        //   321: lstore          6
        //   323: lload           4
        //   325: lload           6
        //   327: lcmp           
        //   328: ifeq            162
        //   331: getstatic       com/appsflyer/internal/AFa1eSDK.onDeepLinking:I
        //   334: bipush          61
        //   336: iadd           
        //   337: sipush          128
        //   340: irem           
        //   341: putstatic       com/appsflyer/internal/AFa1eSDK.onAttributionFailure:I
        //   344: aload           9
        //   346: astore          10
        //   348: aload           14
        //   350: iload_1        
        //   351: invokevirtual   org/json/JSONArray.getLong:(I)J
        //   354: lstore          4
        //   356: aload           9
        //   358: astore          10
        //   360: aload           12
        //   362: iconst_1       
        //   363: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   368: checkcast       Ljava/lang/Long;
        //   371: invokevirtual   java/lang/Number.longValue:()J
        //   374: lstore          6
        //   376: lload           4
        //   378: lload           6
        //   380: lcmp           
        //   381: ifeq            162
        //   384: getstatic       com/appsflyer/internal/AFa1eSDK.onAttributionFailure:I
        //   387: bipush          61
        //   389: iadd           
        //   390: istore_2       
        //   391: iload_2        
        //   392: sipush          128
        //   395: irem           
        //   396: putstatic       com/appsflyer/internal/AFa1eSDK.onDeepLinking:I
        //   399: iload_2        
        //   400: iconst_2       
        //   401: irem           
        //   402: ifne            444
        //   405: aload           9
        //   407: astore          10
        //   409: aload           14
        //   411: iload_1        
        //   412: invokevirtual   org/json/JSONArray.getLong:(I)J
        //   415: aload           12
        //   417: aload           12
        //   419: invokeinterface java/util/List.size:()I
        //   424: iconst_1       
        //   425: isub           
        //   426: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   431: checkcast       Ljava/lang/Long;
        //   434: invokevirtual   java/lang/Number.longValue:()J
        //   437: lcmp           
        //   438: ifne            495
        //   441: goto            162
        //   444: aload           9
        //   446: astore          10
        //   448: aload           14
        //   450: iload_1        
        //   451: invokevirtual   org/json/JSONArray.getLong:(I)J
        //   454: lstore          4
        //   456: aload           9
        //   458: astore          10
        //   460: aload           12
        //   462: aload           12
        //   464: invokeinterface java/util/List.size:()I
        //   469: iconst_1       
        //   470: isub           
        //   471: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   476: checkcast       Ljava/lang/Long;
        //   479: invokevirtual   java/lang/Number.longValue:()J
        //   482: lstore          6
        //   484: lload           4
        //   486: lload           6
        //   488: lcmp           
        //   489: ifne            495
        //   492: goto            162
        //   495: iload_1        
        //   496: iconst_1       
        //   497: iadd           
        //   498: istore_1       
        //   499: aload           11
        //   501: astore          9
        //   503: goto            220
        //   506: ldc_w           "error at manageExtraReferrers"
        //   509: aload           8
        //   511: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   514: aload           10
        //   516: astore          8
        //   518: goto            165
        //   521: aload           8
        //   523: ifnull          533
        //   526: aload_0        
        //   527: aload           8
        //   529: invokevirtual   org/json/JSONObject.remove:(Ljava/lang/String;)Ljava/lang/Object;
        //   532: pop            
        //   533: return         
        //   534: astore          9
        //   536: goto            140
        //   539: astore          8
        //   541: goto            506
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  41     59     534    151    Lorg/json/JSONException;
        //  59     65     534    151    Lorg/json/JSONException;
        //  91     108    534    151    Lorg/json/JSONException;
        //  116    133    534    151    Lorg/json/JSONException;
        //  196    214    539    521    Lorg/json/JSONException;
        //  224    230    539    521    Lorg/json/JSONException;
        //  264    288    539    521    Lorg/json/JSONException;
        //  295    303    539    521    Lorg/json/JSONException;
        //  307    323    539    521    Lorg/json/JSONException;
        //  348    356    539    521    Lorg/json/JSONException;
        //  360    376    539    521    Lorg/json/JSONException;
        //  409    441    539    521    Lorg/json/JSONException;
        //  448    456    539    521    Lorg/json/JSONException;
        //  460    484    539    521    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0220:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ boolean valueOf(final AFa1eSDK aFa1eSDK, final boolean appsFlyer2dXConversionCallback) {
        final int onDeepLinking = AFa1eSDK.onDeepLinking;
        AFa1eSDK.onAttributionFailure = (onDeepLinking + 119) % 128;
        aFa1eSDK.AppsFlyer2dXConversionCallback = appsFlyer2dXConversionCallback;
        final int n = onDeepLinking + 21;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            return appsFlyer2dXConversionCallback;
        }
        throw null;
    }
    
    private static boolean valueOf(final String s, final boolean b) {
        final int n = AFa1eSDK.onDeepLinking + 21;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            final boolean boolean1 = AppsFlyerProperties.getInstance().getBoolean(s, b);
            final int n2 = AFa1eSDK.onAttributionFailure + 117;
            AFa1eSDK.onDeepLinking = n2 % 128;
            if (n2 % 2 == 0) {}
            return boolean1;
        }
        AppsFlyerProperties.getInstance().getBoolean(s, b);
        throw null;
    }
    
    private int values(final AFb1dSDK aFb1dSDK, final boolean b) {
        final int n = AFa1eSDK.onDeepLinking + 119;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            return this.AFKeystoreWrapper(aFb1dSDK, "appsFlyerInAppEventCount", b);
        }
        this.AFKeystoreWrapper(aFb1dSDK, "appsFlyerInAppEventCount", b);
        throw null;
    }
    
    private String values(final Context context, final String s) {
        if (context != null) {
            this.AFKeystoreWrapper(context);
            final String afInAppEventType = this.AFInAppEventType().AFInAppEventParameterName().AFInAppEventType(s);
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 63) % 128;
            return afInAppEventType;
        }
        final int n = AFa1eSDK.onDeepLinking + 7;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            return null;
        }
        throw null;
    }
    
    private static String values(final String s) {
        final int n = AFa1eSDK.onDeepLinking + 117;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            return AppsFlyerProperties.getInstance().getString(s);
        }
        AppsFlyerProperties.getInstance().getString(s);
        throw null;
    }
    
    @Deprecated
    @NonNull
    public static String values(final HttpURLConnection p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: astore          7
        //     9: aconst_null    
        //    10: astore          4
        //    12: aload_0        
        //    13: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //    16: astore          5
        //    18: aload           5
        //    20: astore_3       
        //    21: aload           5
        //    23: ifnonnull       34
        //    26: aload_0        
        //    27: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //    30: astore_3       
        //    31: goto            34
        //    34: new             Ljava/io/InputStreamReader;
        //    37: dup            
        //    38: aload_3        
        //    39: invokestatic    java/nio/charset/Charset.defaultCharset:()Ljava/nio/charset/Charset;
        //    42: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //    45: astore          5
        //    47: new             Ljava/io/BufferedReader;
        //    50: dup            
        //    51: aload           5
        //    53: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    56: astore          6
        //    58: getstatic       com/appsflyer/internal/AFa1eSDK.onAttributionFailure:I
        //    61: bipush          99
        //    63: iadd           
        //    64: sipush          128
        //    67: irem           
        //    68: putstatic       com/appsflyer/internal/AFa1eSDK.onDeepLinking:I
        //    71: iconst_0       
        //    72: istore_1       
        //    73: aload           6
        //    75: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    78: astore          4
        //    80: aload           4
        //    82: ifnull          141
        //    85: getstatic       com/appsflyer/internal/AFa1eSDK.onAttributionFailure:I
        //    88: bipush          111
        //    90: iadd           
        //    91: istore_2       
        //    92: iload_2        
        //    93: sipush          128
        //    96: irem           
        //    97: putstatic       com/appsflyer/internal/AFa1eSDK.onDeepLinking:I
        //   100: iload_2        
        //   101: iconst_2       
        //   102: irem           
        //   103: ifeq            139
        //   106: iload_1        
        //   107: ifeq            352
        //   110: bipush          10
        //   112: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   115: astore_3       
        //   116: goto            119
        //   119: aload           7
        //   121: aload_3        
        //   122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   125: pop            
        //   126: aload           7
        //   128: aload           4
        //   130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   133: pop            
        //   134: iconst_1       
        //   135: istore_1       
        //   136: goto            73
        //   139: aconst_null    
        //   140: athrow         
        //   141: aload           6
        //   143: invokevirtual   java/io/Reader.close:()V
        //   146: aload           5
        //   148: invokevirtual   java/io/Reader.close:()V
        //   151: getstatic       com/appsflyer/internal/AFa1eSDK.onDeepLinking:I
        //   154: bipush          97
        //   156: iadd           
        //   157: sipush          128
        //   160: irem           
        //   161: putstatic       com/appsflyer/internal/AFa1eSDK.onAttributionFailure:I
        //   164: goto            233
        //   167: astore_0       
        //   168: ldc_w           "readServerResponse error"
        //   171: aload_0        
        //   172: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   175: goto            233
        //   178: astore_3       
        //   179: new             Ljava/lang/StringBuilder;
        //   182: dup            
        //   183: ldc_w           "Could not read connection response from: "
        //   186: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   189: astore          6
        //   191: aload           6
        //   193: aload_0        
        //   194: invokevirtual   java/net/URLConnection.getURL:()Ljava/net/URL;
        //   197: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   200: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   203: pop            
        //   204: aload           6
        //   206: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   209: aload_3        
        //   210: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   213: aload           4
        //   215: ifnull          223
        //   218: aload           4
        //   220: invokevirtual   java/io/Reader.close:()V
        //   223: aload           5
        //   225: ifnull          233
        //   228: aload           5
        //   230: invokevirtual   java/io/Reader.close:()V
        //   233: aload           7
        //   235: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   238: astore_0       
        //   239: new             Lorg/json/JSONObject;
        //   242: dup            
        //   243: aload_0        
        //   244: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   247: pop            
        //   248: aload_0        
        //   249: areturn        
        //   250: astore_3       
        //   251: ldc_w           "error while parsing readServerResponse"
        //   254: aload_3        
        //   255: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   258: new             Lorg/json/JSONObject;
        //   261: dup            
        //   262: invokespecial   org/json/JSONObject.<init>:()V
        //   265: astore_3       
        //   266: aload_3        
        //   267: ldc_w           "string_response"
        //   270: aload_0        
        //   271: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   274: pop            
        //   275: aload_3        
        //   276: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   279: astore_0       
        //   280: aload_0        
        //   281: areturn        
        //   282: astore_0       
        //   283: ldc_w           "RESPONSE_NOT_JSON error"
        //   286: aload_0        
        //   287: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   290: new             Lorg/json/JSONObject;
        //   293: dup            
        //   294: invokespecial   org/json/JSONObject.<init>:()V
        //   297: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   300: areturn        
        //   301: astore_0       
        //   302: aload           4
        //   304: ifnull          315
        //   307: aload           4
        //   309: invokevirtual   java/io/Reader.close:()V
        //   312: goto            315
        //   315: aload           5
        //   317: ifnull          335
        //   320: aload           5
        //   322: invokevirtual   java/io/Reader.close:()V
        //   325: goto            335
        //   328: ldc_w           "readServerResponse error"
        //   331: aload_3        
        //   332: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   335: aload_0        
        //   336: athrow         
        //   337: astore_3       
        //   338: aconst_null    
        //   339: astore          5
        //   341: goto            179
        //   344: astore_3       
        //   345: aload           6
        //   347: astore          4
        //   349: goto            179
        //   352: ldc_w           ""
        //   355: astore_3       
        //   356: goto            119
        //   359: astore_3       
        //   360: goto            328
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  12     18     337    344    Any
        //  26     31     337    344    Any
        //  34     47     337    344    Any
        //  47     58     178    179    Any
        //  73     80     344    352    Any
        //  110    116    344    352    Any
        //  119    134    344    352    Any
        //  139    141    344    352    Any
        //  141    151    167    178    Any
        //  179    213    301    337    Any
        //  218    223    167    178    Any
        //  228    233    167    178    Any
        //  239    248    250    301    Lorg/json/JSONException;
        //  266    280    282    301    Lorg/json/JSONException;
        //  307    312    359    335    Any
        //  320    325    359    335    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 178 out of bounds for length 178
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ Map values(final AFa1eSDK aFa1eSDK) {
        final int n = AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 125) % 128;
        final Map<String, Object> onResponseErrorNative = aFa1eSDK.onResponseErrorNative;
        AFa1eSDK.onAttributionFailure = (n + 47) % 128;
        return onResponseErrorNative;
    }
    
    public static Map<String, Object> values(final Map<String, Object> map) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 73) % 128;
        if (!map.containsKey("meta")) {
            final HashMap<String, Object> hashMap = new HashMap<String, Object>();
            map.put("meta", hashMap);
            return hashMap;
        }
        final int n = AFa1eSDK.onDeepLinking + 13;
        AFa1eSDK.onAttributionFailure = n % 128;
        final HashMap<String, Object> hashMap2 = map.get("meta");
        if (n % 2 == 0) {
            return hashMap2;
        }
        throw null;
    }
    
    public static void values() {
        AFa1eSDK.onResponse = 139;
    }
    
    private static void values(int valueOf, final String s, final int n, final int n2, final boolean b, final Object[] array) {
        Object charArray = s;
        if (s != null) {
            charArray = s.toCharArray();
        }
        while (true) {
            final char[] array2 = (char[])charArray;
            final Object afKeystoreWrapper = AFg1mSDK.AFKeystoreWrapper;
            // monitorenter(afKeystoreWrapper)
            while (true) {
                Label_0219: {
                    while (true) {
                        try {
                            final char[] array3 = new char[n2];
                            AFg1mSDK.AFInAppEventParameterName = 0;
                            while (true) {
                                final int afInAppEventParameterName = AFg1mSDK.AFInAppEventParameterName;
                                if (afInAppEventParameterName >= n2) {
                                    break;
                                }
                                AFg1mSDK.values = array2[afInAppEventParameterName];
                                array3[AFg1mSDK.AFInAppEventParameterName] = (char)(AFg1mSDK.values + n);
                                final int afInAppEventParameterName2 = AFg1mSDK.AFInAppEventParameterName;
                                array3[afInAppEventParameterName2] -= (char)AFa1eSDK.onResponse;
                                AFg1mSDK.AFInAppEventParameterName = afInAppEventParameterName2 + 1;
                            }
                            if (valueOf > 0) {
                                AFg1mSDK.valueOf = valueOf;
                                final char[] array4 = new char[n2];
                                System.arraycopy(array3, 0, array4, 0, n2);
                                valueOf = AFg1mSDK.valueOf;
                                System.arraycopy(array4, 0, array3, n2 - valueOf, valueOf);
                                valueOf = AFg1mSDK.valueOf;
                                System.arraycopy(array4, valueOf, array3, 0, n2 - valueOf);
                            }
                            final char[] value = array3;
                            if (!b) {
                                final String s2 = new String(value);
                                // monitorexit(afKeystoreWrapper)
                                array[0] = s2;
                                return;
                            }
                            final char[] array5 = new char[n2];
                            AFg1mSDK.AFInAppEventParameterName = 0;
                            while (true) {
                                valueOf = AFg1mSDK.AFInAppEventParameterName;
                                if (valueOf >= n2) {
                                    break Label_0219;
                                }
                                array5[valueOf] = array3[n2 - valueOf - 1];
                                AFg1mSDK.AFInAppEventParameterName = valueOf + 1;
                            }
                            // monitorexit(afKeystoreWrapper)
                            throw value;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                continue;
            }
        }
    }
    
    public final Map<String, Object> AFInAppEventParameterName(final AFa1qSDK p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //     4: invokeinterface com/appsflyer/internal/AFc1xSDK.init:()Lcom/appsflyer/internal/AFb1bSDK;
        //     9: getfield        com/appsflyer/internal/AFb1bSDK.AFInAppEventType:Landroid/content/Context;
        //    12: astore          15
        //    14: aload_0        
        //    15: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //    18: invokeinterface com/appsflyer/internal/AFc1xSDK.afWarnLog:()Lcom/appsflyer/internal/AFe1wSDK;
        //    23: getfield        com/appsflyer/internal/AFe1wSDK.AFInAppEventParameterName:Ljava/lang/String;
        //    26: astore          19
        //    28: aload_1        
        //    29: getfield        com/appsflyer/internal/AFa1qSDK.afDebugLog:Ljava/lang/String;
        //    32: astore          13
        //    34: aload_1        
        //    35: getfield        com/appsflyer/internal/AFa1qSDK.values:Ljava/util/Map;
        //    38: astore          14
        //    40: aload           14
        //    42: astore          12
        //    44: aload           14
        //    46: ifnonnull       58
        //    49: new             Ljava/util/HashMap;
        //    52: dup            
        //    53: invokespecial   java/util/HashMap.<init>:()V
        //    56: astore          12
        //    58: new             Lorg/json/JSONObject;
        //    61: dup            
        //    62: aload           12
        //    64: invokespecial   org/json/JSONObject.<init>:(Ljava/util/Map;)V
        //    67: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //    70: astore          20
        //    72: aload_1        
        //    73: getfield        com/appsflyer/internal/AFa1qSDK.afErrorLog:Ljava/lang/String;
        //    76: astore          21
        //    78: aload_0        
        //    79: aload           15
        //    81: invokevirtual   com/appsflyer/internal/AFa1eSDK.values:(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1dSDK;
        //    84: astore          14
        //    86: aload_1        
        //    87: invokevirtual   com/appsflyer/internal/AFa1qSDK.AFInAppEventParameterName:()Z
        //    90: istore          7
        //    92: aload_1        
        //    93: getfield        com/appsflyer/internal/AFa1qSDK.AFKeystoreWrapper:Ljava/util/Map;
        //    96: astore          16
        //    98: aload           15
        //   100: aload           16
        //   102: invokestatic    com/appsflyer/internal/AFa1cSDK.values:(Landroid/content/Context;Ljava/util/Map;)Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;
        //   105: pop            
        //   106: getstatic       com/appsflyer/internal/AFa1cSDK.valueOf:Ljava/lang/Boolean;
        //   109: astore          12
        //   111: aload           12
        //   113: ifnull          144
        //   116: aload           12
        //   118: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   121: ifne            144
        //   124: aload           16
        //   126: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(Ljava/util/Map;)Ljava/util/Map;
        //   129: ldc_w           "ad_ids_disabled"
        //   132: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   135: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   140: pop            
        //   141: goto            144
        //   144: new             Ljava/util/Date;
        //   147: dup            
        //   148: invokespecial   java/util/Date.<init>:()V
        //   151: invokevirtual   java/util/Date.getTime:()J
        //   154: lstore          8
        //   156: invokestatic    android/view/ViewConfiguration.getScrollBarFadeDuration:()I
        //   159: istore_2       
        //   160: iconst_0       
        //   161: invokestatic    android/view/View$MeasureSpec.getSize:(I)I
        //   164: istore_3       
        //   165: ldc_w           ""
        //   168: iconst_0       
        //   169: invokestatic    android/text/TextUtils.getOffsetAfter:(Ljava/lang/CharSequence;I)I
        //   172: istore          4
        //   174: iconst_1       
        //   175: anewarray       Ljava/lang/Object;
        //   178: astore          12
        //   180: bipush          7
        //   182: iload_2        
        //   183: bipush          16
        //   185: ishr           
        //   186: isub           
        //   187: ldc_w           "\u0003\ufffb\t\n\ufff7\u0003\u0006\ufff7\ufffc\ufff5\n\uffff"
        //   190: iload_3        
        //   191: sipush          245
        //   194: iadd           
        //   195: iload           4
        //   197: bipush          12
        //   199: iadd           
        //   200: iconst_0       
        //   201: aload           12
        //   203: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(ILjava/lang/String;IIZ[Ljava/lang/Object;)V
        //   206: aload           16
        //   208: aload           12
        //   210: iconst_0       
        //   211: aaload         
        //   212: checkcast       Ljava/lang/String;
        //   215: invokevirtual   java/lang/String.intern:()Ljava/lang/String;
        //   218: lload           8
        //   220: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   223: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   228: pop            
        //   229: aload_0        
        //   230: invokevirtual   com/appsflyer/AppsFlyerLib.isStopped:()Z
        //   233: ifne            3088
        //   236: new             Ljava/lang/StringBuilder;
        //   239: dup            
        //   240: ldc_w           "******* sendTrackingWithEvent: "
        //   243: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   246: astore          17
        //   248: iload           7
        //   250: ifeq            3081
        //   253: ldc_w           "Launch"
        //   256: astore          12
        //   258: goto            261
        //   261: aload           17
        //   263: aload           12
        //   265: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   268: pop            
        //   269: aload           17
        //   271: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   274: astore          12
        //   276: aload           12
        //   278: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //   281: goto            284
        //   284: aload_0        
        //   285: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //   288: invokeinterface com/appsflyer/internal/AFc1xSDK.onAppOpenAttributionNative:()Lcom/appsflyer/internal/AFa1bSDK;
        //   293: invokeinterface com/appsflyer/internal/AFa1bSDK.valueOf:()V
        //   298: aload           15
        //   300: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   303: aload           15
        //   305: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   308: sipush          4096
        //   311: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   314: getfield        android/content/pm/PackageInfo.requestedPermissions:[Ljava/lang/String;
        //   317: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   320: astore          12
        //   322: aload           12
        //   324: ldc_w           "android.permission.INTERNET"
        //   327: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   332: ifne            344
        //   335: ldc_w           "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
        //   338: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
        //   341: goto            344
        //   344: aload           12
        //   346: ldc_w           "android.permission.ACCESS_NETWORK_STATE"
        //   349: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   354: ifne            363
        //   357: ldc_w           "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
        //   360: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
        //   363: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   366: bipush          32
        //   368: if_icmple       401
        //   371: aload           12
        //   373: ldc_w           "com.google.android.gms.permission.AD_ID"
        //   376: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   381: ifne            401
        //   384: ldc_w           "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml"
        //   387: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
        //   390: goto            401
        //   393: ldc_w           "Exception while validation permissions. "
        //   396: aload           12
        //   398: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   401: aload_0        
        //   402: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //   405: invokeinterface com/appsflyer/internal/AFc1xSDK.AFLogger:()Lcom/appsflyer/internal/AFe1vSDK;
        //   410: astore          17
        //   412: aload           16
        //   414: ldc_w           "af_events_api"
        //   417: ldc_w           "1"
        //   420: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   425: pop            
        //   426: invokestatic    android/view/ViewConfiguration.getKeyRepeatDelay:()I
        //   429: istore_2       
        //   430: iconst_0       
        //   431: invokestatic    android/widget/ExpandableListView.getPackedPositionForGroup:(I)J
        //   434: lstore          8
        //   436: ldc_w           ""
        //   439: bipush          48
        //   441: invokestatic    android/text/TextUtils.lastIndexOf:(Ljava/lang/CharSequence;C)I
        //   444: istore_3       
        //   445: iconst_1       
        //   446: anewarray       Ljava/lang/Object;
        //   449: astore          12
        //   451: iload_2        
        //   452: bipush          16
        //   454: ishr           
        //   455: iconst_2       
        //   456: iadd           
        //   457: ldc_w           "\u0007\ufffd\ufffb\u000b\ufffa"
        //   460: lload           8
        //   462: lconst_0       
        //   463: lcmp           
        //   464: sipush          242
        //   467: iadd           
        //   468: iload_3        
        //   469: bipush          6
        //   471: iadd           
        //   472: iconst_0       
        //   473: aload           12
        //   475: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(ILjava/lang/String;IIZ[Ljava/lang/Object;)V
        //   478: aload           16
        //   480: aload           12
        //   482: iconst_0       
        //   483: aaload         
        //   484: checkcast       Ljava/lang/String;
        //   487: invokevirtual   java/lang/String.intern:()Ljava/lang/String;
        //   490: getstatic       android/os/Build.BRAND:Ljava/lang/String;
        //   493: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   498: pop            
        //   499: aload           16
        //   501: ldc_w           "device"
        //   504: getstatic       android/os/Build.DEVICE:Ljava/lang/String;
        //   507: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   512: pop            
        //   513: aload           16
        //   515: ldc_w           "product"
        //   518: getstatic       android/os/Build.PRODUCT:Ljava/lang/String;
        //   521: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   526: pop            
        //   527: aload           16
        //   529: ldc_w           "sdk"
        //   532: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   535: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   538: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   543: pop            
        //   544: aload           16
        //   546: ldc_w           "model"
        //   549: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   552: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   557: pop            
        //   558: aload           16
        //   560: ldc_w           "deviceType"
        //   563: getstatic       android/os/Build.TYPE:Ljava/lang/String;
        //   566: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   571: pop            
        //   572: aload           17
        //   574: aload           16
        //   576: invokeinterface com/appsflyer/internal/AFe1vSDK.AFInAppEventParameterName:(Ljava/util/Map;)V
        //   581: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   584: astore          18
        //   586: aload_0        
        //   587: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //   590: invokeinterface com/appsflyer/internal/AFc1xSDK.afDebugLog:()Lcom/appsflyer/internal/AFe1mSDK;
        //   595: astore          12
        //   597: iload           7
        //   599: ifeq            1017
        //   602: aload           17
        //   604: invokeinterface com/appsflyer/internal/AFe1vSDK.afRDLog:()Z
        //   609: ifeq            3104
        //   612: aload           18
        //   614: invokevirtual   com/appsflyer/AppsFlyerProperties.isOtherSdkStringDisabled:()Z
        //   617: ifne            3101
        //   620: aload           16
        //   622: ldc_w           "batteryLevel"
        //   625: aload_0        
        //   626: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //   629: invokeinterface com/appsflyer/internal/AFc1xSDK.onDeepLinkingNative:()Lcom/appsflyer/internal/AFb1eSDK;
        //   634: aload           15
        //   636: invokeinterface com/appsflyer/internal/AFb1eSDK.AFInAppEventType:(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1eSDK$AFa1ySDK;
        //   641: getfield        com/appsflyer/internal/AFb1eSDK$AFa1ySDK.AFInAppEventParameterName:F
        //   644: invokestatic    java/lang/String.valueOf:(F)Ljava/lang/String;
        //   647: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   652: pop            
        //   653: goto            656
        //   656: aload_0        
        //   657: aload           15
        //   659: invokespecial   com/appsflyer/internal/AFa1eSDK.afErrorLog:(Landroid/content/Context;)V
        //   662: aload           15
        //   664: ldc_w           Landroid/app/UiModeManager;.class
        //   667: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/Class;)Ljava/lang/Object;
        //   670: checkcast       Landroid/app/UiModeManager;
        //   673: astore          22
        //   675: aload           22
        //   677: ifnull          703
        //   680: aload           22
        //   682: invokevirtual   android/app/UiModeManager.getCurrentModeType:()I
        //   685: iconst_4       
        //   686: if_icmpne       703
        //   689: aload           16
        //   691: ldc_w           "tv"
        //   694: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   697: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   702: pop            
        //   703: aload           15
        //   705: invokestatic    com/appsflyer/internal/AFe1qSDK.AFKeystoreWrapper:(Landroid/content/Context;)Z
        //   708: ifeq            728
        //   711: aload           16
        //   713: ldc_w           "inst_app"
        //   716: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   719: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   724: pop            
        //   725: goto            728
        //   728: aload           16
        //   730: ldc_w           "timepassedsincelastlaunch"
        //   733: aload_0        
        //   734: aload           15
        //   736: invokespecial   com/appsflyer/internal/AFa1eSDK.AFLogger:(Landroid/content/Context;)J
        //   739: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   742: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   747: pop            
        //   748: aload           17
        //   750: aload           16
        //   752: invokeinterface com/appsflyer/internal/AFe1vSDK.values:(Ljava/util/Map;)V
        //   757: aload           17
        //   759: aload           16
        //   761: invokeinterface com/appsflyer/internal/AFe1vSDK.valueOf:(Ljava/util/Map;)V
        //   766: aload_0        
        //   767: getfield        com/appsflyer/internal/AFa1eSDK.onAttributionFailureNative:Ljava/lang/String;
        //   770: astore          22
        //   772: aload           22
        //   774: ifnull          790
        //   777: aload           16
        //   779: ldc_w           "phone"
        //   782: aload           22
        //   784: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   789: pop            
        //   790: aload           21
        //   792: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   795: istore          5
        //   797: iload           5
        //   799: ifne            815
        //   802: aload           16
        //   804: ldc_w           "referrer"
        //   807: aload           21
        //   809: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   814: pop            
        //   815: aload           14
        //   817: ldc_w           "extraReferrers"
        //   820: aconst_null    
        //   821: invokeinterface com/appsflyer/internal/AFb1dSDK.values:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   826: astore          21
        //   828: aload           21
        //   830: ifnull          846
        //   833: aload           16
        //   835: ldc_w           "extraReferrers"
        //   838: aload           21
        //   840: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   845: pop            
        //   846: aload           18
        //   848: aload_0        
        //   849: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //   852: invokeinterface com/appsflyer/internal/AFc1xSDK.values:()Lcom/appsflyer/internal/AFb1dSDK;
        //   857: invokevirtual   com/appsflyer/AppsFlyerProperties.getReferrer:(Lcom/appsflyer/internal/AFb1dSDK;)Ljava/lang/String;
        //   860: astore          21
        //   862: aload           21
        //   864: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   867: ifne            896
        //   870: aload           16
        //   872: ldc_w           "referrer"
        //   875: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   880: ifnonnull       896
        //   883: aload           16
        //   885: ldc_w           "referrer"
        //   888: aload           21
        //   890: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   895: pop            
        //   896: aload           12
        //   898: getfield        com/appsflyer/internal/AFe1mSDK.afWarnLog:J
        //   901: lstore          8
        //   903: lload           8
        //   905: lconst_0       
        //   906: lcmp           
        //   907: ifeq            926
        //   910: aload           16
        //   912: ldc_w           "prev_session_dur"
        //   915: lload           8
        //   917: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   920: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   925: pop            
        //   926: aload_0        
        //   927: getfield        com/appsflyer/internal/AFa1eSDK.onResponseNative:Lcom/appsflyer/internal/AFb1lSDK;
        //   930: astore          12
        //   932: aload           12
        //   934: ifnull          1028
        //   937: aload           12
        //   939: getfield        com/appsflyer/internal/AFb1lSDK.values:Ljava/util/Map;
        //   942: invokeinterface java/util/Map.isEmpty:()Z
        //   947: istore          5
        //   949: iload           5
        //   951: ifne            970
        //   954: aload           16
        //   956: ldc_w           "partner_data"
        //   959: aload           12
        //   961: getfield        com/appsflyer/internal/AFb1lSDK.values:Ljava/util/Map;
        //   964: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   969: pop            
        //   970: aload           12
        //   972: getfield        com/appsflyer/internal/AFb1lSDK.AFInAppEventParameterName:Ljava/util/Map;
        //   975: invokeinterface java/util/Map.isEmpty:()Z
        //   980: ifne            1028
        //   983: aload           16
        //   985: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(Ljava/util/Map;)Ljava/util/Map;
        //   988: ldc_w           "partner_data"
        //   991: aload           12
        //   993: getfield        com/appsflyer/internal/AFb1lSDK.AFInAppEventParameterName:Ljava/util/Map;
        //   996: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1001: pop            
        //  1002: aload           12
        //  1004: new             Ljava/util/HashMap;
        //  1007: dup            
        //  1008: invokespecial   java/util/HashMap.<init>:()V
        //  1011: putfield        com/appsflyer/internal/AFb1lSDK.AFInAppEventParameterName:Ljava/util/Map;
        //  1014: goto            1028
        //  1017: aload           17
        //  1019: aload           16
        //  1021: aload           13
        //  1023: invokeinterface com/appsflyer/internal/AFe1vSDK.valueOf:(Ljava/util/Map;Ljava/lang/String;)V
        //  1028: ldc_w           "KSAppsFlyerId"
        //  1031: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(Ljava/lang/String;)Ljava/lang/String;
        //  1034: astore          12
        //  1036: ldc_w           "KSAppsFlyerRICounter"
        //  1039: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(Ljava/lang/String;)Ljava/lang/String;
        //  1042: astore          21
        //  1044: aload           12
        //  1046: ifnull          1088
        //  1049: aload           21
        //  1051: ifnull          1088
        //  1054: aload           21
        //  1056: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1059: ifle            1088
        //  1062: aload           16
        //  1064: ldc_w           "reinstallCounter"
        //  1067: aload           21
        //  1069: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1074: pop            
        //  1075: aload           16
        //  1077: ldc_w           "originalAppsflyerId"
        //  1080: aload           12
        //  1082: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1087: pop            
        //  1088: ldc_w           "additionalCustomData"
        //  1091: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(Ljava/lang/String;)Ljava/lang/String;
        //  1094: astore          12
        //  1096: aload           12
        //  1098: ifnull          1114
        //  1101: aload           16
        //  1103: ldc_w           "customData"
        //  1106: aload           12
        //  1108: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1113: pop            
        //  1114: aload           16
        //  1116: aload_0        
        //  1117: getfield        com/appsflyer/internal/AFa1eSDK.onConversionDataFail:Lcom/appsflyer/internal/AFc1ySDK;
        //  1120: invokevirtual   com/appsflyer/internal/AFc1ySDK.afInfoLog:()Lcom/appsflyer/internal/AFb1vSDK;
        //  1123: invokevirtual   com/appsflyer/internal/AFb1vSDK.AFInAppEventParameterName:()Ljava/util/Map;
        //  1126: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //  1131: aload           18
        //  1133: ldc_w           "sdkExtension"
        //  1136: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  1139: astore          12
        //  1141: aload           12
        //  1143: ifnull          1167
        //  1146: aload           12
        //  1148: invokevirtual   java/lang/String.length:()I
        //  1151: ifle            1167
        //  1154: aload           16
        //  1156: ldc_w           "sdkExtension"
        //  1159: aload           12
        //  1161: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1166: pop            
        //  1167: aload_0        
        //  1168: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //  1171: invokeinterface com/appsflyer/internal/AFc1xSDK.AFInAppEventParameterName:()Lcom/appsflyer/internal/AFb1gSDK;
        //  1176: invokevirtual   com/appsflyer/internal/AFb1gSDK.values:()Ljava/lang/String;
        //  1179: astore          12
        //  1181: aload_0        
        //  1182: aload           15
        //  1184: invokevirtual   com/appsflyer/internal/AFa1eSDK.values:(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1dSDK;
        //  1187: aload           12
        //  1189: invokestatic    com/appsflyer/internal/AFa1eSDK.AFInAppEventType:(Lcom/appsflyer/internal/AFb1dSDK;Ljava/lang/String;)Ljava/lang/String;
        //  1192: astore          21
        //  1194: aload           21
        //  1196: ifnull          3107
        //  1199: aload           21
        //  1201: aload           12
        //  1203: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  1206: ifeq            1212
        //  1209: goto            3107
        //  1212: aload           16
        //  1214: ldc_w           "af_latestchannel"
        //  1217: aload           12
        //  1219: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1224: pop            
        //  1225: aload           17
        //  1227: invokeinterface com/appsflyer/internal/AFe1vSDK.AFInAppEventType:()Ljava/lang/String;
        //  1232: astore          12
        //  1234: aload           12
        //  1236: ifnull          1258
        //  1239: aload           16
        //  1241: ldc_w           "af_installstore"
        //  1244: aload           12
        //  1246: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //  1249: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //  1252: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1257: pop            
        //  1258: aload           17
        //  1260: invokeinterface com/appsflyer/internal/AFe1vSDK.AFLogger:()Ljava/lang/String;
        //  1265: astore          12
        //  1267: aload           12
        //  1269: ifnull          1291
        //  1272: aload           16
        //  1274: ldc_w           "af_preinstall_name"
        //  1277: aload           12
        //  1279: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //  1282: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //  1285: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1290: pop            
        //  1291: aload           17
        //  1293: invokeinterface com/appsflyer/internal/AFe1vSDK.afInfoLog:()Ljava/lang/String;
        //  1298: astore          12
        //  1300: aload           12
        //  1302: ifnull          1324
        //  1305: aload           16
        //  1307: ldc_w           "af_currentstore"
        //  1310: aload           12
        //  1312: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //  1315: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //  1318: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1323: pop            
        //  1324: aload           19
        //  1326: ifnull          1353
        //  1329: aload           19
        //  1331: invokevirtual   java/lang/String.length:()I
        //  1334: ifle            1353
        //  1337: aload           16
        //  1339: ldc_w           "appsflyerKey"
        //  1342: aload           19
        //  1344: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1349: pop            
        //  1350: goto            1393
        //  1353: aload_0        
        //  1354: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //  1357: invokeinterface com/appsflyer/internal/AFc1xSDK.afWarnLog:()Lcom/appsflyer/internal/AFe1wSDK;
        //  1362: getfield        com/appsflyer/internal/AFe1wSDK.AFInAppEventParameterName:Ljava/lang/String;
        //  1365: astore          12
        //  1367: aload           12
        //  1369: ifnull          3051
        //  1372: aload           12
        //  1374: invokevirtual   java/lang/String.length:()I
        //  1377: ifle            3051
        //  1380: aload           16
        //  1382: ldc_w           "appsflyerKey"
        //  1385: aload           12
        //  1387: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1392: pop            
        //  1393: invokestatic    com/appsflyer/internal/AFa1eSDK.AFInAppEventParameterName:()Ljava/lang/String;
        //  1396: astore          12
        //  1398: aload           12
        //  1400: ifnull          1416
        //  1403: aload           16
        //  1405: ldc_w           "appUserId"
        //  1408: aload           12
        //  1410: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1415: pop            
        //  1416: aload           18
        //  1418: ldc_w           "userEmails"
        //  1421: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //  1424: astore          12
        //  1426: aload           12
        //  1428: ifnull          1444
        //  1431: aload           16
        //  1433: ldc_w           "user_emails"
        //  1436: aload           12
        //  1438: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1443: pop            
        //  1444: aload           13
        //  1446: ifnull          1475
        //  1449: aload           16
        //  1451: ldc_w           "eventName"
        //  1454: aload           13
        //  1456: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1461: pop            
        //  1462: aload           16
        //  1464: ldc_w           "eventValue"
        //  1467: aload           20
        //  1469: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1474: pop            
        //  1475: invokestatic    com/appsflyer/internal/AFa1eSDK.afRDLog:()Ljava/lang/String;
        //  1478: ifnull          1498
        //  1481: aload           16
        //  1483: ldc_w           "appid"
        //  1486: ldc_w           "appid"
        //  1489: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(Ljava/lang/String;)Ljava/lang/String;
        //  1492: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1497: pop            
        //  1498: ldc_w           "currencyCode"
        //  1501: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(Ljava/lang/String;)Ljava/lang/String;
        //  1504: astore          12
        //  1506: aload           12
        //  1508: ifnull          1570
        //  1511: aload           12
        //  1513: invokevirtual   java/lang/String.length:()I
        //  1516: iconst_3       
        //  1517: if_icmpeq       1557
        //  1520: new             Ljava/lang/StringBuilder;
        //  1523: dup            
        //  1524: ldc_w           "WARNING: currency code should be 3 characters!!! '"
        //  1527: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1530: astore          19
        //  1532: aload           19
        //  1534: aload           12
        //  1536: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1539: pop            
        //  1540: aload           19
        //  1542: ldc_w           "' is not a legal value."
        //  1545: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1548: pop            
        //  1549: aload           19
        //  1551: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  1554: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
        //  1557: aload           16
        //  1559: ldc_w           "currency"
        //  1562: aload           12
        //  1564: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1569: pop            
        //  1570: ldc_w           "IS_UPDATE"
        //  1573: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(Ljava/lang/String;)Ljava/lang/String;
        //  1576: astore          12
        //  1578: aload           12
        //  1580: ifnull          1596
        //  1583: aload           16
        //  1585: ldc_w           "isUpdate"
        //  1588: aload           12
        //  1590: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1595: pop            
        //  1596: aload           16
        //  1598: ldc_w           "af_preinstalled"
        //  1601: aload_0        
        //  1602: aload           15
        //  1604: invokevirtual   com/appsflyer/AppsFlyerLib.isPreInstalledApp:(Landroid/content/Context;)Z
        //  1607: invokestatic    java/lang/Boolean.toString:(Z)Ljava/lang/String;
        //  1610: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1615: pop            
        //  1616: aload           18
        //  1618: ldc_w           "collectFacebookAttrId"
        //  1621: iconst_1       
        //  1622: invokevirtual   com/appsflyer/AppsFlyerProperties.getBoolean:(Ljava/lang/String;Z)Z
        //  1625: istore          5
        //  1627: iload           5
        //  1629: ifeq            1717
        //  1632: aload           15
        //  1634: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  1637: astore          12
        //  1639: aload           12
        //  1641: ldc_w           "com.facebook.katana"
        //  1644: iconst_0       
        //  1645: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //  1648: pop            
        //  1649: aload_0        
        //  1650: aload           15
        //  1652: invokevirtual   com/appsflyer/AppsFlyerLib.getAttributionId:(Landroid/content/Context;)Ljava/lang/String;
        //  1655: astore          12
        //  1657: goto            1699
        //  1660: astore          12
        //  1662: goto            1670
        //  1665: astore          12
        //  1667: goto            1681
        //  1670: ldc_w           "Exception while collecting facebook's attribution ID. "
        //  1673: aload           12
        //  1675: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1678: goto            3120
        //  1681: ldc_w           "com.facebook.katana not found"
        //  1684: aload           12
        //  1686: iconst_1       
        //  1687: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;Z)V
        //  1690: ldc_w           "Exception while collecting facebook's attribution ID. "
        //  1693: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
        //  1696: goto            3120
        //  1699: aload           12
        //  1701: ifnull          1717
        //  1704: aload           16
        //  1706: ldc_w           "fb"
        //  1709: aload           12
        //  1711: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1716: pop            
        //  1717: aload           17
        //  1719: aload           16
        //  1721: aload_0        
        //  1722: getfield        com/appsflyer/internal/AFa1eSDK.AFLogger:Ljava/lang/String;
        //  1725: invokeinterface com/appsflyer/internal/AFe1vSDK.values:(Ljava/util/Map;Ljava/lang/String;)V
        //  1730: aload_0        
        //  1731: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //  1734: invokeinterface com/appsflyer/internal/AFc1xSDK.init:()Lcom/appsflyer/internal/AFb1bSDK;
        //  1739: aload_0        
        //  1740: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //  1743: invokeinterface com/appsflyer/internal/AFc1xSDK.values:()Lcom/appsflyer/internal/AFb1dSDK;
        //  1748: invokestatic    com/appsflyer/internal/AFb1zSDK.valueOf:(Lcom/appsflyer/internal/AFb1bSDK;Lcom/appsflyer/internal/AFb1dSDK;)Ljava/lang/String;
        //  1751: astore          12
        //  1753: aload           12
        //  1755: ifnull          1809
        //  1758: aload           16
        //  1760: ldc_w           "uid"
        //  1763: aload           12
        //  1765: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1770: pop            
        //  1771: goto            1809
        //  1774: astore          12
        //  1776: new             Ljava/lang/StringBuilder;
        //  1779: dup            
        //  1780: ldc_w           "ERROR: could not get uid "
        //  1783: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1786: astore          19
        //  1788: aload           19
        //  1790: aload           12
        //  1792: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  1795: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1798: pop            
        //  1799: aload           19
        //  1801: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  1804: aload           12
        //  1806: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1809: aload           16
        //  1811: ldc_w           "lang"
        //  1814: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //  1817: invokevirtual   java/util/Locale.getDisplayLanguage:()Ljava/lang/String;
        //  1820: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1825: pop            
        //  1826: goto            1839
        //  1829: astore          12
        //  1831: ldc_w           "Exception while collecting display language name. "
        //  1834: aload           12
        //  1836: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1839: aload           16
        //  1841: ldc_w           "lang_code"
        //  1844: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //  1847: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //  1850: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1855: pop            
        //  1856: goto            1869
        //  1859: astore          12
        //  1861: ldc_w           "Exception while collecting display language code. "
        //  1864: aload           12
        //  1866: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1869: aload           16
        //  1871: ldc_w           "country"
        //  1874: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //  1877: invokevirtual   java/util/Locale.getCountry:()Ljava/lang/String;
        //  1880: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1885: pop            
        //  1886: goto            1899
        //  1889: astore          12
        //  1891: ldc_w           "Exception while collecting country name. "
        //  1894: aload           12
        //  1896: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1899: aload           17
        //  1901: aload           16
        //  1903: iload           7
        //  1905: invokeinterface com/appsflyer/internal/AFe1vSDK.AFKeystoreWrapper:(Ljava/util/Map;Z)V
        //  1910: aload           17
        //  1912: aload           16
        //  1914: invokeinterface com/appsflyer/internal/AFe1vSDK.AFInAppEventType:(Ljava/util/Map;)V
        //  1919: new             Ljava/text/SimpleDateFormat;
        //  1922: dup            
        //  1923: ldc_w           "yyyy-MM-dd_HHmmssZ"
        //  1926: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //  1929: invokespecial   java/text/SimpleDateFormat.<init>:(Ljava/lang/String;Ljava/util/Locale;)V
        //  1932: astore          12
        //  1934: aload           16
        //  1936: ldc_w           "installDate"
        //  1939: aload           12
        //  1941: aload           15
        //  1943: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  1946: aload           15
        //  1948: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  1951: iconst_0       
        //  1952: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //  1955: getfield        android/content/pm/PackageInfo.firstInstallTime:J
        //  1958: invokestatic    com/appsflyer/internal/AFa1eSDK.AFInAppEventType:(Ljava/text/SimpleDateFormat;J)Ljava/lang/String;
        //  1961: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1966: pop            
        //  1967: goto            1980
        //  1970: astore          19
        //  1972: ldc_w           "Exception while collecting install date. "
        //  1975: aload           19
        //  1977: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1980: aload           15
        //  1982: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  1985: astore          19
        //  1987: aload           15
        //  1989: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  1992: astore          20
        //  1994: aload           19
        //  1996: aload           20
        //  1998: iconst_0       
        //  1999: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //  2002: astore          19
        //  2004: aload           14
        //  2006: ldc_w           "versionCode"
        //  2009: iconst_0       
        //  2010: invokeinterface com/appsflyer/internal/AFb1dSDK.values:(Ljava/lang/String;I)I
        //  2015: istore_2       
        //  2016: aload           19
        //  2018: getfield        android/content/pm/PackageInfo.versionCode:I
        //  2021: iload_2        
        //  2022: if_icmple       2047
        //  2025: aload_0        
        //  2026: aload           15
        //  2028: invokevirtual   com/appsflyer/internal/AFa1eSDK.values:(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1dSDK;
        //  2031: ldc_w           "versionCode"
        //  2034: aload           19
        //  2036: getfield        android/content/pm/PackageInfo.versionCode:I
        //  2039: invokeinterface com/appsflyer/internal/AFb1dSDK.AFInAppEventType:(Ljava/lang/String;I)V
        //  2044: goto            2047
        //  2047: aload_0        
        //  2048: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //  2051: invokeinterface com/appsflyer/internal/AFc1xSDK.AFInAppEventParameterName:()Lcom/appsflyer/internal/AFb1gSDK;
        //  2056: astore          20
        //  2058: aload           16
        //  2060: ldc_w           "app_version_code"
        //  2063: aload           19
        //  2065: getfield        android/content/pm/PackageInfo.versionCode:I
        //  2068: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  2071: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2076: pop            
        //  2077: aload           20
        //  2079: getfield        com/appsflyer/internal/AFb1gSDK.valueOf:Lcom/appsflyer/internal/AFb1bSDK;
        //  2082: getfield        com/appsflyer/internal/AFb1bSDK.AFInAppEventType:Landroid/content/Context;
        //  2085: astore          21
        //  2087: aload           16
        //  2089: ldc_w           "app_version_name"
        //  2092: aload           21
        //  2094: aload           21
        //  2096: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  2099: invokestatic    com/appsflyer/internal/AFa1fSDK.AFKeystoreWrapper:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //  2102: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2107: pop            
        //  2108: aload           16
        //  2110: ldc_w           "targetSDKver"
        //  2113: aload           20
        //  2115: getfield        com/appsflyer/internal/AFb1gSDK.valueOf:Lcom/appsflyer/internal/AFb1bSDK;
        //  2118: getfield        com/appsflyer/internal/AFb1bSDK.AFInAppEventType:Landroid/content/Context;
        //  2121: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //  2124: getfield        android/content/pm/ApplicationInfo.targetSdkVersion:I
        //  2127: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2130: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2135: pop            
        //  2136: aload           19
        //  2138: getfield        android/content/pm/PackageInfo.firstInstallTime:J
        //  2141: lstore          8
        //  2143: aload           19
        //  2145: getfield        android/content/pm/PackageInfo.lastUpdateTime:J
        //  2148: lstore          10
        //  2150: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //  2153: astore          20
        //  2155: new             Ljava/text/SimpleDateFormat;
        //  2158: dup            
        //  2159: ldc_w           "yyyy-MM-dd_HHmmssZ"
        //  2162: aload           20
        //  2164: invokespecial   java/text/SimpleDateFormat.<init>:(Ljava/lang/String;Ljava/util/Locale;)V
        //  2167: astore          19
        //  2169: aload           16
        //  2171: ldc_w           "date1"
        //  2174: aload           19
        //  2176: new             Ljava/util/Date;
        //  2179: dup            
        //  2180: lload           8
        //  2182: invokespecial   java/util/Date.<init>:(J)V
        //  2185: invokevirtual   java/text/DateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
        //  2188: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2193: pop            
        //  2194: aload           16
        //  2196: ldc_w           "date2"
        //  2199: new             Ljava/text/SimpleDateFormat;
        //  2202: dup            
        //  2203: ldc_w           "yyyy-MM-dd_HHmmssZ"
        //  2206: aload           20
        //  2208: invokespecial   java/text/SimpleDateFormat.<init>:(Ljava/lang/String;Ljava/util/Locale;)V
        //  2211: new             Ljava/util/Date;
        //  2214: dup            
        //  2215: lload           10
        //  2217: invokespecial   java/util/Date.<init>:(J)V
        //  2220: invokevirtual   java/text/DateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
        //  2223: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2228: pop            
        //  2229: aload           17
        //  2231: aload           12
        //  2233: invokeinterface com/appsflyer/internal/AFe1vSDK.values:(Ljava/text/SimpleDateFormat;)Ljava/lang/String;
        //  2238: astore          12
        //  2240: invokestatic    android/os/Process.getElapsedCpuTime:()J
        //  2243: lstore          8
        //  2245: ldc_w           ""
        //  2248: invokestatic    android/view/KeyEvent.keyCodeFromString:(Ljava/lang/String;)I
        //  2251: istore_2       
        //  2252: ldc_w           ""
        //  2255: ldc_w           ""
        //  2258: iconst_0       
        //  2259: invokestatic    android/text/TextUtils.indexOf:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
        //  2262: istore_3       
        //  2263: iconst_1       
        //  2264: anewarray       Ljava/lang/Object;
        //  2267: astore          19
        //  2269: lload           8
        //  2271: lconst_0       
        //  2272: lcmp           
        //  2273: iconst_3       
        //  2274: iadd           
        //  2275: ldc_w           "\r\f\u0003\u0000\uffff\u000e\ufffb\uffde\u0002\ufffd\b\u000f\ufffb\uffe6\u000e"
        //  2278: iload_2        
        //  2279: sipush          241
        //  2282: iadd           
        //  2283: bipush          15
        //  2285: iload_3        
        //  2286: isub           
        //  2287: iconst_1       
        //  2288: aload           19
        //  2290: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(ILjava/lang/String;IIZ[Ljava/lang/Object;)V
        //  2293: aload           16
        //  2295: aload           19
        //  2297: iconst_0       
        //  2298: aaload         
        //  2299: checkcast       Ljava/lang/String;
        //  2302: invokevirtual   java/lang/String.intern:()Ljava/lang/String;
        //  2305: aload           12
        //  2307: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2312: pop            
        //  2313: goto            2360
        //  2316: astore          12
        //  2318: goto            3133
        //  2321: astore          12
        //  2323: goto            3133
        //  2326: astore          12
        //  2328: goto            3133
        //  2331: astore          19
        //  2333: goto            3133
        //  2336: astore          12
        //  2338: goto            2333
        //  2341: astore          12
        //  2343: goto            3133
        //  2346: astore          12
        //  2348: goto            3133
        //  2351: ldc_w           "Exception while collecting app version data "
        //  2354: aload           12
        //  2356: iconst_1       
        //  2357: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;Z)V
        //  2360: iconst_0       
        //  2361: istore          6
        //  2363: aload_0        
        //  2364: aload           15
        //  2366: invokestatic    com/appsflyer/internal/AFe1ySDK.values:(Landroid/content/Context;)Z
        //  2369: putfield        com/appsflyer/internal/AFa1eSDK.onInstallConversionFailureNative:Z
        //  2372: new             Ljava/lang/StringBuilder;
        //  2375: dup            
        //  2376: ldc_w           "didConfigureTokenRefreshService="
        //  2379: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  2382: astore          12
        //  2384: aload           12
        //  2386: aload_0        
        //  2387: getfield        com/appsflyer/internal/AFa1eSDK.onInstallConversionFailureNative:Z
        //  2390: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //  2393: pop            
        //  2394: aload           12
        //  2396: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  2399: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
        //  2402: aload_0        
        //  2403: getfield        com/appsflyer/internal/AFa1eSDK.onInstallConversionFailureNative:Z
        //  2406: ifne            2423
        //  2409: aload           16
        //  2411: ldc_w           "tokenRefreshConfigured"
        //  2414: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //  2417: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2422: pop            
        //  2423: iload           7
        //  2425: ifeq            2546
        //  2428: aload_0        
        //  2429: getfield        com/appsflyer/internal/AFa1eSDK.getLevel:Ljava/lang/String;
        //  2432: ifnull          3136
        //  2435: aload           16
        //  2437: ldc_w           "af_deeplink"
        //  2440: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2445: ifnull          2457
        //  2448: ldc_w           "Skip 'af' payload as deeplink was found by path"
        //  2451: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
        //  2454: goto            3136
        //  2457: new             Lorg/json/JSONObject;
        //  2460: dup            
        //  2461: aload_0        
        //  2462: getfield        com/appsflyer/internal/AFa1eSDK.getLevel:Ljava/lang/String;
        //  2465: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //  2468: astore          12
        //  2470: aload           12
        //  2472: ldc_w           "isPush"
        //  2475: ldc_w           "true"
        //  2478: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //  2481: pop            
        //  2482: aload           16
        //  2484: ldc_w           "af_deeplink"
        //  2487: aload           12
        //  2489: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //  2492: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2497: pop            
        //  2498: goto            3136
        //  2501: aload_0        
        //  2502: aconst_null    
        //  2503: putfield        com/appsflyer/internal/AFa1eSDK.getLevel:Ljava/lang/String;
        //  2506: aload           16
        //  2508: ldc_w           "open_referrer"
        //  2511: aload_1        
        //  2512: getfield        com/appsflyer/internal/AFa1qSDK.valueOf:Ljava/lang/String;
        //  2515: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2520: pop            
        //  2521: aload_1        
        //  2522: getfield        com/appsflyer/internal/AFa1qSDK.afInfoLog:Ljava/lang/String;
        //  2525: invokestatic    com/appsflyer/internal/AFb1uSDK.AFInAppEventType:(Ljava/lang/String;)Z
        //  2528: ifne            2546
        //  2531: aload           16
        //  2533: ldc_w           "af_web_referrer"
        //  2536: aload_1        
        //  2537: getfield        com/appsflyer/internal/AFa1qSDK.afInfoLog:Ljava/lang/String;
        //  2540: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2545: pop            
        //  2546: iload           7
        //  2548: ifne            2613
        //  2551: aload           16
        //  2553: aload_0        
        //  2554: invokevirtual   com/appsflyer/internal/AFa1eSDK.AFInAppEventType:()Lcom/appsflyer/internal/AFc1xSDK;
        //  2557: invokeinterface com/appsflyer/internal/AFc1xSDK.getLevel:()Lcom/appsflyer/internal/AFf1iSDK;
        //  2562: invokeinterface com/appsflyer/internal/AFf1iSDK.values:()Ljava/util/Map;
        //  2567: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //  2572: goto            2613
        //  2575: astore_1       
        //  2576: ldc_w           "error while getting sensors data"
        //  2579: aload_1        
        //  2580: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2583: new             Ljava/lang/StringBuilder;
        //  2586: dup            
        //  2587: ldc_w           "Unexpected exception from AFSensorManager: "
        //  2590: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  2593: astore          12
        //  2595: aload           12
        //  2597: aload_1        
        //  2598: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  2601: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2604: pop            
        //  2605: aload           12
        //  2607: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  2610: invokestatic    com/appsflyer/AFLogger.afRDLog:(Ljava/lang/String;)V
        //  2613: ldc_w           "advertiserId"
        //  2616: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(Ljava/lang/String;)Ljava/lang/String;
        //  2619: ifnonnull       2661
        //  2622: aload           15
        //  2624: aload           16
        //  2626: invokestatic    com/appsflyer/internal/AFa1cSDK.values:(Landroid/content/Context;Ljava/util/Map;)Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;
        //  2629: pop            
        //  2630: ldc_w           "advertiserId"
        //  2633: invokestatic    com/appsflyer/internal/AFa1eSDK.values:(Ljava/lang/String;)Ljava/lang/String;
        //  2636: ifnull          3139
        //  2639: iconst_1       
        //  2640: istore          5
        //  2642: goto            2645
        //  2645: aload           16
        //  2647: ldc_w           "GAID_retry"
        //  2650: iload           5
        //  2652: invokestatic    java/lang/String.valueOf:(Z)Ljava/lang/String;
        //  2655: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2660: pop            
        //  2661: aload           15
        //  2663: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //  2666: invokestatic    com/appsflyer/internal/AFa1cSDK.AFInAppEventParameterName:(Landroid/content/ContentResolver;)Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;
        //  2669: astore_1       
        //  2670: aload_1        
        //  2671: ifnull          2707
        //  2674: aload           16
        //  2676: ldc_w           "amazon_aid"
        //  2679: aload_1        
        //  2680: getfield        com/appsflyer/internal/AFc1uSDK$AFa1wSDK.valueOf:Ljava/lang/String;
        //  2683: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2688: pop            
        //  2689: aload           16
        //  2691: ldc_w           "amazon_aid_limit"
        //  2694: aload_1        
        //  2695: getfield        com/appsflyer/internal/AFc1uSDK$AFa1wSDK.AFInAppEventType:Ljava/lang/Boolean;
        //  2698: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  2701: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2706: pop            
        //  2707: aload           16
        //  2709: ldc_w           "registeredUninstall"
        //  2712: aload           14
        //  2714: invokestatic    com/appsflyer/internal/AFe1ySDK.AFInAppEventType:(Lcom/appsflyer/internal/AFb1dSDK;)Z
        //  2717: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2720: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2725: pop            
        //  2726: aload_0        
        //  2727: aload           14
        //  2729: iload           7
        //  2731: invokevirtual   com/appsflyer/internal/AFa1eSDK.valueOf:(Lcom/appsflyer/internal/AFb1dSDK;Z)I
        //  2734: istore_2       
        //  2735: aload           16
        //  2737: ldc_w           "counter"
        //  2740: iload_2        
        //  2741: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  2744: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2749: pop            
        //  2750: iload           6
        //  2752: istore          5
        //  2754: aload           13
        //  2756: ifnull          2762
        //  2759: iconst_1       
        //  2760: istore          5
        //  2762: aload           16
        //  2764: ldc_w           "iaecounter"
        //  2767: aload_0        
        //  2768: aload           14
        //  2770: iload           5
        //  2772: invokespecial   com/appsflyer/internal/AFa1eSDK.values:(Lcom/appsflyer/internal/AFb1dSDK;Z)I
        //  2775: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  2778: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2783: pop            
        //  2784: iload           7
        //  2786: ifeq            2800
        //  2789: iload_2        
        //  2790: iconst_1       
        //  2791: if_icmpne       2800
        //  2794: aload           18
        //  2796: iconst_1       
        //  2797: putfield        com/appsflyer/AppsFlyerProperties.AFInAppEventParameterName:Z
        //  2800: aload           16
        //  2802: ldc_w           "isFirstCall"
        //  2805: aload           17
        //  2807: invokeinterface com/appsflyer/internal/AFe1vSDK.afDebugLog:()Z
        //  2812: iconst_1       
        //  2813: ixor           
        //  2814: invokestatic    java/lang/Boolean.toString:(Z)Ljava/lang/String;
        //  2817: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2822: pop            
        //  2823: aload           17
        //  2825: iload           7
        //  2827: aload           16
        //  2829: iload_2        
        //  2830: invokeinterface com/appsflyer/internal/AFe1vSDK.AFInAppEventType:(ZLjava/util/Map;I)V
        //  2835: aload           16
        //  2837: ldc_w           "ivc"
        //  2840: aload           17
        //  2842: invokeinterface com/appsflyer/internal/AFe1vSDK.afErrorLog:()Z
        //  2847: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2850: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2855: pop            
        //  2856: aload           14
        //  2858: ldc_w           "is_stop_tracking_used"
        //  2861: invokeinterface com/appsflyer/internal/AFb1dSDK.values:(Ljava/lang/String;)Z
        //  2866: ifeq            2893
        //  2869: aload           16
        //  2871: ldc_w           "istu"
        //  2874: aload           14
        //  2876: ldc_w           "is_stop_tracking_used"
        //  2879: invokeinterface com/appsflyer/internal/AFb1dSDK.valueOf:(Ljava/lang/String;)Z
        //  2884: invokestatic    java/lang/String.valueOf:(Z)Ljava/lang/String;
        //  2887: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2892: pop            
        //  2893: new             Ljava/util/HashMap;
        //  2896: dup            
        //  2897: invokespecial   java/util/HashMap.<init>:()V
        //  2900: astore_1       
        //  2901: aload_1        
        //  2902: ldc_w           "mcc"
        //  2905: aload           15
        //  2907: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //  2910: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //  2913: getfield        android/content/res/Configuration.mcc:I
        //  2916: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2919: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2924: pop            
        //  2925: aload_1        
        //  2926: ldc_w           "mnc"
        //  2929: aload           15
        //  2931: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //  2934: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //  2937: getfield        android/content/res/Configuration.mnc:I
        //  2940: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2943: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2948: pop            
        //  2949: aload           16
        //  2951: ldc_w           "cell"
        //  2954: aload_1        
        //  2955: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2960: pop            
        //  2961: aload           16
        //  2963: ldc_w           "sig"
        //  2966: aload           17
        //  2968: invokeinterface com/appsflyer/internal/AFe1vSDK.AFKeystoreWrapper:()Ljava/lang/String;
        //  2973: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2978: pop            
        //  2979: aload           16
        //  2981: ldc_w           "last_boot_time"
        //  2984: aload           17
        //  2986: invokeinterface com/appsflyer/internal/AFe1vSDK.values:()J
        //  2991: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2994: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2999: pop            
        //  3000: aload           16
        //  3002: ldc_w           "disk"
        //  3005: aload           17
        //  3007: invokeinterface com/appsflyer/internal/AFe1vSDK.AFInAppEventParameterName:()Ljava/lang/String;
        //  3012: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3017: pop            
        //  3018: aload_0        
        //  3019: getfield        com/appsflyer/internal/AFa1eSDK.afInfoLog:Lcom/appsflyer/internal/AFa1cSDK;
        //  3022: astore_1       
        //  3023: aload_1        
        //  3024: ifnull          3074
        //  3027: aload_1        
        //  3028: getfield        com/appsflyer/internal/AFa1cSDK.AFInAppEventType:[Ljava/lang/String;
        //  3031: astore_1       
        //  3032: aload_1        
        //  3033: ifnull          3074
        //  3036: aload           16
        //  3038: ldc_w           "sharing_filter"
        //  3041: aload_1        
        //  3042: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3047: pop            
        //  3048: aload           16
        //  3050: areturn        
        //  3051: ldc_w           "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. "
        //  3054: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //  3057: ldc_w           "AppsFlyer will not track this event."
        //  3060: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //  3063: aconst_null    
        //  3064: areturn        
        //  3065: aload_1        
        //  3066: invokevirtual   java/lang/Throwable.getLocalizedMessage:()Ljava/lang/String;
        //  3069: aload_1        
        //  3070: iconst_1       
        //  3071: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;Z)V
        //  3074: aload           16
        //  3076: areturn        
        //  3077: astore_1       
        //  3078: goto            3065
        //  3081: aload           13
        //  3083: astore          12
        //  3085: goto            261
        //  3088: ldc_w           "Reporting has been stopped"
        //  3091: astore          12
        //  3093: goto            276
        //  3096: astore          12
        //  3098: goto            393
        //  3101: goto            656
        //  3104: goto            728
        //  3107: aload           21
        //  3109: ifnonnull       1225
        //  3112: aload           12
        //  3114: ifnull          1225
        //  3117: goto            1212
        //  3120: aconst_null    
        //  3121: astore          12
        //  3123: goto            1699
        //  3126: astore          12
        //  3128: goto            1681
        //  3131: astore          12
        //  3133: goto            2351
        //  3136: goto            2501
        //  3139: iconst_0       
        //  3140: istore          5
        //  3142: goto            2645
        //    Signature:
        //  (Lcom/appsflyer/internal/AFa1qSDK;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  229    248    3077   3074   Any
        //  261    276    3077   3074   Any
        //  276    281    3077   3074   Any
        //  284    298    3077   3074   Any
        //  298    341    3096   401    Ljava/lang/Exception;
        //  298    341    3077   3074   Any
        //  344    363    3096   401    Ljava/lang/Exception;
        //  344    363    3077   3074   Any
        //  363    390    3096   401    Ljava/lang/Exception;
        //  363    390    3077   3074   Any
        //  393    401    3077   3074   Any
        //  401    597    3077   3074   Any
        //  602    653    3077   3074   Any
        //  656    675    3077   3074   Any
        //  680    703    3077   3074   Any
        //  703    725    3077   3074   Any
        //  728    772    3077   3074   Any
        //  777    790    3077   3074   Any
        //  790    797    3077   3074   Any
        //  802    815    3077   3074   Any
        //  815    828    3077   3074   Any
        //  833    846    3077   3074   Any
        //  846    896    3077   3074   Any
        //  896    903    3077   3074   Any
        //  910    926    3077   3074   Any
        //  926    932    3077   3074   Any
        //  937    949    3077   3074   Any
        //  954    970    3077   3074   Any
        //  970    1014   3077   3074   Any
        //  1017   1028   3077   3074   Any
        //  1028   1044   3077   3074   Any
        //  1054   1088   3077   3074   Any
        //  1088   1096   3077   3074   Any
        //  1101   1114   3077   3074   Any
        //  1114   1141   3077   3074   Any
        //  1146   1167   3077   3074   Any
        //  1167   1194   3077   3074   Any
        //  1199   1209   3077   3074   Any
        //  1212   1225   3077   3074   Any
        //  1225   1234   3077   3074   Any
        //  1239   1258   3077   3074   Any
        //  1258   1267   3077   3074   Any
        //  1272   1291   3077   3074   Any
        //  1291   1300   3077   3074   Any
        //  1305   1324   3077   3074   Any
        //  1329   1350   3077   3074   Any
        //  1353   1367   3077   3074   Any
        //  1372   1393   3077   3074   Any
        //  1393   1398   3077   3074   Any
        //  1403   1416   3077   3074   Any
        //  1416   1426   3077   3074   Any
        //  1431   1444   3077   3074   Any
        //  1449   1475   3077   3074   Any
        //  1475   1498   3077   3074   Any
        //  1498   1506   3077   3074   Any
        //  1511   1557   3077   3074   Any
        //  1557   1570   3077   3074   Any
        //  1570   1578   3077   3074   Any
        //  1583   1596   3077   3074   Any
        //  1596   1627   3077   3074   Any
        //  1632   1639   3126   3131   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1632   1639   1660   1681   Any
        //  1639   1657   1665   1670   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1639   1657   1660   1681   Any
        //  1670   1678   3077   3074   Any
        //  1681   1696   3077   3074   Any
        //  1704   1717   3077   3074   Any
        //  1717   1730   3077   3074   Any
        //  1730   1753   1774   1809   Ljava/lang/Exception;
        //  1730   1753   3077   3074   Any
        //  1758   1771   1774   1809   Ljava/lang/Exception;
        //  1758   1771   3077   3074   Any
        //  1776   1809   3077   3074   Any
        //  1809   1826   1829   1839   Ljava/lang/Exception;
        //  1809   1826   3077   3074   Any
        //  1831   1839   3077   3074   Any
        //  1839   1856   1859   1869   Ljava/lang/Exception;
        //  1839   1856   3077   3074   Any
        //  1861   1869   3077   3074   Any
        //  1869   1886   1889   1899   Ljava/lang/Exception;
        //  1869   1886   3077   3074   Any
        //  1891   1899   3077   3074   Any
        //  1899   1934   3077   3074   Any
        //  1934   1967   1970   1980   Ljava/lang/Exception;
        //  1934   1967   3077   3074   Any
        //  1972   1980   3077   3074   Any
        //  1980   1994   3131   3133   Any
        //  1994   2016   2346   2351   Any
        //  2016   2044   3131   3133   Any
        //  2047   2136   3131   3133   Any
        //  2136   2143   2341   2346   Any
        //  2143   2150   2336   2341   Any
        //  2150   2169   2326   2331   Any
        //  2169   2252   2321   2326   Any
        //  2252   2263   2316   2321   Any
        //  2263   2293   2321   2326   Any
        //  2293   2313   2316   2321   Any
        //  2351   2360   3077   3074   Any
        //  2363   2423   3077   3074   Any
        //  2428   2454   3077   3074   Any
        //  2457   2498   3077   3074   Any
        //  2501   2546   3077   3074   Any
        //  2551   2572   2575   2613   Ljava/lang/Exception;
        //  2551   2572   3077   3074   Any
        //  2576   2613   3077   3074   Any
        //  2613   2639   3077   3074   Any
        //  2645   2661   3077   3074   Any
        //  2661   2670   3077   3074   Any
        //  2674   2707   3077   3074   Any
        //  2707   2750   3077   3074   Any
        //  2762   2784   3077   3074   Any
        //  2794   2800   3077   3074   Any
        //  2800   2893   3077   3074   Any
        //  2893   3023   3077   3074   Any
        //  3027   3032   3077   3074   Any
        //  3036   3048   3077   3074   Any
        //  3051   3063   3077   3074   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 1254 out of bounds for length 1254
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final AFc1xSDK AFInAppEventType() {
        final int onDeepLinking = AFa1eSDK.onDeepLinking;
        final AFc1ySDK onConversionDataFail = this.onConversionDataFail;
        final int n = onDeepLinking + 5;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {}
        return onConversionDataFail;
    }
    
    public final void AFInAppEventType(final Context context, final Intent intent) {
        final int n = AFa1eSDK.onDeepLinking + 71;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            if (intent.getStringExtra("appsflyer_preinstall") != null) {
                AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 23) % 128;
                AFKeystoreWrapper(intent.getStringExtra("appsflyer_preinstall"));
                AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 59) % 128;
            }
            com.appsflyer.AFLogger.afInfoLog("****** onReceive called *******");
            AppsFlyerProperties.getInstance();
            final String stringExtra = intent.getStringExtra("referrer");
            com.appsflyer.AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra)));
            if (stringExtra != null) {
                this.values(context).AFInAppEventParameterName("referrer", stringExtra);
                final AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
                instance.set("AF_REFERRER", stringExtra);
                instance.AFKeystoreWrapper = stringExtra;
                if (AppsFlyerProperties.getInstance().AFInAppEventType()) {
                    com.appsflyer.AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    this.AFInAppEventType(context, AFe1nSDK.AFInAppEventParameterName);
                    this.AFKeystoreWrapper(context, stringExtra);
                }
            }
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 29) % 128;
            return;
        }
        intent.getStringExtra("appsflyer_preinstall");
        throw null;
    }
    
    public final void AFInAppEventType(final Context context, final String obj) {
        while (true) {
            com.appsflyer.AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(obj)));
            while (true) {
                JSONObject jsonObject2 = null;
                Label_0275: {
                    while (true) {
                        try {
                            final long currentTimeMillis = System.currentTimeMillis();
                            final String values = this.values(context).values("extraReferrers", null);
                            if (values == null) {
                                final JSONObject jsonObject = new JSONObject();
                                final JSONArray jsonArray = new JSONArray();
                                if (jsonArray.length() < 5L) {
                                    jsonArray.put(currentTimeMillis);
                                }
                                if (jsonObject.length() >= 4L) {
                                    AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 53) % 128;
                                    valueOf(jsonObject);
                                    AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 1) % 128;
                                }
                                jsonObject.put(obj, (Object)jsonArray.toString());
                                this.values(context).AFInAppEventParameterName("extraReferrers", jsonObject.toString());
                                return;
                            }
                            jsonObject2 = new JSONObject(values);
                            if (jsonObject2.has(obj)) {
                                final JSONArray jsonArray2 = new JSONArray((String)jsonObject2.get(obj));
                                break Label_0275;
                            }
                            final JSONArray jsonArray3 = new JSONArray();
                            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 49) % 128;
                            break Label_0275;
                            final Throwable t;
                            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", t);
                            return;
                        }
                        catch (JSONException ex) {}
                        final JSONException ex;
                        final Throwable t = (Throwable)ex;
                        continue;
                    }
                }
                final JSONArray jsonArray4;
                final JSONArray jsonArray = jsonArray4;
                final JSONObject jsonObject = jsonObject2;
                continue;
            }
        }
    }
    
    public final void AFKeystoreWrapper(@NonNull final Context context) {
        final int n = AFa1eSDK.onAttributionFailure + 39;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            final AFc1ySDK onConversionDataFail = this.onConversionDataFail;
            if (context != null) {
                final AFb1bSDK valueOf = onConversionDataFail.valueOf;
                if (context != null) {
                    valueOf.AFInAppEventType = context.getApplicationContext();
                    AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 91) % 128;
                }
            }
            return;
        }
        throw null;
    }
    
    public final void AFKeystoreWrapper(final WeakReference<Context> weakReference) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 3) % 128;
        if (weakReference.get() == null) {
            return;
        }
        com.appsflyer.AFLogger.afInfoLog("app went to background");
        final AFb1dSDK values = this.values(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(values);
        final long afWarnLog = this.AFInAppEventType().afDebugLog().afWarnLog;
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final String afInAppEventParameterName = this.AFInAppEventType().afWarnLog().AFInAppEventParameterName;
        if (afInAppEventParameterName == null) {
            com.appsflyer.AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        final String values2 = values("KSAppsFlyerId");
        if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
            hashMap.put("deviceTrackingDisabled", "true");
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 57) % 128;
        }
        final AFc1uSDK.AFa1wSDK afInAppEventParameterName2 = AFa1cSDK.AFInAppEventParameterName(weakReference.get().getContentResolver());
        if (afInAppEventParameterName2 != null) {
            hashMap.put("amazon_aid", afInAppEventParameterName2.valueOf);
            hashMap.put("amazon_aid_limit", String.valueOf(afInAppEventParameterName2.AFInAppEventType));
        }
        final String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            hashMap.put("advertiserId", string);
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 105) % 128;
        }
        hashMap.put("app_id", weakReference.get().getPackageName());
        hashMap.put("devkey", afInAppEventParameterName);
        hashMap.put("uid", AFb1zSDK.valueOf(this.AFInAppEventType().init(), this.AFInAppEventType().values()));
        hashMap.put("time_in_app", String.valueOf(afWarnLog));
        hashMap.put("statType", "user_closed_app");
        hashMap.put("platform", "Android");
        hashMap.put("launch_counter", Integer.toString(this.valueOf(values, false)));
        hashMap.put("channel", this.AFInAppEventType().AFInAppEventParameterName().values());
        String s;
        if (values2 != null) {
            s = values2;
        }
        else {
            s = "";
        }
        hashMap.put("originalAppsflyerId", s);
        if (this.AppsFlyer2dXConversionCallback) {
            final AFe1bSDK aFe1bSDK = new AFe1bSDK();
            aFe1bSDK.afErrorLogForExcManagerOnly = this.isStopped();
            final AFd1hSDK aFd1hSDK = new AFd1hSDK(aFe1bSDK.AFInAppEventParameterName(this.AFInAppEventType().AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0)).values(hashMap).AFKeystoreWrapper(String.format(AFa1eSDK.afErrorLog, AppsFlyerLib.getInstance().getHostPrefix(), valueOf().getHostName())), this.AFInAppEventType());
            final AFc1bSDK afVersionDeclaration = this.AFInAppEventType().AFVersionDeclaration();
            afVersionDeclaration.AFKeystoreWrapper.execute(new Runnable() {
                private /* synthetic */ AFd1zSDK AFInAppEventType;
                
                @Override
                public final void run() {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     1: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //     4: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //     7: astore          6
                    //     9: aload           6
                    //    11: monitorenter   
                    //    12: aload_0        
                    //    13: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    16: getfield        com/appsflyer/internal/AFc1bSDK.afErrorLog:Ljava/util/Set;
                    //    19: aload_0        
                    //    20: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    23: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    28: ifeq            64
                    //    31: new             Ljava/lang/StringBuilder;
                    //    34: dup            
                    //    35: ldc             "QUEUE: tried to add already running task: "
                    //    37: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //    40: astore          7
                    //    42: aload           7
                    //    44: aload_0        
                    //    45: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //    51: pop            
                    //    52: aload           7
                    //    54: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //    57: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //    60: aload           6
                    //    62: monitorexit    
                    //    63: return         
                    //    64: aload_0        
                    //    65: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    68: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //    71: aload_0        
                    //    72: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    75: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    80: ifne            676
                    //    83: aload_0        
                    //    84: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    87: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //    90: aload_0        
                    //    91: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    94: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    99: ifeq            105
                    //   102: goto            676
                    //   105: aload_0        
                    //   106: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   109: astore          7
                    //   111: aload_0        
                    //   112: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   115: astore          8
                    //   117: aload           8
                    //   119: getfield        com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:Ljava/util/Set;
                    //   122: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
                    //   127: astore          9
                    //   129: aload           9
                    //   131: invokeinterface java/util/Iterator.hasNext:()Z
                    //   136: ifeq            182
                    //   139: aload           9
                    //   141: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   146: checkcast       Lcom/appsflyer/internal/AFd1vSDK;
                    //   149: astore          10
                    //   151: aload           7
                    //   153: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                    //   156: aload           10
                    //   158: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //   163: ifeq            129
                    //   166: aload           8
                    //   168: getfield        com/appsflyer/internal/AFd1zSDK.AFInAppEventParameterName:Ljava/util/Set;
                    //   171: aload           10
                    //   173: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   178: pop            
                    //   179: goto            129
                    //   182: aload_0        
                    //   183: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   186: aload_0        
                    //   187: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   190: invokestatic    com/appsflyer/internal/AFc1bSDK.values:(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)Z
                    //   193: ifeq            217
                    //   196: aload_0        
                    //   197: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   200: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   203: aload_0        
                    //   204: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   207: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   212: istore          4
                    //   214: goto            284
                    //   217: aload_0        
                    //   218: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   221: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   224: aload_0        
                    //   225: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   228: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   233: istore          5
                    //   235: iload           5
                    //   237: istore          4
                    //   239: iload           5
                    //   241: ifeq            284
                    //   244: new             Ljava/lang/StringBuilder;
                    //   247: dup            
                    //   248: ldc             "QUEUE: new task was blocked: "
                    //   250: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   253: astore          7
                    //   255: aload           7
                    //   257: aload_0        
                    //   258: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   264: pop            
                    //   265: aload           7
                    //   267: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   270: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   273: aload_0        
                    //   274: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   277: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:()V
                    //   280: iload           5
                    //   282: istore          4
                    //   284: iload           4
                    //   286: ifeq            326
                    //   289: aload_0        
                    //   290: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   293: astore          7
                    //   295: aload           7
                    //   297: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   300: aload           7
                    //   302: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                    //   305: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
                    //   310: pop            
                    //   311: aload_0        
                    //   312: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   315: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                    //   318: invokeinterface java/util/List.clear:()V
                    //   323: goto            355
                    //   326: new             Ljava/lang/StringBuilder;
                    //   329: dup            
                    //   330: ldc             "QUEUE: task not added, it's already in the queue: "
                    //   332: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   335: astore          7
                    //   337: aload           7
                    //   339: aload_0        
                    //   340: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   346: pop            
                    //   347: aload           7
                    //   349: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   352: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   355: aload           6
                    //   357: monitorexit    
                    //   358: iload           4
                    //   360: ifeq            646
                    //   363: aload_0        
                    //   364: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   367: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                    //   370: aload_0        
                    //   371: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   374: getfield        com/appsflyer/internal/AFd1zSDK.values:Lcom/appsflyer/internal/AFd1vSDK;
                    //   377: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   382: pop            
                    //   383: new             Ljava/lang/StringBuilder;
                    //   386: dup            
                    //   387: ldc             "QUEUE: new task added: "
                    //   389: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   392: astore          6
                    //   394: aload           6
                    //   396: aload_0        
                    //   397: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   400: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   403: pop            
                    //   404: aload           6
                    //   406: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   409: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   412: aload_0        
                    //   413: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   416: getfield        com/appsflyer/internal/AFc1bSDK.values:Ljava/util/List;
                    //   419: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                    //   424: astore          6
                    //   426: aload           6
                    //   428: invokeinterface java/util/Iterator.hasNext:()Z
                    //   433: ifeq            451
                    //   436: aload           6
                    //   438: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   443: checkcast       Lcom/appsflyer/internal/AFc1cSDK;
                    //   446: astore          7
                    //   448: goto            426
                    //   451: aload_0        
                    //   452: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   455: astore          6
                    //   457: aload           6
                    //   459: getfield        com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;
                    //   462: aload           6
                    //   464: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
                    //   469: pop            
                    //   470: aload_0        
                    //   471: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   474: astore          8
                    //   476: aload           8
                    //   478: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   481: astore          7
                    //   483: aload           7
                    //   485: monitorenter   
                    //   486: aload           8
                    //   488: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   491: invokeinterface java/util/Set.size:()I
                    //   496: aload           8
                    //   498: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   501: invokeinterface java/util/Set.size:()I
                    //   506: iadd           
                    //   507: bipush          40
                    //   509: isub           
                    //   510: istore_1       
                    //   511: iload_1        
                    //   512: ifle            636
                    //   515: aload           8
                    //   517: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   520: invokeinterface java/util/Set.isEmpty:()Z
                    //   525: iconst_1       
                    //   526: ixor           
                    //   527: istore_2       
                    //   528: aload           8
                    //   530: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   533: invokeinterface java/util/Set.isEmpty:()Z
                    //   538: iconst_1       
                    //   539: ixor           
                    //   540: istore_3       
                    //   541: iload_3        
                    //   542: ifeq            608
                    //   545: iload_2        
                    //   546: ifeq            608
                    //   549: aload           8
                    //   551: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   554: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                    //   559: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                    //   562: aload           8
                    //   564: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   567: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                    //   572: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                    //   575: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:(Lcom/appsflyer/internal/AFd1zSDK;)I
                    //   578: ifle            598
                    //   581: aload           8
                    //   583: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   586: astore          6
                    //   588: aload           8
                    //   590: aload           6
                    //   592: invokevirtual   com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:(Ljava/util/NavigableSet;)V
                    //   595: goto            725
                    //   598: aload           8
                    //   600: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   603: astore          6
                    //   605: goto            588
                    //   608: iload_3        
                    //   609: ifeq            622
                    //   612: aload           8
                    //   614: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   617: astore          6
                    //   619: goto            588
                    //   622: iload_2        
                    //   623: ifeq            725
                    //   626: aload           8
                    //   628: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   631: astore          6
                    //   633: goto            588
                    //   636: aload           7
                    //   638: monitorexit    
                    //   639: return         
                    //   640: aload           7
                    //   642: monitorexit    
                    //   643: aload           6
                    //   645: athrow         
                    //   646: new             Ljava/lang/StringBuilder;
                    //   649: dup            
                    //   650: ldc             "QUEUE: tried to add already pending task: "
                    //   652: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   655: astore          6
                    //   657: aload           6
                    //   659: aload_0        
                    //   660: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   663: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   666: pop            
                    //   667: aload           6
                    //   669: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   672: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
                    //   675: return         
                    //   676: new             Ljava/lang/StringBuilder;
                    //   679: dup            
                    //   680: ldc             "QUEUE: tried to add already scheduled task: "
                    //   682: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   685: astore          7
                    //   687: aload           7
                    //   689: aload_0        
                    //   690: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   693: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   696: pop            
                    //   697: aload           7
                    //   699: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   702: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   705: aload           6
                    //   707: monitorexit    
                    //   708: return         
                    //   709: aload           6
                    //   711: monitorexit    
                    //   712: aload           7
                    //   714: athrow         
                    //   715: astore          7
                    //   717: goto            709
                    //   720: astore          6
                    //   722: goto            640
                    //   725: iload_1        
                    //   726: iconst_1       
                    //   727: isub           
                    //   728: istore_1       
                    //   729: goto            511
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type
                    //  -----  -----  -----  -----  ----
                    //  12     63     715    720    Any
                    //  64     102    715    720    Any
                    //  105    129    715    720    Any
                    //  129    179    715    720    Any
                    //  182    214    715    720    Any
                    //  217    235    715    720    Any
                    //  244    280    715    720    Any
                    //  289    323    715    720    Any
                    //  326    355    715    720    Any
                    //  355    358    715    720    Any
                    //  486    511    720    646    Any
                    //  515    541    720    646    Any
                    //  549    588    720    646    Any
                    //  588    595    720    646    Any
                    //  598    605    720    646    Any
                    //  612    619    720    646    Any
                    //  626    633    720    646    Any
                    //  636    639    720    646    Any
                    //  676    708    715    720    Any
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.IllegalStateException: Expression is linked from several locations: Label_0511:
                    //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                    //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
                    //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
                    // 
                    throw new IllegalStateException("An error occurred while decompiling this method.");
                }
            });
            return;
        }
        com.appsflyer.AFLogger.afDebugLog("Stats call is disabled, ignore ...");
        final int n = AFa1eSDK.onDeepLinking + 99;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {}
    }
    
    public final boolean AFKeystoreWrapper() {
        final int n = AFa1eSDK.onDeepLinking + 93;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {
            if (!valueOf("waitForCustomerId", false)) {
                return false;
            }
        }
        else if (valueOf("waitForCustomerId", false) ^ true) {
            return false;
        }
        final int n2 = AFa1eSDK.onAttributionFailure + 67;
        AFa1eSDK.onDeepLinking = n2 % 128;
        if (n2 % 2 == 0) {
            if (AFInAppEventParameterName() == null) {
                return true;
            }
        }
        else if (AFInAppEventParameterName() == null) {
            return true;
        }
        return false;
    }
    
    @Override
    public final void addPushNotificationDeepLinkPath(final String... a) {
        final int n = AFa1eSDK.onDeepLinking + 95;
        AFa1eSDK.onAttributionFailure = n % 128;
        final List<String> list = Arrays.asList(a);
        if (n % 2 == 0) {
            final List<List<String>> afInAppEventType = this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType;
            if (!afInAppEventType.contains(list)) {
                afInAppEventType.add(list);
                AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 23) % 128;
            }
            return;
        }
        this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType.contains(list);
        throw null;
    }
    
    @Override
    public final void anonymizeUser(final boolean b) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 99) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("anonymizeUser", new String[] { String.valueOf(b) });
        AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", b);
        final int n = AFa1eSDK.onDeepLinking + 5;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {}
    }
    
    @Override
    public final void appendParametersToDeepLinkingURL(final String s, final Map<String, String> map) {
        final int n = AFa1eSDK.onDeepLinking + 1;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {
            final AFb1sSDK appsFlyer2dXConversionCallback = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
            appsFlyer2dXConversionCallback.AFKeystoreWrapper = s;
            appsFlyer2dXConversionCallback.values = map;
            return;
        }
        final AFb1sSDK appsFlyer2dXConversionCallback2 = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
        appsFlyer2dXConversionCallback2.AFKeystoreWrapper = s;
        appsFlyer2dXConversionCallback2.values = map;
    }
    
    @Override
    public final void enableFacebookDeferredApplinks(final boolean onDeepLinkingNative) {
        final int onAttributionFailure = AFa1eSDK.onAttributionFailure;
        this.onDeepLinkingNative = onDeepLinkingNative;
        AFa1eSDK.onDeepLinking = (onAttributionFailure + 33) % 128;
    }
    
    @Override
    public final String getAppsFlyerUID(@NonNull final Context context) {
        final int n = AFa1eSDK.onAttributionFailure + 105;
        AFa1eSDK.onDeepLinking = n % 128;
        Label_0099: {
            if (n % 2 == 0) {
                this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("getAppsFlyerUID", new String[0]);
                if (context != null) {
                    break Label_0099;
                }
            }
            else {
                this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("getAppsFlyerUID", new String[0]);
                if (context != null) {
                    break Label_0099;
                }
            }
            final int n2 = AFa1eSDK.onDeepLinking + 11;
            AFa1eSDK.onAttributionFailure = n2 % 128;
            if (n2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        this.AFKeystoreWrapper(context);
        final AFb1gSDK afInAppEventParameterName = this.AFInAppEventType().AFInAppEventParameterName();
        return AFb1zSDK.valueOf(afInAppEventParameterName.valueOf, afInAppEventParameterName.AFInAppEventType);
    }
    
    @Override
    public final String getAttributionId(final Context context) {
        try {
            final String afInAppEventType = new AFa1dSDK(context, this.AFInAppEventType()).AFInAppEventType();
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 19) % 128;
            return afInAppEventType;
        }
        finally {
            final Throwable t;
            com.appsflyer.AFLogger.afErrorLog("Could not collect facebook attribution id. ", t);
            return null;
        }
    }
    
    @Override
    public final String getHostName() {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 63) % 128;
        final String afInAppEventParameterName = this.AFInAppEventType().onInstallConversionFailureNative().AFInAppEventParameterName();
        final int n = AFa1eSDK.onAttributionFailure + 83;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            return afInAppEventParameterName;
        }
        throw null;
    }
    
    @Override
    public final String getHostPrefix() {
        final int n = AFa1eSDK.onDeepLinking + 51;
        AFa1eSDK.onAttributionFailure = n % 128;
        String s;
        if (n % 2 != 0) {
            s = this.AFInAppEventType().onInstallConversionFailureNative().valueOf();
        }
        else {
            s = this.AFInAppEventType().onInstallConversionFailureNative().valueOf();
        }
        final int n2 = AFa1eSDK.onAttributionFailure + 119;
        AFa1eSDK.onDeepLinking = n2 % 128;
        if (n2 % 2 != 0) {
            return s;
        }
        throw null;
    }
    
    @Override
    public final String getOutOfStore(final Context context) {
        final int n = AFa1eSDK.onDeepLinking + 45;
        AFa1eSDK.onAttributionFailure = n % 128;
        Label_0076: {
            String s;
            if (n % 2 != 0) {
                final String string = AppsFlyerProperties.getInstance().getString("api_store_value");
                if (string == null) {
                    break Label_0076;
                }
                s = string;
            }
            else {
                final String string2 = AppsFlyerProperties.getInstance().getString("api_store_value");
                if (string2 == null) {
                    break Label_0076;
                }
                s = string2;
            }
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 93) % 128;
            return s;
        }
        final String values = this.values(context, "AF_STORE");
        if (values != null) {
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 55) % 128;
            return values;
        }
        com.appsflyer.AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }
    
    @Override
    public final String getSdkVersion() {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 91) % 128;
        final AFc1xSDK afInAppEventType = this.AFInAppEventType();
        afInAppEventType.afErrorLogForExcManagerOnly().AFInAppEventParameterName("getSdkVersion", new String[0]);
        afInAppEventType.AFInAppEventParameterName();
        final String value = AFb1gSDK.valueOf();
        final int n = AFa1eSDK.onAttributionFailure + 1;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 == 0) {}
        return value;
    }
    
    @Override
    public final AppsFlyerLib init(@NonNull final String afInAppEventParameterName, final AppsFlyerConversionListener afInAppEventParameterName2, @NonNull final Context context) {
        if (this.onAppOpenAttributionNative) {
            return this;
        }
        this.onAppOpenAttributionNative = true;
        AFa1aSDK.AFInAppEventType(this.AFInAppEventType().afWarnLog().AFInAppEventParameterName = afInAppEventParameterName);
        if (context != null) {
            this.init = (Application)context.getApplicationContext();
            this.AFKeystoreWrapper(context);
            this.AFInAppEventType().afDebugLog().values = System.currentTimeMillis();
            this.AFInAppEventType().onConversionDataSuccess().values();
            this.AFInAppEventType().afRDLog().AFInAppEventParameterName(new c(this));
            this.afDebugLog();
            this.onConversionDataFail.afWarnLog().AFInAppEventParameterName();
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 85) % 128;
        }
        else {
            com.appsflyer.AFLogger.afWarnLog("context is null, Google Install Referrer will be not initialized");
        }
        final AFb1tSDK afErrorLogForExcManagerOnly = this.AFInAppEventType().afErrorLogForExcManagerOnly();
        String s;
        if (afInAppEventParameterName2 == null) {
            final int n = AFa1eSDK.onDeepLinking + 47;
            AFa1eSDK.onAttributionFailure = n % 128;
            if (n % 2 != 0) {
                throw null;
            }
            s = "null";
        }
        else {
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 69) % 128;
            s = "conversionDataListener";
        }
        afErrorLogForExcManagerOnly.AFInAppEventParameterName("init", afInAppEventParameterName, s);
        com.appsflyer.AFLogger.AFInAppEventType(String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.12.2", AFa1eSDK.values));
        this.AFInAppEventParameterName = afInAppEventParameterName2;
        final int n2 = AFa1eSDK.onAttributionFailure + 125;
        AFa1eSDK.onDeepLinking = n2 % 128;
        if (n2 % 2 == 0) {}
        return this;
    }
    
    @Override
    public final boolean isPreInstalledApp(final Context context) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 79) % 128;
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 0x1) != 0x0) {
                AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 1) % 128;
                return true;
            }
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 113) % 128;
            return false;
        }
        catch (PackageManager$NameNotFoundException ex) {
            com.appsflyer.AFLogger.afErrorLog("Could not check if app is pre installed", (Throwable)ex);
            return false;
        }
    }
    
    @Deprecated
    @Override
    public final boolean isStopped() {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 49) % 128;
        final boolean afKeystoreWrapper = this.AFInAppEventType().afWarnLog().AFKeystoreWrapper();
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 103) % 128;
        return afKeystoreWrapper;
    }
    
    @Override
    public final void logEvent(final Context context, final String s, final Map<String, Object> map) {
        final int n = AFa1eSDK.onDeepLinking + 15;
        AFa1eSDK.onAttributionFailure = n % 128;
        this.logEvent(context, s, map, null);
        if (n % 2 != 0) {}
        final int n2 = AFa1eSDK.onDeepLinking + 103;
        AFa1eSDK.onAttributionFailure = n2 % 128;
        if (n2 % 2 != 0) {}
    }
    
    @Override
    public final void logEvent(@NonNull final Context context, final String afDebugLog, final Map<String, Object> m, final AppsFlyerRequestListener afInAppEventParameterName) {
        final Activity activity = null;
        Map<String, MotionEvent> values;
        if (m == null) {
            values = null;
        }
        else {
            values = new HashMap<String, MotionEvent>((Map<? extends String, ? extends MotionEvent>)m);
        }
        this.AFKeystoreWrapper(context);
        final AFe1iSDK aFe1iSDK = new AFe1iSDK();
        aFe1iSDK.afDebugLog = afDebugLog;
        aFe1iSDK.AFInAppEventParameterName = afInAppEventParameterName;
        if (values != null && values.containsKey("af_touch_obj")) {
            final HashMap<String, HashMap<String, Float>> value = new HashMap<String, HashMap<String, Float>>();
            final MotionEvent value2 = values.get("af_touch_obj");
            if (value2 instanceof MotionEvent) {
                final MotionEvent motionEvent = value2;
                final HashMap<String, Float> hashMap = new HashMap<String, Float>();
                hashMap.put("x", motionEvent.getX());
                hashMap.put("y", motionEvent.getY());
                value.put("loc", hashMap);
                value.put("pf", (HashMap<String, Float>)motionEvent.getPressure());
                value.put("rad", (HashMap<String, Float>)(motionEvent.getTouchMajor() / 2.0f));
            }
            else {
                value.put("error", (HashMap<String, Float>)"Parsing failed due to invalid input in 'af_touch_obj'.");
                com.appsflyer.AFLogger.AFKeystoreWrapper("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            final Map<String, HashMap<String, Float>> singletonMap = Collections.singletonMap("tch_data", (HashMap<String, Float>)value);
            values.remove("af_touch_obj");
            aFe1iSDK.values(singletonMap);
        }
        aFe1iSDK.values = (Map<String, Object>)values;
        final AFb1tSDK afErrorLogForExcManagerOnly = this.AFInAppEventType().afErrorLogForExcManagerOnly();
        Map<String, Object> values2;
        if ((values2 = aFe1iSDK.values) == null) {
            values2 = new HashMap<String, Object>();
        }
        afErrorLogForExcManagerOnly.AFInAppEventParameterName("logEvent", afDebugLog, new JSONObject((Map)values2).toString());
        if (afDebugLog == null) {
            this.AFInAppEventType(context, AFe1nSDK.AFInAppEventType);
        }
        Activity activity2 = activity;
        if (context instanceof Activity) {
            activity2 = (Activity)context;
        }
        this.values(aFe1iSDK, activity2);
    }
    
    @Override
    public final void logLocation(final Context context, final double n, final double n2) {
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("logLocation", String.valueOf(n), String.valueOf(n2));
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("af_long", Double.toString(n2));
        hashMap.put("af_lat", Double.toString(n));
        this.AFInAppEventType(context, "af_location_coordinates", (Map<String, Object>)hashMap);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 115) % 128;
    }
    
    @Override
    public final void logSession(final Context context) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 41) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("logSession", new String[0]);
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName();
        this.AFInAppEventType(context, AFe1nSDK.values);
        this.AFInAppEventType(context, null, null);
        final int n = AFa1eSDK.onDeepLinking + 47;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            return;
        }
        throw null;
    }
    
    @Override
    public final void onPause(final Context context) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 5) % 128;
        this.AFInAppEventType().onResponseNative().AFInAppEventType(context);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 43) % 128;
    }
    
    @Deprecated
    @Override
    public final void performOnAppAttribution(@NonNull final Context obj, @NonNull final URI obj2) {
        final int n = AFa1eSDK.onDeepLinking + 121;
        AFa1eSDK.onAttributionFailure = n % 128;
        Label_0146: {
            if (n % 2 != 0) {
                if (obj2 == null) {
                    break Label_0146;
                }
            }
            else if (obj2 == null) {
                break Label_0146;
            }
            if (!obj2.toString().isEmpty()) {
                if (obj == null) {
                    final AFb1sSDK appsFlyer2dXConversionCallback = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
                    final StringBuilder sb = new StringBuilder("Context is \"");
                    sb.append(obj);
                    sb.append("\"");
                    appsFlyer2dXConversionCallback.AFKeystoreWrapper(sb.toString(), DeepLinkResult.Error.NETWORK);
                    return;
                }
                this.AFInAppEventType().AppsFlyer2dXConversionCallback().valueOf(obj, new HashMap<String, Object>(), Uri.parse(obj2.toString()));
                AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 119) % 128;
                return;
            }
        }
        final AFb1sSDK appsFlyer2dXConversionCallback2 = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
        final StringBuilder sb2 = new StringBuilder("Link is \"");
        sb2.append(obj2);
        sb2.append("\"");
        appsFlyer2dXConversionCallback2.AFKeystoreWrapper(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }
    
    @Override
    public final void performOnDeepLinking(@NonNull final Intent intent, @NonNull Context applicationContext) {
        if (intent == null) {
            this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (applicationContext != null) {
            applicationContext = applicationContext.getApplicationContext();
            this.AFKeystoreWrapper(applicationContext);
            this.AFInAppEventType().AFInAppEventType().execute(new d(this, applicationContext, intent));
            return;
        }
        final int n = AFa1eSDK.onAttributionFailure + 125;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 113) % 128;
            return;
        }
        this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        throw null;
    }
    
    @Override
    public final void registerConversionListener(final Context context, final AppsFlyerConversionListener appsFlyerConversionListener) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 59) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("registerConversionListener", new String[0]);
        this.AFKeystoreWrapper(appsFlyerConversionListener);
        final int n = AFa1eSDK.onAttributionFailure + 93;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            return;
        }
        throw null;
    }
    
    @Override
    public final void registerValidatorListener(final Context context, final AppsFlyerInAppPurchaseValidatorListener valueOf) {
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("registerValidatorListener", new String[0]);
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener called");
        if (valueOf != null) {
            AFa1eSDK.valueOf = valueOf;
            return;
        }
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 113) % 128;
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
        final int n = AFa1eSDK.onDeepLinking + 3;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            return;
        }
        throw null;
    }
    
    @Override
    public final void sendAdImpression(final Context context, final Map<String, Object> map) {
        final int afInAppEventType = this.AFInAppEventType(this.values(context));
        final HashMap<String, Map<String, Object>> hashMap = new HashMap<String, Map<String, Object>>();
        hashMap.put("ad_network", map);
        hashMap.put("adimpression_counter", (Map<String, Object>)afInAppEventType);
        this.AFKeystoreWrapper(context, (Map<String, Object>)hashMap, new AFe1kSDK());
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 17) % 128;
    }
    
    @Override
    public final void sendAdRevenue(final Context context, final Map<String, Object> map) {
        final int afInAppEventParameterName = this.AFInAppEventParameterName(this.values(context));
        final HashMap<String, Map<String, Object>> hashMap = new HashMap<String, Map<String, Object>>();
        hashMap.put("ad_network", map);
        hashMap.put("adrevenue_counter", (Map<String, Object>)afInAppEventParameterName);
        this.AFKeystoreWrapper(context, (Map<String, Object>)hashMap, new AFe1oSDK());
        final int n = AFa1eSDK.onDeepLinking + 59;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            return;
        }
        throw null;
    }
    
    @Override
    public final void sendInAppPurchaseData(final Context context, final Map<String, Object> map, final PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 59) % 128;
        this.AFKeystoreWrapper(context);
        final PurchaseHandler afErrorLog = this.AFInAppEventType().afErrorLog();
        if (afErrorLog.AFInAppEventParameterName(map, purchaseValidationCallback, "purchases")) {
            final AFd1qSDK aFd1qSDK = new AFd1qSDK(map, purchaseValidationCallback, afErrorLog.values);
            final AFc1bSDK valueOf = afErrorLog.valueOf;
            valueOf.AFKeystoreWrapper.execute(new Runnable() {
                private /* synthetic */ AFd1zSDK AFInAppEventType;
                
                @Override
                public final void run() {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     1: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //     4: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //     7: astore          6
                    //     9: aload           6
                    //    11: monitorenter   
                    //    12: aload_0        
                    //    13: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    16: getfield        com/appsflyer/internal/AFc1bSDK.afErrorLog:Ljava/util/Set;
                    //    19: aload_0        
                    //    20: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    23: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    28: ifeq            64
                    //    31: new             Ljava/lang/StringBuilder;
                    //    34: dup            
                    //    35: ldc             "QUEUE: tried to add already running task: "
                    //    37: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //    40: astore          7
                    //    42: aload           7
                    //    44: aload_0        
                    //    45: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //    51: pop            
                    //    52: aload           7
                    //    54: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //    57: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //    60: aload           6
                    //    62: monitorexit    
                    //    63: return         
                    //    64: aload_0        
                    //    65: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    68: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //    71: aload_0        
                    //    72: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    75: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    80: ifne            676
                    //    83: aload_0        
                    //    84: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    87: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //    90: aload_0        
                    //    91: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    94: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    99: ifeq            105
                    //   102: goto            676
                    //   105: aload_0        
                    //   106: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   109: astore          7
                    //   111: aload_0        
                    //   112: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   115: astore          8
                    //   117: aload           8
                    //   119: getfield        com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:Ljava/util/Set;
                    //   122: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
                    //   127: astore          9
                    //   129: aload           9
                    //   131: invokeinterface java/util/Iterator.hasNext:()Z
                    //   136: ifeq            182
                    //   139: aload           9
                    //   141: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   146: checkcast       Lcom/appsflyer/internal/AFd1vSDK;
                    //   149: astore          10
                    //   151: aload           7
                    //   153: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                    //   156: aload           10
                    //   158: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //   163: ifeq            129
                    //   166: aload           8
                    //   168: getfield        com/appsflyer/internal/AFd1zSDK.AFInAppEventParameterName:Ljava/util/Set;
                    //   171: aload           10
                    //   173: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   178: pop            
                    //   179: goto            129
                    //   182: aload_0        
                    //   183: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   186: aload_0        
                    //   187: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   190: invokestatic    com/appsflyer/internal/AFc1bSDK.values:(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)Z
                    //   193: ifeq            217
                    //   196: aload_0        
                    //   197: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   200: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   203: aload_0        
                    //   204: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   207: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   212: istore          4
                    //   214: goto            284
                    //   217: aload_0        
                    //   218: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   221: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   224: aload_0        
                    //   225: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   228: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   233: istore          5
                    //   235: iload           5
                    //   237: istore          4
                    //   239: iload           5
                    //   241: ifeq            284
                    //   244: new             Ljava/lang/StringBuilder;
                    //   247: dup            
                    //   248: ldc             "QUEUE: new task was blocked: "
                    //   250: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   253: astore          7
                    //   255: aload           7
                    //   257: aload_0        
                    //   258: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   264: pop            
                    //   265: aload           7
                    //   267: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   270: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   273: aload_0        
                    //   274: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   277: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:()V
                    //   280: iload           5
                    //   282: istore          4
                    //   284: iload           4
                    //   286: ifeq            326
                    //   289: aload_0        
                    //   290: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   293: astore          7
                    //   295: aload           7
                    //   297: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   300: aload           7
                    //   302: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                    //   305: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
                    //   310: pop            
                    //   311: aload_0        
                    //   312: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   315: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                    //   318: invokeinterface java/util/List.clear:()V
                    //   323: goto            355
                    //   326: new             Ljava/lang/StringBuilder;
                    //   329: dup            
                    //   330: ldc             "QUEUE: task not added, it's already in the queue: "
                    //   332: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   335: astore          7
                    //   337: aload           7
                    //   339: aload_0        
                    //   340: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   346: pop            
                    //   347: aload           7
                    //   349: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   352: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   355: aload           6
                    //   357: monitorexit    
                    //   358: iload           4
                    //   360: ifeq            646
                    //   363: aload_0        
                    //   364: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   367: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                    //   370: aload_0        
                    //   371: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   374: getfield        com/appsflyer/internal/AFd1zSDK.values:Lcom/appsflyer/internal/AFd1vSDK;
                    //   377: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   382: pop            
                    //   383: new             Ljava/lang/StringBuilder;
                    //   386: dup            
                    //   387: ldc             "QUEUE: new task added: "
                    //   389: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   392: astore          6
                    //   394: aload           6
                    //   396: aload_0        
                    //   397: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   400: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   403: pop            
                    //   404: aload           6
                    //   406: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   409: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   412: aload_0        
                    //   413: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   416: getfield        com/appsflyer/internal/AFc1bSDK.values:Ljava/util/List;
                    //   419: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                    //   424: astore          6
                    //   426: aload           6
                    //   428: invokeinterface java/util/Iterator.hasNext:()Z
                    //   433: ifeq            451
                    //   436: aload           6
                    //   438: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   443: checkcast       Lcom/appsflyer/internal/AFc1cSDK;
                    //   446: astore          7
                    //   448: goto            426
                    //   451: aload_0        
                    //   452: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   455: astore          6
                    //   457: aload           6
                    //   459: getfield        com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;
                    //   462: aload           6
                    //   464: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
                    //   469: pop            
                    //   470: aload_0        
                    //   471: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   474: astore          8
                    //   476: aload           8
                    //   478: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   481: astore          7
                    //   483: aload           7
                    //   485: monitorenter   
                    //   486: aload           8
                    //   488: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   491: invokeinterface java/util/Set.size:()I
                    //   496: aload           8
                    //   498: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   501: invokeinterface java/util/Set.size:()I
                    //   506: iadd           
                    //   507: bipush          40
                    //   509: isub           
                    //   510: istore_1       
                    //   511: iload_1        
                    //   512: ifle            636
                    //   515: aload           8
                    //   517: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   520: invokeinterface java/util/Set.isEmpty:()Z
                    //   525: iconst_1       
                    //   526: ixor           
                    //   527: istore_2       
                    //   528: aload           8
                    //   530: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   533: invokeinterface java/util/Set.isEmpty:()Z
                    //   538: iconst_1       
                    //   539: ixor           
                    //   540: istore_3       
                    //   541: iload_3        
                    //   542: ifeq            608
                    //   545: iload_2        
                    //   546: ifeq            608
                    //   549: aload           8
                    //   551: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   554: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                    //   559: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                    //   562: aload           8
                    //   564: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   567: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                    //   572: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                    //   575: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:(Lcom/appsflyer/internal/AFd1zSDK;)I
                    //   578: ifle            598
                    //   581: aload           8
                    //   583: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   586: astore          6
                    //   588: aload           8
                    //   590: aload           6
                    //   592: invokevirtual   com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:(Ljava/util/NavigableSet;)V
                    //   595: goto            725
                    //   598: aload           8
                    //   600: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   603: astore          6
                    //   605: goto            588
                    //   608: iload_3        
                    //   609: ifeq            622
                    //   612: aload           8
                    //   614: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   617: astore          6
                    //   619: goto            588
                    //   622: iload_2        
                    //   623: ifeq            725
                    //   626: aload           8
                    //   628: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   631: astore          6
                    //   633: goto            588
                    //   636: aload           7
                    //   638: monitorexit    
                    //   639: return         
                    //   640: aload           7
                    //   642: monitorexit    
                    //   643: aload           6
                    //   645: athrow         
                    //   646: new             Ljava/lang/StringBuilder;
                    //   649: dup            
                    //   650: ldc             "QUEUE: tried to add already pending task: "
                    //   652: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   655: astore          6
                    //   657: aload           6
                    //   659: aload_0        
                    //   660: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   663: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   666: pop            
                    //   667: aload           6
                    //   669: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   672: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
                    //   675: return         
                    //   676: new             Ljava/lang/StringBuilder;
                    //   679: dup            
                    //   680: ldc             "QUEUE: tried to add already scheduled task: "
                    //   682: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   685: astore          7
                    //   687: aload           7
                    //   689: aload_0        
                    //   690: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   693: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   696: pop            
                    //   697: aload           7
                    //   699: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   702: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   705: aload           6
                    //   707: monitorexit    
                    //   708: return         
                    //   709: aload           6
                    //   711: monitorexit    
                    //   712: aload           7
                    //   714: athrow         
                    //   715: astore          7
                    //   717: goto            709
                    //   720: astore          6
                    //   722: goto            640
                    //   725: iload_1        
                    //   726: iconst_1       
                    //   727: isub           
                    //   728: istore_1       
                    //   729: goto            511
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type
                    //  -----  -----  -----  -----  ----
                    //  12     63     715    720    Any
                    //  64     102    715    720    Any
                    //  105    129    715    720    Any
                    //  129    179    715    720    Any
                    //  182    214    715    720    Any
                    //  217    235    715    720    Any
                    //  244    280    715    720    Any
                    //  289    323    715    720    Any
                    //  326    355    715    720    Any
                    //  355    358    715    720    Any
                    //  486    511    720    646    Any
                    //  515    541    720    646    Any
                    //  549    588    720    646    Any
                    //  588    595    720    646    Any
                    //  598    605    720    646    Any
                    //  612    619    720    646    Any
                    //  626    633    720    646    Any
                    //  636    639    720    646    Any
                    //  676    708    715    720    Any
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.IllegalStateException: Expression is linked from several locations: Label_0511:
                    //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                    //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
                    //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
                    // 
                    throw new IllegalStateException("An error occurred while decompiling this method.");
                }
            });
        }
        final int n = AFa1eSDK.onDeepLinking + 25;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            return;
        }
        throw null;
    }
    
    @Override
    public final void sendPurchaseData(final Context context, final Map<String, Object> map, final PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 63) % 128;
        this.AFKeystoreWrapper(context);
        final PurchaseHandler afErrorLog = this.AFInAppEventType().afErrorLog();
        if (afErrorLog.AFInAppEventParameterName(map, purchaseValidationCallback, "subscriptions")) {
            final AFd1wSDK aFd1wSDK = new AFd1wSDK(map, purchaseValidationCallback, afErrorLog.values);
            final AFc1bSDK valueOf = afErrorLog.valueOf;
            valueOf.AFKeystoreWrapper.execute(new Runnable() {
                private /* synthetic */ AFd1zSDK AFInAppEventType;
                
                @Override
                public final void run() {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     1: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //     4: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //     7: astore          6
                    //     9: aload           6
                    //    11: monitorenter   
                    //    12: aload_0        
                    //    13: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    16: getfield        com/appsflyer/internal/AFc1bSDK.afErrorLog:Ljava/util/Set;
                    //    19: aload_0        
                    //    20: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    23: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    28: ifeq            64
                    //    31: new             Ljava/lang/StringBuilder;
                    //    34: dup            
                    //    35: ldc             "QUEUE: tried to add already running task: "
                    //    37: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //    40: astore          7
                    //    42: aload           7
                    //    44: aload_0        
                    //    45: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //    51: pop            
                    //    52: aload           7
                    //    54: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //    57: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //    60: aload           6
                    //    62: monitorexit    
                    //    63: return         
                    //    64: aload_0        
                    //    65: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    68: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //    71: aload_0        
                    //    72: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    75: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    80: ifne            676
                    //    83: aload_0        
                    //    84: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    87: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //    90: aload_0        
                    //    91: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    94: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    99: ifeq            105
                    //   102: goto            676
                    //   105: aload_0        
                    //   106: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   109: astore          7
                    //   111: aload_0        
                    //   112: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   115: astore          8
                    //   117: aload           8
                    //   119: getfield        com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:Ljava/util/Set;
                    //   122: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
                    //   127: astore          9
                    //   129: aload           9
                    //   131: invokeinterface java/util/Iterator.hasNext:()Z
                    //   136: ifeq            182
                    //   139: aload           9
                    //   141: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   146: checkcast       Lcom/appsflyer/internal/AFd1vSDK;
                    //   149: astore          10
                    //   151: aload           7
                    //   153: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                    //   156: aload           10
                    //   158: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //   163: ifeq            129
                    //   166: aload           8
                    //   168: getfield        com/appsflyer/internal/AFd1zSDK.AFInAppEventParameterName:Ljava/util/Set;
                    //   171: aload           10
                    //   173: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   178: pop            
                    //   179: goto            129
                    //   182: aload_0        
                    //   183: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   186: aload_0        
                    //   187: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   190: invokestatic    com/appsflyer/internal/AFc1bSDK.values:(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)Z
                    //   193: ifeq            217
                    //   196: aload_0        
                    //   197: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   200: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   203: aload_0        
                    //   204: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   207: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   212: istore          4
                    //   214: goto            284
                    //   217: aload_0        
                    //   218: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   221: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   224: aload_0        
                    //   225: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   228: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   233: istore          5
                    //   235: iload           5
                    //   237: istore          4
                    //   239: iload           5
                    //   241: ifeq            284
                    //   244: new             Ljava/lang/StringBuilder;
                    //   247: dup            
                    //   248: ldc             "QUEUE: new task was blocked: "
                    //   250: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   253: astore          7
                    //   255: aload           7
                    //   257: aload_0        
                    //   258: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   264: pop            
                    //   265: aload           7
                    //   267: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   270: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   273: aload_0        
                    //   274: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   277: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:()V
                    //   280: iload           5
                    //   282: istore          4
                    //   284: iload           4
                    //   286: ifeq            326
                    //   289: aload_0        
                    //   290: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   293: astore          7
                    //   295: aload           7
                    //   297: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   300: aload           7
                    //   302: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                    //   305: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
                    //   310: pop            
                    //   311: aload_0        
                    //   312: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   315: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                    //   318: invokeinterface java/util/List.clear:()V
                    //   323: goto            355
                    //   326: new             Ljava/lang/StringBuilder;
                    //   329: dup            
                    //   330: ldc             "QUEUE: task not added, it's already in the queue: "
                    //   332: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   335: astore          7
                    //   337: aload           7
                    //   339: aload_0        
                    //   340: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   346: pop            
                    //   347: aload           7
                    //   349: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   352: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   355: aload           6
                    //   357: monitorexit    
                    //   358: iload           4
                    //   360: ifeq            646
                    //   363: aload_0        
                    //   364: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   367: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                    //   370: aload_0        
                    //   371: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   374: getfield        com/appsflyer/internal/AFd1zSDK.values:Lcom/appsflyer/internal/AFd1vSDK;
                    //   377: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   382: pop            
                    //   383: new             Ljava/lang/StringBuilder;
                    //   386: dup            
                    //   387: ldc             "QUEUE: new task added: "
                    //   389: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   392: astore          6
                    //   394: aload           6
                    //   396: aload_0        
                    //   397: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   400: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   403: pop            
                    //   404: aload           6
                    //   406: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   409: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   412: aload_0        
                    //   413: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   416: getfield        com/appsflyer/internal/AFc1bSDK.values:Ljava/util/List;
                    //   419: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                    //   424: astore          6
                    //   426: aload           6
                    //   428: invokeinterface java/util/Iterator.hasNext:()Z
                    //   433: ifeq            451
                    //   436: aload           6
                    //   438: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   443: checkcast       Lcom/appsflyer/internal/AFc1cSDK;
                    //   446: astore          7
                    //   448: goto            426
                    //   451: aload_0        
                    //   452: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   455: astore          6
                    //   457: aload           6
                    //   459: getfield        com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;
                    //   462: aload           6
                    //   464: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
                    //   469: pop            
                    //   470: aload_0        
                    //   471: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   474: astore          8
                    //   476: aload           8
                    //   478: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   481: astore          7
                    //   483: aload           7
                    //   485: monitorenter   
                    //   486: aload           8
                    //   488: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   491: invokeinterface java/util/Set.size:()I
                    //   496: aload           8
                    //   498: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   501: invokeinterface java/util/Set.size:()I
                    //   506: iadd           
                    //   507: bipush          40
                    //   509: isub           
                    //   510: istore_1       
                    //   511: iload_1        
                    //   512: ifle            636
                    //   515: aload           8
                    //   517: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   520: invokeinterface java/util/Set.isEmpty:()Z
                    //   525: iconst_1       
                    //   526: ixor           
                    //   527: istore_2       
                    //   528: aload           8
                    //   530: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   533: invokeinterface java/util/Set.isEmpty:()Z
                    //   538: iconst_1       
                    //   539: ixor           
                    //   540: istore_3       
                    //   541: iload_3        
                    //   542: ifeq            608
                    //   545: iload_2        
                    //   546: ifeq            608
                    //   549: aload           8
                    //   551: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   554: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                    //   559: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                    //   562: aload           8
                    //   564: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   567: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                    //   572: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                    //   575: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:(Lcom/appsflyer/internal/AFd1zSDK;)I
                    //   578: ifle            598
                    //   581: aload           8
                    //   583: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   586: astore          6
                    //   588: aload           8
                    //   590: aload           6
                    //   592: invokevirtual   com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:(Ljava/util/NavigableSet;)V
                    //   595: goto            725
                    //   598: aload           8
                    //   600: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   603: astore          6
                    //   605: goto            588
                    //   608: iload_3        
                    //   609: ifeq            622
                    //   612: aload           8
                    //   614: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   617: astore          6
                    //   619: goto            588
                    //   622: iload_2        
                    //   623: ifeq            725
                    //   626: aload           8
                    //   628: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   631: astore          6
                    //   633: goto            588
                    //   636: aload           7
                    //   638: monitorexit    
                    //   639: return         
                    //   640: aload           7
                    //   642: monitorexit    
                    //   643: aload           6
                    //   645: athrow         
                    //   646: new             Ljava/lang/StringBuilder;
                    //   649: dup            
                    //   650: ldc             "QUEUE: tried to add already pending task: "
                    //   652: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   655: astore          6
                    //   657: aload           6
                    //   659: aload_0        
                    //   660: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   663: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   666: pop            
                    //   667: aload           6
                    //   669: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   672: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
                    //   675: return         
                    //   676: new             Ljava/lang/StringBuilder;
                    //   679: dup            
                    //   680: ldc             "QUEUE: tried to add already scheduled task: "
                    //   682: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   685: astore          7
                    //   687: aload           7
                    //   689: aload_0        
                    //   690: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   693: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   696: pop            
                    //   697: aload           7
                    //   699: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   702: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   705: aload           6
                    //   707: monitorexit    
                    //   708: return         
                    //   709: aload           6
                    //   711: monitorexit    
                    //   712: aload           7
                    //   714: athrow         
                    //   715: astore          7
                    //   717: goto            709
                    //   720: astore          6
                    //   722: goto            640
                    //   725: iload_1        
                    //   726: iconst_1       
                    //   727: isub           
                    //   728: istore_1       
                    //   729: goto            511
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type
                    //  -----  -----  -----  -----  ----
                    //  12     63     715    720    Any
                    //  64     102    715    720    Any
                    //  105    129    715    720    Any
                    //  129    179    715    720    Any
                    //  182    214    715    720    Any
                    //  217    235    715    720    Any
                    //  244    280    715    720    Any
                    //  289    323    715    720    Any
                    //  326    355    715    720    Any
                    //  355    358    715    720    Any
                    //  486    511    720    646    Any
                    //  515    541    720    646    Any
                    //  549    588    720    646    Any
                    //  588    595    720    646    Any
                    //  598    605    720    646    Any
                    //  612    619    720    646    Any
                    //  626    633    720    646    Any
                    //  636    639    720    646    Any
                    //  676    708    715    720    Any
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.IllegalStateException: Expression is linked from several locations: Label_0511:
                    //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                    //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
                    //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
                    // 
                    throw new IllegalStateException("An error occurred while decompiling this method.");
                }
            });
        }
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 35) % 128;
    }
    
    @Override
    public final void sendPushNotificationData(final Activity activity) {
        final int n = AFa1eSDK.onAttributionFailure + 85;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            if (activity != null && activity.getIntent() != null) {
                final AFb1tSDK afErrorLogForExcManagerOnly = this.AFInAppEventType().afErrorLogForExcManagerOnly();
                final String localClassName = activity.getLocalClassName();
                final StringBuilder sb = new StringBuilder("activity_intent_");
                sb.append(activity.getIntent().toString());
                afErrorLogForExcManagerOnly.AFInAppEventParameterName("sendPushNotificationData", localClassName, sb.toString());
            }
            else if (activity != null) {
                AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 3) % 128;
                this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            }
            else {
                this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("sendPushNotificationData", new String[] { "activity_null" });
            }
            final String afInAppEventParameterName = AFInAppEventParameterName(activity);
            this.getLevel = afInAppEventParameterName;
            if (afInAppEventParameterName != null) {
                final long currentTimeMillis = System.currentTimeMillis();
                long longValue = 0L;
                Label_0597: {
                    if (this.AFLogger$LogLevel == null) {
                        com.appsflyer.AFLogger.afInfoLog("pushes: initializing pushes history..");
                        this.AFLogger$LogLevel = new ConcurrentHashMap<Long, String>();
                        longValue = currentTimeMillis;
                    }
                    else {
                        long n5 = 0L;
                        try {
                            final long long1 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                            Object iterator = this.AFLogger$LogLevel.keySet().iterator();
                            long n2 = currentTimeMillis;
                            while (true) {
                                longValue = n2;
                                Long n3;
                                try {
                                    if (!((Iterator)iterator).hasNext()) {
                                        break Label_0597;
                                    }
                                    n3 = ((Iterator<Long>)iterator).next();
                                    final JSONObject obj = new JSONObject(this.getLevel);
                                    final JSONObject obj2 = new JSONObject((String)this.AFLogger$LogLevel.get(n3));
                                    if (!(obj.opt("pid").equals(obj2.opt("pid")) ^ true)) {
                                        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 53) % 128;
                                        if (obj.opt("c").equals(obj2.opt("c"))) {
                                            iterator = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                            ((StringBuilder)iterator).append(obj2);
                                            ((StringBuilder)iterator).append(", new: ");
                                            ((StringBuilder)iterator).append(obj);
                                            ((StringBuilder)iterator).append(")");
                                            com.appsflyer.AFLogger.afInfoLog(iterator.toString());
                                            this.getLevel = null;
                                            final int n4 = AFa1eSDK.onAttributionFailure + 73;
                                            AFa1eSDK.onDeepLinking = n4 % 128;
                                            if (n4 % 2 == 0) {}
                                            return;
                                        }
                                    }
                                }
                                finally {
                                    break;
                                }
                                if (currentTimeMillis - n3.longValue() > long1) {
                                    this.AFLogger$LogLevel.remove(n3);
                                }
                                longValue = n2;
                                if (n3.longValue() <= n2) {
                                    longValue = n3.longValue();
                                    AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 113) % 128;
                                }
                                n2 = longValue;
                            }
                        }
                        finally {
                            n5 = currentTimeMillis;
                        }
                        final StringBuilder sb2 = new StringBuilder("Error while handling push notification measurement: ");
                        final Throwable t;
                        sb2.append(t.getClass().getSimpleName());
                        com.appsflyer.AFLogger.afErrorLog(sb2.toString(), t);
                        longValue = n5;
                    }
                }
                if (this.AFLogger$LogLevel.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                    final StringBuilder sb3 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                    sb3.append(longValue);
                    sb3.append(")");
                    com.appsflyer.AFLogger.afInfoLog(sb3.toString());
                    this.AFLogger$LogLevel.remove(longValue);
                }
                this.AFLogger$LogLevel.put(currentTimeMillis, this.getLevel);
                this.start((Context)activity);
            }
            return;
        }
        throw null;
    }
    
    @Override
    public final void setAdditionalData(final Map<String, Object> map) {
        final int n = AFa1eSDK.onAttributionFailure + 29;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            if (map != null) {
                this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAdditionalData", new String[] { map.toString() });
                AppsFlyerProperties.getInstance().setCustomData(new JSONObject((Map)map).toString());
            }
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 99) % 128;
            return;
        }
        throw null;
    }
    
    @Override
    public final void setAndroidIdData(final String afLogger) {
        final int n = AFa1eSDK.onAttributionFailure + 23;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 == 0) {
            final AFb1tSDK afErrorLogForExcManagerOnly = this.AFInAppEventType().afErrorLogForExcManagerOnly();
            final String[] array = new String[0];
            array[0] = afLogger;
            afErrorLogForExcManagerOnly.AFInAppEventParameterName("setAndroidIdData", array);
        }
        else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAndroidIdData", new String[] { afLogger });
        }
        this.AFLogger = afLogger;
    }
    
    @Override
    public final void setAppId(final String s) {
        final int n = AFa1eSDK.onAttributionFailure + 83;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 == 0) {
            final AFb1tSDK afErrorLogForExcManagerOnly = this.AFInAppEventType().afErrorLogForExcManagerOnly();
            final String[] array = new String[0];
            array[1] = s;
            afErrorLogForExcManagerOnly.AFInAppEventParameterName("setAppId", array);
        }
        else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAppId", new String[] { s });
        }
        AFInAppEventType("appid", s);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 53) % 128;
    }
    
    @Override
    public final void setAppInviteOneLink(final String obj) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 53) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAppInviteOneLink", new String[] { obj });
        com.appsflyer.AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(obj)));
        Label_0159: {
            if (obj != null) {
                final int n = AFa1eSDK.onAttributionFailure + 91;
                AFa1eSDK.onDeepLinking = n % 128;
                if (n % 2 == 0) {
                    if (obj.equals(AppsFlyerProperties.getInstance().getString("oneLinkSlug"))) {
                        break Label_0159;
                    }
                }
                else if (!(obj.equals(AppsFlyerProperties.getInstance().getString("oneLinkSlug")) ^ true)) {
                    break Label_0159;
                }
            }
            AppsFlyerProperties.getInstance().remove("onelinkDomain");
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove("onelinkScheme");
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 121) % 128;
        }
        AFInAppEventType("oneLinkSlug", obj);
    }
    
    @Override
    public final void setCollectAndroidID(final boolean b) {
        final int n = AFa1eSDK.onAttributionFailure + 107;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 == 0) {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectAndroidID", new String[] { String.valueOf(b) });
        }
        else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectAndroidID", new String[] { String.valueOf(b) });
        }
        AFInAppEventType("collectAndroidId", Boolean.toString(b));
        AFInAppEventType("collectAndroidIdForceByUser", Boolean.toString(b));
    }
    
    @Override
    public final void setCollectIMEI(final boolean b) {
        final int n = AFa1eSDK.onAttributionFailure + 79;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 == 0) {
            final AFb1tSDK afErrorLogForExcManagerOnly = this.AFInAppEventType().afErrorLogForExcManagerOnly();
            final String[] array = new String[0];
            array[0] = String.valueOf(b);
            afErrorLogForExcManagerOnly.AFInAppEventParameterName("setCollectIMEI", array);
        }
        else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectIMEI", new String[] { String.valueOf(b) });
        }
        AFInAppEventType("collectIMEI", Boolean.toString(b));
        AFInAppEventType("collectIMEIForceByUser", Boolean.toString(b));
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 59) % 128;
    }
    
    @Deprecated
    @Override
    public final void setCollectOaid(final boolean b) {
        final int n = AFa1eSDK.onDeepLinking + 29;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {
            final AFb1tSDK afErrorLogForExcManagerOnly = this.AFInAppEventType().afErrorLogForExcManagerOnly();
            final String[] array = new String[0];
            array[1] = String.valueOf(b);
            afErrorLogForExcManagerOnly.AFInAppEventParameterName("setCollectOaid", array);
        }
        else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectOaid", new String[] { String.valueOf(b) });
        }
        AFInAppEventType("collectOAID", Boolean.toString(b));
    }
    
    @Override
    public final void setCurrencyCode(final String s) {
        final int n = AFa1eSDK.onAttributionFailure + 125;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 == 0) {
            final AFb1tSDK afErrorLogForExcManagerOnly = this.AFInAppEventType().afErrorLogForExcManagerOnly();
            final String[] array = new String[0];
            array[1] = s;
            afErrorLogForExcManagerOnly.AFInAppEventParameterName("setCurrencyCode", array);
        }
        else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCurrencyCode", new String[] { s });
        }
        AppsFlyerProperties.getInstance().set("currencyCode", s);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 69) % 128;
    }
    
    @Override
    public final void setCustomerIdAndLogSession(String afInAppEventParameterName, @NonNull final Context context) {
        if (context != null) {
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 63) % 128;
            final boolean afKeystoreWrapper = this.AFKeystoreWrapper();
            this.setCustomerUserId(afInAppEventParameterName);
            if (afKeystoreWrapper) {
                final StringBuilder sb = new StringBuilder("CustomerUserId set: ");
                sb.append(afInAppEventParameterName);
                sb.append(" - Initializing AppsFlyer Tacking");
                com.appsflyer.AFLogger.afInfoLog(sb.toString(), true);
                final String referrer = AppsFlyerProperties.getInstance().getReferrer(this.AFInAppEventType().values());
                this.AFInAppEventType(context, AFe1nSDK.AFKeystoreWrapper);
                afInAppEventParameterName = this.AFInAppEventType().afWarnLog().AFInAppEventParameterName;
                if ((afInAppEventParameterName = referrer) == null) {
                    afInAppEventParameterName = "";
                }
                if (context instanceof Activity) {
                    final int n = AFa1eSDK.onAttributionFailure + 29;
                    AFa1eSDK.onDeepLinking = n % 128;
                    if (n % 2 == 0) {
                        ((Activity)context).getIntent();
                    }
                    else {
                        ((Activity)context).getIntent();
                    }
                }
                this.AFKeystoreWrapper(context, null, null, afInAppEventParameterName, null);
                return;
            }
            com.appsflyer.AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(afInAppEventParameterName)), true);
        }
    }
    
    @Override
    public final void setCustomerUserId(final String obj) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 83) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCustomerUserId", new String[] { obj });
        com.appsflyer.AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(obj)));
        AFInAppEventType("AppUserId", obj);
        AFInAppEventType("waitForCustomerId", false);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 119) % 128;
    }
    
    @Override
    public final void setDebugLog(final boolean b) {
        final int n = AFa1eSDK.onDeepLinking + 11;
        AFa1eSDK.onAttributionFailure = n % 128;
        AFLogger.LogLevel logLevel = null;
        Label_0049: {
            Label_0045: {
                if (n % 2 != 0) {
                    if (b) {
                        break Label_0045;
                    }
                }
                else if (b) {
                    break Label_0045;
                }
                logLevel = com.appsflyer.AFLogger.LogLevel.NONE;
                break Label_0049;
            }
            logLevel = com.appsflyer.AFLogger.LogLevel.DEBUG;
        }
        this.setLogLevel(logLevel);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 103) % 128;
    }
    
    @Override
    public final void setDisableAdvertisingIdentifiers(final boolean b) {
        final int n = AFa1eSDK.onAttributionFailure + 15;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            com.appsflyer.AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(b)));
            boolean b2;
            if (!b) {
                AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 29) % 128;
                b2 = true;
            }
            else {
                AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 35) % 128;
                b2 = false;
            }
            AFa1cSDK.valueOf = b2;
            AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
            AppsFlyerProperties.getInstance().remove("advertiserId");
            return;
        }
        com.appsflyer.AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(b)));
        throw null;
    }
    
    @Override
    public final void setDisableNetworkData(final boolean b) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 15) % 128;
        com.appsflyer.AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(b)));
        AFInAppEventType("disableCollectNetworkData", b);
        final int n = AFa1eSDK.onDeepLinking + 93;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {}
    }
    
    @Override
    public final void setExtension(final String s) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 81) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setExtension", new String[] { s });
        AppsFlyerProperties.getInstance().set("sdkExtension", s);
        final int n = AFa1eSDK.onAttributionFailure + 65;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            return;
        }
        throw null;
    }
    
    @Override
    public final void setHost(String trim, @NonNull final String s) {
        if (!(AFb1uSDK.AFInAppEventType(s) ^ true)) {
            com.appsflyer.AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 29) % 128;
        if (trim != null) {
            trim = trim.trim();
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 95) % 128;
        }
        else {
            trim = "";
        }
        AFc1dSDK.valueOf(new AFc1fSDK(trim, s.trim()));
    }
    
    @Override
    public final void setImeiData(final String values) {
        final int n = AFa1eSDK.onDeepLinking + 27;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {
            final AFb1tSDK afErrorLogForExcManagerOnly = this.AFInAppEventType().afErrorLogForExcManagerOnly();
            final String[] array = new String[0];
            array[1] = values;
            afErrorLogForExcManagerOnly.AFInAppEventParameterName("setImeiData", array);
        }
        else {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setImeiData", new String[] { values });
        }
        this.AFInAppEventType().afWarnLog().values = values;
    }
    
    @Override
    public final void setIsUpdate(final boolean b) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 119) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setIsUpdate", new String[] { String.valueOf(b) });
        AppsFlyerProperties.getInstance().set("IS_UPDATE", b);
        final int n = AFa1eSDK.onAttributionFailure + 43;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            return;
        }
        throw null;
    }
    
    @Override
    public final void setLogLevel(@NonNull final AFLogger.LogLevel logLevel) {
        final int level = logLevel.getLevel();
        final int level2 = com.appsflyer.AFLogger.LogLevel.NONE.getLevel();
        boolean b = false;
        if (level > level2) {
            final int n = AFa1eSDK.onDeepLinking + 85;
            AFa1eSDK.onAttributionFailure = n % 128;
            b = (n % 2 == 0 || b);
        }
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("log", new String[] { String.valueOf(b) });
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 95) % 128;
    }
    
    @Override
    public final void setMinTimeBetweenSessions(int n) {
        final int n2 = AFa1eSDK.onAttributionFailure + 77;
        AFa1eSDK.onDeepLinking = n2 % 128;
        if (n2 % 2 == 0) {
            this.AFVersionDeclaration = TimeUnit.SECONDS.toMillis(n);
            n = 39 / 0;
            return;
        }
        this.AFVersionDeclaration = TimeUnit.SECONDS.toMillis(n);
    }
    
    @Override
    public final void setOaidData(final String values) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 123) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setOaidData", new String[] { values });
        AFa1cSDK.values = values;
        final int n = AFa1eSDK.onAttributionFailure + 95;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            return;
        }
        throw null;
    }
    
    @Override
    public final void setOneLinkCustomDomain(final String... afDebugLog) {
        final int n = AFa1eSDK.onAttributionFailure + 77;
        AFa1eSDK.onDeepLinking = n % 128;
        String s;
        if (n % 2 == 0) {
            final Object[] args = new Object[0];
            args[1] = Arrays.toString(afDebugLog);
            s = String.format("setOneLinkCustomDomain %s", args);
        }
        else {
            s = String.format("setOneLinkCustomDomain %s", Arrays.toString(afDebugLog));
        }
        com.appsflyer.AFLogger.afDebugLog(s);
        this.AFInAppEventType().AppsFlyer2dXConversionCallback().afDebugLog = afDebugLog;
    }
    
    @Override
    public final void setOutOfStore(String lowerCase) {
        final int n = AFa1eSDK.onDeepLinking + 27;
        AFa1eSDK.onAttributionFailure = n % 128;
        Label_0070: {
            if (n % 2 != 0) {
                if (lowerCase == null) {
                    break Label_0070;
                }
            }
            else if (lowerCase == null) {
                break Label_0070;
            }
            lowerCase = lowerCase.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            com.appsflyer.AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        com.appsflyer.AFLogger.AFKeystoreWrapper("Cannot set setOutOfStore with null");
        final int n2 = AFa1eSDK.onDeepLinking + 91;
        AFa1eSDK.onAttributionFailure = n2 % 128;
        if (n2 % 2 == 0) {
            return;
        }
        throw null;
    }
    
    @Override
    public final void setPartnerData(@NonNull String concat, final Map<String, Object> obj) {
        if (this.onResponseNative == null) {
            this.onResponseNative = new AFb1lSDK();
        }
        final AFb1lSDK onResponseNative = this.onResponseNative;
        Label_0325: {
            if (concat != null) {
                final int n = AFa1eSDK.onDeepLinking + 47;
                AFa1eSDK.onAttributionFailure = n % 128;
                if (n % 2 != 0) {
                    if (concat.isEmpty()) {
                        break Label_0325;
                    }
                }
                else if (!(concat.isEmpty() ^ true)) {
                    break Label_0325;
                }
                Label_0291: {
                    if (obj != null) {
                        final int n2 = AFa1eSDK.onDeepLinking + 27;
                        AFa1eSDK.onAttributionFailure = n2 % 128;
                        if (n2 % 2 != 0) {
                            if (obj.isEmpty()) {
                                break Label_0291;
                            }
                        }
                        else if (obj.isEmpty()) {
                            break Label_0291;
                        }
                        final StringBuilder sb = new StringBuilder("Setting partner data for ");
                        sb.append(concat);
                        sb.append(": ");
                        sb.append(obj);
                        com.appsflyer.AFLogger.afDebugLog(sb.toString());
                        final int length = new JSONObject((Map)obj).toString().length();
                        if (length > 1000) {
                            com.appsflyer.AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                            final HashMap<String, String> hashMap = new HashMap<String, String>();
                            hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                            onResponseNative.AFInAppEventParameterName.put(concat, hashMap);
                            return;
                        }
                        onResponseNative.values.put(concat, obj);
                        onResponseNative.AFInAppEventParameterName.remove(concat);
                        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 77) % 128;
                        return;
                    }
                }
                if (onResponseNative.values.remove(concat) == null) {
                    concat = "Partner data is missing or `null`";
                }
                else {
                    concat = "Cleared partner data for ".concat(concat);
                }
                com.appsflyer.AFLogger.afWarnLog(concat);
                return;
            }
        }
        com.appsflyer.AFLogger.afWarnLog("Partner ID is missing or `null`");
    }
    
    @Override
    public final void setPhoneNumber(final String s) {
        final int n = AFa1eSDK.onAttributionFailure + 35;
        AFa1eSDK.onDeepLinking = n % 128;
        this.onAttributionFailureNative = AFc1nSDK.AFInAppEventType(s);
        if (n % 2 != 0) {
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 77) % 128;
            return;
        }
        throw null;
    }
    
    @Override
    public final void setPluginInfo(@NonNull final PluginInfo obj) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 93) % 128;
        Objects.requireNonNull(obj);
        this.AFInAppEventType().onInstallConversionDataLoadedNative().AFInAppEventParameterName(obj);
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 25) % 128;
    }
    
    @Override
    public final void setPreinstallAttribution(final String s, final String s2, final String s3) {
        com.appsflyer.AFLogger.afDebugLog("setPreinstallAttribution API called");
        final JSONObject jsonObject = new JSONObject();
        Label_0137: {
            Label_0062: {
                if (s != null) {
                    AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 93) % 128;
                    Label_0129: {
                        try {
                            jsonObject.put("pid", (Object)s);
                            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 17) % 128;
                        }
                        catch (JSONException ex) {
                            break Label_0129;
                        }
                        break Label_0062;
                    }
                    final JSONException ex;
                    com.appsflyer.AFLogger.afErrorLog(((Throwable)ex).getMessage(), (Throwable)ex);
                    break Label_0137;
                }
            }
            if (s2 != null) {
                jsonObject.put("c", (Object)s2);
            }
            if (s3 != null) {
                final int n = AFa1eSDK.onDeepLinking + 41;
                AFa1eSDK.onAttributionFailure = n % 128;
                if (n % 2 != 0) {
                    jsonObject.put("af_siteid", (Object)s3);
                    throw null;
                }
                jsonObject.put("af_siteid", (Object)s3);
            }
        }
        if (!jsonObject.has("pid")) {
            com.appsflyer.AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            return;
        }
        final int n2 = AFa1eSDK.onDeepLinking + 117;
        AFa1eSDK.onAttributionFailure = n2 % 128;
        if (n2 % 2 == 0) {
            AFInAppEventType("preInstallName", jsonObject.toString());
            return;
        }
        AFInAppEventType("preInstallName", jsonObject.toString());
        throw null;
    }
    
    @Override
    public final void setResolveDeepLinkURLs(final String... array) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 87) % 128;
        com.appsflyer.AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(array)));
        final AFb1sSDK appsFlyer2dXConversionCallback = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
        appsFlyer2dXConversionCallback.AFLogger.clear();
        appsFlyer2dXConversionCallback.AFLogger.addAll(Arrays.asList(array));
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 65) % 128;
    }
    
    @Deprecated
    @Override
    public final void setSharingFilter(@NonNull final String... sharingFilterForPartners) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 69) % 128;
        this.setSharingFilterForPartners(sharingFilterForPartners);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 63) % 128;
    }
    
    @Deprecated
    @Override
    public final void setSharingFilterForAllPartners() {
        final int n = AFa1eSDK.onDeepLinking + 47;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {
            final String[] sharingFilterForPartners = new String[0];
            sharingFilterForPartners[1] = "all";
            this.setSharingFilterForPartners(sharingFilterForPartners);
            return;
        }
        this.setSharingFilterForPartners("all");
    }
    
    @Override
    public final void setSharingFilterForPartners(final String... array) {
        this.afInfoLog = new AFa1cSDK(array);
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 95) % 128;
    }
    
    @Override
    public final void setUserEmails(final AppsFlyerProperties.EmailsCryptType emailsCryptType, final String... a) {
        final ArrayList<Object> list = new ArrayList<Object>(a.length + 1);
        list.add(emailsCryptType.toString());
        list.addAll(Arrays.asList(a));
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setUserEmails", (String[])list.toArray(new String[a.length + 1]));
        AppsFlyerProperties.getInstance().set("userEmailsCryptType", emailsCryptType.getValue());
        final HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();
        final ArrayList<String> list2 = new ArrayList<String>();
        final int length = a.length;
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 93) % 128;
        String s = null;
        for (int i = 0; i < length; ++i) {
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 33) % 128;
            final String e = a[i];
            if (AFa1eSDK$5.valueOf[emailsCryptType.ordinal()] != 2) {
                list2.add(AFc1nSDK.AFInAppEventType(e));
                s = "sha256_el_arr";
            }
            else {
                list2.add(e);
                s = "plain_el_arr";
            }
        }
        hashMap.put(s, list2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject((Map)hashMap).toString());
    }
    
    @Override
    public final void setUserEmails(final String... array) {
        final int n = AFa1eSDK.onAttributionFailure + 43;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 == 0) {
            this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setUserEmails", array);
            this.setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, array);
            return;
        }
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setUserEmails", array);
        this.setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, array);
    }
    
    @Override
    public final void start(@NonNull final Context context) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 61) % 128;
        this.start(context, null);
        final int n = AFa1eSDK.onAttributionFailure + 49;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 != 0) {
            return;
        }
        throw null;
    }
    
    @Override
    public final void start(@NonNull final Context context, final String s) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 39) % 128;
        this.start(context, s, null);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 37) % 128;
    }
    
    @Override
    public final void start(@NonNull final Context context, final String afInAppEventParameterName, final AppsFlyerRequestListener appsFlyerRequestListener) {
        final int n = AFa1eSDK.onDeepLinking + 57;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {
            this.AFInAppEventType().onResponseNative().AFInAppEventType();
            throw null;
        }
        if (this.AFInAppEventType().onResponseNative().AFInAppEventType()) {
            return;
        }
        if (!this.onAppOpenAttributionNative) {
            com.appsflyer.AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (afInAppEventParameterName == null) {
                if (appsFlyerRequestListener != null) {
                    final int n2 = AFa1eSDK.onAttributionFailure + 75;
                    AFa1eSDK.onDeepLinking = n2 % 128;
                    if (n2 % 2 == 0) {
                        appsFlyerRequestListener.onError(7, "No dev key");
                        return;
                    }
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                return;
            }
        }
        this.AFKeystoreWrapper(context);
        final AFe1mSDK afDebugLog = this.AFInAppEventType().afDebugLog();
        afDebugLog.AFKeystoreWrapper(AFa1rSDK.AFInAppEventParameterName(context));
        this.init = (Application)context.getApplicationContext();
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("start", new String[] { afInAppEventParameterName });
        final String values = AFa1eSDK.values;
        com.appsflyer.AFLogger.afInfoLog(String.format("Starting AppsFlyer: (v%s.%s)", "6.12.2", values));
        final StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(values);
        com.appsflyer.AFLogger.afInfoLog(sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(this.AFInAppEventType().values());
        if (!TextUtils.isEmpty((CharSequence)afInAppEventParameterName)) {
            AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 17) % 128;
            AFa1aSDK.AFInAppEventType(this.AFInAppEventType().afWarnLog().AFInAppEventParameterName = afInAppEventParameterName);
        }
        else if (TextUtils.isEmpty((CharSequence)this.AFInAppEventType().afWarnLog().AFInAppEventParameterName)) {
            final int n3 = AFa1eSDK.onAttributionFailure + 111;
            AFa1eSDK.onDeepLinking = n3 % 128;
            com.appsflyer.AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (n3 % 2 != 0) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 31) % 128;
                return;
            }
            throw null;
        }
        this.AFInAppEventType().afRDLog().AFInAppEventParameterName((AFd1bSDK)null);
        this.afWarnLog();
        afInfoLog(((ContextWrapper)this.init).getBaseContext());
        if (this.onDeepLinkingNative) {
            this.AFInAppEventType(((Context)this.init).getApplicationContext());
        }
        this.onConversionDataFail.onResponseNative().AFKeystoreWrapper(context, (AFb1iSDK.AFa1wSDK)new AFb1iSDK.AFa1wSDK() {
            @Override
            public final void AFInAppEventType(@NonNull final Context referent) {
                com.appsflyer.AFLogger.afInfoLog("onBecameBackground");
                final AFe1mSDK values = afDebugLog;
                final long currentTimeMillis = System.currentTimeMillis();
                final long afErrorLog = values.afErrorLog;
                if (afErrorLog != 0L) {
                    long duration;
                    final long n = duration = currentTimeMillis - afErrorLog;
                    if (n > 0L) {
                        duration = n;
                        if (n < 1000L) {
                            duration = 1000L;
                        }
                    }
                    final long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
                    values.afWarnLog = seconds;
                    values.valueOf.AFInAppEventParameterName("prev_session_dur", seconds);
                }
                else {
                    com.appsflyer.AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                com.appsflyer.AFLogger.afInfoLog("callStatsBackground background call");
                AFa1eSDK.this.AFKeystoreWrapper(new WeakReference<Context>(referent));
                AFa1eSDK.this.AFInAppEventType().onConversionDataSuccess().valueOf();
                final AFb1tSDK afErrorLogForExcManagerOnly = AFa1eSDK.this.AFInAppEventType().afErrorLogForExcManagerOnly();
                if (afErrorLogForExcManagerOnly.afInfoLog()) {
                    afErrorLogForExcManagerOnly.values();
                    if (referent != null && !AppsFlyerLib.getInstance().isStopped()) {
                        afErrorLogForExcManagerOnly.valueOf(referent.getPackageName(), referent.getPackageManager(), AFa1eSDK.this.AFInAppEventType());
                    }
                    afErrorLogForExcManagerOnly.valueOf();
                }
                else {
                    com.appsflyer.AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1eSDK.this.AFInAppEventType().getLevel().AFInAppEventType();
            }
            
            @Override
            public final void values(@NonNull final Activity activity) {
                afDebugLog.values();
                AFa1eSDK.this.AFInAppEventType().afRDLog().AFInAppEventParameterName((AFd1bSDK)null);
                AFa1eSDK.AFInAppEventParameterName(AFa1eSDK.this);
                final AFa1eSDK afInAppEventParameterName = AFa1eSDK.this;
                final int value = afInAppEventParameterName.valueOf(afInAppEventParameterName.values((Context)activity), false);
                com.appsflyer.AFLogger.afInfoLog("onBecameForeground");
                if (value < 2) {
                    AFa1eSDK.this.AFInAppEventType().getLevel().AFInAppEventParameterName();
                }
                final AFe1hSDK aFe1hSDK = new AFe1hSDK();
                if (activity != null) {
                    AFa1eSDK.this.AFInAppEventType().AppsFlyer2dXConversionCallback().valueOf(aFe1hSDK.valueOf(), activity.getIntent(), (Context)activity.getApplication());
                }
                final AFa1eSDK afInAppEventParameterName2 = AFa1eSDK.this;
                aFe1hSDK.AFInAppEventParameterName = appsFlyerRequestListener;
                afInAppEventParameterName2.values(aFe1hSDK, activity);
            }
        });
    }
    
    @Override
    public final void stop(final boolean afInAppEventType, final Context context) {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 121) % 128;
        this.AFKeystoreWrapper(context);
        final AFc1xSDK afInAppEventType2 = this.AFInAppEventType();
        afInAppEventType2.afWarnLog().AFInAppEventType = afInAppEventType;
        afInAppEventType2.AFInAppEventType().submit(new com.appsflyer.internal.a(afInAppEventType2));
        if (afInAppEventType) {
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 69) % 128;
            afInAppEventType2.values().values("is_stop_tracking_used", true);
        }
        final int n = AFa1eSDK.onAttributionFailure + 37;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 == 0) {}
    }
    
    @Override
    public final void subscribeForDeepLink(@NonNull final DeepLinkListener deepLinkListener) {
        final int n = AFa1eSDK.onDeepLinking + 99;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 != 0) {
            this.subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            return;
        }
        this.subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
    }
    
    @Override
    public final void subscribeForDeepLink(@NonNull final DeepLinkListener afInAppEventParameterName, final long afInfoLog) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 83) % 128;
        this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventParameterName = afInAppEventParameterName;
        this.AFInAppEventType().AppsFlyer2dXConversionCallback().afInfoLog = afInfoLog;
        final int n = AFa1eSDK.onAttributionFailure + 45;
        AFa1eSDK.onDeepLinking = n % 128;
        if (n % 2 == 0) {}
    }
    
    @Override
    public final void unregisterConversionListener() {
        AFa1eSDK.onDeepLinking = (AFa1eSDK.onAttributionFailure + 55) % 128;
        this.AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        this.AFInAppEventParameterName = null;
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 123) % 128;
    }
    
    @Override
    public final void updateServerUninstallToken(final Context context, final String str) {
        this.AFKeystoreWrapper(context);
        final AFe1ySDK aFe1ySDK = new AFe1ySDK(context);
        if (str != null && !str.trim().isEmpty()) {
            com.appsflyer.AFLogger.afInfoLog("[register] Firebase Refreshed Token = ".concat(str));
            final AFb1uSDK afInAppEventParameterName = aFe1ySDK.AFInAppEventParameterName();
            if (afInAppEventParameterName == null || !str.equals(afInAppEventParameterName.valueOf)) {
                final long currentTimeMillis = System.currentTimeMillis();
                final boolean b = afInAppEventParameterName == null || currentTimeMillis - afInAppEventParameterName.AFKeystoreWrapper > TimeUnit.SECONDS.toMillis(2L);
                final AFb1uSDK aFb1uSDK = new AFb1uSDK(str, currentTimeMillis, b ^ true);
                aFe1ySDK.values.AFInAppEventParameterName("afUninstallToken", aFb1uSDK.valueOf);
                aFe1ySDK.values.AFInAppEventParameterName("afUninstallToken_received_time", aFb1uSDK.AFKeystoreWrapper);
                aFe1ySDK.values.values("afUninstallToken_queued", aFb1uSDK.AFKeystoreWrapper());
                if (b) {
                    AFe1ySDK.valueOf(str);
                }
            }
            return;
        }
        com.appsflyer.AFLogger.afWarnLog("[register] Firebase Token is either empty or null and was not registered.");
    }
    
    @Override
    public final void validateAndLogInAppPurchase(final Context context, final String s, final String s2, final String str, final String str2, final String str3, final Map<String, String> map) {
        final AFb1tSDK afErrorLogForExcManagerOnly = this.AFInAppEventType().afErrorLogForExcManagerOnly();
        String string;
        if (map == null) {
            string = "";
        }
        else {
            string = map.toString();
        }
        afErrorLogForExcManagerOnly.AFInAppEventParameterName("validateAndTrackInAppPurchase", s, s2, str, str2, str3, string);
        if (!this.isStopped()) {
            final StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            com.appsflyer.AFLogger.afInfoLog(sb.toString());
        }
        if (s != null && str2 != null && s2 != null && str3 != null && str != null) {
            final Context applicationContext = context.getApplicationContext();
            final String afInAppEventParameterName = this.AFInAppEventType().afWarnLog().AFInAppEventParameterName;
            Intent intent;
            if (context instanceof Activity) {
                intent = ((Activity)context).getIntent();
            }
            else {
                intent = null;
            }
            new Thread(new AFa1gSDK(applicationContext, afInAppEventParameterName, s, s2, str, str2, str3, map, intent)).start();
            return;
        }
        final AppsFlyerInAppPurchaseValidatorListener valueOf = AFa1eSDK.valueOf;
        if (valueOf != null) {
            valueOf.onValidateInAppFailure("Please provide purchase parameters");
        }
    }
    
    public final int valueOf(final AFb1dSDK aFb1dSDK, final boolean b) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 9) % 128;
        final int afKeystoreWrapper = this.AFKeystoreWrapper(aFb1dSDK, "appsFlyerCount", b);
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 13) % 128;
        return afKeystoreWrapper;
    }
    
    public final void valueOf(final Context context, final Map<String, Object> map, final Uri uri) {
        this.AFKeystoreWrapper(context);
        if (map.containsKey("af_deeplink") ^ true) {
            final int n = AFa1eSDK.onAttributionFailure + 29;
            AFa1eSDK.onDeepLinking = n % 128;
            if (n % 2 == 0) {
                AFInAppEventType(uri.toString());
                final String afKeystoreWrapper = this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper;
                throw null;
            }
            final String afInAppEventType = AFInAppEventType(uri.toString());
            final AFb1sSDK appsFlyer2dXConversionCallback = this.AFInAppEventType().AppsFlyer2dXConversionCallback();
            final String afKeystoreWrapper2 = appsFlyer2dXConversionCallback.AFKeystoreWrapper;
            String string = afInAppEventType;
            if (afKeystoreWrapper2 != null) {
                string = afInAppEventType;
                if (appsFlyer2dXConversionCallback.values != null) {
                    string = afInAppEventType;
                    if (afInAppEventType.contains(afKeystoreWrapper2)) {
                        final Uri$Builder buildUpon = Uri.parse(afInAppEventType).buildUpon();
                        final Uri$Builder buildUpon2 = Uri.EMPTY.buildUpon();
                        final Iterator<Map.Entry<String, String>> iterator = appsFlyer2dXConversionCallback.values.entrySet().iterator();
                        int n2 = AFa1eSDK.onDeepLinking + 115;
                        while (true) {
                            AFa1eSDK.onAttributionFailure = n2 % 128;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 23) % 128;
                            final Map.Entry<String, String> entry = iterator.next();
                            buildUpon.appendQueryParameter((String)entry.getKey(), (String)entry.getValue());
                            buildUpon2.appendQueryParameter((String)entry.getKey(), (String)entry.getValue());
                            n2 = AFa1eSDK.onDeepLinking + 93;
                        }
                        string = buildUpon.build().toString();
                        map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
                    }
                }
            }
            map.put("af_deeplink", string);
        }
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("link", uri.toString());
        final AFd1nSDK aFd1nSDK = new AFd1nSDK(this.AFInAppEventType(), UUID.randomUUID(), uri);
        if (aFd1nSDK.afWarnLog()) {
            map.put("isBrandedDomain", Boolean.TRUE);
        }
        AFa1fSDK.AFInAppEventType(context, hashMap, uri);
        if (aFd1nSDK.AFVersionDeclaration()) {
            aFd1nSDK.afInfoLog = this.AFKeystoreWrapper(hashMap);
            final AFc1bSDK afVersionDeclaration = this.AFInAppEventType().AFVersionDeclaration();
            afVersionDeclaration.AFKeystoreWrapper.execute(new Runnable() {
                private /* synthetic */ AFd1zSDK AFInAppEventType;
                
                @Override
                public final void run() {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     1: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //     4: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //     7: astore          6
                    //     9: aload           6
                    //    11: monitorenter   
                    //    12: aload_0        
                    //    13: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    16: getfield        com/appsflyer/internal/AFc1bSDK.afErrorLog:Ljava/util/Set;
                    //    19: aload_0        
                    //    20: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    23: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    28: ifeq            64
                    //    31: new             Ljava/lang/StringBuilder;
                    //    34: dup            
                    //    35: ldc             "QUEUE: tried to add already running task: "
                    //    37: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //    40: astore          7
                    //    42: aload           7
                    //    44: aload_0        
                    //    45: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //    51: pop            
                    //    52: aload           7
                    //    54: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //    57: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //    60: aload           6
                    //    62: monitorexit    
                    //    63: return         
                    //    64: aload_0        
                    //    65: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    68: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //    71: aload_0        
                    //    72: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    75: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    80: ifne            676
                    //    83: aload_0        
                    //    84: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    87: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //    90: aload_0        
                    //    91: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    94: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    99: ifeq            105
                    //   102: goto            676
                    //   105: aload_0        
                    //   106: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   109: astore          7
                    //   111: aload_0        
                    //   112: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   115: astore          8
                    //   117: aload           8
                    //   119: getfield        com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:Ljava/util/Set;
                    //   122: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
                    //   127: astore          9
                    //   129: aload           9
                    //   131: invokeinterface java/util/Iterator.hasNext:()Z
                    //   136: ifeq            182
                    //   139: aload           9
                    //   141: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   146: checkcast       Lcom/appsflyer/internal/AFd1vSDK;
                    //   149: astore          10
                    //   151: aload           7
                    //   153: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                    //   156: aload           10
                    //   158: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //   163: ifeq            129
                    //   166: aload           8
                    //   168: getfield        com/appsflyer/internal/AFd1zSDK.AFInAppEventParameterName:Ljava/util/Set;
                    //   171: aload           10
                    //   173: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   178: pop            
                    //   179: goto            129
                    //   182: aload_0        
                    //   183: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   186: aload_0        
                    //   187: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   190: invokestatic    com/appsflyer/internal/AFc1bSDK.values:(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)Z
                    //   193: ifeq            217
                    //   196: aload_0        
                    //   197: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   200: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   203: aload_0        
                    //   204: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   207: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   212: istore          4
                    //   214: goto            284
                    //   217: aload_0        
                    //   218: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   221: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   224: aload_0        
                    //   225: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   228: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   233: istore          5
                    //   235: iload           5
                    //   237: istore          4
                    //   239: iload           5
                    //   241: ifeq            284
                    //   244: new             Ljava/lang/StringBuilder;
                    //   247: dup            
                    //   248: ldc             "QUEUE: new task was blocked: "
                    //   250: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   253: astore          7
                    //   255: aload           7
                    //   257: aload_0        
                    //   258: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   264: pop            
                    //   265: aload           7
                    //   267: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   270: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   273: aload_0        
                    //   274: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   277: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:()V
                    //   280: iload           5
                    //   282: istore          4
                    //   284: iload           4
                    //   286: ifeq            326
                    //   289: aload_0        
                    //   290: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   293: astore          7
                    //   295: aload           7
                    //   297: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   300: aload           7
                    //   302: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                    //   305: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
                    //   310: pop            
                    //   311: aload_0        
                    //   312: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   315: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                    //   318: invokeinterface java/util/List.clear:()V
                    //   323: goto            355
                    //   326: new             Ljava/lang/StringBuilder;
                    //   329: dup            
                    //   330: ldc             "QUEUE: task not added, it's already in the queue: "
                    //   332: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   335: astore          7
                    //   337: aload           7
                    //   339: aload_0        
                    //   340: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   346: pop            
                    //   347: aload           7
                    //   349: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   352: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   355: aload           6
                    //   357: monitorexit    
                    //   358: iload           4
                    //   360: ifeq            646
                    //   363: aload_0        
                    //   364: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   367: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                    //   370: aload_0        
                    //   371: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   374: getfield        com/appsflyer/internal/AFd1zSDK.values:Lcom/appsflyer/internal/AFd1vSDK;
                    //   377: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   382: pop            
                    //   383: new             Ljava/lang/StringBuilder;
                    //   386: dup            
                    //   387: ldc             "QUEUE: new task added: "
                    //   389: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   392: astore          6
                    //   394: aload           6
                    //   396: aload_0        
                    //   397: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   400: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   403: pop            
                    //   404: aload           6
                    //   406: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   409: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   412: aload_0        
                    //   413: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   416: getfield        com/appsflyer/internal/AFc1bSDK.values:Ljava/util/List;
                    //   419: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                    //   424: astore          6
                    //   426: aload           6
                    //   428: invokeinterface java/util/Iterator.hasNext:()Z
                    //   433: ifeq            451
                    //   436: aload           6
                    //   438: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   443: checkcast       Lcom/appsflyer/internal/AFc1cSDK;
                    //   446: astore          7
                    //   448: goto            426
                    //   451: aload_0        
                    //   452: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   455: astore          6
                    //   457: aload           6
                    //   459: getfield        com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;
                    //   462: aload           6
                    //   464: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
                    //   469: pop            
                    //   470: aload_0        
                    //   471: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   474: astore          8
                    //   476: aload           8
                    //   478: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   481: astore          7
                    //   483: aload           7
                    //   485: monitorenter   
                    //   486: aload           8
                    //   488: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   491: invokeinterface java/util/Set.size:()I
                    //   496: aload           8
                    //   498: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   501: invokeinterface java/util/Set.size:()I
                    //   506: iadd           
                    //   507: bipush          40
                    //   509: isub           
                    //   510: istore_1       
                    //   511: iload_1        
                    //   512: ifle            636
                    //   515: aload           8
                    //   517: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   520: invokeinterface java/util/Set.isEmpty:()Z
                    //   525: iconst_1       
                    //   526: ixor           
                    //   527: istore_2       
                    //   528: aload           8
                    //   530: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   533: invokeinterface java/util/Set.isEmpty:()Z
                    //   538: iconst_1       
                    //   539: ixor           
                    //   540: istore_3       
                    //   541: iload_3        
                    //   542: ifeq            608
                    //   545: iload_2        
                    //   546: ifeq            608
                    //   549: aload           8
                    //   551: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   554: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                    //   559: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                    //   562: aload           8
                    //   564: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   567: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                    //   572: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                    //   575: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:(Lcom/appsflyer/internal/AFd1zSDK;)I
                    //   578: ifle            598
                    //   581: aload           8
                    //   583: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   586: astore          6
                    //   588: aload           8
                    //   590: aload           6
                    //   592: invokevirtual   com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:(Ljava/util/NavigableSet;)V
                    //   595: goto            725
                    //   598: aload           8
                    //   600: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   603: astore          6
                    //   605: goto            588
                    //   608: iload_3        
                    //   609: ifeq            622
                    //   612: aload           8
                    //   614: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   617: astore          6
                    //   619: goto            588
                    //   622: iload_2        
                    //   623: ifeq            725
                    //   626: aload           8
                    //   628: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   631: astore          6
                    //   633: goto            588
                    //   636: aload           7
                    //   638: monitorexit    
                    //   639: return         
                    //   640: aload           7
                    //   642: monitorexit    
                    //   643: aload           6
                    //   645: athrow         
                    //   646: new             Ljava/lang/StringBuilder;
                    //   649: dup            
                    //   650: ldc             "QUEUE: tried to add already pending task: "
                    //   652: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   655: astore          6
                    //   657: aload           6
                    //   659: aload_0        
                    //   660: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   663: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   666: pop            
                    //   667: aload           6
                    //   669: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   672: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
                    //   675: return         
                    //   676: new             Ljava/lang/StringBuilder;
                    //   679: dup            
                    //   680: ldc             "QUEUE: tried to add already scheduled task: "
                    //   682: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   685: astore          7
                    //   687: aload           7
                    //   689: aload_0        
                    //   690: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   693: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   696: pop            
                    //   697: aload           7
                    //   699: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   702: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   705: aload           6
                    //   707: monitorexit    
                    //   708: return         
                    //   709: aload           6
                    //   711: monitorexit    
                    //   712: aload           7
                    //   714: athrow         
                    //   715: astore          7
                    //   717: goto            709
                    //   720: astore          6
                    //   722: goto            640
                    //   725: iload_1        
                    //   726: iconst_1       
                    //   727: isub           
                    //   728: istore_1       
                    //   729: goto            511
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type
                    //  -----  -----  -----  -----  ----
                    //  12     63     715    720    Any
                    //  64     102    715    720    Any
                    //  105    129    715    720    Any
                    //  129    179    715    720    Any
                    //  182    214    715    720    Any
                    //  217    235    715    720    Any
                    //  244    280    715    720    Any
                    //  289    323    715    720    Any
                    //  326    355    715    720    Any
                    //  355    358    715    720    Any
                    //  486    511    720    646    Any
                    //  515    541    720    646    Any
                    //  549    588    720    646    Any
                    //  588    595    720    646    Any
                    //  598    605    720    646    Any
                    //  612    619    720    646    Any
                    //  626    633    720    646    Any
                    //  636    639    720    646    Any
                    //  676    708    715    720    Any
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.IllegalStateException: Expression is linked from several locations: Label_0511:
                    //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                    //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
                    //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
                    // 
                    throw new IllegalStateException("An error occurred while decompiling this method.");
                }
            });
            return;
        }
        this.AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType(hashMap);
    }
    
    public final AFb1dSDK values(final Context context) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 19) % 128;
        this.AFKeystoreWrapper(context);
        final AFb1dSDK values = this.AFInAppEventType().values();
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 33) % 128;
        return values;
    }
    
    public final void values(@NonNull final AFa1qSDK aFa1qSDK, final Activity activity) {
        this.AFInAppEventType(aFa1qSDK, activity);
        if (this.AFInAppEventType().afWarnLog().AFInAppEventParameterName != null) {
            String referrer = AppsFlyerProperties.getInstance().getReferrer(this.AFInAppEventType().values());
            if (referrer == null) {
                referrer = "";
            }
            else {
                AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 99) % 128;
            }
            aFa1qSDK.afErrorLog = referrer;
            this.AFInAppEventType(aFa1qSDK);
            AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 95) % 128;
            return;
        }
        final int n = AFa1eSDK.onDeepLinking + 65;
        AFa1eSDK.onAttributionFailure = n % 128;
        com.appsflyer.AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
        final AppsFlyerRequestListener afInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName;
        if (n % 2 == 0) {
            if (afInAppEventParameterName != null) {
                afInAppEventParameterName.onError(41, "No dev key");
            }
            return;
        }
        throw null;
    }
    
    @Override
    public final void waitForCustomerUserId(final boolean b) {
        AFa1eSDK.onAttributionFailure = (AFa1eSDK.onDeepLinking + 77) % 128;
        com.appsflyer.AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(b)), true);
        AFInAppEventType("waitForCustomerId", b);
        final int n = AFa1eSDK.onDeepLinking + 45;
        AFa1eSDK.onAttributionFailure = n % 128;
        if (n % 2 == 0) {
            return;
        }
        throw null;
    }
    
    public final class AFa1vSDK implements Runnable
    {
        private final AFa1qSDK AFInAppEventParameterName;
        
        private AFa1vSDK(final AFa1qSDK afInAppEventParameterName) {
            this.AFInAppEventParameterName = afInAppEventParameterName;
        }
        
        @Override
        public final void run() {
            AFa1eSDK.valueOf(AFa1eSDK.this, this.AFInAppEventParameterName);
        }
    }
    
    public final class AFa1wSDK implements AFc1cSDK
    {
        private AFa1wSDK() {
        }
        
        private boolean values() {
            return AFa1eSDK.this.AFInAppEventParameterName != null;
        }
        
        @Override
        public final void AFInAppEventParameterName(final AFd1zSDK<?> aFd1zSDK) {
        }
        
        @Override
        public final void AFInAppEventType(final AFd1zSDK<?> aFd1zSDK, final AFd1ySDK aFd1ySDK) {
            if (aFd1zSDK instanceof AFd1hSDK) {
                final AFd1fSDK aFd1fSDK = (AFd1fSDK)aFd1zSDK;
                final boolean b = aFd1zSDK instanceof AFd1fSDK;
                if (b && this.values()) {
                    final AFd1fSDK aFd1fSDK2 = (AFd1fSDK)aFd1zSDK;
                    if (aFd1fSDK2.valueOf == AFd1ySDK.AFInAppEventParameterName || aFd1fSDK2.AFInAppEventType == 1) {
                        final AFe1pSDK aFe1pSDK = new AFe1pSDK(aFd1fSDK2, AFa1eSDK.this.AFInAppEventType().values());
                        final AFc1bSDK afVersionDeclaration = AFa1eSDK.this.AFInAppEventType().AFVersionDeclaration();
                        afVersionDeclaration.AFKeystoreWrapper.execute(new Runnable() {
                            private /* synthetic */ AFd1zSDK AFInAppEventType;
                            
                            @Override
                            public final void run() {
                                // 
                                // This method could not be decompiled.
                                // 
                                // Original Bytecode:
                                // 
                                //     1: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //     4: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                                //     7: astore          6
                                //     9: aload           6
                                //    11: monitorenter   
                                //    12: aload_0        
                                //    13: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //    16: getfield        com/appsflyer/internal/AFc1bSDK.afErrorLog:Ljava/util/Set;
                                //    19: aload_0        
                                //    20: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //    23: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                                //    28: ifeq            64
                                //    31: new             Ljava/lang/StringBuilder;
                                //    34: dup            
                                //    35: ldc             "QUEUE: tried to add already running task: "
                                //    37: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                                //    40: astore          7
                                //    42: aload           7
                                //    44: aload_0        
                                //    45: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                                //    51: pop            
                                //    52: aload           7
                                //    54: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                                //    57: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                                //    60: aload           6
                                //    62: monitorexit    
                                //    63: return         
                                //    64: aload_0        
                                //    65: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //    68: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                                //    71: aload_0        
                                //    72: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //    75: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                                //    80: ifne            676
                                //    83: aload_0        
                                //    84: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //    87: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                                //    90: aload_0        
                                //    91: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //    94: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                                //    99: ifeq            105
                                //   102: goto            676
                                //   105: aload_0        
                                //   106: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //   109: astore          7
                                //   111: aload_0        
                                //   112: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //   115: astore          8
                                //   117: aload           8
                                //   119: getfield        com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:Ljava/util/Set;
                                //   122: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
                                //   127: astore          9
                                //   129: aload           9
                                //   131: invokeinterface java/util/Iterator.hasNext:()Z
                                //   136: ifeq            182
                                //   139: aload           9
                                //   141: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                                //   146: checkcast       Lcom/appsflyer/internal/AFd1vSDK;
                                //   149: astore          10
                                //   151: aload           7
                                //   153: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                                //   156: aload           10
                                //   158: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                                //   163: ifeq            129
                                //   166: aload           8
                                //   168: getfield        com/appsflyer/internal/AFd1zSDK.AFInAppEventParameterName:Ljava/util/Set;
                                //   171: aload           10
                                //   173: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                                //   178: pop            
                                //   179: goto            129
                                //   182: aload_0        
                                //   183: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //   186: aload_0        
                                //   187: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //   190: invokestatic    com/appsflyer/internal/AFc1bSDK.values:(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)Z
                                //   193: ifeq            217
                                //   196: aload_0        
                                //   197: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //   200: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                                //   203: aload_0        
                                //   204: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //   207: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                                //   212: istore          4
                                //   214: goto            284
                                //   217: aload_0        
                                //   218: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //   221: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                                //   224: aload_0        
                                //   225: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //   228: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                                //   233: istore          5
                                //   235: iload           5
                                //   237: istore          4
                                //   239: iload           5
                                //   241: ifeq            284
                                //   244: new             Ljava/lang/StringBuilder;
                                //   247: dup            
                                //   248: ldc             "QUEUE: new task was blocked: "
                                //   250: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                                //   253: astore          7
                                //   255: aload           7
                                //   257: aload_0        
                                //   258: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                                //   264: pop            
                                //   265: aload           7
                                //   267: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                                //   270: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                                //   273: aload_0        
                                //   274: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //   277: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:()V
                                //   280: iload           5
                                //   282: istore          4
                                //   284: iload           4
                                //   286: ifeq            326
                                //   289: aload_0        
                                //   290: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //   293: astore          7
                                //   295: aload           7
                                //   297: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                                //   300: aload           7
                                //   302: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                                //   305: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
                                //   310: pop            
                                //   311: aload_0        
                                //   312: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //   315: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                                //   318: invokeinterface java/util/List.clear:()V
                                //   323: goto            355
                                //   326: new             Ljava/lang/StringBuilder;
                                //   329: dup            
                                //   330: ldc             "QUEUE: task not added, it's already in the queue: "
                                //   332: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                                //   335: astore          7
                                //   337: aload           7
                                //   339: aload_0        
                                //   340: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                                //   346: pop            
                                //   347: aload           7
                                //   349: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                                //   352: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                                //   355: aload           6
                                //   357: monitorexit    
                                //   358: iload           4
                                //   360: ifeq            646
                                //   363: aload_0        
                                //   364: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //   367: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                                //   370: aload_0        
                                //   371: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //   374: getfield        com/appsflyer/internal/AFd1zSDK.values:Lcom/appsflyer/internal/AFd1vSDK;
                                //   377: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                                //   382: pop            
                                //   383: new             Ljava/lang/StringBuilder;
                                //   386: dup            
                                //   387: ldc             "QUEUE: new task added: "
                                //   389: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                                //   392: astore          6
                                //   394: aload           6
                                //   396: aload_0        
                                //   397: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //   400: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                                //   403: pop            
                                //   404: aload           6
                                //   406: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                                //   409: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                                //   412: aload_0        
                                //   413: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //   416: getfield        com/appsflyer/internal/AFc1bSDK.values:Ljava/util/List;
                                //   419: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                                //   424: astore          6
                                //   426: aload           6
                                //   428: invokeinterface java/util/Iterator.hasNext:()Z
                                //   433: ifeq            451
                                //   436: aload           6
                                //   438: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                                //   443: checkcast       Lcom/appsflyer/internal/AFc1cSDK;
                                //   446: astore          7
                                //   448: goto            426
                                //   451: aload_0        
                                //   452: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //   455: astore          6
                                //   457: aload           6
                                //   459: getfield        com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;
                                //   462: aload           6
                                //   464: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
                                //   469: pop            
                                //   470: aload_0        
                                //   471: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                                //   474: astore          8
                                //   476: aload           8
                                //   478: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                                //   481: astore          7
                                //   483: aload           7
                                //   485: monitorenter   
                                //   486: aload           8
                                //   488: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                                //   491: invokeinterface java/util/Set.size:()I
                                //   496: aload           8
                                //   498: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                                //   501: invokeinterface java/util/Set.size:()I
                                //   506: iadd           
                                //   507: bipush          40
                                //   509: isub           
                                //   510: istore_1       
                                //   511: iload_1        
                                //   512: ifle            636
                                //   515: aload           8
                                //   517: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                                //   520: invokeinterface java/util/Set.isEmpty:()Z
                                //   525: iconst_1       
                                //   526: ixor           
                                //   527: istore_2       
                                //   528: aload           8
                                //   530: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                                //   533: invokeinterface java/util/Set.isEmpty:()Z
                                //   538: iconst_1       
                                //   539: ixor           
                                //   540: istore_3       
                                //   541: iload_3        
                                //   542: ifeq            608
                                //   545: iload_2        
                                //   546: ifeq            608
                                //   549: aload           8
                                //   551: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                                //   554: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                                //   559: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                                //   562: aload           8
                                //   564: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                                //   567: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                                //   572: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                                //   575: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:(Lcom/appsflyer/internal/AFd1zSDK;)I
                                //   578: ifle            598
                                //   581: aload           8
                                //   583: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                                //   586: astore          6
                                //   588: aload           8
                                //   590: aload           6
                                //   592: invokevirtual   com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:(Ljava/util/NavigableSet;)V
                                //   595: goto            725
                                //   598: aload           8
                                //   600: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                                //   603: astore          6
                                //   605: goto            588
                                //   608: iload_3        
                                //   609: ifeq            622
                                //   612: aload           8
                                //   614: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                                //   617: astore          6
                                //   619: goto            588
                                //   622: iload_2        
                                //   623: ifeq            725
                                //   626: aload           8
                                //   628: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                                //   631: astore          6
                                //   633: goto            588
                                //   636: aload           7
                                //   638: monitorexit    
                                //   639: return         
                                //   640: aload           7
                                //   642: monitorexit    
                                //   643: aload           6
                                //   645: athrow         
                                //   646: new             Ljava/lang/StringBuilder;
                                //   649: dup            
                                //   650: ldc             "QUEUE: tried to add already pending task: "
                                //   652: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                                //   655: astore          6
                                //   657: aload           6
                                //   659: aload_0        
                                //   660: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //   663: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                                //   666: pop            
                                //   667: aload           6
                                //   669: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                                //   672: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
                                //   675: return         
                                //   676: new             Ljava/lang/StringBuilder;
                                //   679: dup            
                                //   680: ldc             "QUEUE: tried to add already scheduled task: "
                                //   682: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                                //   685: astore          7
                                //   687: aload           7
                                //   689: aload_0        
                                //   690: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                                //   693: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                                //   696: pop            
                                //   697: aload           7
                                //   699: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                                //   702: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                                //   705: aload           6
                                //   707: monitorexit    
                                //   708: return         
                                //   709: aload           6
                                //   711: monitorexit    
                                //   712: aload           7
                                //   714: athrow         
                                //   715: astore          7
                                //   717: goto            709
                                //   720: astore          6
                                //   722: goto            640
                                //   725: iload_1        
                                //   726: iconst_1       
                                //   727: isub           
                                //   728: istore_1       
                                //   729: goto            511
                                //    Exceptions:
                                //  Try           Handler
                                //  Start  End    Start  End    Type
                                //  -----  -----  -----  -----  ----
                                //  12     63     715    720    Any
                                //  64     102    715    720    Any
                                //  105    129    715    720    Any
                                //  129    179    715    720    Any
                                //  182    214    715    720    Any
                                //  217    235    715    720    Any
                                //  244    280    715    720    Any
                                //  289    323    715    720    Any
                                //  326    355    715    720    Any
                                //  355    358    715    720    Any
                                //  486    511    720    646    Any
                                //  515    541    720    646    Any
                                //  549    588    720    646    Any
                                //  588    595    720    646    Any
                                //  598    605    720    646    Any
                                //  612    619    720    646    Any
                                //  626    633    720    646    Any
                                //  636    639    720    646    Any
                                //  676    708    715    720    Any
                                // 
                                // The error that occurred was:
                                // 
                                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0511:
                                //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                                //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
                                //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                                //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
                                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
                                //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
                                //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
                                //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
                                //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
                                //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
                                // 
                                throw new IllegalStateException("An error occurred while decompiling this method.");
                            }
                        });
                    }
                }
                if (aFd1ySDK == AFd1ySDK.AFInAppEventParameterName) {
                    final AFa1eSDK valueOf = AFa1eSDK.this;
                    valueOf.values((Context)AFa1eSDK.AFInAppEventType(valueOf)).AFInAppEventParameterName("sentSuccessfully", "true");
                    if (!(aFd1zSDK instanceof AFd1eSDK)) {
                        final AFb1uSDK afInAppEventParameterName = new AFe1ySDK((Context)AFa1eSDK.AFInAppEventType(AFa1eSDK.this)).AFInAppEventParameterName();
                        if (afInAppEventParameterName != null && afInAppEventParameterName.AFKeystoreWrapper()) {
                            final String valueOf2 = afInAppEventParameterName.valueOf;
                            com.appsflyer.AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(valueOf2)));
                            AFe1ySDK.valueOf(valueOf2);
                        }
                    }
                    final AFc1gSDK<Result> afErrorLog = aFd1fSDK.afErrorLog;
                    if (afErrorLog != null) {
                        final JSONObject afKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper((String)afErrorLog.getBody());
                        if (afKeystoreWrapper != null) {
                            AFa1eSDK.valueOf(AFa1eSDK.this, afKeystoreWrapper.optBoolean("send_background", false));
                        }
                    }
                    if (b) {
                        AFa1eSDK.AFKeystoreWrapper(AFa1eSDK.this, System.currentTimeMillis());
                    }
                }
                return;
            }
            if (aFd1zSDK instanceof AFe1pSDK && aFd1ySDK != AFd1ySDK.AFInAppEventParameterName) {
                final AFe1rSDK aFe1rSDK = new AFe1rSDK(AFa1eSDK.this.AFInAppEventType());
                final AFc1bSDK afVersionDeclaration2 = AFa1eSDK.this.AFInAppEventType().AFVersionDeclaration();
                afVersionDeclaration2.AFKeystoreWrapper.execute(new Runnable() {
                    private /* synthetic */ AFd1zSDK AFInAppEventType;
                    
                    @Override
                    public final void run() {
                        // 
                        // This method could not be decompiled.
                        // 
                        // Original Bytecode:
                        // 
                        //     1: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //     4: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                        //     7: astore          6
                        //     9: aload           6
                        //    11: monitorenter   
                        //    12: aload_0        
                        //    13: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //    16: getfield        com/appsflyer/internal/AFc1bSDK.afErrorLog:Ljava/util/Set;
                        //    19: aload_0        
                        //    20: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //    23: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                        //    28: ifeq            64
                        //    31: new             Ljava/lang/StringBuilder;
                        //    34: dup            
                        //    35: ldc             "QUEUE: tried to add already running task: "
                        //    37: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                        //    40: astore          7
                        //    42: aload           7
                        //    44: aload_0        
                        //    45: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                        //    51: pop            
                        //    52: aload           7
                        //    54: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                        //    57: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                        //    60: aload           6
                        //    62: monitorexit    
                        //    63: return         
                        //    64: aload_0        
                        //    65: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //    68: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                        //    71: aload_0        
                        //    72: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //    75: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                        //    80: ifne            676
                        //    83: aload_0        
                        //    84: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //    87: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                        //    90: aload_0        
                        //    91: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //    94: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                        //    99: ifeq            105
                        //   102: goto            676
                        //   105: aload_0        
                        //   106: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //   109: astore          7
                        //   111: aload_0        
                        //   112: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //   115: astore          8
                        //   117: aload           8
                        //   119: getfield        com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:Ljava/util/Set;
                        //   122: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
                        //   127: astore          9
                        //   129: aload           9
                        //   131: invokeinterface java/util/Iterator.hasNext:()Z
                        //   136: ifeq            182
                        //   139: aload           9
                        //   141: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                        //   146: checkcast       Lcom/appsflyer/internal/AFd1vSDK;
                        //   149: astore          10
                        //   151: aload           7
                        //   153: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                        //   156: aload           10
                        //   158: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                        //   163: ifeq            129
                        //   166: aload           8
                        //   168: getfield        com/appsflyer/internal/AFd1zSDK.AFInAppEventParameterName:Ljava/util/Set;
                        //   171: aload           10
                        //   173: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                        //   178: pop            
                        //   179: goto            129
                        //   182: aload_0        
                        //   183: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //   186: aload_0        
                        //   187: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //   190: invokestatic    com/appsflyer/internal/AFc1bSDK.values:(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)Z
                        //   193: ifeq            217
                        //   196: aload_0        
                        //   197: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //   200: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                        //   203: aload_0        
                        //   204: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //   207: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                        //   212: istore          4
                        //   214: goto            284
                        //   217: aload_0        
                        //   218: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //   221: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                        //   224: aload_0        
                        //   225: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //   228: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                        //   233: istore          5
                        //   235: iload           5
                        //   237: istore          4
                        //   239: iload           5
                        //   241: ifeq            284
                        //   244: new             Ljava/lang/StringBuilder;
                        //   247: dup            
                        //   248: ldc             "QUEUE: new task was blocked: "
                        //   250: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                        //   253: astore          7
                        //   255: aload           7
                        //   257: aload_0        
                        //   258: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                        //   264: pop            
                        //   265: aload           7
                        //   267: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                        //   270: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                        //   273: aload_0        
                        //   274: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //   277: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:()V
                        //   280: iload           5
                        //   282: istore          4
                        //   284: iload           4
                        //   286: ifeq            326
                        //   289: aload_0        
                        //   290: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //   293: astore          7
                        //   295: aload           7
                        //   297: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                        //   300: aload           7
                        //   302: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                        //   305: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
                        //   310: pop            
                        //   311: aload_0        
                        //   312: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //   315: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                        //   318: invokeinterface java/util/List.clear:()V
                        //   323: goto            355
                        //   326: new             Ljava/lang/StringBuilder;
                        //   329: dup            
                        //   330: ldc             "QUEUE: task not added, it's already in the queue: "
                        //   332: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                        //   335: astore          7
                        //   337: aload           7
                        //   339: aload_0        
                        //   340: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                        //   346: pop            
                        //   347: aload           7
                        //   349: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                        //   352: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                        //   355: aload           6
                        //   357: monitorexit    
                        //   358: iload           4
                        //   360: ifeq            646
                        //   363: aload_0        
                        //   364: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //   367: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                        //   370: aload_0        
                        //   371: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //   374: getfield        com/appsflyer/internal/AFd1zSDK.values:Lcom/appsflyer/internal/AFd1vSDK;
                        //   377: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                        //   382: pop            
                        //   383: new             Ljava/lang/StringBuilder;
                        //   386: dup            
                        //   387: ldc             "QUEUE: new task added: "
                        //   389: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                        //   392: astore          6
                        //   394: aload           6
                        //   396: aload_0        
                        //   397: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //   400: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                        //   403: pop            
                        //   404: aload           6
                        //   406: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                        //   409: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                        //   412: aload_0        
                        //   413: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //   416: getfield        com/appsflyer/internal/AFc1bSDK.values:Ljava/util/List;
                        //   419: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                        //   424: astore          6
                        //   426: aload           6
                        //   428: invokeinterface java/util/Iterator.hasNext:()Z
                        //   433: ifeq            451
                        //   436: aload           6
                        //   438: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                        //   443: checkcast       Lcom/appsflyer/internal/AFc1cSDK;
                        //   446: astore          7
                        //   448: goto            426
                        //   451: aload_0        
                        //   452: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //   455: astore          6
                        //   457: aload           6
                        //   459: getfield        com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;
                        //   462: aload           6
                        //   464: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
                        //   469: pop            
                        //   470: aload_0        
                        //   471: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                        //   474: astore          8
                        //   476: aload           8
                        //   478: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                        //   481: astore          7
                        //   483: aload           7
                        //   485: monitorenter   
                        //   486: aload           8
                        //   488: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                        //   491: invokeinterface java/util/Set.size:()I
                        //   496: aload           8
                        //   498: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                        //   501: invokeinterface java/util/Set.size:()I
                        //   506: iadd           
                        //   507: bipush          40
                        //   509: isub           
                        //   510: istore_1       
                        //   511: iload_1        
                        //   512: ifle            636
                        //   515: aload           8
                        //   517: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                        //   520: invokeinterface java/util/Set.isEmpty:()Z
                        //   525: iconst_1       
                        //   526: ixor           
                        //   527: istore_2       
                        //   528: aload           8
                        //   530: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                        //   533: invokeinterface java/util/Set.isEmpty:()Z
                        //   538: iconst_1       
                        //   539: ixor           
                        //   540: istore_3       
                        //   541: iload_3        
                        //   542: ifeq            608
                        //   545: iload_2        
                        //   546: ifeq            608
                        //   549: aload           8
                        //   551: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                        //   554: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                        //   559: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                        //   562: aload           8
                        //   564: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                        //   567: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                        //   572: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                        //   575: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:(Lcom/appsflyer/internal/AFd1zSDK;)I
                        //   578: ifle            598
                        //   581: aload           8
                        //   583: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                        //   586: astore          6
                        //   588: aload           8
                        //   590: aload           6
                        //   592: invokevirtual   com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:(Ljava/util/NavigableSet;)V
                        //   595: goto            725
                        //   598: aload           8
                        //   600: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                        //   603: astore          6
                        //   605: goto            588
                        //   608: iload_3        
                        //   609: ifeq            622
                        //   612: aload           8
                        //   614: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                        //   617: astore          6
                        //   619: goto            588
                        //   622: iload_2        
                        //   623: ifeq            725
                        //   626: aload           8
                        //   628: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                        //   631: astore          6
                        //   633: goto            588
                        //   636: aload           7
                        //   638: monitorexit    
                        //   639: return         
                        //   640: aload           7
                        //   642: monitorexit    
                        //   643: aload           6
                        //   645: athrow         
                        //   646: new             Ljava/lang/StringBuilder;
                        //   649: dup            
                        //   650: ldc             "QUEUE: tried to add already pending task: "
                        //   652: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                        //   655: astore          6
                        //   657: aload           6
                        //   659: aload_0        
                        //   660: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //   663: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                        //   666: pop            
                        //   667: aload           6
                        //   669: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                        //   672: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
                        //   675: return         
                        //   676: new             Ljava/lang/StringBuilder;
                        //   679: dup            
                        //   680: ldc             "QUEUE: tried to add already scheduled task: "
                        //   682: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                        //   685: astore          7
                        //   687: aload           7
                        //   689: aload_0        
                        //   690: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                        //   693: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                        //   696: pop            
                        //   697: aload           7
                        //   699: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                        //   702: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                        //   705: aload           6
                        //   707: monitorexit    
                        //   708: return         
                        //   709: aload           6
                        //   711: monitorexit    
                        //   712: aload           7
                        //   714: athrow         
                        //   715: astore          7
                        //   717: goto            709
                        //   720: astore          6
                        //   722: goto            640
                        //   725: iload_1        
                        //   726: iconst_1       
                        //   727: isub           
                        //   728: istore_1       
                        //   729: goto            511
                        //    Exceptions:
                        //  Try           Handler
                        //  Start  End    Start  End    Type
                        //  -----  -----  -----  -----  ----
                        //  12     63     715    720    Any
                        //  64     102    715    720    Any
                        //  105    129    715    720    Any
                        //  129    179    715    720    Any
                        //  182    214    715    720    Any
                        //  217    235    715    720    Any
                        //  244    280    715    720    Any
                        //  289    323    715    720    Any
                        //  326    355    715    720    Any
                        //  355    358    715    720    Any
                        //  486    511    720    646    Any
                        //  515    541    720    646    Any
                        //  549    588    720    646    Any
                        //  588    595    720    646    Any
                        //  598    605    720    646    Any
                        //  612    619    720    646    Any
                        //  626    633    720    646    Any
                        //  636    639    720    646    Any
                        //  676    708    715    720    Any
                        // 
                        // The error that occurred was:
                        // 
                        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0511:
                        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
                        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
                        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
                        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
                        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
                        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
                        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
                        // 
                        throw new IllegalStateException("An error occurred while decompiling this method.");
                    }
                });
            }
        }
        
        @Override
        public final void values(final AFd1zSDK<?> aFd1zSDK) {
            if (aFd1zSDK instanceof AFd1fSDK) {
                AFa1eSDK.this.AFInAppEventType().afDebugLog().AFKeystoreWrapper(((AFd1hSDK)aFd1zSDK).afInfoLog.AFLogger);
            }
        }
    }
    
    public final class AFa1ySDK implements Runnable
    {
        private final AFa1qSDK values;
        
        private AFa1ySDK(final AFa1qSDK values) {
            this.values = values;
        }
        
        @Override
        public final void run() {
            AFd1hSDK aFd1hSDK;
            if (this.values.AFInAppEventParameterName()) {
                aFd1hSDK = new AFd1fSDK(this.values, AFa1eSDK.this.AFInAppEventType());
                ((AFd1fSDK)aFd1hSDK).AFVersionDeclaration = (Map<String, Object>)AFa1eSDK.values(AFa1eSDK.this);
            }
            else {
                aFd1hSDK = new AFd1hSDK(this.values, AFa1eSDK.this.AFInAppEventType());
            }
            final AFc1bSDK afVersionDeclaration = AFa1eSDK.this.AFInAppEventType().AFVersionDeclaration();
            afVersionDeclaration.AFKeystoreWrapper.execute(new Runnable() {
                private /* synthetic */ AFd1zSDK AFInAppEventType = new AFd1lSDK(afInAppEventType);
                
                @Override
                public final void run() {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     1: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //     4: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //     7: astore          6
                    //     9: aload           6
                    //    11: monitorenter   
                    //    12: aload_0        
                    //    13: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    16: getfield        com/appsflyer/internal/AFc1bSDK.afErrorLog:Ljava/util/Set;
                    //    19: aload_0        
                    //    20: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    23: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    28: ifeq            64
                    //    31: new             Ljava/lang/StringBuilder;
                    //    34: dup            
                    //    35: ldc             "QUEUE: tried to add already running task: "
                    //    37: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //    40: astore          7
                    //    42: aload           7
                    //    44: aload_0        
                    //    45: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //    51: pop            
                    //    52: aload           7
                    //    54: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //    57: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //    60: aload           6
                    //    62: monitorexit    
                    //    63: return         
                    //    64: aload_0        
                    //    65: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    68: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //    71: aload_0        
                    //    72: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    75: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    80: ifne            676
                    //    83: aload_0        
                    //    84: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //    87: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //    90: aload_0        
                    //    91: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //    94: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //    99: ifeq            105
                    //   102: goto            676
                    //   105: aload_0        
                    //   106: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   109: astore          7
                    //   111: aload_0        
                    //   112: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   115: astore          8
                    //   117: aload           8
                    //   119: getfield        com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:Ljava/util/Set;
                    //   122: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
                    //   127: astore          9
                    //   129: aload           9
                    //   131: invokeinterface java/util/Iterator.hasNext:()Z
                    //   136: ifeq            182
                    //   139: aload           9
                    //   141: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   146: checkcast       Lcom/appsflyer/internal/AFd1vSDK;
                    //   149: astore          10
                    //   151: aload           7
                    //   153: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                    //   156: aload           10
                    //   158: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
                    //   163: ifeq            129
                    //   166: aload           8
                    //   168: getfield        com/appsflyer/internal/AFd1zSDK.AFInAppEventParameterName:Ljava/util/Set;
                    //   171: aload           10
                    //   173: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   178: pop            
                    //   179: goto            129
                    //   182: aload_0        
                    //   183: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   186: aload_0        
                    //   187: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   190: invokestatic    com/appsflyer/internal/AFc1bSDK.values:(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFd1zSDK;)Z
                    //   193: ifeq            217
                    //   196: aload_0        
                    //   197: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   200: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   203: aload_0        
                    //   204: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   207: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   212: istore          4
                    //   214: goto            284
                    //   217: aload_0        
                    //   218: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   221: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   224: aload_0        
                    //   225: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   228: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   233: istore          5
                    //   235: iload           5
                    //   237: istore          4
                    //   239: iload           5
                    //   241: ifeq            284
                    //   244: new             Ljava/lang/StringBuilder;
                    //   247: dup            
                    //   248: ldc             "QUEUE: new task was blocked: "
                    //   250: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   253: astore          7
                    //   255: aload           7
                    //   257: aload_0        
                    //   258: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   264: pop            
                    //   265: aload           7
                    //   267: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   270: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   273: aload_0        
                    //   274: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   277: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:()V
                    //   280: iload           5
                    //   282: istore          4
                    //   284: iload           4
                    //   286: ifeq            326
                    //   289: aload_0        
                    //   290: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   293: astore          7
                    //   295: aload           7
                    //   297: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   300: aload           7
                    //   302: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                    //   305: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
                    //   310: pop            
                    //   311: aload_0        
                    //   312: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   315: getfield        com/appsflyer/internal/AFc1bSDK.afDebugLog:Ljava/util/List;
                    //   318: invokeinterface java/util/List.clear:()V
                    //   323: goto            355
                    //   326: new             Ljava/lang/StringBuilder;
                    //   329: dup            
                    //   330: ldc             "QUEUE: task not added, it's already in the queue: "
                    //   332: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   335: astore          7
                    //   337: aload           7
                    //   339: aload_0        
                    //   340: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   346: pop            
                    //   347: aload           7
                    //   349: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   352: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   355: aload           6
                    //   357: monitorexit    
                    //   358: iload           4
                    //   360: ifeq            646
                    //   363: aload_0        
                    //   364: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   367: getfield        com/appsflyer/internal/AFc1bSDK.valueOf:Ljava/util/Set;
                    //   370: aload_0        
                    //   371: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   374: getfield        com/appsflyer/internal/AFd1zSDK.values:Lcom/appsflyer/internal/AFd1vSDK;
                    //   377: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
                    //   382: pop            
                    //   383: new             Ljava/lang/StringBuilder;
                    //   386: dup            
                    //   387: ldc             "QUEUE: new task added: "
                    //   389: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   392: astore          6
                    //   394: aload           6
                    //   396: aload_0        
                    //   397: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   400: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   403: pop            
                    //   404: aload           6
                    //   406: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   409: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   412: aload_0        
                    //   413: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   416: getfield        com/appsflyer/internal/AFc1bSDK.values:Ljava/util/List;
                    //   419: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                    //   424: astore          6
                    //   426: aload           6
                    //   428: invokeinterface java/util/Iterator.hasNext:()Z
                    //   433: ifeq            451
                    //   436: aload           6
                    //   438: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   443: checkcast       Lcom/appsflyer/internal/AFc1cSDK;
                    //   446: astore          7
                    //   448: goto            426
                    //   451: aload_0        
                    //   452: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   455: astore          6
                    //   457: aload           6
                    //   459: getfield        com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:Ljava/util/concurrent/ExecutorService;
                    //   462: aload           6
                    //   464: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
                    //   469: pop            
                    //   470: aload_0        
                    //   471: getfield        com/appsflyer/internal/AFc1bSDK$4.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
                    //   474: astore          8
                    //   476: aload           8
                    //   478: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   481: astore          7
                    //   483: aload           7
                    //   485: monitorenter   
                    //   486: aload           8
                    //   488: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   491: invokeinterface java/util/Set.size:()I
                    //   496: aload           8
                    //   498: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   501: invokeinterface java/util/Set.size:()I
                    //   506: iadd           
                    //   507: bipush          40
                    //   509: isub           
                    //   510: istore_1       
                    //   511: iload_1        
                    //   512: ifle            636
                    //   515: aload           8
                    //   517: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   520: invokeinterface java/util/Set.isEmpty:()Z
                    //   525: iconst_1       
                    //   526: ixor           
                    //   527: istore_2       
                    //   528: aload           8
                    //   530: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   533: invokeinterface java/util/Set.isEmpty:()Z
                    //   538: iconst_1       
                    //   539: ixor           
                    //   540: istore_3       
                    //   541: iload_3        
                    //   542: ifeq            608
                    //   545: iload_2        
                    //   546: ifeq            608
                    //   549: aload           8
                    //   551: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   554: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                    //   559: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                    //   562: aload           8
                    //   564: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   567: invokeinterface java/util/SortedSet.first:()Ljava/lang/Object;
                    //   572: checkcast       Lcom/appsflyer/internal/AFd1zSDK;
                    //   575: invokevirtual   com/appsflyer/internal/AFd1zSDK.AFKeystoreWrapper:(Lcom/appsflyer/internal/AFd1zSDK;)I
                    //   578: ifle            598
                    //   581: aload           8
                    //   583: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   586: astore          6
                    //   588: aload           8
                    //   590: aload           6
                    //   592: invokevirtual   com/appsflyer/internal/AFc1bSDK.AFInAppEventParameterName:(Ljava/util/NavigableSet;)V
                    //   595: goto            725
                    //   598: aload           8
                    //   600: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   603: astore          6
                    //   605: goto            588
                    //   608: iload_3        
                    //   609: ifeq            622
                    //   612: aload           8
                    //   614: getfield        com/appsflyer/internal/AFc1bSDK.AFLogger:Ljava/util/NavigableSet;
                    //   617: astore          6
                    //   619: goto            588
                    //   622: iload_2        
                    //   623: ifeq            725
                    //   626: aload           8
                    //   628: getfield        com/appsflyer/internal/AFc1bSDK.afInfoLog:Ljava/util/NavigableSet;
                    //   631: astore          6
                    //   633: goto            588
                    //   636: aload           7
                    //   638: monitorexit    
                    //   639: return         
                    //   640: aload           7
                    //   642: monitorexit    
                    //   643: aload           6
                    //   645: athrow         
                    //   646: new             Ljava/lang/StringBuilder;
                    //   649: dup            
                    //   650: ldc             "QUEUE: tried to add already pending task: "
                    //   652: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   655: astore          6
                    //   657: aload           6
                    //   659: aload_0        
                    //   660: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   663: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   666: pop            
                    //   667: aload           6
                    //   669: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   672: invokestatic    com/appsflyer/AFLogger.afWarnLog:(Ljava/lang/String;)V
                    //   675: return         
                    //   676: new             Ljava/lang/StringBuilder;
                    //   679: dup            
                    //   680: ldc             "QUEUE: tried to add already scheduled task: "
                    //   682: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   685: astore          7
                    //   687: aload           7
                    //   689: aload_0        
                    //   690: getfield        com/appsflyer/internal/AFc1bSDK$4.AFInAppEventType:Lcom/appsflyer/internal/AFd1zSDK;
                    //   693: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                    //   696: pop            
                    //   697: aload           7
                    //   699: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                    //   702: invokestatic    com/appsflyer/AFLogger.afDebugLog:(Ljava/lang/String;)V
                    //   705: aload           6
                    //   707: monitorexit    
                    //   708: return         
                    //   709: aload           6
                    //   711: monitorexit    
                    //   712: aload           7
                    //   714: athrow         
                    //   715: astore          7
                    //   717: goto            709
                    //   720: astore          6
                    //   722: goto            640
                    //   725: iload_1        
                    //   726: iconst_1       
                    //   727: isub           
                    //   728: istore_1       
                    //   729: goto            511
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type
                    //  -----  -----  -----  -----  ----
                    //  12     63     715    720    Any
                    //  64     102    715    720    Any
                    //  105    129    715    720    Any
                    //  129    179    715    720    Any
                    //  182    214    715    720    Any
                    //  217    235    715    720    Any
                    //  244    280    715    720    Any
                    //  289    323    715    720    Any
                    //  326    355    715    720    Any
                    //  355    358    715    720    Any
                    //  486    511    720    646    Any
                    //  515    541    720    646    Any
                    //  549    588    720    646    Any
                    //  588    595    720    646    Any
                    //  598    605    720    646    Any
                    //  612    619    720    646    Any
                    //  626    633    720    646    Any
                    //  636    639    720    646    Any
                    //  676    708    715    720    Any
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.IllegalStateException: Expression is linked from several locations: Label_0511:
                    //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                    //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
                    //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
                    // 
                    throw new IllegalStateException("An error occurred while decompiling this method.");
                }
            });
        }
    }
}
