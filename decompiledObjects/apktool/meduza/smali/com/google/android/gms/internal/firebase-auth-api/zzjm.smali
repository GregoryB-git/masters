.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzjm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoy<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzjt;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbj;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzoy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoy<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzjs;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbm;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzci;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzci<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbj;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzbn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbn<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbm;",
            ">;"
        }
    .end annotation
.end field

.field private static final zze:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoe<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzjq;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/zzbm;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzbj;

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/zzjl;

    invoke-direct {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl;-><init>()V

    const-class v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpa;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzjm;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/zzjo;

    invoke-direct {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjo;-><init>()V

    const-class v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzoy;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpa;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzjm;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzun;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzalw;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    invoke-static {v3, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zznl;->zza(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzalw;)Lcom/google/android/gms/internal/firebase-auth-api/zzci;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjm;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzci;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzuq;->zzh()Lcom/google/android/gms/internal/firebase-auth-api/zzalw;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"

    invoke-static {v3, v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zznl;->zza(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzwb$zza;Lcom/google/android/gms/internal/firebase-auth-api/zzalw;)Lcom/google/android/gms/internal/firebase-auth-api/zzbn;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjm;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzbn;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzjn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjm;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq;Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/zzjt;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzmt;->zza:Ljava/security/spec/ECParameterSpec;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;

    .line 13
    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzmt;->zzb:Ljava/security/spec/ECParameterSpec;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzmt;->zzc:Ljava/security/spec/ECParameterSpec;

    .line 24
    .line 25
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzyi;->zza(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/security/interfaces/ECPrivateKey;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {p0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjs;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq;Ljava/security/spec/ECPoint;Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-interface {v0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzbl;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzcm;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzzm;->zza(Ljava/math/BigInteger;Lcom/google/android/gms/internal/firebase-auth-api/zzcm;)Lcom/google/android/gms/internal/firebase-auth-api/zzzm;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjt;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjs;Lcom/google/android/gms/internal/firebase-auth-api/zzzm;)Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 67
    .line 68
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string v0, "Unsupported curve type: "

    .line 73
    .line 74
    invoke-static {v0, p1}, Lf;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p0
    .line 82
    .line 83
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

.method public static zza()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    return-object v0
.end method

.method public static zza(Z)V
    .locals 13

    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/zzij$zza;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzij$zza;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzij$zza;->zza()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzld;->zza()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzok;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzok;

    move-result-object p0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v6

    const/16 v7, 0xc

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v6

    const/16 v8, 0x10

    invoke-virtual {v6, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v6

    invoke-virtual {v6, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v6

    sget-object v9, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zza;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zza;

    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdr;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcg;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjq;

    move-result-object v1

    const-string v6, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM"

    invoke-virtual {v0, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;

    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v10

    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v10

    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v10

    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v10

    invoke-virtual {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdr;

    move-result-object v10

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcg;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjq;

    move-result-object v1

    const-string v10, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    invoke-virtual {v0, v10, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    sget-object v10, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v11

    invoke-virtual {v11, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v11

    invoke-virtual {v11, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v11

    invoke-virtual {v11, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v11

    invoke-virtual {v11, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v11

    invoke-virtual {v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdr;

    move-result-object v11

    invoke-virtual {v1, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcg;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjq;

    move-result-object v1

    const-string v11, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM"

    invoke-virtual {v0, v11, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v11

    invoke-virtual {v11, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v11

    invoke-virtual {v11, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v11

    invoke-virtual {v11, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v11

    invoke-virtual {v11, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v11

    invoke-virtual {v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdr;

    move-result-object v11

    invoke-virtual {v1, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcg;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjq;

    move-result-object v1

    const-string v11, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    invoke-virtual {v0, v11, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v11

    invoke-virtual {v11, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v7

    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v7

    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v7

    invoke-virtual {v7, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzdr$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdr;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcg;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjq;

    move-result-object v1

    const-string v7, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX"

    invoke-virtual {v0, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v7

    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v7

    const/16 v9, 0x20

    invoke-virtual {v7, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v7

    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v7

    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v7

    sget-object v11, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;

    invoke-virtual {v7, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v7

    sget-object v12, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;

    invoke-virtual {v7, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdc;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcg;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjq;

    move-result-object v1

    const-string v7, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    invoke-virtual {v0, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdc;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcg;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjq;

    move-result-object v1

    const-string v4, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdc;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcg;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjq;

    move-result-object v1

    const-string v4, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v2

    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v2

    invoke-virtual {v2, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v2

    invoke-virtual {v2, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdc;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcg;)Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq$zzb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjq;

    move-result-object v1

    const-string v2, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzok;->zza(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzon;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzon;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjm;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzon;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoy;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzon;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzon;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjm;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzoy;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzon;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoy;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzoc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzoc;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjm;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzoc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoe;Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzna;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzna;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjm;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzci;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzna;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbn;Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzna;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzna;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjm;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzbn;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzna;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbn;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering ECIES Hybrid Encryption is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
