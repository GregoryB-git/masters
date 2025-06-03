.class public final Lc8/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static g:Lp6/a;


# instance fields
.field public volatile a:J

.field public volatile b:J

.field public c:J

.field public d:Landroid/os/HandlerThread;

.field public e:Lcom/google/android/gms/internal/firebase-auth-api/zze;

.field public f:Li6/t;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp6/a;

    const-string v1, "FirebaseAuth:"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "TokenRefresher"

    invoke-direct {v0, v2, v1}, Lp6/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lc8/r;->g:Lp6/a;

    return-void
.end method

.method public constructor <init>(Lu7/f;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lc8/r;->g:Lp6/a;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v2, "Initializing TokenRefresher"

    .line 10
    .line 11
    invoke-virtual {v0, v2, v1}, Lp6/a;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Landroid/os/HandlerThread;

    .line 15
    .line 16
    const-string v1, "TokenRefresher"

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lc8/r;->d:Landroid/os/HandlerThread;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zze;

    .line 29
    .line 30
    iget-object v1, p0, Lc8/r;->d:Landroid/os/HandlerThread;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zze;-><init>(Landroid/os/Looper;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lc8/r;->e:Lcom/google/android/gms/internal/firebase-auth-api/zze;

    .line 40
    .line 41
    new-instance v0, Li6/t;

    .line 42
    .line 43
    invoke-virtual {p1}, Lu7/f;->a()V

    .line 44
    .line 45
    .line 46
    iget-object p1, p1, Lu7/f;->b:Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct {v0, p0, p1}, Li6/t;-><init>(Lc8/r;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lc8/r;->f:Li6/t;

    .line 52
    .line 53
    const-wide/32 v0, 0x493e0

    .line 54
    .line 55
    .line 56
    iput-wide v0, p0, Lc8/r;->c:J

    .line 57
    .line 58
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


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    sget-object v0, Lc8/r;->g:Lp6/a;

    .line 2
    .line 3
    iget-wide v1, p0, Lc8/r;->a:J

    .line 4
    .line 5
    iget-wide v3, p0, Lc8/r;->c:J

    .line 6
    .line 7
    sub-long/2addr v1, v3

    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v4, "Scheduling refresh for "

    .line 11
    .line 12
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    new-array v2, v2, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lp6/a;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lc8/r;->e:Lcom/google/android/gms/internal/firebase-auth-api/zze;

    .line 29
    .line 30
    iget-object v1, p0, Lc8/r;->f:Li6/t;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    iget-wide v2, p0, Lc8/r;->a:J

    .line 40
    .line 41
    sub-long/2addr v2, v0

    .line 42
    iget-wide v0, p0, Lc8/r;->c:J

    .line 43
    .line 44
    sub-long/2addr v2, v0

    .line 45
    const-wide/16 v0, 0x0

    .line 46
    .line 47
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    const-wide/16 v2, 0x3e8

    .line 52
    .line 53
    div-long/2addr v0, v2

    .line 54
    iput-wide v0, p0, Lc8/r;->b:J

    .line 55
    .line 56
    iget-object v0, p0, Lc8/r;->e:Lcom/google/android/gms/internal/firebase-auth-api/zze;

    .line 57
    .line 58
    iget-object v1, p0, Lc8/r;->f:Li6/t;

    .line 59
    .line 60
    iget-wide v4, p0, Lc8/r;->b:J

    .line 61
    .line 62
    mul-long/2addr v4, v2

    .line 63
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 64
    .line 65
    .line 66
    return-void
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
