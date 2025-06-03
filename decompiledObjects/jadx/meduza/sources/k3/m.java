package k3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final h3.c f8907a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8908b;

    public m(h3.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f8907a = cVar;
        this.f8908b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f8907a.equals(mVar.f8907a)) {
            return Arrays.equals(this.f8908b, mVar.f8908b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8907a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8908b);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("EncodedPayload{encoding=");
        l10.append(this.f8907a);
        l10.append(", bytes=[...]}");
        return l10.toString();
    }
}
