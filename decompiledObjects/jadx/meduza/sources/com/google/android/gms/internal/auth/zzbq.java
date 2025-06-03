package com.google.android.gms.internal.auth;

import android.content.Context;
import f6.a;
import k6.e;

/* loaded from: classes.dex */
final class zzbq extends zzbi {
    public final /* synthetic */ a zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbq(zzbt zzbtVar, e eVar, a aVar) {
        super(eVar);
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbi
    public final void zza(Context context, zzbh zzbhVar) {
        zzbhVar.zze(new zzbp(this), this.zza);
    }
}
