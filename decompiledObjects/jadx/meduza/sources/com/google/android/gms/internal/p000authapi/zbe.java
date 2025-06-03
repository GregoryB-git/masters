package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b6.f;
import b6.g;
import com.google.android.gms.common.internal.c;
import k6.e;
import m6.a;

/* loaded from: classes.dex */
public final class zbe extends c {
    private final g zba;

    public zbe(Context context, Looper looper, a aVar, g gVar, e.a aVar2, e.b bVar) {
        super(context, looper, 68, aVar, aVar2, bVar);
        f fVar = new f(gVar == null ? g.f1915c : gVar);
        fVar.f1914b = zbat.zba();
        this.zba = new g(fVar);
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbf ? (zbf) queryLocalInterface : new zbf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle getGetServiceRequestExtraArgs() {
        g gVar = this.zba;
        gVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", gVar.f1916a);
        bundle.putString("log_session_id", gVar.f1917b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a, k6.a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
