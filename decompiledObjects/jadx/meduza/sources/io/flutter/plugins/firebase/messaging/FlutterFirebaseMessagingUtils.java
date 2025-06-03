package io.flutter.plugins.firebase.messaging;

import aa.z;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FlutterFirebaseMessagingUtils {
    public static final String EXTRA_REMOTE_MESSAGE = "notification";
    public static final String IS_AUTO_INIT_ENABLED = "isAutoInitEnabled";
    public static final int JOB_ID = 2020;
    private static final String KEY_COLLAPSE_KEY = "collapseKey";
    private static final String KEY_DATA = "data";
    private static final String KEY_FROM = "from";
    private static final String KEY_MESSAGE_ID = "messageId";
    private static final String KEY_MESSAGE_TYPE = "messageType";
    private static final String KEY_SENT_TIME = "sentTime";
    private static final String KEY_TO = "to";
    private static final String KEY_TTL = "ttl";
    public static final String SHARED_PREFERENCES_KEY = "io.flutter.firebase.messaging.callback";

    public static FirebaseMessaging getFirebaseMessagingForArguments(Map<String, Object> map) {
        return FirebaseMessaging.d();
    }

    public static z getRemoteMessageForArguments(Map<String, Object> map) {
        Object obj = map.get(Constants.MESSAGE);
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get(KEY_TO);
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        Bundle bundle = new Bundle();
        r.b bVar = new r.b();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(defpackage.g.d("Invalid to: ", str));
        }
        bundle.putString("google.to", str);
        String str2 = (String) map2.get(KEY_COLLAPSE_KEY);
        String str3 = (String) map2.get(KEY_MESSAGE_ID);
        String str4 = (String) map2.get(KEY_MESSAGE_TYPE);
        Integer num = (Integer) map2.get(KEY_TTL);
        Map map3 = (Map) map2.get(KEY_DATA);
        if (str2 != null) {
            bundle.putString("collapse_key", str2);
        }
        if (str4 != null) {
            bundle.putString("message_type", str4);
        }
        if (str3 != null) {
            bundle.putString("google.message_id", str3);
        }
        if (num != null) {
            bundle.putString("google.ttl", String.valueOf(num.intValue()));
        }
        if (map3 != null) {
            bVar.clear();
            bVar.putAll(map3);
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : bVar.entrySet()) {
            bundle2.putString((String) entry.getKey(), (String) entry.getValue());
        }
        bundle2.putAll(bundle);
        bundle.remove(KEY_FROM);
        return new z(bundle2);
    }

    public static Map<String, Object> getRemoteMessageNotificationForArguments(Map<String, Object> map) {
        Object obj = map.get(Constants.MESSAGE);
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        if (map2.get(EXTRA_REMOTE_MESSAGE) == null) {
            return null;
        }
        return (Map) map2.get(EXTRA_REMOTE_MESSAGE);
    }

    public static boolean isApplicationForeground(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if ((keyguardManager != null && keyguardManager.isKeyguardLocked()) || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    private static Map<String, Object> remoteMessageNotificationToMap(z.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        String str = aVar.f367a;
        if (str != null) {
            hashMap.put("title", str);
        }
        String str2 = aVar.f368b;
        if (str2 != null) {
            hashMap.put("titleLocKey", str2);
        }
        String[] strArr = aVar.f369c;
        if (strArr != null) {
            hashMap.put("titleLocArgs", Arrays.asList(strArr));
        }
        String str3 = aVar.f370d;
        if (str3 != null) {
            hashMap.put("body", str3);
        }
        String str4 = aVar.f371e;
        if (str4 != null) {
            hashMap.put("bodyLocKey", str4);
        }
        String[] strArr2 = aVar.f;
        if (strArr2 != null) {
            hashMap.put("bodyLocArgs", Arrays.asList(strArr2));
        }
        String str5 = aVar.f378m;
        if (str5 != null) {
            hashMap2.put("channelId", str5);
        }
        String str6 = aVar.f377l;
        if (str6 != null) {
            hashMap2.put("clickAction", str6);
        }
        String str7 = aVar.f376k;
        if (str7 != null) {
            hashMap2.put("color", str7);
        }
        String str8 = aVar.f372g;
        if (str8 != null) {
            hashMap2.put("smallIcon", str8);
        }
        String str9 = aVar.f373h;
        if ((str9 != null ? Uri.parse(str9) : null) != null) {
            String str10 = aVar.f373h;
            hashMap2.put("imageUrl", (str10 != null ? Uri.parse(str10) : null).toString());
        }
        Uri uri = aVar.f379n;
        if (uri != null) {
            hashMap2.put("link", uri.toString());
        }
        Integer num = aVar.f383r;
        if (num != null) {
            hashMap2.put("count", num);
        }
        Integer num2 = aVar.f381p;
        if (num2 != null) {
            hashMap2.put("priority", num2);
        }
        String str11 = aVar.f374i;
        if (str11 != null) {
            hashMap2.put("sound", str11);
        }
        String str12 = aVar.f380o;
        if (str12 != null) {
            hashMap2.put("ticker", str12);
        }
        Integer num3 = aVar.f382q;
        if (num3 != null) {
            hashMap2.put("visibility", num3);
        }
        String str13 = aVar.f375j;
        if (str13 != null) {
            hashMap2.put("tag", str13);
        }
        hashMap.put("android", hashMap2);
        return hashMap;
    }

    public static Map<String, Object> remoteMessageToMap(z zVar) {
        int parseInt;
        long parseLong;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (zVar.f364a.getString("collapse_key") != null) {
            hashMap.put(KEY_COLLAPSE_KEY, zVar.f364a.getString("collapse_key"));
        }
        if (zVar.f364a.getString(KEY_FROM) != null) {
            hashMap.put(KEY_FROM, zVar.f364a.getString(KEY_FROM));
        }
        if (zVar.f364a.getString("google.to") != null) {
            hashMap.put(KEY_TO, zVar.f364a.getString("google.to"));
        }
        if (zVar.E() != null) {
            hashMap.put(KEY_MESSAGE_ID, zVar.E());
        }
        if (zVar.f364a.getString("message_type") != null) {
            hashMap.put(KEY_MESSAGE_TYPE, zVar.f364a.getString("message_type"));
        }
        if (!((r.h) zVar.D()).isEmpty()) {
            for (Map.Entry entry : ((r.b) zVar.D()).entrySet()) {
                hashMap2.put((String) entry.getKey(), entry.getValue());
            }
        }
        hashMap.put(KEY_DATA, hashMap2);
        Object obj = zVar.f364a.get("google.ttl");
        if (obj instanceof Integer) {
            parseInt = ((Integer) obj).intValue();
        } else {
            if (obj instanceof String) {
                try {
                    parseInt = Integer.parseInt((String) obj);
                } catch (NumberFormatException unused) {
                    Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                }
            }
            parseInt = 0;
        }
        hashMap.put(KEY_TTL, Integer.valueOf(parseInt));
        Object obj2 = zVar.f364a.get("google.sent_time");
        if (obj2 instanceof Long) {
            parseLong = ((Long) obj2).longValue();
        } else {
            if (obj2 instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj2);
                } catch (NumberFormatException unused2) {
                    Log.w("FirebaseMessaging", "Invalid sent time: " + obj2);
                }
            }
            parseLong = 0;
        }
        hashMap.put(KEY_SENT_TIME, Long.valueOf(parseLong));
        if (zVar.F() != null) {
            hashMap.put(EXTRA_REMOTE_MESSAGE, remoteMessageNotificationToMap(zVar.F()));
        }
        return hashMap;
    }
}
