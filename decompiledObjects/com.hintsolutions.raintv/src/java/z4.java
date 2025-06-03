/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.datatransport.runtime.TransportContext
 *  com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader
 *  com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
 *  java.lang.Object
 */
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final class z4
implements SynchronizationGuard.CriticalSection {
    public final Uploader a;
    public final TransportContext b;
    public final long c;

    public /* synthetic */ z4(Uploader uploader, TransportContext transportContext, long l) {
        this.a = uploader;
        this.b = transportContext;
        this.c = l;
    }

    public final Object execute() {
        return Uploader.f((Uploader)this.a, (TransportContext)this.b, (long)this.c);
    }
}

