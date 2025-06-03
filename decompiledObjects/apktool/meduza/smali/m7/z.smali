.class public final Lm7/z;
.super Lm7/w;
.source "SourceFile"


# instance fields
.field public final synthetic o:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic p:Lm7/w;

.field public final synthetic q:Lm7/e;


# direct methods
.method public constructor <init>(Lm7/e;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Lm7/w;)V
    .locals 0

    iput-object p1, p0, Lm7/z;->q:Lm7/e;

    iput-object p3, p0, Lm7/z;->o:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p4, p0, Lm7/z;->p:Lm7/w;

    invoke-direct {p0, p2}, Lm7/w;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lm7/z;->q:Lm7/e;

    .line 2
    .line 3
    iget-object v0, v0, Lm7/e;->f:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lm7/z;->q:Lm7/e;

    .line 7
    .line 8
    iget-object v2, p0, Lm7/z;->o:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 9
    .line 10
    iget-object v3, v1, Lm7/e;->e:Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    new-instance v4, Lm7/y;

    .line 20
    .line 21
    invoke-direct {v4, v1, v2}, Lm7/y;-><init>(Lm7/e;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v4}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lm7/z;->q:Lm7/e;

    .line 28
    .line 29
    iget-object v1, v1, Lm7/e;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-lez v1, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Lm7/z;->q:Lm7/e;

    .line 38
    .line 39
    iget-object v1, v1, Lm7/e;->b:Lm7/v;

    .line 40
    .line 41
    const-string v2, "Already connected to the service."

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    new-array v3, v3, [Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v1, v2, v3}, Lm7/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object v1, p0, Lm7/z;->q:Lm7/e;

    .line 50
    .line 51
    iget-object v2, p0, Lm7/z;->p:Lm7/w;

    .line 52
    .line 53
    invoke-static {v1, v2}, Lm7/e;->b(Lm7/e;Lm7/w;)V

    .line 54
    .line 55
    .line 56
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception v1

    .line 59
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    throw v1
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
