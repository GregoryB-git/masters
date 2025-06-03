package j3;

/* loaded from: classes.dex */
public final class l extends v {

    /* renamed from: a, reason: collision with root package name */
    public final long f8370a;

    public l(long j10) {
        this.f8370a = j10;
    }

    @Override // j3.v
    public final long b() {
        return this.f8370a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f8370a == ((v) obj).b();
    }

    public final int hashCode() {
        long j10 = this.f8370a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("LogResponse{nextRequestWaitMillis=");
        l10.append(this.f8370a);
        l10.append("}");
        return l10.toString();
    }
}
