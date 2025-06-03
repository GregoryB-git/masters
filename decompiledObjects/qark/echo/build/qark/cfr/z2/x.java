/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.DeadObjectException
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Map
 *  java.util.Queue
 *  java.util.Set
 */
package z2;

import A2.c;
import A2.m;
import A2.n;
import V2.k;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import t.a;
import y2.a;
import y2.d;
import y2.e;
import y2.g;
import z2.B;
import z2.F;
import z2.L;
import z2.M;
import z2.S;
import z2.T;
import z2.b;
import z2.e;
import z2.h;
import z2.o;
import z2.t;
import z2.u;
import z2.w;
import z2.y;
import z2.z;

public final class x
implements e.a,
e.b {
    public final Queue b;
    public final a.f c;
    public final b d;
    public final o e;
    public final Set f;
    public final Map g;
    public final int h;
    public final M i;
    public boolean j;
    public final List k;
    public x2.b l;
    public int m;
    public final /* synthetic */ e n;

    public x(e e8, d d8) {
        a.f f8;
        this.n = e8;
        this.b = new LinkedList();
        this.f = new HashSet();
        this.g = new HashMap();
        this.k = new ArrayList();
        this.l = null;
        this.m = 0;
        this.c = f8 = d8.g(e.r(e8).getLooper(), this);
        this.d = d8.d();
        this.e = new o();
        this.h = d8.f();
        if (f8.m()) {
            this.i = d8.h(e.q(e8), e.r(e8));
            return;
        }
        this.i = null;
    }

    public final void C() {
        n.c(e.r(this.n));
        this.l = null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void D() {
        n.c(e.r(this.n));
        if (this.c.a() != false) return;
        if (this.c.i()) {
            return;
        }
        try {
            var2_1 = this.n;
            var1_5 = e.y((e)var2_1).b(e.q((e)var2_1), this.c);
            if (var1_5 != 0) {
                var2_1 = new x2.b(var1_5, null);
                var3_6 = this.c.getClass().getName();
                var4_8 = var2_1.toString();
                var5_9 = new StringBuilder();
                var5_9.append("The service for ");
                var5_9.append(var3_6);
                var5_9.append(" is not available: ");
                var5_9.append(var4_8);
                Log.w((String)"GoogleApiManager", (String)var5_9.toString());
                this.G((x2.b)var2_1, null);
                return;
            }
        }
        catch (IllegalStateException var2_2) {
            ** GOTO lbl34
        }
        var3_7 = this.n;
        var2_1 = this.c;
        var3_7 = new B((e)var3_7, (a.f)var2_1, this.d);
        if (var2_1.m()) {
            ((M)n.i(this.i)).c1((L)var3_7);
        }
        try {
            this.c.p((c.c)var3_7);
            return;
        }
        catch (SecurityException var2_3) {
            block7 : {
                var3_7 = new x2.b(10);
                break block7;
lbl34: // 1 sources:
                var3_7 = new x2.b(10);
            }
            this.G((x2.b)var3_7, (Exception)var2_4);
            return;
        }
    }

    public final void E(T object) {
        n.c(e.r(this.n));
        if (this.c.a()) {
            if (this.l((T)object)) {
                this.i();
                return;
            }
            this.b.add(object);
            return;
        }
        this.b.add(object);
        object = this.l;
        if (object != null && object.g()) {
            this.G(this.l, null);
            return;
        }
        this.D();
    }

    public final void F() {
        ++this.m;
    }

    public final void G(x2.b object, Exception exception) {
        n.c(e.r(this.n));
        Object object2 = this.i;
        if (object2 != null) {
            object2.d1();
        }
        this.C();
        e.y(this.n).c();
        this.c((x2.b)object);
        if (this.c instanceof C2.e && object.a() != 24) {
            e.C(this.n, true);
            object2 = this.n;
            e.r((e)object2).sendMessageDelayed(e.r((e)object2).obtainMessage(19), 300000L);
        }
        if (object.a() == 4) {
            this.d(e.t());
            return;
        }
        if (this.b.isEmpty()) {
            this.l = object;
            return;
        }
        if (exception != null) {
            n.c(e.r(this.n));
            this.e(null, exception, false);
            return;
        }
        if (e.e(this.n)) {
            this.e(e.u(this.d, (x2.b)object), null, true);
            if (this.b.isEmpty()) {
                return;
            }
            if (this.m((x2.b)object)) {
                return;
            }
            if (!this.n.g((x2.b)object, this.h)) {
                if (object.a() == 18) {
                    this.j = true;
                }
                if (this.j) {
                    object = this.n;
                    e.r((e)object).sendMessageDelayed(Message.obtain((Handler)e.r((e)object), (int)9, (Object)this.d), e.n(this.n));
                    return;
                }
                this.d(e.u(this.d, (x2.b)object));
            }
            return;
        }
        this.d(e.u(this.d, (x2.b)object));
    }

    public final void H(x2.b b8) {
        n.c(e.r(this.n));
        a.f f8 = this.c;
        String string2 = f8.getClass().getName();
        String string3 = String.valueOf((Object)b8);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onSignInFailed for ");
        stringBuilder.append(string2);
        stringBuilder.append(" with ");
        stringBuilder.append(string3);
        f8.f(stringBuilder.toString());
        this.G(b8, null);
    }

    public final void I() {
        n.c(e.r(this.n));
        if (this.j) {
            this.D();
        }
    }

    public final void J() {
        n.c(e.r(this.n));
        this.d(e.F);
        this.e.d();
        h[] arrh = this.g.keySet();
        for (h h8 : (h[])arrh.toArray((Object[])new h[0])) {
            this.E(new S(null, new k()));
        }
        this.c(new x2.b(4));
        if (this.c.a()) {
            this.c.b(new w(this));
        }
    }

    public final void K() {
        n.c(e.r(this.n));
        if (this.j) {
            this.k();
            Object object = this.n;
            object = e.s((e)object).g(e.q((e)object)) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error.");
            this.d((Status)object);
            this.c.f("Timing out connection while resuming.");
        }
    }

    public final boolean L() {
        return this.c.m();
    }

    public final boolean a() {
        return this.p(true);
    }

    public final x2.d b(x2.d[] arrd) {
        if (arrd != null) {
            int n8;
            x2.d d8;
            if (arrd.length == 0) {
                return null;
            }
            Object object = this.c.j();
            int n9 = 0;
            Object object2 = object;
            if (object == null) {
                object2 = new x2.d[]{};
            }
            int n10 = object2.length;
            object = new a(n10);
            for (n8 = 0; n8 < n10; ++n8) {
                d8 = object2[n8];
                object.put((Object)d8.a(), (Object)d8.d());
            }
            n10 = arrd.length;
            for (n8 = n9; n8 < n10; ++n8) {
                object2 = arrd[n8];
                d8 = (Long)object.get((Object)object2.a());
                if (d8 != null) {
                    if (d8.longValue() >= object2.d()) continue;
                    return object2;
                }
                return object2;
            }
        }
        return null;
    }

    public final void c(x2.b b8) {
        Iterator iterator = this.f.iterator();
        if (iterator.hasNext()) {
            android.support.v4.media.a.a(iterator.next());
            if (m.a(b8, x2.b.s)) {
                this.c.k();
            }
            throw null;
        }
        this.f.clear();
    }

    public final void d(Status status) {
        n.c(e.r(this.n));
        this.e(status, null, false);
    }

    public final void e(Status status, Exception exception, boolean bl) {
        n.c(e.r(this.n));
        boolean bl2 = true;
        boolean bl3 = status == null;
        if (exception != null) {
            bl2 = false;
        }
        if (bl3 != bl2) {
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                T t8 = (T)iterator.next();
                if (bl && t8.a != 2) continue;
                if (status != null) {
                    t8.a(status);
                } else {
                    t8.b(exception);
                }
                iterator.remove();
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void f() {
        ArrayList arrayList = new ArrayList((Collection)this.b);
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            T t8 = (T)arrayList.get(i8);
            if (!this.c.a()) {
                return;
            }
            if (!this.l(t8)) continue;
            this.b.remove((Object)t8);
        }
    }

    public final void g() {
        this.C();
        this.c(x2.b.s);
        this.k();
        Iterator iterator = this.g.values().iterator();
        if (!iterator.hasNext()) {
            this.f();
            this.i();
            return;
        }
        android.support.v4.media.a.a(iterator.next());
        throw null;
    }

    public final void h(int n8) {
        this.C();
        this.j = true;
        this.e.c(n8, this.c.l());
        e e8 = this.n;
        e.r(e8).sendMessageDelayed(Message.obtain((Handler)e.r(e8), (int)9, (Object)this.d), e.n(this.n));
        e8 = this.n;
        e.r(e8).sendMessageDelayed(Message.obtain((Handler)e.r(e8), (int)11, (Object)this.d), e.o(this.n));
        e.y(this.n).c();
        e8 = this.g.values().iterator();
        if (!e8.hasNext()) {
            return;
        }
        android.support.v4.media.a.a(e8.next());
        throw null;
    }

    public final void i() {
        e.r(this.n).removeMessages(12, (Object)this.d);
        e e8 = this.n;
        e.r(e8).sendMessageDelayed(e.r(e8).obtainMessage(12, (Object)this.d), e.p(this.n));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(T t8) {
        t8.d(this.e, this.L());
        try {
            t8.c(this);
            return;
        }
        catch (DeadObjectException deadObjectException) {}
        this.n(1);
        this.c.f("DeadObjectException thrown while running ApiCallRunner.");
    }

    public final void k() {
        if (this.j) {
            e.r(this.n).removeMessages(11, (Object)this.d);
            e.r(this.n).removeMessages(9, (Object)this.d);
            this.j = false;
        }
    }

    public final boolean l(T object) {
        if (!(object instanceof F)) {
            this.j((T)object);
            return true;
        }
        Object object2 = (F)object;
        x2.d d8 = this.b(object2.g(this));
        if (d8 == null) {
            this.j((T)object);
            return true;
        }
        object = this.c.getClass().getName();
        String string2 = d8.a();
        long l8 = d8.d();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(" could not execute call because it requires feature (");
        stringBuilder.append(string2);
        stringBuilder.append(", ");
        stringBuilder.append(l8);
        stringBuilder.append(").");
        Log.w((String)"GoogleApiManager", (String)stringBuilder.toString());
        if (e.e(this.n) && object2.f(this)) {
            object = new z(this.d, d8, null);
            int n8 = this.k.indexOf(object);
            if (n8 >= 0) {
                object = (z)this.k.get(n8);
                e.r(this.n).removeMessages(15, object);
                object2 = this.n;
                e.r((e)object2).sendMessageDelayed(Message.obtain((Handler)e.r((e)object2), (int)15, (Object)object), e.n(this.n));
            } else {
                this.k.add(object);
                object2 = this.n;
                e.r((e)object2).sendMessageDelayed(Message.obtain((Handler)e.r((e)object2), (int)15, (Object)object), e.n(this.n));
                object2 = this.n;
                e.r((e)object2).sendMessageDelayed(Message.obtain((Handler)e.r((e)object2), (int)16, (Object)object), e.o(this.n));
                object = new x2.b(2, null);
                if (!this.m((x2.b)object)) {
                    this.n.g((x2.b)object, this.h);
                }
            }
            return false;
        }
        object2.b((Exception)new g(d8));
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean m(x2.b b8) {
        Object object = e.z();
        synchronized (object) {
            try {
                e e8 = this.n;
                if (e.v(e8) != null && e.B(e8).contains((Object)this.d)) {
                    e.v(this.n).s(b8, this.h);
                    return true;
                }
                return false;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public final void n(int n8) {
        if (Looper.myLooper() == e.r(this.n).getLooper()) {
            this.h(n8);
            return;
        }
        e.r(this.n).post((Runnable)new u(this, n8));
    }

    @Override
    public final void o(x2.b b8) {
        this.G(b8, null);
    }

    public final boolean p(boolean bl) {
        n.c(e.r(this.n));
        if (this.c.a() && this.g.size() == 0) {
            if (this.e.e()) {
                if (bl) {
                    this.i();
                }
                return false;
            }
            this.c.f("Timing out service connection.");
            return true;
        }
        return false;
    }

    public final int q() {
        return this.h;
    }

    public final int r() {
        return this.m;
    }

    public final a.f t() {
        return this.c;
    }

    @Override
    public final void v(Bundle bundle) {
        if (Looper.myLooper() == e.r(this.n).getLooper()) {
            this.g();
            return;
        }
        e.r(this.n).post((Runnable)new t(this));
    }

    public final Map w() {
        return this.g;
    }
}

