.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzpp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/security/SecureRandom;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpo;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp;->zza:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public static synthetic zza()Ljava/security/SecureRandom;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp;->zzb()Ljava/security/SecureRandom;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    return-object v0
.end method

.method public static zza(I)[B
    .locals 1

    new-array p0, p0, [B

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp;->zza:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/SecureRandom;

    invoke-virtual {v0, p0}, Ljava/security/SecureRandom;->nextBytes([B)V

    return-object p0
.end method

.method private static zzb()Ljava/security/SecureRandom;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzmr;->zza()Ljava/security/Provider;

    move-result-object v0

    const-string v1, "SHA1PRNG"

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {v1, v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/SecureRandom;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzmr;->zzb()Ljava/security/Provider;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-static {v1, v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/SecureRandom;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    :cond_1
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    return-object v0
.end method
