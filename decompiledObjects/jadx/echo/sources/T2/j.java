package T2;

import A2.G;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j extends B2.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: o, reason: collision with root package name */
    public final int f6073o;

    /* renamed from: p, reason: collision with root package name */
    public final G f6074p;

    public j(int i7, G g7) {
        this.f6073o = i7;
        this.f6074p = g7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.f6073o);
        B2.c.m(parcel, 2, this.f6074p, i7, false);
        B2.c.b(parcel, a7);
    }
}
