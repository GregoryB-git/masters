.class public Lg9/b0;
.super Lg9/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/b0$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lg9/f;-><init>(Lcom/google/firebase/firestore/g;)V

    return-void
.end method


# virtual methods
.method public final a()Lg9/k;
    .locals 2

    new-instance v0, Lg9/k;

    invoke-virtual {p0}, Lg9/f;->i()Lg9/j0;

    move-result-object v1

    invoke-direct {v0, v1}, Lg9/k;-><init>(Lg9/j0;)V

    return-object v0
.end method

.method public b(Lg9/f$a;)Li9/k1;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public c(Lg9/f$a;)Li9/e;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Lg9/f$a;)Li9/n;
    .locals 4

    .line 1
    new-instance v0, Li9/n;

    .line 2
    .line 3
    iget-object v1, p0, Lg9/f;->c:Le9/a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v3, "persistence not initialized yet"

    .line 9
    .line 10
    invoke-static {v1, v3, v2}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Li9/d0;

    .line 14
    .line 15
    invoke-direct {v2}, Li9/d0;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, Lg9/f$a;->d:Le9/e;

    .line 19
    .line 20
    invoke-direct {v0, v1, v2, p1}, Li9/n;-><init>(Le9/a;Li9/d0;Le9/e;)V

    .line 21
    .line 22
    .line 23
    return-object v0
    .line 24
    .line 25
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

.method public e(Lg9/f$a;)Le9/a;
    .locals 3

    .line 1
    iget-object p1, p0, Lg9/f;->a:Lcom/google/firebase/firestore/g;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/firebase/firestore/g;->e:Ld9/e0;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    instance-of v1, p1, Ld9/f0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast p1, Ld9/f0;

    .line 13
    .line 14
    iget-object p1, p1, Ld9/f0;->a:Ld9/h0;

    .line 15
    .line 16
    instance-of p1, p1, Ld9/i0;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p1, v0

    .line 20
    :goto_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    new-instance p1, Li9/i;

    .line 23
    .line 24
    iget-object v1, p0, Lg9/f;->b:Lm9/c0;

    .line 25
    .line 26
    iget-object v1, v1, Lm9/c0;->b:Lm9/e0;

    .line 27
    .line 28
    new-array v0, v0, [Ljava/lang/Object;

    .line 29
    .line 30
    const-string v2, "remoteSerializer not initialized yet"

    .line 31
    .line 32
    invoke-static {v1, v2, v0}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, v1}, Li9/i;-><init>(Lm9/e0;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lg9/f;->a:Lcom/google/firebase/firestore/g;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/google/firebase/firestore/g;->a()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    new-instance v2, Li9/q$b;

    .line 45
    .line 46
    invoke-direct {v2, v0, v1}, Li9/q$b;-><init>(J)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Li9/w;

    .line 50
    .line 51
    invoke-direct {v0}, Li9/w;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v1, Li9/u;

    .line 55
    .line 56
    invoke-direct {v1, v0, v2, p1}, Li9/u;-><init>(Li9/w;Li9/q$b;Li9/i;)V

    .line 57
    .line 58
    .line 59
    iput-object v1, v0, Li9/w;->i:Li9/f0;

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_1
    new-instance p1, Li9/w;

    .line 63
    .line 64
    invoke-direct {p1}, Li9/w;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v0, Lr3/a0;

    .line 68
    .line 69
    invoke-direct {v0, p1}, Lr3/a0;-><init>(Li9/w;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p1, Li9/w;->i:Li9/f0;

    .line 73
    .line 74
    return-object p1
    .line 75
    .line 76
    .line 77
.end method

.method public final f(Lg9/f$a;)Lm9/h0;
    .locals 8

    .line 1
    new-instance v7, Lm9/h0;

    .line 2
    .line 3
    iget-object v0, p1, Lg9/f$a;->c:Lg9/h;

    .line 4
    .line 5
    iget-object v1, v0, Lg9/h;->a:Lj9/f;

    .line 6
    .line 7
    new-instance v2, Lg9/b0$a;

    .line 8
    .line 9
    invoke-direct {v2, p0}, Lg9/b0$a;-><init>(Lg9/b0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lg9/f;->h()Li9/n;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget-object v0, p0, Lg9/f;->b:Lm9/c0;

    .line 17
    .line 18
    iget-object v4, v0, Lm9/c0;->d:Lm9/j;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    new-array v5, v0, [Ljava/lang/Object;

    .line 22
    .line 23
    const-string v6, "datastore not initialized yet"

    .line 24
    .line 25
    invoke-static {v4, v6, v5}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v5, p1, Lg9/f$a;->b:Ln9/a;

    .line 29
    .line 30
    iget-object p1, p0, Lg9/f;->b:Lm9/c0;

    .line 31
    .line 32
    iget-object v6, p1, Lm9/c0;->e:Lm9/d;

    .line 33
    .line 34
    new-array p1, v0, [Ljava/lang/Object;

    .line 35
    .line 36
    const-string v0, "connectivityMonitor not initialized yet"

    .line 37
    .line 38
    invoke-static {v6, v0, p1}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v0, v7

    .line 42
    invoke-direct/range {v0 .. v6}, Lm9/h0;-><init>(Lj9/f;Lg9/b0$a;Li9/n;Lm9/j;Ln9/a;Lm9/d;)V

    .line 43
    .line 44
    .line 45
    return-object v7
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

.method public final g(Lg9/f$a;)Lg9/j0;
    .locals 5

    .line 1
    new-instance v0, Lg9/j0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lg9/f;->h()Li9/n;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lg9/f;->f:Lm9/h0;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    new-array v3, v3, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v4, "remoteStore not initialized yet"

    .line 13
    .line 14
    invoke-static {v2, v4, v3}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, Lg9/f$a;->d:Le9/e;

    .line 18
    .line 19
    const/16 v3, 0x64

    .line 20
    .line 21
    invoke-direct {v0, v1, v2, p1, v3}, Lg9/j0;-><init>(Li9/n;Lm9/h0;Le9/e;I)V

    .line 22
    .line 23
    .line 24
    return-object v0
    .line 25
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
