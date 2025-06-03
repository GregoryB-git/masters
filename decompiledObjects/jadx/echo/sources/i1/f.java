package i1;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import f0.AbstractC1285f;
import f0.C1283d;
import f0.C1284e;
import f0.C1286g;
import g0.AbstractC1297a;
import g0.M;
import g0.o;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f {
    public static void a(Spannable spannable, int i7, int i8, g gVar, C1344c c1344c, Map map, int i9) {
        C1344c e7;
        Object c1284e;
        g f7;
        Object absoluteSizeSpan;
        int i10;
        if (gVar.l() != -1) {
            spannable.setSpan(new StyleSpan(gVar.l()), i7, i8, 33);
        }
        if (gVar.s()) {
            spannable.setSpan(new StrikethroughSpan(), i7, i8, 33);
        }
        if (gVar.t()) {
            spannable.setSpan(new UnderlineSpan(), i7, i8, 33);
        }
        if (gVar.q()) {
            AbstractC1285f.b(spannable, new ForegroundColorSpan(gVar.c()), i7, i8, 33);
        }
        if (gVar.p()) {
            AbstractC1285f.b(spannable, new BackgroundColorSpan(gVar.b()), i7, i8, 33);
        }
        if (gVar.d() != null) {
            AbstractC1285f.b(spannable, new TypefaceSpan(gVar.d()), i7, i8, 33);
        }
        if (gVar.o() != null) {
            C1343b c1343b = (C1343b) AbstractC1297a.e(gVar.o());
            int i11 = c1343b.f14752a;
            if (i11 == -1) {
                i11 = (i9 == 2 || i9 == 1) ? 3 : 1;
                i10 = 1;
            } else {
                i10 = c1343b.f14753b;
            }
            int i12 = c1343b.f14754c;
            if (i12 == -2) {
                i12 = 1;
            }
            AbstractC1285f.b(spannable, new C1286g(i11, i10, i12), i7, i8, 33);
        }
        int j7 = gVar.j();
        if (j7 == 2) {
            C1344c d7 = d(c1344c, map);
            if (d7 != null && (e7 = e(d7, map)) != null) {
                if (e7.g() != 1 || e7.f(0).f14756b == null) {
                    o.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) M.i(e7.f(0).f14756b);
                    g f8 = f(e7.f14760f, e7.l(), map);
                    int i13 = f8 != null ? f8.i() : -1;
                    if (i13 == -1 && (f7 = f(d7.f14760f, d7.l(), map)) != null) {
                        i13 = f7.i();
                    }
                    c1284e = new C1284e(str, i13);
                    spannable.setSpan(c1284e, i7, i8, 33);
                }
            }
        } else if (j7 == 3 || j7 == 4) {
            c1284e = new C1342a();
            spannable.setSpan(c1284e, i7, i8, 33);
        }
        if (gVar.n()) {
            AbstractC1285f.b(spannable, new C1283d(), i7, i8, 33);
        }
        int f9 = gVar.f();
        if (f9 == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) gVar.e(), true);
        } else {
            if (f9 != 2) {
                if (f9 != 3) {
                    return;
                }
                AbstractC1285f.a(spannable, gVar.e() / 100.0f, i7, i8, 33);
                return;
            }
            absoluteSizeSpan = new RelativeSizeSpan(gVar.e());
        }
        AbstractC1285f.b(spannable, absoluteSizeSpan, i7, i8, 33);
    }

    public static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    public static C1344c d(C1344c c1344c, Map map) {
        while (c1344c != null) {
            g f7 = f(c1344c.f14760f, c1344c.l(), map);
            if (f7 != null && f7.j() == 1) {
                return c1344c;
            }
            c1344c = c1344c.f14764j;
        }
        return null;
    }

    public static C1344c e(C1344c c1344c, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c1344c);
        while (!arrayDeque.isEmpty()) {
            C1344c c1344c2 = (C1344c) arrayDeque.pop();
            g f7 = f(c1344c2.f14760f, c1344c2.l(), map);
            if (f7 != null && f7.j() == 3) {
                return c1344c2;
            }
            for (int g7 = c1344c2.g() - 1; g7 >= 0; g7--) {
                arrayDeque.push(c1344c2.f(g7));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map map) {
        int i7 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i7 < length) {
                    gVar2.a((g) map.get(strArr[i7]));
                    i7++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a((g) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i7 < length2) {
                    gVar.a((g) map.get(strArr[i7]));
                    i7++;
                }
            }
        }
        return gVar;
    }
}
