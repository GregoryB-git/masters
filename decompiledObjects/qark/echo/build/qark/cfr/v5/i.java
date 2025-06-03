/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.ImageDecoder
 *  android.graphics.ImageDecoder$ImageInfo
 *  android.graphics.ImageDecoder$OnHeaderDecodedListener
 *  android.graphics.ImageDecoder$Source
 *  java.lang.Object
 */
package v5;

import android.graphics.ImageDecoder;
import io.flutter.embedding.engine.FlutterJNI;

public final class i
implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ long a;

    public /* synthetic */ i(long l8) {
        this.a = l8;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.a(this.a, imageDecoder, imageInfo, source);
    }
}

