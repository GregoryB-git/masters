.class public LV3/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV3/x$q;,
        LV3/x$r;,
        LV3/x$s;,
        LV3/x$p;
    }
.end annotation


# instance fields
.field public a:LY3/d;

.field public final b:LV3/F;

.field public final c:Ljava/util/Map;

.field public final d:Ljava/util/Map;

.field public final e:Ljava/util/Set;

.field public final f:LV3/x$s;

.field public final g:LX3/e;

.field public final h:Lc4/c;

.field public i:J


# direct methods
.method public constructor <init>(LV3/f;LX3/e;LV3/x$s;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x1

    .line 5
    .line 6
    iput-wide v0, p0, LV3/x;->i:J

    .line 7
    .line 8
    invoke-static {}, LY3/d;->d()LY3/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, LV3/x;->a:LY3/d;

    .line 13
    .line 14
    new-instance v0, LV3/F;

    .line 15
    .line 16
    invoke-direct {v0}, LV3/F;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LV3/x;->b:LV3/F;

    .line 20
    .line 21
    new-instance v0, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LV3/x;->c:Ljava/util/Map;

    .line 27
    .line 28
    new-instance v0, Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, LV3/x;->d:Ljava/util/Map;

    .line 34
    .line 35
    new-instance v0, Ljava/util/HashSet;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, LV3/x;->e:Ljava/util/Set;

    .line 41
    .line 42
    iput-object p3, p0, LV3/x;->f:LV3/x$s;

    .line 43
    .line 44
    iput-object p2, p0, LV3/x;->g:LX3/e;

    .line 45
    .line 46
    const-string p2, "SyncTree"

    .line 47
    .line 48
    invoke-virtual {p1, p2}, LV3/f;->q(Ljava/lang/String;)Lc4/c;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, LV3/x;->h:Lc4/c;

    .line 53
    .line 54
    return-void
.end method

.method public static synthetic a(LV3/x;La4/i;)Ld4/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LV3/x;->P(La4/i;)Ld4/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(LV3/x;)Lc4/c;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/x;->h:Lc4/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(LV3/x;)LX3/e;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(LV3/x;La4/i;La4/j;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LV3/x;->a0(La4/i;La4/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(LV3/x;LY3/d;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LV3/x;->K(LY3/d;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(LV3/x;La4/i;)La4/i;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LV3/x;->R(La4/i;)La4/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(LV3/x;)LV3/x$s;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/x;->f:LV3/x$s;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(LV3/x;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LV3/x;->Y(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(LV3/x;LW3/d;LY3/d;Ld4/n;LV3/G;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, LV3/x;->w(LW3/d;LY3/d;Ld4/n;LV3/G;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic j(LV3/x;)LV3/F;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/x;->b:LV3/F;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic k(LV3/x;LW3/d;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LV3/x;->y(LW3/d;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic l(LV3/x;LV3/y;)La4/i;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LV3/x;->S(LV3/y;)La4/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic m(LV3/x;La4/i;LW3/d;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LV3/x;->D(La4/i;LW3/d;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic n(LV3/x;)LY3/d;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/x;->a:LY3/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(LV3/x;LY3/d;)LY3/d;
    .locals 0

    .line 1
    iput-object p1, p0, LV3/x;->a:LY3/d;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic p(LV3/x;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/x;->d:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic q(LV3/x;)LV3/y;
    .locals 0

    .line 1
    invoke-virtual {p0}, LV3/x;->M()LV3/y;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic r(LV3/x;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/x;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public A(LV3/k;Ld4/n;)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    new-instance v1, LV3/x$k;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, LV3/x$k;-><init>(LV3/x;LV3/k;Ld4/n;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    return-object p1
.end method

.method public B(LV3/k;Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/x;->a:LY3/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LY3/d;->s(LV3/k;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LV3/v;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-virtual {v0}, LV3/v;->e()La4/j;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, La4/j;->i()Ld4/n;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ld4/s;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ld4/s;->a(Ld4/n;)Ld4/n;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p0, p1, v0}, LV3/x;->A(LV3/k;Ld4/n;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :cond_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
.end method

.method public C(LV3/y;)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    new-instance v1, LV3/x$n;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LV3/x$n;-><init>(LV3/x;LV3/y;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    return-object p1
.end method

.method public final D(La4/i;LW3/d;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-virtual {p1}, La4/i;->e()LV3/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LV3/x;->a:LY3/d;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, LY3/d;->s(LV3/k;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LV3/v;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    const-string v2, "Missing sync point for query tag that we\'re tracking"

    .line 19
    .line 20
    invoke-static {v1, v2}, LY3/m;->g(ZLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, LV3/x;->b:LV3/F;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, LV3/F;->h(LV3/k;)LV3/G;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v0, p2, p1, v1}, LV3/v;->b(LW3/d;LV3/G;Ld4/n;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public E(LV3/k;Ljava/util/Map;LV3/y;)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    new-instance v1, LV3/x$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p3, p1, p2}, LV3/x$a;-><init>(LV3/x;LV3/y;LV3/k;Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    return-object p1
.end method

.method public F(LV3/k;Ld4/n;LV3/y;)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    new-instance v1, LV3/x$o;

    .line 4
    .line 5
    invoke-direct {v1, p0, p3, p1, p2}, LV3/x$o;-><init>(LV3/x;LV3/y;LV3/k;Ld4/n;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    return-object p1
.end method

.method public G(LV3/k;Ljava/util/List;LV3/y;)Ljava/util/List;
    .locals 6

    .line 1
    invoke-virtual {p0, p3}, LV3/x;->S(LV3/y;)La4/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {v0}, La4/i;->e()LV3/k;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1, v1}, LV3/k;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1}, LY3/m;->f(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LV3/x;->a:LY3/d;

    .line 19
    .line 20
    invoke-virtual {v0}, La4/i;->e()LV3/k;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, LY3/d;->s(LV3/k;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, LV3/v;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    move v4, v3

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v4, v2

    .line 37
    :goto_0
    const-string v5, "Missing sync point for query tag that we\'re tracking"

    .line 38
    .line 39
    invoke-static {v4, v5}, LY3/m;->g(ZLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, LV3/v;->l(La4/i;)La4/j;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    move v2, v3

    .line 49
    :cond_1
    const-string v1, "Missing view for query tag that we\'re tracking"

    .line 50
    .line 51
    invoke-static {v2, v1}, LY3/m;->g(ZLjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, La4/j;->i()Ld4/n;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Ld4/s;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, Ld4/s;->a(Ld4/n;)Ld4/n;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    invoke-virtual {p0, p1, v0, p3}, LV3/x;->F(LV3/k;Ld4/n;LV3/y;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1
.end method

.method public H(LV3/k;LV3/b;LV3/b;JZ)Ljava/util/List;
    .locals 11

    .line 1
    move-object v8, p0

    .line 2
    iget-object v9, v8, LV3/x;->g:LX3/e;

    .line 3
    .line 4
    new-instance v10, LV3/x$h;

    .line 5
    .line 6
    move-object v0, v10

    .line 7
    move-object v1, p0

    .line 8
    move/from16 v2, p6

    .line 9
    .line 10
    move-object v3, p1

    .line 11
    move-object v4, p2

    .line 12
    move-wide v5, p4

    .line 13
    move-object v7, p3

    .line 14
    invoke-direct/range {v0 .. v7}, LV3/x$h;-><init>(LV3/x;ZLV3/k;LV3/b;JLV3/b;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v9, v10}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    .line 23
    return-object v0
.end method

.method public I(LV3/k;Ld4/n;Ld4/n;JZZ)Ljava/util/List;
    .locals 12

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    if-nez p7, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    goto :goto_1

    .line 8
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 9
    :goto_1
    const-string v1, "We shouldn\'t be persisting non-visible writes."

    .line 10
    .line 11
    invoke-static {v0, v1}, LY3/m;->g(ZLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object v9, p0

    .line 15
    iget-object v10, v9, LV3/x;->g:LX3/e;

    .line 16
    .line 17
    new-instance v11, LV3/x$g;

    .line 18
    .line 19
    move-object v0, v11

    .line 20
    move-object v1, p0

    .line 21
    move/from16 v2, p7

    .line 22
    .line 23
    move-object v3, p1

    .line 24
    move-object v4, p2

    .line 25
    move-wide/from16 v5, p4

    .line 26
    .line 27
    move-object v7, p3

    .line 28
    move/from16 v8, p6

    .line 29
    .line 30
    invoke-direct/range {v0 .. v8}, LV3/x$g;-><init>(LV3/x;ZLV3/k;Ld4/n;JLd4/n;Z)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v10, v11}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/util/List;

    .line 38
    .line 39
    return-object v0
.end method

.method public J(LV3/k;Ljava/util/List;)Ld4/n;
    .locals 6

    .line 1
    iget-object v0, p0, LV3/x;->a:LY3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LY3/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LV3/v;

    .line 8
    .line 9
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move-object v3, p1

    .line 15
    :cond_0
    invoke-virtual {v3}, LV3/k;->Z()Ld4/b;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v3}, LV3/k;->c0()LV3/k;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v1, v4}, LV3/k;->U(Ld4/b;)LV3/k;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1, p1}, LV3/k;->b0(LV3/k;LV3/k;)LV3/k;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0, v4}, LY3/d;->D(Ld4/b;)LY3/d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {}, LY3/d;->d()LY3/d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :goto_0
    invoke-virtual {v0}, LY3/d;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, LV3/v;

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    invoke-virtual {v4, v5}, LV3/v;->d(LV3/k;)Ld4/n;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    :cond_2
    invoke-virtual {v3}, LV3/k;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    if-eqz v2, :cond_0

    .line 61
    .line 62
    :cond_3
    iget-object v0, p0, LV3/x;->b:LV3/F;

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    invoke-virtual {v0, p1, v2, p2, v1}, LV3/F;->d(LV3/k;Ld4/n;Ljava/util/List;Z)Ld4/n;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method public final K(LY3/d;)Ljava/util/List;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, LV3/x;->L(LY3/d;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final L(LY3/d;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, LY3/d;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LV3/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LV3/v;->h()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, LV3/v;->e()La4/j;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, LV3/v;->f()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p1}, LY3/d;->M()LS3/c;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, LS3/c;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/util/Map$Entry;

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, LY3/d;

    .line 57
    .line 58
    invoke-virtual {p0, v0, p2}, LV3/x;->L(LY3/d;Ljava/util/List;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    :goto_1
    return-void
.end method

.method public final M()LV3/y;
    .locals 5

    .line 1
    new-instance v0, LV3/y;

    .line 2
    .line 3
    iget-wide v1, p0, LV3/x;->i:J

    .line 4
    .line 5
    const-wide/16 v3, 0x1

    .line 6
    .line 7
    add-long/2addr v3, v1

    .line 8
    iput-wide v3, p0, LV3/x;->i:J

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, LV3/y;-><init>(J)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public N(La4/i;)Ld4/n;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    new-instance v1, LV3/w;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LV3/w;-><init>(LV3/x;La4/i;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ld4/n;

    .line 13
    .line 14
    return-object p1
.end method

.method public O(La4/i;ZZ)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LV3/x;->e:Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance p2, LV3/x$q;

    .line 12
    .line 13
    invoke-direct {p2, p1}, LV3/x$q;-><init>(La4/i;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2, p3}, LV3/x;->u(LV3/h;Z)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    iget-object p2, p0, LV3/x;->e:Ljava/util/Set;

    .line 20
    .line 21
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-nez p2, :cond_1

    .line 26
    .line 27
    iget-object p2, p0, LV3/x;->e:Ljava/util/Set;

    .line 28
    .line 29
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    new-instance p2, LV3/x$q;

    .line 36
    .line 37
    invoke-direct {p2, p1}, LV3/x$q;-><init>(La4/i;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p2, p3}, LV3/x;->W(LV3/h;Z)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    iget-object p2, p0, LV3/x;->e:Ljava/util/Set;

    .line 44
    .line 45
    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    return-void
.end method

.method public final synthetic P(La4/i;)Ld4/n;
    .locals 8

    .line 1
    invoke-virtual {p1}, La4/i;->e()LV3/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LV3/x;->a:LY3/d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    move-object v4, v0

    .line 10
    move v5, v3

    .line 11
    :goto_0
    invoke-virtual {v1}, LY3/d;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    const/4 v7, 0x1

    .line 16
    if-nez v6, :cond_5

    .line 17
    .line 18
    invoke-virtual {v1}, LY3/d;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    check-cast v6, LV3/v;

    .line 23
    .line 24
    if-eqz v6, :cond_3

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {v6, v4}, LV3/v;->d(LV3/k;)Ld4/n;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_1
    if-nez v5, :cond_2

    .line 34
    .line 35
    invoke-virtual {v6}, LV3/v;->h()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    move v5, v3

    .line 43
    goto :goto_3

    .line 44
    :cond_2
    :goto_2
    move v5, v7

    .line 45
    :cond_3
    :goto_3
    invoke-virtual {v4}, LV3/k;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_4

    .line 50
    .line 51
    const-string v6, ""

    .line 52
    .line 53
    invoke-static {v6}, Ld4/b;->j(Ljava/lang/String;)Ld4/b;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    goto :goto_4

    .line 58
    :cond_4
    invoke-virtual {v4}, LV3/k;->Z()Ld4/b;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    :goto_4
    invoke-virtual {v1, v6}, LY3/d;->D(Ld4/b;)LY3/d;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v4}, LV3/k;->c0()LV3/k;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    goto :goto_0

    .line 71
    :cond_5
    iget-object v1, p0, LV3/x;->a:LY3/d;

    .line 72
    .line 73
    invoke-virtual {v1, v0}, LY3/d;->s(LV3/k;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, LV3/v;

    .line 78
    .line 79
    if-nez v1, :cond_6

    .line 80
    .line 81
    new-instance v1, LV3/v;

    .line 82
    .line 83
    iget-object v4, p0, LV3/x;->g:LX3/e;

    .line 84
    .line 85
    invoke-direct {v1, v4}, LV3/v;-><init>(LX3/e;)V

    .line 86
    .line 87
    .line 88
    iget-object v4, p0, LV3/x;->a:LY3/d;

    .line 89
    .line 90
    invoke-virtual {v4, v0, v1}, LY3/d;->W(LV3/k;Ljava/lang/Object;)LY3/d;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    iput-object v4, p0, LV3/x;->a:LY3/d;

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_6
    if-eqz v2, :cond_7

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_7
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v1, v2}, LV3/v;->d(LV3/k;)Ld4/n;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    :goto_5
    new-instance v4, La4/a;

    .line 109
    .line 110
    if-eqz v2, :cond_8

    .line 111
    .line 112
    move-object v5, v2

    .line 113
    goto :goto_6

    .line 114
    :cond_8
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    :goto_6
    invoke-virtual {p1}, La4/i;->c()Ld4/h;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-static {v5, v6}, Ld4/i;->f(Ld4/n;Ld4/h;)Ld4/i;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    if-eqz v2, :cond_9

    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_9
    move v7, v3

    .line 130
    :goto_7
    invoke-direct {v4, v5, v7, v3}, La4/a;-><init>(Ld4/i;ZZ)V

    .line 131
    .line 132
    .line 133
    iget-object v2, p0, LV3/x;->b:LV3/F;

    .line 134
    .line 135
    invoke-virtual {v2, v0}, LV3/F;->h(LV3/k;)LV3/G;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v1, p1, v0, v4}, LV3/v;->g(La4/i;LV3/G;La4/a;)La4/j;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p1}, La4/j;->d()Ld4/n;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    return-object p1
.end method

.method public Q(LQ3/p;)LQ3/b;
    .locals 2

    .line 1
    invoke-virtual {p1}, LQ3/p;->t()LQ3/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LV3/x;->g:LX3/e;

    .line 6
    .line 7
    invoke-virtual {p1}, LQ3/p;->u()La4/i;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {v1, p1}, LX3/e;->k(La4/i;)La4/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, La4/a;->a()Ld4/i;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {v0, p1}, LQ3/k;->a(LQ3/e;Ld4/i;)LQ3/b;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public final R(La4/i;)La4/i;
    .locals 1

    .line 1
    invoke-virtual {p1}, La4/i;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, La4/i;->f()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, La4/i;->e()LV3/k;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, La4/i;->a(LV3/k;)La4/i;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    return-object p1
.end method

.method public final S(LV3/y;)La4/i;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/x;->c:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, La4/i;

    .line 8
    .line 9
    return-object p1
.end method

.method public T(La4/i;LQ3/c;)Ljava/util/List;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, p1, v0, p2, v1}, LV3/x;->X(La4/i;LV3/h;LQ3/c;Z)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public U()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    new-instance v1, LV3/x$j;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LV3/x$j;-><init>(LV3/x;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/List;

    .line 13
    .line 14
    return-object v0
.end method

.method public V(LV3/h;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-virtual {p1}, LV3/h;->e()La4/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-virtual {p0, v0, p1, v1, v2}, LV3/x;->X(La4/i;LV3/h;LQ3/c;Z)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public W(LV3/h;Z)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p1}, LV3/h;->e()La4/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, p1, v1, p2}, LV3/x;->X(La4/i;LV3/h;LQ3/c;Z)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final X(La4/i;LV3/h;LQ3/c;Z)Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    new-instance v7, LV3/x$d;

    .line 4
    .line 5
    move-object v1, v7

    .line 6
    move-object v2, p0

    .line 7
    move-object v3, p1

    .line 8
    move-object v4, p2

    .line 9
    move-object v5, p3

    .line 10
    move v6, p4

    .line 11
    invoke-direct/range {v1 .. v6}, LV3/x$d;-><init>(LV3/x;La4/i;LV3/h;LQ3/c;Z)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v7}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/util/List;

    .line 19
    .line 20
    return-object p1
.end method

.method public final Y(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La4/i;

    .line 16
    .line 17
    invoke-virtual {v0}, La4/i;->g()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v0}, LV3/x;->b0(La4/i;)LV3/y;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 v2, 0x0

    .line 32
    :goto_1
    invoke-static {v2}, LY3/m;->f(Z)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, LV3/x;->d:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, LV3/x;->c:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-void
.end method

.method public Z(La4/i;)V
    .locals 2

    .line 1
    iget-object v0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    new-instance v1, LV3/x$b;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LV3/x$b;-><init>(LV3/x;La4/i;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final a0(La4/i;La4/j;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, La4/i;->e()LV3/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1}, LV3/x;->b0(La4/i;)LV3/y;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, LV3/x$r;

    .line 10
    .line 11
    invoke-direct {v2, p0, p2}, LV3/x$r;-><init>(LV3/x;La4/j;)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, LV3/x;->f:LV3/x$s;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, LV3/x;->R(La4/i;)La4/i;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p2, p1, v1, v2, v2}, LV3/x$s;->b(La4/i;LV3/y;LT3/g;LV3/x$p;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, LV3/x;->a:LY3/d;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, LY3/d;->Y(LV3/k;)LY3/d;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, LY3/d;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, LV3/v;

    .line 36
    .line 37
    invoke-virtual {p1}, LV3/v;->h()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    xor-int/lit8 p1, p1, 0x1

    .line 42
    .line 43
    const-string p2, "If we\'re adding a query, it shouldn\'t be shadowed"

    .line 44
    .line 45
    invoke-static {p1, p2}, LY3/m;->g(ZLjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p2, LV3/x$e;

    .line 50
    .line 51
    invoke-direct {p2, p0}, LV3/x$e;-><init>(LV3/x;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, LY3/d;->q(LY3/d$c;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    return-void
.end method

.method public b0(La4/i;)LV3/y;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/x;->d:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LV3/y;

    .line 8
    .line 9
    return-object p1
.end method

.method public s(JZZLY3/a;)Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    new-instance v8, LV3/x$i;

    .line 4
    .line 5
    move-object v1, v8

    .line 6
    move-object v2, p0

    .line 7
    move v3, p4

    .line 8
    move-wide v4, p1

    .line 9
    move v6, p3

    .line 10
    move-object v7, p5

    .line 11
    invoke-direct/range {v1 .. v7}, LV3/x$i;-><init>(LV3/x;ZJZLY3/a;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v8}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/util/List;

    .line 19
    .line 20
    return-object p1
.end method

.method public t(LV3/h;)Ljava/util/List;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LV3/x;->u(LV3/h;Z)Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public u(LV3/h;Z)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    new-instance v1, LV3/x$c;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, LV3/x$c;-><init>(LV3/x;LV3/h;Z)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    return-object p1
.end method

.method public v(LV3/k;)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    new-instance v1, LV3/x$m;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LV3/x$m;-><init>(LV3/x;LV3/k;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    return-object p1
.end method

.method public final w(LW3/d;LY3/d;Ld4/n;LV3/G;)Ljava/util/List;
    .locals 9

    .line 1
    invoke-virtual {p2}, LY3/d;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LV3/v;

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {v0, p3}, LV3/v;->d(LV3/k;)Ld4/n;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, LY3/d;->M()LS3/c;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance v8, LV3/x$f;

    .line 29
    .line 30
    move-object v1, v8

    .line 31
    move-object v2, p0

    .line 32
    move-object v3, p3

    .line 33
    move-object v4, p4

    .line 34
    move-object v5, p1

    .line 35
    move-object v6, v7

    .line 36
    invoke-direct/range {v1 .. v6}, LV3/x$f;-><init>(LV3/x;Ld4/n;LV3/G;LW3/d;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, v8}, LS3/c;->q(LS3/h$b;)V

    .line 40
    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, p1, p4, p3}, LV3/v;->b(LW3/d;LV3/G;Ld4/n;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {v7, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 49
    .line 50
    .line 51
    :cond_1
    return-object v7
.end method

.method public final x(LW3/d;LY3/d;Ld4/n;LV3/G;)Ljava/util/List;
    .locals 5

    .line 1
    invoke-virtual {p1}, LW3/d;->a()LV3/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LV3/k;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3, p4}, LV3/x;->w(LW3/d;LY3/d;Ld4/n;LV3/G;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-virtual {p2}, LY3/d;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, LV3/v;

    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-virtual {v0, p3}, LV3/v;->d(LV3/k;)Ld4/n;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, LW3/d;->a()LV3/k;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, LV3/k;->Z()Ld4/b;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p1, v2}, LW3/d;->d(Ld4/b;)LW3/d;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {p2}, LY3/d;->M()LS3/c;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2, v2}, LS3/c;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, LY3/d;

    .line 60
    .line 61
    if-eqz p2, :cond_3

    .line 62
    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    if-eqz p3, :cond_2

    .line 66
    .line 67
    invoke-interface {p3, v2}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const/4 v4, 0x0

    .line 73
    :goto_0
    invoke-virtual {p4, v2}, LV3/G;->h(Ld4/b;)LV3/G;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {p0, v3, p2, v4, v2}, LV3/x;->x(LW3/d;LY3/d;Ld4/n;LV3/G;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {v1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 82
    .line 83
    .line 84
    :cond_3
    if-eqz v0, :cond_4

    .line 85
    .line 86
    invoke-virtual {v0, p1, p4, p3}, LV3/v;->b(LW3/d;LV3/G;Ld4/n;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 91
    .line 92
    .line 93
    :cond_4
    return-object v1
.end method

.method public final y(LW3/d;)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, LV3/x;->a:LY3/d;

    .line 2
    .line 3
    iget-object v1, p0, LV3/x;->b:LV3/F;

    .line 4
    .line 5
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v1, v2}, LV3/F;->h(LV3/k;)LV3/G;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p0, p1, v0, v2, v1}, LV3/x;->x(LW3/d;LY3/d;Ld4/n;LV3/G;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public z(LV3/k;Ljava/util/Map;)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/x;->g:LX3/e;

    .line 2
    .line 3
    new-instance v1, LV3/x$l;

    .line 4
    .line 5
    invoke-direct {v1, p0, p2, p1}, LV3/x$l;-><init>(LV3/x;Ljava/util/Map;LV3/k;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LX3/e;->g(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    return-object p1
.end method
