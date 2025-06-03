.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzmw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:[I

.field private static final zzb:[I

.field private static final zzc:[I

.field private static final zzd:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xa

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb:[I

    const/4 v0, 0x2

    new-array v1, v0, [I

    fill-array-data v1, :array_2

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzc:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzd:[I

    return-void

    :array_0
    .array-data 4
        0x0
        0x3
        0x6
        0x9
        0xc
        0x10
        0x13
        0x16
        0x19
        0x1c
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x2
        0x3
        0x5
        0x6
        0x0
        0x1
        0x3
        0x4
        0x6
    .end array-data

    :array_2
    .array-data 4
        0x3ffffff
        0x1ffffff
    .end array-data

    :array_3
    .array-data 4
        0x1a
        0x19
    .end array-data
.end method

.method public static zza([J)V
    .locals 14

    const/16 v0, 0xa

    const-wide/16 v1, 0x0

    aput-wide v1, p0, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/16 v5, 0x1a

    const-wide/32 v6, 0x4000000

    if-ge v4, v0, :cond_0

    aget-wide v8, p0, v4

    div-long v6, v8, v6

    shl-long v10, v6, v5

    sub-long/2addr v8, v10

    aput-wide v8, p0, v4

    add-int/lit8 v5, v4, 0x1

    aget-wide v8, p0, v5

    add-long/2addr v8, v6

    aput-wide v8, p0, v5

    const-wide/32 v6, 0x2000000

    div-long v6, v8, v6

    const/16 v10, 0x19

    shl-long v10, v6, v10

    sub-long/2addr v8, v10

    aput-wide v8, p0, v5

    add-int/lit8 v4, v4, 0x2

    aget-wide v8, p0, v4

    add-long/2addr v8, v6

    aput-wide v8, p0, v4

    goto :goto_0

    :cond_0
    aget-wide v8, p0, v3

    aget-wide v10, p0, v0

    const/4 v4, 0x4

    shl-long v12, v10, v4

    add-long/2addr v8, v12

    aput-wide v8, p0, v3

    const/4 v4, 0x1

    shl-long v12, v10, v4

    add-long/2addr v8, v12

    aput-wide v8, p0, v3

    add-long/2addr v8, v10

    aput-wide v8, p0, v3

    aput-wide v1, p0, v0

    div-long v0, v8, v6

    shl-long v5, v0, v5

    sub-long/2addr v8, v5

    aput-wide v8, p0, v3

    aget-wide v2, p0, v4

    add-long/2addr v2, v0

    aput-wide v2, p0, v4

    return-void
.end method

.method public static zza([J[J)V
    .locals 11

    const/16 v0, 0xa

    new-array v1, v0, [J

    new-array v2, v0, [J

    new-array v3, v0, [J

    new-array v4, v0, [J

    new-array v5, v0, [J

    new-array v6, v0, [J

    new-array v7, v0, [J

    new-array v8, v0, [J

    new-array v9, v0, [J

    new-array v10, v0, [J

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v2, v9, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza([J[J[J)V

    invoke-static {v3, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza([J[J[J)V

    invoke-static {v9, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v4, v9, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza([J[J[J)V

    invoke-static {v9, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v5, v9, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza([J[J[J)V

    invoke-static {v9, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    const/4 p1, 0x2

    move v1, p1

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    invoke-static {v6, v10, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza([J[J[J)V

    invoke-static {v9, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    move v1, p1

    :goto_1
    const/16 v2, 0x14

    if-ge v1, v2, :cond_1

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_1

    :cond_1
    invoke-static {v9, v10, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza([J[J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    move v1, p1

    :goto_2
    if-ge v1, v0, :cond_2

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_2

    :cond_2
    invoke-static {v7, v9, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza([J[J[J)V

    invoke-static {v9, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    move v0, p1

    :goto_3
    const/16 v1, 0x32

    if-ge v0, v1, :cond_3

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_3

    :cond_3
    invoke-static {v8, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza([J[J[J)V

    invoke-static {v10, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    move v0, p1

    :goto_4
    const/16 v2, 0x64

    if-ge v0, v2, :cond_4

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_4

    :cond_4
    invoke-static {v10, v9, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza([J[J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    :goto_5
    if-ge p1, v1, :cond_5

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    add-int/lit8 p1, p1, 0x2

    goto :goto_5

    :cond_5
    invoke-static {v9, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza([J[J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J)V

    invoke-static {p0, v10, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza([J[J[J)V

    return-void
.end method

.method public static zza([J[JJ)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    aget-wide v1, p1, v0

    mul-long/2addr v1, p2

    aput-wide v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static zza([J[J[J)V
    .locals 1

    const/16 v0, 0x13

    new-array v0, v0, [J

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J[J[J)V

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zze([J[J)V

    return-void
.end method

.method public static zza([B)[J
    .locals 9

    const/16 v0, 0xa

    new-array v1, v0, [J

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza:[I

    aget v3, v3, v2

    aget-byte v4, p0, v3

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    add-int/lit8 v6, v3, 0x1

    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    int-to-long v6, v6

    const/16 v8, 0x8

    shl-long/2addr v6, v8

    or-long/2addr v4, v6

    add-int/lit8 v6, v3, 0x2

    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    int-to-long v6, v6

    const/16 v8, 0x10

    shl-long/2addr v6, v8

    or-long/2addr v4, v6

    add-int/lit8 v3, v3, 0x3

    aget-byte v3, p0, v3

    and-int/lit16 v3, v3, 0xff

    int-to-long v6, v3

    const/16 v3, 0x18

    shl-long/2addr v6, v3

    or-long v3, v4, v6

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb:[I

    aget v5, v5, v2

    shr-long/2addr v3, v5

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzc:[I

    and-int/lit8 v6, v2, 0x1

    aget v5, v5, v6

    int-to-long v5, v5

    and-long/2addr v3, v5

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static zzb([J)V
    .locals 9

    const/16 v0, 0x8

    aget-wide v1, p0, v0

    const/16 v3, 0x12

    aget-wide v3, p0, v3

    const/4 v5, 0x4

    shl-long v6, v3, v5

    add-long/2addr v1, v6

    aput-wide v1, p0, v0

    const/4 v6, 0x1

    shl-long v7, v3, v6

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x7

    aget-wide v1, p0, v0

    const/16 v3, 0x11

    aget-wide v3, p0, v3

    shl-long v7, v3, v5

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    shl-long v7, v3, v6

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x6

    aget-wide v1, p0, v0

    const/16 v3, 0x10

    aget-wide v3, p0, v3

    shl-long v7, v3, v5

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    shl-long v7, v3, v6

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x5

    aget-wide v1, p0, v0

    const/16 v3, 0xf

    aget-wide v3, p0, v3

    shl-long v7, v3, v5

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    shl-long v7, v3, v6

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    aget-wide v0, p0, v5

    const/16 v2, 0xe

    aget-wide v2, p0, v2

    shl-long v7, v2, v5

    add-long/2addr v0, v7

    aput-wide v0, p0, v5

    shl-long v7, v2, v6

    add-long/2addr v0, v7

    aput-wide v0, p0, v5

    add-long/2addr v0, v2

    aput-wide v0, p0, v5

    const/4 v0, 0x3

    aget-wide v1, p0, v0

    const/16 v3, 0xd

    aget-wide v3, p0, v3

    shl-long v7, v3, v5

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    shl-long v7, v3, v6

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x2

    aget-wide v1, p0, v0

    const/16 v3, 0xc

    aget-wide v3, p0, v3

    shl-long v7, v3, v5

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    shl-long v7, v3, v6

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    aget-wide v0, p0, v6

    const/16 v2, 0xb

    aget-wide v2, p0, v2

    shl-long v7, v2, v5

    add-long/2addr v0, v7

    aput-wide v0, p0, v6

    shl-long v7, v2, v6

    add-long/2addr v0, v7

    aput-wide v0, p0, v6

    add-long/2addr v0, v2

    aput-wide v0, p0, v6

    const/4 v0, 0x0

    aget-wide v1, p0, v0

    const/16 v3, 0xa

    aget-wide v3, p0, v3

    shl-long v7, v3, v5

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    shl-long v5, v3, v6

    add-long/2addr v1, v5

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    return-void
.end method

.method public static zzb([J[J)V
    .locals 31

    const/16 v0, 0x13

    new-array v0, v0, [J

    const/4 v1, 0x0

    aget-wide v2, p1, v1

    mul-long/2addr v2, v2

    aput-wide v2, v0, v1

    aget-wide v1, p1, v1

    const-wide/16 v3, 0x2

    mul-long v5, v1, v3

    const/4 v7, 0x1

    aget-wide v8, p1, v7

    mul-long/2addr v5, v8

    aput-wide v5, v0, v7

    aget-wide v5, p1, v7

    mul-long v7, v5, v5

    const/4 v9, 0x2

    aget-wide v10, p1, v9

    mul-long/2addr v10, v1

    add-long/2addr v10, v7

    mul-long/2addr v10, v3

    aput-wide v10, v0, v9

    aget-wide v7, p1, v9

    mul-long v9, v5, v7

    const/4 v11, 0x3

    aget-wide v12, p1, v11

    mul-long/2addr v12, v1

    add-long/2addr v12, v9

    mul-long/2addr v12, v3

    aput-wide v12, v0, v11

    mul-long v9, v7, v7

    const-wide/16 v12, 0x4

    mul-long v14, v5, v12

    aget-wide v16, p1, v11

    mul-long v14, v14, v16

    add-long/2addr v14, v9

    mul-long v9, v1, v3

    const/4 v11, 0x4

    aget-wide v18, p1, v11

    mul-long v9, v9, v18

    add-long/2addr v9, v14

    aput-wide v9, v0, v11

    mul-long v9, v7, v16

    aget-wide v14, p1, v11

    mul-long v18, v5, v14

    add-long v18, v18, v9

    const/4 v9, 0x5

    aget-wide v10, p1, v9

    mul-long/2addr v10, v1

    add-long v10, v10, v18

    mul-long/2addr v10, v3

    aput-wide v10, v0, v9

    mul-long v10, v16, v16

    mul-long v18, v7, v14

    add-long v18, v18, v10

    const/4 v10, 0x6

    aget-wide v20, p1, v10

    mul-long v20, v20, v1

    add-long v20, v20, v18

    mul-long v18, v5, v3

    aget-wide v22, p1, v9

    mul-long v18, v18, v22

    add-long v18, v18, v20

    mul-long v18, v18, v3

    aput-wide v18, v0, v10

    mul-long v18, v16, v14

    mul-long v20, v7, v22

    add-long v20, v20, v18

    aget-wide v9, p1, v10

    mul-long v18, v5, v9

    add-long v18, v18, v20

    const/4 v11, 0x7

    aget-wide v20, p1, v11

    mul-long v20, v20, v1

    add-long v20, v20, v18

    mul-long v20, v20, v3

    aput-wide v20, v0, v11

    mul-long v18, v14, v14

    mul-long v20, v7, v9

    const/16 v24, 0x8

    aget-wide v25, p1, v24

    mul-long v25, v25, v1

    add-long v25, v25, v20

    aget-wide v20, p1, v11

    mul-long v27, v5, v20

    mul-long v29, v16, v22

    add-long v29, v29, v27

    mul-long v29, v29, v3

    add-long v29, v29, v25

    mul-long v29, v29, v3

    add-long v29, v29, v18

    aput-wide v29, v0, v24

    mul-long v18, v14, v22

    mul-long v25, v16, v9

    add-long v25, v25, v18

    mul-long v18, v7, v20

    add-long v18, v18, v25

    aget-wide v24, p1, v24

    mul-long v26, v5, v24

    add-long v26, v26, v18

    const/16 v11, 0x9

    aget-wide v18, p1, v11

    mul-long v1, v1, v18

    add-long v1, v1, v26

    mul-long/2addr v1, v3

    aput-wide v1, v0, v11

    mul-long v1, v22, v22

    mul-long v18, v14, v9

    add-long v18, v18, v1

    mul-long v1, v7, v24

    add-long v1, v1, v18

    mul-long v18, v16, v20

    aget-wide v26, p1, v11

    mul-long v5, v5, v26

    add-long v5, v5, v18

    mul-long/2addr v5, v3

    add-long/2addr v5, v1

    mul-long/2addr v5, v3

    const/16 v1, 0xa

    aput-wide v5, v0, v1

    mul-long v1, v22, v9

    mul-long v5, v14, v20

    add-long/2addr v5, v1

    mul-long v1, v16, v24

    add-long/2addr v1, v5

    mul-long v7, v7, v26

    add-long/2addr v7, v1

    mul-long/2addr v7, v3

    const/16 v1, 0xb

    aput-wide v7, v0, v1

    mul-long v1, v9, v9

    mul-long v5, v14, v24

    mul-long v7, v22, v20

    mul-long v16, v16, v26

    add-long v16, v16, v7

    mul-long v16, v16, v3

    add-long v16, v16, v5

    mul-long v16, v16, v3

    add-long v16, v16, v1

    const/16 v1, 0xc

    aput-wide v16, v0, v1

    mul-long v1, v9, v20

    mul-long v5, v22, v24

    add-long/2addr v5, v1

    mul-long v14, v14, v26

    add-long/2addr v14, v5

    mul-long/2addr v14, v3

    const/16 v1, 0xd

    aput-wide v14, v0, v1

    mul-long v1, v20, v20

    mul-long v5, v9, v24

    add-long/2addr v5, v1

    mul-long v22, v22, v3

    mul-long v22, v22, v26

    add-long v22, v22, v5

    mul-long v22, v22, v3

    const/16 v1, 0xe

    aput-wide v22, v0, v1

    mul-long v1, v20, v24

    mul-long v9, v9, v26

    add-long/2addr v9, v1

    mul-long/2addr v9, v3

    const/16 v1, 0xf

    aput-wide v9, v0, v1

    mul-long v1, v24, v24

    mul-long v20, v20, v12

    mul-long v20, v20, v26

    add-long v20, v20, v1

    const/16 v1, 0x10

    aput-wide v20, v0, v1

    mul-long v24, v24, v3

    mul-long v24, v24, v26

    const/16 v1, 0x11

    aput-wide v24, v0, v1

    mul-long v3, v3, v26

    mul-long v3, v3, v26

    const/16 v1, 0x12

    aput-wide v3, v0, v1

    move-object/from16 v1, p0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zze([J[J)V

    return-void
.end method

.method public static zzb([J[J[J)V
    .locals 44

    const/4 v0, 0x0

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    mul-long/2addr v1, v3

    aput-wide v1, p0, v0

    aget-wide v1, p1, v0

    const/4 v3, 0x1

    aget-wide v4, p2, v3

    mul-long/2addr v4, v1

    aget-wide v6, p1, v3

    aget-wide v8, p2, v0

    mul-long/2addr v6, v8

    add-long/2addr v6, v4

    aput-wide v6, p0, v3

    aget-wide v4, p1, v3

    const-wide/16 v6, 0x2

    mul-long v10, v4, v6

    aget-wide v12, p2, v3

    mul-long/2addr v10, v12

    const/4 v0, 0x2

    aget-wide v14, p2, v0

    mul-long/2addr v14, v1

    add-long/2addr v14, v10

    aget-wide v10, p1, v0

    mul-long/2addr v10, v8

    add-long/2addr v10, v14

    aput-wide v10, p0, v0

    aget-wide v10, p2, v0

    mul-long v14, v4, v10

    aget-wide v16, p1, v0

    mul-long v18, v16, v12

    add-long v18, v18, v14

    const/4 v0, 0x3

    aget-wide v14, p2, v0

    mul-long/2addr v14, v1

    add-long v14, v14, v18

    aget-wide v18, p1, v0

    mul-long v18, v18, v8

    add-long v18, v18, v14

    aput-wide v18, p0, v0

    mul-long v14, v16, v10

    aget-wide v18, p2, v0

    mul-long v20, v4, v18

    aget-wide v22, p1, v0

    mul-long v24, v22, v12

    add-long v24, v24, v20

    mul-long v24, v24, v6

    add-long v24, v24, v14

    const/4 v0, 0x4

    aget-wide v14, p2, v0

    mul-long/2addr v14, v1

    add-long v14, v14, v24

    aget-wide v20, p1, v0

    mul-long v20, v20, v8

    add-long v20, v20, v14

    aput-wide v20, p0, v0

    mul-long v14, v16, v18

    mul-long v20, v22, v10

    add-long v20, v20, v14

    aget-wide v14, p2, v0

    mul-long v24, v4, v14

    add-long v24, v24, v20

    aget-wide v20, p1, v0

    mul-long v26, v20, v12

    add-long v26, v26, v24

    const/4 v0, 0x5

    aget-wide v24, p2, v0

    mul-long v24, v24, v1

    add-long v24, v24, v26

    aget-wide v26, p1, v0

    mul-long v26, v26, v8

    add-long v26, v26, v24

    aput-wide v26, p0, v0

    mul-long v24, v22, v18

    aget-wide v26, p2, v0

    mul-long v28, v4, v26

    add-long v28, v28, v24

    aget-wide v24, p1, v0

    mul-long v30, v24, v12

    add-long v30, v30, v28

    mul-long v30, v30, v6

    mul-long v28, v16, v14

    add-long v28, v28, v30

    mul-long v30, v20, v10

    add-long v30, v30, v28

    const/4 v0, 0x6

    aget-wide v28, p2, v0

    mul-long v28, v28, v1

    add-long v28, v28, v30

    aget-wide v30, p1, v0

    mul-long v30, v30, v8

    add-long v30, v30, v28

    aput-wide v30, p0, v0

    mul-long v28, v22, v14

    mul-long v30, v20, v18

    add-long v30, v30, v28

    mul-long v28, v16, v26

    add-long v28, v28, v30

    mul-long v30, v24, v10

    add-long v30, v30, v28

    aget-wide v28, p2, v0

    mul-long v32, v4, v28

    add-long v32, v32, v30

    aget-wide v30, p1, v0

    mul-long v34, v30, v12

    add-long v34, v34, v32

    const/4 v0, 0x7

    aget-wide v32, p2, v0

    mul-long v32, v32, v1

    add-long v32, v32, v34

    aget-wide v34, p1, v0

    mul-long v34, v34, v8

    add-long v34, v34, v32

    aput-wide v34, p0, v0

    mul-long v32, v20, v14

    mul-long v34, v22, v26

    mul-long v36, v24, v18

    add-long v36, v36, v34

    aget-wide v34, p2, v0

    mul-long v38, v4, v34

    add-long v38, v38, v36

    aget-wide v36, p1, v0

    mul-long v40, v36, v12

    add-long v40, v40, v38

    mul-long v40, v40, v6

    add-long v40, v40, v32

    mul-long v32, v16, v28

    add-long v32, v32, v40

    mul-long v38, v30, v10

    add-long v38, v38, v32

    const/16 v0, 0x8

    aget-wide v32, p2, v0

    mul-long v32, v32, v1

    add-long v32, v32, v38

    aget-wide v38, p1, v0

    mul-long v38, v38, v8

    add-long v38, v38, v32

    aput-wide v38, p0, v0

    mul-long v32, v20, v26

    mul-long v38, v24, v14

    add-long v38, v38, v32

    mul-long v32, v22, v28

    add-long v32, v32, v38

    mul-long v38, v30, v18

    add-long v38, v38, v32

    mul-long v32, v16, v34

    add-long v32, v32, v38

    mul-long v38, v36, v10

    add-long v38, v38, v32

    aget-wide v32, p2, v0

    mul-long v40, v4, v32

    add-long v40, v40, v38

    aget-wide v38, p1, v0

    mul-long v42, v38, v12

    add-long v42, v42, v40

    const/16 v0, 0x9

    aget-wide v40, p2, v0

    mul-long v1, v1, v40

    add-long v1, v1, v42

    aget-wide v40, p1, v0

    mul-long v40, v40, v8

    add-long v40, v40, v1

    aput-wide v40, p0, v0

    mul-long v1, v24, v26

    mul-long v8, v22, v34

    add-long/2addr v8, v1

    mul-long v1, v36, v18

    add-long/2addr v1, v8

    aget-wide v8, p2, v0

    mul-long/2addr v4, v8

    add-long/2addr v4, v1

    aget-wide v0, p1, v0

    mul-long/2addr v12, v0

    add-long/2addr v12, v4

    mul-long/2addr v12, v6

    mul-long v2, v20, v28

    add-long/2addr v2, v12

    mul-long v4, v30, v14

    add-long/2addr v4, v2

    mul-long v2, v16, v32

    add-long/2addr v2, v4

    mul-long v4, v38, v10

    add-long/2addr v4, v2

    const/16 v2, 0xa

    aput-wide v4, p0, v2

    mul-long v2, v24, v28

    mul-long v4, v30, v26

    add-long/2addr v4, v2

    mul-long v2, v20, v34

    add-long/2addr v2, v4

    mul-long v4, v36, v14

    add-long/2addr v4, v2

    mul-long v2, v22, v32

    add-long/2addr v2, v4

    mul-long v4, v38, v18

    add-long/2addr v4, v2

    mul-long v16, v16, v8

    add-long v16, v16, v4

    mul-long/2addr v10, v0

    add-long v10, v10, v16

    const/16 v2, 0xb

    aput-wide v10, p0, v2

    mul-long v2, v30, v28

    mul-long v4, v24, v34

    mul-long v10, v36, v26

    add-long/2addr v10, v4

    mul-long v22, v22, v8

    add-long v22, v22, v10

    mul-long v18, v18, v0

    add-long v18, v18, v22

    mul-long v18, v18, v6

    add-long v18, v18, v2

    mul-long v2, v20, v32

    add-long v2, v2, v18

    mul-long v4, v38, v14

    add-long/2addr v4, v2

    const/16 v2, 0xc

    aput-wide v4, p0, v2

    mul-long v2, v30, v34

    mul-long v4, v36, v28

    add-long/2addr v4, v2

    mul-long v2, v24, v32

    add-long/2addr v2, v4

    mul-long v4, v38, v26

    add-long/2addr v4, v2

    mul-long v20, v20, v8

    add-long v20, v20, v4

    mul-long/2addr v14, v0

    add-long v14, v14, v20

    const/16 v2, 0xd

    aput-wide v14, p0, v2

    mul-long v2, v36, v34

    mul-long v24, v24, v8

    add-long v24, v24, v2

    mul-long v26, v26, v0

    add-long v26, v26, v24

    mul-long v26, v26, v6

    mul-long v2, v30, v32

    add-long v2, v2, v26

    mul-long v4, v38, v28

    add-long/2addr v4, v2

    const/16 v2, 0xe

    aput-wide v4, p0, v2

    mul-long v2, v36, v32

    mul-long v4, v38, v34

    add-long/2addr v4, v2

    mul-long v30, v30, v8

    add-long v30, v30, v4

    mul-long v28, v28, v0

    add-long v28, v28, v30

    const/16 v2, 0xf

    aput-wide v28, p0, v2

    mul-long v2, v38, v32

    mul-long v36, v36, v8

    mul-long v34, v34, v0

    add-long v34, v34, v36

    mul-long v34, v34, v6

    add-long v34, v34, v2

    const/16 v2, 0x10

    aput-wide v34, p0, v2

    mul-long v38, v38, v8

    mul-long v32, v32, v0

    add-long v32, v32, v38

    const/16 v2, 0x11

    aput-wide v32, p0, v2

    mul-long/2addr v0, v6

    mul-long/2addr v0, v8

    const/16 v2, 0x12

    aput-wide v0, p0, v2

    return-void
.end method

.method public static zzc([J[J)V
    .locals 0

    invoke-static {p0, p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzc([J[J[J)V

    return-void
.end method

.method public static zzc([J[J[J)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    sub-long/2addr v1, v3

    aput-wide v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static zzc([J)[B
    .locals 16

    const/16 v0, 0xa

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const-wide/16 v4, 0x13

    const/16 v6, 0x19

    const/16 v7, 0x1f

    const/16 v8, 0x9

    const/4 v9, 0x2

    if-ge v3, v9, :cond_1

    move v9, v2

    :goto_1
    if-ge v9, v8, :cond_0

    aget-wide v10, v1, v9

    shr-long v12, v10, v7

    and-long/2addr v12, v10

    sget-object v14, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzd:[I

    and-int/lit8 v15, v9, 0x1

    aget v14, v14, v15

    shr-long/2addr v12, v14

    long-to-int v12, v12

    neg-int v12, v12

    shl-int v13, v12, v14

    int-to-long v13, v13

    add-long/2addr v10, v13

    aput-wide v10, v1, v9

    add-int/lit8 v9, v9, 0x1

    aget-wide v10, v1, v9

    int-to-long v12, v12

    sub-long/2addr v10, v12

    aput-wide v10, v1, v9

    goto :goto_1

    :cond_0
    aget-wide v9, v1, v8

    shr-long v11, v9, v7

    and-long/2addr v11, v9

    shr-long v6, v11, v6

    long-to-int v6, v6

    neg-int v6, v6

    shl-int/lit8 v7, v6, 0x19

    int-to-long v11, v7

    add-long/2addr v9, v11

    aput-wide v9, v1, v8

    aget-wide v7, v1, v2

    int-to-long v9, v6

    mul-long/2addr v9, v4

    sub-long/2addr v7, v9

    aput-wide v7, v1, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    aget-wide v10, v1, v2

    shr-long v12, v10, v7

    and-long/2addr v12, v10

    const/16 v3, 0x1a

    shr-long/2addr v12, v3

    long-to-int v3, v12

    neg-int v3, v3

    shl-int/lit8 v12, v3, 0x1a

    int-to-long v12, v12

    add-long/2addr v10, v12

    aput-wide v10, v1, v2

    const/4 v10, 0x1

    aget-wide v11, v1, v10

    int-to-long v13, v3

    sub-long/2addr v11, v13

    aput-wide v11, v1, v10

    move v3, v2

    :goto_2
    if-ge v3, v9, :cond_3

    move v11, v2

    :goto_3
    if-ge v11, v8, :cond_2

    aget-wide v12, v1, v11

    sget-object v14, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzd:[I

    and-int/lit8 v15, v11, 0x1

    aget v14, v14, v15

    shr-long v9, v12, v14

    long-to-int v9, v9

    sget-object v10, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzc:[I

    aget v10, v10, v15

    int-to-long v14, v10

    and-long/2addr v12, v14

    aput-wide v12, v1, v11

    add-int/lit8 v11, v11, 0x1

    aget-wide v12, v1, v11

    int-to-long v9, v9

    add-long/2addr v12, v9

    aput-wide v12, v1, v11

    const/4 v9, 0x2

    const/4 v10, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    const/4 v9, 0x2

    const/4 v10, 0x1

    goto :goto_2

    :cond_3
    aget-wide v9, v1, v8

    shr-long v11, v9, v6

    long-to-int v3, v11

    const-wide/32 v11, 0x1ffffff

    and-long/2addr v9, v11

    aput-wide v9, v1, v8

    aget-wide v8, v1, v2

    int-to-long v10, v3

    mul-long/2addr v10, v4

    add-long/2addr v10, v8

    aput-wide v10, v1, v2

    long-to-int v3, v10

    const v4, 0x3ffffed

    sub-int/2addr v3, v4

    shr-int/2addr v3, v7

    not-int v3, v3

    const/4 v5, 0x1

    :goto_4
    if-ge v5, v0, :cond_4

    aget-wide v8, v1, v5

    long-to-int v6, v8

    sget-object v8, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzc:[I

    and-int/lit8 v9, v5, 0x1

    aget v8, v8, v9

    xor-int/2addr v6, v8

    not-int v6, v6

    shl-int/lit8 v8, v6, 0x10

    and-int/2addr v6, v8

    shl-int/lit8 v8, v6, 0x8

    and-int/2addr v6, v8

    shl-int/lit8 v8, v6, 0x4

    and-int/2addr v6, v8

    shl-int/lit8 v8, v6, 0x2

    and-int/2addr v6, v8

    shl-int/lit8 v8, v6, 0x1

    and-int/2addr v6, v8

    shr-int/2addr v6, v7

    and-int/2addr v3, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_4
    aget-wide v5, v1, v2

    and-int/2addr v4, v3

    int-to-long v7, v4

    sub-long/2addr v5, v7

    aput-wide v5, v1, v2

    const/4 v4, 0x1

    aget-wide v5, v1, v4

    const v7, 0x1ffffff

    and-int/2addr v7, v3

    int-to-long v7, v7

    sub-long/2addr v5, v7

    aput-wide v5, v1, v4

    const/4 v9, 0x2

    :goto_5
    if-ge v9, v0, :cond_5

    aget-wide v4, v1, v9

    const v6, 0x3ffffff

    and-int/2addr v6, v3

    int-to-long v10, v6

    sub-long/2addr v4, v10

    aput-wide v4, v1, v9

    add-int/lit8 v4, v9, 0x1

    aget-wide v5, v1, v4

    sub-long/2addr v5, v7

    aput-wide v5, v1, v4

    add-int/lit8 v9, v9, 0x2

    goto :goto_5

    :cond_5
    move v3, v2

    :goto_6
    if-ge v3, v0, :cond_6

    aget-wide v4, v1, v3

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb:[I

    aget v6, v6, v3

    shl-long/2addr v4, v6

    aput-wide v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_6
    const/16 v3, 0x20

    new-array v3, v3, [B

    :goto_7
    if-ge v2, v0, :cond_7

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza:[I

    aget v4, v4, v2

    aget-byte v5, v3, v4

    int-to-long v5, v5

    aget-wide v7, v1, v2

    const-wide/16 v9, 0xff

    and-long v11, v7, v9

    or-long/2addr v5, v11

    long-to-int v5, v5

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    add-int/lit8 v5, v4, 0x1

    aget-byte v6, v3, v5

    int-to-long v11, v6

    const/16 v6, 0x8

    shr-long v13, v7, v6

    and-long/2addr v13, v9

    or-long/2addr v11, v13

    long-to-int v6, v11

    int-to-byte v6, v6

    aput-byte v6, v3, v5

    add-int/lit8 v5, v4, 0x2

    aget-byte v6, v3, v5

    int-to-long v11, v6

    const/16 v6, 0x10

    shr-long v13, v7, v6

    and-long/2addr v13, v9

    or-long/2addr v11, v13

    long-to-int v6, v11

    int-to-byte v6, v6

    aput-byte v6, v3, v5

    add-int/lit8 v4, v4, 0x3

    aget-byte v5, v3, v4

    int-to-long v5, v5

    const/16 v11, 0x18

    shr-long/2addr v7, v11

    and-long/2addr v7, v9

    or-long/2addr v5, v7

    long-to-int v5, v5

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_7
    return-object v3
.end method

.method public static zzd([J[J)V
    .locals 0

    invoke-static {p0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzd([J[J[J)V

    return-void
.end method

.method public static zzd([J[J[J)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static zze([J[J)V
    .locals 3

    array-length v0, p0

    const/16 v1, 0x13

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-array v0, v1, [J

    array-length v1, p0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p0, v0

    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zzb([J)V

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzmw;->zza([J)V

    const/16 v0, 0xa

    invoke-static {p0, v2, p1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
