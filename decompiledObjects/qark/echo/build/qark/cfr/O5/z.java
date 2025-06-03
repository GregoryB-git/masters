/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.KeyguardManager
 *  android.content.Context
 *  android.net.Uri
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 */
package O5;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.net.Uri;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.T;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class z {
    public static FirebaseMessaging a(Map map) {
        return FirebaseMessaging.r();
    }

    public static T b(Map object) {
        object = object.get((Object)"message");
        Objects.requireNonNull((Object)object);
        object = (Map)object;
        Object object2 = object.get((Object)"to");
        Objects.requireNonNull((Object)object2);
        object2 = new T.b((String)object2);
        String string2 = (String)object.get((Object)"collapseKey");
        String string3 = (String)object.get((Object)"messageId");
        String string4 = (String)object.get((Object)"messageType");
        Integer n8 = (Integer)object.get((Object)"ttl");
        object = (Map)object.get((Object)"data");
        if (string2 != null) {
            object2.b(string2);
        }
        if (string4 != null) {
            object2.e(string4);
        }
        if (string3 != null) {
            object2.d(string3);
        }
        if (n8 != null) {
            object2.f(n8);
        }
        if (object != null) {
            object2.c((Map)object);
        }
        return object2.a();
    }

    public static Map c(Map object) {
        object = object.get((Object)"message");
        Objects.requireNonNull((Object)object);
        object = (Map)object;
        if (object.get((Object)"notification") == null) {
            return null;
        }
        return (Map)object.get((Object)"notification");
    }

    public static boolean d(Context object) {
        KeyguardManager keyguardManager = (KeyguardManager)object.getSystemService("keyguard");
        if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
            return false;
        }
        keyguardManager = (ActivityManager)object.getSystemService("activity");
        if (keyguardManager == null) {
            return false;
        }
        if ((keyguardManager = keyguardManager.getRunningAppProcesses()) == null) {
            return false;
        }
        object = object.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : keyguardManager) {
            if (runningAppProcessInfo.importance != 100 || !runningAppProcessInfo.processName.equals(object)) continue;
            return true;
        }
        return false;
    }

    public static Map e(T.c c8) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (c8.p() != null) {
            hashMap.put((Object)"title", (Object)c8.p());
        }
        if (c8.r() != null) {
            hashMap.put((Object)"titleLocKey", (Object)c8.r());
        }
        if (c8.q() != null) {
            hashMap.put((Object)"titleLocArgs", (Object)Arrays.asList((Object[])c8.q()));
        }
        if (c8.a() != null) {
            hashMap.put((Object)"body", (Object)c8.a());
        }
        if (c8.c() != null) {
            hashMap.put((Object)"bodyLocKey", (Object)c8.c());
        }
        if (c8.b() != null) {
            hashMap.put((Object)"bodyLocArgs", (Object)Arrays.asList((Object[])c8.b()));
        }
        if (c8.d() != null) {
            hashMap2.put((Object)"channelId", (Object)c8.d());
        }
        if (c8.e() != null) {
            hashMap2.put((Object)"clickAction", (Object)c8.e());
        }
        if (c8.f() != null) {
            hashMap2.put((Object)"color", (Object)c8.f());
        }
        if (c8.g() != null) {
            hashMap2.put((Object)"smallIcon", (Object)c8.g());
        }
        if (c8.h() != null) {
            hashMap2.put((Object)"imageUrl", (Object)c8.h().toString());
        }
        if (c8.i() != null) {
            hashMap2.put((Object)"link", (Object)c8.i().toString());
        }
        if (c8.k() != null) {
            hashMap2.put((Object)"count", (Object)c8.k());
        }
        if (c8.l() != null) {
            hashMap2.put((Object)"priority", (Object)c8.l());
        }
        if (c8.m() != null) {
            hashMap2.put((Object)"sound", (Object)c8.m());
        }
        if (c8.o() != null) {
            hashMap2.put((Object)"ticker", (Object)c8.o());
        }
        if (c8.s() != null) {
            hashMap2.put((Object)"visibility", (Object)c8.s());
        }
        if (c8.n() != null) {
            hashMap2.put((Object)"tag", (Object)c8.n());
        }
        hashMap.put((Object)"android", (Object)hashMap2);
        return hashMap;
    }

    public static Map f(T t8) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (t8.a() != null) {
            hashMap.put((Object)"collapseKey", (Object)t8.a());
        }
        if (t8.f() != null) {
            hashMap.put((Object)"from", (Object)t8.f());
        }
        if (t8.U() != null) {
            hashMap.put((Object)"to", (Object)t8.U());
        }
        if (t8.g() != null) {
            hashMap.put((Object)"messageId", (Object)t8.g());
        }
        if (t8.k() != null) {
            hashMap.put((Object)"messageType", (Object)t8.k());
        }
        if (t8.d().size() > 0) {
            for (Map.Entry entry : t8.d().entrySet()) {
                hashMap2.put((Object)((String)entry.getKey()), entry.getValue());
            }
        }
        hashMap.put((Object)"data", (Object)hashMap2);
        hashMap.put((Object)"ttl", (Object)t8.V());
        hashMap.put((Object)"sentTime", (Object)t8.T());
        if (t8.q() != null) {
            hashMap.put((Object)"notification", (Object)z.e(t8.q()));
        }
        return hashMap;
    }
}

