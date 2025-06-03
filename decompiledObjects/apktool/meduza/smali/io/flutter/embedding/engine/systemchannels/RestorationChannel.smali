.class public Lio/flutter/embedding/engine/systemchannels/RestorationChannel;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "RestorationChannel"


# instance fields
.field private channel:Lio/flutter/plugin/common/MethodChannel;

.field private engineHasProvidedData:Z

.field private frameworkHasRequestedData:Z

.field private final handler:Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;

.field private pendingFrameworkRestorationChannelRequest:Lio/flutter/plugin/common/MethodChannel$Result;

.field private restorationData:[B

.field public final waitForRestorationData:Z


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/dart/DartExecutor;Z)V
    .locals 3

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    sget-object v1, Lio/flutter/plugin/common/StandardMethodCodec;->INSTANCE:Lio/flutter/plugin/common/StandardMethodCodec;

    const-string v2, "flutter/restoration"

    invoke-direct {v0, p1, v2, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MethodCodec;)V

    invoke-direct {p0, v0, p2}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;-><init>(Lio/flutter/plugin/common/MethodChannel;Z)V

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugin/common/MethodChannel;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->engineHasProvidedData:Z

    iput-boolean v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->frameworkHasRequestedData:Z

    new-instance v0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$2;

    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$2;-><init>(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->handler:Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;

    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->channel:Lio/flutter/plugin/common/MethodChannel;

    iput-boolean p2, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->waitForRestorationData:Z

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method public static synthetic access$000(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;)[B
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->restorationData:[B

    return-object p0
.end method

.method public static synthetic access$002(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;[B)[B
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->restorationData:[B

    return-object p1
.end method

.method public static synthetic access$102(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;Z)Z
    .locals 0

    iput-boolean p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->frameworkHasRequestedData:Z

    return p1
.end method

.method public static synthetic access$200(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;)Z
    .locals 0

    iget-boolean p0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->engineHasProvidedData:Z

    return p0
.end method

.method public static synthetic access$300(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;[B)Ljava/util/Map;
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->packageData([B)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$402(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;Lio/flutter/plugin/common/MethodChannel$Result;)Lio/flutter/plugin/common/MethodChannel$Result;
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->pendingFrameworkRestorationChannelRequest:Lio/flutter/plugin/common/MethodChannel$Result;

    return-object p1
.end method

.method private packageData([B)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "enabled"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "data"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public clearData()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->restorationData:[B

    return-void
.end method

.method public getRestorationData()[B
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->restorationData:[B

    return-object v0
.end method

.method public setRestorationData([B)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->engineHasProvidedData:Z

    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->pendingFrameworkRestorationChannelRequest:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->packageData([B)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->pendingFrameworkRestorationChannelRequest:Lio/flutter/plugin/common/MethodChannel$Result;

    :cond_0
    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->restorationData:[B

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->frameworkHasRequestedData:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-direct {p0, p1}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->packageData([B)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$1;

    invoke-direct {v2, p0, p1}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$1;-><init>(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;[B)V

    const-string p1, "push"

    invoke-virtual {v0, p1, v1, v2}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;)V

    :goto_0
    return-void
.end method
