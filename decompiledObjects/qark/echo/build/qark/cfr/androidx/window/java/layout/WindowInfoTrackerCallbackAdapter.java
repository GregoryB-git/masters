/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener
 *  androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.concurrent.Executor
 *  java.util.concurrent.locks.ReentrantLock
 */
package androidx.window.java.layout;

import H.a;
import V5.t;
import X5.d;
import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowInfoTracker;
import g6.p;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6.I;
import p6.J;
import p6.g;
import p6.i0;
import p6.q0;
import s6.b;

@Metadata
public final class WindowInfoTrackerCallbackAdapter
implements WindowInfoTracker {
    @NotNull
    private final Map<a, q0> consumerToJobMap;
    @NotNull
    private final ReentrantLock lock;
    @NotNull
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(@NotNull WindowInfoTracker windowInfoTracker) {
        Intrinsics.checkNotNullParameter(windowInfoTracker, "tracker");
        this.tracker = windowInfoTracker;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final <T> void addListener(Executor object, a a8, b b8) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get((Object)a8) == null) {
                object = J.a(i0.a((Executor)object));
                this.consumerToJobMap.put((Object)a8, (Object)g.d((I)object, null, null, new p(b8, a8, null){
                    final /* synthetic */ a $consumer;
                    final /* synthetic */ b $flow;
                    int label;
                    {
                        this.$flow = b8;
                        this.$consumer = a8;
                        super(2, d8);
                    }

                    @NotNull
                    public final d create(Object object, @NotNull d d8) {
                        return new ;
                    }

                    public final Object invoke(@NotNull I i8, d d8) {
                        return (this.create(i8, d8)).invokeSuspend(t.a);
                    }

                    /*
                     * Enabled force condition propagation
                     * Lifted jumps to return sites
                     */
                    public final Object invokeSuspend(@NotNull Object object) {
                        Object object2 = Y5.b.c();
                        int n8 = this.label;
                        if (n8 != 0) {
                            if (n8 != 1) throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            V5.o.b(object);
                            return t.a;
                        } else {
                            V5.o.b(object);
                            object = this.$flow;
                            s6.c c8 = new s6.c(this.$consumer){
                                final /* synthetic */ a $consumer$inlined;
                                {
                                    this.$consumer$inlined = a8;
                                }

                                public Object emit(T t8, @NotNull d d8) {
                                    this.$consumer$inlined.accept(t8);
                                    return t.a;
                                }
                            };
                            this.label = 1;
                            if (object.a(c8, this) != object2) return t.a;
                            return object2;
                        }
                    }
                }, 3, null));
            }
            object = t.a;
        }
        catch (Throwable throwable) {}
        reentrantLock.unlock();
        return;
        reentrantLock.unlock();
        throw throwable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void removeListener(a object) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            q0 q02 = (q0)this.consumerToJobMap.get(object);
            if (q02 != null) {
                q0.a.a(q02, null, 1, null);
            }
            object = (q0)this.consumerToJobMap.remove(object);
            return;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(@NotNull Activity activity, @NotNull Executor executor, @NotNull a a8) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        Intrinsics.checkNotNullParameter((Object)executor, "executor");
        Intrinsics.checkNotNullParameter(a8, "consumer");
        this.addListener(executor, a8, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(@NotNull a a8) {
        Intrinsics.checkNotNullParameter(a8, "consumer");
        this.removeListener(a8);
    }

    @NotNull
    @Override
    public b windowLayoutInfo(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}

