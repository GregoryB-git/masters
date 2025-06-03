// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import org.jetbrains.annotations.NotNull;
import android.app.Activity;
import kotlin.Metadata;

@Metadata
public interface ExtensionInterfaceCompat
{
    void onWindowLayoutChangeListenerAdded(@NotNull final Activity p0);
    
    void onWindowLayoutChangeListenerRemoved(@NotNull final Activity p0);
    
    void setExtensionCallback(@NotNull final ExtensionCallbackInterface p0);
    
    boolean validateExtensionInterface();
    
    @Metadata
    public interface ExtensionCallbackInterface
    {
        void onWindowLayoutChanged(@NotNull final Activity p0, @NotNull final WindowLayoutInfo p1);
    }
}
