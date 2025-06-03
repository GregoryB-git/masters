package c8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends b8.y {
    public static final Parcelable.Creator<m> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    public final List<b8.h0> f2480a;

    /* renamed from: b, reason: collision with root package name */
    public final n f2481b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2482c;

    /* renamed from: d, reason: collision with root package name */
    public final b8.c1 f2483d;

    /* renamed from: e, reason: collision with root package name */
    public final i f2484e;
    public final List<b8.l0> f;

    public m(ArrayList arrayList, n nVar, String str, b8.c1 c1Var, i iVar, ArrayList arrayList2) {
        m6.j.i(arrayList);
        this.f2480a = arrayList;
        m6.j.i(nVar);
        this.f2481b = nVar;
        m6.j.e(str);
        this.f2482c = str;
        this.f2483d = c1Var;
        this.f2484e = iVar;
        m6.j.i(arrayList2);
        this.f = arrayList2;
    }

    @Override // b8.y
    public final FirebaseAuth D() {
        return FirebaseAuth.getInstance(u7.f.f(this.f2482c));
    }

    @Override // b8.y
    public final ArrayList E() {
        ArrayList arrayList = new ArrayList();
        Iterator<b8.h0> it = this.f2480a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<b8.l0> it2 = this.f.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // b8.y
    public final n F() {
        return this.f2481b;
    }

    @Override // b8.y
    public final Task<b8.g> G(b8.w wVar) {
        Task<b8.g> zza;
        FirebaseAuth D = D();
        n nVar = this.f2481b;
        i iVar = this.f2484e;
        D.getClass();
        m6.j.i(wVar);
        m6.j.i(nVar);
        if (wVar instanceof b8.g0) {
            String str = nVar.f2491b;
            m6.j.e(str);
            zza = D.f3061e.zza(D.f3057a, iVar, (b8.g0) wVar, str, D.new d());
        } else {
            if (!(wVar instanceof b8.k0)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            String str2 = nVar.f2491b;
            m6.j.e(str2);
            zza = D.f3061e.zza(D.f3057a, iVar, (b8.k0) wVar, str2, D.f3066k, D.new d());
        }
        return zza.continueWithTask(new d2.q(this, 7));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.I(parcel, 1, this.f2480a, false);
        b.z.E(parcel, 2, this.f2481b, i10, false);
        b.z.F(parcel, 3, this.f2482c, false);
        b.z.E(parcel, 4, this.f2483d, i10, false);
        b.z.E(parcel, 5, this.f2484e, i10, false);
        b.z.I(parcel, 6, this.f, false);
        b.z.L(J, parcel);
    }
}
