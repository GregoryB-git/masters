package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bk extends bi {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bn f2990c;

    /* renamed from: d, reason: collision with root package name */
    private final m7.v f2991d;

    /* renamed from: e, reason: collision with root package name */
    private final long f2992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j10) {
        super(bnVar, taskCompletionSource);
        this.f2990c = bnVar;
        this.f2991d = new m7.v("OnRequestIntegrityTokenCallback");
        this.f2992e = j10;
    }

    @Override // com.google.android.play.core.integrity.bi, m7.q
    public final void c(Bundle bundle) {
        k kVar;
        String str;
        super.c(bundle);
        this.f2991d.b("onRequestExpressIntegrityToken", new Object[0]);
        kVar = this.f2990c.f;
        k6.b a10 = kVar.a(bundle);
        if (a10 != null) {
            this.f2987a.trySetException(a10);
            return;
        }
        long j10 = bundle.getLong("request.token.sid");
        str = this.f2990c.f2997c;
        bj bjVar = new bj(this, str, j10);
        TaskCompletionSource taskCompletionSource = this.f2987a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
