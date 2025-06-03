// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import android.os.Message;
import android.os.Looper;
import java.util.ArrayList;
import android.os.Handler;
import java.util.List;

public final class C implements k
{
    public static final List b;
    public final Handler a;
    
    static {
        b = new ArrayList(50);
    }
    
    public C(final Handler a) {
        this.a = a;
    }
    
    public static b m() {
        final List b = C.b;
        // monitorenter(b)
        while (true) {
            try {
                b b2;
                if (b.isEmpty()) {
                    b2 = new b(null);
                }
                else {
                    b2 = b.remove(b.size() - 1);
                }
                // monitorexit(b)
                return b2;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void n(final b b) {
        final List b2 = C.b;
        // monitorenter(b2)
        while (true) {
            try {
                if (b2.size() < 50) {
                    b2.add(b);
                }
                // monitorexit(b2)
                return;
                // monitorexit(b2)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public boolean a(final int n) {
        g0.a.a(n != 0);
        return this.a.hasMessages(n);
    }
    
    @Override
    public a b(final int n, final int n2, final int n3) {
        return m().d(this.a.obtainMessage(n, n2, n3), this);
    }
    
    @Override
    public boolean c(final int n) {
        return this.a.sendEmptyMessage(n);
    }
    
    @Override
    public boolean d(final a a) {
        return ((b)a).c(this.a);
    }
    
    @Override
    public boolean e(final int n, final long n2) {
        return this.a.sendEmptyMessageAtTime(n, n2);
    }
    
    @Override
    public void f(final int n) {
        g0.a.a(n != 0);
        this.a.removeMessages(n);
    }
    
    @Override
    public a g(final int n, final Object o) {
        return m().d(this.a.obtainMessage(n, o), this);
    }
    
    @Override
    public void h(final Object o) {
        this.a.removeCallbacksAndMessages(o);
    }
    
    @Override
    public Looper i() {
        return this.a.getLooper();
    }
    
    @Override
    public boolean j(final Runnable runnable) {
        return this.a.post(runnable);
    }
    
    @Override
    public a k(final int n) {
        return m().d(this.a.obtainMessage(n), this);
    }
    
    public static final class b implements a
    {
        public Message a;
        public C b;
        
        @Override
        public void a() {
            ((Message)g0.a.e(this.a)).sendToTarget();
            this.b();
        }
        
        public final void b() {
            this.a = null;
            this.b = null;
            n(this);
        }
        
        public boolean c(final Handler handler) {
            final boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message)g0.a.e(this.a));
            this.b();
            return sendMessageAtFrontOfQueue;
        }
        
        public b d(final Message a, final C b) {
            this.a = a;
            this.b = b;
            return this;
        }
    }
}
