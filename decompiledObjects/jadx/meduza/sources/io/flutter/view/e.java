package io.flutter.view;

import io.flutter.BuildConfig;
import io.flutter.view.TextureRegistry;

/* loaded from: classes.dex */
public final /* synthetic */ class e {
    public static void a(TextureRegistry.SurfaceProducer.Callback callback) {
        callback.onSurfaceCreated();
    }

    public static void b(TextureRegistry.SurfaceProducer.Callback callback) {
        callback.onSurfaceDestroyed();
    }

    @Deprecated(forRemoval = BuildConfig.RELEASE, since = "Flutter 3.27")
    public static void c(TextureRegistry.SurfaceProducer.Callback callback) {
    }

    @Deprecated(forRemoval = BuildConfig.RELEASE, since = "Flutter 3.28")
    public static void d(TextureRegistry.SurfaceProducer.Callback callback) {
    }
}
