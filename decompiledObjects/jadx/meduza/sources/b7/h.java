package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h extends j {
    public static final Parcelable.Creator<h> CREATOR = new s1();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1965a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1966b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1967c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f1968d;

    public h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        m6.j.i(bArr);
        this.f1965a = bArr;
        m6.j.i(bArr2);
        this.f1966b = bArr2;
        m6.j.i(bArr3);
        this.f1967c = bArr3;
        m6.j.i(strArr);
        this.f1968d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Arrays.equals(this.f1965a, hVar.f1965a) && Arrays.equals(this.f1966b, hVar.f1966b) && Arrays.equals(this.f1967c, hVar.f1967c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f1965a)), Integer.valueOf(Arrays.hashCode(this.f1966b)), Integer.valueOf(Arrays.hashCode(this.f1967c))});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f1965a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f1966b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f1967c;
        zza.zzb("attestationObject", zzf3.zzg(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.f1968d));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.w(parcel, 2, this.f1965a, false);
        b.z.w(parcel, 3, this.f1966b, false);
        b.z.w(parcel, 4, this.f1967c, false);
        String[] strArr = this.f1968d;
        if (strArr != null) {
            int J2 = b.z.J(5, parcel);
            parcel.writeStringArray(strArr);
            b.z.L(J2, parcel);
        }
        b.z.L(J, parcel);
    }
}
