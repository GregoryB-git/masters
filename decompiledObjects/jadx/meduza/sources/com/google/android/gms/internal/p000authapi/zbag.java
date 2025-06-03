package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.g;
import d6.h;
import d6.i;
import d6.r;
import java.util.ArrayList;
import java.util.List;
import k6.a;
import k6.d;
import l6.n;
import l6.q;
import m6.j;

/* loaded from: classes.dex */
public final class zbag extends d implements d6.d {
    private static final a.g zba;
    private static final a.AbstractC0130a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbad zbadVar = new zbad();
        zbb = zbadVar;
        zbc = new a("Auth.Api.Identity.CredentialSaving.API", zbadVar, gVar);
    }

    public zbag(Activity activity, r rVar) {
        super(activity, (a<r>) zbc, rVar, d.a.f9097c);
        this.zbd = zbat.zba();
    }

    public zbag(Context context, r rVar) {
        super(context, (a<r>) zbc, rVar, d.a.f9097c);
        this.zbd = zbat.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status;
        return (intent == null || (status = (Status) n6.d.a(intent, "status", Status.CREATOR)) == null) ? Status.f2813o : status;
    }

    public final Task<g> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        j.i(saveAccountLinkingTokenRequest);
        new ArrayList();
        List list = saveAccountLinkingTokenRequest.f2760d;
        String str = saveAccountLinkingTokenRequest.f2759c;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.f2757a;
        String str2 = saveAccountLinkingTokenRequest.f2758b;
        int i10 = saveAccountLinkingTokenRequest.f;
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.f2761e);
        String str3 = this.zbd;
        j.a("Consent PendingIntent cannot be null", pendingIntent != null);
        j.a("Invalid tokenType", "auth_code".equals(str2));
        j.a("serviceId cannot be null or empty", !TextUtils.isEmpty(str));
        j.a("scopes cannot be null", list != null);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str, list, str3, i10);
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{zbas.zbg};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api.zbab
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zbae zbaeVar = new zbae(zbag.this, (TaskCompletionSource) obj2);
                zbn zbnVar = (zbn) ((zbh) obj).getService();
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                j.i(saveAccountLinkingTokenRequest3);
                zbnVar.zbc(zbaeVar, saveAccountLinkingTokenRequest3);
            }
        };
        aVar.f9715b = false;
        aVar.f9717d = 1535;
        return doRead(aVar.a());
    }

    @Override // d6.d
    public final Task<i> savePassword(h hVar) {
        j.i(hVar);
        final h hVar2 = new h(hVar.f3565a, this.zbd, hVar.f3567c);
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{zbas.zbe};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api.zbac
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zbaf zbafVar = new zbaf(zbag.this, (TaskCompletionSource) obj2);
                zbn zbnVar = (zbn) ((zbh) obj).getService();
                h hVar3 = hVar2;
                j.i(hVar3);
                zbnVar.zbd(zbafVar, hVar3);
            }
        };
        aVar.f9715b = false;
        aVar.f9717d = 1536;
        return doRead(aVar.a());
    }
}
