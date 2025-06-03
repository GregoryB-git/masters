.class public final Lnc/o1$g;
.super Lwb/h;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnc/o1;->getChildren()Lkc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/h;",
        "Ldc/p<",
        "Lkc/d<",
        "-",
        "Lnc/j1;",
        ">;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.JobSupport$children$1"
    f = "JobSupport.kt"
    l = {
        0x3bc,
        0x3be
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public b:Lsc/i;

.field public c:Lsc/j;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lnc/o1;


# direct methods
.method public constructor <init>(Lub/e;Lnc/o1;)V
    .locals 0

    iput-object p2, p0, Lnc/o1$g;->f:Lnc/o1;

    invoke-direct {p0, p1}, Lwb/h;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lub/e<",
            "*>;)",
            "Lub/e<",
            "Lrb/h;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnc/o1$g;

    iget-object v1, p0, Lnc/o1$g;->f:Lnc/o1;

    invoke-direct {v0, p2, v1}, Lnc/o1$g;-><init>(Lub/e;Lnc/o1;)V

    iput-object p1, v0, Lnc/o1$g;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkc/d;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lnc/o1$g;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lnc/o1$g;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lnc/o1$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lvb/a;->a:Lvb/a;

    iget v1, p0, Lnc/o1$g;->d:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lnc/o1$g;->c:Lsc/j;

    iget-object v3, p0, Lnc/o1$g;->b:Lsc/i;

    iget-object v4, p0, Lnc/o1$g;->e:Ljava/lang/Object;

    check-cast v4, Lkc/d;

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    move-object p1, p0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lnc/o1$g;->e:Ljava/lang/Object;

    check-cast p1, Lkc/d;

    iget-object v1, p0, Lnc/o1$g;->f:Lnc/o1;

    invoke-virtual {v1}, Lnc/o1;->F()Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Lnc/p;

    if-eqz v4, :cond_3

    check-cast v1, Lnc/p;

    iget-object v1, v1, Lnc/p;->e:Lnc/q;

    iput v3, p0, Lnc/o1$g;->d:I

    invoke-virtual {p1, v1, p0}, Lkc/d;->a(Ljava/lang/Object;Lub/e;)V

    return-object v0

    :cond_3
    instance-of v3, v1, Lnc/f1;

    if-eqz v3, :cond_5

    check-cast v1, Lnc/f1;

    invoke-interface {v1}, Lnc/f1;->b()Lnc/t1;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lsc/j;->h()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v3, v4}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lsc/j;

    move-object v4, p1

    move-object p1, p0

    move-object v6, v3

    move-object v3, v1

    move-object v1, v6

    :goto_0
    invoke-static {v1, v3}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    instance-of v5, v1, Lnc/p;

    if-eqz v5, :cond_4

    move-object v5, v1

    check-cast v5, Lnc/p;

    iget-object v5, v5, Lnc/p;->e:Lnc/q;

    iput-object v4, p1, Lnc/o1$g;->e:Ljava/lang/Object;

    iput-object v3, p1, Lnc/o1$g;->b:Lsc/i;

    iput-object v1, p1, Lnc/o1$g;->c:Lsc/j;

    iput v2, p1, Lnc/o1$g;->d:I

    invoke-virtual {v4, v5, p1}, Lkc/d;->a(Ljava/lang/Object;Lub/e;)V

    sget-object v5, Lvb/a;->a:Lvb/a;

    if-ne v5, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    invoke-virtual {v1}, Lsc/j;->i()Lsc/j;

    move-result-object v1

    goto :goto_0

    :cond_5
    :goto_2
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method
