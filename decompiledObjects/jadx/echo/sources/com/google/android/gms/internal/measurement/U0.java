package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class U0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public ThreadFactory f10656a = Executors.defaultThreadFactory();

    public U0(J0 j02) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f10656a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
