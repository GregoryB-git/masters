.class public Lcom/google/crypto/tink/shaded/protobuf/m0;
.super Lcom/google/crypto/tink/shaded/protobuf/k0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/k0;-><init>()V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/l0;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/x;

    iget-object p1, p1, Lcom/google/crypto/tink/shaded/protobuf/x;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/l0;

    return-object p1
.end method

.method public B(Lcom/google/crypto/tink/shaded/protobuf/l0;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/l0;->d()I

    move-result p1

    return p1
.end method

.method public C(Lcom/google/crypto/tink/shaded/protobuf/l0;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/l0;->e()I

    move-result p1

    return p1
.end method

.method public D(Lcom/google/crypto/tink/shaded/protobuf/l0;Lcom/google/crypto/tink/shaded/protobuf/l0;)Lcom/google/crypto/tink/shaded/protobuf/l0;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/l0;->c()Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/l0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/l0;->c()Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/l0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/l0;->j(Lcom/google/crypto/tink/shaded/protobuf/l0;Lcom/google/crypto/tink/shaded/protobuf/l0;)Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/l0;->i(Lcom/google/crypto/tink/shaded/protobuf/l0;)Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object p1

    return-object p1
.end method

.method public E()Lcom/google/crypto/tink/shaded/protobuf/l0;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/l0;->k()Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object v0

    return-object v0
.end method

.method public F(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/l0;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/m0;->G(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/l0;)V

    return-void
.end method

.method public G(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/l0;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/x;

    iput-object p2, p1, Lcom/google/crypto/tink/shaded/protobuf/x;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/l0;

    return-void
.end method

.method public H(Lcom/google/crypto/tink/shaded/protobuf/l0;)Lcom/google/crypto/tink/shaded/protobuf/l0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/l0;->h()V

    return-object p1
.end method

.method public I(Lcom/google/crypto/tink/shaded/protobuf/l0;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/l0;->p(Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-void
.end method

.method public J(Lcom/google/crypto/tink/shaded/protobuf/l0;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/l0;->r(Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;II)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/m0;->u(Lcom/google/crypto/tink/shaded/protobuf/l0;II)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;IJ)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/m0;->v(Lcom/google/crypto/tink/shaded/protobuf/l0;IJ)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l0;

    check-cast p3, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/m0;->w(Lcom/google/crypto/tink/shaded/protobuf/l0;ILcom/google/crypto/tink/shaded/protobuf/l0;)V

    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/m0;->x(Lcom/google/crypto/tink/shaded/protobuf/l0;ILcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;IJ)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/m0;->y(Lcom/google/crypto/tink/shaded/protobuf/l0;IJ)V

    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/m0;->z(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/m0;->A(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/m0;->B(Lcom/google/crypto/tink/shaded/protobuf/l0;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/m0;->C(Lcom/google/crypto/tink/shaded/protobuf/l0;)I

    move-result p1

    return p1
.end method

.method public j(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/m0;->A(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/l0;->h()V

    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l0;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/m0;->D(Lcom/google/crypto/tink/shaded/protobuf/l0;Lcom/google/crypto/tink/shaded/protobuf/l0;)Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/m0;->E()Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/m0;->F(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/l0;)V

    return-void
.end method

.method public bridge synthetic p(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/m0;->G(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/l0;)V

    return-void
.end method

.method public q(Lcom/google/crypto/tink/shaded/protobuf/d0;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/m0;->H(Lcom/google/crypto/tink/shaded/protobuf/l0;)Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/m0;->I(Lcom/google/crypto/tink/shaded/protobuf/l0;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-void
.end method

.method public bridge synthetic t(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l0;

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/m0;->J(Lcom/google/crypto/tink/shaded/protobuf/l0;Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-void
.end method

.method public u(Lcom/google/crypto/tink/shaded/protobuf/l0;II)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    invoke-static {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->c(II)I

    move-result p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l0;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public v(Lcom/google/crypto/tink/shaded/protobuf/l0;IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->c(II)I

    move-result p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l0;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public w(Lcom/google/crypto/tink/shaded/protobuf/l0;ILcom/google/crypto/tink/shaded/protobuf/l0;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    invoke-static {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->c(II)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l0;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public x(Lcom/google/crypto/tink/shaded/protobuf/l0;ILcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    invoke-static {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->c(II)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l0;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public y(Lcom/google/crypto/tink/shaded/protobuf/l0;IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->c(II)I

    move-result p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l0;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public z(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/l0;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/m0;->A(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/l0;->c()Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/l0;->k()Lcom/google/crypto/tink/shaded/protobuf/l0;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/m0;->G(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/l0;)V

    :cond_0
    return-object v0
.end method
