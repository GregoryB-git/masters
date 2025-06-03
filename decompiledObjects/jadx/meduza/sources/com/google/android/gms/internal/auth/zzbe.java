package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import b6.b;
import com.google.android.gms.common.internal.c;
import l6.j;
import m6.a;
import m6.p;

/* loaded from: classes.dex */
public final class zzbe extends c {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, a aVar, b6.c cVar, l6.c cVar2, j jVar) {
        super(context, looper, 16, aVar, cVar2, jVar);
        this.zze = cVar == null ? new Bundle() : new Bundle(cVar.f1912a);
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.a, k6.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.a, k6.a.f
    public final boolean requiresSignIn() {
        a clientSettings = getClientSettings();
        Account account = clientSettings.f10240a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (((p) clientSettings.f10243d.get(b.f1910a)) == null) {
            return !clientSettings.f10241b.isEmpty();
        }
        throw null;
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean usesClientTelemetry() {
        return true;
    }
}
