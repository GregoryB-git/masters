package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bf extends bm {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bn f2976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, long j10, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f2976c = bnVar;
        this.f2974a = j10;
        this.f2975b = taskCompletionSource2;
    }

    @Override // m7.w
    public final void b() {
        m7.v vVar;
        if (bn.k(this.f2976c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f2976c;
            ((m7.p) bnVar.f2995a.f10359n).J(bn.b(bnVar, this.f2974a, 0), new bl(this.f2976c, this.f2975b));
        } catch (RemoteException e10) {
            bn bnVar2 = this.f2976c;
            long j10 = this.f2974a;
            vVar = bnVar2.f2996b;
            vVar.a("warmUpIntegrityToken(%s)", e10, Long.valueOf(j10));
            this.f2975b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
