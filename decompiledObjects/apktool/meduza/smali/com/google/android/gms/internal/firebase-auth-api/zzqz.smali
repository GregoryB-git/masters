.class final Lcom/google/android/gms/internal/firebase-auth-api/zzqz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzcd;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzpg;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzpg<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzcd;",
            ">;"
        }
    .end annotation
.end field

.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zznv;

.field private final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznv;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzpg;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzpg<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzcd;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzpg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpg;->zzf()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzoj;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzoj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzoj;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzns;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzny;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpg;)Lcom/google/android/gms/internal/firebase-auth-api/zznu;

    move-result-object p1

    const-string v1, "mac"

    const-string v2, "compute"

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznu;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    const-string v2, "verify"

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznu;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    return-void

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzny;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    goto :goto_0
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzpg;Lcom/google/android/gms/internal/firebase-auth-api/zzrc;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzpg;)V

    return-void
.end method


# virtual methods
.method public final zza([B[B)V
    .locals 5

    array-length v0, p1

    const/4 v1, 0x5

    if-le v0, v1, :cond_2

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzpg;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpg;->zza([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zzd()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/zzcd;

    invoke-interface {v2, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzcd;->zza([B[B)V

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zza()I

    move-result v1

    array-length v3, p2

    int-to-long v3, v3

    invoke-interface {v2, v1, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zznv;->zza(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzpg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpg;->zze()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;

    :try_start_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zzd()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/zzcd;

    invoke-interface {v2, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzcd;->zza([B[B)V

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zza()I

    move-result v1

    array-length v3, p2

    int-to-long v3, v3

    invoke-interface {v2, v1, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zznv;->zza(IJ)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    invoke-interface {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zznv;->zza()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid MAC"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    invoke-interface {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zznv;->zza()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "tag too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza([B)[B
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzpg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpg;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzpi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zzd()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcd;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzcd;->zza([B)[B

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzpg;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzpg;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzpi;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zza()I

    move-result v2

    array-length p1, p1

    int-to-long v3, p1

    invoke-interface {v1, v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zznv;->zza(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqz;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznv;->zza()V

    throw p1
.end method
