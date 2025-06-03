.class public final Lt2/f$b;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt2/f;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/i;",
        "Ldc/q<",
        "Lqc/f<",
        "-",
        "Lt2/b;",
        ">;[",
        "Lt2/b;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3"
    f = "WorkConstraintsTracker.kt"
    l = {
        0x124
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Lqc/f;

.field public synthetic c:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lub/e;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final f(Lqc/f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lub/e;

    new-instance v0, Lt2/f$b;

    invoke-direct {v0, p3}, Lt2/f$b;-><init>(Lub/e;)V

    iput-object p1, v0, Lt2/f$b;->b:Lqc/f;

    iput-object p2, v0, Lt2/f$b;->c:[Ljava/lang/Object;

    sget-object p1, Lrb/h;->a:Lrb/h;

    invoke-virtual {v0, p1}, Lt2/f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lvb/a;->a:Lvb/a;

    iget v1, p0, Lt2/f$b;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lt2/f$b;->b:Lqc/f;

    iget-object v1, p0, Lt2/f$b;->c:[Ljava/lang/Object;

    check-cast v1, [Lt2/b;

    const/4 v3, 0x0

    array-length v4, v1

    :goto_0
    if-ge v3, v4, :cond_3

    aget-object v5, v1, v3

    sget-object v6, Lt2/b$a;->a:Lt2/b$a;

    invoke-static {v5, v6}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    xor-int/2addr v6, v2

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_4

    sget-object v5, Lt2/b$a;->a:Lt2/b$a;

    :cond_4
    iput v2, p0, Lt2/f$b;->a:I

    invoke-interface {p1, v5, p0}, Lqc/f;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method
