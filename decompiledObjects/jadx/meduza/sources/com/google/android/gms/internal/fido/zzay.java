package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
final class zzay extends zzaz {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzaz zzc;

    public zzay(zzaz zzazVar, int i10, int i11) {
        this.zzc = zzazVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzap.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzaz, java.util.List
    /* renamed from: zzg */
    public final zzaz subList(int i10, int i11) {
        zzap.zze(i10, i11, this.zzb);
        zzaz zzazVar = this.zzc;
        int i12 = this.zza;
        return zzazVar.subList(i10 + i12, i11 + i12);
    }
}
