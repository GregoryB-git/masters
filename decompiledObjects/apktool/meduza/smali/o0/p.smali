.class public final Lo0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lnc/d0;

.field public final b:Ldc/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/p<",
            "TT;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lpc/b;

.field public final d:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Lnc/d0;Lo0/r;Lo0/s;Lo0/t;)V
    .locals 2

    const-string v0, "onUndeliveredElement"

    invoke-static {p3, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/p;->a:Lnc/d0;

    iput-object p4, p0, Lo0/p;->b:Ldc/p;

    const p4, 0x7fffffff

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p4, v0, v1}, Lpc/i;->a(ILpc/a;I)Lpc/b;

    move-result-object p4

    iput-object p4, p0, Lo0/p;->c:Lpc/b;

    new-instance p4, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p4, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p4, p0, Lo0/p;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-interface {p1}, Lnc/d0;->f()Lub/h;

    move-result-object p1

    sget-object p4, Lnc/j1$b;->a:Lnc/j1$b;

    invoke-interface {p1, p4}, Lub/h;->get(Lub/h$c;)Lub/h$b;

    move-result-object p1

    check-cast p1, Lnc/j1;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p4, Lo0/n;

    invoke-direct {p4, p2, p0, p3}, Lo0/n;-><init>(Lo0/r;Lo0/p;Lo0/s;)V

    invoke-interface {p1, p4}, Lnc/j1;->invokeOnCompletion(Ldc/l;)Lnc/t0;

    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lo0/q$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo0/p;->c:Lpc/b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lpc/t;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of v0, p1, Lpc/j$a;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p1, Lpc/j$a;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v1

    .line 18
    :goto_0
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-object v1, p1, Lpc/j$a;->a:Ljava/lang/Throwable;

    .line 21
    .line 22
    :cond_1
    if-nez v1, :cond_2

    .line 23
    .line 24
    new-instance v1, Lpc/m;

    .line 25
    .line 26
    const-string p1, "Channel was closed normally"

    .line 27
    .line 28
    invoke-direct {v1, p1}, Lpc/m;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    throw v1

    .line 32
    :cond_3
    instance-of p1, p1, Lpc/j$b;

    .line 33
    .line 34
    xor-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    if-eqz p1, :cond_5

    .line 37
    .line 38
    iget-object p1, p0, Lo0/p;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_4

    .line 45
    .line 46
    iget-object p1, p0, Lo0/p;->a:Lnc/d0;

    .line 47
    .line 48
    new-instance v0, Lo0/o;

    .line 49
    .line 50
    invoke-direct {v0, p0, v1}, Lo0/o;-><init>(Lo0/p;Lub/e;)V

    .line 51
    .line 52
    .line 53
    const/4 v2, 0x3

    .line 54
    invoke-static {p1, v1, v0, v2}, Lx6/b;->g0(Lnc/d0;Ltc/b;Ldc/p;I)Lnc/z1;

    .line 55
    .line 56
    .line 57
    :cond_4
    return-void

    .line 58
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v0, "Check failed."

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
