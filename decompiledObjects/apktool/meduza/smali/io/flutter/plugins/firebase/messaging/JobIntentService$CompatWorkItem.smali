.class final Lio/flutter/plugins/firebase/messaging/JobIntentService$CompatWorkItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/messaging/JobIntentService$GenericWorkItem;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/firebase/messaging/JobIntentService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "CompatWorkItem"
.end annotation


# instance fields
.field public final mIntent:Landroid/content/Intent;

.field public final mStartId:I

.field public final synthetic this$0:Lio/flutter/plugins/firebase/messaging/JobIntentService;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/messaging/JobIntentService;Landroid/content/Intent;I)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CompatWorkItem;->this$0:Lio/flutter/plugins/firebase/messaging/JobIntentService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CompatWorkItem;->mIntent:Landroid/content/Intent;

    iput p3, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CompatWorkItem;->mStartId:I

    return-void
.end method


# virtual methods
.method public complete()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CompatWorkItem;->this$0:Lio/flutter/plugins/firebase/messaging/JobIntentService;

    iget v1, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CompatWorkItem;->mStartId:I

    invoke-virtual {v0, v1}, Landroid/app/Service;->stopSelf(I)V

    return-void
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/JobIntentService$CompatWorkItem;->mIntent:Landroid/content/Intent;

    return-object v0
.end method
