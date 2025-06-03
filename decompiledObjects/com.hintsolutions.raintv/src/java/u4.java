/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.datatransport.runtime.TransportContext
 *  com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;

public final class u4
implements Runnable {
    public final Uploader a;
    public final TransportContext b;
    public final int c;
    public final Runnable d;

    public /* synthetic */ u4(Uploader uploader, TransportContext transportContext, int n, Runnable runnable) {
        this.a = uploader;
        this.b = transportContext;
        this.c = n;
        this.d = runnable;
    }

    public final void run() {
        Uploader.a((Uploader)this.a, (TransportContext)this.b, (int)this.c, (Runnable)this.d);
    }
}

