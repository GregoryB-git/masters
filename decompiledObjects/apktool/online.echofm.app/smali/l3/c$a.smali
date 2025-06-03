.class public Ll3/c$a;
.super Lk3/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll3/c;-><init>()V
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
    check-cast p1, Lp3/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll3/c$a;->c(Lp3/a;)Lc3/t;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Lp3/a;)Lc3/t;
    .locals 3

    .line 1
    new-instance v0, Lq3/o;

    .line 2
    .line 3
    new-instance v1, Lq3/m;

    .line 4
    .line 5
    invoke-virtual {p1}, Lp3/a;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->Y()[B

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Lq3/m;-><init>([B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lp3/a;->Z()Lp3/c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lp3/c;->X()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-direct {v0, v1, p1}, Lq3/o;-><init>(Lo3/a;I)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
