// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import android.annotation.SuppressLint;
import androidx.window.core.Version;
import android.content.Context;
import java.util.ArrayList;
import V5.t;
import java.util.List;
import W5.m;
import H.a;
import java.util.concurrent.Executor;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import java.util.Collection;
import android.app.Activity;
import kotlin.jvm.internal.g;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class SidecarWindowBackend implements WindowBackend
{
    @NotNull
    public static final Companion Companion;
    public static final boolean DEBUG = false;
    @NotNull
    private static final String TAG = "WindowServer";
    private static volatile SidecarWindowBackend globalInstance;
    @NotNull
    private static final ReentrantLock globalLock;
    private ExtensionInterfaceCompat windowExtension;
    @NotNull
    private final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks;
    
    static {
        Companion = new Companion(null);
        globalLock = new ReentrantLock();
    }
    
    public SidecarWindowBackend(ExtensionInterfaceCompat windowExtension) {
        this.windowExtension = windowExtension;
        this.windowLayoutChangeCallbacks = new CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper>();
        windowExtension = this.windowExtension;
        if (windowExtension == null) {
            return;
        }
        windowExtension.setExtensionCallback((ExtensionInterfaceCompat.ExtensionCallbackInterface)new ExtensionListenerImpl());
    }
    
    public static final /* synthetic */ SidecarWindowBackend access$getGlobalInstance$cp() {
        return SidecarWindowBackend.globalInstance;
    }
    
    public static final /* synthetic */ ReentrantLock access$getGlobalLock$cp() {
        return SidecarWindowBackend.globalLock;
    }
    
    public static final /* synthetic */ void access$setGlobalInstance$cp(final SidecarWindowBackend globalInstance) {
        SidecarWindowBackend.globalInstance = globalInstance;
    }
    
    private final void callbackRemovedForActivity(final Activity activity) {
        final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks = this.windowLayoutChangeCallbacks;
        if (!(windowLayoutChangeCallbacks instanceof Collection) || !windowLayoutChangeCallbacks.isEmpty()) {
            final Iterator<Object> iterator = windowLayoutChangeCallbacks.iterator();
            while (iterator.hasNext()) {
                if (Intrinsics.a(iterator.next().getActivity(), activity)) {
                    return;
                }
            }
        }
        final ExtensionInterfaceCompat windowExtension = this.windowExtension;
        if (windowExtension == null) {
            return;
        }
        windowExtension.onWindowLayoutChangeListenerRemoved(activity);
    }
    
    private final boolean isActivityRegistered(final Activity activity) {
        final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks = this.windowLayoutChangeCallbacks;
        final boolean b = windowLayoutChangeCallbacks instanceof Collection;
        final boolean b2 = false;
        if (b && windowLayoutChangeCallbacks.isEmpty()) {
            return false;
        }
        final Iterator<Object> iterator = windowLayoutChangeCallbacks.iterator();
        do {
            final boolean b3 = b2;
            if (iterator.hasNext()) {
                continue;
            }
            return b3;
        } while (!Intrinsics.a(iterator.next().getActivity(), activity));
        return true;
    }
    
    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }
    
    @NotNull
    public final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }
    
    @Override
    public void registerLayoutChangeCallback(@NotNull final Activity activity, @NotNull final Executor executor, @NotNull final a a) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(a, "callback");
        final ReentrantLock globalLock = SidecarWindowBackend.globalLock;
        globalLock.lock();
        final Activity activity2;
        Label_0209: {
            ExtensionInterfaceCompat windowExtension;
            try {
                windowExtension = this.getWindowExtension();
                if (windowExtension == null) {
                    a.accept(new WindowLayoutInfo(m.f()));
                    globalLock.unlock();
                    return;
                }
            }
            finally {
                break Label_0209;
            }
            final boolean activityRegistered = this.isActivityRegistered(activity2);
            final WindowLayoutChangeCallbackWrapper e = new WindowLayoutChangeCallbackWrapper(activity2, executor, a);
            this.getWindowLayoutChangeCallbacks().add(e);
            Label_0197: {
                if (activityRegistered) {
                    final Iterator<Object> iterator = this.getWindowLayoutChangeCallbacks().iterator();
                    while (true) {
                        WindowLayoutChangeCallbackWrapper next;
                        do {
                            final boolean hasNext = iterator.hasNext();
                            final WindowLayoutInfo windowLayoutInfo = null;
                            if (hasNext) {
                                next = iterator.next();
                            }
                            else {
                                final WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = null;
                                final WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = windowLayoutChangeCallbackWrapper;
                                WindowLayoutInfo lastInfo;
                                if (windowLayoutChangeCallbackWrapper2 == null) {
                                    lastInfo = windowLayoutInfo;
                                }
                                else {
                                    lastInfo = windowLayoutChangeCallbackWrapper2.getLastInfo();
                                }
                                if (lastInfo != null) {
                                    e.accept(lastInfo);
                                }
                                break Label_0197;
                            }
                        } while (!Intrinsics.a(activity2, next.getActivity()));
                        final WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = next;
                        continue;
                    }
                }
                windowExtension.onWindowLayoutChangeListenerAdded(activity2);
            }
            final t a2 = t.a;
            globalLock.unlock();
            return;
        }
        globalLock.unlock();
        throw activity2;
    }
    
    public final void setWindowExtension(final ExtensionInterfaceCompat windowExtension) {
        this.windowExtension = windowExtension;
    }
    
    @Override
    public void unregisterLayoutChangeCallback(@NotNull final a a) {
        Intrinsics.checkNotNullParameter(a, "callback");
        final ReentrantLock globalLock = SidecarWindowBackend.globalLock;
        // monitorenter(globalLock)
        while (true) {
            try {
                if (this.getWindowExtension() == null) {
                    // monitorexit(globalLock)
                    return;
                }
                final ArrayList<WindowLayoutChangeCallbackWrapper> c = new ArrayList<WindowLayoutChangeCallbackWrapper>();
                for (final WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : this.getWindowLayoutChangeCallbacks()) {
                    if (windowLayoutChangeCallbackWrapper.getCallback() == a) {
                        Intrinsics.checkNotNullExpressionValue(windowLayoutChangeCallbackWrapper, "callbackWrapper");
                        c.add(windowLayoutChangeCallbackWrapper);
                    }
                }
                this.getWindowLayoutChangeCallbacks().removeAll(c);
                final Iterator<Object> iterator2 = c.iterator();
                while (iterator2.hasNext()) {
                    this.callbackRemovedForActivity(iterator2.next().getActivity());
                }
                final t a2 = t.a;
                // monitorexit(globalLock)
                return;
                // monitorexit(globalLock)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Metadata
    public static final class Companion
    {
        private Companion() {
        }
        
        @NotNull
        public final SidecarWindowBackend getInstance(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            while (true) {
                if (SidecarWindowBackend.access$getGlobalInstance$cp() == null) {
                    final ReentrantLock access$getGlobalLock$cp = SidecarWindowBackend.access$getGlobalLock$cp();
                    access$getGlobalLock$cp.lock();
                    while (true) {
                        try {
                            if (SidecarWindowBackend.access$getGlobalInstance$cp() == null) {
                                SidecarWindowBackend.access$setGlobalInstance$cp(new SidecarWindowBackend(SidecarWindowBackend.Companion.initAndVerifyExtension(context)));
                            }
                            final t a = t.a;
                            access$getGlobalLock$cp.unlock();
                            final SidecarWindowBackend access$getGlobalInstance$cp = SidecarWindowBackend.access$getGlobalInstance$cp();
                            Intrinsics.b(access$getGlobalInstance$cp);
                            return access$getGlobalInstance$cp;
                            access$getGlobalLock$cp.unlock();
                        }
                        finally {}
                        continue;
                    }
                }
                continue;
            }
        }
        
        public final ExtensionInterfaceCompat initAndVerifyExtension(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SidecarCompat sidecarCompat = null;
            try {
                if (this.isSidecarVersionSupported(SidecarCompat.Companion.getSidecarVersion())) {
                    sidecarCompat = new SidecarCompat(context);
                    if (!sidecarCompat.validateExtensionInterface()) {}
                }
                return sidecarCompat;
            }
            finally {
                return null;
            }
        }
        
        public final boolean isSidecarVersionSupported(final Version version) {
            boolean b = false;
            if (version == null) {
                return false;
            }
            if (version.compareTo(Version.Companion.getVERSION_0_1()) >= 0) {
                b = true;
            }
            return b;
        }
        
        public final void resetInstance() {
            SidecarWindowBackend.access$setGlobalInstance$cp(null);
        }
    }
    
    @Metadata
    public final class ExtensionListenerImpl implements ExtensionCallbackInterface
    {
        public ExtensionListenerImpl() {
            Intrinsics.checkNotNullParameter(SidecarWindowBackend.this, "this$0");
        }
        
        @SuppressLint({ "SyntheticAccessor" })
        @Override
        public void onWindowLayoutChanged(@NotNull final Activity activity, @NotNull final WindowLayoutInfo windowLayoutInfo) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(windowLayoutInfo, "newLayout");
            for (final WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : SidecarWindowBackend.this.getWindowLayoutChangeCallbacks()) {
                if (!Intrinsics.a(windowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                    continue;
                }
                windowLayoutChangeCallbackWrapper.accept(windowLayoutInfo);
            }
        }
    }
    
    @Metadata
    public static final class WindowLayoutChangeCallbackWrapper
    {
        @NotNull
        private final Activity activity;
        @NotNull
        private final a callback;
        @NotNull
        private final Executor executor;
        private WindowLayoutInfo lastInfo;
        
        public WindowLayoutChangeCallbackWrapper(@NotNull final Activity activity, @NotNull final Executor executor, @NotNull final a callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }
        
        private static final void accept$lambda-0(final WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, final WindowLayoutInfo windowLayoutInfo) {
            Intrinsics.checkNotNullParameter(windowLayoutChangeCallbackWrapper, "this$0");
            Intrinsics.checkNotNullParameter(windowLayoutInfo, "$newLayoutInfo");
            windowLayoutChangeCallbackWrapper.getCallback().accept(windowLayoutInfo);
        }
        
        public final void accept(@NotNull final WindowLayoutInfo lastInfo) {
            Intrinsics.checkNotNullParameter(lastInfo, "newLayoutInfo");
            this.lastInfo = lastInfo;
            this.executor.execute(new i(this, lastInfo));
        }
        
        @NotNull
        public final Activity getActivity() {
            return this.activity;
        }
        
        @NotNull
        public final a getCallback() {
            return this.callback;
        }
        
        public final WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }
        
        public final void setLastInfo(final WindowLayoutInfo lastInfo) {
            this.lastInfo = lastInfo;
        }
    }
}
