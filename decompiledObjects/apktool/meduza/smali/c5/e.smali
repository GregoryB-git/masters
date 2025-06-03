.class public final Lc5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc5/c;
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public a:J

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;J)V
    .locals 0

    iput-object p1, p0, Lc5/e;->b:Ljava/lang/Object;

    iput-wide p2, p0, Lc5/e;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 2

    iget-object v0, p0, Lc5/e;->b:Ljava/lang/Object;

    check-cast v0, Lc4/c;

    iget-object v0, v0, Lc4/c;->e:[J

    long-to-int p1, p1

    aget-wide p1, v0, p1

    iget-wide v0, p0, Lc5/e;->a:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public final b(JJ)J
    .locals 0

    iget-object p3, p0, Lc5/e;->b:Ljava/lang/Object;

    check-cast p3, Lc4/c;

    iget-object p3, p3, Lc4/c;->d:[J

    long-to-int p1, p1

    aget-wide p1, p3, p1

    return-wide p1
.end method

.method public final d(JJ)J
    .locals 0

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final e(JJ)J
    .locals 0

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p1
.end method

.method public final f(J)Ld5/i;
    .locals 7

    new-instance v6, Ld5/i;

    iget-object v0, p0, Lc5/e;->b:Ljava/lang/Object;

    check-cast v0, Lc4/c;

    iget-object v1, v0, Lc4/c;->c:[J

    long-to-int p1, p1

    aget-wide v2, v1, p1

    iget-object p2, v0, Lc4/c;->b:[I

    aget p1, p2, p1

    int-to-long p1, p1

    const/4 v5, 0x0

    move-object v0, v6

    move-wide v1, v2

    move-wide v3, p1

    invoke-direct/range {v0 .. v5}, Ld5/i;-><init>(JJLjava/lang/String;)V

    return-object v6
.end method

.method public final g(JJ)J
    .locals 2

    .line 1
    iget-object p3, p0, Lc5/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p3, Lc4/c;

    .line 4
    .line 5
    iget-wide v0, p0, Lc5/e;->a:J

    .line 6
    .line 7
    add-long/2addr p1, v0

    .line 8
    iget-object p3, p3, Lc4/c;->e:[J

    .line 9
    .line 10
    const/4 p4, 0x1

    .line 11
    invoke-static {p3, p1, p2, p4}, Lv5/e0;->f([JJZ)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    int-to-long p1, p1

    .line 16
    return-wide p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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

.method public final h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final i()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final j(J)J
    .locals 0

    iget-object p1, p0, Lc5/e;->b:Ljava/lang/Object;

    check-cast p1, Lc4/c;

    iget p1, p1, Lc4/c;->a:I

    int-to-long p1, p1

    return-wide p1
.end method

.method public final k(JJ)J
    .locals 0

    iget-object p1, p0, Lc5/e;->b:Ljava/lang/Object;

    check-cast p1, Lc4/c;

    iget p1, p1, Lc4/c;->a:I

    int-to-long p1, p1

    return-wide p1
.end method

.method public final onFailure(Ljava/lang/Exception;)V
    .locals 2

    iget-object p1, p0, Lc5/e;->b:Ljava/lang/Object;

    check-cast p1, Le7/y0;

    iget-wide v0, p0, Lc5/e;->a:J

    iget-object p1, p1, Le7/y0;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method
