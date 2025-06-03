.class public Lc1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc1/o$b;
    }
.end annotation


# instance fields
.field public final a:Lc1/t;

.field public final b:Lc1/d;

.field public final c:Ld0/q;

.field public final d:Ljava/util/List;

.field public final e:Lg0/z;

.field public f:[B

.field public g:LF0/T;

.field public h:I

.field public i:I

.field public j:[J

.field public k:J


# direct methods
.method public constructor <init>(Lc1/t;Ld0/q;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc1/o;->a:Lc1/t;

    .line 5
    .line 6
    new-instance v0, Lc1/d;

    .line 7
    .line 8
    invoke-direct {v0}, Lc1/d;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lc1/o;->b:Lc1/d;

    .line 12
    .line 13
    sget-object v0, Lg0/M;->f:[B

    .line 14
    .line 15
    iput-object v0, p0, Lc1/o;->f:[B

    .line 16
    .line 17
    new-instance v0, Lg0/z;

    .line 18
    .line 19
    invoke-direct {v0}, Lg0/z;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lc1/o;->e:Lg0/z;

    .line 23
    .line 24
    invoke-virtual {p2}, Ld0/q;->a()Ld0/q$b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "application/x-media3-cues"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object p2, p2, Ld0/q;->n:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ld0/q$b;->O(Ljava/lang/String;)Ld0/q$b;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-interface {p1}, Lc1/t;->d()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p2, p1}, Ld0/q$b;->S(I)Ld0/q$b;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ld0/q$b;->K()Ld0/q;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lc1/o;->c:Ld0/q;

    .line 53
    .line 54
    new-instance p1, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lc1/o;->d:Ljava/util/List;

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    iput p1, p0, Lc1/o;->i:I

    .line 63
    .line 64
    sget-object p1, Lg0/M;->g:[J

    .line 65
    .line 66
    iput-object p1, p0, Lc1/o;->j:[J

    .line 67
    .line 68
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    iput-wide p1, p0, Lc1/o;->k:J

    .line 74
    .line 75
    return-void
.end method

.method public static synthetic c(Lc1/o;Lc1/e;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc1/o;->f(Lc1/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 1

    .line 1
    iget p1, p0, Lc1/o;->i:I

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    move p1, p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    invoke-static {p1}, Lg0/a;->f(Z)V

    .line 13
    .line 14
    .line 15
    iput-wide p3, p0, Lc1/o;->k:J

    .line 16
    .line 17
    iget p1, p0, Lc1/o;->i:I

    .line 18
    .line 19
    const/4 p3, 0x2

    .line 20
    if-ne p1, p3, :cond_1

    .line 21
    .line 22
    iput p2, p0, Lc1/o;->i:I

    .line 23
    .line 24
    :cond_1
    iget p1, p0, Lc1/o;->i:I

    .line 25
    .line 26
    const/4 p2, 0x4

    .line 27
    if-ne p1, p2, :cond_2

    .line 28
    .line 29
    const/4 p1, 0x3

    .line 30
    iput p1, p0, Lc1/o;->i:I

    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public b(LF0/t;)V
    .locals 7

    .line 1
    iget v0, p0, Lc1/o;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    invoke-interface {p1, v1, v0}, LF0/t;->a(II)LF0/T;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lc1/o;->g:LF0/T;

    .line 19
    .line 20
    iget-object v3, p0, Lc1/o;->c:Ld0/q;

    .line 21
    .line 22
    invoke-interface {v0, v3}, LF0/T;->d(Ld0/q;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, LF0/t;->j()V

    .line 26
    .line 27
    .line 28
    new-instance v0, LF0/H;

    .line 29
    .line 30
    const-wide/16 v3, 0x0

    .line 31
    .line 32
    new-array v5, v2, [J

    .line 33
    .line 34
    aput-wide v3, v5, v1

    .line 35
    .line 36
    new-array v6, v2, [J

    .line 37
    .line 38
    aput-wide v3, v6, v1

    .line 39
    .line 40
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v5, v6, v3, v4}, LF0/H;-><init>([J[JJ)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v0}, LF0/t;->e(LF0/M;)V

    .line 49
    .line 50
    .line 51
    iput v2, p0, Lc1/o;->i:I

    .line 52
    .line 53
    return-void
.end method

.method public synthetic d()LF0/r;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->b(LF0/r;)LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public e(LF0/s;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public final synthetic f(Lc1/e;)V
    .locals 7

    .line 1
    new-instance v0, Lc1/o$b;

    .line 2
    .line 3
    iget-wide v1, p1, Lc1/e;->b:J

    .line 4
    .line 5
    iget-object v3, p0, Lc1/o;->b:Lc1/d;

    .line 6
    .line 7
    iget-object v4, p1, Lc1/e;->a:LX2/v;

    .line 8
    .line 9
    iget-wide v5, p1, Lc1/e;->c:J

    .line 10
    .line 11
    invoke-virtual {v3, v4, v5, v6}, Lc1/d;->a(Ljava/util/List;J)[B

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v0, v1, v2, v3, v4}, Lc1/o$b;-><init>(J[BLc1/o$a;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lc1/o;->d:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-wide v1, p0, Lc1/o;->k:J

    .line 25
    .line 26
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long v3, v1, v3

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    iget-wide v3, p1, Lc1/e;->b:J

    .line 36
    .line 37
    cmp-long p1, v3, v1

    .line 38
    .line 39
    if-ltz p1, :cond_1

    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0, v0}, Lc1/o;->m(Lc1/o$b;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public synthetic g()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->a(LF0/r;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final h()V
    .locals 7

    .line 1
    :try_start_0
    iget-wide v0, p0, Lc1/o;->k:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-static {v0, v1}, Lc1/t$b;->c(J)Lc1/t$b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    move-object v5, v0

    .line 17
    goto :goto_1

    .line 18
    :catch_0
    move-exception v0

    .line 19
    goto :goto_3

    .line 20
    :cond_0
    invoke-static {}, Lc1/t$b;->b()Lc1/t$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :goto_1
    iget-object v1, p0, Lc1/o;->a:Lc1/t;

    .line 26
    .line 27
    iget-object v2, p0, Lc1/o;->f:[B

    .line 28
    .line 29
    iget v4, p0, Lc1/o;->h:I

    .line 30
    .line 31
    new-instance v6, Lc1/n;

    .line 32
    .line 33
    invoke-direct {v6, p0}, Lc1/n;-><init>(Lc1/o;)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-interface/range {v1 .. v6}, Lc1/t;->c([BIILc1/t$b;Lg0/g;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lc1/o;->d:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lc1/o;->d:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    new-array v0, v0, [J

    .line 52
    .line 53
    iput-object v0, p0, Lc1/o;->j:[J

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    :goto_2
    iget-object v1, p0, Lc1/o;->d:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-ge v0, v1, :cond_1

    .line 63
    .line 64
    iget-object v1, p0, Lc1/o;->j:[J

    .line 65
    .line 66
    iget-object v2, p0, Lc1/o;->d:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Lc1/o$b;

    .line 73
    .line 74
    invoke-static {v2}, Lc1/o$b;->c(Lc1/o$b;)J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    aput-wide v2, v1, v0

    .line 79
    .line 80
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    sget-object v0, Lg0/M;->f:[B

    .line 84
    .line 85
    iput-object v0, p0, Lc1/o;->f:[B
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    return-void

    .line 88
    :goto_3
    const-string v1, "SubtitleParser failed."

    .line 89
    .line 90
    invoke-static {v1, v0}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    throw v0
.end method

.method public i(LF0/s;LF0/L;)I
    .locals 7

    .line 1
    iget p2, p0, Lc1/o;->i:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    if-eq p2, v2, :cond_0

    .line 9
    .line 10
    move p2, v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move p2, v1

    .line 13
    :goto_0
    invoke-static {p2}, Lg0/a;->f(Z)V

    .line 14
    .line 15
    .line 16
    iget p2, p0, Lc1/o;->i:I

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-ne p2, v0, :cond_3

    .line 20
    .line 21
    invoke-interface {p1}, LF0/s;->a()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    const-wide/16 v5, -0x1

    .line 26
    .line 27
    cmp-long p2, v3, v5

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, LF0/s;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    invoke-static {v3, v4}, La3/f;->d(J)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/16 p2, 0x400

    .line 41
    .line 42
    :goto_1
    iget-object v0, p0, Lc1/o;->f:[B

    .line 43
    .line 44
    array-length v0, v0

    .line 45
    if-le p2, v0, :cond_2

    .line 46
    .line 47
    new-array p2, p2, [B

    .line 48
    .line 49
    iput-object p2, p0, Lc1/o;->f:[B

    .line 50
    .line 51
    :cond_2
    iput v1, p0, Lc1/o;->h:I

    .line 52
    .line 53
    iput v2, p0, Lc1/o;->i:I

    .line 54
    .line 55
    :cond_3
    iget p2, p0, Lc1/o;->i:I

    .line 56
    .line 57
    const/4 v0, 0x4

    .line 58
    if-ne p2, v2, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lc1/o;->j(LF0/s;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Lc1/o;->h()V

    .line 67
    .line 68
    .line 69
    iput v0, p0, Lc1/o;->i:I

    .line 70
    .line 71
    :cond_4
    iget p2, p0, Lc1/o;->i:I

    .line 72
    .line 73
    const/4 v2, 0x3

    .line 74
    if-ne p2, v2, :cond_5

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Lc1/o;->k(LF0/s;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    invoke-virtual {p0}, Lc1/o;->l()V

    .line 83
    .line 84
    .line 85
    iput v0, p0, Lc1/o;->i:I

    .line 86
    .line 87
    :cond_5
    iget p1, p0, Lc1/o;->i:I

    .line 88
    .line 89
    if-ne p1, v0, :cond_6

    .line 90
    .line 91
    const/4 p1, -0x1

    .line 92
    return p1

    .line 93
    :cond_6
    return v1
.end method

.method public final j(LF0/s;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lc1/o;->f:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    iget v2, p0, Lc1/o;->h:I

    .line 5
    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    add-int/lit16 v1, v1, 0x400

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lc1/o;->f:[B

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lc1/o;->f:[B

    .line 18
    .line 19
    iget v1, p0, Lc1/o;->h:I

    .line 20
    .line 21
    array-length v2, v0

    .line 22
    sub-int/2addr v2, v1

    .line 23
    invoke-interface {p1, v0, v1, v2}, LF0/s;->read([BII)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, -0x1

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    iget v2, p0, Lc1/o;->h:I

    .line 31
    .line 32
    add-int/2addr v2, v0

    .line 33
    iput v2, p0, Lc1/o;->h:I

    .line 34
    .line 35
    :cond_1
    invoke-interface {p1}, LF0/s;->a()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    const-wide/16 v4, -0x1

    .line 40
    .line 41
    cmp-long p1, v2, v4

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    iget p1, p0, Lc1/o;->h:I

    .line 46
    .line 47
    int-to-long v4, p1

    .line 48
    cmp-long p1, v4, v2

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    :cond_2
    if-ne v0, v1, :cond_4

    .line 53
    .line 54
    :cond_3
    const/4 p1, 0x1

    .line 55
    goto :goto_0

    .line 56
    :cond_4
    const/4 p1, 0x0

    .line 57
    :goto_0
    return p1
.end method

.method public final k(LF0/s;)Z
    .locals 4

    .line 1
    invoke-interface {p1}, LF0/s;->a()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, LF0/s;->a()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, La3/f;->d(J)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v0, 0x400

    .line 21
    .line 22
    :goto_0
    invoke-interface {p1, v0}, LF0/s;->b(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v0, -0x1

    .line 27
    if-ne p1, v0, :cond_1

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    :goto_1
    return p1
.end method

.method public final l()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lc1/o;->k:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v2, p0, Lc1/o;->j:[J

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-static {v2, v0, v1, v3, v3}, Lg0/M;->h([JJZZ)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    iget-object v1, p0, Lc1/o;->d:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ge v0, v1, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, Lc1/o;->d:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lc1/o$b;

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lc1/o;->m(Lc1/o$b;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-void
.end method

.method public final m(Lc1/o$b;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lc1/o;->g:LF0/T;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lc1/o$b;->e(Lc1/o$b;)[B

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v5, v0

    .line 11
    iget-object v0, p0, Lc1/o;->e:Lg0/z;

    .line 12
    .line 13
    invoke-static {p1}, Lc1/o$b;->e(Lc1/o$b;)[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lg0/z;->Q([B)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lc1/o;->g:LF0/T;

    .line 21
    .line 22
    iget-object v1, p0, Lc1/o;->e:Lg0/z;

    .line 23
    .line 24
    invoke-interface {v0, v1, v5}, LF0/T;->e(Lg0/z;I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lc1/o;->g:LF0/T;

    .line 28
    .line 29
    invoke-static {p1}, Lc1/o$b;->c(Lc1/o$b;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v4, 0x1

    .line 36
    invoke-interface/range {v1 .. v7}, LF0/T;->b(JIIILF0/T$a;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public release()V
    .locals 2

    .line 1
    iget v0, p0, Lc1/o;->i:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lc1/o;->a:Lc1/t;

    .line 8
    .line 9
    invoke-interface {v0}, Lc1/t;->b()V

    .line 10
    .line 11
    .line 12
    iput v1, p0, Lc1/o;->i:I

    .line 13
    .line 14
    return-void
.end method
