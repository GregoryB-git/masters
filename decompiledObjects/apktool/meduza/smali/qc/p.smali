.class public final Lqc/p;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lwb/c;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.flow.FlowKt__ReduceKt"
    f = "Reduce.kt"
    l = {
        0xb7
    }
    m = "firstOrNull"
.end annotation


# instance fields
.field public a:Lec/s;

.field public b:Lqc/o;

.field public synthetic c:Ljava/lang/Object;

.field public d:I


# direct methods
.method public constructor <init>(Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-",
            "Lqc/p;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqc/p;->c:Ljava/lang/Object;

    iget p1, p0, Lqc/p;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqc/p;->d:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lx6/b;->V(Lqc/e;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
