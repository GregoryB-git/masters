.class public LG4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:LF4/a;


# instance fields
.field public final a:LG4/j;

.field public final b:LM4/l;

.field public final c:Ljava/util/Map;

.field public d:Z

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, LF4/a;->e()LF4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, LG4/i;->f:LF4/a;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;LL4/k;LM4/l;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, LG4/i;->d:Z

    .line 7
    .line 8
    iput-boolean v1, p0, LG4/i;->e:Z

    .line 9
    .line 10
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v2, p0, LG4/i;->c:Ljava/util/Map;

    .line 16
    .line 17
    iput-object p4, p0, LG4/i;->b:LM4/l;

    .line 18
    .line 19
    invoke-static {p3}, LG4/j;->h(LL4/k;)LG4/j;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-virtual {p3, p1}, LG4/j;->C(Ljava/lang/String;)LG4/j;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p3, p2}, LG4/j;->q(Ljava/lang/String;)LG4/j;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iput-object p2, p0, LG4/i;->a:LG4/j;

    .line 32
    .line 33
    invoke-virtual {p2}, LG4/j;->t()V

    .line 34
    .line 35
    .line 36
    invoke-static {}, LC4/a;->g()LC4/a;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2}, LC4/a;->L()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-nez p2, :cond_0

    .line 45
    .line 46
    sget-object p2, LG4/i;->f:LF4/a;

    .line 47
    .line 48
    const-string p3, "HttpMetric feature is disabled. URL %s"

    .line 49
    .line 50
    new-array p4, v0, [Ljava/lang/Object;

    .line 51
    .line 52
    aput-object p1, p4, v1

    .line 53
    .line 54
    invoke-virtual {p2, p3, p4}, LF4/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-boolean v0, p0, LG4/i;->e:Z

    .line 58
    .line 59
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LG4/i;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, LG4/i;->c:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LG4/i;->c:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x5

    .line 20
    if-ge v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x1

    .line 32
    new-array v1, v1, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    aput-object v0, v1, v2

    .line 36
    .line 37
    const-string v0, "Exceeds max limit of number of attributes - %d"

    .line 38
    .line 39
    invoke-static {p2, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_1
    :goto_0
    invoke-static {p1, p2}, LH4/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    const-string p2, "HttpMetric has been logged already so unable to modify attributes"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x3

    .line 4
    const/4 v3, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p0, p1, p2}, LG4/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v4, LG4/i;->f:LF4/a;

    .line 17
    .line 18
    const-string v5, "Setting attribute \'%s\' to %s on network request \'%s\'"

    .line 19
    .line 20
    new-array v6, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    aput-object p1, v6, v3

    .line 23
    .line 24
    aput-object p2, v6, v1

    .line 25
    .line 26
    iget-object v7, p0, LG4/i;->a:LG4/j;

    .line 27
    .line 28
    invoke-virtual {v7}, LG4/j;->k()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    aput-object v7, v6, v0

    .line 33
    .line 34
    invoke-virtual {v4, v5, v6}, LF4/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception v4

    .line 39
    sget-object v5, LG4/i;->f:LF4/a;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    new-array v2, v2, [Ljava/lang/Object;

    .line 46
    .line 47
    aput-object p1, v2, v3

    .line 48
    .line 49
    aput-object p2, v2, v1

    .line 50
    .line 51
    aput-object v4, v2, v0

    .line 52
    .line 53
    const-string v0, "Cannot set attribute \'%s\' with value \'%s\' (%s)"

    .line 54
    .line 55
    invoke-virtual {v5, v0, v2}, LF4/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move v1, v3

    .line 59
    :goto_0
    if-eqz v1, :cond_0

    .line 60
    .line 61
    iget-object v0, p0, LG4/i;->c:Ljava/util/Map;

    .line 62
    .line 63
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LG4/i;->a:LG4/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LG4/j;->r(I)LG4/j;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LG4/i;->a:LG4/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LG4/j;->v(J)LG4/j;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LG4/i;->a:LG4/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LG4/j;->x(Ljava/lang/String;)LG4/j;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LG4/i;->a:LG4/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LG4/j;->y(J)LG4/j;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g()V
    .locals 3

    .line 1
    iget-object v0, p0, LG4/i;->b:LM4/l;

    .line 2
    .line 3
    invoke-virtual {v0}, LM4/l;->g()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG4/i;->a:LG4/j;

    .line 7
    .line 8
    iget-object v1, p0, LG4/i;->b:LM4/l;

    .line 9
    .line 10
    invoke-virtual {v1}, LM4/l;->e()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-virtual {v0, v1, v2}, LG4/j;->w(J)LG4/j;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public h()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LG4/i;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, LG4/i;->a:LG4/j;

    .line 7
    .line 8
    iget-object v1, p0, LG4/i;->b:LM4/l;

    .line 9
    .line 10
    invoke-virtual {v1}, LM4/l;->c()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-virtual {v0, v1, v2}, LG4/j;->A(J)LG4/j;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, LG4/i;->c:Ljava/util/Map;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, LG4/j;->p(Ljava/util/Map;)LG4/j;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, LG4/j;->g()LN4/h;

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, LG4/i;->d:Z

    .line 29
    .line 30
    return-void
.end method
