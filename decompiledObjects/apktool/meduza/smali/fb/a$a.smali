.class public final Lfb/a$a;
.super Leb/n0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfb/a$a$d;,
        Lfb/a$a$c;
    }
.end annotation


# instance fields
.field public final b:Leb/n0;

.field public final c:Landroid/content/Context;

.field public final d:Landroid/net/ConnectivityManager;

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Leb/n0;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Leb/n0;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lfb/a$a;->e:Ljava/lang/Object;

    iput-object p1, p0, Lfb/a$a;->b:Leb/n0;

    iput-object p2, p0, Lfb/a$a;->c:Landroid/content/Context;

    if-eqz p2, :cond_0

    const-string p1, "connectivity"

    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, Lfb/a$a;->d:Landroid/net/ConnectivityManager;

    :try_start_0
    invoke-virtual {p0}, Lfb/a$a;->I()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "AndroidChannelBuilder"

    const-string v0, "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lfb/a$a;->d:Landroid/net/ConnectivityManager;

    :goto_0
    return-void
.end method


# virtual methods
.method public final C(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    iget-object v0, p0, Lfb/a$a;->b:Leb/n0;

    invoke-virtual {v0, p1, p2, p3}, Leb/n0;->C(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public final D()V
    .locals 1

    iget-object v0, p0, Lfb/a$a;->b:Leb/n0;

    invoke-virtual {v0}, Leb/n0;->D()V

    return-void
.end method

.method public final E()Leb/n;
    .locals 1

    iget-object v0, p0, Lfb/a$a;->b:Leb/n0;

    invoke-virtual {v0}, Leb/n0;->E()Leb/n;

    move-result-object v0

    return-object v0
.end method

.method public final F(Leb/n;Lx0/f;)V
    .locals 1

    iget-object v0, p0, Lfb/a$a;->b:Leb/n0;

    invoke-virtual {v0, p1, p2}, Leb/n0;->F(Leb/n;Lx0/f;)V

    return-void
.end method

.method public final G()Leb/n0;
    .locals 2

    .line 1
    iget-object v0, p0, Lfb/a$a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lfb/a$a;->f:Ljava/lang/Runnable;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Lfb/a$a;->f:Ljava/lang/Runnable;

    .line 13
    .line 14
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    iget-object v0, p0, Lfb/a$a;->b:Leb/n0;

    .line 16
    .line 17
    invoke-virtual {v0}, Leb/n0;->G()Leb/n0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final H()Leb/n0;
    .locals 2

    .line 1
    iget-object v0, p0, Lfb/a$a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lfb/a$a;->f:Ljava/lang/Runnable;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Lfb/a$a;->f:Ljava/lang/Runnable;

    .line 13
    .line 14
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    iget-object v0, p0, Lfb/a$a;->b:Leb/n0;

    .line 16
    .line 17
    invoke-virtual {v0}, Leb/n0;->H()Leb/n0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final I()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lfb/a$a;->d:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    new-instance v0, Lfb/a$a$c;

    invoke-direct {v0, p0}, Lfb/a$a$c;-><init>(Lfb/a$a;)V

    iget-object v1, p0, Lfb/a$a;->d:Landroid/net/ConnectivityManager;

    invoke-static {v1, v0}, La0/e;->g(Landroid/net/ConnectivityManager;Lfb/a$a$c;)V

    new-instance v1, Lfb/a$a$a;

    invoke-direct {v1, p0, v0}, Lfb/a$a$a;-><init>(Lfb/a$a;Lfb/a$a$c;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lfb/a$a$d;

    invoke-direct {v0, p0}, Lfb/a$a$d;-><init>(Lfb/a$a;)V

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lfb/a$a;->c:Landroid/content/Context;

    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v1, Lfb/a$a$b;

    invoke-direct {v1, p0, v0}, Lfb/a$a$b;-><init>(Lfb/a$a;Lfb/a$a$d;)V

    :goto_0
    iput-object v1, p0, Lfb/a$a;->f:Ljava/lang/Runnable;

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfb/a$a;->b:Leb/n0;

    invoke-virtual {v0}, Le9/a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(Leb/t0;Leb/c;)Leb/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestT:",
            "Ljava/lang/Object;",
            "ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Leb/t0<",
            "TRequestT;TResponseT;>;",
            "Leb/c;",
            ")",
            "Leb/e<",
            "TRequestT;TResponseT;>;"
        }
    .end annotation

    iget-object v0, p0, Lfb/a$a;->b:Leb/n0;

    invoke-virtual {v0, p1, p2}, Le9/a;->v(Leb/t0;Leb/c;)Leb/e;

    move-result-object p1

    return-object p1
.end method
