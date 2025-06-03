// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.view;

import android.view.Surface;
import android.media.Image;
import androidx.annotation.NonNull;
import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;

public interface TextureRegistry
{
    @Keep
    public interface GLTextureConsumer
    {
        @NonNull
        SurfaceTexture getSurfaceTexture();
    }
    
    @Keep
    public interface ImageConsumer
    {
        Image acquireLatestImage();
    }
    
    @Keep
    public interface ImageTextureEntry
    {
        void pushImage(final Image p0);
    }
    
    @Keep
    public interface SurfaceProducer
    {
        int getHeight();
        
        Surface getSurface();
        
        int getWidth();
        
        void scheduleFrame();
        
        void setSize(final int p0, final int p1);
    }
    
    @Keep
    public interface SurfaceTextureEntry
    {
        void setOnFrameConsumedListener(final a p0);
        
        void setOnTrimMemoryListener(final b p0);
        
        @NonNull
        SurfaceTexture surfaceTexture();
    }
    
    public interface a
    {
    }
    
    public interface b
    {
        void onTrimMemory(final int p0);
    }
}
