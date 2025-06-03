package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
class zzajh extends zzaje {
    public final byte[] zzb;

    public zzajh(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaiw) || zzb() != ((zzaiw) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzajh)) {
            return obj.equals(this);
        }
        zzajh zzajhVar = (zzajh) obj;
        int zza = zza();
        int zza2 = zzajhVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzajhVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final zzaiw zza(int i10, int i11) {
        int zza = zzaiw.zza(0, i11, zzb());
        return zza == 0 ? zzaiw.zza : new zzaja(this.zzb, zze(), zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final void zza(zzaix zzaixVar) {
        zzaixVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final boolean zza(zzaiw zzaiwVar, int i10, int i11) {
        if (i11 > zzaiwVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i11 + zzb());
        }
        if (i11 > zzaiwVar.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i11 + ", " + zzaiwVar.zzb());
        }
        if (!(zzaiwVar instanceof zzajh)) {
            return zzaiwVar.zza(0, i11).equals(zza(0, i11));
        }
        zzajh zzajhVar = (zzajh) zzaiwVar;
        byte[] bArr = this.zzb;
        byte[] bArr2 = zzajhVar.zzb;
        int zze = zze() + i11;
        int zze2 = zze();
        int zze3 = zzajhVar.zze();
        while (zze2 < zze) {
            if (bArr[zze2] != bArr2[zze3]) {
                return false;
            }
            zze2++;
            zze3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public byte zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final int zzb(int i10, int i11, int i12) {
        return zzaki.zza(i10, this.zzb, zze(), i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final zzaji zzc() {
        return zzaji.zza(this.zzb, zze(), zzb(), true);
    }

    public int zze() {
        return 0;
    }
}
