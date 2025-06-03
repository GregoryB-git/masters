.class final Lcom/google/android/gms/internal/firebase-auth-api/zzme;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzlo;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzli;

.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzmd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzli;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzme;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzli;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzmf;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzmd;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzmh;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzmh;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzmg;)V

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzme;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzmd;

    return-void
.end method


# virtual methods
.method public final zza()[B
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzme;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzli;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzli;->zzb()[B

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzlu;->zzf:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzlu;->zzb:[B

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Could not determine HPKE KEM ID"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zza([BLcom/google/android/gms/internal/firebase-auth-api/zzlr;)[B
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzme;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzmd;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzlr;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzzn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzn;->zzb()[B

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmd;->zza([B[B)[B

    move-result-object v4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzlr;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzzn;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzzn;->zzb()[B

    move-result-object p2

    const/4 v0, 0x2

    new-array v0, v0, [[B

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzyc;->zza([[B)[B

    move-result-object v6

    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzlu;->zzb:[B

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzlu;->zza([B)[B

    move-result-object v8

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzme;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzli;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzli;->zza()I

    move-result v9

    const/4 v3, 0x0

    const-string v5, "eae_prk"

    const-string v7, "shared_secret"

    invoke-virtual/range {v2 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzli;->zza([B[BLjava/lang/String;[BLjava/lang/String;[BI)[B

    move-result-object p1

    return-object p1
.end method
