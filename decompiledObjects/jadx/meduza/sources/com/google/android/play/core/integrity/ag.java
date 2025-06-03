package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class ag extends m7.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f2925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f2926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2927c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj f2929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(taskCompletionSource);
        this.f2929e = ajVar;
        this.f2925a = bundle;
        this.f2926b = activity;
        this.f2927c = taskCompletionSource2;
        this.f2928d = i10;
    }

    @Override // m7.w
    public final void b() {
        m7.v vVar;
        at atVar;
        try {
            aj ajVar = this.f2929e;
            m7.s sVar = (m7.s) ajVar.f2934a.f10359n;
            Bundle bundle = this.f2925a;
            atVar = ajVar.f2937d;
            sVar.y(bundle, atVar.a(this.f2926b, this.f2927c, ajVar.f2934a));
        } catch (RemoteException e10) {
            aj ajVar2 = this.f2929e;
            int i10 = this.f2928d;
            vVar = ajVar2.f2935b;
            vVar.a("requestAndShowDialog(%s)", e10, Integer.valueOf(i10));
            this.f2927c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
