.class public final LT4/g$d;
.super LZ5/k;
.source "SourceFile"

# interfaces
.implements Lg6/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT4/g;->h(LS/d$a;Ljava/lang/Object;LX5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:LS/d$a;

.field public final synthetic s:LT4/g;


# direct methods
.method public constructor <init>(Ljava/lang/Object;LS/d$a;LT4/g;LX5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT4/g$d;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, LT4/g$d;->r:LS/d$a;

    .line 4
    .line 5
    iput-object p3, p0, LT4/g$d;->s:LT4/g;

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
.method public final a(LS/a;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LT4/g$d;->create(Ljava/lang/Object;LX5/d;)LX5/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LT4/g$d;

    .line 6
    .line 7
    sget-object p2, LV5/t;->a:LV5/t;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LT4/g$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LX5/d;)LX5/d;
    .locals 4

    .line 1
    new-instance v0, LT4/g$d;

    .line 2
    .line 3
    iget-object v1, p0, LT4/g$d;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LT4/g$d;->r:LS/d$a;

    .line 6
    .line 7
    iget-object v3, p0, LT4/g$d;->s:LT4/g;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, LT4/g$d;-><init>(Ljava/lang/Object;LS/d$a;LT4/g;LX5/d;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LT4/g$d;->p:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LS/a;

    .line 2
    .line 3
    check-cast p2, LX5/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LT4/g$d;->a(LS/a;LX5/d;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LT4/g$d;->o:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LT4/g$d;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, LS/a;

    .line 14
    .line 15
    iget-object v0, p0, LT4/g$d;->q:Ljava/lang/Object;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, LT4/g$d;->r:LS/d$a;

    .line 20
    .line 21
    invoke-virtual {p1, v1, v0}, LS/a;->i(LS/d$a;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, LT4/g$d;->r:LS/d$a;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, LS/a;->h(LS/d$a;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, LT4/g$d;->s:LT4/g;

    .line 31
    .line 32
    invoke-static {v0, p1}, LT4/g;->c(LT4/g;LS/d;)V

    .line 33
    .line 34
    .line 35
    sget-object p1, LV5/t;->a:LV5/t;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method
