package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class af extends m7.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f2920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f2921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f2923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj f2924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f2924e = ajVar;
        this.f2920a = bArr;
        this.f2921b = l10;
        this.f2922c = taskCompletionSource2;
        this.f2923d = integrityTokenRequest;
    }

    @Override // m7.w
    public final void a(Exception exc) {
        if (exc instanceof m7.f) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // m7.w
    public final void b() {
        m7.v vVar;
        try {
            aj ajVar = this.f2924e;
            ((m7.s) ajVar.f2934a.f10359n).z1(aj.a(ajVar, this.f2920a, this.f2921b, null), new ai(this.f2924e, this.f2922c));
        } catch (RemoteException e10) {
            aj ajVar2 = this.f2924e;
            IntegrityTokenRequest integrityTokenRequest = this.f2923d;
            vVar = ajVar2.f2935b;
            vVar.a("requestIntegrityToken(%s)", e10, integrityTokenRequest);
            this.f2922c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
