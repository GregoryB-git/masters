.class public final Lc4/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/t;


# instance fields
.field public final a:[J

.field public final b:[J

.field public final c:J

.field public final d:Z


# direct methods
.method public constructor <init>([J[JJ)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    array-length v1, p2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {v0}, Lx6/b;->q(Z)V

    array-length v0, p2

    if-lez v0, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    iput-boolean v1, p0, Lc4/r;->d:Z

    if-eqz v1, :cond_2

    aget-wide v4, p2, v3

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-lez v1, :cond_2

    add-int/lit8 v1, v0, 0x1

    new-array v4, v1, [J

    iput-object v4, p0, Lc4/r;->a:[J

    new-array v1, v1, [J

    iput-object v1, p0, Lc4/r;->b:[J

    invoke-static {p1, v3, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p2, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2

    :cond_2
    iput-object p1, p0, Lc4/r;->a:[J

    iput-object p2, p0, Lc4/r;->b:[J

    :goto_2
    iput-wide p3, p0, Lc4/r;->c:J

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lc4/r;->d:Z

    return v0
.end method

.method public final g(J)Lc4/t$a;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lc4/r;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Lc4/t$a;

    .line 6
    .line 7
    sget-object p2, Lc4/u;->c:Lc4/u;

    .line 8
    .line 9
    invoke-direct {p1, p2, p2}, Lc4/t$a;-><init>(Lc4/u;Lc4/u;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    iget-object v0, p0, Lc4/r;->b:[J

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-static {v0, p1, p2, v1}, Lv5/e0;->f([JJZ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v2, Lc4/u;

    .line 21
    .line 22
    iget-object v3, p0, Lc4/r;->b:[J

    .line 23
    .line 24
    aget-wide v4, v3, v0

    .line 25
    .line 26
    iget-object v6, p0, Lc4/r;->a:[J

    .line 27
    .line 28
    aget-wide v7, v6, v0

    .line 29
    .line 30
    invoke-direct {v2, v4, v5, v7, v8}, Lc4/u;-><init>(JJ)V

    .line 31
    .line 32
    .line 33
    cmp-long p1, v4, p1

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    array-length p1, v3

    .line 38
    sub-int/2addr p1, v1

    .line 39
    if-ne v0, p1, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    new-instance p1, Lc4/u;

    .line 43
    .line 44
    add-int/2addr v0, v1

    .line 45
    aget-wide v4, v3, v0

    .line 46
    .line 47
    aget-wide v0, v6, v0

    .line 48
    .line 49
    invoke-direct {p1, v4, v5, v0, v1}, Lc4/u;-><init>(JJ)V

    .line 50
    .line 51
    .line 52
    new-instance p2, Lc4/t$a;

    .line 53
    .line 54
    invoke-direct {p2, v2, p1}, Lc4/t$a;-><init>(Lc4/u;Lc4/u;)V

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    :cond_2
    :goto_0
    new-instance p1, Lc4/t$a;

    .line 59
    .line 60
    invoke-direct {p1, v2, v2}, Lc4/t$a;-><init>(Lc4/u;Lc4/u;)V

    .line 61
    .line 62
    .line 63
    return-object p1
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

.method public final h()J
    .locals 2

    iget-wide v0, p0, Lc4/r;->c:J

    return-wide v0
.end method
