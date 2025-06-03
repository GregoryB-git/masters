// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.embedding.engine.renderer;

import androidx.annotation.NonNull;
import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;

@Keep
public class SurfaceTextureWrapper
{
    private boolean attached;
    private boolean newFrameAvailable;
    private Runnable onFrameConsumed;
    private boolean released;
    private SurfaceTexture surfaceTexture;
    
    public SurfaceTextureWrapper(@NonNull final SurfaceTexture surfaceTexture) {
        this(surfaceTexture, null);
    }
    
    public SurfaceTextureWrapper(@NonNull final SurfaceTexture surfaceTexture, final Runnable onFrameConsumed) {
        this.newFrameAvailable = false;
        this.surfaceTexture = surfaceTexture;
        this.released = false;
        this.onFrameConsumed = onFrameConsumed;
    }
    
    public void attachToGLContext(final int n) {
        // monitorenter(this)
        while (true) {
            try {
                if (this.released) {
                    // monitorexit(this)
                    return;
                }
                if (this.attached) {
                    this.surfaceTexture.detachFromGLContext();
                }
                this.surfaceTexture.attachToGLContext(n);
                this.attached = true;
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void detachFromGLContext() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.attached && !this.released) {
                    this.surfaceTexture.detachFromGLContext();
                    this.attached = false;
                }
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void getTransformMatrix(@NonNull final float[] array) {
        this.surfaceTexture.getTransformMatrix(array);
    }
    
    public void markDirty() {
        synchronized (this) {
            this.newFrameAvailable = true;
        }
    }
    
    public void release() {
        // monitorenter(this)
        while (true) {
            try {
                if (!this.released) {
                    this.surfaceTexture.release();
                    this.released = true;
                    this.attached = false;
                }
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public boolean shouldUpdate() {
        synchronized (this) {
            return this.newFrameAvailable;
        }
    }
    
    @NonNull
    public SurfaceTexture surfaceTexture() {
        return this.surfaceTexture;
    }
    
    public void updateTexImage() {
        // monitorenter(this)
        while (true) {
            try {
                this.newFrameAvailable = false;
                if (!this.released) {
                    this.surfaceTexture.updateTexImage();
                    final Runnable onFrameConsumed = this.onFrameConsumed;
                    if (onFrameConsumed != null) {
                        onFrameConsumed.run();
                    }
                }
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
