.class public final LS/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LS/c;

    .line 2
    .line 3
    invoke-direct {v0}, LS/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LS/c;->a:LS/c;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LQ/b;Ljava/util/List;Lp6/I;Lg6/a;)LP/f;
    .locals 7

    .line 1
    const-string v0, "migrations"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scope"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "produceFile"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, LP/g;->a:LP/g;

    .line 17
    .line 18
    sget-object v2, LS/h;->a:LS/h;

    .line 19
    .line 20
    new-instance v6, LS/c$a;

    .line 21
    .line 22
    invoke-direct {v6, p4}, LS/c$a;-><init>(Lg6/a;)V

    .line 23
    .line 24
    .line 25
    move-object v3, p1

    .line 26
    move-object v4, p2

    .line 27
    move-object v5, p3

    .line 28
    invoke-virtual/range {v1 .. v6}, LP/g;->a(LP/k;LQ/b;Ljava/util/List;Lp6/I;Lg6/a;)LP/f;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance p2, LS/b;

    .line 33
    .line 34
    invoke-direct {p2, p1}, LS/b;-><init>(LP/f;)V

    .line 35
    .line 36
    .line 37
    return-object p2
.end method
