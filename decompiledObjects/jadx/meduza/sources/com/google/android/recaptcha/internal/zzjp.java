package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzjp extends zzjk {
    public final /* synthetic */ Iterable zza;
    public final /* synthetic */ int zzb;

    public zzjp(Iterable iterable, int i10) {
        this.zza = iterable;
        this.zzb = i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i10 = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        zzjf.zzb(i10 >= 0, "numberToAdvance must be nonnegative");
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            it.next();
        }
        return new zzjo(this, it);
    }
}
