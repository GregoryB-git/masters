.class final Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/firebase/messaging/JobIntentService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "CommandProcessor"
.end annotation


# instance fields
.field private final executor:Ljava/util/concurrent/Executor;

.field private final handler:Landroid/os/Handler;

.field public final synthetic this$0:Lio/flutter/plugins/firebase/messaging/JobIntentService;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/messaging/JobIntentService;)V
    .locals 1

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;->this$0:Lio/flutter/plugins/firebase/messaging/JobIntentService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;->executor:Ljava/util/concurrent/Executor;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;->handler:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic access$000(Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;->handler:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;->this$0:Lio/flutter/plugins/firebase/messaging/JobIntentService;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/messaging/JobIntentService;->processorFinished()V

    return-void
.end method

.method public execute()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;->executor:Ljava/util/concurrent/Executor;

    new-instance v1, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;

    invoke-direct {v1, p0}, Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor$1;-><init>(Lio/flutter/plugins/firebase/messaging/JobIntentService$CommandProcessor;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
