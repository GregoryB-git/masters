.class public final Ld3/e;
.super Lk3/d;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Ld3/e$a;

    .line 2
    .line 3
    const-class v1, Lc3/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ld3/e$a;-><init>(Ljava/lang/Class;)V

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
    const-class v0, Lp3/d;

    .line 15
    .line 16
    invoke-direct {p0, v0, v1}, Lk3/d;-><init>(Ljava/lang/Class;[Lk3/m;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static synthetic k(IIIILp3/u;Lc3/l$b;)Lk3/d$a$a;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Ld3/e;->l(IIIILp3/u;Lc3/l$b;)Lk3/d$a$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static l(IIIILp3/u;Lc3/l$b;)Lk3/d$a$a;
    .locals 1

    .line 1
    new-instance v0, Lk3/d$a$a;

    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Ld3/e;->m(IIIILp3/u;)Lp3/e;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0, p5}, Lk3/d$a$a;-><init>(Ljava/lang/Object;Lc3/l$b;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static m(IIIILp3/u;)Lp3/e;
    .locals 2

    .line 1
    invoke-static {}, Lp3/g;->a0()Lp3/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lp3/h;->Y()Lp3/h$b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, p1}, Lp3/h$b;->y(I)Lp3/h$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->n()Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lp3/h;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lp3/g$b;->z(Lp3/h;)Lp3/g$b;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1, p0}, Lp3/g$b;->y(I)Lp3/g$b;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->n()Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lp3/g;

    .line 32
    .line 33
    invoke-static {}, Lp3/w;->a0()Lp3/w$b;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {}, Lp3/x;->a0()Lp3/x$b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, p4}, Lp3/x$b;->y(Lp3/u;)Lp3/x$b;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    invoke-virtual {p4, p3}, Lp3/x$b;->z(I)Lp3/x$b;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-virtual {p3}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->n()Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    check-cast p3, Lp3/x;

    .line 54
    .line 55
    invoke-virtual {p1, p3}, Lp3/w$b;->z(Lp3/x;)Lp3/w$b;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1, p2}, Lp3/w$b;->y(I)Lp3/w$b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->n()Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Lp3/w;

    .line 68
    .line 69
    invoke-static {}, Lp3/e;->Z()Lp3/e$b;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p2, p0}, Lp3/e$b;->y(Lp3/g;)Lp3/e$b;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0, p1}, Lp3/e$b;->z(Lp3/w;)Lp3/e$b;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->n()Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, Lp3/e;

    .line 86
    .line 87
    return-object p0
.end method

.method public static p(Z)V
    .locals 1

    .line 1
    new-instance v0, Ld3/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ld3/e;-><init>()V

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
.method public a()Lh3/b$b;
    .locals 1

    .line 1
    sget-object v0, Lh3/b$b;->p:Lh3/b$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Lk3/d$a;
    .locals 2

    .line 1
    new-instance v0, Ld3/e$b;

    .line 2
    .line 3
    const-class v1, Lp3/e;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ld3/e$b;-><init>(Ld3/e;Ljava/lang/Class;)V

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
    invoke-virtual {p0, p1}, Ld3/e;->o(Lcom/google/crypto/tink/shaded/protobuf/h;)Lp3/d;

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
    check-cast p1, Lp3/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld3/e;->q(Lp3/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public n()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/h;)Lp3/d;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, Lp3/d;->c0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lp3/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public q(Lp3/d;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lp3/d;->a0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Ld3/e;->n()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Lq3/r;->c(II)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Ld3/f;

    .line 13
    .line 14
    invoke-direct {v0}, Ld3/f;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lp3/d;->Y()Lp3/f;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ld3/f;->n(Lp3/f;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Ll3/k;

    .line 25
    .line 26
    invoke-direct {v0}, Ll3/k;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lp3/d;->Z()Lp3/v;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Ll3/k;->q(Lp3/v;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
