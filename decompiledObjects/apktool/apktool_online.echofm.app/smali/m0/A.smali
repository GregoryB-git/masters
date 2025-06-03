.class public final Lm0/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/A$a;
    }
.end annotation


# instance fields
.field public final a:Lm0/A$a;

.field public b:I

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public constructor <init>(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lm0/A$a;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lm0/A$a;-><init>(Landroid/media/AudioTrack;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lm0/A;->a:Lm0/A$a;

    .line 10
    .line 11
    invoke-virtual {p0}, Lm0/A;->h()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget v0, p0, Lm0/A;->b:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lm0/A;->h()V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/A;->a:Lm0/A$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lm0/A$a;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/A;->a:Lm0/A$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lm0/A$a;->b()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    :goto_0
    return-wide v0
.end method

.method public d()J
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/A;->a:Lm0/A$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lm0/A$a;->c()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    :goto_0
    return-wide v0
.end method

.method public e()Z
    .locals 2

    .line 1
    iget v0, p0, Lm0/A;->b:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    return v0
.end method

.method public f(J)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lm0/A;->a:Lm0/A$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_9

    .line 5
    .line 6
    iget-wide v2, p0, Lm0/A;->e:J

    .line 7
    .line 8
    sub-long v2, p1, v2

    .line 9
    .line 10
    iget-wide v4, p0, Lm0/A;->d:J

    .line 11
    .line 12
    cmp-long v2, v2, v4

    .line 13
    .line 14
    if-gez v2, :cond_0

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    iput-wide p1, p0, Lm0/A;->e:J

    .line 18
    .line 19
    invoke-virtual {v0}, Lm0/A$a;->d()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v2, p0, Lm0/A;->b:I

    .line 24
    .line 25
    const/4 v3, 0x3

    .line 26
    const/4 v4, 0x1

    .line 27
    if-eqz v2, :cond_6

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    if-eq v2, v4, :cond_5

    .line 31
    .line 32
    if-eq v2, p1, :cond_4

    .line 33
    .line 34
    if-eq v2, v3, :cond_2

    .line 35
    .line 36
    const/4 p1, 0x4

    .line 37
    if-ne v2, p1, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_2
    if-eqz v0, :cond_8

    .line 47
    .line 48
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lm0/A;->h()V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    if-nez v0, :cond_8

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iget-object p2, p0, Lm0/A;->a:Lm0/A$a;

    .line 58
    .line 59
    invoke-virtual {p2}, Lm0/A$a;->b()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    iget-wide v3, p0, Lm0/A;->f:J

    .line 64
    .line 65
    cmp-long p2, v1, v3

    .line 66
    .line 67
    if-lez p2, :cond_8

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lm0/A;->i(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_6
    if-eqz v0, :cond_7

    .line 74
    .line 75
    iget-object p1, p0, Lm0/A;->a:Lm0/A$a;

    .line 76
    .line 77
    invoke-virtual {p1}, Lm0/A$a;->c()J

    .line 78
    .line 79
    .line 80
    move-result-wide p1

    .line 81
    iget-wide v2, p0, Lm0/A;->c:J

    .line 82
    .line 83
    cmp-long p1, p1, v2

    .line 84
    .line 85
    if-ltz p1, :cond_9

    .line 86
    .line 87
    iget-object p1, p0, Lm0/A;->a:Lm0/A$a;

    .line 88
    .line 89
    invoke-virtual {p1}, Lm0/A$a;->b()J

    .line 90
    .line 91
    .line 92
    move-result-wide p1

    .line 93
    iput-wide p1, p0, Lm0/A;->f:J

    .line 94
    .line 95
    invoke-virtual {p0, v4}, Lm0/A;->i(I)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_7
    iget-wide v1, p0, Lm0/A;->c:J

    .line 100
    .line 101
    sub-long/2addr p1, v1

    .line 102
    const-wide/32 v1, 0x7a120

    .line 103
    .line 104
    .line 105
    cmp-long p1, p1, v1

    .line 106
    .line 107
    if-lez p1, :cond_8

    .line 108
    .line 109
    invoke-virtual {p0, v3}, Lm0/A;->i(I)V

    .line 110
    .line 111
    .line 112
    :cond_8
    :goto_1
    move v1, v0

    .line 113
    :cond_9
    :goto_2
    return v1
.end method

.method public g()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lm0/A;->i(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/A;->a:Lm0/A$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lm0/A;->i(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final i(I)V
    .locals 6

    .line 1
    iput p1, p0, Lm0/A;->b:I

    .line 2
    .line 3
    const-wide/16 v0, 0x2710

    .line 4
    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq p1, v2, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p1, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq p1, v0, :cond_2

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    const-wide/32 v0, 0x7a120

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    iput-wide v0, p0, Lm0/A;->d:J

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_2
    const-wide/32 v0, 0x989680

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    iput-wide v2, p0, Lm0/A;->e:J

    .line 38
    .line 39
    const-wide/16 v2, -0x1

    .line 40
    .line 41
    iput-wide v2, p0, Lm0/A;->f:J

    .line 42
    .line 43
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    const-wide/16 v4, 0x3e8

    .line 48
    .line 49
    div-long/2addr v2, v4

    .line 50
    iput-wide v2, p0, Lm0/A;->c:J

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    return-void
.end method
