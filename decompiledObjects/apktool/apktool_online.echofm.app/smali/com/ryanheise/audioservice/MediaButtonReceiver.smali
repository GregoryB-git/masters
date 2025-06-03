.class public Lcom/ryanheise/audioservice/MediaButtonReceiver;
.super Lc0/d;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc0/d;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    if-eqz p2, :cond_0

    const-string v0, "com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->R:Lcom/ryanheise/audioservice/AudioService;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ryanheise/audioservice/AudioService;->P()V

    return-void

    :cond_0
    invoke-super {p0, p1, p2}, Lc0/d;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
