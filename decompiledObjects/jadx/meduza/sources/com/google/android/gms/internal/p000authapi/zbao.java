package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zbao extends zbq {
    public final /* synthetic */ TaskCompletionSource zba;

    public zbao(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbr
    public final void zbb(Status status, PendingIntent pendingIntent) {
        a0.K(status, pendingIntent, this.zba);
    }
}
