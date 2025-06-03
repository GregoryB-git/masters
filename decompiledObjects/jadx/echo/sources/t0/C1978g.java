package t0;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import g0.AbstractC1297a;
import g0.C1302f;
import g0.M;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: t0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1978g implements InterfaceC1985n {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f19436g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f19437h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f19438a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f19439b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f19440c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f19441d;

    /* renamed from: e, reason: collision with root package name */
    public final C1302f f19442e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19443f;

    /* renamed from: t0.g$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1978g.this.j(message);
        }
    }

    /* renamed from: t0.g$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f19445a;

        /* renamed from: b, reason: collision with root package name */
        public int f19446b;

        /* renamed from: c, reason: collision with root package name */
        public int f19447c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f19448d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f19449e;

        /* renamed from: f, reason: collision with root package name */
        public int f19450f;

        public void a(int i7, int i8, int i9, long j7, int i10) {
            this.f19445a = i7;
            this.f19446b = i8;
            this.f19447c = i9;
            this.f19449e = j7;
            this.f19450f = i10;
        }
    }

    public C1978g(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C1302f());
    }

    public static void g(j0.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f15391f;
        cryptoInfo.numBytesOfClearData = i(cVar.f15389d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = i(cVar.f15390e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) AbstractC1297a.e(h(cVar.f15387b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) AbstractC1297a.e(h(cVar.f15386a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f15388c;
        if (M.f14261a >= 24) {
            AbstractC1976e.a();
            cryptoInfo.setPattern(j0.d.a(cVar.f15392g, cVar.f15393h));
        }
    }

    public static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static b o() {
        ArrayDeque arrayDeque = f19436g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void p(b bVar) {
        ArrayDeque arrayDeque = f19436g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // t0.InterfaceC1985n
    public void a(int i7, int i8, j0.c cVar, long j7, int i9) {
        d();
        b o7 = o();
        o7.a(i7, i8, 0, j7, i9);
        g(cVar, o7.f19448d);
        ((Handler) M.i(this.f19440c)).obtainMessage(2, o7).sendToTarget();
    }

    @Override // t0.InterfaceC1985n
    public void b(int i7, int i8, int i9, long j7, int i10) {
        d();
        b o7 = o();
        o7.a(i7, i8, i9, j7, i10);
        ((Handler) M.i(this.f19440c)).obtainMessage(1, o7).sendToTarget();
    }

    @Override // t0.InterfaceC1985n
    public void c(Bundle bundle) {
        d();
        ((Handler) M.i(this.f19440c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // t0.InterfaceC1985n
    public void d() {
        RuntimeException runtimeException = (RuntimeException) this.f19441d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void f() {
        this.f19442e.c();
        ((Handler) AbstractC1297a.e(this.f19440c)).obtainMessage(3).sendToTarget();
        this.f19442e.a();
    }

    @Override // t0.InterfaceC1985n
    public void flush() {
        if (this.f19443f) {
            try {
                n();
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    public final void j(Message message) {
        b bVar;
        int i7 = message.what;
        if (i7 == 1) {
            bVar = (b) message.obj;
            k(bVar.f19445a, bVar.f19446b, bVar.f19447c, bVar.f19449e, bVar.f19450f);
        } else if (i7 != 2) {
            bVar = null;
            if (i7 == 3) {
                this.f19442e.e();
            } else if (i7 != 4) {
                AbstractC1977f.a(this.f19441d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                m((Bundle) message.obj);
            }
        } else {
            bVar = (b) message.obj;
            l(bVar.f19445a, bVar.f19446b, bVar.f19448d, bVar.f19449e, bVar.f19450f);
        }
        if (bVar != null) {
            p(bVar);
        }
    }

    public final void k(int i7, int i8, int i9, long j7, int i10) {
        try {
            this.f19438a.queueInputBuffer(i7, i8, i9, j7, i10);
        } catch (RuntimeException e7) {
            AbstractC1977f.a(this.f19441d, null, e7);
        }
    }

    public final void l(int i7, int i8, MediaCodec.CryptoInfo cryptoInfo, long j7, int i9) {
        try {
            synchronized (f19437h) {
                this.f19438a.queueSecureInputBuffer(i7, i8, cryptoInfo, j7, i9);
            }
        } catch (RuntimeException e7) {
            AbstractC1977f.a(this.f19441d, null, e7);
        }
    }

    public final void m(Bundle bundle) {
        try {
            this.f19438a.setParameters(bundle);
        } catch (RuntimeException e7) {
            AbstractC1977f.a(this.f19441d, null, e7);
        }
    }

    public final void n() {
        ((Handler) AbstractC1297a.e(this.f19440c)).removeCallbacksAndMessages(null);
        f();
    }

    @Override // t0.InterfaceC1985n
    public void shutdown() {
        if (this.f19443f) {
            flush();
            this.f19439b.quit();
        }
        this.f19443f = false;
    }

    @Override // t0.InterfaceC1985n
    public void start() {
        if (this.f19443f) {
            return;
        }
        this.f19439b.start();
        this.f19440c = new a(this.f19439b.getLooper());
        this.f19443f = true;
    }

    public C1978g(MediaCodec mediaCodec, HandlerThread handlerThread, C1302f c1302f) {
        this.f19438a = mediaCodec;
        this.f19439b = handlerThread;
        this.f19442e = c1302f;
        this.f19441d = new AtomicReference();
    }
}
