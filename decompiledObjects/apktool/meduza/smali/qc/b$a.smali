.class public final Lqc/b$a;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqc/b;->b(Lpc/q;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.flow.CallbackFlowBuilder"
    f = "Builders.kt"
    l = {
        0x14e
    }
    m = "collectTo"
.end annotation


# instance fields
.field public a:Lpc/q;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lqc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public d:I


# direct methods
.method public constructor <init>(Lqc/b;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/b<",
            "TT;>;",
            "Lub/e<",
            "-",
            "Lqc/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqc/b$a;->c:Lqc/b;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqc/b$a;->b:Ljava/lang/Object;

    iget p1, p0, Lqc/b$a;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqc/b$a;->d:I

    iget-object p1, p0, Lqc/b$a;->c:Lqc/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lqc/b;->b(Lpc/q;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
