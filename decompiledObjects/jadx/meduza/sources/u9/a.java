package u9;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final String f15106a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15107b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15108c;

    public a(String str, long j10, long j11) {
        this.f15106a = str;
        this.f15107b = j10;
        this.f15108c = j11;
    }

    @Override // u9.h
    public final String a() {
        return this.f15106a;
    }

    @Override // u9.h
    public final long b() {
        return this.f15108c;
    }

    @Override // u9.h
    public final long c() {
        return this.f15107b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f15106a.equals(hVar.a()) && this.f15107b == hVar.c() && this.f15108c == hVar.b();
    }

    public final int hashCode() {
        int hashCode = (this.f15106a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f15107b;
        long j11 = this.f15108c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("InstallationTokenResult{token=");
        l10.append(this.f15106a);
        l10.append(", tokenExpirationTimestamp=");
        l10.append(this.f15107b);
        l10.append(", tokenCreationTimestamp=");
        l10.append(this.f15108c);
        l10.append("}");
        return l10.toString();
    }
}
