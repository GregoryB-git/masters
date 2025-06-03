.class public Ld3/z;
.super Lk3/d;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Ld3/z$a;

    .line 2
    .line 3
    const-class v1, Lc3/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ld3/z$a;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    new-array v1, v1, [Lk3/m;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v0, v1, v2

    .line 13
    .line 14
    const-class v0, Lp3/r;

    .line 15
    .line 16
    invoke-direct {p0, v0, v1}, Lk3/d;-><init>(Ljava/lang/Class;[Lk3/m;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static m(Z)V
    .locals 1

    .line 1
    new-instance v0, Ld3/z;

    .line 2
    .line 3
    invoke-direct {v0}, Ld3/z;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p0}, Lc3/x;->l(Lk3/d;Z)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ld3/C;->c()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Lk3/d$a;
    .locals 2

    .line 1
    new-instance v0, Ld3/z$b;

    .line 2
    .line 3
    const-class v1, Lp3/s;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ld3/z$b;-><init>(Ld3/z;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public g()Lp3/y$c;
    .locals 1

    .line 1
    sget-object v0, Lp3/y$c;->q:Lp3/y$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/O;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ld3/z;->l(Lcom/google/crypto/tink/shaded/protobuf/h;)Lp3/r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/O;)V
    .locals 0

    .line 1
    check-cast p1, Lp3/r;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld3/z;->n(Lp3/r;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public l(Lcom/google/crypto/tink/shaded/protobuf/h;)Lp3/r;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, Lp3/r;->a0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lp3/r;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public n(Lp3/r;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lp3/r;->Y()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Ld3/z;->k()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Lq3/r;->c(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lp3/r;->X()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/16 v0, 0x20

    .line 21
    .line 22
    if-ne p1, v0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 26
    .line 27
    const-string v0, "invalid ChaCha20Poly1305Key: incorrect key length"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method
