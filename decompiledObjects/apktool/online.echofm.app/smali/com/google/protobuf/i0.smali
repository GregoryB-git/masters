.class public Lcom/google/protobuf/i0;
.super Lcom/google/protobuf/g0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/g0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/i0;->i(Ljava/lang/Object;)Lcom/google/protobuf/h0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/h0;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/i0;->j(Lcom/google/protobuf/h0;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/h0;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/i0;->k(Lcom/google/protobuf/h0;)I

    move-result p1

    return p1
.end method

.method public d(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/i0;->i(Ljava/lang/Object;)Lcom/google/protobuf/h0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/h0;->h()V

    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/h0;

    check-cast p2, Lcom/google/protobuf/h0;

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/i0;->l(Lcom/google/protobuf/h0;Lcom/google/protobuf/h0;)Lcom/google/protobuf/h0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/google/protobuf/h0;

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/i0;->m(Ljava/lang/Object;Lcom/google/protobuf/h0;)V

    return-void
.end method

.method public bridge synthetic g(Ljava/lang/Object;Lcom/google/protobuf/n0;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/h0;

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/i0;->n(Lcom/google/protobuf/h0;Lcom/google/protobuf/n0;)V

    return-void
.end method

.method public bridge synthetic h(Ljava/lang/Object;Lcom/google/protobuf/n0;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/h0;

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/i0;->o(Lcom/google/protobuf/h0;Lcom/google/protobuf/n0;)V

    return-void
.end method

.method public i(Ljava/lang/Object;)Lcom/google/protobuf/h0;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/r;

    iget-object p1, p1, Lcom/google/protobuf/r;->unknownFields:Lcom/google/protobuf/h0;

    return-object p1
.end method

.method public j(Lcom/google/protobuf/h0;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/h0;->d()I

    move-result p1

    return p1
.end method

.method public k(Lcom/google/protobuf/h0;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/h0;->e()I

    move-result p1

    return p1
.end method

.method public l(Lcom/google/protobuf/h0;Lcom/google/protobuf/h0;)Lcom/google/protobuf/h0;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/h0;->c()Lcom/google/protobuf/h0;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/protobuf/h0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/protobuf/h0;->c()Lcom/google/protobuf/h0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/h0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Lcom/google/protobuf/h0;->j(Lcom/google/protobuf/h0;Lcom/google/protobuf/h0;)Lcom/google/protobuf/h0;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1, p2}, Lcom/google/protobuf/h0;->i(Lcom/google/protobuf/h0;)Lcom/google/protobuf/h0;

    move-result-object p1

    return-object p1
.end method

.method public m(Ljava/lang/Object;Lcom/google/protobuf/h0;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/protobuf/r;

    iput-object p2, p1, Lcom/google/protobuf/r;->unknownFields:Lcom/google/protobuf/h0;

    return-void
.end method

.method public n(Lcom/google/protobuf/h0;Lcom/google/protobuf/n0;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/google/protobuf/h0;->n(Lcom/google/protobuf/n0;)V

    return-void
.end method

.method public o(Lcom/google/protobuf/h0;Lcom/google/protobuf/n0;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/google/protobuf/h0;->p(Lcom/google/protobuf/n0;)V

    return-void
.end method
