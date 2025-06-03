.class public final Lqc/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqc/d;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lqc/f;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lqc/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Lec/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec/s<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Lqc/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/f<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqc/d;Lec/s;Lqc/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/d<",
            "TT;>;",
            "Lec/s<",
            "Ljava/lang/Object;",
            ">;",
            "Lqc/f<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lqc/d$a;->a:Lqc/d;

    iput-object p2, p0, Lqc/d$a;->b:Lec/s;

    iput-object p3, p0, Lqc/d$a;->c:Lqc/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lqc/d$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lqc/d$a$a;

    iget v1, v0, Lqc/d$a$a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqc/d$a$a;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lqc/d$a$a;

    invoke-direct {v0, p0, p2}, Lqc/d$a$a;-><init>(Lqc/d$a;Lub/e;)V

    :goto_0
    iget-object p2, v0, Lqc/d$a$a;->a:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lqc/d$a$a;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lqc/d$a;->a:Lqc/d;

    iget-object p2, p2, Lqc/d;->b:Ldc/l;

    invoke-interface {p2, p1}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v2, p0, Lqc/d$a;->b:Lec/s;

    iget-object v2, v2, Lec/s;->a:Ljava/lang/Object;

    sget-object v4, Leb/y;->b:Ld2/h0;

    if-eq v2, v4, :cond_4

    iget-object v4, p0, Lqc/d$a;->a:Lqc/d;

    iget-object v4, v4, Lqc/d;->c:Ldc/p;

    invoke-interface {v4, v2, p2}, Ldc/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1

    :cond_4
    :goto_1
    iget-object v2, p0, Lqc/d$a;->b:Lec/s;

    iput-object p2, v2, Lec/s;->a:Ljava/lang/Object;

    iget-object p2, p0, Lqc/d$a;->c:Lqc/f;

    iput v3, v0, Lqc/d$a$a;->c:I

    invoke-interface {p2, p1, v0}, Lqc/f;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method
