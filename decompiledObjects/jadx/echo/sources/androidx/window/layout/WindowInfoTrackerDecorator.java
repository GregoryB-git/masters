package androidx.window.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public interface WindowInfoTrackerDecorator {
    @NotNull
    WindowInfoTracker decorate(@NotNull WindowInfoTracker windowInfoTracker);
}
