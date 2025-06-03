package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2979c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn f2981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f2981e = bnVar;
        this.f2977a = str;
        this.f2978b = j10;
        this.f2979c = j11;
        this.f2980d = taskCompletionSource2;
    }

    @Override // m7.w
    public final void b() {
        m7.v vVar;
        if (bn.k(this.f2981e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f2981e;
            ((m7.p) bnVar.f2995a.f10359n).z0(bn.a(bnVar, this.f2977a, this.f2978b, this.f2979c, 0), new bk(this.f2981e, this.f2980d, this.f2978b));
        } catch (RemoteException e10) {
            bn bnVar2 = this.f2981e;
            String str = this.f2977a;
            vVar = bnVar2.f2996b;
            vVar.a("requestExpressIntegrityToken(%s, %s)", e10, str, Long.valueOf(this.f2978b));
            this.f2980d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
