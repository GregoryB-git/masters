.class public final Lcom/google/android/recaptcha/internal/zzkk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static zza(JJ)J
    .locals 10

    xor-long v0, p0, p2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    const/4 v4, 0x0

    if-gez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    add-long v6, p0, p2

    xor-long v8, p0, v6

    cmp-long v2, v8, v2

    if-ltz v2, :cond_1

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    or-int/2addr v0, v1

    const-string v1, "checkedAdd"

    move-wide v2, p0

    move-wide v4, p2

    invoke-static/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzkl;->zza(ZLjava/lang/String;JJ)V

    return-wide v6
.end method

.method public static zzb(JJ)J
    .locals 11

    const-wide/16 p2, 0x1

    xor-long/2addr p2, p0

    const-wide/16 v0, 0x0

    cmp-long p2, p2, v0

    const/4 p3, 0x1

    const/4 v2, 0x0

    if-ltz p2, :cond_0

    move p2, p3

    goto :goto_0

    :cond_0
    move p2, v2

    :goto_0
    const-wide/16 v3, -0x1

    add-long/2addr v3, p0

    xor-long v5, p0, v3

    cmp-long v0, v5, v0

    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    move p3, v2

    :goto_1
    or-int v5, p2, p3

    const-wide/16 v9, 0x1

    const-string v6, "checkedSubtract"

    move-wide v7, p0

    invoke-static/range {v5 .. v10}, Lcom/google/android/recaptcha/internal/zzkl;->zza(ZLjava/lang/String;JJ)V

    return-wide v3
.end method
