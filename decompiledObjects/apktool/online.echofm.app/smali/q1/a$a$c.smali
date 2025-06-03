.class public final Lq1/a$a$c;
.super LZ5/k;
.source "SourceFile"

# interfaces
.implements Lg6/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq1/a$a;->f(Landroid/net/Uri;Landroid/view/InputEvent;)Lb3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public o:I

.field public final synthetic p:Lq1/a$a;

.field public final synthetic q:Landroid/net/Uri;

.field public final synthetic r:Landroid/view/InputEvent;


# direct methods
.method public constructor <init>(Lq1/a$a;Landroid/net/Uri;Landroid/view/InputEvent;LX5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq1/a$a$c;->p:Lq1/a$a;

    .line 2
    .line 3
    iput-object p2, p0, Lq1/a$a$c;->q:Landroid/net/Uri;

    .line 4
    .line 5
    iput-object p3, p0, Lq1/a$a$c;->r:Landroid/view/InputEvent;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, LZ5/k;-><init>(ILX5/d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LX5/d;)LX5/d;
    .locals 3

    .line 1
    new-instance p1, Lq1/a$a$c;

    .line 2
    .line 3
    iget-object v0, p0, Lq1/a$a$c;->p:Lq1/a$a;

    .line 4
    .line 5
    iget-object v1, p0, Lq1/a$a$c;->q:Landroid/net/Uri;

    .line 6
    .line 7
    iget-object v2, p0, Lq1/a$a$c;->r:Landroid/view/InputEvent;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lq1/a$a$c;-><init>(Lq1/a$a;Landroid/net/Uri;Landroid/view/InputEvent;LX5/d;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lp6/I;

    check-cast p2, LX5/d;

    invoke-virtual {p0, p1, p2}, Lq1/a$a$c;->invoke(Lp6/I;LX5/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lp6/I;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lq1/a$a$c;->create(Ljava/lang/Object;LX5/d;)LX5/d;

    move-result-object p1

    check-cast p1, Lq1/a$a$c;

    sget-object p2, LV5/t;->a:LV5/t;

    invoke-virtual {p1, p2}, Lq1/a$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

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
    iget v1, p0, Lq1/a$a$c;->o:I

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
    iget-object p1, p0, Lq1/a$a$c;->p:Lq1/a$a;

    .line 28
    .line 29
    invoke-static {p1}, Lq1/a$a;->d(Lq1/a$a;)Lr1/n;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Lq1/a$a$c;->q:Landroid/net/Uri;

    .line 34
    .line 35
    iget-object v3, p0, Lq1/a$a$c;->r:Landroid/view/InputEvent;

    .line 36
    .line 37
    iput v2, p0, Lq1/a$a$c;->o:I

    .line 38
    .line 39
    invoke-virtual {p1, v1, v3, p0}, Lr1/n;->c(Landroid/net/Uri;Landroid/view/InputEvent;LX5/d;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    :goto_0
    sget-object p1, LV5/t;->a:LV5/t;

    .line 47
    .line 48
    return-object p1
.end method
