package androidx.window.layout;

import V5.t;
import W5.o;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public final class SidecarCompat implements ExtensionInterfaceCompat {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "SidecarCompat";

    @NotNull
    private final Map<Activity, ComponentCallbacks> componentCallbackMap;
    private ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback;
    private final SidecarInterface sidecar;

    @NotNull
    private final SidecarAdapter sidecarAdapter;

    @NotNull
    private final Map<IBinder, Activity> windowListenerRegisteredContexts;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final IBinder getActivityWindowToken$window_release(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final Version getSidecarVersion() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return Version.Companion.parse(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    @Metadata
    public static final class DistinctElementCallback implements ExtensionInterfaceCompat.ExtensionCallbackInterface {

        @NotNull
        private final WeakHashMap<Activity, WindowLayoutInfo> activityWindowLayoutInfo;

        @NotNull
        private final ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;

        @NotNull
        private final ReentrantLock lock;

        public DistinctElementCallback(@NotNull ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface) {
            Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.activityWindowLayoutInfo = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(@NotNull Activity activity, @NotNull WindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (Intrinsics.a(newLayout, this.activityWindowLayoutInfo.get(activity))) {
                    return;
                }
                this.activityWindowLayoutInfo.put(activity, newLayout);
                reentrantLock.unlock();
                this.callbackInterface.onWindowLayoutChanged(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Metadata
    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        @NotNull
        private final SidecarInterface.SidecarCallback callbackInterface;
        private SidecarDeviceState lastDeviceState;

        @NotNull
        private final ReentrantLock lock;

        @NotNull
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;

        @NotNull
        private final SidecarAdapter sidecarAdapter;

        public DistinctSidecarElementCallback(@NotNull SidecarAdapter sidecarAdapter, @NotNull SidecarInterface.SidecarCallback callbackInterface) {
            Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
            Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.isEqualSidecarDeviceState(this.lastDeviceState, newDeviceState)) {
                    return;
                }
                this.lastDeviceState = newDeviceState;
                this.callbackInterface.onDeviceStateChanged(newDeviceState);
                t tVar = t.f6803a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@NotNull IBinder token, @NotNull SidecarWindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.isEqualSidecarWindowLayoutInfo(this.mActivityWindowLayoutInfo.get(token), newLayout)) {
                    return;
                }
                this.mActivityWindowLayoutInfo.put(token, newLayout);
                this.callbackInterface.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    @Metadata
    public static final class FirstAttachAdapter implements View.OnAttachStateChangeListener {

        @NotNull
        private final WeakReference<Activity> activityWeakReference;

        @NotNull
        private final SidecarCompat sidecarCompat;

        public FirstAttachAdapter(@NotNull SidecarCompat sidecarCompat, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.activityWeakReference.get();
            IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
            if (activity == null || activityWindowToken$window_release == null) {
                return;
            }
            this.sidecarCompat.register(activityWindowToken$window_release, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Metadata
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        final /* synthetic */ SidecarCompat this$0;

        public TranslatingCallback(SidecarCompat this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            SidecarInterface sidecar;
            Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            Collection<Activity> values = this.this$0.windowListenerRegisteredContexts.values();
            SidecarCompat sidecarCompat = this.this$0;
            for (Activity activity : values) {
                IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (activityWindowToken$window_release != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    sidecarWindowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                }
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.extensionCallback;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.translate(sidecarWindowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@NotNull IBinder windowToken, @NotNull SidecarWindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(windowToken, "windowToken");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            Activity activity = (Activity) this.this$0.windowListenerRegisteredContexts.get(windowToken);
            if (activity == null) {
                Log.w(SidecarCompat.TAG, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarAdapter sidecarAdapter = this.this$0.sidecarAdapter;
            SidecarInterface sidecar = this.this$0.getSidecar();
            SidecarDeviceState deviceState = sidecar == null ? null : sidecar.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            WindowLayoutInfo translate = sidecarAdapter.translate(newLayout, deviceState);
            ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.this$0.extensionCallback;
            if (extensionCallbackInterface == null) {
                return;
            }
            extensionCallbackInterface.onWindowLayoutChanged(activity, translate);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(@NotNull Context context) {
        this(SidecarProvider.getSidecarImpl(context.getApplicationContext()), new SidecarAdapter());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void registerConfigurationChangeListener(final Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(@NotNull Configuration newConfig) {
                    Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                    ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = SidecarCompat.this.extensionCallback;
                    if (extensionCallbackInterface == null) {
                        return;
                    }
                    Activity activity2 = activity;
                    extensionCallbackInterface.onWindowLayoutChanged(activity2, SidecarCompat.this.getWindowLayoutInfo(activity2));
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            };
            this.componentCallbackMap.put(activity, componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    private final void unregisterComponentCallback(Activity activity) {
        activity.unregisterComponentCallbacks(this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    @NotNull
    public final WindowLayoutInfo getWindowLayoutInfo(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return new WindowLayoutInfo(o.f());
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(activityWindowToken$window_release);
        SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.translate(windowLayoutInfo, deviceState);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerAdded(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            register(activityWindowToken$window_release, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new FirstAttachAdapter(this, activity));
        }
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerRemoved(@NotNull Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
        }
        unregisterComponentCallback(activity);
        boolean z7 = this.windowListenerRegisteredContexts.size() == 1;
        this.windowListenerRegisteredContexts.remove(activityWindowToken$window_release);
        if (!z7 || (sidecarInterface = this.sidecar) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void register(@NotNull IBinder windowToken, @NotNull Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(windowToken, "windowToken");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.windowListenerRegisteredContexts.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.extensionCallback;
        if (extensionCallbackInterface != null) {
            extensionCallbackInterface.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        registerConfigurationChangeListener(activity);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void setExtensionCallback(@NotNull ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback) {
        Intrinsics.checkNotNullParameter(extensionCallback, "extensionCallback");
        this.extensionCallback = new DistinctElementCallback(extensionCallback);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.sidecarAdapter, new TranslatingCallback(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:48:0x010a, B:50:0x0139, B:54:0x0142, B:55:0x0149, B:56:0x014a, B:57:0x0151, B:59:0x00b7, B:61:0x00e2, B:63:0x0152, B:64:0x0159, B:65:0x015a, B:66:0x0161, B:67:0x0162, B:68:0x016d, B:69:0x00a4, B:70:0x0090, B:73:0x0097, B:74:0x016e, B:75:0x0179, B:76:0x0080, B:77:0x006b, B:80:0x0072, B:81:0x017a, B:82:0x0185, B:83:0x0059, B:84:0x0044, B:87:0x004b, B:88:0x0039, B:89:0x0031, B:90:0x0186, B:91:0x0191, B:92:0x0020, B:93:0x0009, B:96:0x0010), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:48:0x010a, B:50:0x0139, B:54:0x0142, B:55:0x0149, B:56:0x014a, B:57:0x0151, B:59:0x00b7, B:61:0x00e2, B:63:0x0152, B:64:0x0159, B:65:0x015a, B:66:0x0161, B:67:0x0162, B:68:0x016d, B:69:0x00a4, B:70:0x0090, B:73:0x0097, B:74:0x016e, B:75:0x0179, B:76:0x0080, B:77:0x006b, B:80:0x0072, B:81:0x017a, B:82:0x0185, B:83:0x0059, B:84:0x0044, B:87:0x004b, B:88:0x0039, B:89:0x0031, B:90:0x0186, B:91:0x0191, B:92:0x0020, B:93:0x0009, B:96:0x0010), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:48:0x010a, B:50:0x0139, B:54:0x0142, B:55:0x0149, B:56:0x014a, B:57:0x0151, B:59:0x00b7, B:61:0x00e2, B:63:0x0152, B:64:0x0159, B:65:0x015a, B:66:0x0161, B:67:0x0162, B:68:0x016d, B:69:0x00a4, B:70:0x0090, B:73:0x0097, B:74:0x016e, B:75:0x0179, B:76:0x0080, B:77:0x006b, B:80:0x0072, B:81:0x017a, B:82:0x0185, B:83:0x0059, B:84:0x0044, B:87:0x004b, B:88:0x0039, B:89:0x0031, B:90:0x0186, B:91:0x0191, B:92:0x0020, B:93:0x0009, B:96:0x0010), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:48:0x010a, B:50:0x0139, B:54:0x0142, B:55:0x0149, B:56:0x014a, B:57:0x0151, B:59:0x00b7, B:61:0x00e2, B:63:0x0152, B:64:0x0159, B:65:0x015a, B:66:0x0161, B:67:0x0162, B:68:0x016d, B:69:0x00a4, B:70:0x0090, B:73:0x0097, B:74:0x016e, B:75:0x0179, B:76:0x0080, B:77:0x006b, B:80:0x0072, B:81:0x017a, B:82:0x0185, B:83:0x0059, B:84:0x0044, B:87:0x004b, B:88:0x0039, B:89:0x0031, B:90:0x0186, B:91:0x0191, B:92:0x0020, B:93:0x0009, B:96:0x0010), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:48:0x010a, B:50:0x0139, B:54:0x0142, B:55:0x0149, B:56:0x014a, B:57:0x0151, B:59:0x00b7, B:61:0x00e2, B:63:0x0152, B:64:0x0159, B:65:0x015a, B:66:0x0161, B:67:0x0162, B:68:0x016d, B:69:0x00a4, B:70:0x0090, B:73:0x0097, B:74:0x016e, B:75:0x0179, B:76:0x0080, B:77:0x006b, B:80:0x0072, B:81:0x017a, B:82:0x0185, B:83:0x0059, B:84:0x0044, B:87:0x004b, B:88:0x0039, B:89:0x0031, B:90:0x0186, B:91:0x0191, B:92:0x0020, B:93:0x0009, B:96:0x0010), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a4 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:48:0x010a, B:50:0x0139, B:54:0x0142, B:55:0x0149, B:56:0x014a, B:57:0x0151, B:59:0x00b7, B:61:0x00e2, B:63:0x0152, B:64:0x0159, B:65:0x015a, B:66:0x0161, B:67:0x0162, B:68:0x016d, B:69:0x00a4, B:70:0x0090, B:73:0x0097, B:74:0x016e, B:75:0x0179, B:76:0x0080, B:77:0x006b, B:80:0x0072, B:81:0x017a, B:82:0x0185, B:83:0x0059, B:84:0x0044, B:87:0x004b, B:88:0x0039, B:89:0x0031, B:90:0x0186, B:91:0x0191, B:92:0x0020, B:93:0x0009, B:96:0x0010), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:48:0x010a, B:50:0x0139, B:54:0x0142, B:55:0x0149, B:56:0x014a, B:57:0x0151, B:59:0x00b7, B:61:0x00e2, B:63:0x0152, B:64:0x0159, B:65:0x015a, B:66:0x0161, B:67:0x0162, B:68:0x016d, B:69:0x00a4, B:70:0x0090, B:73:0x0097, B:74:0x016e, B:75:0x0179, B:76:0x0080, B:77:0x006b, B:80:0x0072, B:81:0x017a, B:82:0x0185, B:83:0x0059, B:84:0x0044, B:87:0x004b, B:88:0x0039, B:89:0x0031, B:90:0x0186, B:91:0x0191, B:92:0x0020, B:93:0x0009, B:96:0x0010), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:48:0x010a, B:50:0x0139, B:54:0x0142, B:55:0x0149, B:56:0x014a, B:57:0x0151, B:59:0x00b7, B:61:0x00e2, B:63:0x0152, B:64:0x0159, B:65:0x015a, B:66:0x0161, B:67:0x0162, B:68:0x016d, B:69:0x00a4, B:70:0x0090, B:73:0x0097, B:74:0x016e, B:75:0x0179, B:76:0x0080, B:77:0x006b, B:80:0x0072, B:81:0x017a, B:82:0x0185, B:83:0x0059, B:84:0x0044, B:87:0x004b, B:88:0x0039, B:89:0x0031, B:90:0x0186, B:91:0x0191, B:92:0x0020, B:93:0x0009, B:96:0x0010), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017a A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:48:0x010a, B:50:0x0139, B:54:0x0142, B:55:0x0149, B:56:0x014a, B:57:0x0151, B:59:0x00b7, B:61:0x00e2, B:63:0x0152, B:64:0x0159, B:65:0x015a, B:66:0x0161, B:67:0x0162, B:68:0x016d, B:69:0x00a4, B:70:0x0090, B:73:0x0097, B:74:0x016e, B:75:0x0179, B:76:0x0080, B:77:0x006b, B:80:0x0072, B:81:0x017a, B:82:0x0185, B:83:0x0059, B:84:0x0044, B:87:0x004b, B:88:0x0039, B:89:0x0031, B:90:0x0186, B:91:0x0191, B:92:0x0020, B:93:0x0009, B:96:0x0010), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0059 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:48:0x010a, B:50:0x0139, B:54:0x0142, B:55:0x0149, B:56:0x014a, B:57:0x0151, B:59:0x00b7, B:61:0x00e2, B:63:0x0152, B:64:0x0159, B:65:0x015a, B:66:0x0161, B:67:0x0162, B:68:0x016d, B:69:0x00a4, B:70:0x0090, B:73:0x0097, B:74:0x016e, B:75:0x0179, B:76:0x0080, B:77:0x006b, B:80:0x0072, B:81:0x017a, B:82:0x0185, B:83:0x0059, B:84:0x0044, B:87:0x004b, B:88:0x0039, B:89:0x0031, B:90:0x0186, B:91:0x0191, B:92:0x0020, B:93:0x0009, B:96:0x0010), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0186 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:48:0x010a, B:50:0x0139, B:54:0x0142, B:55:0x0149, B:56:0x014a, B:57:0x0151, B:59:0x00b7, B:61:0x00e2, B:63:0x0152, B:64:0x0159, B:65:0x015a, B:66:0x0161, B:67:0x0162, B:68:0x016d, B:69:0x00a4, B:70:0x0090, B:73:0x0097, B:74:0x016e, B:75:0x0179, B:76:0x0080, B:77:0x006b, B:80:0x0072, B:81:0x017a, B:82:0x0185, B:83:0x0059, B:84:0x0044, B:87:0x004b, B:88:0x0039, B:89:0x0031, B:90:0x0186, B:91:0x0191, B:92:0x0020, B:93:0x0009, B:96:0x0010), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0020 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:48:0x010a, B:50:0x0139, B:54:0x0142, B:55:0x0149, B:56:0x014a, B:57:0x0151, B:59:0x00b7, B:61:0x00e2, B:63:0x0152, B:64:0x0159, B:65:0x015a, B:66:0x0161, B:67:0x0162, B:68:0x016d, B:69:0x00a4, B:70:0x0090, B:73:0x0097, B:74:0x016e, B:75:0x0179, B:76:0x0080, B:77:0x006b, B:80:0x0072, B:81:0x017a, B:82:0x0185, B:83:0x0059, B:84:0x0044, B:87:0x004b, B:88:0x0039, B:89:0x0031, B:90:0x0186, B:91:0x0191, B:92:0x0020, B:93:0x0009, B:96:0x0010), top: B:2:0x0002, inners: #1, #2 }] */
    @Override // androidx.window.layout.ExtensionInterfaceCompat
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean validateExtensionInterface() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.validateExtensionInterface():boolean");
    }

    public SidecarCompat(SidecarInterface sidecarInterface, @NotNull SidecarAdapter sidecarAdapter) {
        Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }
}
