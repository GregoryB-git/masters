.class public abstract Lcom/google/crypto/tink/shaded/protobuf/p0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(BBBB[CI)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->h(BBBB[CI)V

    return-void
.end method

.method public static synthetic b(B)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->n(B)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(B[CI)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->i(B[CI)V

    return-void
.end method

.method public static synthetic d(B)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->p(B)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(BB[CI)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->k(BB[CI)V

    return-void
.end method

.method public static synthetic f(B)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->o(B)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(BBB[CI)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->j(BBB[CI)V

    return-void
.end method

.method public static h(BBBB[CI)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->m(B)Z

    move-result v0

    if-nez v0, :cond_0

    shl-int/lit8 v0, p0, 0x1c

    add-int/lit8 v1, p1, 0x70

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->m(B)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->m(B)Z

    move-result v0

    if-nez v0, :cond_0

    and-int/lit8 p0, p0, 0x7

    shl-int/lit8 p0, p0, 0x12

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->r(B)I

    move-result p1

    shl-int/lit8 p1, p1, 0xc

    or-int/2addr p0, p1

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->r(B)I

    move-result p1

    shl-int/lit8 p1, p1, 0x6

    or-int/2addr p0, p1

    invoke-static {p3}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->r(B)I

    move-result p1

    or-int/2addr p0, p1

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->l(I)C

    move-result p1

    aput-char p1, p4, p5

    add-int/lit8 p5, p5, 0x1

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->q(I)C

    move-result p0

    aput-char p0, p4, p5

    return-void

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/A;->d()Lcom/google/crypto/tink/shaded/protobuf/A;

    move-result-object p0

    throw p0
.end method

.method public static i(B[CI)V
    .locals 0

    .line 1
    int-to-char p0, p0

    aput-char p0, p1, p2

    return-void
.end method

.method public static j(BBB[CI)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->m(B)Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, -0x20

    const/16 v1, -0x60

    if-ne p0, v0, :cond_0

    if-lt p1, v1, :cond_2

    :cond_0
    const/16 v0, -0x13

    if-ne p0, v0, :cond_1

    if-ge p1, v1, :cond_2

    :cond_1
    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->m(B)Z

    move-result v0

    if-nez v0, :cond_2

    and-int/lit8 p0, p0, 0xf

    shl-int/lit8 p0, p0, 0xc

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->r(B)I

    move-result p1

    shl-int/lit8 p1, p1, 0x6

    or-int/2addr p0, p1

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->r(B)I

    move-result p1

    or-int/2addr p0, p1

    int-to-char p0, p0

    aput-char p0, p3, p4

    return-void

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/A;->d()Lcom/google/crypto/tink/shaded/protobuf/A;

    move-result-object p0

    throw p0
.end method

.method public static k(BB[CI)V
    .locals 1

    .line 1
    const/16 v0, -0x3e

    if-lt p0, v0, :cond_0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->m(B)Z

    move-result v0

    if-nez v0, :cond_0

    and-int/lit8 p0, p0, 0x1f

    shl-int/lit8 p0, p0, 0x6

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/p0$a;->r(B)I

    move-result p1

    or-int/2addr p0, p1

    int-to-char p0, p0

    aput-char p0, p2, p3

    return-void

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/A;->d()Lcom/google/crypto/tink/shaded/protobuf/A;

    move-result-object p0

    throw p0
.end method

.method public static l(I)C
    .locals 1

    .line 1
    ushr-int/lit8 p0, p0, 0xa

    const v0, 0xd7c0

    add-int/2addr p0, v0

    int-to-char p0, p0

    return p0
.end method

.method public static m(B)Z
    .locals 1

    .line 1
    const/16 v0, -0x41

    if-le p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static n(B)Z
    .locals 0

    .line 1
    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static o(B)Z
    .locals 1

    .line 1
    const/16 v0, -0x10

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static p(B)Z
    .locals 1

    .line 1
    const/16 v0, -0x20

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static q(I)C
    .locals 1

    .line 1
    and-int/lit16 p0, p0, 0x3ff

    const v0, 0xdc00

    add-int/2addr p0, v0

    int-to-char p0, p0

    return p0
.end method

.method public static r(B)I
    .locals 0

    .line 1
    and-int/lit8 p0, p0, 0x3f

    return p0
.end method
