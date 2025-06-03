package j3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8344a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8345b;

    public g(byte[] bArr, byte[] bArr2) {
        this.f8344a = bArr;
        this.f8345b = bArr2;
    }

    @Override // j3.q
    public final byte[] a() {
        return this.f8344a;
    }

    @Override // j3.q
    public final byte[] b() {
        return this.f8345b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        boolean z10 = qVar instanceof g;
        if (Arrays.equals(this.f8344a, z10 ? ((g) qVar).f8344a : qVar.a())) {
            if (Arrays.equals(this.f8345b, z10 ? ((g) qVar).f8345b : qVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f8344a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8345b);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ExperimentIds{clearBlob=");
        l10.append(Arrays.toString(this.f8344a));
        l10.append(", encryptedBlob=");
        l10.append(Arrays.toString(this.f8345b));
        l10.append("}");
        return l10.toString();
    }
}
