/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  kotlinx.coroutines.DisposableHandle
 *  kotlinx.coroutines.android.HandlerContext
 */
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.android.HandlerContext;

public final class e2
implements DisposableHandle {
    public final HandlerContext a;
    public final Runnable b;

    public /* synthetic */ e2(HandlerContext handlerContext, Runnable runnable) {
        this.a = handlerContext;
        this.b = runnable;
    }

    public final void dispose() {
        HandlerContext.a((HandlerContext)this.a, (Runnable)this.b);
    }
}

