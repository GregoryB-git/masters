.class public abstract Ld5/k$a;
.super Ld5/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld5/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field public final d:J

.field public final e:J

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld5/k$d;",
            ">;"
        }
    .end annotation
.end field

.field public final g:J

.field public final h:J

.field public final i:J


# direct methods
.method public constructor <init>(Ld5/i;JJJJLjava/util/List;JJJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld5/i;",
            "JJJJ",
            "Ljava/util/List<",
            "Ld5/k$d;",
            ">;JJJ)V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct/range {p0 .. p5}, Ld5/k;-><init>(Ld5/i;JJ)V

    move-wide v1, p6

    iput-wide v1, v0, Ld5/k$a;->d:J

    move-wide v1, p8

    iput-wide v1, v0, Ld5/k$a;->e:J

    move-object v1, p10

    iput-object v1, v0, Ld5/k$a;->f:Ljava/util/List;

    move-wide v1, p11

    iput-wide v1, v0, Ld5/k$a;->i:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, Ld5/k$a;->g:J

    move-wide/from16 v1, p15

    iput-wide v1, v0, Ld5/k$a;->h:J

    return-void
.end method


# virtual methods
.method public final b(JJ)J
    .locals 4

    invoke-virtual {p0, p1, p2}, Ld5/k$a;->d(J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    iget-wide v0, p0, Ld5/k$a;->h:J

    sub-long v0, p3, v0

    iget-wide v2, p0, Ld5/k$a;->i:J

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1, p1, p2}, Ld5/k$a;->f(JJ)J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, p3, p4}, Ld5/k$a;->c(JJ)J

    move-result-wide p1

    sub-long/2addr v0, p1

    long-to-int p1, v0

    int-to-long p1, p1

    return-wide p1
.end method

.method public final c(JJ)J
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, Ld5/k$a;->d(J)J

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
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-wide v0, p0, Ld5/k$a;->g:J

    .line 12
    .line 13
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v2, v0, v2

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-wide v2, p0, Ld5/k$a;->h:J

    .line 24
    .line 25
    sub-long/2addr p3, v2

    .line 26
    sub-long/2addr p3, v0

    .line 27
    invoke-virtual {p0, p3, p4, p1, p2}, Ld5/k$a;->f(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    iget-wide p3, p0, Ld5/k$a;->d:J

    .line 32
    .line 33
    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    return-wide p1

    .line 38
    :cond_1
    :goto_0
    iget-wide p1, p0, Ld5/k$a;->d:J

    .line 39
    .line 40
    return-wide p1
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public abstract d(J)J
.end method

.method public final e(JJ)J
    .locals 7

    .line 1
    iget-object v0, p0, Ld5/k$a;->f:Ljava/util/List;

    .line 2
    .line 3
    const-wide/32 v1, 0xf4240

    .line 4
    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-wide p3, p0, Ld5/k$a;->d:J

    .line 9
    .line 10
    sub-long/2addr p1, p3

    .line 11
    long-to-int p1, p1

    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ld5/k$d;

    .line 17
    .line 18
    iget-wide p1, p1, Ld5/k$d;->b:J

    .line 19
    .line 20
    mul-long/2addr p1, v1

    .line 21
    iget-wide p3, p0, Ld5/k;->b:J

    .line 22
    .line 23
    div-long/2addr p1, p3

    .line 24
    return-wide p1

    .line 25
    :cond_0
    invoke-virtual {p0, p3, p4}, Ld5/k$a;->d(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    const-wide/16 v5, -0x1

    .line 30
    .line 31
    cmp-long v0, v3, v5

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-wide v5, p0, Ld5/k$a;->d:J

    .line 36
    .line 37
    add-long/2addr v5, v3

    .line 38
    const-wide/16 v3, 0x1

    .line 39
    .line 40
    sub-long/2addr v5, v3

    .line 41
    cmp-long v0, p1, v5

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0, p1, p2}, Ld5/k$a;->g(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    sub-long/2addr p3, p1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget-wide p1, p0, Ld5/k$a;->e:J

    .line 52
    .line 53
    mul-long/2addr p1, v1

    .line 54
    iget-wide p3, p0, Ld5/k;->b:J

    .line 55
    .line 56
    div-long p3, p1, p3

    .line 57
    .line 58
    :goto_0
    return-wide p3
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final f(JJ)J
    .locals 11

    .line 1
    iget-wide v0, p0, Ld5/k$a;->d:J

    .line 2
    .line 3
    invoke-virtual {p0, p3, p4}, Ld5/k$a;->d(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p3

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v2, p3, v2

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-object v2, p0, Ld5/k$a;->f:Ljava/util/List;

    .line 15
    .line 16
    const-wide/16 v3, 0x1

    .line 17
    .line 18
    if-nez v2, :cond_3

    .line 19
    .line 20
    iget-wide v5, p0, Ld5/k$a;->e:J

    .line 21
    .line 22
    const-wide/32 v7, 0xf4240

    .line 23
    .line 24
    .line 25
    mul-long/2addr v5, v7

    .line 26
    iget-wide v7, p0, Ld5/k;->b:J

    .line 27
    .line 28
    div-long/2addr v5, v7

    .line 29
    iget-wide v7, p0, Ld5/k$a;->d:J

    .line 30
    .line 31
    div-long/2addr p1, v5

    .line 32
    add-long/2addr p1, v7

    .line 33
    cmp-long v2, p1, v0

    .line 34
    .line 35
    if-gez v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const-wide/16 v5, -0x1

    .line 39
    .line 40
    cmp-long v2, p3, v5

    .line 41
    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    move-wide v0, p1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    add-long/2addr v0, p3

    .line 47
    sub-long/2addr v0, v3

    .line 48
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    :goto_0
    return-wide v0

    .line 53
    :cond_3
    add-long/2addr p3, v0

    .line 54
    sub-long/2addr p3, v3

    .line 55
    move-wide v5, v0

    .line 56
    :goto_1
    cmp-long v2, v5, p3

    .line 57
    .line 58
    if-gtz v2, :cond_6

    .line 59
    .line 60
    sub-long v7, p3, v5

    .line 61
    .line 62
    const-wide/16 v9, 0x2

    .line 63
    .line 64
    div-long/2addr v7, v9

    .line 65
    add-long/2addr v7, v5

    .line 66
    invoke-virtual {p0, v7, v8}, Ld5/k$a;->g(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v9

    .line 70
    cmp-long v2, v9, p1

    .line 71
    .line 72
    if-gez v2, :cond_4

    .line 73
    .line 74
    add-long v5, v7, v3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    if-lez v2, :cond_5

    .line 78
    .line 79
    sub-long/2addr v7, v3

    .line 80
    move-wide p3, v7

    .line 81
    goto :goto_1

    .line 82
    :cond_5
    return-wide v7

    .line 83
    :cond_6
    cmp-long p1, v5, v0

    .line 84
    .line 85
    if-nez p1, :cond_7

    .line 86
    .line 87
    move-wide p3, v5

    .line 88
    :cond_7
    return-wide p3
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final g(J)J
    .locals 6

    iget-object v0, p0, Ld5/k$a;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Ld5/k$a;->d:J

    sub-long/2addr p1, v1

    long-to-int p1, p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld5/k$d;

    iget-wide p1, p1, Ld5/k$d;->a:J

    iget-wide v0, p0, Ld5/k;->c:J

    sub-long/2addr p1, v0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Ld5/k$a;->d:J

    sub-long/2addr p1, v0

    iget-wide v0, p0, Ld5/k$a;->e:J

    mul-long/2addr p1, v0

    :goto_0
    move-wide v0, p1

    const-wide/32 v2, 0xf4240

    iget-wide v4, p0, Ld5/k;->b:J

    invoke-static/range {v0 .. v5}, Lv5/e0;->O(JJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public abstract h(JLd5/j;)Ld5/i;
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Ld5/k$a;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
