.class public Lio/flutter/embedding/android/FlutterPlayStoreSplitApplication;
.super Lcom/google/android/play/core/splitcompat/SplitCompatApplication;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/play/core/splitcompat/SplitCompatApplication;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    invoke-super {p0}, Lcom/google/android/play/core/splitcompat/SplitCompatApplication;->onCreate()V

    new-instance v0, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/flutter/embedding/engine/deferredcomponents/PlayStoreDeferredComponentManager;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterJNI;)V

    new-instance v1, Lio/flutter/FlutterInjector$Builder;

    invoke-direct {v1}, Lio/flutter/FlutterInjector$Builder;-><init>()V

    invoke-virtual {v1, v0}, Lio/flutter/FlutterInjector$Builder;->setDeferredComponentManager(Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;)Lio/flutter/FlutterInjector$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/FlutterInjector$Builder;->build()Lio/flutter/FlutterInjector;

    move-result-object v0

    invoke-static {v0}, Lio/flutter/FlutterInjector;->setInstance(Lio/flutter/FlutterInjector;)V

    return-void
.end method
