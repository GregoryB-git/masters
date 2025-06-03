.class public final Lrc/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldc/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/q<",
            "Lqc/f<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lrc/p$a;->a:Lrc/p$a;

    const-string v1, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>"

    invoke-static {v0, v1}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x3

    invoke-static {v1, v0}, Lec/v;->a(ILjava/lang/Object;)V

    sput-object v0, Lrc/p;->a:Ldc/q;

    return-void
.end method
