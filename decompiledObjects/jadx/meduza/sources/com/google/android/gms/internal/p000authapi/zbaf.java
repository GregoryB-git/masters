package com.google.android.gms.internal.p000authapi;

import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.i;

/* loaded from: classes.dex */
final class zbaf extends zbu {
    public final /* synthetic */ TaskCompletionSource zba;

    public zbaf(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbv
    public final void zbb(Status status, i iVar) {
        a0.K(status, iVar, this.zba);
    }
}
