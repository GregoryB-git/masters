// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import E2.e;
import android.content.Context;
import A2.n;
import android.util.Pair;
import android.util.Log;
import com.google.android.gms.internal.measurement.B6;
import android.text.TextUtils;

public final class Y1 extends l3
{
    public char c;
    public long d;
    public String e;
    public final a2 f;
    public final a2 g;
    public final a2 h;
    public final a2 i;
    public final a2 j;
    public final a2 k;
    public final a2 l;
    public final a2 m;
    public final a2 n;
    
    public Y1(final N2 n2) {
        super(n2);
        this.c = '\0';
        this.d = -1L;
        this.f = new a2(this, 6, false, false);
        this.g = new a2(this, 6, true, false);
        this.h = new a2(this, 6, false, true);
        this.i = new a2(this, 5, false, false);
        this.j = new a2(this, 5, true, false);
        this.k = new a2(this, 5, false, true);
        this.l = new a2(this, 4, false, false);
        this.m = new a2(this, 3, false, false);
        this.n = new a2(this, 2, false, false);
    }
    
    public static String E(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return "";
        }
        final int lastIndex = s.lastIndexOf(46);
        if (lastIndex != -1) {
            return s.substring(0, lastIndex);
        }
        if (B6.a() && (boolean)K.H0.a(null)) {
            return "";
        }
        return s;
    }
    
    public static Object v(final String s) {
        if (s == null) {
            return null;
        }
        return new d2(s);
    }
    
    public static String w(final boolean b, Object o) {
        final String s = "";
        if (o == null) {
            return "";
        }
        Object value = o;
        if (o instanceof Integer) {
            value = o;
        }
        final boolean b2 = value instanceof Long;
        int i = 0;
        if (b2) {
            if (!b) {
                return String.valueOf(value);
            }
            final Long n = (Long)value;
            if (Math.abs(n) < 100L) {
                return String.valueOf(value);
            }
            String s2 = s;
            if (String.valueOf(value).charAt(0) == '-') {
                s2 = "-";
            }
            final String value2 = String.valueOf(Math.abs(n));
            final long round = Math.round(Math.pow(10.0, value2.length() - 1));
            final long round2 = Math.round(Math.pow(10.0, value2.length()) - 1.0);
            final StringBuilder sb = new StringBuilder();
            sb.append(s2);
            sb.append(round);
            sb.append("...");
            sb.append(s2);
            sb.append(round2);
            return sb.toString();
        }
        else {
            if (value instanceof Boolean) {
                return String.valueOf(value);
            }
            if (value instanceof Throwable) {
                final Throwable t = (Throwable)value;
                String str;
                if (b) {
                    str = t.getClass().getName();
                }
                else {
                    str = t.toString();
                }
                o = new StringBuilder(str);
                final String e = E(N2.class.getCanonicalName());
                for (StackTraceElement[] stackTrace = t.getStackTrace(); i < stackTrace.length; ++i) {
                    final StackTraceElement obj = stackTrace[i];
                    if (!obj.isNativeMethod()) {
                        final String className = obj.getClassName();
                        if (className != null && E(className).equals(e)) {
                            ((StringBuilder)o).append(": ");
                            ((StringBuilder)o).append(obj);
                            break;
                        }
                    }
                }
                return ((StringBuilder)o).toString();
            }
            if (value instanceof d2) {
                return d2.a((d2)value);
            }
            if (b) {
                return "-";
            }
            return String.valueOf(value);
        }
    }
    
    public static String x(final boolean b, String str, final Object o, final Object o2, final Object o3) {
        final String s = "";
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        final String w = w(b, o);
        final String w2 = w(b, o2);
        final String w3 = w(b, o3);
        final StringBuilder sb = new StringBuilder();
        str = s;
        if (!TextUtils.isEmpty((CharSequence)str2)) {
            sb.append(str2);
            str = ": ";
        }
        final boolean empty = TextUtils.isEmpty((CharSequence)w);
        final String s2 = ", ";
        String s3 = str;
        if (!empty) {
            sb.append(str);
            sb.append(w);
            s3 = ", ";
        }
        if (!TextUtils.isEmpty((CharSequence)w2)) {
            sb.append(s3);
            sb.append(w2);
            s3 = s2;
        }
        if (!TextUtils.isEmpty((CharSequence)w3)) {
            sb.append(s3);
            sb.append(w3);
        }
        return sb.toString();
    }
    
    public final boolean C(final int n) {
        return Log.isLoggable(this.P(), n);
    }
    
    public final a2 F() {
        return this.m;
    }
    
    public final a2 G() {
        return this.f;
    }
    
    public final a2 H() {
        return this.h;
    }
    
    public final a2 I() {
        return this.g;
    }
    
    public final a2 J() {
        return this.l;
    }
    
    public final a2 K() {
        return this.n;
    }
    
    public final a2 L() {
        return this.i;
    }
    
    public final a2 M() {
        return this.k;
    }
    
    public final a2 N() {
        return this.j;
    }
    
    public final String O() {
        if (this.i().d == null) {
            return null;
        }
        final Pair a = this.i().d.a();
        if (a == null) {
            return null;
        }
        if (a == l2.z) {
            return null;
        }
        final String value = String.valueOf(a.second);
        final String str = (String)a.first;
        final StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }
    
    public final String P() {
        while (true) {
            // monitorenter(this)
            while (true) {
                Label_0060: {
                    while (true) {
                        try {
                            if (this.e == null) {
                                if (super.a.O() == null) {
                                    break Label_0060;
                                }
                                final String o = super.a.O();
                                this.e = o;
                            }
                            A2.n.i(this.e);
                            // monitorexit(this)
                            return this.e;
                            // monitorexit(this)
                            throw;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final String o = "FA";
                continue;
            }
        }
    }
    
    @Override
    public final boolean s() {
        return false;
    }
    
    public final void y(final int n, final String s) {
        Log.println(n, this.P(), s);
    }
    
    public final void z(int n, final boolean b, final boolean b2, String s, final Object o, final Object o2, final Object o3) {
        if (!b && this.C(n)) {
            this.y(n, x(false, s, o, o2, o3));
        }
        if (!b2 && n >= 5) {
            n.i(s);
            final G2 g = super.a.G();
            if (g == null) {
                s = "Scheduler not set. Not logging error/warn";
            }
            else {
                if (g.r()) {
                    int n2;
                    if ((n2 = n) < 0) {
                        n2 = 0;
                    }
                    if ((n = n2) >= 9) {
                        n = 8;
                    }
                    g.D(new b2(this, n, s, o, o2, o3));
                    return;
                }
                s = "Scheduler not initialized. Not logging error/warn";
            }
            this.y(6, s);
        }
    }
}
