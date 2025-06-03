package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import k6.j;

/* loaded from: classes.dex */
public final class zzbv implements j {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        m6.j.i(status);
        this.zza = status;
        this.zzb = "";
    }

    public zzbv(String str) {
        m6.j.i(str);
        this.zzb = str;
        this.zza = Status.f2812e;
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // k6.j
    public final Status getStatus() {
        return this.zza;
    }
}
