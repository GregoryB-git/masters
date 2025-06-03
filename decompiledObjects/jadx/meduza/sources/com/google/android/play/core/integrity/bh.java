package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bh extends bm {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f2982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f2983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2984c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn f2986e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(bnVar, taskCompletionSource);
        this.f2986e = bnVar;
        this.f2982a = bundle;
        this.f2983b = activity;
        this.f2984c = taskCompletionSource2;
        this.f2985d = i10;
    }

    @Override // m7.w
    public final void b() {
        m7.v vVar;
        at atVar;
        if (bn.k(this.f2986e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f2986e;
            m7.e eVar = bnVar.f2995a;
            m7.p pVar = (m7.p) eVar.f10359n;
            Bundle bundle = this.f2982a;
            atVar = bnVar.f2999e;
            pVar.y(bundle, atVar.a(this.f2983b, this.f2984c, eVar));
        } catch (RemoteException e10) {
            bn bnVar2 = this.f2986e;
            int i10 = this.f2985d;
            vVar = bnVar2.f2996b;
            vVar.a("requestAndShowDialog(%s)", e10, Integer.valueOf(i10));
            this.f2984c.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
