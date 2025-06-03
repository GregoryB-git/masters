.class public abstract Le7/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile d:Lcom/google/android/gms/internal/measurement/zzdj;


# instance fields
.field public final a:Le7/c3;

.field public final b:Li6/p;

.field public volatile c:J


# direct methods
.method public constructor <init>(Le7/c3;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p1, p0, Le7/v;->a:Le7/c3;

    new-instance v0, Li6/p;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, v1}, Li6/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, p0, Le7/v;->b:Li6/p;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Le7/v;->c:J

    invoke-virtual {p0}, Le7/v;->d()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Le7/v;->b:Li6/p;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(J)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le7/v;->a()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Le7/v;->a:Le7/c3;

    .line 11
    .line 12
    invoke-interface {v0}, Le7/c3;->zzb()Lv6/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lb/z;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iput-wide v0, p0, Le7/v;->c:J

    .line 26
    .line 27
    invoke-virtual {p0}, Le7/v;->d()Landroid/os/Handler;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Le7/v;->b:Li6/p;

    .line 32
    .line 33
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    iget-object v0, p0, Le7/v;->a:Le7/c3;

    .line 40
    .line 41
    invoke-interface {v0}, Le7/c3;->zzj()Le7/a1;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 46
    .line 47
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "Failed to schedule delayed post. time"

    .line 52
    .line 53
    invoke-virtual {v0, p2, p1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
    .line 57
    .line 58
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

.method public abstract c()V
.end method

.method public final d()Landroid/os/Handler;
    .locals 3

    sget-object v0, Le7/v;->d:Lcom/google/android/gms/internal/measurement/zzdj;

    if-eqz v0, :cond_0

    sget-object v0, Le7/v;->d:Lcom/google/android/gms/internal/measurement/zzdj;

    return-object v0

    :cond_0
    const-class v0, Le7/v;

    monitor-enter v0

    :try_start_0
    sget-object v1, Le7/v;->d:Lcom/google/android/gms/internal/measurement/zzdj;

    if-nez v1, :cond_1

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzdj;

    iget-object v2, p0, Le7/v;->a:Le7/c3;

    invoke-interface {v2}, Le7/c3;->zza()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/measurement/zzdj;-><init>(Landroid/os/Looper;)V

    sput-object v1, Le7/v;->d:Lcom/google/android/gms/internal/measurement/zzdj;

    :cond_1
    sget-object v1, Le7/v;->d:Lcom/google/android/gms/internal/measurement/zzdj;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
