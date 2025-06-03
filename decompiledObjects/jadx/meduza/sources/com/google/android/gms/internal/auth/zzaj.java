package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import k6.j;

/* loaded from: classes.dex */
final class zzaj implements j {
    private final Status zza;

    public zzaj(Status status) {
        this.zza = status;
    }

    @Override // k6.j
    public final Status getStatus() {
        return this.zza;
    }
}
