.class public final Lcom/google/android/gms/internal/measurement/w5;
.super Lcom/google/android/gms/internal/measurement/n;
.source "SourceFile"


# instance fields
.field public final q:Lcom/google/android/gms/internal/measurement/y6;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/y6;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/n;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/w5;->q:Lcom/google/android/gms/internal/measurement/y6;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/n;->p:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/internal/measurement/Z6;

    const-string v1, "getValue"

    invoke-direct {v0, p0, v1, p2}, Lcom/google/android/gms/internal/measurement/Z6;-><init>(Lcom/google/android/gms/internal/measurement/w5;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/y6;)V

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/measurement/f3;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/s;
    .locals 0

    .line 1
    sget-object p1, Lcom/google/android/gms/internal/measurement/s;->d:Lcom/google/android/gms/internal/measurement/s;

    return-object p1
.end method
