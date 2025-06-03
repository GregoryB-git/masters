package j9;

import j9.k;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: c, reason: collision with root package name */
    public final int f8667c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8668d;

    /* renamed from: e, reason: collision with root package name */
    public final List<k.c> f8669e;
    public final k.b f;

    public a(int i10, String str, List<k.c> list, k.b bVar) {
        this.f8667c = i10;
        if (str == null) {
            throw new NullPointerException("Null collectionGroup");
        }
        this.f8668d = str;
        if (list == null) {
            throw new NullPointerException("Null segments");
        }
        this.f8669e = list;
        if (bVar == null) {
            throw new NullPointerException("Null indexState");
        }
        this.f = bVar;
    }

    @Override // j9.k
    public final String b() {
        return this.f8668d;
    }

    @Override // j9.k
    public final int d() {
        return this.f8667c;
    }

    @Override // j9.k
    public final k.b e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f8667c == kVar.d() && this.f8668d.equals(kVar.b()) && this.f8669e.equals(kVar.f()) && this.f.equals(kVar.e());
    }

    @Override // j9.k
    public final List<k.c> f() {
        return this.f8669e;
    }

    public final int hashCode() {
        return ((((((this.f8667c ^ 1000003) * 1000003) ^ this.f8668d.hashCode()) * 1000003) ^ this.f8669e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("FieldIndex{indexId=");
        l10.append(this.f8667c);
        l10.append(", collectionGroup=");
        l10.append(this.f8668d);
        l10.append(", segments=");
        l10.append(this.f8669e);
        l10.append(", indexState=");
        l10.append(this.f);
        l10.append("}");
        return l10.toString();
    }
}
