.class public final LT4/g$a;
.super LZ5/k;
.source "SourceFile"

# interfaces
.implements Lg6/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT4/g;-><init>(LP/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public o:Ljava/lang/Object;

.field public p:I

.field public final synthetic q:LT4/g;


# direct methods
.method public constructor <init>(LT4/g;LX5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT4/g$a;->q:LT4/g;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LZ5/k;-><init>(ILX5/d;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LX5/d;)LX5/d;
    .locals 1

    .line 1
    new-instance p1, LT4/g$a;

    .line 2
    .line 3
    iget-object v0, p0, LT4/g$a;->q:LT4/g;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LT4/g$a;-><init>(LT4/g;LX5/d;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lp6/I;

    check-cast p2, LX5/d;

    invoke-virtual {p0, p1, p2}, LT4/g$a;->invoke(Lp6/I;LX5/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lp6/I;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, LT4/g$a;->create(Ljava/lang/Object;LX5/d;)LX5/d;

    move-result-object p1

    check-cast p1, LT4/g$a;

    sget-object p2, LV5/t;->a:LV5/t;

    invoke-virtual {p1, p2}, LT4/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LT4/g$a;->p:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LT4/g$a;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LT4/g;

    .line 15
    .line 16
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LT4/g$a;->q:LT4/g;

    .line 32
    .line 33
    invoke-static {p1}, LT4/g;->a(LT4/g;)LP/f;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, LP/f;->b()Ls6/b;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object p1, p0, LT4/g$a;->o:Ljava/lang/Object;

    .line 42
    .line 43
    iput v2, p0, LT4/g$a;->p:I

    .line 44
    .line 45
    invoke-static {v1, p0}, Ls6/d;->d(Ls6/b;LX5/d;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-ne v1, v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    move-object v0, p1

    .line 53
    move-object p1, v1

    .line 54
    :goto_0
    check-cast p1, LS/d;

    .line 55
    .line 56
    invoke-virtual {p1}, LS/d;->d()LS/d;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {v0, p1}, LT4/g;->c(LT4/g;LS/d;)V

    .line 61
    .line 62
    .line 63
    sget-object p1, LV5/t;->a:LV5/t;

    .line 64
    .line 65
    return-object p1
.end method
