package r3;

import java.util.Arrays;
import q3.AbstractC1895k;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1919a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f19077a;

    public C1919a(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = new byte[i8];
        this.f19077a = bArr2;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
    }

    public static C1919a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static C1919a b(byte[] bArr, int i7, int i8) {
        if (bArr != null) {
            return new C1919a(bArr, i7, i8);
        }
        throw new NullPointerException("data must be non-null");
    }

    public int c() {
        return this.f19077a.length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1919a) {
            return Arrays.equals(((C1919a) obj).f19077a, this.f19077a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19077a);
    }

    public String toString() {
        return "Bytes(" + AbstractC1895k.b(this.f19077a) + ")";
    }
}
