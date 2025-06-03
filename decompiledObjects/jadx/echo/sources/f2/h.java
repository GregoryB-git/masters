package f2;

import c2.C0819b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final C0819b f14213a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f14214b;

    public h(C0819b c0819b, byte[] bArr) {
        if (c0819b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f14213a = c0819b;
        this.f14214b = bArr;
    }

    public byte[] a() {
        return this.f14214b;
    }

    public C0819b b() {
        return this.f14213a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f14213a.equals(hVar.f14213a)) {
            return Arrays.equals(this.f14214b, hVar.f14214b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f14213a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14214b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f14213a + ", bytes=[...]}";
    }
}
