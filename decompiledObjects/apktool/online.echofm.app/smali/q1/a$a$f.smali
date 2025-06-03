.class public final Lq1/a$a$f;
.super LZ5/k;
.source "SourceFile"

# interfaces
.implements Lg6/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq1/a$a;->h(Lr1/p;)Lb3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public o:I

.field public final synthetic p:Lq1/a$a;


# direct methods
.method public constructor <init>(Lq1/a$a;Lr1/p;LX5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq1/a$a$f;->p:Lq1/a$a;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p3}, LZ5/k;-><init>(ILX5/d;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LX5/d;)LX5/d;
    .locals 2

    .line 1
    new-instance p1, Lq1/a$a$f;

    .line 2
    .line 3
    iget-object v0, p0, Lq1/a$a$f;->p:Lq1/a$a;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p1, v0, v1, p2}, Lq1/a$a$f;-><init>(Lq1/a$a;Lr1/p;LX5/d;)V

    .line 7
    .line 8
    .line 9
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lp6/I;

    check-cast p2, LX5/d;

    invoke-virtual {p0, p1, p2}, Lq1/a$a$f;->invoke(Lp6/I;LX5/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lp6/I;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lq1/a$a$f;->create(Ljava/lang/Object;LX5/d;)LX5/d;

    move-result-object p1

    check-cast p1, Lq1/a$a$f;

    sget-object p2, LV5/t;->a:LV5/t;

    invoke-virtual {p1, p2}, Lq1/a$a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lq1/a$a$f;->o:I

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
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lq1/a$a$f;->p:Lq1/a$a;

    .line 28
    .line 29
    invoke-static {p1}, Lq1/a$a;->d(Lq1/a$a;)Lr1/n;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput v2, p0, Lq1/a$a$f;->o:I

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {p1, v1, p0}, Lr1/n;->f(Lr1/p;LX5/d;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2
    :goto_0
    sget-object p1, LV5/t;->a:LV5/t;

    .line 44
    .line 45
    return-object p1
.end method
