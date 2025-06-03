package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends n6.a {
    public static final Parcelable.Creator<e> CREATOR = new k1();

    /* renamed from: a, reason: collision with root package name */
    public final f0 f1947a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f1948b;

    /* renamed from: c, reason: collision with root package name */
    public final f f1949c;

    /* renamed from: d, reason: collision with root package name */
    public final p1 f1950d;

    public e(f0 f0Var, n1 n1Var, f fVar, p1 p1Var) {
        this.f1947a = f0Var;
        this.f1948b = n1Var;
        this.f1949c = fVar;
        this.f1950d = p1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m6.h.a(this.f1947a, eVar.f1947a) && m6.h.a(this.f1948b, eVar.f1948b) && m6.h.a(this.f1949c, eVar.f1949c) && m6.h.a(this.f1950d, eVar.f1950d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1947a, this.f1948b, this.f1949c, this.f1950d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 1, this.f1947a, i10, false);
        b.z.E(parcel, 2, this.f1948b, i10, false);
        b.z.E(parcel, 3, this.f1949c, i10, false);
        b.z.E(parcel, 4, this.f1950d, i10, false);
        b.z.L(J, parcel);
    }
}
