.class public final Ll1/G$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/e$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll1/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lg0/E;

.field public final b:Lg0/z;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(ILg0/E;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ll1/G$a;->c:I

    .line 5
    .line 6
    iput-object p2, p0, Ll1/G$a;->a:Lg0/E;

    .line 7
    .line 8
    iput p3, p0, Ll1/G$a;->d:I

    .line 9
    .line 10
    new-instance p1, Lg0/z;

    .line 11
    .line 12
    invoke-direct {p1}, Lg0/z;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ll1/G$a;->b:Lg0/z;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public a(LF0/s;J)LF0/e$e;
    .locals 6

    .line 1
    invoke-interface {p1}, LF0/s;->p()J

    .line 2
    .line 3
    .line 4
    move-result-wide v4

    .line 5
    iget v0, p0, Ll1/G$a;->d:I

    .line 6
    .line 7
    int-to-long v0, v0

    .line 8
    invoke-interface {p1}, LF0/s;->a()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    sub-long/2addr v2, v4

    .line 13
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    long-to-int v0, v0

    .line 18
    iget-object v1, p0, Ll1/G$a;->b:Lg0/z;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lg0/z;->P(I)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Ll1/G$a;->b:Lg0/z;

    .line 24
    .line 25
    invoke-virtual {v1}, Lg0/z;->e()[B

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-interface {p1, v1, v2, v0}, LF0/s;->n([BII)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Ll1/G$a;->b:Lg0/z;

    .line 34
    .line 35
    move-object v0, p0

    .line 36
    move-wide v2, p2

    .line 37
    invoke-virtual/range {v0 .. v5}, Ll1/G$a;->c(Lg0/z;JJ)LF0/e$e;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Ll1/G$a;->b:Lg0/z;

    .line 2
    .line 3
    sget-object v1, Lg0/M;->f:[B

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lg0/z;->Q([B)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c(Lg0/z;JJ)LF0/e$e;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p4

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Lg0/z;->g()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    const-wide/16 v5, -0x1

    .line 12
    .line 13
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    move-wide v9, v5

    .line 19
    move-wide v11, v7

    .line 20
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lg0/z;->a()I

    .line 21
    .line 22
    .line 23
    move-result v13

    .line 24
    const/16 v14, 0xbc

    .line 25
    .line 26
    if-lt v13, v14, :cond_5

    .line 27
    .line 28
    invoke-virtual/range {p1 .. p1}, Lg0/z;->e()[B

    .line 29
    .line 30
    .line 31
    move-result-object v13

    .line 32
    invoke-virtual/range {p1 .. p1}, Lg0/z;->f()I

    .line 33
    .line 34
    .line 35
    move-result v14

    .line 36
    invoke-static {v13, v14, v4}, Ll1/L;->a([BII)I

    .line 37
    .line 38
    .line 39
    move-result v13

    .line 40
    add-int/lit16 v14, v13, 0xbc

    .line 41
    .line 42
    if-le v14, v4, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    iget v5, v0, Ll1/G$a;->c:I

    .line 46
    .line 47
    invoke-static {v1, v13, v5}, Ll1/L;->c(Lg0/z;II)J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    cmp-long v15, v5, v7

    .line 52
    .line 53
    if-eqz v15, :cond_4

    .line 54
    .line 55
    iget-object v15, v0, Ll1/G$a;->a:Lg0/E;

    .line 56
    .line 57
    invoke-virtual {v15, v5, v6}, Lg0/E;->b(J)J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    cmp-long v15, v5, p2

    .line 62
    .line 63
    if-lez v15, :cond_2

    .line 64
    .line 65
    cmp-long v1, v11, v7

    .line 66
    .line 67
    if-nez v1, :cond_1

    .line 68
    .line 69
    invoke-static {v5, v6, v2, v3}, LF0/e$e;->d(JJ)LF0/e$e;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    return-object v1

    .line 74
    :cond_1
    add-long v1, v2, v9

    .line 75
    .line 76
    invoke-static {v1, v2}, LF0/e$e;->e(J)LF0/e$e;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    return-object v1

    .line 81
    :cond_2
    const-wide/32 v9, 0x186a0

    .line 82
    .line 83
    .line 84
    add-long/2addr v9, v5

    .line 85
    cmp-long v9, v9, p2

    .line 86
    .line 87
    if-lez v9, :cond_3

    .line 88
    .line 89
    int-to-long v4, v13

    .line 90
    add-long v1, v2, v4

    .line 91
    .line 92
    invoke-static {v1, v2}, LF0/e$e;->e(J)LF0/e$e;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    return-object v1

    .line 97
    :cond_3
    int-to-long v9, v13

    .line 98
    move-wide v11, v5

    .line 99
    :cond_4
    invoke-virtual {v1, v14}, Lg0/z;->T(I)V

    .line 100
    .line 101
    .line 102
    int-to-long v5, v14

    .line 103
    goto :goto_0

    .line 104
    :cond_5
    :goto_1
    cmp-long v1, v11, v7

    .line 105
    .line 106
    if-eqz v1, :cond_6

    .line 107
    .line 108
    add-long v1, v2, v5

    .line 109
    .line 110
    invoke-static {v11, v12, v1, v2}, LF0/e$e;->f(JJ)LF0/e$e;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    return-object v1

    .line 115
    :cond_6
    sget-object v1, LF0/e$e;->d:LF0/e$e;

    .line 116
    .line 117
    return-object v1
.end method
