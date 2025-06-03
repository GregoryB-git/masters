/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package k1;

import android.text.TextUtils;
import g0.M;
import g0.a;
import g0.e;
import g0.o;
import g0.z;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.c;

public final class b {
    public static final Pattern c = Pattern.compile((String)"\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile((String)"^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final z a = new z();
    public final StringBuilder b = new StringBuilder();

    public static boolean b(z z8) {
        int n8 = z8.f();
        int n9 = z8.g();
        byte[] arrby = z8.e();
        if (n8 + 2 <= n9 && arrby[n8] == 47) {
            int n10 = n8 + 2;
            if (arrby[n8 + 1] == 42) {
                while ((n8 = n10 + 1) < n9) {
                    if ((char)arrby[n10] == '*' && (char)arrby[n8] == '/') {
                        n9 = n10 += 2;
                        continue;
                    }
                    n10 = n8;
                }
                z8.U(n9 - z8.f());
                return true;
            }
        }
        return false;
    }

    public static boolean c(z z8) {
        char c8 = b.k(z8, z8.f());
        if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
            return false;
        }
        z8.U(1);
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void e(String var0, c var1_1) {
        var5_2 = b.d.matcher((CharSequence)W2.c.e(var0));
        if (!var5_2.matches()) {
            var1_1 = new StringBuilder();
            var1_1.append("Invalid font-size: '");
            var1_1.append(var0);
            var1_1.append("'.");
            o.h("WebvttCssParser", var1_1.toString());
            return;
        }
        var3_3 = 2;
        var0 = (String)a.e(var5_2.group(2));
        var0.hashCode();
        var4_4 = var0.hashCode();
        var2_5 = -1;
        switch (var4_4) {
            default: {
                break;
            }
            case 3592: {
                if (!var0.equals((Object)"px")) break;
                var2_5 = 2;
                break;
            }
            case 3240: {
                if (!var0.equals((Object)"em")) break;
                var2_5 = 1;
                break;
            }
            case 37: {
                if (!var0.equals((Object)"%")) break;
                var2_5 = 0;
            }
        }
        switch (var2_5) {
            default: {
                throw new IllegalStateException();
            }
            case 2: {
                var1_1.t(1);
                ** break;
            }
            case 0: {
                var3_3 = 3;
            }
            case 1: 
        }
        var1_1.t(var3_3);
        ** break;
lbl39: // 2 sources:
        var1_1.s(Float.parseFloat((String)((String)a.e(var5_2.group(1)))));
    }

    public static String f(z z8, StringBuilder stringBuilder) {
        boolean bl = false;
        stringBuilder.setLength(0);
        int n8 = z8.f();
        int n9 = z8.g();
        while (n8 < n9 && !bl) {
            char c8 = (char)z8.e()[n8];
            if (!(c8 >= 'A' && c8 <= 'Z' || c8 >= 'a' && c8 <= 'z' || c8 >= '0' && c8 <= '9' || c8 == '#' || c8 == '-' || c8 == '.' || c8 == '_')) {
                bl = true;
                continue;
            }
            ++n8;
            stringBuilder.append(c8);
        }
        z8.U(n8 - z8.f());
        return stringBuilder.toString();
    }

    public static String g(z z8, StringBuilder object) {
        b.n(z8);
        if (z8.a() == 0) {
            return null;
        }
        if (!"".equals(object = b.f(z8, (StringBuilder)object))) {
            return object;
        }
        object = new StringBuilder();
        object.append("");
        object.append((char)z8.G());
        return object.toString();
    }

    public static String h(z z8, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder();
        boolean bl = false;
        while (!bl) {
            int n8 = z8.f();
            String string2 = b.g(z8, stringBuilder);
            if (string2 == null) {
                return null;
            }
            if (!"}".equals((Object)string2) && !";".equals((Object)string2)) {
                stringBuilder2.append(string2);
                continue;
            }
            z8.T(n8);
            bl = true;
        }
        return stringBuilder2.toString();
    }

    public static String i(z z8, StringBuilder stringBuilder) {
        b.n(z8);
        if (z8.a() < 5) {
            return null;
        }
        if (!"::cue".equals((Object)z8.D(5))) {
            return null;
        }
        int n8 = z8.f();
        String string2 = b.g(z8, stringBuilder);
        if (string2 == null) {
            return null;
        }
        if ("{".equals((Object)string2)) {
            z8.T(n8);
            return "";
        }
        string2 = "(".equals((Object)string2) ? b.l(z8) : null;
        if (!")".equals((Object)b.g(z8, stringBuilder))) {
            return null;
        }
        return string2;
    }

    public static void j(z z8, c c8, StringBuilder object) {
        block25 : {
            String string2;
            String string3;
            block26 : {
                b.n(z8);
                string3 = b.f(z8, (StringBuilder)object);
                if ("".equals((Object)string3)) {
                    return;
                }
                if (!":".equals((Object)b.g(z8, (StringBuilder)object))) {
                    return;
                }
                b.n(z8);
                string2 = b.h(z8, (StringBuilder)object);
                if (string2 == null) break block25;
                if ("".equals((Object)string2)) {
                    return;
                }
                int n8 = z8.f();
                if (";".equals(object = b.g(z8, (StringBuilder)object))) break block26;
                if (!"}".equals(object)) break block25;
                z8.T(n8);
            }
            if ("color".equals((Object)string3)) {
                c8.q(e.b(string2));
                return;
            }
            if ("background-color".equals((Object)string3)) {
                c8.n(e.b(string2));
                return;
            }
            boolean bl = "ruby-position".equals((Object)string3);
            boolean bl2 = true;
            if (bl) {
                if ("over".equals((Object)string2)) {
                    c8.v(1);
                    return;
                }
                if ("under".equals((Object)string2)) {
                    c8.v(2);
                    return;
                }
            } else {
                if ("text-combine-upright".equals((Object)string3)) {
                    bl = bl2;
                    if (!"all".equals((Object)string2)) {
                        bl = string2.startsWith("digits") ? bl2 : false;
                    }
                    c8.p(bl);
                    return;
                }
                if ("text-decoration".equals((Object)string3)) {
                    if ("underline".equals((Object)string2)) {
                        c8.A(true);
                        return;
                    }
                } else {
                    if ("font-family".equals((Object)string3)) {
                        c8.r(string2);
                        return;
                    }
                    if ("font-weight".equals((Object)string3)) {
                        if ("bold".equals((Object)string2)) {
                            c8.o(true);
                            return;
                        }
                    } else if ("font-style".equals((Object)string3)) {
                        if ("italic".equals((Object)string2)) {
                            c8.u(true);
                            return;
                        }
                    } else if ("font-size".equals((Object)string3)) {
                        b.e(string2, c8);
                    }
                }
            }
        }
    }

    public static char k(z z8, int n8) {
        return (char)z8.e()[n8];
    }

    public static String l(z z8) {
        int n8;
        int n9 = z8.g();
        boolean bl = false;
        for (n8 = z8.f(); n8 < n9 && !bl; ++n8) {
            bl = (char)z8.e()[n8] == ')';
        }
        return z8.D(n8 - 1 - z8.f()).trim();
    }

    public static void m(z z8) {
        while (!TextUtils.isEmpty((CharSequence)z8.r())) {
        }
    }

    public static void n(z z8) {
        block0 : do {
            boolean bl = true;
            while (z8.a() > 0 && bl) {
                if (b.c(z8) || b.b(z8)) continue block0;
                bl = false;
            }
            break;
        } while (true);
    }

    public final void a(c c8, String matcher) {
        if ("".equals((Object)matcher)) {
            return;
        }
        int n8 = matcher.indexOf(91);
        Object object = matcher;
        if (n8 != -1) {
            object = c.matcher((CharSequence)matcher.substring(n8));
            if (object.matches()) {
                c8.z((String)a.e(object.group(1)));
            }
            object = matcher.substring(0, n8);
        }
        matcher = M.b1((String)object, "\\.");
        object = matcher[0];
        n8 = object.indexOf(35);
        if (n8 != -1) {
            c8.y(object.substring(0, n8));
            c8.x(object.substring(n8 + 1));
        } else {
            c8.y((String)object);
        }
        if (matcher.length > 1) {
            c8.w((String[])M.P0((Object[])matcher, 1, matcher.length));
        }
    }

    public List d(z object) {
        this.b.setLength(0);
        int n8 = object.f();
        b.m((z)object);
        this.a.R(object.e(), object.f());
        this.a.T(n8);
        ArrayList arrayList = new ArrayList();
        while ((object = b.i(this.a, this.b)) != null) {
            if (!"{".equals((Object)b.g(this.a, this.b))) {
                return arrayList;
            }
            c c8 = new c();
            this.a(c8, (String)object);
            object = null;
            n8 = 0;
            while (n8 == 0) {
                int n9 = this.a.f();
                object = b.g(this.a, this.b);
                n8 = object != null && !"}".equals(object) ? 0 : 1;
                if (n8 != 0) continue;
                this.a.T(n9);
                b.j(this.a, c8, this.b);
            }
            if (!"}".equals(object)) continue;
            arrayList.add((Object)c8);
        }
        return arrayList;
    }
}

