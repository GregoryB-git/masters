// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
final class EmptyDecorator implements WindowInfoTrackerDecorator
{
    @NotNull
    public static final EmptyDecorator INSTANCE;
    
    static {
        INSTANCE = new EmptyDecorator();
    }
    
    private EmptyDecorator() {
    }
    
    @NotNull
    @Override
    public WindowInfoTracker decorate(@NotNull final WindowInfoTracker windowInfoTracker) {
        Intrinsics.checkNotNullParameter(windowInfoTracker, "tracker");
        return windowInfoTracker;
    }
}
