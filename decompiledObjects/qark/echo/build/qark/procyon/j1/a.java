// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j1;

import g0.o;
import X2.v;
import g0.g;
import c1.s;
import c1.k;
import java.nio.charset.Charset;
import W2.e;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.text.style.StyleSpan;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableStringBuilder;
import g0.M;
import java.util.List;
import g0.z;
import c1.t;

public final class a implements t
{
    public final z a;
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;
    
    public a(final List list) {
        this.a = new z();
        final int size = list.size();
        final String s = "sans-serif";
        boolean b = false;
        if (size != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        final byte[] array = list.get(0);
        this.c = array[24];
        this.d = ((array[26] & 0xFF) << 24 | (array[27] & 0xFF) << 16 | (array[28] & 0xFF) << 8 | (array[29] & 0xFF));
        String e = s;
        if ("Serif".equals(M.I(array, 43, array.length - 43))) {
            e = "serif";
        }
        this.e = e;
        final int g = array[25] * 20;
        this.g = g;
        if ((array[0] & 0x20) != 0x0) {
            b = true;
        }
        this.b = b;
        if (b) {
            this.f = M.o(((array[11] & 0xFF) | (array[10] & 0xFF) << 8) / (float)g, 0.0f, 0.95f);
            return;
        }
        this.f = 0.85f;
    }
    
    public static void f(final SpannableStringBuilder spannableStringBuilder, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n != n2) {
            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n >>> 8 | (n & 0xFF) << 24), n3, n4, n5 | 0x21);
        }
    }
    
    public static void g(final SpannableStringBuilder spannableStringBuilder, int n, int n2, final int n3, final int n4, int n5) {
        if (n != n2) {
            final int n6 = n5 | 0x21;
            final int n7 = 1;
            if ((n & 0x1) != 0x0) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if ((n & 0x2) != 0x0) {
                n5 = 1;
            }
            else {
                n5 = 0;
            }
            Label_0107: {
                StyleSpan styleSpan;
                if (n2 != 0) {
                    if (n5 != 0) {
                        styleSpan = new StyleSpan(3);
                    }
                    else {
                        styleSpan = new StyleSpan(1);
                    }
                }
                else {
                    if (n5 == 0) {
                        break Label_0107;
                    }
                    styleSpan = new StyleSpan(2);
                }
                spannableStringBuilder.setSpan((Object)styleSpan, n3, n4, n6);
            }
            if ((n & 0x4) != 0x0) {
                n = n7;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n3, n4, n6);
            }
            if (n == 0 && n2 == 0 && n5 == 0) {
                spannableStringBuilder.setSpan((Object)new StyleSpan(0), n3, n4, n6);
            }
        }
    }
    
    public static void h(final SpannableStringBuilder spannableStringBuilder, final String s, final int n, final int n2) {
        if (s != "sans-serif") {
            spannableStringBuilder.setSpan((Object)new TypefaceSpan(s), n, n2, 16711713);
        }
    }
    
    public static String i(final z z) {
        g0.a.a(z.a() >= 2);
        final int m = z.M();
        if (m == 0) {
            return "";
        }
        final int f = z.f();
        Charset charset = z.O();
        final int f2 = z.f();
        if (charset == null) {
            charset = e.c;
        }
        return z.E(m - (f2 - f), charset);
    }
    
    @Override
    public void c(final byte[] array, int p5, int f, final b b, final g g) {
        this.a.R(array, p5 + f);
        this.a.T(p5);
        final String i = i(this.a);
        if (i.isEmpty()) {
            g.accept(new c1.e(v.Y(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)i);
        g(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        f(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        h(spannableStringBuilder, this.e, 0, spannableStringBuilder.length());
        float f2 = this.f;
        while (this.a.a() >= 8) {
            f = this.a.f();
            final int p6 = this.a.p();
            p5 = this.a.p();
            final boolean b2 = true;
            boolean b3 = true;
            float o;
            if (p5 == 1937013100) {
                if (this.a.a() < 2) {
                    b3 = false;
                }
                g0.a.a(b3);
                final int m = this.a.M();
                p5 = 0;
                while (true) {
                    o = f2;
                    if (p5 >= m) {
                        break;
                    }
                    this.e(this.a, spannableStringBuilder);
                    ++p5;
                }
            }
            else {
                o = f2;
                if (p5 == 1952608120) {
                    o = f2;
                    if (this.b) {
                        g0.a.a(this.a.a() >= 2 && b2);
                        o = M.o(this.a.M() / (float)this.g, 0.0f, 0.95f);
                    }
                }
            }
            this.a.T(f + p6);
            f2 = o;
        }
        g.accept(new c1.e(v.Z(new f0.a.b().o((CharSequence)spannableStringBuilder).h(f2, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }
    
    @Override
    public int d() {
        return 2;
    }
    
    public final void e(final z z, final SpannableStringBuilder spannableStringBuilder) {
        g0.a.a(z.a() >= 12);
        final int m = z.M();
        final int i = z.M();
        z.U(2);
        final int g = z.G();
        z.U(1);
        final int p2 = z.p();
        int length = i;
        if (i > spannableStringBuilder.length()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Truncating styl end (");
            sb.append(i);
            sb.append(") to cueText.length() (");
            sb.append(spannableStringBuilder.length());
            sb.append(").");
            o.h("Tx3gParser", sb.toString());
            length = spannableStringBuilder.length();
        }
        if (m >= length) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignoring styl with start (");
            sb2.append(m);
            sb2.append(") >= end (");
            sb2.append(length);
            sb2.append(").");
            o.h("Tx3gParser", sb2.toString());
            return;
        }
        g(spannableStringBuilder, g, this.c, m, length, 0);
        f(spannableStringBuilder, p2, this.d, m, length, 0);
    }
}
