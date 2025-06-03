package c2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final k[] f2221a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2222b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2223c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2224d;

    public j(String str, k[] kVarArr) {
        this.f2222b = str;
        this.f2223c = null;
        this.f2221a = kVarArr;
        this.f2224d = 0;
    }

    public j(byte[] bArr, k[] kVarArr) {
        Objects.requireNonNull(bArr);
        this.f2223c = bArr;
        this.f2222b = null;
        this.f2221a = kVarArr;
        this.f2224d = 1;
    }

    public final void a(int i10) {
        if (i10 == this.f2224d) {
            return;
        }
        StringBuilder l10 = defpackage.f.l("Wrong data accessor type detected. ");
        int i11 = this.f2224d;
        String str = "Unknown";
        l10.append(i11 != 0 ? i11 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        l10.append(" expected, but got ");
        if (i10 == 0) {
            str = "String";
        } else if (i10 == 1) {
            str = "ArrayBuffer";
        }
        l10.append(str);
        throw new IllegalStateException(l10.toString());
    }
}
