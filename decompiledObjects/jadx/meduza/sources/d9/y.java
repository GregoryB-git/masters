package d9;

/* loaded from: classes.dex */
public final class y implements Comparable<y> {

    /* renamed from: a, reason: collision with root package name */
    public final double f3737a;

    /* renamed from: b, reason: collision with root package name */
    public final double f3738b;

    public y(double d10, double d11) {
        if (Double.isNaN(d10) || d10 < -90.0d || d10 > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        }
        if (Double.isNaN(d11) || d11 < -180.0d || d11 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        this.f3737a = d10;
        this.f3738b = d11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(y yVar) {
        y yVar2 = yVar;
        double d10 = this.f3737a;
        double d11 = yVar2.f3737a;
        r3.j jVar = n9.o.f11373a;
        int j10 = b.z.j(d10, d11);
        return j10 == 0 ? b.z.j(this.f3738b, yVar2.f3738b) : j10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f3737a == yVar.f3737a && this.f3738b == yVar.f3738b;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f3737a);
        int i10 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f3738b);
        return (i10 * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("GeoPoint { latitude=");
        l10.append(this.f3737a);
        l10.append(", longitude=");
        l10.append(this.f3738b);
        l10.append(" }");
        return l10.toString();
    }
}
