.class public Landroidx/datastore/preferences/protobuf/n0;
.super Landroidx/datastore/preferences/protobuf/l0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/l0;-><init>()V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/m0;
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/w;

    iget-object p1, p1, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/m0;

    return-object p1
.end method

.method public B(Landroidx/datastore/preferences/protobuf/m0;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/m0;->f()I

    move-result p1

    return p1
.end method

.method public C(Landroidx/datastore/preferences/protobuf/m0;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/m0;->g()I

    move-result p1

    return p1
.end method

.method public D(Landroidx/datastore/preferences/protobuf/m0;Landroidx/datastore/preferences/protobuf/m0;)Landroidx/datastore/preferences/protobuf/m0;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/m0;->e()Landroidx/datastore/preferences/protobuf/m0;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/m0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Landroidx/datastore/preferences/protobuf/m0;->k(Landroidx/datastore/preferences/protobuf/m0;Landroidx/datastore/preferences/protobuf/m0;)Landroidx/datastore/preferences/protobuf/m0;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public E()Landroidx/datastore/preferences/protobuf/m0;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/m0;->l()Landroidx/datastore/preferences/protobuf/m0;

    move-result-object v0

    return-object v0
.end method

.method public F(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/m0;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/n0;->G(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/m0;)V

    return-void
.end method

.method public G(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/m0;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/w;

    iput-object p2, p1, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/m0;

    return-void
.end method

.method public H(Landroidx/datastore/preferences/protobuf/m0;)Landroidx/datastore/preferences/protobuf/m0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/m0;->j()V

    return-object p1
.end method

.method public I(Landroidx/datastore/preferences/protobuf/m0;Landroidx/datastore/preferences/protobuf/s0;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/m0;->o(Landroidx/datastore/preferences/protobuf/s0;)V

    return-void
.end method

.method public J(Landroidx/datastore/preferences/protobuf/m0;Landroidx/datastore/preferences/protobuf/s0;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/m0;->q(Landroidx/datastore/preferences/protobuf/s0;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;II)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/n0;->u(Landroidx/datastore/preferences/protobuf/m0;II)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;IJ)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/datastore/preferences/protobuf/n0;->v(Landroidx/datastore/preferences/protobuf/m0;IJ)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/m0;

    check-cast p3, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/n0;->w(Landroidx/datastore/preferences/protobuf/m0;ILandroidx/datastore/preferences/protobuf/m0;)V

    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;ILandroidx/datastore/preferences/protobuf/g;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/n0;->x(Landroidx/datastore/preferences/protobuf/m0;ILandroidx/datastore/preferences/protobuf/g;)V

    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;IJ)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/datastore/preferences/protobuf/n0;->y(Landroidx/datastore/preferences/protobuf/m0;IJ)V

    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n0;->z(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n0;->A(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n0;->B(Landroidx/datastore/preferences/protobuf/m0;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n0;->C(Landroidx/datastore/preferences/protobuf/m0;)I

    move-result p1

    return p1
.end method

.method public j(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n0;->A(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/m0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/m0;->j()V

    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/m0;

    check-cast p2, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/n0;->D(Landroidx/datastore/preferences/protobuf/m0;Landroidx/datastore/preferences/protobuf/m0;)Landroidx/datastore/preferences/protobuf/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/n0;->E()Landroidx/datastore/preferences/protobuf/m0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/n0;->F(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/m0;)V

    return-void
.end method

.method public bridge synthetic p(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/n0;->G(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/m0;)V

    return-void
.end method

.method public q(Landroidx/datastore/preferences/protobuf/d0;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n0;->H(Landroidx/datastore/preferences/protobuf/m0;)Landroidx/datastore/preferences/protobuf/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/s0;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/n0;->I(Landroidx/datastore/preferences/protobuf/m0;Landroidx/datastore/preferences/protobuf/s0;)V

    return-void
.end method

.method public bridge synthetic t(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/s0;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/m0;

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/n0;->J(Landroidx/datastore/preferences/protobuf/m0;Landroidx/datastore/preferences/protobuf/s0;)V

    return-void
.end method

.method public u(Landroidx/datastore/preferences/protobuf/m0;II)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    invoke-static {p2, v0}, Landroidx/datastore/preferences/protobuf/r0;->c(II)I

    move-result p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/datastore/preferences/protobuf/m0;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public v(Landroidx/datastore/preferences/protobuf/m0;IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-static {p2, v0}, Landroidx/datastore/preferences/protobuf/r0;->c(II)I

    move-result p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/datastore/preferences/protobuf/m0;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public w(Landroidx/datastore/preferences/protobuf/m0;ILandroidx/datastore/preferences/protobuf/m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    invoke-static {p2, v0}, Landroidx/datastore/preferences/protobuf/r0;->c(II)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Landroidx/datastore/preferences/protobuf/m0;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public x(Landroidx/datastore/preferences/protobuf/m0;ILandroidx/datastore/preferences/protobuf/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    invoke-static {p2, v0}, Landroidx/datastore/preferences/protobuf/r0;->c(II)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Landroidx/datastore/preferences/protobuf/m0;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public y(Landroidx/datastore/preferences/protobuf/m0;IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-static {p2, v0}, Landroidx/datastore/preferences/protobuf/r0;->c(II)I

    move-result p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/datastore/preferences/protobuf/m0;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public z(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/m0;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n0;->A(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/m0;

    move-result-object v0

    invoke-static {}, Landroidx/datastore/preferences/protobuf/m0;->e()Landroidx/datastore/preferences/protobuf/m0;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Landroidx/datastore/preferences/protobuf/m0;->l()Landroidx/datastore/preferences/protobuf/m0;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroidx/datastore/preferences/protobuf/n0;->G(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/m0;)V

    :cond_0
    return-object v0
.end method
