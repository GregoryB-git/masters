.class public final synthetic Ld9/h;
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

    iput-object p1, p0, Ld9/h;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p2, p0, Ld9/h;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Ld9/h;->c:Ld9/v0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ld9/h;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    iget-object v1, p0, Ld9/h;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 4
    .line 5
    iget-object v2, p0, Ld9/h;->c:Ld9/v0;

    .line 6
    .line 7
    check-cast p1, Lcom/google/firebase/firestore/d;

    .line 8
    .line 9
    const-string v3, "Failed to register a listener for a single document"

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 14
    .line 15
    .line 16
    goto :goto_3

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
    iget-object v1, p1, Lcom/google/firebase/firestore/d;->c:Lj9/g;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    move v6, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v6, v4

    .line 40
    :goto_0
    if-nez v6, :cond_2

    .line 41
    .line 42
    iget-object v6, p1, Lcom/google/firebase/firestore/d;->d:Ld9/u0;

    .line 43
    .line 44
    iget-boolean v6, v6, Ld9/u0;->b:Z

    .line 45
    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    new-instance p1, Lcom/google/firebase/firestore/f;

    .line 49
    .line 50
    const-string v1, "Failed to get document because the client is offline."

    .line 51
    .line 52
    sget-object v2, Lcom/google/firebase/firestore/f$a;->s:Lcom/google/firebase/firestore/f$a;

    .line 53
    .line 54
    invoke-direct {p1, v1, v2}, Lcom/google/firebase/firestore/f;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/f$a;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    if-eqz v1, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move v5, v4

    .line 62
    :goto_1
    if-eqz v5, :cond_4

    .line 63
    .line 64
    iget-object v1, p1, Lcom/google/firebase/firestore/d;->d:Ld9/u0;

    .line 65
    .line 66
    iget-boolean v1, v1, Ld9/u0;->b:Z

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    sget-object v1, Ld9/v0;->b:Ld9/v0;

    .line 71
    .line 72
    if-ne v2, v1, :cond_4

    .line 73
    .line 74
    new-instance p1, Lcom/google/firebase/firestore/f;

    .line 75
    .line 76
    const-string v1, "Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)"

    .line 77
    .line 78
    sget-object v2, Lcom/google/firebase/firestore/f$a;->s:Lcom/google/firebase/firestore/f$a;

    .line 79
    .line 80
    invoke-direct {p1, v1, v2}, Lcom/google/firebase/firestore/f;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/f$a;)V

    .line 81
    .line 82
    .line 83
    :goto_2
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    :goto_3
    return-void

    .line 91
    :catch_0
    move-exception p1

    .line 92
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 97
    .line 98
    .line 99
    new-array v0, v4, [Ljava/lang/Object;

    .line 100
    .line 101
    invoke-static {v3, p1, v0}, Lx6/b;->S(Ljava/lang/String;Ljava/lang/Exception;[Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    throw p2

    .line 105
    :catch_1
    move-exception p1

    .line 106
    new-array v0, v4, [Ljava/lang/Object;

    .line 107
    .line 108
    invoke-static {v3, p1, v0}, Lx6/b;->S(Ljava/lang/String;Ljava/lang/Exception;[Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    throw p2
    .line 112
    .line 113
    .line 114
    .line 115
.end method
