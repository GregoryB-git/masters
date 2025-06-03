.class public final Lqc/t$a;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqc/t;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.flow.StateFlowImpl"
    f = "StateFlow.kt"
    l = {
        0x180,
        0x18c,
        0x191
    }
    m = "collect"
.end annotation


# instance fields
.field public a:Lqc/t;

.field public b:Lqc/f;

.field public c:Lqc/u;

.field public d:Lnc/j1;

.field public e:Ljava/lang/Object;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic o:Lqc/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/t<",
            "TT;>;"
        }
    .end annotation
.end field

.field public p:I


# direct methods
.method public constructor <init>(Lqc/t;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/t<",
            "TT;>;",
            "Lub/e<",
            "-",
            "Lqc/t$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqc/t$a;->o:Lqc/t;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqc/t$a;->f:Ljava/lang/Object;

    iget p1, p0, Lqc/t$a;->p:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqc/t$a;->p:I

    iget-object p1, p0, Lqc/t$a;->o:Lqc/t;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lqc/t;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
