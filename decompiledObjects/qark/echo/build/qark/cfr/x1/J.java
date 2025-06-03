/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.String
 *  java.util.AbstractList
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicInteger
 */
package x1;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.F;
import x1.I;

public final class J
extends AbstractList {
    public static final b u = new b(null);
    public static final AtomicInteger v = new AtomicInteger();
    public Handler o;
    public int p;
    public final String q;
    public List r;
    public List s;
    public String t;

    public J(Collection collection) {
        Intrinsics.checkNotNullParameter((Object)collection, "requests");
        this.q = String.valueOf((Object)v.incrementAndGet());
        this.s = new ArrayList();
        this.r = new ArrayList(collection);
    }

    public /* varargs */ J(F ... arrf) {
        Intrinsics.checkNotNullParameter(arrf, "requests");
        this.q = String.valueOf((Object)v.incrementAndGet());
        this.s = new ArrayList();
        this.r = new ArrayList((Collection)W5.g.b(arrf));
    }

    public F D(int n8) {
        return (F)this.r.get(n8);
    }

    public final String M() {
        return this.t;
    }

    public final Handler S() {
        return this.o;
    }

    public final List T() {
        return this.s;
    }

    public final String U() {
        return this.q;
    }

    public final List V() {
        return this.r;
    }

    public int W() {
        return this.r.size();
    }

    public final int X() {
        return this.p;
    }

    public void a(int n8, F f8) {
        Intrinsics.checkNotNullParameter(f8, "element");
        this.r.add(n8, (Object)f8);
    }

    public F c0(int n8) {
        return (F)this.r.remove(n8);
    }

    public void clear() {
        this.r.clear();
    }

    public boolean d(F f8) {
        Intrinsics.checkNotNullParameter(f8, "element");
        return this.r.add((Object)f8);
    }

    public F d0(int n8, F f8) {
        Intrinsics.checkNotNullParameter(f8, "element");
        return (F)this.r.set(n8, (Object)f8);
    }

    public final void e0(Handler handler) {
        this.o = handler;
    }

    public final void f(a a8) {
        Intrinsics.checkNotNullParameter(a8, "callback");
        if (!this.s.contains((Object)a8)) {
            this.s.add((Object)a8);
        }
    }

    public final List i() {
        return this.k();
    }

    public final List k() {
        return F.n.j(this);
    }

    public final I q() {
        return this.s();
    }

    public final I s() {
        return F.n.m(this);
    }

    public static interface a {
        public void a(J var1);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }
    }

}

