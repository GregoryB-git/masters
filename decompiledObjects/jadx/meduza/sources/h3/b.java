package h3;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f7065a;

    public b(Integer num) {
        this.f7065a = num;
    }

    @Override // h3.f
    public final Integer a() {
        return this.f7065a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Integer num = this.f7065a;
        Integer a10 = ((f) obj).a();
        return num == null ? a10 == null : num.equals(a10);
    }

    public final int hashCode() {
        Integer num = this.f7065a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ProductData{productId=");
        l10.append(this.f7065a);
        l10.append("}");
        return l10.toString();
    }
}
