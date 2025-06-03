/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.EnumMap
 *  java.util.Map
 */
package R2;

import R2.k;
import R2.q3;
import java.util.EnumMap;
import java.util.Map;

public final class l {
    public final EnumMap a;

    public l() {
        this.a = new EnumMap(q3.a.class);
    }

    public l(EnumMap enumMap) {
        EnumMap enumMap2;
        this.a = enumMap2 = new EnumMap(q3.a.class);
        enumMap2.putAll((Map)enumMap);
    }

    public static l b(String string2) {
        EnumMap enumMap = new EnumMap(q3.a.class);
        if (string2.length() >= q3.a.values().length) {
            int n8 = 0;
            if (string2.charAt(0) == '1') {
                q3.a[] arra = q3.a.values();
                int n9 = arra.length;
                int n10 = 1;
                while (n8 < n9) {
                    enumMap.put((Enum)arra[n8], (Object)k.e(string2.charAt(n10)));
                    ++n8;
                    ++n10;
                }
                return new l(enumMap);
            }
        }
        return new l();
    }

    public final k a(q3.a enum_) {
        k k8 = (k)((Object)this.a.get((Object)enum_));
        enum_ = k8;
        if (k8 == null) {
            enum_ = k.p;
        }
        return enum_;
    }

    public final void c(q3.a a8, int n8) {
        k k8;
        block3 : {
            block1 : {
                block2 : {
                    k8 = k.p;
                    if (n8 == -20) break block1;
                    if (n8 == -10) break block2;
                    if (n8 == 0) break block1;
                    if (n8 == 30) {
                        k8 = k.t;
                    }
                    break block3;
                }
                k8 = k.s;
                break block3;
            }
            k8 = k.u;
        }
        this.a.put((Enum)a8, (Object)k8);
    }

    public final void d(q3.a a8, k k8) {
        this.a.put((Enum)a8, (Object)k8);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("1");
        for (q3.a a8 : q3.a.values()) {
            void enum_;
            k k8;
            k k9 = k8 = (k)((Object)this.a.get((Object)a8));
            if (k8 == null) {
                k k10 = k.p;
            }
            stringBuilder.append(k.c((k)enum_));
        }
        return stringBuilder.toString();
    }
}

