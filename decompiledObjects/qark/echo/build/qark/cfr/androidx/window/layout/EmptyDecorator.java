/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package androidx.window.layout;

import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowInfoTrackerDecorator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
final class EmptyDecorator
implements WindowInfoTrackerDecorator {
    @NotNull
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @NotNull
    @Override
    public WindowInfoTracker decorate(@NotNull WindowInfoTracker windowInfoTracker) {
        Intrinsics.checkNotNullParameter(windowInfoTracker, "tracker");
        return windowInfoTracker;
    }
}

