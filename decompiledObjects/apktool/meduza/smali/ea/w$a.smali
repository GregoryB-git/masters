.class public final Lea/w$a;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/w;-><init>(Landroid/content/Context;Lub/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/i;",
        "Ldc/p<",
        "Lnc/d0;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "com.google.firebase.sessions.SessionDatastoreImpl$1"
    f = "SessionDatastore.kt"
    l = {
        0x52
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lea/w;


# direct methods
.method public constructor <init>(Lea/w;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lea/w;",
            "Lub/e<",
            "-",
            "Lea/w$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lea/w$a;->b:Lea/w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 1
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

    new-instance p1, Lea/w$a;

    iget-object v0, p0, Lea/w$a;->b:Lea/w;

    invoke-direct {p1, v0, p2}, Lea/w$a;-><init>(Lea/w;Lub/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lea/w$a;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lea/w$a;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lea/w$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    iget v1, p0, Lea/w$a;->a:I

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
    iget-object p1, p0, Lea/w$a;->b:Lea/w;

    .line 26
    .line 27
    iget-object v1, p1, Lea/w;->d:Lea/w$f;

    .line 28
    .line 29
    new-instance v3, Lea/w$a$a;

    .line 30
    .line 31
    invoke-direct {v3, p1}, Lea/w$a$a;-><init>(Lea/w;)V

    .line 32
    .line 33
    .line 34
    iput v2, p0, Lea/w$a;->a:I

    .line 35
    .line 36
    invoke-virtual {v1, v3, p0}, Lea/w$f;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2
    :goto_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 44
    .line 45
    return-object p1
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
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
