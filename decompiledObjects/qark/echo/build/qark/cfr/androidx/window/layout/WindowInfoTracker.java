/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.Log
 *  androidx.window.extensions.WindowExtensionsProvider
 *  androidx.window.extensions.layout.WindowLayoutComponent
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.EmptyDecorator;
import androidx.window.layout.ExtensionWindowLayoutInfoBackend;
import androidx.window.layout.SidecarWindowBackend;
import androidx.window.layout.WindowBackend;
import androidx.window.layout.WindowInfoTrackerDecorator;
import androidx.window.layout.WindowInfoTrackerImpl;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.layout.WindowMetricsCalculatorCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;
import s6.b;

@Metadata
public interface WindowInfoTracker {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public b windowLayoutInfo(@NotNull Activity var1);

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE;
        private static final boolean DEBUG = false;
        private static final String TAG;
        @NotNull
        private static WindowInfoTrackerDecorator decorator;

        static {
            $$INSTANCE = new Companion();
            TAG = v.b(WindowInfoTracker.class).a();
            decorator = EmptyDecorator.INSTANCE;
        }

        private Companion() {
        }

        @NotNull
        public final WindowInfoTracker getOrCreate(@NotNull Context object) {
            Intrinsics.checkNotNullParameter(object, "context");
            object = new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, this.windowBackend$window_release((Context)object));
            return decorator.decorate((WindowInfoTracker)object);
        }

        public final void overrideDecorator(@NotNull WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
            Intrinsics.checkNotNullParameter(windowInfoTrackerDecorator, "overridingDecorator");
            decorator = windowInfoTrackerDecorator;
        }

        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @NotNull
        public final WindowBackend windowBackend$window_release(@NotNull Context context) {
            Object object;
            Object object2;
            block3 : {
                Intrinsics.checkNotNullParameter((Object)context, "context");
                object2 = null;
                try {
                    object = WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                    object = object == null ? object2 : new Object((WindowLayoutComponent)object);
                    break block3;
                }
                catch (Throwable throwable) {}
                object = object2;
                if (DEBUG) {
                    Log.d((String)TAG, (String)"Failed to load WindowExtensions");
                    object = object2;
                }
            }
            object2 = object;
            if (object != null) return object2;
            return SidecarWindowBackend.Companion.getInstance(context);
        }
    }

}

