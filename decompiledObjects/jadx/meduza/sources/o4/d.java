package o4;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import v5.e0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque<a> f11763g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f11764h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f11765a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f11766b;

    /* renamed from: c, reason: collision with root package name */
    public c f11767c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f11768d;

    /* renamed from: e, reason: collision with root package name */
    public final b5.g f11769e;
    public boolean f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f11770a;

        /* renamed from: b, reason: collision with root package name */
        public int f11771b;

        /* renamed from: c, reason: collision with root package name */
        public int f11772c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f11773d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f11774e;
        public int f;
    }

    public d(MediaCodec mediaCodec, HandlerThread handlerThread) {
        b5.g gVar = new b5.g(1);
        this.f11765a = mediaCodec;
        this.f11766b = handlerThread;
        this.f11769e = gVar;
        this.f11768d = new AtomicReference<>();
    }

    public final void a() {
        if (this.f) {
            try {
                c cVar = this.f11767c;
                cVar.getClass();
                cVar.removeCallbacksAndMessages(null);
                b5.g gVar = this.f11769e;
                synchronized (gVar) {
                    gVar.f1869a = false;
                }
                c cVar2 = this.f11767c;
                cVar2.getClass();
                cVar2.obtainMessage(2).sendToTarget();
                b5.g gVar2 = this.f11769e;
                synchronized (gVar2) {
                    while (!gVar2.f1869a) {
                        gVar2.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void b() {
        RuntimeException andSet = this.f11768d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public final void c(int i10, z3.c cVar, long j10) {
        a aVar;
        b();
        ArrayDeque<a> arrayDeque = f11763g;
        synchronized (arrayDeque) {
            aVar = arrayDeque.isEmpty() ? new a() : arrayDeque.removeFirst();
        }
        aVar.f11770a = i10;
        aVar.f11771b = 0;
        aVar.f11772c = 0;
        aVar.f11774e = j10;
        aVar.f = 0;
        MediaCodec.CryptoInfo cryptoInfo = aVar.f11773d;
        cryptoInfo.numSubSamples = cVar.f;
        int[] iArr = cVar.f17512d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = cVar.f17513e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = cVar.f17510b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = cVar.f17509a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = cVar.f17511c;
        if (e0.f15881a >= 24) {
            cryptoInfo.setPattern(new MediaCodec$CryptoInfo$Pattern(cVar.f17514g, cVar.f17515h));
        }
        this.f11767c.obtainMessage(1, aVar).sendToTarget();
    }
}
