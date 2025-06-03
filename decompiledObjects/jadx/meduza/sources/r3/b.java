package r3;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final long f13552a;

    /* renamed from: b, reason: collision with root package name */
    public final k3.s f13553b;

    /* renamed from: c, reason: collision with root package name */
    public final k3.n f13554c;

    public b(long j10, k3.s sVar, k3.n nVar) {
        this.f13552a = j10;
        if (sVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f13553b = sVar;
        if (nVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f13554c = nVar;
    }

    @Override // r3.i
    public final k3.n a() {
        return this.f13554c;
    }

    @Override // r3.i
    public final long b() {
        return this.f13552a;
    }

    @Override // r3.i
    public final k3.s c() {
        return this.f13553b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f13552a == iVar.b() && this.f13553b.equals(iVar.c()) && this.f13554c.equals(iVar.a());
    }

    public final int hashCode() {
        long j10 = this.f13552a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13553b.hashCode()) * 1000003) ^ this.f13554c.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("PersistedEvent{id=");
        l10.append(this.f13552a);
        l10.append(", transportContext=");
        l10.append(this.f13553b);
        l10.append(", event=");
        l10.append(this.f13554c);
        l10.append("}");
        return l10.toString();
    }
}
