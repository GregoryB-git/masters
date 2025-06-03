/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  com.google.android.datatransport.runtime.EventInternal
 *  com.google.android.datatransport.runtime.TransportContext
 *  com.google.android.datatransport.runtime.scheduling.DefaultScheduler
 *  com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
 *  com.hintsolutions.raintv.news.NewsActivity
 *  com.hintsolutions.raintv.services.video.DownloadTracker
 *  java.lang.Object
 *  java.lang.Override
 *  ru.tvrain.core.data.IVideo
 */
import android.app.Activity;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.services.video.DownloadTracker;
import ru.tvrain.core.data.IVideo;

public final class a1
implements SynchronizationGuard.CriticalSection,
NewsActivity.HlsStreamsReadyListener {
    public final Object a;
    public final Object b;
    public final Object c;

    public /* synthetic */ a1(Object object, Object object2, Object object3) {
        this.a = object;
        this.b = object2;
        this.c = object3;
    }

    public final Object execute() {
        return DefaultScheduler.b((DefaultScheduler)((DefaultScheduler)this.a), (TransportContext)((TransportContext)this.b), (EventInternal)((EventInternal)this.c));
    }

    @Override
    public final void onReady(IVideo iVideo) {
        NewsActivity.F((NewsActivity)((NewsActivity)this.a), (DownloadTracker)((DownloadTracker)this.b), (Activity)((Activity)this.c), (IVideo)iVideo);
    }
}

