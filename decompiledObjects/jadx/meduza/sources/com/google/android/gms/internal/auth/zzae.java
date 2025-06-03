package com.google.android.gms.internal.auth;

import a6.d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import k6.a;
import k6.e;
import k6.j;

/* loaded from: classes.dex */
final class zzae extends a {
    public final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzal zzalVar, k6.a aVar, e eVar, String str) {
        super((k6.a<?>) aVar, eVar);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ j createFailedResult(Status status) {
        return new zzai(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((d) ((zzam) bVar).getService()).R2(new zzad(this), this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzae) obj);
    }
}
