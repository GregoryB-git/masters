package z3;

import h5.k;
import java.util.ArrayDeque;
import z3.f;
import z3.g;
import z3.h;

/* loaded from: classes.dex */
public abstract class j<I extends g, O extends h, E extends f> implements d<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    public final a f17543a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17544b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f17545c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f17546d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    public final I[] f17547e;
    public final O[] f;

    /* renamed from: g, reason: collision with root package name */
    public int f17548g;

    /* renamed from: h, reason: collision with root package name */
    public int f17549h;

    /* renamed from: i, reason: collision with root package name */
    public I f17550i;

    /* renamed from: j, reason: collision with root package name */
    public h5.i f17551j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17552k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17553l;

    public class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f17554a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h5.f fVar) {
            super("ExoPlayer:SimpleDecoder");
            this.f17554a = fVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            j jVar = this.f17554a;
            jVar.getClass();
            do {
                try {
                } catch (InterruptedException e10) {
                    throw new IllegalStateException(e10);
                }
            } while (jVar.g());
        }
    }

    public j(I[] iArr, O[] oArr) {
        this.f17547e = iArr;
        this.f17548g = iArr.length;
        for (int i10 = 0; i10 < this.f17548g; i10++) {
            this.f17547e[i10] = new k();
        }
        this.f = oArr;
        this.f17549h = oArr.length;
        for (int i11 = 0; i11 < this.f17549h; i11++) {
            this.f[i11] = new h5.e((h5.f) this);
        }
        a aVar = new a((h5.f) this);
        this.f17543a = aVar;
        aVar.start();
    }

    @Override // z3.d
    public final Object b() {
        O removeFirst;
        synchronized (this.f17544b) {
            try {
                h5.i iVar = this.f17551j;
                if (iVar != null) {
                    throw iVar;
                }
                removeFirst = this.f17546d.isEmpty() ? null : this.f17546d.removeFirst();
            } finally {
            }
        }
        return removeFirst;
    }

    @Override // z3.d
    public final Object c() {
        I i10;
        synchronized (this.f17544b) {
            try {
                h5.i iVar = this.f17551j;
                if (iVar != null) {
                    throw iVar;
                }
                x6.b.H(this.f17550i == null);
                int i11 = this.f17548g;
                if (i11 == 0) {
                    i10 = null;
                } else {
                    I[] iArr = this.f17547e;
                    int i12 = i11 - 1;
                    this.f17548g = i12;
                    i10 = iArr[i12];
                }
                this.f17550i = i10;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    @Override // z3.d
    public final void d(k kVar) {
        synchronized (this.f17544b) {
            try {
                h5.i iVar = this.f17551j;
                if (iVar != null) {
                    throw iVar;
                }
                boolean z10 = true;
                x6.b.q(kVar == this.f17550i);
                this.f17545c.addLast(kVar);
                if (this.f17545c.isEmpty() || this.f17549h <= 0) {
                    z10 = false;
                }
                if (z10) {
                    this.f17544b.notify();
                }
                this.f17550i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract h5.i e(Throwable th);

    public abstract h5.i f(g gVar, h hVar, boolean z10);

    @Override // z3.d
    public final void flush() {
        synchronized (this.f17544b) {
            this.f17552k = true;
            I i10 = this.f17550i;
            if (i10 != null) {
                i10.o();
                I[] iArr = this.f17547e;
                int i11 = this.f17548g;
                this.f17548g = i11 + 1;
                iArr[i11] = i10;
                this.f17550i = null;
            }
            while (!this.f17545c.isEmpty()) {
                I removeFirst = this.f17545c.removeFirst();
                removeFirst.o();
                I[] iArr2 = this.f17547e;
                int i12 = this.f17548g;
                this.f17548g = i12 + 1;
                iArr2[i12] = removeFirst;
            }
            while (!this.f17546d.isEmpty()) {
                this.f17546d.removeFirst().o();
            }
        }
    }

    public final boolean g() {
        h5.i e10;
        synchronized (this.f17544b) {
            while (!this.f17553l) {
                try {
                    if (!this.f17545c.isEmpty() && this.f17549h > 0) {
                        break;
                    }
                    this.f17544b.wait();
                } finally {
                }
            }
            if (this.f17553l) {
                return false;
            }
            I removeFirst = this.f17545c.removeFirst();
            O[] oArr = this.f;
            int i10 = this.f17549h - 1;
            this.f17549h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f17552k;
            this.f17552k = false;
            if (removeFirst.m(4)) {
                o10.l(4);
            } else {
                if (removeFirst.n()) {
                    o10.l(Integer.MIN_VALUE);
                }
                if (removeFirst.m(134217728)) {
                    o10.l(134217728);
                }
                try {
                    e10 = f(removeFirst, o10, z10);
                } catch (OutOfMemoryError | RuntimeException e11) {
                    e10 = e(e11);
                }
                if (e10 != null) {
                    synchronized (this.f17544b) {
                        this.f17551j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f17544b) {
                if (!this.f17552k && !o10.n()) {
                    this.f17546d.addLast(o10);
                    removeFirst.o();
                    I[] iArr = this.f17547e;
                    int i11 = this.f17548g;
                    this.f17548g = i11 + 1;
                    iArr[i11] = removeFirst;
                }
                o10.o();
                removeFirst.o();
                I[] iArr2 = this.f17547e;
                int i112 = this.f17548g;
                this.f17548g = i112 + 1;
                iArr2[i112] = removeFirst;
            }
            return true;
        }
    }

    @Override // z3.d
    public final void release() {
        synchronized (this.f17544b) {
            this.f17553l = true;
            this.f17544b.notify();
        }
        try {
            this.f17543a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
