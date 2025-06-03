.class public final Lg9/i0;
.super Lg9/b0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lg9/b0;-><init>(Lcom/google/firebase/firestore/g;)V

    return-void
.end method


# virtual methods
.method public final b(Lg9/f$a;)Li9/k1;
    .locals 3

    .line 1
    iget-object v0, p0, Lg9/f;->c:Le9/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "persistence not initialized yet"

    .line 7
    .line 8
    invoke-static {v0, v2, v1}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    check-cast v0, Li9/y0;

    .line 12
    .line 13
    iget-object v0, v0, Li9/y0;->g:Li9/v0;

    .line 14
    .line 15
    iget-object v0, v0, Li9/v0;->d:Li9/q;

    .line 16
    .line 17
    iget-object p1, p1, Lg9/f$a;->b:Ln9/a;

    .line 18
    .line 19
    invoke-virtual {p0}, Lg9/f;->h()Li9/n;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v2, Li9/q$a;

    .line 27
    .line 28
    invoke-direct {v2, v0, p1, v1}, Li9/q$a;-><init>(Li9/q;Ln9/a;Li9/n;)V

    .line 29
    .line 30
    .line 31
    return-object v2
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

.method public final c(Lg9/f$a;)Li9/e;
    .locals 4

    .line 1
    new-instance v0, Li9/e;

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
    iget-object p1, p1, Lg9/f$a;->b:Ln9/a;

    .line 14
    .line 15
    invoke-virtual {p0}, Lg9/f;->h()Li9/n;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v0, v1, p1, v2}, Li9/e;-><init>(Le9/a;Ln9/a;Li9/n;)V

    .line 20
    .line 21
    .line 22
    return-object v0
    .line 23
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

.method public final e(Lg9/f$a;)Le9/a;
    .locals 7

    .line 1
    new-instance v4, Li9/i;

    .line 2
    .line 3
    iget-object v0, p0, Lg9/f;->b:Lm9/c0;

    .line 4
    .line 5
    iget-object v0, v0, Lm9/c0;->b:Lm9/e0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v2, "remoteSerializer not initialized yet"

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lx6/b;->a0(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v4, v0}, Li9/i;-><init>(Lm9/e0;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lg9/f;->a:Lcom/google/firebase/firestore/g;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/firebase/firestore/g;->a()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    new-instance v5, Li9/q$b;

    .line 25
    .line 26
    invoke-direct {v5, v0, v1}, Li9/q$b;-><init>(J)V

    .line 27
    .line 28
    .line 29
    new-instance v6, Li9/y0;

    .line 30
    .line 31
    iget-object v1, p1, Lg9/f$a;->a:Landroid/content/Context;

    .line 32
    .line 33
    iget-object p1, p1, Lg9/f$a;->c:Lg9/h;

    .line 34
    .line 35
    iget-object v2, p1, Lg9/h;->b:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lg9/h;->a:Lj9/f;

    .line 38
    .line 39
    move-object v0, v6

    .line 40
    invoke-direct/range {v0 .. v5}, Li9/y0;-><init>(Landroid/content/Context;Ljava/lang/String;Lj9/f;Li9/i;Li9/q$b;)V

    .line 41
    .line 42
    .line 43
    return-object v6
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
