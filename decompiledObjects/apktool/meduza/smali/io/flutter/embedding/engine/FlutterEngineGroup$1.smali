.class Lio/flutter/embedding/engine/FlutterEngineGroup$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/FlutterEngine$EngineLifecycleListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/embedding/engine/FlutterEngineGroup;->createAndRunEngine(Lio/flutter/embedding/engine/FlutterEngineGroup$Options;)Lio/flutter/embedding/engine/FlutterEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/embedding/engine/FlutterEngineGroup;

.field public final synthetic val$engineToCleanUpOnDestroy:Lio/flutter/embedding/engine/FlutterEngine;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/FlutterEngineGroup;Lio/flutter/embedding/engine/FlutterEngine;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/embedding/engine/FlutterEngineGroup$1;->this$0:Lio/flutter/embedding/engine/FlutterEngineGroup;

    iput-object p2, p0, Lio/flutter/embedding/engine/FlutterEngineGroup$1;->val$engineToCleanUpOnDestroy:Lio/flutter/embedding/engine/FlutterEngine;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEngineWillDestroy()V
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineGroup$1;->this$0:Lio/flutter/embedding/engine/FlutterEngineGroup;

    iget-object v0, v0, Lio/flutter/embedding/engine/FlutterEngineGroup;->activeEngines:Ljava/util/List;

    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineGroup$1;->val$engineToCleanUpOnDestroy:Lio/flutter/embedding/engine/FlutterEngine;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onPreEngineRestart()V
    .locals 0

    return-void
.end method
