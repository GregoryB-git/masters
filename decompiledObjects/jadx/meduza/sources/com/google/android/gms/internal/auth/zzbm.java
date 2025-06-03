package com.google.android.gms.internal.auth;

import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f6.b;

/* loaded from: classes.dex */
final class zzbm extends zzbd {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzbm(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(b bVar) {
        a0.K(new Status(bVar.f5465a, null, null, null), bVar, this.zza);
    }
}
