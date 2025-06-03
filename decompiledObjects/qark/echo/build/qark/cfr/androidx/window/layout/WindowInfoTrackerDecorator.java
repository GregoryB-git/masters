/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package androidx.window.layout;

import androidx.window.layout.WindowInfoTracker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public interface WindowInfoTrackerDecorator {
    @NotNull
    public WindowInfoTracker decorate(@NotNull WindowInfoTracker var1);
}

