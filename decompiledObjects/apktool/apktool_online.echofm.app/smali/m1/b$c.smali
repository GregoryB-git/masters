.class public final Lm1/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:LF0/t;

.field public final b:LF0/T;

.field public final c:Lm1/c;

.field public final d:Ld0/q;

.field public final e:I

.field public f:J

.field public g:I

.field public h:J


# direct methods
.method public constructor <init>(LF0/t;LF0/T;Lm1/c;Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm1/b$c;->a:LF0/t;

    .line 5
    .line 6
    iput-object p2, p0, Lm1/b$c;->b:LF0/T;

    .line 7
    .line 8
    iput-object p3, p0, Lm1/b$c;->c:Lm1/c;

    .line 9
    .line 10
    iget p1, p3, Lm1/c;->b:I

    .line 11
    .line 12
    iget p2, p3, Lm1/c;->f:I

    .line 13
    .line 14
    mul-int/2addr p1, p2

    .line 15
    div-int/lit8 p1, p1, 0x8

    .line 16
    .line 17
    iget p2, p3, Lm1/c;->e:I

    .line 18
    .line 19
    if-ne p2, p1, :cond_0

    .line 20
    .line 21
    iget p2, p3, Lm1/c;->c:I

    .line 22
    .line 23
    mul-int v0, p2, p1

    .line 24
    .line 25
    mul-int/lit8 v0, v0, 0x8

    .line 26
    .line 27
    mul-int/2addr p2, p1

    .line 28
    div-int/lit8 p2, p2, 0xa

    .line 29
    .line 30
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput p1, p0, Lm1/b$c;->e:I

    .line 35
    .line 36
    new-instance p2, Ld0/q$b;

    .line 37
    .line 38
    invoke-direct {p2}, Ld0/q$b;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p4}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p2, v0}, Ld0/q$b;->M(I)Ld0/q$b;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2, v0}, Ld0/q$b;->j0(I)Ld0/q$b;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2, p1}, Ld0/q$b;->f0(I)Ld0/q$b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget p2, p3, Lm1/c;->b:I

    .line 58
    .line 59
    invoke-virtual {p1, p2}, Ld0/q$b;->N(I)Ld0/q$b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget p2, p3, Lm1/c;->c:I

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Ld0/q$b;->p0(I)Ld0/q$b;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1, p5}, Ld0/q$b;->i0(I)Ld0/q$b;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ld0/q$b;->K()Ld0/q;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lm1/b$c;->d:Ld0/q;

    .line 78
    .line 79
    return-void

    .line 80
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string p4, "Expected block size: "

    .line 86
    .line 87
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string p1, "; got: "

    .line 94
    .line 95
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget p1, p3, Lm1/c;->e:I

    .line 99
    .line 100
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const/4 p2, 0x0

    .line 108
    invoke-static {p1, p2}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    throw p1
.end method


# virtual methods
.method public a(LF0/s;J)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    :goto_0
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v5, v1, v3

    .line 8
    .line 9
    const/4 v6, 0x1

    .line 10
    if-lez v5, :cond_1

    .line 11
    .line 12
    iget v7, v0, Lm1/b$c;->g:I

    .line 13
    .line 14
    iget v8, v0, Lm1/b$c;->e:I

    .line 15
    .line 16
    if-ge v7, v8, :cond_1

    .line 17
    .line 18
    sub-int/2addr v8, v7

    .line 19
    int-to-long v7, v8

    .line 20
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v7

    .line 24
    long-to-int v5, v7

    .line 25
    iget-object v7, v0, Lm1/b$c;->b:LF0/T;

    .line 26
    .line 27
    move-object/from16 v8, p1

    .line 28
    .line 29
    invoke-interface {v7, v8, v5, v6}, LF0/T;->f(Ld0/i;IZ)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 v6, -0x1

    .line 34
    if-ne v5, v6, :cond_0

    .line 35
    .line 36
    move-wide v1, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget v3, v0, Lm1/b$c;->g:I

    .line 39
    .line 40
    add-int/2addr v3, v5

    .line 41
    iput v3, v0, Lm1/b$c;->g:I

    .line 42
    .line 43
    int-to-long v3, v5

    .line 44
    sub-long/2addr v1, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v1, v0, Lm1/b$c;->c:Lm1/c;

    .line 47
    .line 48
    iget v2, v1, Lm1/c;->e:I

    .line 49
    .line 50
    iget v3, v0, Lm1/b$c;->g:I

    .line 51
    .line 52
    div-int/2addr v3, v2

    .line 53
    if-lez v3, :cond_2

    .line 54
    .line 55
    iget-wide v7, v0, Lm1/b$c;->f:J

    .line 56
    .line 57
    iget-wide v9, v0, Lm1/b$c;->h:J

    .line 58
    .line 59
    iget v1, v1, Lm1/c;->c:I

    .line 60
    .line 61
    int-to-long v13, v1

    .line 62
    const-wide/32 v11, 0xf4240

    .line 63
    .line 64
    .line 65
    invoke-static/range {v9 .. v14}, Lg0/M;->W0(JJJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v9

    .line 69
    add-long v12, v7, v9

    .line 70
    .line 71
    mul-int v15, v3, v2

    .line 72
    .line 73
    iget v1, v0, Lm1/b$c;->g:I

    .line 74
    .line 75
    sub-int/2addr v1, v15

    .line 76
    iget-object v11, v0, Lm1/b$c;->b:LF0/T;

    .line 77
    .line 78
    const/4 v14, 0x1

    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    move/from16 v16, v1

    .line 82
    .line 83
    invoke-interface/range {v11 .. v17}, LF0/T;->b(JIIILF0/T$a;)V

    .line 84
    .line 85
    .line 86
    iget-wide v7, v0, Lm1/b$c;->h:J

    .line 87
    .line 88
    int-to-long v2, v3

    .line 89
    add-long/2addr v7, v2

    .line 90
    iput-wide v7, v0, Lm1/b$c;->h:J

    .line 91
    .line 92
    iput v1, v0, Lm1/b$c;->g:I

    .line 93
    .line 94
    :cond_2
    if-gtz v5, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    const/4 v6, 0x0

    .line 98
    :goto_1
    return v6
.end method

.method public b(IJ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lm1/b$c;->a:LF0/t;

    .line 2
    .line 3
    new-instance v8, Lm1/e;

    .line 4
    .line 5
    iget-object v2, p0, Lm1/b$c;->c:Lm1/c;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    int-to-long v4, p1

    .line 9
    move-object v1, v8

    .line 10
    move-wide v6, p2

    .line 11
    invoke-direct/range {v1 .. v7}, Lm1/e;-><init>(Lm1/c;IJJ)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v8}, LF0/t;->e(LF0/M;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lm1/b$c;->b:LF0/T;

    .line 18
    .line 19
    iget-object p2, p0, Lm1/b$c;->d:Ld0/q;

    .line 20
    .line 21
    invoke-interface {p1, p2}, LF0/T;->d(Ld0/q;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lm1/b$c;->f:J

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lm1/b$c;->g:I

    .line 5
    .line 6
    const-wide/16 p1, 0x0

    .line 7
    .line 8
    iput-wide p1, p0, Lm1/b$c;->h:J

    .line 9
    .line 10
    return-void
.end method
