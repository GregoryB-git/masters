.class public abstract Lcom/google/android/gms/internal/measurement/F5;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(I[BII)I
.end method

.method public abstract b(Ljava/lang/CharSequence;[BII)I
.end method

.method public abstract c([BII)Ljava/lang/String;
.end method

.method public final d([BII)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/F5;->a(I[BII)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method
