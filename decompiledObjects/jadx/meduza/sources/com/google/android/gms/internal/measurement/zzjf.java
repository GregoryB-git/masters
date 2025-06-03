package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
class zzjf extends zzjg {
    public final byte[] zzb;

    public zzjf(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziy) || zzb() != ((zziy) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzjf)) {
            return obj.equals(this);
        }
        zzjf zzjfVar = (zzjf) obj;
        int zza = zza();
        int zza2 = zzjfVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzjfVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final zziy zza(int i10, int i11) {
        int zza = zziy.zza(0, i11, zzb());
        return zza == 0 ? zziy.zza : new zzjc(this.zzb, zzc(), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final void zza(zziv zzivVar) {
        zzivVar.zza(this.zzb, zzc(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final boolean zza(zziy zziyVar, int i10, int i11) {
        if (i11 > zziyVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i11 + zzb());
        }
        if (i11 > zziyVar.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i11 + ", " + zziyVar.zzb());
        }
        if (!(zziyVar instanceof zzjf)) {
            return zziyVar.zza(0, i11).equals(zza(0, i11));
        }
        zzjf zzjfVar = (zzjf) zziyVar;
        byte[] bArr = this.zzb;
        byte[] bArr2 = zzjfVar.zzb;
        int zzc = zzc() + i11;
        int zzc2 = zzc();
        int zzc3 = zzjfVar.zzc();
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public byte zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final int zzb(int i10, int i11, int i12) {
        return zzkj.zza(i10, this.zzb, zzc(), i12);
    }

    public int zzc() {
        return 0;
    }
}
