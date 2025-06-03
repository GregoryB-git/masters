.class public final LF0/B;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/B$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:J

.field public final k:LF0/B$a;

.field public final l:Ld0/x;


# direct methods
.method public constructor <init>(IIIIIIIJLF0/B$a;Ld0/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LF0/B;->a:I

    iput p2, p0, LF0/B;->b:I

    iput p3, p0, LF0/B;->c:I

    iput p4, p0, LF0/B;->d:I

    iput p5, p0, LF0/B;->e:I

    invoke-static {p5}, LF0/B;->j(I)I

    move-result p1

    iput p1, p0, LF0/B;->f:I

    iput p6, p0, LF0/B;->g:I

    iput p7, p0, LF0/B;->h:I

    invoke-static {p7}, LF0/B;->e(I)I

    move-result p1

    iput p1, p0, LF0/B;->i:I

    iput-wide p8, p0, LF0/B;->j:J

    iput-object p10, p0, LF0/B;->k:LF0/B$a;

    iput-object p11, p0, LF0/B;->l:Ld0/x;

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg0/y;

    invoke-direct {v0, p1}, Lg0/y;-><init>([B)V

    mul-int/lit8 p2, p2, 0x8

    invoke-virtual {v0, p2}, Lg0/y;->p(I)V

    const/16 p1, 0x10

    invoke-virtual {v0, p1}, Lg0/y;->h(I)I

    move-result p2

    iput p2, p0, LF0/B;->a:I

    invoke-virtual {v0, p1}, Lg0/y;->h(I)I

    move-result p1

    iput p1, p0, LF0/B;->b:I

    const/16 p1, 0x18

    invoke-virtual {v0, p1}, Lg0/y;->h(I)I

    move-result p2

    iput p2, p0, LF0/B;->c:I

    invoke-virtual {v0, p1}, Lg0/y;->h(I)I

    move-result p1

    iput p1, p0, LF0/B;->d:I

    const/16 p1, 0x14

    invoke-virtual {v0, p1}, Lg0/y;->h(I)I

    move-result p1

    iput p1, p0, LF0/B;->e:I

    invoke-static {p1}, LF0/B;->j(I)I

    move-result p1

    iput p1, p0, LF0/B;->f:I

    const/4 p1, 0x3

    invoke-virtual {v0, p1}, Lg0/y;->h(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LF0/B;->g:I

    const/4 p1, 0x5

    invoke-virtual {v0, p1}, Lg0/y;->h(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LF0/B;->h:I

    invoke-static {p1}, LF0/B;->e(I)I

    move-result p1

    iput p1, p0, LF0/B;->i:I

    const/16 p1, 0x24

    invoke-virtual {v0, p1}, Lg0/y;->j(I)J

    move-result-wide p1

    iput-wide p1, p0, LF0/B;->j:J

    const/4 p1, 0x0

    iput-object p1, p0, LF0/B;->k:LF0/B$a;

    iput-object p1, p0, LF0/B;->l:Ld0/x;

    return-void
.end method

.method public static e(I)I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-eq p0, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x14

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x18

    .line 18
    .line 19
    if-eq p0, v0, :cond_0

    .line 20
    .line 21
    const/4 p0, -0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x6

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x5

    .line 26
    return p0

    .line 27
    :cond_2
    const/4 p0, 0x4

    .line 28
    return p0

    .line 29
    :cond_3
    const/4 p0, 0x2

    .line 30
    return p0

    .line 31
    :cond_4
    const/4 p0, 0x1

    .line 32
    return p0
.end method

.method public static j(I)I
    .locals 0

    .line 1
    sparse-switch p0, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, -0x1

    .line 5
    return p0

    .line 6
    :sswitch_0
    const/4 p0, 0x3

    .line 7
    return p0

    .line 8
    :sswitch_1
    const/4 p0, 0x2

    .line 9
    return p0

    .line 10
    :sswitch_2
    const/16 p0, 0xb

    .line 11
    .line 12
    return p0

    .line 13
    :sswitch_3
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :sswitch_4
    const/16 p0, 0xa

    .line 16
    .line 17
    return p0

    .line 18
    :sswitch_5
    const/16 p0, 0x9

    .line 19
    .line 20
    return p0

    .line 21
    :sswitch_6
    const/16 p0, 0x8

    .line 22
    .line 23
    return p0

    .line 24
    :sswitch_7
    const/4 p0, 0x7

    .line 25
    return p0

    .line 26
    :sswitch_8
    const/4 p0, 0x6

    .line 27
    return p0

    .line 28
    :sswitch_9
    const/4 p0, 0x5

    .line 29
    return p0

    .line 30
    :sswitch_a
    const/4 p0, 0x4

    .line 31
    return p0

    .line 32
    nop

    .line 33
    :sswitch_data_0
    .sparse-switch
        0x1f40 -> :sswitch_a
        0x3e80 -> :sswitch_9
        0x5622 -> :sswitch_8
        0x5dc0 -> :sswitch_7
        0x7d00 -> :sswitch_6
        0xac44 -> :sswitch_5
        0xbb80 -> :sswitch_4
        0x15888 -> :sswitch_3
        0x17700 -> :sswitch_2
        0x2b110 -> :sswitch_1
        0x2ee00 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public a(Ljava/util/List;)LF0/B;
    .locals 13

    .line 1
    new-instance v0, Ld0/x;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ld0/x;-><init>(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, LF0/B;->h(Ld0/x;)Ld0/x;

    .line 7
    .line 8
    .line 9
    move-result-object v12

    .line 10
    new-instance p1, LF0/B;

    .line 11
    .line 12
    iget v2, p0, LF0/B;->a:I

    .line 13
    .line 14
    iget v3, p0, LF0/B;->b:I

    .line 15
    .line 16
    iget v4, p0, LF0/B;->c:I

    .line 17
    .line 18
    iget v5, p0, LF0/B;->d:I

    .line 19
    .line 20
    iget v6, p0, LF0/B;->e:I

    .line 21
    .line 22
    iget v7, p0, LF0/B;->g:I

    .line 23
    .line 24
    iget v8, p0, LF0/B;->h:I

    .line 25
    .line 26
    iget-wide v9, p0, LF0/B;->j:J

    .line 27
    .line 28
    iget-object v11, p0, LF0/B;->k:LF0/B$a;

    .line 29
    .line 30
    move-object v1, p1

    .line 31
    invoke-direct/range {v1 .. v12}, LF0/B;-><init>(IIIIIIIJLF0/B$a;Ld0/x;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method public b(LF0/B$a;)LF0/B;
    .locals 13

    .line 1
    new-instance v12, LF0/B;

    .line 2
    .line 3
    iget v1, p0, LF0/B;->a:I

    .line 4
    .line 5
    iget v2, p0, LF0/B;->b:I

    .line 6
    .line 7
    iget v3, p0, LF0/B;->c:I

    .line 8
    .line 9
    iget v4, p0, LF0/B;->d:I

    .line 10
    .line 11
    iget v5, p0, LF0/B;->e:I

    .line 12
    .line 13
    iget v6, p0, LF0/B;->g:I

    .line 14
    .line 15
    iget v7, p0, LF0/B;->h:I

    .line 16
    .line 17
    iget-wide v8, p0, LF0/B;->j:J

    .line 18
    .line 19
    iget-object v11, p0, LF0/B;->l:Ld0/x;

    .line 20
    .line 21
    move-object v0, v12

    .line 22
    move-object v10, p1

    .line 23
    invoke-direct/range {v0 .. v11}, LF0/B;-><init>(IIIIIIIJLF0/B$a;Ld0/x;)V

    .line 24
    .line 25
    .line 26
    return-object v12
.end method

.method public c(Ljava/util/List;)LF0/B;
    .locals 12

    .line 1
    invoke-static {p1}, LF0/W;->d(Ljava/util/List;)Ld0/x;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LF0/B;->h(Ld0/x;)Ld0/x;

    .line 6
    .line 7
    .line 8
    move-result-object v11

    .line 9
    new-instance p1, LF0/B;

    .line 10
    .line 11
    iget v1, p0, LF0/B;->a:I

    .line 12
    .line 13
    iget v2, p0, LF0/B;->b:I

    .line 14
    .line 15
    iget v3, p0, LF0/B;->c:I

    .line 16
    .line 17
    iget v4, p0, LF0/B;->d:I

    .line 18
    .line 19
    iget v5, p0, LF0/B;->e:I

    .line 20
    .line 21
    iget v6, p0, LF0/B;->g:I

    .line 22
    .line 23
    iget v7, p0, LF0/B;->h:I

    .line 24
    .line 25
    iget-wide v8, p0, LF0/B;->j:J

    .line 26
    .line 27
    iget-object v10, p0, LF0/B;->k:LF0/B$a;

    .line 28
    .line 29
    move-object v0, p1

    .line 30
    invoke-direct/range {v0 .. v11}, LF0/B;-><init>(IIIIIIIJLF0/B$a;Ld0/x;)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method

.method public d()J
    .locals 4

    .line 1
    iget v0, p0, LF0/B;->d:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    int-to-long v0, v0

    .line 6
    iget v2, p0, LF0/B;->c:I

    .line 7
    .line 8
    int-to-long v2, v2

    .line 9
    add-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x2

    .line 11
    .line 12
    div-long/2addr v0, v2

    .line 13
    const-wide/16 v2, 0x1

    .line 14
    .line 15
    :goto_0
    add-long/2addr v0, v2

    .line 16
    goto :goto_2

    .line 17
    :cond_0
    iget v0, p0, LF0/B;->a:I

    .line 18
    .line 19
    iget v1, p0, LF0/B;->b:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    if-lez v0, :cond_1

    .line 24
    .line 25
    int-to-long v0, v0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const-wide/16 v0, 0x1000

    .line 28
    .line 29
    :goto_1
    iget v2, p0, LF0/B;->g:I

    .line 30
    .line 31
    int-to-long v2, v2

    .line 32
    mul-long/2addr v0, v2

    .line 33
    iget v2, p0, LF0/B;->h:I

    .line 34
    .line 35
    int-to-long v2, v2

    .line 36
    mul-long/2addr v0, v2

    .line 37
    const-wide/16 v2, 0x8

    .line 38
    .line 39
    div-long/2addr v0, v2

    .line 40
    const-wide/16 v2, 0x40

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :goto_2
    return-wide v0
.end method

.method public f()J
    .locals 4

    .line 1
    iget-wide v0, p0, LF0/B;->j:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-wide/32 v2, 0xf4240

    .line 16
    .line 17
    .line 18
    mul-long/2addr v0, v2

    .line 19
    iget v2, p0, LF0/B;->e:I

    .line 20
    .line 21
    int-to-long v2, v2

    .line 22
    div-long/2addr v0, v2

    .line 23
    :goto_0
    return-wide v0
.end method

.method public g([BLd0/x;)Ld0/q;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    const/16 v1, -0x80

    .line 3
    .line 4
    aput-byte v1, p1, v0

    .line 5
    .line 6
    iget v0, p0, LF0/B;->d:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, -0x1

    .line 12
    :goto_0
    invoke-virtual {p0, p2}, LF0/B;->h(Ld0/x;)Ld0/x;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    new-instance v1, Ld0/q$b;

    .line 17
    .line 18
    invoke-direct {v1}, Ld0/q$b;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "audio/flac"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1, v0}, Ld0/q$b;->f0(I)Ld0/q$b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget v1, p0, LF0/B;->g:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ld0/q$b;->N(I)Ld0/q$b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget v1, p0, LF0/B;->e:I

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ld0/q$b;->p0(I)Ld0/q$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget v1, p0, LF0/B;->h:I

    .line 44
    .line 45
    invoke-static {v1}, Lg0/M;->e0(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {v0, v1}, Ld0/q$b;->i0(I)Ld0/q$b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v0, p1}, Ld0/q$b;->b0(Ljava/util/List;)Ld0/q$b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1, p2}, Ld0/q$b;->h0(Ld0/x;)Ld0/q$b;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ld0/q$b;->K()Ld0/q;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method public h(Ld0/x;)Ld0/x;
    .locals 1

    .line 1
    iget-object v0, p0, LF0/B;->l:Ld0/x;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Ld0/x;->b(Ld0/x;)Ld0/x;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    return-object p1
.end method

.method public i(J)J
    .locals 8

    .line 1
    iget v0, p0, LF0/B;->e:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    mul-long/2addr p1, v0

    .line 5
    const-wide/32 v0, 0xf4240

    .line 6
    .line 7
    .line 8
    div-long v2, p1, v0

    .line 9
    .line 10
    iget-wide p1, p0, LF0/B;->j:J

    .line 11
    .line 12
    const-wide/16 v0, 0x1

    .line 13
    .line 14
    sub-long v6, p1, v0

    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    invoke-static/range {v2 .. v7}, Lg0/M;->q(JJJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    return-wide p1
.end method
