/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer$FrameCallback
 *  java.lang.Object
 *  kotlinx.coroutines.CancellableContinuation
 *  kotlinx.coroutines.android.HandlerDispatcherKt
 */
import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerDispatcherKt;

public final class f2
implements Choreographer.FrameCallback {
    public final CancellableContinuation a;

    public /* synthetic */ f2(CancellableContinuation cancellableContinuation) {
        this.a = cancellableContinuation;
    }

    public final void doFrame(long l4) {
        HandlerDispatcherKt.a((CancellableContinuation)this.a, (long)l4);
    }
}

