.class public final Lj4/a;
.super Lc4/d;
.source "SourceFile"

# interfaces
.implements Lj4/e;


# direct methods
.method public constructor <init>(JJLx3/y$a;Z)V
    .locals 8

    iget v1, p5, Lx3/y$a;->f:I

    iget v2, p5, Lx3/y$a;->c:I

    move-object v0, p0

    move-wide v3, p1

    move-wide v5, p3

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lc4/d;-><init>(IIJJZ)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 3

    .line 1
    iget-wide v0, p0, Lc4/d;->b:J

    .line 2
    .line 3
    iget v2, p0, Lc4/d;->e:I

    .line 4
    .line 5
    sub-long/2addr p1, v0

    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    const-wide/16 v0, 0x8

    .line 13
    .line 14
    mul-long/2addr p1, v0

    .line 15
    const-wide/32 v0, 0xf4240

    .line 16
    .line 17
    .line 18
    mul-long/2addr p1, v0

    .line 19
    int-to-long v0, v2

    .line 20
    div-long/2addr p1, v0

    .line 21
    return-wide p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
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
.end method

.method public final c()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method
