// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g1;

import java.util.Iterator;
import g0.g;
import c1.s;
import c1.k;
import android.text.Layout$Alignment;
import java.util.regex.Matcher;
import g0.o;
import java.util.LinkedHashMap;
import java.nio.charset.Charset;
import android.graphics.PointF;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.text.style.StyleSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import java.util.Collection;
import java.util.ArrayList;
import W2.e;
import g0.M;
import java.util.List;
import java.util.Map;
import g0.z;
import java.util.regex.Pattern;
import c1.t;

public final class b implements t
{
    public static final Pattern g;
    public final boolean a;
    public final g1.a b;
    public final z c;
    public Map d;
    public float e;
    public float f;
    
    static {
        g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    }
    
    public b(final List list) {
        this.e = -3.4028235E38f;
        this.f = -3.4028235E38f;
        this.c = new z();
        if (list != null && !list.isEmpty()) {
            this.a = true;
            final String h = M.H(list.get(0));
            g0.a.a(h.startsWith("Format:"));
            this.b = (g1.a)g0.a.e(g1.a.a(h));
            this.k(new z(list.get(1)), W2.e.c);
            return;
        }
        this.a = false;
        this.b = null;
    }
    
    public static int e(final long l, final List list, final List list2) {
        while (true) {
            for (int i = list.size() - 1; i >= 0; --i) {
                if (list.get(i) == l) {
                    return i;
                }
                if (list.get(i) < l) {
                    final int n = i + 1;
                    list.add(n, l);
                    ArrayList<Object> list3;
                    if (n == 0) {
                        list3 = new ArrayList<Object>();
                    }
                    else {
                        list3 = new ArrayList<Object>(list2.get(n - 1));
                    }
                    list2.add(n, list3);
                    return n;
                }
            }
            final int n = 0;
            continue;
        }
    }
    
    public static float f(final int n) {
        if (n == 0) {
            return 0.05f;
        }
        if (n == 1) {
            return 0.5f;
        }
        if (n != 2) {
            return -3.4028235E38f;
        }
        return 0.95f;
    }
    
    public static f0.a g(final String s, final c c, final c.b b, float f, final float n) {
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        final f0.a.b o = new f0.a.b().o((CharSequence)spannableString);
        if (c != null) {
            if (c.c != null) {
                spannableString.setSpan((Object)new ForegroundColorSpan((int)c.c), 0, spannableString.length(), 33);
            }
            if (c.j == 3 && c.d != null) {
                spannableString.setSpan((Object)new BackgroundColorSpan((int)c.d), 0, spannableString.length(), 33);
            }
            final float e = c.e;
            if (e != -3.4028235E38f && n != -3.4028235E38f) {
                o.q(e / n, 1);
            }
            final boolean f2 = c.f;
            Label_0218: {
                StyleSpan styleSpan;
                if (f2 && c.g) {
                    styleSpan = new StyleSpan(3);
                }
                else if (f2) {
                    styleSpan = new StyleSpan(1);
                }
                else {
                    if (!c.g) {
                        break Label_0218;
                    }
                    styleSpan = new StyleSpan(2);
                }
                spannableString.setSpan((Object)styleSpan, 0, spannableString.length(), 33);
            }
            if (c.h) {
                spannableString.setSpan((Object)new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (c.i) {
                spannableString.setSpan((Object)new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int n2 = b.a;
        if (n2 == -1) {
            if (c != null) {
                n2 = c.b;
            }
            else {
                n2 = -1;
            }
        }
        o.p(q(n2)).l(p(n2)).i(o(n2));
        final PointF b2 = b.b;
        if (b2 != null && n != -3.4028235E38f && f != -3.4028235E38f) {
            o.k(b2.x / f);
            f = b.b.y / n;
        }
        else {
            o.k(f(o.d()));
            f = f(o.c());
        }
        o.h(f, 0);
        return o.a();
    }
    
    public static Map m(final z z, final Charset charset) {
        final LinkedHashMap<String, c> linkedHashMap = new LinkedHashMap<String, c>();
        c.a a = null;
        while (true) {
            final String s = z.s(charset);
            if (s == null || (z.a() != 0 && z.h(charset) == '[')) {
                break;
            }
            if (s.startsWith("Format:")) {
                a = c.a.a(s);
            }
            else {
                if (!s.startsWith("Style:")) {
                    continue;
                }
                if (a == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Skipping 'Style:' line before 'Format:' line: ");
                    sb.append(s);
                    o.h("SsaParser", sb.toString());
                }
                else {
                    final c b = c.b(s, a);
                    if (b == null) {
                        continue;
                    }
                    linkedHashMap.put(b.a, b);
                }
            }
        }
        return linkedHashMap;
    }
    
    public static long n(final String s) {
        final Matcher matcher = b.g.matcher(s.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return Long.parseLong((String)M.i(matcher.group(1))) * 3600000000L + Long.parseLong((String)M.i(matcher.group(2))) * 60000000L + Long.parseLong((String)M.i(matcher.group(3))) * 1000000L + Long.parseLong((String)M.i(matcher.group(4))) * 10000L;
    }
    
    public static int o(final int i) {
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown alignment: ");
                sb.append(i);
                o.h("SsaParser", sb.toString());
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
            case -1: {
                return Integer.MIN_VALUE;
            }
        }
    }
    
    public static int p(final int i) {
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown alignment: ");
                sb.append(i);
                o.h("SsaParser", sb.toString());
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
            case -1: {
                return Integer.MIN_VALUE;
            }
        }
    }
    
    public static Layout$Alignment q(final int i) {
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown alignment: ");
                sb.append(i);
                o.h("SsaParser", sb.toString());
                return null;
            }
            case 3:
            case 6:
            case 9: {
                return Layout$Alignment.ALIGN_OPPOSITE;
            }
            case 2:
            case 5:
            case 8: {
                return Layout$Alignment.ALIGN_CENTER;
            }
            case 1:
            case 4:
            case 7: {
                return Layout$Alignment.ALIGN_NORMAL;
            }
            case -1: {
                return null;
            }
        }
    }
    
    @Override
    public void c(final byte[] array, int i, final int n, final t.b b, final g g) {
        final ArrayList<List> list = (ArrayList<List>)new ArrayList<Object>();
        final ArrayList<Long> list2 = new ArrayList<Long>();
        this.c.R(array, i + n);
        this.c.T(i);
        final Charset h = this.h(this.c);
        if (!this.a) {
            this.k(this.c, h);
        }
        this.j(this.c, list, list2, h);
        List<c1.e> list3;
        if (b.a != -9223372036854775807L && b.b) {
            list3 = new ArrayList<c1.e>();
        }
        else {
            list3 = null;
        }
        List list4;
        long longValue;
        long n2;
        long a;
        for (i = 0; i < list.size(); ++i) {
            list4 = list.get(i);
            if (!list4.isEmpty() || i == 0) {
                if (i == list.size() - 1) {
                    throw new IllegalStateException();
                }
                longValue = list2.get(i);
                n2 = list2.get(i + 1) - list2.get(i);
                a = b.a;
                if (a != -9223372036854775807L && longValue < a) {
                    if (list3 != null) {
                        list3.add(new c1.e(list4, longValue, n2));
                    }
                }
                else {
                    g.accept(new c1.e(list4, longValue, n2));
                }
            }
        }
        if (list3 != null) {
            final Iterator<c1.e> iterator = list3.iterator();
            while (iterator.hasNext()) {
                g.accept(iterator.next());
            }
        }
    }
    
    @Override
    public int d() {
        return 1;
    }
    
    public final Charset h(final z z) {
        final Charset o = z.O();
        if (o != null) {
            return o;
        }
        return W2.e.c;
    }
    
    public final void i(final String str, final g1.a a, final List list, final List list2) {
        g0.a.a(str.startsWith("Dialogue:"));
        final String[] split = str.substring(9).split(",", a.e);
        StringBuilder sb;
        if (split.length != a.e) {
            sb = new StringBuilder();
            sb.append("Skipping dialogue line with fewer columns than format: ");
        }
        else {
            final long n = n(split[a.a]);
            if (n == -9223372036854775807L) {
                sb = new StringBuilder();
            }
            else {
                final long n2 = n(split[a.b]);
                if (n2 != -9223372036854775807L) {
                    final Map d = this.d;
                    c c2 = null;
                    Label_0187: {
                        if (d != null) {
                            final int c = a.c;
                            if (c != -1) {
                                c2 = d.get(split[c].trim());
                                break Label_0187;
                            }
                        }
                        c2 = null;
                    }
                    final String s = split[a.d];
                    final f0.a g = g(g1.c.b.d(s).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), c2, g1.c.b.b(s), this.e, this.f);
                    for (int i = e(n, list2, list); i < e(n2, list2, list); ++i) {
                        list.get(i).add(g);
                    }
                    return;
                }
                sb = new StringBuilder();
            }
            sb.append("Skipping invalid timing: ");
        }
        sb.append(str);
        o.h("SsaParser", sb.toString());
    }
    
    public final void j(final z z, final List list, final List list2, final Charset charset) {
        g1.a a;
        if (this.a) {
            a = this.b;
        }
        else {
            a = null;
        }
        while (true) {
            final String s = z.s(charset);
            if (s == null) {
                break;
            }
            if (s.startsWith("Format:")) {
                a = g1.a.a(s);
            }
            else {
                if (!s.startsWith("Dialogue:")) {
                    continue;
                }
                if (a == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Skipping dialogue line before complete format: ");
                    sb.append(s);
                    o.h("SsaParser", sb.toString());
                }
                else {
                    this.i(s, a, list, list2);
                }
            }
        }
    }
    
    public final void k(final z z, final Charset charset) {
        while (true) {
            final String s = z.s(charset);
            if (s == null) {
                break;
            }
            if ("[Script Info]".equalsIgnoreCase(s)) {
                this.l(z, charset);
            }
            else if ("[V4+ Styles]".equalsIgnoreCase(s)) {
                this.d = m(z, charset);
            }
            else if ("[V4 Styles]".equalsIgnoreCase(s)) {
                o.f("SsaParser", "[V4 Styles] are not supported");
            }
            else {
                if ("[Events]".equalsIgnoreCase(s)) {
                    break;
                }
                continue;
            }
        }
    }
    
    public final void l(final z z, final Charset charset) {
        while (true) {
            final String s = z.s(charset);
            if (s == null || (z.a() != 0 && z.h(charset) == '[')) {
                return;
            }
            final String[] split = s.split(":");
            if (split.length != 2) {
                continue;
            }
            final String e = W2.c.e(split[0].trim());
            e.hashCode();
            Label_0102: {
                if (e.equals("playresx")) {
                    break Label_0102;
                }
                if (!e.equals("playresy")) {
                    continue;
                }
                try {
                    this.f = Float.parseFloat(split[1].trim());
                    continue;
                    this.e = Float.parseFloat(split[1].trim());
                    continue;
                }
                catch (NumberFormatException ex) {}
            }
        }
    }
}
