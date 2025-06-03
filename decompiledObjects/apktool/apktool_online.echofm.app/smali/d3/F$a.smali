.class public Ld3/F$a;
.super Lk3/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld3/F;-><init>()V
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
    check-cast p1, Lp3/G;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld3/F$a;->c(Lp3/G;)Lc3/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Lp3/G;)Lc3/a;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lp3/G;->X()Lp3/H;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lp3/H;->X()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lc3/s;->a(Ljava/lang/String;)Lc3/r;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1, v0}, Lc3/r;->a(Ljava/lang/String;)Lc3/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ld3/E;

    .line 18
    .line 19
    invoke-virtual {p1}, Lp3/G;->X()Lp3/H;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lp3/H;->W()Lp3/A;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v1, p1, v0}, Ld3/E;-><init>(Lp3/A;Lc3/a;)V

    .line 28
    .line 29
    .line 30
    return-object v1
.end method
