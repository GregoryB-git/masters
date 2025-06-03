package com.google.android.recaptcha.internal;

import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzbg extends i implements p {
    public zzbg(e eVar) {
        super(2, eVar);
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzbg(eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbg) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        f.b(obj);
        Thread.currentThread().setPriority(8);
        return h.f13851a;
    }
}
