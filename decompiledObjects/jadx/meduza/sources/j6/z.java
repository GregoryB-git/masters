package j6;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class z extends n6.a {
    public static final Parcelable.Creator<z> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final String f8525a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8526b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8527c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f8528d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8529e;
    public final boolean f;

    public z(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f8525a = str;
        this.f8526b = z10;
        this.f8527c = z11;
        this.f8528d = (Context) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.f8529e = z12;
        this.f = z13;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f8525a;
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, str, false);
        b.z.t(parcel, 2, this.f8526b);
        b.z.t(parcel, 3, this.f8527c);
        b.z.y(parcel, 4, ObjectWrapper.wrap(this.f8528d));
        b.z.t(parcel, 5, this.f8529e);
        b.z.t(parcel, 6, this.f);
        b.z.L(J, parcel);
    }
}
