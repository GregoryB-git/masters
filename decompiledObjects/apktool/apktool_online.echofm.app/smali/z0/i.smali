.class public final Lz0/i;
.super Lk0/n;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final F:Lc1/b;

.field public final G:Lj0/i;

.field public H:Lz0/a;

.field public final I:Lz0/g;

.field public J:Z

.field public K:I

.field public L:Lc1/l;

.field public M:Lc1/p;

.field public N:Lc1/q;

.field public O:Lc1/q;

.field public P:I

.field public final Q:Landroid/os/Handler;

.field public final R:Lz0/h;

.field public final S:Lk0/v0;

.field public T:Z

.field public U:Z

.field public V:Ld0/q;

.field public W:J

.field public X:J

.field public Y:J

.field public Z:Z


# direct methods
.method public constructor <init>(Lz0/h;Landroid/os/Looper;)V
    .locals 1

    .line 1
    sget-object v0, Lz0/g;->a:Lz0/g;

    invoke-direct {p0, p1, p2, v0}, Lz0/i;-><init>(Lz0/h;Landroid/os/Looper;Lz0/g;)V

    return-void
.end method

.method public constructor <init>(Lz0/h;Landroid/os/Looper;Lz0/g;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lk0/n;-><init>(I)V

    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz0/h;

    iput-object p1, p0, Lz0/i;->R:Lz0/h;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2, p0}, Lg0/M;->z(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lz0/i;->Q:Landroid/os/Handler;

    iput-object p3, p0, Lz0/i;->I:Lz0/g;

    new-instance p1, Lc1/b;

    invoke-direct {p1}, Lc1/b;-><init>()V

    iput-object p1, p0, Lz0/i;->F:Lc1/b;

    new-instance p1, Lj0/i;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lj0/i;-><init>(I)V

    iput-object p1, p0, Lz0/i;->G:Lj0/i;

    new-instance p1, Lk0/v0;

    invoke-direct {p1}, Lk0/v0;-><init>()V

    iput-object p1, p0, Lz0/i;->S:Lk0/v0;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lz0/i;->Y:J

    iput-wide p1, p0, Lz0/i;->W:J

    iput-wide p1, p0, Lz0/i;->X:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Lz0/i;->Z:Z

    return-void
.end method

.method private l0(J)J
    .locals 7

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move v2, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v3

    .line 15
    :goto_0
    invoke-static {v2}, Lg0/a;->f(Z)V

    .line 16
    .line 17
    .line 18
    iget-wide v5, p0, Lz0/i;->W:J

    .line 19
    .line 20
    cmp-long v0, v5, v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    move v3, v4

    .line 25
    :cond_1
    invoke-static {v3}, Lg0/a;->f(Z)V

    .line 26
    .line 27
    .line 28
    iget-wide v0, p0, Lz0/i;->W:J

    .line 29
    .line 30
    sub-long/2addr p1, v0

    .line 31
    return-wide p1
.end method

.method public static p0(Ld0/q;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Ld0/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "application/x-media3-cues"

    .line 4
    .line 5
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method


# virtual methods
.method public T()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lz0/i;->V:Ld0/q;

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Lz0/i;->Y:J

    .line 10
    .line 11
    invoke-virtual {p0}, Lz0/i;->i0()V

    .line 12
    .line 13
    .line 14
    iput-wide v0, p0, Lz0/i;->W:J

    .line 15
    .line 16
    iput-wide v0, p0, Lz0/i;->X:J

    .line 17
    .line 18
    iget-object v0, p0, Lz0/i;->L:Lc1/l;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lz0/i;->s0()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public W(JZ)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lz0/i;->X:J

    .line 2
    .line 3
    iget-object p1, p0, Lz0/i;->H:Lz0/a;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lz0/a;->clear()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lz0/i;->i0()V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lz0/i;->T:Z

    .line 15
    .line 16
    iput-boolean p1, p0, Lz0/i;->U:Z

    .line 17
    .line 18
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Lz0/i;->Y:J

    .line 24
    .line 25
    iget-object p1, p0, Lz0/i;->V:Ld0/q;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-static {p1}, Lz0/i;->p0(Ld0/q;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    iget p1, p0, Lz0/i;->K:I

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Lz0/i;->v0()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p0}, Lz0/i;->r0()V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lz0/i;->L:Lc1/l;

    .line 47
    .line 48
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lc1/l;

    .line 53
    .line 54
    invoke-interface {p1}, Lj0/g;->flush()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lk0/n;->P()J

    .line 58
    .line 59
    .line 60
    move-result-wide p2

    .line 61
    invoke-interface {p1, p2, p3}, Lj0/g;->c(J)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_0
    return-void
.end method

.method public a(Ld0/q;)I
    .locals 1

    .line 1
    invoke-static {p1}, Lz0/i;->p0(Ld0/q;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lz0/i;->I:Lz0/g;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lz0/g;->a(Ld0/q;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object p1, p1, Ld0/q;->n:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p1}, Ld0/z;->r(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    :goto_0
    invoke-static {p1}, Lk0/Z0;->a(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    :goto_1
    iget p1, p1, Ld0/q;->K:I

    .line 33
    .line 34
    if-nez p1, :cond_3

    .line 35
    .line 36
    const/4 p1, 0x4

    .line 37
    goto :goto_2

    .line 38
    :cond_3
    const/4 p1, 0x2

    .line 39
    :goto_2
    invoke-static {p1}, Lk0/Z0;->a(I)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lz0/i;->U:Z

    .line 2
    .line 3
    return v0
.end method

.method public c0([Ld0/q;JJLx0/x$b;)V
    .locals 0

    .line 1
    iput-wide p4, p0, Lz0/i;->W:J

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    aget-object p1, p1, p2

    .line 5
    .line 6
    iput-object p1, p0, Lz0/i;->V:Ld0/q;

    .line 7
    .line 8
    invoke-static {p1}, Lz0/i;->p0(Ld0/q;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 p2, 0x1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lz0/i;->h0()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lz0/i;->L:Lc1/l;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iput p2, p0, Lz0/i;->K:I

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {p0}, Lz0/i;->n0()V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget-object p1, p0, Lz0/i;->V:Ld0/q;

    .line 30
    .line 31
    iget p1, p1, Ld0/q;->H:I

    .line 32
    .line 33
    if-ne p1, p2, :cond_2

    .line 34
    .line 35
    new-instance p1, Lz0/e;

    .line 36
    .line 37
    invoke-direct {p1}, Lz0/e;-><init>()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    new-instance p1, Lz0/f;

    .line 42
    .line 43
    invoke-direct {p1}, Lz0/f;-><init>()V

    .line 44
    .line 45
    .line 46
    :goto_0
    iput-object p1, p0, Lz0/i;->H:Lz0/a;

    .line 47
    .line 48
    :goto_1
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TextRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public f(JJ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/n;->A()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    iget-wide p3, p0, Lz0/i;->Y:J

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, p3, v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    cmp-long p3, p1, p3

    .line 19
    .line 20
    if-ltz p3, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lz0/i;->r0()V

    .line 23
    .line 24
    .line 25
    const/4 p3, 0x1

    .line 26
    iput-boolean p3, p0, Lz0/i;->U:Z

    .line 27
    .line 28
    :cond_0
    iget-boolean p3, p0, Lz0/i;->U:Z

    .line 29
    .line 30
    if-eqz p3, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p3, p0, Lz0/i;->V:Ld0/q;

    .line 34
    .line 35
    invoke-static {p3}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    check-cast p3, Ld0/q;

    .line 40
    .line 41
    invoke-static {p3}, Lz0/i;->p0(Ld0/q;)Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-eqz p3, :cond_2

    .line 46
    .line 47
    iget-object p3, p0, Lz0/i;->H:Lz0/a;

    .line 48
    .line 49
    invoke-static {p3}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, Lz0/i;->t0(J)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {p0}, Lz0/i;->h0()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, p2}, Lz0/i;->u0(J)V

    .line 60
    .line 61
    .line 62
    :goto_0
    return-void
.end method

.method public final h0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lz0/i;->Z:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lz0/i;->V:Ld0/q;

    .line 6
    .line 7
    iget-object v0, v0, Ld0/q;->n:Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "application/cea-608"

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lz0/i;->V:Ld0/q;

    .line 18
    .line 19
    iget-object v0, v0, Ld0/q;->n:Ljava/lang/String;

    .line 20
    .line 21
    const-string v1, "application/x-mp4-cea-608"

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lz0/i;->V:Ld0/q;

    .line 30
    .line 31
    iget-object v0, v0, Ld0/q;->n:Ljava/lang/String;

    .line 32
    .line 33
    const-string v1, "application/cea-708"

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 45
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v2, "Legacy decoding is disabled, can\'t handle "

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lz0/i;->V:Ld0/q;

    .line 56
    .line 57
    iget-object v2, v2, Ld0/q;->n:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v2, " samples (expected "

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v2, "application/x-media3-cues"

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v2, ")."

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v0, v1}, Lg0/a;->g(ZLjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lf0/b;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lz0/i;->o0(Lf0/b;)V

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public final i0()V
    .locals 4

    .line 1
    new-instance v0, Lf0/b;

    .line 2
    .line 3
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-wide v2, p0, Lz0/i;->X:J

    .line 8
    .line 9
    invoke-direct {p0, v2, v3}, Lz0/i;->l0(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    invoke-direct {v0, v1, v2, v3}, Lf0/b;-><init>(Ljava/util/List;J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lz0/i;->x0(Lf0/b;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final j0(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/i;->N:Lc1/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lc1/q;->c(J)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    iget-object p2, p0, Lz0/i;->N:Lc1/q;

    .line 10
    .line 11
    invoke-virtual {p2}, Lc1/q;->j()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 p2, -0x1

    .line 19
    if-ne p1, p2, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Lz0/i;->N:Lc1/q;

    .line 22
    .line 23
    invoke-virtual {p1}, Lc1/q;->j()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    add-int/lit8 p2, p2, -0x1

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lc1/q;->e(I)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object p2, p0, Lz0/i;->N:Lc1/q;

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Lc1/q;->e(I)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    :goto_0
    return-wide p1

    .line 43
    :cond_2
    :goto_1
    iget-object p1, p0, Lz0/i;->N:Lc1/q;

    .line 44
    .line 45
    iget-wide p1, p1, Lj0/j;->p:J

    .line 46
    .line 47
    return-wide p1
.end method

.method public final k0()J
    .locals 4

    .line 1
    iget v0, p0, Lz0/i;->P:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-wide v2, 0x7fffffffffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-wide v2

    .line 12
    :cond_0
    iget-object v0, p0, Lz0/i;->N:Lc1/q;

    .line 13
    .line 14
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lz0/i;->P:I

    .line 18
    .line 19
    iget-object v1, p0, Lz0/i;->N:Lc1/q;

    .line 20
    .line 21
    invoke-virtual {v1}, Lc1/q;->j()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lt v0, v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v0, p0, Lz0/i;->N:Lc1/q;

    .line 29
    .line 30
    iget v1, p0, Lz0/i;->P:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lc1/q;->e(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    :goto_0
    return-wide v2
.end method

.method public final m0(Lc1/m;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Subtitle decoding failed. streamFormat="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lz0/i;->V:Ld0/q;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "TextRenderer"

    .line 21
    .line 22
    invoke-static {v1, v0, p1}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lz0/i;->i0()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lz0/i;->v0()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final n0()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lz0/i;->J:Z

    .line 3
    .line 4
    iget-object v0, p0, Lz0/i;->I:Lz0/g;

    .line 5
    .line 6
    iget-object v1, p0, Lz0/i;->V:Ld0/q;

    .line 7
    .line 8
    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ld0/q;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lz0/g;->b(Ld0/q;)Lc1/l;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lz0/i;->L:Lc1/l;

    .line 19
    .line 20
    invoke-virtual {p0}, Lk0/n;->P()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-interface {v0, v1, v2}, Lj0/g;->c(J)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final o0(Lf0/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz0/i;->R:Lz0/h;

    .line 2
    .line 3
    iget-object v1, p1, Lf0/b;->a:LX2/v;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lz0/h;->k(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lz0/i;->R:Lz0/h;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lz0/h;->r(Lf0/b;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final q0(J)Z
    .locals 7

    .line 1
    iget-boolean v0, p0, Lz0/i;->T:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lz0/i;->S:Lk0/v0;

    .line 8
    .line 9
    iget-object v2, p0, Lz0/i;->G:Lj0/i;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v2, v1}, Lk0/n;->e0(Lk0/v0;Lj0/i;I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, -0x4

    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    return v1

    .line 19
    :cond_1
    iget-object v0, p0, Lz0/i;->G:Lj0/i;

    .line 20
    .line 21
    invoke-virtual {v0}, Lj0/a;->p()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Lz0/i;->T:Z

    .line 29
    .line 30
    return v1

    .line 31
    :cond_2
    iget-object v0, p0, Lz0/i;->G:Lj0/i;

    .line 32
    .line 33
    invoke-virtual {v0}, Lj0/i;->C()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lz0/i;->G:Lj0/i;

    .line 37
    .line 38
    iget-object v0, v0, Lj0/i;->r:Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    iget-object v1, p0, Lz0/i;->F:Lc1/b;

    .line 47
    .line 48
    iget-object v2, p0, Lz0/i;->G:Lj0/i;

    .line 49
    .line 50
    iget-wide v2, v2, Lj0/i;->t:J

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-virtual/range {v1 .. v6}, Lc1/b;->a(J[BII)Lc1/e;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v1, p0, Lz0/i;->G:Lj0/i;

    .line 69
    .line 70
    invoke-virtual {v1}, Lj0/i;->m()V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lz0/i;->H:Lz0/a;

    .line 74
    .line 75
    invoke-interface {v1, v0, p1, p2}, Lz0/a;->c(Lc1/e;J)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    return p1
.end method

.method public final r0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lz0/i;->M:Lc1/p;

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    iput v1, p0, Lz0/i;->P:I

    .line 6
    .line 7
    iget-object v1, p0, Lz0/i;->N:Lc1/q;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lj0/j;->x()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lz0/i;->N:Lc1/q;

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Lz0/i;->O:Lc1/q;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Lj0/j;->x()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lz0/i;->O:Lc1/q;

    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final s0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz0/i;->r0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lz0/i;->L:Lc1/l;

    .line 5
    .line 6
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lc1/l;

    .line 11
    .line 12
    invoke-interface {v0}, Lj0/g;->release()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lz0/i;->L:Lc1/l;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lz0/i;->K:I

    .line 20
    .line 21
    return-void
.end method

.method public final t0(J)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lz0/i;->q0(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lz0/i;->H:Lz0/a;

    .line 6
    .line 7
    iget-wide v2, p0, Lz0/i;->X:J

    .line 8
    .line 9
    invoke-interface {v1, v2, v3}, Lz0/a;->b(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const-wide/high16 v3, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long v3, v1, v3

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    iget-boolean v4, p0, Lz0/i;->T:Z

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    iput-boolean v4, p0, Lz0/i;->U:Z

    .line 27
    .line 28
    :cond_0
    if-eqz v3, :cond_1

    .line 29
    .line 30
    cmp-long v1, v1, p1

    .line 31
    .line 32
    if-gtz v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    if-eqz v0, :cond_2

    .line 36
    .line 37
    :goto_0
    iget-object v0, p0, Lz0/i;->H:Lz0/a;

    .line 38
    .line 39
    invoke-interface {v0, p1, p2}, Lz0/a;->a(J)LX2/v;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lz0/i;->H:Lz0/a;

    .line 44
    .line 45
    invoke-interface {v1, p1, p2}, Lz0/a;->d(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    new-instance v3, Lf0/b;

    .line 50
    .line 51
    invoke-direct {p0, v1, v2}, Lz0/i;->l0(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    invoke-direct {v3, v0, v4, v5}, Lf0/b;-><init>(Ljava/util/List;J)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v3}, Lz0/i;->x0(Lf0/b;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lz0/i;->H:Lz0/a;

    .line 62
    .line 63
    invoke-interface {v0, v1, v2}, Lz0/a;->e(J)V

    .line 64
    .line 65
    .line 66
    :cond_2
    iput-wide p1, p0, Lz0/i;->X:J

    .line 67
    .line 68
    return-void
.end method

.method public final u0(J)V
    .locals 10

    .line 1
    iput-wide p1, p0, Lz0/i;->X:J

    iget-object v0, p0, Lz0/i;->O:Lc1/q;

    if-nez v0, :cond_0

    iget-object v0, p0, Lz0/i;->L:Lc1/l;

    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc1/l;

    invoke-interface {v0, p1, p2}, Lc1/l;->d(J)V

    :try_start_0
    iget-object v0, p0, Lz0/i;->L:Lc1/l;

    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc1/l;

    invoke-interface {v0}, Lj0/g;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc1/q;

    iput-object v0, p0, Lz0/i;->O:Lc1/q;
    :try_end_0
    .catch Lc1/m; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lz0/i;->m0(Lc1/m;)V

    return-void

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lk0/n;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lz0/i;->N:Lc1/q;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lz0/i;->k0()J

    move-result-wide v4

    move v0, v2

    :goto_1
    cmp-long v4, v4, p1

    if-gtz v4, :cond_3

    iget v0, p0, Lz0/i;->P:I

    add-int/2addr v0, v3

    iput v0, p0, Lz0/i;->P:I

    invoke-virtual {p0}, Lz0/i;->k0()J

    move-result-wide v4

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v2

    :cond_3
    iget-object v4, p0, Lz0/i;->O:Lc1/q;

    const/4 v5, 0x0

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lj0/a;->p()Z

    move-result v6

    if-eqz v6, :cond_5

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lz0/i;->k0()J

    move-result-wide v6

    const-wide v8, 0x7fffffffffffffffL

    cmp-long v4, v6, v8

    if-nez v4, :cond_7

    iget v4, p0, Lz0/i;->K:I

    if-ne v4, v1, :cond_4

    invoke-virtual {p0}, Lz0/i;->v0()V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lz0/i;->r0()V

    iput-boolean v3, p0, Lz0/i;->U:Z

    goto :goto_2

    :cond_5
    iget-wide v6, v4, Lj0/j;->p:J

    cmp-long v6, v6, p1

    if-gtz v6, :cond_7

    iget-object v0, p0, Lz0/i;->N:Lc1/q;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lj0/j;->x()V

    :cond_6
    invoke-virtual {v4, p1, p2}, Lc1/q;->c(J)I

    move-result v0

    iput v0, p0, Lz0/i;->P:I

    iput-object v4, p0, Lz0/i;->N:Lc1/q;

    iput-object v5, p0, Lz0/i;->O:Lc1/q;

    goto :goto_3

    :cond_7
    :goto_2
    if-eqz v0, :cond_8

    :goto_3
    iget-object v0, p0, Lz0/i;->N:Lc1/q;

    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Lz0/i;->j0(J)J

    move-result-wide v6

    invoke-direct {p0, v6, v7}, Lz0/i;->l0(J)J

    move-result-wide v6

    new-instance v0, Lf0/b;

    iget-object v4, p0, Lz0/i;->N:Lc1/q;

    invoke-virtual {v4, p1, p2}, Lc1/q;->h(J)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1, v6, v7}, Lf0/b;-><init>(Ljava/util/List;J)V

    invoke-virtual {p0, v0}, Lz0/i;->x0(Lf0/b;)V

    :cond_8
    iget p1, p0, Lz0/i;->K:I

    if-ne p1, v1, :cond_9

    return-void

    :cond_9
    :goto_4
    :try_start_1
    iget-boolean p1, p0, Lz0/i;->T:Z

    if-nez p1, :cond_10

    iget-object p1, p0, Lz0/i;->M:Lc1/p;

    if-nez p1, :cond_b

    iget-object p1, p0, Lz0/i;->L:Lc1/l;

    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc1/l;

    invoke-interface {p1}, Lj0/g;->f()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc1/p;

    if-nez p1, :cond_a

    return-void

    :cond_a
    iput-object p1, p0, Lz0/i;->M:Lc1/p;

    goto :goto_5

    :catch_1
    move-exception p1

    goto :goto_7

    :cond_b
    :goto_5
    iget p2, p0, Lz0/i;->K:I

    if-ne p2, v3, :cond_c

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Lj0/a;->w(I)V

    iget-object p2, p0, Lz0/i;->L:Lc1/l;

    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc1/l;

    invoke-interface {p2, p1}, Lj0/g;->e(Ljava/lang/Object;)V

    iput-object v5, p0, Lz0/i;->M:Lc1/p;

    iput v1, p0, Lz0/i;->K:I

    return-void

    :cond_c
    iget-object p2, p0, Lz0/i;->S:Lk0/v0;

    invoke-virtual {p0, p2, p1, v2}, Lk0/n;->e0(Lk0/v0;Lj0/i;I)I

    move-result p2

    const/4 v0, -0x4

    if-ne p2, v0, :cond_f

    invoke-virtual {p1}, Lj0/a;->p()Z

    move-result p2

    if-eqz p2, :cond_d

    iput-boolean v3, p0, Lz0/i;->T:Z

    iput-boolean v2, p0, Lz0/i;->J:Z

    goto :goto_6

    :cond_d
    iget-object p2, p0, Lz0/i;->S:Lk0/v0;

    iget-object p2, p2, Lk0/v0;->b:Ld0/q;

    if-nez p2, :cond_e

    return-void

    :cond_e
    iget-wide v6, p2, Ld0/q;->s:J

    iput-wide v6, p1, Lc1/p;->x:J

    invoke-virtual {p1}, Lj0/i;->C()V

    iget-boolean p2, p0, Lz0/i;->J:Z

    invoke-virtual {p1}, Lj0/a;->s()Z

    move-result v0

    xor-int/2addr v0, v3

    and-int/2addr p2, v0

    iput-boolean p2, p0, Lz0/i;->J:Z

    :goto_6
    iget-boolean p2, p0, Lz0/i;->J:Z

    if-nez p2, :cond_9

    iget-object p2, p0, Lz0/i;->L:Lc1/l;

    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc1/l;

    invoke-interface {p2, p1}, Lj0/g;->e(Ljava/lang/Object;)V

    iput-object v5, p0, Lz0/i;->M:Lc1/p;
    :try_end_1
    .catch Lc1/m; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :cond_f
    const/4 p1, -0x3

    if-ne p2, p1, :cond_9

    return-void

    :goto_7
    invoke-virtual {p0, p1}, Lz0/i;->m0(Lc1/m;)V

    :cond_10
    return-void
.end method

.method public final v0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lz0/i;->s0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lz0/i;->n0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public w0(J)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/n;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    iput-wide p1, p0, Lz0/i;->Y:J

    .line 9
    .line 10
    return-void
.end method

.method public final x0(Lf0/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz0/i;->Q:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Lz0/i;->o0(Lf0/b;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
.end method
