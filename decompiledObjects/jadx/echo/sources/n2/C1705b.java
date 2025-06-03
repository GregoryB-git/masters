package n2;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1705b extends AbstractC1714k {

    /* renamed from: a, reason: collision with root package name */
    public final long f17914a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.p f17915b;

    /* renamed from: c, reason: collision with root package name */
    public final f2.i f17916c;

    public C1705b(long j7, f2.p pVar, f2.i iVar) {
        this.f17914a = j7;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f17915b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f17916c = iVar;
    }

    @Override // n2.AbstractC1714k
    public f2.i b() {
        return this.f17916c;
    }

    @Override // n2.AbstractC1714k
    public long c() {
        return this.f17914a;
    }

    @Override // n2.AbstractC1714k
    public f2.p d() {
        return this.f17915b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1714k)) {
            return false;
        }
        AbstractC1714k abstractC1714k = (AbstractC1714k) obj;
        return this.f17914a == abstractC1714k.c() && this.f17915b.equals(abstractC1714k.d()) && this.f17916c.equals(abstractC1714k.b());
    }

    public int hashCode() {
        long j7 = this.f17914a;
        return ((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f17915b.hashCode()) * 1000003) ^ this.f17916c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f17914a + ", transportContext=" + this.f17915b + ", event=" + this.f17916c + "}";
    }
}
