// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Locale;

public final class h implements i
{
    public static final Locale[] c;
    public static final Locale d;
    public static final Locale e;
    public static final Locale f;
    public final Locale[] a;
    public final String b;
    
    static {
        c = new Locale[0];
        d = new Locale("en", "XA");
        e = new Locale("ar", "XB");
        f = g.b("en-Latn");
    }
    
    public h(final Locale... array) {
        String string;
        if (array.length == 0) {
            this.a = h.c;
            string = "";
        }
        else {
            final ArrayList<Locale> list = new ArrayList<Locale>();
            final HashSet<Locale> set = new HashSet<Locale>();
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; ++i) {
                final Locale o = array[i];
                if (o == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("list[");
                    sb2.append(i);
                    sb2.append("] is null");
                    throw new NullPointerException(sb2.toString());
                }
                if (!set.contains(o)) {
                    final Locale e = (Locale)o.clone();
                    list.add(e);
                    b(sb, e);
                    if (i < array.length - 1) {
                        sb.append(',');
                    }
                    set.add(e);
                }
            }
            this.a = list.toArray(new Locale[0]);
            string = sb.toString();
        }
        this.b = string;
    }
    
    public static void b(final StringBuilder sb, final Locale locale) {
        sb.append(locale.getLanguage());
        final String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }
    
    @Override
    public Object a() {
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final Locale[] a = ((h)o).a;
        if (this.a.length != a.length) {
            return false;
        }
        int n = 0;
        while (true) {
            final Locale[] a2 = this.a;
            if (n >= a2.length) {
                return true;
            }
            if (!a2[n].equals(a[n])) {
                return false;
            }
            ++n;
        }
    }
    
    @Override
    public Locale get(final int n) {
        if (n >= 0) {
            final Locale[] a = this.a;
            if (n < a.length) {
                return a[n];
            }
        }
        return null;
    }
    
    @Override
    public int hashCode() {
        final Locale[] a = this.a;
        final int length = a.length;
        int n = 1;
        for (int i = 0; i < length; ++i) {
            n = n * 31 + a[i].hashCode();
        }
        return n;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        int n = 0;
        while (true) {
            final Locale[] a = this.a;
            if (n >= a.length) {
                break;
            }
            sb.append(a[n]);
            if (n < this.a.length - 1) {
                sb.append(',');
            }
            ++n;
        }
        sb.append("]");
        return sb.toString();
    }
}
