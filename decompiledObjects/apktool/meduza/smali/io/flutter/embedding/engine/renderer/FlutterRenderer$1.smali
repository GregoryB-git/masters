.class Lio/flutter/embedding/engine/renderer/FlutterRenderer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/renderer/FlutterUiDisplayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/renderer/FlutterRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/renderer/FlutterRenderer;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$1;->this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFlutterUiDisplayed()V
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$1;->this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->access$002(Lio/flutter/embedding/engine/renderer/FlutterRenderer;Z)Z

    return-void
.end method

.method public onFlutterUiNoLongerDisplayed()V
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$1;->this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->access$002(Lio/flutter/embedding/engine/renderer/FlutterRenderer;Z)Z

    return-void
.end method
