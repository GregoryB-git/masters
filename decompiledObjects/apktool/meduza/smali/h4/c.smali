.class public final Lh4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/i;


# instance fields
.field public final a:Lc4/i;

.field public final b:J


# direct methods
.method public constructor <init>(Lc4/i;J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh4/c;->a:Lc4/i;

    .line 5
    .line 6
    invoke-interface {p1}, Lc4/i;->getPosition()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    cmp-long p1, v0, p2

    .line 11
    .line 12
    if-ltz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    invoke-static {p1}, Lx6/b;->q(Z)V

    .line 18
    .line 19
    .line 20
    iput-wide p2, p0, Lh4/c;->b:J

    .line 21
    .line 22
    return-void
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


# virtual methods
.method public final b([BIIZ)Z
    .locals 1

    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    invoke-interface {v0, p1, p2, p3, p4}, Lc4/i;->b([BIIZ)Z

    move-result p1

    return p1
.end method

.method public final c([BIIZ)Z
    .locals 1

    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    invoke-interface {v0, p1, p2, p3, p4}, Lc4/i;->c([BIIZ)Z

    move-result p1

    return p1
.end method

.method public final d()J
    .locals 4

    .line 1
    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lc4/i;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-wide v2, p0, Lh4/c;->b:J

    .line 8
    .line 9
    sub-long/2addr v0, v2

    .line 10
    return-wide v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
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
.end method

.method public final e(I)V
    .locals 1

    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    invoke-interface {v0, p1}, Lc4/i;->e(I)V

    return-void
.end method

.method public final g([BII)I
    .locals 1

    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    invoke-interface {v0, p1, p2, p3}, Lc4/i;->g([BII)I

    move-result p1

    return p1
.end method

.method public final getLength()J
    .locals 4

    .line 1
    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lc4/i;->getLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-wide v2, p0, Lh4/c;->b:J

    .line 8
    .line 9
    sub-long/2addr v0, v2

    .line 10
    return-wide v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
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
.end method

.method public final getPosition()J
    .locals 4

    .line 1
    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lc4/i;->getPosition()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-wide v2, p0, Lh4/c;->b:J

    .line 8
    .line 9
    sub-long/2addr v0, v2

    .line 10
    return-wide v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
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
.end method

.method public final i()V
    .locals 1

    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    invoke-interface {v0}, Lc4/i;->i()V

    return-void
.end method

.method public final j(I)V
    .locals 1

    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    invoke-interface {v0, p1}, Lc4/i;->j(I)V

    return-void
.end method

.method public final k(IZ)Z
    .locals 1

    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    invoke-interface {v0, p1, p2}, Lc4/i;->k(IZ)Z

    move-result p1

    return p1
.end method

.method public final m([BII)V
    .locals 1

    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    invoke-interface {v0, p1, p2, p3}, Lc4/i;->m([BII)V

    return-void
.end method

.method public final n()I
    .locals 1

    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    invoke-interface {v0}, Lc4/i;->n()I

    move-result v0

    return v0
.end method

.method public final read([BII)I
    .locals 1

    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    invoke-interface {v0, p1, p2, p3}, Lc4/i;->read([BII)I

    move-result p1

    return p1
.end method

.method public final readFully([BII)V
    .locals 1

    iget-object v0, p0, Lh4/c;->a:Lc4/i;

    invoke-interface {v0, p1, p2, p3}, Lc4/i;->readFully([BII)V

    return-void
.end method
