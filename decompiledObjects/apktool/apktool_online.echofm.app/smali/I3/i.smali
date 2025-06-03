.class public LI3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI3/i$a;
    }
.end annotation


# instance fields
.field public final a:LI3/d;

.field public final b:LH3/n;

.field public c:Ljava/lang/String;

.field public final d:LI3/i$a;

.field public final e:LI3/i$a;

.field public final f:Ljava/util/concurrent/atomic/AtomicMarkableReference;


# direct methods
.method public constructor <init>(Ljava/lang/String;LM3/g;LH3/n;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LI3/i$a;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, LI3/i$a;-><init>(LI3/i;Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LI3/i;->d:LI3/i$a;

    .line 11
    .line 12
    new-instance v0, LI3/i$a;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v0, p0, v2}, LI3/i$a;-><init>(LI3/i;Z)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LI3/i;->e:LI3/i$a;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;-><init>(Ljava/lang/Object;Z)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LI3/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 27
    .line 28
    iput-object p1, p0, LI3/i;->c:Ljava/lang/String;

    .line 29
    .line 30
    new-instance p1, LI3/d;

    .line 31
    .line 32
    invoke-direct {p1, p2}, LI3/d;-><init>(LM3/g;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, LI3/i;->a:LI3/d;

    .line 36
    .line 37
    iput-object p3, p0, LI3/i;->b:LH3/n;

    .line 38
    .line 39
    return-void
.end method

.method public static synthetic a(LI3/i;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, LI3/i;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(LI3/i;)LH3/n;
    .locals 0

    .line 1
    iget-object p0, p0, LI3/i;->b:LH3/n;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(LI3/i;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, LI3/i;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(LI3/i;)LI3/d;
    .locals 0

    .line 1
    iget-object p0, p0, LI3/i;->a:LI3/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static i(Ljava/lang/String;LM3/g;LH3/n;)LI3/i;
    .locals 3

    .line 1
    new-instance v0, LI3/d;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LI3/d;-><init>(LM3/g;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LI3/i;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1, p2}, LI3/i;-><init>(Ljava/lang/String;LM3/g;LH3/n;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v1, LI3/i;->d:LI3/i$a;

    .line 12
    .line 13
    iget-object p1, p1, LI3/i$a;->a:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, LI3/b;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-virtual {v0, p0, p2}, LI3/d;->g(Ljava/lang/String;Z)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {p1, v2}, LI3/b;->e(Ljava/util/Map;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, v1, LI3/i;->e:LI3/i$a;

    .line 30
    .line 31
    iget-object p1, p1, LI3/i$a;->a:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, LI3/b;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-virtual {v0, p0, v2}, LI3/d;->g(Ljava/lang/String;Z)Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p1, v2}, LI3/b;->e(Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, v1, LI3/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, LI3/d;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p1, p0, p2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 54
    .line 55
    .line 56
    return-object v1
.end method

.method public static j(Ljava/lang/String;LM3/g;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, LI3/d;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LI3/d;-><init>(LM3/g;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, LI3/d;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public e()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LI3/i;->d:LI3/i$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LI3/i$a;->b()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LI3/i;->e:LI3/i$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LI3/i$a;->b()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LI3/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0
.end method

.method public final synthetic h()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI3/i;->k()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    return-object v0
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, LI3/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LI3/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->isMarked()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, LI3/i;->g()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v3, p0, LI3/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 18
    .line 19
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, LI3/i;->a:LI3/d;

    .line 31
    .line 32
    iget-object v2, p0, LI3/i;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, LI3/d;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw v1
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LI3/i;->d:LI3/i$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LI3/i$a;->f(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LI3/i;->e:LI3/i$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LI3/i$a;->f(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public n(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, LI3/i;->c:Ljava/lang/String;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, LI3/i;->c:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v1, p0, LI3/i;->d:LI3/i$a;

    .line 7
    .line 8
    invoke-virtual {v1}, LI3/i$a;->b()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0}, LI3/i;->g()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, LI3/i;->a:LI3/d;

    .line 19
    .line 20
    invoke-virtual {p0}, LI3/i;->g()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v2, p1, v3}, LI3/d;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    iget-object v2, p0, LI3/i;->a:LI3/d;

    .line 37
    .line 38
    invoke-virtual {v2, p1, v1}, LI3/d;->l(Ljava/lang/String;Ljava/util/Map;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p1
.end method

.method public o(Ljava/lang/String;)V
    .locals 3

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {p1, v0}, LI3/b;->c(Ljava/lang/String;I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LI3/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, p0, LI3/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p1, v1}, LH3/i;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v1, p0, LI3/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-virtual {v1, p1, v2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 32
    .line 33
    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    iget-object p1, p0, LI3/i;->b:LH3/n;

    .line 36
    .line 37
    new-instance v0, LI3/g;

    .line 38
    .line 39
    invoke-direct {v0, p0}, LI3/g;-><init>(LI3/i;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, LH3/n;->h(Ljava/util/concurrent/Callable;)LV2/j;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw p1
.end method
