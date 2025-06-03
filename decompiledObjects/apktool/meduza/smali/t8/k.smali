.class public final Lt8/k;
.super Lt8/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lt8/c<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public a:Lt8/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/h<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt8/h;Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/h<",
            "TK;TV;>;",
            "Ljava/util/Comparator<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lt8/c;-><init>()V

    iput-object p1, p0, Lt8/k;->a:Lt8/h;

    iput-object p2, p0, Lt8/k;->b:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lt8/k;->q(Ljava/lang/Object;)Lt8/h;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lt8/k;->q(Ljava/lang/Object;)Lt8/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lt8/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final i()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lt8/k;->b:Ljava/util/Comparator;

    return-object v0
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lt8/k;->a:Lt8/h;

    invoke-interface {v0}, Lt8/h;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lt8/d;

    iget-object v1, p0, Lt8/k;->a:Lt8/h;

    iget-object v2, p0, Lt8/k;->b:Ljava/util/Comparator;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lt8/d;-><init>(Lt8/h;Ljava/lang/Object;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public final k()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Lt8/k;->a:Lt8/h;

    invoke-interface {v0}, Lt8/h;->h()Lt8/h;

    move-result-object v0

    invoke-interface {v0}, Lt8/h;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final l()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Lt8/k;->a:Lt8/h;

    invoke-interface {v0}, Lt8/h;->g()Lt8/h;

    move-result-object v0

    invoke-interface {v0}, Lt8/h;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final m(Lj9/g;)I
    .locals 4

    iget-object v0, p0, Lt8/k;->a:Lt8/h;

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Lt8/h;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lt8/k;->b:Ljava/util/Comparator;

    invoke-interface {v0}, Lt8/h;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, p1, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0}, Lt8/h;->a()Lt8/h;

    move-result-object p1

    invoke-interface {p1}, Lt8/h;->size()I

    move-result p1

    add-int/2addr p1, v1

    return p1

    :cond_0
    if-gez v2, :cond_1

    invoke-interface {v0}, Lt8/h;->a()Lt8/h;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Lt8/h;->a()Lt8/h;

    move-result-object v2

    invoke-interface {v2}, Lt8/h;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v1, v2

    invoke-interface {v0}, Lt8/h;->f()Lt8/h;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;)Lt8/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lt8/c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lt8/k;->a:Lt8/h;

    iget-object v1, p0, Lt8/k;->b:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2, v1}, Lt8/h;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lt8/h;

    move-result-object p1

    sget-object p2, Lt8/h$a;->b:Lt8/h$a;

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0, v0}, Lt8/h;->d(Lt8/h$a;Lt8/j;Lt8/j;)Lt8/h;

    move-result-object p1

    new-instance p2, Lt8/k;

    iget-object v0, p0, Lt8/k;->b:Ljava/util/Comparator;

    invoke-direct {p2, p1, v0}, Lt8/k;-><init>(Lt8/h;Ljava/util/Comparator;)V

    return-object p2
.end method

.method public final o(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lt8/d;

    iget-object v1, p0, Lt8/k;->a:Lt8/h;

    iget-object v2, p0, Lt8/k;->b:Ljava/util/Comparator;

    invoke-direct {v0, v1, p1, v2}, Lt8/d;-><init>(Lt8/h;Ljava/lang/Object;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public final p(Ljava/lang/Object;)Lt8/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lt8/c<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lt8/k;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lt8/k;->a:Lt8/h;

    iget-object v1, p0, Lt8/k;->b:Ljava/util/Comparator;

    invoke-interface {v0, p1, v1}, Lt8/h;->c(Ljava/lang/Object;Ljava/util/Comparator;)Lt8/h;

    move-result-object p1

    sget-object v0, Lt8/h$a;->b:Lt8/h$a;

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1, v1}, Lt8/h;->d(Lt8/h$a;Lt8/j;Lt8/j;)Lt8/h;

    move-result-object p1

    new-instance v0, Lt8/k;

    iget-object v1, p0, Lt8/k;->b:Ljava/util/Comparator;

    invoke-direct {v0, p1, v1}, Lt8/k;-><init>(Lt8/h;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Lt8/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lt8/h<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lt8/k;->a:Lt8/h;

    :goto_0
    invoke-interface {v0}, Lt8/h;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lt8/k;->b:Ljava/util/Comparator;

    invoke-interface {v0}, Lt8/h;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-gez v1, :cond_0

    invoke-interface {v0}, Lt8/h;->a()Lt8/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    return-object v0

    :cond_1
    invoke-interface {v0}, Lt8/h;->f()Lt8/h;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lt8/k;->a:Lt8/h;

    invoke-interface {v0}, Lt8/h;->size()I

    move-result v0

    return v0
.end method
