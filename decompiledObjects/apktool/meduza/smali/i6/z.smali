.class public final Li6/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static e:Li6/z;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public c:Li6/u;

.field public d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li6/u;

    invoke-direct {v0, p0}, Li6/u;-><init>(Li6/z;)V

    iput-object v0, p0, Li6/z;->c:Li6/u;

    const/4 v0, 0x1

    iput v0, p0, Li6/z;->d:I

    iput-object p2, p0, Li6/z;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Li6/z;->a:Landroid/content/Context;

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Li6/z;
    .locals 5

    const-class v0, Li6/z;

    monitor-enter v0

    :try_start_0
    sget-object v1, Li6/z;->e:Li6/z;

    if-nez v1, :cond_0

    new-instance v1, Li6/z;

    invoke-static {}, Lcom/google/android/gms/internal/cloudmessaging/zze;->zza()Lcom/google/android/gms/internal/cloudmessaging/zzb;

    const/4 v2, 0x1

    new-instance v3, Lw6/a;

    const-string v4, "MessengerIpcClient"

    invoke-direct {v3, v4}, Lw6/a;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-static {v2}, Ljava/util/concurrent/Executors;->unconfigurableScheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Li6/z;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V

    sput-object v1, Li6/z;->e:Li6/z;

    :cond_0
    sget-object p0, Li6/z;->e:Li6/z;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final declared-synchronized b(Li6/x;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "MessengerIpcClient"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Li6/x;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Queueing "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MessengerIpcClient"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Li6/z;->c:Li6/u;

    invoke-virtual {v0, p1}, Li6/u;->d(Li6/x;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Li6/u;

    invoke-direct {v0, p0}, Li6/u;-><init>(Li6/z;)V

    iput-object v0, p0, Li6/z;->c:Li6/u;

    invoke-virtual {v0, p1}, Li6/u;->d(Li6/x;)Z

    :cond_1
    iget-object p1, p1, Li6/x;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
