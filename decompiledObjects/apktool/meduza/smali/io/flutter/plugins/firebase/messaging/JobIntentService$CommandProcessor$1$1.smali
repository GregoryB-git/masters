.class Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$2:Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1$1;->this$2:Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1$1;->this$2:Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;

    iget-object v0, v0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;->this$1:Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;

    iget-object v0, v0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;->this$0:Lio/flutter/plugins/firebase/messaging/JobIntentService;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/messaging/JobIntentService;->processorFinished()V

    return-void
.end method
