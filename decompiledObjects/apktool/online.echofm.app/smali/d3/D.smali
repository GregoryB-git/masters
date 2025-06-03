.class public Ld3/D;
.super Lk3/d;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Ld3/D$a;

    .line 2
    .line 3
    const-class v1, Lc3/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ld3/D$a;-><init>(Ljava/lang/Class;)V

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
    const-class v0, Lp3/E;

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
    new-instance v0, Ld3/D;

    .line 2
    .line 3
    invoke-direct {v0}, Ld3/D;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p0}, Lc3/x;->l(Lk3/d;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Lk3/d$a;
    .locals 2

    .line 1
    new-instance v0, Ld3/D$b;

    .line 2
    .line 3
    const-class v1, Lp3/F;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ld3/D$b;-><init>(Ld3/D;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public g()Lp3/y$c;
    .locals 1

    .line 1
    sget-object v0, Lp3/y$c;->t:Lp3/y$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/O;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ld3/D;->l(Lcom/google/crypto/tink/shaded/protobuf/h;)Lp3/E;

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
    check-cast p1, Lp3/E;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld3/D;->n(Lp3/E;)V

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

.method public l(Lcom/google/crypto/tink/shaded/protobuf/h;)Lp3/E;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, Lp3/E;->a0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lp3/E;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public n(Lp3/E;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lp3/E;->Y()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Ld3/D;->k()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p1, v0}, Lq3/r;->c(II)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
