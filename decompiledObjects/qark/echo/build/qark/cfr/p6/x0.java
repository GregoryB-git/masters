/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.IdentityHashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package p6;

import X5.d;
import X5.g;
import Z5.h;
import g6.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import p6.C;
import p6.C0;
import p6.D0;
import p6.F0;
import p6.G0;
import p6.M;
import p6.X;
import p6.Z;
import p6.k0;
import p6.l;
import p6.l0;
import p6.m;
import p6.o;
import p6.o0;
import p6.p0;
import p6.q0;
import p6.r;
import p6.r0;
import p6.s;
import p6.s0;
import p6.t;
import p6.w0;
import p6.y0;
import p6.z;
import u6.F;
import u6.q;
import u6.y;

public class x0
implements q0,
t,
F0 {
    public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, (String)"_state");
    public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, (String)"_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public x0(boolean bl) {
        Z z8 = bl ? y0.c() : y0.d();
        this._state = z8;
    }

    public static /* synthetic */ CancellationException z0(x0 x02, Throwable throwable, String string2, int n8, Object object) {
        if (object == null) {
            if ((n8 & 1) != 0) {
                string2 = null;
            }
            return x02.y0(throwable, string2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    public final boolean A(final Object object, C0 c02, w0 w02) {
        boolean bl;
        block1 : {
            int n8;
            object = new q.a(w02){

                public Object f(q q8) {
                    if (this.b0() == object) {
                        return null;
                    }
                    return u6.p.a();
                }
            };
            do {
                n8 = c02.p().u(w02, c02, (q.a)object);
                bl = true;
                if (n8 == 1) break block1;
            } while (n8 != 2);
            bl = false;
        }
        return bl;
    }

    public final String A0() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.l0());
        stringBuilder.append('{');
        stringBuilder.append(this.x0(this.b0()));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final boolean B0(l0 l02, Object object) {
        if (!u.b.a(o, this, l02, y0.g(object))) {
            return false;
        }
        this.p0(null);
        this.q0(object);
        this.P(l02, object);
        return true;
    }

    public final boolean C0(l0 l02, Throwable throwable) {
        C0 c02 = this.Z(l02);
        if (c02 == null) {
            return false;
        }
        c c8 = new c(c02, false, throwable);
        if (!u.b.a(o, this, l02, c8)) {
            return false;
        }
        this.n0(c02, throwable);
        return true;
    }

    public final Object D0(Object object, Object object2) {
        if (!(object instanceof l0)) {
            return y0.a();
        }
        if ((object instanceof Z || object instanceof w0) && !(object instanceof s) && !(object2 instanceof z)) {
            if (this.B0((l0)object, object2)) {
                return object2;
            }
            return y0.b();
        }
        return this.E0((l0)object, object2);
    }

    public final void E(Throwable throwable, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set set = Collections.newSetFromMap((Map)new IdentityHashMap(list.size()));
        for (Throwable throwable2 : list) {
            if (throwable2 == throwable || throwable2 == throwable || throwable2 instanceof CancellationException || !set.add((Object)throwable2)) continue;
            V5.a.a(throwable, throwable2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object E0(l0 object, Object object2) {
        c c8;
        block11 : {
            C0 c02 = this.Z((l0)object);
            if (c02 == null) {
                return y0.b();
            }
            boolean bl = object instanceof c;
            V5.t t8 = null;
            Object object3 = bl ? (c)object : null;
            c8 = object3;
            if (object3 == null) {
                c8 = new c(c02, false, null);
            }
            u u8 = new u();
            // MONITORENTER : c8
            if (c8.h()) {
                object = y0.a();
                // MONITOREXIT : c8
                return object;
            }
            c8.k(true);
            if (c8 != object && !u.b.a(o, this, object, c8)) {
                object = y0.b();
                // MONITOREXIT : c8
                return object;
            }
            bl = c8.f();
            object3 = object2 instanceof z ? (z)object2 : null;
            if (object3 != null) {
                c8.b(object3.a);
            }
            Throwable throwable = c8.e();
            object3 = t8;
            if (true ^ bl) {
                object3 = throwable;
            }
            u8.o = object3;
            t8 = V5.t.a;
            // MONITOREXIT : c8
            if (object3 == null) break block11;
            this.n0(c02, (Throwable)object3);
        }
        if ((object = this.T((l0)object)) == null) return this.S(c8, object2);
        if (!this.F0(c8, (s)object, object2)) return this.S(c8, object2);
        return y0.b;
    }

    public void F(Object object) {
    }

    public final boolean F0(c c8, s s8, Object object) {
        s s9;
        do {
            if (q0.a.d(s8.s, false, false, new b(this, c8, s8, object), 1, null) != D0.o) {
                return true;
            }
            s8 = s9 = this.m0(s8);
        } while (s9 != null);
        return false;
    }

    public final Object G(d d8) {
        Object object;
        do {
            if ((object = this.b0()) instanceof l0) continue;
            if (!(object instanceof z)) {
                return y0.h(object);
            }
            throw ((z)object).a;
        } while (this.w0(object) < 0);
        return this.H(d8);
    }

    public final Object H(d d8) {
        Object object = new a(Y5.b.b(d8), this);
        object.z();
        o.a((l)object, this.e(new G0((m)object)));
        object = object.w();
        if (object == Y5.b.c()) {
            h.c(d8);
        }
        return object;
    }

    public final boolean I(Throwable throwable) {
        return this.J((Object)throwable);
    }

    public final boolean J(Object object) {
        Object object2;
        Object object3 = y0.a();
        if (this.Y()) {
            object3 = object2 = this.L(object);
            if (object2 == y0.b) {
                return true;
            }
        }
        object2 = object3;
        if (object3 == y0.a()) {
            object2 = this.h0(object);
        }
        if (object2 == y0.a()) {
            return true;
        }
        if (object2 == y0.b) {
            return true;
        }
        if (object2 == y0.f()) {
            return false;
        }
        this.F(object2);
        return true;
    }

    public void K(Throwable throwable) {
        this.J((Object)throwable);
    }

    public final Object L(Object object) {
        Object object2;
        while (!(!((object2 = this.b0()) instanceof l0) || object2 instanceof c && ((c)object2).h())) {
            if ((object2 = this.D0(object2, new z(this.R(object), false, 2, null))) == y0.b()) continue;
            return object2;
        }
        return y0.a();
    }

    public final boolean M(Throwable throwable) {
        boolean bl = this.g0();
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        bl = throwable instanceof CancellationException;
        r r8 = this.a0();
        if (r8 != null) {
            if (r8 == D0.o) {
                return bl;
            }
            if (!r8.d(throwable)) {
                if (bl) {
                    return true;
                }
                bl2 = false;
            }
            return bl2;
        }
        return bl;
    }

    public String N() {
        return "Job was cancelled";
    }

    public boolean O(Throwable throwable) {
        if (throwable instanceof CancellationException) {
            return true;
        }
        if (this.J((Object)throwable) && this.X()) {
            return true;
        }
        return false;
    }

    public final void P(l0 l02, Object object) {
        r r8 = this.a0();
        if (r8 != null) {
            r8.b();
            this.v0(D0.o);
        }
        boolean bl = object instanceof z;
        r8 = null;
        object = bl ? (z)object : null;
        if (object != null) {
            r8 = object.a;
        }
        if (l02 instanceof w0) {
            try {
                ((w0)l02).v((Throwable)r8);
                return;
            }
            catch (Throwable throwable) {
                r8 = new StringBuilder();
                r8.append("Exception in completion handler ");
                r8.append((Object)l02);
                r8.append(" for ");
                r8.append((Object)this);
                this.d0((Throwable)new C(r8.toString(), throwable));
                return;
            }
        }
        if ((l02 = l02.g()) != null) {
            this.o0((C0)l02, (Throwable)r8);
        }
    }

    public final void Q(c c8, s s8, Object object) {
        if ((s8 = this.m0(s8)) != null && this.F0(c8, s8, object)) {
            return;
        }
        this.F(this.S(c8, object));
    }

    public final Throwable R(Object object) {
        if (object == null || object instanceof Throwable) {
            Throwable throwable = (Throwable)object;
            object = throwable;
            if (throwable == null) {
                return new r0(this.N(), null, this);
            }
        } else {
            Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
            object = ((F0)object).q();
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object S(c c8, Object object) {
        z z8 = object instanceof z ? (z)object : null;
        z8 = z8 != null ? z8.a : null;
        // MONITORENTER : c8
        boolean bl = c8.f();
        List list = c8.j((Throwable)z8);
        Throwable throwable = this.W(c8, list);
        if (throwable != null) {
            this.E(throwable, list);
        }
        if (throwable != null && throwable != z8) {
            object = new z(throwable, false, 2, null);
        }
        if (throwable != null && (this.M(throwable) || this.c0(throwable))) {
            Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((z)object).b();
        }
        if (!bl) {
            this.p0(throwable);
        }
        this.q0(object);
        u.b.a(o, this, c8, y0.g(object));
        this.P(c8, object);
        return object;
    }

    public final s T(l0 l02) {
        boolean bl = l02 instanceof s;
        Object var4_3 = null;
        q q8 = bl ? (s)l02 : null;
        if (q8 == null) {
            q8 = l02.g();
            l02 = var4_3;
            if (q8 != null) {
                return this.m0(q8);
            }
        } else {
            l02 = q8;
        }
        return l02;
    }

    public final Object U() {
        Object object = this.b0();
        if (object instanceof l0 ^ true) {
            if (!(object instanceof z)) {
                return y0.h(object);
            }
            throw ((z)object).a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final Throwable V(Object object) {
        boolean bl = object instanceof z;
        Throwable throwable = null;
        object = bl ? (z)object : null;
        if (object != null) {
            throwable = object.a;
        }
        return throwable;
    }

    public final Throwable W(c object, List list) {
        boolean bl = list.isEmpty();
        Object var4_4 = null;
        if (bl) {
            if (object.f()) {
                return new r0(this.N(), null, this);
            }
            return null;
        }
        Iterator iterator = ((Iterable)list).iterator();
        do {
            object = var4_4;
        } while (iterator.hasNext() && !((Throwable)(object = iterator.next()) instanceof CancellationException ^ true));
        if ((object = (Throwable)object) != null) {
            return object;
        }
        return (Throwable)list.get(0);
    }

    public boolean X() {
        return true;
    }

    public boolean Y() {
        return false;
    }

    public final C0 Z(l0 l02) {
        C0 c02 = l02.g();
        if (c02 == null) {
            if (l02 instanceof Z) {
                return new C0();
            }
            if (l02 instanceof w0) {
                this.t0((w0)l02);
                return null;
            }
            c02 = new StringBuilder();
            c02.append("State should have list: ");
            c02.append((Object)l02);
            throw new IllegalStateException(c02.toString().toString());
        }
        return c02;
    }

    @Override
    public boolean a() {
        Object object = this.b0();
        if (object instanceof l0 && ((l0)object).a()) {
            return true;
        }
        return false;
    }

    public final r a0() {
        return (r)p.get((Object)this);
    }

    @Override
    public g.b b(g.c c8) {
        return q0.a.c(this, c8);
    }

    public final Object b0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        Object object;
        while ((object = atomicReferenceFieldUpdater.get((Object)this)) instanceof y) {
            ((y)object).a(this);
        }
        return object;
    }

    public boolean c0(Throwable throwable) {
        return false;
    }

    public void d0(Throwable throwable) {
        throw throwable;
    }

    @Override
    public final X e(g6.l l8) {
        return this.v(false, true, l8);
    }

    public final void e0(q0 object) {
        if (object == null) {
            this.v0(D0.o);
            return;
        }
        object.start();
        object = object.r(this);
        this.v0((r)object);
        if (this.f0()) {
            object.b();
            this.v0(D0.o);
        }
    }

    public final boolean f0() {
        return this.b0() instanceof l0 ^ true;
    }

    public boolean g0() {
        return false;
    }

    @Override
    public final g.c getKey() {
        return q0.n;
    }

    @Override
    public q0 getParent() {
        r r8 = this.a0();
        if (r8 != null) {
            return r8.getParent();
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object h0(Object var1_1) {
        var5_3 = null;
        var3_4 = null;
        do lbl-1000: // 3 sources:
        {
            block11 : {
                if ((var6_6 = this.b0()) instanceof c) {
                    // MONITORENTER : var6_6
                    if (((c)var6_6).i()) {
                        var1_1 = y0.f();
                        // MONITOREXIT : var6_6
                        return var1_1;
                    }
                    var2_8 = ((c)var6_6).f();
                    if (var1_1 != null || !var2_8) {
                        var4_5 = var3_4;
                        if (var3_4 == null) {
                            var4_5 = this.R(var1_1);
                        }
                        ((c)var6_6).b(var4_5);
                    }
                    var3_4 = ((c)var6_6).e();
                    var1_1 = var5_3;
                    if (var2_8 ^ true) {
                        var1_1 = var3_4;
                    }
                    // MONITOREXIT : var6_6
                    if (var1_1 == null) return y0.a();
                    this.n0(((c)var6_6).g(), (Throwable)var1_1);
                    return y0.a();
                }
                if (var6_6 instanceof l0 == false) return y0.f();
                var4_5 = var3_4;
                if (var3_4 == null) {
                    var4_5 = this.R(var1_1);
                }
                if (!(var7_7 = (l0)var6_6).a()) break block11;
                var3_4 = var4_5;
                if (!this.C0((l0)var7_7, var4_5)) ** GOTO lbl-1000
                return y0.a();
            }
            var7_7 = this.D0(var6_6, new z(var4_5, false, 2, null));
            if (var7_7 == y0.a()) {
                var1_1 = new StringBuilder();
                var1_1.append("Cannot happen in ");
                var1_1.append(var6_6);
                throw new IllegalStateException(var1_1.toString().toString());
            }
            var3_4 = var4_5;
        } while (var7_7 == y0.b());
        return var7_7;
    }

    public final boolean i0(Object object) {
        Object object2;
        do {
            if ((object2 = this.D0(this.b0(), object)) == y0.a()) {
                return false;
            }
            if (object2 != y0.b) continue;
            return true;
        } while (object2 == y0.b());
        this.F(object2);
        return true;
    }

    public final Object j0(Object object) {
        Object object2;
        while ((object2 = this.D0(this.b0(), object)) != y0.a()) {
            if (object2 == y0.b()) continue;
            return object2;
        }
        object2 = new StringBuilder();
        object2.append("Job ");
        object2.append((Object)this);
        object2.append(" is already complete or completing, but is being completed with ");
        object2.append(object);
        throw new IllegalStateException(object2.toString(), this.V(object));
    }

    @Override
    public g k(g g8) {
        return q0.a.f(this, g8);
    }

    public final w0 k0(g6.l l8, boolean bl) {
        w0 w02 = null;
        s0 s02 = null;
        if (bl) {
            if (l8 instanceof s0) {
                s02 = (s0)l8;
            }
            w02 = s02;
            if (s02 == null) {
                w02 = new o0(l8);
            }
        } else {
            if (l8 instanceof w0) {
                w02 = (w0)l8;
            }
            if (w02 == null) {
                w02 = new p0(l8);
            }
        }
        w02.x(this);
        return w02;
    }

    public String l0() {
        return M.a(this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final s m0(q var1_1) {
        do {
            var2_2 = var1_1;
            if (!var1_1.q()) break;
            var1_1 = var1_1.p();
        } while (true);
        do lbl-1000: // 3 sources:
        {
            var2_2 = var1_1 = var2_2.o();
            if (var1_1.q()) ** GOTO lbl-1000
            if (var1_1 instanceof s) {
                return (s)var1_1;
            }
            var2_2 = var1_1;
        } while (!(var1_1 instanceof C0));
        return null;
    }

    public final void n0(C0 c02, Throwable throwable) {
        this.p0(throwable);
        Object object = c02.n();
        Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        object = (q)object;
        Object object2 = null;
        while (!Intrinsics.a(object, c02)) {
            Object object3 = object2;
            if (object instanceof s0) {
                object3 = (w0)object;
                try {
                    object3.v(throwable);
                    object3 = object2;
                }
                catch (Throwable throwable2) {
                    if (object2 != null) {
                        V5.a.a((Throwable)object2, throwable2);
                        object3 = object2;
                    }
                    object2 = new StringBuilder();
                    object2.append("Exception in completion handler ");
                    object2.append(object3);
                    object2.append(" for ");
                    object2.append((Object)this);
                    object3 = new C(object2.toString(), throwable2);
                    object2 = V5.t.a;
                }
            }
            object = object.o();
            object2 = object3;
        }
        if (object2 != null) {
            this.d0((Throwable)object2);
        }
        this.M(throwable);
    }

    public final void o0(C0 c02, Throwable throwable) {
        Object object = c02.n();
        Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        object = (q)object;
        Object object2 = null;
        while (!Intrinsics.a(object, c02)) {
            Object object3 = object2;
            if (object instanceof w0) {
                object3 = (w0)object;
                try {
                    object3.v(throwable);
                    object3 = object2;
                }
                catch (Throwable throwable2) {
                    if (object2 != null) {
                        V5.a.a((Throwable)object2, throwable2);
                        object3 = object2;
                    }
                    object2 = new StringBuilder();
                    object2.append("Exception in completion handler ");
                    object2.append(object3);
                    object2.append(" for ");
                    object2.append((Object)this);
                    object3 = new C(object2.toString(), throwable2);
                    object2 = V5.t.a;
                }
            }
            object = object.o();
            object2 = object3;
        }
        if (object2 != null) {
            this.d0((Throwable)object2);
        }
    }

    public void p0(Throwable throwable) {
    }

    @Override
    public CancellationException q() {
        Object object;
        block8 : {
            Throwable throwable;
            CancellationException cancellationException;
            block6 : {
                block7 : {
                    block5 : {
                        object = this.b0();
                        boolean bl = object instanceof c;
                        cancellationException = null;
                        if (!bl) break block5;
                        throwable = ((c)object).e();
                        break block6;
                    }
                    if (!(object instanceof z)) break block7;
                    throwable = ((z)object).a;
                    break block6;
                }
                if (object instanceof l0) break block8;
                throwable = null;
            }
            if (throwable instanceof CancellationException) {
                cancellationException = (CancellationException)throwable;
            }
            CancellationException cancellationException2 = cancellationException;
            if (cancellationException == null) {
                cancellationException = new StringBuilder();
                cancellationException.append("Parent job is ");
                cancellationException.append(this.x0(object));
                cancellationException2 = new r0(cancellationException.toString(), throwable, this);
            }
            return cancellationException2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot be cancelling child in this state: ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public void q0(Object object) {
    }

    @Override
    public final r r(t object) {
        object = q0.a.d(this, true, false, new s((t)object), 2, null);
        Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r)object;
    }

    public void r0() {
    }

    @Override
    public final CancellationException s() {
        Object object = this.b0();
        if (object instanceof c) {
            if ((object = ((c)object).e()) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(M.a(this));
                stringBuilder.append(" is cancelling");
                object = this.y0((Throwable)object, stringBuilder.toString());
                if (object != null) {
                    return object;
                }
            }
            object = new StringBuilder();
            object.append("Job is still new or active: ");
            object.append((Object)this);
            throw new IllegalStateException(object.toString().toString());
        }
        if (!(object instanceof l0)) {
            if (object instanceof z) {
                return x0.z0(this, ((z)object).a, null, 1, null);
            }
            object = new StringBuilder();
            object.append(M.a(this));
            object.append(" has completed normally");
            return new r0(object.toString(), null, this);
        }
        object = new StringBuilder();
        object.append("Job is still new or active: ");
        object.append((Object)this);
        throw new IllegalStateException(object.toString().toString());
    }

    public final void s0(Z z8) {
        l0 l02 = new C0();
        if (!z8.a()) {
            l02 = new k0((C0)l02);
        }
        u.b.a(o, this, z8, l02);
    }

    @Override
    public final boolean start() {
        int n8;
        while ((n8 = this.w0(this.b0())) != 0) {
            if (n8 != 1) continue;
            return true;
        }
        return false;
    }

    @Override
    public final void t(F0 f02) {
        this.J(f02);
    }

    public final void t0(w0 w02) {
        w02.j(new C0());
        q q8 = w02.o();
        u.b.a(o, this, w02, q8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.A0());
        stringBuilder.append('@');
        stringBuilder.append(M.b(this));
        return stringBuilder.toString();
    }

    @Override
    public Object u(Object object, p p8) {
        return q0.a.b(this, object, p8);
    }

    public final void u0(w0 w02) {
        Object object;
        while ((object = this.b0()) instanceof w0) {
            if (object != w02) {
                return;
            }
            if (!u.b.a(o, this, object, y0.c())) continue;
            return;
        }
        if (object instanceof l0 && ((l0)object).g() != null) {
            w02.r();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final X v(boolean bl, boolean bl2, g6.l l8) {
        Object object2;
        Object object;
        Object object3;
        w0 w02 = this.k0(l8, bl);
        do {
            if ((object3 = this.b0()) instanceof Z) {
                object = (Z)object3;
                if (object.a()) {
                    if (!u.b.a(o, this, object3, w02)) continue;
                    return w02;
                }
                this.s0((Z)object);
                continue;
            }
            boolean bl3 = object3 instanceof l0;
            object2 = null;
            Throwable throwable = null;
            if (!bl3) break;
            C0 c02 = ((l0)object3).g();
            if (c02 == null) {
                Intrinsics.c(object3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                this.t0((w0)object3);
                continue;
            }
            object2 = D0.o;
            Throwable throwable2 = throwable;
            object = object2;
            if (bl) {
                throwable2 = throwable;
                object = object2;
                if (object3 instanceof c) {
                    block14 : {
                        block15 : {
                            // MONITORENTER : object3
                            throwable2 = ((c)object3).e();
                            if (throwable2 != null) {
                                object = object2;
                                if (!(l8 instanceof s)) break block14;
                                object = object2;
                                if (((c)object3).h()) break block14;
                            }
                            if (bl3 = this.A(object3, c02, w02)) break block15;
                            // MONITOREXIT : object3
                            continue;
                        }
                        if (throwable2 == null) {
                            // MONITOREXIT : object3
                            return w02;
                        }
                        object = w02;
                    }
                    object2 = V5.t.a;
                    // MONITOREXIT : object3
                }
            }
            if (throwable2 != null) {
                if (!bl2) return object;
                l8.invoke((Object)throwable2);
                return object;
            }
            if (this.A(object3, c02, w02)) return w02;
        } while (true);
        if (!bl2) return D0.o;
        object = object3 instanceof z ? (z)object3 : null;
        if (object != null) {
            object2 = object.a;
        }
        l8.invoke(object2);
        return D0.o;
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    public final void v0(r r8) {
        p.set((Object)this, (Object)r8);
    }

    @Override
    public void w(CancellationException cancellationException) {
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException == null) {
            cancellationException2 = new r0(this.N(), null, this);
        }
        this.K((Throwable)cancellationException2);
    }

    public final int w0(Object object) {
        if (object instanceof Z) {
            if (((Z)object).a()) {
                return 0;
            }
            if (!u.b.a(o, this, object, y0.c())) {
                return -1;
            }
            this.r0();
            return 1;
        }
        if (object instanceof k0) {
            if (!u.b.a(o, this, object, ((k0)object).g())) {
                return -1;
            }
            this.r0();
            return 1;
        }
        return 0;
    }

    @Override
    public g x(g.c c8) {
        return q0.a.e(this, c8);
    }

    public final String x0(Object object) {
        boolean bl = object instanceof c;
        String string2 = "Active";
        if (bl) {
            c c8 = (c)object;
            if (c8.f()) {
                return "Cancelling";
            }
            object = string2;
            if (c8.h()) {
                return "Completing";
            }
        } else {
            if (object instanceof l0) {
                if (((l0)object).a()) {
                    return "Active";
                }
                return "New";
            }
            if (object instanceof z) {
                return "Cancelled";
            }
            object = "Completed";
        }
        return object;
    }

    public final CancellationException y0(Throwable throwable, String string2) {
        Object object = throwable instanceof CancellationException ? (CancellationException)throwable : null;
        CancellationException cancellationException = object;
        if (object == null) {
            object = string2;
            if (string2 == null) {
                object = this.N();
            }
            cancellationException = new r0((String)object, throwable, this);
        }
        return cancellationException;
    }

    public static final class a
    extends m {
        public final x0 w;

        public a(d d8, x0 x02) {
            super(d8, 1);
            this.w = x02;
        }

        @Override
        public String G() {
            return "AwaitContinuation";
        }

        @Override
        public Throwable u(q0 q02) {
            Throwable throwable;
            Object object = this.w.b0();
            if (object instanceof c && (throwable = ((c)object).e()) != null) {
                return throwable;
            }
            if (object instanceof z) {
                return ((z)object).a;
            }
            return q02.s();
        }
    }

    public static final class b
    extends w0 {
        public final x0 s;
        public final c t;
        public final s u;
        public final Object v;

        public b(x0 x02, c c8, s s8, Object object) {
            this.s = x02;
            this.t = c8;
            this.u = s8;
            this.v = object;
        }

        @Override
        public void v(Throwable throwable) {
            this.s.Q(this.t, this.u, this.v);
        }
    }

    public static final class c
    implements l0 {
        public static final AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(c.class, (String)"_isCompleting");
        public static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, (String)"_rootCause");
        public static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, (String)"_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;
        public final C0 o;

        public c(C0 c02, boolean bl, Throwable throwable) {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        @Override
        public boolean a() {
            if (this.e() == null) {
                return true;
            }
            return false;
        }

        public final void b(Throwable throwable) {
            Object object = this.e();
            if (object == null) {
                this.m(throwable);
                return;
            }
            if (throwable == object) {
                return;
            }
            object = this.d();
            if (object == null) {
                this.l((Object)throwable);
                return;
            }
            if (object instanceof Throwable) {
                if (throwable == object) {
                    return;
                }
                ArrayList arrayList = this.c();
                arrayList.add(object);
                arrayList.add((Object)throwable);
                this.l((Object)arrayList);
                return;
            }
            if (object instanceof ArrayList) {
                ((ArrayList)object).add((Object)throwable);
                return;
            }
            throwable = new StringBuilder();
            throwable.append("State is ");
            throwable.append(object);
            throw new IllegalStateException(throwable.toString().toString());
        }

        public final ArrayList c() {
            return new ArrayList(4);
        }

        public final Object d() {
            return r.get((Object)this);
        }

        public final Throwable e() {
            return (Throwable)q.get((Object)this);
        }

        public final boolean f() {
            if (this.e() != null) {
                return true;
            }
            return false;
        }

        @Override
        public C0 g() {
            return this.o;
        }

        public final boolean h() {
            if (p.get((Object)this) != 0) {
                return true;
            }
            return false;
        }

        public final boolean i() {
            if (this.d() == y0.e()) {
                return true;
            }
            return false;
        }

        public final List j(Throwable throwable) {
            Object object;
            block8 : {
                ArrayList arrayList;
                block6 : {
                    block7 : {
                        block5 : {
                            object = this.d();
                            if (object != null) break block5;
                            arrayList = this.c();
                            break block6;
                        }
                        if (!(object instanceof Throwable)) break block7;
                        arrayList = this.c();
                        arrayList.add(object);
                        break block6;
                    }
                    if (!(object instanceof ArrayList)) break block8;
                    arrayList = (ArrayList)object;
                }
                object = this.e();
                if (object != null) {
                    arrayList.add(0, object);
                }
                if (throwable != null && !Intrinsics.a((Object)throwable, object)) {
                    arrayList.add((Object)throwable);
                }
                this.l(y0.e());
                return arrayList;
            }
            throwable = new StringBuilder();
            throwable.append("State is ");
            throwable.append(object);
            throw new IllegalStateException(throwable.toString().toString());
        }

        public final void k(boolean bl) {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public final void l(Object object) {
            r.set((Object)this, object);
        }

        public final void m(Throwable throwable) {
            q.set((Object)this, (Object)throwable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Finishing[cancelling=");
            stringBuilder.append(this.f());
            stringBuilder.append(", completing=");
            stringBuilder.append(this.h());
            stringBuilder.append(", rootCause=");
            stringBuilder.append((Object)this.e());
            stringBuilder.append(", exceptions=");
            stringBuilder.append(this.d());
            stringBuilder.append(", list=");
            stringBuilder.append((Object)this.g());
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

}

