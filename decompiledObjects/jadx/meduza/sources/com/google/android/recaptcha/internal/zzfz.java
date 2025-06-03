package com.google.android.recaptcha.internal;

import java.util.List;
import sb.q;

/* loaded from: classes.dex */
public final class zzfz {
    private final zzjj zza;

    public zzfz() {
        this(1);
    }

    public zzfz(int i10) {
        this.zza = zzjj.zza(i10);
    }

    public final List zwk() {
        return zza();
    }

    public final List zza() {
        return q.u(this.zza);
    }

    public final boolean zzb(List list) {
        this.zza.add(list);
        return true;
    }
}
