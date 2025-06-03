package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzix extends zziz {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zziy zzc;

    public zzix(zziy zziyVar) {
        this.zzc = zziyVar;
        this.zzb = zziyVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final byte zza() {
        int i10 = this.zza;
        if (i10 >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i10 + 1;
        return this.zzc.zzb(i10);
    }
}
