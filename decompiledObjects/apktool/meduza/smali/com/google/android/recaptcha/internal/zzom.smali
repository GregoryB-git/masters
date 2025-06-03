.class final Lcom/google/android/recaptcha/internal/zzom;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzow;


# instance fields
.field private final zza:Lcom/google/android/recaptcha/internal/zzoi;

.field private final zzb:Lcom/google/android/recaptcha/internal/zzpl;

.field private final zzc:Z

.field private final zzd:Lcom/google/android/recaptcha/internal/zzmp;


# direct methods
.method private constructor <init>(Lcom/google/android/recaptcha/internal/zzpl;Lcom/google/android/recaptcha/internal/zzmp;Lcom/google/android/recaptcha/internal/zzoi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzom;->zzb:Lcom/google/android/recaptcha/internal/zzpl;

    instance-of p1, p3, Lcom/google/android/recaptcha/internal/zzna;

    iput-boolean p1, p0, Lcom/google/android/recaptcha/internal/zzom;->zzc:Z

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzom;->zzd:Lcom/google/android/recaptcha/internal/zzmp;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzom;->zza:Lcom/google/android/recaptcha/internal/zzoi;

    return-void
.end method

.method public static zzc(Lcom/google/android/recaptcha/internal/zzpl;Lcom/google/android/recaptcha/internal/zzmp;Lcom/google/android/recaptcha/internal/zzoi;)Lcom/google/android/recaptcha/internal/zzom;
    .locals 1

    new-instance v0, Lcom/google/android/recaptcha/internal/zzom;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzom;-><init>(Lcom/google/android/recaptcha/internal/zzpl;Lcom/google/android/recaptcha/internal/zzmp;Lcom/google/android/recaptcha/internal/zzoi;)V

    return-object v0
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)I
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/recaptcha/internal/zznd;

    iget-object v0, v0, Lcom/google/android/recaptcha/internal/zznd;->zzc:Lcom/google/android/recaptcha/internal/zzpm;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzpm;->zzb()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/recaptcha/internal/zzom;->zzc:Z

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/recaptcha/internal/zzna;

    iget-object p1, p1, Lcom/google/android/recaptcha/internal/zzna;->zzb:Lcom/google/android/recaptcha/internal/zzmt;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzmt;->zzb()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zzb(Ljava/lang/Object;)I
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/recaptcha/internal/zznd;

    iget-object v0, v0, Lcom/google/android/recaptcha/internal/zznd;->zzc:Lcom/google/android/recaptcha/internal/zzpm;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzpm;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/recaptcha/internal/zzom;->zzc:Z

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/recaptcha/internal/zzna;

    iget-object p1, p1, Lcom/google/android/recaptcha/internal/zzna;->zzb:Lcom/google/android/recaptcha/internal/zzmt;

    mul-int/lit8 v0, v0, 0x35

    iget-object p1, p1, Lcom/google/android/recaptcha/internal/zzmt;->zza:Lcom/google/android/recaptcha/internal/zzpe;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzpe;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zze()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzom;->zza:Lcom/google/android/recaptcha/internal/zzoi;

    instance-of v1, v0, Lcom/google/android/recaptcha/internal/zznd;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/recaptcha/internal/zznd;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zznd;->zzv()Lcom/google/android/recaptcha/internal/zznd;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/recaptcha/internal/zzoi;->zzad()Lcom/google/android/recaptcha/internal/zzoh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/recaptcha/internal/zzoh;->zzl()Lcom/google/android/recaptcha/internal/zzoi;

    move-result-object v0

    return-object v0
.end method

.method public final zzf(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzom;->zzb:Lcom/google/android/recaptcha/internal/zzpl;

    invoke-virtual {v0, p1}, Lcom/google/android/recaptcha/internal/zzpl;->zzi(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzom;->zzd:Lcom/google/android/recaptcha/internal/zzmp;

    invoke-virtual {v0, p1}, Lcom/google/android/recaptcha/internal/zzmp;->zza(Ljava/lang/Object;)V

    return-void
.end method

.method public final zzg(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzom;->zzb:Lcom/google/android/recaptcha/internal/zzpl;

    invoke-static {v0, p1, p2}, Lcom/google/android/recaptcha/internal/zzoy;->zzq(Lcom/google/android/recaptcha/internal/zzpl;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/recaptcha/internal/zzom;->zzc:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzom;->zzd:Lcom/google/android/recaptcha/internal/zzmp;

    invoke-static {v0, p1, p2}, Lcom/google/android/recaptcha/internal/zzoy;->zzp(Lcom/google/android/recaptcha/internal/zzmp;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final zzh(Ljava/lang/Object;Lcom/google/android/recaptcha/internal/zzov;Lcom/google/android/recaptcha/internal/zzmo;)V
    .locals 9

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzom;->zzb:Lcom/google/android/recaptcha/internal/zzpl;

    invoke-virtual {v0, p1}, Lcom/google/android/recaptcha/internal/zzpl;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lcom/google/android/recaptcha/internal/zzna;

    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzna;->zzi()Lcom/google/android/recaptcha/internal/zzmt;

    :cond_0
    :goto_0
    :try_start_0
    invoke-interface {p2}, Lcom/google/android/recaptcha/internal/zzov;->zzc()I

    move-result v2

    const v3, 0x7fffffff

    if-ne v2, v3, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {p2}, Lcom/google/android/recaptcha/internal/zzov;->zzd()I

    move-result v2

    const/16 v4, 0xb

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eq v2, v4, :cond_5

    and-int/lit8 v3, v2, 0x7

    const/4 v4, 0x2

    if-ne v3, v4, :cond_3

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzom;->zza:Lcom/google/android/recaptcha/internal/zzoi;

    ushr-int/lit8 v2, v2, 0x3

    invoke-virtual {p3, v3, v2}, Lcom/google/android/recaptcha/internal/zzmo;->zza(Lcom/google/android/recaptcha/internal/zzoi;I)Lcom/google/android/recaptcha/internal/zznc;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-virtual {v0, v1, p2, v5}, Lcom/google/android/recaptcha/internal/zzpl;->zzk(Ljava/lang/Object;Lcom/google/android/recaptcha/internal/zzov;I)Z

    move-result v2

    goto :goto_1

    :cond_2
    throw v6

    :cond_3
    invoke-interface {p2}, Lcom/google/android/recaptcha/internal/zzov;->zzO()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    :goto_2
    invoke-virtual {v0, p1, v1}, Lcom/google/android/recaptcha/internal/zzpl;->zzj(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_5
    move-object v2, v6

    move-object v4, v2

    :cond_6
    :goto_3
    :try_start_1
    invoke-interface {p2}, Lcom/google/android/recaptcha/internal/zzov;->zzc()I

    move-result v7

    if-ne v7, v3, :cond_7

    goto :goto_4

    :cond_7
    invoke-interface {p2}, Lcom/google/android/recaptcha/internal/zzov;->zzd()I

    move-result v7

    const/16 v8, 0x10

    if-ne v7, v8, :cond_8

    invoke-interface {p2}, Lcom/google/android/recaptcha/internal/zzov;->zzj()I

    move-result v5

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzom;->zza:Lcom/google/android/recaptcha/internal/zzoi;

    invoke-virtual {p3, v2, v5}, Lcom/google/android/recaptcha/internal/zzmo;->zza(Lcom/google/android/recaptcha/internal/zzoi;I)Lcom/google/android/recaptcha/internal/zznc;

    move-result-object v2

    goto :goto_3

    :cond_8
    const/16 v8, 0x1a

    if-ne v7, v8, :cond_a

    if-nez v2, :cond_9

    invoke-interface {p2}, Lcom/google/android/recaptcha/internal/zzov;->zzp()Lcom/google/android/recaptcha/internal/zzle;

    move-result-object v4

    goto :goto_3

    :cond_9
    throw v6

    :cond_a
    invoke-interface {p2}, Lcom/google/android/recaptcha/internal/zzov;->zzO()Z

    move-result v7

    if-nez v7, :cond_6

    :goto_4
    invoke-interface {p2}, Lcom/google/android/recaptcha/internal/zzov;->zzd()I

    move-result v3

    const/16 v7, 0xc

    if-ne v3, v7, :cond_c

    if-eqz v4, :cond_0

    if-nez v2, :cond_b

    invoke-virtual {v0, v1, v5, v4}, Lcom/google/android/recaptcha/internal/zzpl;->zzg(Ljava/lang/Object;ILcom/google/android/recaptcha/internal/zzle;)V

    goto :goto_0

    :cond_b
    throw v6

    :cond_c
    new-instance p2, Lcom/google/android/recaptcha/internal/zznn;

    const-string p3, "Protocol message end-group tag did not match expected tag."

    invoke-direct {p2, p3}, Lcom/google/android/recaptcha/internal/zznn;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p2

    invoke-virtual {v0, p1, v1}, Lcom/google/android/recaptcha/internal/zzpl;->zzj(Ljava/lang/Object;Ljava/lang/Object;)V

    throw p2
.end method

.method public final zzi(Ljava/lang/Object;[BIILcom/google/android/recaptcha/internal/zzkt;)V
    .locals 9

    move-object v0, p1

    check-cast v0, Lcom/google/android/recaptcha/internal/zznd;

    iget-object v1, v0, Lcom/google/android/recaptcha/internal/zznd;->zzc:Lcom/google/android/recaptcha/internal/zzpm;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzpm;->zzc()Lcom/google/android/recaptcha/internal/zzpm;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzpm;->zzf()Lcom/google/android/recaptcha/internal/zzpm;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/recaptcha/internal/zznd;->zzc:Lcom/google/android/recaptcha/internal/zzpm;

    :cond_0
    check-cast p1, Lcom/google/android/recaptcha/internal/zzna;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzna;->zzi()Lcom/google/android/recaptcha/internal/zzmt;

    const/4 p1, 0x0

    move-object v0, p1

    :goto_0
    if-ge p3, p4, :cond_a

    invoke-static {p2, p3, p5}, Lcom/google/android/recaptcha/internal/zzku;->zzi([BILcom/google/android/recaptcha/internal/zzkt;)I

    move-result v4

    iget v2, p5, Lcom/google/android/recaptcha/internal/zzkt;->zza:I

    const/16 p3, 0xb

    const/4 v3, 0x2

    if-eq v2, p3, :cond_3

    and-int/lit8 p3, v2, 0x7

    if-ne p3, v3, :cond_2

    iget-object p3, p5, Lcom/google/android/recaptcha/internal/zzkt;->zzd:Lcom/google/android/recaptcha/internal/zzmo;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzom;->zza:Lcom/google/android/recaptcha/internal/zzoi;

    ushr-int/lit8 v3, v2, 0x3

    invoke-virtual {p3, v0, v3}, Lcom/google/android/recaptcha/internal/zzmo;->zza(Lcom/google/android/recaptcha/internal/zzoi;I)Lcom/google/android/recaptcha/internal/zznc;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v3, p2

    move v5, p4

    move-object v6, v1

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Lcom/google/android/recaptcha/internal/zzku;->zzh(I[BIILcom/google/android/recaptcha/internal/zzpm;Lcom/google/android/recaptcha/internal/zzkt;)I

    move-result p3

    goto :goto_0

    :cond_1
    sget p2, Lcom/google/android/recaptcha/internal/zzos;->zza:I

    throw p1

    :cond_2
    invoke-static {v2, p2, v4, p4, p5}, Lcom/google/android/recaptcha/internal/zzku;->zzo(I[BIILcom/google/android/recaptcha/internal/zzkt;)I

    move-result p3

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    move-object v2, p1

    :goto_1
    if-ge v4, p4, :cond_8

    invoke-static {p2, v4, p5}, Lcom/google/android/recaptcha/internal/zzku;->zzi([BILcom/google/android/recaptcha/internal/zzkt;)I

    move-result v4

    iget v5, p5, Lcom/google/android/recaptcha/internal/zzkt;->zza:I

    ushr-int/lit8 v6, v5, 0x3

    and-int/lit8 v7, v5, 0x7

    if-eq v6, v3, :cond_6

    const/4 v8, 0x3

    if-eq v6, v8, :cond_4

    goto :goto_2

    :cond_4
    if-nez v0, :cond_5

    if-ne v7, v3, :cond_7

    invoke-static {p2, v4, p5}, Lcom/google/android/recaptcha/internal/zzku;->zza([BILcom/google/android/recaptcha/internal/zzkt;)I

    move-result v4

    iget-object v2, p5, Lcom/google/android/recaptcha/internal/zzkt;->zzc:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/recaptcha/internal/zzle;

    goto :goto_1

    :cond_5
    sget p2, Lcom/google/android/recaptcha/internal/zzos;->zza:I

    throw p1

    :cond_6
    if-nez v7, :cond_7

    invoke-static {p2, v4, p5}, Lcom/google/android/recaptcha/internal/zzku;->zzi([BILcom/google/android/recaptcha/internal/zzkt;)I

    move-result v4

    iget p3, p5, Lcom/google/android/recaptcha/internal/zzkt;->zza:I

    iget-object v0, p5, Lcom/google/android/recaptcha/internal/zzkt;->zzd:Lcom/google/android/recaptcha/internal/zzmo;

    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzom;->zza:Lcom/google/android/recaptcha/internal/zzoi;

    invoke-virtual {v0, v5, p3}, Lcom/google/android/recaptcha/internal/zzmo;->zza(Lcom/google/android/recaptcha/internal/zzoi;I)Lcom/google/android/recaptcha/internal/zznc;

    move-result-object v0

    goto :goto_1

    :cond_7
    :goto_2
    const/16 v6, 0xc

    if-eq v5, v6, :cond_8

    invoke-static {v5, p2, v4, p4, p5}, Lcom/google/android/recaptcha/internal/zzku;->zzo(I[BIILcom/google/android/recaptcha/internal/zzkt;)I

    move-result v4

    goto :goto_1

    :cond_8
    if-eqz v2, :cond_9

    shl-int/lit8 p3, p3, 0x3

    or-int/2addr p3, v3

    invoke-virtual {v1, p3, v2}, Lcom/google/android/recaptcha/internal/zzpm;->zzj(ILjava/lang/Object;)V

    :cond_9
    move p3, v4

    goto :goto_0

    :cond_a
    if-ne p3, p4, :cond_b

    return-void

    :cond_b
    new-instance p1, Lcom/google/android/recaptcha/internal/zznn;

    const-string p2, "Failed to parse the message."

    invoke-direct {p1, p2}, Lcom/google/android/recaptcha/internal/zznn;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzj(Ljava/lang/Object;Lcom/google/android/recaptcha/internal/zzpy;)V
    .locals 5

    move-object v0, p1

    check-cast v0, Lcom/google/android/recaptcha/internal/zzna;

    iget-object v0, v0, Lcom/google/android/recaptcha/internal/zzna;->zzb:Lcom/google/android/recaptcha/internal/zzmt;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzmt;->zzf()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/recaptcha/internal/zzms;

    invoke-interface {v2}, Lcom/google/android/recaptcha/internal/zzms;->zze()Lcom/google/android/recaptcha/internal/zzpx;

    move-result-object v3

    sget-object v4, Lcom/google/android/recaptcha/internal/zzpx;->zzi:Lcom/google/android/recaptcha/internal/zzpx;

    if-ne v3, v4, :cond_1

    invoke-interface {v2}, Lcom/google/android/recaptcha/internal/zzms;->zzg()Z

    invoke-interface {v2}, Lcom/google/android/recaptcha/internal/zzms;->zzf()Z

    instance-of v3, v1, Lcom/google/android/recaptcha/internal/zznp;

    invoke-interface {v2}, Lcom/google/android/recaptcha/internal/zzms;->zza()I

    move-result v2

    if-eqz v3, :cond_0

    check-cast v1, Lcom/google/android/recaptcha/internal/zznp;

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zznp;->zza()Lcom/google/android/recaptcha/internal/zzns;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zznt;->zzb()Lcom/google/android/recaptcha/internal/zzle;

    move-result-object v1

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    :goto_1
    invoke-interface {p2, v2, v1}, Lcom/google/android/recaptcha/internal/zzpy;->zzw(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Found invalid MessageSet item."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    check-cast p1, Lcom/google/android/recaptcha/internal/zznd;

    iget-object p1, p1, Lcom/google/android/recaptcha/internal/zznd;->zzc:Lcom/google/android/recaptcha/internal/zzpm;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzpm;->zzk(Lcom/google/android/recaptcha/internal/zzpy;)V

    return-void
.end method

.method public final zzk(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/recaptcha/internal/zznd;

    iget-object v0, v0, Lcom/google/android/recaptcha/internal/zznd;->zzc:Lcom/google/android/recaptcha/internal/zzpm;

    move-object v1, p2

    check-cast v1, Lcom/google/android/recaptcha/internal/zznd;

    iget-object v1, v1, Lcom/google/android/recaptcha/internal/zznd;->zzc:Lcom/google/android/recaptcha/internal/zzpm;

    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzpm;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/recaptcha/internal/zzom;->zzc:Z

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzna;

    iget-object p1, p1, Lcom/google/android/recaptcha/internal/zzna;->zzb:Lcom/google/android/recaptcha/internal/zzmt;

    check-cast p2, Lcom/google/android/recaptcha/internal/zzna;

    iget-object p2, p2, Lcom/google/android/recaptcha/internal/zzna;->zzb:Lcom/google/android/recaptcha/internal/zzmt;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzmt;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final zzl(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/google/android/recaptcha/internal/zzna;

    iget-object p1, p1, Lcom/google/android/recaptcha/internal/zzna;->zzb:Lcom/google/android/recaptcha/internal/zzmt;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzmt;->zzk()Z

    move-result p1

    return p1
.end method
