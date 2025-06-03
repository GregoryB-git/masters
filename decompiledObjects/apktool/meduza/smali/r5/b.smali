.class public abstract Lr5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr5/h;


# instance fields
.field public final a:Lz4/i0;

.field public final b:I

.field public final c:[I

.field public final d:[Lv3/i0;

.field public final e:[J

.field public f:I


# direct methods
.method public constructor <init>(Lz4/i0;[I)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    array-length v0, p2

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    invoke-static {v0}, Lx6/b;->H(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lr5/b;->a:Lz4/i0;

    .line 18
    .line 19
    array-length v0, p2

    .line 20
    iput v0, p0, Lr5/b;->b:I

    .line 21
    .line 22
    new-array v0, v0, [Lv3/i0;

    .line 23
    .line 24
    iput-object v0, p0, Lr5/b;->d:[Lv3/i0;

    .line 25
    .line 26
    move v0, v1

    .line 27
    :goto_1
    array-length v2, p2

    .line 28
    if-ge v0, v2, :cond_1

    .line 29
    .line 30
    iget-object v2, p0, Lr5/b;->d:[Lv3/i0;

    .line 31
    .line 32
    aget v3, p2, v0

    .line 33
    .line 34
    iget-object v4, p1, Lz4/i0;->d:[Lv3/i0;

    .line 35
    .line 36
    aget-object v3, v4, v3

    .line 37
    .line 38
    aput-object v3, v2, v0

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object p2, p0, Lr5/b;->d:[Lv3/i0;

    .line 44
    .line 45
    new-instance v0, Lv4/d;

    .line 46
    .line 47
    const/4 v2, 0x2

    .line 48
    invoke-direct {v0, v2}, Lv4/d;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 52
    .line 53
    .line 54
    iget p2, p0, Lr5/b;->b:I

    .line 55
    .line 56
    new-array p2, p2, [I

    .line 57
    .line 58
    iput-object p2, p0, Lr5/b;->c:[I

    .line 59
    .line 60
    :goto_2
    iget p2, p0, Lr5/b;->b:I

    .line 61
    .line 62
    if-ge v1, p2, :cond_2

    .line 63
    .line 64
    iget-object p2, p0, Lr5/b;->c:[I

    .line 65
    .line 66
    iget-object v0, p0, Lr5/b;->d:[Lv3/i0;

    .line 67
    .line 68
    aget-object v0, v0, v1

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lz4/i0;->a(Lv3/i0;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    aput v0, p2, v1

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    new-array p1, p2, [J

    .line 80
    .line 81
    iput-object p1, p0, Lr5/b;->e:[J

    .line 82
    .line 83
    return-void
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
.method public final a()Lz4/i0;
    .locals 1

    iget-object v0, p0, Lr5/b;->a:Lz4/i0;

    return-object v0
.end method

.method public final b(I)Lv3/i0;
    .locals 1

    iget-object v0, p0, Lr5/b;->d:[Lv3/i0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final c(I)I
    .locals 1

    iget-object v0, p0, Lr5/b;->c:[I

    aget p1, v0, p1

    return p1
.end method

.method public final d(Lv3/i0;)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lr5/b;->b:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lr5/b;->d:[Lv3/i0;

    aget-object v1, v1, v0

    if-ne v1, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final synthetic e()V
    .locals 0

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lr5/b;

    iget-object v2, p0, Lr5/b;->a:Lz4/i0;

    iget-object v3, p1, Lr5/b;->a:Lz4/i0;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lr5/b;->c:[I

    iget-object p1, p1, Lr5/b;->c:[I

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final f(I)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lr5/b;->b:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lr5/b;->c:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public final synthetic h()V
    .locals 0

    return-void
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lr5/b;->f:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lr5/b;->a:Lz4/i0;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lr5/b;->c:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lr5/b;->f:I

    :cond_0
    iget v0, p0, Lr5/b;->f:I

    return v0
.end method

.method public final k(IJ)Z
    .locals 9

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lr5/b;->l(IJ)Z

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    iget v5, p0, Lr5/b;->b:I

    const/4 v6, 0x1

    if-ge v4, v5, :cond_1

    if-nez v2, :cond_1

    if-eq v4, p1, :cond_0

    invoke-virtual {p0, v4, v0, v1}, Lr5/b;->l(IJ)Z

    move-result v2

    if-nez v2, :cond_0

    move v2, v6

    goto :goto_1

    :cond_0
    move v2, v3

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    return v3

    :cond_2
    iget-object v2, p0, Lr5/b;->e:[J

    aget-wide v3, v2, p1

    sget v5, Lv5/e0;->a:I

    add-long v7, v0, p2

    xor-long/2addr v0, v7

    xor-long/2addr p2, v7

    and-long/2addr p2, v0

    const-wide/16 v0, 0x0

    cmp-long p2, p2, v0

    if-gez p2, :cond_3

    const-wide v7, 0x7fffffffffffffffL

    :cond_3
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    aput-wide p2, v2, p1

    return v6
.end method

.method public final l(IJ)Z
    .locals 3

    iget-object v0, p0, Lr5/b;->e:[J

    aget-wide v1, v0, p1

    cmp-long p1, v1, p2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final length()I
    .locals 1

    iget-object v0, p0, Lr5/b;->c:[I

    array-length v0, v0

    return v0
.end method

.method public m()V
    .locals 0

    return-void
.end method

.method public n(JLjava/util/List;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lb5/m;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public final o()I
    .locals 2

    iget-object v0, p0, Lr5/b;->c:[I

    invoke-interface {p0}, Lr5/h;->i()I

    move-result v1

    aget v0, v0, v1

    return v0
.end method

.method public final p()Lv3/i0;
    .locals 2

    iget-object v0, p0, Lr5/b;->d:[Lv3/i0;

    invoke-interface {p0}, Lr5/h;->i()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public r(F)V
    .locals 0

    return-void
.end method

.method public final synthetic t()V
    .locals 0

    return-void
.end method

.method public final synthetic u()V
    .locals 0

    return-void
.end method
