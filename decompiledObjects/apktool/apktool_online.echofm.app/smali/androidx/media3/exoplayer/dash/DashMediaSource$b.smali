.class public final Landroidx/media3/exoplayer/dash/DashMediaSource$b;
.super Ld0/I;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:I

.field public final i:J

.field public final j:J

.field public final k:J

.field public final l:Lo0/c;

.field public final m:Ld0/u;

.field public final n:Ld0/u$g;


# direct methods
.method public constructor <init>(JJJIJJJLo0/c;Ld0/u;Ld0/u$g;)V
    .locals 7

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v1, p14

    .line 3
    .line 4
    move-object/from16 v2, p16

    .line 5
    .line 6
    invoke-direct {p0}, Ld0/I;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-boolean v3, v1, Lo0/c;->d:Z

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    move v6, v4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v6, v5

    .line 18
    :goto_0
    if-ne v3, v6, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v4, v5

    .line 22
    :goto_1
    invoke-static {v4}, Lg0/a;->f(Z)V

    .line 23
    .line 24
    .line 25
    move-wide v3, p1

    .line 26
    iput-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->e:J

    .line 27
    .line 28
    move-wide v3, p3

    .line 29
    iput-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->f:J

    .line 30
    .line 31
    move-wide v3, p5

    .line 32
    iput-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->g:J

    .line 33
    .line 34
    move v3, p7

    .line 35
    iput v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->h:I

    .line 36
    .line 37
    move-wide v3, p8

    .line 38
    iput-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->i:J

    .line 39
    .line 40
    move-wide/from16 v3, p10

    .line 41
    .line 42
    iput-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->j:J

    .line 43
    .line 44
    move-wide/from16 v3, p12

    .line 45
    .line 46
    iput-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->k:J

    .line 47
    .line 48
    iput-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->l:Lo0/c;

    .line 49
    .line 50
    move-object/from16 v1, p15

    .line 51
    .line 52
    iput-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->m:Ld0/u;

    .line 53
    .line 54
    iput-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->n:Ld0/u$g;

    .line 55
    .line 56
    return-void
.end method

.method public static t(Lo0/c;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lo0/c;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lo0/c;->e:J

    .line 6
    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-wide v0, p0, Lo0/c;->b:J

    .line 17
    .line 18
    cmp-long p0, v0, v2

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    :goto_0
    return p0
.end method


# virtual methods
.method public b(Ljava/lang/Object;)I
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->h:I

    sub-int/2addr p1, v0

    if-ltz p1, :cond_2

    invoke-virtual {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->i()I

    move-result v0

    if-lt p1, v0, :cond_1

    goto :goto_0

    :cond_1
    move v1, p1

    :cond_2
    :goto_0
    return v1
.end method

.method public g(ILd0/I$b;Z)Ld0/I$b;
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p1, v1, v0}, Lg0/a;->c(III)I

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->l:Lo0/c;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, Lo0/c;->d(I)Lo0/g;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v2, v2, Lo0/g;->a:Ljava/lang/String;

    .line 19
    .line 20
    move-object v4, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v4, v0

    .line 23
    :goto_0
    if-eqz p3, :cond_1

    .line 24
    .line 25
    iget p3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->h:I

    .line 26
    .line 27
    add-int/2addr p3, p1

    .line 28
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    move-object v5, v0

    .line 33
    iget-object p3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->l:Lo0/c;

    .line 34
    .line 35
    invoke-virtual {p3, p1}, Lo0/c;->g(I)J

    .line 36
    .line 37
    .line 38
    move-result-wide v7

    .line 39
    iget-object p3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->l:Lo0/c;

    .line 40
    .line 41
    invoke-virtual {p3, p1}, Lo0/c;->d(I)Lo0/g;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-wide v2, p1, Lo0/g;->b:J

    .line 46
    .line 47
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->l:Lo0/c;

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Lo0/c;->d(I)Lo0/g;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-wide v0, p1, Lo0/g;->b:J

    .line 54
    .line 55
    sub-long/2addr v2, v0

    .line 56
    invoke-static {v2, v3}, Lg0/M;->J0(J)J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    iget-wide v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->i:J

    .line 61
    .line 62
    sub-long v9, v0, v2

    .line 63
    .line 64
    const/4 v6, 0x0

    .line 65
    move-object v3, p2

    .line 66
    invoke-virtual/range {v3 .. v10}, Ld0/I$b;->s(Ljava/lang/Object;Ljava/lang/Object;IJJ)Ld0/I$b;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1
.end method

.method public i()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->l:Lo0/c;

    invoke-virtual {v0}, Lo0/c;->e()I

    move-result v0

    return v0
.end method

.method public m(I)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->i()I

    move-result v1

    invoke-static {p1, v0, v1}, Lg0/a;->c(III)I

    iget v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->h:I

    add-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public o(ILd0/I$c;J)Ld0/I$c;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v11, 0x1

    .line 7
    move/from16 v3, p1

    .line 8
    .line 9
    invoke-static {v3, v2, v11}, Lg0/a;->c(III)I

    .line 10
    .line 11
    .line 12
    move-wide/from16 v2, p3

    .line 13
    .line 14
    invoke-virtual {v0, v2, v3}, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->s(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v14

    .line 18
    sget-object v2, Ld0/I$c;->q:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->m:Ld0/u;

    .line 21
    .line 22
    iget-object v12, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->l:Lo0/c;

    .line 23
    .line 24
    move-object v4, v12

    .line 25
    iget-wide v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->e:J

    .line 26
    .line 27
    iget-wide v7, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->f:J

    .line 28
    .line 29
    iget-wide v9, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->g:J

    .line 30
    .line 31
    invoke-static {v12}, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->t(Lo0/c;)Z

    .line 32
    .line 33
    .line 34
    move-result v12

    .line 35
    iget-object v13, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->n:Ld0/u$g;

    .line 36
    .line 37
    move/from16 p1, v12

    .line 38
    .line 39
    iget-wide v11, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->j:J

    .line 40
    .line 41
    move-wide/from16 v16, v11

    .line 42
    .line 43
    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->i()I

    .line 44
    .line 45
    .line 46
    move-result v11

    .line 47
    const/4 v12, 0x1

    .line 48
    add-int/lit8 v19, v11, -0x1

    .line 49
    .line 50
    iget-wide v11, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->i:J

    .line 51
    .line 52
    move-wide/from16 v20, v11

    .line 53
    .line 54
    const/4 v11, 0x1

    .line 55
    const/16 v18, 0x0

    .line 56
    .line 57
    move/from16 v12, p1

    .line 58
    .line 59
    invoke-virtual/range {v1 .. v21}, Ld0/I$c;->g(Ljava/lang/Object;Ld0/u;Ljava/lang/Object;JJJZZLd0/u$g;JJIIJ)Ld0/I$c;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    return-object v1
.end method

.method public p()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public final s(J)J
    .locals 10

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->k:J

    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->l:Lo0/c;

    invoke-static {v2}, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->t(Lo0/c;)Z

    move-result v2

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-lez v4, :cond_1

    add-long/2addr v0, p1

    iget-wide p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->j:J

    cmp-long p1, v0, p1

    if-lez p1, :cond_1

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p1

    :cond_1
    iget-wide p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->i:J

    add-long/2addr p1, v0

    iget-object v4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->l:Lo0/c;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lo0/c;->g(I)J

    move-result-wide v6

    move v4, v5

    :goto_0
    iget-object v8, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->l:Lo0/c;

    invoke-virtual {v8}, Lo0/c;->e()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-ge v4, v8, :cond_2

    cmp-long v8, p1, v6

    if-ltz v8, :cond_2

    sub-long/2addr p1, v6

    add-int/lit8 v4, v4, 0x1

    iget-object v6, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->l:Lo0/c;

    invoke-virtual {v6, v4}, Lo0/c;->g(I)J

    move-result-wide v6

    goto :goto_0

    :cond_2
    iget-object v8, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$b;->l:Lo0/c;

    invoke-virtual {v8, v4}, Lo0/c;->d(I)Lo0/g;

    move-result-object v4

    const/4 v8, 0x2

    invoke-virtual {v4, v8}, Lo0/g;->a(I)I

    move-result v8

    const/4 v9, -0x1

    if-ne v8, v9, :cond_3

    return-wide v0

    :cond_3
    iget-object v4, v4, Lo0/g;->c:Ljava/util/List;

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo0/a;

    iget-object v4, v4, Lo0/a;->c:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo0/j;

    invoke-virtual {v4}, Lo0/j;->l()Ln0/g;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-interface {v4, v6, v7}, Ln0/g;->i(J)J

    move-result-wide v8

    cmp-long v2, v8, v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v4, p1, p2, v6, v7}, Ln0/g;->a(JJ)J

    move-result-wide v2

    invoke-interface {v4, v2, v3}, Ln0/g;->c(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    sub-long/2addr v0, p1

    :cond_5
    :goto_1
    return-wide v0
.end method
