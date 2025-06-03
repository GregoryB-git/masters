/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.ComponentCallbacks
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.IBinder
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  androidx.window.layout.SidecarCompat$registerConfigurationChangeListener
 *  androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver
 *  androidx.window.sidecar.SidecarDeviceState
 *  androidx.window.sidecar.SidecarDisplayFeature
 *  androidx.window.sidecar.SidecarInterface
 *  androidx.window.sidecar.SidecarInterface$SidecarCallback
 *  androidx.window.sidecar.SidecarProvider
 *  androidx.window.sidecar.SidecarWindowLayoutInfo
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.NoClassDefFoundError
 *  java.lang.NoSuchFieldError
 *  java.lang.NoSuchMethodException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.lang.Void
 *  java.lang.ref.WeakReference
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.WeakHashMap
 *  java.util.concurrent.locks.ReentrantLock
 */
package androidx.window.layout;

import V5.t;
import W5.m;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.core.Version;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.layout.SidecarAdapter;
import androidx.window.layout.SidecarCompat;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SidecarCompat
implements ExtensionInterfaceCompat {
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

    public SidecarCompat(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        this(SidecarProvider.getSidecarImpl((Context)context.getApplicationContext()), new SidecarAdapter());
    }

    public SidecarCompat(SidecarInterface sidecarInterface, @NotNull SidecarAdapter sidecarAdapter) {
        Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }

    private final void registerConfigurationChangeListener(Activity activity) {
        if (this.componentCallbackMap.get((Object)activity) == null) {
            ComponentCallbacks componentCallbacks = new ComponentCallbacks(this, activity){
                final /* synthetic */ Activity $activity;
                final /* synthetic */ SidecarCompat this$0;
                {
                    this.this$0 = sidecarCompat;
                    this.$activity = activity;
                }

                public void onConfigurationChanged(@NotNull android.content.res.Configuration object) {
                    Intrinsics.checkNotNullParameter(object, "newConfig");
                    object = SidecarCompat.access$getExtensionCallback$p(this.this$0);
                    if (object == null) {
                        return;
                    }
                    Activity activity = this.$activity;
                    object.onWindowLayoutChanged(activity, this.this$0.getWindowLayoutInfo(activity));
                }

                public void onLowMemory() {
                }
            };
            this.componentCallbackMap.put((Object)activity, (Object)componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    private final void unregisterComponentCallback(Activity activity) {
        activity.unregisterComponentCallbacks((ComponentCallbacks)this.componentCallbackMap.get((Object)activity));
        this.componentCallbackMap.remove((Object)activity);
    }

    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    @NotNull
    public final WindowLayoutInfo getWindowLayoutInfo(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        IBinder iBinder = Companion.getActivityWindowToken$window_release(activity);
        if (iBinder == null) {
            return new WindowLayoutInfo(m.f());
        }
        SidecarInterface sidecarInterface = this.sidecar;
        activity = null;
        iBinder = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinder);
        SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        sidecarInterface = this.sidecar;
        if (sidecarInterface != null) {
            activity = sidecarInterface.getDeviceState();
        }
        sidecarInterface = activity;
        if (activity == null) {
            sidecarInterface = new SidecarDeviceState();
        }
        return sidecarAdapter.translate((SidecarWindowLayoutInfo)iBinder, (SidecarDeviceState)sidecarInterface);
    }

    @Override
    public void onWindowLayoutChangeListenerAdded(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        Object object = Companion.getActivityWindowToken$window_release(activity);
        if (object != null) {
            this.register((IBinder)object, activity);
            return;
        }
        object = new FirstAttachAdapter(this, activity);
        activity.getWindow().getDecorView().addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
    }

    @Override
    public void onWindowLayoutChangeListenerRemoved(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        IBinder iBinder = Companion.getActivityWindowToken$window_release(activity);
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        this.unregisterComponentCallback(activity);
        boolean bl = this.windowListenerRegisteredContexts.size() == 1;
        this.windowListenerRegisteredContexts.remove((Object)iBinder);
        if (bl) {
            activity = this.sidecar;
            if (activity == null) {
                return;
            }
            activity.onDeviceStateListenersChanged(true);
        }
    }

    public final void register(@NotNull IBinder object, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(object, "windowToken");
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        this.windowListenerRegisteredContexts.put(object, (Object)activity);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded((IBinder)object);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (object = this.sidecar) != null) {
            object.onDeviceStateListenersChanged(false);
        }
        if ((object = this.extensionCallback) != null) {
            object.onWindowLayoutChanged(activity, this.getWindowLayoutInfo(activity));
        }
        this.registerConfigurationChangeListener(activity);
    }

    @Override
    public void setExtensionCallback(@NotNull ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface) {
        Intrinsics.checkNotNullParameter(extensionCallbackInterface, "extensionCallback");
        this.extensionCallback = new DistinctElementCallback(extensionCallbackInterface);
        extensionCallbackInterface = this.sidecar;
        if (extensionCallbackInterface == null) {
            return;
        }
        extensionCallbackInterface.setSidecarCallback((SidecarInterface.SidecarCallback)new DistinctSidecarElementCallback(this.sidecarAdapter, new TranslatingCallback()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"BanUncheckedReflection"})
    @Override
    public boolean validateExtensionInterface() {
        Class class_;
        Object object;
        Rect rect;
        block10 : {
            block9 : {
                block8 : {
                    try {
                        object = this.sidecar;
                        rect = null;
                        if (object == null || (object = object.getClass()) == null) break block8;
                        object = object.getMethod("setSidecarCallback", new Class[]{SidecarInterface.SidecarCallback.class});
                        break block9;
                    }
                    catch (Throwable throwable) {
                        return false;
                    }
                }
                object = null;
            }
            object = object == null ? null : object.getReturnType();
            class_ = Void.TYPE;
            if (!Intrinsics.a(object, (Object)class_)) throw new NoSuchMethodException(Intrinsics.i("Illegal return type for 'setSidecarCallback': ", object));
            object = this.sidecar;
            if (object != null) {
                object.getDeviceState();
            }
            object = this.sidecar;
            if (object != null) {
                object.onDeviceStateListenersChanged(true);
            }
            object = this.sidecar;
            object = object == null || (object = object.getClass()) == null ? null : object.getMethod("getWindowLayoutInfo", new Class[]{IBinder.class});
            object = object == null ? null : object.getReturnType();
            if (!Intrinsics.a(object, SidecarWindowLayoutInfo.class)) throw new NoSuchMethodException(Intrinsics.i("Illegal return type for 'getWindowLayoutInfo': ", object));
            object = this.sidecar;
            object = object != null && (object = object.getClass()) != null ? object.getMethod("onWindowLayoutChangeListenerAdded", new Class[]{IBinder.class}) : null;
            object = object == null ? null : object.getReturnType();
            if (!Intrinsics.a(object, (Object)class_)) throw new NoSuchMethodException(Intrinsics.i("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", object));
            object = this.sidecar;
            object = object != null && (object = object.getClass()) != null ? object.getMethod("onWindowLayoutChangeListenerRemoved", new Class[]{IBinder.class}) : null;
            object = object == null ? rect : object.getReturnType();
            if (!Intrinsics.a(object, (Object)class_)) throw new NoSuchMethodException(Intrinsics.i("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", object));
            object = new SidecarDeviceState();
            try {
                object.posture = 3;
                break block10;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            SidecarDeviceState.class.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(object, new Object[]{3});
            object = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(object, new Object[0]);
            if (object == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            if ((Integer)object != 3) throw new Exception("Invalid device posture getter/setter");
        }
        object = new SidecarDisplayFeature();
        rect = object.getRect();
        Intrinsics.checkNotNullExpressionValue((Object)rect, "displayFeature.rect");
        object.setRect(rect);
        object.getType();
        object.setType(1);
        rect = new SidecarWindowLayoutInfo();
        try {
            class_ = rect.displayFeatures;
            return true;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        ArrayList arrayList = new ArrayList();
        arrayList.add(object);
        SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", new Class[]{List.class}).invoke((Object)rect, new Object[]{arrayList});
        object = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke((Object)rect, new Object[0]);
        if (object == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
        if (!Intrinsics.a((Object)arrayList, (Object)((List)object))) throw new Exception("Invalid display feature getter/setter");
        return true;
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final IBinder getActivityWindowToken$window_release(Activity activity) {
            if (activity == null) {
                return null;
            }
            if ((activity = activity.getWindow()) == null) {
                return null;
            }
            if ((activity = activity.getAttributes()) == null) {
                return null;
            }
            return activity.token;
        }

        public final Version getSidecarVersion() {
            Version version = null;
            try {
                String string2 = SidecarProvider.getApiVersion();
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    version = Version.Companion.parse(string2);
                }
                return version;
            }
            catch (NoClassDefFoundError | UnsupportedOperationException noClassDefFoundError) {
                return null;
            }
        }
    }

    @Metadata
    public static final class DistinctElementCallback
    implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        @NotNull
        private final WeakHashMap<Activity, WindowLayoutInfo> activityWindowLayoutInfo;
        @NotNull
        private final ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;
        @NotNull
        private final ReentrantLock lock;

        public DistinctElementCallback(@NotNull ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface) {
            Intrinsics.checkNotNullParameter(extensionCallbackInterface, "callbackInterface");
            this.callbackInterface = extensionCallbackInterface;
            this.lock = new ReentrantLock();
            this.activityWindowLayoutInfo = new WeakHashMap();
        }

        @Override
        public void onWindowLayoutChanged(@NotNull Activity activity, @NotNull WindowLayoutInfo windowLayoutInfo2) {
            ReentrantLock reentrantLock;
            block4 : {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                Intrinsics.checkNotNullParameter(windowLayoutInfo2, "newLayout");
                reentrantLock = this.lock;
                reentrantLock.lock();
                boolean bl = Intrinsics.a(windowLayoutInfo2, (WindowLayoutInfo)this.activityWindowLayoutInfo.get((Object)activity));
                if (!bl) break block4;
                reentrantLock.unlock();
                return;
            }
            try {
                WindowLayoutInfo windowLayoutInfo3 = (WindowLayoutInfo)this.activityWindowLayoutInfo.put((Object)activity, (Object)windowLayoutInfo2);
                this.callbackInterface.onWindowLayoutChanged(activity, windowLayoutInfo2);
                return;
            }
            finally {
                reentrantLock.unlock();
            }
        }
    }

    @Metadata
    public static final class DistinctSidecarElementCallback
    implements SidecarInterface.SidecarCallback {
        @NotNull
        private final SidecarInterface.SidecarCallback callbackInterface;
        private SidecarDeviceState lastDeviceState;
        @NotNull
        private final ReentrantLock lock;
        @NotNull
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;
        @NotNull
        private final SidecarAdapter sidecarAdapter;

        public DistinctSidecarElementCallback(@NotNull SidecarAdapter sidecarAdapter, @NotNull SidecarInterface.SidecarCallback sidecarCallback) {
            Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
            Intrinsics.checkNotNullParameter((Object)sidecarCallback, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = sidecarCallback;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap();
        }

        public void onDeviceStateChanged(@NotNull SidecarDeviceState object) {
            ReentrantLock reentrantLock;
            block4 : {
                Intrinsics.checkNotNullParameter(object, "newDeviceState");
                reentrantLock = this.lock;
                reentrantLock.lock();
                boolean bl = this.sidecarAdapter.isEqualSidecarDeviceState(this.lastDeviceState, (SidecarDeviceState)object);
                if (!bl) break block4;
                reentrantLock.unlock();
                return;
            }
            try {
                this.lastDeviceState = object;
                this.callbackInterface.onDeviceStateChanged((SidecarDeviceState)object);
                object = t.a;
                return;
            }
            finally {
                reentrantLock.unlock();
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onWindowLayoutChanged(@NotNull IBinder iBinder, @NotNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            void var2_2;
            Intrinsics.checkNotNullParameter((Object)iBinder, "token");
            Intrinsics.checkNotNullParameter(var2_2, "newLayout");
            ReentrantLock reentrantLock = this.lock;
            synchronized (reentrantLock) {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo)this.mActivityWindowLayoutInfo.get((Object)iBinder);
                boolean bl = this.sidecarAdapter.isEqualSidecarWindowLayoutInfo(sidecarWindowLayoutInfo2, (SidecarWindowLayoutInfo)var2_2);
                if (bl) {
                    return;
                }
                sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo)this.mActivityWindowLayoutInfo.put((Object)iBinder, (Object)var2_2);
            }
            this.callbackInterface.onWindowLayoutChanged(iBinder, (SidecarWindowLayoutInfo)var2_2);
        }
    }

    @Metadata
    public static final class FirstAttachAdapter
    implements View.OnAttachStateChangeListener {
        @NotNull
        private final WeakReference<Activity> activityWeakReference;
        @NotNull
        private final SidecarCompat sidecarCompat;

        public FirstAttachAdapter(@NotNull SidecarCompat sidecarCompat, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new WeakReference((Object)activity);
        }

        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter((Object)view, "view");
            view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            view = (Activity)this.activityWeakReference.get();
            IBinder iBinder = SidecarCompat.Companion.getActivityWindowToken$window_release((Activity)view);
            if (view == null) {
                return;
            }
            if (iBinder == null) {
                return;
            }
            this.sidecarCompat.register(iBinder, (Activity)view);
        }

        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter((Object)view, "view");
        }
    }

    @Metadata
    public final class TranslatingCallback
    implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
            Intrinsics.checkNotNullParameter(SidecarCompat.this, "this$0");
        }

        @SuppressLint(value={"SyntheticAccessor"})
        public void onDeviceStateChanged(@NotNull SidecarDeviceState sidecarDeviceState) {
            Intrinsics.checkNotNullParameter((Object)sidecarDeviceState, "newDeviceState");
            Iterable iterable = (Iterable)SidecarCompat.this.windowListenerRegisteredContexts.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : iterable) {
                SidecarInterface sidecarInterface;
                Object object = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
                iterable = null;
                if (object != null && (sidecarInterface = sidecarCompat.getSidecar()) != null) {
                    iterable = sidecarInterface.getWindowLayoutInfo((IBinder)object);
                }
                if ((object = sidecarCompat.extensionCallback) == null) continue;
                object.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.translate((SidecarWindowLayoutInfo)iterable, sidecarDeviceState));
            }
        }

        @SuppressLint(value={"SyntheticAccessor"})
        public void onWindowLayoutChanged(@NotNull IBinder object, @NotNull SidecarWindowLayoutInfo object2) {
            Intrinsics.checkNotNullParameter(object, "windowToken");
            Intrinsics.checkNotNullParameter(object2, "newLayout");
            Activity activity = (Activity)SidecarCompat.this.windowListenerRegisteredContexts.get(object);
            if (activity == null) {
                Log.w((String)"SidecarCompat", (String)"Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarAdapter sidecarAdapter = SidecarCompat.this.sidecarAdapter;
            object = SidecarCompat.this.getSidecar();
            object = object == null ? null : object.getDeviceState();
            IBinder iBinder = object;
            if (object == null) {
                iBinder = new SidecarDeviceState();
            }
            object = sidecarAdapter.translate((SidecarWindowLayoutInfo)object2, (SidecarDeviceState)iBinder);
            object2 = SidecarCompat.this.extensionCallback;
            if (object2 == null) {
                return;
            }
            object2.onWindowLayoutChanged(activity, (WindowLayoutInfo)object);
        }
    }

}

