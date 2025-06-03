.class Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;->execute()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$1:Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;->this$1:Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;->this$1:Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;

    iget-object v0, v0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;->this$0:Lio/flutter/plugins/firebase/messaging/JobIntentService;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/messaging/JobIntentService;->dequeueWork()Lio/flutter/plugins/firebase/messaging/JobIntentService$GenericWorkItem;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;->this$1:Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;

    iget-object v1, v1, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;->this$0:Lio/flutter/plugins/firebase/messaging/JobIntentService;

    invoke-interface {v0}, Lio/flutter/plugins/firebase/messaging/JobIntentService$GenericWorkItem;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugins/firebase/messaging/JobIntentService;->onHandleWork(Landroid/content/Intent;)V

    invoke-interface {v0}, Lio/flutter/plugins/firebase/messaging/JobIntentService$GenericWorkItem;->complete()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;->this$1:Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;

    invoke-static {v0}, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;->access$000(Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1$1;

    invoke-direct {v1, p0}, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1$1;-><init>(Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
