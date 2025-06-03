package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class a2 extends n6.a {
    public static final Parcelable.Creator<a2> CREATOR = new b2();

    /* renamed from: a, reason: collision with root package name */
    public final List f1922a;

    public a2(ArrayList arrayList) {
        m6.j.i(arrayList);
        this.f1922a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return this.f1922a.containsAll(a2Var.f1922a) && a2Var.f1922a.containsAll(this.f1922a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f1922a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.I(parcel, 1, this.f1922a, false);
        b.z.L(J, parcel);
    }
}
