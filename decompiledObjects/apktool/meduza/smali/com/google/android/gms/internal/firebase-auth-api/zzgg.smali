.class final synthetic Lcom/google/android/gms/internal/firebase-auth-api/zzgg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:[I

.field public static final synthetic zzb:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzvc;->values()[Lcom/google/android/gms/internal/firebase-auth-api/zzvc;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;->zzb:[I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzvc;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzvc;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x2

    :try_start_1
    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;->zzb:[I

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzvc;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzvc;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v0, v2, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v2, 0x3

    :try_start_2
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;->zzb:[I

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzvc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzvc;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v3, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    const/4 v3, 0x4

    :try_start_3
    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;->zzb:[I

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzvc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzvc;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v3, v4, v5
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;->zzb:[I

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzvc;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzvc;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v6, 0x5

    aput v6, v4, v5
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzxd;->values()[Lcom/google/android/gms/internal/firebase-auth-api/zzxd;

    move-result-object v4

    array-length v4, v4

    new-array v4, v4, [I

    sput-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;->zza:[I

    :try_start_5
    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzxd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzxd;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v1, v4, v5
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;->zza:[I

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzxd;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzxd;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v0, v1, v4
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;->zza:[I

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzxd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzxd;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;->zza:[I

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzxd;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzxd;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    return-void
.end method
