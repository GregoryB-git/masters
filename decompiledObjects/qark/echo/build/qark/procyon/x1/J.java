// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import java.util.Collection;
import kotlin.jvm.internal.g;
import java.util.List;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.AbstractList;

public final class J extends AbstractList
{
    public static final b u;
    public static final AtomicInteger v;
    public Handler o;
    public int p;
    public final String q;
    public List r;
    public List s;
    public String t;
    
    static {
        u = new b(null);
        v = new AtomicInteger();
    }
    
    public J(final Collection c) {
        Intrinsics.checkNotNullParameter(c, "requests");
        this.q = String.valueOf((Object)J.v.incrementAndGet());
        this.s = new ArrayList();
        this.r = new ArrayList(c);
    }
    
    public J(final F... array) {
        Intrinsics.checkNotNullParameter(array, "requests");
        this.q = String.valueOf((Object)J.v.incrementAndGet());
        this.s = new ArrayList();
        this.r = new ArrayList(W5.g.b(array));
    }
    
    public F D(final int n) {
        return this.r.get(n);
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
    
    public /* bridge */ int Y(final F o) {
        return super.indexOf(o);
    }
    
    public /* bridge */ int Z(final F o) {
        return super.lastIndexOf(o);
    }
    
    public void a(final int n, final F f) {
        Intrinsics.checkNotNullParameter(f, "element");
        this.r.add(n, f);
    }
    
    public final /* bridge */ F a0(final int n) {
        return this.c0(n);
    }
    
    public /* bridge */ boolean b0(final F o) {
        return super.remove(o);
    }
    
    public F c0(final int n) {
        return this.r.remove(n);
    }
    
    @Override
    public void clear() {
        this.r.clear();
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        if (o != null) {
            if (!(o instanceof F)) {
                return false;
            }
        }
        return this.g((F)o);
    }
    
    public boolean d(final F f) {
        Intrinsics.checkNotNullParameter(f, "element");
        return this.r.add(f);
    }
    
    public F d0(final int n, final F f) {
        Intrinsics.checkNotNullParameter(f, "element");
        return this.r.set(n, f);
    }
    
    public final void e0(final Handler o) {
        this.o = o;
    }
    
    public final void f(final a a) {
        Intrinsics.checkNotNullParameter(a, "callback");
        if (!this.s.contains(a)) {
            this.s.add(a);
        }
    }
    
    public /* bridge */ boolean g(final F o) {
        return super.contains(o);
    }
    
    public final List i() {
        return this.k();
    }
    
    @Override
    public final /* bridge */ int indexOf(final Object o) {
        if (o != null) {
            if (!(o instanceof F)) {
                return -1;
            }
        }
        return this.Y((F)o);
    }
    
    public final List k() {
        return F.n.j(this);
    }
    
    @Override
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (o != null) {
            if (!(o instanceof F)) {
                return -1;
            }
        }
        return this.Z((F)o);
    }
    
    public final I q() {
        return this.s();
    }
    
    @Override
    public final /* bridge */ boolean remove(final Object o) {
        if (o != null) {
            if (!(o instanceof F)) {
                return false;
            }
        }
        return this.b0((F)o);
    }
    
    public final I s() {
        return F.n.m(this);
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.W();
    }
    
    public interface a
    {
        void a(final J p0);
    }
    
    public static final class b
    {
    }
}
