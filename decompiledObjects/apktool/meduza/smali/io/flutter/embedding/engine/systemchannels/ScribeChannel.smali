.class public Lio/flutter/embedding/engine/systemchannels/ScribeChannel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;
    }
.end annotation


# static fields
.field public static final METHOD_IS_FEATURE_AVAILABLE:Ljava/lang/String; = "Scribe.isFeatureAvailable"

.field public static final METHOD_IS_STYLUS_HANDWRITING_AVAILABLE:Ljava/lang/String; = "Scribe.isStylusHandwritingAvailable"

.field public static final METHOD_START_STYLUS_HANDWRITING:Ljava/lang/String; = "Scribe.startStylusHandwriting"

.field private static final TAG:Ljava/lang/String; = "ScribeChannel"


# instance fields
.field public final channel:Lio/flutter/plugin/common/MethodChannel;

.field public final parsingMethodHandler:Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;

.field private scribeMethodHandler:Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/dart/DartExecutor;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/flutter/embedding/engine/systemchannels/ScribeChannel$1;

    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/systemchannels/ScribeChannel$1;-><init>(Lio/flutter/embedding/engine/systemchannels/ScribeChannel;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/systemchannels/ScribeChannel;->parsingMethodHandler:Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;

    new-instance v1, Lio/flutter/plugin/common/MethodChannel;

    sget-object v2, Lio/flutter/plugin/common/JSONMethodCodec;->INSTANCE:Lio/flutter/plugin/common/JSONMethodCodec;

    const-string v3, "flutter/scribe"

    invoke-direct {v1, p1, v3, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MethodCodec;)V

    iput-object v1, p0, Lio/flutter/embedding/engine/systemchannels/ScribeChannel;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method public static synthetic access$000(Lio/flutter/embedding/engine/systemchannels/ScribeChannel;)Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/systemchannels/ScribeChannel;->scribeMethodHandler:Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;

    return-object p0
.end method

.method public static synthetic access$100(Lio/flutter/embedding/engine/systemchannels/ScribeChannel;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/embedding/engine/systemchannels/ScribeChannel;->isFeatureAvailable(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic access$200(Lio/flutter/embedding/engine/systemchannels/ScribeChannel;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/embedding/engine/systemchannels/ScribeChannel;->isStylusHandwritingAvailable(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic access$300(Lio/flutter/embedding/engine/systemchannels/ScribeChannel;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/embedding/engine/systemchannels/ScribeChannel;->startStylusHandwriting(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method private isFeatureAvailable(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    :try_start_0
    iget-object p1, p0, Lio/flutter/embedding/engine/systemchannels/ScribeChannel;->scribeMethodHandler:Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;

    invoke-interface {p1}, Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;->isFeatureAvailable()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "error"

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private isStylusHandwritingAvailable(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x0

    const-string v1, "error"

    const/16 v2, 0x22

    if-ge p1, v2, :cond_0

    const-string p1, "Requires API level 34 or higher."

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    iget-object p1, p0, Lio/flutter/embedding/engine/systemchannels/ScribeChannel;->scribeMethodHandler:Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;

    invoke-interface {p1}, Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;->isStylusHandwritingAvailable()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private startStylusHandwriting(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v0, "error"

    const/4 v1, 0x0

    const/16 v2, 0x21

    if-ge p1, v2, :cond_0

    const-string p1, "Requires API level 33 or higher."

    invoke-interface {p2, v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    iget-object p1, p0, Lio/flutter/embedding/engine/systemchannels/ScribeChannel;->scribeMethodHandler:Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;

    invoke-interface {p1}, Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;->startStylusHandwriting()V

    invoke-interface {p2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public setScribeMethodHandler(Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/ScribeChannel;->scribeMethodHandler:Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;

    return-void
.end method
