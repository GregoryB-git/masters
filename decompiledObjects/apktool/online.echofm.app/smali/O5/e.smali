.class public LO5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$c;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public b:LE5/k;

.field public c:Lio/flutter/embedding/engine/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LO5/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a(LO5/e;Ly5/f;Lv5/j;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, LO5/e;->j(Ly5/f;Lv5/j;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(LO5/e;Ly5/f;Landroid/os/Handler;Lv5/j;J)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, LO5/e;->k(Ly5/f;Landroid/os/Handler;Lv5/j;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(LO5/e;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, LO5/e;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static m(J)V
    .locals 3

    .line 1
    invoke-static {}, LO5/a;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "io.flutter.firebase.messaging.callback"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "callback_handle"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0, p1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static n(J)V
    .locals 3

    .line 1
    invoke-static {}, LO5/a;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "io.flutter.firebase.messaging.callback"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "user_callback_handle"

    .line 17
    .line 18
    invoke-interface {v0, v1, p0, p1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public d(Landroid/content/Intent;Ljava/util/concurrent/CountDownLatch;)V
    .locals 2

    .line 1
    iget-object v0, p0, LO5/e;->c:Lio/flutter/embedding/engine/a;

    .line 2
    .line 3
    const-string v1, "FLTFireBGExecutor"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered."

    .line 8
    .line 9
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    if-eqz p2, :cond_1

    .line 14
    .line 15
    new-instance v0, LO5/e$a;

    .line 16
    .line 17
    invoke-direct {v0, p0, p2}, LO5/e$a;-><init>(LO5/e;Ljava/util/concurrent/CountDownLatch;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    const-string p2, "notification"

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/google/firebase/messaging/T;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-static {p1}, LO5/z;->f(Lcom/google/firebase/messaging/T;)Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p2, p0, LO5/e;->b:LE5/k;

    .line 37
    .line 38
    new-instance v1, LO5/e$b;

    .line 39
    .line 40
    invoke-direct {v1, p0, p1}, LO5/e$b;-><init>(LO5/e;Ljava/util/Map;)V

    .line 41
    .line 42
    .line 43
    const-string p1, "MessagingBackground#onMessage"

    .line 44
    .line 45
    invoke-virtual {p2, p1, v1, v0}, LE5/k;->d(Ljava/lang/String;Ljava/lang/Object;LE5/k$d;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const-string p1, "RemoteMessage instance not found in Intent."

    .line 50
    .line 51
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    :goto_1
    return-void
.end method

.method public final e()J
    .locals 4

    .line 1
    invoke-static {}, LO5/a;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "io.flutter.firebase.messaging.callback"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "callback_handle"

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    return-wide v0
.end method

.method public final f()J
    .locals 4

    .line 1
    invoke-static {}, LO5/a;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "io.flutter.firebase.messaging.callback"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "user_callback_handle"

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    return-wide v0
.end method

.method public final g(LE5/c;)V
    .locals 2

    .line 1
    new-instance v0, LE5/k;

    .line 2
    .line 3
    const-string v1, "plugins.flutter.io/firebase_messaging_background"

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, LO5/e;->b:LE5/k;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, LE5/k;->e(LE5/k$c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public h()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, LO5/e;->e()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    return v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, LO5/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
.end method

.method public final synthetic j(Ly5/f;Lv5/j;J)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ly5/f;->j()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {}, LO5/a;->a()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, LO5/e;->i()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const-string v1, "FLTFireBGExecutor"

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v3, "Creating background FlutterEngine instance, with args: "

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Lv5/j;->b()[Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    new-instance v1, Lio/flutter/embedding/engine/a;

    .line 52
    .line 53
    invoke-static {}, LO5/a;->a()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {p2}, Lv5/j;->b()[Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-direct {v1, v2, p2}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, LO5/e;->c:Lio/flutter/embedding/engine/a;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const-string p2, "Creating background FlutterEngine instance."

    .line 68
    .line 69
    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    new-instance p2, Lio/flutter/embedding/engine/a;

    .line 73
    .line 74
    invoke-static {}, LO5/a;->a()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-direct {p2, v1}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    iput-object p2, p0, LO5/e;->c:Lio/flutter/embedding/engine/a;

    .line 82
    .line 83
    :goto_0
    invoke-static {p3, p4}, Lio/flutter/view/FlutterCallbackInformation;->lookupCallbackInformation(J)Lio/flutter/view/FlutterCallbackInformation;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    iget-object p3, p0, LO5/e;->c:Lio/flutter/embedding/engine/a;

    .line 88
    .line 89
    invoke-virtual {p3}, Lio/flutter/embedding/engine/a;->k()Lw5/a;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    invoke-virtual {p0, p3}, LO5/e;->g(LE5/c;)V

    .line 94
    .line 95
    .line 96
    new-instance p4, Lw5/a$b;

    .line 97
    .line 98
    invoke-direct {p4, v0, p1, p2}, Lw5/a$b;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;Lio/flutter/view/FlutterCallbackInformation;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p3, p4}, Lw5/a;->i(Lw5/a$b;)V

    .line 102
    .line 103
    .line 104
    :cond_1
    return-void
.end method

.method public final synthetic k(Ly5/f;Landroid/os/Handler;Lv5/j;J)V
    .locals 8

    .line 1
    invoke-static {}, LO5/a;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Ly5/f;->p(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, LO5/a;->a()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v7, LO5/d;

    .line 13
    .line 14
    move-object v1, v7

    .line 15
    move-object v2, p0

    .line 16
    move-object v3, p1

    .line 17
    move-object v4, p3

    .line 18
    move-wide v5, p4

    .line 19
    invoke-direct/range {v1 .. v6}, LO5/d;-><init>(LO5/e;Ly5/f;Lv5/j;J)V

    .line 20
    .line 21
    .line 22
    const/4 p3, 0x0

    .line 23
    invoke-virtual {p1, v0, p3, p2, v7}, Ly5/f;->i(Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final l()V
    .locals 2

    .line 1
    iget-object v0, p0, LO5/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;->m()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public o()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LO5/e;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LO5/e;->e()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {p0, v0, v1, v2}, LO5/e;->p(JLv5/j;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    iget-object p1, p1, LE5/j;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "MessagingBackground#initialized"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, LO5/e;->l()V

    .line 12
    .line 13
    .line 14
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {p2}, LE5/k$d;->c()V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void
.end method

.method public p(JLv5/j;)V
    .locals 9

    .line 1
    iget-object v0, p0, LO5/e;->c:Lio/flutter/embedding/engine/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p1, "FLTFireBGExecutor"

    .line 6
    .line 7
    const-string p2, "Background isolate already started."

    .line 8
    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v2, Ly5/f;

    .line 14
    .line 15
    invoke-direct {v2}, Ly5/f;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v7, Landroid/os/Handler;

    .line 19
    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    new-instance v8, LO5/c;

    .line 28
    .line 29
    move-object v0, v8

    .line 30
    move-object v1, p0

    .line 31
    move-object v3, v7

    .line 32
    move-object v4, p3

    .line 33
    move-wide v5, p1

    .line 34
    invoke-direct/range {v0 .. v6}, LO5/c;-><init>(LO5/e;Ly5/f;Landroid/os/Handler;Lv5/j;J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    return-void
.end method
