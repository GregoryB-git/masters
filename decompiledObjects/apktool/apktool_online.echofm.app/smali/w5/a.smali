.class public Lw5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw5/a$e;,
        Lw5/a$d;,
        Lw5/a$c;,
        Lw5/a$b;
    }
.end annotation


# instance fields
.field public final a:Lio/flutter/embedding/engine/FlutterJNI;

.field public final b:Landroid/content/res/AssetManager;

.field public final c:Lw5/c;

.field public final d:LE5/c;

.field public e:Z

.field public f:Ljava/lang/String;

.field public final g:LE5/c$a;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lw5/a;->e:Z

    .line 6
    .line 7
    new-instance v0, Lw5/a$a;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lw5/a$a;-><init>(Lw5/a;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lw5/a;->g:LE5/c$a;

    .line 13
    .line 14
    iput-object p1, p0, Lw5/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 15
    .line 16
    iput-object p2, p0, Lw5/a;->b:Landroid/content/res/AssetManager;

    .line 17
    .line 18
    new-instance p2, Lw5/c;

    .line 19
    .line 20
    invoke-direct {p2, p1}, Lw5/c;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lw5/a;->c:Lw5/c;

    .line 24
    .line 25
    const-string v1, "flutter/isolate"

    .line 26
    .line 27
    invoke-virtual {p2, v1, v0}, Lw5/c;->c(Ljava/lang/String;LE5/c$a;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lw5/a$d;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v0, p2, v1}, Lw5/a$d;-><init>(Lw5/c;Lw5/a$a;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lw5/a;->d:LE5/c;

    .line 37
    .line 38
    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    iput-boolean p1, p0, Lw5/a;->e:Z

    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public static synthetic e(Lw5/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lw5/a;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic g(Lw5/a;)Lw5/a$e;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method


# virtual methods
.method public a(LE5/c$d;)LE5/c$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lw5/a;->d:LE5/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LE5/c;->a(LE5/c$d;)LE5/c$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public synthetic b()LE5/c$c;
    .locals 1

    .line 1
    invoke-static {p0}, LE5/b;->a(LE5/c;)LE5/c$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c(Ljava/lang/String;LE5/c$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw5/a;->d:LE5/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LE5/c;->c(Ljava/lang/String;LE5/c$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw5/a;->d:LE5/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LE5/c;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/nio/ByteBuffer;LE5/c$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw5/a;->d:LE5/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LE5/c;->f(Ljava/lang/String;Ljava/nio/ByteBuffer;LE5/c$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h(Ljava/lang/String;LE5/c$a;LE5/c$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw5/a;->d:LE5/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LE5/c;->h(Ljava/lang/String;LE5/c$a;LE5/c$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(Lw5/a$b;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lw5/a;->e:Z

    .line 2
    .line 3
    const-string v1, "DartExecutor"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "Attempted to run a DartExecutor that is already running."

    .line 8
    .line 9
    invoke-static {v1, p1}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v0, "DartExecutor#executeDartCallback"

    .line 14
    .line 15
    invoke-static {v0}, LT5/f;->i(Ljava/lang/String;)LT5/f;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v3, "Executing Dart callback: "

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v1, v2}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Lw5/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 40
    .line 41
    iget-object v4, p1, Lw5/a$b;->b:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, p1, Lw5/a$b;->c:Lio/flutter/view/FlutterCallbackInformation;

    .line 44
    .line 45
    iget-object v5, v1, Lio/flutter/view/FlutterCallbackInformation;->callbackName:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v6, v1, Lio/flutter/view/FlutterCallbackInformation;->callbackLibraryPath:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v7, p1, Lw5/a$b;->a:Landroid/content/res/AssetManager;

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    invoke-virtual/range {v3 .. v8}, Lio/flutter/embedding/engine/FlutterJNI;->runBundleAndSnapshotFromLibrary(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    iput-boolean p1, p0, Lw5/a;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0}, LT5/f;->close()V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    :try_start_1
    invoke-virtual {v0}, LT5/f;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_0
    throw p1
.end method

.method public j(Lw5/a$c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lw5/a;->k(Lw5/a$c;Ljava/util/List;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public k(Lw5/a$c;Ljava/util/List;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lw5/a;->e:Z

    .line 2
    .line 3
    const-string v1, "DartExecutor"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "Attempted to run a DartExecutor that is already running."

    .line 8
    .line 9
    invoke-static {v1, p1}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v0, "DartExecutor#executeDartEntrypoint"

    .line 14
    .line 15
    invoke-static {v0}, LT5/f;->i(Ljava/lang/String;)LT5/f;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v3, "Executing Dart entrypoint: "

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v1, v2}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Lw5/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 40
    .line 41
    iget-object v4, p1, Lw5/a$c;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v5, p1, Lw5/a$c;->c:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v6, p1, Lw5/a$c;->b:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v7, p0, Lw5/a;->b:Landroid/content/res/AssetManager;

    .line 48
    .line 49
    move-object v8, p2

    .line 50
    invoke-virtual/range {v3 .. v8}, Lio/flutter/embedding/engine/FlutterJNI;->runBundleAndSnapshotFromLibrary(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    iput-boolean p1, p0, Lw5/a;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0}, LT5/f;->close()V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    :try_start_1
    invoke-virtual {v0}, LT5/f;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_1
    move-exception p2

    .line 70
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_0
    throw p1
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lw5/a;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public m()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw5/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lw5/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->notifyLowMemoryWarning()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public n()V
    .locals 2

    .line 1
    const-string v0, "DartExecutor"

    .line 2
    .line 3
    const-string v1, "Attached to JNI. Registering the platform message handler for this Dart execution context."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lw5/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 9
    .line 10
    iget-object v1, p0, Lw5/a;->c:Lw5/c;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformMessageHandler(Lw5/f;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public o()V
    .locals 2

    .line 1
    const-string v0, "DartExecutor"

    .line 2
    .line 3
    const-string v1, "Detached from JNI. De-registering the platform message handler for this Dart execution context."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lw5/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformMessageHandler(Lw5/f;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
