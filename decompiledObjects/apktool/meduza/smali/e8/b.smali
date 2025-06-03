.class public final synthetic Le8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/g$c;
.implements Lt9/a$a;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Le8/b;->b:Ljava/lang/Object;

    iput-object p2, p0, Le8/b;->c:Ljava/lang/Object;

    iput-wide p3, p0, Le8/b;->a:J

    iput-object p5, p0, Le8/b;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Le8/g$a;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    iget-object v0, p0, Le8/b;->b:Ljava/lang/Object;

    check-cast v0, Le8/f;

    iget-object v1, p0, Le8/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    iget-wide v2, p0, Le8/b;->a:J

    iget-object v4, p0, Le8/b;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/concurrent/TimeUnit;

    iget-object v5, v0, Le8/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v6, Lx0/d;

    const/4 v7, 0x4

    invoke-direct {v6, v0, v1, p1, v7}, Lx0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v5, v6, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lt9/b;)V
    .locals 7

    iget-object v0, p0, Le8/b;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Le8/b;->c:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-wide v4, p0, Le8/b;->a:J

    iget-object v0, p0, Le8/b;->d:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lm8/g0;

    invoke-interface {p1}, Lt9/b;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lg8/a;

    invoke-interface/range {v1 .. v6}, Lg8/a;->c(Ljava/lang/String;Ljava/lang/String;JLm8/g0;)V

    return-void
.end method
