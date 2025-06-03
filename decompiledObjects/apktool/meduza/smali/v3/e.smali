.class public abstract Lv3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/f1;


# instance fields
.field public final a:Lv3/r1$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv3/r1$c;

    invoke-direct {v0}, Lv3/r1$c;-><init>()V

    iput-object v0, p0, Lv3/e;->a:Lv3/r1$c;

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 3

    move-object v0, p0

    check-cast v0, Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->J()Lv3/r1;

    move-result-object v1

    invoke-virtual {v1}, Lv3/r1;->p()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lv3/d0;->F()I

    move-result v0

    iget-object v2, p0, Lv3/e;->a:Lv3/r1$c;

    invoke-virtual {v1, v0, v2}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    move-result-object v0

    iget-boolean v0, v0, Lv3/r1$c;->p:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final C()Z
    .locals 2

    invoke-virtual {p0}, Lv3/e;->e()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final D()Z
    .locals 3

    move-object v0, p0

    check-cast v0, Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->d()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lv3/d0;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lv3/d0;->I()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final G(I)Z
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lv3/d0;

    .line 3
    .line 4
    invoke-virtual {v0}, Lv3/d0;->u0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, v0, Lv3/d0;->N:Lv3/f1$a;

    .line 8
    .line 9
    iget-object v0, v0, Lv3/f1$a;->a:Lv5/h;

    .line 10
    .line 11
    iget-object v0, v0, Lv5/h;->a:Landroid/util/SparseBooleanArray;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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

.method public final H()Z
    .locals 3

    move-object v0, p0

    check-cast v0, Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->J()Lv3/r1;

    move-result-object v1

    invoke-virtual {v1}, Lv3/r1;->p()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lv3/d0;->F()I

    move-result v0

    iget-object v2, p0, Lv3/e;->a:Lv3/r1$c;

    invoke-virtual {v1, v0, v2}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    move-result-object v0

    iget-boolean v0, v0, Lv3/r1$c;->q:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final M()V
    .locals 4

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lv3/d0;

    .line 3
    .line 4
    invoke-virtual {v0}, Lv3/d0;->J()Lv3/r1;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Lv3/r1;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_4

    .line 13
    .line 14
    invoke-virtual {v0}, Lv3/d0;->g()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lv3/e;->C()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0x9

    .line 26
    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    invoke-virtual {p0}, Lv3/e;->e()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v3, -0x1

    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0}, Lv3/d0;->F()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-ne v1, v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Lv3/d0;->F()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-virtual {p0, v0, v1, v2, v3}, Lv3/e;->S(IJZ)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {p0, v1, v2}, Lv3/e;->U(II)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-virtual {p0}, Lv3/e;->Q()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Lv3/e;->H()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0}, Lv3/d0;->F()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-virtual {p0, v0, v2}, Lv3/e;->U(II)V

    .line 78
    .line 79
    .line 80
    :cond_4
    :goto_0
    return-void
    .line 81
    .line 82
    .line 83
.end method

.method public final N()V
    .locals 3

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lv3/d0;

    .line 3
    .line 4
    invoke-virtual {v0}, Lv3/d0;->u0()V

    .line 5
    .line 6
    .line 7
    iget-wide v0, v0, Lv3/d0;->v:J

    .line 8
    .line 9
    const/16 v2, 0xc

    .line 10
    .line 11
    invoke-virtual {p0, v2, v0, v1}, Lv3/e;->V(IJ)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final O()V
    .locals 3

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lv3/d0;

    .line 3
    .line 4
    invoke-virtual {v0}, Lv3/d0;->u0()V

    .line 5
    .line 6
    .line 7
    iget-wide v0, v0, Lv3/d0;->u:J

    .line 8
    .line 9
    neg-long v0, v0

    .line 10
    const/16 v2, 0xb

    .line 11
    .line 12
    invoke-virtual {p0, v2, v0, v1}, Lv3/e;->V(IJ)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final Q()Z
    .locals 3

    move-object v0, p0

    check-cast v0, Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->J()Lv3/r1;

    move-result-object v1

    invoke-virtual {v1}, Lv3/r1;->p()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lv3/d0;->F()I

    move-result v0

    iget-object v2, p0, Lv3/e;->a:Lv3/r1$c;

    invoke-virtual {v1, v0, v2}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    move-result-object v0

    invoke-virtual {v0}, Lv3/r1$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final R()I
    .locals 5

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lv3/d0;

    .line 3
    .line 4
    invoke-virtual {v0}, Lv3/d0;->J()Lv3/r1;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Lv3/r1;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0}, Lv3/d0;->F()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0}, Lv3/d0;->u0()V

    .line 21
    .line 22
    .line 23
    iget v3, v0, Lv3/d0;->F:I

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    if-ne v3, v4, :cond_1

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    :cond_1
    invoke-virtual {v0}, Lv3/d0;->u0()V

    .line 30
    .line 31
    .line 32
    iget-boolean v0, v0, Lv3/d0;->G:Z

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3, v0}, Lv3/r1;->k(IIZ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    :goto_0
    return v0
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public abstract S(IJZ)V
.end method

.method public final T(IJ)V
    .locals 1

    move-object p1, p0

    check-cast p1, Lv3/d0;

    invoke-virtual {p1}, Lv3/d0;->F()I

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lv3/e;->S(IJZ)V

    return-void
.end method

.method public final U(II)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 p2, 0x0

    invoke-virtual {p0, p1, v0, v1, p2}, Lv3/e;->S(IJZ)V

    return-void
.end method

.method public final V(IJ)V
    .locals 5

    move-object v0, p0

    check-cast v0, Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->P()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-virtual {v0}, Lv3/d0;->getDuration()J

    move-result-wide p2

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p2, v3

    if-eqz v0, :cond_0

    invoke-static {v1, v2, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    :cond_0
    const-wide/16 p2, 0x0

    invoke-static {v1, v2, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    invoke-virtual {p0, p1, p2, p3}, Lv3/e;->T(IJ)V

    return-void
.end method

.method public final W()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lv3/e;->R()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    move-object v1, p0

    .line 10
    check-cast v1, Lv3/d0;

    .line 11
    .line 12
    invoke-virtual {v1}, Lv3/d0;->F()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1}, Lv3/d0;->F()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {p0, v0, v1, v2, v3}, Lv3/e;->S(IJZ)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x7

    .line 33
    invoke-virtual {p0, v0, v1}, Lv3/e;->U(II)V

    .line 34
    .line 35
    .line 36
    :goto_0
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final b()V
    .locals 2

    move-object v0, p0

    check-cast v0, Lv3/d0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lv3/d0;->m0(Z)V

    return-void
.end method

.method public final e()I
    .locals 5

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lv3/d0;

    .line 3
    .line 4
    invoke-virtual {v0}, Lv3/d0;->J()Lv3/r1;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Lv3/r1;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0}, Lv3/d0;->F()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0}, Lv3/d0;->u0()V

    .line 21
    .line 22
    .line 23
    iget v3, v0, Lv3/d0;->F:I

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    if-ne v3, v4, :cond_1

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    :cond_1
    invoke-virtual {v0}, Lv3/d0;->u0()V

    .line 30
    .line 31
    .line 32
    iget-boolean v0, v0, Lv3/d0;->G:Z

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3, v0}, Lv3/r1;->e(IIZ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    :goto_0
    return v0
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final j(IJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lv3/e;->S(IJZ)V

    return-void
.end method

.method public final l()V
    .locals 11

    move-object v0, p0

    check-cast v0, Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->u0()V

    iget-object v1, v0, Lv3/d0;->o:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const v2, 0x7fffffff

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-lez v1, :cond_1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, Lv3/d0;->i0(I)Lv3/d1;

    move-result-object v1

    iget-object v2, v1, Lv3/d1;->b:Lz4/t$b;

    iget-object v2, v2, Lz4/s;->a:Ljava/lang/Object;

    iget-object v3, v0, Lv3/d0;->e0:Lv3/d1;

    iget-object v3, v3, Lv3/d1;->b:Lz4/t$b;

    iget-object v3, v3, Lz4/s;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v5, v2, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x4

    invoke-virtual {v0, v1}, Lv3/d0;->a0(Lv3/d1;)J

    move-result-wide v7

    const/4 v9, -0x1

    const/4 v10, 0x0

    invoke-virtual/range {v0 .. v10}, Lv3/d0;->s0(Lv3/d1;IIZZIJIZ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final m()Lv3/o0;
    .locals 3

    move-object v0, p0

    check-cast v0, Lv3/d0;

    invoke-virtual {v0}, Lv3/d0;->J()Lv3/r1;

    move-result-object v1

    invoke-virtual {v1}, Lv3/r1;->p()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lv3/d0;->F()I

    move-result v0

    iget-object v2, p0, Lv3/e;->a:Lv3/r1$c;

    invoke-virtual {v1, v0, v2}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    move-result-object v0

    iget-object v0, v0, Lv3/r1$c;->c:Lv3/o0;

    :goto_0
    return-object v0
.end method

.method public final pause()V
    .locals 2

    move-object v0, p0

    check-cast v0, Lv3/d0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lv3/d0;->m0(Z)V

    return-void
.end method

.method public final q()Z
    .locals 2

    invoke-virtual {p0}, Lv3/e;->R()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final t()V
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lv3/d0;

    .line 3
    .line 4
    invoke-virtual {v0}, Lv3/d0;->J()Lv3/r1;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Lv3/r1;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_3

    .line 13
    .line 14
    invoke-virtual {v0}, Lv3/d0;->g()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lv3/e;->q()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p0}, Lv3/e;->Q()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x7

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lv3/e;->A()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Lv3/d0;->P()J

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    invoke-virtual {v0}, Lv3/d0;->u0()V

    .line 48
    .line 49
    .line 50
    const-wide/16 v4, 0xbb8

    .line 51
    .line 52
    cmp-long v0, v1, v4

    .line 53
    .line 54
    if-gtz v0, :cond_2

    .line 55
    .line 56
    :goto_0
    invoke-virtual {p0}, Lv3/e;->W()V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const-wide/16 v0, 0x0

    .line 61
    .line 62
    invoke-virtual {p0, v3, v0, v1}, Lv3/e;->T(IJ)V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_1
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final w(I)V
    .locals 1

    const/16 v0, 0xa

    invoke-virtual {p0, p1, v0}, Lv3/e;->U(II)V

    return-void
.end method
