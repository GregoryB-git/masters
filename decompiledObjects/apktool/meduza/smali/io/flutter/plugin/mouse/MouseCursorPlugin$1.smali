.class Lio/flutter/plugin/mouse/MouseCursorPlugin$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/systemchannels/MouseCursorChannel$MouseCursorMethodHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugin/mouse/MouseCursorPlugin;-><init>(Lio/flutter/plugin/mouse/MouseCursorPlugin$MouseCursorViewDelegate;Lio/flutter/embedding/engine/systemchannels/MouseCursorChannel;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/plugin/mouse/MouseCursorPlugin;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/mouse/MouseCursorPlugin;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/mouse/MouseCursorPlugin$1;->this$0:Lio/flutter/plugin/mouse/MouseCursorPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public activateSystemCursor(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/mouse/MouseCursorPlugin$1;->this$0:Lio/flutter/plugin/mouse/MouseCursorPlugin;

    invoke-static {v0}, Lio/flutter/plugin/mouse/MouseCursorPlugin;->access$100(Lio/flutter/plugin/mouse/MouseCursorPlugin;)Lio/flutter/plugin/mouse/MouseCursorPlugin$MouseCursorViewDelegate;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugin/mouse/MouseCursorPlugin$1;->this$0:Lio/flutter/plugin/mouse/MouseCursorPlugin;

    invoke-static {v1, p1}, Lio/flutter/plugin/mouse/MouseCursorPlugin;->access$000(Lio/flutter/plugin/mouse/MouseCursorPlugin;Ljava/lang/String;)Landroid/view/PointerIcon;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/flutter/plugin/mouse/MouseCursorPlugin$MouseCursorViewDelegate;->setPointerIcon(Landroid/view/PointerIcon;)V

    return-void
.end method
