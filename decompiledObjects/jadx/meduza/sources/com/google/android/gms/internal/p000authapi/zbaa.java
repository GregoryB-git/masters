package com.google.android.gms.internal.p000authapi;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.m;
import java.util.List;
import k6.a;
import k6.b;
import k6.d;
import l6.n;
import l6.q;
import m6.j;

/* loaded from: classes.dex */
public final class zbaa extends d {
    private static final a.g zba;
    private static final a.AbstractC0130a zbb;
    private static final a zbc;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zby zbyVar = new zby();
        zbb = zbyVar;
        zbc = new a("Auth.Api.Identity.Authorization.API", zbyVar, gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zbaa(android.app.Activity r3, d6.m r4) {
        /*
            r2 = this;
            k6.a r0 = com.google.android.gms.internal.p000authapi.zbaa.zbc
            java.lang.String r4 = r4.f3579a
            if (r4 == 0) goto L9
            m6.j.e(r4)
        L9:
            java.lang.String r4 = com.google.android.gms.internal.p000authapi.zbat.zba()
            m6.j.e(r4)
            d6.m r1 = new d6.m
            r1.<init>(r4)
            k6.d$a r4 = k6.d.a.f9097c
            r2.<init>(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000authapi.zbaa.<init>(android.app.Activity, d6.m):void");
    }

    public final Task<d6.a> authorize(AuthorizationRequest authorizationRequest) {
        String str;
        String str2;
        boolean z10;
        boolean z11;
        boolean z12;
        j.i(authorizationRequest);
        List list = authorizationRequest.f2750a;
        j.a("requestedScopes cannot be null or empty", (list == null || list.isEmpty()) ? false : true);
        boolean z13 = authorizationRequest.f2756p;
        String str3 = authorizationRequest.f;
        Account account = authorizationRequest.f2754e;
        String str4 = authorizationRequest.f2751b;
        if (str3 != null) {
            j.e(str3);
            str = str3;
        } else {
            str = null;
        }
        Account account2 = account != null ? account : null;
        if (!authorizationRequest.f2753d || str4 == null) {
            str2 = null;
            z10 = false;
        } else {
            str2 = str4;
            z10 = true;
        }
        if (!authorizationRequest.f2752c || str4 == null) {
            z11 = false;
            z12 = false;
        } else {
            j.a("two different server client ids provided", str2 == null || str2.equals(str4));
            z12 = z13;
            str2 = str4;
            z11 = true;
        }
        final AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(list, str2, z11, z10, account2, str, ((m) getApiOptions()).f3579a, z12);
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{zbas.zbc};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api.zbx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zbz zbzVar = new zbz(zbaa.this, (TaskCompletionSource) obj2);
                zbk zbkVar = (zbk) ((zbg) obj).getService();
                AuthorizationRequest authorizationRequest3 = authorizationRequest2;
                j.i(authorizationRequest3);
                zbkVar.zbc(zbzVar, authorizationRequest3);
            }
        };
        aVar.f9715b = false;
        aVar.f9717d = 1534;
        return doRead(aVar.a());
    }

    public final d6.a getAuthorizationResultFromIntent(Intent intent) {
        if (intent == null) {
            throw new b(Status.f2813o);
        }
        Status status = (Status) n6.d.a(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new b(Status.f2815q);
        }
        if (!status.D()) {
            throw new b(status);
        }
        d6.a aVar = (d6.a) n6.d.a(intent, "authorization_result", d6.a.CREATOR);
        if (aVar != null) {
            return aVar;
        }
        throw new b(Status.f2813o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zbaa(android.content.Context r3, d6.m r4) {
        /*
            r2 = this;
            k6.a r0 = com.google.android.gms.internal.p000authapi.zbaa.zbc
            java.lang.String r4 = r4.f3579a
            if (r4 == 0) goto L9
            m6.j.e(r4)
        L9:
            java.lang.String r4 = com.google.android.gms.internal.p000authapi.zbat.zba()
            m6.j.e(r4)
            d6.m r1 = new d6.m
            r1.<init>(r4)
            k6.d$a r4 = k6.d.a.f9097c
            r2.<init>(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000authapi.zbaa.<init>(android.content.Context, d6.m):void");
    }
}
