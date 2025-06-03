.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzdc;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzcr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;,
        Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;,
        Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;
    }
.end annotation


# instance fields
.field private final zza:I

.field private final zzb:I

.field private final zzc:I

.field private final zzd:I

.field private final zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;

.field private final zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;


# direct methods
.method private constructor <init>(IIIILcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzcr;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzb:I

    iput p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzc:I

    iput p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzd:I

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;

    iput-object p6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;

    return-void
.end method

.method public synthetic constructor <init>(IIIILcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;Lcom/google/android/gms/internal/firebase-auth-api/zzde;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;-><init>(IIIILcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;)V

    return-void
.end method

.method public static zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzde;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;

    iget v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zza:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zza:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzb:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzb:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzc:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzc:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzd:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzd:I

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;

    aput-object v2, v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zza:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzb:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzc:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzd:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzc:I

    iget v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzd:I

    iget v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zza:I

    iget v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzb:I

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AesCtrHmacAead Parameters (variant: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", hashType: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte IV, and "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte tags, and "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte AES key, and "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte HMAC key)"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzb()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zza:I

    return v0
.end method

.method public final zzc()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzb:I

    return v0
.end method

.method public final zzd()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzc:I

    return v0
.end method

.method public final zze()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzd:I

    return v0
.end method

.method public final zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;

    return-object v0
.end method

.method public final zzh()Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;

    return-object v0
.end method
