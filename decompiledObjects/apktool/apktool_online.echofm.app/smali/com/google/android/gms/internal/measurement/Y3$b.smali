.class public abstract Lcom/google/android/gms/internal/measurement/Y3$b;
.super Lcom/google/android/gms/internal/measurement/k3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/Y3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field public final o:Lcom/google/android/gms/internal/measurement/Y3;

.field public p:Lcom/google/android/gms/internal/measurement/Y3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/Y3;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/k3;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->o:Lcom/google/android/gms/internal/measurement/Y3;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Y3;->F()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Y3;->y()Lcom/google/android/gms/internal/measurement/Y3;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static n(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/U4;->a()Lcom/google/android/gms/internal/measurement/U4;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/measurement/U4;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/Z4;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->o:Lcom/google/android/gms/internal/measurement/Y3;

    sget v1, Lcom/google/android/gms/internal/measurement/Y3$c;->e:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/Y3;->p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y3$b;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->i()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/Y3;

    iput-object v1, v0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    return-object v0
.end method

.method public final synthetic g([BII)Lcom/google/android/gms/internal/measurement/k3;
    .locals 1

    .line 1
    const/4 p2, 0x0

    sget-object v0, Lcom/google/android/gms/internal/measurement/M3;->c:Lcom/google/android/gms/internal/measurement/M3;

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/measurement/Y3$b;->u([BIILcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/Y3$b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic i()Lcom/google/android/gms/internal/measurement/I4;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->o()Lcom/google/android/gms/internal/measurement/Y3;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j([BIILcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/k3;
    .locals 0

    .line 1
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/measurement/Y3$b;->u([BIILcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/Y3$b;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lcom/google/android/gms/internal/measurement/Y3;)Lcom/google/android/gms/internal/measurement/Y3$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->o:Lcom/google/android/gms/internal/measurement/Y3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/Y3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->F()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->t()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/Y3$b;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public o()Lcom/google/android/gms/internal/measurement/Y3;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->F()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->C()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    return-object v0
.end method

.method public synthetic p()Lcom/google/android/gms/internal/measurement/I4;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->v()Lcom/google/android/gms/internal/measurement/Y3;

    move-result-object v0

    return-object v0
.end method

.method public final s()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->F()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->t()V

    :cond_0
    return-void
.end method

.method public t()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->o:Lcom/google/android/gms/internal/measurement/Y3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->y()Lcom/google/android/gms/internal/measurement/Y3;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/Y3$b;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    return-void
.end method

.method public final u([BIILcom/google/android/gms/internal/measurement/M3;)Lcom/google/android/gms/internal/measurement/Y3$b;
    .locals 7

    .line 1
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/Y3;->F()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->t()V

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/U4;->a()Lcom/google/android/gms/internal/measurement/U4;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/U4;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/Z4;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/Y3$b;->p:Lcom/google/android/gms/internal/measurement/Y3;

    new-instance v6, Lcom/google/android/gms/internal/measurement/p3;

    invoke-direct {v6, p4}, Lcom/google/android/gms/internal/measurement/p3;-><init>(Lcom/google/android/gms/internal/measurement/M3;)V

    const/4 v4, 0x0

    move-object v3, p1

    move v5, p3

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/Z4;->g(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/p3;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/k4; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Reading from byte array should not throw IOException."

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p1

    throw p1

    :goto_1
    throw p1
.end method

.method public final v()Lcom/google/android/gms/internal/measurement/Y3;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y3$b;->i()Lcom/google/android/gms/internal/measurement/I4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/Y3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->E()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/measurement/t5;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/t5;-><init>(Lcom/google/android/gms/internal/measurement/I4;)V

    throw v1
.end method
