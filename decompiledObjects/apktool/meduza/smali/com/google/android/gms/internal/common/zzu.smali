.class public final Lcom/google/android/gms/internal/common/zzu;
.super Lcom/google/android/gms/internal/common/zzs;
.source "SourceFile"


# annotations
.annotation runtime Lorg/jspecify/annotations/NullMarked;
.end annotation


# direct methods
.method public static zza(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_2

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    move v0, v1

    :cond_2
    return v0
.end method
