package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzy implements Iterable {
    public final /* synthetic */ CharSequence zza;
    public final /* synthetic */ zzaa zzb;

    public zzy(zzaa zzaaVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzaaVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzh;
        zzh = this.zzb.zzh(this.zza);
        return zzh;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                CharSequence zza = zzt.zza(it.next(), ", ");
                while (true) {
                    sb2.append(zza);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) ", ");
                    zza = zzt.zza(it.next(), ", ");
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
