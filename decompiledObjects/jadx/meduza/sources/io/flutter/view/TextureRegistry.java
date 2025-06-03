package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import io.flutter.BuildConfig;

/* loaded from: classes.dex */
public interface TextureRegistry {

    public interface GLTextureConsumer {
        SurfaceTexture getSurfaceTexture();
    }

    public interface ImageConsumer {
        Image acquireLatestImage();
    }

    public interface ImageTextureEntry extends TextureEntry {
        void pushImage(Image image);
    }

    public interface OnFrameConsumedListener {
        void onFrameConsumed();
    }

    public interface OnTrimMemoryListener {
        void onTrimMemory(int i10);
    }

    public interface SurfaceProducer extends TextureEntry {

        public interface Callback {
            void onSurfaceAvailable();

            void onSurfaceCleanup();

            @Deprecated(forRemoval = BuildConfig.RELEASE, since = "Flutter 3.27")
            void onSurfaceCreated();

            @Deprecated(forRemoval = BuildConfig.RELEASE, since = "Flutter 3.28")
            void onSurfaceDestroyed();
        }

        int getHeight();

        Surface getSurface();

        int getWidth();

        boolean handlesCropAndRotation();

        void scheduleFrame();

        void setCallback(Callback callback);

        void setSize(int i10, int i11);
    }

    public interface SurfaceTextureEntry extends TextureEntry {
        void setOnFrameConsumedListener(OnFrameConsumedListener onFrameConsumedListener);

        void setOnTrimMemoryListener(OnTrimMemoryListener onTrimMemoryListener);

        SurfaceTexture surfaceTexture();
    }

    public interface TextureEntry {
        long id();

        void release();
    }

    ImageTextureEntry createImageTexture();

    SurfaceProducer createSurfaceProducer();

    SurfaceTextureEntry createSurfaceTexture();

    void onTrimMemory(int i10);

    SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture);
}
