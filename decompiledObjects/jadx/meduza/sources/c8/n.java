package c8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends b8.z {
    public static final Parcelable.Creator<n> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    public String f2490a;

    /* renamed from: b, reason: collision with root package name */
    public String f2491b;

    /* renamed from: c, reason: collision with root package name */
    public List<b8.h0> f2492c;

    /* renamed from: d, reason: collision with root package name */
    public List<b8.l0> f2493d;

    /* renamed from: e, reason: collision with root package name */
    public i f2494e;

    public n() {
    }

    public n(String str, String str2, ArrayList arrayList, ArrayList arrayList2, i iVar) {
        this.f2490a = str;
        this.f2491b = str2;
        this.f2492c = arrayList;
        this.f2493d = arrayList2;
        this.f2494e = iVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2490a, false);
        b.z.F(parcel, 2, this.f2491b, false);
        b.z.I(parcel, 3, this.f2492c, false);
        b.z.I(parcel, 4, this.f2493d, false);
        b.z.E(parcel, 5, this.f2494e, i10, false);
        b.z.L(J, parcel);
    }
}
