.class public final Lgb/d0$i;
.super Leb/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RespT:",
        "Ljava/lang/Object;",
        ">",
        "Leb/e$a<",
        "TRespT;>;"
    }
.end annotation


# instance fields
.field public final a:Leb/e$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/e$a<",
            "TRespT;>;"
        }
    .end annotation
.end field

.field public volatile b:Z

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Leb/e$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/e$a<",
            "TRespT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Leb/e$a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lgb/d0$i;->c:Ljava/util/List;

    iput-object p1, p0, Lgb/d0$i;->a:Leb/e$a;

    return-void
.end method


# virtual methods
.method public final a(Leb/s0;Leb/e1;)V
    .locals 1

    new-instance v0, Lgb/e0;

    invoke-direct {v0, p0, p2, p1}, Lgb/e0;-><init>(Lgb/d0$i;Leb/e1;Leb/s0;)V

    invoke-virtual {p0, v0}, Lgb/d0$i;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Leb/s0;)V
    .locals 1

    iget-boolean v0, p0, Lgb/d0$i;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgb/d0$i;->a:Leb/e$a;

    invoke-virtual {v0, p1}, Leb/e$a;->b(Leb/s0;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lgb/d0$i$a;

    invoke-direct {v0, p0, p1}, Lgb/d0$i$a;-><init>(Lgb/d0$i;Leb/s0;)V

    invoke-virtual {p0, v0}, Lgb/d0$i;->e(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRespT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lgb/d0$i;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgb/d0$i;->a:Leb/e$a;

    invoke-virtual {v0, p1}, Leb/e$a;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lgb/d0$i$b;

    invoke-direct {v0, p0, p1}, Lgb/d0$i$b;-><init>(Lgb/d0$i;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lgb/d0$i;->e(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final d()V
    .locals 1

    iget-boolean v0, p0, Lgb/d0$i;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgb/d0$i;->a:Leb/e$a;

    invoke-virtual {v0}, Leb/e$a;->d()V

    goto :goto_0

    :cond_0
    new-instance v0, Lgb/d0$i$c;

    invoke-direct {v0, p0}, Lgb/d0$i$c;-><init>(Lgb/d0$i;)V

    invoke-virtual {p0, v0}, Lgb/d0$i;->e(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final e(Ljava/lang/Runnable;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lgb/d0$i;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lgb/d0$i;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
