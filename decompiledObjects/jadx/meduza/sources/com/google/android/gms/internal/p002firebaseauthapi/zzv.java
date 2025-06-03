package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzv {
    private final zzf zza;
    private final zzab zzb;
    private final int zzc;

    private zzv(zzab zzabVar) {
        this(zzabVar, false, zzj.zza, Integer.MAX_VALUE);
    }

    private zzv(zzab zzabVar, boolean z10, zzf zzfVar, int i10) {
        this.zzb = zzabVar;
        this.zza = zzfVar;
        this.zzc = Integer.MAX_VALUE;
    }

    public static zzv zza(char c10) {
        zzh zzhVar = new zzh(c10);
        zzw.zza(zzhVar);
        return new zzv(new zzy(zzhVar));
    }

    public static zzv zza(String str) {
        zzl zza = zzr.zza(str);
        if (!zza.zza("").zzc()) {
            return new zzv(new zzaa(zza));
        }
        throw new IllegalArgumentException(zzae.zza("The pattern may not match the empty string: %s", zza));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzw.zza(charSequence);
        Iterator<String> zza = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add(zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
