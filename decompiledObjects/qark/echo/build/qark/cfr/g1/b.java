/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.UnderlineSpan
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package g1;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
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
import g1.a;
import g1.c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
implements t {
    public static final Pattern g = Pattern.compile((String)"(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final a b;
    public final z c = new z();
    public Map d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;

    public b(List list) {
        if (list != null && !list.isEmpty()) {
            this.a = true;
            String string2 = M.H((byte[])list.get(0));
            g0.a.a(string2.startsWith("Format:"));
            this.b = (a)g0.a.e(a.a(string2));
            this.k(new z((byte[])list.get(1)), W2.e.c);
            return;
        }
        this.a = false;
        this.b = null;
    }

    public static int e(long l8, List list, List list2) {
        int n8;
        block2 : {
            for (n8 = list.size() - 1; n8 >= 0; --n8) {
                if ((Long)list.get(n8) == l8) {
                    return n8;
                }
                if ((Long)list.get(n8) >= l8) continue;
                ++n8;
                break block2;
            }
            n8 = 0;
        }
        list.add(n8, (Object)l8);
        list = n8 == 0 ? new ArrayList() : new ArrayList((Collection)list2.get(n8 - 1));
        list2.add(n8, (Object)list);
        return n8;
    }

    public static float f(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    return -3.4028235E38f;
                }
                return 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static f0.a g(String string2, c c8, c.b b8, float f8, float f9) {
        int n8;
        a.b b9;
        block11 : {
            SpannableString spannableString;
            block15 : {
                block13 : {
                    block14 : {
                        boolean bl;
                        block12 : {
                            float f10;
                            spannableString = new SpannableString((CharSequence)string2);
                            b9 = new a.b().o((CharSequence)spannableString);
                            if (c8 == null) break block11;
                            if (c8.c != null) {
                                spannableString.setSpan((Object)new ForegroundColorSpan(c8.c.intValue()), 0, spannableString.length(), 33);
                            }
                            if (c8.j == 3 && c8.d != null) {
                                spannableString.setSpan((Object)new BackgroundColorSpan(c8.d.intValue()), 0, spannableString.length(), 33);
                            }
                            if ((f10 = c8.e) != -3.4028235E38f && f9 != -3.4028235E38f) {
                                b9.q(f10 / f9, 1);
                            }
                            if (!(bl = c8.f) || !c8.g) break block12;
                            string2 = new StyleSpan(3);
                            break block13;
                        }
                        if (!bl) break block14;
                        string2 = new StyleSpan(1);
                        break block13;
                    }
                    if (!c8.g) break block15;
                    string2 = new StyleSpan(2);
                }
                spannableString.setSpan((Object)string2, 0, spannableString.length(), 33);
            }
            if (c8.h) {
                spannableString.setSpan((Object)new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (c8.i) {
                spannableString.setSpan((Object)new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        if ((n8 = b8.a) == -1) {
            n8 = c8 != null ? c8.b : -1;
        }
        b9.p(b.q(n8)).l(b.p(n8)).i(b.o(n8));
        string2 = b8.b;
        if (string2 != null && f9 != -3.4028235E38f && f8 != -3.4028235E38f) {
            b9.k(string2.x / f8);
            f8 = b8.b.y / f9;
        } else {
            b9.k(b.f(b9.d()));
            f8 = b.f(b9.c());
        }
        b9.h(f8, 0);
        return b9.a();
    }

    public static Map m(z z8, Charset charset) {
        Object object;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a a8 = null;
        while ((object = z8.s(charset)) != null && (z8.a() == 0 || z8.h(charset) != '[')) {
            if (object.startsWith("Format:")) {
                a8 = c.a.a((String)object);
                continue;
            }
            if (!object.startsWith("Style:")) continue;
            if (a8 == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Skipping 'Style:' line before 'Format:' line: ");
                stringBuilder.append((String)object);
                o.h("SsaParser", stringBuilder.toString());
                continue;
            }
            if ((object = c.b((String)object, a8)) == null) continue;
            linkedHashMap.put((Object)object.a, object);
        }
        return linkedHashMap;
    }

    public static long n(String string2) {
        if (!(string2 = g.matcher((CharSequence)string2.trim())).matches()) {
            return -9223372036854775807L;
        }
        return Long.parseLong((String)((String)M.i(string2.group(1)))) * 3600000000L + Long.parseLong((String)((String)M.i(string2.group(2)))) * 60000000L + Long.parseLong((String)((String)M.i(string2.group(3)))) * 1000000L + Long.parseLong((String)((String)M.i(string2.group(4)))) * 10000L;
    }

    public static int o(int n8) {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown alignment: ");
                stringBuilder.append(n8);
                o.h("SsaParser", stringBuilder.toString());
                return Integer.MIN_VALUE;
            }
            case 7: 
            case 8: 
            case 9: {
                return 0;
            }
            case 4: 
            case 5: 
            case 6: {
                return 1;
            }
            case 1: 
            case 2: 
            case 3: {
                return 2;
            }
            case -1: 
        }
        return Integer.MIN_VALUE;
    }

    public static int p(int n8) {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown alignment: ");
                stringBuilder.append(n8);
                o.h("SsaParser", stringBuilder.toString());
                return Integer.MIN_VALUE;
            }
            case 3: 
            case 6: 
            case 9: {
                return 2;
            }
            case 2: 
            case 5: 
            case 8: {
                return 1;
            }
            case 1: 
            case 4: 
            case 7: {
                return 0;
            }
            case -1: 
        }
        return Integer.MIN_VALUE;
    }

    public static Layout.Alignment q(int n8) {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown alignment: ");
                stringBuilder.append(n8);
                o.h("SsaParser", stringBuilder.toString());
                return null;
            }
            case 3: 
            case 6: 
            case 9: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            case 2: 
            case 5: 
            case 8: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 1: 
            case 4: 
            case 7: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            case -1: 
        }
        return null;
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
    public void c(byte[] charset, int n8, int n9, t.b b8, g g8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.c.R((byte[])charset, n8 + n9);
        this.c.T(n8);
        charset = this.h(this.c);
        if (!this.a) {
            this.k(this.c, charset);
        }
        this.j(this.c, (List)arrayList, (List)arrayList2, charset);
        charset = b8.a != -9223372036854775807L && b8.b ? new ArrayList() : null;
        for (n8 = 0; n8 < arrayList.size(); ++n8) {
            List list = (List)arrayList.get(n8);
            if (list.isEmpty() && n8 != 0) continue;
            if (n8 != arrayList.size() - 1) {
                long l8 = (Long)arrayList2.get(n8);
                long l9 = (Long)arrayList2.get(n8 + 1) - (Long)arrayList2.get(n8);
                long l10 = b8.a;
                if (l10 != -9223372036854775807L && l8 < l10) {
                    if (charset == null) continue;
                    charset.add((Object)new e(list, l8, l9));
                    continue;
                }
                g8.accept(new e(list, l8, l9));
                continue;
            }
            throw new IllegalStateException();
        }
        if (charset != null) {
            charset = charset.iterator();
            while (charset.hasNext()) {
                g8.accept((e)charset.next());
            }
        }
    }

    @Override
    public int d() {
        return 1;
    }

    public final Charset h(z z8) {
        if ((z8 = z8.O()) != null) {
            return z8;
        }
        return W2.e.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i(String object, a object2, List list, List list2) {
        Object object3;
        long l8;
        int n8;
        long l9;
        block9 : {
            block6 : {
                block8 : {
                    block7 : {
                        block5 : {
                            g0.a.a(object.startsWith("Dialogue:"));
                            object3 = object.substring(9).split(",", object2.e);
                            if (object3.length == object2.e) break block5;
                            object2 = new StringBuilder();
                            object2.append("Skipping dialogue line with fewer columns than format: ");
                            break block6;
                        }
                        l8 = b.n(object3[object2.a]);
                        if (l8 != -9223372036854775807L) break block7;
                        object2 = new StringBuilder();
                        break block8;
                    }
                    l9 = b.n(object3[object2.b]);
                    if (l9 != -9223372036854775807L) break block9;
                    object2 = new StringBuilder();
                }
                object2.append("Skipping invalid timing: ");
            }
            object2.append((String)object);
            o.h("SsaParser", object2.toString());
            return;
        }
        object = this.d;
        object = object != null && (n8 = object2.c) != -1 ? (c)object.get((Object)object3[n8].trim()) : null;
        object2 = object3[object2.d];
        object3 = c.b.b((String)object2);
        object = b.g(c.b.d((String)object2).replace((CharSequence)"\\N", (CharSequence)"\n").replace((CharSequence)"\\n", (CharSequence)"\n").replace((CharSequence)"\\h", (CharSequence)"\u00a0"), (c)object, (c.b)object3, this.e, this.f);
        n8 = b.e(l8, list2, list);
        int n9 = b.e(l9, list2, list);
        while (n8 < n9) {
            ((List)list.get(n8)).add(object);
            ++n8;
        }
        return;
    }

    public final void j(z z8, List list, List list2, Charset charset) {
        String string2;
        a a8 = this.a ? this.b : null;
        while ((string2 = z8.s(charset)) != null) {
            if (string2.startsWith("Format:")) {
                a8 = a.a(string2);
                continue;
            }
            if (!string2.startsWith("Dialogue:")) continue;
            if (a8 == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Skipping dialogue line before complete format: ");
                stringBuilder.append(string2);
                o.h("SsaParser", stringBuilder.toString());
                continue;
            }
            this.i(string2, a8, list, list2);
        }
    }

    public final void k(z z8, Charset charset) {
        String string2;
        while ((string2 = z8.s(charset)) != null) {
            if ("[Script Info]".equalsIgnoreCase(string2)) {
                this.l(z8, charset);
                continue;
            }
            if ("[V4+ Styles]".equalsIgnoreCase(string2)) {
                this.d = b.m(z8, charset);
                continue;
            }
            if ("[V4 Styles]".equalsIgnoreCase(string2)) {
                o.f("SsaParser", "[V4 Styles] are not supported");
                continue;
            }
            if (!"[Events]".equalsIgnoreCase(string2)) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void l(z var1_1, Charset var2_2) {
        while ((var3_3 = var1_1.s(var2_2)) != null) {
            if (var1_1.a() != 0) {
                if (var1_1.h(var2_2) == '[') return;
            }
            if ((var3_3 = var3_3.split(":")).length != 2) continue;
            var4_5 = W2.c.e(var3_3[0].trim());
            var4_5.hashCode();
            if (var4_5.equals((Object)"playresx")) ** GOTO lbl12
            if (!var4_5.equals((Object)"playresy")) continue;
            try {
                this.f = Float.parseFloat((String)var3_3[1].trim());
                continue;
lbl12: // 1 sources:
                this.e = Float.parseFloat((String)var3_3[1].trim());
            }
            catch (NumberFormatException var3_4) {}
        }
    }
}

