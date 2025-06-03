package w5;

import java.util.Arrays;
import v5.e0;

/* loaded from: classes.dex */
public final class b implements v3.g {
    public static final String f = e0.E(0);

    /* renamed from: o, reason: collision with root package name */
    public static final String f16323o = e0.E(1);

    /* renamed from: p, reason: collision with root package name */
    public static final String f16324p = e0.E(2);

    /* renamed from: q, reason: collision with root package name */
    public static final String f16325q = e0.E(3);

    /* renamed from: r, reason: collision with root package name */
    public static final e0.d f16326r = new e0.d(19);

    /* renamed from: a, reason: collision with root package name */
    public final int f16327a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16328b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16329c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f16330d;

    /* renamed from: e, reason: collision with root package name */
    public int f16331e;

    public b(int i10, byte[] bArr, int i11, int i12) {
        this.f16327a = i10;
        this.f16328b = i11;
        this.f16329c = i12;
        this.f16330d = bArr;
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16327a == bVar.f16327a && this.f16328b == bVar.f16328b && this.f16329c == bVar.f16329c && Arrays.equals(this.f16330d, bVar.f16330d);
    }

    public final int hashCode() {
        if (this.f16331e == 0) {
            this.f16331e = Arrays.hashCode(this.f16330d) + ((((((527 + this.f16327a) * 31) + this.f16328b) * 31) + this.f16329c) * 31);
        }
        return this.f16331e;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ColorInfo(");
        l10.append(this.f16327a);
        l10.append(", ");
        l10.append(this.f16328b);
        l10.append(", ");
        l10.append(this.f16329c);
        l10.append(", ");
        l10.append(this.f16330d != null);
        l10.append(")");
        return l10.toString();
    }
}
