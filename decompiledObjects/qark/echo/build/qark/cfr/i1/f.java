/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.Spannable
 *  android.text.SpannableStringBuilder
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.RelativeSizeSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.UnderlineSpan
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayDeque
 *  java.util.Map
 */
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
import f0.d;
import f0.e;
import g0.M;
import g0.o;
import i1.a;
import i1.b;
import i1.c;
import i1.g;
import java.util.ArrayDeque;
import java.util.Map;

public abstract class f {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void a(Spannable var0, int var1_1, int var2_2, g var3_3, c var4_4, Map var5_5, int var6_6) {
        block23 : {
            block22 : {
                if (var3_3.l() != -1) {
                    var0.setSpan((Object)new StyleSpan(var3_3.l()), var1_1, var2_2, 33);
                }
                if (var3_3.s()) {
                    var0.setSpan((Object)new StrikethroughSpan(), var1_1, var2_2, 33);
                }
                if (var3_3.t()) {
                    var0.setSpan((Object)new UnderlineSpan(), var1_1, var2_2, 33);
                }
                if (var3_3.q()) {
                    f0.f.b(var0, (Object)new ForegroundColorSpan(var3_3.c()), var1_1, var2_2, 33);
                }
                if (var3_3.p()) {
                    f0.f.b(var0, (Object)new BackgroundColorSpan(var3_3.b()), var1_1, var2_2, 33);
                }
                if (var3_3.d() != null) {
                    f0.f.b(var0, (Object)new TypefaceSpan(var3_3.d()), var1_1, var2_2, 33);
                }
                if (var3_3.o() != null) {
                    var10_7 = (b)g0.a.e(var3_3.o());
                    var8_8 = var10_7.a;
                    if (var8_8 == -1) {
                        var6_6 = var6_6 != 2 && var6_6 != 1 ? 1 : 3;
                        var7_9 = 1;
                    } else {
                        var7_9 = var10_7.b;
                        var6_6 = var8_8;
                    }
                    var8_8 = var9_10 = var10_7.c;
                    if (var9_10 == -2) {
                        var8_8 = 1;
                    }
                    f0.f.b(var0, new f0.g(var6_6, var7_9, var8_8), var1_1, var2_2, 33);
                }
                if ((var6_6 = var3_3.j()) == 2) break block22;
                if (var6_6 != 3 && var6_6 != 4) break block23;
                var4_4 = new a();
                ** GOTO lbl43
            }
            var10_7 = f.d((c)var4_4, (Map)var5_5);
            if (var10_7 == null || (var11_11 = f.e((c)var10_7, (Map)var5_5)) == null) break block23;
            if (var11_11.g() == 1 && var11_11.f((int)0).b != null) {
                var4_4 = (String)M.i(var11_11.f((int)0).b);
                var6_6 = (var11_11 = f.f(var11_11.f, var11_11.l(), (Map)var5_5)) != null ? var11_11.i() : -1;
                var7_9 = var6_6;
                if (var6_6 == -1) {
                    var5_5 = f.f(var10_7.f, var10_7.l(), (Map)var5_5);
                    var7_9 = var6_6;
                    if (var5_5 != null) {
                        var7_9 = var5_5.i();
                    }
                }
                var4_4 = new e((String)var4_4, var7_9);
lbl43: // 2 sources:
                var0.setSpan(var4_4, var1_1, var2_2, 33);
            } else {
                o.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
            }
        }
        if (var3_3.n()) {
            f0.f.b(var0, new d(), var1_1, var2_2, 33);
        }
        if ((var6_6 = var3_3.f()) != 1) {
            if (var6_6 != 2) {
                if (var6_6 != 3) {
                    return;
                }
                f0.f.a(var0, var3_3.e() / 100.0f, var1_1, var2_2, 33);
                return;
            }
            var3_3 = new RelativeSizeSpan(var3_3.e());
        } else {
            var3_3 = new AbsoluteSizeSpan((int)var3_3.e(), true);
        }
        f0.f.b(var0, var3_3, var1_1, var2_2, 33);
    }

    public static String b(String string2) {
        return string2.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int n8;
        for (n8 = spannableStringBuilder.length() - 1; n8 >= 0 && spannableStringBuilder.charAt(n8) == ' '; --n8) {
        }
        if (n8 >= 0 && spannableStringBuilder.charAt(n8) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static c d(c c8, Map map) {
        while (c8 != null) {
            g g8 = f.f(c8.f, c8.l(), map);
            if (g8 != null && g8.j() == 1) {
                return c8;
            }
            c8 = c8.j;
        }
        return null;
    }

    public static c e(c c8, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push((Object)c8);
        while (!arrayDeque.isEmpty()) {
            c8 = (c)arrayDeque.pop();
            g g8 = f.f(c8.f, c8.l(), map);
            if (g8 != null && g8.j() == 3) {
                return c8;
            }
            for (int i8 = c8.g() - 1; i8 >= 0; --i8) {
                arrayDeque.push((Object)c8.f(i8));
            }
        }
        return null;
    }

    public static g f(g g8, String[] arrstring, Map map) {
        int n8;
        int n9 = 0;
        if (g8 == null) {
            if (arrstring == null) {
                return null;
            }
            if (arrstring.length == 1) {
                return (g)map.get((Object)arrstring[0]);
            }
            if (arrstring.length > 1) {
                g8 = new g();
                n9 = arrstring.length;
                for (n8 = 0; n8 < n9; ++n8) {
                    g8.a((g)map.get((Object)arrstring[n8]));
                }
                return g8;
            }
        } else {
            if (arrstring != null && arrstring.length == 1) {
                return g8.a((g)map.get((Object)arrstring[0]));
            }
            if (arrstring != null && arrstring.length > 1) {
                int n10 = arrstring.length;
                for (n8 = n9; n8 < n10; ++n8) {
                    g8.a((g)map.get((Object)arrstring[n8]));
                }
            }
        }
        return g8;
    }
}

