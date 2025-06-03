package b7;

import android.os.Parcel;
import android.os.Parcelable;
import b7.q;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends j {
    public static final Parcelable.Creator<i> CREATOR = new t1();

    /* renamed from: a, reason: collision with root package name */
    public final q f1969a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1970b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1971c;

    public i(int i10, String str, int i11) {
        try {
            for (q qVar : q.values()) {
                if (i10 == qVar.f1993a) {
                    this.f1969a = qVar;
                    this.f1970b = str;
                    this.f1971c = i11;
                    return;
                }
            }
            throw new q.a(i10);
        } catch (q.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m6.h.a(this.f1969a, iVar.f1969a) && m6.h.a(this.f1970b, iVar.f1970b) && m6.h.a(Integer.valueOf(this.f1971c), Integer.valueOf(iVar.f1971c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1969a, this.f1970b, Integer.valueOf(this.f1971c)});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zza.zza("errorCode", this.f1969a.f1993a);
        String str = this.f1970b;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.z(parcel, 2, this.f1969a.f1993a);
        b.z.F(parcel, 3, this.f1970b, false);
        b.z.z(parcel, 4, this.f1971c);
        b.z.L(J, parcel);
    }
}
