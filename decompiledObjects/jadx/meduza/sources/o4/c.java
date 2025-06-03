package o4;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import o4.d;

/* loaded from: classes.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f11762a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Looper looper) {
        super(looper);
        this.f11762a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        d dVar = this.f11762a;
        dVar.getClass();
        int i10 = message.what;
        d.a aVar = null;
        if (i10 == 0) {
            d.a aVar2 = (d.a) message.obj;
            try {
                dVar.f11765a.queueInputBuffer(aVar2.f11770a, aVar2.f11771b, aVar2.f11772c, aVar2.f11774e, aVar2.f);
            } catch (RuntimeException e10) {
                AtomicReference<RuntimeException> atomicReference = dVar.f11768d;
                while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                }
            }
            aVar = aVar2;
        } else if (i10 == 1) {
            d.a aVar3 = (d.a) message.obj;
            int i11 = aVar3.f11770a;
            int i12 = aVar3.f11771b;
            MediaCodec.CryptoInfo cryptoInfo = aVar3.f11773d;
            long j10 = aVar3.f11774e;
            int i13 = aVar3.f;
            try {
                synchronized (d.f11764h) {
                    dVar.f11765a.queueSecureInputBuffer(i11, i12, cryptoInfo, j10, i13);
                }
            } catch (RuntimeException e11) {
                AtomicReference<RuntimeException> atomicReference2 = dVar.f11768d;
                while (!atomicReference2.compareAndSet(null, e11) && atomicReference2.get() == null) {
                }
            }
            aVar = aVar3;
        } else if (i10 != 2) {
            AtomicReference<RuntimeException> atomicReference3 = dVar.f11768d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            dVar.f11769e.a();
        }
        if (aVar != null) {
            ArrayDeque<d.a> arrayDeque = d.f11763g;
            synchronized (arrayDeque) {
                arrayDeque.add(aVar);
            }
        }
    }
}
