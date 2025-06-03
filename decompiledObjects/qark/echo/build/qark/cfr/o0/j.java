/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package o0;

import X2.v;
import android.net.Uri;
import d0.q;
import g0.a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n0.g;
import o0.i;
import o0.k;
import o0.m;

public abstract class j {
    public final long a;
    public final q b;
    public final v c;
    public final long d;
    public final List e;
    public final List f;
    public final List g;
    public final i h;

    public j(long l8, q q8, List list, k k8, List list2, List list3, List list4) {
        a.a(list.isEmpty() ^ true);
        this.a = l8;
        this.b = q8;
        this.c = v.U((Collection)list);
        q8 = list2 == null ? Collections.emptyList() : Collections.unmodifiableList((List)list2);
        this.e = q8;
        this.f = list3;
        this.g = list4;
        this.h = k8.a(this);
        this.d = k8.b();
    }

    public /* synthetic */ j(long l8, q q8, List list, k k8, List list2, List list3, List list4,  a8) {
        this(l8, q8, list, k8, list2, list3, list4);
    }

    public static j o(long l8, q q8, List list, k k8, List list2, List list3, List list4, String string2) {
        if (k8 instanceof k.e) {
            return new c(l8, q8, list, (k.e)k8, list2, list3, list4, string2, -1L);
        }
        if (k8 instanceof k.a) {
            return new b(l8, q8, list, (k.a)k8, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract g l();

    public abstract i m();

    public i n() {
        return this.h;
    }

    public static class b
    extends j
    implements g {
        public final k.a i;

        public b(long l8, q q8, List list, k.a a8, List list2, List list3, List list4) {
            super(l8, q8, list, a8, list2, list3, list4, null);
            this.i = a8;
        }

        @Override
        public long a(long l8, long l9) {
            return this.i.i(l8, l9);
        }

        @Override
        public long b(long l8, long l9) {
            return this.i.h(l8, l9);
        }

        @Override
        public long c(long l8) {
            return this.i.j(l8);
        }

        @Override
        public long d(long l8, long l9) {
            return this.i.d(l8, l9);
        }

        @Override
        public long e(long l8, long l9) {
            return this.i.f(l8, l9);
        }

        @Override
        public i f(long l8) {
            return this.i.k(this, l8);
        }

        @Override
        public boolean g() {
            return this.i.l();
        }

        @Override
        public long h() {
            return this.i.e();
        }

        @Override
        public long i(long l8) {
            return this.i.g(l8);
        }

        @Override
        public long j(long l8, long l9) {
            return this.i.c(l8, l9);
        }

        @Override
        public String k() {
            return null;
        }

        @Override
        public g l() {
            return this;
        }

        @Override
        public i m() {
            return null;
        }
    }

    public static class c
    extends j {
        public final Uri i;
        public final long j;
        public final String k;
        public final i l;
        public final m m;

        public c(long l8, q object, List list, k.e e8, List list2, List list3, List list4, String string2, long l9) {
            super(l8, (q)object, list, e8, list2, list3, list4, null);
            this.i = Uri.parse((String)((o0.b)list.get((int)0)).a);
            this.l = object = e8.c();
            this.k = string2;
            this.j = l9;
            object = object != null ? null : new m(new i(null, 0L, l9));
            this.m = object;
        }

        @Override
        public String k() {
            return this.k;
        }

        @Override
        public g l() {
            return this.m;
        }

        @Override
        public i m() {
            return this.l;
        }
    }

}

