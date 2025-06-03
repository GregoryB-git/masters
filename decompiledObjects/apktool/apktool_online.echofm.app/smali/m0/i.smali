.class public final Lm0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/i$f;,
        Lm0/i$c;,
        Lm0/i$e;,
        Lm0/i$d;,
        Lm0/i$b;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lm0/i$f;

.field public final c:Landroid/os/Handler;

.field public final d:Lm0/i$c;

.field public final e:Landroid/content/BroadcastReceiver;

.field public final f:Lm0/i$d;

.field public g:Lm0/e;

.field public h:Lm0/j;

.field public i:Ld0/b;

.field public j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lm0/i$f;Ld0/b;Lm0/j;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lm0/i;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Lm0/i$f;

    .line 15
    .line 16
    iput-object p2, p0, Lm0/i;->b:Lm0/i$f;

    .line 17
    .line 18
    iput-object p3, p0, Lm0/i;->i:Ld0/b;

    .line 19
    .line 20
    iput-object p4, p0, Lm0/i;->h:Lm0/j;

    .line 21
    .line 22
    invoke-static {}, Lg0/M;->C()Landroid/os/Handler;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, Lm0/i;->c:Landroid/os/Handler;

    .line 27
    .line 28
    sget p3, Lg0/M;->a:I

    .line 29
    .line 30
    const/16 p4, 0x17

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    if-lt p3, p4, :cond_0

    .line 34
    .line 35
    new-instance p4, Lm0/i$c;

    .line 36
    .line 37
    invoke-direct {p4, p0, v0}, Lm0/i$c;-><init>(Lm0/i;Lm0/i$a;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object p4, v0

    .line 42
    :goto_0
    iput-object p4, p0, Lm0/i;->d:Lm0/i$c;

    .line 43
    .line 44
    const/16 p4, 0x15

    .line 45
    .line 46
    if-lt p3, p4, :cond_1

    .line 47
    .line 48
    new-instance p3, Lm0/i$e;

    .line 49
    .line 50
    invoke-direct {p3, p0, v0}, Lm0/i$e;-><init>(Lm0/i;Lm0/i$a;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object p3, v0

    .line 55
    :goto_1
    iput-object p3, p0, Lm0/i;->e:Landroid/content/BroadcastReceiver;

    .line 56
    .line 57
    invoke-static {}, Lm0/e;->j()Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    if-eqz p3, :cond_2

    .line 62
    .line 63
    new-instance v0, Lm0/i$d;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {v0, p0, p2, p1, p3}, Lm0/i$d;-><init>(Lm0/i;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    iput-object v0, p0, Lm0/i;->f:Lm0/i$d;

    .line 73
    .line 74
    return-void
.end method

.method public static synthetic a(Lm0/i;)Ld0/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/i;->i:Ld0/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lm0/i;)Lm0/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/i;->h:Lm0/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lm0/i;Lm0/j;)Lm0/j;
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/i;->h:Lm0/j;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic d(Lm0/i;Lm0/e;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lm0/i;->f(Lm0/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lm0/i;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/i;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final f(Lm0/e;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm0/i;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm0/i;->g:Lm0/e;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lm0/e;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lm0/i;->g:Lm0/e;

    .line 14
    .line 15
    iget-object v0, p0, Lm0/i;->b:Lm0/i$f;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Lm0/i$f;->a(Lm0/e;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public g()Lm0/e;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lm0/i;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm0/i;->g:Lm0/e;

    .line 6
    .line 7
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lm0/e;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lm0/i;->j:Z

    .line 16
    .line 17
    iget-object v0, p0, Lm0/i;->f:Lm0/i$d;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lm0/i$d;->a()V

    .line 22
    .line 23
    .line 24
    :cond_1
    sget v0, Lg0/M;->a:I

    .line 25
    .line 26
    const/16 v1, 0x17

    .line 27
    .line 28
    if-lt v0, v1, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Lm0/i;->d:Lm0/i$c;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v1, p0, Lm0/i;->a:Landroid/content/Context;

    .line 35
    .line 36
    iget-object v2, p0, Lm0/i;->c:Landroid/os/Handler;

    .line 37
    .line 38
    invoke-static {v1, v0, v2}, Lm0/i$b;->a(Landroid/content/Context;Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object v0, p0, Lm0/i;->e:Landroid/content/BroadcastReceiver;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    new-instance v0, Landroid/content/IntentFilter;

    .line 47
    .line 48
    const-string v2, "android.media.action.HDMI_AUDIO_PLUG"

    .line 49
    .line 50
    invoke-direct {v0, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, Lm0/i;->a:Landroid/content/Context;

    .line 54
    .line 55
    iget-object v3, p0, Lm0/i;->e:Landroid/content/BroadcastReceiver;

    .line 56
    .line 57
    iget-object v4, p0, Lm0/i;->c:Landroid/os/Handler;

    .line 58
    .line 59
    invoke-virtual {v2, v3, v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :cond_3
    iget-object v0, p0, Lm0/i;->a:Landroid/content/Context;

    .line 64
    .line 65
    iget-object v2, p0, Lm0/i;->i:Ld0/b;

    .line 66
    .line 67
    iget-object v3, p0, Lm0/i;->h:Lm0/j;

    .line 68
    .line 69
    invoke-static {v0, v1, v2, v3}, Lm0/e;->f(Landroid/content/Context;Landroid/content/Intent;Ld0/b;Lm0/j;)Lm0/e;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lm0/i;->g:Lm0/e;

    .line 74
    .line 75
    return-object v0
.end method

.method public h(Ld0/b;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lm0/i;->i:Ld0/b;

    .line 2
    .line 3
    iget-object v0, p0, Lm0/i;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Lm0/i;->h:Lm0/j;

    .line 6
    .line 7
    invoke-static {v0, p1, v1}, Lm0/e;->g(Landroid/content/Context;Ld0/b;Lm0/j;)Lm0/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lm0/i;->f(Lm0/e;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public i(Landroid/media/AudioDeviceInfo;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/i;->h:Lm0/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move-object v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, v0, Lm0/j;->a:Landroid/media/AudioDeviceInfo;

    .line 9
    .line 10
    :goto_0
    invoke-static {p1, v0}, Lg0/M;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    if-eqz p1, :cond_2

    .line 18
    .line 19
    new-instance v1, Lm0/j;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Lm0/j;-><init>(Landroid/media/AudioDeviceInfo;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    iput-object v1, p0, Lm0/i;->h:Lm0/j;

    .line 25
    .line 26
    iget-object p1, p0, Lm0/i;->a:Landroid/content/Context;

    .line 27
    .line 28
    iget-object v0, p0, Lm0/i;->i:Ld0/b;

    .line 29
    .line 30
    invoke-static {p1, v0, v1}, Lm0/e;->g(Landroid/content/Context;Ld0/b;Lm0/j;)Lm0/e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, Lm0/i;->f(Lm0/e;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public j()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm0/i;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lm0/i;->g:Lm0/e;

    .line 8
    .line 9
    sget v0, Lg0/M;->a:I

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    if-lt v0, v1, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lm0/i;->d:Lm0/i$c;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lm0/i;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {v1, v0}, Lm0/i$b;->b(Landroid/content/Context;Landroid/media/AudioDeviceCallback;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lm0/i;->e:Landroid/content/BroadcastReceiver;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v1, p0, Lm0/i;->a:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    iget-object v0, p0, Lm0/i;->f:Lm0/i$d;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0}, Lm0/i$d;->b()V

    .line 38
    .line 39
    .line 40
    :cond_3
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, Lm0/i;->j:Z

    .line 42
    .line 43
    return-void
.end method
