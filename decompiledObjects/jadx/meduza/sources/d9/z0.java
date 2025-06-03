package d9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f3740a;

    public z0(double[] dArr) {
        this.f3740a = (double[]) dArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3740a, ((z0) obj).f3740a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3740a);
    }
}
