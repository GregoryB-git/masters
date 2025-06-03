.class public Lf2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf2/t;


# static fields
.field public static volatile e:Lf2/v;


# instance fields
.field public final a:Lp2/a;

.field public final b:Lp2/a;

.field public final c:Ll2/e;

.field public final d:Lm2/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lp2/a;Lp2/a;Ll2/e;Lm2/r;Lm2/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf2/u;->a:Lp2/a;

    .line 5
    .line 6
    iput-object p2, p0, Lf2/u;->b:Lp2/a;

    .line 7
    .line 8
    iput-object p3, p0, Lf2/u;->c:Ll2/e;

    .line 9
    .line 10
    iput-object p4, p0, Lf2/u;->d:Lm2/r;

    .line 11
    .line 12
    invoke-virtual {p5}, Lm2/v;->c()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static c()Lf2/u;
    .locals 2

    .line 1
    sget-object v0, Lf2/u;->e:Lf2/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lf2/v;->b()Lf2/u;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v1, "Not initialized!"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public static d(Lf2/f;)Ljava/util/Set;
    .locals 1

    .line 1
    instance-of v0, p0, Lf2/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lf2/g;

    .line 6
    .line 7
    invoke-interface {p0}, Lf2/g;->a()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "proto"

    .line 17
    .line 18
    invoke-static {p0}, Lc2/b;->b(Ljava/lang/String;)Lc2/b;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lf2/u;->e:Lf2/v;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lf2/u;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lf2/u;->e:Lf2/v;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lf2/e;->c()Lf2/v$a;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1, p0}, Lf2/v$a;->b(Landroid/content/Context;)Lf2/v$a;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Lf2/v$a;->a()Lf2/v;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sput-object p0, Lf2/u;->e:Lf2/v;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    monitor-exit v0

    .line 30
    goto :goto_2

    .line 31
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw p0

    .line 33
    :cond_1
    :goto_2
    return-void
.end method


# virtual methods
.method public a(Lf2/o;Lc2/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf2/u;->c:Ll2/e;

    .line 2
    .line 3
    invoke-virtual {p1}, Lf2/o;->f()Lf2/p;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lf2/o;->c()Lc2/c;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Lc2/c;->c()Lc2/d;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1, v2}, Lf2/p;->f(Lc2/d;)Lf2/p;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, p1}, Lf2/u;->b(Lf2/o;)Lf2/i;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, v1, p1, p2}, Ll2/e;->a(Lf2/p;Lf2/i;Lc2/h;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final b(Lf2/o;)Lf2/i;
    .locals 4

    .line 1
    invoke-static {}, Lf2/i;->a()Lf2/i$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lf2/u;->a:Lp2/a;

    .line 6
    .line 7
    invoke-interface {v1}, Lp2/a;->a()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-virtual {v0, v1, v2}, Lf2/i$a;->i(J)Lf2/i$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lf2/u;->b:Lp2/a;

    .line 16
    .line 17
    invoke-interface {v1}, Lp2/a;->a()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-virtual {v0, v1, v2}, Lf2/i$a;->k(J)Lf2/i$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1}, Lf2/o;->g()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Lf2/i$a;->j(Ljava/lang/String;)Lf2/i$a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Lf2/h;

    .line 34
    .line 35
    invoke-virtual {p1}, Lf2/o;->b()Lc2/b;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p1}, Lf2/o;->d()[B

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-direct {v1, v2, v3}, Lf2/h;-><init>(Lc2/b;[B)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lf2/i$a;->h(Lf2/h;)Lf2/i$a;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1}, Lf2/o;->c()Lc2/c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lc2/c;->a()Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v0, p1}, Lf2/i$a;->g(Ljava/lang/Integer;)Lf2/i$a;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lf2/i$a;->d()Lf2/i;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1
.end method

.method public e()Lm2/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/u;->d:Lm2/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public g(Lf2/f;)Lc2/g;
    .locals 4

    .line 1
    new-instance v0, Lf2/q;

    .line 2
    .line 3
    invoke-static {p1}, Lf2/u;->d(Lf2/f;)Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Lf2/p;->a()Lf2/p$a;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {p1}, Lf2/f;->d()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v2, v3}, Lf2/p$a;->b(Ljava/lang/String;)Lf2/p$a;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {p1}, Lf2/f;->r()[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v2, p1}, Lf2/p$a;->c([B)Lf2/p$a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lf2/p$a;->a()Lf2/p;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, v1, p1, p0}, Lf2/q;-><init>(Ljava/util/Set;Lf2/p;Lf2/t;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method
