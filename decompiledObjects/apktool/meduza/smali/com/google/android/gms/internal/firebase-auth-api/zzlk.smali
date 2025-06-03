.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzlk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:[B


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzll;

.field private final zzc:Ljava/math/BigInteger;

.field private final zzd:[B

.field private final zze:[B

.field private zzf:Ljava/math/BigInteger;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zza:[B

    return-void
.end method

.method private constructor <init>([B[B[BLjava/math/BigInteger;Lcom/google/android/gms/internal/firebase-auth-api/zzll;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zzd:[B

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zze:[B

    sget-object p1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zzf:Ljava/math/BigInteger;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zzc:Ljava/math/BigInteger;

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzll;

    return-void
.end method

.method public static zza([BLcom/google/android/gms/internal/firebase-auth-api/zzlr;Lcom/google/android/gms/internal/firebase-auth-api/zzlo;Lcom/google/android/gms/internal/firebase-auth-api/zzlp;Lcom/google/android/gms/internal/firebase-auth-api/zzll;[B)Lcom/google/android/gms/internal/firebase-auth-api/zzlk;
    .locals 9

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzlo;->zza([BLcom/google/android/gms/internal/firebase-auth-api/zzlr;)[B

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzlu;->zza:[B

    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzlo;->zza()[B

    move-result-object p2

    invoke-interface {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzlp;->zzb()[B

    move-result-object v1

    invoke-interface {p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzll;->zzc()[B

    move-result-object v2

    invoke-static {p2, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzlu;->zza([B[B[B)[B

    move-result-object p2

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzlu;->zzl:[B

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zza:[B

    const-string v3, "psk_id_hash"

    invoke-interface {p3, v1, v2, v3, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzlp;->zza([B[BLjava/lang/String;[B)[B

    move-result-object v3

    const-string v4, "info_hash"

    invoke-interface {p3, v1, p5, v4, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzlp;->zza([B[BLjava/lang/String;[B)[B

    move-result-object p5

    const/4 v1, 0x3

    new-array v1, v1, [[B

    const/4 v4, 0x0

    aput-object v0, v1, v4

    const/4 v0, 0x1

    aput-object v3, v1, v0

    const/4 v0, 0x2

    aput-object p5, v1, v0

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyc;->zza([[B)[B

    move-result-object p5

    const-string v0, "secret"

    invoke-interface {p3, p1, v2, v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzlp;->zza([B[BLjava/lang/String;[B)[B

    move-result-object p1

    invoke-interface {p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzll;->zza()I

    move-result v8

    const-string v6, "key"

    move-object v3, p3

    move-object v4, p1

    move-object v5, p5

    move-object v7, p2

    invoke-interface/range {v3 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzlp;->zza([B[BLjava/lang/String;[BI)[B

    move-result-object v2

    invoke-interface {p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzll;->zzb()I

    move-result v8

    const-string v6, "base_nonce"

    invoke-interface/range {v3 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzlp;->zza([B[BLjava/lang/String;[BI)[B

    move-result-object v3

    invoke-interface {p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzll;->zzb()I

    sget-object p1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    const/16 p2, 0x60

    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;

    move-object v0, p1

    move-object v1, p0

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;-><init>([B[B[BLjava/math/BigInteger;Lcom/google/android/gms/internal/firebase-auth-api/zzll;)V

    return-object p1
.end method

.method private final declared-synchronized zza()[B
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zze:[B

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zzf:Ljava/math/BigInteger;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzll;

    invoke-interface {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzll;->zzb()I

    move-result v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzmo;->zza(Ljava/math/BigInteger;I)[B

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyc;->zza([B[B)[B

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zzf:Ljava/math/BigInteger;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zzc:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    if-gez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zzf:Ljava/math/BigInteger;

    sget-object v2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zzf:Ljava/math/BigInteger;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "message limit reached"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final zza([BI[B)[B
    .locals 6

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zza()[B

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzll;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zzd:[B

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzll;->zza([B[B[BI[B)[B

    move-result-object p1

    return-object p1
.end method
