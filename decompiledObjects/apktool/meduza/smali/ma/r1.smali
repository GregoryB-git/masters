.class public final Lma/r1;
.super Lma/p1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lma/p1<",
        "Lma/q1;",
        "Lma/q1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lma/p1;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;II)V
    .locals 0

    check-cast p1, Lma/q1;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x5

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lma/q1;->c(ILjava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Lma/q1;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lma/q1;->c(ILjava/lang/Object;)V

    return-void
.end method

.method public final c(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lma/q1;

    check-cast p3, Lma/q1;

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x3

    invoke-virtual {p2, p1, p3}, Lma/q1;->c(ILjava/lang/Object;)V

    return-void
.end method

.method public final d(Ljava/lang/Object;ILma/h;)V
    .locals 0

    check-cast p1, Lma/q1;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2, p3}, Lma/q1;->c(ILjava/lang/Object;)V

    return-void
.end method

.method public final e(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Lma/q1;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lma/q1;->c(ILjava/lang/Object;)V

    return-void
.end method

.method public final f(Ljava/lang/Object;)Lma/q1;
    .locals 2

    .line 1
    check-cast p1, Lma/w;

    .line 2
    .line 3
    iget-object v0, p1, Lma/w;->unknownFields:Lma/q1;

    .line 4
    .line 5
    sget-object v1, Lma/q1;->f:Lma/q1;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Lma/q1;

    .line 10
    .line 11
    invoke-direct {v0}, Lma/q1;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p1, Lma/w;->unknownFields:Lma/q1;

    .line 15
    .line 16
    :cond_0
    return-object v0
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
.end method

.method public final g(Ljava/lang/Object;)Lma/q1;
    .locals 0

    check-cast p1, Lma/w;

    iget-object p1, p1, Lma/w;->unknownFields:Lma/q1;

    return-object p1
.end method

.method public final h(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lma/q1;

    invoke-virtual {p1}, Lma/q1;->b()I

    move-result p1

    return p1
.end method

.method public final i(Ljava/lang/Object;)I
    .locals 7

    .line 1
    check-cast p1, Lma/q1;

    .line 2
    .line 3
    iget v0, p1, Lma/q1;->d:I

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    iget v2, p1, Lma/q1;->a:I

    .line 12
    .line 13
    if-ge v0, v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p1, Lma/q1;->b:[I

    .line 16
    .line 17
    aget v2, v2, v0

    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    ushr-int/2addr v2, v3

    .line 21
    iget-object v4, p1, Lma/q1;->c:[Ljava/lang/Object;

    .line 22
    .line 23
    aget-object v4, v4, v0

    .line 24
    .line 25
    check-cast v4, Lma/h;

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    invoke-static {v5}, Lma/k;->N(I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    const/4 v6, 0x2

    .line 33
    mul-int/2addr v5, v6

    .line 34
    invoke-static {v6, v2}, Lma/k;->O(II)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v2, v5

    .line 39
    invoke-static {v3, v4}, Lma/k;->w(ILma/h;)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    add-int/2addr v3, v2

    .line 44
    add-int/2addr v1, v3

    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iput v1, p1, Lma/q1;->d:I

    .line 49
    .line 50
    move v0, v1

    .line 51
    :goto_1
    return v0
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

.method public final j(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lma/w;

    .line 2
    .line 3
    iget-object p1, p1, Lma/w;->unknownFields:Lma/q1;

    .line 4
    .line 5
    iget-boolean v0, p1, Lma/q1;->e:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p1, Lma/q1;->e:Z

    .line 11
    .line 12
    :cond_0
    return-void
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
.end method

.method public final k(Ljava/lang/Object;Ljava/lang/Object;)Lma/q1;
    .locals 6

    .line 1
    check-cast p1, Lma/q1;

    .line 2
    .line 3
    check-cast p2, Lma/q1;

    .line 4
    .line 5
    sget-object v0, Lma/q1;->f:Lma/q1;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Lma/q1;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lma/q1;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget v0, p1, Lma/q1;->a:I

    .line 22
    .line 23
    iget v1, p2, Lma/q1;->a:I

    .line 24
    .line 25
    add-int/2addr v0, v1

    .line 26
    iget-object v1, p1, Lma/q1;->b:[I

    .line 27
    .line 28
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v3, p2, Lma/q1;->b:[I

    .line 33
    .line 34
    iget v4, p1, Lma/q1;->a:I

    .line 35
    .line 36
    iget v5, p2, Lma/q1;->a:I

    .line 37
    .line 38
    invoke-static {v3, v2, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    .line 40
    .line 41
    iget-object v3, p1, Lma/q1;->c:[Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v4, p2, Lma/q1;->c:[Ljava/lang/Object;

    .line 48
    .line 49
    iget p1, p1, Lma/q1;->a:I

    .line 50
    .line 51
    iget p2, p2, Lma/q1;->a:I

    .line 52
    .line 53
    invoke-static {v4, v2, v3, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Lma/q1;

    .line 57
    .line 58
    const/4 p2, 0x1

    .line 59
    invoke-direct {p1, v0, v1, v3, p2}, Lma/q1;-><init>(I[I[Ljava/lang/Object;Z)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, v0}, Lma/q1;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget-boolean v0, p1, Lma/q1;->e:Z

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    iget v0, p1, Lma/q1;->a:I

    .line 78
    .line 79
    iget v1, p2, Lma/q1;->a:I

    .line 80
    .line 81
    add-int/2addr v0, v1

    .line 82
    invoke-virtual {p1, v0}, Lma/q1;->a(I)V

    .line 83
    .line 84
    .line 85
    iget-object v1, p2, Lma/q1;->b:[I

    .line 86
    .line 87
    iget-object v3, p1, Lma/q1;->b:[I

    .line 88
    .line 89
    iget v4, p1, Lma/q1;->a:I

    .line 90
    .line 91
    iget v5, p2, Lma/q1;->a:I

    .line 92
    .line 93
    invoke-static {v1, v2, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 94
    .line 95
    .line 96
    iget-object v1, p2, Lma/q1;->c:[Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v3, p1, Lma/q1;->c:[Ljava/lang/Object;

    .line 99
    .line 100
    iget v4, p1, Lma/q1;->a:I

    .line 101
    .line 102
    iget p2, p2, Lma/q1;->a:I

    .line 103
    .line 104
    invoke-static {v1, v2, v3, v4, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 105
    .line 106
    .line 107
    iput v0, p1, Lma/q1;->a:I

    .line 108
    .line 109
    :goto_0
    return-object p1

    .line 110
    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 111
    .line 112
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 113
    .line 114
    .line 115
    throw p1
.end method

.method public final m()Lma/q1;
    .locals 1

    new-instance v0, Lma/q1;

    invoke-direct {v0}, Lma/q1;-><init>()V

    return-object v0
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lma/q1;

    check-cast p1, Lma/w;

    iput-object p2, p1, Lma/w;->unknownFields:Lma/q1;

    return-void
.end method

.method public final o(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lma/q1;

    check-cast p1, Lma/w;

    iput-object p2, p1, Lma/w;->unknownFields:Lma/q1;

    return-void
.end method

.method public final p()V
    .locals 0

    return-void
.end method

.method public final q(Ljava/lang/Object;)Lma/q1;
    .locals 1

    .line 1
    check-cast p1, Lma/q1;

    .line 2
    .line 3
    iget-boolean v0, p1, Lma/q1;->e:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p1, Lma/q1;->e:Z

    .line 9
    .line 10
    :cond_0
    return-object p1
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
.end method

.method public final r(Ljava/lang/Object;Lma/l;)V
    .locals 3

    .line 1
    check-cast p1, Lma/q1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    iget v1, p1, Lma/q1;->a:I

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p1, Lma/q1;->b:[I

    .line 15
    .line 16
    aget v1, v1, v0

    .line 17
    .line 18
    ushr-int/lit8 v1, v1, 0x3

    .line 19
    .line 20
    iget-object v2, p1, Lma/q1;->c:[Ljava/lang/Object;

    .line 21
    .line 22
    aget-object v2, v2, v0

    .line 23
    .line 24
    invoke-virtual {p2, v1, v2}, Lma/l;->l(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
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

.method public final s(Ljava/lang/Object;Lma/l;)V
    .locals 0

    check-cast p1, Lma/q1;

    invoke-virtual {p1, p2}, Lma/q1;->d(Lma/l;)V

    return-void
.end method
