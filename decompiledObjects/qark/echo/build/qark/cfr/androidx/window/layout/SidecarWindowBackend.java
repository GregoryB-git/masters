/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.Executor
 *  java.util.concurrent.locks.ReentrantLock
 */
package androidx.window.layout;

import H.a;
import V5.t;
import W5.m;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.window.core.Version;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.layout.SidecarCompat;
import androidx.window.layout.WindowBackend;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SidecarWindowBackend
implements WindowBackend {
    @NotNull
    public static final Companion Companion = new Companion(null);
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
        globalLock = new ReentrantLock();
    }

    public SidecarWindowBackend(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        this.windowLayoutChangeCallbacks = new CopyOnWriteArrayList();
        extensionInterfaceCompat = this.windowExtension;
        if (extensionInterfaceCompat == null) {
            return;
        }
        extensionInterfaceCompat.setExtensionCallback(new ExtensionListenerImpl());
    }

    public static final /* synthetic */ void access$setGlobalInstance$cp(SidecarWindowBackend sidecarWindowBackend) {
        globalInstance = sidecarWindowBackend;
    }

    private final void callbackRemovedForActivity(Activity activity) {
        Object object = this.windowLayoutChangeCallbacks;
        if (!(object instanceof Collection) || !object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if (!Intrinsics.a((Object)((WindowLayoutChangeCallbackWrapper)object.next()).getActivity(), (Object)activity)) continue;
                return;
            }
        }
        object = this.windowExtension;
        if (object == null) {
            return;
        }
        object.onWindowLayoutChangeListenerRemoved(activity);
    }

    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }

    private final boolean isActivityRegistered(Activity activity) {
        boolean bl;
        block2 : {
            Iterator iterator = this.windowLayoutChangeCallbacks;
            bl = iterator instanceof Collection;
            boolean bl2 = false;
            if (bl && iterator.isEmpty()) {
                return false;
            }
            iterator = iterator.iterator();
            do {
                bl = bl2;
                if (!iterator.hasNext()) break block2;
            } while (!Intrinsics.a((Object)((WindowLayoutChangeCallbackWrapper)iterator.next()).getActivity(), (Object)activity));
            bl = true;
        }
        return bl;
    }

    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    @NotNull
    public final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void registerLayoutChangeCallback(@NotNull Activity var1_1, @NotNull Executor var2_3, @NotNull a var3_4) {
        block10 : {
            block8 : {
                block9 : {
                    block7 : {
                        block6 : {
                            block5 : {
                                Intrinsics.checkNotNullParameter(var1_1, "activity");
                                Intrinsics.checkNotNullParameter((Object)var2_3, "executor");
                                Intrinsics.checkNotNullParameter(var3_4, "callback");
                                var5_5 = SidecarWindowBackend.globalLock;
                                var5_5.lock();
                                try {
                                    var7_6 = this.getWindowExtension();
                                    if (var7_6 != null) break block5;
                                    var3_4.accept(new WindowLayoutInfo(m.f()));
                                }
                                catch (Throwable var1_2) {}
                                var5_5.unlock();
                                return;
                            }
                            var4_7 = this.isActivityRegistered((Activity)var1_1);
                            var6_8 = new WindowLayoutChangeCallbackWrapper((Activity)var1_1, var2_3, (a)var3_4);
                            this.getWindowLayoutChangeCallbacks().add((Object)var6_8);
                            if (var4_7) break block6;
                            var7_6.onWindowLayoutChangeListenerAdded((Activity)var1_1);
                            break block7;
                            break block9;
                        }
                        var7_6 = this.getWindowLayoutChangeCallbacks().iterator();
                        do {
                            var4_7 = var7_6.hasNext();
                            var2_3 = null;
                            if (!var4_7) break block8;
                        } while (!Intrinsics.a(var1_1, (Object)((WindowLayoutChangeCallbackWrapper)(var3_4 = var7_6.next())).getActivity()));
                        var1_1 = var3_4;
                        break block10;
                    }
lbl32: // 3 sources:
                    do {
                        var1_1 = t.a;
                        var5_5.unlock();
                        return;
                        break;
                    } while (true);
                }
                var5_5.unlock();
                throw var1_2;
            }
            var1_1 = null;
        }
        var1_1 = (var1_1 = (WindowLayoutChangeCallbackWrapper)var1_1) == null ? var2_3 : var1_1.getLastInfo();
        if (var1_1 == null) ** GOTO lbl32
        var6_8.accept((WindowLayoutInfo)var1_1);
        ** while (true)
    }

    public final void setWindowExtension(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void unregisterLayoutChangeCallback(@NotNull a object) {
        Intrinsics.checkNotNullParameter(object, "callback");
        ReentrantLock reentrantLock = globalLock;
        synchronized (reentrantLock) {
            ExtensionInterfaceCompat extensionInterfaceCompat;
            block7 : {
                extensionInterfaceCompat = this.getWindowExtension();
                if (extensionInterfaceCompat != null) break block7;
                return;
            }
            try {
                extensionInterfaceCompat = new ArrayList();
                for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : this.getWindowLayoutChangeCallbacks()) {
                    if (windowLayoutChangeCallbackWrapper.getCallback() != object) continue;
                    Intrinsics.checkNotNullExpressionValue(windowLayoutChangeCallbackWrapper, "callbackWrapper");
                    extensionInterfaceCompat.add((Object)windowLayoutChangeCallbackWrapper);
                }
                this.getWindowLayoutChangeCallbacks().removeAll((Collection)extensionInterfaceCompat);
                object = extensionInterfaceCompat.iterator();
                do {
                    if (!object.hasNext()) {
                        object = t.a;
                        return;
                    }
                    this.callbackRemovedForActivity(((WindowLayoutChangeCallbackWrapper)object.next()).getActivity());
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @NotNull
        public final SidecarWindowBackend getInstance(@NotNull Context object) {
            ReentrantLock reentrantLock;
            Intrinsics.checkNotNullParameter(object, "context");
            if (globalInstance == null) {
                reentrantLock = globalLock;
                reentrantLock.lock();
                if (globalInstance == null) {
                    SidecarWindowBackend.access$setGlobalInstance$cp(new SidecarWindowBackend(SidecarWindowBackend.Companion.initAndVerifyExtension((Context)object)));
                }
                object = t.a;
                reentrantLock.unlock();
            }
            object = globalInstance;
            Intrinsics.b(object);
            return object;
            catch (Throwable throwable) {}
            reentrantLock.unlock();
            throw throwable;
        }

        public final ExtensionInterfaceCompat initAndVerifyExtension(@NotNull Context context) {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            SidecarCompat sidecarCompat = null;
            try {
                boolean bl;
                if (this.isSidecarVersionSupported(SidecarCompat.Companion.getSidecarVersion()) && !(bl = (sidecarCompat = new SidecarCompat(context)).validateExtensionInterface())) {
                    return null;
                }
                return sidecarCompat;
            }
            catch (Throwable throwable) {
                return null;
            }
        }

        public final boolean isSidecarVersionSupported(Version version) {
            boolean bl = false;
            if (version == null) {
                return false;
            }
            if (version.compareTo(Version.Companion.getVERSION_0_1()) >= 0) {
                bl = true;
            }
            return bl;
        }

        public final void resetInstance() {
            SidecarWindowBackend.access$setGlobalInstance$cp(null);
        }
    }

    @Metadata
    public final class ExtensionListenerImpl
    implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        public ExtensionListenerImpl() {
            Intrinsics.checkNotNullParameter(SidecarWindowBackend.this, "this$0");
        }

        @SuppressLint(value={"SyntheticAccessor"})
        @Override
        public void onWindowLayoutChanged(@NotNull Activity activity, @NotNull WindowLayoutInfo windowLayoutInfo2) {
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            Intrinsics.checkNotNullParameter(windowLayoutInfo2, "newLayout");
            for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : SidecarWindowBackend.this.getWindowLayoutChangeCallbacks()) {
                if (!Intrinsics.a((Object)windowLayoutChangeCallbackWrapper.getActivity(), (Object)activity)) continue;
                windowLayoutChangeCallbackWrapper.accept(windowLayoutInfo2);
            }
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    @Metadata
    public static final class WindowLayoutChangeCallbackWrapper {
        @NotNull
        private final Activity activity;
        @NotNull
        private final a callback;
        @NotNull
        private final Executor executor;
        private WindowLayoutInfo lastInfo;

        public WindowLayoutChangeCallbackWrapper(@NotNull Activity activity, @NotNull Executor executor, @NotNull a a8) {
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            Intrinsics.checkNotNullParameter((Object)executor, "executor");
            Intrinsics.checkNotNullParameter(a8, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = a8;
        }

        public static /* synthetic */ void a(WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo2) {
            WindowLayoutChangeCallbackWrapper.accept$lambda-0(windowLayoutChangeCallbackWrapper, windowLayoutInfo2);
        }

        private static final void accept$lambda-0(WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo2) {
            Intrinsics.checkNotNullParameter(windowLayoutChangeCallbackWrapper, "this$0");
            Intrinsics.checkNotNullParameter(windowLayoutInfo2, "$newLayoutInfo");
            windowLayoutChangeCallbackWrapper.getCallback().accept(windowLayoutInfo2);
        }

        public final void accept(@NotNull WindowLayoutInfo windowLayoutInfo2) {
            Intrinsics.checkNotNullParameter(windowLayoutInfo2, "newLayoutInfo");
            this.lastInfo = windowLayoutInfo2;
            this.executor.execute((Runnable)new i(this, windowLayoutInfo2));
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

        public final void setLastInfo(WindowLayoutInfo windowLayoutInfo2) {
            this.lastInfo = windowLayoutInfo2;
        }
    }

}

