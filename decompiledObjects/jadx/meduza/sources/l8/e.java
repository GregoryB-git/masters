package l8;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9761a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f9762b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f9763c;

    public e(int i10) {
        this.f9763c = i10;
    }

    public static String a(int i10, String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i10 ? trim.substring(0, i10) : trim;
    }

    public final synchronized boolean b(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String a10 = a(this.f9763c, str);
        if (this.f9761a.size() >= this.f9762b && !this.f9761a.containsKey(a10)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f9762b, null);
            return false;
        }
        String a11 = a(this.f9763c, str2);
        String str3 = (String) this.f9761a.get(a10);
        if (str3 == null ? a11 == null : str3.equals(a11)) {
            return false;
        }
        HashMap hashMap = this.f9761a;
        if (str2 == null) {
            a11 = "";
        }
        hashMap.put(a10, a11);
        return true;
    }

    public final synchronized void c(Map<String, String> map) {
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String a10 = a(this.f9763c, key);
            if (this.f9761a.size() >= this.f9762b && !this.f9761a.containsKey(a10)) {
                i10++;
            }
            String value = entry.getValue();
            this.f9761a.put(a10, value == null ? "" : a(this.f9763c, value));
        }
        if (i10 > 0) {
            Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f9762b, null);
        }
    }
}
