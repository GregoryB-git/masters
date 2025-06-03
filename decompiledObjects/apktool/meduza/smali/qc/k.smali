.class public final Lqc/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/f;


# annotations
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
.field public final synthetic a:Lqc/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/f<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Lec/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec/s<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqc/f;Lec/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/f<",
            "-TT;>;",
            "Lec/s<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqc/k;->a:Lqc/f;

    iput-object p2, p0, Lqc/k;->b:Lec/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p2, Lqc/k$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lqc/k$a;

    iget v1, v0, Lqc/k$a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqc/k$a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lqc/k$a;

    invoke-direct {v0, p0, p2}, Lqc/k$a;-><init>(Lqc/k;Lub/e;)V

    :goto_0
    iget-object p2, v0, Lqc/k$a;->b:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lqc/k$a;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lqc/k$a;->a:Lqc/k;

    :try_start_0
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lqc/k;->a:Lqc/f;

    iput-object p0, v0, Lqc/k$a;->a:Lqc/k;

    iput v3, v0, Lqc/k$a;->d:I

    invoke-interface {p2, p1, v0}, Lqc/f;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1

    :catchall_1
    move-exception p1

    move-object p2, p1

    move-object p1, p0

    :goto_2
    iget-object p1, p1, Lqc/k;->b:Lec/s;

    iput-object p2, p1, Lec/s;->a:Ljava/lang/Object;

    throw p2
.end method
