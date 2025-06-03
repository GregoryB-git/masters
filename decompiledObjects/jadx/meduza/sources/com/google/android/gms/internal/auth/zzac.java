package com.google.android.gms.internal.auth;

import a6.d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import k6.a;
import k6.e;
import k6.j;

/* loaded from: classes.dex */
final class zzac extends a {
    public final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzalVar, k6.a aVar, e eVar, boolean z10) {
        super((k6.a<?>) aVar, eVar);
        this.zza = z10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final j createFailedResult(Status status) {
        return new zzaj(status);
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((d) ((zzam) bVar).getService()).u2(this.zza);
        setResult((zzac) new zzaj(Status.f2812e));
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzac) obj);
    }
}
