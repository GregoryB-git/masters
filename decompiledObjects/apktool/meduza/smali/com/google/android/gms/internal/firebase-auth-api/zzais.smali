.class final Lcom/google/android/gms/internal/firebase-auth-api/zzais;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile zza:I = 0x64


# direct methods
.method public static zza([BI)D
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BI)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static zza(I[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 2

    ushr-int/lit8 v0, p0, 0x3

    if-eqz v0, :cond_7

    and-int/lit8 v0, p0, 0x7

    if-eqz v0, :cond_6

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p0, 0x5

    if-ne v0, p0, :cond_0

    add-int/lit8 p2, p2, 0x4

    return p2

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0

    :cond_1
    and-int/lit8 p0, p0, -0x8

    or-int/lit8 p0, p0, 0x4

    const/4 v0, 0x0

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-static {p1, p2, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p2

    iget v0, p4, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-eq v0, p0, :cond_2

    invoke-static {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p2

    goto :goto_0

    :cond_2
    if-gt p2, p3, :cond_3

    if-ne v0, p0, :cond_3

    return p2

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0

    :cond_4
    invoke-static {p1, p2, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p0

    iget p1, p4, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    add-int/2addr p0, p1

    return p0

    :cond_5
    add-int/lit8 p2, p2, 0x8

    return p2

    :cond_6
    invoke-static {p1, p2, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p0

    return p0

    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0
.end method

.method public static zza(I[BIILcom/google/android/gms/internal/firebase-auth-api/zzakn;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzakn<",
            "*>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;",
            ")I"
        }
    .end annotation

    check-cast p4, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    invoke-static {p1, p2, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p2

    :goto_0
    iget v0, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    invoke-virtual {p4, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzc(I)V

    if-ge p2, p3, :cond_0

    invoke-static {p1, p2, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne p0, v1, :cond_0

    invoke-static {p1, v0, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p2

    goto :goto_0

    :cond_0
    return p2
.end method

.method public static zza(I[BIILcom/google/android/gms/internal/firebase-auth-api/zzamy;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 10

    ushr-int/lit8 v0, p0, 0x3

    if-eqz v0, :cond_b

    and-int/lit8 v0, p0, 0x7

    if-eqz v0, :cond_a

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const/4 v2, 0x2

    if-eq v0, v2, :cond_5

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 p3, 0x5

    if-ne v0, p3, :cond_0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BI)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamy;->zza(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x4

    return p2

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzamy;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzamy;

    move-result-object v0

    and-int/lit8 v2, p0, -0x8

    or-int/lit8 v8, v2, 0x4

    const/4 v2, 0x0

    iget v3, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zze:I

    add-int/2addr v3, v1

    iput v3, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zze:I

    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I)V

    :goto_0
    if-ge p2, p3, :cond_3

    invoke-static {p1, p2, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v4

    iget p2, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    move v2, p2

    if-eq p2, v8, :cond_2

    move-object v3, p1

    move v5, p3

    move-object v6, v0

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I[BIILcom/google/android/gms/internal/firebase-auth-api/zzamy;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v2

    move v9, v2

    move v2, p2

    move p2, v9

    goto :goto_0

    :cond_2
    move p2, v4

    :cond_3
    iget p1, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zze:I

    sub-int/2addr p1, v1

    iput p1, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zze:I

    if-gt p2, p3, :cond_4

    if-ne v2, v8, :cond_4

    invoke-virtual {p4, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzamy;->zza(ILjava/lang/Object;)V

    return p2

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0

    :cond_5
    invoke-static {p1, p2, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p2

    iget p3, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ltz p3, :cond_8

    array-length p5, p1

    sub-int/2addr p5, p2

    if-gt p3, p5, :cond_7

    if-nez p3, :cond_6

    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    goto :goto_1

    :cond_6
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->zza([BII)Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object p1

    :goto_1
    invoke-virtual {p4, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamy;->zza(ILjava/lang/Object;)V

    add-int/2addr p2, p3

    return p2

    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0

    :cond_9
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamy;->zza(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x8

    return p2

    :cond_a
    invoke-static {p1, p2, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p1

    iget-wide p2, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p4, p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamy;->zza(ILjava/lang/Object;)V

    return p1

    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0
.end method

.method public static zza(I[BIILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzaln;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaln;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamv<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamy;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamy;",
            ">;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;",
            ")I"
        }
    .end annotation

    ushr-int/lit8 p6, p0, 0x3

    iget-object v0, p7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzajv;

    invoke-virtual {v0, p5, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzajv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaln;I)Lcom/google/android/gms/internal/firebase-auth-api/zzakg$zzf;

    move-result-object p5

    if-nez p5, :cond_0

    invoke-static {p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzamy;

    move-result-object v4

    move v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v5, p7

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I[BIILcom/google/android/gms/internal/firebase-auth-api/zzamy;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p0

    return p0

    :cond_0
    check-cast p4, Lcom/google/android/gms/internal/firebase-auth-api/zzakg$zzd;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg$zzd;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzajy;

    iget-object p0, p4, Lcom/google/android/gms/internal/firebase-auth-api/zzakg$zzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzajy;

    new-instance p0, Ljava/lang/NoSuchMethodError;

    invoke-direct {p0}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p0
.end method

.method public static zza(I[BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 1

    and-int/lit8 p0, p0, 0x7f

    add-int/lit8 v0, p2, 0x1

    aget-byte p2, p1, p2

    if-ltz p2, :cond_0

    shl-int/lit8 p1, p2, 0x7

    :goto_0
    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    return v0

    :cond_0
    and-int/lit8 p2, p2, 0x7f

    shl-int/lit8 p2, p2, 0x7

    or-int/2addr p0, p2

    add-int/lit8 p2, v0, 0x1

    aget-byte v0, p1, v0

    if-ltz v0, :cond_1

    shl-int/lit8 p1, v0, 0xe

    :goto_1
    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    return p2

    :cond_1
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0xe

    or-int/2addr p0, v0

    add-int/lit8 v0, p2, 0x1

    aget-byte p2, p1, p2

    if-ltz p2, :cond_2

    shl-int/lit8 p1, p2, 0x15

    goto :goto_0

    :cond_2
    and-int/lit8 p2, p2, 0x7f

    shl-int/lit8 p2, p2, 0x15

    or-int/2addr p0, p2

    add-int/lit8 p2, v0, 0x1

    aget-byte v0, p1, v0

    if-ltz v0, :cond_3

    shl-int/lit8 p1, v0, 0x1c

    goto :goto_1

    :cond_3
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0x1c

    or-int/2addr p0, v0

    :goto_2
    add-int/lit8 v0, p2, 0x1

    aget-byte p2, p1, p2

    if-ltz p2, :cond_4

    iput p0, p3, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    return v0

    :cond_4
    move p2, v0

    goto :goto_2
.end method

.method public static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamc;I[BIILcom/google/android/gms/internal/firebase-auth-api/zzakn;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamc<",
            "*>;I[BII",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzakn<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;",
            ")I"
        }
    .end annotation

    and-int/lit8 v0, p1, -0x8

    or-int/lit8 v0, v0, 0x4

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, v0

    move-object v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p3

    :goto_0
    iget-object v1, p6, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    invoke-interface {p5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ge p3, p4, :cond_0

    invoke-static {p2, p3, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v3

    iget v1, p6, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne p1, v1, :cond_0

    move-object v1, p0

    move-object v2, p2

    move v4, p4

    move v5, v0

    move-object v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p3

    goto :goto_0

    :cond_0
    return p3
.end method

.method private static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamc<",
            "TT;>;[BIII",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza()Ljava/lang/Object;

    move-result-object v7

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p1

    invoke-interface {p0, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zzd(Ljava/lang/Object;)V

    iput-object v7, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    return p1
.end method

.method public static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamc<",
            "TT;>;[BII",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza()Ljava/lang/Object;

    move-result-object v6

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p1

    invoke-interface {p0, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zzd(Ljava/lang/Object;)V

    iput-object v6, p4, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    return p1
.end method

.method public static zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamc<",
            "TT;>;[BIII",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;",
            ")I"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;

    iget p1, p6, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zze:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p6, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zze:I

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I)V

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p1

    iget p2, p6, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zze:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p6, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zze:I

    iput-object p0, p6, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    return p1
.end method

.method public static zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamc<",
            "TT;>;[BII",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;",
            ")I"
        }
    .end annotation

    add-int/lit8 v0, p3, 0x1

    aget-byte p3, p2, p3

    if-gez p3, :cond_0

    invoke-static {p3, p2, v0, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I[BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget p3, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    :cond_0
    move v3, v0

    if-ltz p3, :cond_1

    sub-int/2addr p4, v3

    if-gt p3, p4, :cond_1

    iget p4, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zze:I

    add-int/lit8 p4, p4, 0x1

    iput p4, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zze:I

    invoke-static {p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I)V

    add-int/2addr p3, v3

    move-object v0, p1

    move-object v1, p0

    move-object v2, p2

    move v4, p3

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza(Ljava/lang/Object;[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)V

    iget p1, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zze:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zze:I

    iput-object p0, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    return p3

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0
.end method

.method public static zza([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 2

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p1

    iget v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ltz v0, :cond_2

    array-length v1, p0

    sub-int/2addr v1, p1

    if-gt v0, v1, :cond_1

    if-nez v0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    iput-object p0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    return p1

    :cond_0
    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->zza([BII)Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object p0

    iput-object p0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0
.end method

.method public static zza([BILcom/google/android/gms/internal/firebase-auth-api/zzakn;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzakn<",
            "*>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;",
            ")I"
        }
    .end annotation

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    invoke-static {p0, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p1

    iget v0, p3, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    add-int/2addr v0, p1

    :goto_0
    if-ge p1, v0, :cond_0

    invoke-static {p0, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p1

    iget v1, p3, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzc(I)V

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0
.end method

.method private static zza(I)V
    .locals 1

    sget v0, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza:I

    if-ge p0, v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzh()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0
.end method

.method public static zzb([BI)F
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BI)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    return p0
.end method

.method public static zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzamc;I[BIILcom/google/android/gms/internal/firebase-auth-api/zzakn;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamc<",
            "*>;I[BII",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzakn<",
            "*>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;",
            ")I"
        }
    .end annotation

    invoke-static {p0, p2, p3, p4, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p3

    :goto_0
    iget-object v0, p6, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    invoke-interface {p5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ge p3, p4, :cond_0

    invoke-static {p2, p3, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, p6, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne p1, v1, :cond_0

    invoke-static {p0, p2, v0, p4, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p3

    goto :goto_0

    :cond_0
    return p3
.end method

.method public static zzb([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 1

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p1

    iget v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    const-string p0, ""

    iput-object p0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    return p1

    :cond_0
    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanb;->zzb([BII)Ljava/lang/String;

    move-result-object p0

    iput-object p0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object p0

    throw p0
.end method

.method public static zzc([BI)I
    .locals 2

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

.method public static zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 1

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    if-ltz p1, :cond_0

    iput p1, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    return v0

    :cond_0
    invoke-static {p1, p0, v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I[BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p0

    return p0
.end method

.method public static zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 9

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    int-to-long v1, p1

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-ltz p1, :cond_0

    iput-wide v1, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    return v0

    :cond_0
    const-wide/16 v3, 0x7f

    and-long/2addr v1, v3

    add-int/lit8 p1, v0, 0x1

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
    iput-wide v1, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    return p1
.end method

.method public static zzd([BI)J
    .locals 7

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
