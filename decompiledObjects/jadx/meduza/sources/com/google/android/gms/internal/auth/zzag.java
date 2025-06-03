package com.google.android.gms.internal.auth;

import a6.d;
import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import k6.a;
import k6.e;
import k6.j;

/* loaded from: classes.dex */
final class zzag extends a {
    public final /* synthetic */ Account zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzal zzalVar, k6.a aVar, e eVar, Account account) {
        super((k6.a<?>) aVar, eVar);
        this.zza = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final j createFailedResult(Status status) {
        return new zzak(status);
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((d) ((zzam) bVar).getService()).z2(new zzaf(this), this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzag) obj);
    }
}
