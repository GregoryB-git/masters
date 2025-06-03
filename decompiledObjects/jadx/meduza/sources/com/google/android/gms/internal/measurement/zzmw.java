package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzmw extends zzmu<zzmx, zzmx> {
    private static void zza(Object obj, zzmx zzmxVar) {
        ((zzkg) obj).zzb = zzmxVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ int zza(zzmx zzmxVar) {
        return zzmxVar.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ zzmx zza() {
        return zzmx.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ zzmx zza(zzmx zzmxVar, zzmx zzmxVar2) {
        zzmx zzmxVar3 = zzmxVar;
        zzmx zzmxVar4 = zzmxVar2;
        return zzmx.zzc().equals(zzmxVar4) ? zzmxVar3 : zzmx.zzc().equals(zzmxVar3) ? zzmx.zza(zzmxVar3, zzmxVar4) : zzmxVar3.zza(zzmxVar4);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ void zza(zzmx zzmxVar, int i10, int i11) {
        zzmxVar.zza((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ void zza(zzmx zzmxVar, int i10, long j10) {
        zzmxVar.zza((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ void zza(zzmx zzmxVar, int i10, zziy zziyVar) {
        zzmxVar.zza((i10 << 3) | 2, zziyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ void zza(zzmx zzmxVar, int i10, zzmx zzmxVar2) {
        zzmxVar.zza((i10 << 3) | 3, zzmxVar2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ void zza(zzmx zzmxVar, zznl zznlVar) {
        zzmxVar.zza(zznlVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zza(zzmf zzmfVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ int zzb(zzmx zzmxVar) {
        return zzmxVar.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ void zzb(zzmx zzmxVar, int i10, long j10) {
        zzmxVar.zza(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ void zzb(zzmx zzmxVar, zznl zznlVar) {
        zzmxVar.zzb(zznlVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ void zzb(Object obj, zzmx zzmxVar) {
        zza(obj, zzmxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ zzmx zzc(Object obj) {
        zzmx zzmxVar = ((zzkg) obj).zzb;
        if (zzmxVar != zzmx.zzc()) {
            return zzmxVar;
        }
        zzmx zzd = zzmx.zzd();
        zza(obj, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ void zzc(Object obj, zzmx zzmxVar) {
        zza(obj, zzmxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ zzmx zzd(Object obj) {
        return ((zzkg) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final /* synthetic */ zzmx zze(zzmx zzmxVar) {
        zzmx zzmxVar2 = zzmxVar;
        zzmxVar2.zze();
        return zzmxVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzf(Object obj) {
        ((zzkg) obj).zzb.zze();
    }
}
