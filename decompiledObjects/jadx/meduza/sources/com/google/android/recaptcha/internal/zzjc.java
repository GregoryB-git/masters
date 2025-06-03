package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzjc extends i implements p {
    public final /* synthetic */ zzjd zza;
    public final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjc(zzjd zzjdVar, Context context, e eVar) {
        super(2, eVar);
        this.zza = zzjdVar;
        this.zzb = context;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzjc(this.zza, this.zzb, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjc) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        vb.a aVar = vb.a.f16085a;
        f.b(obj);
        webView = this.zza.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        this.zza.zza = webView;
        return webView;
    }
}
