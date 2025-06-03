// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import java.util.Iterator;
import android.os.Bundle;
import java.util.Map;
import java.util.EnumMap;

public final class z
{
    public static final z f;
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;
    
    static {
        f = new z((Boolean)null, 100);
    }
    
    public z(final Boolean b, final int n) {
        this(b, n, null, null);
    }
    
    public z(final Boolean value, final int a, final Boolean c, final String d) {
        (this.e = new EnumMap((Class<K>)q3.a.class)).put(q3.a.r, value);
        this.a = a;
        this.b = this.k();
        this.c = c;
        this.d = d;
    }
    
    public z(final EnumMap enumMap, final int n) {
        this(enumMap, n, null, null);
    }
    
    public z(final EnumMap m, final int a, final Boolean c, final String d) {
        (this.e = new EnumMap((Class<K>)q3.a.class)).putAll(m);
        this.a = a;
        this.b = this.k();
        this.c = c;
        this.d = d;
    }
    
    public static z b(final Bundle bundle, final int n) {
        Boolean value = null;
        if (bundle == null) {
            return new z((Boolean)null, n);
        }
        final EnumMap<q3.a, Boolean> enumMap = new EnumMap<q3.a, Boolean>(q3.a.class);
        final q3.a[] c = p3.q.c();
        for (int length = c.length, i = 0; i < length; ++i) {
            final q3.a key = c[i];
            enumMap.put(key, q3.q(((BaseBundle)bundle).getString(key.o)));
        }
        if (((BaseBundle)bundle).containsKey("is_dma_region")) {
            value = Boolean.valueOf(((BaseBundle)bundle).getString("is_dma_region"));
        }
        return new z(enumMap, n, value, ((BaseBundle)bundle).getString("cps_display_str"));
    }
    
    public static z c(final String s) {
        if (s != null && s.length() > 0) {
            final String[] split = s.split(":");
            final int int1 = Integer.parseInt(split[0]);
            final EnumMap<q3.a, Boolean> enumMap = new EnumMap<q3.a, Boolean>(q3.a.class);
            final q3.a[] c = p3.q.c();
            for (int length = c.length, n = 1, i = 0; i < length; ++i, ++n) {
                enumMap.put(c[i], q3.g(split[n].charAt(0)));
            }
            return new z(enumMap, int1);
        }
        return z.f;
    }
    
    public static Boolean d(final Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return q3.q(((BaseBundle)bundle).getString("ad_personalization"));
    }
    
    public final int a() {
        return this.a;
    }
    
    public final Bundle e() {
        final Bundle bundle = new Bundle();
        for (final Map.Entry<K, Boolean> entry : this.e.entrySet()) {
            final Boolean b = entry.getValue();
            if (b != null) {
                ((BaseBundle)bundle).putString(((q3.a)entry.getKey()).o, q3.j(b));
            }
        }
        final Boolean c = this.c;
        if (c != null) {
            ((BaseBundle)bundle).putString("is_dma_region", c.toString());
        }
        final String d = this.d;
        if (d != null) {
            ((BaseBundle)bundle).putString("cps_display_str", d);
        }
        return bundle;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof z)) {
            return false;
        }
        final z z = (z)o;
        return this.b.equalsIgnoreCase(z.b) && y.a(this.c, z.c) && y.a(this.d, z.d);
    }
    
    public final Boolean f() {
        return this.e.get(q3.a.r);
    }
    
    public final Boolean g() {
        return this.c;
    }
    
    public final String h() {
        return this.d;
    }
    
    @Override
    public final int hashCode() {
        final Boolean c = this.c;
        int n;
        if (c == null) {
            n = 3;
        }
        else if (c == Boolean.TRUE) {
            n = 7;
        }
        else {
            n = 13;
        }
        final String d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 17;
        }
        else {
            hashCode = d.hashCode();
        }
        return this.b.hashCode() + n * 29 + hashCode * 137;
    }
    
    public final String i() {
        return this.b;
    }
    
    public final boolean j() {
        final Iterator<Boolean> iterator = this.e.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != null) {
                return true;
            }
        }
        return false;
    }
    
    public final String k() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        final q3.a[] c = p3.q.c();
        for (int length = c.length, i = 0; i < length; ++i) {
            final q3.a key = c[i];
            sb.append(":");
            sb.append(q3.a((Boolean)this.e.get(key)));
        }
        return sb.toString();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("source=");
        sb.append(q3.h(this.a));
        final q3.a[] c = p3.q.c();
        for (int length = c.length, i = 0; i < length; ++i) {
            final q3.a key = c[i];
            sb.append(",");
            sb.append(key.o);
            sb.append("=");
            final Boolean b = this.e.get(key);
            String str;
            if (b == null) {
                str = "uninitialized";
            }
            else if (b) {
                str = "granted";
            }
            else {
                str = "denied";
            }
            sb.append(str);
        }
        if (this.c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.d);
        }
        return sb.toString();
    }
}
