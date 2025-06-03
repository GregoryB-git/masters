.class public final LG4/j;
.super LB4/b;
.source "SourceFile"

# interfaces
.implements LJ4/b;


# static fields
.field public static final A:LF4/a;


# instance fields
.field public final s:Ljava/util/List;

.field public final t:Lcom/google/firebase/perf/session/gauges/GaugeManager;

.field public final u:LL4/k;

.field public final v:LN4/h$b;

.field public final w:Ljava/lang/ref/WeakReference;

.field public x:Ljava/lang/String;

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, LF4/a;->e()LF4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, LG4/j;->A:LF4/a;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(LL4/k;)V
    .locals 2

    .line 1
    invoke-static {}, LB4/a;->b()LB4/a;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->getInstance()Lcom/google/firebase/perf/session/gauges/GaugeManager;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, LG4/j;-><init>(LL4/k;LB4/a;Lcom/google/firebase/perf/session/gauges/GaugeManager;)V

    return-void
.end method

.method public constructor <init>(LL4/k;LB4/a;Lcom/google/firebase/perf/session/gauges/GaugeManager;)V
    .locals 0

    .line 2
    invoke-direct {p0, p2}, LB4/b;-><init>(LB4/a;)V

    invoke-static {}, LN4/h;->H0()LN4/h$b;

    move-result-object p2

    iput-object p2, p0, LG4/j;->v:LN4/h$b;

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, LG4/j;->w:Ljava/lang/ref/WeakReference;

    iput-object p1, p0, LG4/j;->u:LL4/k;

    iput-object p3, p0, LG4/j;->t:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LG4/j;->s:Ljava/util/List;

    invoke-virtual {p0}, LB4/b;->e()V

    return-void
.end method

.method public static h(LL4/k;)LG4/j;
    .locals 1

    .line 1
    new-instance v0, LG4/j;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LG4/j;-><init>(LL4/k;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private m()Z
    .locals 1

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LN4/h$b;->I()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method private n()Z
    .locals 1

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LN4/h$b;->K()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static o(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x80

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-le v0, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    move v0, v2

    .line 12
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/16 v3, 0x1f

    .line 23
    .line 24
    if-le v1, v3, :cond_2

    .line 25
    .line 26
    const/16 v3, 0x7f

    .line 27
    .line 28
    if-le v1, v3, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    :goto_1
    return v2

    .line 35
    :cond_3
    const/4 p0, 0x1

    .line 36
    return p0
.end method


# virtual methods
.method public A(J)LG4/j;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LN4/h$b;->U(J)LN4/h$b;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()LJ4/a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, LJ4/a;->e()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, LG4/j;->t:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    .line 21
    .line 22
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()LJ4/a;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2}, LJ4/a;->d()LM4/l;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p1, p2}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->collectGaugeMetricOnce(LM4/l;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-object p0
.end method

.method public B(J)LG4/j;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LN4/h$b;->V(J)LN4/h$b;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public C(Ljava/lang/String;)LG4/j;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, LM4/o;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 8
    .line 9
    const/16 v1, 0x7d0

    .line 10
    .line 11
    invoke-static {p1, v1}, LM4/o;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, LN4/h$b;->W(Ljava/lang/String;)LN4/h$b;

    .line 16
    .line 17
    .line 18
    :cond_0
    return-object p0
.end method

.method public E(Ljava/lang/String;)LG4/j;
    .locals 0

    .line 1
    iput-object p1, p0, LG4/j;->x:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public a(LJ4/a;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LG4/j;->A:LF4/a;

    .line 4
    .line 5
    const-string v0, "Unable to add new SessionId to the Network Trace. Continuing without it."

    .line 6
    .line 7
    invoke-virtual {p1, v0}, LF4/a;->j(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-direct {p0}, LG4/j;->m()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-direct {p0}, LG4/j;->n()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, LG4/j;->s:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public g()LN4/h;
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LG4/j;->w:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/firebase/perf/session/SessionManager;->unregisterForSessionUpdates(Ljava/lang/ref/WeakReference;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LB4/b;->f()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, LG4/j;->i()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, LJ4/a;->b(Ljava/util/List;)[LN4/k;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, LG4/j;->v:LN4/h$b;

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v1, v0}, LN4/h$b;->D(Ljava/lang/Iterable;)LN4/h$b;

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, LN4/h;

    .line 39
    .line 40
    iget-object v1, p0, LG4/j;->x:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1}, LI4/j;->c(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    sget-object v1, LG4/j;->A:LF4/a;

    .line 49
    .line 50
    const-string v2, "Dropping network request from a \'User-Agent\' that is not allowed"

    .line 51
    .line 52
    invoke-virtual {v1, v2}, LF4/a;->a(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_1
    iget-boolean v1, p0, LG4/j;->y:Z

    .line 57
    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    iget-object v1, p0, LG4/j;->u:LL4/k;

    .line 61
    .line 62
    invoke-virtual {p0}, LB4/b;->c()LN4/d;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1, v0, v2}, LL4/k;->C(LN4/h;LN4/d;)V

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    iput-boolean v1, p0, LG4/j;->y:Z

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_2
    iget-boolean v1, p0, LG4/j;->z:Z

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    sget-object v1, LG4/j;->A:LF4/a;

    .line 78
    .line 79
    const-string v2, "This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response"

    .line 80
    .line 81
    invoke-virtual {v1, v2}, LF4/a;->a(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    return-object v0
.end method

.method public i()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, LG4/j;->s:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, LG4/j;->s:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, LJ4/a;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    monitor-exit v0

    .line 40
    return-object v1

    .line 41
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw v1
.end method

.method public j()J
    .locals 2

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LN4/h$b;->G()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LN4/h$b;->H()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LN4/h$b;->J()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public p(Ljava/util/Map;)LG4/j;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LN4/h$b;->E()LN4/h$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LN4/h$b;->L(Ljava/util/Map;)LN4/h$b;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public q(Ljava/lang/String;)LG4/j;
    .locals 2

    .line 1
    if-eqz p1, :cond_9

    .line 2
    .line 3
    sget-object v0, LN4/h$d;->p:LN4/h$d;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, -0x1

    .line 17
    sparse-switch v0, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :sswitch_0
    const-string v0, "DELETE"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_0
    const/16 v1, 0x8

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :sswitch_1
    const-string v0, "CONNECT"

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v1, 0x7

    .line 46
    goto :goto_0

    .line 47
    :sswitch_2
    const-string v0, "TRACE"

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 v1, 0x6

    .line 57
    goto :goto_0

    .line 58
    :sswitch_3
    const-string v0, "PATCH"

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const/4 v1, 0x5

    .line 68
    goto :goto_0

    .line 69
    :sswitch_4
    const-string v0, "POST"

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_4

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    const/4 v1, 0x4

    .line 79
    goto :goto_0

    .line 80
    :sswitch_5
    const-string v0, "HEAD"

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_5

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    const/4 v1, 0x3

    .line 90
    goto :goto_0

    .line 91
    :sswitch_6
    const-string v0, "PUT"

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_6

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_6
    const/4 v1, 0x2

    .line 101
    goto :goto_0

    .line 102
    :sswitch_7
    const-string v0, "GET"

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-nez p1, :cond_7

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_7
    const/4 v1, 0x1

    .line 112
    goto :goto_0

    .line 113
    :sswitch_8
    const-string v0, "OPTIONS"

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_8

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_8
    const/4 v1, 0x0

    .line 123
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 124
    .line 125
    .line 126
    sget-object p1, LN4/h$d;->p:LN4/h$d;

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :pswitch_0
    sget-object p1, LN4/h$d;->t:LN4/h$d;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :pswitch_1
    sget-object p1, LN4/h$d;->y:LN4/h$d;

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :pswitch_2
    sget-object p1, LN4/h$d;->x:LN4/h$d;

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :pswitch_3
    sget-object p1, LN4/h$d;->v:LN4/h$d;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :pswitch_4
    sget-object p1, LN4/h$d;->s:LN4/h$d;

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :pswitch_5
    sget-object p1, LN4/h$d;->u:LN4/h$d;

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :pswitch_6
    sget-object p1, LN4/h$d;->r:LN4/h$d;

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :pswitch_7
    sget-object p1, LN4/h$d;->q:LN4/h$d;

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :pswitch_8
    sget-object p1, LN4/h$d;->w:LN4/h$d;

    .line 154
    .line 155
    :goto_1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 156
    .line 157
    invoke-virtual {v0, p1}, LN4/h$b;->N(LN4/h$d;)LN4/h$b;

    .line 158
    .line 159
    .line 160
    :cond_9
    return-object p0

    .line 161
    :sswitch_data_0
    .sparse-switch
        -0x1faded82 -> :sswitch_8
        0x11336 -> :sswitch_7
        0x136ef -> :sswitch_6
        0x21c5e0 -> :sswitch_5
        0x2590a0 -> :sswitch_4
        0x4862828 -> :sswitch_3
        0x4c5f925 -> :sswitch_2
        0x638004ca -> :sswitch_1
        0x77f979ab -> :sswitch_0
    .end sparse-switch

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public r(I)LG4/j;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN4/h$b;->O(I)LN4/h$b;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public t()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LG4/j;->z:Z

    .line 3
    .line 4
    return-void
.end method

.method public u()LG4/j;
    .locals 2

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    sget-object v1, LN4/h$e;->q:LN4/h$e;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LN4/h$b;->P(LN4/h$e;)LN4/h$b;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public v(J)LG4/j;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LN4/h$b;->Q(J)LN4/h$b;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public w(J)LG4/j;
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()LJ4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, LG4/j;->w:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lcom/google/firebase/perf/session/SessionManager;->registerForSessionUpdates(Ljava/lang/ref/WeakReference;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LG4/j;->v:LN4/h$b;

    .line 19
    .line 20
    invoke-virtual {v1, p1, p2}, LN4/h$b;->M(J)LN4/h$b;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, LG4/j;->a(LJ4/a;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, LJ4/a;->e()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    iget-object p1, p0, LG4/j;->t:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    .line 33
    .line 34
    invoke-virtual {v0}, LJ4/a;->d()LM4/l;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p1, p2}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->collectGaugeMetricOnce(LM4/l;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-object p0
.end method

.method public x(Ljava/lang/String;)LG4/j;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LG4/j;->v:LN4/h$b;

    .line 4
    .line 5
    invoke-virtual {p1}, LN4/h$b;->F()LN4/h$b;

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-static {p1}, LG4/j;->o(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, LN4/h$b;->R(Ljava/lang/String;)LN4/h$b;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object v0, LG4/j;->A:LF4/a;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v2, "The content type of the response is not a valid content-type:"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1}, LF4/a;->j(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-object p0
.end method

.method public y(J)LG4/j;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LN4/h$b;->S(J)LN4/h$b;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public z(J)LG4/j;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/j;->v:LN4/h$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LN4/h$b;->T(J)LN4/h$b;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
