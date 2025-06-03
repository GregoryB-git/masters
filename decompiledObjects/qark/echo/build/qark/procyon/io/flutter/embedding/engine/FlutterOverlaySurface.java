// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.embedding.engine;

import androidx.annotation.NonNull;
import android.view.Surface;
import androidx.annotation.Keep;

@Keep
public class FlutterOverlaySurface
{
    private final int id;
    @NonNull
    private final Surface surface;
    
    public FlutterOverlaySurface(final int id, @NonNull final Surface surface) {
        this.id = id;
        this.surface = surface;
    }
    
    public int getId() {
        return this.id;
    }
    
    public Surface getSurface() {
        return this.surface;
    }
}
