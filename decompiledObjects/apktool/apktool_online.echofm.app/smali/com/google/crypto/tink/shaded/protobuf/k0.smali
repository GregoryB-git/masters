.class public abstract Lcom/google/crypto/tink/shaded/protobuf/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;II)V
.end method

.method public abstract b(Ljava/lang/Object;IJ)V
.end method

.method public abstract c(Ljava/lang/Object;ILjava/lang/Object;)V
.end method

.method public abstract d(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/h;)V
.end method

.method public abstract e(Ljava/lang/Object;IJ)V
.end method

.method public abstract f(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract g(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract h(Ljava/lang/Object;)I
.end method

.method public abstract i(Ljava/lang/Object;)I
.end method

.method public abstract j(Ljava/lang/Object;)V
.end method

.method public abstract k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final l(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;)V
    .locals 2

    .line 1
    :cond_0
    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/d0;->p()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->m(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    return-void
.end method

.method public final m(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;)Z
    .locals 5

    .line 1
    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/d0;->e()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->a(I)I

    move-result v1

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->b(I)I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    if-eq v0, v2, :cond_5

    const/4 v3, 0x2

    if-eq v0, v3, :cond_4

    const/4 v3, 0x3

    const/4 v4, 0x4

    if-eq v0, v3, :cond_2

    if-eq v0, v4, :cond_1

    const/4 v3, 0x5

    if-ne v0, v3, :cond_0

    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/d0;->n()I

    move-result p2

    invoke-virtual {p0, p1, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->a(Ljava/lang/Object;II)V

    return v2

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/A;->e()Lcom/google/crypto/tink/shaded/protobuf/A$a;

    move-result-object p1

    throw p1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/k0;->n()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/q0;->c(II)I

    move-result v3

    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->l(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/d0;)V

    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/d0;->e()I

    move-result p2

    if-ne v3, p2, :cond_3

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->c(Ljava/lang/Object;ILjava/lang/Object;)V

    return v2

    :cond_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/A;->b()Lcom/google/crypto/tink/shaded/protobuf/A;

    move-result-object p1

    throw p1

    :cond_4
    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/d0;->u()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p2

    invoke-virtual {p0, p1, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->d(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/h;)V

    return v2

    :cond_5
    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/d0;->f()J

    move-result-wide v3

    invoke-virtual {p0, p1, v1, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k0;->b(Ljava/lang/Object;IJ)V

    return v2

    :cond_6
    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/d0;->E()J

    move-result-wide v3

    invoke-virtual {p0, p1, v1, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k0;->e(Ljava/lang/Object;IJ)V

    return v2
.end method

.method public abstract n()Ljava/lang/Object;
.end method

.method public abstract o(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract p(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract q(Lcom/google/crypto/tink/shaded/protobuf/d0;)Z
.end method

.method public abstract r(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract s(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
.end method

.method public abstract t(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/r0;)V
.end method
