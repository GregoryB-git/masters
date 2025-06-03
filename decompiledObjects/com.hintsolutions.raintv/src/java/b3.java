/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.source.MediaSourceEventListener
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData
 *  com.google.android.gms.tasks.TaskCompletionSource
 *  com.google.firebase.crashlytics.internal.common.Utils
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 */
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.Utils;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class b3
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ b3(Object object, Object object2, Object object3, int n) {
        this.a = n;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                MediaSourceEventListener.EventDispatcher.d((MediaSourceEventListener.EventDispatcher)((MediaSourceEventListener.EventDispatcher)this.b), (MediaSourceEventListener)((MediaSourceEventListener)this.c), (MediaSourceEventListener.MediaLoadData)((MediaSourceEventListener.MediaLoadData)this.d));
                return;
            }
        }
        Utils.e((Callable)((Callable)this.b), (Executor)((Executor)this.c), (TaskCompletionSource)((TaskCompletionSource)this.d));
    }
}

