.class public LP4/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP4/x$a;
    }
.end annotation


# static fields
.field public static final j:LE2/e;

.field public static final k:Ljava/util/Random;

.field public static final l:Ljava/util/Map;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Ls3/e;

.field public final e:Ls4/i;

.field public final f:Lt3/c;

.field public final g:Lr4/b;

.field public final h:Ljava/lang/String;

.field public i:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, LE2/h;->d()LE2/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, LP4/x;->j:LE2/e;

    .line 6
    .line 7
    new-instance v0, Ljava/util/Random;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, LP4/x;->k:Ljava/util/Random;

    .line 13
    .line 14
    new-instance v0, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v0, LP4/x;->l:Ljava/util/Map;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ls3/e;Ls4/i;Lt3/c;Lr4/b;)V
    .locals 8

    .line 1
    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, LP4/x;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ls3/e;Ls4/i;Lt3/c;Lr4/b;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ls3/e;Ls4/i;Lt3/c;Lr4/b;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LP4/x;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LP4/x;->i:Ljava/util/Map;

    iput-object p1, p0, LP4/x;->b:Landroid/content/Context;

    iput-object p2, p0, LP4/x;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, LP4/x;->d:Ls3/e;

    iput-object p4, p0, LP4/x;->e:Ls4/i;

    iput-object p5, p0, LP4/x;->f:Lt3/c;

    iput-object p6, p0, LP4/x;->g:Lr4/b;

    invoke-virtual {p3}, Ls3/e;->r()Ls3/m;

    move-result-object p3

    invoke-virtual {p3}, Ls3/m;->c()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, LP4/x;->h:Ljava/lang/String;

    invoke-static {p1}, LP4/x$a;->b(Landroid/content/Context;)V

    if-eqz p7, :cond_0

    new-instance p1, LP4/v;

    invoke-direct {p1, p0}, LP4/v;-><init>(LP4/x;)V

    invoke-static {p2, p1}, LV2/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)LV2/j;

    :cond_0
    return-void
.end method

.method public static synthetic a()Lw3/a;
    .locals 1

    .line 1
    invoke-static {}, LP4/x;->o()Lw3/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic b(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, LP4/x;->p(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/internal/d;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "frc"

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aput-object p1, v0, v1

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    aput-object p2, v0, p1

    .line 14
    .line 15
    const-string p1, "settings"

    .line 16
    .line 17
    const/4 p2, 0x3

    .line 18
    aput-object p1, v0, p2

    .line 19
    .line 20
    const-string p1, "%s_%s_%s_%s"

    .line 21
    .line 22
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance p1, Lcom/google/firebase/remoteconfig/internal/d;

    .line 31
    .line 32
    invoke-direct {p1, p0}, Lcom/google/firebase/remoteconfig/internal/d;-><init>(Landroid/content/SharedPreferences;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public static k(Ls3/e;Ljava/lang/String;Lr4/b;)LQ4/r;
    .locals 0

    .line 1
    invoke-static {p0}, LP4/x;->n(Ls3/e;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const-string p0, "firebase"

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    new-instance p0, LQ4/r;

    .line 16
    .line 17
    invoke-direct {p0, p2}, LQ4/r;-><init>(Lr4/b;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static m(Ls3/e;Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "firebase"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, LP4/x;->n(Ls3/e;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    :goto_0
    return p0
.end method

.method public static n(Ls3/e;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls3/e;->q()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "[DEFAULT]"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static synthetic o()Lw3/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public static declared-synchronized p(Z)V
    .locals 3

    .line 1
    const-class v0, LP4/x;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LP4/x;->l:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, LP4/m;

    .line 25
    .line 26
    invoke-virtual {v2, p0}, LP4/m;->y(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :goto_1
    monitor-exit v0

    .line 35
    throw p0
.end method


# virtual methods
.method public declared-synchronized c(Ljava/lang/String;)LP4/m;
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "fetch"

    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, LP4/x;->e(Ljava/lang/String;Ljava/lang/String;)LQ4/e;

    .line 5
    .line 6
    .line 7
    move-result-object v7

    .line 8
    const-string v0, "activate"

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, LP4/x;->e(Ljava/lang/String;Ljava/lang/String;)LQ4/e;

    .line 11
    .line 12
    .line 13
    move-result-object v8

    .line 14
    const-string v0, "defaults"

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, LP4/x;->e(Ljava/lang/String;Ljava/lang/String;)LQ4/e;

    .line 17
    .line 18
    .line 19
    move-result-object v9

    .line 20
    iget-object v0, p0, LP4/x;->b:Landroid/content/Context;

    .line 21
    .line 22
    iget-object v1, p0, LP4/x;->h:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, p1}, LP4/x;->j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/internal/d;

    .line 25
    .line 26
    .line 27
    move-result-object v12

    .line 28
    invoke-virtual {p0, v8, v9}, LP4/x;->i(LQ4/e;LQ4/e;)LQ4/l;

    .line 29
    .line 30
    .line 31
    move-result-object v11

    .line 32
    iget-object v0, p0, LP4/x;->d:Ls3/e;

    .line 33
    .line 34
    iget-object v1, p0, LP4/x;->g:Lr4/b;

    .line 35
    .line 36
    invoke-static {v0, p1, v1}, LP4/x;->k(Ls3/e;Ljava/lang/String;Lr4/b;)LQ4/r;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    new-instance v1, LP4/u;

    .line 43
    .line 44
    invoke-direct {v1, v0}, LP4/u;-><init>(LQ4/r;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v11, v1}, LQ4/l;->b(LE2/d;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    :goto_0
    iget-object v2, p0, LP4/x;->d:Ls3/e;

    .line 54
    .line 55
    iget-object v4, p0, LP4/x;->e:Ls4/i;

    .line 56
    .line 57
    iget-object v5, p0, LP4/x;->f:Lt3/c;

    .line 58
    .line 59
    iget-object v6, p0, LP4/x;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 60
    .line 61
    invoke-virtual {p0, p1, v7, v12}, LP4/x;->g(Ljava/lang/String;LQ4/e;Lcom/google/firebase/remoteconfig/internal/d;)Lcom/google/firebase/remoteconfig/internal/c;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    move-object v1, p0

    .line 66
    move-object v3, p1

    .line 67
    invoke-virtual/range {v1 .. v12}, LP4/x;->d(Ls3/e;Ljava/lang/String;Ls4/i;Lt3/c;Ljava/util/concurrent/Executor;LQ4/e;LQ4/e;LQ4/e;Lcom/google/firebase/remoteconfig/internal/c;LQ4/l;Lcom/google/firebase/remoteconfig/internal/d;)LP4/m;

    .line 68
    .line 69
    .line 70
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    monitor-exit p0

    .line 72
    return-object p1

    .line 73
    :goto_1
    monitor-exit p0

    .line 74
    throw p1
.end method

.method public declared-synchronized d(Ls3/e;Ljava/lang/String;Ls4/i;Lt3/c;Ljava/util/concurrent/Executor;LQ4/e;LQ4/e;LQ4/e;Lcom/google/firebase/remoteconfig/internal/c;LQ4/l;Lcom/google/firebase/remoteconfig/internal/d;)LP4/m;
    .locals 23

    .line 1
    move-object/from16 v9, p0

    move-object/from16 v0, p2

    monitor-enter p0

    :try_start_0
    iget-object v1, v9, LP4/x;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v15, LP4/m;

    iget-object v11, v9, LP4/x;->b:Landroid/content/Context;

    invoke-static/range {p1 .. p2}, LP4/x;->m(Ls3/e;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object/from16 v14, p4

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    move-object v14, v1

    :goto_0
    iget-object v6, v9, LP4/x;->b:Landroid/content/Context;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object/from16 v5, p7

    move-object/from16 v7, p2

    move-object/from16 v8, p11

    invoke-virtual/range {v1 .. v8}, LP4/x;->l(Ls3/e;Ls4/i;Lcom/google/firebase/remoteconfig/internal/c;LQ4/e;Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/d;)LQ4/m;

    move-result-object v22

    move-object v10, v15

    move-object/from16 v12, p1

    move-object/from16 v13, p3

    move-object v1, v15

    move-object/from16 v15, p5

    move-object/from16 v16, p6

    move-object/from16 v17, p7

    move-object/from16 v18, p8

    move-object/from16 v19, p9

    move-object/from16 v20, p10

    move-object/from16 v21, p11

    invoke-direct/range {v10 .. v22}, LP4/m;-><init>(Landroid/content/Context;Ls3/e;Ls4/i;Lt3/c;Ljava/util/concurrent/Executor;LQ4/e;LQ4/e;LQ4/e;Lcom/google/firebase/remoteconfig/internal/c;LQ4/l;Lcom/google/firebase/remoteconfig/internal/d;LQ4/m;)V

    invoke-virtual {v1}, LP4/m;->B()V

    iget-object v2, v9, LP4/x;->a:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, LP4/x;->l:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v1, v9, LP4/x;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP4/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_2
    monitor-exit p0

    throw v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)LQ4/e;
    .locals 4

    .line 1
    iget-object v0, p0, LP4/x;->h:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "frc"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v0, v1, v2

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    aput-object p1, v1, v0

    .line 16
    .line 17
    const/4 p1, 0x3

    .line 18
    aput-object p2, v1, p1

    .line 19
    .line 20
    const-string p1, "%s_%s_%s_%s.json"

    .line 21
    .line 22
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p2, p0, LP4/x;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    iget-object v0, p0, LP4/x;->b:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v0, p1}, LQ4/p;->c(Landroid/content/Context;Ljava/lang/String;)LQ4/p;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p2, p1}, LQ4/e;->h(Ljava/util/concurrent/Executor;LQ4/p;)LQ4/e;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public f()LP4/m;
    .locals 1

    .line 1
    const-string v0, "firebase"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LP4/x;->c(Ljava/lang/String;)LP4/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public declared-synchronized g(Ljava/lang/String;LQ4/e;Lcom/google/firebase/remoteconfig/internal/d;)Lcom/google/firebase/remoteconfig/internal/c;
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v10, Lcom/google/firebase/remoteconfig/internal/c;

    .line 3
    .line 4
    iget-object v1, p0, LP4/x;->e:Ls4/i;

    .line 5
    .line 6
    iget-object v0, p0, LP4/x;->d:Ls3/e;

    .line 7
    .line 8
    invoke-static {v0}, LP4/x;->n(Ls3/e;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LP4/x;->g:Lr4/b;

    .line 15
    .line 16
    :goto_0
    move-object v2, v0

    .line 17
    goto :goto_1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    new-instance v0, LP4/w;

    .line 21
    .line 22
    invoke-direct {v0}, LP4/w;-><init>()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :goto_1
    iget-object v3, p0, LP4/x;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    sget-object v4, LP4/x;->j:LE2/e;

    .line 29
    .line 30
    sget-object v5, LP4/x;->k:Ljava/util/Random;

    .line 31
    .line 32
    iget-object v0, p0, LP4/x;->d:Ls3/e;

    .line 33
    .line 34
    invoke-virtual {v0}, Ls3/e;->r()Ls3/m;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ls3/m;->b()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p0, v0, p1, p3}, LP4/x;->h(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/d;)Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    iget-object v9, p0, LP4/x;->i:Ljava/util/Map;

    .line 47
    .line 48
    move-object v0, v10

    .line 49
    move-object v6, p2

    .line 50
    move-object v8, p3

    .line 51
    invoke-direct/range {v0 .. v9}, Lcom/google/firebase/remoteconfig/internal/c;-><init>(Ls4/i;Lr4/b;Ljava/util/concurrent/Executor;LE2/e;Ljava/util/Random;LQ4/e;Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;Lcom/google/firebase/remoteconfig/internal/d;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-object v10

    .line 56
    :goto_2
    monitor-exit p0

    .line 57
    throw p1
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/d;)Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;
    .locals 10

    .line 1
    iget-object v0, p0, LP4/x;->d:Ls3/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls3/e;->r()Ls3/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ls3/m;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v0, Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;

    .line 12
    .line 13
    iget-object v2, p0, LP4/x;->b:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {p3}, Lcom/google/firebase/remoteconfig/internal/d;->b()J

    .line 16
    .line 17
    .line 18
    move-result-wide v6

    .line 19
    invoke-virtual {p3}, Lcom/google/firebase/remoteconfig/internal/d;->b()J

    .line 20
    .line 21
    .line 22
    move-result-wide v8

    .line 23
    move-object v1, v0

    .line 24
    move-object v4, p1

    .line 25
    move-object v5, p2

    .line 26
    invoke-direct/range {v1 .. v9}, Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final i(LQ4/e;LQ4/e;)LQ4/l;
    .locals 2

    .line 1
    new-instance v0, LQ4/l;

    .line 2
    .line 3
    iget-object v1, p0, LP4/x;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2}, LQ4/l;-><init>(Ljava/util/concurrent/Executor;LQ4/e;LQ4/e;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public declared-synchronized l(Ls3/e;Ls4/i;Lcom/google/firebase/remoteconfig/internal/c;LQ4/e;Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/d;)LQ4/m;
    .locals 11

    .line 1
    move-object v1, p0

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    new-instance v0, LQ4/m;

    .line 4
    .line 5
    iget-object v10, v1, LP4/x;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    .line 7
    move-object v2, v0

    .line 8
    move-object v3, p1

    .line 9
    move-object v4, p2

    .line 10
    move-object v5, p3

    .line 11
    move-object v6, p4

    .line 12
    move-object/from16 v7, p5

    .line 13
    .line 14
    move-object/from16 v8, p6

    .line 15
    .line 16
    move-object/from16 v9, p7

    .line 17
    .line 18
    invoke-direct/range {v2 .. v10}, LQ4/m;-><init>(Ls3/e;Ls4/i;Lcom/google/firebase/remoteconfig/internal/c;LQ4/e;Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/d;Ljava/util/concurrent/ScheduledExecutorService;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-object v0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    monitor-exit p0

    .line 25
    throw v0
.end method
