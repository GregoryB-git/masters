.class public abstract Lcom/google/android/gms/internal/measurement/k3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/L4;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract synthetic clone()Ljava/lang/Object;
.end method

.method public abstract g([BII)Lcom/google/android/gms/internal/measurement/k3;
.end method

.method public abstract j([BIILcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/k3;
.end method

.method public final synthetic m([B)Lcom/google/android/gms/internal/measurement/L4;
    .locals 2

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/google/android/gms/internal/measurement/k3;->g([BII)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic r([BLcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/L4;
    .locals 2

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0, p2}, Lcom/google/android/gms/internal/measurement/k3;->j([BIILcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object p1

    return-object p1
.end method
