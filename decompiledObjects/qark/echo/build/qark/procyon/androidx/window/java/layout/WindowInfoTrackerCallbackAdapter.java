// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.java.layout;

import android.app.Activity;
import java.util.concurrent.CancellationException;
import V5.t;
import g6.p;
import p6.K;
import X5.d;
import X5.g;
import p6.J;
import p6.i0;
import s6.b;
import java.util.concurrent.Executor;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import p6.q0;
import H.a;
import java.util.Map;
import kotlin.Metadata;
import androidx.window.layout.WindowInfoTracker;

@Metadata
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker
{
    @NotNull
    private final Map<a, q0> consumerToJobMap;
    @NotNull
    private final ReentrantLock lock;
    @NotNull
    private final WindowInfoTracker tracker;
    
    public WindowInfoTrackerCallbackAdapter(@NotNull final WindowInfoTracker tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap<a, q0>();
    }
    
    private final <T> void addListener(final Executor executor, final a a, final b b) {
        final ReentrantLock lock = this.lock;
        lock.lock();
        while (true) {
            try {
                if (this.consumerToJobMap.get(a) == null) {
                    this.consumerToJobMap.put(a, p6.g.d(J.a(i0.a(executor)), null, null, (p)new WindowInfoTrackerCallbackAdapter$addListener$1.WindowInfoTrackerCallbackAdapter$addListener$1$1(b, a, (d)null), 3, null));
                }
                final t a2 = t.a;
                lock.unlock();
                return;
                lock.unlock();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    private final void removeListener(final a a) {
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            final q0 q0 = this.consumerToJobMap.get(a);
            if (q0 != null) {
                p6.q0.a.a(q0, null, 1, null);
            }
            final q0 q2 = this.consumerToJobMap.remove(a);
        }
        finally {
            lock.unlock();
        }
    }
    
    public final void addWindowLayoutInfoListener(@NotNull final Activity activity, @NotNull final Executor executor, @NotNull final a a) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(a, "consumer");
        this.addListener(executor, a, this.tracker.windowLayoutInfo(activity));
    }
    
    public final void removeWindowLayoutInfoListener(@NotNull final a a) {
        Intrinsics.checkNotNullParameter(a, "consumer");
        this.removeListener(a);
    }
    
    @NotNull
    @Override
    public b windowLayoutInfo(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
