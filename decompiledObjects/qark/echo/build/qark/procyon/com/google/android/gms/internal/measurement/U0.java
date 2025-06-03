// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class U0 implements ThreadFactory
{
    public ThreadFactory a;
    
    public U0(final J0 j0) {
        this.a = Executors.defaultThreadFactory();
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.a.newThread(runnable);
        thread.setName("ScionFrontendApi");
        return thread;
    }
}
