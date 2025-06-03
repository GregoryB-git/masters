package com.google.android.gms.internal.p000authapi;

import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.c;

/* loaded from: classes.dex */
final class zbam extends zbl {
    public final /* synthetic */ TaskCompletionSource zba;

    public zbam(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    public final void zbb(Status status, c cVar) {
        a0.K(status, cVar, this.zba);
    }
}
