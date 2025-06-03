package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzaq<K, V> {
    public zzap zza;
    private Object[] zzb;
    private int zzc;

    public zzaq() {
        this(4);
    }

    public zzaq(int i10) {
        this.zzb = new Object[i10 * 2];
        this.zzc = 0;
    }

    private final void zza(int i10) {
        int i11 = i10 << 1;
        Object[] objArr = this.zzb;
        if (i11 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzak.zza(objArr.length, i11));
        }
    }

    public final zzan<K, V> zza() {
        zzap zzapVar = this.zza;
        if (zzapVar != null) {
            throw zzapVar.zza();
        }
        zzau zza = zzau.zza(this.zzc, this.zzb, this);
        zzap zzapVar2 = this.zza;
        if (zzapVar2 == null) {
            return zza;
        }
        throw zzapVar2.zza();
    }

    public final zzaq<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(((Collection) iterable).size() + this.zzc);
        }
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            K key = entry.getKey();
            V value = entry.getValue();
            zza(this.zzc + 1);
            zzag.zza(key, value);
            Object[] objArr = this.zzb;
            int i10 = this.zzc;
            objArr[i10 * 2] = key;
            objArr[(i10 * 2) + 1] = value;
            this.zzc = i10 + 1;
        }
        return this;
    }
}
