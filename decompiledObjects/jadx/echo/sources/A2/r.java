package A2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class r extends B2.a {

    @NonNull
    public static final Parcelable.Creator<r> CREATOR = new C0335v();

    /* renamed from: o, reason: collision with root package name */
    public final int f533o;

    /* renamed from: p, reason: collision with root package name */
    public List f534p;

    public r(int i7, List list) {
        this.f533o = i7;
        this.f534p = list;
    }

    public final int a() {
        return this.f533o;
    }

    public final List d() {
        return this.f534p;
    }

    public final void f(C0326l c0326l) {
        if (this.f534p == null) {
            this.f534p = new ArrayList();
        }
        this.f534p.add(c0326l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.f533o);
        B2.c.q(parcel, 2, this.f534p, false);
        B2.c.b(parcel, a7);
    }
}
