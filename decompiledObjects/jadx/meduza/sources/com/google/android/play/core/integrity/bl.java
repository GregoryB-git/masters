package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bl extends bi {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bn f2993c;

    /* renamed from: d, reason: collision with root package name */
    private final m7.v f2994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f2993c = bnVar;
        this.f2994d = new m7.v("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, m7.q
    public final void e(Bundle bundle) {
        k kVar;
        super.e(bundle);
        this.f2994d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        kVar = this.f2993c.f;
        k6.b a10 = kVar.a(bundle);
        if (a10 != null) {
            this.f2987a.trySetException(a10);
        } else {
            this.f2987a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
