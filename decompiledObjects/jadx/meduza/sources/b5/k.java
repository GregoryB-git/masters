package b5;

import b.z;
import e5.g;
import java.util.Arrays;
import v3.i0;
import v5.e0;

/* loaded from: classes.dex */
public abstract class k extends e {

    /* renamed from: j, reason: collision with root package name */
    public byte[] f1897j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f1898k;

    public k(t5.k kVar, t5.n nVar, i0 i0Var, int i10, Object obj, byte[] bArr) {
        super(kVar, nVar, 3, i0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        k kVar2;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = e0.f;
            kVar2 = this;
        } else {
            kVar2 = this;
            bArr2 = bArr;
        }
        kVar2.f1897j = bArr2;
    }

    @Override // t5.d0.d
    public final void a() {
        try {
            this.f1868i.a(this.f1862b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f1898k) {
                byte[] bArr = this.f1897j;
                if (bArr.length < i11 + 16384) {
                    this.f1897j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f1868i.read(this.f1897j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f1898k) {
                ((g.a) this).f3963l = Arrays.copyOf(this.f1897j, i11);
            }
        } finally {
            z.d(this.f1868i);
        }
    }

    @Override // t5.d0.d
    public final void b() {
        this.f1898k = true;
    }
}
