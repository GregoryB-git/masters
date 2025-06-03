package h9;

import j9.i;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final int f7190a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7191b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7192c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f7193d;

    public a(int i10, i iVar, byte[] bArr, byte[] bArr2) {
        this.f7190a = i10;
        if (iVar == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f7191b = iVar;
        if (bArr == null) {
            throw new NullPointerException("Null arrayValue");
        }
        this.f7192c = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Null directionalValue");
        }
        this.f7193d = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f7190a == dVar.i() && this.f7191b.equals(dVar.h())) {
            boolean z10 = dVar instanceof a;
            if (Arrays.equals(this.f7192c, z10 ? ((a) dVar).f7192c : dVar.f())) {
                if (Arrays.equals(this.f7193d, z10 ? ((a) dVar).f7193d : dVar.g())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // h9.d
    public final byte[] f() {
        return this.f7192c;
    }

    @Override // h9.d
    public final byte[] g() {
        return this.f7193d;
    }

    @Override // h9.d
    public final i h() {
        return this.f7191b;
    }

    public final int hashCode() {
        return ((((((this.f7190a ^ 1000003) * 1000003) ^ this.f7191b.hashCode()) * 1000003) ^ Arrays.hashCode(this.f7192c)) * 1000003) ^ Arrays.hashCode(this.f7193d);
    }

    @Override // h9.d
    public final int i() {
        return this.f7190a;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("IndexEntry{indexId=");
        l10.append(this.f7190a);
        l10.append(", documentKey=");
        l10.append(this.f7191b);
        l10.append(", arrayValue=");
        l10.append(Arrays.toString(this.f7192c));
        l10.append(", directionalValue=");
        l10.append(Arrays.toString(this.f7193d));
        l10.append("}");
        return l10.toString();
    }
}
