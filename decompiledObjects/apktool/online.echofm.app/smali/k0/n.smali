.class public abstract Lk0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk0/Y0;
.implements Lk0/a1;


# instance fields
.field public A:J

.field public B:Z

.field public C:Z

.field public D:Ld0/I;

.field public E:Lk0/a1$a;

.field public final o:Ljava/lang/Object;

.field public final p:I

.field public final q:Lk0/v0;

.field public r:Lk0/b1;

.field public s:I

.field public t:Ll0/y1;

.field public u:Lg0/c;

.field public v:I

.field public w:Lx0/Q;

.field public x:[Ld0/q;

.field public y:J

.field public z:J


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk0/n;->o:Ljava/lang/Object;

    .line 10
    .line 11
    iput p1, p0, Lk0/n;->p:I

    .line 12
    .line 13
    new-instance p1, Lk0/v0;

    .line 14
    .line 15
    invoke-direct {p1}, Lk0/v0;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lk0/n;->q:Lk0/v0;

    .line 19
    .line 20
    const-wide/high16 v0, -0x8000000000000000L

    .line 21
    .line 22
    iput-wide v0, p0, Lk0/n;->A:J

    .line 23
    .line 24
    sget-object p1, Ld0/I;->a:Ld0/I;

    .line 25
    .line 26
    iput-object p1, p0, Lk0/n;->D:Ld0/I;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk0/n;->B:Z

    .line 2
    .line 3
    return v0
.end method

.method public B()Lk0/A0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final C(Lk0/b1;[Ld0/q;Lx0/Q;JZZJJLx0/x$b;)V
    .locals 10

    .line 1
    move-object v8, p0

    .line 2
    move/from16 v9, p6

    .line 3
    .line 4
    iget v0, v8, Lk0/n;->v:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    move v0, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 13
    .line 14
    .line 15
    move-object v0, p1

    .line 16
    iput-object v0, v8, Lk0/n;->r:Lk0/b1;

    .line 17
    .line 18
    iput v1, v8, Lk0/n;->v:I

    .line 19
    .line 20
    move/from16 v0, p7

    .line 21
    .line 22
    invoke-virtual {p0, v9, v0}, Lk0/n;->U(ZZ)V

    .line 23
    .line 24
    .line 25
    move-object v0, p0

    .line 26
    move-object v1, p2

    .line 27
    move-object v2, p3

    .line 28
    move-wide/from16 v3, p8

    .line 29
    .line 30
    move-wide/from16 v5, p10

    .line 31
    .line 32
    move-object/from16 v7, p12

    .line 33
    .line 34
    invoke-virtual/range {v0 .. v7}, Lk0/n;->F([Ld0/q;Lx0/Q;JJLx0/x$b;)V

    .line 35
    .line 36
    .line 37
    move-wide/from16 v0, p8

    .line 38
    .line 39
    invoke-virtual {p0, v0, v1, v9}, Lk0/n;->f0(JZ)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final D(ILl0/y1;Lg0/c;)V
    .locals 0

    .line 1
    iput p1, p0, Lk0/n;->s:I

    .line 2
    .line 3
    iput-object p2, p0, Lk0/n;->t:Ll0/y1;

    .line 4
    .line 5
    iput-object p3, p0, Lk0/n;->u:Lg0/c;

    .line 6
    .line 7
    invoke-virtual {p0}, Lk0/n;->V()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final E(Ld0/I;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/n;->D:Ld0/I;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lg0/M;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lk0/n;->D:Ld0/I;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lk0/n;->d0(Ld0/I;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final F([Ld0/q;Lx0/Q;JJLx0/x$b;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lk0/n;->B:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lk0/n;->w:Lx0/Q;

    .line 9
    .line 10
    iget-wide v0, p0, Lk0/n;->A:J

    .line 11
    .line 12
    const-wide/high16 v2, -0x8000000000000000L

    .line 13
    .line 14
    cmp-long p2, v0, v2

    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    iput-wide p3, p0, Lk0/n;->A:J

    .line 19
    .line 20
    :cond_0
    iput-object p1, p0, Lk0/n;->x:[Ld0/q;

    .line 21
    .line 22
    iput-wide p5, p0, Lk0/n;->y:J

    .line 23
    .line 24
    move-object v0, p0

    .line 25
    move-object v1, p1

    .line 26
    move-wide v2, p3

    .line 27
    move-wide v4, p5

    .line 28
    move-object v6, p7

    .line 29
    invoke-virtual/range {v0 .. v6}, Lk0/n;->c0([Ld0/q;JJLx0/x$b;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final G()Lk0/a1;
    .locals 0

    .line 1
    return-object p0
.end method

.method public synthetic I(FF)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lk0/X0;->c(Lk0/Y0;FF)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final J(Ljava/lang/Throwable;Ld0/q;I)Lk0/u;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0, p3}, Lk0/n;->K(Ljava/lang/Throwable;Ld0/q;ZI)Lk0/u;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public final K(Ljava/lang/Throwable;Ld0/q;ZI)Lk0/u;
    .locals 9

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p0, Lk0/n;->C:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lk0/n;->C:Z

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :try_start_0
    invoke-interface {p0, p2}, Lk0/a1;->a(Ld0/q;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1}, Lk0/Z0;->h(I)I

    .line 16
    .line 17
    .line 18
    move-result v1
    :try_end_0
    .catch Lk0/u; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    iput-boolean v0, p0, Lk0/n;->C:Z

    .line 20
    .line 21
    :goto_0
    move v6, v1

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    iput-boolean v0, p0, Lk0/n;->C:Z

    .line 25
    .line 26
    throw p1

    .line 27
    :catch_0
    iput-boolean v0, p0, Lk0/n;->C:Z

    .line 28
    .line 29
    :cond_0
    const/4 v1, 0x4

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    invoke-interface {p0}, Lk0/Y0;->d()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {p0}, Lk0/n;->O()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    move-object v2, p1

    .line 40
    move-object v5, p2

    .line 41
    move v7, p3

    .line 42
    move v8, p4

    .line 43
    invoke-static/range {v2 .. v8}, Lk0/u;->b(Ljava/lang/Throwable;Ljava/lang/String;ILd0/q;IZI)Lk0/u;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method

.method public final L()Lg0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/n;->u:Lg0/c;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lg0/c;

    .line 8
    .line 9
    return-object v0
.end method

.method public final M()Lk0/b1;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/n;->r:Lk0/b1;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lk0/b1;

    .line 8
    .line 9
    return-object v0
.end method

.method public final N()Lk0/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/n;->q:Lk0/v0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/v0;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk0/n;->q:Lk0/v0;

    .line 7
    .line 8
    return-object v0
.end method

.method public final O()I
    .locals 1

    .line 1
    iget v0, p0, Lk0/n;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public final P()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lk0/n;->z:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final Q()Ll0/y1;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/n;->t:Ll0/y1;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ll0/y1;

    .line 8
    .line 9
    return-object v0
.end method

.method public final R()[Ld0/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/n;->x:[Ld0/q;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ld0/q;

    .line 8
    .line 9
    return-object v0
.end method

.method public final S()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/n;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lk0/n;->B:Z

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lk0/n;->w:Lx0/Q;

    .line 11
    .line 12
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lx0/Q;

    .line 17
    .line 18
    invoke-interface {v0}, Lx0/Q;->e()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    :goto_0
    return v0
.end method

.method public abstract T()V
.end method

.method public U(ZZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public V()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract W(JZ)V
.end method

.method public X()V
    .locals 0

    .line 1
    return-void
.end method

.method public final Y()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/n;->o:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lk0/n;->E:Lk0/a1$a;

    .line 5
    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v1, p0}, Lk0/a1$a;->a(Lk0/Y0;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v1
.end method

.method public Z()V
    .locals 0

    .line 1
    return-void
.end method

.method public a0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget v0, p0, Lk0/n;->v:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lk0/n;->q:Lk0/v0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lk0/v0;->a()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lk0/n;->Z()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public b0()V
    .locals 0

    .line 1
    return-void
.end method

.method public c0([Ld0/q;JJLx0/x$b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d0(Ld0/I;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e0(Lk0/v0;Lj0/i;I)I
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/n;->w:Lx0/Q;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/Q;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3}, Lx0/Q;->j(Lk0/v0;Lj0/i;I)I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    const/4 v0, -0x4

    .line 14
    if-ne p3, v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p2}, Lj0/a;->p()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const-wide/high16 p1, -0x8000000000000000L

    .line 23
    .line 24
    iput-wide p1, p0, Lk0/n;->A:J

    .line 25
    .line 26
    iget-boolean p1, p0, Lk0/n;->B:Z

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, -0x3

    .line 32
    :goto_0
    return v0

    .line 33
    :cond_1
    iget-wide v0, p2, Lj0/i;->t:J

    .line 34
    .line 35
    iget-wide v2, p0, Lk0/n;->y:J

    .line 36
    .line 37
    add-long/2addr v0, v2

    .line 38
    iput-wide v0, p2, Lj0/i;->t:J

    .line 39
    .line 40
    iget-wide p1, p0, Lk0/n;->A:J

    .line 41
    .line 42
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    iput-wide p1, p0, Lk0/n;->A:J

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const/4 p2, -0x5

    .line 50
    if-ne p3, p2, :cond_3

    .line 51
    .line 52
    iget-object p2, p1, Lk0/v0;->b:Ld0/q;

    .line 53
    .line 54
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    check-cast p2, Ld0/q;

    .line 59
    .line 60
    iget-wide v0, p2, Ld0/q;->s:J

    .line 61
    .line 62
    const-wide v2, 0x7fffffffffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    cmp-long v0, v0, v2

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {p2}, Ld0/q;->a()Ld0/q$b;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-wide v1, p2, Ld0/q;->s:J

    .line 76
    .line 77
    iget-wide v3, p0, Lk0/n;->y:J

    .line 78
    .line 79
    add-long/2addr v1, v3

    .line 80
    invoke-virtual {v0, v1, v2}, Ld0/q$b;->s0(J)Ld0/q$b;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p2}, Ld0/q$b;->K()Ld0/q;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iput-object p2, p1, Lk0/v0;->b:Ld0/q;

    .line 89
    .line 90
    :cond_3
    :goto_1
    return p3
.end method

.method public final f0(JZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lk0/n;->B:Z

    .line 3
    .line 4
    iput-wide p1, p0, Lk0/n;->z:J

    .line 5
    .line 6
    iput-wide p1, p0, Lk0/n;->A:J

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lk0/n;->W(JZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    iget v0, p0, Lk0/n;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v1

    .line 9
    :goto_0
    invoke-static {v2}, Lg0/a;->f(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lk0/n;->q:Lk0/v0;

    .line 13
    .line 14
    invoke-virtual {v0}, Lk0/v0;->a()V

    .line 15
    .line 16
    .line 17
    iput v1, p0, Lk0/n;->v:I

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lk0/n;->w:Lx0/Q;

    .line 21
    .line 22
    iput-object v0, p0, Lk0/n;->x:[Ld0/q;

    .line 23
    .line 24
    iput-boolean v1, p0, Lk0/n;->B:Z

    .line 25
    .line 26
    invoke-virtual {p0}, Lk0/n;->T()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public g0(J)I
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/n;->w:Lx0/Q;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/Q;

    .line 8
    .line 9
    iget-wide v1, p0, Lk0/n;->y:J

    .line 10
    .line 11
    sub-long/2addr p1, v1

    .line 12
    invoke-interface {v0, p1, p2}, Lx0/Q;->m(J)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public final getState()I
    .locals 1

    .line 1
    iget v0, p0, Lk0/n;->v:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()Lx0/Q;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/n;->w:Lx0/Q;

    .line 2
    .line 3
    return-object v0
.end method

.method public synthetic j()V
    .locals 0

    .line 1
    invoke-static {p0}, Lk0/X0;->a(Lk0/Y0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final l()I
    .locals 1

    .line 1
    iget v0, p0, Lk0/n;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public final o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/n;->o:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-object v1, p0, Lk0/n;->E:Lk0/a1$a;

    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw v1
.end method

.method public final p()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lk0/n;->A:J

    .line 2
    .line 3
    const-wide/high16 v2, -0x8000000000000000L

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    return v0
.end method

.method public synthetic q(JJ)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lk0/X0;->b(Lk0/Y0;JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method

.method public final release()V
    .locals 1

    .line 1
    iget v0, p0, Lk0/n;->v:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lk0/n;->X()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public s()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final start()V
    .locals 2

    .line 1
    iget v0, p0, Lk0/n;->v:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-static {v1}, Lg0/a;->f(Z)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    iput v0, p0, Lk0/n;->v:I

    .line 13
    .line 14
    invoke-virtual {p0}, Lk0/n;->a0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final stop()V
    .locals 3

    .line 1
    iget v0, p0, Lk0/n;->v:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 11
    .line 12
    .line 13
    iput v2, p0, Lk0/n;->v:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lk0/n;->b0()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public t(ILjava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final u()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lk0/n;->B:Z

    .line 3
    .line 4
    return-void
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/n;->w:Lx0/Q;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/Q;

    .line 8
    .line 9
    invoke-interface {v0}, Lx0/Q;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final w()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lk0/n;->A:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final x(Lk0/a1$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/n;->o:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Lk0/n;->E:Lk0/a1$a;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
.end method

.method public final z(J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lk0/n;->f0(JZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
