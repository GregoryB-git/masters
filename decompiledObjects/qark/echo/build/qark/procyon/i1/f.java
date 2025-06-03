// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i1;

import java.util.ArrayDeque;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import f0.d;
import f0.e;
import g0.M;
import g0.o;
import g0.a;
import android.text.style.TypefaceSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import java.util.Map;
import android.text.Spannable;

public abstract class f
{
    public static void a(final Spannable spannable, final int n, final int n2, final g g, final c c, final Map map, int n3) {
        if (g.l() != -1) {
            spannable.setSpan((Object)new StyleSpan(g.l()), n, n2, 33);
        }
        if (g.s()) {
            spannable.setSpan((Object)new StrikethroughSpan(), n, n2, 33);
        }
        if (g.t()) {
            spannable.setSpan((Object)new UnderlineSpan(), n, n2, 33);
        }
        if (g.q()) {
            f0.f.b(spannable, new ForegroundColorSpan(g.c()), n, n2, 33);
        }
        if (g.p()) {
            f0.f.b(spannable, new BackgroundColorSpan(g.b()), n, n2, 33);
        }
        if (g.d() != null) {
            f0.f.b(spannable, new TypefaceSpan(g.d()), n, n2, 33);
        }
        if (g.o() != null) {
            final b b = (b)a.e(g.o());
            final int a = b.a;
            int b2;
            if (a == -1) {
                if (n3 != 2 && n3 != 1) {
                    n3 = 1;
                }
                else {
                    n3 = 3;
                }
                b2 = 1;
            }
            else {
                b2 = b.b;
                n3 = a;
            }
            int c2;
            if ((c2 = b.c) == -2) {
                c2 = 1;
            }
            f0.f.b(spannable, new f0.g(n3, b2, c2), n, n2, 33);
        }
        n3 = g.j();
        Label_0494: {
            Object o;
            if (n3 != 2) {
                if (n3 != 3 && n3 != 4) {
                    break Label_0494;
                }
                o = new i1.a();
            }
            else {
                final c d = d(c, map);
                if (d == null) {
                    break Label_0494;
                }
                final c e = e(d, map);
                if (e == null) {
                    break Label_0494;
                }
                if (e.g() != 1 || e.f(0).b == null) {
                    g0.o.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    break Label_0494;
                }
                final String s = (String)M.i(e.f(0).b);
                final g f = f(e.f, e.l(), map);
                if (f != null) {
                    n3 = f.i();
                }
                else {
                    n3 = -1;
                }
                int i = n3;
                if (n3 == -1) {
                    final g f2 = f(d.f, d.l(), map);
                    i = n3;
                    if (f2 != null) {
                        i = f2.i();
                    }
                }
                o = new e(s, i);
            }
            spannable.setSpan(o, n, n2, 33);
        }
        if (g.n()) {
            f0.f.b(spannable, new d(), n, n2, 33);
        }
        n3 = g.f();
        Object o2;
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 3) {
                    return;
                }
                f0.f.a(spannable, g.e() / 100.0f, n, n2, 33);
                return;
            }
            else {
                o2 = new RelativeSizeSpan(g.e());
            }
        }
        else {
            o2 = new AbsoluteSizeSpan((int)g.e(), true);
        }
        f0.f.b(spannable, o2, n, n2, 33);
    }
    
    public static String b(final String s) {
        return s.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }
    
    public static void c(final SpannableStringBuilder spannableStringBuilder) {
        int n;
        for (n = spannableStringBuilder.length() - 1; n >= 0 && spannableStringBuilder.charAt(n) == ' '; --n) {}
        if (n >= 0 && spannableStringBuilder.charAt(n) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
    
    public static c d(c j, final Map map) {
        while (j != null) {
            final g f = f(j.f, j.l(), map);
            if (f != null && f.j() == 1) {
                return j;
            }
            j = j.j;
        }
        return null;
    }
    
    public static c e(c c, final Map map) {
        final ArrayDeque<c> arrayDeque = new ArrayDeque<c>();
        arrayDeque.push(c);
        while (!arrayDeque.isEmpty()) {
            c = (c)arrayDeque.pop();
            final g f = f(c.f, c.l(), map);
            if (f != null && f.j() == 3) {
                return c;
            }
            for (int i = c.g() - 1; i >= 0; --i) {
                arrayDeque.push(c.f(i));
            }
        }
        return null;
    }
    
    public static g f(g g, final String[] array, final Map map) {
        final int n = 0;
        int i = 0;
        if (g == null) {
            if (array == null) {
                return null;
            }
            if (array.length == 1) {
                return map.get(array[0]);
            }
            if (array.length > 1) {
                g = new g();
                while (i < array.length) {
                    g.a(map.get(array[i]));
                    ++i;
                }
                return g;
            }
        }
        else {
            if (array != null && array.length == 1) {
                return g.a(map.get(array[0]));
            }
            if (array != null && array.length > 1) {
                for (int length = array.length, j = n; j < length; ++j) {
                    g.a(map.get(array[j]));
                }
            }
        }
        return g;
    }
}
