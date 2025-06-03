package R2;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: R2.q3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585q3 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0585q3 f5491c = new C0585q3(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f5492a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5493b;

    /* renamed from: R2.q3$a */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");


        /* renamed from: o, reason: collision with root package name */
        public final String f5499o;

        a(String str) {
            this.f5499o = str;
        }
    }

    public C0585q3(Boolean bool, Boolean bool2, int i7) {
        EnumMap enumMap = new EnumMap(a.class);
        this.f5492a = enumMap;
        enumMap.put((EnumMap) a.AD_STORAGE, (a) bool);
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) bool2);
        this.f5493b = i7;
    }

    public static char a(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public static C0585q3 d(Bundle bundle, int i7) {
        a[] aVarArr;
        if (bundle == null) {
            return new C0585q3(null, null, i7);
        }
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC0578p3.STORAGE.f5475o;
        for (a aVar : aVarArr) {
            enumMap.put((EnumMap) aVar, (a) q(bundle.getString(aVar.f5499o)));
        }
        return new C0585q3(enumMap, i7);
    }

    public static C0585q3 e(String str) {
        return f(str, 100);
    }

    public static C0585q3 f(String str, int i7) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str != null) {
            a[] c7 = EnumC0578p3.STORAGE.c();
            for (int i8 = 0; i8 < c7.length; i8++) {
                a aVar = c7[i8];
                int i9 = i8 + 2;
                if (i9 < str.length()) {
                    enumMap.put((EnumMap) aVar, (a) g(str.charAt(i9)));
                }
            }
        }
        return new C0585q3(enumMap, i7);
    }

    public static Boolean g(char c7) {
        if (c7 == '0') {
            return Boolean.FALSE;
        }
        if (c7 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    public static String h(int i7) {
        return i7 != -20 ? i7 != -10 ? i7 != 0 ? i7 != 30 ? i7 != 90 ? i7 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API";
    }

    public static String i(Bundle bundle) {
        a[] aVarArr;
        String string;
        aVarArr = EnumC0578p3.STORAGE.f5475o;
        for (a aVar : aVarArr) {
            if (bundle.containsKey(aVar.f5499o) && (string = bundle.getString(aVar.f5499o)) != null && q(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static String j(boolean z7) {
        return z7 ? "granted" : "denied";
    }

    public static boolean k(int i7, int i8) {
        return i7 <= i8;
    }

    public static int n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static Boolean q(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final int b() {
        return this.f5493b;
    }

    public final C0585q3 c(C0585q3 c0585q3) {
        a[] aVarArr;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC0578p3.STORAGE.f5475o;
        for (a aVar : aVarArr) {
            Boolean bool = (Boolean) this.f5492a.get(aVar);
            Boolean bool2 = (Boolean) c0585q3.f5492a.get(aVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new C0585q3(enumMap, 100);
    }

    public final boolean equals(Object obj) {
        a[] aVarArr;
        if (!(obj instanceof C0585q3)) {
            return false;
        }
        C0585q3 c0585q3 = (C0585q3) obj;
        aVarArr = EnumC0578p3.STORAGE.f5475o;
        for (a aVar : aVarArr) {
            if (n((Boolean) this.f5492a.get(aVar)) != n((Boolean) c0585q3.f5492a.get(aVar))) {
                return false;
            }
        }
        return this.f5493b == c0585q3.f5493b;
    }

    public final int hashCode() {
        int i7 = this.f5493b * 17;
        Iterator it = this.f5492a.values().iterator();
        while (it.hasNext()) {
            i7 = (i7 * 31) + n((Boolean) it.next());
        }
        return i7;
    }

    public final boolean l(a aVar) {
        Boolean bool = (Boolean) this.f5492a.get(aVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean m(C0585q3 c0585q3, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!c0585q3.l(aVar) && l(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final C0585q3 o(C0585q3 c0585q3) {
        a[] aVarArr;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC0578p3.STORAGE.f5475o;
        for (a aVar : aVarArr) {
            Boolean bool = (Boolean) this.f5492a.get(aVar);
            if (bool == null) {
                bool = (Boolean) c0585q3.f5492a.get(aVar);
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new C0585q3(enumMap, this.f5493b);
    }

    public final Bundle p() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f5492a.entrySet()) {
            Boolean bool = (Boolean) entry.getValue();
            if (bool != null) {
                bundle.putString(((a) entry.getKey()).f5499o, j(bool.booleanValue()));
            }
        }
        return bundle;
    }

    public final boolean r(C0585q3 c0585q3, a... aVarArr) {
        for (a aVar : aVarArr) {
            Boolean bool = (Boolean) this.f5492a.get(aVar);
            Boolean bool2 = (Boolean) c0585q3.f5492a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final Boolean s() {
        return (Boolean) this.f5492a.get(a.AD_STORAGE);
    }

    public final boolean t(C0585q3 c0585q3) {
        return r(c0585q3, (a[]) this.f5492a.keySet().toArray(new a[0]));
    }

    public final String toString() {
        a[] aVarArr;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(h(this.f5493b));
        aVarArr = EnumC0578p3.STORAGE.f5475o;
        for (a aVar : aVarArr) {
            sb.append(",");
            sb.append(aVar.f5499o);
            sb.append("=");
            Boolean bool = (Boolean) this.f5492a.get(aVar);
            sb.append(bool == null ? "uninitialized" : bool.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }

    public final Boolean u() {
        return (Boolean) this.f5492a.get(a.ANALYTICS_STORAGE);
    }

    public final String v() {
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : EnumC0578p3.STORAGE.c()) {
            sb.append(a((Boolean) this.f5492a.get(aVar)));
        }
        return sb.toString();
    }

    public final String w() {
        StringBuilder sb = new StringBuilder("G2");
        for (a aVar : EnumC0578p3.STORAGE.c()) {
            Boolean bool = (Boolean) this.f5492a.get(aVar);
            sb.append(bool == null ? 'g' : bool.booleanValue() ? 'G' : 'D');
        }
        return sb.toString();
    }

    public final boolean x() {
        return l(a.AD_STORAGE);
    }

    public final boolean y() {
        return l(a.ANALYTICS_STORAGE);
    }

    public final boolean z() {
        Iterator it = this.f5492a.values().iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    public C0585q3(EnumMap enumMap, int i7) {
        EnumMap enumMap2 = new EnumMap(a.class);
        this.f5492a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f5493b = i7;
    }
}
