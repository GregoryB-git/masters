package c6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import t6.a;

/* loaded from: classes.dex */
public final class g extends zzbz {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f2371o;

    /* renamed from: a, reason: collision with root package name */
    public final Set f2372a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2373b;

    /* renamed from: c, reason: collision with root package name */
    public i f2374c;

    /* renamed from: d, reason: collision with root package name */
    public String f2375d;

    /* renamed from: e, reason: collision with root package name */
    public String f2376e;
    public String f;

    static {
        HashMap hashMap = new HashMap();
        f2371o = hashMap;
        hashMap.put("authenticatorInfo", new a.C0230a(11, false, 11, false, "authenticatorInfo", 2, i.class));
        hashMap.put("signature", new a.C0230a(7, false, 7, false, "signature", 3, null));
        hashMap.put("package", new a.C0230a(7, false, 7, false, "package", 4, null));
    }

    public g() {
        this.f2372a = new HashSet(3);
        this.f2373b = 1;
    }

    public g(HashSet hashSet, int i10, i iVar, String str, String str2, String str3) {
        this.f2372a = hashSet;
        this.f2373b = i10;
        this.f2374c = iVar;
        this.f2375d = str;
        this.f2376e = str2;
        this.f = str3;
    }

    @Override // t6.a
    public final void addConcreteTypeInternal(a.C0230a c0230a, String str, t6.a aVar) {
        int i10 = c0230a.f14623o;
        if (i10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i10), aVar.getClass().getCanonicalName()));
        }
        this.f2374c = (i) aVar;
        this.f2372a.add(Integer.valueOf(i10));
    }

    @Override // t6.a
    public final /* synthetic */ Map getFieldMappings() {
        return f2371o;
    }

    @Override // t6.a
    public final Object getFieldValue(a.C0230a c0230a) {
        int i10 = c0230a.f14623o;
        if (i10 == 1) {
            return Integer.valueOf(this.f2373b);
        }
        if (i10 == 2) {
            return this.f2374c;
        }
        if (i10 == 3) {
            return this.f2375d;
        }
        if (i10 == 4) {
            return this.f2376e;
        }
        throw new IllegalStateException(defpackage.f.h("Unknown SafeParcelable id=", c0230a.f14623o));
    }

    @Override // t6.a
    public final boolean isFieldSet(a.C0230a c0230a) {
        return this.f2372a.contains(Integer.valueOf(c0230a.f14623o));
    }

    @Override // t6.a
    public final void setStringInternal(a.C0230a c0230a, String str, String str2) {
        int i10 = c0230a.f14623o;
        if (i10 == 3) {
            this.f2375d = str2;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i10)));
            }
            this.f2376e = str2;
        }
        this.f2372a.add(Integer.valueOf(i10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        Set set = this.f2372a;
        if (set.contains(1)) {
            z.z(parcel, 1, this.f2373b);
        }
        if (set.contains(2)) {
            z.E(parcel, 2, this.f2374c, i10, true);
        }
        if (set.contains(3)) {
            z.F(parcel, 3, this.f2375d, true);
        }
        if (set.contains(4)) {
            z.F(parcel, 4, this.f2376e, true);
        }
        if (set.contains(5)) {
            z.F(parcel, 5, this.f, true);
        }
        z.L(J, parcel);
    }
}
