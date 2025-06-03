package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055w2 extends ContentObserver {
    public C1055w2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = AbstractC1028t2.f11157e;
        atomicBoolean.set(true);
    }
}
