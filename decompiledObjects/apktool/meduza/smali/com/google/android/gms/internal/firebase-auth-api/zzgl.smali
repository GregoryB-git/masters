.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzgl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljavax/crypto/Cipher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzgo;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgl;->zza:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public static zza([B)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzgl;->zza([BII)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p0

    return-object p0
.end method

.method public static zza([BII)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzpy;->zzb()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x13

    if-gt v0, v1, :cond_0

    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v0, p0, p1, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([BII)V

    return-object v0

    :cond_0
    new-instance v0, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v1, 0x80

    invoke-direct {v0, v1, p0, p1, p2}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    return-object v0
.end method

.method public static zza()Ljavax/crypto/Cipher;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgl;->zza:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Cipher;

    return-object v0
.end method

.method public static zzb([B)Ljavax/crypto/SecretKey;
    .locals 2

    array-length v0, p0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzzi;->zza(I)V

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v0
.end method
