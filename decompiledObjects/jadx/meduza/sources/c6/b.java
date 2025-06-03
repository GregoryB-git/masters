package c6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import t6.a;

/* loaded from: classes.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new c();
    public static final HashMap f;

    /* renamed from: a, reason: collision with root package name */
    public final Set f2360a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2361b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2362c;

    /* renamed from: d, reason: collision with root package name */
    public int f2363d;

    /* renamed from: e, reason: collision with root package name */
    public e f2364e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("authenticatorData", new a.C0230a(11, true, 11, true, "authenticatorData", 2, g.class));
        hashMap.put("progress", new a.C0230a(11, false, 11, false, "progress", 4, e.class));
    }

    public b() {
        this.f2360a = new HashSet(1);
        this.f2361b = 1;
    }

    public b(HashSet hashSet, int i10, ArrayList arrayList, int i11, e eVar) {
        this.f2360a = hashSet;
        this.f2361b = i10;
        this.f2362c = arrayList;
        this.f2363d = i11;
        this.f2364e = eVar;
    }

    @Override // t6.a
    public final void addConcreteTypeArrayInternal(a.C0230a c0230a, String str, ArrayList arrayList) {
        int i10 = c0230a.f14623o;
        if (i10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i10), arrayList.getClass().getCanonicalName()));
        }
        this.f2362c = arrayList;
        this.f2360a.add(Integer.valueOf(i10));
    }

    @Override // t6.a
    public final void addConcreteTypeInternal(a.C0230a c0230a, String str, t6.a aVar) {
        int i10 = c0230a.f14623o;
        if (i10 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i10), aVar.getClass().getCanonicalName()));
        }
        this.f2364e = (e) aVar;
        this.f2360a.add(Integer.valueOf(i10));
    }

    @Override // t6.a
    public final /* synthetic */ Map getFieldMappings() {
        return f;
    }

    @Override // t6.a
    public final Object getFieldValue(a.C0230a c0230a) {
        int i10 = c0230a.f14623o;
        if (i10 == 1) {
            return Integer.valueOf(this.f2361b);
        }
        if (i10 == 2) {
            return this.f2362c;
        }
        if (i10 == 4) {
            return this.f2364e;
        }
        throw new IllegalStateException(defpackage.f.h("Unknown SafeParcelable id=", c0230a.f14623o));
    }

    @Override // t6.a
    public final boolean isFieldSet(a.C0230a c0230a) {
        return this.f2360a.contains(Integer.valueOf(c0230a.f14623o));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        Set set = this.f2360a;
        if (set.contains(1)) {
            z.z(parcel, 1, this.f2361b);
        }
        if (set.contains(2)) {
            z.I(parcel, 2, this.f2362c, true);
        }
        if (set.contains(3)) {
            z.z(parcel, 3, this.f2363d);
        }
        if (set.contains(4)) {
            z.E(parcel, 4, this.f2364e, i10, true);
        }
        z.L(J, parcel);
    }
}
