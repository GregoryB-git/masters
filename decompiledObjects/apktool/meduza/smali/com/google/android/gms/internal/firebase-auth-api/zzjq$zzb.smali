.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/firebase-auth-api/zzjq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zzb"
.end annotation


# instance fields
.field private zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;

.field private zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;

.field private zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;

.field private zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzcg;

.field private zze:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzn;


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzcg;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;

    iput-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzn;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjr;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcg;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;->zzi()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzcg;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v1, "Invalid DEM parameters "

    .line 21
    .line 22
    const-string v2, "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."

    .line 23
    .line 24
    invoke-static {v1, p1, v2}, La0/j;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
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

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzzn;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzn;->zza()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzn;

    return-object p0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzn;

    return-object p0
.end method

.method public final zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjq;
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzcg;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;

    if-eqz v1, :cond_4

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;

    if-eq v0, v1, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Point format is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "For Curve25519 point format must not be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzcg;

    iget-object v7, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;

    iget-object v8, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzn;

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;Lcom/google/android/gms/internal/firebase-auth-api/zzcg;Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;Lcom/google/android/gms/internal/firebase-auth-api/zzzn;Lcom/google/android/gms/internal/firebase-auth-api/zzjr;)V

    return-object v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "DEM parameters are not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Elliptic curve type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
