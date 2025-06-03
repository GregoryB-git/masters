.class public final Lqc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lqc/e<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lqc/e;

.field public final synthetic b:Ldc/q;


# direct methods
.method public constructor <init>(Lqc/e;Lea/w$e;)V
    .locals 0

    iput-object p1, p0, Lqc/i;->a:Lqc/e;

    iput-object p2, p0, Lqc/i;->b:Ldc/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(Lqc/f;Lub/e;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/f<",
            "Ljava/lang/Object;",
            ">;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lqc/i$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lqc/i$a;

    iget v1, v0, Lqc/i$a;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqc/i$a;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, Lqc/i$a;

    invoke-direct {v0, p0, p2}, Lqc/i$a;-><init>(Lqc/i;Lub/e;)V

    :goto_0
    iget-object p2, v0, Lqc/i$a;->a:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lqc/i$a;->b:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lqc/i$a;->e:Lqc/f;

    iget-object v2, v0, Lqc/i$a;->d:Lqc/i;

    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lqc/i;->a:Lqc/e;

    iput-object p0, v0, Lqc/i$a;->d:Lqc/i;

    iput-object p1, v0, Lqc/i$a;->e:Lqc/f;

    iput v4, v0, Lqc/i$a;->b:I

    invoke-static {v0, p2, p1}, Lx6/b;->k(Lub/e;Lqc/e;Lqc/f;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p2, Ljava/lang/Throwable;

    if-eqz p2, :cond_5

    iget-object v2, v2, Lqc/i;->b:Ldc/q;

    const/4 v4, 0x0

    iput-object v4, v0, Lqc/i$a;->d:Lqc/i;

    iput-object v4, v0, Lqc/i$a;->e:Lqc/f;

    iput v3, v0, Lqc/i$a;->b:I

    invoke-interface {v2, p1, p2, v0}, Ldc/q;->f(Lqc/f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method
