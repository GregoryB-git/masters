// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i1;

import java.util.TreeSet;
import android.graphics.Bitmap;
import java.util.Iterator;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Pair;
import java.util.TreeMap;
import android.text.Spannable;
import java.util.ArrayList;
import java.util.Map;
import android.text.SpannableStringBuilder;
import g0.a;
import java.util.List;
import java.util.HashMap;

public final class c
{
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final g f;
    public final String[] g;
    public final String h;
    public final String i;
    public final c j;
    public final HashMap k;
    public final HashMap l;
    public List m;
    
    public c(final String a, final String b, final long d, final long e, final g f, final String[] g, final String s, final String i, final c j) {
        this.a = a;
        this.b = b;
        this.i = i;
        this.f = f;
        this.g = g;
        this.c = (b != null);
        this.d = d;
        this.e = e;
        this.h = (String)g0.a.e(s);
        this.j = j;
        this.k = new HashMap();
        this.l = new HashMap();
    }
    
    public static c c(final String s, final long n, final long n2, final g g, final String[] array, final String s2, final String s3, final c c) {
        return new c(s, null, n, n2, g, array, s2, s3, c);
    }
    
    public static c d(final String s) {
        return new c(null, f.b(s), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }
    
    public static void e(final SpannableStringBuilder spannableStringBuilder) {
        final int length = spannableStringBuilder.length();
        final int n = 0;
        final i1.a[] array = (i1.a[])spannableStringBuilder.getSpans(0, length, (Class)i1.a.class);
        for (int length2 = array.length, i = 0; i < length2; ++i) {
            final i1.a a = array[i];
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart((Object)a), spannableStringBuilder.getSpanEnd((Object)a), (CharSequence)"");
        }
        for (int j = 0; j < spannableStringBuilder.length(); ++j) {
            if (spannableStringBuilder.charAt(j) == ' ') {
                int n3;
                int n2;
                for (n2 = (n3 = j + 1); n3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(n3) == ' '; ++n3) {}
                final int n4 = n3 - n2;
                if (n4 > 0) {
                    spannableStringBuilder.delete(j, n4 + j);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int k = 0; k < spannableStringBuilder.length() - 1; ++k) {
            if (spannableStringBuilder.charAt(k) == '\n') {
                final int n5 = k + 1;
                if (spannableStringBuilder.charAt(n5) == ' ') {
                    spannableStringBuilder.delete(n5, k + 2);
                }
            }
        }
        int l = n;
        if (spannableStringBuilder.length() > 0) {
            l = n;
            if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                l = n;
            }
        }
        while (l < spannableStringBuilder.length() - 1) {
            if (spannableStringBuilder.charAt(l) == ' ') {
                final int n6 = l + 1;
                if (spannableStringBuilder.charAt(n6) == '\n') {
                    spannableStringBuilder.delete(l, n6);
                }
            }
            ++l;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }
    
    public static SpannableStringBuilder k(final String s, final Map map) {
        if (!map.containsKey(s)) {
            final f0.a.b b = new f0.a.b();
            b.o((CharSequence)new SpannableStringBuilder());
            map.put(s, b);
        }
        return (SpannableStringBuilder)a.e(map.get(s).e());
    }
    
    public void a(final c c) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(c);
    }
    
    public final void b(final Map map, final f0.a.b b, final int n, final int n2, final int n3) {
        final g f = i1.f.f(this.f, this.g, map);
        SpannableStringBuilder spannableStringBuilder;
        if ((spannableStringBuilder = (SpannableStringBuilder)b.e()) == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            b.o((CharSequence)spannableStringBuilder);
        }
        if (f != null) {
            i1.f.a((Spannable)spannableStringBuilder, n, n2, f, this.j, map, n3);
            if ("p".equals(this.a)) {
                if (f.k() != Float.MAX_VALUE) {
                    b.m(f.k() * -90.0f / 100.0f);
                }
                if (f.m() != null) {
                    b.p(f.m());
                }
                if (f.h() != null) {
                    b.j(f.h());
                }
            }
        }
    }
    
    public c f(final int n) {
        final List m = this.m;
        if (m != null) {
            return m.get(n);
        }
        throw new IndexOutOfBoundsException();
    }
    
    public int g() {
        final List m = this.m;
        if (m == null) {
            return 0;
        }
        return m.size();
    }
    
    public List h(final long n, final Map map, final Map map2, final Map map3) {
        final ArrayList<Pair> list = (ArrayList<Pair>)new ArrayList<Object>();
        this.n(n, this.h, list);
        final TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
        this.p(n, false, this.h, treeMap);
        this.o(n, map, map2, this.h, treeMap);
        final ArrayList<f0.a> list2 = new ArrayList<f0.a>();
        for (final Pair pair : list) {
            final String s = map3.get(pair.second);
            if (s == null) {
                continue;
            }
            final byte[] decode = Base64.decode(s, 0);
            final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            final e e = (e)g0.a.e(map2.get(pair.first));
            list2.add(new f0.a.b().f(decodeByteArray).k(e.b).l(0).h(e.c, 0).i(e.e).n(e.f).g(e.g).r(e.j).a());
        }
        for (final Map.Entry<Object, V> entry : treeMap.entrySet()) {
            final e e2 = (e)g0.a.e(map2.get(entry.getKey()));
            final f0.a.b b = (f0.a.b)entry.getValue();
            e((SpannableStringBuilder)g0.a.e(b.e()));
            b.h(e2.c, e2.d);
            b.i(e2.e);
            b.k(e2.b);
            b.n(e2.f);
            b.q(e2.i, e2.h);
            b.r(e2.j);
            list2.add(b.a());
        }
        return list2;
    }
    
    public final void i(final TreeSet set, final boolean b) {
        final boolean equals = "p".equals(this.a);
        final boolean equals2 = "div".equals(this.a);
        if (b || equals || (equals2 && this.i != null)) {
            final long d = this.d;
            if (d != -9223372036854775807L) {
                set.add(d);
            }
            final long e = this.e;
            if (e != -9223372036854775807L) {
                set.add(e);
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); ++i) {
            ((c)this.m.get(i)).i(set, b || equals);
        }
    }
    
    public long[] j() {
        final TreeSet<Long> set = new TreeSet<Long>();
        int n = 0;
        this.i(set, false);
        final long[] array = new long[set.size()];
        final Iterator<Long> iterator = set.iterator();
        while (iterator.hasNext()) {
            array[n] = iterator.next();
            ++n;
        }
        return array;
    }
    
    public String[] l() {
        return this.g;
    }
    
    public boolean m(final long n) {
        final long d = this.d;
        return (d == -9223372036854775807L && this.e == -9223372036854775807L) || (d <= n && this.e == -9223372036854775807L) || (d == -9223372036854775807L && n < this.e) || (d <= n && n < this.e);
    }
    
    public final void n(final long n, String h, final List list) {
        if (!"".equals(this.h)) {
            h = this.h;
        }
        if (this.m(n) && "div".equals(this.a) && this.i != null) {
            list.add(new Pair((Object)h, (Object)this.i));
            return;
        }
        for (int i = 0; i < this.g(); ++i) {
            this.f(i).n(n, h, list);
        }
    }
    
    public final void o(final long n, final Map map, final Map map2, String h, final Map map3) {
        if (!this.m(n)) {
            return;
        }
        if (!"".equals(this.h)) {
            h = this.h;
        }
        final Iterator<Map.Entry<String, V>> iterator = this.l.entrySet().iterator();
        int n2;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            n2 = 0;
            int intValue = 0;
            if (!hasNext) {
                break;
            }
            final Map.Entry<String, V> entry = iterator.next();
            final String s = entry.getKey();
            if (this.k.containsKey(s)) {
                intValue = (int)this.k.get(s);
            }
            final int intValue2 = (int)entry.getValue();
            if (intValue == intValue2) {
                continue;
            }
            this.b(map, (f0.a.b)g0.a.e(map3.get(s)), intValue, intValue2, ((e)g0.a.e(map2.get(h))).j);
        }
        for (int i = n2; i < this.g(); ++i) {
            this.f(i).o(n, map, map2, h, map3);
        }
    }
    
    public final void p(final long n, final boolean b, String h, final Map map) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.h)) {
            h = this.h;
        }
        if (this.c && b) {
            k(h, map).append((CharSequence)g0.a.e(this.b));
            return;
        }
        if ("br".equals(this.a) && b) {
            k(h, map).append('\n');
            return;
        }
        if (this.m(n)) {
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                this.k.put(entry.getKey(), ((CharSequence)g0.a.e(((f0.a.b)entry.getValue()).e())).length());
            }
            final boolean equals = "p".equals(this.a);
            for (int i = 0; i < this.g(); ++i) {
                this.f(i).p(n, b || equals, h, map);
            }
            if (equals) {
                i1.f.c(k(h, map));
            }
            for (final Map.Entry<String, V> entry2 : map.entrySet()) {
                this.l.put(entry2.getKey(), ((CharSequence)g0.a.e(((f0.a.b)entry2.getValue()).e())).length());
            }
        }
    }
}
