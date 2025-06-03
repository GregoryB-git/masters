.class public LV3/a;
.super LV3/h;
.source "SourceFile"


# instance fields
.field public final d:LV3/m;

.field public final e:LQ3/a;

.field public final f:La4/i;


# direct methods
.method public constructor <init>(LV3/m;LQ3/a;La4/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LV3/h;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/a;->d:LV3/m;

    .line 5
    .line 6
    iput-object p2, p0, LV3/a;->e:LQ3/a;

    .line 7
    .line 8
    iput-object p3, p0, LV3/a;->f:La4/i;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(La4/i;)LV3/h;
    .locals 3

    .line 1
    new-instance v0, LV3/a;

    .line 2
    .line 3
    iget-object v1, p0, LV3/a;->d:LV3/m;

    .line 4
    .line 5
    iget-object v2, p0, LV3/a;->e:LQ3/a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, LV3/a;-><init>(LV3/m;LQ3/a;La4/i;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public b(La4/c;La4/i;)La4/d;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/a;->d:LV3/m;

    .line 2
    .line 3
    invoke-virtual {p2}, La4/i;->e()LV3/k;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p1}, La4/c;->i()Ld4/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p2, v1}, LV3/k;->U(Ld4/b;)LV3/k;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {v0, p2}, LQ3/k;->c(LV3/m;LV3/k;)LQ3/e;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1}, La4/c;->k()Ld4/i;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {p2, v0}, LQ3/k;->a(LQ3/e;Ld4/i;)LQ3/b;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1}, La4/c;->m()Ld4/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, La4/c;->m()Ld4/b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ld4/b;->e()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    :goto_0
    new-instance v1, La4/d;

    .line 44
    .line 45
    invoke-virtual {p1}, La4/c;->j()La4/e$a;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {v1, p1, p0, p2, v0}, La4/d;-><init>(La4/e$a;LV3/h;LQ3/b;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method public c(LQ3/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LV3/a;->e:LQ3/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LQ3/a;->a(LQ3/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(La4/d;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV3/h;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, LV3/a$a;->a:[I

    .line 9
    .line 10
    invoke-virtual {p1}, La4/d;->b()La4/e$a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    aget v0, v0, v1

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    if-eq v0, v1, :cond_4

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    if-eq v0, v1, :cond_3

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    if-eq v0, v1, :cond_2

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    if-eq v0, v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v0, p0, LV3/a;->e:LQ3/a;

    .line 34
    .line 35
    invoke-virtual {p1}, La4/d;->e()LQ3/b;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {v0, p1}, LQ3/a;->c(LQ3/b;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iget-object v0, p0, LV3/a;->e:LQ3/a;

    .line 44
    .line 45
    invoke-virtual {p1}, La4/d;->e()LQ3/b;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p1}, La4/d;->d()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {v0, v1, p1}, LQ3/a;->d(LQ3/b;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    iget-object v0, p0, LV3/a;->e:LQ3/a;

    .line 58
    .line 59
    invoke-virtual {p1}, La4/d;->e()LQ3/b;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {p1}, La4/d;->d()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-interface {v0, v1, p1}, LQ3/a;->e(LQ3/b;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    iget-object v0, p0, LV3/a;->e:LQ3/a;

    .line 72
    .line 73
    invoke-virtual {p1}, La4/d;->e()LQ3/b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {p1}, La4/d;->d()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-interface {v0, v1, p1}, LQ3/a;->f(LQ3/b;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    return-void
.end method

.method public e()La4/i;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/a;->f:La4/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LV3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LV3/a;

    .line 6
    .line 7
    iget-object v0, p1, LV3/a;->e:LQ3/a;

    .line 8
    .line 9
    iget-object v1, p0, LV3/a;->e:LQ3/a;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, LV3/a;->d:LV3/m;

    .line 18
    .line 19
    iget-object v1, p0, LV3/a;->d:LV3/m;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object p1, p1, LV3/a;->f:La4/i;

    .line 28
    .line 29
    iget-object v0, p0, LV3/a;->f:La4/i;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, La4/i;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    :goto_0
    return p1
.end method

.method public f(LV3/h;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LV3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LV3/a;

    .line 6
    .line 7
    iget-object p1, p1, LV3/a;->e:LQ3/a;

    .line 8
    .line 9
    iget-object v0, p0, LV3/a;->e:LQ3/a;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, LV3/a;->e:LQ3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, LV3/a;->d:LV3/m;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, LV3/a;->f:La4/i;

    .line 19
    .line 20
    invoke-virtual {v1}, La4/i;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    return v0
.end method

.method public i(La4/e$a;)Z
    .locals 1

    .line 1
    sget-object v0, La4/e$a;->s:La4/e$a;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ChildEventRegistration"

    .line 2
    .line 3
    return-object v0
.end method
