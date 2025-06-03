/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.datatransport.TransportScheduleCallback
 *  com.google.android.datatransport.runtime.EventInternal
 *  com.google.android.datatransport.runtime.TransportContext
 *  com.google.android.datatransport.runtime.scheduling.DefaultScheduler
 *  com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
 *  com.google.android.exoplayer2.source.MediaSourceEventListener
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;

public final class b1
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ b1(int n, Object object, Object object2, Object object3, Object object4) {
        this.a = n;
        this.b = object;
        this.c = object2;
        this.d = object3;
        this.e = object4;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                DefaultScheduler.a((DefaultScheduler)((DefaultScheduler)this.b), (TransportContext)((TransportContext)this.c), (TransportScheduleCallback)((TransportScheduleCallback)this.d), (EventInternal)((EventInternal)this.e));
                return;
            }
        }
        MediaSourceEventListener.EventDispatcher.b((MediaSourceEventListener.EventDispatcher)((MediaSourceEventListener.EventDispatcher)this.b), (MediaSourceEventListener)((MediaSourceEventListener)this.c), (MediaSource.MediaPeriodId)((MediaSource.MediaPeriodId)this.d), (MediaSourceEventListener.MediaLoadData)((MediaSourceEventListener.MediaLoadData)this.e));
    }
}

