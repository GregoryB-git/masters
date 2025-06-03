package j3;

/* loaded from: classes.dex */
public final class h extends r {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f8346a;

    public h(Integer num) {
        this.f8346a = num;
    }

    @Override // j3.r
    public final Integer a() {
        return this.f8346a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f8346a;
        Integer a10 = ((r) obj).a();
        return num == null ? a10 == null : num.equals(a10);
    }

    public final int hashCode() {
        Integer num = this.f8346a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ExternalPRequestContext{originAssociatedProductId=");
        l10.append(this.f8346a);
        l10.append("}");
        return l10.toString();
    }
}
