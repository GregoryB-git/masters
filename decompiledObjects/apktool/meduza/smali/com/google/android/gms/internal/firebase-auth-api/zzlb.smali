.class final Lcom/google/android/gms/internal/firebase-auth-api/zzlb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzla;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzit;

.field private final zzb:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzit;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzit;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzit;->zzb()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlb;->zzb:I

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlb;->zzb:I

    return v0
.end method

.method public final zza([B[BI)[B
    .locals 1

    array-length v0, p2

    if-lt v0, p3, :cond_0

    array-length v0, p2

    invoke-static {p2, p3, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzio;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzio$zza;

    move-result-object p3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzlb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzit;

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzio$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzit;)Lcom/google/android/gms/internal/firebase-auth-api/zzio$zza;

    move-result-object p3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzbl;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzcm;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzzo;->zza([BLcom/google/android/gms/internal/firebase-auth-api/zzcm;)Lcom/google/android/gms/internal/firebase-auth-api/zzzo;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzio$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzzo;)Lcom/google/android/gms/internal/firebase-auth-api/zzio$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzio$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzio;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzya;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzio;)Lcom/google/android/gms/internal/firebase-auth-api/zzbk;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzkw;->zza()[B

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzbk;->zza([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
