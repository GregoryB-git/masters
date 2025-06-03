package t5;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f14527a;

    /* renamed from: b, reason: collision with root package name */
    public final j f14528b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14529c;

    /* renamed from: d, reason: collision with root package name */
    public long f14530d;

    public k0(k kVar, u5.b bVar) {
        kVar.getClass();
        this.f14527a = kVar;
        this.f14528b = bVar;
    }

    @Override // t5.k
    public final long a(n nVar) {
        long a10 = this.f14527a.a(nVar);
        this.f14530d = a10;
        if (a10 == 0) {
            return 0L;
        }
        if (nVar.f14552g == -1 && a10 != -1) {
            nVar = nVar.b(0L, a10);
        }
        this.f14529c = true;
        this.f14528b.a(nVar);
        return this.f14530d;
    }

    @Override // t5.k
    public final void close() {
        try {
            this.f14527a.close();
        } finally {
            if (this.f14529c) {
                this.f14529c = false;
                this.f14528b.close();
            }
        }
    }

    @Override // t5.k
    public final void f(l0 l0Var) {
        l0Var.getClass();
        this.f14527a.f(l0Var);
    }

    @Override // t5.k
    public final Map<String, List<String>> h() {
        return this.f14527a.h();
    }

    @Override // t5.k
    public final Uri l() {
        return this.f14527a.l();
    }

    @Override // t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f14530d == 0) {
            return -1;
        }
        int read = this.f14527a.read(bArr, i10, i11);
        if (read > 0) {
            this.f14528b.write(bArr, i10, read);
            long j10 = this.f14530d;
            if (j10 != -1) {
                this.f14530d = j10 - read;
            }
        }
        return read;
    }
}
