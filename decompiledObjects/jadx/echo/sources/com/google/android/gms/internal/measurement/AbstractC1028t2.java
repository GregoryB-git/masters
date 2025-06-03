package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1028t2 {

    /* renamed from: g, reason: collision with root package name */
    public static HashMap f11159g;

    /* renamed from: l, reason: collision with root package name */
    public static Object f11164l;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f11165m;

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f11153a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f11154b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f11155c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f11156d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f11157e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public static ContentResolver f11158f = null;

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f11160h = new HashMap(16, 1.0f);

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f11161i = new HashMap(16, 1.0f);

    /* renamed from: j, reason: collision with root package name */
    public static final HashMap f11162j = new HashMap(16, 1.0f);

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f11163k = new HashMap(16, 1.0f);

    /* renamed from: n, reason: collision with root package name */
    public static String[] f11166n = new String[0];

    /* renamed from: com.google.android.gms.internal.measurement.t2$a */
    public interface a {
        Map e(int i7);
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (AbstractC1028t2.class) {
            try {
                if (f11159g == null) {
                    f11157e.set(false);
                    f11159g = new HashMap(16, 1.0f);
                    f11164l = new Object();
                    f11165m = false;
                    contentResolver.registerContentObserver(f11153a, true, new C1055w2(null));
                } else if (f11157e.getAndSet(false)) {
                    f11159g.clear();
                    f11160h.clear();
                    f11161i.clear();
                    f11162j.clear();
                    f11163k.clear();
                    f11164l = new Object();
                    f11165m = false;
                }
                Object obj = f11164l;
                if (f11159g.containsKey(str)) {
                    String str3 = (String) f11159g.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : f11166n) {
                    if (str.startsWith(str4)) {
                        if (!f11165m) {
                            HashMap hashMap = (HashMap) b(contentResolver, f11166n, new C1046v2());
                            if (hashMap != null) {
                                if (!hashMap.isEmpty()) {
                                    Set keySet = hashMap.keySet();
                                    keySet.removeAll(f11160h.keySet());
                                    keySet.removeAll(f11161i.keySet());
                                    keySet.removeAll(f11162j.keySet());
                                    keySet.removeAll(f11163k.keySet());
                                }
                                if (!hashMap.isEmpty()) {
                                    if (f11159g.isEmpty()) {
                                        f11159g = hashMap;
                                    } else {
                                        f11159g.putAll(hashMap);
                                    }
                                }
                                f11165m = true;
                            }
                            if (f11159g.containsKey(str)) {
                                String str5 = (String) f11159g.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                Cursor query = contentResolver.query(f11153a, null, null, new String[]{str}, null);
                if (query == null) {
                    if (query != null) {
                    }
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        d(obj, str, null);
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    d(obj, str, string);
                    if (string != null) {
                        return string;
                    }
                    return null;
                } finally {
                    query.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Map b(ContentResolver contentResolver, String[] strArr, a aVar) {
        Cursor query = contentResolver.query(f11154b, null, null, strArr, null);
        if (query == null) {
            return null;
        }
        Map e7 = aVar.e(query.getCount());
        while (query.moveToNext()) {
            try {
                e7.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return e7;
    }

    public static void d(Object obj, String str, String str2) {
        synchronized (AbstractC1028t2.class) {
            try {
                if (obj == f11164l) {
                    f11159g.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
