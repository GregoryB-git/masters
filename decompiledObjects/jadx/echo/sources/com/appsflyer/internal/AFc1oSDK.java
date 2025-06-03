package com.appsflyer.internal;

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
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1oSDK {
    public static String AFInAppEventParameterName = null;
    private static int afDebugLog = 0;
    private static long afErrorLog = 0;
    private static int afRDLog = 1;
    private static String valueOf;
    private static String values;
    private final AFc1nSDK AFInAppEventType;
    private final AFb1gSDK AFKeystoreWrapper;
    private final AppsFlyerProperties AFLogger;
    private final AFc1dSDK afInfoLog;

    static {
        AFKeystoreWrapper();
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

    private <T> AFc1qSDK<T> valueOf(AFa1aSDK aFa1aSDK, AFc1hSDK<T> aFc1hSDK) {
        AFc1qSDK<T> valueOf2;
        int i7 = afDebugLog + 49;
        afRDLog = i7 % 128;
        if (i7 % 2 == 0) {
            valueOf2 = valueOf(aFa1aSDK, aFc1hSDK, valueOf());
            int i8 = 1 / 0;
        } else {
            valueOf2 = valueOf(aFa1aSDK, aFc1hSDK, valueOf());
        }
        afRDLog = (afDebugLog + 111) % 128;
        return valueOf2;
    }

    public final AFc1qSDK<String> AFInAppEventParameterName(@NonNull String str) {
        AFa1aSDK aFa1aSDK = new AFa1aSDK(str, null, "GET", Collections.emptyMap(), false);
        aFa1aSDK.afDebugLog = 10000;
        aFa1aSDK.AFInAppEventType = false;
        AFc1qSDK<String> valueOf2 = valueOf(aFa1aSDK, new AFc1iSDK());
        afRDLog = (afDebugLog + 53) % 128;
        return valueOf2;
    }

    public final AFc1qSDK<Map<String, String>> AFInAppEventType(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String obj2 = sb.toString();
        Map<String, Object> AFInAppEventType = AFInAppEventType();
        String valueOf2 = String.valueOf(AFInAppEventType.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf2);
        hashMap.put("Af-Meta-Counter", String.valueOf(AFInAppEventType.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(AFInAppEventType.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(AFInAppEventType.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(AFInAppEventType.get("sdk")));
        Object[] objArr = new Object[1];
        values("싊슋语䠲떙廷㋆ᖏ챇髈⎡ҙ\udf76꧆ბ㙡", (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr);
        hashMap.put(((String) objArr[0]).intern(), AFKeystoreWrapper(str3, obj, "GET", obj, str, str2, valueOf2));
        AFc1qSDK<Map<String, String>> valueOf3 = valueOf(new AFa1aSDK(obj2, null, "GET", hashMap, false), new AFc1mSDK());
        int i7 = afRDLog + 75;
        afDebugLog = i7 % 128;
        if (i7 % 2 == 0) {
            return valueOf3;
        }
        throw null;
    }

    public final AFc1qSDK<String> AFKeystoreWrapper(AFa1qSDK aFa1qSDK, String str, AFb1bSDK aFb1bSDK) {
        afRDLog = (afDebugLog + 67) % 128;
        try {
            AFc1qSDK<String> valueOf2 = valueOf(new AFa1aSDK(aFa1qSDK.afRDLog, (byte[]) ((Class) AFa1vSDK.AFInAppEventParameterName((char) (12254 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 37 - (KeyEvent.getMaxKeyCode() >> 16), 74 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("AFKeystoreWrapper", AFa1qSDK.class, String.class, AFb1bSDK.class).invoke(null, aFa1qSDK, str, aFb1bSDK), "POST", Collections.emptyMap(), aFa1qSDK.values()), new AFc1iSDK());
            afRDLog = (afDebugLog + 125) % 128;
            return valueOf2;
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Exception e7) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e7);
                return null;
            }
        }
    }

    public final AFc1qSDK<String> values(AFe1fSDK aFe1fSDK) {
        AFc1qSDK<String> valueOf2 = valueOf(new AFa1aSDK(aFe1fSDK.afRDLog, aFe1fSDK.AFKeystoreWrapper(), "POST", Collections.emptyMap(), true), new AFc1iSDK());
        afRDLog = (afDebugLog + 83) % 128;
        return valueOf2;
    }

    private static String AFKeystoreWrapper(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String join = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String valueOf2 = AFc1nSDK.valueOf(join, sb.toString());
        afDebugLog = (afRDLog + 67) % 128;
        return valueOf2;
    }

    private <T> AFc1qSDK<T> valueOf(AFa1aSDK aFa1aSDK, AFc1hSDK<T> aFc1hSDK, boolean z7) {
        aFa1aSDK.values = z7;
        AFc1nSDK aFc1nSDK = this.AFInAppEventType;
        AFc1qSDK<T> aFc1qSDK = new AFc1qSDK<>(aFa1aSDK, aFc1nSDK.valueOf, aFc1nSDK.AFKeystoreWrapper, aFc1hSDK);
        afRDLog = (afDebugLog + 111) % 128;
        return aFc1qSDK;
    }

    public final AFc1qSDK<String> AFInAppEventParameterName(Map<String, Object> map, String str, String str2) {
        String str3;
        AFf1eSDK aFf1eSDK;
        String str4;
        int i7 = afRDLog + 109;
        afDebugLog = i7 % 128;
        try {
            if (i7 % 2 != 0) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                byte[] bArr = (byte[]) ((Class) AFa1vSDK.AFInAppEventParameterName((char) (12254 - View.resolveSizeAndState(0, 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38, (ViewConfiguration.getPressedStateDuration() >> 16) + 74)).getMethod("values", Map.class, String.class).invoke(null, map, str);
                AFf1fSDK aFf1fSDK = new AFf1fSDK(this.AFKeystoreWrapper);
                if (str2 == null || str2.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").b(str2) || new Regex("3.?(\\d+)?.?(\\d+)").b(str2)) {
                    int i8 = afRDLog + 7;
                    afDebugLog = i8 % 128;
                    if (i8 % 2 != 0) {
                        String str5 = AFf1fSDK.AFKeystoreWrapper;
                        throw null;
                    }
                    str3 = AFf1fSDK.init;
                    if (str3 == null) {
                        aFf1eSDK = aFf1fSDK.AFInAppEventType;
                        str4 = AFf1fSDK.afInfoLog;
                        str3 = aFf1eSDK.valueOf(str4);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(aFf1fSDK.values.valueOf.AFInAppEventType.getPackageName());
                    return valueOf(new AFa1aSDK(aFf1fSDK.AFInAppEventParameterName(sb.toString()), bArr, "POST", Collections.emptyMap(), true), new AFc1iSDK());
                }
                str3 = AFf1fSDK.onAttributionFailureNative;
                if (str3 == null) {
                    int i9 = afRDLog + 31;
                    afDebugLog = i9 % 128;
                    if (i9 % 2 != 0) {
                        aFf1fSDK.AFInAppEventType.valueOf(AFf1fSDK.AFVersionDeclaration);
                        throw null;
                    }
                    aFf1eSDK = aFf1fSDK.AFInAppEventType;
                    str4 = AFf1fSDK.AFVersionDeclaration;
                    str3 = aFf1eSDK.valueOf(str4);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(aFf1fSDK.values.valueOf.AFInAppEventType.getPackageName());
                return valueOf(new AFa1aSDK(aFf1fSDK.AFInAppEventParameterName(sb2.toString()), bArr, "POST", Collections.emptyMap(), true), new AFc1iSDK());
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Exception e7) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e7);
            return null;
        }
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e7);
        return null;
    }

    public final AFc1qSDK<String> AFInAppEventType(@NonNull String str, @NonNull Map<String, String> map, String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", AFInAppEventType());
        if (str2 != null) {
            afDebugLog = (afRDLog + 89) % 128;
            hashMap.put("brand_domain", str2);
        }
        String jSONObject = AFa1rSDK.AFInAppEventType((Map<String, ?>) hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        values("싊슋语䠲떙廷㋆ᖏ챇髈⎡ҙ\udf76꧆ბ㙡", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, objArr);
        hashMap2.put(((String) objArr[0]).intern(), AFKeystoreWrapper(str3, obj, "POST", jSONObject));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()));
        sb.append("/");
        sb.append(str);
        AFc1qSDK<String> valueOf2 = valueOf(new AFa1aSDK(sb.toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), new AFc1iSDK(), true);
        afRDLog = (afDebugLog + 7) % 128;
        return valueOf2;
    }

    public final AFc1qSDK<Map<String, Object>> values(String str, String str2) {
        String packageName = this.AFKeystoreWrapper.valueOf.AFInAppEventType.getPackageName();
        AFb1gSDK aFb1gSDK = this.AFKeystoreWrapper;
        AFc1qSDK<Map<String, Object>> valueOf2 = valueOf(AFc1pSDK.AFInAppEventParameterName(packageName, AFb1zSDK.valueOf(aFb1gSDK.valueOf, aFb1gSDK.AFInAppEventType), str, str2), new AFc1rSDK());
        int i7 = afDebugLog + 55;
        afRDLog = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 86 / 0;
        }
        return valueOf2;
    }

    private Map<String, Object> AFInAppEventType() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.12.2");
        hashMap.put("counter", Integer.valueOf(this.AFKeystoreWrapper.AFInAppEventType.values("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        values("슌싮㖽\uf676黩䓋᧺ྎ찌", Color.red(0) + 1, objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.AFKeystoreWrapper.valueOf.AFInAppEventType;
        hashMap.put("app_version_name", AFa1fSDK.AFKeystoreWrapper(context, context.getPackageName()));
        hashMap.put("app_id", this.AFKeystoreWrapper.valueOf.AFInAppEventType.getPackageName());
        hashMap.put("platformextension", new AFb1xSDK().AFInAppEventParameterName());
        afDebugLog = (afRDLog + 17) % 128;
        return hashMap;
    }

    public static void AFKeystoreWrapper() {
        afErrorLog = -7639686596028283975L;
    }

    @NonNull
    public final AFc1qSDK<String> valueOf(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()));
        sb.append(this.AFKeystoreWrapper.valueOf.AFInAppEventType.getPackageName());
        AFc1qSDK<String> valueOf2 = valueOf(new AFa1aSDK(sb.toString(), new JSONObject(map).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), false, false), new AFc1iSDK());
        afRDLog = (afDebugLog + 49) % 128;
        return valueOf2;
    }

    public final AFc1qSDK<String> values(Map<String, Object> map, String str, String str2) {
        String str3;
        AFf1eSDK aFf1eSDK;
        String str4;
        int i7 = afRDLog + 83;
        afDebugLog = i7 % 128;
        try {
            if (i7 % 2 != 0) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                byte[] bArr = (byte[]) ((Class) AFa1vSDK.AFInAppEventParameterName((char) (12254 - TextUtils.getOffsetBefore("", 0)), 37 - Color.blue(0), 74 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("values", Map.class, String.class).invoke(null, map, str);
                AFf1fSDK aFf1fSDK = new AFf1fSDK(this.AFKeystoreWrapper);
                if (str2 == null || str2.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").b(str2) || new Regex("3.?(\\d+)?.?(\\d+)").b(str2)) {
                    str3 = AFf1fSDK.onInstallConversionFailureNative;
                    if (str3 == null) {
                        aFf1eSDK = aFf1fSDK.AFInAppEventType;
                        str4 = AFf1fSDK.afDebugLog;
                        str3 = aFf1eSDK.valueOf(str4);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(aFf1fSDK.values.valueOf.AFInAppEventType.getPackageName());
                    return valueOf(new AFa1aSDK(aFf1fSDK.AFInAppEventParameterName(sb.toString()), bArr, "POST", Collections.emptyMap(), true), new AFc1iSDK());
                }
                afRDLog = (afDebugLog + 85) % 128;
                str3 = AFf1fSDK.onResponseNative;
                if (str3 == null) {
                    int i8 = afRDLog + 27;
                    afDebugLog = i8 % 128;
                    if (i8 % 2 != 0) {
                        aFf1fSDK.AFInAppEventType.valueOf(AFf1fSDK.AFLogger$LogLevel);
                        throw null;
                    }
                    aFf1eSDK = aFf1fSDK.AFInAppEventType;
                    str4 = AFf1fSDK.AFLogger$LogLevel;
                    str3 = aFf1eSDK.valueOf(str4);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(aFf1fSDK.values.valueOf.AFInAppEventType.getPackageName());
                return valueOf(new AFa1aSDK(aFf1fSDK.AFInAppEventParameterName(sb2.toString()), bArr, "POST", Collections.emptyMap(), true), new AFc1iSDK());
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Exception e7) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e7);
            return null;
        }
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e7);
        return null;
    }

    private boolean valueOf() {
        afDebugLog = (afRDLog + 7) % 128;
        if (!(!this.AFLogger.getBoolean(AppsFlyerProperties.HTTP_CACHE, true))) {
            return false;
        }
        afRDLog = (afDebugLog + 37) % 128;
        return true;
    }

    @NonNull
    public final AFc1qSDK<AFe1qSDK> values(boolean z7, boolean z8, @NonNull String str, int i7) {
        String str2;
        String str3;
        AFc1dSDK aFc1dSDK = this.afInfoLog;
        Intrinsics.checkNotNullParameter(str, "");
        if (z7) {
            str2 = AFc1dSDK.AFKeystoreWrapper;
            afDebugLog = (afRDLog + 81) % 128;
        } else {
            str2 = AFc1dSDK.AFInAppEventParameterName;
        }
        String str4 = z8 ^ true ? "" : "stg";
        x xVar = x.f16233a;
        Object[] objArr = new Object[4];
        if (AFc1dSDK.AFInAppEventType()) {
            str3 = (String) aFc1dSDK.AFInAppEventType.getValue();
            afDebugLog = (afRDLog + 29) % 128;
        } else {
            str3 = "";
        }
        objArr[0] = str3;
        objArr[1] = str4;
        objArr[2] = aFc1dSDK.AFInAppEventParameterName();
        objArr[3] = str;
        String format = String.format(str2, Arrays.copyOf(objArr, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFa1aSDK aFa1aSDK = new AFa1aSDK(format, "GET");
        aFa1aSDK.afDebugLog = 1500;
        return valueOf(aFa1aSDK, new AFc1jSDK());
    }

    private static void values(String str, int i7, Object[] objArr) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1rSDK.AFInAppEventParameterName) {
            try {
                char[] AFInAppEventType = AFg1rSDK.AFInAppEventType(afErrorLog, cArr2, i7);
                AFg1rSDK.AFInAppEventType = 4;
                while (true) {
                    int i8 = AFg1rSDK.AFInAppEventType;
                    if (i8 < AFInAppEventType.length) {
                        AFg1rSDK.AFKeystoreWrapper = i8 - 4;
                        AFInAppEventType[AFg1rSDK.AFInAppEventType] = (char) ((AFInAppEventType[r1] ^ AFInAppEventType[r1 % 4]) ^ (AFg1rSDK.AFKeystoreWrapper * afErrorLog));
                        AFg1rSDK.AFInAppEventType++;
                    } else {
                        str2 = new String(AFInAppEventType, 4, AFInAppEventType.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str2;
    }
}
