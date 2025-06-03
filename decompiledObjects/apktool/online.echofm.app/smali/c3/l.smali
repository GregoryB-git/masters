.class public final Lc3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc3/l$b;
    }
.end annotation


# instance fields
.field public final a:Lp3/A;


# direct methods
.method public constructor <init>(Lp3/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc3/l;->a:Lp3/A;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Ljava/lang/String;[BLc3/l$b;)Lc3/l;
    .locals 2

    .line 1
    new-instance v0, Lc3/l;

    .line 2
    .line 3
    invoke-static {}, Lp3/A;->c0()Lp3/A$b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p0}, Lp3/A$b;->z(Ljava/lang/String;)Lp3/A$b;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->i([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lp3/A$b;->A(Lcom/google/crypto/tink/shaded/protobuf/h;)Lp3/A$b;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p2}, Lc3/l;->c(Lc3/l$b;)Lp3/I;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Lp3/A$b;->y(Lp3/I;)Lp3/A$b;

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
    check-cast p0, Lp3/A;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Lc3/l;-><init>(Lp3/A;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public static c(Lc3/l$b;)Lp3/I;
    .locals 1

    .line 1
    sget-object v0, Lc3/l$a;->b:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p0, v0, :cond_3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p0, v0, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p0, v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    sget-object p0, Lp3/I;->t:Lp3/I;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string v0, "Unknown output prefix type"

    .line 27
    .line 28
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_1
    sget-object p0, Lp3/I;->s:Lp3/I;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    sget-object p0, Lp3/I;->r:Lp3/I;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_3
    sget-object p0, Lp3/I;->q:Lp3/I;

    .line 39
    .line 40
    return-object p0
.end method


# virtual methods
.method public b()Lp3/A;
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/l;->a:Lp3/A;

    .line 2
    .line 3
    return-object v0
.end method
