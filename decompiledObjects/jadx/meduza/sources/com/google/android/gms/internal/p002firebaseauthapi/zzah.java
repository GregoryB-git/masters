package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzah<E> extends zzak<E> {
    public Object[] zza;
    public int zzb;
    public boolean zzc;

    public zzah(int i10) {
        zzag.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }

    public zzah<E> zza(E e10) {
        zzw.zza(e10);
        Object[] objArr = this.zza;
        int zza = zzak.zza(objArr.length, this.zzb + 1);
        if (zza > objArr.length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zza);
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr2[i10] = e10;
        return this;
    }
}
