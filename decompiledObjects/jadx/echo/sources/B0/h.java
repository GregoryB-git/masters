package B0;

import B0.b;
import g0.AbstractC1297a;
import g0.M;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f585a;

    /* renamed from: b, reason: collision with root package name */
    public final int f586b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f587c;

    /* renamed from: d, reason: collision with root package name */
    public int f588d;

    /* renamed from: e, reason: collision with root package name */
    public int f589e;

    /* renamed from: f, reason: collision with root package name */
    public int f590f;

    /* renamed from: g, reason: collision with root package name */
    public a[] f591g;

    public h(boolean z7, int i7) {
        this(z7, i7, 0);
    }

    @Override // B0.b
    public synchronized void a() {
        try {
            int i7 = 0;
            int max = Math.max(0, M.k(this.f588d, this.f586b) - this.f589e);
            int i8 = this.f590f;
            if (max >= i8) {
                return;
            }
            if (this.f587c != null) {
                int i9 = i8 - 1;
                while (i7 <= i9) {
                    a aVar = (a) AbstractC1297a.e(this.f591g[i7]);
                    if (aVar.f574a == this.f587c) {
                        i7++;
                    } else {
                        a aVar2 = (a) AbstractC1297a.e(this.f591g[i9]);
                        if (aVar2.f574a != this.f587c) {
                            i9--;
                        } else {
                            a[] aVarArr = this.f591g;
                            aVarArr[i7] = aVar2;
                            aVarArr[i9] = aVar;
                            i9--;
                            i7++;
                        }
                    }
                }
                max = Math.max(max, i7);
                if (max >= this.f590f) {
                    return;
                }
            }
            Arrays.fill(this.f591g, max, this.f590f, (Object) null);
            this.f590f = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // B0.b
    public synchronized void b(b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.f591g;
                int i7 = this.f590f;
                this.f590f = i7 + 1;
                aVarArr[i7] = aVar.a();
                this.f589e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // B0.b
    public synchronized void c(a aVar) {
        a[] aVarArr = this.f591g;
        int i7 = this.f590f;
        this.f590f = i7 + 1;
        aVarArr[i7] = aVar;
        this.f589e--;
        notifyAll();
    }

    @Override // B0.b
    public synchronized a d() {
        a aVar;
        try {
            this.f589e++;
            int i7 = this.f590f;
            if (i7 > 0) {
                a[] aVarArr = this.f591g;
                int i8 = i7 - 1;
                this.f590f = i8;
                aVar = (a) AbstractC1297a.e(aVarArr[i8]);
                this.f591g[this.f590f] = null;
            } else {
                aVar = new a(new byte[this.f586b], 0);
                int i9 = this.f589e;
                a[] aVarArr2 = this.f591g;
                if (i9 > aVarArr2.length) {
                    this.f591g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    @Override // B0.b
    public int e() {
        return this.f586b;
    }

    public synchronized int f() {
        return this.f589e * this.f586b;
    }

    public synchronized void g() {
        if (this.f585a) {
            h(0);
        }
    }

    public synchronized void h(int i7) {
        boolean z7 = i7 < this.f588d;
        this.f588d = i7;
        if (z7) {
            a();
        }
    }

    public h(boolean z7, int i7, int i8) {
        AbstractC1297a.a(i7 > 0);
        AbstractC1297a.a(i8 >= 0);
        this.f585a = z7;
        this.f586b = i7;
        this.f590f = i8;
        this.f591g = new a[i8 + 100];
        if (i8 <= 0) {
            this.f587c = null;
            return;
        }
        this.f587c = new byte[i8 * i7];
        for (int i9 = 0; i9 < i8; i9++) {
            this.f591g[i9] = new a(this.f587c, i9 * i7);
        }
    }
}
