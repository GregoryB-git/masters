/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package g0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import g0.a;
import g0.k;
import java.util.ArrayList;
import java.util.List;

public final class C
implements k {
    public static final List b = new ArrayList(50);
    public final Handler a;

    public C(Handler handler) {
        this.a = handler;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b m() {
        List list = b;
        synchronized (list) {
            try {
                if (!list.isEmpty()) return (b)list.remove(list.size() - 1);
                return new b(null);
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
    public static void n(b b8) {
        List list = b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add((Object)b8);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public boolean a(int n8) {
        boolean bl = n8 != 0;
        a.a(bl);
        return this.a.hasMessages(n8);
    }

    @Override
    public k.a b(int n8, int n9, int n10) {
        return C.m().d(this.a.obtainMessage(n8, n9, n10), this);
    }

    @Override
    public boolean c(int n8) {
        return this.a.sendEmptyMessage(n8);
    }

    @Override
    public boolean d(k.a a8) {
        return ((b)a8).c(this.a);
    }

    @Override
    public boolean e(int n8, long l8) {
        return this.a.sendEmptyMessageAtTime(n8, l8);
    }

    @Override
    public void f(int n8) {
        boolean bl = n8 != 0;
        a.a(bl);
        this.a.removeMessages(n8);
    }

    @Override
    public k.a g(int n8, Object object) {
        return C.m().d(this.a.obtainMessage(n8, object), this);
    }

    @Override
    public void h(Object object) {
        this.a.removeCallbacksAndMessages(object);
    }

    @Override
    public Looper i() {
        return this.a.getLooper();
    }

    @Override
    public boolean j(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override
    public k.a k(int n8) {
        return C.m().d(this.a.obtainMessage(n8), this);
    }

    public static final class b
    implements k.a {
        public Message a;
        public C b;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        @Override
        public void a() {
            ((Message)a.e((Object)this.a)).sendToTarget();
            this.b();
        }

        public final void b() {
            this.a = null;
            this.b = null;
            C.n(this);
        }

        public boolean c(Handler handler) {
            boolean bl = handler.sendMessageAtFrontOfQueue((Message)a.e((Object)this.a));
            this.b();
            return bl;
        }

        public b d(Message message, C c8) {
            this.a = message;
            this.b = c8;
            return this;
        }
    }

}

