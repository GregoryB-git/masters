.class public final synthetic Lg9/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/j;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/io/Serializable;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lg9/q;->a:Ljava/lang/Object;

    iput-object p2, p0, Lg9/q;->b:Ljava/io/Serializable;

    iput-object p3, p0, Lg9/q;->c:Ljava/lang/Object;

    iput-object p4, p0, Lg9/q;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le9/e;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lg9/q;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg9/u;

    .line 4
    .line 5
    iget-object v1, p0, Lg9/q;->b:Ljava/io/Serializable;

    .line 6
    .line 7
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    iget-object v2, p0, Lg9/q;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 12
    .line 13
    iget-object v3, p0, Lg9/q;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ln9/a;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x1

    .line 22
    invoke-virtual {v1, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    xor-int/2addr v0, v5

    .line 37
    new-array v1, v4, [Ljava/lang/Object;

    .line 38
    .line 39
    const-string v3, "Already fulfilled first user task"

    .line 40
    .line 41
    invoke-static {v3, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v1, Lx0/q0;

    .line 49
    .line 50
    const/16 v2, 0xd

    .line 51
    .line 52
    invoke-direct {v1, v2, v0, p1}, Lx0/q0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v1}, Ln9/a;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 56
    .line 57
    .line 58
    :goto_0
    return-void
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

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lg9/q;->a:Ljava/lang/Object;

    check-cast v0, Lo9/e;

    iget-object v1, p0, Lg9/q;->b:Ljava/io/Serializable;

    check-cast v1, Ljava/net/URL;

    iget-object v2, p0, Lg9/q;->c:Ljava/lang/Object;

    iget-object v3, p0, Lg9/q;->d:Ljava/lang/Object;

    check-cast v3, Lo9/m;

    sget-object v4, Lo9/e;->j:Lcom/google/android/gms/tasks/TaskCompletionSource;

    const-string v4, "this$0"

    invoke-static {v0, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "$url"

    invoke-static {v1, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "$options"

    invoke-static {v3, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "task"

    invoke-static {p1, v4}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo9/n;

    invoke-virtual {v0, v1, v2, p1, v3}, Lo9/e;->a(Ljava/net/URL;Ljava/lang/Object;Lo9/n;Lo9/m;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :goto_0
    return-object p1
.end method
