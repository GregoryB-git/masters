package e7;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: c, reason: collision with root package name */
    public static final e3 f4165c = new e3(100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap<a, g3> f4166a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4167b;

    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");


        /* renamed from: a, reason: collision with root package name */
        public final String f4172a;

        a(String str) {
            this.f4172a = str;
        }
    }

    public e3(int i10) {
        EnumMap<a, g3> enumMap = new EnumMap<>((Class<a>) a.class);
        this.f4166a = enumMap;
        enumMap.put((EnumMap<a, g3>) a.AD_STORAGE, (a) f(null));
        enumMap.put((EnumMap<a, g3>) a.ANALYTICS_STORAGE, (a) f(null));
        this.f4167b = i10;
    }

    public e3(EnumMap<a, g3> enumMap, int i10) {
        EnumMap<a, g3> enumMap2 = new EnumMap<>((Class<a>) a.class);
        this.f4166a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f4167b = i10;
    }

    public static char a(g3 g3Var) {
        if (g3Var == null) {
            return '-';
        }
        int ordinal = g3Var.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static e3 b(int i10, Bundle bundle) {
        if (bundle == null) {
            return new e3(i10);
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : f3.STORAGE.f4199a) {
            enumMap.put((EnumMap) aVar, (a) g(bundle.getString(aVar.f4172a)));
        }
        return new e3(enumMap, i10);
    }

    public static e3 c(int i10, String str) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str == null) {
            str = "";
        }
        a[] aVarArr = f3.STORAGE.f4199a;
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            int i12 = i11 + 2;
            enumMap.put((EnumMap) aVarArr[i11], (a) (i12 < str.length() ? e(str.charAt(i12)) : g3.UNINITIALIZED));
        }
        return new e3(enumMap, i10);
    }

    public static g3 e(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? g3.UNINITIALIZED : g3.GRANTED : g3.DENIED : g3.POLICY;
    }

    public static g3 f(Boolean bool) {
        return bool == null ? g3.UNINITIALIZED : bool.booleanValue() ? g3.GRANTED : g3.DENIED;
    }

    public static g3 g(String str) {
        g3 g3Var = g3.UNINITIALIZED;
        return str == null ? g3Var : str.equals("granted") ? g3.GRANTED : str.equals("denied") ? g3.DENIED : g3Var;
    }

    public static String h(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static boolean i(int i10, int i11) {
        return ((i10 == -20 && i11 == -30) || ((i10 == -30 && i11 == -20) || i10 == i11)) || i10 < i11;
    }

    public static e3 l(String str) {
        return c(100, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e7.e3 d(e7.e3 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<e7.e3$a> r1 = e7.e3.a.class
            r0.<init>(r1)
            e7.f3 r1 = e7.f3.STORAGE
            e7.e3$a[] r1 = r1.f4199a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            java.util.EnumMap<e7.e3$a, e7.g3> r5 = r8.f4166a
            java.lang.Object r5 = r5.get(r4)
            e7.g3 r5 = (e7.g3) r5
            java.util.EnumMap<e7.e3$a, e7.g3> r6 = r9.f4166a
            java.lang.Object r6 = r6.get(r4)
            e7.g3 r6 = (e7.g3) r6
            if (r5 != 0) goto L24
            goto L33
        L24:
            if (r6 != 0) goto L27
            goto L43
        L27:
            e7.g3 r7 = e7.g3.UNINITIALIZED
            if (r5 != r7) goto L2c
            goto L33
        L2c:
            if (r6 != r7) goto L2f
            goto L43
        L2f:
            e7.g3 r7 = e7.g3.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L43
        L35:
            if (r6 != r7) goto L38
            goto L43
        L38:
            e7.g3 r7 = e7.g3.DENIED
            if (r5 == r7) goto L42
            if (r6 != r7) goto L3f
            goto L42
        L3f:
            e7.g3 r5 = e7.g3.GRANTED
            goto L43
        L42:
            r5 = r7
        L43:
            if (r5 == 0) goto L48
            r0.put(r4, r5)
        L48:
            int r3 = r3 + 1
            goto Ld
        L4b:
            e7.e3 r9 = new e7.e3
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.e3.d(e7.e3):e7.e3");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        for (a aVar : f3.STORAGE.f4199a) {
            if (this.f4166a.get(aVar) != e3Var.f4166a.get(aVar)) {
                return false;
            }
        }
        return this.f4167b == e3Var.f4167b;
    }

    public final int hashCode() {
        int i10 = this.f4167b * 17;
        Iterator<g3> it = this.f4166a.values().iterator();
        while (it.hasNext()) {
            i10 = (i10 * 31) + it.next().hashCode();
        }
        return i10;
    }

    public final boolean j(a aVar) {
        return this.f4166a.get(aVar) != g3.DENIED;
    }

    public final e3 k(e3 e3Var) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : f3.STORAGE.f4199a) {
            g3 g3Var = this.f4166a.get(aVar);
            if (g3Var == g3.UNINITIALIZED) {
                g3Var = e3Var.f4166a.get(aVar);
            }
            if (g3Var != null) {
                enumMap.put((EnumMap) aVar, (a) g3Var);
            }
        }
        return new e3(enumMap, this.f4167b);
    }

    public final String m() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : f3.STORAGE.f4199a) {
            g3 g3Var = this.f4166a.get(aVar);
            char c10 = '-';
            if (g3Var != null && (ordinal = g3Var.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c10 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String n() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : f3.STORAGE.f4199a) {
            sb2.append(a(this.f4166a.get(aVar)));
        }
        return sb2.toString();
    }

    public final boolean o() {
        return j(a.AD_STORAGE);
    }

    public final boolean p() {
        return j(a.ANALYTICS_STORAGE);
    }

    public final boolean q() {
        Iterator<g3> it = this.f4166a.values().iterator();
        while (it.hasNext()) {
            if (it.next() != g3.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(h(this.f4167b));
        for (a aVar : f3.STORAGE.f4199a) {
            sb2.append(",");
            sb2.append(aVar.f4172a);
            sb2.append("=");
            g3 g3Var = this.f4166a.get(aVar);
            if (g3Var == null) {
                g3Var = g3.UNINITIALIZED;
            }
            sb2.append(g3Var);
        }
        return sb2.toString();
    }
}
