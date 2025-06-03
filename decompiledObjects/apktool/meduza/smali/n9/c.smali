.class public final Ln9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public a:Ljava/util/concurrent/Semaphore;

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Ln9/c;->a:Ljava/util/concurrent/Semaphore;

    iput v1, p0, Ln9/c;->b:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Ln9/c;->a:Ljava/util/concurrent/Semaphore;

    iget v2, p0, Ln9/c;->b:I

    invoke-virtual {v1, v2}, Ljava/util/concurrent/Semaphore;->acquire(I)V

    iput v0, p0, Ln9/c;->b:I
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v0

    const-string v0, "Interrupted while waiting for background task"

    invoke-static {v0, v2}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 3

    iget v0, p0, Ln9/c;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ln9/c;->b:I

    sget-object v0, Ln9/f;->c:Ln9/m;

    new-instance v1, Lw/g;

    const/16 v2, 0x18

    invoke-direct {v1, v2, p0, p1}, Lw/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ln9/m;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
