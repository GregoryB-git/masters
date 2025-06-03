.class public abstract LX5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX5/g$b;


# instance fields
.field public final o:LX5/g$c;


# direct methods
.method public constructor <init>(LX5/g$c;)V
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LX5/a;->o:LX5/g$c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public b(LX5/g$c;)LX5/g$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LX5/g$b$a;->b(LX5/g$b;LX5/g$c;)LX5/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getKey()LX5/g$c;
    .locals 1

    .line 1
    iget-object v0, p0, LX5/a;->o:LX5/g$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public k(LX5/g;)LX5/g;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LX5/g$b$a;->d(LX5/g$b;LX5/g;)LX5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public u(Ljava/lang/Object;Lg6/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LX5/g$b$a;->a(LX5/g$b;Ljava/lang/Object;Lg6/p;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public x(LX5/g$c;)LX5/g;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LX5/g$b$a;->c(LX5/g$b;LX5/g$c;)LX5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
