/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.media.Image
 *  android.view.Surface
 *  java.lang.Object
 */
package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

public interface TextureRegistry {

    @Keep
    public static interface GLTextureConsumer {
        @NonNull
        public SurfaceTexture getSurfaceTexture();
    }

    @Keep
    public static interface ImageConsumer {
        public Image acquireLatestImage();
    }

    @Keep
    public static interface ImageTextureEntry {
        public /* synthetic */ long id();

        public void pushImage(Image var1);

        public /* synthetic */ void release();
    }

    @Keep
    public static interface SurfaceProducer {
        public int getHeight();

        public Surface getSurface();

        public int getWidth();

        public /* synthetic */ long id();

        public /* synthetic */ void release();

        public void scheduleFrame();

        public void setSize(int var1, int var2);
    }

    @Keep
    public static interface SurfaceTextureEntry {
        public /* synthetic */ long id();

        public /* synthetic */ void release();

        public void setOnFrameConsumedListener(a var1);

        public void setOnTrimMemoryListener(b var1);

        @NonNull
        public SurfaceTexture surfaceTexture();
    }

    public static interface a {
    }

    public static interface b {
        public void onTrimMemory(int var1);
    }

}

