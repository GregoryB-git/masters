.class public final synthetic Lg9/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lg9/u;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;Lg9/f;Lm9/z;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg9/p;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/p;->c:Ljava/lang/Object;

    iput-object p2, p0, Lg9/p;->d:Ljava/lang/Object;

    iput-object p3, p0, Lg9/p;->b:Landroid/content/Context;

    iput-object p4, p0, Lg9/p;->e:Ljava/lang/Object;

    iput-object p5, p0, Lg9/p;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/embedding/engine/loader/FlutterLoader;Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg9/p;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/p;->c:Ljava/lang/Object;

    iput-object p2, p0, Lg9/p;->b:Landroid/content/Context;

    iput-object p3, p0, Lg9/p;->d:Ljava/lang/Object;

    iput-object p4, p0, Lg9/p;->e:Ljava/lang/Object;

    iput-object p5, p0, Lg9/p;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lg9/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_1

    .line 7
    :pswitch_0
    iget-object v0, p0, Lg9/p;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lg9/u;

    .line 10
    .line 11
    iget-object v1, p0, Lg9/p;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 14
    .line 15
    iget-object v2, p0, Lg9/p;->b:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v3, p0, Lg9/p;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lg9/f;

    .line 20
    .line 21
    iget-object v4, p0, Lg9/p;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, Lm9/z;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Le9/e;

    .line 37
    .line 38
    invoke-virtual {v0, v2, v1, v3, v4}, Lg9/u;->a(Landroid/content/Context;Le9/e;Lg9/f;Lm9/z;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catch_0
    move-exception v0

    .line 43
    goto :goto_0

    .line 44
    :catch_1
    move-exception v0

    .line 45
    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 46
    .line 47
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :goto_1
    iget-object v0, p0, Lg9/p;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lio/flutter/embedding/engine/loader/FlutterLoader;

    .line 54
    .line 55
    iget-object v1, p0, Lg9/p;->b:Landroid/content/Context;

    .line 56
    .line 57
    iget-object v2, p0, Lg9/p;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, [Ljava/lang/String;

    .line 60
    .line 61
    iget-object v3, p0, Lg9/p;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v3, Landroid/os/Handler;

    .line 64
    .line 65
    iget-object v4, p0, Lg9/p;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v4, Ljava/lang/Runnable;

    .line 68
    .line 69
    invoke-static {v0, v1, v2, v3, v4}, Lio/flutter/embedding/engine/loader/FlutterLoader;->b(Lio/flutter/embedding/engine/loader/FlutterLoader;Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
