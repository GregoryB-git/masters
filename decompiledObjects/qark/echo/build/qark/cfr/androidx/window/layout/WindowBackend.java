/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package androidx.window.layout;

import H.a;
import android.app.Activity;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public interface WindowBackend {
    public void registerLayoutChangeCallback(@NotNull Activity var1, @NotNull Executor var2, @NotNull a var3);

    public void unregisterLayoutChangeCallback(@NotNull a var1);
}

