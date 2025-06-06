package com.google.android.gms.internal.common;

import java.util.Objects;
import org.jspecify.annotations.NullMarked;

@NullMarked
/* loaded from: classes.dex */
final class zzam extends zzak {
    public static final zzak zza = new zzam(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzam(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzv.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzak, com.google.android.gms.internal.common.zzag
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final Object[] zzg() {
        return this.zzb;
    }
}
