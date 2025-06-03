.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzbc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static zza(JJ)J
    .locals 10

    add-long v0, p0, p2

    xor-long v2, p0, p2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x1

    const/4 v6, 0x0

    if-gez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v6

    :goto_0
    xor-long v7, p0, v0

    cmp-long v4, v7, v4

    if-ltz v4, :cond_1

    goto :goto_1

    :cond_1
    move v3, v6

    :goto_1
    or-int v4, v2, v3

    const-string v5, "checkedAdd"

    move-wide v6, p0

    move-wide v8, p2

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzbb;->zza(ZLjava/lang/String;JJ)V

    return-wide v0
.end method

.method public static zzb(JJ)J
    .locals 8

    const-wide/16 p2, 0x1

    sub-long v0, p0, p2

    xor-long/2addr p2, p0

    const-wide/16 v2, 0x0

    cmp-long p2, p2, v2

    const/4 p3, 0x1

    const/4 v4, 0x0

    if-ltz p2, :cond_0

    move p2, p3

    goto :goto_0

    :cond_0
    move p2, v4

    :goto_0
    xor-long v5, p0, v0

    cmp-long v2, v5, v2

    if-ltz v2, :cond_1

    goto :goto_1

    :cond_1
    move p3, v4

    :goto_1
    or-int v2, p2, p3

    const-wide/16 v6, 0x1

    const-string v3, "checkedSubtract"

    move-wide v4, p0

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzbb;->zza(ZLjava/lang/String;JJ)V

    return-wide v0
.end method
