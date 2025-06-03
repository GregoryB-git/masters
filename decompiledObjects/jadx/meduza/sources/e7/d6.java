package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d6 extends n6.a {
    public static final Parcelable.Creator<d6> CREATOR = new c6();

    /* renamed from: a, reason: collision with root package name */
    public final List<Integer> f4153a;

    public d6(ArrayList arrayList) {
        this.f4153a = arrayList;
    }

    public static d6 D(int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(defpackage.g.a(i10)));
        }
        return new d6(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        List<Integer> list = this.f4153a;
        if (list != null) {
            int J2 = b.z.J(1, parcel);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(list.get(i11).intValue());
            }
            b.z.L(J2, parcel);
        }
        b.z.L(J, parcel);
    }
}
