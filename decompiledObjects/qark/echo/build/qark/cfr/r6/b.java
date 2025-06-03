/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 *  java.util.concurrent.atomic.AtomicLongFieldUpdater
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package r6;

import V5.n;
import V5.t;
import g6.p;
import g6.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import p6.P0;
import p6.m;
import r6.c;
import r6.d;
import r6.e;
import r6.g;
import r6.i;
import r6.j;
import r6.k;
import r6.o;
import u6.C;
import u6.D;
import u6.E;
import u6.F;
import u6.O;
import u6.l;
import u6.x;

public class b
implements d {
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, (String)"sendersAndCloseStatus");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(b.class, (String)"receivers");
    public static final AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(b.class, (String)"bufferEnd");
    public static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(b.class, (String)"completedExpandBuffersAndPauseFlag");
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, (String)"sendSegment");
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, (String)"receiveSegment");
    public static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, (String)"bufferEndSegment");
    public static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, (String)"_closeCause");
    public static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, (String)"closeHandler");
    private volatile Object _closeCause;
    public final int b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    public final g6.l c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    public final q d;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int n8, g6.l c8) {
        this.b = n8;
        this.c = c8;
        if (n8 >= 0) {
            this.bufferEnd = c.t(n8);
            this.completedExpandBuffersAndPauseFlag = this.D();
            i i8 = new i(0L, null, this, 3);
            this.sendSegment = i8;
            this.receiveSegment = i8;
            if (this.U()) {
                i8 = c.n();
                Intrinsics.c(i8, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = i8;
            c8 = c8 != null ? new q(){

                public final g6.l a(x6.a a8, Object object, final Object object2) {
                    return new g6.l(this, a8){
                        public final /* synthetic */ b p;
                        {
                            this.p = b8;
                            super(1);
                        }

                        public final void a(Throwable object) {
                            if (object2 == c.z()) {
                                return;
                            }
                            object = this.p.c;
                            throw null;
                        }
                    };
                }

            } : null;
            this.d = c8;
            this._closeCause = c.l();
            return;
        }
        c8 = new StringBuilder();
        c8.append("Invalid channel capacity: ");
        c8.append(n8);
        c8.append(", should be >=0");
        throw new IllegalArgumentException(c8.toString().toString());
    }

    public static /* synthetic */ void L(b b8, long l8, int n8, Object object) {
        if (object == null) {
            if ((n8 & 1) != 0) {
                l8 = 1L;
            }
            b8.K(l8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    public static /* synthetic */ Object g0(b b8, X5.d d8) {
        Object object = (i)j.get((Object)b8);
        while (!b8.P()) {
            long l8 = f.getAndIncrement((Object)b8);
            int n8 = c.b;
            long l9 = l8 / (long)n8;
            n8 = (int)(l8 % (long)n8);
            i i8 = object;
            if (object.q != l9 && (i8 = b8.B(l9, (i)object)) == null) continue;
            object = b8.r0(i8, n8, l8, null);
            if (object != c.r()) {
                if (object == c.h()) {
                    object = i8;
                    if (l8 >= b8.I()) continue;
                    i8.b();
                    object = i8;
                    continue;
                }
                if (object == c.s()) {
                    return b8.h0(i8, n8, l8, d8);
                }
                i8.b();
                return object;
            }
            throw new IllegalStateException("unexpected".toString());
        }
        throw E.a(b8.F());
    }

    public static final /* synthetic */ void m(b b8, p6.l l8) {
        b8.b0(l8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final i A(long l8, i i8, long l9) {
        Object object;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        p p8 = (p)((Object)c.y());
        block0 : while (!D.c(object = u6.d.c(i8, l8, p8))) {
            C c8 = D.b(object);
            do {
                C c9 = (C)atomicReferenceFieldUpdater.get((Object)this);
                if (c9.q >= c8.q) break block0;
                if (!c8.q()) continue block0;
                if (u.b.a(atomicReferenceFieldUpdater, this, c9, c8)) {
                    if (!c9.m()) break block0;
                    c9.k();
                    break block0;
                }
                if (!c8.m()) continue;
                c8.k();
            } while (true);
        }
        if (D.c(object)) {
            this.x();
            this.Z(l8, i8);
        } else {
            i8 = (i)D.b(object);
            long l10 = i8.q;
            if (l10 <= l8) {
                return i8;
            }
            atomicReferenceFieldUpdater = g;
            int n8 = c.b;
            if (atomicReferenceFieldUpdater.compareAndSet((Object)this, l9 + 1L, (long)n8 * l10)) {
                this.K(i8.q * (long)n8 - l9);
                return null;
            }
        }
        b.L(this, 0L, 1, null);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final i B(long l8, i i8) {
        Object object;
        Object object2 = j;
        Object object3 = (p)((Object)c.y());
        block0 : while (!D.c(object = u6.d.c(i8, l8, (p)object3))) {
            C c8 = D.b(object);
            do {
                C c9 = (C)object2.get((Object)this);
                if (c9.q >= c8.q) break block0;
                if (!c8.q()) continue block0;
                if (u.b.a((AtomicReferenceFieldUpdater)object2, this, c9, c8)) {
                    if (!c9.m()) break block0;
                    c9.k();
                    break block0;
                }
                if (!c8.m()) continue;
                c8.k();
            } while (true);
        }
        boolean bl = D.c(object);
        object2 = null;
        if (bl) {
            this.x();
            if (i8.q * (long)c.b >= this.I()) return object2;
        } else {
            long l9;
            i8 = (i)D.b(object);
            if (!this.U() && l8 <= this.D() / (long)c.b) {
                object = k;
                do {
                    object3 = (C)object.get((Object)this);
                    if (object3.q >= i8.q || !i8.q()) break;
                    if (u.b.a((AtomicReferenceFieldUpdater)object, this, object3, i8)) {
                        if (!object3.m()) break;
                        object3.k();
                        break;
                    }
                    if (!i8.m()) continue;
                    i8.k();
                } while (true);
            }
            if ((l9 = i8.q) <= l8) return i8;
            int n8 = c.b;
            this.v0(l9 * (long)n8);
            if (i8.q * (long)n8 >= this.I()) return object2;
        }
        i8.b();
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final i C(long l8, i i8) {
        Object object;
        Object object2 = i;
        p p8 = (p)((Object)c.y());
        block0 : while (!D.c(object = u6.d.c(i8, l8, p8))) {
            C c8 = D.b(object);
            do {
                C c9 = (C)object2.get((Object)this);
                if (c9.q >= c8.q) break block0;
                if (!c8.q()) continue block0;
                if (u.b.a((AtomicReferenceFieldUpdater)object2, this, c9, c8)) {
                    if (!c9.m()) break block0;
                    c9.k();
                    break block0;
                }
                if (!c8.m()) continue;
                c8.k();
            } while (true);
        }
        boolean bl = D.c(object);
        object2 = null;
        if (bl) {
            this.x();
            if (i8.q * (long)c.b >= this.G()) return object2;
        } else {
            i8 = (i)D.b(object);
            long l9 = i8.q;
            if (l9 <= l8) return i8;
            int n8 = c.b;
            this.w0(l9 * (long)n8);
            if (i8.q * (long)n8 >= this.G()) return object2;
        }
        i8.b();
        return null;
    }

    public final long D() {
        return g.get((Object)this);
    }

    public final Throwable E() {
        return (Throwable)l.get((Object)this);
    }

    public final Throwable F() {
        Throwable throwable = this.E();
        Object object = throwable;
        if (throwable == null) {
            object = new j("Channel was closed");
        }
        return object;
    }

    public final long G() {
        return f.get((Object)this);
    }

    public final Throwable H() {
        Throwable throwable = this.E();
        Object object = throwable;
        if (throwable == null) {
            object = new k("Channel was closed");
        }
        return object;
    }

    public final long I() {
        return e.get((Object)this) & 0xFFFFFFFFFFFFFFFL;
    }

    public final boolean J() {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            i i8 = (i)atomicReferenceFieldUpdater.get((Object)this);
            long l8 = this.G();
            if (this.I() <= l8) {
                return false;
            }
            int n8 = c.b;
            long l9 = l8 / (long)n8;
            i i9 = i8;
            if (i8.q != l9) {
                i9 = i8 = this.B(l9, i8);
                if (i8 == null) {
                    if (((i)atomicReferenceFieldUpdater.get((Object)this)).q >= l9) continue;
                    return false;
                }
            }
            i9.b();
            if (this.N(i9, (int)(l8 % (long)n8), l8)) {
                return true;
            }
            f.compareAndSet((Object)this, l8, l8 + 1L);
        } while (true);
    }

    public final void K(long l8) {
        if ((h.addAndGet((Object)this, l8) & 0x4000000000000000L) != 0L) {
            while ((h.get((Object)this) & 0x4000000000000000L) != 0L) {
            }
        }
    }

    public final void M() {
        Object object;
        Object object2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        while (!u.b.a(atomicReferenceFieldUpdater, this, object2, object = (object2 = atomicReferenceFieldUpdater.get((Object)this)) == null ? c.d() : c.e())) {
        }
        if (object2 == null) {
            return;
        }
        object = (g6.l)y.b(object2, 1);
        ((g6.l)object2).invoke((Object)this.E());
    }

    public final boolean N(i i8, int n8, long l8) {
        Object object;
        do {
            object = i8.w(n8);
            boolean bl = false;
            if (object == null || object == c.k()) continue;
            if (object == c.d) {
                return true;
            }
            if (object == c.j()) {
                return false;
            }
            if (object == c.z()) {
                return false;
            }
            if (object == c.f()) {
                return false;
            }
            if (object == c.o()) {
                return false;
            }
            if (object == c.p()) {
                return true;
            }
            if (object == c.q()) {
                return false;
            }
            if (l8 == this.G()) {
                bl = true;
            }
            return bl;
        } while (!i8.r(n8, object, c.o()));
        this.z();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean O(long l8, boolean bl) {
        int n8 = (int)(l8 >> 60);
        if (n8 == 0) return false;
        if (n8 == 1) return false;
        if (n8 == 2) {
            this.w(l8 & 0xFFFFFFFFFFFFFFFL);
            if (!bl) return true;
            if (this.J()) return false;
            return true;
        }
        if (n8 == 3) {
            this.v(l8 & 0xFFFFFFFFFFFFFFFL);
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected close status: ");
        stringBuilder.append(n8);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public boolean P() {
        return this.Q(e.get((Object)this));
    }

    public final boolean Q(long l8) {
        return this.O(l8, true);
    }

    public boolean R() {
        return this.S(e.get((Object)this));
    }

    public final boolean S(long l8) {
        return this.O(l8, false);
    }

    public boolean T() {
        return false;
    }

    public final boolean U() {
        long l8 = this.D();
        if (l8 != 0L && l8 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final long V(i i8) {
        Object object;
        do {
            block1 : for (int i9 = c.b - 1; -1 < i9; --i9) {
                long l8 = i8.q * (long)c.b + (long)i9;
                if (l8 < this.G()) {
                    return -1L;
                }
                do {
                    if ((object = i8.w(i9)) == null || object == c.k()) continue;
                    if (object != c.d) continue block1;
                    return l8;
                } while (!i8.r(i9, object, c.z()));
                i8.p();
            }
            object = (i)i8.g();
            i8 = object;
        } while (object != null);
        return -1L;
    }

    public final void W() {
        long l8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        while ((int)((l8 = atomicLongFieldUpdater.get((Object)this)) >> 60) == 0 && !atomicLongFieldUpdater.compareAndSet((Object)this, l8, c.b(0xFFFFFFFFFFFFFFFL & l8, 1))) {
        }
    }

    public final void X() {
        long l8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        while (!atomicLongFieldUpdater.compareAndSet((Object)this, l8 = atomicLongFieldUpdater.get((Object)this), c.b(0xFFFFFFFFFFFFFFFL & l8, 3))) {
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Y() {
        long l8;
        int n8;
        long l9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        do {
            if ((n8 = (int)((l9 = atomicLongFieldUpdater.get((Object)this)) >> 60)) != 0) {
                if (n8 != 1) {
                    return;
                }
                l8 = l9 & 0xFFFFFFFFFFFFFFFL;
                n8 = 3;
                continue;
            }
            l8 = l9 & 0xFFFFFFFFFFFFFFFL;
            n8 = 2;
        } while (!atomicLongFieldUpdater.compareAndSet((Object)this, l9, l8 = c.b(l8, n8)));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void Z(long var1_1, i var3_2) {
        do {
            var4_3 = var3_2;
            if (var3_2.q >= var1_1) break;
            var4_3 = (i)var3_2.e();
            if (var4_3 == null) {
                var4_3 = var3_2;
                break;
            }
            var3_2 = var4_3;
        } while (true);
        block1 : do {
            if (var4_3.h() && (var3_2 = (i)var4_3.e()) != null) {
                var4_3 = var3_2;
                continue;
            }
            var3_2 = b.k;
            do {
                var5_4 = (C)var3_2.get((Object)this);
                if (var5_4.q >= var4_3.q) {
                    return;
                }
                if (var4_3.q()) ** break;
                continue block1;
                if (u.b.a((AtomicReferenceFieldUpdater)var3_2, this, var5_4, var4_3)) {
                    if (var5_4.m() == false) return;
                    var5_4.k();
                    return;
                }
                if (!var4_3.m()) continue;
                var4_3.k();
            } while (true);
            break;
        } while (true);
    }

    @Override
    public Object a(X5.d d8) {
        return b.g0(this, d8);
    }

    public void a0() {
    }

    @Override
    public boolean b(Throwable throwable) {
        return this.u(throwable, false);
    }

    public final void b0(p6.l l8) {
        n.a a8 = n.o;
        l8.resumeWith(n.a(V5.o.a(this.F())));
    }

    @Override
    public Object c() {
        Object object;
        long l8 = f.get((Object)this);
        long l9 = e.get((Object)this);
        if (this.Q(l9)) {
            return g.a.a(this.E());
        }
        if (l8 >= (l9 & 0xFFFFFFFFFFFFFFFL)) {
            return g.a.b();
        }
        F f8 = c.i();
        Object object2 = (i)j.get((Object)this);
        do {
            if (this.P()) {
                return g.a.a(this.E());
            }
            l8 = f.getAndIncrement((Object)this);
            int n8 = c.b;
            l9 = l8 / (long)n8;
            n8 = (int)(l8 % (long)n8);
            if (object2.q != l9) {
                object = this.B(l9, (i)object2);
                if (object == null) continue;
                object2 = object;
            }
            if ((object = this.r0((i)object2, n8, l8, f8)) == c.r()) {
                object = f8 instanceof P0 ? (P0)((Object)f8) : null;
                if (object != null) {
                    this.e0((P0)object, (i)object2, n8);
                }
                this.x0(l8);
                object2.p();
                return g.a.b();
            }
            if (object != c.h()) break;
            if (l8 >= this.I()) continue;
            object2.b();
        } while (true);
        if (object != c.s()) {
            object2.b();
            return g.a.c(object);
        }
        throw new IllegalStateException("unexpected".toString());
    }

    public void c0() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Object d(Object object) {
        i i8;
        block9 : {
            block10 : {
                int n8;
                boolean bl;
                F f8;
                block11 : {
                    long l8;
                    if (this.m0(e.get((Object)this))) {
                        return g.a.b();
                    }
                    f8 = c.j();
                    i8 = (i)i.get((Object)this);
                    do {
                        int n9;
                        long l9 = e.getAndIncrement((Object)this);
                        l8 = l9 & 0xFFFFFFFFFFFFFFFL;
                        bl = this.S(l9);
                        n8 = c.b;
                        l9 = l8 / (long)n8;
                        n8 = (int)(l8 % (long)n8);
                        if (i8.q != l9) {
                            i i9 = this.C(l9, i8);
                            if (i9 == null) {
                                if (!bl) continue;
                                do {
                                    return g.a.a(this.H());
                                    break;
                                } while (true);
                            }
                            i8 = i9;
                        }
                        if ((n9 = this.t0(i8, n8, object, l8, f8, bl)) == 0) break block9;
                        if (n9 == 1) break block10;
                        if (n9 == 2) break block11;
                        if (n9 == 3) throw new IllegalStateException("unexpected".toString());
                        if (n9 == 4) break;
                        if (n9 != 5) continue;
                        i8.b();
                    } while (true);
                    if (l8 >= this.G()) return g.a.a(this.H());
                    {
                        i8.b();
                    }
                    return g.a.a(this.H());
                }
                if (bl) {
                    i8.p();
                    return g.a.a(this.H());
                }
                object = f8 instanceof P0 ? (P0)((Object)f8) : null;
                if (object != null) {
                    this.f0((P0)object, i8, n8);
                }
                i8.p();
                return g.a.b();
            }
            do {
                return g.a.c(t.a);
                break;
            } while (true);
        }
        i8.b();
        return g.a.c(t.a);
    }

    public void d0() {
    }

    public final void e0(P0 p02, i i8, int n8) {
        this.d0();
        p02.a(i8, n8);
    }

    public final void f0(P0 p02, i i8, int n8) {
        p02.a(i8, n8 + c.b);
    }

    /*
     * Exception decompiling
     */
    public final Object h0(i var1_1, int var2_3, long var3_4, X5.d var5_5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:397)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:475)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i0(i object) {
        g6.l l8 = this.c;
        Object object2 = null;
        Object object3 = l.b(null, 1, null);
        Object object4 = object;
        block0 : do {
            int n8 = c.b - 1;
            Object object5 = object3;
            object = object2;
            block1 : do {
                long l9;
                if (-1 < n8) {
                    l9 = object4.q * (long)c.b + (long)n8;
                } else {
                    i i8 = (i)object4.g();
                    object2 = object;
                    object3 = object5;
                    object4 = i8;
                    if (i8 != null) continue block0;
                    break;
                }
                while ((object3 = object4.w(n8)) != c.f()) {
                    block16 : {
                        block17 : {
                            block14 : {
                                block13 : {
                                    block15 : {
                                        block12 : {
                                            if (object3 != c.d) break block12;
                                            if (l9 < this.G()) break block1;
                                            if (!object4.r(n8, object3, c.z())) continue;
                                            object3 = object;
                                            object2 = object5;
                                            if (l8 != null) {
                                                object3 = x.c(l8, object4.v(n8), (O)((Object)object));
                                                object2 = object5;
                                            }
                                            break block13;
                                        }
                                        if (object3 == c.k() || object3 == null) break block14;
                                        if (object3 instanceof P0 || object3 instanceof o) break block15;
                                        if (object3 == c.p() || object3 == c.q()) break block1;
                                        if (object3 == c.p()) continue;
                                        break block16;
                                    }
                                    if (l9 < this.G()) break block1;
                                    object2 = object3 instanceof o ? ((o)object3).a : (P0)object3;
                                    if (!object4.r(n8, object3, c.z())) continue;
                                    object3 = object;
                                    if (l8 != null) {
                                        object3 = x.c(l8, object4.v(n8), (O)((Object)object));
                                    }
                                    object2 = l.c(object5, object2);
                                }
                                object4.s(n8);
                                object5 = object2;
                                object = object3;
                                break block17;
                            }
                            if (!object4.r(n8, object3, c.z())) continue;
                        }
                        object4.p();
                    }
                    --n8;
                    continue block1;
                }
                break;
            } while (true);
            if (object5 != null) {
                if (!(object5 instanceof ArrayList)) {
                    this.k0((P0)object5);
                } else {
                    Intrinsics.c(object5, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                    object5 = (ArrayList)object5;
                    for (n8 = object5.size() - 1; -1 < n8; --n8) {
                        this.k0((P0)object5.get(n8));
                    }
                }
            }
            if (object == null) {
                return;
            }
            throw object;
            break;
        } while (true);
    }

    @Override
    public e iterator() {
        return new a();
    }

    public final void j0(P0 p02) {
        this.l0(p02, true);
    }

    public final void k0(P0 p02) {
        this.l0(p02, false);
    }

    public final void l0(P0 object, boolean bl) {
        if (object instanceof p6.l) {
            X5.d d8 = (X5.d)object;
            object = n.o;
            object = bl ? this.F() : this.H();
            d8.resumeWith(n.a(V5.o.a((Throwable)object)));
            return;
        }
        if (object instanceof a) {
            ((a)object).j();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected waiter: ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public final boolean m0(long l8) {
        if (this.S(l8)) {
            return false;
        }
        return this.r(l8 & 0xFFFFFFFFFFFFFFFL) ^ true;
    }

    public final boolean n0(Object object, Object object2) {
        if (object instanceof a) {
            Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a)object).i(object2);
        }
        if (object instanceof p6.l) {
            Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            p6.l l8 = (p6.l)object;
            object = this.c;
            object = object != null ? x.a((g6.l)object, object2, l8.getContext()) : null;
            return c.u(l8, object2, (g6.l)object);
        }
        object2 = new StringBuilder();
        object2.append("Unexpected receiver type: ");
        object2.append(object);
        throw new IllegalStateException(object2.toString().toString());
    }

    public final boolean o0(Object object, i i8, int n8) {
        if (object instanceof p6.l) {
            Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.C((p6.l)object, t.a, null, 2, null);
        }
        i8 = new StringBuilder();
        i8.append("Unexpected waiter: ");
        i8.append(object);
        throw new IllegalStateException(i8.toString().toString());
    }

    public final boolean p0(i i8, int n8, long l8) {
        Object object = i8.w(n8);
        if (object instanceof P0 && l8 >= f.get((Object)this) && i8.r(n8, object, c.p())) {
            if (this.o0(object, i8, n8)) {
                i8.A(n8, c.d);
                return true;
            }
            i8.A(n8, c.j());
            i8.x(n8, false);
            return false;
        }
        return this.q0(i8, n8, l8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean q0(i var1_1, int var2_2, long var3_3) {
        do lbl-1000: // 5 sources:
        {
            block7 : {
                block5 : {
                    block6 : {
                        if (!((var5_4 = var1_1.w(var2_2)) instanceof P0)) break block5;
                        if (var3_3 >= b.f.get((Object)this)) break block6;
                        if (!var1_1.r(var2_2, var5_4, new o((P0)var5_4))) ** GOTO lbl-1000
                        return true;
                    }
                    if (!var1_1.r(var2_2, var5_4, c.p())) ** GOTO lbl-1000
                    if (this.o0(var5_4, var1_1, var2_2)) {
                        var1_1.A(var2_2, c.d);
                        return true;
                    }
                    var1_1.A(var2_2, c.j());
                    var1_1.x(var2_2, false);
                    return false;
                }
                if (var5_4 == c.j()) {
                    return false;
                }
                if (var5_4 != null) break block7;
                if (!var1_1.r(var2_2, var5_4, c.k())) ** GOTO lbl-1000
                return true;
            }
            if (var5_4 == c.d) {
                return true;
            }
            if (var5_4 == c.o()) return true;
            if (var5_4 == c.f()) return true;
            if (var5_4 == c.i()) {
                return true;
            }
            if (var5_4 != c.z()) continue;
            return true;
        } while (var5_4 == c.q());
        var1_1 = new StringBuilder();
        var1_1.append("Unexpected cell state: ");
        var1_1.append(var5_4);
        throw new IllegalStateException(var1_1.toString().toString());
    }

    public final boolean r(long l8) {
        if (l8 >= this.D() && l8 >= this.G() + (long)this.b) {
            return false;
        }
        return true;
    }

    public final Object r0(i i8, int n8, long l8, Object object) {
        Object object2 = i8.w(n8);
        if (object2 == null) {
            if (l8 >= (e.get((Object)this) & 0xFFFFFFFFFFFFFFFL)) {
                if (object == null) {
                    return c.s();
                }
                if (i8.r(n8, object2, object)) {
                    this.z();
                    return c.r();
                }
            }
        } else if (object2 == c.d && i8.r(n8, object2, c.f())) {
            this.z();
            return i8.y(n8);
        }
        return this.s0(i8, n8, l8, object);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void s(i var1_1, long var2_2) {
        var6_3 = l.b(null, 1, null);
        var5_4 = var1_1;
        var1_1 = var6_3;
        block0 : do {
            var6_3 = var1_1;
            if (var5_4 == null) ** GOTO lbl16
            var4_5 = c.b - 1;
            do {
                block5 : {
                    block8 : {
                        block7 : {
                            block6 : {
                                if (-1 >= var4_5) break block6;
                                var6_3 = var1_1;
                                if (var5_4.q * (long)c.b + (long)var4_5 < var2_2) break block7;
                                break block8;
                            }
                            var5_4 = (i)var5_4.g();
                            continue block0;
                        }
                        if (var6_3 == null) return;
                        if (!(var6_3 instanceof ArrayList)) {
                            this.j0((P0)var6_3);
                            return;
                        }
                        Intrinsics.c(var6_3, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                        var1_1 = (ArrayList)var6_3;
                        var4_5 = var1_1.size() - 1;
                        while (-1 < var4_5) {
                            this.j0((P0)var1_1.get(var4_5));
                            --var4_5;
                        }
                        return;
                    }
                    do lbl-1000: // 4 sources:
                    {
                        block10 : {
                            block9 : {
                                if ((var7_6 = var5_4.w(var4_5)) == null || var7_6 == c.k()) continue;
                                if (!(var7_6 instanceof o)) break block9;
                                if (!var5_4.r(var4_5, var7_6, c.z())) ** GOTO lbl-1000
                                var6_3 = ((o)var7_6).a;
                                break block10;
                            }
                            var6_3 = var1_1;
                            if (!(var7_6 instanceof P0)) break block5;
                            if (!var5_4.r(var4_5, var7_6, c.z())) ** GOTO lbl-1000
                            var6_3 = var7_6;
                        }
                        var6_3 = l.c(var1_1, var6_3);
                        var5_4.x(var4_5, true);
                        break block5;
                    } while (!var5_4.r(var4_5, var7_6, c.z()));
                    var5_4.p();
                    var6_3 = var1_1;
                }
                --var4_5;
                var1_1 = var6_3;
            } while (true);
            break;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final Object s0(i var1_1, int var2_2, long var3_3, Object var5_4) {
        do lbl-1000: // 5 sources:
        {
            block8 : {
                block6 : {
                    block7 : {
                        if ((var7_5 = var1_1.w(var2_2)) == null || var7_5 == c.k()) break block6;
                        if (var7_5 != c.d) break block7;
                        if (!var1_1.r(var2_2, var7_5, c.f())) ** GOTO lbl-1000
                        this.z();
                        return var1_1.y(var2_2);
                    }
                    if (var7_5 == c.j()) {
                        return c.h();
                    }
                    if (var7_5 == c.o()) {
                        return c.h();
                    }
                    if (var7_5 == c.z()) {
                        this.z();
                        return c.h();
                    }
                    if (var7_5 == c.p() || !var1_1.r(var2_2, var7_5, c.q())) ** GOTO lbl-1000
                    var6_6 = var7_5 instanceof o;
                    var5_4 = var7_5;
                    if (var6_6) {
                        var5_4 = ((o)var7_5).a;
                    }
                    if (this.o0(var5_4, var1_1, var2_2)) {
                        var1_1.A(var2_2, c.f());
                        this.z();
                        return var1_1.y(var2_2);
                    }
                    var1_1.A(var2_2, c.j());
                    var1_1.x(var2_2, false);
                    if (var6_6 == false) return c.h();
                    this.z();
                    return c.h();
                }
                if (var3_3 >= (b.e.get((Object)this) & 0xFFFFFFFFFFFFFFFL)) break block8;
                if (!var1_1.r(var2_2, var7_5, c.o())) ** GOTO lbl-1000
                this.z();
                return c.h();
            }
            if (var5_4 != null) continue;
            return c.s();
        } while (!var1_1.r(var2_2, var7_5, var5_4));
        this.z();
        return c.r();
    }

    public final i t() {
        Object object = k.get((Object)this);
        i i8 = (i)i.get((Object)this);
        Object object2 = object;
        if (i8.q > ((i)object).q) {
            object2 = i8;
        }
        i8 = (i)j.get((Object)this);
        object = object2;
        if (i8.q > ((i)object2).q) {
            object = i8;
        }
        return (i)u6.d.b((u6.e)object);
    }

    public final int t0(i i8, int n8, Object object, long l8, Object object2, boolean bl) {
        i8.B(n8, object);
        if (bl) {
            return this.u0(i8, n8, object, l8, object2, bl);
        }
        Object object3 = i8.w(n8);
        if (object3 == null) {
            if (this.r(l8)) {
                if (i8.r(n8, null, c.d)) {
                    return 1;
                }
            } else {
                if (object2 == null) {
                    return 3;
                }
                if (i8.r(n8, null, object2)) {
                    return 2;
                }
            }
        } else if (object3 instanceof P0) {
            i8.s(n8);
            if (this.n0(object3, object)) {
                i8.A(n8, c.f());
                this.c0();
                return 0;
            }
            if (i8.t(n8, c.i()) != c.i()) {
                i8.x(n8, true);
            }
            return 5;
        }
        return this.u0(i8, n8, object, l8, object2, bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        StringBuilder stringBuilder;
        Object object;
        long l8;
        int n8;
        long l9;
        long l10;
        Object object2;
        block18 : {
            block19 : {
                block17 : {
                    stringBuilder = new StringBuilder();
                    n8 = (int)(e.get((Object)this) >> 60);
                    if (n8 == 2) break block17;
                    if (n8 != 3) break block18;
                    object2 = "cancelled,";
                    break block19;
                }
                object2 = "closed,";
            }
            stringBuilder.append((String)object2);
        }
        object2 = new StringBuilder();
        object2.append("capacity=");
        object2.append(this.b);
        object2.append(',');
        stringBuilder.append(object2.toString());
        stringBuilder.append("data=[");
        Object object3 = (Iterable)W5.m.i(j.get((Object)this), i.get((Object)this), k.get((Object)this));
        object2 = new ArrayList();
        object3 = object3.iterator();
        while (object3.hasNext()) {
            object = object3.next();
            if ((i)object == c.n()) continue;
            object2.add(object);
        }
        Iterator iterator = object2.iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        object3 = iterator.next();
        if (!iterator.hasNext()) {
            object2 = object3;
        } else {
            l10 = ((i)object3).q;
            do {
                object = iterator.next();
                l9 = ((i)object).q;
                object2 = object3;
                l8 = l10;
                if (l10 > l9) {
                    object2 = object;
                    l8 = l9;
                }
                object3 = object2;
                l10 = l8;
            } while (iterator.hasNext());
        }
        object3 = (i)object2;
        l10 = this.G();
        l8 = this.I();
        block2 : do {
            int n9 = c.b;
            for (n8 = 0; n8 < n9; ++n8) {
                l9 = object3.q * (long)c.b + (long)n8;
                long l11 = l9 LCMP l8;
                if (l11 >= 0 && l9 >= l10) break block2;
                object2 = object3.w(n8);
                object = object3.v(n8);
                if (object2 instanceof p6.l) {
                    long l12 = l9 LCMP l10;
                    object2 = l12 < 0 && l11 >= 0 ? "receive" : (l11 < 0 && l12 >= 0 ? "send" : "cont");
                } else if (object2 instanceof o) {
                    iterator = new StringBuilder();
                    iterator.append("EB(");
                    iterator.append(object2);
                    iterator.append(')');
                    object2 = iterator.toString();
                } else if (Intrinsics.a(object2, c.q()) || Intrinsics.a(object2, c.p())) {
                    object2 = "resuming_sender";
                } else {
                    if (object2 == null || Intrinsics.a(object2, c.k()) || Intrinsics.a(object2, c.f()) || Intrinsics.a(object2, c.o()) || Intrinsics.a(object2, c.i()) || Intrinsics.a(object2, c.j()) || Intrinsics.a(object2, c.z())) continue;
                    object2 = object2.toString();
                }
                if (object != null) {
                    iterator = new StringBuilder();
                    iterator.append('(');
                    iterator.append((String)object2);
                    iterator.append(',');
                    iterator.append(object);
                    iterator.append("),");
                    object2 = iterator.toString();
                } else {
                    object = new StringBuilder();
                    object.append((String)object2);
                    object.append(',');
                    object2 = object.toString();
                }
                stringBuilder.append((String)object2);
            }
        } while ((object3 = (i)object3.e()) != null);
        if (kotlin.text.i.h0((CharSequence)stringBuilder) == ',') {
            Intrinsics.checkNotNullExpressionValue((Object)stringBuilder.deleteCharAt(stringBuilder.length() - 1), "this.deleteCharAt(index)");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean u(Throwable throwable, boolean bl) {
        if (bl) {
            this.W();
        }
        boolean bl2 = u.b.a(l, this, c.l(), (Object)throwable);
        if (bl) {
            this.X();
        } else {
            this.Y();
        }
        this.x();
        this.a0();
        if (bl2) {
            this.M();
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int u0(i var1_1, int var2_2, Object var3_3, long var4_4, Object var6_5, boolean var7_6) {
        block7 : {
            do lbl-1000: // 5 sources:
            {
                block8 : {
                    block10 : {
                        block9 : {
                            if ((var8_7 = var1_1.w(var2_2)) != null) break block8;
                            if (!this.r(var4_4) || var7_6) break block9;
                            if (!var1_1.r(var2_2, null, c.d)) ** GOTO lbl-1000
                            return 1;
                        }
                        if (!var7_6) break block10;
                        if (!var1_1.r(var2_2, null, c.j())) ** GOTO lbl-1000
                        var1_1.x(var2_2, false);
                        return 4;
                    }
                    if (var6_5 == null) {
                        return 3;
                    }
                    if (!var1_1.r(var2_2, null, var6_5)) ** GOTO lbl-1000
                    return 2;
                }
                if (var8_7 != c.k()) break block7;
            } while (!var1_1.r(var2_2, var8_7, c.d));
            return 1;
        }
        if (var8_7 == c.i()) {
            var1_1.s(var2_2);
            return 5;
        }
        if (var8_7 == c.o()) {
            var1_1.s(var2_2);
            return 5;
        }
        var6_5 = c.z();
        var1_1.s(var2_2);
        if (var8_7 == var6_5) {
            this.x();
            return 4;
        }
        var6_5 = var8_7;
        if (var8_7 instanceof o) {
            var6_5 = ((o)var8_7).a;
        }
        if (this.n0(var6_5, var3_3)) {
            var1_1.A(var2_2, c.f());
            this.c0();
            return 0;
        }
        if (var1_1.t(var2_2, c.i()) == c.i()) return 5;
        var1_1.x(var2_2, true);
        return 5;
    }

    public final void v(long l8) {
        this.i0(this.w(l8));
    }

    public final void v0(long l8) {
        long l9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        do {
            if ((l9 = atomicLongFieldUpdater.get((Object)this)) < l8) continue;
            return;
        } while (!f.compareAndSet((Object)this, l9, l8));
    }

    public final i w(long l8) {
        long l9;
        i i8 = this.t();
        if (this.T() && (l9 = this.V(i8)) != -1L) {
            this.y(l9);
        }
        this.s(i8, l8);
        return i8;
    }

    public final void w0(long l8) {
        long l9;
        long l10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        do {
            if ((l10 = 0xFFFFFFFFFFFFFFFL & (l9 = atomicLongFieldUpdater.get((Object)this))) < l8) continue;
            return;
        } while (!e.compareAndSet((Object)this, l9, l10 = c.b(l10, (int)(l9 >> 60))));
    }

    public final void x() {
        this.R();
    }

    public final void x0(long l8) {
        int n8;
        if (this.U()) {
            return;
        }
        while (this.D() <= l8) {
        }
        int n9 = c.g();
        for (n8 = 0; n8 < n9; ++n8) {
            l8 = this.D();
            if (l8 != (0x3FFFFFFFFFFFFFFFL & h.get((Object)this)) || l8 != this.D()) continue;
            return;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        while (!atomicLongFieldUpdater.compareAndSet((Object)this, l8 = atomicLongFieldUpdater.get((Object)this), c.a(l8 & 0x3FFFFFFFFFFFFFFFL, true))) {
        }
        do {
            l8 = this.D();
            atomicLongFieldUpdater = h;
            long l9 = atomicLongFieldUpdater.get((Object)this);
            long l10 = l9 & 0x3FFFFFFFFFFFFFFFL;
            n8 = (0x4000000000000000L & l9) != 0L ? 1 : 0;
            if (l8 == l10 && l8 == this.D()) {
                while (!atomicLongFieldUpdater.compareAndSet((Object)this, l8 = atomicLongFieldUpdater.get((Object)this), c.a(l8 & 0x3FFFFFFFFFFFFFFFL, false))) {
                }
                return;
            }
            if (n8 != 0) continue;
            atomicLongFieldUpdater.compareAndSet((Object)this, l9, c.a(l10, true));
        } while (true);
    }

    public final void y(long l8) {
        Object object = (i)j.get((Object)this);
        do {
            long l9;
            Object object2;
            if (l8 < Math.max((long)((long)this.b + (l9 = (object2 = f).get((Object)this))), (long)this.D())) {
                return;
            }
            if (!object2.compareAndSet((Object)this, l9, l9 + 1L)) continue;
            int n8 = c.b;
            long l10 = l9 / (long)n8;
            n8 = (int)(l9 % (long)n8);
            object2 = object;
            if (object.q != l10 && (object2 = this.B(l10, (i)object)) == null) continue;
            Object object3 = this.r0((i)object2, n8, l9, null);
            if (object3 == c.h()) {
                object = object2;
                if (l9 >= this.I()) continue;
                object2.b();
                object = object2;
                continue;
            }
            object2.b();
            g6.l l11 = this.c;
            object = object2;
            if (l11 == null) continue;
            object = x.d(l11, object3, null, 2, null);
            if (object != null) break;
            object = object2;
        } while (true);
        throw object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void z() {
        if (this.U()) {
            return;
        }
        var11_1 = (i)b.k.get((Object)this);
        do lbl-1000: // 3 sources:
        {
            var2_3 = b.g.getAndIncrement((Object)this);
            var1_2 = c.b;
            var4_4 = var2_3 / (long)var1_2;
            var6_5 = this.I();
            var8_6 = var11_1.q;
            if (var6_5 <= var2_3) {
                if (var8_6 < var4_4 && var11_1.e() != null) {
                    this.Z(var4_4, var11_1);
                }
                b.L(this, 0L, 1, null);
                return;
            }
            var12_8 = var11_1;
            if (var8_6 != var4_4 && (var12_8 = this.A(var4_4, var11_1, var2_3)) == null) ** GOTO lbl-1000
            var10_7 = this.p0(var12_8, (int)(var2_3 % (long)var1_2), var2_3);
            b.L(this, 0L, 1, null);
            var11_1 = var12_8;
        } while (!var10_7);
    }

    public final class a
    implements e,
    P0 {
        public Object o;
        public m p;

        public a() {
            this.o = c.m();
        }

        public static final /* synthetic */ void c(a a8) {
            a8.h();
        }

        public static final /* synthetic */ void d(a a8, m m8) {
            a8.p = m8;
        }

        public static final /* synthetic */ void e(a a8, Object object) {
            a8.o = object;
        }

        @Override
        public void a(C c8, int n8) {
            m m8 = this.p;
            if (m8 != null) {
                m8.a(c8, n8);
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public Object b(X5.d d8) {
            int n8;
            long l8;
            Object object;
            boolean bl;
            b b8 = b.this;
            Object object2 = (i)j.get((Object)b8);
            do {
                if (b8.P()) {
                    bl = this.g();
                    do {
                        return Z5.b.a(bl);
                        break;
                    } while (true);
                }
                l8 = f.getAndIncrement((Object)b8);
                n8 = c.b;
                long l9 = l8 / (long)n8;
                n8 = (int)(l8 % (long)n8);
                if (object2.q != l9) {
                    object = b8.B(l9, (i)object2);
                    if (object == null) continue;
                    object2 = object;
                }
                if ((object = b8.r0((i)object2, n8, l8, null)) == c.r()) throw new IllegalStateException("unreachable".toString());
                if (object != c.h()) break;
                if (l8 >= b8.I()) continue;
                object2.b();
            } while (true);
            if (object == c.s()) {
                return this.f((i)object2, n8, l8, d8);
            }
            object2.b();
            this.o = object;
            bl = true;
            return Z5.b.a(bl);
        }

        /*
         * Exception decompiling
         */
        public final Object f(i var1_1, int var2_3, long var3_4, X5.d var5_5) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:397)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:475)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
            // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
            // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
            // org.benf.cfr.reader.Main.doJar(Main.java:134)
            // org.benf.cfr.reader.Main.main(Main.java:189)
            throw new IllegalStateException("Decompilation failed");
        }

        public final boolean g() {
            this.o = c.z();
            Throwable throwable = b.this.E();
            if (throwable == null) {
                return false;
            }
            throw E.a(throwable);
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void h() {
            m m8 = this.p;
            Intrinsics.b(m8);
            this.p = null;
            this.o = c.z();
            Object object = b.this.E();
            if (object == null) {
                object = n.o;
                object = Boolean.FALSE;
            } else {
                n.a a8 = n.o;
                object = V5.o.a((Throwable)object);
            }
            m8.resumeWith(n.a(object));
        }

        public final boolean i(Object object) {
            m m8 = this.p;
            Intrinsics.b(m8);
            g6.l l8 = null;
            this.p = null;
            this.o = object;
            Boolean bl = Boolean.TRUE;
            g6.l l9 = b.this.c;
            if (l9 != null) {
                l8 = x.a(l9, object, m8.getContext());
            }
            return c.u(m8, (Object)bl, l8);
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void j() {
            m m8 = this.p;
            Intrinsics.b(m8);
            this.p = null;
            this.o = c.z();
            Object object = b.this.E();
            if (object == null) {
                object = n.o;
                object = Boolean.FALSE;
            } else {
                n.a a8 = n.o;
                object = V5.o.a((Throwable)object);
            }
            m8.resumeWith(n.a(object));
        }

        @Override
        public Object next() {
            Object object = this.o;
            if (object != c.m()) {
                this.o = c.m();
                if (object != c.z()) {
                    return object;
                }
                throw E.a(b.this.F());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

}

