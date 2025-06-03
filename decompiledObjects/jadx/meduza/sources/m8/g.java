package m8;

import java.util.Arrays;
import m8.f0;

/* loaded from: classes.dex */
public final class g extends f0.d.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10580a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10581b;

    public g(String str, byte[] bArr) {
        this.f10580a = str;
        this.f10581b = bArr;
    }

    @Override // m8.f0.d.a
    public final byte[] a() {
        return this.f10581b;
    }

    @Override // m8.f0.d.a
    public final String b() {
        return this.f10580a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.d.a)) {
            return false;
        }
        f0.d.a aVar = (f0.d.a) obj;
        if (this.f10580a.equals(aVar.b())) {
            if (Arrays.equals(this.f10581b, aVar instanceof g ? ((g) aVar).f10581b : aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10580a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10581b);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("File{filename=");
        l10.append(this.f10580a);
        l10.append(", contents=");
        l10.append(Arrays.toString(this.f10581b));
        l10.append("}");
        return l10.toString();
    }
}
