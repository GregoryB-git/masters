/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 *  java.lang.Object
 */
package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
public class FlutterOverlaySurface {
    private final int id;
    @NonNull
    private final Surface surface;

    public FlutterOverlaySurface(int n8, @NonNull Surface surface) {
        this.id = n8;
        this.surface = surface;
    }

    public int getId() {
        return this.id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}

