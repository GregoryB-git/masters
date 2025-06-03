package g0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import g0.InterfaceC1307k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class C implements InterfaceC1307k {

    /* renamed from: b, reason: collision with root package name */
    public static final List f14248b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f14249a;

    public static final class b implements InterfaceC1307k.a {

        /* renamed from: a, reason: collision with root package name */
        public Message f14250a;

        /* renamed from: b, reason: collision with root package name */
        public C f14251b;

        public b() {
        }

        @Override // g0.InterfaceC1307k.a
        public void a() {
            ((Message) AbstractC1297a.e(this.f14250a)).sendToTarget();
            b();
        }

        public final void b() {
            this.f14250a = null;
            this.f14251b = null;
            C.n(this);
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) AbstractC1297a.e(this.f14250a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, C c7) {
            this.f14250a = message;
            this.f14251b = c7;
            return this;
        }
    }

    public C(Handler handler) {
        this.f14249a = handler;
    }

    public static b m() {
        b bVar;
        List list = f14248b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : (b) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static void n(b bVar) {
        List list = f14248b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g0.InterfaceC1307k
    public boolean a(int i7) {
        AbstractC1297a.a(i7 != 0);
        return this.f14249a.hasMessages(i7);
    }

    @Override // g0.InterfaceC1307k
    public InterfaceC1307k.a b(int i7, int i8, int i9) {
        return m().d(this.f14249a.obtainMessage(i7, i8, i9), this);
    }

    @Override // g0.InterfaceC1307k
    public boolean c(int i7) {
        return this.f14249a.sendEmptyMessage(i7);
    }

    @Override // g0.InterfaceC1307k
    public boolean d(InterfaceC1307k.a aVar) {
        return ((b) aVar).c(this.f14249a);
    }

    @Override // g0.InterfaceC1307k
    public boolean e(int i7, long j7) {
        return this.f14249a.sendEmptyMessageAtTime(i7, j7);
    }

    @Override // g0.InterfaceC1307k
    public void f(int i7) {
        AbstractC1297a.a(i7 != 0);
        this.f14249a.removeMessages(i7);
    }

    @Override // g0.InterfaceC1307k
    public InterfaceC1307k.a g(int i7, Object obj) {
        return m().d(this.f14249a.obtainMessage(i7, obj), this);
    }

    @Override // g0.InterfaceC1307k
    public void h(Object obj) {
        this.f14249a.removeCallbacksAndMessages(obj);
    }

    @Override // g0.InterfaceC1307k
    public Looper i() {
        return this.f14249a.getLooper();
    }

    @Override // g0.InterfaceC1307k
    public boolean j(Runnable runnable) {
        return this.f14249a.post(runnable);
    }

    @Override // g0.InterfaceC1307k
    public InterfaceC1307k.a k(int i7) {
        return m().d(this.f14249a.obtainMessage(i7), this);
    }
}
