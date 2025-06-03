.class public final Lqc/b;
.super Lqc/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lqc/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final e:Ldc/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/p<",
            "Lpc/q<",
            "-TT;>;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldc/p;Lub/h;ILpc/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc/p<",
            "-",
            "Lpc/q<",
            "-TT;>;-",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lub/h;",
            "I",
            "Lpc/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lqc/c;-><init>(Ldc/p;Lub/h;ILpc/a;)V

    iput-object p1, p0, Lqc/b;->e:Ldc/p;

    return-void
.end method


# virtual methods
.method public final b(Lpc/q;Lub/e;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpc/q<",
            "-TT;>;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lqc/b$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lqc/b$a;

    .line 7
    .line 8
    iget v1, v0, Lqc/b$a;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lqc/b$a;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lqc/b$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lqc/b$a;-><init>(Lqc/b;Lub/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lqc/b$a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 28
    .line 29
    iget v2, v0, Lqc/b$a;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lqc/b$a;->a:Lpc/q;

    .line 37
    .line 38
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, v0, Lqc/b$a;->a:Lpc/q;

    .line 54
    .line 55
    iput v3, v0, Lqc/b$a;->d:I

    .line 56
    .line 57
    iget-object p2, p0, Lqc/c;->d:Ldc/p;

    .line 58
    .line 59
    invoke-interface {p2, p1, v0}, Ldc/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    if-ne p2, v1, :cond_3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    sget-object p2, Lrb/h;->a:Lrb/h;

    .line 67
    .line 68
    :goto_1
    if-ne p2, v1, :cond_4

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_4
    :goto_2
    invoke-interface {p1}, Lpc/t;->m()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_5

    .line 76
    .line 77
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string p2, "\'awaitClose { yourCallbackOrListener.cancel() }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."

    .line 83
    .line 84
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final c(Lub/h;ILpc/a;)Lrc/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/h;",
            "I",
            "Lpc/a;",
            ")",
            "Lrc/f<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lqc/b;

    iget-object v1, p0, Lqc/b;->e:Ldc/p;

    invoke-direct {v0, v1, p1, p2, p3}, Lqc/b;-><init>(Ldc/p;Lub/h;ILpc/a;)V

    return-object v0
.end method
