.class public Lt/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final s:Ljava/lang/Object;


# instance fields
.field public o:Z

.field public p:[J

.field public q:[Ljava/lang/Object;

.field public r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt/f;->s:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lt/f;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt/f;->o:Z

    if-nez p1, :cond_0

    sget-object p1, Lt/d;->b:[J

    iput-object p1, p0, Lt/f;->p:[J

    sget-object p1, Lt/d;->c:[Ljava/lang/Object;

    iput-object p1, p0, Lt/f;->q:[Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lt/d;->f(I)I

    move-result p1

    new-array v0, p1, [J

    iput-object v0, p0, Lt/f;->p:[J

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lt/f;->q:[Ljava/lang/Object;

    :goto_0
    return-void
.end method


# virtual methods
.method public a(JLjava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Lt/f;->r:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lt/f;->p:[J

    .line 6
    .line 7
    add-int/lit8 v2, v0, -0x1

    .line 8
    .line 9
    aget-wide v2, v1, v2

    .line 10
    .line 11
    cmp-long v1, p1, v2

    .line 12
    .line 13
    if-gtz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3}, Lt/f;->l(JLjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-boolean v1, p0, Lt/f;->o:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lt/f;->p:[J

    .line 24
    .line 25
    array-length v1, v1

    .line 26
    if-lt v0, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lt/f;->d()V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget v0, p0, Lt/f;->r:I

    .line 32
    .line 33
    iget-object v1, p0, Lt/f;->p:[J

    .line 34
    .line 35
    array-length v1, v1

    .line 36
    if-lt v0, v1, :cond_2

    .line 37
    .line 38
    add-int/lit8 v1, v0, 0x1

    .line 39
    .line 40
    invoke-static {v1}, Lt/d;->f(I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    new-array v2, v1, [J

    .line 45
    .line 46
    new-array v1, v1, [Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v3, p0, Lt/f;->p:[J

    .line 49
    .line 50
    array-length v4, v3

    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-static {v3, v5, v2, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    .line 54
    .line 55
    iget-object v3, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 56
    .line 57
    array-length v4, v3

    .line 58
    invoke-static {v3, v5, v1, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, Lt/f;->p:[J

    .line 62
    .line 63
    iput-object v1, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 64
    .line 65
    :cond_2
    iget-object v1, p0, Lt/f;->p:[J

    .line 66
    .line 67
    aput-wide p1, v1, v0

    .line 68
    .line 69
    iget-object p1, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 70
    .line 71
    aput-object p3, p1, v0

    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    iput v0, p0, Lt/f;->r:I

    .line 76
    .line 77
    return-void
.end method

.method public b()Lt/f;
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lt/f;

    .line 6
    .line 7
    iget-object v1, p0, Lt/f;->p:[J

    .line 8
    .line 9
    invoke-virtual {v1}, [J->clone()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, [J

    .line 14
    .line 15
    iput-object v1, v0, Lt/f;->p:[J

    .line 16
    .line 17
    iget-object v1, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, [Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v1, v0, Lt/f;->q:[Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    return-object v0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    new-instance v1, Ljava/lang/AssertionError;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    throw v1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt/f;->b()Lt/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final d()V
    .locals 9

    .line 1
    iget v0, p0, Lt/f;->r:I

    .line 2
    .line 3
    iget-object v1, p0, Lt/f;->p:[J

    .line 4
    .line 5
    iget-object v2, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    move v4, v3

    .line 9
    move v5, v4

    .line 10
    :goto_0
    if-ge v4, v0, :cond_2

    .line 11
    .line 12
    aget-object v6, v2, v4

    .line 13
    .line 14
    sget-object v7, Lt/f;->s:Ljava/lang/Object;

    .line 15
    .line 16
    if-eq v6, v7, :cond_1

    .line 17
    .line 18
    if-eq v4, v5, :cond_0

    .line 19
    .line 20
    aget-wide v7, v1, v4

    .line 21
    .line 22
    aput-wide v7, v1, v5

    .line 23
    .line 24
    aput-object v6, v2, v5

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    aput-object v6, v2, v4

    .line 28
    .line 29
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 30
    .line 31
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    iput-boolean v3, p0, Lt/f;->o:Z

    .line 35
    .line 36
    iput v5, p0, Lt/f;->r:I

    .line 37
    .line 38
    return-void
.end method

.method public f(J)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lt/f;->g(JLjava/lang/Object;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public g(JLjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lt/f;->p:[J

    .line 2
    .line 3
    iget v1, p0, Lt/f;->r:I

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lt/d;->b([JIJ)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 12
    .line 13
    aget-object p1, p2, p1

    .line 14
    .line 15
    sget-object p2, Lt/f;->s:Ljava/lang/Object;

    .line 16
    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-object p1

    .line 21
    :cond_1
    :goto_0
    return-object p3
.end method

.method public j(I)J
    .locals 3

    .line 1
    iget-boolean v0, p0, Lt/f;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lt/f;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lt/f;->p:[J

    .line 9
    .line 10
    aget-wide v1, v0, p1

    .line 11
    .line 12
    return-wide v1
.end method

.method public l(JLjava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lt/f;->p:[J

    .line 2
    .line 3
    iget v1, p0, Lt/f;->r:I

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lt/d;->b([JIJ)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 12
    .line 13
    aput-object p3, p1, v0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    not-int v0, v0

    .line 17
    iget v1, p0, Lt/f;->r:I

    .line 18
    .line 19
    if-ge v0, v1, :cond_1

    .line 20
    .line 21
    iget-object v2, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 22
    .line 23
    aget-object v3, v2, v0

    .line 24
    .line 25
    sget-object v4, Lt/f;->s:Ljava/lang/Object;

    .line 26
    .line 27
    if-ne v3, v4, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, Lt/f;->p:[J

    .line 30
    .line 31
    aput-wide p1, v1, v0

    .line 32
    .line 33
    aput-object p3, v2, v0

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-boolean v2, p0, Lt/f;->o:Z

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget-object v2, p0, Lt/f;->p:[J

    .line 41
    .line 42
    array-length v2, v2

    .line 43
    if-lt v1, v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Lt/f;->d()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lt/f;->p:[J

    .line 49
    .line 50
    iget v1, p0, Lt/f;->r:I

    .line 51
    .line 52
    invoke-static {v0, v1, p1, p2}, Lt/d;->b([JIJ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    not-int v0, v0

    .line 57
    :cond_2
    iget v1, p0, Lt/f;->r:I

    .line 58
    .line 59
    iget-object v2, p0, Lt/f;->p:[J

    .line 60
    .line 61
    array-length v2, v2

    .line 62
    if-lt v1, v2, :cond_3

    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    invoke-static {v1}, Lt/d;->f(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    new-array v2, v1, [J

    .line 71
    .line 72
    new-array v1, v1, [Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v3, p0, Lt/f;->p:[J

    .line 75
    .line 76
    array-length v4, v3

    .line 77
    const/4 v5, 0x0

    .line 78
    invoke-static {v3, v5, v2, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    iget-object v3, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 82
    .line 83
    array-length v4, v3

    .line 84
    invoke-static {v3, v5, v1, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 85
    .line 86
    .line 87
    iput-object v2, p0, Lt/f;->p:[J

    .line 88
    .line 89
    iput-object v1, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 90
    .line 91
    :cond_3
    iget v1, p0, Lt/f;->r:I

    .line 92
    .line 93
    sub-int v2, v1, v0

    .line 94
    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    iget-object v2, p0, Lt/f;->p:[J

    .line 98
    .line 99
    add-int/lit8 v3, v0, 0x1

    .line 100
    .line 101
    sub-int/2addr v1, v0

    .line 102
    invoke-static {v2, v0, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 106
    .line 107
    iget v2, p0, Lt/f;->r:I

    .line 108
    .line 109
    sub-int/2addr v2, v0

    .line 110
    invoke-static {v1, v0, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 111
    .line 112
    .line 113
    :cond_4
    iget-object v1, p0, Lt/f;->p:[J

    .line 114
    .line 115
    aput-wide p1, v1, v0

    .line 116
    .line 117
    iget-object p1, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 118
    .line 119
    aput-object p3, p1, v0

    .line 120
    .line 121
    iget p1, p0, Lt/f;->r:I

    .line 122
    .line 123
    add-int/lit8 p1, p1, 0x1

    .line 124
    .line 125
    iput p1, p0, Lt/f;->r:I

    .line 126
    .line 127
    :goto_0
    return-void
.end method

.method public n(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt/f;->p:[J

    .line 2
    .line 3
    iget v1, p0, Lt/f;->r:I

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lt/d;->b([JIJ)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    iget-object p2, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 12
    .line 13
    aget-object v0, p2, p1

    .line 14
    .line 15
    sget-object v1, Lt/f;->s:Ljava/lang/Object;

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    aput-object v1, p2, p1

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lt/f;->o:Z

    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public o()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt/f;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lt/f;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lt/f;->r:I

    .line 9
    .line 10
    return v0
.end method

.method public p(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt/f;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lt/f;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lt/f;->q:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object p1, v0, p1

    .line 11
    .line 12
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lt/f;->o()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "{}"

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget v1, p0, Lt/f;->r:I

    .line 13
    .line 14
    mul-int/lit8 v1, v1, 0x1c

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x7b

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    :goto_0
    iget v2, p0, Lt/f;->r:I

    .line 26
    .line 27
    if-ge v1, v2, :cond_3

    .line 28
    .line 29
    if-lez v1, :cond_1

    .line 30
    .line 31
    const-string v2, ", "

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0, v1}, Lt/f;->j(I)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 v2, 0x3d

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lt/f;->p(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-eq v2, p0, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const-string v2, "(this Map)"

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    const/16 v1, 0x7d

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0
.end method
