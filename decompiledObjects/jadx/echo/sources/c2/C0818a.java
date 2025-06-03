package c2;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818a extends AbstractC0820c {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10068a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10069b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0821d f10070c;

    public C0818a(Integer num, Object obj, EnumC0821d enumC0821d) {
        this.f10068a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f10069b = obj;
        if (enumC0821d == null) {
            throw new NullPointerException("Null priority");
        }
        this.f10070c = enumC0821d;
    }

    @Override // c2.AbstractC0820c
    public Integer a() {
        return this.f10068a;
    }

    @Override // c2.AbstractC0820c
    public Object b() {
        return this.f10069b;
    }

    @Override // c2.AbstractC0820c
    public EnumC0821d c() {
        return this.f10070c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0820c)) {
            return false;
        }
        AbstractC0820c abstractC0820c = (AbstractC0820c) obj;
        Integer num = this.f10068a;
        if (num != null ? num.equals(abstractC0820c.a()) : abstractC0820c.a() == null) {
            if (this.f10069b.equals(abstractC0820c.b()) && this.f10070c.equals(abstractC0820c.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f10068a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f10069b.hashCode()) * 1000003) ^ this.f10070c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f10068a + ", payload=" + this.f10069b + ", priority=" + this.f10070c + "}";
    }
}
