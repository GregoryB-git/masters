.class Lio/flutter/embedding/engine/systemchannels/RestorationChannel$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/systemchannels/RestorationChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/embedding/engine/systemchannels/RestorationChannel;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$2;->this$0:Lio/flutter/embedding/engine/systemchannels/RestorationChannel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "get"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "put"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$2;->this$0:Lio/flutter/embedding/engine/systemchannels/RestorationChannel;

    check-cast p1, [B

    invoke-static {v0, p1}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->access$002(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;[B)[B

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$2;->this$0:Lio/flutter/embedding/engine/systemchannels/RestorationChannel;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->access$102(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;Z)Z

    iget-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$2;->this$0:Lio/flutter/embedding/engine/systemchannels/RestorationChannel;

    invoke-static {p1}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->access$200(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$2;->this$0:Lio/flutter/embedding/engine/systemchannels/RestorationChannel;

    iget-boolean v0, p1, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->waitForRestorationData:Z

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1, p2}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->access$402(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;Lio/flutter/plugin/common/MethodChannel$Result;)Lio/flutter/plugin/common/MethodChannel$Result;

    goto :goto_2

    :cond_3
    :goto_1
    iget-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$2;->this$0:Lio/flutter/embedding/engine/systemchannels/RestorationChannel;

    invoke-static {p1}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->access$000(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;)[B

    move-result-object v0

    invoke-static {p1, v0}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->access$300(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;[B)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :goto_2
    return-void
.end method
