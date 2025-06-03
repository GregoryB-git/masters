.class public Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LB6/g;LG4/j;JJ)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public static enqueue(LB6/a;LB6/b;)V
    .locals 7
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    new-instance v3, LM4/l;

    .line 2
    .line 3
    invoke-direct {v3}, LM4/l;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v3}, LM4/l;->e()J

    .line 7
    .line 8
    .line 9
    move-result-wide v4

    .line 10
    new-instance v6, LI4/i;

    .line 11
    .line 12
    invoke-static {}, LL4/k;->l()LL4/k;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    move-object v0, v6

    .line 17
    move-object v1, p1

    .line 18
    invoke-direct/range {v0 .. v5}, LI4/i;-><init>(LB6/b;LL4/k;LM4/l;J)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v6}, LB6/a;->k(LB6/b;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static execute(LB6/a;)LB6/g;
    .locals 11
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    invoke-static {}, LL4/k;->l()LL4/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LG4/j;->h(LL4/k;)LG4/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v7, LM4/l;

    .line 10
    .line 11
    invoke-direct {v7}, LM4/l;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v7}, LM4/l;->e()J

    .line 15
    .line 16
    .line 17
    move-result-wide v8

    .line 18
    :try_start_0
    invoke-interface {p0}, LB6/a;->e()LB6/g;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v7}, LM4/l;->c()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    const/4 v10, 0x0

    .line 26
    move-object v1, v10

    .line 27
    move-object v2, v0

    .line 28
    move-wide v3, v8

    .line 29
    invoke-static/range {v1 .. v6}, Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;->a(LB6/g;LG4/j;JJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-object v10

    .line 33
    :catch_0
    move-exception v1

    .line 34
    invoke-interface {p0}, LB6/a;->q()LB6/e;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v8, v9}, LG4/j;->w(J)LG4/j;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7}, LM4/l;->c()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    invoke-virtual {v0, v2, v3}, LG4/j;->A(J)LG4/j;

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, LI4/j;->d(LG4/j;)V

    .line 48
    .line 49
    .line 50
    throw v1
.end method
