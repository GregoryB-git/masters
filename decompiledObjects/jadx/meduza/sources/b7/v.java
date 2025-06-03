package b7;

import android.os.Parcel;
import android.os.Parcelable;
import b7.z;
import com.google.android.gms.internal.fido.zzbc;
import com.google.android.gms.internal.fido.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class v extends n6.a {
    public static final Parcelable.Creator<v> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final z f2014a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2015b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2016c;

    static {
        zzbc.zzk(zzh.zza, zzh.zzb);
        CREATOR = new u0();
    }

    public v(String str, byte[] bArr, ArrayList arrayList) {
        m6.j.i(str);
        try {
            this.f2014a = z.f(str);
            m6.j.i(bArr);
            this.f2015b = bArr;
            this.f2016c = arrayList;
        } catch (z.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.f2014a.equals(vVar.f2014a) || !Arrays.equals(this.f2015b, vVar.f2015b)) {
            return false;
        }
        List list2 = this.f2016c;
        if (list2 == null && vVar.f2016c == null) {
            return true;
        }
        return list2 != null && (list = vVar.f2016c) != null && list2.containsAll(list) && vVar.f2016c.containsAll(this.f2016c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2014a, Integer.valueOf(Arrays.hashCode(this.f2015b)), this.f2016c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        this.f2014a.getClass();
        b.z.F(parcel, 2, "public-key", false);
        b.z.w(parcel, 3, this.f2015b, false);
        b.z.I(parcel, 4, this.f2016c, false);
        b.z.L(J, parcel);
    }
}
