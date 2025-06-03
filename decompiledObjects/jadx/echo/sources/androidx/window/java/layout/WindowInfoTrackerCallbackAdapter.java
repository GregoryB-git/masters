package androidx.window.java.layout;

import H.a;
import V5.t;
import android.app.Activity;
import androidx.window.layout.WindowInfoTracker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6.AbstractC1852i;
import p6.AbstractC1853i0;
import p6.I;
import p6.InterfaceC1869q0;
import p6.J;
import s6.b;

@Metadata
/* loaded from: classes.dex */
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {

    @NotNull
    private final Map<a, InterfaceC1869q0> consumerToJobMap;

    @NotNull
    private final ReentrantLock lock;

    @NotNull
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(@NotNull WindowInfoTracker tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap();
    }

    private final <T> void addListener(Executor executor, a aVar, b bVar) {
        InterfaceC1869q0 d7;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                I a7 = J.a(AbstractC1853i0.a(executor));
                Map<a, InterfaceC1869q0> map = this.consumerToJobMap;
                d7 = AbstractC1852i.d(a7, null, null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(bVar, aVar, null), 3, null);
                map.put(aVar, d7);
            }
            t tVar = t.f6803a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final void removeListener(a aVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            InterfaceC1869q0 interfaceC1869q0 = this.consumerToJobMap.get(aVar);
            if (interfaceC1869q0 != null) {
                InterfaceC1869q0.a.a(interfaceC1869q0, null, 1, null);
            }
            this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(@NotNull Activity activity, @NotNull Executor executor, @NotNull a consumer) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        addListener(executor, consumer, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(@NotNull a consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        removeListener(consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    @NotNull
    public b windowLayoutInfo(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
