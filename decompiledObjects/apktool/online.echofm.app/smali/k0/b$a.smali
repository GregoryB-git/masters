.class public final Lk0/b$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final o:Lk0/b$b;

.field public final p:Landroid/os/Handler;

.field public final synthetic q:Lk0/b;


# direct methods
.method public constructor <init>(Lk0/b;Landroid/os/Handler;Lk0/b$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/b$a;->q:Lk0/b;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lk0/b$a;->p:Landroid/os/Handler;

    .line 7
    .line 8
    iput-object p3, p0, Lk0/b$a;->o:Lk0/b$b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    const-string p1, "android.media.AUDIO_BECOMING_NOISY"

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lk0/b$a;->p:Landroid/os/Handler;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/b$a;->q:Lk0/b;

    .line 2
    .line 3
    invoke-static {v0}, Lk0/b;->a(Lk0/b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lk0/b$a;->o:Lk0/b$b;

    .line 10
    .line 11
    invoke-interface {v0}, Lk0/b$b;->E()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
