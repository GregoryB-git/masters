/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.ImageReader
 *  android.media.ImageReader$OnImageAvailableListener
 *  java.lang.Object
 */
package io.flutter.embedding.engine.renderer;

import android.media.ImageReader;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

public final class i
implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ FlutterRenderer.ImageReaderSurfaceProducer.b a;

    public /* synthetic */ i(FlutterRenderer.ImageReaderSurfaceProducer.b b8) {
        this.a = b8;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        FlutterRenderer.ImageReaderSurfaceProducer.b.a(this.a, imageReader);
    }
}

