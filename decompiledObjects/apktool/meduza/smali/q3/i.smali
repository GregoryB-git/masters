.class public final synthetic Lq3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls3/b$a;
.implements Le8/g$c;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Le8/f;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/i;->b:Ljava/lang/Object;

    iput-object p2, p0, Lq3/i;->c:Ljava/lang/Object;

    iput-wide p3, p0, Lq3/i;->a:J

    iput-object p5, p0, Lq3/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lq3/k;Ljava/lang/Iterable;Lk3/s;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/i;->b:Ljava/lang/Object;

    iput-object p2, p0, Lq3/i;->c:Ljava/lang/Object;

    iput-object p3, p0, Lq3/i;->d:Ljava/lang/Object;

    iput-wide p4, p0, Lq3/i;->a:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lq3/i;->b:Ljava/lang/Object;

    check-cast v0, Lq3/k;

    iget-object v1, p0, Lq3/i;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, p0, Lq3/i;->d:Ljava/lang/Object;

    check-cast v2, Lk3/s;

    iget-wide v3, p0, Lq3/i;->a:J

    iget-object v5, v0, Lq3/k;->c:Lr3/d;

    invoke-interface {v5, v1}, Lr3/d;->s0(Ljava/lang/Iterable;)V

    iget-object v1, v0, Lq3/k;->c:Lr3/d;

    iget-object v0, v0, Lq3/k;->g:Lt3/a;

    invoke-interface {v0}, Lt3/a;->a()J

    move-result-wide v5

    add-long/2addr v5, v3

    invoke-interface {v1, v5, v6, v2}, Lr3/d;->P(JLk3/s;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Le8/g$a;)Ljava/util/concurrent/ScheduledFuture;
    .locals 7

    iget-object v0, p0, Lq3/i;->b:Ljava/lang/Object;

    check-cast v0, Le8/f;

    iget-object v1, p0, Lq3/i;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Callable;

    iget-wide v2, p0, Lq3/i;->a:J

    iget-object v4, p0, Lq3/i;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/concurrent/TimeUnit;

    iget-object v5, v0, Le8/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v6, Le8/e;

    invoke-direct {v6, v0, v1, p1}, Le8/e;-><init>(Le8/f;Ljava/util/concurrent/Callable;Le8/g$a;)V

    invoke-interface {v5, v6, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method
