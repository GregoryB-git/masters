.class public LQ3/e;
.super LQ3/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ3/e$e;
    }
.end annotation


# direct methods
.method public constructor <init>(LV3/m;LV3/k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LQ3/p;-><init>(LV3/m;LV3/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public W(Ljava/lang/String;)LQ3/e;
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LV3/k;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, LY3/n;->i(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p1}, LY3/n;->h(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, LV3/k;

    .line 25
    .line 26
    invoke-direct {v1, p1}, LV3/k;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, LV3/k;->T(LV3/k;)LV3/k;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v0, LQ3/e;

    .line 34
    .line 35
    iget-object v1, p0, LQ3/p;->a:LV3/m;

    .line 36
    .line 37
    invoke-direct {v0, v1, p1}, LQ3/e;-><init>(LV3/m;LV3/k;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 42
    .line 43
    const-string v0, "Can\'t pass null for argument \'pathString\' in child()"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1
.end method

.method public X()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

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
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LV3/k;->X()Ld4/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ld4/b;->e()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public Y()LQ3/e;
    .locals 3

    .line 1
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LV3/k;->a0()LV3/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, LQ3/e;

    .line 12
    .line 13
    iget-object v2, p0, LQ3/p;->a:LV3/m;

    .line 14
    .line 15
    invoke-direct {v1, v2, v0}, LQ3/e;-><init>(LV3/m;LV3/k;)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public Z()LQ3/n;
    .locals 3

    .line 1
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LY3/n;->l(LV3/k;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LQ3/n;

    .line 9
    .line 10
    iget-object v1, p0, LQ3/p;->a:LV3/m;

    .line 11
    .line 12
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v0, v1, v2}, LQ3/n;-><init>(LV3/m;LV3/k;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public a0(LQ3/r$b;Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LY3/n;->l(LV3/k;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LQ3/p;->a:LV3/m;

    .line 11
    .line 12
    new-instance v1, LQ3/e$d;

    .line 13
    .line 14
    invoke-direct {v1, p0, p1, p2}, LQ3/e$d;-><init>(LQ3/e;LQ3/r$b;Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 22
    .line 23
    const-string p2, "Can\'t pass null for argument \'handler\' in runTransaction()"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public b0(Ljava/lang/Object;)LV2/j;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/p;->b:LV3/k;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ld4/r;->c(LV3/k;Ljava/lang/Object;)Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, v0}, LQ3/e;->c0(Ld4/n;LQ3/e$e;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final c0(Ld4/n;LQ3/e$e;)LV2/j;
    .locals 2

    .line 1
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LY3/n;->l(LV3/k;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, LY3/m;->l(LQ3/e$e;)LY3/g;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iget-object v0, p0, LQ3/p;->a:LV3/m;

    .line 13
    .line 14
    new-instance v1, LQ3/e$b;

    .line 15
    .line 16
    invoke-direct {v1, p0, p1, p2}, LQ3/e$b;-><init>(LQ3/e;Ld4/n;LY3/g;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, LY3/g;->a()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, LV2/j;

    .line 27
    .line 28
    return-object p1
.end method

.method public d0(Ljava/lang/Object;)LV2/j;
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/p;->b:LV3/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ld4/r;->c(LV3/k;Ljava/lang/Object;)Ld4/n;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0, p1, v0, v1}, LQ3/e;->f0(Ljava/lang/Object;Ld4/n;LQ3/e$e;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public e0(Ljava/lang/Object;Ljava/lang/Object;)LV2/j;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/p;->b:LV3/k;

    .line 2
    .line 3
    invoke-static {v0, p2}, Ld4/r;->c(LV3/k;Ljava/lang/Object;)Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, p2, v0}, LQ3/e;->f0(Ljava/lang/Object;Ld4/n;LQ3/e$e;)LV2/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LQ3/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LQ3/e;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    return p1
.end method

.method public final f0(Ljava/lang/Object;Ld4/n;LQ3/e$e;)LV2/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LY3/n;->l(LV3/k;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0, p1}, LV3/C;->g(LV3/k;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, LZ3/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, LY3/n;->k(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Ld4/o;->b(Ljava/lang/Object;Ld4/n;)Ld4/n;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p3}, LY3/m;->l(LQ3/e$e;)LY3/g;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iget-object p3, p0, LQ3/p;->a:LV3/m;

    .line 31
    .line 32
    new-instance v0, LQ3/e$a;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1, p2}, LQ3/e$a;-><init>(LQ3/e;Ld4/n;LY3/g;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3, v0}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, LY3/g;->a()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, LV2/j;

    .line 45
    .line 46
    return-object p1
.end method

.method public g0(Ljava/util/Map;)LV2/j;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LQ3/e;->h0(Ljava/util/Map;LQ3/e$e;)LV2/j;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public final h0(Ljava/util/Map;LQ3/e$e;)LV2/j;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, LZ3/a;->c(Ljava/util/Map;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, LQ3/p;->s()LV3/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0, p1}, LY3/n;->e(LV3/k;Ljava/util/Map;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, LV3/b;->D(Ljava/util/Map;)LV3/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p2}, LY3/m;->l(LQ3/e$e;)LY3/g;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget-object v1, p0, LQ3/p;->a:LV3/m;

    .line 24
    .line 25
    new-instance v2, LQ3/e$c;

    .line 26
    .line 27
    invoke-direct {v2, p0, v0, p2, p1}, LQ3/e$c;-><init>(LQ3/e;LV3/b;LY3/g;Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, LY3/g;->a()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, LV2/j;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 41
    .line 42
    const-string p2, "Can\'t pass null for argument \'update\' in updateChildren()"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LQ3/e;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, LQ3/e;->Y()LQ3/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LQ3/p;->a:LV3/m;

    .line 8
    .line 9
    invoke-virtual {v0}, LV3/m;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, LQ3/e;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, "/"

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, LQ3/e;->X()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v2, "UTF-8"

    .line 36
    .line 37
    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v2, "+"

    .line 42
    .line 43
    const-string v3, "%20"

    .line 44
    .line 45
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    return-object v0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    new-instance v1, LQ3/d;

    .line 59
    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v3, "Failed to URLEncode key: "

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, LQ3/e;->X()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {v1, v2, v0}, LQ3/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    throw v1
.end method
