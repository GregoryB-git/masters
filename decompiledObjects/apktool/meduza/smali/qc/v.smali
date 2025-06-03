.class public final Lqc/v;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.flow.SubscribedFlowCollector"
    f = "Share.kt"
    l = {
        0x1a3,
        0x1a7
    }
    m = "onSubscription"
.end annotation


# instance fields
.field public a:Lqc/w;

.field public b:Lrc/o;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lqc/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/w<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public e:I


# direct methods
.method public constructor <init>(Lqc/w;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/w<",
            "Ljava/lang/Object;",
            ">;",
            "Lub/e<",
            "-",
            "Lqc/v;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqc/v;->d:Lqc/w;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqc/v;->c:Ljava/lang/Object;

    iget p1, p0, Lqc/v;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqc/v;->e:I

    iget-object p1, p0, Lqc/v;->d:Lqc/w;

    invoke-virtual {p1, p0}, Lqc/w;->a(Lub/e;)Lrb/h;

    move-result-object p1

    return-object p1
.end method
