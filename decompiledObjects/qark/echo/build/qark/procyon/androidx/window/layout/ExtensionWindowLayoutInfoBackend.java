// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import android.annotation.SuppressLint;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.function.Consumer;
import androidx.window.embedding.g;
import V5.t;
import java.util.concurrent.Executor;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import H.a;
import java.util.concurrent.locks.ReentrantLock;
import androidx.window.extensions.layout.WindowLayoutComponent;
import org.jetbrains.annotations.NotNull;
import android.app.Activity;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class ExtensionWindowLayoutInfoBackend implements WindowBackend
{
    @NotNull
    private final Map<Activity, MulticastConsumer> activityToListeners;
    @NotNull
    private final WindowLayoutComponent component;
    @NotNull
    private final ReentrantLock extensionWindowBackendLock;
    @NotNull
    private final Map<a, Activity> listenerToActivity;
    
    public ExtensionWindowLayoutInfoBackend(@NotNull final WindowLayoutComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.extensionWindowBackendLock = new ReentrantLock();
        this.activityToListeners = new LinkedHashMap<Activity, MulticastConsumer>();
        this.listenerToActivity = new LinkedHashMap<a, Activity>();
    }
    
    @Override
    public void registerLayoutChangeCallback(@NotNull final Activity activity, @NotNull final Executor executor, @NotNull final a a) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(a, "callback");
        final ReentrantLock extensionWindowBackendLock = this.extensionWindowBackendLock;
        extensionWindowBackendLock.lock();
        while (true) {
            try {
                final MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
                t a2;
                if (multicastConsumer == null) {
                    a2 = null;
                }
                else {
                    multicastConsumer.addListener(a);
                    this.listenerToActivity.put(a, activity);
                    a2 = t.a;
                }
                if (a2 == null) {
                    final MulticastConsumer multicastConsumer2 = new MulticastConsumer(activity);
                    this.activityToListeners.put(activity, multicastConsumer2);
                    this.listenerToActivity.put(a, activity);
                    multicastConsumer2.addListener(a);
                    this.component.addWindowLayoutInfoListener(activity, g.a((Object)multicastConsumer2));
                }
                final t a3 = t.a;
                extensionWindowBackendLock.unlock();
                return;
                extensionWindowBackendLock.unlock();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void unregisterLayoutChangeCallback(@NotNull final a a) {
        Intrinsics.checkNotNullParameter(a, "callback");
        final ReentrantLock extensionWindowBackendLock = this.extensionWindowBackendLock;
        extensionWindowBackendLock.lock();
        while (true) {
            try {
                final Activity activity = this.listenerToActivity.get(a);
                if (activity == null) {
                    extensionWindowBackendLock.unlock();
                    return;
                }
                final MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
                if (multicastConsumer == null) {
                    extensionWindowBackendLock.unlock();
                    return;
                }
                multicastConsumer.removeListener(a);
                if (multicastConsumer.isEmpty()) {
                    this.component.removeWindowLayoutInfoListener(g.a((Object)multicastConsumer));
                }
                final t a2 = t.a;
                extensionWindowBackendLock.unlock();
                return;
                extensionWindowBackendLock.unlock();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Metadata
    @SuppressLint({ "NewApi" })
    public static final class MulticastConsumer implements Consumer<WindowLayoutInfo>
    {
        @NotNull
        private final Activity activity;
        private androidx.window.layout.WindowLayoutInfo lastKnownValue;
        @NotNull
        private final ReentrantLock multicastConsumerLock;
        @NotNull
        private final Set<a> registeredListeners;
        
        public MulticastConsumer(@NotNull final Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.multicastConsumerLock = new ReentrantLock();
            this.registeredListeners = new LinkedHashSet<a>();
        }
        
        @Override
        public void accept(@NotNull final WindowLayoutInfo windowLayoutInfo) {
            Intrinsics.checkNotNullParameter(windowLayoutInfo, "value");
            final ReentrantLock multicastConsumerLock = this.multicastConsumerLock;
            multicastConsumerLock.lock();
            while (true) {
                try {
                    this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.activity, windowLayoutInfo);
                    final Iterator<a> iterator = this.registeredListeners.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().accept(this.lastKnownValue);
                    }
                    final t a = t.a;
                    multicastConsumerLock.unlock();
                    return;
                    multicastConsumerLock.unlock();
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        public final void addListener(@NotNull final a a) {
            Intrinsics.checkNotNullParameter(a, "listener");
            final ReentrantLock multicastConsumerLock = this.multicastConsumerLock;
            multicastConsumerLock.lock();
            try {
                final androidx.window.layout.WindowLayoutInfo lastKnownValue = this.lastKnownValue;
                if (lastKnownValue != null) {
                    a.accept(lastKnownValue);
                }
                this.registeredListeners.add(a);
            }
            finally {
                multicastConsumerLock.unlock();
            }
        }
        
        public final boolean isEmpty() {
            return this.registeredListeners.isEmpty();
        }
        
        public final void removeListener(@NotNull final a a) {
            Intrinsics.checkNotNullParameter(a, "listener");
            final ReentrantLock multicastConsumerLock = this.multicastConsumerLock;
            multicastConsumerLock.lock();
            try {
                this.registeredListeners.remove(a);
            }
            finally {
                multicastConsumerLock.unlock();
            }
        }
    }
}
