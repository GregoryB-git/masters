package com.google.android.recaptcha;

import ub.e;
import vb.a;
import wb.c;

/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ Recaptcha zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, e eVar) {
        super(eVar);
        this.zzb = recaptcha;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m2getClientBWLJW6A = this.zzb.m2getClientBWLJW6A(null, null, 0L, this);
        return m2getClientBWLJW6A == a.f16085a ? m2getClientBWLJW6A : new rb.e(m2getClientBWLJW6A);
    }
}
