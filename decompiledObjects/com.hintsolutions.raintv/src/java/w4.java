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

public final class w4
implements SynchronizationGuard.CriticalSection {
    public final int a;
    public final Uploader b;
    public final TransportContext c;

    public /* synthetic */ w4(Uploader uploader, TransportContext transportContext, int n) {
        this.a = n;
        this.b = uploader;
        this.c = transportContext;
    }

    public final Object execute() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return Uploader.b((Uploader)this.b, (TransportContext)this.c);
            }
        }
        return Uploader.d((Uploader)this.b, (TransportContext)this.c);
    }
}

