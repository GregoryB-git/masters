.class public final Lvb/c;
.super Lwb/c;
.source "SourceFile"


# instance fields
.field public a:I

.field public final synthetic b:Ldc/p;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lub/e;Lub/h;Ldc/p;Ljava/lang/Object;)V
    .locals 0

    iput-object p3, p0, Lvb/c;->b:Ldc/p;

    iput-object p4, p0, Lvb/c;->c:Ljava/lang/Object;

    const-string p3, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    invoke-static {p1, p3}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lwb/c;-><init>(Lub/e;Lub/h;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lvb/c;->a:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    iput v1, p0, Lvb/c;->a:I

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v2, p0, Lvb/c;->a:I

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lvb/c;->b:Ldc/p;

    const-string v0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>"

    invoke-static {p1, v0}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lvb/c;->b:Ldc/p;

    invoke-static {v1, p1}, Lec/v;->a(ILjava/lang/Object;)V

    iget-object v0, p0, Lvb/c;->c:Ljava/lang/Object;

    invoke-interface {p1, v0, p0}, Ldc/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
