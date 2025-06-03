.class public Ls0/g;
.super Lk0/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/g$a;,
        Ls0/g$b;
    }
.end annotation


# instance fields
.field public final F:Ls0/c$a;

.field public final G:Lj0/i;

.field public final H:Ljava/util/ArrayDeque;

.field public I:Z

.field public J:Z

.field public K:Ls0/g$a;

.field public L:J

.field public M:J

.field public N:I

.field public O:I

.field public P:Ld0/q;

.field public Q:Ls0/c;

.field public R:Lj0/i;

.field public S:Ls0/e;

.field public T:Landroid/graphics/Bitmap;

.field public U:Z

.field public V:Ls0/g$b;

.field public W:Ls0/g$b;

.field public X:I


# direct methods
.method public constructor <init>(Ls0/c$a;Ls0/e;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Lk0/n;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Ls0/g;->F:Ls0/c$a;

    .line 6
    .line 7
    invoke-static {p2}, Ls0/g;->l0(Ls0/e;)Ls0/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Ls0/g;->S:Ls0/e;

    .line 12
    .line 13
    invoke-static {}, Lj0/i;->F()Lj0/i;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Ls0/g;->G:Lj0/i;

    .line 18
    .line 19
    sget-object p1, Ls0/g$a;->c:Ls0/g$a;

    .line 20
    .line 21
    iput-object p1, p0, Ls0/g;->K:Ls0/g$a;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Ls0/g;->H:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iput-wide p1, p0, Ls0/g;->M:J

    .line 36
    .line 37
    iput-wide p1, p0, Ls0/g;->L:J

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    iput p1, p0, Ls0/g;->N:I

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    iput p1, p0, Ls0/g;->O:I

    .line 44
    .line 45
    return-void
.end method

.method public static l0(Ls0/e;)Ls0/e;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ls0/e;->a:Ls0/e;

    .line 4
    .line 5
    :cond_0
    return-object p0
.end method

.method private q0(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, Ls0/g;->L:J

    .line 2
    .line 3
    :goto_0
    iget-object v0, p0, Ls0/g;->H:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ls0/g;->H:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ls0/g$a;

    .line 18
    .line 19
    iget-wide v0, v0, Ls0/g$a;->a:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-ltz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Ls0/g;->H:Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ls0/g$a;

    .line 32
    .line 33
    iput-object v0, p0, Ls0/g;->K:Ls0/g$a;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method


# virtual methods
.method public T()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ls0/g;->P:Ld0/q;

    .line 3
    .line 4
    sget-object v0, Ls0/g$a;->c:Ls0/g$a;

    .line 5
    .line 6
    iput-object v0, p0, Ls0/g;->K:Ls0/g$a;

    .line 7
    .line 8
    iget-object v0, p0, Ls0/g;->H:Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ls0/g;->s0()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Ls0/g;->S:Ls0/e;

    .line 17
    .line 18
    invoke-interface {v0}, Ls0/e;->b()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public U(ZZ)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/g;->O:I

    .line 2
    .line 3
    return-void
.end method

.method public W(JZ)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Ls0/g;->o0(I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Ls0/g;->J:Z

    .line 7
    .line 8
    iput-boolean p1, p0, Ls0/g;->I:Z

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    iput-object p2, p0, Ls0/g;->T:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    iput-object p2, p0, Ls0/g;->V:Ls0/g$b;

    .line 14
    .line 15
    iput-object p2, p0, Ls0/g;->W:Ls0/g$b;

    .line 16
    .line 17
    iput-boolean p1, p0, Ls0/g;->U:Z

    .line 18
    .line 19
    iput-object p2, p0, Ls0/g;->R:Lj0/i;

    .line 20
    .line 21
    iget-object p1, p0, Ls0/g;->Q:Ls0/c;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Lj0/g;->flush()V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, Ls0/g;->H:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public X()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls0/g;->s0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public Z()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls0/g;->s0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Ls0/g;->o0(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public a(Ld0/q;)I
    .locals 1

    .line 1
    iget-object v0, p0, Ls0/g;->F:Ls0/c$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ls0/c$a;->a(Ld0/q;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls0/g;->J:Z

    .line 2
    .line 3
    return v0
.end method

.method public c0([Ld0/q;JJLx0/x$b;)V
    .locals 4

    .line 1
    invoke-super/range {p0 .. p6}, Lk0/n;->c0([Ld0/q;JJLx0/x$b;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ls0/g;->K:Ls0/g$a;

    .line 5
    .line 6
    iget-wide p1, p1, Ls0/g$a;->b:J

    .line 7
    .line 8
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmp-long p1, p1, v0

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Ls0/g;->H:Ljava/util/ArrayDeque;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-wide p1, p0, Ls0/g;->M:J

    .line 26
    .line 27
    cmp-long p3, p1, v0

    .line 28
    .line 29
    if-eqz p3, :cond_1

    .line 30
    .line 31
    iget-wide v2, p0, Ls0/g;->L:J

    .line 32
    .line 33
    cmp-long p3, v2, v0

    .line 34
    .line 35
    if-eqz p3, :cond_0

    .line 36
    .line 37
    cmp-long p1, v2, p1

    .line 38
    .line 39
    if-ltz p1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object p1, p0, Ls0/g;->H:Ljava/util/ArrayDeque;

    .line 43
    .line 44
    new-instance p2, Ls0/g$a;

    .line 45
    .line 46
    iget-wide v0, p0, Ls0/g;->M:J

    .line 47
    .line 48
    invoke-direct {p2, v0, v1, p4, p5}, Ls0/g$a;-><init>(JJ)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    new-instance p1, Ls0/g$a;

    .line 56
    .line 57
    invoke-direct {p1, v0, v1, p4, p5}, Ls0/g$a;-><init>(JJ)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Ls0/g;->K:Ls0/g$a;

    .line 61
    .line 62
    :goto_1
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ImageRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Z
    .locals 2

    .line 1
    iget v0, p0, Ls0/g;->O:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, Ls0/g;->U:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 16
    :goto_1
    return v0
.end method

.method public f(JJ)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ls0/g;->J:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Ls0/g;->P:Ld0/q;

    .line 7
    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Lk0/n;->N()Lk0/v0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Ls0/g;->G:Lj0/i;

    .line 15
    .line 16
    invoke-virtual {v1}, Lj0/i;->m()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Ls0/g;->G:Lj0/i;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-virtual {p0, v0, v1, v2}, Lk0/n;->e0(Lk0/v0;Lj0/i;I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x5

    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    iget-object v0, v0, Lk0/v0;->b:Ld0/q;

    .line 30
    .line 31
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ld0/q;

    .line 36
    .line 37
    iput-object v0, p0, Ls0/g;->P:Ld0/q;

    .line 38
    .line 39
    invoke-virtual {p0}, Ls0/g;->m0()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 p1, -0x4

    .line 44
    if-ne v1, p1, :cond_2

    .line 45
    .line 46
    iget-object p1, p0, Ls0/g;->G:Lj0/i;

    .line 47
    .line 48
    invoke-virtual {p1}, Lj0/a;->p()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Lg0/a;->f(Z)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    iput-boolean p1, p0, Ls0/g;->I:Z

    .line 57
    .line 58
    iput-boolean p1, p0, Ls0/g;->J:Z

    .line 59
    .line 60
    :cond_2
    return-void

    .line 61
    :cond_3
    :goto_0
    :try_start_0
    const-string v0, "drainAndFeedDecoder"

    .line 62
    .line 63
    invoke-static {v0}, Lg0/F;->a(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :goto_1
    invoke-virtual {p0, p1, p2, p3, p4}, Ls0/g;->j0(JJ)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    :goto_2
    invoke-virtual {p0, p1, p2}, Ls0/g;->k0(J)Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    if-eqz p3, :cond_5

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_5
    invoke-static {}, Lg0/F;->b()V
    :try_end_0
    .catch Ls0/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :catch_0
    move-exception p1

    .line 85
    const/4 p2, 0x0

    .line 86
    const/16 p3, 0xfa3

    .line 87
    .line 88
    invoke-virtual {p0, p1, p2, p3}, Lk0/n;->J(Ljava/lang/Throwable;Ld0/q;I)Lk0/u;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    throw p1
.end method

.method public final h0(Ld0/q;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ls0/g;->F:Ls0/c$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ls0/c$a;->a(Ld0/q;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x4

    .line 8
    invoke-static {v0}, Lk0/Z0;->a(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    invoke-static {v0}, Lk0/Z0;->a(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 25
    :goto_1
    return p1
.end method

.method public final i0(I)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    iget-object v0, p0, Ls0/g;->T:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls0/g;->T:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Ls0/g;->P:Ld0/q;

    .line 13
    .line 14
    invoke-static {v1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ld0/q;

    .line 19
    .line 20
    iget v1, v1, Ld0/q;->I:I

    .line 21
    .line 22
    div-int/2addr v0, v1

    .line 23
    iget-object v1, p0, Ls0/g;->T:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v2, p0, Ls0/g;->P:Ld0/q;

    .line 30
    .line 31
    invoke-static {v2}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ld0/q;

    .line 36
    .line 37
    iget v2, v2, Ld0/q;->J:I

    .line 38
    .line 39
    div-int/2addr v1, v2

    .line 40
    iget-object v2, p0, Ls0/g;->P:Ld0/q;

    .line 41
    .line 42
    iget v2, v2, Ld0/q;->I:I

    .line 43
    .line 44
    rem-int v3, p1, v2

    .line 45
    .line 46
    mul-int/2addr v3, v0

    .line 47
    div-int/2addr p1, v2

    .line 48
    mul-int/2addr p1, v1

    .line 49
    iget-object v2, p0, Ls0/g;->T:Landroid/graphics/Bitmap;

    .line 50
    .line 51
    invoke-static {v2, v3, p1, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1
.end method

.method public final j0(JJ)Z
    .locals 13

    .line 1
    move-object v8, p0

    .line 2
    iget-object v0, v8, Ls0/g;->T:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    const/4 v9, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v8, Ls0/g;->V:Ls0/g$b;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return v9

    .line 12
    :cond_0
    iget v0, v8, Ls0/g;->O:I

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lk0/n;->getState()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x2

    .line 21
    if-eq v0, v1, :cond_1

    .line 22
    .line 23
    return v9

    .line 24
    :cond_1
    iget-object v0, v8, Ls0/g;->T:Landroid/graphics/Bitmap;

    .line 25
    .line 26
    const/4 v10, 0x3

    .line 27
    const/4 v11, 0x1

    .line 28
    if-nez v0, :cond_6

    .line 29
    .line 30
    iget-object v0, v8, Ls0/g;->Q:Ls0/c;

    .line 31
    .line 32
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    iget-object v0, v8, Ls0/g;->Q:Ls0/c;

    .line 36
    .line 37
    invoke-interface {v0}, Ls0/c;->a()Ls0/f;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    return v9

    .line 44
    :cond_2
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ls0/f;

    .line 49
    .line 50
    invoke-virtual {v1}, Lj0/a;->p()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    iget v1, v8, Ls0/g;->N:I

    .line 57
    .line 58
    if-ne v1, v10, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0}, Ls0/g;->s0()V

    .line 61
    .line 62
    .line 63
    iget-object v0, v8, Ls0/g;->P:Ld0/q;

    .line 64
    .line 65
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ls0/g;->m0()V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ls0/f;

    .line 77
    .line 78
    invoke-virtual {v0}, Lj0/j;->x()V

    .line 79
    .line 80
    .line 81
    iget-object v0, v8, Ls0/g;->H:Ljava/util/ArrayDeque;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    iput-boolean v11, v8, Ls0/g;->J:Z

    .line 90
    .line 91
    :cond_4
    :goto_0
    return v9

    .line 92
    :cond_5
    iget-object v1, v0, Ls0/f;->s:Landroid/graphics/Bitmap;

    .line 93
    .line 94
    const-string v2, "Non-EOS buffer came back from the decoder without bitmap."

    .line 95
    .line 96
    invoke-static {v1, v2}, Lg0/a;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    iget-object v1, v0, Ls0/f;->s:Landroid/graphics/Bitmap;

    .line 100
    .line 101
    iput-object v1, v8, Ls0/g;->T:Landroid/graphics/Bitmap;

    .line 102
    .line 103
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Ls0/f;

    .line 108
    .line 109
    invoke-virtual {v0}, Lj0/j;->x()V

    .line 110
    .line 111
    .line 112
    :cond_6
    iget-boolean v0, v8, Ls0/g;->U:Z

    .line 113
    .line 114
    if-eqz v0, :cond_e

    .line 115
    .line 116
    iget-object v0, v8, Ls0/g;->T:Landroid/graphics/Bitmap;

    .line 117
    .line 118
    if-eqz v0, :cond_e

    .line 119
    .line 120
    iget-object v0, v8, Ls0/g;->V:Ls0/g$b;

    .line 121
    .line 122
    if-eqz v0, :cond_e

    .line 123
    .line 124
    iget-object v0, v8, Ls0/g;->P:Ld0/q;

    .line 125
    .line 126
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    iget-object v0, v8, Ls0/g;->P:Ld0/q;

    .line 130
    .line 131
    iget v1, v0, Ld0/q;->I:I

    .line 132
    .line 133
    if-ne v1, v11, :cond_7

    .line 134
    .line 135
    iget v2, v0, Ld0/q;->J:I

    .line 136
    .line 137
    if-eq v2, v11, :cond_8

    .line 138
    .line 139
    :cond_7
    const/4 v2, -0x1

    .line 140
    if-eq v1, v2, :cond_8

    .line 141
    .line 142
    iget v0, v0, Ld0/q;->J:I

    .line 143
    .line 144
    if-eq v0, v2, :cond_8

    .line 145
    .line 146
    move v12, v11

    .line 147
    goto :goto_1

    .line 148
    :cond_8
    move v12, v9

    .line 149
    :goto_1
    iget-object v0, v8, Ls0/g;->V:Ls0/g$b;

    .line 150
    .line 151
    invoke-virtual {v0}, Ls0/g$b;->d()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_a

    .line 156
    .line 157
    iget-object v0, v8, Ls0/g;->V:Ls0/g$b;

    .line 158
    .line 159
    if-eqz v12, :cond_9

    .line 160
    .line 161
    invoke-virtual {v0}, Ls0/g$b;->c()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-virtual {p0, v1}, Ls0/g;->i0(I)Landroid/graphics/Bitmap;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    goto :goto_2

    .line 170
    :cond_9
    iget-object v1, v8, Ls0/g;->T:Landroid/graphics/Bitmap;

    .line 171
    .line 172
    invoke-static {v1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, Landroid/graphics/Bitmap;

    .line 177
    .line 178
    :goto_2
    invoke-virtual {v0, v1}, Ls0/g$b;->e(Landroid/graphics/Bitmap;)V

    .line 179
    .line 180
    .line 181
    :cond_a
    iget-object v0, v8, Ls0/g;->V:Ls0/g$b;

    .line 182
    .line 183
    invoke-virtual {v0}, Ls0/g$b;->b()Landroid/graphics/Bitmap;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    move-object v5, v0

    .line 192
    check-cast v5, Landroid/graphics/Bitmap;

    .line 193
    .line 194
    iget-object v0, v8, Ls0/g;->V:Ls0/g$b;

    .line 195
    .line 196
    invoke-virtual {v0}, Ls0/g$b;->a()J

    .line 197
    .line 198
    .line 199
    move-result-wide v6

    .line 200
    move-object v0, p0

    .line 201
    move-wide v1, p1

    .line 202
    move-wide/from16 v3, p3

    .line 203
    .line 204
    invoke-virtual/range {v0 .. v7}, Ls0/g;->r0(JJLandroid/graphics/Bitmap;J)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-nez v0, :cond_b

    .line 209
    .line 210
    return v9

    .line 211
    :cond_b
    iget-object v0, v8, Ls0/g;->V:Ls0/g$b;

    .line 212
    .line 213
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    check-cast v0, Ls0/g$b;

    .line 218
    .line 219
    invoke-virtual {v0}, Ls0/g$b;->a()J

    .line 220
    .line 221
    .line 222
    move-result-wide v0

    .line 223
    invoke-direct {p0, v0, v1}, Ls0/g;->q0(J)V

    .line 224
    .line 225
    .line 226
    iput v10, v8, Ls0/g;->O:I

    .line 227
    .line 228
    const/4 v0, 0x0

    .line 229
    if-eqz v12, :cond_c

    .line 230
    .line 231
    iget-object v1, v8, Ls0/g;->V:Ls0/g$b;

    .line 232
    .line 233
    invoke-static {v1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    check-cast v1, Ls0/g$b;

    .line 238
    .line 239
    invoke-virtual {v1}, Ls0/g$b;->c()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    iget-object v2, v8, Ls0/g;->P:Ld0/q;

    .line 244
    .line 245
    invoke-static {v2}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    check-cast v2, Ld0/q;

    .line 250
    .line 251
    iget v2, v2, Ld0/q;->J:I

    .line 252
    .line 253
    iget-object v3, v8, Ls0/g;->P:Ld0/q;

    .line 254
    .line 255
    invoke-static {v3}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    check-cast v3, Ld0/q;

    .line 260
    .line 261
    iget v3, v3, Ld0/q;->I:I

    .line 262
    .line 263
    mul-int/2addr v2, v3

    .line 264
    sub-int/2addr v2, v11

    .line 265
    if-ne v1, v2, :cond_d

    .line 266
    .line 267
    :cond_c
    iput-object v0, v8, Ls0/g;->T:Landroid/graphics/Bitmap;

    .line 268
    .line 269
    :cond_d
    iget-object v1, v8, Ls0/g;->W:Ls0/g$b;

    .line 270
    .line 271
    iput-object v1, v8, Ls0/g;->V:Ls0/g$b;

    .line 272
    .line 273
    iput-object v0, v8, Ls0/g;->W:Ls0/g$b;

    .line 274
    .line 275
    return v11

    .line 276
    :cond_e
    return v9
.end method

.method public final k0(J)Z
    .locals 7

    .line 1
    iget-boolean v0, p0, Ls0/g;->U:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Ls0/g;->V:Ls0/g$b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-virtual {p0}, Lk0/n;->N()Lk0/v0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, p0, Ls0/g;->Q:Ls0/c;

    .line 16
    .line 17
    if-eqz v2, :cond_c

    .line 18
    .line 19
    iget v3, p0, Ls0/g;->N:I

    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    if-eq v3, v4, :cond_c

    .line 23
    .line 24
    iget-boolean v3, p0, Ls0/g;->I:Z

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_1
    iget-object v3, p0, Ls0/g;->R:Lj0/i;

    .line 31
    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    invoke-interface {v2}, Lj0/g;->f()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lj0/i;

    .line 39
    .line 40
    iput-object v2, p0, Ls0/g;->R:Lj0/i;

    .line 41
    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    return v1

    .line 45
    :cond_2
    iget v2, p0, Ls0/g;->N:I

    .line 46
    .line 47
    const/4 v3, 0x2

    .line 48
    const/4 v5, 0x0

    .line 49
    if-ne v2, v3, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, Ls0/g;->R:Lj0/i;

    .line 52
    .line 53
    invoke-static {p1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Ls0/g;->R:Lj0/i;

    .line 57
    .line 58
    const/4 p2, 0x4

    .line 59
    invoke-virtual {p1, p2}, Lj0/a;->w(I)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Ls0/g;->Q:Ls0/c;

    .line 63
    .line 64
    invoke-static {p1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Ls0/c;

    .line 69
    .line 70
    iget-object p2, p0, Ls0/g;->R:Lj0/i;

    .line 71
    .line 72
    invoke-interface {p1, p2}, Ls0/c;->b(Lj0/i;)V

    .line 73
    .line 74
    .line 75
    iput-object v5, p0, Ls0/g;->R:Lj0/i;

    .line 76
    .line 77
    iput v4, p0, Ls0/g;->N:I

    .line 78
    .line 79
    return v1

    .line 80
    :cond_3
    iget-object v2, p0, Ls0/g;->R:Lj0/i;

    .line 81
    .line 82
    invoke-virtual {p0, v0, v2, v1}, Lk0/n;->e0(Lk0/v0;Lj0/i;I)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const/4 v4, -0x5

    .line 87
    const/4 v6, 0x1

    .line 88
    if-eq v2, v4, :cond_b

    .line 89
    .line 90
    const/4 v0, -0x4

    .line 91
    if-eq v2, v0, :cond_5

    .line 92
    .line 93
    const/4 p1, -0x3

    .line 94
    if-ne v2, p1, :cond_4

    .line 95
    .line 96
    return v1

    .line 97
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_5
    iget-object v0, p0, Ls0/g;->R:Lj0/i;

    .line 104
    .line 105
    invoke-virtual {v0}, Lj0/i;->C()V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Ls0/g;->R:Lj0/i;

    .line 109
    .line 110
    iget-object v0, v0, Lj0/i;->r:Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-gtz v0, :cond_7

    .line 123
    .line 124
    iget-object v0, p0, Ls0/g;->R:Lj0/i;

    .line 125
    .line 126
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Lj0/i;

    .line 131
    .line 132
    invoke-virtual {v0}, Lj0/a;->p()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_6
    move v0, v1

    .line 140
    goto :goto_1

    .line 141
    :cond_7
    :goto_0
    move v0, v6

    .line 142
    :goto_1
    if-eqz v0, :cond_8

    .line 143
    .line 144
    iget-object v2, p0, Ls0/g;->Q:Ls0/c;

    .line 145
    .line 146
    invoke-static {v2}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Ls0/c;

    .line 151
    .line 152
    iget-object v3, p0, Ls0/g;->R:Lj0/i;

    .line 153
    .line 154
    invoke-static {v3}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, Lj0/i;

    .line 159
    .line 160
    invoke-interface {v2, v3}, Ls0/c;->b(Lj0/i;)V

    .line 161
    .line 162
    .line 163
    iput v1, p0, Ls0/g;->X:I

    .line 164
    .line 165
    :cond_8
    iget-object v2, p0, Ls0/g;->R:Lj0/i;

    .line 166
    .line 167
    invoke-static {v2}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Lj0/i;

    .line 172
    .line 173
    invoke-virtual {p0, p1, p2, v2}, Ls0/g;->p0(JLj0/i;)V

    .line 174
    .line 175
    .line 176
    iget-object p1, p0, Ls0/g;->R:Lj0/i;

    .line 177
    .line 178
    invoke-static {p1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    check-cast p1, Lj0/i;

    .line 183
    .line 184
    invoke-virtual {p1}, Lj0/a;->p()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_9

    .line 189
    .line 190
    iput-boolean v6, p0, Ls0/g;->I:Z

    .line 191
    .line 192
    iput-object v5, p0, Ls0/g;->R:Lj0/i;

    .line 193
    .line 194
    return v1

    .line 195
    :cond_9
    iget-wide p1, p0, Ls0/g;->M:J

    .line 196
    .line 197
    iget-object v1, p0, Ls0/g;->R:Lj0/i;

    .line 198
    .line 199
    invoke-static {v1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    check-cast v1, Lj0/i;

    .line 204
    .line 205
    iget-wide v1, v1, Lj0/i;->t:J

    .line 206
    .line 207
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 208
    .line 209
    .line 210
    move-result-wide p1

    .line 211
    iput-wide p1, p0, Ls0/g;->M:J

    .line 212
    .line 213
    if-eqz v0, :cond_a

    .line 214
    .line 215
    iput-object v5, p0, Ls0/g;->R:Lj0/i;

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_a
    iget-object p1, p0, Ls0/g;->R:Lj0/i;

    .line 219
    .line 220
    invoke-static {p1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    check-cast p1, Lj0/i;

    .line 225
    .line 226
    invoke-virtual {p1}, Lj0/i;->m()V

    .line 227
    .line 228
    .line 229
    :goto_2
    iget-boolean p1, p0, Ls0/g;->U:Z

    .line 230
    .line 231
    xor-int/2addr p1, v6

    .line 232
    return p1

    .line 233
    :cond_b
    iget-object p1, v0, Lk0/v0;->b:Ld0/q;

    .line 234
    .line 235
    invoke-static {p1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    check-cast p1, Ld0/q;

    .line 240
    .line 241
    iput-object p1, p0, Ls0/g;->P:Ld0/q;

    .line 242
    .line 243
    iput v3, p0, Ls0/g;->N:I

    .line 244
    .line 245
    return v6

    .line 246
    :cond_c
    :goto_3
    return v1
.end method

.method public final m0()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls0/g;->P:Ld0/q;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ls0/g;->h0(Ld0/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Ls0/g;->Q:Ls0/c;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Lj0/g;->release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Ls0/g;->F:Ls0/c$a;

    .line 17
    .line 18
    invoke-interface {v0}, Ls0/c$a;->b()Ls0/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Ls0/g;->Q:Ls0/c;

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance v0, Ls0/d;

    .line 26
    .line 27
    const-string v1, "Provided decoder factory can\'t create decoder for format."

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ls0/d;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Ls0/g;->P:Ld0/q;

    .line 33
    .line 34
    const/16 v2, 0xfa5

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1, v2}, Lk0/n;->J(Ljava/lang/Throwable;Ld0/q;I)Lk0/u;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    throw v0
.end method

.method public final n0(Ls0/g$b;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ls0/g;->P:Ld0/q;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld0/q;

    .line 8
    .line 9
    iget v0, v0, Ld0/q;->I:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, -0x1

    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Ls0/g;->P:Ld0/q;

    .line 16
    .line 17
    iget v0, v0, Ld0/q;->J:I

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Ls0/g$b;->c()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v0, p0, Ls0/g;->P:Ld0/q;

    .line 26
    .line 27
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ld0/q;

    .line 32
    .line 33
    iget v0, v0, Ld0/q;->J:I

    .line 34
    .line 35
    iget-object v2, p0, Ls0/g;->P:Ld0/q;

    .line 36
    .line 37
    iget v2, v2, Ld0/q;->I:I

    .line 38
    .line 39
    mul-int/2addr v0, v2

    .line 40
    sub-int/2addr v0, v1

    .line 41
    if-ne p1, v0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v1, 0x0

    .line 45
    :cond_1
    :goto_0
    return v1
.end method

.method public final o0(I)V
    .locals 1

    .line 1
    iget v0, p0, Ls0/g;->O:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Ls0/g;->O:I

    .line 8
    .line 9
    return-void
.end method

.method public final p0(JLj0/i;)V
    .locals 8

    .line 1
    invoke-virtual {p3}, Lj0/a;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-boolean v1, p0, Ls0/g;->U:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Ls0/g$b;

    .line 12
    .line 13
    iget v2, p0, Ls0/g;->X:I

    .line 14
    .line 15
    iget-wide v3, p3, Lj0/i;->t:J

    .line 16
    .line 17
    invoke-direct {v0, v2, v3, v4}, Ls0/g$b;-><init>(IJ)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ls0/g;->W:Ls0/g$b;

    .line 21
    .line 22
    iget p3, p0, Ls0/g;->X:I

    .line 23
    .line 24
    add-int/2addr p3, v1

    .line 25
    iput p3, p0, Ls0/g;->X:I

    .line 26
    .line 27
    iget-boolean p3, p0, Ls0/g;->U:Z

    .line 28
    .line 29
    if-nez p3, :cond_5

    .line 30
    .line 31
    invoke-virtual {v0}, Ls0/g$b;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    const-wide/16 v4, 0x7530

    .line 36
    .line 37
    sub-long v6, v2, v4

    .line 38
    .line 39
    cmp-long p3, v6, p1

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    if-gtz p3, :cond_1

    .line 43
    .line 44
    add-long/2addr v4, v2

    .line 45
    cmp-long p3, p1, v4

    .line 46
    .line 47
    if-gtz p3, :cond_1

    .line 48
    .line 49
    move p3, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move p3, v0

    .line 52
    :goto_0
    iget-object v4, p0, Ls0/g;->V:Ls0/g$b;

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    invoke-virtual {v4}, Ls0/g$b;->a()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    cmp-long v4, v4, p1

    .line 61
    .line 62
    if-gtz v4, :cond_2

    .line 63
    .line 64
    cmp-long p1, p1, v2

    .line 65
    .line 66
    if-gez p1, :cond_2

    .line 67
    .line 68
    move p1, v1

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move p1, v0

    .line 71
    :goto_1
    iget-object p2, p0, Ls0/g;->W:Ls0/g$b;

    .line 72
    .line 73
    invoke-static {p2}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, Ls0/g$b;

    .line 78
    .line 79
    invoke-virtual {p0, p2}, Ls0/g;->n0(Ls0/g$b;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-nez p3, :cond_4

    .line 84
    .line 85
    if-nez p1, :cond_4

    .line 86
    .line 87
    if-eqz p2, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    move v1, v0

    .line 91
    :cond_4
    :goto_2
    iput-boolean v1, p0, Ls0/g;->U:Z

    .line 92
    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    if-nez p3, :cond_5

    .line 96
    .line 97
    return-void

    .line 98
    :cond_5
    iget-object p1, p0, Ls0/g;->W:Ls0/g$b;

    .line 99
    .line 100
    iput-object p1, p0, Ls0/g;->V:Ls0/g$b;

    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    iput-object p1, p0, Ls0/g;->W:Ls0/g$b;

    .line 104
    .line 105
    return-void
.end method

.method public r0(JJLandroid/graphics/Bitmap;J)Z
    .locals 0

    .line 1
    sub-long p1, p6, p1

    .line 2
    .line 3
    invoke-virtual {p0}, Ls0/g;->u0()Z

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    if-nez p3, :cond_1

    .line 8
    .line 9
    const-wide/16 p3, 0x7530

    .line 10
    .line 11
    cmp-long p1, p1, p3

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_1
    :goto_0
    iget-object p1, p0, Ls0/g;->S:Ls0/e;

    .line 19
    .line 20
    iget-object p2, p0, Ls0/g;->K:Ls0/g$a;

    .line 21
    .line 22
    iget-wide p2, p2, Ls0/g$a;->b:J

    .line 23
    .line 24
    sub-long/2addr p6, p2

    .line 25
    invoke-interface {p1, p6, p7, p5}, Ls0/e;->a(JLandroid/graphics/Bitmap;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public final s0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ls0/g;->R:Lj0/i;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput v1, p0, Ls0/g;->N:I

    .line 6
    .line 7
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v1, p0, Ls0/g;->M:J

    .line 13
    .line 14
    iget-object v1, p0, Ls0/g;->Q:Ls0/c;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Lj0/g;->release()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ls0/g;->Q:Ls0/c;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public t(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1, p2}, Lk0/n;->t(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    instance-of p1, p2, Ls0/e;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    check-cast p2, Ls0/e;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p2, 0x0

    .line 17
    :goto_0
    invoke-virtual {p0, p2}, Ls0/g;->t0(Ls0/e;)V

    .line 18
    .line 19
    .line 20
    :goto_1
    return-void
.end method

.method public final t0(Ls0/e;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ls0/g;->l0(Ls0/e;)Ls0/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Ls0/g;->S:Ls0/e;

    .line 6
    .line 7
    return-void
.end method

.method public final u0()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lk0/n;->getState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    move v0, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v2

    .line 13
    :goto_0
    iget v1, p0, Ls0/g;->O:I

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-ne v1, v0, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_2
    return v3

    .line 30
    :cond_3
    return v0
.end method
