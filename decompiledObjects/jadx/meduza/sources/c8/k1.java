package c8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class k1 implements b8.g {
    public static final Parcelable.Creator<k1> CREATOR = new j1();

    /* renamed from: a, reason: collision with root package name */
    public i f2474a;

    /* renamed from: b, reason: collision with root package name */
    public i1 f2475b;

    /* renamed from: c, reason: collision with root package name */
    public b8.c1 f2476c;

    public k1(i iVar) {
        m6.j.i(iVar);
        this.f2474a = iVar;
        List<e> list = iVar.f2457e;
        this.f2475b = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!TextUtils.isEmpty(list.get(i10).f2437q)) {
                this.f2475b = new i1(list.get(i10).f2431b, list.get(i10).f2437q, iVar.f2461r);
            }
        }
        if (this.f2475b == null) {
            this.f2475b = new i1(iVar.f2461r);
        }
        this.f2476c = iVar.f2462s;
    }

    public k1(i iVar, i1 i1Var, b8.c1 c1Var) {
        this.f2474a = iVar;
        this.f2475b = i1Var;
        this.f2476c = c1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // b8.g
    public final i1 s() {
        return this.f2475b;
    }

    @Override // b8.g
    public final b8.c1 t() {
        return this.f2476c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 1, this.f2474a, i10, false);
        b.z.E(parcel, 2, this.f2475b, i10, false);
        b.z.E(parcel, 3, this.f2476c, i10, false);
        b.z.L(J, parcel);
    }

    @Override // b8.g
    public final i z() {
        return this.f2474a;
    }
}
