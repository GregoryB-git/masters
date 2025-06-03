/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 */
package androidx.window.layout;

import android.app.Activity;
import androidx.window.layout.WindowLayoutInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public interface ExtensionInterfaceCompat {
    public void onWindowLayoutChangeListenerAdded(@NotNull Activity var1);

    public void onWindowLayoutChangeListenerRemoved(@NotNull Activity var1);

    public void setExtensionCallback(@NotNull ExtensionCallbackInterface var1);

    public boolean validateExtensionInterface();

    @Metadata
    public static interface ExtensionCallbackInterface {
        public void onWindowLayoutChanged(@NotNull Activity var1, @NotNull WindowLayoutInfo var2);
    }

}

