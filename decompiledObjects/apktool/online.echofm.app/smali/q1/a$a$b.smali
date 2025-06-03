.class public final Lq1/a$a$b;
.super LZ5/k;
.source "SourceFile"

# interfaces
.implements Lg6/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq1/a$a;->b()Lb3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public o:I

.field public final synthetic p:Lq1/a$a;


# direct methods
.method public constructor <init>(Lq1/a$a;LX5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq1/a$a$b;->p:Lq1/a$a;

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
    new-instance p1, Lq1/a$a$b;

    .line 2
    .line 3
    iget-object v0, p0, Lq1/a$a$b;->p:Lq1/a$a;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lq1/a$a$b;-><init>(Lq1/a$a;LX5/d;)V

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

    invoke-virtual {p0, p1, p2}, Lq1/a$a$b;->invoke(Lp6/I;LX5/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lp6/I;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lq1/a$a$b;->create(Ljava/lang/Object;LX5/d;)LX5/d;

    move-result-object p1

    check-cast p1, Lq1/a$a$b;

    sget-object p2, LV5/t;->a:LV5/t;

    invoke-virtual {p1, p2}, Lq1/a$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lq1/a$a$b;->o:I

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
    iget-object p1, p0, Lq1/a$a$b;->p:Lq1/a$a;

    .line 28
    .line 29
    invoke-static {p1}, Lq1/a$a;->d(Lq1/a$a;)Lr1/n;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput v2, p0, Lq1/a$a$b;->o:I

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Lr1/n;->b(LX5/d;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    return-object p1
.end method
