.class public final Lc8/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public volatile a:I

.field public final b:Lc8/r;

.field public volatile c:Z


# direct methods
.method public constructor <init>(Lu7/f;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lu7/f;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lu7/f;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v1, Lc8/r;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lc8/r;-><init>(Lu7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-boolean p1, p0, Lc8/r0;->c:Z

    .line 16
    .line 17
    iput p1, p0, Lc8/r0;->a:I

    .line 18
    .line 19
    iput-object v1, p0, Lc8/r0;->b:Lc8/r;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Landroid/app/Application;

    .line 26
    .line 27
    invoke-static {p1}, Ll6/b;->a(Landroid/app/Application;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Ll6/b;->e:Ll6/b;

    .line 31
    .line 32
    new-instance v0, Lc8/q0;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lc8/q0;-><init>(Lc8/r0;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    monitor-enter p1

    .line 41
    :try_start_0
    iget-object v1, p1, Ll6/b;->c:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    monitor-exit p1

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    throw v0
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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


# virtual methods
.method public final a(I)V
    .locals 2

    .line 1
    if-lez p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lc8/r0;->a:I

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iput p1, p0, Lc8/r0;->a:I

    .line 8
    .line 9
    iget v0, p0, Lc8/r0;->a:I

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lc8/r0;->c:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lc8/r0;->b:Lc8/r;

    .line 23
    .line 24
    invoke-virtual {v0}, Lc8/r;->a()V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    if-nez p1, :cond_2

    .line 29
    .line 30
    iget v0, p0, Lc8/r0;->a:I

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lc8/r0;->b:Lc8/r;

    .line 35
    .line 36
    iget-object v1, v0, Lc8/r;->e:Lcom/google/android/gms/internal/firebase-auth-api/zze;

    .line 37
    .line 38
    iget-object v0, v0, Lc8/r;->f:Li6/t;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_1
    iput p1, p0, Lc8/r0;->a:I

    .line 44
    .line 45
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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
