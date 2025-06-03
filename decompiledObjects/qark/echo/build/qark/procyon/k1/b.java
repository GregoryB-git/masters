// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k1;

import java.util.ArrayList;
import java.util.List;
import g0.M;
import android.text.TextUtils;
import g0.e;
import java.util.regex.Matcher;
import g0.a;
import g0.o;
import g0.z;
import java.util.regex.Pattern;

public final class b
{
    public static final Pattern c;
    public static final Pattern d;
    public final z a;
    public final StringBuilder b;
    
    static {
        c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
        d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    }
    
    public b() {
        this.a = new z();
        this.b = new StringBuilder();
    }
    
    public static boolean b(final z z) {
        final int f = z.f();
        int g = z.g();
        final byte[] e = z.e();
        if (f + 2 <= g && e[f] == 47) {
            int n = f + 2;
            if (e[f + 1] == 42) {
                while (true) {
                    final int n2 = n + 1;
                    if (n2 >= g) {
                        break;
                    }
                    if ((char)e[n] == '*' && (char)e[n2] == '/') {
                        n = (g = n + 2);
                    }
                    else {
                        n = n2;
                    }
                }
                z.U(g - z.f());
                return true;
            }
        }
        return false;
    }
    
    public static boolean c(final z z) {
        final char k = k(z, z.f());
        if (k != '\t' && k != '\n' && k != '\f' && k != '\r' && k != ' ') {
            return false;
        }
        z.U(1);
        return true;
    }
    
    public static void e(String str, final c c) {
        final Matcher matcher = b.d.matcher(W2.c.e(str));
        if (!matcher.matches()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid font-size: '");
            sb.append(str);
            sb.append("'.");
            o.h("WebvttCssParser", sb.toString());
            return;
        }
        int n = 2;
        str = (String)a.e(matcher.group(2));
        str.hashCode();
        final int hashCode = str.hashCode();
        int n2 = -1;
        switch (hashCode) {
            case 3592: {
                if (!str.equals("px")) {
                    break;
                }
                n2 = 2;
                break;
            }
            case 3240: {
                if (!str.equals("em")) {
                    break;
                }
                n2 = 1;
                break;
            }
            case 37: {
                if (!str.equals("%")) {
                    break;
                }
                n2 = 0;
                break;
            }
        }
        switch (n2) {
            default: {
                throw new IllegalStateException();
            }
            case 2: {
                c.t(1);
                break;
            }
            case 0: {
                n = 3;
            }
            case 1: {
                c.t(n);
                break;
            }
        }
        c.s(Float.parseFloat((String)a.e(matcher.group(1))));
    }
    
    public static String f(final z z, final StringBuilder sb) {
        int n = 0;
        sb.setLength(0);
        int f = z.f();
        while (f < z.g() && n == 0) {
            final char c = (char)z.e()[f];
            if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c < '0' || c > '9') && c != '#' && c != '-' && c != '.' && c != '_') {
                n = 1;
            }
            else {
                ++f;
                sb.append(c);
            }
        }
        z.U(f - z.f());
        return sb.toString();
    }
    
    public static String g(final z z, StringBuilder sb) {
        n(z);
        if (z.a() == 0) {
            return null;
        }
        final String f = f(z, sb);
        if (!"".equals(f)) {
            return f;
        }
        sb = new StringBuilder();
        sb.append("");
        sb.append((char)z.G());
        return sb.toString();
    }
    
    public static String h(final z z, final StringBuilder sb) {
        final StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i == 0) {
            final int f = z.f();
            final String g = g(z, sb);
            if (g == null) {
                return null;
            }
            if (!"}".equals(g) && !";".equals(g)) {
                sb2.append(g);
            }
            else {
                z.T(f);
                i = 1;
            }
        }
        return sb2.toString();
    }
    
    public static String i(final z z, final StringBuilder sb) {
        n(z);
        if (z.a() < 5) {
            return null;
        }
        if (!"::cue".equals(z.D(5))) {
            return null;
        }
        final int f = z.f();
        final String g = g(z, sb);
        if (g == null) {
            return null;
        }
        if ("{".equals(g)) {
            z.T(f);
            return "";
        }
        String l;
        if ("(".equals(g)) {
            l = l(z);
        }
        else {
            l = null;
        }
        if (!")".equals(g(z, sb))) {
            return null;
        }
        return l;
    }
    
    public static void j(final z z, final c c, final StringBuilder sb) {
        n(z);
        final String f = f(z, sb);
        if ("".equals(f)) {
            return;
        }
        if (!":".equals(g(z, sb))) {
            return;
        }
        n(z);
        final String h = h(z, sb);
        if (h != null) {
            if ("".equals(h)) {
                return;
            }
            final int f2 = z.f();
            final String g = g(z, sb);
            if (!";".equals(g)) {
                if (!"}".equals(g)) {
                    return;
                }
                z.T(f2);
            }
            if ("color".equals(f)) {
                c.q(e.b(h));
                return;
            }
            if ("background-color".equals(f)) {
                c.n(e.b(h));
                return;
            }
            final boolean equals = "ruby-position".equals(f);
            final boolean b = true;
            if (equals) {
                if ("over".equals(h)) {
                    c.v(1);
                    return;
                }
                if ("under".equals(h)) {
                    c.v(2);
                }
            }
            else {
                if ("text-combine-upright".equals(f)) {
                    boolean b2 = b;
                    if (!"all".equals(h)) {
                        b2 = (h.startsWith("digits") && b);
                    }
                    c.p(b2);
                    return;
                }
                if ("text-decoration".equals(f)) {
                    if ("underline".equals(h)) {
                        c.A(true);
                    }
                }
                else {
                    if ("font-family".equals(f)) {
                        c.r(h);
                        return;
                    }
                    if ("font-weight".equals(f)) {
                        if ("bold".equals(h)) {
                            c.o(true);
                        }
                    }
                    else if ("font-style".equals(f)) {
                        if ("italic".equals(h)) {
                            c.u(true);
                        }
                    }
                    else if ("font-size".equals(f)) {
                        e(h, c);
                    }
                }
            }
        }
    }
    
    public static char k(final z z, final int n) {
        return (char)z.e()[n];
    }
    
    public static String l(final z z) {
        int f = z.f();
        for (int g = z.g(), n = 0; f < g && n == 0; ++f) {
            if ((char)z.e()[f] == ')') {
                n = 1;
            }
            else {
                n = 0;
            }
        }
        return z.D(f - 1 - z.f()).trim();
    }
    
    public static void m(final z z) {
        while (!TextUtils.isEmpty((CharSequence)z.r())) {}
    }
    
    public static void n(final z z) {
    Label_0000:
        while (true) {
            for (int n = 1; z.a() > 0 && n != 0; n = 0) {
                if (c(z)) {
                    continue Label_0000;
                }
                if (b(z)) {
                    continue Label_0000;
                }
            }
            break;
        }
    }
    
    public final void a(final c c, final String anObject) {
        if ("".equals(anObject)) {
            return;
        }
        final int index = anObject.indexOf(91);
        String substring = anObject;
        if (index != -1) {
            final Matcher matcher = k1.b.c.matcher(anObject.substring(index));
            if (matcher.matches()) {
                c.z((String)g0.a.e(matcher.group(1)));
            }
            substring = anObject.substring(0, index);
        }
        final String[] b1 = M.b1(substring, "\\.");
        final String s = b1[0];
        final int index2 = s.indexOf(35);
        if (index2 != -1) {
            c.y(s.substring(0, index2));
            c.x(s.substring(index2 + 1));
        }
        else {
            c.y(s);
        }
        if (b1.length > 1) {
            c.w((String[])M.P0(b1, 1, b1.length));
        }
    }
    
    public List d(final z z) {
        this.b.setLength(0);
        final int f = z.f();
        m(z);
        this.a.R(z.e(), z.f());
        this.a.T(f);
        final ArrayList<c> list = new ArrayList<c>();
        while (true) {
            final String i = i(this.a, this.b);
            if (i == null) {
                return list;
            }
            if (!"{".equals(g(this.a, this.b))) {
                return list;
            }
            final c c = new c();
            this.a(c, i);
            Object g = null;
            int j = 0;
            while (j == 0) {
                final int f2 = this.a.f();
                g = g(this.a, this.b);
                if (g != null && !"}".equals(g)) {
                    j = 0;
                }
                else {
                    j = 1;
                }
                if (j == 0) {
                    this.a.T(f2);
                    j(this.a, c, this.b);
                }
            }
            if (!"}".equals(g)) {
                continue;
            }
            list.add(c);
        }
    }
}
