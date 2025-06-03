package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import b.z;
import c7.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class b extends n6.a {
    public static final Parcelable.Creator<b> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final int f2391a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2392b;

    /* renamed from: c, reason: collision with root package name */
    public final c f2393c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2394d;

    public b(int i10, String str, ArrayList arrayList, byte[] bArr) {
        this.f2391a = i10;
        this.f2392b = bArr;
        try {
            this.f2393c = c.f(str);
            this.f2394d = arrayList;
        } catch (c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Arrays.equals(this.f2392b, bVar.f2392b) || !this.f2393c.equals(bVar.f2393c)) {
            return false;
        }
        List list2 = this.f2394d;
        if (list2 == null && bVar.f2394d == null) {
            return true;
        }
        return list2 != null && (list = bVar.f2394d) != null && list2.containsAll(list) && bVar.f2394d.containsAll(this.f2394d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f2392b)), this.f2393c, this.f2394d});
    }

    public final String toString() {
        List list = this.f2394d;
        String obj = list == null ? "null" : list.toString();
        Object[] objArr = new Object[3];
        byte[] bArr = this.f2392b;
        objArr[0] = bArr == null ? null : Base64.encodeToString(bArr, 0);
        objArr[1] = this.f2393c;
        objArr[2] = obj;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f2391a);
        z.w(parcel, 2, this.f2392b, false);
        z.F(parcel, 3, this.f2393c.f2397a, false);
        z.I(parcel, 4, this.f2394d, false);
        z.L(J, parcel);
    }
}
