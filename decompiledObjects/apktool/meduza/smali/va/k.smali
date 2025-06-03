.class public final Lva/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lva/i;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public c:Landroid/os/HandlerThread;

.field public d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Sqflite"

    iput-object v0, p0, Lva/k;->a:Ljava/lang/String;

    iput p1, p0, Lva/k;->b:I

    return-void
.end method


# virtual methods
.method public final a(Lva/d;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p1, p0, Lva/k;->d:Landroid/os/Handler;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lva/k;->c:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    const/4 v0, 0x0

    iput-object v0, p0, Lva/k;->c:Landroid/os/HandlerThread;

    iput-object v0, p0, Lva/k;->d:Landroid/os/Handler;

    :cond_0
    return-void
.end method

.method public final start()V
    .locals 3

    new-instance v0, Landroid/os/HandlerThread;

    iget-object v1, p0, Lva/k;->a:Ljava/lang/String;

    iget v2, p0, Lva/k;->b:I

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lva/k;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lva/k;->c:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lva/k;->d:Landroid/os/Handler;

    return-void
.end method
