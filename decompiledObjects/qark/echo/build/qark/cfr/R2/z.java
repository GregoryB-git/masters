/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Integer
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
import R2.q3;
import R2.y;
import android.os.Bundle;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class z {
    public static final z f = new z(null, 100);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public z(Boolean bl, int n8) {
        this(bl, n8, null, null);
    }

    public z(Boolean bl, int n8, Boolean bl2, String string2) {
        EnumMap enumMap;
        this.e = enumMap = new EnumMap(q3.a.class);
        enumMap.put((Enum)q3.a.r, (Object)bl);
        this.a = n8;
        this.b = this.k();
        this.c = bl2;
        this.d = string2;
    }

    public z(EnumMap enumMap, int n8) {
        this(enumMap, n8, null, null);
    }

    public z(EnumMap enumMap, int n8, Boolean bl, String string2) {
        EnumMap enumMap2;
        this.e = enumMap2 = new EnumMap(q3.a.class);
        enumMap2.putAll((Map)enumMap);
        this.a = n8;
        this.b = this.k();
        this.c = bl;
        this.d = string2;
    }

    public static z b(Bundle bundle, int n8) {
        Boolean bl = null;
        if (bundle == null) {
            return new z(null, n8);
        }
        EnumMap enumMap = new EnumMap(q3.a.class);
        for (q3.a a8 : p3.q.c()) {
            enumMap.put((Enum)a8, (Object)q3.q(bundle.getString(a8.o)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bl = Boolean.valueOf((String)bundle.getString("is_dma_region"));
        }
        return new z(enumMap, n8, bl, bundle.getString("cps_display_str"));
    }

    public static z c(String arrstring) {
        if (arrstring != null && arrstring.length() > 0) {
            arrstring = arrstring.split(":");
            int n8 = Integer.parseInt((String)arrstring[0]);
            EnumMap enumMap = new EnumMap(q3.a.class);
            q3.a[] arra = p3.q.c();
            int n9 = arra.length;
            int n10 = 1;
            int n11 = 0;
            while (n11 < n9) {
                enumMap.put((Enum)arra[n11], (Object)q3.g(arrstring[n10].charAt(0)));
                ++n11;
                ++n10;
            }
            return new z(enumMap, n8);
        }
        return f;
    }

    public static Boolean d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return q3.q(bundle.getString("ad_personalization"));
    }

    public final int a() {
        return this.a;
    }

    public final Bundle e() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.e.entrySet()) {
            Boolean bl = (Boolean)entry.getValue();
            if (bl == null) continue;
            bundle.putString(((q3.a)entry.getKey()).o, q3.j(bl));
        }
        Object object = this.c;
        if (object != null) {
            bundle.putString("is_dma_region", object.toString());
        }
        if ((object = this.d) != null) {
            bundle.putString("cps_display_str", (String)object);
        }
        return bundle;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof z)) {
            return false;
        }
        object = (z)object;
        if (!this.b.equalsIgnoreCase(object.b)) {
            return false;
        }
        if (!y.a((Object)this.c, (Object)object.c)) {
            return false;
        }
        return y.a(this.d, object.d);
    }

    public final Boolean f() {
        return (Boolean)this.e.get((Object)q3.a.r);
    }

    public final Boolean g() {
        return this.c;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        Object object = this.c;
        int n8 = object == null ? 3 : (object == Boolean.TRUE ? 7 : 13);
        object = this.d;
        int n9 = object == null ? 17 : object.hashCode();
        return this.b.hashCode() + n8 * 29 + n9 * 137;
    }

    public final String i() {
        return this.b;
    }

    public final boolean j() {
        Iterator iterator = this.e.values().iterator();
        while (iterator.hasNext()) {
            if ((Boolean)iterator.next() == null) continue;
            return true;
        }
        return false;
    }

    public final String k() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        for (q3.a a8 : p3.q.c()) {
            stringBuilder.append(":");
            stringBuilder.append(q3.a((Boolean)this.e.get((Object)a8)));
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("source=");
        stringBuilder.append(q3.h(this.a));
        for (q3.a a8 : p3.q.c()) {
            void var3_5;
            stringBuilder.append(",");
            stringBuilder.append(a8.o);
            stringBuilder.append("=");
            Boolean bl = (Boolean)this.e.get((Object)a8);
            if (bl == null) {
                String string2 = "uninitialized";
            } else if (bl.booleanValue()) {
                String string3 = "granted";
            } else {
                String string4 = "denied";
            }
            stringBuilder.append((String)var3_5);
        }
        if (this.c != null) {
            stringBuilder.append(",isDmaRegion=");
            stringBuilder.append((Object)this.c);
        }
        if (this.d != null) {
            stringBuilder.append(",cpsDisplayStr=");
            stringBuilder.append(this.d);
        }
        return stringBuilder.toString();
    }
}

