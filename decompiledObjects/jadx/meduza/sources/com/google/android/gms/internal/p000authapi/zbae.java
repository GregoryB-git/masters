package com.google.android.gms.internal.p000authapi;

import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.g;

/* loaded from: classes.dex */
final class zbae extends zbs {
    public final /* synthetic */ TaskCompletionSource zba;

    public zbae(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbt
    public final void zbb(Status status, g gVar) {
        if (status.D()) {
            this.zba.setResult(gVar);
        } else {
            this.zba.setException(a0.r(status));
        }
    }
}
