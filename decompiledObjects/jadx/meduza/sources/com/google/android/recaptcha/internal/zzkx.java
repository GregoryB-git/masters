package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzkx extends zzky {
    public final /* synthetic */ zzle zza;
    private int zzb = 0;
    private final int zzc;

    public zzkx(zzle zzleVar) {
        this.zza = zzleVar;
        this.zzc = zzleVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzla
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}
