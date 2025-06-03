/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.d;

@Keep
public class HiddenLifecycleReference {
    @NonNull
    private final d lifecycle;

    public HiddenLifecycleReference(@NonNull d d8) {
        this.lifecycle = d8;
    }

    @NonNull
    public d getLifecycle() {
        return this.lifecycle;
    }
}

