/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.EnumMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package R2;

import R2.p3;
import android.os.Bundle;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class q3 {
    public static final q3 c = new q3(null, null, 100);
    public final EnumMap a;
    public final int b;

    public q3(Boolean bl, Boolean bl2, int n8) {
        EnumMap enumMap;
        this.a = enumMap = new EnumMap(a.class);
        enumMap.put((Enum)a.p, (Object)bl);
        enumMap.put((Enum)a.q, (Object)bl2);
        this.b = n8;
    }

    public q3(EnumMap enumMap, int n8) {
        EnumMap enumMap2;
        this.a = enumMap2 = new EnumMap(a.class);
        enumMap2.putAll((Map)enumMap);
        this.b = n8;
    }

    public static char a(Boolean bl) {
        if (bl == null) {
            return '-';
        }
        if (bl.booleanValue()) {
            return '1';
        }
        return '0';
    }

    public static q3 d(Bundle bundle, int n8) {
        if (bundle == null) {
            return new q3(null, null, n8);
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a a8 : p3.e(p3.p)) {
            enumMap.put((Enum)a8, (Object)q3.q(bundle.getString(a8.o)));
        }
        return new q3(enumMap, n8);
    }

    public static q3 e(String string2) {
        return q3.f(string2, 100);
    }

    public static q3 f(String string2, int n8) {
        EnumMap enumMap = new EnumMap(a.class);
        if (string2 != null) {
            a[] arra = p3.p.c();
            for (int i8 = 0; i8 < arra.length; ++i8) {
                a a8 = arra[i8];
                int n9 = i8 + 2;
                if (n9 >= string2.length()) continue;
                enumMap.put((Enum)a8, (Object)q3.g(string2.charAt(n9)));
            }
        }
        return new q3(enumMap, n8);
    }

    public static Boolean g(char c8) {
        if (c8 != '0') {
            if (c8 != '1') {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static String h(int n8) {
        if (n8 != -20) {
            if (n8 != -10) {
                if (n8 != 0) {
                    if (n8 != 30) {
                        if (n8 != 90) {
                            if (n8 != 100) {
                                return "OTHER";
                            }
                            return "UNKNOWN";
                        }
                        return "REMOTE_CONFIG";
                    }
                    return "1P_INIT";
                }
                return "1P_API";
            }
            return "MANIFEST";
        }
        return "API";
    }

    public static String i(Bundle bundle) {
        for (a a8 : p3.e(p3.p)) {
            String string2;
            if (!bundle.containsKey(a8.o) || (string2 = bundle.getString(a8.o)) == null || q3.q(string2) != null) continue;
            return string2;
        }
        return null;
    }

    public static String j(boolean bl) {
        if (bl) {
            return "granted";
        }
        return "denied";
    }

    public static boolean k(int n8, int n9) {
        if (n8 <= n9) {
            return true;
        }
        return false;
    }

    public static int n(Boolean bl) {
        if (bl == null) {
            return 0;
        }
        if (bl.booleanValue()) {
            return 1;
        }
        return 2;
    }

    public static Boolean q(String string2) {
        if (string2 == null) {
            return null;
        }
        if (string2.equals((Object)"granted")) {
            return Boolean.TRUE;
        }
        if (string2.equals((Object)"denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final int b() {
        return this.b;
    }

    public final q3 c(q3 q32) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a a8 : p3.e(p3.p)) {
            Boolean bl = (Boolean)this.a.get((Object)a8);
            Boolean bl2 = (Boolean)q32.a.get((Object)a8);
            if (bl == null) {
                bl = bl2;
            } else if (bl2 != null) {
                boolean bl3 = bl != false && bl2 != false;
                bl = bl3;
            }
            enumMap.put((Enum)a8, (Object)bl);
        }
        return new q3(enumMap, 100);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof q3)) {
            return false;
        }
        object = (q3)object;
        for (a a8 : p3.e(p3.p)) {
            if (q3.n((Boolean)this.a.get((Object)a8)) == q3.n((Boolean)object.a.get((Object)a8))) continue;
            return false;
        }
        if (this.b == object.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n8 = this.b * 17;
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            n8 = n8 * 31 + q3.n((Boolean)iterator.next());
        }
        return n8;
    }

    public final boolean l(a a8) {
        if ((a8 = (Boolean)this.a.get((Object)a8)) != null && !a8.booleanValue()) {
            return false;
        }
        return true;
    }

    public final /* varargs */ boolean m(q3 q32, a ... arra) {
        for (a a8 : arra) {
            if (q32.l(a8) || !this.l(a8)) continue;
            return true;
        }
        return false;
    }

    public final q3 o(q3 q32) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a a8 : p3.e(p3.p)) {
            Boolean bl;
            Boolean bl2 = bl = (Boolean)this.a.get((Object)a8);
            if (bl == null) {
                bl2 = (Boolean)q32.a.get((Object)a8);
            }
            enumMap.put((Enum)a8, (Object)bl2);
        }
        return new q3(enumMap, this.b);
    }

    public final Bundle p() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.a.entrySet()) {
            Boolean bl = (Boolean)entry.getValue();
            if (bl == null) continue;
            bundle.putString(((a)entry.getKey()).o, q3.j(bl));
        }
        return bundle;
    }

    public final /* varargs */ boolean r(q3 q32, a ... arra) {
        for (a a8 : arra) {
            Boolean bl = (Boolean)this.a.get((Object)a8);
            a8 = (Boolean)q32.a.get((Object)a8);
            Boolean bl2 = Boolean.FALSE;
            if (bl != bl2 || a8 == bl2) continue;
            return true;
        }
        return false;
    }

    public final Boolean s() {
        return (Boolean)this.a.get((Object)a.p);
    }

    public final boolean t(q3 q32) {
        return this.r(q32, (a[])this.a.keySet().toArray((Object[])new a[0]));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("source=");
        stringBuilder.append(q3.h(this.b));
        a[] arra = p3.e(p3.p);
        int n8 = arra.length;
        int n9 = 0;
        while (n9 < n8) {
            void var3_5;
            a a8 = arra[n9];
            stringBuilder.append(",");
            stringBuilder.append(a8.o);
            stringBuilder.append("=");
            Boolean bl = (Boolean)this.a.get((Object)a8);
            if (bl == null) {
                String string2 = "uninitialized";
            } else if (bl.booleanValue()) {
                String string3 = "granted";
            } else {
                String string4 = "denied";
            }
            stringBuilder.append((String)var3_5);
            ++n9;
        }
        return stringBuilder.toString();
    }

    public final Boolean u() {
        return (Boolean)this.a.get((Object)a.q);
    }

    public final String v() {
        StringBuilder stringBuilder = new StringBuilder("G1");
        for (a a8 : p3.p.c()) {
            stringBuilder.append(q3.a((Boolean)this.a.get((Object)a8)));
        }
        return stringBuilder.toString();
    }

    public final String w() {
        StringBuilder stringBuilder = new StringBuilder("G2");
        for (a a8 : p3.p.c()) {
            char c8 = (a8 = (Boolean)this.a.get((Object)a8)) == null ? 'g' : (a8.booleanValue() ? 'G' : 'D');
            stringBuilder.append(c8);
        }
        return stringBuilder.toString();
    }

    public final boolean x() {
        return this.l(a.p);
    }

    public final boolean y() {
        return this.l(a.q);
    }

    public final boolean z() {
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            if ((Boolean)iterator.next() == null) continue;
            return true;
        }
        return false;
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a p;
        public static final /* enum */ a q;
        public static final /* enum */ a r;
        public static final /* enum */ a s;
        public static final /* synthetic */ a[] t;
        public final String o;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            p = a9 = new a("ad_storage");
            q = a8 = new a("analytics_storage");
            r = a11 = new a("ad_user_data");
            s = a10 = new a("ad_personalization");
            t = new a[]{a9, a8, a11, a10};
        }

        public a(String string3) {
            this.o = string3;
        }

        public static a[] values() {
            return (a[])t.clone();
        }
    }

}

