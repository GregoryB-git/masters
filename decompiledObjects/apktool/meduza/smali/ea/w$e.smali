.class public final Lea/w$e;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/q;


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
        "Ldc/q<",
        "Lqc/f<",
        "-",
        "Lr0/d;",
        ">;",
        "Ljava/lang/Throwable;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1"
    f = "SessionDatastore.kt"
    l = {
        0x4c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Lqc/f;

.field public synthetic c:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lub/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-",
            "Lea/w$e;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final f(Lqc/f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lub/e;

    new-instance v0, Lea/w$e;

    invoke-direct {v0, p3}, Lea/w$e;-><init>(Lub/e;)V

    iput-object p1, v0, Lea/w$e;->b:Lqc/f;

    iput-object p2, v0, Lea/w$e;->c:Ljava/lang/Throwable;

    sget-object p1, Lrb/h;->a:Lrb/h;

    invoke-virtual {v0, p1}, Lea/w$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    iget v1, p0, Lea/w$e;->a:I

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
    iget-object p1, p0, Lea/w$e;->b:Lqc/f;

    .line 26
    .line 27
    iget-object v1, p0, Lea/w$e;->c:Ljava/lang/Throwable;

    .line 28
    .line 29
    const-string v3, "FirebaseSessionsRepo"

    .line 30
    .line 31
    const-string v4, "Error reading stored session data."

    .line 32
    .line 33
    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 34
    .line 35
    .line 36
    new-instance v1, Lr0/a;

    .line 37
    .line 38
    invoke-direct {v1, v2, v2}, Lr0/a;-><init>(ZI)V

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    iput-object v3, p0, Lea/w$e;->b:Lqc/f;

    .line 43
    .line 44
    iput v2, p0, Lea/w$e;->a:I

    .line 45
    .line 46
    invoke-interface {p1, v1, p0}, Lqc/f;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    :goto_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 54
    .line 55
    return-object p1
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
