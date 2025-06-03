package com.google.android.gms.internal.auth;

import a6.a;
import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import k6.e;
import k6.g;
import k6.j;

/* loaded from: classes.dex */
public final class zzal {
    private static final Status zza = new Status(13, null, null, null);

    public final g<Object> addWorkAccount(e eVar, String str) {
        return eVar.b(new zzae(this, a.f234a, eVar, str));
    }

    public final g<j> removeWorkAccount(e eVar, Account account) {
        return eVar.b(new zzag(this, a.f234a, eVar, account));
    }

    public final void setWorkAuthenticatorEnabled(e eVar, boolean z10) {
        setWorkAuthenticatorEnabledWithResult(eVar, z10);
    }

    public final g<j> setWorkAuthenticatorEnabledWithResult(e eVar, boolean z10) {
        return eVar.b(new zzac(this, a.f234a, eVar, z10));
    }
}
