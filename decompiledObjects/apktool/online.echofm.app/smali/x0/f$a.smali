.class public final Lx0/f$a;
.super Lx0/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:Z


# direct methods
.method public constructor <init>(Ld0/I;JJ)V
    .locals 7

    .line 1
    invoke-direct {p0, p1}, Lx0/p;-><init>(Ld0/I;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ld0/I;->i()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v0, v2, :cond_9

    .line 11
    .line 12
    new-instance v0, Ld0/I$c;

    .line 13
    .line 14
    invoke-direct {v0}, Ld0/I$c;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1, v0}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    invoke-static {v3, v4, p2, p3}, Ljava/lang/Math;->max(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide p2

    .line 27
    iget-boolean v0, p1, Ld0/I$c;->k:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    cmp-long v0, p2, v3

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-boolean v0, p1, Ld0/I$c;->h:Z

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance p1, Lx0/f$b;

    .line 41
    .line 42
    invoke-direct {p1, v2}, Lx0/f$b;-><init>(I)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_1
    :goto_0
    const-wide/high16 v5, -0x8000000000000000L

    .line 47
    .line 48
    cmp-long v0, p4, v5

    .line 49
    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    iget-wide p4, p1, Ld0/I$c;->m:J

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-static {v3, v4, p4, p5}, Ljava/lang/Math;->max(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide p4

    .line 59
    :goto_1
    iget-wide v3, p1, Ld0/I$c;->m:J

    .line 60
    .line 61
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    cmp-long v0, v3, v5

    .line 67
    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    cmp-long v0, p4, v3

    .line 71
    .line 72
    if-lez v0, :cond_3

    .line 73
    .line 74
    move-wide p4, v3

    .line 75
    :cond_3
    cmp-long v0, p2, p4

    .line 76
    .line 77
    if-gtz v0, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    new-instance p1, Lx0/f$b;

    .line 81
    .line 82
    const/4 p2, 0x2

    .line 83
    invoke-direct {p1, p2}, Lx0/f$b;-><init>(I)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_5
    :goto_2
    iput-wide p2, p0, Lx0/f$a;->f:J

    .line 88
    .line 89
    iput-wide p4, p0, Lx0/f$a;->g:J

    .line 90
    .line 91
    cmp-long v0, p4, v5

    .line 92
    .line 93
    if-nez v0, :cond_6

    .line 94
    .line 95
    move-wide p2, v5

    .line 96
    goto :goto_3

    .line 97
    :cond_6
    sub-long p2, p4, p2

    .line 98
    .line 99
    :goto_3
    iput-wide p2, p0, Lx0/f$a;->h:J

    .line 100
    .line 101
    iget-boolean p1, p1, Ld0/I$c;->i:Z

    .line 102
    .line 103
    if-eqz p1, :cond_8

    .line 104
    .line 105
    if-eqz v0, :cond_7

    .line 106
    .line 107
    cmp-long p1, v3, v5

    .line 108
    .line 109
    if-eqz p1, :cond_8

    .line 110
    .line 111
    cmp-long p1, p4, v3

    .line 112
    .line 113
    if-nez p1, :cond_8

    .line 114
    .line 115
    :cond_7
    move v1, v2

    .line 116
    :cond_8
    iput-boolean v1, p0, Lx0/f$a;->i:Z

    .line 117
    .line 118
    return-void

    .line 119
    :cond_9
    new-instance p1, Lx0/f$b;

    .line 120
    .line 121
    invoke-direct {p1, v1}, Lx0/f$b;-><init>(I)V

    .line 122
    .line 123
    .line 124
    throw p1
.end method


# virtual methods
.method public g(ILd0/I$b;Z)Ld0/I$b;
    .locals 12

    .line 1
    iget-object p1, p0, Lx0/p;->e:Ld0/I;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0, p2, p3}, Ld0/I;->g(ILd0/I$b;Z)Ld0/I$b;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ld0/I$b;->n()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-wide v2, p0, Lx0/f$a;->f:J

    .line 12
    .line 13
    sub-long v10, v0, v2

    .line 14
    .line 15
    iget-wide v0, p0, Lx0/f$a;->h:J

    .line 16
    .line 17
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long p1, v0, v2

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    move-wide v8, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sub-long/2addr v0, v10

    .line 29
    move-wide v8, v0

    .line 30
    :goto_0
    iget-object v5, p2, Ld0/I$b;->a:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v6, p2, Ld0/I$b;->b:Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    move-object v4, p2

    .line 36
    invoke-virtual/range {v4 .. v11}, Ld0/I$b;->s(Ljava/lang/Object;Ljava/lang/Object;IJJ)Ld0/I$b;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method public o(ILd0/I$c;J)Ld0/I$c;
    .locals 4

    .line 1
    iget-object p1, p0, Lx0/p;->e:Ld0/I;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    invoke-virtual {p1, p3, p2, v0, v1}, Ld0/I;->o(ILd0/I$c;J)Ld0/I$c;

    .line 7
    .line 8
    .line 9
    iget-wide p3, p2, Ld0/I$c;->p:J

    .line 10
    .line 11
    iget-wide v0, p0, Lx0/f$a;->f:J

    .line 12
    .line 13
    add-long/2addr p3, v0

    .line 14
    iput-wide p3, p2, Ld0/I$c;->p:J

    .line 15
    .line 16
    iget-wide p3, p0, Lx0/f$a;->h:J

    .line 17
    .line 18
    iput-wide p3, p2, Ld0/I$c;->m:J

    .line 19
    .line 20
    iget-boolean p1, p0, Lx0/f$a;->i:Z

    .line 21
    .line 22
    iput-boolean p1, p2, Ld0/I$c;->i:Z

    .line 23
    .line 24
    iget-wide p3, p2, Ld0/I$c;->l:J

    .line 25
    .line 26
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long p1, p3, v2

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide p3

    .line 39
    iput-wide p3, p2, Ld0/I$c;->l:J

    .line 40
    .line 41
    iget-wide v0, p0, Lx0/f$a;->g:J

    .line 42
    .line 43
    cmp-long p1, v0, v2

    .line 44
    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide p3

    .line 52
    :goto_0
    iget-wide v0, p0, Lx0/f$a;->f:J

    .line 53
    .line 54
    sub-long/2addr p3, v0

    .line 55
    iput-wide p3, p2, Ld0/I$c;->l:J

    .line 56
    .line 57
    :cond_1
    iget-wide p3, p0, Lx0/f$a;->f:J

    .line 58
    .line 59
    invoke-static {p3, p4}, Lg0/M;->i1(J)J

    .line 60
    .line 61
    .line 62
    move-result-wide p3

    .line 63
    iget-wide v0, p2, Ld0/I$c;->e:J

    .line 64
    .line 65
    cmp-long p1, v0, v2

    .line 66
    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    add-long/2addr v0, p3

    .line 70
    iput-wide v0, p2, Ld0/I$c;->e:J

    .line 71
    .line 72
    :cond_2
    iget-wide v0, p2, Ld0/I$c;->f:J

    .line 73
    .line 74
    cmp-long p1, v0, v2

    .line 75
    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    add-long/2addr v0, p3

    .line 79
    iput-wide v0, p2, Ld0/I$c;->f:J

    .line 80
    .line 81
    :cond_3
    return-object p2
.end method
