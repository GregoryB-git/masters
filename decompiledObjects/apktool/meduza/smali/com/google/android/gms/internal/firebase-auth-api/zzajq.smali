.class final Lcom/google/android/gms/internal/firebase-auth-api/zzajq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzanm;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzajo;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "output"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zza(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    iput-object p0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajq;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzajo;)Lcom/google/android/gms/internal/firebase-auth-api/zzajq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajq;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzajo;)V

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zza(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    const/4 v1, 0x4

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    return-void
.end method

.method public final zza(ID)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(ID)V

    return-void
.end method

.method public final zza(IF)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(IF)V

    return-void
.end method

.method public final zza(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(II)V

    return-void
.end method

.method public final zza(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(IJ)V

    return-void
.end method

.method public final zza(ILcom/google/android/gms/internal/firebase-auth-api/zzaiw;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzc(ILcom/google/android/gms/internal/firebase-auth-api/zzaiw;)V

    return-void
.end method

.method public final zza(ILcom/google/android/gms/internal/firebase-auth-api/zzale;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzale<",
            "TK;TV;>;",
            "Ljava/util/Map<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    const/4 v2, 0x2

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzale;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzajo;Lcom/google/android/gms/internal/firebase-auth-api/zzale;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final zza(ILjava/lang/Object;)V
    .locals 1

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzd(ILcom/google/android/gms/internal/firebase-auth-api/zzaiw;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(ILcom/google/android/gms/internal/firebase-auth-api/zzaln;)V

    return-void
.end method

.method public final zza(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajq;

    invoke-interface {p3, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V

    const/4 p2, 0x4

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    return-void
.end method

.method public final zza(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(ILjava/lang/String;)V

    return-void
.end method

.method public final zza(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzc(ILcom/google/android/gms/internal/firebase-auth-api/zzaiw;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final zza(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamc;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, v1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final zza(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiu;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiu;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiu;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiu;->zzb(I)Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(Z)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiu;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiu;->zzb(I)Z

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiu;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiu;->zzb(I)Z

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(IZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(Z)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(IZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zza(IZ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(IZ)V

    return-void
.end method

.method public final zzb(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    return-void
.end method

.method public final zzb(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzg(II)V

    return-void
.end method

.method public final zzb(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(IJ)V

    return-void
.end method

.method public final zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzc(ILcom/google/android/gms/internal/firebase-auth-api/zzaln;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    return-void
.end method

.method public final zzb(ILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaku;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaku;

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaku;->zza(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(ILjava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    invoke-virtual {v3, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzc(ILcom/google/android/gms/internal/firebase-auth-api/zzaiw;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(ILjava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final zzb(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamc;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, v1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final zzb(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->zzb(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(D)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->zzb(I)D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(D)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->zzb(I)D

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(ID)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(D)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(D)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(ID)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zzc(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(II)V

    return-void
.end method

.method public final zzc(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(IJ)V

    return-void
.end method

.method public final zzc(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zzd(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzg(II)V

    return-void
.end method

.method public final zzd(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzg(IJ)V

    return-void
.end method

.method public final zzd(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzi(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzg(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzi(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzg(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zze(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzi(II)V

    return-void
.end method

.method public final zze(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(IJ)V

    return-void
.end method

.method public final zze(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zzf(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzk(II)V

    return-void
.end method

.method public final zzf(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzake;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzake;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzake;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzake;->zzb(I)F

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(F)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzake;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzake;->zzb(I)F

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(F)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzake;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzake;->zzb(I)F

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(IF)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(F)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(F)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(IF)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zzg(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzc(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzc(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zzh(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zzi(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zze(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzi(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzg(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zze(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzi(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzg(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zzj(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzc(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzc(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zzk(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzk(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzi(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzk(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzi(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zzl(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzd(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzg(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzg(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzd(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzg(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzg(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zzm(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzk(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzk(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final zzn(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zze(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result p1

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result p3

    if-ge v2, p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzb(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzj(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_5

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zze(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzl(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void

    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    return-void
.end method
