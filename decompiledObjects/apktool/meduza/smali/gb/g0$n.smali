.class public final Lgb/g0$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "n"
.end annotation


# instance fields
.field public final a:Lgb/t;

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
.method public constructor <init>(Lgb/t;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lgb/g0$n;->c:Ljava/util/List;

    iput-object p1, p0, Lgb/g0$n;->a:Lgb/t;

    return-void
.end method


# virtual methods
.method public final a(Lgb/n3$a;)V
    .locals 1

    iget-boolean v0, p0, Lgb/g0$n;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgb/g0$n;->a:Lgb/t;

    invoke-interface {v0, p1}, Lgb/n3;->a(Lgb/n3$a;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lgb/g0$n$a;

    invoke-direct {v0, p0, p1}, Lgb/g0$n$a;-><init>(Lgb/g0$n;Lgb/n3$a;)V

    invoke-virtual {p0, v0}, Lgb/g0$n;->e(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final b(Leb/s0;)V
    .locals 1

    new-instance v0, Lgb/g0$n$c;

    invoke-direct {v0, p0, p1}, Lgb/g0$n$c;-><init>(Lgb/g0$n;Leb/s0;)V

    invoke-virtual {p0, v0}, Lgb/g0$n;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-boolean v0, p0, Lgb/g0$n;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgb/g0$n;->a:Lgb/t;

    invoke-interface {v0}, Lgb/n3;->c()V

    goto :goto_0

    :cond_0
    new-instance v0, Lgb/g0$n$b;

    invoke-direct {v0, p0}, Lgb/g0$n$b;-><init>(Lgb/g0$n;)V

    invoke-virtual {p0, v0}, Lgb/g0$n;->e(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final d(Leb/e1;Lgb/t$a;Leb/s0;)V
    .locals 1

    new-instance v0, Lgb/g0$n$d;

    invoke-direct {v0, p0, p1, p2, p3}, Lgb/g0$n$d;-><init>(Lgb/g0$n;Leb/e1;Lgb/t$a;Leb/s0;)V

    invoke-virtual {p0, v0}, Lgb/g0$n;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e(Ljava/lang/Runnable;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lgb/g0$n;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lgb/g0$n;->c:Ljava/util/List;

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
