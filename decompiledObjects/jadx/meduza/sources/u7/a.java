package u7;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final long f15074a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15075b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15076c;

    public a(long j10, long j11, long j12) {
        this.f15074a = j10;
        this.f15075b = j11;
        this.f15076c = j12;
    }

    @Override // u7.l
    public final long a() {
        return this.f15075b;
    }

    @Override // u7.l
    public final long b() {
        return this.f15074a;
    }

    @Override // u7.l
    public final long c() {
        return this.f15076c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f15074a == lVar.b() && this.f15075b == lVar.a() && this.f15076c == lVar.c();
    }

    public final int hashCode() {
        long j10 = this.f15074a;
        long j11 = this.f15075b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f15076c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("StartupTime{epochMillis=");
        l10.append(this.f15074a);
        l10.append(", elapsedRealtime=");
        l10.append(this.f15075b);
        l10.append(", uptimeMillis=");
        l10.append(this.f15076c);
        l10.append("}");
        return l10.toString();
    }
}
