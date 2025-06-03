package T2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends B2.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: o, reason: collision with root package name */
    public final List f6071o;

    /* renamed from: p, reason: collision with root package name */
    public final String f6072p;

    public h(List list, String str) {
        this.f6071o = list;
        this.f6072p = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.o(parcel, 1, this.f6071o, false);
        B2.c.n(parcel, 2, this.f6072p, false);
        B2.c.b(parcel, a7);
    }
}
