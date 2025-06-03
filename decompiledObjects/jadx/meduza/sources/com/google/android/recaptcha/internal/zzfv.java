package com.google.android.recaptcha.internal;

import a0.j;
import android.webkit.WebView;
import dc.p;
import java.util.ArrayList;
import nc.d0;
import rb.f;
import rb.h;
import sb.q;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzfv extends i implements p {
    public final /* synthetic */ String[] zza;
    public final /* synthetic */ zzfw zzb;
    public final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfv(String[] strArr, zzfw zzfwVar, String str, e eVar) {
        super(2, eVar);
        this.zza = strArr;
        this.zzb = zzfwVar;
        this.zzc = str;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzfv(this.zza, this.zzb, this.zzc, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfv) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        vb.a aVar = vb.a.f16085a;
        f.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzfw zzfwVar = this.zzb;
        String str2 = this.zzc;
        webView = zzfwVar.zza;
        webView.evaluateJavascript(j.k(str2, "(", q.p(arrayList, ",", null, null, null, 62), ")"), null);
        return h.f13851a;
    }
}
