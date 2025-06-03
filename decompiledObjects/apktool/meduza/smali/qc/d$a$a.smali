.class public final Lqc/d$a$a;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqc/d$a;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2"
    f = "Distinct.kt"
    l = {
        0x4d
    }
    m = "emit"
.end annotation


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lqc/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/d$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public c:I


# direct methods
.method public constructor <init>(Lqc/d$a;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/d$a<",
            "-TT;>;",
            "Lub/e<",
            "-",
            "Lqc/d$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqc/d$a$a;->b:Lqc/d$a;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqc/d$a$a;->a:Ljava/lang/Object;

    iget p1, p0, Lqc/d$a$a;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqc/d$a$a;->c:I

    iget-object p1, p0, Lqc/d$a$a;->b:Lqc/d$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lqc/d$a;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
