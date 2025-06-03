/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.NotProvisionedException
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  android.util.Pair
 *  java.io.IOException
 *  java.lang.Error
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NoSuchMethodError
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.UUID
 */
package p0;

import B0.m;
import android.media.NotProvisionedException;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import g0.M;
import g0.h;
import g0.o;
import i0.k;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import l0.y1;
import p0.B;
import p0.F;
import p0.P;
import p0.Q;
import p0.S;
import p0.U;
import p0.n;
import p0.v;
import x0.r;
import x0.u;

public class g
implements n {
    public final List a;
    public final F b;
    public final a c;
    public final b d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final h i;
    public final m j;
    public final y1 k;
    public final Q l;
    public final UUID m;
    public final Looper n;
    public final e o;
    public int p;
    public int q;
    public HandlerThread r;
    public c s;
    public j0.b t;
    public n.a u;
    public byte[] v;
    public byte[] w;
    public F.a x;
    public F.d y;

    /*
     * Enabled aggressive block sorting
     */
    public g(UUID uUID, F f8, a a8, b b8, List list, int n8, boolean bl, boolean bl2, byte[] arrby, HashMap hashMap, Q q8, Looper looper, m m8, y1 y12) {
        if (n8 == 1 || n8 == 3) {
            g0.a.e(arrby);
        }
        this.m = uUID;
        this.c = a8;
        this.d = b8;
        this.b = f8;
        this.e = n8;
        this.f = bl;
        this.g = bl2;
        if (arrby != null) {
            this.w = arrby;
            uUID = null;
        } else {
            uUID = Collections.unmodifiableList((List)((List)g0.a.e((Object)list)));
        }
        this.a = uUID;
        this.h = hashMap;
        this.l = q8;
        this.i = new h();
        this.j = m8;
        this.k = y12;
        this.p = 2;
        this.n = looper;
        this.o = new e(looper);
    }

    public static /* synthetic */ void i(Throwable throwable, v.a a8) {
        a8.l((Exception)throwable);
    }

    public static /* synthetic */ void j(int n8, v.a a8) {
        a8.k(n8);
    }

    public final void A() {
        if (this.e == 0 && this.p == 4) {
            M.i(this.v);
            this.r(false);
        }
    }

    public void B(int n8) {
        if (n8 != 2) {
            return;
        }
        this.A();
    }

    public void C() {
        if (this.F()) {
            this.r(true);
        }
    }

    public void D(Exception exception, boolean bl) {
        int n8 = bl ? 1 : 3;
        this.x((Throwable)exception, n8);
    }

    public final void E(Object object, Object object2) {
        if (object == this.y) {
            if (this.p != 2 && !this.u()) {
                return;
            }
            this.y = null;
            if (object2 instanceof Exception) {
                this.c.c((Exception)object2, false);
                return;
            }
            try {
                this.b.i((byte[])object2);
            }
            catch (Exception exception) {
                this.c.c(exception, true);
            }
            this.c.b();
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean F() {
        block6 : {
            void var1_4;
            if (this.u()) {
                return true;
            }
            try {
                byte[] arrby = this.b.m();
                this.v = arrby;
                this.b.f(arrby, this.k);
                this.t = this.b.l(this.v);
                this.p = 3;
                this.q(new p0.b(3));
                g0.a.e(this.v);
                return true;
            }
            catch (NoSuchMethodError noSuchMethodError) {
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (!B.b((Throwable)var1_4)) {
                this.x((Throwable)var1_4, 1);
                return false;
            }
            break block6;
            catch (NotProvisionedException notProvisionedException) {}
        }
        this.c.a(this);
        return false;
    }

    public final void G(byte[] arrby, int n8, boolean bl) {
        void var1_4;
        try {
            this.x = this.b.j(arrby, this.a, n8, this.h);
            ((c)((Object)M.i((Object)this.s))).b(2, g0.a.e(this.x), bl);
            return;
        }
        catch (NoSuchMethodError noSuchMethodError) {
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.z((Throwable)var1_4, true);
    }

    public void H() {
        this.y = this.b.h();
        ((c)((Object)M.i((Object)this.s))).b(1, g0.a.e(this.y), true);
    }

    public final boolean I() {
        void var1_3;
        try {
            this.b.c(this.v, this.w);
            return true;
        }
        catch (NoSuchMethodError noSuchMethodError) {
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.x((Throwable)var1_3, 1);
        return false;
    }

    public final void J() {
        if (Thread.currentThread() != this.n.getThread()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append("\nExpected thread: ");
            stringBuilder.append(this.n.getThread().getName());
            o.i("DefaultDrmSession", stringBuilder.toString(), (Throwable)new IllegalStateException());
        }
    }

    @Override
    public void a(v.a a8) {
        this.J();
        int n8 = this.q;
        boolean bl = false;
        if (n8 < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Session reference count less than zero: ");
            stringBuilder.append(this.q);
            o.c("DefaultDrmSession", stringBuilder.toString());
            this.q = 0;
        }
        if (a8 != null) {
            this.i.a(a8);
        }
        this.q = n8 = this.q + 1;
        if (n8 == 1) {
            if (this.p == 2) {
                bl = true;
            }
            g0.a.f(bl);
            a8 = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = a8;
            a8.start();
            this.s = new c(this.r.getLooper());
            if (this.F()) {
                this.r(true);
            }
        } else if (a8 != null && this.u() && this.i.d(a8) == 1) {
            a8.k(this.p);
        }
        this.d.a(this, this.q);
    }

    @Override
    public boolean b() {
        this.J();
        return this.f;
    }

    @Override
    public Map c() {
        this.J();
        byte[] arrby = this.v;
        if (arrby == null) {
            return null;
        }
        return this.b.d(arrby);
    }

    @Override
    public final UUID d() {
        this.J();
        return this.m;
    }

    @Override
    public void e(v.a a8) {
        this.J();
        int n8 = this.q;
        if (n8 <= 0) {
            o.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        this.q = --n8;
        if (n8 == 0) {
            this.p = 0;
            ((e)((Object)M.i((Object)this.o))).removeCallbacksAndMessages((Object)null);
            ((c)((Object)M.i((Object)this.s))).c();
            this.s = null;
            ((HandlerThread)M.i((Object)this.r)).quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] arrby = this.v;
            if (arrby != null) {
                this.b.e(arrby);
                this.v = null;
            }
        }
        if (a8 != null) {
            this.i.f(a8);
            if (this.i.d(a8) == 0) {
                a8.m();
            }
        }
        this.d.b(this, this.q);
    }

    @Override
    public boolean f(String string2) {
        this.J();
        return this.b.b((byte[])g0.a.h(this.v), string2);
    }

    @Override
    public final n.a g() {
        this.J();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override
    public final int getState() {
        this.J();
        return this.p;
    }

    @Override
    public final j0.b h() {
        this.J();
        return this.t;
    }

    public final void q(g0.g g8) {
        Iterator iterator = this.i.u().iterator();
        while (iterator.hasNext()) {
            g8.accept((v.a)iterator.next());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void r(boolean bl) {
        block9 : {
            long l8;
            block11 : {
                byte[] arrby;
                block10 : {
                    block8 : {
                        if (this.g) {
                            return;
                        }
                        arrby = (byte[])M.i(this.v);
                        int n8 = this.e;
                        if (n8 == 0 || n8 == 1) break block8;
                        if (n8 != 2) {
                            if (n8 != 3) {
                                return;
                            }
                            g0.a.e(this.w);
                            g0.a.e(this.v);
                            this.G(this.w, 3, bl);
                            return;
                        }
                        if (this.w != null && !this.I()) break block9;
                        break block10;
                    }
                    if (this.w == null) {
                        this.G(arrby, 1, bl);
                        return;
                    }
                    if (this.p != 4 && !this.I()) break block9;
                    l8 = this.s();
                    if (this.e != 0 || l8 > 60L) break block11;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Offline license has expired or will expire soon. Remaining seconds: ");
                    stringBuilder.append(l8);
                    o.b("DefaultDrmSession", stringBuilder.toString());
                }
                this.G(arrby, 2, bl);
                return;
            }
            if (l8 <= 0L) {
                this.x((Throwable)new P(), 2);
                return;
            }
            this.p = 4;
            this.q(new p0.f());
        }
    }

    public final long s() {
        if (!d0.g.d.equals((Object)this.m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair)g0.a.e((Object)U.b(this));
        return Math.min((long)((Long)pair.first), (long)((Long)pair.second));
    }

    public boolean t(byte[] arrby) {
        this.J();
        return Arrays.equals((byte[])this.v, (byte[])arrby);
    }

    public final boolean u() {
        int n8 = this.p;
        if (n8 != 3 && n8 != 4) {
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void x(Throwable throwable, int n8) {
        this.u = new n.a(throwable, B.a(throwable, n8));
        o.d("DefaultDrmSession", "DRM session error", throwable);
        if (throwable instanceof Exception) {
            this.q(new p0.e(throwable));
        } else {
            if (!(throwable instanceof Error)) throw new IllegalStateException("Unexpected Throwable subclass", throwable);
            if (!B.c(throwable) && !B.b(throwable)) {
                throw (Error)throwable;
            }
        }
        if (this.p == 4) return;
        this.p = 1;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void y(Object object, Object object2) {
        void var1_2;
        block8 : {
            if (object != this.x) return;
            if (!this.u()) {
                return;
            }
            this.x = null;
            if (!(object2 instanceof Exception) && !(object2 instanceof NoSuchMethodError)) {
                object = (byte[])object2;
                if (this.e == 3) {
                    this.b.g((byte[])M.i(this.w), (byte[])object);
                    object = new p0.c();
                } else {
                    object = this.b.g(this.v, (byte[])object);
                    int n8 = this.e;
                    if ((n8 == 2 || n8 == 0 && this.w != null) && object != null && object.length != 0) {
                        this.w = object;
                    }
                    this.p = 4;
                    object = new p0.d();
                }
                this.q((g0.g)object);
                return;
            }
            this.z((Throwable)object2, false);
            return;
            catch (NoSuchMethodError noSuchMethodError) {
                break block8;
            }
            catch (Exception exception) {}
        }
        this.z((Throwable)var1_2, true);
    }

    public final void z(Throwable throwable, boolean bl) {
        if (!(throwable instanceof NotProvisionedException) && !B.b(throwable)) {
            int n8 = bl ? 1 : 2;
            this.x(throwable, n8);
            return;
        }
        this.c.a(this);
    }

    public static interface a {
        public void a(g var1);

        public void b();

        public void c(Exception var1, boolean var2);
    }

    public static interface b {
        public void a(g var1, int var2);

        public void b(g var1, int var2);
    }

    public class c
    extends Handler {
        public boolean a;

        public c(Looper looper) {
            super(looper);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final boolean a(Message message, S iOException) {
            int n8;
            d d8 = (d)message.obj;
            if (!d8.b) {
                return false;
            }
            d8.e = n8 = d8.e + 1;
            if (n8 > g.this.j.d(3)) {
                return false;
            }
            r r8 = new r(d8.a, iOException.o, iOException.p, iOException.q, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - d8.c, iOException.r);
            u u8 = new u(3);
            iOException = iOException.getCause() instanceof IOException ? (IOException)iOException.getCause() : new f(iOException.getCause());
            long l8 = g.this.j.c(new m.c(r8, u8, iOException, d8.e));
            if (l8 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (!this.a) {
                        this.sendMessageDelayed(Message.obtain((Message)message), l8);
                        return true;
                    }
                    return false;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public void b(int n8, Object object, boolean bl) {
            this.obtainMessage(n8, (Object)new d(r.a(), bl, SystemClock.elapsedRealtime(), object)).sendToTarget();
        }

        public void c() {
            synchronized (this) {
                this.removeCallbacksAndMessages((Object)null);
                this.a = true;
                return;
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
        public void handleMessage(Message message) {
            byte[] arrby;
            block10 : {
                d d8 = (d)message.obj;
                try {
                    int n8 = message.what;
                    if (n8 != 1) {
                        if (n8 != 2) throw new RuntimeException();
                        arrby = g.this.l.b(g.this.m, (F.a)d8.d);
                    } else {
                        arrby = g.this.l.a(g.this.m, (F.d)d8.d);
                    }
                    break block10;
                }
                catch (Exception exception) {}
                o.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", (Throwable)exception);
                break block10;
                catch (S object) {}
                arrby = object;
                if (this.a(message, (S)((Object)object))) {
                    return;
                }
            }
            g.this.j.a(d8.a);
            // MONITORENTER : this
            if (!this.a) {
                g.this.o.obtainMessage(message.what, (Object)Pair.create((Object)d8.d, (Object)arrby)).sendToTarget();
            }
            // MONITOREXIT : this
            return;
        }
    }

    public static final class d {
        public final long a;
        public final boolean b;
        public final long c;
        public final Object d;
        public int e;

        public d(long l8, boolean bl, long l9, Object object) {
            this.a = l8;
            this.b = bl;
            this.c = l9;
            this.d = object;
        }
    }

    public class e
    extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Object object = (Pair)message.obj;
            Object object2 = object.first;
            object = object.second;
            int n8 = message.what;
            if (n8 != 1) {
                if (n8 != 2) {
                    return;
                }
                g.this.y(object2, object);
                return;
            }
            g.this.E(object2, object);
        }
    }

    public static final class f
    extends IOException {
        public f(Throwable throwable) {
            super(throwable);
        }
    }

}

