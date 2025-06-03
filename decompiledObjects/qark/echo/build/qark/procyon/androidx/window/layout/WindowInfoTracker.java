// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import androidx.window.extensions.layout.WindowLayoutComponent;
import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import kotlin.jvm.internal.v;
import s6.b;
import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public interface WindowInfoTracker
{
    @NotNull
    public static final Companion Companion = WindowInfoTracker.Companion.$$INSTANCE;
    
    @NotNull
    b windowLayoutInfo(@NotNull final Activity p0);
    
    @Metadata
    public static final class Companion
    {
        static final /* synthetic */ Companion $$INSTANCE;
        private static final boolean DEBUG = false;
        private static final String TAG;
        @NotNull
        private static WindowInfoTrackerDecorator decorator;
        
        static {
            $$INSTANCE = new Companion();
            TAG = v.b(WindowInfoTracker.class).a();
            Companion.decorator = EmptyDecorator.INSTANCE;
        }
        
        private Companion() {
        }
        
        @NotNull
        public final WindowInfoTracker getOrCreate(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Companion.decorator.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, this.windowBackend$window_release(context)));
        }
        
        public final void overrideDecorator(@NotNull final WindowInfoTrackerDecorator decorator) {
            Intrinsics.checkNotNullParameter(decorator, "overridingDecorator");
            Companion.decorator = decorator;
        }
        
        public final void reset() {
            Companion.decorator = EmptyDecorator.INSTANCE;
        }
        
        @NotNull
        public final WindowBackend windowBackend$window_release(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            WindowBackend instance = null;
            while (true) {
                try {
                    final WindowLayoutComponent windowLayoutComponent = WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                    WindowBackend windowBackend;
                    if (windowLayoutComponent == null) {
                        windowBackend = instance;
                    }
                    else {
                        windowBackend = new ExtensionWindowLayoutInfoBackend(windowLayoutComponent);
                    }
                    while (true) {
                        while (true) {
                            if ((instance = windowBackend) == null) {
                                instance = SidecarWindowBackend.Companion.getInstance(context);
                            }
                            return instance;
                            Log.d(Companion.TAG, "Failed to load WindowExtensions");
                            windowBackend = instance;
                            continue;
                        }
                        windowBackend = instance;
                        continue;
                    }
                }
                // iftrue(Label_0057:, !Companion.DEBUG)
                finally {}
                continue;
            }
        }
    }
}
