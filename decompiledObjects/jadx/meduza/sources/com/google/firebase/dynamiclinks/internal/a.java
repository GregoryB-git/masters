package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksService;
import k6.e;

/* loaded from: classes.dex */
public final class a extends c<IDynamicLinksService> {
    public a(Context context, Looper looper, m6.a aVar, e.a aVar2, e.b bVar) {
        super(context, looper, 131, aVar, aVar2, bVar);
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface createServiceInterface(IBinder iBinder) {
        return IDynamicLinksService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a, k6.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getServiceDescriptor() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getStartServiceAction() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean usesClientTelemetry() {
        return true;
    }
}
