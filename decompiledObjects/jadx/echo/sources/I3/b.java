package I3;

import H3.AbstractC0387i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f2513a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f2514b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2515c;

    public b(int i7, int i8) {
        this.f2514b = i7;
        this.f2515c = i8;
    }

    public static String c(String str, int i7) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i7 ? trim.substring(0, i7) : trim;
    }

    public synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f2513a));
    }

    public final String b(String str) {
        if (str != null) {
            return c(str, this.f2515c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized boolean d(String str, String str2) {
        String b7 = b(str);
        if (this.f2513a.size() >= this.f2514b && !this.f2513a.containsKey(b7)) {
            E3.f.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f2514b);
            return false;
        }
        String c7 = c(str2, this.f2515c);
        if (AbstractC0387i.z((String) this.f2513a.get(b7), c7)) {
            return false;
        }
        Map map = this.f2513a;
        if (str2 == null) {
            c7 = "";
        }
        map.put(b7, c7);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i7 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b7 = b((String) entry.getKey());
                if (this.f2513a.size() >= this.f2514b && !this.f2513a.containsKey(b7)) {
                    i7++;
                }
                String str = (String) entry.getValue();
                this.f2513a.put(b7, str == null ? "" : c(str, this.f2515c));
            }
            if (i7 > 0) {
                E3.f.f().k("Ignored " + i7 + " entries when adding custom keys. Maximum allowable: " + this.f2514b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
