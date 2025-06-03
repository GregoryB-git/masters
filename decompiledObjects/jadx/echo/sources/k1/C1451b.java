package k1;

import android.text.TextUtils;
import g0.AbstractC1297a;
import g0.AbstractC1301e;
import g0.M;
import g0.o;
import g0.z;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1451b {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f16080c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f16081d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final z f16082a = new z();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f16083b = new StringBuilder();

    public static boolean b(z zVar) {
        int f7 = zVar.f();
        int g7 = zVar.g();
        byte[] e7 = zVar.e();
        if (f7 + 2 > g7) {
            return false;
        }
        int i7 = f7 + 1;
        if (e7[f7] != 47) {
            return false;
        }
        int i8 = f7 + 2;
        if (e7[i7] != 42) {
            return false;
        }
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= g7) {
                zVar.U(g7 - zVar.f());
                return true;
            }
            if (((char) e7[i8]) == '*' && ((char) e7[i9]) == '/') {
                i8 += 2;
                g7 = i8;
            } else {
                i8 = i9;
            }
        }
    }

    public static boolean c(z zVar) {
        char k7 = k(zVar, zVar.f());
        if (k7 != '\t' && k7 != '\n' && k7 != '\f' && k7 != '\r' && k7 != ' ') {
            return false;
        }
        zVar.U(1);
        return true;
    }

    public static void e(String str, C1452c c1452c) {
        int i7;
        Matcher matcher = f16081d.matcher(W2.c.e(str));
        if (!matcher.matches()) {
            o.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        i7 = 2;
        String str2 = (String) AbstractC1297a.e(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                i7 = 3;
            case "em":
                c1452c.t(i7);
                c1452c.s(Float.parseFloat((String) AbstractC1297a.e(matcher.group(1))));
                return;
            case "px":
                c1452c.t(1);
                c1452c.s(Float.parseFloat((String) AbstractC1297a.e(matcher.group(1))));
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public static String f(z zVar, StringBuilder sb) {
        boolean z7 = false;
        sb.setLength(0);
        int f7 = zVar.f();
        int g7 = zVar.g();
        while (f7 < g7 && !z7) {
            char c7 = (char) zVar.e()[f7];
            if ((c7 < 'A' || c7 > 'Z') && ((c7 < 'a' || c7 > 'z') && !((c7 >= '0' && c7 <= '9') || c7 == '#' || c7 == '-' || c7 == '.' || c7 == '_'))) {
                z7 = true;
            } else {
                f7++;
                sb.append(c7);
            }
        }
        zVar.U(f7 - zVar.f());
        return sb.toString();
    }

    public static String g(z zVar, StringBuilder sb) {
        n(zVar);
        if (zVar.a() == 0) {
            return null;
        }
        String f7 = f(zVar, sb);
        if (!"".equals(f7)) {
            return f7;
        }
        return "" + ((char) zVar.G());
    }

    public static String h(z zVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z7 = false;
        while (!z7) {
            int f7 = zVar.f();
            String g7 = g(zVar, sb);
            if (g7 == null) {
                return null;
            }
            if ("}".equals(g7) || ";".equals(g7)) {
                zVar.T(f7);
                z7 = true;
            } else {
                sb2.append(g7);
            }
        }
        return sb2.toString();
    }

    public static String i(z zVar, StringBuilder sb) {
        n(zVar);
        if (zVar.a() < 5 || !"::cue".equals(zVar.D(5))) {
            return null;
        }
        int f7 = zVar.f();
        String g7 = g(zVar, sb);
        if (g7 == null) {
            return null;
        }
        if ("{".equals(g7)) {
            zVar.T(f7);
            return "";
        }
        String l7 = "(".equals(g7) ? l(zVar) : null;
        if (")".equals(g(zVar, sb))) {
            return l7;
        }
        return null;
    }

    public static void j(z zVar, C1452c c1452c, StringBuilder sb) {
        n(zVar);
        String f7 = f(zVar, sb);
        if (!"".equals(f7) && ":".equals(g(zVar, sb))) {
            n(zVar);
            String h7 = h(zVar, sb);
            if (h7 == null || "".equals(h7)) {
                return;
            }
            int f8 = zVar.f();
            String g7 = g(zVar, sb);
            if (!";".equals(g7)) {
                if (!"}".equals(g7)) {
                    return;
                } else {
                    zVar.T(f8);
                }
            }
            if ("color".equals(f7)) {
                c1452c.q(AbstractC1301e.b(h7));
                return;
            }
            if ("background-color".equals(f7)) {
                c1452c.n(AbstractC1301e.b(h7));
                return;
            }
            boolean z7 = true;
            if ("ruby-position".equals(f7)) {
                if ("over".equals(h7)) {
                    c1452c.v(1);
                    return;
                } else {
                    if ("under".equals(h7)) {
                        c1452c.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(f7)) {
                if (!"all".equals(h7) && !h7.startsWith("digits")) {
                    z7 = false;
                }
                c1452c.p(z7);
                return;
            }
            if ("text-decoration".equals(f7)) {
                if ("underline".equals(h7)) {
                    c1452c.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(f7)) {
                c1452c.r(h7);
                return;
            }
            if ("font-weight".equals(f7)) {
                if ("bold".equals(h7)) {
                    c1452c.o(true);
                }
            } else if ("font-style".equals(f7)) {
                if ("italic".equals(h7)) {
                    c1452c.u(true);
                }
            } else if ("font-size".equals(f7)) {
                e(h7, c1452c);
            }
        }
    }

    public static char k(z zVar, int i7) {
        return (char) zVar.e()[i7];
    }

    public static String l(z zVar) {
        int f7 = zVar.f();
        int g7 = zVar.g();
        boolean z7 = false;
        while (f7 < g7 && !z7) {
            int i7 = f7 + 1;
            z7 = ((char) zVar.e()[f7]) == ')';
            f7 = i7;
        }
        return zVar.D((f7 - 1) - zVar.f()).trim();
    }

    public static void m(z zVar) {
        while (!TextUtils.isEmpty(zVar.r())) {
        }
    }

    public static void n(z zVar) {
        while (true) {
            for (boolean z7 = true; zVar.a() > 0 && z7; z7 = false) {
                if (!c(zVar) && !b(zVar)) {
                }
            }
            return;
        }
    }

    public final void a(C1452c c1452c, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f16080c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c1452c.z((String) AbstractC1297a.e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] b12 = M.b1(str, "\\.");
        String str2 = b12[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c1452c.y(str2.substring(0, indexOf2));
            c1452c.x(str2.substring(indexOf2 + 1));
        } else {
            c1452c.y(str2);
        }
        if (b12.length > 1) {
            c1452c.w((String[]) M.P0(b12, 1, b12.length));
        }
    }

    public List d(z zVar) {
        this.f16083b.setLength(0);
        int f7 = zVar.f();
        m(zVar);
        this.f16082a.R(zVar.e(), zVar.f());
        this.f16082a.T(f7);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i7 = i(this.f16082a, this.f16083b);
            if (i7 == null) {
                return arrayList;
            }
            if (!"{".equals(g(this.f16082a, this.f16083b))) {
                return arrayList;
            }
            C1452c c1452c = new C1452c();
            a(c1452c, i7);
            String str = null;
            boolean z7 = false;
            while (!z7) {
                int f8 = this.f16082a.f();
                String g7 = g(this.f16082a, this.f16083b);
                boolean z8 = g7 == null || "}".equals(g7);
                if (!z8) {
                    this.f16082a.T(f8);
                    j(this.f16082a, c1452c, this.f16083b);
                }
                str = g7;
                z7 = z8;
            }
            if ("}".equals(str)) {
                arrayList.add(c1452c);
            }
        }
    }
}
