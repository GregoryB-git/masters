package j0;

import g0.AbstractC1297a;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class k implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f15411a;

    /* renamed from: e, reason: collision with root package name */
    public final i[] f15415e;

    /* renamed from: f, reason: collision with root package name */
    public final j[] f15416f;

    /* renamed from: g, reason: collision with root package name */
    public int f15417g;

    /* renamed from: h, reason: collision with root package name */
    public int f15418h;

    /* renamed from: i, reason: collision with root package name */
    public i f15419i;

    /* renamed from: j, reason: collision with root package name */
    public h f15420j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15421k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15422l;

    /* renamed from: m, reason: collision with root package name */
    public int f15423m;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15412b = new Object();

    /* renamed from: n, reason: collision with root package name */
    public long f15424n = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f15413c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f15414d = new ArrayDeque();

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            k.this.v();
        }
    }

    public k(i[] iVarArr, j[] jVarArr) {
        this.f15415e = iVarArr;
        this.f15417g = iVarArr.length;
        for (int i7 = 0; i7 < this.f15417g; i7++) {
            this.f15415e[i7] = i();
        }
        this.f15416f = jVarArr;
        this.f15418h = jVarArr.length;
        for (int i8 = 0; i8 < this.f15418h; i8++) {
            this.f15416f[i8] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f15411a = aVar;
        aVar.start();
    }

    @Override // j0.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void e(i iVar) {
        synchronized (this.f15412b) {
            r();
            AbstractC1297a.a(iVar == this.f15419i);
            this.f15413c.addLast(iVar);
            q();
            this.f15419i = null;
        }
    }

    @Override // j0.g
    public final void c(long j7) {
        boolean z7;
        synchronized (this.f15412b) {
            try {
                if (this.f15417g != this.f15415e.length && !this.f15421k) {
                    z7 = false;
                    AbstractC1297a.f(z7);
                    this.f15424n = j7;
                }
                z7 = true;
                AbstractC1297a.f(z7);
                this.f15424n = j7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j0.g
    public final void flush() {
        synchronized (this.f15412b) {
            try {
                this.f15421k = true;
                this.f15423m = 0;
                i iVar = this.f15419i;
                if (iVar != null) {
                    s(iVar);
                    this.f15419i = null;
                }
                while (!this.f15413c.isEmpty()) {
                    s((i) this.f15413c.removeFirst());
                }
                while (!this.f15414d.isEmpty()) {
                    ((j) this.f15414d.removeFirst()).x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h() {
        return !this.f15413c.isEmpty() && this.f15418h > 0;
    }

    public abstract i i();

    public abstract j j();

    public abstract h k(Throwable th);

    public abstract h l(i iVar, j jVar, boolean z7);

    public final boolean m() {
        h k7;
        synchronized (this.f15412b) {
            while (!this.f15422l && !h()) {
                try {
                    this.f15412b.wait();
                } finally {
                }
            }
            if (this.f15422l) {
                return false;
            }
            i iVar = (i) this.f15413c.removeFirst();
            j[] jVarArr = this.f15416f;
            int i7 = this.f15418h - 1;
            this.f15418h = i7;
            j jVar = jVarArr[i7];
            boolean z7 = this.f15421k;
            this.f15421k = false;
            if (iVar.p()) {
                jVar.l(4);
            } else {
                jVar.f15408p = iVar.f15402t;
                if (iVar.r()) {
                    jVar.l(134217728);
                }
                if (!p(iVar.f15402t)) {
                    jVar.f15410r = true;
                }
                try {
                    k7 = l(iVar, jVar, z7);
                } catch (OutOfMemoryError | RuntimeException e7) {
                    k7 = k(e7);
                }
                if (k7 != null) {
                    synchronized (this.f15412b) {
                        this.f15420j = k7;
                    }
                    return false;
                }
            }
            synchronized (this.f15412b) {
                try {
                    if (!this.f15421k) {
                        if (jVar.f15410r) {
                            this.f15423m++;
                        } else {
                            jVar.f15409q = this.f15423m;
                            this.f15423m = 0;
                            this.f15414d.addLast(jVar);
                            s(iVar);
                        }
                    }
                    jVar.x();
                    s(iVar);
                } finally {
                }
            }
            return true;
        }
    }

    @Override // j0.g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final i f() {
        i iVar;
        synchronized (this.f15412b) {
            r();
            AbstractC1297a.f(this.f15419i == null);
            int i7 = this.f15417g;
            if (i7 == 0) {
                iVar = null;
            } else {
                i[] iVarArr = this.f15415e;
                int i8 = i7 - 1;
                this.f15417g = i8;
                iVar = iVarArr[i8];
            }
            this.f15419i = iVar;
        }
        return iVar;
    }

    @Override // j0.g
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final j a() {
        synchronized (this.f15412b) {
            try {
                r();
                if (this.f15414d.isEmpty()) {
                    return null;
                }
                return (j) this.f15414d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean p(long j7) {
        boolean z7;
        synchronized (this.f15412b) {
            long j8 = this.f15424n;
            z7 = j8 == -9223372036854775807L || j7 >= j8;
        }
        return z7;
    }

    public final void q() {
        if (h()) {
            this.f15412b.notify();
        }
    }

    public final void r() {
        h hVar = this.f15420j;
        if (hVar != null) {
            throw hVar;
        }
    }

    @Override // j0.g
    public void release() {
        synchronized (this.f15412b) {
            this.f15422l = true;
            this.f15412b.notify();
        }
        try {
            this.f15411a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void s(i iVar) {
        iVar.m();
        i[] iVarArr = this.f15415e;
        int i7 = this.f15417g;
        this.f15417g = i7 + 1;
        iVarArr[i7] = iVar;
    }

    public void t(j jVar) {
        synchronized (this.f15412b) {
            u(jVar);
            q();
        }
    }

    public final void u(j jVar) {
        jVar.m();
        j[] jVarArr = this.f15416f;
        int i7 = this.f15418h;
        this.f15418h = i7 + 1;
        jVarArr[i7] = jVar;
    }

    public final void v() {
        do {
            try {
            } catch (InterruptedException e7) {
                throw new IllegalStateException(e7);
            }
        } while (m());
    }

    public final void w(int i7) {
        AbstractC1297a.f(this.f15417g == this.f15415e.length);
        for (i iVar : this.f15415e) {
            iVar.z(i7);
        }
    }
}
