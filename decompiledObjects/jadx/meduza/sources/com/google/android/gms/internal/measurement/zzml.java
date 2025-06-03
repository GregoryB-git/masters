package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzml implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzmj zzc;

    private zzml(zzmj zzmjVar) {
        int i10;
        this.zzc = zzmjVar;
        i10 = zzmjVar.zzb;
        this.zza = i10;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzb == null) {
            map = this.zzc.zzf;
            this.zzb = map.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11 = this.zza;
        if (i11 > 0) {
            i10 = this.zzc.zzb;
            if (i11 <= i10) {
                return true;
            }
        }
        return zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object[] objArr;
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        objArr = this.zzc.zza;
        int i10 = this.zza - 1;
        this.zza = i10;
        return (zzmn) objArr[i10];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
