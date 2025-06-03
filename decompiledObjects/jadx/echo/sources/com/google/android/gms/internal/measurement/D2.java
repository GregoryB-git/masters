package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
public final class D2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B2 f10334a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D2(B2 b22, Handler handler) {
        super(null);
        this.f10334a = b22;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        this.f10334a.e();
    }
}
