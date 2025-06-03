package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 extends n6.a {
    public static final Parcelable.Creator<f0> CREATOR = new h1();

    /* renamed from: a, reason: collision with root package name */
    public final List f1953a;

    public f0(ArrayList arrayList) {
        this.f1953a = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        List list2 = this.f1953a;
        return (list2 == null && f0Var.f1953a == null) || (list2 != null && (list = f0Var.f1953a) != null && list2.containsAll(list) && f0Var.f1953a.containsAll(this.f1953a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f1953a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.I(parcel, 1, this.f1953a, false);
        b.z.L(J, parcel);
    }
}
