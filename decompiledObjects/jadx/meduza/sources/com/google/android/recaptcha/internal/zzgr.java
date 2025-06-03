package com.google.android.recaptcha.internal;

import dc.p;
import ec.j;
import rb.h;

/* loaded from: classes.dex */
final class zzgr extends j implements p {
    public final /* synthetic */ zzgd zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgr(zzgd zzgdVar, String str, int i10) {
        super(2);
        this.zza = zzgdVar;
        this.zzb = str;
        this.zzc = i10;
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i10 = this.zzc;
        if (i10 != -1) {
            this.zza.zzc().zze(i10, objArr);
        }
        return h.f13851a;
    }
}
