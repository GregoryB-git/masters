/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package Q4;

import Q4.c;
import Q4.d;
import Q4.p;
import V2.f;
import V2.g;
import V2.i;
import V2.j;
import V2.m;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class e {
    public static final Map d = new HashMap();
    public static final Executor e = new r1.m();
    public final Executor a;
    public final p b;
    public j c;

    public e(Executor executor, p p8) {
        this.a = executor;
        this.b = p8;
        this.c = null;
    }

    public static /* synthetic */ j a(e e8, boolean bl, com.google.firebase.remoteconfig.internal.b b8, Void void_) {
        return e8.j(bl, b8, void_);
    }

    public static /* synthetic */ Void b(e e8, com.google.firebase.remoteconfig.internal.b b8) {
        return e8.i(b8);
    }

    public static Object c(j j8, long l8, TimeUnit timeUnit) {
        b b8 = new b(null);
        Executor executor = e;
        j8.e(executor, b8);
        j8.d(executor, b8);
        j8.a(executor, b8);
        if (b8.c(l8, timeUnit)) {
            if (j8.n()) {
                return j8.j();
            }
            throw new ExecutionException((Throwable)j8.i());
        }
        throw new TimeoutException("Task await timed out.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e h(Executor object, p p8) {
        synchronized (e.class) {
            try {
                String string2 = p8.b();
                Map map = d;
                if (map.containsKey((Object)string2)) return (e)map.get((Object)string2);
                map.put((Object)string2, (Object)new e((Executor)object, p8));
                return (e)map.get((Object)string2);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() {
        synchronized (this) {
            this.c = m.e(null);
        }
        this.b.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j e() {
        synchronized (this) {
            try {
                j j8 = this.c;
                if (j8 != null) {
                    if (!j8.m()) return this.c;
                    if (this.c.n()) return this.c;
                }
                j8 = this.a;
                p p8 = this.b;
                Objects.requireNonNull((Object)p8);
                this.c = m.c((Executor)j8, new Q4.b(p8));
                return this.c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public com.google.firebase.remoteconfig.internal.b f() {
        return this.g(5L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public com.google.firebase.remoteconfig.internal.b g(long l8) {
        void var3_6;
        // MONITORENTER : this
        Object object = this.c;
        if (object != null && object.n()) {
            object = (com.google.firebase.remoteconfig.internal.b)this.c.j();
            // MONITOREXIT : this
            return object;
        }
        // MONITOREXIT : this
        try {
            return (com.google.firebase.remoteconfig.internal.b)e.c(this.e(), l8, TimeUnit.SECONDS);
        }
        catch (TimeoutException timeoutException) {
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        Log.d((String)"FirebaseRemoteConfig", (String)"Reading from storage file failed.", (Throwable)var3_6);
        return null;
    }

    public final /* synthetic */ Void i(com.google.firebase.remoteconfig.internal.b b8) {
        return this.b.e(b8);
    }

    public final /* synthetic */ j j(boolean bl, com.google.firebase.remoteconfig.internal.b b8, Void void_) {
        if (bl) {
            this.m(b8);
        }
        return m.e(b8);
    }

    public j k(com.google.firebase.remoteconfig.internal.b b8) {
        return this.l(b8, true);
    }

    public j l(com.google.firebase.remoteconfig.internal.b b8, boolean bl) {
        return m.c(this.a, new c(this, b8)).p(this.a, new d(this, bl, b8));
    }

    public final void m(com.google.firebase.remoteconfig.internal.b b8) {
        synchronized (this) {
            this.c = m.e(b8);
            return;
        }
    }

    public static class b
    implements g,
    f,
    V2.d {
        public final CountDownLatch a = new CountDownLatch(1);

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        @Override
        public void a(Object object) {
            this.a.countDown();
        }

        @Override
        public void b() {
            this.a.countDown();
        }

        public boolean c(long l8, TimeUnit timeUnit) {
            return this.a.await(l8, timeUnit);
        }

        @Override
        public void d(Exception exception) {
            this.a.countDown();
        }
    }

}

