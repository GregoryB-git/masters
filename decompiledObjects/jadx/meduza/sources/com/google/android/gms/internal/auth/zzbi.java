package com.google.android.gms.internal.auth;

import android.content.Context;
import b6.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import k6.a;
import k6.e;
import k6.j;

/* loaded from: classes.dex */
abstract class zzbi extends a {
    public zzbi(e eVar) {
        super(b.f1910a, eVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ j createFailedResult(Status status) {
        return new zzbu(status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        zzbe zzbeVar = (zzbe) bVar;
        zza(zzbeVar.getContext(), (zzbh) zzbeVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzbi) obj);
    }

    public abstract void zza(Context context, zzbh zzbhVar);
}
