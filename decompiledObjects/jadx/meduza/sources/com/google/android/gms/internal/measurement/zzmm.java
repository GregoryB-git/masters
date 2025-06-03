package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzmm implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzmj zzd;

    private zzmm(zzmj zzmjVar) {
        this.zzd = zzmjVar;
        this.zza = -1;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzc;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        Map map;
        int i11 = this.zza + 1;
        i10 = this.zzd.zzb;
        if (i11 >= i10) {
            map = this.zzd.zzc;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i10;
        Object[] objArr;
        this.zzb = true;
        int i11 = this.zza + 1;
        this.zza = i11;
        i10 = this.zzd.zzb;
        if (i11 >= i10) {
            return (Map.Entry) zza().next();
        }
        objArr = this.zzd.zza;
        return (zzmn) objArr[this.zza];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzg();
        int i11 = this.zza;
        i10 = this.zzd.zzb;
        if (i11 >= i10) {
            zza().remove();
            return;
        }
        zzmj zzmjVar = this.zzd;
        int i12 = this.zza;
        this.zza = i12 - 1;
        zzmjVar.zzb(i12);
    }
}
