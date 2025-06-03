package ea;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final i f4943a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4944b;

    /* renamed from: c, reason: collision with root package name */
    public final double f4945c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j() {
        /*
            r3 = this;
            ea.i r0 = ea.i.COLLECTION_SDK_NOT_INSTALLED
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.j.<init>():void");
    }

    public j(i iVar, i iVar2, double d10) {
        ec.i.e(iVar, "performance");
        ec.i.e(iVar2, "crashlytics");
        this.f4943a = iVar;
        this.f4944b = iVar2;
        this.f4945c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f4943a == jVar.f4943a && this.f4944b == jVar.f4944b && Double.compare(this.f4945c, jVar.f4945c) == 0;
    }

    public final int hashCode() {
        int hashCode = (this.f4944b.hashCode() + (this.f4943a.hashCode() * 31)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.f4945c);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("DataCollectionStatus(performance=");
        l10.append(this.f4943a);
        l10.append(", crashlytics=");
        l10.append(this.f4944b);
        l10.append(", sessionSamplingRate=");
        l10.append(this.f4945c);
        l10.append(')');
        return l10.toString();
    }
}
