.class public final LY1/u$f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY1/u$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LY1/u$f$c;-><init>()V

    return-void
.end method

.method public static synthetic d(LY1/u$f$c;LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LY1/u$f;
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LY1/u$f$c;->c(LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LY1/u$f;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final a(LY1/u$e;Ljava/lang/String;)LY1/u$f;
    .locals 7

    .line 1
    new-instance v6, LY1/u$f;

    .line 2
    .line 3
    sget-object v2, LY1/u$f$a;->q:LY1/u$f$a;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v5, 0x0

    .line 7
    move-object v0, v6

    .line 8
    move-object v1, p1

    .line 9
    move-object v4, p2

    .line 10
    invoke-direct/range {v0 .. v5}, LY1/u$f;-><init>(LY1/u$e;LY1/u$f$a;Lx1/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v6
.end method

.method public final b(LY1/u$e;Lx1/a;Lx1/i;)LY1/u$f;
    .locals 8

    .line 1
    new-instance v7, LY1/u$f;

    .line 2
    .line 3
    sget-object v2, LY1/u$f$a;->p:LY1/u$f$a;

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v6, 0x0

    .line 7
    move-object v0, v7

    .line 8
    move-object v1, p1

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    invoke-direct/range {v0 .. v6}, LY1/u$f;-><init>(LY1/u$e;LY1/u$f$a;Lx1/a;Lx1/i;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v7
.end method

.method public final c(LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LY1/u$f;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    if-eqz p3, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_1
    const-string p2, ": "

    .line 17
    .line 18
    invoke-static {p2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    new-instance p2, LY1/u$f;

    .line 23
    .line 24
    sget-object v3, LY1/u$f$a;->r:LY1/u$f$a;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    move-object v1, p2

    .line 28
    move-object v2, p1

    .line 29
    move-object v6, p4

    .line 30
    invoke-direct/range {v1 .. v6}, LY1/u$f;-><init>(LY1/u$e;LY1/u$f$a;Lx1/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object p2
.end method

.method public final e(LY1/u$e;Lx1/a;)LY1/u$f;
    .locals 7

    .line 1
    const-string v0, "token"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LY1/u$f;

    .line 7
    .line 8
    sget-object v3, LY1/u$f$a;->p:LY1/u$f$a;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    move-object v1, v0

    .line 13
    move-object v2, p1

    .line 14
    move-object v4, p2

    .line 15
    invoke-direct/range {v1 .. v6}, LY1/u$f;-><init>(LY1/u$e;LY1/u$f$a;Lx1/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
