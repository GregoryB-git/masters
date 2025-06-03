// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r0;

import d0.H;
import java.util.ArrayList;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import d0.q;
import java.util.List;

public final class g extends h
{
    public static final g n;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final q j;
    public final List k;
    public final Map l;
    public final List m;
    
    static {
        n = new g("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    }
    
    public g(final String s, final List list, final List list2, final List list3, final List list4, final List list5, final List list6, final q j, final List list7, final boolean b, final Map m, final List list8) {
        super(s, list, b);
        this.d = Collections.unmodifiableList((List<?>)f(list2, list3, list4, list5, list6));
        this.e = Collections.unmodifiableList((List<?>)list2);
        this.f = Collections.unmodifiableList((List<?>)list3);
        this.g = Collections.unmodifiableList((List<?>)list4);
        this.h = Collections.unmodifiableList((List<?>)list5);
        this.i = Collections.unmodifiableList((List<?>)list6);
        this.j = j;
        List<Object> unmodifiableList;
        if (list7 != null) {
            unmodifiableList = Collections.unmodifiableList((List<?>)list7);
        }
        else {
            unmodifiableList = null;
        }
        this.k = unmodifiableList;
        this.l = Collections.unmodifiableMap((Map<?, ?>)m);
        this.m = Collections.unmodifiableList((List<?>)list8);
    }
    
    public static void b(final List list, final List list2) {
        for (int i = 0; i < list.size(); ++i) {
            final Uri a = list.get(i).a;
            if (a != null && !list2.contains(a)) {
                list2.add(a);
            }
        }
    }
    
    public static List d(final List list, final int n, final List list2) {
        final ArrayList<Object> list3 = new ArrayList<Object>(list2.size());
        for (int i = 0; i < list.size(); ++i) {
            final Object value = list.get(i);
            for (int j = 0; j < list2.size(); ++j) {
                final H h = list2.get(j);
                if (h.p == n && h.q == i) {
                    list3.add(value);
                    break;
                }
            }
        }
        return list3;
    }
    
    public static g e(final String s) {
        return new g("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(s))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }
    
    public static List f(final List list, final List list2, final List list3, final List list4, final List list5) {
        final ArrayList<Uri> list6 = new ArrayList<Uri>();
        for (int i = 0; i < list.size(); ++i) {
            final Uri a = list.get(i).a;
            if (!list6.contains(a)) {
                list6.add(a);
            }
        }
        b(list2, list6);
        b(list3, list6);
        b(list4, list6);
        b(list5, list6);
        return list6;
    }
    
    public g c(final List list) {
        return new g(super.a, super.b, d(this.e, 0, list), Collections.emptyList(), d(this.g, 1, list), d(this.h, 2, list), Collections.emptyList(), this.j, this.k, super.c, this.l, this.m);
    }
    
    public static final class a
    {
        public final Uri a;
        public final q b;
        public final String c;
        public final String d;
        
        public a(final Uri a, final q b, final String c, final String d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class b
    {
        public final Uri a;
        public final q b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        
        public b(final Uri a, final q b, final String c, final String d, final String e, final String f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        public static b b(final Uri uri) {
            return new b(uri, new q.b().a0("0").Q("application/x-mpegURL").K(), null, null, null, null);
        }
        
        public b a(final q q) {
            return new b(this.a, q, this.c, this.d, this.e, this.f);
        }
    }
}
