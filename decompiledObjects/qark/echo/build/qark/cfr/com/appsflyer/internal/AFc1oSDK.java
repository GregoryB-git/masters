/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.media.AudioTrack
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.widget.ExpandableListView
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.UUID
 *  java.util.concurrent.ExecutorService
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import V5.h;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFa1rSDK;
import com.appsflyer.internal.AFa1vSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1xSDK;
import com.appsflyer.internal.AFb1zSDK;
import com.appsflyer.internal.AFc1dSDK;
import com.appsflyer.internal.AFc1hSDK;
import com.appsflyer.internal.AFc1iSDK;
import com.appsflyer.internal.AFc1jSDK;
import com.appsflyer.internal.AFc1lSDK;
import com.appsflyer.internal.AFc1mSDK;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1pSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFc1rSDK;
import com.appsflyer.internal.AFe1fSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFf1eSDK;
import com.appsflyer.internal.AFf1fSDK;
import com.appsflyer.internal.AFg1rSDK;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import org.json.JSONObject;

public final class AFc1oSDK {
    public static String AFInAppEventParameterName;
    private static int afDebugLog = 0;
    private static long afErrorLog = 0L;
    private static int afRDLog = 1;
    private static String valueOf;
    private static String values;
    private final AFc1nSDK AFInAppEventType;
    private final AFb1gSDK AFKeystoreWrapper;
    private final AppsFlyerProperties AFLogger;
    private final AFc1dSDK afInfoLog;

    static {
        AFc1oSDK.AFKeystoreWrapper();
        values = "https://%smonitorsdk.%s/remote-debug?app_id=";
        AFInAppEventParameterName = "https://%sgcdsdk.%s/install_data/v5.0/";
        valueOf = "https://%sonelink.%s/shortlink-sdk/v2";
        afRDLog = (afDebugLog + 125) % 128;
    }

    public AFc1oSDK(AFc1nSDK aFc1nSDK, AFb1gSDK aFb1gSDK, AppsFlyerProperties appsFlyerProperties, AFc1dSDK aFc1dSDK) {
        this.AFInAppEventType = aFc1nSDK;
        this.AFKeystoreWrapper = aFb1gSDK;
        this.AFLogger = appsFlyerProperties;
        this.afInfoLog = aFc1dSDK;
    }

    private Map<String, Object> AFInAppEventType() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"build_number", (Object)"6.12.2");
        hashMap.put((Object)"counter", (Object)this.AFKeystoreWrapper.AFInAppEventType.values("appsFlyerCount", 0));
        hashMap.put((Object)"model", (Object)Build.MODEL);
        int n8 = Color.red((int)0);
        Context context = new Object[1];
        AFc1oSDK.values("\uc28c\uc2ee\u35bd\uf676\u9ee9\u44cb\u19fa\u0f8e\ucc0c", n8 + 1, (Object[])context);
        hashMap.put((Object)((String)context[0]).intern(), (Object)Build.BRAND);
        hashMap.put((Object)"sdk", (Object)Integer.toString((int)Build.VERSION.SDK_INT));
        context = this.AFKeystoreWrapper.valueOf.AFInAppEventType;
        hashMap.put((Object)"app_version_name", (Object)AFa1fSDK.AFKeystoreWrapper(context, context.getPackageName()));
        hashMap.put((Object)"app_id", (Object)this.AFKeystoreWrapper.valueOf.AFInAppEventType.getPackageName());
        hashMap.put((Object)"platformextension", (Object)new AFb1xSDK().AFInAppEventParameterName());
        afDebugLog = (afRDLog + 17) % 128;
        return hashMap;
    }

    private static /* varargs */ String AFKeystoreWrapper(String string2, String string3, String ... object) {
        object = new ArrayList((Collection)Arrays.asList((Object[])object));
        object.add(1, (Object)"v2");
        object = TextUtils.join((CharSequence)"\u2063", (Object[])((String[])object.toArray((Object[])new String[0])));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append("v2");
        string2 = AFc1nSDK.valueOf((String)object, stringBuilder.toString());
        afDebugLog = (afRDLog + 67) % 128;
        return string2;
    }

    public static void AFKeystoreWrapper() {
        afErrorLog = -7639686596028283975L;
    }

    private <T> AFc1qSDK<T> valueOf(AFa1aSDK aFc1qSDK, AFc1hSDK<T> aFc1hSDK) {
        int n8 = afDebugLog + 49;
        afRDLog = n8 % 128;
        if (n8 % 2 == 0) {
            aFc1qSDK = this.valueOf((AFa1aSDK)((Object)aFc1qSDK), aFc1hSDK, this.valueOf());
            n8 = 1 / 0;
        } else {
            aFc1qSDK = this.valueOf((AFa1aSDK)((Object)aFc1qSDK), aFc1hSDK, this.valueOf());
        }
        afRDLog = (afDebugLog + 111) % 128;
        return aFc1qSDK;
    }

    private <T> AFc1qSDK<T> valueOf(AFa1aSDK object, AFc1hSDK<T> aFc1hSDK, boolean bl) {
        object.values = bl;
        AFc1nSDK aFc1nSDK = this.AFInAppEventType;
        object = new AFc1qSDK<T>((AFa1aSDK)object, aFc1nSDK.valueOf, aFc1nSDK.AFKeystoreWrapper, aFc1hSDK);
        afRDLog = (afDebugLog + 111) % 128;
        return object;
    }

    private boolean valueOf() {
        afDebugLog = (afRDLog + 7) % 128;
        if (this.AFLogger.getBoolean("http_cache", true) ^ true) {
            afRDLog = (afDebugLog + 37) % 128;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static void values(String object, int n8, Object[] arrobject) {
        Object object2 = object;
        if (object != null) {
            object2 = object.toCharArray();
        }
        object2 = (char[])object2;
        object = AFg1rSDK.AFInAppEventParameterName;
        // MONITORENTER : object
        object2 = AFg1rSDK.AFInAppEventType(afErrorLog, (char[])object2, n8);
        AFg1rSDK.AFInAppEventType = 4;
        while ((n8 = AFg1rSDK.AFInAppEventType) < object2.length) {
            AFg1rSDK.AFKeystoreWrapper = n8 - 4;
            n8 = AFg1rSDK.AFInAppEventType++;
            object2[n8] = (char)((long)(object2[n8] ^ object2[n8 % 4]) ^ (long)AFg1rSDK.AFKeystoreWrapper * afErrorLog);
        }
        object2 = new String((char[])object2, 4, object2.length - 4);
        // MONITOREXIT : object
        arrobject[0] = object2;
    }

    public final AFc1qSDK<String> AFInAppEventParameterName(@NonNull String aFc1qSDK) {
        aFc1qSDK = new AFa1aSDK((String)((Object)aFc1qSDK), null, "GET", Collections.emptyMap(), false);
        aFc1qSDK.afDebugLog = 10000;
        aFc1qSDK.AFInAppEventType = false;
        aFc1qSDK = this.valueOf((AFa1aSDK)((Object)aFc1qSDK), new AFc1iSDK());
        afRDLog = (afDebugLog + 53) % 128;
        return aFc1qSDK;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final AFc1qSDK<String> AFInAppEventParameterName(Map<String, Object> var1_1, String var2_6, String var3_7) {
        block15 : {
            block16 : {
                block14 : {
                    var4_8 = AFc1oSDK.afRDLog + 109;
                    AFc1oSDK.afDebugLog = var4_8 % 128;
                    if (var4_8 % 2 != 0) ** GOTO lbl44
                    try {
                        var5_9 = (byte[])((Class)AFa1vSDK.AFInAppEventParameterName((char)(12254 - View.resolveSizeAndState((int)0, (int)0, (int)0)), (int)((ExpandableListView.getPackedPositionForChild((int)0, (int)0) LCMP 0L) + 38), (ViewConfiguration.getPressedStateDuration() >> 16) + 74)).getMethod("values", new Class[]{Map.class, String.class}).invoke((Object)null, new Object[]{var1_1, var2_6});
                    }
                    catch (Throwable var1_2) {
                        var2_6 = var1_2.getCause();
                        if (var2_6 == null) throw var1_2;
                        throw var2_6;
                        {
                            catch (Exception var1_5) {}
                        }
lbl44: // 2 sources:
                        var1_1 = (byte[])((Class)AFa1vSDK.AFInAppEventParameterName((char)((ViewConfiguration.getJumpTapTimeout() >> 16) + 12254), 37 - (ViewConfiguration.getTapTimeout() >> 16), 74 - TextUtils.indexOf((CharSequence)"", (CharSequence)""))).getMethod("values", new Class[]{Map.class, String.class}).invoke((Object)null, new Object[]{var1_1, var2_6});
                        throw null;
                        catch (Throwable var1_4) {
                            var2_6 = var1_4.getCause();
                            if (var2_6 == null) throw var1_4;
                            throw var2_6;
                        }
                    }
                    var6_10 = new AFf1fSDK(this.AFKeystoreWrapper);
                    if (var3_7 == null || var3_7.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").b(var3_7) || new Regex("3.?(\\d+)?.?(\\d+)").b(var3_7)) break block14;
                    var2_6 = AFf1fSDK.onAttributionFailureNative;
                    var1_1 = var2_6;
                    if (var2_6 != null) break block15;
                    var4_8 = AFc1oSDK.afRDLog + 31;
                    AFc1oSDK.afDebugLog = var4_8 % 128;
                    if (var4_8 % 2 != 0) {
                        var6_10.AFInAppEventType.valueOf(AFf1fSDK.AFVersionDeclaration);
                        throw null;
                    }
                    var1_1 = var6_10.AFInAppEventType;
                    var2_6 = AFf1fSDK.AFVersionDeclaration;
                    break block16;
                }
                var4_8 = AFc1oSDK.afRDLog + 7;
                AFc1oSDK.afDebugLog = var4_8 % 128;
                if (var4_8 % 2 != 0) {
                    var1_1 = AFf1fSDK.AFKeystoreWrapper;
                    throw null;
                }
                var2_6 = AFf1fSDK.init;
                var1_1 = var2_6;
                if (var2_6 != null) break block15;
                var1_1 = var6_10.AFInAppEventType;
                var2_6 = AFf1fSDK.afInfoLog;
            }
            var1_1 = var1_1.valueOf(var2_6);
        }
        var2_6 = new StringBuilder();
        var2_6.append((String)var1_1);
        var2_6.append(var6_10.values.valueOf.AFInAppEventType.getPackageName());
        return this.valueOf(new AFa1aSDK(var6_10.AFInAppEventParameterName(var2_6.toString()), var5_9, "POST", Collections.emptyMap(), true), new AFc1iSDK());
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", (Throwable)var1_5);
        return null;
    }

    public final AFc1qSDK<Map<String, String>> AFInAppEventType(@NonNull String object, @NonNull String string2, @NonNull UUID arrobject, @NonNull String string3) {
        String string4 = arrobject.toString();
        Object object2 = new StringBuilder();
        object2.append(String.format((String)valueOf, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()}));
        object2.append("/");
        object2.append((String)object);
        object2.append("?id=");
        object2.append(string2);
        object2 = object2.toString();
        Map<String, Object> map = this.AFInAppEventType();
        String string5 = String.valueOf((Object)map.get((Object)"build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"Af-UUID", (Object)arrobject.toString());
        hashMap.put((Object)"Af-Meta-Sdk-Ver", (Object)string5);
        hashMap.put((Object)"Af-Meta-Counter", (Object)String.valueOf((Object)map.get((Object)"counter")));
        hashMap.put((Object)"Af-Meta-Model", (Object)String.valueOf((Object)map.get((Object)"model")));
        hashMap.put((Object)"Af-Meta-Platform", (Object)String.valueOf((Object)map.get((Object)"platformextension")));
        hashMap.put((Object)"Af-Meta-System-Version", (Object)String.valueOf((Object)map.get((Object)"sdk")));
        int n8 = ViewConfiguration.getTouchSlop();
        arrobject = new Object[1];
        AFc1oSDK.values("\uc2ca\uc28b\u8bed\u4832\ub599\u5ef7\u32c6\u158f\ucc47\u9ac8\u23a1\u0499\udf76\ua9c6\u10d1\u3661", (n8 >> 8) + 1, arrobject);
        hashMap.put((Object)((String)arrobject[0]).intern(), (Object)AFc1oSDK.AFKeystoreWrapper(string3, string4, new String[]{"GET", string4, object, string2, string5}));
        object = this.valueOf(new AFa1aSDK((String)object2, null, "GET", (Map<String, String>)hashMap, false), new AFc1mSDK());
        n8 = afRDLog + 75;
        afDebugLog = n8 % 128;
        if (n8 % 2 == 0) {
            return object;
        }
        throw null;
    }

    public final AFc1qSDK<String> AFInAppEventType(@NonNull String object, @NonNull Map<String, String> object2, String string2, @NonNull UUID object3, @NonNull String string3) {
        object3 = object3.toString();
        Object[] arrobject = new Object[]();
        arrobject.put((Object)"ttl", (Object)"-1");
        arrobject.put((Object)"uuid", object3);
        arrobject.put((Object)"data", object2);
        arrobject.put((Object)"meta", this.AFInAppEventType());
        if (string2 != null) {
            afDebugLog = (afRDLog + 89) % 128;
            arrobject.put((Object)"brand_domain", (Object)string2);
        }
        object2 = AFa1rSDK.AFInAppEventType(arrobject).toString();
        string2 = new HashMap();
        int n8 = ViewConfiguration.getMaximumFlingVelocity();
        arrobject = new Object[1];
        AFc1oSDK.values("\uc2ca\uc28b\u8bed\u4832\ub599\u5ef7\u32c6\u158f\ucc47\u9ac8\u23a1\u0499\udf76\ua9c6\u10d1\u3661", (n8 >> 16) + 1, arrobject);
        string2.put((Object)((String)arrobject[0]).intern(), (Object)AFc1oSDK.AFKeystoreWrapper(string3, (String)object3, new String[]{"POST", object2}));
        object3 = new StringBuilder();
        object3.append(String.format((String)valueOf, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()}));
        object3.append("/");
        object3.append((String)object);
        object = this.valueOf(new AFa1aSDK(object3.toString(), object2.getBytes(Charset.defaultCharset()), "POST", (Map<String, String>)string2, false), new AFc1iSDK(), true);
        afRDLog = (afDebugLog + 7) % 128;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFc1qSDK<String> AFKeystoreWrapper(AFa1qSDK aFc1qSDK, String arrby, AFb1bSDK aFb1bSDK) {
        afRDLog = (afDebugLog + 67) % 128;
        try {
            arrby = (byte[])((Class)AFa1vSDK.AFInAppEventParameterName((char)(12254 - (AudioTrack.getMinVolume() FCMPL 0.0f)), 37 - (KeyEvent.getMaxKeyCode() >> 16), 74 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("AFKeystoreWrapper", new Class[]{AFa1qSDK.class, String.class, AFb1bSDK.class}).invoke((Object)null, new Object[]{aFc1qSDK, arrby, aFb1bSDK});
        }
        catch (Throwable throwable) {
            try {
                arrby = throwable.getCause();
                if (arrby != null) {
                    throw arrby;
                }
                throw throwable;
            }
            catch (Exception exception) {}
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", (Throwable)exception);
            return null;
        }
        aFc1qSDK = this.valueOf(new AFa1aSDK(aFc1qSDK.afRDLog, arrby, "POST", Collections.emptyMap(), aFc1qSDK.values()), new AFc1iSDK());
        afRDLog = (afDebugLog + 125) % 128;
        return aFc1qSDK;
    }

    @NonNull
    public final AFc1qSDK<String> valueOf(Map<String, Object> object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format((String)values, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()}));
        stringBuilder.append(this.AFKeystoreWrapper.valueOf.AFInAppEventType.getPackageName());
        object = this.valueOf(new AFa1aSDK(stringBuilder.toString(), new JSONObject(object).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), false, false), new AFc1iSDK());
        afRDLog = (afDebugLog + 49) % 128;
        return object;
    }

    public final AFc1qSDK<String> values(AFe1fSDK object) {
        byte[] arrby = object.AFKeystoreWrapper();
        object = this.valueOf(new AFa1aSDK(object.afRDLog, arrby, "POST", Collections.emptyMap(), true), new AFc1iSDK());
        afRDLog = (afDebugLog + 83) % 128;
        return object;
    }

    public final AFc1qSDK<Map<String, Object>> values(String object, String string2) {
        String string3 = this.AFKeystoreWrapper.valueOf.AFInAppEventType.getPackageName();
        AFb1gSDK aFb1gSDK = this.AFKeystoreWrapper;
        object = this.valueOf(AFc1pSDK.AFInAppEventParameterName(string3, AFb1zSDK.valueOf(aFb1gSDK.valueOf, aFb1gSDK.AFInAppEventType), (String)object, string2), new AFc1rSDK());
        int n8 = afDebugLog + 55;
        afRDLog = n8 % 128;
        if (n8 % 2 == 0) {
            n8 = 86 / 0;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final AFc1qSDK<String> values(Map<String, Object> var1_1, String var2_6, String var3_7) {
        block14 : {
            block15 : {
                block13 : {
                    var4_8 = AFc1oSDK.afRDLog + 83;
                    AFc1oSDK.afDebugLog = var4_8 % 128;
                    if (var4_8 % 2 != 0) ** GOTO lbl40
                    try {
                        var5_9 = (byte[])((Class)AFa1vSDK.AFInAppEventParameterName((char)(12254 - TextUtils.getOffsetBefore((CharSequence)"", (int)0)), 37 - Color.blue((int)0), 74 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("values", new Class[]{Map.class, String.class}).invoke((Object)null, new Object[]{var1_1, var2_6});
                    }
                    catch (Throwable var1_2) {
                        var2_6 = var1_2.getCause();
                        if (var2_6 == null) throw var1_2;
                        throw var2_6;
                        {
                            catch (Exception var1_5) {}
                        }
lbl40: // 2 sources:
                        var1_1 = (byte[])((Class)AFa1vSDK.AFInAppEventParameterName((char)(12254 - TextUtils.getTrimmedLength((CharSequence)"")), (ViewConfiguration.getPressedStateDuration() >> 16) + 37, TextUtils.indexOf((CharSequence)"", (CharSequence)"", (int)0) + 74)).getMethod("values", new Class[]{Map.class, String.class}).invoke((Object)null, new Object[]{var1_1, var2_6});
                        throw null;
                        catch (Throwable var1_4) {
                            var2_6 = var1_4.getCause();
                            if (var2_6 == null) throw var1_4;
                            throw var2_6;
                        }
                    }
                    var6_10 = new AFf1fSDK(this.AFKeystoreWrapper);
                    if (var3_7 == null || var3_7.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").b(var3_7) || new Regex("3.?(\\d+)?.?(\\d+)").b(var3_7)) break block13;
                    AFc1oSDK.afRDLog = (AFc1oSDK.afDebugLog + 85) % 128;
                    var2_6 = AFf1fSDK.onResponseNative;
                    var1_1 = var2_6;
                    if (var2_6 != null) break block14;
                    var4_8 = AFc1oSDK.afRDLog + 27;
                    AFc1oSDK.afDebugLog = var4_8 % 128;
                    if (var4_8 % 2 != 0) {
                        var6_10.AFInAppEventType.valueOf(AFf1fSDK.AFLogger$LogLevel);
                        throw null;
                    }
                    var1_1 = var6_10.AFInAppEventType;
                    var2_6 = AFf1fSDK.AFLogger$LogLevel;
                    break block15;
                }
                var2_6 = AFf1fSDK.onInstallConversionFailureNative;
                var1_1 = var2_6;
                if (var2_6 != null) break block14;
                var1_1 = var6_10.AFInAppEventType;
                var2_6 = AFf1fSDK.afDebugLog;
            }
            var1_1 = var1_1.valueOf(var2_6);
        }
        var2_6 = new StringBuilder();
        var2_6.append((String)var1_1);
        var2_6.append(var6_10.values.valueOf.AFInAppEventType.getPackageName());
        return this.valueOf(new AFa1aSDK(var6_10.AFInAppEventParameterName(var2_6.toString()), var5_9, "POST", Collections.emptyMap(), true), new AFc1iSDK());
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", (Throwable)var1_5);
        return null;
    }

    @NonNull
    public final AFc1qSDK<AFe1qSDK> values(boolean bl, boolean bl2, @NonNull String object, int n8) {
        String string2;
        AFc1dSDK aFc1dSDK = this.afInfoLog;
        Intrinsics.checkNotNullParameter(object, "");
        if (bl) {
            string2 = AFc1dSDK.AFKeystoreWrapper;
            afDebugLog = (afRDLog + 81) % 128;
        } else {
            string2 = AFc1dSDK.AFInAppEventParameterName;
        }
        String string3 = bl2 ^ true ? "" : "stg";
        Object object2 = x.a;
        if (AFc1dSDK.AFInAppEventType()) {
            object2 = (String)aFc1dSDK.AFInAppEventType.getValue();
            afDebugLog = (afRDLog + 29) % 128;
        } else {
            object2 = "";
        }
        object = String.format((String)string2, (Object[])Arrays.copyOf((Object[])new Object[]{object2, string3, aFc1dSDK.AFInAppEventParameterName(), object}, (int)4));
        Intrinsics.checkNotNullExpressionValue(object, "");
        object = new AFa1aSDK((String)object, "GET");
        object.afDebugLog = 1500;
        return this.valueOf((AFa1aSDK)object, new AFc1jSDK());
    }
}

