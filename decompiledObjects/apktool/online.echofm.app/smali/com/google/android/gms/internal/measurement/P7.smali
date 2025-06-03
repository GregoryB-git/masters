.class public final Lcom/google/android/gms/internal/measurement/P7;
.super Lcom/google/android/gms/internal/measurement/n;
.source "SourceFile"


# instance fields
.field public final q:Lcom/google/android/gms/internal/measurement/T7;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/T7;)V
    .locals 5

    const-string v0, "internal.logger"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/n;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/P7;->q:Lcom/google/android/gms/internal/measurement/T7;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/n;->p:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/internal/measurement/S7;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/measurement/S7;-><init>(Lcom/google/android/gms/internal/measurement/P7;ZZ)V

    const-string v3, "log"

    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/n;->p:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/internal/measurement/A7;

    const-string v4, "silent"

    invoke-direct {v0, p0, v4}, Lcom/google/android/gms/internal/measurement/A7;-><init>(Lcom/google/android/gms/internal/measurement/P7;Ljava/lang/String;)V

    invoke-interface {p1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/n;->p:Ljava/util/Map;

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    new-instance v0, Lcom/google/android/gms/internal/measurement/S7;

    invoke-direct {v0, p0, v2, v2}, Lcom/google/android/gms/internal/measurement/S7;-><init>(Lcom/google/android/gms/internal/measurement/P7;ZZ)V

    invoke-virtual {p1, v3, v0}, Lcom/google/android/gms/internal/measurement/n;->a(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/s;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/n;->p:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/internal/measurement/R7;

    const-string v2, "unmonitored"

    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/internal/measurement/R7;-><init>(Lcom/google/android/gms/internal/measurement/P7;Ljava/lang/String;)V

    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/n;->p:Ljava/util/Map;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    new-instance v0, Lcom/google/android/gms/internal/measurement/S7;

    invoke-direct {v0, p0, v1, v1}, Lcom/google/android/gms/internal/measurement/S7;-><init>(Lcom/google/android/gms/internal/measurement/P7;ZZ)V

    invoke-virtual {p1, v3, v0}, Lcom/google/android/gms/internal/measurement/n;->a(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/s;)V

    return-void
.end method

.method public static bridge synthetic h(Lcom/google/android/gms/internal/measurement/P7;)Lcom/google/android/gms/internal/measurement/T7;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/P7;->q:Lcom/google/android/gms/internal/measurement/T7;

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/measurement/f3;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/s;
    .locals 0

    .line 1
    sget-object p1, Lcom/google/android/gms/internal/measurement/s;->d:Lcom/google/android/gms/internal/measurement/s;

    return-object p1
.end method
