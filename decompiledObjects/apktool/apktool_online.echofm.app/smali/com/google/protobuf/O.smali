.class public final Lcom/google/protobuf/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/Z;


# instance fields
.field public final a:Lcom/google/protobuf/K;

.field public final b:Lcom/google/protobuf/g0;

.field public final c:Z

.field public final d:Lcom/google/protobuf/l;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/g0;Lcom/google/protobuf/l;Lcom/google/protobuf/K;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/protobuf/O;->b:Lcom/google/protobuf/g0;

    invoke-virtual {p2, p3}, Lcom/google/protobuf/l;->d(Lcom/google/protobuf/K;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/protobuf/O;->c:Z

    iput-object p2, p0, Lcom/google/protobuf/O;->d:Lcom/google/protobuf/l;

    iput-object p3, p0, Lcom/google/protobuf/O;->a:Lcom/google/protobuf/K;

    return-void
.end method

.method private i(Lcom/google/protobuf/g0;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/google/protobuf/g0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/protobuf/g0;->c(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public static j(Lcom/google/protobuf/g0;Lcom/google/protobuf/l;Lcom/google/protobuf/K;)Lcom/google/protobuf/O;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/O;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/protobuf/O;-><init>(Lcom/google/protobuf/g0;Lcom/google/protobuf/l;Lcom/google/protobuf/K;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/O;->b:Lcom/google/protobuf/g0;

    invoke-static {v0, p1, p2}, Lcom/google/protobuf/b0;->E(Lcom/google/protobuf/g0;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/protobuf/O;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/O;->d:Lcom/google/protobuf/l;

    invoke-static {v0, p1, p2}, Lcom/google/protobuf/b0;->C(Lcom/google/protobuf/l;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/O;->b:Lcom/google/protobuf/g0;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/g0;->d(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/protobuf/O;->d:Lcom/google/protobuf/l;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/l;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/O;->d:Lcom/google/protobuf/l;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/l;->b(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/o;->k()Z

    move-result p1

    return p1
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/O;->b:Lcom/google/protobuf/g0;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/g0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/O;->b:Lcom/google/protobuf/g0;

    invoke-virtual {v1, p2}, Lcom/google/protobuf/g0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/protobuf/O;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/protobuf/O;->d:Lcom/google/protobuf/l;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/l;->b(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object p1

    iget-object v0, p0, Lcom/google/protobuf/O;->d:Lcom/google/protobuf/l;

    invoke-virtual {v0, p2}, Lcom/google/protobuf/l;->b(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/protobuf/o;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public e(Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/O;->b:Lcom/google/protobuf/g0;

    invoke-direct {p0, v0, p1}, Lcom/google/protobuf/O;->i(Lcom/google/protobuf/g0;Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lcom/google/protobuf/O;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/protobuf/O;->d:Lcom/google/protobuf/l;

    invoke-virtual {v1, p1}, Lcom/google/protobuf/l;->b(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/o;->f()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public f()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/O;->a:Lcom/google/protobuf/K;

    instance-of v1, v0, Lcom/google/protobuf/r;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/protobuf/r;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->P()Lcom/google/protobuf/r;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/protobuf/K;->d()Lcom/google/protobuf/K$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/protobuf/K$a;->c()Lcom/google/protobuf/K;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/O;->b:Lcom/google/protobuf/g0;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/g0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/protobuf/O;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/protobuf/O;->d:Lcom/google/protobuf/l;

    invoke-virtual {v1, p1}, Lcom/google/protobuf/l;->b(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object p1

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Lcom/google/protobuf/o;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public h(Ljava/lang/Object;Lcom/google/protobuf/n0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/O;->d:Lcom/google/protobuf/l;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/l;->b(Ljava/lang/Object;)Lcom/google/protobuf/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/o;->n()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/O;->b:Lcom/google/protobuf/g0;

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/protobuf/O;->k(Lcom/google/protobuf/g0;Ljava/lang/Object;Lcom/google/protobuf/n0;)V

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final k(Lcom/google/protobuf/g0;Ljava/lang/Object;Lcom/google/protobuf/n0;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/google/protobuf/g0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Lcom/google/protobuf/g0;->g(Ljava/lang/Object;Lcom/google/protobuf/n0;)V

    return-void
.end method
