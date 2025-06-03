.class public final Lqc/i$a;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqc/i;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1"
    f = "Errors.kt"
    l = {
        0x72,
        0x73
    }
    m = "collect"
.end annotation


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lqc/i;

.field public d:Lqc/i;

.field public e:Lqc/f;


# direct methods
.method public constructor <init>(Lqc/i;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lqc/i$a;->c:Lqc/i;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqc/i$a;->a:Ljava/lang/Object;

    iget p1, p0, Lqc/i$a;->b:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqc/i$a;->b:I

    iget-object p1, p0, Lqc/i$a;->c:Lqc/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lqc/i;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
