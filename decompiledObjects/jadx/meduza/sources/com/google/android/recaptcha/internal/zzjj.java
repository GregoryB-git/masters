package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes.dex */
public final class zzjj extends zzjn implements Serializable {
    public final int zza;
    private final Queue zzb;

    private zzjj(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(zzji.zza("maxSize (%s) must >= 0", Integer.valueOf(i10)));
        }
        this.zzb = new ArrayDeque(i10);
        this.zza = i10;
    }

    public static zzjj zza(int i10) {
        return new zzjj(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzjl, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzjl, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it;
        int size = collection.size();
        if (size >= this.zza) {
            clear();
            int i10 = size - this.zza;
            zzjf.zzb(i10 >= 0, "number to skip cannot be negative");
            it = new zzjp(collection, i10).iterator();
        } else {
            it = collection.iterator();
        }
        return zzjq.zza(this, it);
    }

    @Override // com.google.android.recaptcha.internal.zzjn, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzjl, com.google.android.recaptcha.internal.zzjm
    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzjn, com.google.android.recaptcha.internal.zzjl
    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzjn
    public final Queue zzd() {
        return this.zzb;
    }
}
