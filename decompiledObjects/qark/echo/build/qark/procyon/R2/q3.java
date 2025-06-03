// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import java.util.Iterator;
import android.os.Bundle;
import java.util.Map;
import java.util.EnumMap;

public final class q3
{
    public static final q3 c;
    public final EnumMap a;
    public final int b;
    
    static {
        c = new q3(null, null, 100);
    }
    
    public q3(final Boolean value, final Boolean value2, final int b) {
        final EnumMap<a, Boolean> a = new EnumMap<a, Boolean>(a.class);
        (this.a = a).put(q3.a.p, value);
        a.put(q3.a.q, value2);
        this.b = b;
    }
    
    public q3(final EnumMap m, final int b) {
        (this.a = new EnumMap((Class<K>)a.class)).putAll(m);
        this.b = b;
    }
    
    public static char a(final Boolean b) {
        if (b == null) {
            return '-';
        }
        if (b) {
            return '1';
        }
        return '0';
    }
    
    public static q3 d(final Bundle bundle, final int n) {
        if (bundle == null) {
            return new q3(null, null, n);
        }
        final EnumMap<a, Boolean> enumMap = new EnumMap<a, Boolean>(a.class);
        final a[] e = p3.e(p3.p);
        for (int length = e.length, i = 0; i < length; ++i) {
            final a key = e[i];
            enumMap.put(key, q(((BaseBundle)bundle).getString(key.o)));
        }
        return new q3(enumMap, n);
    }
    
    public static q3 e(final String s) {
        return f(s, 100);
    }
    
    public static q3 f(final String s, final int n) {
        final EnumMap<a, Boolean> enumMap = new EnumMap<a, Boolean>(a.class);
        if (s != null) {
            final a[] c = p3.p.c();
            for (int i = 0; i < c.length; ++i) {
                final a key = c[i];
                final int index = i + 2;
                if (index < s.length()) {
                    enumMap.put(key, g(s.charAt(index)));
                }
            }
        }
        return new q3(enumMap, n);
    }
    
    public static Boolean g(final char c) {
        if (c == '0') {
            return Boolean.FALSE;
        }
        if (c != '1') {
            return null;
        }
        return Boolean.TRUE;
    }
    
    public static String h(final int n) {
        if (n == -20) {
            return "API";
        }
        if (n == -10) {
            return "MANIFEST";
        }
        if (n == 0) {
            return "1P_API";
        }
        if (n == 30) {
            return "1P_INIT";
        }
        if (n == 90) {
            return "REMOTE_CONFIG";
        }
        if (n != 100) {
            return "OTHER";
        }
        return "UNKNOWN";
    }
    
    public static String i(final Bundle bundle) {
        final a[] e = p3.e(p3.p);
        for (int length = e.length, i = 0; i < length; ++i) {
            final a a = e[i];
            if (((BaseBundle)bundle).containsKey(a.o)) {
                final String string = ((BaseBundle)bundle).getString(a.o);
                if (string != null && q(string) == null) {
                    return string;
                }
            }
        }
        return null;
    }
    
    public static String j(final boolean b) {
        if (b) {
            return "granted";
        }
        return "denied";
    }
    
    public static boolean k(final int n, final int n2) {
        return n <= n2;
    }
    
    public static int n(final Boolean b) {
        if (b == null) {
            return 0;
        }
        if (b) {
            return 1;
        }
        return 2;
    }
    
    public static Boolean q(final String s) {
        if (s == null) {
            return null;
        }
        if (s.equals("granted")) {
            return Boolean.TRUE;
        }
        if (s.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final q3 c(final q3 q3) {
        final EnumMap<a, Boolean> enumMap = new EnumMap<a, Boolean>(a.class);
        final a[] e = p3.e(p3.p);
        for (int length = e.length, i = 0; i < length; ++i) {
            final a key = e[i];
            Boolean value = this.a.get(key);
            final Boolean b = q3.a.get(key);
            if (value == null) {
                value = b;
            }
            else if (b != null) {
                value = (value && b);
            }
            enumMap.put(key, value);
        }
        return new q3(enumMap, 100);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof q3)) {
            return false;
        }
        final q3 q3 = (q3)o;
        final a[] e = p3.e(p3.p);
        for (int length = e.length, i = 0; i < length; ++i) {
            final a a = e[i];
            if (n((Boolean)this.a.get(a)) != n((Boolean)q3.a.get(a))) {
                return false;
            }
        }
        return this.b == q3.b;
    }
    
    @Override
    public final int hashCode() {
        int n = this.b * 17;
        final Iterator<Boolean> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            n = n * 31 + n(iterator.next());
        }
        return n;
    }
    
    public final boolean l(final a key) {
        final Boolean b = this.a.get(key);
        return b == null || b;
    }
    
    public final boolean m(final q3 q3, final a... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            final a a = array[i];
            if (!q3.l(a) && this.l(a)) {
                return true;
            }
        }
        return false;
    }
    
    public final q3 o(final q3 q3) {
        final EnumMap<a, Boolean> enumMap = new EnumMap<a, Boolean>(a.class);
        final a[] e = p3.e(p3.p);
        for (int length = e.length, i = 0; i < length; ++i) {
            final a key = e[i];
            Boolean value;
            if ((value = this.a.get(key)) == null) {
                value = q3.a.get(key);
            }
            enumMap.put(key, value);
        }
        return new q3(enumMap, this.b);
    }
    
    public final Bundle p() {
        final Bundle bundle = new Bundle();
        for (final Map.Entry<K, Boolean> entry : this.a.entrySet()) {
            final Boolean b = entry.getValue();
            if (b != null) {
                ((BaseBundle)bundle).putString(((a)entry.getKey()).o, j(b));
            }
        }
        return bundle;
    }
    
    public final boolean r(final q3 q3, final a... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            final a a = array[i];
            final Boolean b = this.a.get(a);
            final Boolean b2 = q3.a.get(a);
            final Boolean false = Boolean.FALSE;
            if (b == false && b2 != false) {
                return true;
            }
        }
        return false;
    }
    
    public final Boolean s() {
        return this.a.get(q3.a.p);
    }
    
    public final boolean t(final q3 q3) {
        return this.r(q3, (a[])this.a.keySet().toArray(new a[0]));
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("source=");
        sb.append(h(this.b));
        final a[] e = p3.e(p3.p);
        for (int length = e.length, i = 0; i < length; ++i) {
            final a key = e[i];
            sb.append(",");
            sb.append(key.o);
            sb.append("=");
            final Boolean b = this.a.get(key);
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
        return sb.toString();
    }
    
    public final Boolean u() {
        return this.a.get(q3.a.q);
    }
    
    public final String v() {
        final StringBuilder sb = new StringBuilder("G1");
        final a[] c = p3.p.c();
        for (int length = c.length, i = 0; i < length; ++i) {
            sb.append(a((Boolean)this.a.get(c[i])));
        }
        return sb.toString();
    }
    
    public final String w() {
        final StringBuilder sb = new StringBuilder("G2");
        final a[] c = p3.p.c();
        for (int length = c.length, i = 0; i < length; ++i) {
            final Boolean b = this.a.get(c[i]);
            char c2;
            if (b == null) {
                c2 = 'g';
            }
            else if (b) {
                c2 = 'G';
            }
            else {
                c2 = 'D';
            }
            sb.append(c2);
        }
        return sb.toString();
    }
    
    public final boolean x() {
        return this.l(q3.a.p);
    }
    
    public final boolean y() {
        return this.l(q3.a.q);
    }
    
    public final boolean z() {
        final Iterator<Boolean> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != null) {
                return true;
            }
        }
        return false;
    }
    
    public enum a
    {
        p("AD_STORAGE", 0, "ad_storage"), 
        q("ANALYTICS_STORAGE", 1, "analytics_storage"), 
        r("AD_USER_DATA", 2, "ad_user_data"), 
        s("AD_PERSONALIZATION", 3, "ad_personalization");
        
        public final String o;
        
        public a(final String name, final int ordinal, final String o) {
            this.o = o;
        }
    }
}
