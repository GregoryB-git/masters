.class public LQ3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Ls3/e;

.field public final c:LV3/A;

.field public final d:LV3/A;


# direct methods
.method public constructor <init>(Ls3/e;Lr4/a;Lr4/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LQ3/i;->a:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p1, p0, LQ3/i;->b:Ls3/e;

    .line 12
    .line 13
    new-instance p1, LR3/g;

    .line 14
    .line 15
    invoke-direct {p1, p2}, LR3/g;-><init>(Lr4/a;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LQ3/i;->c:LV3/A;

    .line 19
    .line 20
    new-instance p1, LR3/d;

    .line 21
    .line 22
    invoke-direct {p1, p3}, LR3/d;-><init>(Lr4/a;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LQ3/i;->d:LV3/A;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public declared-synchronized a(LV3/p;)LQ3/h;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LQ3/i;->a:Ljava/util/Map;

    .line 3
    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, LQ3/h;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, LV3/g;

    .line 13
    .line 14
    invoke-direct {v0}, LV3/g;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, LQ3/i;->b:Ls3/e;

    .line 18
    .line 19
    invoke-virtual {v1}, Ls3/e;->y()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, LQ3/i;->b:Ls3/e;

    .line 26
    .line 27
    invoke-virtual {v1}, Ls3/e;->q()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, LV3/g;->O(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    iget-object v1, p0, LQ3/i;->b:Ls3/e;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, LV3/g;->K(Ls3/e;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, LQ3/i;->c:LV3/A;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, LV3/g;->J(LV3/A;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, LQ3/i;->d:LV3/A;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, LV3/g;->I(LV3/A;)V

    .line 50
    .line 51
    .line 52
    new-instance v1, LQ3/h;

    .line 53
    .line 54
    iget-object v2, p0, LQ3/i;->b:Ls3/e;

    .line 55
    .line 56
    invoke-direct {v1, v2, p1, v0}, LQ3/h;-><init>(Ls3/e;LV3/p;LV3/g;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, LQ3/i;->a:Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    move-object v0, v1

    .line 65
    :cond_1
    monitor-exit p0

    .line 66
    return-object v0

    .line 67
    :goto_1
    monitor-exit p0

    .line 68
    throw p1
.end method
