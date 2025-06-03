.class public final Lgb/f0$e;
.super Lgb/g0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final j:Leb/k0$g;

.field public final k:Leb/p;

.field public final l:[Leb/h;

.field public final synthetic m:Lgb/f0;


# direct methods
.method public constructor <init>(Lgb/f0;Lgb/s2;[Leb/h;)V
    .locals 0

    iput-object p1, p0, Lgb/f0$e;->m:Lgb/f0;

    invoke-direct {p0}, Lgb/g0;-><init>()V

    invoke-static {}, Leb/p;->b()Leb/p;

    move-result-object p1

    iput-object p1, p0, Lgb/f0$e;->k:Leb/p;

    iput-object p2, p0, Lgb/f0$e;->j:Leb/k0$g;

    iput-object p3, p0, Lgb/f0$e;->l:[Leb/h;

    return-void
.end method


# virtual methods
.method public final i(Ld2/q;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/f0$e;->j:Leb/k0$g;

    .line 2
    .line 3
    check-cast v0, Lgb/s2;

    .line 4
    .line 5
    iget-object v0, v0, Lgb/s2;->a:Leb/c;

    .line 6
    .line 7
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    iget-object v0, v0, Leb/c;->h:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const-string v0, "wait_for_ready"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ld2/q;->e(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-super {p0, p1}, Lgb/g0;->i(Ld2/q;)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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

.method public final n(Leb/e1;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lgb/g0;->n(Leb/e1;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lgb/f0$e;->m:Lgb/f0;

    .line 5
    .line 6
    iget-object p1, p1, Lgb/f0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter p1

    .line 9
    :try_start_0
    iget-object v0, p0, Lgb/f0$e;->m:Lgb/f0;

    .line 10
    .line 11
    iget-object v1, v0, Lgb/f0;->g:Ljava/lang/Runnable;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lgb/f0;->i:Ljava/util/Collection;

    .line 16
    .line 17
    invoke-interface {v0, p0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Lgb/f0$e;->m:Lgb/f0;

    .line 22
    .line 23
    invoke-virtual {v1}, Lgb/f0;->b()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lgb/f0$e;->m:Lgb/f0;

    .line 32
    .line 33
    iget-object v1, v0, Lgb/f0;->d:Leb/h1;

    .line 34
    .line 35
    iget-object v0, v0, Lgb/f0;->f:Lgb/f0$b;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Leb/h1;->b(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lgb/f0$e;->m:Lgb/f0;

    .line 41
    .line 42
    iget-object v1, v0, Lgb/f0;->j:Leb/e1;

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    iget-object v1, v0, Lgb/f0;->d:Leb/h1;

    .line 47
    .line 48
    iget-object v0, v0, Lgb/f0;->g:Ljava/lang/Runnable;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Leb/h1;->b(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lgb/f0$e;->m:Lgb/f0;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    iput-object v1, v0, Lgb/f0;->g:Ljava/lang/Runnable;

    .line 57
    .line 58
    :cond_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    iget-object p1, p0, Lgb/f0$e;->m:Lgb/f0;

    .line 60
    .line 61
    iget-object p1, p1, Lgb/f0;->d:Leb/h1;

    .line 62
    .line 63
    invoke-virtual {p1}, Leb/h1;->a()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    throw v0
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final s(Leb/e1;)V
    .locals 4

    iget-object v0, p0, Lgb/f0$e;->l:[Leb/h;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Lm/e;->o(Leb/e1;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
