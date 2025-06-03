/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  androidx.window.extensions.layout.WindowLayoutComponent
 *  androidx.window.extensions.layout.WindowLayoutInfo
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.LinkedHashSet
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.locks.ReentrantLock
 *  java.util.function.Consumer
 */
package androidx.window.layout;

import H.a;
import V5.t;
import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.window.embedding.g;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.ExtensionsWindowLayoutInfoAdapter;
import androidx.window.layout.WindowBackend;
import androidx.window.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class ExtensionWindowLayoutInfoBackend
implements WindowBackend {
    @NotNull
    private final Map<Activity, MulticastConsumer> activityToListeners;
    @NotNull
    private final WindowLayoutComponent component;
    @NotNull
    private final ReentrantLock extensionWindowBackendLock;
    @NotNull
    private final Map<a, Activity> listenerToActivity;

    public ExtensionWindowLayoutInfoBackend(@NotNull WindowLayoutComponent windowLayoutComponent) {
        Intrinsics.checkNotNullParameter((Object)windowLayoutComponent, "component");
        this.component = windowLayoutComponent;
        this.extensionWindowBackendLock = new ReentrantLock();
        this.activityToListeners = new LinkedHashMap();
        this.listenerToActivity = new LinkedHashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void registerLayoutChangeCallback(@NotNull Activity object, @NotNull Executor object2, @NotNull a a8) {
        Intrinsics.checkNotNullParameter(object, "activity");
        Intrinsics.checkNotNullParameter(object2, "executor");
        Intrinsics.checkNotNullParameter(a8, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            object2 = (MulticastConsumer)this.activityToListeners.get(object);
            if (object2 == null) {
                object2 = null;
            } else {
                object2.addListener(a8);
                this.listenerToActivity.put((Object)a8, object);
                object2 = t.a;
            }
            if (object2 == null) {
                object2 = new MulticastConsumer((Activity)object);
                this.activityToListeners.put(object, object2);
                this.listenerToActivity.put((Object)a8, object);
                object2.addListener(a8);
                this.component.addWindowLayoutInfoListener((Activity)object, g.a(object2));
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
    @Override
    public void unregisterLayoutChangeCallback(@NotNull a object) {
        ReentrantLock reentrantLock;
        Object object2;
        Throwable throwable2;
        block6 : {
            block5 : {
                Intrinsics.checkNotNullParameter(object, "callback");
                reentrantLock = this.extensionWindowBackendLock;
                reentrantLock.lock();
                try {
                    object2 = (Activity)this.listenerToActivity.get(object);
                    if (object2 != null) break block5;
                }
                catch (Throwable throwable2) {}
                reentrantLock.unlock();
                return;
            }
            object2 = (MulticastConsumer)this.activityToListeners.get(object2);
            if (object2 != null) break block6;
            reentrantLock.unlock();
            return;
        }
        object2.removeListener((a)object);
        if (object2.isEmpty()) {
            this.component.removeWindowLayoutInfoListener(g.a(object2));
        }
        object = t.a;
        reentrantLock.unlock();
        return;
        reentrantLock.unlock();
        throw throwable2;
    }

    @Metadata
    @SuppressLint(value={"NewApi"})
    public static final class MulticastConsumer
    implements Consumer<androidx.window.extensions.layout.WindowLayoutInfo> {
        @NotNull
        private final Activity activity;
        private WindowLayoutInfo lastKnownValue;
        @NotNull
        private final ReentrantLock multicastConsumerLock;
        @NotNull
        private final Set<a> registeredListeners;

        public MulticastConsumer(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            this.activity = activity;
            this.multicastConsumerLock = new ReentrantLock();
            this.registeredListeners = new LinkedHashSet();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void accept(@NotNull androidx.window.extensions.layout.WindowLayoutInfo object) {
            Intrinsics.checkNotNullParameter(object, "value");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.activity, (androidx.window.extensions.layout.WindowLayoutInfo)object);
                object = this.registeredListeners.iterator();
                while (object.hasNext()) {
                    ((a)object.next()).accept(this.lastKnownValue);
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
        public final void addListener(@NotNull a a8) {
            Intrinsics.checkNotNullParameter(a8, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                WindowLayoutInfo windowLayoutInfo2 = this.lastKnownValue;
                if (windowLayoutInfo2 != null) {
                    a8.accept(windowLayoutInfo2);
                }
                this.registeredListeners.add((Object)a8);
                return;
            }
            finally {
                reentrantLock.unlock();
            }
        }

        public final boolean isEmpty() {
            return this.registeredListeners.isEmpty();
        }

        public final void removeListener(@NotNull a a8) {
            Intrinsics.checkNotNullParameter(a8, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove((Object)a8);
                return;
            }
            finally {
                reentrantLock.unlock();
            }
        }
    }

}

