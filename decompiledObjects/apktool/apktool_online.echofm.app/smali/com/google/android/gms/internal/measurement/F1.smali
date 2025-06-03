.class public final Lcom/google/android/gms/internal/measurement/F1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/E;

.field public final b:Lcom/google/android/gms/internal/measurement/f3;

.field public final c:Lcom/google/android/gms/internal/measurement/f3;

.field public final d:Lcom/google/android/gms/internal/measurement/X4;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/E;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/E;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/F1;->a:Lcom/google/android/gms/internal/measurement/E;

    new-instance v1, Lcom/google/android/gms/internal/measurement/f3;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/f3;-><init>(Lcom/google/android/gms/internal/measurement/f3;Lcom/google/android/gms/internal/measurement/E;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/F1;->c:Lcom/google/android/gms/internal/measurement/f3;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/f3;->d()Lcom/google/android/gms/internal/measurement/f3;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/F1;->b:Lcom/google/android/gms/internal/measurement/f3;

    new-instance v0, Lcom/google/android/gms/internal/measurement/X4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/X4;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/F1;->d:Lcom/google/android/gms/internal/measurement/X4;

    new-instance v2, Lcom/google/android/gms/internal/measurement/X7;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/X7;-><init>(Lcom/google/android/gms/internal/measurement/X4;)V

    const-string v3, "require"

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/measurement/f3;->h(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/s;)V

    const-string v2, "internal.platform"

    sget-object v3, Lcom/google/android/gms/internal/measurement/d1;->o:Lcom/google/android/gms/internal/measurement/d1;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/measurement/X4;->b(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    new-instance v0, Lcom/google/android/gms/internal/measurement/k;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/Double;)V

    const-string v2, "runtime.counter"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/f3;->h(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/s;)V

    return-void
.end method


# virtual methods
.method public final varargs a(Lcom/google/android/gms/internal/measurement/f3;[Lcom/google/android/gms/internal/measurement/r2;)Lcom/google/android/gms/internal/measurement/s;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/s;->d:Lcom/google/android/gms/internal/measurement/s;

    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v0, p2, v2

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/b4;->a(Lcom/google/android/gms/internal/measurement/r2;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/F1;->c:Lcom/google/android/gms/internal/measurement/f3;

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/C2;->b(Lcom/google/android/gms/internal/measurement/f3;)I

    instance-of v3, v0, Lcom/google/android/gms/internal/measurement/v;

    if-nez v3, :cond_0

    instance-of v3, v0, Lcom/google/android/gms/internal/measurement/t;

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/F1;->a:Lcom/google/android/gms/internal/measurement/E;

    invoke-virtual {v3, p1, v0}, Lcom/google/android/gms/internal/measurement/E;->a(Lcom/google/android/gms/internal/measurement/f3;Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/util/concurrent/Callable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/F1;->d:Lcom/google/android/gms/internal/measurement/X4;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/X4;->b(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    return-void
.end method
