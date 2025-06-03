.class public LA4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ls3/e;LR4/l;Ls3/n;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ls3/e;->m()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {}, LC4/a;->g()LC4/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, LC4/a;->P(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, LB4/a;->b()LB4/a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, p1}, LB4/a;->h(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, LA4/f;

    .line 23
    .line 24
    invoke-direct {v2}, LA4/f;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, LB4/a;->i(LB4/a$a;)V

    .line 28
    .line 29
    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    invoke-static {}, Lcom/google/firebase/perf/metrics/AppStartTrace;->k()Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    invoke-virtual {p3, p1}, Lcom/google/firebase/perf/metrics/AppStartTrace;->u(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lcom/google/firebase/perf/metrics/AppStartTrace$c;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lcom/google/firebase/perf/metrics/AppStartTrace$c;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p4, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    new-instance p1, LA4/b$a;

    .line 48
    .line 49
    invoke-direct {p1, p0, v0}, LA4/b$a;-><init>(LA4/b;LC4/a;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, p1}, LR4/l;->e(LS4/b;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Lcom/google/firebase/perf/session/SessionManager;->initializeGaugeCollection()V

    .line 60
    .line 61
    .line 62
    return-void
.end method
