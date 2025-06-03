// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import H.a;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import android.app.Activity;
import kotlin.Metadata;

@Metadata
public interface WindowBackend
{
    void registerLayoutChangeCallback(@NotNull final Activity p0, @NotNull final Executor p1, @NotNull final a p2);
    
    void unregisterLayoutChangeCallback(@NotNull final a p0);
}
