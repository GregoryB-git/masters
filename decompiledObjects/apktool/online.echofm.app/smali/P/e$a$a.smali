.class public final LP/e$a$a;
.super LZ5/k;
.source "SourceFile"

# interfaces
.implements Lg6/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP/e$a;->b(Ljava/util/List;)Lg6/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;LX5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/e$a$a;->q:Ljava/util/List;

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
.method public final a(LP/i;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LP/e$a$a;->create(Ljava/lang/Object;LX5/d;)LX5/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP/e$a$a;

    .line 6
    .line 7
    sget-object p2, LV5/t;->a:LV5/t;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LP/e$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LX5/d;)LX5/d;
    .locals 2

    .line 1
    new-instance v0, LP/e$a$a;

    .line 2
    .line 3
    iget-object v1, p0, LP/e$a$a;->q:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LP/e$a$a;-><init>(Ljava/util/List;LX5/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LP/e$a$a;->p:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LP/i;

    .line 2
    .line 3
    check-cast p2, LX5/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LP/e$a$a;->a(LP/i;LX5/d;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LP/e$a$a;->o:I

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
    iget-object p1, p0, LP/e$a$a;->p:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LP/i;

    .line 30
    .line 31
    sget-object v1, LP/e;->a:LP/e$a;

    .line 32
    .line 33
    iget-object v3, p0, LP/e$a$a;->q:Ljava/util/List;

    .line 34
    .line 35
    iput v2, p0, LP/e$a$a;->o:I

    .line 36
    .line 37
    invoke-static {v1, v3, p1, p0}, LP/e$a;->a(LP/e$a;Ljava/util/List;LP/i;LX5/d;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    sget-object p1, LV5/t;->a:LV5/t;

    .line 45
    .line 46
    return-object p1
.end method
