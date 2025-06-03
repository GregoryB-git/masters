.class public final Ll3/c;
.super Lk3/d;
.source "SourceFile"


# static fields
.field public static final d:Lk3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ll3/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ll3/b;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Ll3/a;

    .line 7
    .line 8
    const-class v2, Ll3/g;

    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Lk3/l;->b(Lk3/l$b;Ljava/lang/Class;Ljava/lang/Class;)Lk3/l;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Ll3/c;->d:Lk3/l;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Ll3/c$a;

    .line 2
    .line 3
    const-class v1, Lc3/t;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ll3/c$a;-><init>(Ljava/lang/Class;)V

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
    const-class v0, Lp3/a;

    .line 15
    .line 16
    invoke-direct {p0, v0, v1}, Lk3/d;-><init>(Ljava/lang/Class;[Lk3/m;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static synthetic k(Lp3/c;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ll3/c;->q(Lp3/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(I)V
    .locals 0

    .line 1
    invoke-static {p0}, Ll3/c;->r(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static o(Z)V
    .locals 1

    .line 1
    new-instance v0, Ll3/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ll3/c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p0}, Lc3/x;->l(Lk3/d;Z)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ll3/f;->c()V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lk3/h;->c()Lk3/h;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v0, Ll3/c;->d:Lk3/l;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lk3/h;->d(Lk3/l;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static q(Lp3/c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lp3/c;->X()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lp3/c;->X()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/16 v0, 0x10

    .line 14
    .line 15
    if-gt p0, v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 19
    .line 20
    const-string v0, "tag size too long"

    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 27
    .line 28
    const-string v0, "tag size too short"

    .line 29
    .line 30
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0
.end method

.method public static r(I)V
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 7
    .line 8
    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Lk3/d$a;
    .locals 2

    .line 1
    new-instance v0, Ll3/c$b;

    .line 2
    .line 3
    const-class v1, Lp3/b;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ll3/c$b;-><init>(Ll3/c;Ljava/lang/Class;)V

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
    invoke-virtual {p0, p1}, Ll3/c;->n(Lcom/google/crypto/tink/shaded/protobuf/h;)Lp3/a;

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
    check-cast p1, Lp3/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll3/c;->p(Lp3/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public n(Lcom/google/crypto/tink/shaded/protobuf/h;)Lp3/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, Lp3/a;->c0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lp3/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public p(Lp3/a;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lp3/a;->a0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Ll3/c;->m()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Lq3/r;->c(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lp3/a;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0}, Ll3/c;->r(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lp3/a;->Z()Lp3/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Ll3/c;->q(Lp3/c;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
