// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E;

import android.os.LocaleList;
import android.os.Build$VERSION;
import java.util.Locale;

public final class g
{
    public static final g b;
    public final i a;
    
    static {
        b = a(new Locale[0]);
    }
    
    public g(final i a) {
        this.a = a;
    }
    
    public static g a(final Locale... array) {
        if (Build$VERSION.SDK_INT >= 24) {
            return d(a.a(array));
        }
        return new g(new h(array));
    }
    
    public static Locale b(final String s) {
        if (s.contains("-")) {
            final String[] split = s.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        }
        else {
            if (!s.contains("_")) {
                return new Locale(s);
            }
            final String[] split2 = s.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Can not parse language tag: [");
        sb.append(s);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static g d(final LocaleList list) {
        return new g(new o(list));
    }
    
    public Locale c(final int n) {
        return this.a.get(n);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof g && this.a.equals(((g)o).a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
    
    public abstract static class a
    {
        public static LocaleList a(final Locale... array) {
            return new LocaleList(array);
        }
        
        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }
        
        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }
}
