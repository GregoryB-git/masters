.class public Lz2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final F:Lcom/google/android/gms/common/api/Status;

.field public static final G:Lcom/google/android/gms/common/api/Status;

.field public static final H:Ljava/lang/Object;

.field public static I:Lz2/e;


# instance fields
.field public A:Lz2/p;

.field public final B:Ljava/util/Set;

.field public final C:Ljava/util/Set;

.field public final D:Landroid/os/Handler;

.field public volatile E:Z

.field public o:J

.field public p:J

.field public q:J

.field public r:Z

.field public s:LA2/r;

.field public t:LA2/t;

.field public final u:Landroid/content/Context;

.field public final v:Lx2/j;

.field public final w:LA2/E;

.field public final x:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final y:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final z:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const-string v1, "Sign-out occurred while this API call was in progress."

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lz2/e;->F:Lcom/google/android/gms/common/api/Status;

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 12
    .line 13
    const-string v1, "The user must be signed in to make this API call."

    .line 14
    .line 15
    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lz2/e;->G:Lcom/google/android/gms/common/api/Status;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/Object;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lz2/e;->H:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lx2/j;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x1388

    .line 5
    .line 6
    iput-wide v0, p0, Lz2/e;->o:J

    .line 7
    .line 8
    const-wide/32 v0, 0x1d4c0

    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Lz2/e;->p:J

    .line 12
    .line 13
    const-wide/16 v0, 0x2710

    .line 14
    .line 15
    iput-wide v0, p0, Lz2/e;->q:J

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lz2/e;->r:Z

    .line 19
    .line 20
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lz2/e;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lz2/e;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 34
    .line 35
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    const/4 v3, 0x5

    .line 38
    const/high16 v4, 0x3f400000    # 0.75f

    .line 39
    .line 40
    invoke-direct {v1, v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lz2/e;->z:Ljava/util/Map;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    iput-object v1, p0, Lz2/e;->A:Lz2/p;

    .line 47
    .line 48
    new-instance v1, Lt/b;

    .line 49
    .line 50
    invoke-direct {v1}, Lt/b;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lz2/e;->B:Ljava/util/Set;

    .line 54
    .line 55
    new-instance v1, Lt/b;

    .line 56
    .line 57
    invoke-direct {v1}, Lt/b;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, Lz2/e;->C:Ljava/util/Set;

    .line 61
    .line 62
    iput-boolean v2, p0, Lz2/e;->E:Z

    .line 63
    .line 64
    iput-object p1, p0, Lz2/e;->u:Landroid/content/Context;

    .line 65
    .line 66
    new-instance v1, LK2/i;

    .line 67
    .line 68
    invoke-direct {v1, p2, p0}, LK2/i;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, Lz2/e;->D:Landroid/os/Handler;

    .line 72
    .line 73
    iput-object p3, p0, Lz2/e;->v:Lx2/j;

    .line 74
    .line 75
    new-instance p2, LA2/E;

    .line 76
    .line 77
    invoke-direct {p2, p3}, LA2/E;-><init>(Lx2/k;)V

    .line 78
    .line 79
    .line 80
    iput-object p2, p0, Lz2/e;->w:LA2/E;

    .line 81
    .line 82
    invoke-static {p1}, LE2/i;->a(Landroid/content/Context;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_0

    .line 87
    .line 88
    iput-boolean v0, p0, Lz2/e;->E:Z

    .line 89
    .line 90
    :cond_0
    const/4 p1, 0x6

    .line 91
    invoke-virtual {v1, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public static bridge synthetic A(Lz2/e;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lz2/e;->z:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic B(Lz2/e;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lz2/e;->B:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic C(Lz2/e;Z)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lz2/e;->r:Z

    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic e(Lz2/e;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lz2/e;->E:Z

    .line 2
    .line 3
    return p0
.end method

.method public static h(Lz2/b;Lx2/b;)Lcom/google/android/gms/common/api/Status;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz2/b;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v3, "API: "

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, " is not available on this device. Connection failed with: "

    .line 25
    .line 26
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/common/api/Status;-><init>(Lx2/b;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public static bridge synthetic n(Lz2/e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lz2/e;->o:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static bridge synthetic o(Lz2/e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lz2/e;->p:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static bridge synthetic p(Lz2/e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lz2/e;->q:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static bridge synthetic q(Lz2/e;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lz2/e;->u:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic r(Lz2/e;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lz2/e;->D:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic s(Lz2/e;)Lx2/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lz2/e;->v:Lx2/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic t()Lcom/google/android/gms/common/api/Status;
    .locals 1

    .line 1
    sget-object v0, Lz2/e;->G:Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic u(Lz2/b;Lx2/b;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lz2/e;->h(Lz2/b;Lx2/b;)Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static bridge synthetic v(Lz2/e;)Lz2/p;
    .locals 0

    .line 1
    iget-object p0, p0, Lz2/e;->A:Lz2/p;

    .line 2
    .line 3
    return-object p0
.end method

.method public static x(Landroid/content/Context;)Lz2/e;
    .locals 4

    .line 1
    sget-object v0, Lz2/e;->H:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lz2/e;->I:Lz2/e;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, LA2/h;->c()Landroid/os/HandlerThread;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Lz2/e;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {}, Lx2/j;->m()Lx2/j;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v2, p0, v1, v3}, Lz2/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lx2/j;)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lz2/e;->I:Lz2/e;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    sget-object p0, Lz2/e;->I:Lz2/e;

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-object p0

    .line 38
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    throw p0
.end method

.method public static bridge synthetic y(Lz2/e;)LA2/E;
    .locals 0

    .line 1
    iget-object p0, p0, Lz2/e;->w:LA2/E;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic z()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lz2/e;->H:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final D(Ly2/d;ILz2/m;LV2/k;Lz2/l;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Lz2/m;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, p4, v0, p1}, Lz2/e;->l(LV2/k;ILy2/d;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lz2/Q;

    .line 9
    .line 10
    invoke-direct {v0, p2, p3, p4, p5}, Lz2/Q;-><init>(ILz2/m;LV2/k;Lz2/l;)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lz2/e;->D:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance p3, Lz2/I;

    .line 16
    .line 17
    iget-object p4, p0, Lz2/e;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    invoke-direct {p3, v0, p4, p1}, Lz2/I;-><init>(Lz2/T;ILy2/d;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x4

    .line 27
    invoke-virtual {p2, p1, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final E(LA2/l;IJI)V
    .locals 8

    .line 1
    iget-object v0, p0, Lz2/e;->D:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v7, Lz2/H;

    .line 4
    .line 5
    move-object v1, v7

    .line 6
    move-object v2, p1

    .line 7
    move v3, p2

    .line 8
    move-wide v4, p3

    .line 9
    move v6, p5

    .line 10
    invoke-direct/range {v1 .. v6}, Lz2/H;-><init>(LA2/l;IJI)V

    .line 11
    .line 12
    .line 13
    const/16 p1, 0x12

    .line 14
    .line 15
    invoke-virtual {v0, p1, v7}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final F(Lx2/b;I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lz2/e;->g(Lx2/b;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lz2/e;->D:Landroid/os/Handler;

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, v1, p2, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/e;->D:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(Ly2/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/e;->D:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final c(Lz2/p;)V
    .locals 2

    .line 1
    sget-object v0, Lz2/e;->H:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lz2/e;->A:Lz2/p;

    .line 5
    .line 6
    if-eq v1, p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lz2/e;->A:Lz2/p;

    .line 9
    .line 10
    iget-object v1, p0, Lz2/e;->B:Ljava/util/Set;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    iget-object v1, p0, Lz2/e;->B:Ljava/util/Set;

    .line 19
    .line 20
    invoke-virtual {p1}, Lz2/p;->t()Lt/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p1
.end method

.method public final d(Lz2/p;)V
    .locals 2

    .line 1
    sget-object v0, Lz2/e;->H:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lz2/e;->A:Lz2/p;

    .line 5
    .line 6
    if-ne v1, p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lz2/e;->A:Lz2/p;

    .line 10
    .line 11
    iget-object p1, p0, Lz2/e;->B:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p1
.end method

.method public final f()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lz2/e;->r:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-static {}, LA2/o;->b()LA2/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LA2/o;->a()LA2/p;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0}, LA2/p;->f()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return v1

    .line 25
    :cond_2
    :goto_0
    iget-object v0, p0, Lz2/e;->w:LA2/E;

    .line 26
    .line 27
    iget-object v2, p0, Lz2/e;->u:Landroid/content/Context;

    .line 28
    .line 29
    const v3, 0xc1fa340

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2, v3}, LA2/E;->a(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v2, -0x1

    .line 37
    if-eq v0, v2, :cond_4

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    return v1

    .line 43
    :cond_4
    :goto_1
    const/4 v0, 0x1

    .line 44
    return v0
.end method

.method public final g(Lx2/b;I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/e;->v:Lx2/j;

    .line 2
    .line 3
    iget-object v1, p0, Lz2/e;->u:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2}, Lx2/j;->w(Landroid/content/Context;Lx2/b;I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 10

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    const-wide/32 v1, 0x493e0

    const/4 v3, 0x0

    const-string v4, "GoogleApiManager"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v7, 0x11

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown message id: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :pswitch_0
    iput-boolean v3, p0, Lz2/e;->r:Z

    goto/16 :goto_6

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lz2/H;

    iget-wide v0, p1, Lz2/H;->c:J

    const-wide/16 v8, 0x0

    cmp-long v0, v0, v8

    if-nez v0, :cond_0

    new-instance v0, LA2/r;

    iget v1, p1, Lz2/H;->b:I

    iget-object p1, p1, Lz2/H;->a:LA2/l;

    new-array v2, v5, [LA2/l;

    aput-object p1, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LA2/r;-><init>(ILjava/util/List;)V

    invoke-virtual {p0}, Lz2/e;->j()LA2/t;

    move-result-object p1

    invoke-interface {p1, v0}, LA2/t;->a(LA2/r;)LV2/j;

    goto/16 :goto_6

    :cond_0
    iget-object v0, p0, Lz2/e;->s:LA2/r;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LA2/r;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, LA2/r;->a()I

    move-result v0

    iget v2, p1, Lz2/H;->b:I

    if-ne v0, v2, :cond_2

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p1, Lz2/H;->d:I

    if-lt v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lz2/e;->s:LA2/r;

    iget-object v1, p1, Lz2/H;->a:LA2/l;

    invoke-virtual {v0, v1}, LA2/r;->f(LA2/l;)V

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v0, p0, Lz2/e;->D:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p0}, Lz2/e;->k()V

    :cond_3
    :goto_1
    iget-object v0, p0, Lz2/e;->s:LA2/r;

    if-nez v0, :cond_d

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p1, Lz2/H;->a:LA2/l;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LA2/r;

    iget v2, p1, Lz2/H;->b:I

    invoke-direct {v1, v2, v0}, LA2/r;-><init>(ILjava/util/List;)V

    iput-object v1, p0, Lz2/e;->s:LA2/r;

    iget-object v0, p0, Lz2/e;->D:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    iget-wide v2, p1, Lz2/H;->c:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_6

    :pswitch_2
    invoke-virtual {p0}, Lz2/e;->k()V

    goto/16 :goto_6

    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lz2/z;

    iget-object v0, p0, Lz2/e;->z:Ljava/util/Map;

    invoke-static {p1}, Lz2/z;->b(Lz2/z;)Lz2/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lz2/e;->z:Ljava/util/Map;

    invoke-static {p1}, Lz2/z;->b(Lz2/z;)Lz2/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/x;

    invoke-static {v0, p1}, Lz2/x;->B(Lz2/x;Lz2/z;)V

    goto/16 :goto_6

    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lz2/z;

    iget-object v0, p0, Lz2/e;->z:Ljava/util/Map;

    invoke-static {p1}, Lz2/z;->b(Lz2/z;)Lz2/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lz2/e;->z:Ljava/util/Map;

    invoke-static {p1}, Lz2/z;->b(Lz2/z;)Lz2/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/x;

    invoke-static {v0, p1}, Lz2/x;->A(Lz2/x;Lz2/z;)V

    goto/16 :goto_6

    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    throw v6

    :pswitch_6
    iget-object v0, p0, Lz2/e;->z:Ljava/util/Map;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lz2/e;->z:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/x;

    invoke-virtual {p1}, Lz2/x;->a()Z

    goto/16 :goto_6

    :pswitch_7
    iget-object v0, p0, Lz2/e;->z:Ljava/util/Map;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lz2/e;->z:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/x;

    invoke-virtual {p1}, Lz2/x;->K()V

    goto/16 :goto_6

    :pswitch_8
    iget-object p1, p0, Lz2/e;->C:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/b;

    iget-object v1, p0, Lz2/e;->z:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/x;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lz2/x;->J()V

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lz2/e;->C:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    goto/16 :goto_6

    :pswitch_9
    iget-object v0, p0, Lz2/e;->z:Ljava/util/Map;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lz2/e;->z:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/x;

    invoke-virtual {p1}, Lz2/x;->I()V

    goto/16 :goto_6

    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ly2/d;

    invoke-virtual {p0, p1}, Lz2/e;->i(Ly2/d;)Lz2/x;

    goto/16 :goto_6

    :pswitch_b
    iget-object p1, p0, Lz2/e;->u:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    instance-of p1, p1, Landroid/app/Application;

    if-eqz p1, :cond_d

    iget-object p1, p0, Lz2/e;->u:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lz2/c;->c(Landroid/app/Application;)V

    invoke-static {}, Lz2/c;->b()Lz2/c;

    move-result-object p1

    new-instance v0, Lz2/s;

    invoke-direct {v0, p0}, Lz2/s;-><init>(Lz2/e;)V

    invoke-virtual {p1, v0}, Lz2/c;->a(Lz2/c$a;)V

    invoke-static {}, Lz2/c;->b()Lz2/c;

    move-result-object p1

    invoke-virtual {p1, v5}, Lz2/c;->e(Z)Z

    move-result p1

    if-nez p1, :cond_d

    iput-wide v1, p0, Lz2/e;->q:J

    goto/16 :goto_6

    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lx2/b;

    iget-object v1, p0, Lz2/e;->z:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz2/x;

    invoke-virtual {v2}, Lz2/x;->q()I

    move-result v3

    if-ne v3, v0, :cond_6

    move-object v6, v2

    :cond_7
    if-eqz v6, :cond_9

    invoke-virtual {p1}, Lx2/b;->a()I

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_8

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    iget-object v1, p0, Lz2/e;->v:Lx2/j;

    invoke-virtual {p1}, Lx2/b;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lx2/j;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lx2/b;->d()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error resolution was canceled by the user, original error message: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v7, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v6, v0}, Lz2/x;->x(Lz2/x;Lcom/google/android/gms/common/api/Status;)V

    goto/16 :goto_6

    :cond_8
    invoke-static {v6}, Lz2/x;->u(Lz2/x;)Lz2/b;

    move-result-object v0

    invoke-static {v0, p1}, Lz2/e;->h(Lz2/b;Lx2/b;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-static {v6, p1}, Lz2/x;->x(Lz2/x;Lcom/google/android/gms/common/api/Status;)V

    goto/16 :goto_6

    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not find API instance "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " while trying to fail enqueued calls."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_6

    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lz2/I;

    iget-object v0, p0, Lz2/e;->z:Ljava/util/Map;

    iget-object v1, p1, Lz2/I;->c:Ly2/d;

    invoke-virtual {v1}, Ly2/d;->d()Lz2/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/x;

    if-nez v0, :cond_a

    iget-object v0, p1, Lz2/I;->c:Ly2/d;

    invoke-virtual {p0, v0}, Lz2/e;->i(Ly2/d;)Lz2/x;

    move-result-object v0

    :cond_a
    invoke-virtual {v0}, Lz2/x;->L()Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Lz2/e;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget v2, p1, Lz2/I;->b:I

    if-eq v1, v2, :cond_b

    iget-object p1, p1, Lz2/I;->a:Lz2/T;

    sget-object v1, Lz2/e;->F:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1, v1}, Lz2/T;->a(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0}, Lz2/x;->J()V

    goto :goto_6

    :cond_b
    iget-object p1, p1, Lz2/I;->a:Lz2/T;

    invoke-virtual {v0, p1}, Lz2/x;->E(Lz2/T;)V

    goto :goto_6

    :pswitch_e
    iget-object p1, p0, Lz2/e;->z:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/x;

    invoke-virtual {v0}, Lz2/x;->C()V

    invoke-virtual {v0}, Lz2/x;->D()V

    goto :goto_3

    :pswitch_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    throw v6

    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eq v5, p1, :cond_c

    goto :goto_4

    :cond_c
    const-wide/16 v1, 0x2710

    :goto_4
    iput-wide v1, p0, Lz2/e;->q:J

    iget-object p1, p0, Lz2/e;->D:Landroid/os/Handler;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lz2/e;->z:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz2/b;

    iget-object v2, p0, Lz2/e;->D:Landroid/os/Handler;

    invoke-virtual {v2, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-wide v3, p0, Lz2/e;->q:J

    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_5

    :cond_d
    :goto_6
    return v5

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ly2/d;)Lz2/x;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ly2/d;->d()Lz2/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lz2/e;->z:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lz2/x;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lz2/x;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1}, Lz2/x;-><init>(Lz2/e;Ly2/d;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lz2/e;->z:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {v1}, Lz2/x;->L()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Lz2/e;->C:Ljava/util/Set;

    .line 32
    .line 33
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v1}, Lz2/x;->D()V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public final j()LA2/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/e;->t:LA2/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lz2/e;->u:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v0}, LA2/s;->a(Landroid/content/Context;)LA2/t;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lz2/e;->t:LA2/t;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lz2/e;->t:LA2/t;

    .line 14
    .line 15
    return-object v0
.end method

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/e;->s:LA2/r;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, LA2/r;->a()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-gtz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lz2/e;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lz2/e;->j()LA2/t;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1, v0}, LA2/t;->a(LA2/r;)LV2/j;

    .line 22
    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lz2/e;->s:LA2/r;

    .line 26
    .line 27
    :cond_2
    return-void
.end method

.method public final l(LV2/k;ILy2/d;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p3}, Ly2/d;->d()Lz2/b;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-static {p0, p2, p3}, Lz2/G;->b(Lz2/e;ILz2/b;)Lz2/G;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, LV2/k;->a()LV2/j;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p3, p0, Lz2/e;->D:Landroid/os/Handler;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v0, Lz2/r;

    .line 23
    .line 24
    invoke-direct {v0, p3}, Lz2/r;-><init>(Landroid/os/Handler;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0, p2}, LV2/j;->c(Ljava/util/concurrent/Executor;LV2/e;)LV2/j;

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final m()I
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/e;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final w(Lz2/b;)Lz2/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/e;->z:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lz2/x;

    .line 8
    .line 9
    return-object p1
.end method
