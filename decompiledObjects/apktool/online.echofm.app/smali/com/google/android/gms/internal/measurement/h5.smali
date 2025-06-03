.class public final Lcom/google/android/gms/internal/measurement/h5;
.super Lcom/google/android/gms/internal/measurement/p5;
.source "SourceFile"


# instance fields
.field public final synthetic p:Lcom/google/android/gms/internal/measurement/d5;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/d5;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/h5;->p:Lcom/google/android/gms/internal/measurement/d5;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/p5;-><init>(Lcom/google/android/gms/internal/measurement/d5;Lcom/google/android/gms/internal/measurement/o5;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/d5;Lcom/google/android/gms/internal/measurement/g5;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/h5;-><init>(Lcom/google/android/gms/internal/measurement/d5;)V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/f5;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/h5;->p:Lcom/google/android/gms/internal/measurement/d5;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/f5;-><init>(Lcom/google/android/gms/internal/measurement/d5;Lcom/google/android/gms/internal/measurement/e5;)V

    return-object v0
.end method
