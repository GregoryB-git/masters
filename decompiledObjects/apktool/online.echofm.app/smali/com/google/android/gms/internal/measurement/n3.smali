.class public abstract Lcom/google/android/gms/internal/measurement/n3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([BI)D
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/n3;->q([BI)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static b(I[BIILcom/google/android/gms/internal/measurement/h4;Lcom/google/android/gms/internal/measurement/p3;)I
    .locals 2

    .line 1
    check-cast p4, Lcom/google/android/gms/internal/measurement/c4;

    invoke-static {p1, p2, p5}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result p2

    :goto_0
    iget v0, p5, Lcom/google/android/gms/internal/measurement/p3;->a:I

    invoke-virtual {p4, v0}, Lcom/google/android/gms/internal/measurement/c4;->g(I)V

    if-ge p2, p3, :cond_0

    invoke-static {p1, p2, p5}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, p5, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ne p0, v1, :cond_0

    invoke-static {p1, v0, p5}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result p2

    goto :goto_0

    :cond_0
    return p2
.end method

.method public static c(I[BIILcom/google/android/gms/internal/measurement/v5;Lcom/google/android/gms/internal/measurement/p3;)I
    .locals 9

    .line 1
    ushr-int/lit8 v0, p0, 0x3

    if-eqz v0, :cond_b

    and-int/lit8 v0, p0, 0x7

    if-eqz v0, :cond_a

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p3, 0x5

    if-ne v0, p3, :cond_0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/n3;->n([BI)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Lcom/google/android/gms/internal/measurement/v5;->e(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x4

    return p2

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->b()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p0

    throw p0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/v5;->l()Lcom/google/android/gms/internal/measurement/v5;

    move-result-object v6

    and-int/lit8 v0, p0, -0x8

    or-int/lit8 v7, v0, 0x4

    const/4 v0, 0x0

    :goto_0
    if-ge p2, p3, :cond_3

    invoke-static {p1, p2, p5}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v2

    iget p2, p5, Lcom/google/android/gms/internal/measurement/p3;->a:I

    move v0, p2

    if-eq p2, v7, :cond_2

    move-object v1, p1

    move v3, p3

    move-object v4, v6

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/n3;->c(I[BIILcom/google/android/gms/internal/measurement/v5;Lcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    move v8, v0

    move v0, p2

    move p2, v8

    goto :goto_0

    :cond_2
    move p2, v2

    :cond_3
    if-gt p2, p3, :cond_4

    if-ne v0, v7, :cond_4

    invoke-virtual {p4, p0, v6}, Lcom/google/android/gms/internal/measurement/v5;->e(ILjava/lang/Object;)V

    return p2

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->e()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p0

    throw p0

    :cond_5
    invoke-static {p1, p2, p5}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result p2

    iget p3, p5, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ltz p3, :cond_8

    array-length p5, p1

    sub-int/2addr p5, p2

    if-gt p3, p5, :cond_7

    if-nez p3, :cond_6

    sget-object p1, Lcom/google/android/gms/internal/measurement/q3;->p:Lcom/google/android/gms/internal/measurement/q3;

    :goto_1
    invoke-virtual {p4, p0, p1}, Lcom/google/android/gms/internal/measurement/v5;->e(ILjava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/measurement/q3;->q([BII)Lcom/google/android/gms/internal/measurement/q3;

    move-result-object p1

    goto :goto_1

    :goto_2
    add-int/2addr p2, p3

    return p2

    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p0

    throw p0

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->d()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p0

    throw p0

    :cond_9
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/n3;->q([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Lcom/google/android/gms/internal/measurement/v5;->e(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x8

    return p2

    :cond_a
    invoke-static {p1, p2, p5}, Lcom/google/android/gms/internal/measurement/n3;->p([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result p1

    iget-wide p2, p5, Lcom/google/android/gms/internal/measurement/p3;->b:J

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p4, p0, p2}, Lcom/google/android/gms/internal/measurement/v5;->e(ILjava/lang/Object;)V

    return p1

    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->b()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p0

    throw p0
.end method

.method public static d(I[BILcom/google/android/gms/internal/measurement/p3;)I
    .locals 2

    .line 1
    and-int/lit8 p0, p0, 0x7f

    add-int/lit8 v0, p2, 0x1

    aget-byte v1, p1, p2

    if-ltz v1, :cond_0

    shl-int/lit8 p1, v1, 0x7

    :goto_0
    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/android/gms/internal/measurement/p3;->a:I

    return v0

    :cond_0
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr p0, v1

    add-int/lit8 v1, p2, 0x2

    aget-byte v0, p1, v0

    if-ltz v0, :cond_1

    shl-int/lit8 p1, v0, 0xe

    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/android/gms/internal/measurement/p3;->a:I

    return v1

    :cond_1
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0xe

    or-int/2addr p0, v0

    add-int/lit8 v0, p2, 0x3

    aget-byte v1, p1, v1

    if-ltz v1, :cond_2

    shl-int/lit8 p1, v1, 0x15

    goto :goto_0

    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr p0, v1

    add-int/lit8 p2, p2, 0x4

    aget-byte v0, p1, v0

    if-ltz v0, :cond_3

    shl-int/lit8 p1, v0, 0x1c

    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/android/gms/internal/measurement/p3;->a:I

    return p2

    :cond_3
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0x1c

    or-int/2addr p0, v0

    :goto_1
    add-int/lit8 v0, p2, 0x1

    aget-byte p2, p1, p2

    if-ltz p2, :cond_4

    iput p0, p3, Lcom/google/android/gms/internal/measurement/p3;->a:I

    return v0

    :cond_4
    move p2, v0

    goto :goto_1
.end method

.method public static e(Lcom/google/android/gms/internal/measurement/Z4;I[BIILcom/google/android/gms/internal/measurement/h4;Lcom/google/android/gms/internal/measurement/p3;)I
    .locals 2

    .line 1
    invoke-static {p0, p2, p3, p4, p6}, Lcom/google/android/gms/internal/measurement/n3;->g(Lcom/google/android/gms/internal/measurement/Z4;[BIILcom/google/android/gms/internal/measurement/p3;)I

    move-result p3

    :goto_0
    iget-object v0, p6, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    invoke-interface {p5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ge p3, p4, :cond_0

    invoke-static {p2, p3, p6}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget v1, p6, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ne p1, v1, :cond_0

    invoke-static {p0, p2, v0, p4, p6}, Lcom/google/android/gms/internal/measurement/n3;->g(Lcom/google/android/gms/internal/measurement/Z4;[BIILcom/google/android/gms/internal/measurement/p3;)I

    move-result p3

    goto :goto_0

    :cond_0
    return p3
.end method

.method public static f(Lcom/google/android/gms/internal/measurement/Z4;[BIIILcom/google/android/gms/internal/measurement/p3;)I
    .locals 8

    .line 1
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/Z4;->a()Ljava/lang/Object;

    move-result-object v7

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/n3;->h(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;[BIIILcom/google/android/gms/internal/measurement/p3;)I

    move-result p1

    invoke-interface {p0, v7}, Lcom/google/android/gms/internal/measurement/Z4;->e(Ljava/lang/Object;)V

    iput-object v7, p5, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    return p1
.end method

.method public static g(Lcom/google/android/gms/internal/measurement/Z4;[BIILcom/google/android/gms/internal/measurement/p3;)I
    .locals 7

    .line 1
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/Z4;->a()Ljava/lang/Object;

    move-result-object v6

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/n3;->i(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;[BIILcom/google/android/gms/internal/measurement/p3;)I

    move-result p1

    invoke-interface {p0, v6}, Lcom/google/android/gms/internal/measurement/Z4;->e(Ljava/lang/Object;)V

    iput-object v6, p4, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    return p1
.end method

.method public static h(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;[BIIILcom/google/android/gms/internal/measurement/p3;)I
    .locals 7

    .line 1
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/M4;

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/M4;->m(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/measurement/p3;)I

    move-result p1

    iput-object p0, p6, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    return p1
.end method

.method public static i(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/Z4;[BIILcom/google/android/gms/internal/measurement/p3;)I
    .locals 6

    .line 1
    add-int/lit8 v0, p3, 0x1

    aget-byte p3, p2, p3

    if-gez p3, :cond_0

    invoke-static {p3, p2, v0, p5}, Lcom/google/android/gms/internal/measurement/n3;->d(I[BILcom/google/android/gms/internal/measurement/p3;)I

    move-result v0

    iget p3, p5, Lcom/google/android/gms/internal/measurement/p3;->a:I

    :cond_0
    move v3, v0

    if-ltz p3, :cond_1

    sub-int/2addr p4, v3

    if-gt p3, p4, :cond_1

    add-int/2addr p3, v3

    move-object v0, p1

    move-object v1, p0

    move-object v2, p2

    move v4, p3

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/Z4;->g(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/p3;)V

    iput-object p0, p5, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    return p3

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p0

    throw p0
.end method

.method public static j([BILcom/google/android/gms/internal/measurement/p3;)I
    .locals 2

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result p1

    iget v0, p2, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ltz v0, :cond_2

    array-length v1, p0

    sub-int/2addr v1, p1

    if-gt v0, v1, :cond_1

    if-nez v0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/measurement/q3;->p:Lcom/google/android/gms/internal/measurement/q3;

    iput-object p0, p2, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    return p1

    :cond_0
    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/q3;->q([BII)Lcom/google/android/gms/internal/measurement/q3;

    move-result-object p0

    iput-object p0, p2, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p0

    throw p0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->d()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p0

    throw p0
.end method

.method public static k([BILcom/google/android/gms/internal/measurement/h4;Lcom/google/android/gms/internal/measurement/p3;)I
    .locals 2

    .line 1
    check-cast p2, Lcom/google/android/gms/internal/measurement/c4;

    invoke-static {p0, p1, p3}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result p1

    iget v0, p3, Lcom/google/android/gms/internal/measurement/p3;->a:I

    add-int/2addr v0, p1

    :goto_0
    if-ge p1, v0, :cond_0

    invoke-static {p0, p1, p3}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result p1

    iget v1, p3, Lcom/google/android/gms/internal/measurement/p3;->a:I

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/measurement/c4;->g(I)V

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p0

    throw p0
.end method

.method public static l([BI)F
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/n3;->n([BI)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    return p0
.end method

.method public static m([BILcom/google/android/gms/internal/measurement/p3;)I
    .locals 1

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/n3;->o([BILcom/google/android/gms/internal/measurement/p3;)I

    move-result p1

    iget v0, p2, Lcom/google/android/gms/internal/measurement/p3;->a:I

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    const-string p0, ""

    iput-object p0, p2, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    return p1

    :cond_0
    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/E5;->e([BII)Ljava/lang/String;

    move-result-object p0

    iput-object p0, p2, Lcom/google/android/gms/internal/measurement/p3;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->d()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p0

    throw p0
.end method

.method public static n([BI)I
    .locals 2

    .line 1
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public static o([BILcom/google/android/gms/internal/measurement/p3;)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    if-ltz p1, :cond_0

    iput p1, p2, Lcom/google/android/gms/internal/measurement/p3;->a:I

    return v0

    :cond_0
    invoke-static {p1, p0, v0, p2}, Lcom/google/android/gms/internal/measurement/n3;->d(I[BILcom/google/android/gms/internal/measurement/p3;)I

    move-result p0

    return p0
.end method

.method public static p([BILcom/google/android/gms/internal/measurement/p3;)I
    .locals 9

    .line 1
    add-int/lit8 v0, p1, 0x1

    aget-byte v1, p0, p1

    int-to-long v1, v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-ltz v3, :cond_0

    iput-wide v1, p2, Lcom/google/android/gms/internal/measurement/p3;->b:J

    return v0

    :cond_0
    const-wide/16 v3, 0x7f

    and-long/2addr v1, v3

    add-int/lit8 p1, p1, 0x2

    aget-byte v0, p0, v0

    and-int/lit8 v3, v0, 0x7f

    int-to-long v3, v3

    const/4 v5, 0x7

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    move v3, v5

    :goto_0
    if-gez v0, :cond_1

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    add-int/2addr v3, v5

    and-int/lit8 v4, p1, 0x7f

    int-to-long v6, v4

    shl-long/2addr v6, v3

    or-long/2addr v1, v6

    move v8, v0

    move v0, p1

    move p1, v8

    goto :goto_0

    :cond_1
    iput-wide v1, p2, Lcom/google/android/gms/internal/measurement/p3;->b:J

    return p1
.end method

.method public static q([BI)J
    .locals 7

    .line 1
    aget-byte v0, p0, p1

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    add-int/lit8 v4, p1, 0x1

    aget-byte v4, p0, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x8

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p1, 0x2

    aget-byte v4, p0, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x10

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p1, 0x3

    aget-byte v4, p0, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x18

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p1, 0x4

    aget-byte v4, p0, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p1, 0x5

    aget-byte v4, p0, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x28

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p1, 0x6

    aget-byte v4, p0, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x30

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 p1, p1, 0x7

    aget-byte p0, p0, p1

    int-to-long p0, p0

    and-long/2addr p0, v2

    const/16 v2, 0x38

    shl-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method
