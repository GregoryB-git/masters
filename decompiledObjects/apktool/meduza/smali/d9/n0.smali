.class public final synthetic Ld9/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld9/l;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Ld9/v0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Ld9/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/n0;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p2, p0, Ld9/n0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Ld9/n0;->c:Ld9/v0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ld9/n0;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    iget-object v1, p0, Ld9/n0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 4
    .line 5
    iget-object v2, p0, Ld9/n0;->c:Ld9/v0;

    .line 6
    .line 7
    check-cast p1, Lcom/google/firebase/firestore/k;

    .line 8
    .line 9
    const-string v3, "Failed to register a listener for a query result"

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p2, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ld9/b0;

    .line 28
    .line 29
    invoke-interface {v1}, Ld9/b0;->remove()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p1, Lcom/google/firebase/firestore/k;->f:Ld9/u0;

    .line 33
    .line 34
    iget-boolean v1, v1, Ld9/u0;->b:Z

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    sget-object v1, Ld9/v0;->b:Ld9/v0;

    .line 39
    .line 40
    if-ne v2, v1, :cond_1

    .line 41
    .line 42
    new-instance p1, Lcom/google/firebase/firestore/f;

    .line 43
    .line 44
    const-string v1, "Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)"

    .line 45
    .line 46
    sget-object v2, Lcom/google/firebase/firestore/f$a;->s:Lcom/google/firebase/firestore/f$a;

    .line 47
    .line 48
    invoke-direct {p1, v1, v2}, Lcom/google/firebase/firestore/f;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/f$a;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    :goto_0
    return-void

    .line 59
    :catch_0
    move-exception p1

    .line 60
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 65
    .line 66
    .line 67
    new-array p2, p2, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {v3, p1, p2}, Lx6/b;->S(Ljava/lang/String;Ljava/lang/Exception;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    throw v4

    .line 73
    :catch_1
    move-exception p1

    .line 74
    new-array p2, p2, [Ljava/lang/Object;

    .line 75
    .line 76
    invoke-static {v3, p1, p2}, Lx6/b;->S(Ljava/lang/String;Ljava/lang/Exception;[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    throw v4
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
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
