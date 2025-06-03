/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.UnderlineSpan
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.util.List
 */
package j1;

import X2.v;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c1.e;
import c1.k;
import c1.s;
import c1.t;
import f0.a;
import g0.M;
import g0.g;
import g0.o;
import g0.z;
import java.nio.charset.Charset;
import java.util.List;

public final class a
implements t {
    public final z a = new z();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public a(List object) {
        int n8 = object.size();
        String string2 = "sans-serif";
        boolean bl = false;
        if (n8 == 1 && (((byte[])object.get(0)).length == 48 || ((byte[])object.get(0)).length == 53)) {
            byte[] arrby = (byte[])object.get(0);
            this.c = arrby[24];
            this.d = (arrby[26] & 255) << 24 | (arrby[27] & 255) << 16 | (arrby[28] & 255) << 8 | arrby[29] & 255;
            object = string2;
            if ("Serif".equals((Object)M.I(arrby, 43, arrby.length - 43))) {
                object = "serif";
            }
            this.e = object;
            this.g = n8 = arrby[25] * 20;
            if ((arrby[0] & 32) != 0) {
                bl = true;
            }
            this.b = bl;
            if (bl) {
                byte by = arrby[10];
                this.f = M.o((float)(arrby[11] & 255 | (by & 255) << 8) / (float)n8, 0.0f, 0.95f);
                return;
            }
            this.f = 0.85f;
            return;
        }
        this.c = 0;
        this.d = -1;
        this.e = "sans-serif";
        this.b = false;
        this.f = 0.85f;
        this.g = -1;
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, int n8, int n9, int n10, int n11, int n12) {
        if (n8 != n9) {
            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n8 >>> 8 | (n8 & 255) << 24), n10, n11, n12 | 33);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void g(SpannableStringBuilder spannableStringBuilder, int n8, int n9, int n10, int n11, int n12) {
        if (n8 != n9) {
            int n13 = n12 | 33;
            int n14 = 1;
            n9 = (n8 & 1) != 0 ? 1 : 0;
            n12 = (n8 & 2) != 0 ? 1 : 0;
            StyleSpan styleSpan = n9 != 0 ? (n12 != 0 ? new StyleSpan(3) : new StyleSpan(1)) : new StyleSpan(2);
            spannableStringBuilder.setSpan((Object)styleSpan, n10, n11, n13);
            n8 = (n8 & 4) != 0 ? n14 : 0;
            if (n8 != 0) {
                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n10, n11, n13);
            }
            if (n8 == 0) {
                if (n9 != 0) return;
                if (n12 == 0) {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(0), n10, n11, n13);
                }
            }
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, String string2, int n8, int n9) {
        if (string2 != "sans-serif") {
            spannableStringBuilder.setSpan((Object)new TypefaceSpan(string2), n8, n9, 16711713);
        }
    }

    public static String i(z z8) {
        boolean bl = z8.a() >= 2;
        g0.a.a(bl);
        int n8 = z8.M();
        if (n8 == 0) {
            return "";
        }
        int n9 = z8.f();
        Charset charset = z8.O();
        int n10 = z8.f();
        if (charset == null) {
            charset = W2.e.c;
        }
        return z8.E(n8 - (n10 - n9), charset);
    }

    @Override
    public /* synthetic */ k a(byte[] arrby, int n8, int n9) {
        return s.a(this, arrby, n8, n9);
    }

    @Override
    public /* synthetic */ void b() {
        s.b(this);
    }

    @Override
    public void c(byte[] object, int n8, int n9, t.b b8, g g8) {
        this.a.R((byte[])object, n8 + n9);
        this.a.T(n8);
        object = a.i(this.a);
        if (object.isEmpty()) {
            g8.accept(new e(v.Y(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        object = new SpannableStringBuilder((CharSequence)object);
        a.g((SpannableStringBuilder)object, this.c, 0, 0, object.length(), 16711680);
        a.f((SpannableStringBuilder)object, this.d, -1, 0, object.length(), 16711680);
        a.h((SpannableStringBuilder)object, this.e, 0, object.length());
        float f8 = this.f;
        while (this.a.a() >= 8) {
            float f9;
            n9 = this.a.f();
            int n10 = this.a.p();
            n8 = this.a.p();
            boolean bl = true;
            boolean bl2 = true;
            if (n8 == 1937013100) {
                if (this.a.a() < 2) {
                    bl2 = false;
                }
                g0.a.a(bl2);
                int n11 = this.a.M();
                n8 = 0;
                do {
                    f9 = f8;
                    if (n8 < n11) {
                        this.e(this.a, (SpannableStringBuilder)object);
                        ++n8;
                        continue;
                    }
                    break;
                } while (true);
            } else {
                f9 = f8;
                if (n8 == 1952608120) {
                    f9 = f8;
                    if (this.b) {
                        bl2 = this.a.a() >= 2 ? bl : false;
                        g0.a.a(bl2);
                        f9 = M.o((float)this.a.M() / (float)this.g, 0.0f, 0.95f);
                    }
                }
            }
            this.a.T(n9 + n10);
            f8 = f9;
        }
        g8.accept(new e(v.Z(new a.b().o((CharSequence)object).h(f8, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override
    public int d() {
        return 2;
    }

    public final void e(z z8, SpannableStringBuilder spannableStringBuilder) {
        boolean bl = z8.a() >= 12;
        g0.a.a(bl);
        int n8 = z8.M();
        int n9 = z8.M();
        z8.U(2);
        int n10 = z8.G();
        z8.U(1);
        int n11 = z8.p();
        int n12 = n9;
        if (n9 > spannableStringBuilder.length()) {
            z8 = new StringBuilder();
            z8.append("Truncating styl end (");
            z8.append(n9);
            z8.append(") to cueText.length() (");
            z8.append(spannableStringBuilder.length());
            z8.append(").");
            o.h("Tx3gParser", z8.toString());
            n12 = spannableStringBuilder.length();
        }
        if (n8 >= n12) {
            z8 = new StringBuilder();
            z8.append("Ignoring styl with start (");
            z8.append(n8);
            z8.append(") >= end (");
            z8.append(n12);
            z8.append(").");
            o.h("Tx3gParser", z8.toString());
            return;
        }
        a.g(spannableStringBuilder, n10, this.c, n8, n12, 0);
        a.f(spannableStringBuilder, n11, this.d, n8, n12, 0);
    }
}

