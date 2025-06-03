package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import java.util.Objects;
import n6.a;

/* loaded from: classes.dex */
public final class zzeb extends a {
    public static final Parcelable.Creator<zzeb> CREATOR = new zzee();
    public final int zza;
    public final String zzb;
    public final Intent zzc;

    public zzeb(int i10, String str, Intent intent) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = intent;
    }

    public static zzeb zza(Activity activity) {
        return new zzeb(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzeb)) {
            return false;
        }
        zzeb zzebVar = (zzeb) obj;
        return this.zza == zzebVar.zza && Objects.equals(this.zzb, zzebVar.zzb) && Objects.equals(this.zzc, zzebVar.zzc);
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.zza);
        z.F(parcel, 2, this.zzb, false);
        z.E(parcel, 3, this.zzc, i10, false);
        z.L(J, parcel);
    }
}
