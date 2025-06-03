.class public final Ly2/b0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly2/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ly2/b0;

.field public final b:Lx2/l;


# direct methods
.method public constructor <init>(Ly2/b0;Lx2/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/b0$b;->a:Ly2/b0;

    iput-object p2, p0, Ly2/b0$b;->b:Lx2/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Ly2/b0$b;->a:Ly2/b0;

    iget-object v0, v0, Ly2/b0;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly2/b0$b;->a:Ly2/b0;

    iget-object v1, v1, Ly2/b0;->b:Ljava/util/HashMap;

    iget-object v2, p0, Ly2/b0$b;->b:Lx2/l;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/b0$b;

    if-eqz v1, :cond_0

    iget-object v1, p0, Ly2/b0$b;->a:Ly2/b0;

    iget-object v1, v1, Ly2/b0;->c:Ljava/util/HashMap;

    iget-object v2, p0, Ly2/b0$b;->b:Lx2/l;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/b0$a;

    if-eqz v1, :cond_1

    iget-object v2, p0, Ly2/b0$b;->b:Lx2/l;

    invoke-interface {v1, v2}, Ly2/b0$a;->a(Lx2/l;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lo2/j;->d()Lo2/j;

    move-result-object v1

    const-string v2, "WrkTimerRunnable"

    const-string v3, "Timer with %s is already marked as complete."

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p0, Ly2/b0$b;->b:Lx2/l;

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
