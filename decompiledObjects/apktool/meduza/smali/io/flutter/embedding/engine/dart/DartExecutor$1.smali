.class Lio/flutter/embedding/engine/dart/DartExecutor$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/BinaryMessenger$BinaryMessageHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/dart/DartExecutor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/embedding/engine/dart/DartExecutor;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/dart/DartExecutor;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/dart/DartExecutor$1;->this$0:Lio/flutter/embedding/engine/dart/DartExecutor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMessage(Ljava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V
    .locals 1

    iget-object p2, p0, Lio/flutter/embedding/engine/dart/DartExecutor$1;->this$0:Lio/flutter/embedding/engine/dart/DartExecutor;

    sget-object v0, Lio/flutter/plugin/common/StringCodec;->INSTANCE:Lio/flutter/plugin/common/StringCodec;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/common/StringCodec;->decodeMessage(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lio/flutter/embedding/engine/dart/DartExecutor;->access$002(Lio/flutter/embedding/engine/dart/DartExecutor;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lio/flutter/embedding/engine/dart/DartExecutor$1;->this$0:Lio/flutter/embedding/engine/dart/DartExecutor;

    invoke-static {p1}, Lio/flutter/embedding/engine/dart/DartExecutor;->access$100(Lio/flutter/embedding/engine/dart/DartExecutor;)Lio/flutter/embedding/engine/dart/DartExecutor$IsolateServiceIdListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/embedding/engine/dart/DartExecutor$1;->this$0:Lio/flutter/embedding/engine/dart/DartExecutor;

    invoke-static {p1}, Lio/flutter/embedding/engine/dart/DartExecutor;->access$100(Lio/flutter/embedding/engine/dart/DartExecutor;)Lio/flutter/embedding/engine/dart/DartExecutor$IsolateServiceIdListener;

    move-result-object p1

    iget-object p2, p0, Lio/flutter/embedding/engine/dart/DartExecutor$1;->this$0:Lio/flutter/embedding/engine/dart/DartExecutor;

    invoke-static {p2}, Lio/flutter/embedding/engine/dart/DartExecutor;->access$000(Lio/flutter/embedding/engine/dart/DartExecutor;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/embedding/engine/dart/DartExecutor$IsolateServiceIdListener;->onIsolateServiceIdAvailable(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
