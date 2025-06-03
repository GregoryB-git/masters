.class public LT3/q$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT3/q$d;
.implements Le4/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT3/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public a:Le4/c;

.field public final synthetic b:LT3/q;


# direct methods
.method public constructor <init>(LT3/q;Le4/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT3/q$e;->b:LT3/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LT3/q$e;->a:Le4/c;

    invoke-virtual {p2, p0}, Le4/c;->r(Le4/d;)V

    return-void
.end method

.method public synthetic constructor <init>(LT3/q;Le4/c;LT3/q$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LT3/q$e;-><init>(LT3/q;Le4/c;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LT3/q$e;->a:Le4/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Le4/c;->e()V
    :try_end_0
    .catch Le4/e; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catch_0
    move-exception v0

    .line 8
    iget-object v1, p0, LT3/q$e;->b:LT3/q;

    .line 9
    .line 10
    invoke-static {v1}, LT3/q;->c(LT3/q;)Lc4/c;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lc4/c;->f()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, LT3/q$e;->b:LT3/q;

    .line 21
    .line 22
    invoke-static {v1}, LT3/q;->c(LT3/q;)Lc4/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    new-array v2, v2, [Ljava/lang/Object;

    .line 28
    .line 29
    const-string v3, "Error connecting"

    .line 30
    .line 31
    invoke-virtual {v1, v3, v0, v2}, Lc4/c;->a(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, LT3/q$e;->g()V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, LT3/q$e;->b:LT3/q;

    .line 2
    .line 3
    invoke-static {v0}, LT3/q;->e(LT3/q;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LT3/q$e$c;

    .line 8
    .line 9
    invoke-direct {v1, p0}, LT3/q$e$c;-><init>(LT3/q$e;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, LT3/q$e;->b:LT3/q;

    .line 2
    .line 3
    invoke-static {v0}, LT3/q;->e(LT3/q;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LT3/q$e$a;

    .line 8
    .line 9
    invoke-direct {v1, p0}, LT3/q$e$a;-><init>(LT3/q$e;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, LT3/q$e;->a:Le4/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Le4/c;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Le4/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, LT3/q$e;->b:LT3/q;

    .line 2
    .line 3
    invoke-static {v0}, LT3/q;->e(LT3/q;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LT3/q$e$d;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, LT3/q$e$d;-><init>(LT3/q$e;Le4/e;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LT3/q$e;->a:Le4/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Le4/c;->p(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f(Le4/g;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Le4/g;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LT3/q$e;->b:LT3/q;

    .line 6
    .line 7
    invoke-static {v0}, LT3/q;->c(LT3/q;)Lc4/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lc4/c;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LT3/q$e;->b:LT3/q;

    .line 18
    .line 19
    invoke-static {v0}, LT3/q;->c(LT3/q;)Lc4/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v2, "ws message: "

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v2, 0x0

    .line 41
    new-array v2, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Lc4/c;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, LT3/q$e;->b:LT3/q;

    .line 47
    .line 48
    invoke-static {v0}, LT3/q;->e(LT3/q;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, LT3/q$e$b;

    .line 53
    .line 54
    invoke-direct {v1, p0, p1}, LT3/q$e$b;-><init>(LT3/q$e;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, LT3/q$e;->a:Le4/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Le4/c;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, LT3/q$e;->a:Le4/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Le4/c;->b()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception v0

    .line 13
    iget-object v1, p0, LT3/q$e;->b:LT3/q;

    .line 14
    .line 15
    invoke-static {v1}, LT3/q;->c(LT3/q;)Lc4/c;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "Interrupted while shutting down websocket threads"

    .line 20
    .line 21
    invoke-virtual {v1, v2, v0}, Lc4/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    return-void
.end method
