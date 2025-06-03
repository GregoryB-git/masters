package v5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import v5.k;

/* loaded from: classes.dex */
public final class a0 implements k {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f15865b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f15866a;

    public static final class a implements k.a {

        /* renamed from: a, reason: collision with root package name */
        public Message f15867a;

        public final void a() {
            Message message = this.f15867a;
            message.getClass();
            message.sendToTarget();
            this.f15867a = null;
            ArrayList arrayList = a0.f15865b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public a0(Handler handler) {
        this.f15866a = handler;
    }

    public static a m() {
        a aVar;
        ArrayList arrayList = f15865b;
        synchronized (arrayList) {
            aVar = arrayList.isEmpty() ? new a() : (a) arrayList.remove(arrayList.size() - 1);
        }
        return aVar;
    }

    @Override // v5.k
    public final boolean a() {
        return this.f15866a.hasMessages(0);
    }

    @Override // v5.k
    public final a b(int i10, int i11, int i12) {
        a m10 = m();
        m10.f15867a = this.f15866a.obtainMessage(i10, i11, i12);
        return m10;
    }

    @Override // v5.k
    public final boolean c(k.a aVar) {
        a aVar2 = (a) aVar;
        Handler handler = this.f15866a;
        Message message = aVar2.f15867a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        aVar2.f15867a = null;
        ArrayList arrayList = f15865b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(aVar2);
            }
        }
        return sendMessageAtFrontOfQueue;
    }

    @Override // v5.k
    public final a d(z4.e0 e0Var, int i10) {
        a m10 = m();
        m10.f15867a = this.f15866a.obtainMessage(20, 0, i10, e0Var);
        return m10;
    }

    @Override // v5.k
    public final boolean e(Runnable runnable) {
        return this.f15866a.post(runnable);
    }

    @Override // v5.k
    public final a f(int i10) {
        a m10 = m();
        m10.f15867a = this.f15866a.obtainMessage(i10);
        return m10;
    }

    @Override // v5.k
    public final void g() {
        this.f15866a.removeCallbacksAndMessages(null);
    }

    @Override // v5.k
    public final boolean h(long j10) {
        return this.f15866a.sendEmptyMessageAtTime(2, j10);
    }

    @Override // v5.k
    public final boolean i(int i10) {
        return this.f15866a.sendEmptyMessage(i10);
    }

    @Override // v5.k
    public final void j(int i10) {
        this.f15866a.removeMessages(i10);
    }

    @Override // v5.k
    public final a k(int i10, Object obj) {
        a m10 = m();
        m10.f15867a = this.f15866a.obtainMessage(i10, obj);
        return m10;
    }

    @Override // v5.k
    public final Looper l() {
        return this.f15866a.getLooper();
    }
}
