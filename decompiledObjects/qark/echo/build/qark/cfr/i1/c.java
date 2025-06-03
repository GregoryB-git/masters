/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.Spannable
 *  android.text.SpannableStringBuilder
 *  android.util.Base64
 *  android.util.Pair
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeMap
 *  java.util.TreeSet
 */
package i1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import f0.a;
import i1.a;
import i1.e;
import i1.f;
import i1.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public final class c {
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

    public c(String string2, String string3, long l8, long l9, g g8, String[] arrstring, String string4, String string5, c c8) {
        this.a = string2;
        this.b = string3;
        this.i = string5;
        this.f = g8;
        this.g = arrstring;
        boolean bl = string3 != null;
        this.c = bl;
        this.d = l8;
        this.e = l9;
        this.h = (String)g0.a.e(string4);
        this.j = c8;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static c c(String string2, long l8, long l9, g g8, String[] arrstring, String string3, String string4, c c8) {
        return new c(string2, null, l8, l9, g8, arrstring, string3, string4, c8);
    }

    public static c d(String string2) {
        return new c(null, f.b(string2), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder) {
        int n8 = spannableStringBuilder.length();
        int n9 = 0;
        a[] arra = (a[])spannableStringBuilder.getSpans(0, n8, a.class);
        int n10 = arra.length;
        for (n8 = 0; n8 < n10; ++n8) {
            a a8 = arra[n8];
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart((Object)a8), spannableStringBuilder.getSpanEnd((Object)a8), (CharSequence)"");
        }
        for (n8 = 0; n8 < spannableStringBuilder.length(); ++n8) {
            int n11;
            if (spannableStringBuilder.charAt(n8) != ' ') continue;
            for (n10 = n11 = n8 + 1; n10 < spannableStringBuilder.length() && spannableStringBuilder.charAt(n10) == ' '; ++n10) {
            }
            if ((n10 -= n11) <= 0) continue;
            spannableStringBuilder.delete(n8, n10 + n8);
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (n8 = 0; n8 < spannableStringBuilder.length() - 1; ++n8) {
            if (spannableStringBuilder.charAt(n8) != '\n' || spannableStringBuilder.charAt(n10 = n8 + 1) != ' ') continue;
            spannableStringBuilder.delete(n10, n8 + 2);
        }
        n8 = n9;
        if (spannableStringBuilder.length() > 0) {
            n8 = n9;
            if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                n8 = n9;
            }
        }
        while (n8 < spannableStringBuilder.length() - 1) {
            if (spannableStringBuilder.charAt(n8) == ' ' && spannableStringBuilder.charAt(n10 = n8 + 1) == '\n') {
                spannableStringBuilder.delete(n8, n10);
            }
            ++n8;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    public static SpannableStringBuilder k(String string2, Map map) {
        if (!map.containsKey((Object)string2)) {
            a.b b8 = new a.b();
            b8.o((CharSequence)new SpannableStringBuilder());
            map.put((Object)string2, (Object)b8);
        }
        return (SpannableStringBuilder)g0.a.e((Object)((a.b)map.get((Object)string2)).e());
    }

    public void a(c c8) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add((Object)c8);
    }

    public final void b(Map map, a.b b8, int n8, int n9, int n10) {
        SpannableStringBuilder spannableStringBuilder;
        g g8 = f.f(this.f, this.g, map);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder = (SpannableStringBuilder)b8.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder2 = new SpannableStringBuilder();
            b8.o((CharSequence)spannableStringBuilder2);
        }
        if (g8 != null) {
            f.a((Spannable)spannableStringBuilder2, n8, n9, g8, this.j, map, n10);
            if ("p".equals((Object)this.a)) {
                if (g8.k() != Float.MAX_VALUE) {
                    b8.m(g8.k() * -90.0f / 100.0f);
                }
                if (g8.m() != null) {
                    b8.p(g8.m());
                }
                if (g8.h() != null) {
                    b8.j(g8.h());
                }
            }
        }
    }

    public c f(int n8) {
        List list = this.m;
        if (list != null) {
            return (c)list.get(n8);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long l8, Map map, Map map2, Map map3) {
        Object object = new ArrayList();
        this.n(l8, this.h, (List)object);
        Object object2 = new TreeMap();
        this.p(l8, false, this.h, (Map)object2);
        this.o(l8, map, map2, this.h, (Map)object2);
        map = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object object3 = (Pair)object.next();
            Bitmap bitmap = (Bitmap)map3.get(object3.second);
            if (bitmap == null) continue;
            bitmap = Base64.decode((String)bitmap, (int)0);
            bitmap = BitmapFactory.decodeByteArray((byte[])bitmap, (int)0, (int)bitmap.length);
            object3 = (e)g0.a.e((e)map2.get(object3.first));
            map.add((Object)new a.b().f(bitmap).k(object3.b).l(0).h(object3.c, 0).i(object3.e).n(object3.f).g(object3.g).r(object3.j).a());
        }
        map3 = object2.entrySet().iterator();
        while (map3.hasNext()) {
            object = (Map.Entry)map3.next();
            object2 = (e)g0.a.e((e)map2.get(object.getKey()));
            object = (a.b)object.getValue();
            c.e((SpannableStringBuilder)g0.a.e((Object)object.e()));
            object.h(object2.c, object2.d);
            object.i(object2.e);
            object.k(object2.b);
            object.n(object2.f);
            object.q(object2.i, object2.h);
            object.r(object2.j);
            map.add((Object)object.a());
        }
        return map;
    }

    public final void i(TreeSet treeSet, boolean bl) {
        boolean bl2 = "p".equals((Object)this.a);
        boolean bl3 = "div".equals((Object)this.a);
        if (bl || bl2 || bl3 && this.i != null) {
            long l8 = this.d;
            if (l8 != -9223372036854775807L) {
                treeSet.add((Object)l8);
            }
            if ((l8 = this.e) != -9223372036854775807L) {
                treeSet.add((Object)l8);
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i8 = 0; i8 < this.m.size(); ++i8) {
            c c8 = (c)this.m.get(i8);
            bl3 = bl || bl2;
            c8.i(treeSet, bl3);
        }
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int n8 = 0;
        this.i(treeSet, false);
        long[] arrl = new long[treeSet.size()];
        treeSet = treeSet.iterator();
        while (treeSet.hasNext()) {
            arrl[n8] = (Long)treeSet.next();
            ++n8;
        }
        return arrl;
    }

    public String[] l() {
        return this.g;
    }

    public boolean m(long l8) {
        long l9 = this.d;
        if (l9 == -9223372036854775807L && this.e == -9223372036854775807L || l9 <= l8 && this.e == -9223372036854775807L || l9 == -9223372036854775807L && l8 < this.e || l9 <= l8 && l8 < this.e) {
            return true;
        }
        return false;
    }

    public final void n(long l8, String string2, List list) {
        if (!"".equals((Object)this.h)) {
            string2 = this.h;
        }
        if (this.m(l8) && "div".equals((Object)this.a) && this.i != null) {
            list.add((Object)new Pair((Object)string2, (Object)this.i));
            return;
        }
        for (int i8 = 0; i8 < this.g(); ++i8) {
            this.f(i8).n(l8, string2, list);
        }
    }

    public final void o(long l8, Map map, Map map2, String string2, Map map3) {
        int n8;
        if (!this.m(l8)) {
            return;
        }
        if (!"".equals((Object)this.h)) {
            string2 = this.h;
        }
        Iterator iterator = this.l.entrySet().iterator();
        do {
            boolean bl = iterator.hasNext();
            int n9 = 0;
            n8 = 0;
            if (!bl) break;
            Map.Entry entry = (Map.Entry)iterator.next();
            String string3 = (String)entry.getKey();
            if (this.k.containsKey((Object)string3)) {
                n8 = (Integer)this.k.get((Object)string3);
            }
            if (n8 == (n9 = ((Integer)entry.getValue()).intValue())) continue;
            this.b(map, (a.b)g0.a.e((a.b)map3.get((Object)string3)), n8, n9, ((e)g0.a.e((Object)((e)map2.get((Object)string2)))).j);
        } while (true);
        for (n8 = n9; n8 < this.g(); ++n8) {
            this.f(n8).o(l8, map, map2, string2, map3);
        }
    }

    public final void p(long l8, boolean bl, String string2, Map map2) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals((Object)this.a)) {
            return;
        }
        if (!"".equals((Object)this.h)) {
            string2 = this.h;
        }
        if (this.c && bl) {
            c.k(string2, map2).append((CharSequence)g0.a.e(this.b));
            return;
        }
        if ("br".equals((Object)this.a) && bl) {
            c.k(string2, map2).append('\n');
            return;
        }
        if (this.m(l8)) {
            for (Map.Entry entry : map2.entrySet()) {
                this.k.put((Object)((String)entry.getKey()), (Object)((CharSequence)g0.a.e((Object)((a.b)entry.getValue()).e())).length());
            }
            boolean bl2 = "p".equals((Object)this.a);
            for (int i8 = 0; i8 < this.g(); ++i8) {
                c c8 = this.f(i8);
                boolean bl3 = bl || bl2;
                c8.p(l8, bl3, string2, map2);
            }
            if (bl2) {
                f.c(c.k(string2, map2));
            }
            for (Map map2 : map2.entrySet()) {
                this.l.put((Object)((String)map2.getKey()), (Object)((CharSequence)g0.a.e((Object)((a.b)map2.getValue()).e())).length());
            }
        }
    }
}

