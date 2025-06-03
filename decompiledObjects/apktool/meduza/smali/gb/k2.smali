.class public final Lgb/k2;
.super Leb/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/k2$a;
    }
.end annotation


# instance fields
.field public final a:Lgb/u;

.field public final b:Leb/t0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/t0<",
            "**>;"
        }
    .end annotation
.end field

.field public final c:Leb/s0;

.field public final d:Leb/c;

.field public final e:Leb/p;

.field public final f:Lgb/k2$a;

.field public final g:[Leb/h;

.field public final h:Ljava/lang/Object;

.field public i:Lgb/s;

.field public j:Z

.field public k:Lgb/g0;


# direct methods
.method public constructor <init>(Lgb/x;Leb/t0;Leb/s0;Leb/c;Lgb/l$a$a;[Leb/h;)V
    .locals 1

    invoke-direct {p0}, Leb/b$a;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lgb/k2;->h:Ljava/lang/Object;

    iput-object p1, p0, Lgb/k2;->a:Lgb/u;

    iput-object p2, p0, Lgb/k2;->b:Leb/t0;

    iput-object p3, p0, Lgb/k2;->c:Leb/s0;

    iput-object p4, p0, Lgb/k2;->d:Leb/c;

    invoke-static {}, Leb/p;->b()Leb/p;

    move-result-object p1

    iput-object p1, p0, Lgb/k2;->e:Leb/p;

    iput-object p5, p0, Lgb/k2;->f:Lgb/k2$a;

    iput-object p6, p0, Lgb/k2;->g:[Leb/h;

    return-void
.end method


# virtual methods
.method public final a(Leb/s0;)V
    .locals 5

    iget-boolean v0, p0, Lgb/k2;->j:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "apply() or fail() already called"

    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    iget-object v0, p0, Lgb/k2;->c:Leb/s0;

    invoke-virtual {v0, p1}, Leb/s0;->d(Leb/s0;)V

    iget-object p1, p0, Lgb/k2;->e:Leb/p;

    invoke-virtual {p1}, Leb/p;->a()Leb/p;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lgb/k2;->a:Lgb/u;

    iget-object v1, p0, Lgb/k2;->b:Leb/t0;

    iget-object v2, p0, Lgb/k2;->c:Leb/s0;

    iget-object v3, p0, Lgb/k2;->d:Leb/c;

    iget-object v4, p0, Lgb/k2;->g:[Leb/h;

    invoke-interface {v0, v1, v2, v3, v4}, Lgb/u;->d(Leb/t0;Leb/s0;Leb/c;[Leb/h;)Lgb/s;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lgb/k2;->e:Leb/p;

    invoke-virtual {v1, p1}, Leb/p;->c(Leb/p;)V

    invoke-virtual {p0, v0}, Lgb/k2;->c(Lgb/s;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lgb/k2;->e:Leb/p;

    invoke-virtual {v1, p1}, Leb/p;->c(Leb/p;)V

    throw v0
.end method

.method public final b(Leb/e1;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Leb/e1;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const-string v1, "Cannot fail with OK status"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lx6/b;->s(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, p0, Lgb/k2;->j:Z

    .line 13
    .line 14
    xor-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    const-string v1, "apply() or fail() already called"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lgb/l0;

    .line 22
    .line 23
    invoke-static {p1}, Lgb/v0;->g(Leb/e1;)Leb/e1;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v1, p0, Lgb/k2;->g:[Leb/h;

    .line 28
    .line 29
    sget-object v2, Lgb/t$a;->a:Lgb/t$a;

    .line 30
    .line 31
    invoke-direct {v0, p1, v2, v1}, Lgb/l0;-><init>(Leb/e1;Lgb/t$a;[Leb/h;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lgb/k2;->c(Lgb/s;)V

    .line 35
    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final c(Lgb/s;)V
    .locals 4

    iget-boolean v0, p0, Lgb/k2;->j:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "already finalized"

    invoke-static {v0, v2}, Lx6/b;->I(ZLjava/lang/String;)V

    iput-boolean v1, p0, Lgb/k2;->j:Z

    iget-object v0, p0, Lgb/k2;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Lgb/k2;->i:Lgb/s;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iput-object p1, p0, Lgb/k2;->i:Lgb/s;

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lgb/k2;->k:Lgb/g0;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    const-string v0, "delayedStream is null"

    invoke-static {v1, v0}, Lx6/b;->I(ZLjava/lang/String;)V

    iget-object v0, p0, Lgb/k2;->k:Lgb/g0;

    invoke-virtual {v0, p1}, Lgb/g0;->t(Lgb/s;)Lgb/h0;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lgb/h0;->run()V

    :cond_3
    :goto_2
    iget-object p1, p0, Lgb/k2;->f:Lgb/k2$a;

    check-cast p1, Lgb/l$a$a;

    invoke-virtual {p1}, Lgb/l$a$a;->a()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
