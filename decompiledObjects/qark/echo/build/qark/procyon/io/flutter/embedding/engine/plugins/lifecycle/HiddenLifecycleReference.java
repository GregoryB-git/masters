// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.d;
import androidx.annotation.Keep;

@Keep
public class HiddenLifecycleReference
{
    @NonNull
    private final d lifecycle;
    
    public HiddenLifecycleReference(@NonNull final d lifecycle) {
        this.lifecycle = lifecycle;
    }
    
    @NonNull
    public d getLifecycle() {
        return this.lifecycle;
    }
}
