.class public La4/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La4/j$a;
    }
.end annotation


# instance fields
.field public final a:La4/i;

.field public final b:La4/l;

.field public c:La4/k;

.field public final d:Ljava/util/List;

.field public final e:La4/f;


# direct methods
.method public constructor <init>(La4/i;La4/k;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La4/j;->a:La4/i;

    .line 5
    .line 6
    new-instance v0, Lb4/b;

    .line 7
    .line 8
    invoke-virtual {p1}, La4/i;->c()Ld4/h;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Lb4/b;-><init>(Ld4/h;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, La4/i;->d()La4/h;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, La4/h;->j()Lb4/d;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, La4/l;

    .line 24
    .line 25
    invoke-direct {v2, v1}, La4/l;-><init>(Lb4/d;)V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, La4/j;->b:La4/l;

    .line 29
    .line 30
    invoke-virtual {p2}, La4/k;->d()La4/a;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {p2}, La4/k;->c()La4/a;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-static {}, Ld4/g;->W()Ld4/g;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {p1}, La4/i;->c()Ld4/h;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {v3, v4}, Ld4/i;->f(Ld4/n;Ld4/h;)Ld4/i;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v2}, La4/a;->a()Ld4/i;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-virtual {v0, v3, v4, v5}, Lb4/b;->f(Ld4/i;Ld4/i;Lb4/a;)Ld4/i;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {p2}, La4/a;->a()Ld4/i;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-interface {v1, v3, v6, v5}, Lb4/d;->f(Ld4/i;Ld4/i;Lb4/a;)Ld4/i;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    new-instance v5, La4/a;

    .line 68
    .line 69
    invoke-virtual {v2}, La4/a;->f()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-virtual {v0}, Lb4/b;->d()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-direct {v5, v4, v2, v0}, La4/a;-><init>(Ld4/i;ZZ)V

    .line 78
    .line 79
    .line 80
    new-instance v0, La4/a;

    .line 81
    .line 82
    invoke-virtual {p2}, La4/a;->f()Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-interface {v1}, Lb4/d;->d()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-direct {v0, v3, p2, v1}, La4/a;-><init>(Ld4/i;ZZ)V

    .line 91
    .line 92
    .line 93
    new-instance p2, La4/k;

    .line 94
    .line 95
    invoke-direct {p2, v0, v5}, La4/k;-><init>(La4/a;La4/a;)V

    .line 96
    .line 97
    .line 98
    iput-object p2, p0, La4/j;->c:La4/k;

    .line 99
    .line 100
    new-instance p2, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object p2, p0, La4/j;->d:Ljava/util/List;

    .line 106
    .line 107
    new-instance p2, La4/f;

    .line 108
    .line 109
    invoke-direct {p2, p1}, La4/f;-><init>(La4/i;)V

    .line 110
    .line 111
    .line 112
    iput-object p2, p0, La4/j;->e:La4/f;

    .line 113
    .line 114
    return-void
.end method


# virtual methods
.method public a(LV3/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, La4/j;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(LW3/d;LV3/G;Ld4/n;)La4/j$a;
    .locals 4

    .line 1
    invoke-virtual {p1}, LW3/d;->c()LW3/d$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LW3/d$a;->p:LW3/d$a;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-ne v0, v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {p1}, LW3/d;->b()LW3/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LW3/e;->b()La4/h;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, La4/j;->c:La4/k;

    .line 22
    .line 23
    invoke-virtual {v0}, La4/k;->b()Ld4/n;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    move v0, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v2

    .line 32
    :goto_0
    const-string v1, "We should always have a full cache before handling merges"

    .line 33
    .line 34
    invoke-static {v0, v1}, LY3/m;->g(ZLjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, La4/j;->c:La4/k;

    .line 38
    .line 39
    invoke-virtual {v0}, La4/k;->a()Ld4/n;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    move v0, v3

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v0, v2

    .line 48
    :goto_1
    const-string v1, "Missing event cache, even though we have a server cache"

    .line 49
    .line 50
    invoke-static {v0, v1}, LY3/m;->g(ZLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object v0, p0, La4/j;->c:La4/k;

    .line 54
    .line 55
    iget-object v1, p0, La4/j;->b:La4/l;

    .line 56
    .line 57
    invoke-virtual {v1, v0, p1, p2, p3}, La4/l;->b(La4/k;LW3/d;LV3/G;Ld4/n;)La4/l$c;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object p2, p1, La4/l$c;->a:La4/k;

    .line 62
    .line 63
    invoke-virtual {p2}, La4/k;->d()La4/a;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2}, La4/a;->f()Z

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-nez p2, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0}, La4/k;->d()La4/a;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p2}, La4/a;->f()Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-nez p2, :cond_4

    .line 82
    .line 83
    :cond_3
    move v2, v3

    .line 84
    :cond_4
    const-string p2, "Once a server snap is complete, it should never go back"

    .line 85
    .line 86
    invoke-static {v2, p2}, LY3/m;->g(ZLjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object p2, p1, La4/l$c;->a:La4/k;

    .line 90
    .line 91
    iput-object p2, p0, La4/j;->c:La4/k;

    .line 92
    .line 93
    iget-object p3, p1, La4/l$c;->b:Ljava/util/List;

    .line 94
    .line 95
    invoke-virtual {p2}, La4/k;->c()La4/a;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2}, La4/a;->a()Ld4/i;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    const/4 v0, 0x0

    .line 104
    invoke-virtual {p0, p3, p2, v0}, La4/j;->c(Ljava/util/List;Ld4/i;LV3/h;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    new-instance p3, La4/j$a;

    .line 109
    .line 110
    iget-object p1, p1, La4/l$c;->b:Ljava/util/List;

    .line 111
    .line 112
    invoke-direct {p3, p2, p1}, La4/j$a;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 113
    .line 114
    .line 115
    return-object p3
.end method

.method public final c(Ljava/util/List;Ld4/i;LV3/h;)Ljava/util/List;
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    iget-object p3, p0, La4/j;->d:Ljava/util/List;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    new-array v0, v0, [LV3/h;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aput-object p3, v0, v1

    .line 11
    .line 12
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    :goto_0
    iget-object v0, p0, La4/j;->e:La4/f;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, p3}, La4/f;->d(Ljava/util/List;Ld4/i;Ljava/util/List;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public d()Ld4/n;
    .locals 1

    .line 1
    iget-object v0, p0, La4/j;->c:La4/k;

    .line 2
    .line 3
    invoke-virtual {v0}, La4/k;->a()Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public e(LV3/k;)Ld4/n;
    .locals 2

    .line 1
    iget-object v0, p0, La4/j;->c:La4/k;

    .line 2
    .line 3
    invoke-virtual {v0}, La4/k;->b()Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, La4/j;->a:La4/i;

    .line 10
    .line 11
    invoke-virtual {v1}, La4/i;->g()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, LV3/k;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, LV3/k;->Z()Ld4/b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v0, v1}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v1}, Ld4/n;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    :cond_0
    invoke-interface {v0, p1}, Ld4/n;->A(LV3/k;)Ld4/n;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_1
    const/4 p1, 0x0

    .line 43
    return-object p1
.end method

.method public f()Ld4/n;
    .locals 1

    .line 1
    iget-object v0, p0, La4/j;->c:La4/k;

    .line 2
    .line 3
    invoke-virtual {v0}, La4/k;->c()La4/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, La4/a;->b()Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public g(LV3/h;)Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, La4/j;->c:La4/k;

    .line 2
    .line 3
    invoke-virtual {v0}, La4/k;->c()La4/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, La4/a;->b()Ld4/n;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ld4/m;

    .line 31
    .line 32
    invoke-virtual {v3}, Ld4/m;->c()Ld4/b;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v3}, Ld4/m;->d()Ld4/n;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v4, v3}, La4/c;->c(Ld4/b;Ld4/n;)La4/c;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v0}, La4/a;->f()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0}, La4/a;->a()Ld4/i;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2}, La4/c;->n(Ld4/i;)La4/c;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {v0}, La4/a;->a()Ld4/i;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p0, v1, v0, p1}, La4/j;->c(Ljava/util/List;Ld4/i;LV3/h;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1
.end method

.method public h()La4/i;
    .locals 1

    .line 1
    iget-object v0, p0, La4/j;->a:La4/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Ld4/n;
    .locals 1

    .line 1
    iget-object v0, p0, La4/j;->c:La4/k;

    .line 2
    .line 3
    invoke-virtual {v0}, La4/k;->d()La4/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, La4/a;->b()Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-object v0, p0, La4/j;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public k(LV3/h;LQ3/c;)Ljava/util/List;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v0

    .line 14
    :goto_0
    const-string v3, "A cancel should cancel all event registrations"

    .line 15
    .line 16
    invoke-static {v2, v3}, LY3/m;->g(ZLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, La4/j;->a:La4/i;

    .line 20
    .line 21
    invoke-virtual {v2}, La4/i;->e()LV3/k;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, p0, La4/j;->d:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, LV3/h;

    .line 42
    .line 43
    new-instance v5, La4/b;

    .line 44
    .line 45
    invoke-direct {v5, v4, p2, v2}, La4/b;-><init>(LV3/h;LQ3/c;LV3/k;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_2
    if-eqz p1, :cond_6

    .line 57
    .line 58
    const/4 p2, -0x1

    .line 59
    move v2, p2

    .line 60
    :goto_2
    iget-object v3, p0, La4/j;->d:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-ge v0, v3, :cond_5

    .line 67
    .line 68
    iget-object v3, p0, La4/j;->d:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, LV3/h;

    .line 75
    .line 76
    invoke-virtual {v3, p1}, LV3/h;->f(LV3/h;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    invoke-virtual {v3}, LV3/h;->h()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    move v2, v0

    .line 90
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_5
    move v0, v2

    .line 94
    :goto_3
    if-eq v0, p2, :cond_8

    .line 95
    .line 96
    iget-object p1, p0, La4/j;->d:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, LV3/h;

    .line 103
    .line 104
    iget-object p2, p0, La4/j;->d:Ljava/util/List;

    .line 105
    .line 106
    invoke-interface {p2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, LV3/h;->l()V

    .line 110
    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_6
    iget-object p1, p0, La4/j;->d:Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-eqz p2, :cond_7

    .line 124
    .line 125
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    check-cast p2, LV3/h;

    .line 130
    .line 131
    invoke-virtual {p2}, LV3/h;->l()V

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_7
    iget-object p1, p0, La4/j;->d:Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 138
    .line 139
    .line 140
    :cond_8
    :goto_5
    return-object v1
.end method
