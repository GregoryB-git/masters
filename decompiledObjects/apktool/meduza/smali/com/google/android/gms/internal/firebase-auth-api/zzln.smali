.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzln;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzbj;


# static fields
.field private static final zza:[B


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzlr;

.field private final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzlo;

.field private final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzlp;

.field private final zze:Lcom/google/android/gms/internal/firebase-auth-api/zzll;

.field private final zzf:I

.field private final zzg:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zza:[B

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzlr;Lcom/google/android/gms/internal/firebase-auth-api/zzlo;Lcom/google/android/gms/internal/firebase-auth-api/zzlp;Lcom/google/android/gms/internal/firebase-auth-api/zzll;ILcom/google/android/gms/internal/firebase-auth-api/zzzn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzlr;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzlo;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzlp;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzll;

    iput p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zzf:I

    invoke-virtual {p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzzn;->zzb()[B

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zzg:[B

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx;)Lcom/google/android/gms/internal/firebase-auth-api/zzbj;
    .locals 9

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzlm;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzlo;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzju$zze;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzlm;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzju$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzlp;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzju$zza;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzlm;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzju$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzll;

    move-result-object v6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "Unrecognized HPKE KEM identifier"

    if-eqz v2, :cond_0

    const/16 v0, 0x20

    :goto_0
    move v7, v0

    goto :goto_1

    :cond_0
    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v0, 0x41

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v0, 0x61

    goto :goto_0

    :cond_2
    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x85

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzju$zzd;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzzo;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzbl;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzcm;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzo;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcm;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzzn;->zza([B)Lcom/google/android/gms/internal/firebase-auth-api/zzzn;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/zzlr;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzbo;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/zzkv;

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/zzkf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzkf;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzzn;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzlr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzzn;Lcom/google/android/gms/internal/firebase-auth-api/zzzn;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzks;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzzn;

    move-result-object v8

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzln;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzlr;Lcom/google/android/gms/internal/firebase-auth-api/zzlo;Lcom/google/android/gms/internal/firebase-auth-api/zzlp;Lcom/google/android/gms/internal/firebase-auth-api/zzll;ILcom/google/android/gms/internal/firebase-auth-api/zzzn;)V

    return-object v0

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final zza([B[B)[B
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zzg:[B

    array-length v1, v0

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zzf:I

    add-int/2addr v1, v2

    array-length v2, p1

    if-lt v2, v1, :cond_2

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpy;->zza([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    new-array p2, p2, [B

    :cond_0
    move-object v7, p2

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zzg:[B

    array-length p2, p2

    invoke-static {p1, p2, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzlr;

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzlo;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzlp;

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzll;

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zza([BLcom/google/android/gms/internal/firebase-auth-api/zzlr;Lcom/google/android/gms/internal/firebase-auth-api/zzlo;Lcom/google/android/gms/internal/firebase-auth-api/zzlp;Lcom/google/android/gms/internal/firebase-auth-api/zzll;[B)Lcom/google/android/gms/internal/firebase-auth-api/zzlk;

    move-result-object p2

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzln;->zza:[B

    invoke-virtual {p2, p1, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;->zza([BI[B)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid ciphertext (output prefix mismatch)"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Ciphertext is too short."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
