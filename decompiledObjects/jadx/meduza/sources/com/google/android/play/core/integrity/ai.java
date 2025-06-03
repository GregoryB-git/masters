package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class ai extends com.google.android.play.integrity.internal.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aj f2931a;

    /* renamed from: b, reason: collision with root package name */
    private final m7.v f2932b = new m7.v("OnRequestIntegrityTokenCallback");

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f2933c;

    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f2931a = ajVar;
        this.f2933c = taskCompletionSource;
    }

    @Override // m7.t
    public final void b(Bundle bundle) {
        k kVar;
        String str;
        this.f2931a.f2934a.d(this.f2933c);
        this.f2932b.b("onRequestIntegrityToken", new Object[0]);
        kVar = this.f2931a.f2938e;
        k6.b a10 = kVar.a(bundle);
        if (a10 != null) {
            this.f2933c.trySetException(a10);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f2933c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        long j10 = bundle.getLong("request.token.sid");
        str = this.f2931a.f2936c;
        ah ahVar = new ah(this, str, j10);
        TaskCompletionSource taskCompletionSource = this.f2933c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
