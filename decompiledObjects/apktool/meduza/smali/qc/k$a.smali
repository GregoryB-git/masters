.class public final Lqc/k$a;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqc/k;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2"
    f = "Errors.kt"
    l = {
        0x9e
    }
    m = "emit"
.end annotation


# instance fields
.field public a:Lqc/k;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lqc/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field public d:I


# direct methods
.method public constructor <init>(Lqc/k;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/k<",
            "-TT;>;",
            "Lub/e<",
            "-",
            "Lqc/k$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqc/k$a;->c:Lqc/k;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqc/k$a;->b:Ljava/lang/Object;

    iget p1, p0, Lqc/k$a;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqc/k$a;->d:I

    iget-object p1, p0, Lqc/k$a;->c:Lqc/k;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lqc/k;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
