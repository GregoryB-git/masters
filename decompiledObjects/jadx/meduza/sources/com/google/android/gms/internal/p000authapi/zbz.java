package com.google.android.gms.internal.p000authapi;

import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.a;

/* loaded from: classes.dex */
final class zbz extends zbi {
    public final /* synthetic */ TaskCompletionSource zba;

    public zbz(zbaa zbaaVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbj
    public final void zbb(Status status, a aVar) {
        if (status.D()) {
            this.zba.setResult(aVar);
        } else {
            this.zba.setException(a0.r(status));
        }
    }
}
