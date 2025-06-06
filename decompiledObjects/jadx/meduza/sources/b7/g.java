package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends j {
    public static final Parcelable.Creator<g> CREATOR = new r1();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1954a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1955b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1956c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1957d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1958e;

    public g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        m6.j.i(bArr);
        this.f1954a = bArr;
        m6.j.i(bArr2);
        this.f1955b = bArr2;
        m6.j.i(bArr3);
        this.f1956c = bArr3;
        m6.j.i(bArr4);
        this.f1957d = bArr4;
        this.f1958e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Arrays.equals(this.f1954a, gVar.f1954a) && Arrays.equals(this.f1955b, gVar.f1955b) && Arrays.equals(this.f1956c, gVar.f1956c) && Arrays.equals(this.f1957d, gVar.f1957d) && Arrays.equals(this.f1958e, gVar.f1958e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f1954a)), Integer.valueOf(Arrays.hashCode(this.f1955b)), Integer.valueOf(Arrays.hashCode(this.f1956c)), Integer.valueOf(Arrays.hashCode(this.f1957d)), Integer.valueOf(Arrays.hashCode(this.f1958e))});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f1954a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f1955b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f1956c;
        zza.zzb("authenticatorData", zzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzf4 = zzch.zzf();
        byte[] bArr4 = this.f1957d;
        zza.zzb("signature", zzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f1958e;
        if (bArr5 != null) {
            zza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.w(parcel, 2, this.f1954a, false);
        b.z.w(parcel, 3, this.f1955b, false);
        b.z.w(parcel, 4, this.f1956c, false);
        b.z.w(parcel, 5, this.f1957d, false);
        b.z.w(parcel, 6, this.f1958e, false);
        b.z.L(J, parcel);
    }
}
