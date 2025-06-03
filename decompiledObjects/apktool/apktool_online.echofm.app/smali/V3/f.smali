.class public abstract LV3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lc4/d;

.field public b:LV3/j;

.field public c:LV3/A;

.field public d:LV3/A;

.field public e:LV3/r;

.field public f:Ljava/lang/String;

.field public g:Ljava/util/List;

.field public h:Ljava/lang/String;

.field public i:Lc4/d$a;

.field public j:Z

.field public k:J

.field public l:Ls3/e;

.field public m:LX3/e;

.field public n:Z

.field public o:Z

.field public p:LV3/l;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lc4/d$a;->p:Lc4/d$a;

    .line 5
    .line 6
    iput-object v0, p0, LV3/f;->i:Lc4/d$a;

    .line 7
    .line 8
    const-wide/32 v0, 0xa00000

    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, LV3/f;->k:J

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, LV3/f;->n:Z

    .line 15
    .line 16
    iput-boolean v0, p0, LV3/f;->o:Z

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic D(LV3/A;Ljava/util/concurrent/ScheduledExecutorService;ZLT3/d$a;)V
    .locals 1

    .line 1
    new-instance v0, LV3/f$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p3}, LV3/f$a;-><init>(Ljava/util/concurrent/ScheduledExecutorService;LT3/d$a;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p2, v0}, LV3/A;->a(ZLV3/A$a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static H(LV3/A;Ljava/util/concurrent/ScheduledExecutorService;)LT3/d;
    .locals 1

    .line 1
    new-instance v0, LV3/d;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LV3/d;-><init>(LV3/A;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic a(LV3/A;Ljava/util/concurrent/ScheduledExecutorService;ZLT3/d$a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LV3/f;->D(LV3/A;Ljava/util/concurrent/ScheduledExecutorService;ZLT3/d$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final declared-synchronized A()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, LR3/i;

    .line 3
    .line 4
    iget-object v1, p0, LV3/f;->l:Ls3/e;

    .line 5
    .line 6
    invoke-direct {v0, v1}, LR3/i;-><init>(Ls3/e;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LV3/f;->p:LV3/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    monitor-exit p0

    .line 15
    throw v0
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LV3/f;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public C()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LV3/f;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public E(LT3/f;LT3/h$a;)LT3/h;
    .locals 2

    .line 1
    invoke-virtual {p0}, LV3/f;->u()LV3/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LV3/f;->n()LT3/c;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, p0, v1, p1, p2}, LV3/l;->d(LV3/f;LT3/c;LT3/f;LT3/h$a;)LT3/h;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public F()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LV3/f;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LV3/f;->G()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, LV3/f;->o:Z

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final G()V
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->b:LV3/j;

    .line 2
    .line 3
    invoke-interface {v0}, LV3/j;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LV3/f;->e:LV3/r;

    .line 7
    .line 8
    invoke-interface {v0}, LV3/r;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV3/f;->B()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, LQ3/d;

    .line 9
    .line 10
    const-string v1, "Modifications to DatabaseConfig objects must occur before they are in use"

    .line 11
    .line 12
    invoke-direct {v0, v1}, LQ3/d;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Firebase/"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "5"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "/"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-static {}, LQ3/h;->g()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, LV3/f;->d:LV3/A;

    .line 2
    .line 3
    const-string v1, "You must register an appCheckTokenProvider before initializing Context."

    .line 4
    .line 5
    invoke-static {v0, v1}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, LV3/f;->c:LV3/A;

    .line 2
    .line 3
    const-string v1, "You must register an authTokenProvider before initializing Context."

    .line 4
    .line 5
    invoke-static {v0, v1}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->b:LV3/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LV3/f;->u()LV3/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p0}, LV3/l;->g(LV3/f;)LV3/j;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LV3/f;->b:LV3/j;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, LV3/f;->a:Lc4/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LV3/f;->u()LV3/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LV3/f;->i:Lc4/d$a;

    .line 10
    .line 11
    iget-object v2, p0, LV3/f;->g:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p0, v1, v2}, LV3/l;->b(LV3/f;Lc4/d$a;Ljava/util/List;)Lc4/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, LV3/f;->a:Lc4/d;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->e:LV3/r;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LV3/f;->p:LV3/l;

    .line 6
    .line 7
    invoke-interface {v0, p0}, LV3/l;->a(LV3/f;)LV3/r;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, LV3/f;->e:LV3/r;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final i()V
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->f:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "default"

    .line 6
    .line 7
    iput-object v0, p0, LV3/f;->f:Ljava/lang/String;

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->h:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LV3/f;->u()LV3/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p0}, LV3/l;->e(LV3/f;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, LV3/f;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, LV3/f;->h:Ljava/lang/String;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public declared-synchronized k()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LV3/f;->n:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LV3/f;->n:Z

    .line 8
    .line 9
    invoke-virtual {p0}, LV3/f;->z()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :goto_1
    monitor-exit p0

    .line 18
    throw v0
.end method

.method public l()LV3/A;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->d:LV3/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()LV3/A;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->c:LV3/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()LT3/c;
    .locals 11

    .line 1
    new-instance v10, LT3/c;

    .line 2
    .line 3
    invoke-virtual {p0}, LV3/f;->r()Lc4/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, LV3/f;->m()LV3/A;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, LV3/f;->p()Ljava/util/concurrent/ScheduledExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v0, v2}, LV3/f;->H(LV3/A;Ljava/util/concurrent/ScheduledExecutorService;)LT3/d;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p0}, LV3/f;->l()LV3/A;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, LV3/f;->p()Ljava/util/concurrent/ScheduledExecutorService;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v0, v3}, LV3/f;->H(LV3/A;Ljava/util/concurrent/ScheduledExecutorService;)LT3/d;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p0}, LV3/f;->p()Ljava/util/concurrent/ScheduledExecutorService;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {p0}, LV3/f;->C()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-static {}, LQ3/h;->g()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {p0}, LV3/f;->y()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    iget-object v0, p0, LV3/f;->l:Ls3/e;

    .line 48
    .line 49
    invoke-virtual {v0}, Ls3/e;->r()Ls3/m;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ls3/m;->c()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-virtual {p0}, LV3/f;->w()Ljava/io/File;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    move-object v0, v10

    .line 66
    invoke-direct/range {v0 .. v9}, LT3/c;-><init>(Lc4/d;LT3/d;LT3/d;Ljava/util/concurrent/ScheduledExecutorService;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v10
.end method

.method public o()LV3/j;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->b:LV3/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    .line 1
    invoke-virtual {p0}, LV3/f;->v()LV3/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, LY3/c;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, LY3/c;

    .line 10
    .line 11
    invoke-virtual {v0}, LY3/c;->d()Ljava/util/concurrent/ScheduledExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 17
    .line 18
    const-string v1, "Custom run loops are not supported!"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public q(Ljava/lang/String;)Lc4/c;
    .locals 2

    .line 1
    new-instance v0, Lc4/c;

    .line 2
    .line 3
    iget-object v1, p0, LV3/f;->a:Lc4/d;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lc4/c;-><init>(Lc4/d;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public r()Lc4/d;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->a:Lc4/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()J
    .locals 2

    .line 1
    iget-wide v0, p0, LV3/f;->k:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public t(Ljava/lang/String;)LX3/e;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->m:LX3/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-boolean v0, p0, LV3/f;->j:Z

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, LV3/f;->p:LV3/l;

    .line 11
    .line 12
    invoke-interface {v0, p0, p1}, LV3/l;->f(LV3/f;Ljava/lang/String;)LX3/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string v0, "You have enabled persistence, but persistence is not supported on this platform."

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_2
    new-instance p1, LX3/d;

    .line 28
    .line 29
    invoke-direct {p1}, LX3/d;-><init>()V

    .line 30
    .line 31
    .line 32
    return-object p1
.end method

.method public final u()LV3/l;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->p:LV3/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LV3/f;->A()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LV3/f;->p:LV3/l;

    .line 9
    .line 10
    return-object v0
.end method

.method public v()LV3/r;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->e:LV3/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public w()Ljava/io/File;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV3/f;->u()LV3/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LV3/l;->c()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public x()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public y()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/f;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()V
    .locals 0

    .line 1
    invoke-virtual {p0}, LV3/f;->g()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LV3/f;->u()LV3/l;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LV3/f;->j()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LV3/f;->f()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, LV3/f;->h()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LV3/f;->i()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, LV3/f;->e()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, LV3/f;->d()V

    .line 23
    .line 24
    .line 25
    return-void
.end method
