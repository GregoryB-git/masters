package com.google.android.gms.internal.p001authapiphone;

import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzu extends IStatusCallback.Stub {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        if (status.f2816a == 6) {
            this.zza.trySetException(a0.r(status));
        } else {
            a0.K(status, null, this.zza);
        }
    }
}
