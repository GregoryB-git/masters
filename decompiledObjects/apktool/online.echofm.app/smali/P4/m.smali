.class public LP4/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final m:[B


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ls3/e;

.field public final c:Lt3/c;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:LQ4/e;

.field public final f:LQ4/e;

.field public final g:LQ4/e;

.field public final h:Lcom/google/firebase/remoteconfig/internal/c;

.field public final i:LQ4/l;

.field public final j:Lcom/google/firebase/remoteconfig/internal/d;

.field public final k:Ls4/i;

.field public final l:LQ4/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, LP4/m;->m:[B

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ls3/e;Ls4/i;Lt3/c;Ljava/util/concurrent/Executor;LQ4/e;LQ4/e;LQ4/e;Lcom/google/firebase/remoteconfig/internal/c;LQ4/l;Lcom/google/firebase/remoteconfig/internal/d;LQ4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP4/m;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, LP4/m;->b:Ls3/e;

    .line 7
    .line 8
    iput-object p3, p0, LP4/m;->k:Ls4/i;

    .line 9
    .line 10
    iput-object p4, p0, LP4/m;->c:Lt3/c;

    .line 11
    .line 12
    iput-object p5, p0, LP4/m;->d:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    iput-object p6, p0, LP4/m;->e:LQ4/e;

    .line 15
    .line 16
    iput-object p7, p0, LP4/m;->f:LQ4/e;

    .line 17
    .line 18
    iput-object p8, p0, LP4/m;->g:LQ4/e;

    .line 19
    .line 20
    iput-object p9, p0, LP4/m;->h:Lcom/google/firebase/remoteconfig/internal/c;

    .line 21
    .line 22
    iput-object p10, p0, LP4/m;->i:LQ4/l;

    .line 23
    .line 24
    iput-object p11, p0, LP4/m;->j:Lcom/google/firebase/remoteconfig/internal/d;

    .line 25
    .line 26
    iput-object p12, p0, LP4/m;->l:LQ4/m;

    .line 27
    .line 28
    return-void
.end method

.method public static C(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    new-instance v2, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return-object v0
.end method

.method public static synthetic a(LP4/m;LP4/s;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP4/m;->u(LP4/s;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(LP4/m;LV2/j;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP4/m;->w(LV2/j;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(Lcom/google/firebase/remoteconfig/internal/b;)LV2/j;
    .locals 0

    .line 1
    invoke-static {p0}, LP4/m;->v(Lcom/google/firebase/remoteconfig/internal/b;)LV2/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(LV2/j;LV2/j;)LP4/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LP4/m;->r(LV2/j;LV2/j;)LP4/q;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lcom/google/firebase/remoteconfig/internal/c$a;)LV2/j;
    .locals 0

    .line 1
    invoke-static {p0}, LP4/m;->s(Lcom/google/firebase/remoteconfig/internal/c$a;)LV2/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(LP4/m;Ljava/lang/Void;)LV2/j;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP4/m;->t(Ljava/lang/Void;)LV2/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(LP4/m;LV2/j;LV2/j;LV2/j;)LV2/j;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, LP4/m;->q(LV2/j;LV2/j;LV2/j;)LV2/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static o(Ls3/e;)LP4/m;
    .locals 1

    .line 1
    const-class v0, LP4/x;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ls3/e;->k(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LP4/x;

    .line 8
    .line 9
    invoke-virtual {p0}, LP4/x;->f()LP4/m;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static p(Lcom/google/firebase/remoteconfig/internal/b;Lcom/google/firebase/remoteconfig/internal/b;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/b;->g()Ljava/util/Date;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1}, Lcom/google/firebase/remoteconfig/internal/b;->g()Ljava/util/Date;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    :goto_1
    return p0
.end method

.method public static synthetic r(LV2/j;LV2/j;)LP4/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, LV2/j;->j()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, LP4/q;

    .line 6
    .line 7
    return-object p0
.end method

.method public static synthetic s(Lcom/google/firebase/remoteconfig/internal/c$a;)LV2/j;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static synthetic v(Lcom/google/firebase/remoteconfig/internal/b;)LV2/j;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method


# virtual methods
.method public final A(Ljava/util/Map;)LV2/j;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/google/firebase/remoteconfig/internal/b;->j()Lcom/google/firebase/remoteconfig/internal/b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/google/firebase/remoteconfig/internal/b$b;->b(Ljava/util/Map;)Lcom/google/firebase/remoteconfig/internal/b$b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lcom/google/firebase/remoteconfig/internal/b$b;->a()Lcom/google/firebase/remoteconfig/internal/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    iget-object v0, p0, LP4/m;->g:LQ4/e;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, LQ4/e;->k(Lcom/google/firebase/remoteconfig/internal/b;)LV2/j;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {}, LC3/z;->a()Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, LP4/g;

    .line 24
    .line 25
    invoke-direct {v1}, LP4/g;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, LV2/j;->p(Ljava/util/concurrent/Executor;LV2/i;)LV2/j;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :catch_0
    move-exception p1

    .line 34
    const-string v0, "FirebaseRemoteConfig"

    .line 35
    .line 36
    const-string v1, "The provided defaults map could not be processed."

    .line 37
    .line 38
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    invoke-static {p1}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method

.method public B()V
    .locals 1

    .line 1
    iget-object v0, p0, LP4/m;->f:LQ4/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ4/e;->e()LV2/j;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP4/m;->g:LQ4/e;

    .line 7
    .line 8
    invoke-virtual {v0}, LQ4/e;->e()LV2/j;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LP4/m;->e:LQ4/e;

    .line 12
    .line 13
    invoke-virtual {v0}, LQ4/e;->e()LV2/j;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public D(Lorg/json/JSONArray;)V
    .locals 2

    .line 1
    const-string v0, "FirebaseRemoteConfig"

    .line 2
    .line 3
    iget-object v1, p0, LP4/m;->c:Lt3/c;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p1}, LP4/m;->C(Lorg/json/JSONArray;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v1, p0, LP4/m;->c:Lt3/c;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Lt3/c;->m(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lt3/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto :goto_2

    .line 18
    :catch_0
    move-exception p1

    .line 19
    goto :goto_0

    .line 20
    :catch_1
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :goto_0
    const-string v1, "Could not update ABT experiments."

    .line 23
    .line 24
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :goto_1
    const-string v1, "Could not parse ABT experiments from the JSON response."

    .line 29
    .line 30
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 31
    .line 32
    .line 33
    :goto_2
    return-void
.end method

.method public h()LV2/j;
    .locals 5

    .line 1
    iget-object v0, p0, LP4/m;->e:LQ4/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ4/e;->e()LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LP4/m;->f:LQ4/e;

    .line 8
    .line 9
    invoke-virtual {v1}, LQ4/e;->e()LV2/j;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x2

    .line 14
    new-array v2, v2, [LV2/j;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aput-object v0, v2, v3

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    aput-object v1, v2, v3

    .line 21
    .line 22
    invoke-static {v2}, LV2/m;->i([LV2/j;)LV2/j;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object v3, p0, LP4/m;->d:Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    new-instance v4, LP4/f;

    .line 29
    .line 30
    invoke-direct {v4, p0, v0, v1}, LP4/f;-><init>(LP4/m;LV2/j;LV2/j;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3, v4}, LV2/j;->h(Ljava/util/concurrent/Executor;LV2/b;)LV2/j;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method

.method public i(LP4/c;)LP4/d;
    .locals 1

    .line 1
    iget-object v0, p0, LP4/m;->l:LQ4/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LQ4/m;->b(LP4/c;)LP4/d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public j()LV2/j;
    .locals 8

    .line 1
    iget-object v0, p0, LP4/m;->f:LQ4/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ4/e;->e()LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LP4/m;->g:LQ4/e;

    .line 8
    .line 9
    invoke-virtual {v1}, LQ4/e;->e()LV2/j;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, LP4/m;->e:LQ4/e;

    .line 14
    .line 15
    invoke-virtual {v2}, LQ4/e;->e()LV2/j;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, LP4/m;->d:Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    new-instance v4, LP4/i;

    .line 22
    .line 23
    invoke-direct {v4, p0}, LP4/i;-><init>(LP4/m;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v3, v4}, LV2/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)LV2/j;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v4, p0, LP4/m;->k:Ls4/i;

    .line 31
    .line 32
    invoke-interface {v4}, Ls4/i;->a()LV2/j;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    iget-object v5, p0, LP4/m;->k:Ls4/i;

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-interface {v5, v6}, Ls4/i;->b(Z)LV2/j;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const/4 v7, 0x6

    .line 44
    new-array v7, v7, [LV2/j;

    .line 45
    .line 46
    aput-object v0, v7, v6

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    aput-object v1, v7, v0

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    aput-object v2, v7, v0

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    aput-object v3, v7, v0

    .line 56
    .line 57
    const/4 v0, 0x4

    .line 58
    aput-object v4, v7, v0

    .line 59
    .line 60
    const/4 v0, 0x5

    .line 61
    aput-object v5, v7, v0

    .line 62
    .line 63
    invoke-static {v7}, LV2/m;->i([LV2/j;)LV2/j;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v1, p0, LP4/m;->d:Ljava/util/concurrent/Executor;

    .line 68
    .line 69
    new-instance v2, LP4/j;

    .line 70
    .line 71
    invoke-direct {v2, v3}, LP4/j;-><init>(LV2/j;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1, v2}, LV2/j;->g(Ljava/util/concurrent/Executor;LV2/b;)LV2/j;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0
.end method

.method public k()LV2/j;
    .locals 3

    .line 1
    iget-object v0, p0, LP4/m;->h:Lcom/google/firebase/remoteconfig/internal/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/c;->i()LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, LC3/z;->a()Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, LP4/k;

    .line 12
    .line 13
    invoke-direct {v2}, LP4/k;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, LV2/j;->p(Ljava/util/concurrent/Executor;LV2/i;)LV2/j;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public l()LV2/j;
    .locals 3

    .line 1
    invoke-virtual {p0}, LP4/m;->k()LV2/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LP4/m;->d:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    new-instance v2, LP4/e;

    .line 8
    .line 9
    invoke-direct {v2, p0}, LP4/e;-><init>(LP4/m;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, LV2/j;->p(Ljava/util/concurrent/Executor;LV2/i;)LV2/j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public m()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LP4/m;->i:LQ4/l;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ4/l;->d()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public n()LP4/q;
    .locals 1

    .line 1
    iget-object v0, p0, LP4/m;->j:Lcom/google/firebase/remoteconfig/internal/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/d;->c()LP4/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final synthetic q(LV2/j;LV2/j;LV2/j;)LV2/j;
    .locals 0

    .line 1
    invoke-virtual {p1}, LV2/j;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, LV2/j;->j()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, LV2/j;->j()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/google/firebase/remoteconfig/internal/b;

    .line 19
    .line 20
    invoke-virtual {p2}, LV2/j;->n()Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2}, LV2/j;->j()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Lcom/google/firebase/remoteconfig/internal/b;

    .line 31
    .line 32
    invoke-static {p1, p2}, LP4/m;->p(Lcom/google/firebase/remoteconfig/internal/b;Lcom/google/firebase/remoteconfig/internal/b;)Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-nez p2, :cond_1

    .line 37
    .line 38
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-static {p1}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    iget-object p2, p0, LP4/m;->f:LQ4/e;

    .line 46
    .line 47
    invoke-virtual {p2, p1}, LQ4/e;->k(Lcom/google/firebase/remoteconfig/internal/b;)LV2/j;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p2, p0, LP4/m;->d:Ljava/util/concurrent/Executor;

    .line 52
    .line 53
    new-instance p3, LP4/l;

    .line 54
    .line 55
    invoke-direct {p3, p0}, LP4/l;-><init>(LP4/m;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2, p3}, LV2/j;->g(Ljava/util/concurrent/Executor;LV2/b;)LV2/j;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_2
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-static {p1}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method public final synthetic t(Ljava/lang/Void;)LV2/j;
    .locals 0

    .line 1
    invoke-virtual {p0}, LP4/m;->h()LV2/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final synthetic u(LP4/s;)Ljava/lang/Void;
    .locals 1

    .line 1
    iget-object v0, p0, LP4/m;->j:Lcom/google/firebase/remoteconfig/internal/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/firebase/remoteconfig/internal/d;->l(LP4/s;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public final w(LV2/j;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, LV2/j;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, LP4/m;->e:LQ4/e;

    .line 8
    .line 9
    invoke-virtual {v0}, LQ4/e;->d()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, LV2/j;->j()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, LV2/j;->j()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/google/firebase/remoteconfig/internal/b;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/google/firebase/remoteconfig/internal/b;->d()Lorg/json/JSONArray;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, LP4/m;->D(Lorg/json/JSONArray;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p1, "FirebaseRemoteConfig"

    .line 33
    .line 34
    const-string v0, "Activated configs written to disk are null."

    .line 35
    .line 36
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    :goto_0
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method public x(LP4/s;)LV2/j;
    .locals 2

    .line 1
    iget-object v0, p0, LP4/m;->d:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, LP4/h;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LP4/h;-><init>(LP4/m;LP4/s;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, LV2/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public y(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LP4/m;->l:LQ4/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LQ4/m;->e(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public z(Ljava/util/Map;)LV2/j;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    instance-of v3, v2, [B

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    new-instance v3, Ljava/lang/String;

    .line 41
    .line 42
    check-cast v2, [B

    .line 43
    .line 44
    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([B)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {p0, v0}, LP4/m;->A(Ljava/util/Map;)LV2/j;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1
.end method
