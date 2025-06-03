package com.google.android.gms.common.internal;

import android.os.Bundle;
import m6.a0;

/* loaded from: classes.dex */
public final class k extends a0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f2855g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, int i10, Bundle bundle) {
        super(aVar, i10, bundle);
        this.f2855g = aVar;
    }

    @Override // m6.a0
    public final void c(j6.b bVar) {
        if (this.f2855g.enableLocalFallback() && a.zzo(this.f2855g)) {
            a.zzk(this.f2855g, 16);
        } else {
            this.f2855g.zzc.a(bVar);
            this.f2855g.onConnectionFailed(bVar);
        }
    }

    @Override // m6.a0
    public final boolean d() {
        this.f2855g.zzc.a(j6.b.f8468e);
        return true;
    }
}
