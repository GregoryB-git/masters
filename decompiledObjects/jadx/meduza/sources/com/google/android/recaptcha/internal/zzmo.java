package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzmo {
    public static final zzmo zza = new zzmo(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzmo() {
        this.zzd = new HashMap();
    }

    public zzmo(boolean z10) {
        this.zzd = Collections.emptyMap();
    }

    public final zznc zza(zzoi zzoiVar, int i10) {
        return (zznc) this.zzd.get(new zzmn(zzoiVar, i10));
    }
}
