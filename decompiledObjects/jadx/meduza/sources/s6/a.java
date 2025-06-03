package s6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import b.z;
import java.util.ArrayList;
import java.util.HashMap;
import t6.a;

/* loaded from: classes.dex */
public final class a extends n6.a implements a.b<String, Integer> {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final int f14226a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14227b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f14228c;

    public a() {
        this.f14226a = 1;
        this.f14227b = new HashMap();
        this.f14228c = new SparseArray();
    }

    public a(int i10, ArrayList arrayList) {
        this.f14226a = i10;
        this.f14227b = new HashMap();
        this.f14228c = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            String str = dVar.f14232b;
            int i12 = dVar.f14233c;
            this.f14227b.put(str, Integer.valueOf(i12));
            this.f14228c.put(i12, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f14226a;
        int J = z.J(20293, parcel);
        z.z(parcel, 1, i11);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f14227b.keySet()) {
            arrayList.add(new d(str, ((Integer) this.f14227b.get(str)).intValue()));
        }
        z.I(parcel, 2, arrayList, false);
        z.L(J, parcel);
    }
}
