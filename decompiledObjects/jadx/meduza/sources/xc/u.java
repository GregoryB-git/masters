package xc;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final t f17292a = new t(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f17293b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference<t>[] f17294c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f17293b = highestOneBit;
        AtomicReference<t>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f17294c = atomicReferenceArr;
    }

    public static final void a(t tVar) {
        if (!(tVar.f == null && tVar.f17291g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (tVar.f17289d) {
            return;
        }
        AtomicReference<t> atomicReference = f17294c[(int) (Thread.currentThread().getId() & (f17293b - 1))];
        t tVar2 = f17292a;
        t andSet = atomicReference.getAndSet(tVar2);
        if (andSet == tVar2) {
            return;
        }
        int i10 = andSet != null ? andSet.f17288c : 0;
        if (i10 >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        tVar.f = andSet;
        tVar.f17287b = 0;
        tVar.f17288c = i10 + 8192;
        atomicReference.set(tVar);
    }

    public static final t b() {
        AtomicReference<t> atomicReference = f17294c[(int) (Thread.currentThread().getId() & (f17293b - 1))];
        t tVar = f17292a;
        t andSet = atomicReference.getAndSet(tVar);
        if (andSet == tVar) {
            return new t();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new t();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.f17288c = 0;
        return andSet;
    }
}
