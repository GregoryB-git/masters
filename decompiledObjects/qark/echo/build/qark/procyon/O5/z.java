// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import java.util.Objects;
import com.google.firebase.messaging.T;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;

public abstract class z
{
    public static FirebaseMessaging a(final Map map) {
        return FirebaseMessaging.r();
    }
    
    public static T b(Map o) {
        final Map<K, Object> value = ((Map<K, Map<K, Object>>)o).get("message");
        Objects.requireNonNull(value);
        o = value;
        final Map<K, Object> value2 = ((Map<K, Map<K, Object>>)o).get("to");
        Objects.requireNonNull(value2);
        final T.b b = new T.b((String)value2);
        final String s = (String)((Map<K, Map<K, Object>>)o).get("collapseKey");
        final String s2 = (String)((Map<K, Map<K, Object>>)o).get("messageId");
        final String s3 = (String)((Map<K, Map<K, Object>>)o).get("messageType");
        final Integer n = (Integer)((Map<K, Map<K, Object>>)o).get("ttl");
        o = ((Map<K, Map<K, Object>>)o).get("data");
        if (s != null) {
            b.b(s);
        }
        if (s3 != null) {
            b.e(s3);
        }
        if (s2 != null) {
            b.d(s2);
        }
        if (n != null) {
            b.f(n);
        }
        if (o != null) {
            b.c((Map)o);
        }
        return b.a();
    }
    
    public static Map c(Map map) {
        final Object value = map.get("message");
        Objects.requireNonNull(value);
        map = (Map<K, Object>)value;
        if (map.get("notification") == null) {
            return null;
        }
        return (Map)map.get("notification");
    }
    
    public static boolean d(final Context context) {
        final KeyguardManager keyguardManager = (KeyguardManager)context.getSystemService("keyguard");
        if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
            return false;
        }
        final ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        final List runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        final String packageName = context.getPackageName();
        for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
            if (activityManager$RunningAppProcessInfo.importance == 100 && activityManager$RunningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }
    
    public static Map e(final T.c c) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final HashMap<String, String> hashMap2 = new HashMap<String, String>();
        if (c.p() != null) {
            hashMap.put("title", c.p());
        }
        if (c.r() != null) {
            hashMap.put("titleLocKey", c.r());
        }
        if (c.q() != null) {
            hashMap.put("titleLocArgs", (String)Arrays.asList(c.q()));
        }
        if (c.a() != null) {
            hashMap.put("body", c.a());
        }
        if (c.c() != null) {
            hashMap.put("bodyLocKey", c.c());
        }
        if (c.b() != null) {
            hashMap.put("bodyLocArgs", (String)Arrays.asList(c.b()));
        }
        if (c.d() != null) {
            hashMap2.put("channelId", c.d());
        }
        if (c.e() != null) {
            hashMap2.put("clickAction", c.e());
        }
        if (c.f() != null) {
            hashMap2.put("color", c.f());
        }
        if (c.g() != null) {
            hashMap2.put("smallIcon", c.g());
        }
        if (c.h() != null) {
            hashMap2.put("imageUrl", c.h().toString());
        }
        if (c.i() != null) {
            hashMap2.put("link", c.i().toString());
        }
        if (c.k() != null) {
            hashMap2.put("count", (String)c.k());
        }
        if (c.l() != null) {
            hashMap2.put("priority", (String)c.l());
        }
        if (c.m() != null) {
            hashMap2.put("sound", c.m());
        }
        if (c.o() != null) {
            hashMap2.put("ticker", c.o());
        }
        if (c.s() != null) {
            hashMap2.put("visibility", (String)c.s());
        }
        if (c.n() != null) {
            hashMap2.put("tag", c.n());
        }
        hashMap.put("android", (String)hashMap2);
        return hashMap;
    }
    
    public static Map f(final T t) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
        if (t.a() != null) {
            hashMap.put("collapseKey", t.a());
        }
        if (t.f() != null) {
            hashMap.put("from", t.f());
        }
        if (t.U() != null) {
            hashMap.put("to", t.U());
        }
        if (t.g() != null) {
            hashMap.put("messageId", t.g());
        }
        if (t.k() != null) {
            hashMap.put("messageType", t.k());
        }
        if (t.d().size() > 0) {
            for (final Map.Entry<String, V> entry : t.d().entrySet()) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        hashMap.put("data", (String)hashMap2);
        hashMap.put("ttl", (String)t.V());
        hashMap.put("sentTime", (String)t.T());
        if (t.q() != null) {
            hashMap.put("notification", (String)e(t.q()));
        }
        return hashMap;
    }
}
