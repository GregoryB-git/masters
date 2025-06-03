package z4;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import z4.y;

/* loaded from: classes.dex */
public final class m implements t5.k {

    /* renamed from: a, reason: collision with root package name */
    public final t5.k f17696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17697b;

    /* renamed from: c, reason: collision with root package name */
    public final a f17698c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f17699d;

    /* renamed from: e, reason: collision with root package name */
    public int f17700e;

    public interface a {
    }

    public m(t5.j0 j0Var, int i10, a aVar) {
        x6.b.q(i10 > 0);
        this.f17696a = j0Var;
        this.f17697b = i10;
        this.f17698c = aVar;
        this.f17699d = new byte[1];
        this.f17700e = i10;
    }

    @Override // t5.k
    public final long a(t5.n nVar) {
        throw new UnsupportedOperationException();
    }

    @Override // t5.k
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // t5.k
    public final void f(t5.l0 l0Var) {
        l0Var.getClass();
        this.f17696a.f(l0Var);
    }

    @Override // t5.k
    public final Map<String, List<String>> h() {
        return this.f17696a.h();
    }

    @Override // t5.k
    public final Uri l() {
        return this.f17696a.l();
    }

    @Override // t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        if (this.f17700e == 0) {
            boolean z10 = false;
            if (this.f17696a.read(this.f17699d, 0, 1) != -1) {
                int i12 = (this.f17699d[0] & 255) << 4;
                if (i12 != 0) {
                    byte[] bArr2 = new byte[i12];
                    int i13 = i12;
                    int i14 = 0;
                    while (i13 > 0) {
                        int read = this.f17696a.read(bArr2, i14, i13);
                        if (read == -1) {
                            break;
                        }
                        i14 += read;
                        i13 -= read;
                    }
                    while (i12 > 0) {
                        int i15 = i12 - 1;
                        if (bArr2[i15] != 0) {
                            break;
                        }
                        i12 = i15;
                    }
                    if (i12 > 0) {
                        a aVar = this.f17698c;
                        v5.u uVar = new v5.u(bArr2, i12);
                        y.a aVar2 = (y.a) aVar;
                        if (aVar2.f17773m) {
                            y yVar = y.this;
                            Map<String, String> map = y.U;
                            max = Math.max(yVar.w(true), aVar2.f17770j);
                        } else {
                            max = aVar2.f17770j;
                        }
                        int i16 = uVar.f15976c - uVar.f15975b;
                        b0 b0Var = aVar2.f17772l;
                        b0Var.getClass();
                        b0Var.a(i16, uVar);
                        b0Var.c(max, 1, i16, 0, null);
                        aVar2.f17773m = true;
                    }
                }
                z10 = true;
            }
            if (!z10) {
                return -1;
            }
            this.f17700e = this.f17697b;
        }
        int read2 = this.f17696a.read(bArr, i10, Math.min(this.f17700e, i11));
        if (read2 != -1) {
            this.f17700e -= read2;
        }
        return read2;
    }
}
