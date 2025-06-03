.class public final Lg2/a;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/i;",
        "Ldc/p<",
        "Lnc/d0;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "androidx.window.java.core.CallbackToFlowAdapter$connect$1$1"
    f = "CallbackToFlowAdapter.kt"
    l = {
        0x2e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lqc/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Ld0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqc/e;Ld0/a;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/e<",
            "Ljava/lang/Object;",
            ">;",
            "Ld0/a<",
            "Ljava/lang/Object;",
            ">;",
            "Lub/e<",
            "-",
            "Lg2/a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lg2/a;->b:Lqc/e;

    iput-object p2, p0, Lg2/a;->c:Ld0/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lwb/i;-><init>(ILub/e;)V

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

    new-instance p1, Lg2/a;

    iget-object v0, p0, Lg2/a;->b:Lqc/e;

    iget-object v1, p0, Lg2/a;->c:Ld0/a;

    invoke-direct {p1, v0, v1, p2}, Lg2/a;-><init>(Lqc/e;Ld0/a;Lub/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lg2/a;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lg2/a;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lg2/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lvb/a;->a:Lvb/a;

    iget v1, p0, Lg2/a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lg2/a;->b:Lqc/e;

    new-instance v1, Lg2/a$a;

    iget-object v3, p0, Lg2/a;->c:Ld0/a;

    invoke-direct {v1, v3}, Lg2/a$a;-><init>(Ld0/a;)V

    iput v2, p0, Lg2/a;->a:I

    invoke-interface {p1, v1, p0}, Lqc/e;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method
