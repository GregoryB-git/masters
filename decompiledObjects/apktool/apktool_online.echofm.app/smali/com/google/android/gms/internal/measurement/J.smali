.class public final Lcom/google/android/gms/internal/measurement/J;
.super Lcom/google/android/gms/internal/measurement/A;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/A;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/A;->a:Ljava/util/List;

    sget-object v1, Lcom/google/android/gms/internal/measurement/Z;->q:Lcom/google/android/gms/internal/measurement/Z;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/A;->a:Ljava/util/List;

    sget-object v1, Lcom/google/android/gms/internal/measurement/Z;->k0:Lcom/google/android/gms/internal/measurement/Z;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/A;->a:Ljava/util/List;

    sget-object v1, Lcom/google/android/gms/internal/measurement/Z;->n0:Lcom/google/android/gms/internal/measurement/Z;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/f3;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/s;
    .locals 5

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/M;->a:[I

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/C2;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/Z;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_2

    const/4 v4, 0x3

    if-eq v0, v4, :cond_0

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/A;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/Z;->n0:Lcom/google/android/gms/internal/measurement/Z;

    invoke-static {p1, v2, p3}, Lcom/google/android/gms/internal/measurement/C2;->f(Lcom/google/android/gms/internal/measurement/Z;ILjava/util/List;)V

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/s;->d()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/Z;->k0:Lcom/google/android/gms/internal/measurement/Z;

    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/C2;->f(Lcom/google/android/gms/internal/measurement/Z;ILjava/util/List;)V

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/measurement/h;

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/s;->d()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/2addr p1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/measurement/h;-><init>(Ljava/lang/Boolean;)V

    return-object p2

    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/measurement/Z;->q:Lcom/google/android/gms/internal/measurement/Z;

    invoke-static {p1, v2, p3}, Lcom/google/android/gms/internal/measurement/C2;->f(Lcom/google/android/gms/internal/measurement/Z;ILjava/util/List;)V

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/f3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/s;->d()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    return-object p1
.end method
