.class public final Ll1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/p$b;
    }
.end annotation


# instance fields
.field public final a:Ll1/F;

.field public final b:Z

.field public final c:Z

.field public final d:Ll1/w;

.field public final e:Ll1/w;

.field public final f:Ll1/w;

.field public g:J

.field public final h:[Z

.field public i:Ljava/lang/String;

.field public j:LF0/T;

.field public k:Ll1/p$b;

.field public l:Z

.field public m:J

.field public n:Z

.field public final o:Lg0/z;


# direct methods
.method public constructor <init>(Ll1/F;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/p;->a:Ll1/F;

    .line 5
    .line 6
    iput-boolean p2, p0, Ll1/p;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Ll1/p;->c:Z

    .line 9
    .line 10
    const/4 p1, 0x3

    .line 11
    new-array p1, p1, [Z

    .line 12
    .line 13
    iput-object p1, p0, Ll1/p;->h:[Z

    .line 14
    .line 15
    new-instance p1, Ll1/w;

    .line 16
    .line 17
    const/4 p2, 0x7

    .line 18
    const/16 p3, 0x80

    .line 19
    .line 20
    invoke-direct {p1, p2, p3}, Ll1/w;-><init>(II)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ll1/p;->d:Ll1/w;

    .line 24
    .line 25
    new-instance p1, Ll1/w;

    .line 26
    .line 27
    const/16 p2, 0x8

    .line 28
    .line 29
    invoke-direct {p1, p2, p3}, Ll1/w;-><init>(II)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Ll1/p;->e:Ll1/w;

    .line 33
    .line 34
    new-instance p1, Ll1/w;

    .line 35
    .line 36
    const/4 p2, 0x6

    .line 37
    invoke-direct {p1, p2, p3}, Ll1/w;-><init>(II)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Ll1/p;->f:Ll1/w;

    .line 41
    .line 42
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    iput-wide p1, p0, Ll1/p;->m:J

    .line 48
    .line 49
    new-instance p1, Lg0/z;

    .line 50
    .line 51
    invoke-direct {p1}, Lg0/z;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Ll1/p;->o:Lg0/z;

    .line 55
    .line 56
    return-void
.end method

.method private f()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/p;->j:LF0/T;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll1/p;->k:Ll1/p$b;

    .line 7
    .line 8
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Lg0/z;)V
    .locals 14

    .line 1
    invoke-direct {p0}, Ll1/p;->f()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-wide v3, p0, Ll1/p;->g:J

    .line 17
    .line 18
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    int-to-long v5, v5

    .line 23
    add-long/2addr v3, v5

    .line 24
    iput-wide v3, p0, Ll1/p;->g:J

    .line 25
    .line 26
    iget-object v3, p0, Ll1/p;->j:LF0/T;

    .line 27
    .line 28
    invoke-virtual {p1}, Lg0/z;->a()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-interface {v3, p1, v4}, LF0/T;->e(Lg0/z;I)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, Ll1/p;->h:[Z

    .line 36
    .line 37
    invoke-static {v2, v0, v1, p1}, Lh0/d;->c([BII[Z)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-ne p1, v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v2, v0, v1}, Ll1/p;->h([BII)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-static {v2, p1}, Lh0/d;->f([BI)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    sub-int v3, p1, v0

    .line 52
    .line 53
    if-lez v3, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0, v2, v0, p1}, Ll1/p;->h([BII)V

    .line 56
    .line 57
    .line 58
    :cond_1
    sub-int v10, v1, p1

    .line 59
    .line 60
    iget-wide v4, p0, Ll1/p;->g:J

    .line 61
    .line 62
    int-to-long v7, v10

    .line 63
    sub-long/2addr v4, v7

    .line 64
    if-gez v3, :cond_2

    .line 65
    .line 66
    neg-int v0, v3

    .line 67
    :goto_1
    move v11, v0

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    const/4 v0, 0x0

    .line 70
    goto :goto_1

    .line 71
    :goto_2
    iget-wide v12, p0, Ll1/p;->m:J

    .line 72
    .line 73
    move-object v7, p0

    .line 74
    move-wide v8, v4

    .line 75
    invoke-virtual/range {v7 .. v13}, Ll1/p;->g(JIIJ)V

    .line 76
    .line 77
    .line 78
    iget-wide v7, p0, Ll1/p;->m:J

    .line 79
    .line 80
    move-object v3, p0

    .line 81
    invoke-virtual/range {v3 .. v8}, Ll1/p;->i(JIJ)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v0, p1, 0x3

    .line 85
    .line 86
    goto :goto_0
.end method

.method public b()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Ll1/p;->g:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Ll1/p;->n:Z

    .line 7
    .line 8
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v0, p0, Ll1/p;->m:J

    .line 14
    .line 15
    iget-object v0, p0, Ll1/p;->h:[Z

    .line 16
    .line 17
    invoke-static {v0}, Lh0/d;->a([Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Ll1/p;->d:Ll1/w;

    .line 21
    .line 22
    invoke-virtual {v0}, Ll1/w;->d()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ll1/p;->e:Ll1/w;

    .line 26
    .line 27
    invoke-virtual {v0}, Ll1/w;->d()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Ll1/p;->f:Ll1/w;

    .line 31
    .line 32
    invoke-virtual {v0}, Ll1/w;->d()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Ll1/p;->k:Ll1/p$b;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0}, Ll1/p$b;->h()V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ll1/p;->f()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Ll1/p;->k:Ll1/p$b;

    .line 7
    .line 8
    iget-wide v0, p0, Ll1/p;->g:J

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Ll1/p$b;->b(J)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public d(JI)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ll1/p;->m:J

    .line 2
    .line 3
    iget-boolean p1, p0, Ll1/p;->n:Z

    .line 4
    .line 5
    and-int/lit8 p2, p3, 0x2

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    or-int/2addr p1, p2

    .line 13
    iput-boolean p1, p0, Ll1/p;->n:Z

    .line 14
    .line 15
    return-void
.end method

.method public e(LF0/t;Ll1/K$d;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ll1/K$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ll1/K$d;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Ll1/p;->i:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Ll1/K$d;->c()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-interface {p1, v0, v1}, LF0/t;->a(II)LF0/T;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Ll1/p;->j:LF0/T;

    .line 20
    .line 21
    new-instance v1, Ll1/p$b;

    .line 22
    .line 23
    iget-boolean v2, p0, Ll1/p;->b:Z

    .line 24
    .line 25
    iget-boolean v3, p0, Ll1/p;->c:Z

    .line 26
    .line 27
    invoke-direct {v1, v0, v2, v3}, Ll1/p$b;-><init>(LF0/T;ZZ)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Ll1/p;->k:Ll1/p$b;

    .line 31
    .line 32
    iget-object v0, p0, Ll1/p;->a:Ll1/F;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Ll1/F;->b(LF0/t;Ll1/K$d;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final g(JIIJ)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Ll1/p;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll1/p;->k:Ll1/p$b;

    invoke-virtual {v0}, Ll1/p$b;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Ll1/p;->d:Ll1/w;

    invoke-virtual {v0, p4}, Ll1/w;->b(I)Z

    iget-object v0, p0, Ll1/p;->e:Ll1/w;

    invoke-virtual {v0, p4}, Ll1/w;->b(I)Z

    iget-boolean v0, p0, Ll1/p;->l:Z

    const/4 v1, 0x3

    if-nez v0, :cond_1

    iget-object v0, p0, Ll1/p;->d:Ll1/w;

    invoke-virtual {v0}, Ll1/w;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll1/p;->e:Ll1/w;

    invoke-virtual {v0}, Ll1/w;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Ll1/p;->d:Ll1/w;

    iget-object v3, v2, Ll1/w;->d:[B

    iget v2, v2, Ll1/w;->e:I

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Ll1/p;->e:Ll1/w;

    iget-object v3, v2, Ll1/w;->d:[B

    iget v2, v2, Ll1/w;->e:I

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Ll1/p;->d:Ll1/w;

    iget-object v3, v2, Ll1/w;->d:[B

    iget v2, v2, Ll1/w;->e:I

    invoke-static {v3, v1, v2}, Lh0/d;->l([BII)Lh0/d$c;

    move-result-object v2

    iget-object v3, p0, Ll1/p;->e:Ll1/w;

    iget-object v4, v3, Ll1/w;->d:[B

    iget v3, v3, Ll1/w;->e:I

    invoke-static {v4, v1, v3}, Lh0/d;->j([BII)Lh0/d$b;

    move-result-object v1

    iget v3, v2, Lh0/d$c;->a:I

    iget v4, v2, Lh0/d$c;->b:I

    iget v5, v2, Lh0/d$c;->c:I

    invoke-static {v3, v4, v5}, Lg0/d;->a(III)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ll1/p;->j:LF0/T;

    new-instance v5, Ld0/q$b;

    invoke-direct {v5}, Ld0/q$b;-><init>()V

    iget-object v6, p0, Ll1/p;->i:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    move-result-object v5

    const-string v6, "video/avc"

    invoke-virtual {v5, v6}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    move-result-object v5

    invoke-virtual {v5, v3}, Ld0/q$b;->O(Ljava/lang/String;)Ld0/q$b;

    move-result-object v3

    iget v5, v2, Lh0/d$c;->f:I

    invoke-virtual {v3, v5}, Ld0/q$b;->v0(I)Ld0/q$b;

    move-result-object v3

    iget v5, v2, Lh0/d$c;->g:I

    invoke-virtual {v3, v5}, Ld0/q$b;->Y(I)Ld0/q$b;

    move-result-object v3

    new-instance v5, Ld0/h$b;

    invoke-direct {v5}, Ld0/h$b;-><init>()V

    iget v6, v2, Lh0/d$c;->q:I

    invoke-virtual {v5, v6}, Ld0/h$b;->d(I)Ld0/h$b;

    move-result-object v5

    iget v6, v2, Lh0/d$c;->r:I

    invoke-virtual {v5, v6}, Ld0/h$b;->c(I)Ld0/h$b;

    move-result-object v5

    iget v6, v2, Lh0/d$c;->s:I

    invoke-virtual {v5, v6}, Ld0/h$b;->e(I)Ld0/h$b;

    move-result-object v5

    iget v6, v2, Lh0/d$c;->i:I

    add-int/lit8 v6, v6, 0x8

    invoke-virtual {v5, v6}, Ld0/h$b;->g(I)Ld0/h$b;

    move-result-object v5

    iget v6, v2, Lh0/d$c;->j:I

    add-int/lit8 v6, v6, 0x8

    invoke-virtual {v5, v6}, Ld0/h$b;->b(I)Ld0/h$b;

    move-result-object v5

    invoke-virtual {v5}, Ld0/h$b;->a()Ld0/h;

    move-result-object v5

    invoke-virtual {v3, v5}, Ld0/q$b;->P(Ld0/h;)Ld0/q$b;

    move-result-object v3

    iget v5, v2, Lh0/d$c;->h:F

    invoke-virtual {v3, v5}, Ld0/q$b;->k0(F)Ld0/q$b;

    move-result-object v3

    invoke-virtual {v3, v0}, Ld0/q$b;->b0(Ljava/util/List;)Ld0/q$b;

    move-result-object v0

    iget v3, v2, Lh0/d$c;->t:I

    invoke-virtual {v0, v3}, Ld0/q$b;->g0(I)Ld0/q$b;

    move-result-object v0

    invoke-virtual {v0}, Ld0/q$b;->K()Ld0/q;

    move-result-object v0

    invoke-interface {v4, v0}, LF0/T;->d(Ld0/q;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll1/p;->l:Z

    iget-object v0, p0, Ll1/p;->k:Ll1/p$b;

    invoke-virtual {v0, v2}, Ll1/p$b;->g(Lh0/d$c;)V

    iget-object v0, p0, Ll1/p;->k:Ll1/p$b;

    invoke-virtual {v0, v1}, Ll1/p$b;->f(Lh0/d$b;)V

    iget-object v0, p0, Ll1/p;->d:Ll1/w;

    invoke-virtual {v0}, Ll1/w;->d()V

    :goto_0
    iget-object v0, p0, Ll1/p;->e:Ll1/w;

    :goto_1
    invoke-virtual {v0}, Ll1/w;->d()V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Ll1/p;->d:Ll1/w;

    invoke-virtual {v0}, Ll1/w;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll1/p;->d:Ll1/w;

    iget-object v2, v0, Ll1/w;->d:[B

    iget v0, v0, Ll1/w;->e:I

    invoke-static {v2, v1, v0}, Lh0/d;->l([BII)Lh0/d$c;

    move-result-object v0

    iget-object v1, p0, Ll1/p;->k:Ll1/p$b;

    invoke-virtual {v1, v0}, Ll1/p$b;->g(Lh0/d$c;)V

    iget-object v0, p0, Ll1/p;->d:Ll1/w;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ll1/p;->e:Ll1/w;

    invoke-virtual {v0}, Ll1/w;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll1/p;->e:Ll1/w;

    iget-object v2, v0, Ll1/w;->d:[B

    iget v0, v0, Ll1/w;->e:I

    invoke-static {v2, v1, v0}, Lh0/d;->j([BII)Lh0/d$b;

    move-result-object v0

    iget-object v1, p0, Ll1/p;->k:Ll1/p$b;

    invoke-virtual {v1, v0}, Ll1/p$b;->f(Lh0/d$b;)V

    goto :goto_0

    :cond_3
    :goto_2
    iget-object v0, p0, Ll1/p;->f:Ll1/w;

    invoke-virtual {v0, p4}, Ll1/w;->b(I)Z

    move-result p4

    if-eqz p4, :cond_4

    iget-object p4, p0, Ll1/p;->f:Ll1/w;

    iget-object v0, p4, Ll1/w;->d:[B

    iget p4, p4, Ll1/w;->e:I

    invoke-static {v0, p4}, Lh0/d;->r([BI)I

    move-result p4

    iget-object v0, p0, Ll1/p;->o:Lg0/z;

    iget-object v1, p0, Ll1/p;->f:Ll1/w;

    iget-object v1, v1, Ll1/w;->d:[B

    invoke-virtual {v0, v1, p4}, Lg0/z;->R([BI)V

    iget-object p4, p0, Ll1/p;->o:Lg0/z;

    const/4 v0, 0x4

    invoke-virtual {p4, v0}, Lg0/z;->T(I)V

    iget-object p4, p0, Ll1/p;->a:Ll1/F;

    iget-object v0, p0, Ll1/p;->o:Lg0/z;

    invoke-virtual {p4, p5, p6, v0}, Ll1/F;->a(JLg0/z;)V

    :cond_4
    iget-object p4, p0, Ll1/p;->k:Ll1/p$b;

    iget-boolean p5, p0, Ll1/p;->l:Z

    invoke-virtual {p4, p1, p2, p3, p5}, Ll1/p$b;->c(JIZ)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll1/p;->n:Z

    :cond_5
    return-void
.end method

.method public final h([BII)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll1/p;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ll1/p;->k:Ll1/p$b;

    .line 6
    .line 7
    invoke-virtual {v0}, Ll1/p$b;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ll1/p;->d:Ll1/w;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2, p3}, Ll1/w;->a([BII)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Ll1/p;->e:Ll1/w;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2, p3}, Ll1/w;->a([BII)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Ll1/p;->f:Ll1/w;

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2, p3}, Ll1/w;->a([BII)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Ll1/p;->k:Ll1/p$b;

    .line 29
    .line 30
    invoke-virtual {v0, p1, p2, p3}, Ll1/p$b;->a([BII)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final i(JIJ)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Ll1/p;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ll1/p;->k:Ll1/p$b;

    .line 6
    .line 7
    invoke-virtual {v0}, Ll1/p$b;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ll1/p;->d:Ll1/w;

    .line 14
    .line 15
    invoke-virtual {v0, p3}, Ll1/w;->e(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Ll1/p;->e:Ll1/w;

    .line 19
    .line 20
    invoke-virtual {v0, p3}, Ll1/w;->e(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Ll1/p;->f:Ll1/w;

    .line 24
    .line 25
    invoke-virtual {v0, p3}, Ll1/w;->e(I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ll1/p;->k:Ll1/p$b;

    .line 29
    .line 30
    iget-boolean v7, p0, Ll1/p;->n:Z

    .line 31
    .line 32
    move-wide v2, p1

    .line 33
    move v4, p3

    .line 34
    move-wide v5, p4

    .line 35
    invoke-virtual/range {v1 .. v7}, Ll1/p$b;->j(JIJZ)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
