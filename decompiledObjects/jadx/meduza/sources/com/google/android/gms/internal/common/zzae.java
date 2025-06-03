package com.google.android.gms.internal.common;

import java.util.Arrays;

/* loaded from: classes.dex */
class zzae extends zzaf {
    public Object[] zza = new Object[4];
    public int zzb = 0;
    public boolean zzc;

    public zzae(int i10) {
    }

    public final zzae zza(Object obj) {
        int i10;
        obj.getClass();
        int length = this.zza.length;
        int i11 = this.zzb + 1;
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i11 <= length) {
            i10 = length;
        } else {
            i10 = (length >> 1) + length + 1;
            if (i10 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i10 = highestOneBit + highestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
        }
        if (i10 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i10);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i12 = this.zzb;
        this.zzb = i12 + 1;
        objArr[i12] = obj;
        return this;
    }
}
