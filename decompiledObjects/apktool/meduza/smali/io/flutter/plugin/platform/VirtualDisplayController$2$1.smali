.class Lio/flutter/plugin/platform/VirtualDisplayController$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugin/platform/VirtualDisplayController$2;->onViewAttachedToWindow(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$1:Lio/flutter/plugin/platform/VirtualDisplayController$2;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/platform/VirtualDisplayController$2;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/platform/VirtualDisplayController$2$1;->this$1:Lio/flutter/plugin/platform/VirtualDisplayController$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugin/platform/VirtualDisplayController$2$1;->this$1:Lio/flutter/plugin/platform/VirtualDisplayController$2;

    iget-object v1, v0, Lio/flutter/plugin/platform/VirtualDisplayController$2;->val$embeddedView:Landroid/view/View;

    iget-object v0, v0, Lio/flutter/plugin/platform/VirtualDisplayController$2;->val$onNewSizeFrameAvailable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x80

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
