.class public final synthetic Lio/flutter/view/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lio/flutter/view/TextureRegistry$SurfaceProducer$Callback;)V
    .locals 0

    invoke-interface {p0}, Lio/flutter/view/TextureRegistry$SurfaceProducer$Callback;->onSurfaceCreated()V

    return-void
.end method

.method public static b(Lio/flutter/view/TextureRegistry$SurfaceProducer$Callback;)V
    .locals 0

    invoke-interface {p0}, Lio/flutter/view/TextureRegistry$SurfaceProducer$Callback;->onSurfaceDestroyed()V

    return-void
.end method

.method public static c(Lio/flutter/view/TextureRegistry$SurfaceProducer$Callback;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = true
        since = "Flutter 3.27"
    .end annotation

    return-void
.end method

.method public static d(Lio/flutter/view/TextureRegistry$SurfaceProducer$Callback;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = true
        since = "Flutter 3.28"
    .end annotation

    return-void
.end method
