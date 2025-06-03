.class public Ld3/e$a;
.super Lk3/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld3/e;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lk3/m;-><init>(Ljava/lang/Class;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/O;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lp3/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld3/e$a;->c(Lp3/d;)Lc3/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Lp3/d;)Lc3/a;
    .locals 5

    .line 1
    new-instance v0, Lq3/h;

    .line 2
    .line 3
    new-instance v1, Ld3/f;

    .line 4
    .line 5
    invoke-direct {v1}, Ld3/f;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lp3/d;->Y()Lp3/f;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lq3/l;

    .line 13
    .line 14
    invoke-virtual {v1, v2, v3}, Lk3/d;->e(Lcom/google/crypto/tink/shaded/protobuf/O;Ljava/lang/Class;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lq3/l;

    .line 19
    .line 20
    new-instance v2, Ll3/k;

    .line 21
    .line 22
    invoke-direct {v2}, Ll3/k;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lp3/d;->Z()Lp3/v;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-class v4, Lc3/t;

    .line 30
    .line 31
    invoke-virtual {v2, v3, v4}, Lk3/d;->e(Lcom/google/crypto/tink/shaded/protobuf/O;Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lc3/t;

    .line 36
    .line 37
    invoke-virtual {p1}, Lp3/d;->Z()Lp3/v;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lp3/v;->a0()Lp3/x;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lp3/x;->Z()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-direct {v0, v1, v2, p1}, Lq3/h;-><init>(Lq3/l;Lc3/t;I)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method
