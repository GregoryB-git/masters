package com.google.android.gms.internal.common;

/* loaded from: classes.dex */
final class zzaj extends zzak {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzak zzc;

    public zzaj(zzak zzakVar, int i10, int i11) {
        this.zzc = zzakVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzv.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.common.zzak, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzak subList(int i10, int i11) {
        zzv.zzc(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }
}
