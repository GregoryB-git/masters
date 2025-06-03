package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import f6.b;
import k6.j;

/* loaded from: classes.dex */
final class zzbu implements j {
    private final Status zza;
    private b zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public zzbu(b bVar) {
        this.zzb = bVar;
        this.zza = Status.f2812e;
    }

    public final b getResponse() {
        return this.zzb;
    }

    @Override // k6.j
    public final Status getStatus() {
        return this.zza;
    }
}
