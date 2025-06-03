.class public final Li2/j$a;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li2/j;->a(Landroid/app/Activity;)Lqc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/i;",
        "Ldc/p<",
        "Lpc/q<",
        "-",
        "Li2/k;",
        ">;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2"
    f = "WindowInfoTrackerImpl.kt"
    l = {
        0x3f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Li2/j;

.field public final synthetic d:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Li2/j;Landroid/app/Activity;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li2/j;",
            "Landroid/app/Activity;",
            "Lub/e<",
            "-",
            "Li2/j$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li2/j$a;->c:Li2/j;

    iput-object p2, p0, Li2/j$a;->d:Landroid/app/Activity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lub/e<",
            "*>;)",
            "Lub/e<",
            "Lrb/h;",
            ">;"
        }
    .end annotation

    new-instance v0, Li2/j$a;

    iget-object v1, p0, Li2/j$a;->c:Li2/j;

    iget-object v2, p0, Li2/j$a;->d:Landroid/app/Activity;

    invoke-direct {v0, v1, v2, p2}, Li2/j$a;-><init>(Li2/j;Landroid/app/Activity;Lub/e;)V

    iput-object p1, v0, Li2/j$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpc/q;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Li2/j$a;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Li2/j$a;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Li2/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    iget v1, p0, Li2/j$a;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Li2/j$a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lpc/q;

    .line 28
    .line 29
    new-instance v1, Lx0/k;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    invoke-direct {v1, p1, v3}, Lx0/k;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Li2/j$a;->c:Li2/j;

    .line 36
    .line 37
    iget-object v3, v3, Li2/j;->c:Lj2/a;

    .line 38
    .line 39
    iget-object v4, p0, Li2/j$a;->d:Landroid/app/Activity;

    .line 40
    .line 41
    new-instance v5, Lm1/b;

    .line 42
    .line 43
    const/4 v6, 0x4

    .line 44
    invoke-direct {v5, v6}, Lm1/b;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v3, v4, v5, v1}, Lj2/a;->a(Landroid/app/Activity;Lm1/b;Lx0/k;)V

    .line 48
    .line 49
    .line 50
    new-instance v3, Li2/j$a$a;

    .line 51
    .line 52
    iget-object v4, p0, Li2/j$a;->c:Li2/j;

    .line 53
    .line 54
    invoke-direct {v3, v4, v1}, Li2/j$a$a;-><init>(Li2/j;Lx0/k;)V

    .line 55
    .line 56
    .line 57
    iput v2, p0, Li2/j$a;->a:I

    .line 58
    .line 59
    invoke-static {p1, v3, p0}, Lpc/o;->a(Lpc/q;Ldc/a;Lub/e;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v0, :cond_2

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_2
    :goto_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 67
    .line 68
    return-object p1
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
