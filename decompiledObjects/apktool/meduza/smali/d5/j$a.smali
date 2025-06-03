.class public final Ld5/j$a;
.super Ld5/j;
.source "SourceFile"

# interfaces
.implements Lc5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld5/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final p:Ld5/k$a;


# direct methods
.method public constructor <init>(JLv3/i0;Lo7/t;Ld5/k$a;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;)V
    .locals 7

    move-object v0, p0

    move-object v1, p3

    move-object v2, p4

    move-object v3, p5

    move-object v4, p6

    move-object v5, p7

    move-object v6, p8

    invoke-direct/range {v0 .. v6}, Ld5/j;-><init>(Lv3/i0;Lo7/t;Ld5/k;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;)V

    iput-object p5, p0, Ld5/j$a;->p:Ld5/k$a;

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 1

    iget-object v0, p0, Ld5/j$a;->p:Ld5/k$a;

    invoke-virtual {v0, p1, p2}, Ld5/k$a;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final b(JJ)J
    .locals 1

    iget-object v0, p0, Ld5/j$a;->p:Ld5/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ld5/k$a;->e(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d(JJ)J
    .locals 1

    iget-object v0, p0, Ld5/j$a;->p:Ld5/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ld5/k$a;->c(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final e(JJ)J
    .locals 3

    .line 1
    iget-object v0, p0, Ld5/j$a;->p:Ld5/k$a;

    .line 2
    .line 3
    iget-object v1, v0, Ld5/k$a;->f:Ljava/util/List;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Ld5/k$a;->c(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-virtual {v0, p1, p2, p3, p4}, Ld5/k$a;->b(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide p3

    .line 21
    add-long/2addr p3, v1

    .line 22
    invoke-virtual {v0, p3, p4}, Ld5/k$a;->g(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    invoke-virtual {v0, p3, p4, p1, p2}, Ld5/k$a;->e(JJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    add-long/2addr p1, v1

    .line 31
    iget-wide p3, v0, Ld5/k$a;->i:J

    .line 32
    .line 33
    sub-long/2addr p1, p3

    .line 34
    :goto_0
    return-wide p1
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

.method public final f(J)Ld5/i;
    .locals 1

    iget-object v0, p0, Ld5/j$a;->p:Ld5/k$a;

    invoke-virtual {v0, p1, p2, p0}, Ld5/k$a;->h(JLd5/j;)Ld5/i;

    move-result-object p1

    return-object p1
.end method

.method public final g(JJ)J
    .locals 1

    iget-object v0, p0, Ld5/j$a;->p:Ld5/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ld5/k$a;->f(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Ld5/j$a;->p:Ld5/k$a;

    invoke-virtual {v0}, Ld5/k$a;->i()Z

    move-result v0

    return v0
.end method

.method public final i()J
    .locals 2

    iget-object v0, p0, Ld5/j$a;->p:Ld5/k$a;

    iget-wide v0, v0, Ld5/k$a;->d:J

    return-wide v0
.end method

.method public final j(J)J
    .locals 1

    iget-object v0, p0, Ld5/j$a;->p:Ld5/k$a;

    invoke-virtual {v0, p1, p2}, Ld5/k$a;->d(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final k(JJ)J
    .locals 1

    iget-object v0, p0, Ld5/j$a;->p:Ld5/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ld5/k$a;->b(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final l()Lc5/c;
    .locals 0

    return-object p0
.end method

.method public final m()Ld5/i;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
