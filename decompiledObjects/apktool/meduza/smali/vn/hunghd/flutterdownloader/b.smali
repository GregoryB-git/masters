.class public final Lvn/hunghd/flutterdownloader/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;


# instance fields
.field public a:Lio/flutter/plugin/common/MethodChannel;

.field public b:Ld5/n;

.field public c:Landroid/content/Context;

.field public d:J

.field public e:I

.field public f:I

.field public o:I

.field public final p:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lvn/hunghd/flutterdownloader/b;->p:Ljava/lang/Object;

    return-void
.end method

.method public static c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "Required key \'"

    .line 9
    .line 10
    const-string v0, "\' was null"

    .line 11
    .line 12
    invoke-static {p0, p1, v0}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZIZLjava/lang/String;)Lo2/q;
    .locals 15

    move-object v0, p0

    new-instance v1, Lo2/l$a;

    const-class v2, Lvn/hunghd/flutterdownloader/DownloadWorker;

    invoke-direct {v1, v2}, Lo2/l$a;-><init>(Ljava/lang/Class;)V

    .line 1
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    if-eqz p11, :cond_0

    const/4 v3, 0x2

    goto :goto_0

    :cond_0
    const/4 v3, 0x3

    :goto_0
    move v5, v3

    .line 2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v3, v4, :cond_1

    invoke-static {v2}, Lsb/q;->x(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    goto :goto_1

    :cond_1
    sget-object v2, Lsb/u;->a:Lsb/u;

    :goto_1
    move-object v14, v2

    const-wide/16 v12, -0x1

    const-wide/16 v10, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v2, Lo2/c;

    move-object v4, v2

    move/from16 v9, p8

    invoke-direct/range {v4 .. v14}, Lo2/c;-><init>(IZZZZJJLjava/util/Set;)V

    .line 3
    iget-object v3, v1, Lo2/q$a;->c:Lx2/s;

    iput-object v2, v3, Lx2/s;->j:Lo2/c;

    .line 4
    iget-object v2, v1, Lo2/q$a;->d:Ljava/util/LinkedHashSet;

    const-string v3, "flutter_download_task"

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-wide/16 v2, 0xa

    .line 5
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v5, "timeUnit"

    .line 6
    invoke-static {v4, v5}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x1

    iput-boolean v5, v1, Lo2/q$a;->a:Z

    iget-object v6, v1, Lo2/q$a;->c:Lx2/s;

    iput v5, v6, Lx2/s;->l:I

    invoke-virtual {v4, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    const-wide/32 v2, 0x112a880

    cmp-long v2, v7, v2

    if-lez v2, :cond_2

    .line 7
    invoke-static {}, Lo2/j;->d()Lo2/j;

    move-result-object v2

    sget-object v3, Lx2/s;->x:Ljava/lang/String;

    const-string v4, "Backoff delay duration exceeds maximum value"

    invoke-virtual {v2, v3, v4}, Lo2/j;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    const-wide/16 v2, 0x2710

    cmp-long v2, v7, v2

    if-gez v2, :cond_3

    invoke-static {}, Lo2/j;->d()Lo2/j;

    move-result-object v2

    sget-object v3, Lx2/s;->x:Ljava/lang/String;

    const-string v4, "Backoff delay duration less than minimum value"

    invoke-virtual {v2, v3, v4}, Lo2/j;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const-wide/16 v9, 0x2710

    const-wide/32 v11, 0x112a880

    invoke-static/range {v7 .. v12}, Lic/g;->N(JJJ)J

    move-result-wide v2

    iput-wide v2, v6, Lx2/s;->m:J

    .line 8
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "url"

    move-object/from16 v4, p1

    .line 9
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "saved_file"

    move-object/from16 v4, p2

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "file_name"

    move-object/from16 v4, p3

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "headers"

    move-object/from16 v4, p4

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-static/range {p5 .. p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "show_notification"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p6 .. p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "open_file_from_notification"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p7 .. p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "is_resume"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    iget-wide v3, v0, Lvn/hunghd/flutterdownloader/b;->d:J

    .line 12
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "callback_handle"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget v3, v0, Lvn/hunghd/flutterdownloader/b;->e:I

    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "step"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    iget v3, v0, Lvn/hunghd/flutterdownloader/b;->f:I

    const/4 v4, 0x0

    if-ne v3, v5, :cond_4

    move v3, v5

    goto :goto_2

    :cond_4
    move v3, v4

    .line 16
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v6, "debug"

    invoke-virtual {v2, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    iget v3, v0, Lvn/hunghd/flutterdownloader/b;->o:I

    if-ne v3, v5, :cond_5

    goto :goto_3

    :cond_5
    move v5, v4

    .line 18
    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "ignoreSsl"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p9 .. p9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "save_in_public_storage"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    invoke-static/range {p10 .. p10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "timeout"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "proxy"

    move-object/from16 v4, p12

    .line 20
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    new-instance v3, Landroidx/work/c;

    invoke-direct {v3, v2}, Landroidx/work/c;-><init>(Ljava/util/HashMap;)V

    invoke-static {v3}, Landroidx/work/c;->e(Landroidx/work/c;)[B

    .line 22
    iget-object v2, v1, Lo2/q$a;->c:Lx2/s;

    iput-object v3, v2, Lx2/s;->e:Landroidx/work/c;

    .line 23
    invoke-virtual {v1}, Lo2/q$a;->a()Lo2/q;

    move-result-object v1

    return-object v1
.end method

.method public final b(Ljava/io/File;)V
    .locals 14

    const-string v0, "_id"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v7

    const/4 v1, 0x1

    new-array v8, v1, [Ljava/lang/String;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v8, v1

    sget-object p1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v1, "EXTERNAL_CONTENT_URI"

    invoke-static {p1, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvn/hunghd/flutterdownloader/b;->d()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v9

    const-string v1, "getContentResolver(...)"

    invoke-static {v9, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "_data = ?"

    const/4 v6, 0x0

    move-object v1, v9

    move-object v2, p1

    move-object v3, v7

    move-object v4, v10

    move-object v5, v8

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    const-string v12, "withAppendedId(...)"

    const/4 v13, 0x0

    if-eqz v11, :cond_0

    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result p1

    invoke-interface {v11, p1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    sget-object p1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {p1, v0, v1}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1, v12}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, p1, v13, v13}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    move-object v1, v9

    move-object v2, p1

    move-object v3, v7

    move-object v4, v10

    move-object v5, v8

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    sget-object v2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {v2, v0, v1}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0, v12}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v0, v13, v13}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    :cond_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_2
    :goto_0
    if-eqz v11, :cond_3

    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    :cond_3
    return-void
.end method

.method public final d()Landroid/content/Context;
    .locals 2

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/b;->c:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Ljava/lang/String;Lad/a;I)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "task_id"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "status"

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "progress"

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lvn/hunghd/flutterdownloader/b;->a:Lio/flutter/plugin/common/MethodChannel;

    if-eqz p1, :cond_0

    const-string p2, "updateProgress"

    invoke-virtual {p1, p2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 3

    const-string v0, "binding"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object p1

    const-string v1, "getBinaryMessenger(...)"

    invoke-static {p1, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lvn/hunghd/flutterdownloader/b;->p:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lvn/hunghd/flutterdownloader/b;->a:Lio/flutter/plugin/common/MethodChannel;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lvn/hunghd/flutterdownloader/b;->c:Landroid/content/Context;

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    const-string v2, "vn.hunghd/downloader"

    invoke-direct {v0, p1, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lvn/hunghd/flutterdownloader/b;->a:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    sget-object p1, Lvn/hunghd/flutterdownloader/c;->a:Lvn/hunghd/flutterdownloader/c;

    iget-object p1, p0, Lvn/hunghd/flutterdownloader/b;->c:Landroid/content/Context;

    invoke-static {p1}, Lvn/hunghd/flutterdownloader/c$a;->a(Landroid/content/Context;)Lvn/hunghd/flutterdownloader/c;

    move-result-object p1

    new-instance v0, Ld5/n;

    invoke-direct {v0, p1}, Ld5/n;-><init>(Lvn/hunghd/flutterdownloader/c;)V

    iput-object v0, p0, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    sget-object p1, Lrb/h;->a:Lrb/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lvn/hunghd/flutterdownloader/b;->c:Landroid/content/Context;

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/b;->a:Lio/flutter/plugin/common/MethodChannel;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    :cond_0
    iput-object p1, p0, Lvn/hunghd/flutterdownloader/b;->a:Lio/flutter/plugin/common/MethodChannel;

    return-void
.end method

.method public final onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 43

    .line 1
    move-object/from16 v14, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v15, p2

    .line 6
    .line 7
    const-string v1, "call"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "result"

    .line 13
    .line 14
    invoke-static {v15, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v1, :cond_22

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const-string v3, "null cannot be cast to non-null type kotlin.collections.List<*>"

    .line 26
    .line 27
    const-string v13, "task"

    .line 28
    .line 29
    const-string v4, "invalid_status"

    .line 30
    .line 31
    const-string v5, "substring(...)"

    .line 32
    .line 33
    const-string v6, "not found task corresponding to given task id"

    .line 34
    .line 35
    const-string v12, "time_created"

    .line 36
    .line 37
    const-string v11, "progress"

    .line 38
    .line 39
    const-string v10, "status"

    .line 40
    .line 41
    const-string v9, "toString(...)"

    .line 42
    .line 43
    const-string v7, "proxy"

    .line 44
    .line 45
    const-string v8, "allow_cellular"

    .line 46
    .line 47
    move-object/from16 v16, v9

    .line 48
    .line 49
    const-string v9, "requires_storage_not_low"

    .line 50
    .line 51
    move-object/from16 v17, v6

    .line 52
    .line 53
    const-string v6, "timeout"

    .line 54
    .line 55
    move-object/from16 v18, v13

    .line 56
    .line 57
    const-string v13, "file_name"

    .line 58
    .line 59
    move-object/from16 v19, v5

    .line 60
    .line 61
    const-string v5, "saved_dir"

    .line 62
    .line 63
    move-object/from16 v20, v4

    .line 64
    .line 65
    const-string v4, "url"

    .line 66
    .line 67
    move-object/from16 v21, v7

    .line 68
    .line 69
    const-string v7, "invalid_task_id"

    .line 70
    .line 71
    move-object/from16 v22, v7

    .line 72
    .line 73
    const-string v7, "task_id"

    .line 74
    .line 75
    move-object/from16 v23, v6

    .line 76
    .line 77
    const-string v6, "/"

    .line 78
    .line 79
    move-object/from16 v24, v6

    .line 80
    .line 81
    const/4 v6, 0x1

    .line 82
    sparse-switch v2, :sswitch_data_0

    .line 83
    .line 84
    .line 85
    goto/16 :goto_f

    .line 86
    .line 87
    :sswitch_0
    const-string v0, "loadTasks"

    .line 88
    .line 89
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_0

    .line 94
    .line 95
    goto/16 :goto_f

    .line 96
    .line 97
    :cond_0
    iget-object v0, v14, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    .line 98
    .line 99
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, v0, Ld5/n;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Lvn/hunghd/flutterdownloader/c;

    .line 105
    .line 106
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 107
    .line 108
    .line 109
    move-result-object v16

    .line 110
    iget-object v0, v0, Ld5/n;->c:Ljava/lang/Object;

    .line 111
    .line 112
    move-object/from16 v18, v0

    .line 113
    .line 114
    check-cast v18, [Ljava/lang/String;

    .line 115
    .line 116
    const/16 v19, 0x0

    .line 117
    .line 118
    const/16 v20, 0x0

    .line 119
    .line 120
    const/16 v21, 0x0

    .line 121
    .line 122
    const/16 v22, 0x0

    .line 123
    .line 124
    const/16 v23, 0x0

    .line 125
    .line 126
    const-string v17, "task"

    .line 127
    .line 128
    invoke-virtual/range {v16 .. v23}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    new-instance v1, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_1

    .line 142
    .line 143
    invoke-static {v0}, Ld5/n;->f(Landroid/database/Cursor;)Lad/b;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 152
    .line 153
    .line 154
    new-instance v0, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_2

    .line 168
    .line 169
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, Lad/b;

    .line 174
    .line 175
    new-instance v3, Ljava/util/HashMap;

    .line 176
    .line 177
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 178
    .line 179
    .line 180
    iget-object v6, v2, Lad/b;->b:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    iget-object v6, v2, Lad/b;->c:Lad/a;

    .line 186
    .line 187
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-virtual {v3, v10, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    iget v6, v2, Lad/b;->d:I

    .line 199
    .line 200
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-virtual {v3, v11, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    iget-object v6, v2, Lad/b;->e:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v3, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    iget-object v6, v2, Lad/b;->f:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v3, v13, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    iget-object v6, v2, Lad/b;->g:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-object/from16 v25, v5

    .line 223
    .line 224
    iget-wide v5, v2, Lad/b;->m:J

    .line 225
    .line 226
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-virtual {v3, v12, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    iget-boolean v2, v2, Lad/b;->o:Z

    .line 234
    .line 235
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v3, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-object/from16 v5, v25

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_2
    invoke-interface {v15, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_c

    .line 252
    .line 253
    :sswitch_1
    const-string v2, "initialize"

    .line 254
    .line 255
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-nez v1, :cond_3

    .line 260
    .line 261
    goto/16 :goto_f

    .line 262
    .line 263
    :cond_3
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 264
    .line 265
    invoke-static {v0, v3}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    check-cast v0, Ljava/util/List;

    .line 269
    .line 270
    const/4 v1, 0x0

    .line 271
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 280
    .line 281
    .line 282
    move-result-wide v1

    .line 283
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    iput v3, v14, Lvn/hunghd/flutterdownloader/b;->f:I

    .line 296
    .line 297
    const/4 v3, 0x2

    .line 298
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    iput v0, v14, Lvn/hunghd/flutterdownloader/b;->o:I

    .line 311
    .line 312
    iget-object v0, v14, Lvn/hunghd/flutterdownloader/b;->c:Landroid/content/Context;

    .line 313
    .line 314
    if-eqz v0, :cond_4

    .line 315
    .line 316
    const-string v3, "vn.hunghd.downloader.pref"

    .line 317
    .line 318
    const/4 v4, 0x0

    .line 319
    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    goto :goto_2

    .line 324
    :cond_4
    const/4 v0, 0x0

    .line 325
    :goto_2
    if-eqz v0, :cond_5

    .line 326
    .line 327
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    if-eqz v0, :cond_5

    .line 332
    .line 333
    const-string v3, "callback_dispatcher_handle_key"

    .line 334
    .line 335
    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-eqz v0, :cond_5

    .line 340
    .line 341
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 342
    .line 343
    .line 344
    :cond_5
    const/4 v0, 0x0

    .line 345
    invoke-interface {v15, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_c

    .line 349
    .line 350
    :sswitch_2
    const-string v0, "cancelAll"

    .line 351
    .line 352
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-nez v0, :cond_6

    .line 357
    .line 358
    goto/16 :goto_f

    .line 359
    .line 360
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/b;->d()Landroid/content/Context;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-static {v0}, Lp2/k0;->d(Landroid/content/Context;)Lp2/k0;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    new-instance v1, Ly2/c;

    .line 372
    .line 373
    const-string v2, "flutter_download_task"

    .line 374
    .line 375
    invoke-direct {v1, v0, v2}, Ly2/c;-><init>(Lp2/k0;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    iget-object v0, v0, Lp2/k0;->d:La3/b;

    .line 379
    .line 380
    invoke-interface {v0, v1}, La3/b;->d(Ljava/lang/Runnable;)V

    .line 381
    .line 382
    .line 383
    const/4 v0, 0x0

    .line 384
    invoke-interface {v15, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    goto/16 :goto_c

    .line 388
    .line 389
    :sswitch_3
    move-object/from16 v25, v5

    .line 390
    .line 391
    const-string v2, "loadTasksWithRawQuery"

    .line 392
    .line 393
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    if-nez v1, :cond_7

    .line 398
    .line 399
    goto/16 :goto_f

    .line 400
    .line 401
    :cond_7
    const-string v1, "query"

    .line 402
    .line 403
    invoke-static {v0, v1}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    check-cast v0, Ljava/lang/String;

    .line 408
    .line 409
    iget-object v1, v14, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    .line 410
    .line 411
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    iget-object v1, v1, Ld5/n;->b:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v1, Lvn/hunghd/flutterdownloader/c;

    .line 417
    .line 418
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    const/4 v2, 0x0

    .line 423
    invoke-virtual {v1, v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    new-instance v1, Ljava/util/ArrayList;

    .line 428
    .line 429
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 430
    .line 431
    .line 432
    :goto_3
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-eqz v2, :cond_8

    .line 437
    .line 438
    invoke-static {v0}, Ld5/n;->f(Landroid/database/Cursor;)Lad/b;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    goto :goto_3

    .line 446
    :cond_8
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 447
    .line 448
    .line 449
    new-instance v0, Ljava/util/ArrayList;

    .line 450
    .line 451
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    if-eqz v2, :cond_9

    .line 463
    .line 464
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    check-cast v2, Lad/b;

    .line 469
    .line 470
    new-instance v3, Ljava/util/HashMap;

    .line 471
    .line 472
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 473
    .line 474
    .line 475
    iget-object v5, v2, Lad/b;->b:Ljava/lang/String;

    .line 476
    .line 477
    invoke-virtual {v3, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    iget-object v5, v2, Lad/b;->c:Lad/a;

    .line 481
    .line 482
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 483
    .line 484
    .line 485
    move-result v5

    .line 486
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    invoke-virtual {v3, v10, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    iget v5, v2, Lad/b;->d:I

    .line 494
    .line 495
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    invoke-virtual {v3, v11, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    iget-object v5, v2, Lad/b;->e:Ljava/lang/String;

    .line 503
    .line 504
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    iget-object v5, v2, Lad/b;->f:Ljava/lang/String;

    .line 508
    .line 509
    invoke-virtual {v3, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    iget-object v5, v2, Lad/b;->g:Ljava/lang/String;

    .line 513
    .line 514
    move-object/from16 v6, v25

    .line 515
    .line 516
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-object/from16 v25, v10

    .line 520
    .line 521
    iget-wide v9, v2, Lad/b;->m:J

    .line 522
    .line 523
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    invoke-virtual {v3, v12, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    iget-boolean v2, v2, Lad/b;->o:Z

    .line 531
    .line 532
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    invoke-virtual {v3, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-object/from16 v10, v25

    .line 543
    .line 544
    move-object/from16 v25, v6

    .line 545
    .line 546
    goto :goto_4

    .line 547
    :cond_9
    invoke-interface {v15, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    goto/16 :goto_c

    .line 551
    .line 552
    :sswitch_4
    const-string v2, "retry"

    .line 553
    .line 554
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v1

    .line 558
    if-nez v1, :cond_a

    .line 559
    .line 560
    goto/16 :goto_f

    .line 561
    .line 562
    :cond_a
    invoke-static {v0, v7}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    move-object v13, v1

    .line 567
    check-cast v13, Ljava/lang/String;

    .line 568
    .line 569
    iget-object v1, v14, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    .line 570
    .line 571
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v1, v13}, Ld5/n;->e(Ljava/lang/String;)Lad/b;

    .line 575
    .line 576
    .line 577
    move-result-object v12

    .line 578
    invoke-static {v0, v9}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    check-cast v1, Ljava/lang/Boolean;

    .line 583
    .line 584
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 585
    .line 586
    .line 587
    move-result v9

    .line 588
    move-object/from16 v2, v23

    .line 589
    .line 590
    invoke-static {v0, v2}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    check-cast v1, Ljava/lang/Number;

    .line 595
    .line 596
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 597
    .line 598
    .line 599
    move-result v11

    .line 600
    move-object/from16 v3, v21

    .line 601
    .line 602
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    check-cast v0, Ljava/lang/String;

    .line 607
    .line 608
    if-eqz v12, :cond_d

    .line 609
    .line 610
    iget-object v1, v12, Lad/b;->c:Lad/a;

    .line 611
    .line 612
    sget-object v2, Lad/a;->d:Lad/a;

    .line 613
    .line 614
    if-eq v1, v2, :cond_c

    .line 615
    .line 616
    sget-object v2, Lad/a;->e:Lad/a;

    .line 617
    .line 618
    if-ne v1, v2, :cond_b

    .line 619
    .line 620
    goto :goto_5

    .line 621
    :cond_b
    const-string v6, "only failed and canceled task can be retried"

    .line 622
    .line 623
    move-object/from16 v4, v20

    .line 624
    .line 625
    goto :goto_6

    .line 626
    :cond_c
    :goto_5
    iget-object v2, v12, Lad/b;->e:Ljava/lang/String;

    .line 627
    .line 628
    iget-object v3, v12, Lad/b;->g:Ljava/lang/String;

    .line 629
    .line 630
    iget-object v4, v12, Lad/b;->f:Ljava/lang/String;

    .line 631
    .line 632
    iget-object v5, v12, Lad/b;->h:Ljava/lang/String;

    .line 633
    .line 634
    iget-boolean v6, v12, Lad/b;->k:Z

    .line 635
    .line 636
    iget-boolean v7, v12, Lad/b;->l:Z

    .line 637
    .line 638
    const/4 v8, 0x0

    .line 639
    iget-boolean v10, v12, Lad/b;->n:Z

    .line 640
    .line 641
    iget-boolean v1, v12, Lad/b;->o:Z

    .line 642
    .line 643
    move/from16 v17, v1

    .line 644
    .line 645
    move-object/from16 v1, p0

    .line 646
    .line 647
    move-object/from16 v26, v16

    .line 648
    .line 649
    move-object/from16 v27, v12

    .line 650
    .line 651
    move/from16 v12, v17

    .line 652
    .line 653
    move-object/from16 v28, v13

    .line 654
    .line 655
    move-object v13, v0

    .line 656
    invoke-virtual/range {v1 .. v13}, Lvn/hunghd/flutterdownloader/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZIZLjava/lang/String;)Lo2/q;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    iget-object v1, v0, Lo2/q;->a:Ljava/util/UUID;

    .line 661
    .line 662
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    move-object/from16 v13, v26

    .line 667
    .line 668
    invoke-static {v1, v13}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    invoke-interface {v15, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 672
    .line 673
    .line 674
    sget-object v2, Lad/a;->a:Lad/a;

    .line 675
    .line 676
    move-object/from16 v3, v27

    .line 677
    .line 678
    iget v4, v3, Lad/b;->d:I

    .line 679
    .line 680
    invoke-virtual {v14, v1, v2, v4}, Lvn/hunghd/flutterdownloader/b;->e(Ljava/lang/String;Lad/a;I)V

    .line 681
    .line 682
    .line 683
    iget-object v4, v14, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    .line 684
    .line 685
    invoke-static {v4}, Lec/i;->b(Ljava/lang/Object;)V

    .line 686
    .line 687
    .line 688
    iget v3, v3, Lad/b;->d:I

    .line 689
    .line 690
    move-object/from16 v5, v28

    .line 691
    .line 692
    invoke-virtual {v4, v5, v1, v2, v3}, Ld5/n;->h(Ljava/lang/String;Ljava/lang/String;Lad/a;I)V

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/b;->d()Landroid/content/Context;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    invoke-static {v1}, Lp2/k0;->d(Landroid/content/Context;)Lp2/k0;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    invoke-virtual {v1, v0}, Lo2/p;->a(Lo2/q;)Lo2/m;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 708
    .line 709
    .line 710
    goto/16 :goto_c

    .line 711
    .line 712
    :cond_d
    move-object/from16 v6, v17

    .line 713
    .line 714
    move-object/from16 v4, v22

    .line 715
    .line 716
    :goto_6
    const/4 v0, 0x0

    .line 717
    invoke-interface {v15, v4, v6, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    goto/16 :goto_c

    .line 721
    .line 722
    :sswitch_5
    const-string v2, "pause"

    .line 723
    .line 724
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    move-result v1

    .line 728
    if-nez v1, :cond_e

    .line 729
    .line 730
    goto/16 :goto_f

    .line 731
    .line 732
    :cond_e
    invoke-static {v0, v7}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    check-cast v0, Ljava/lang/String;

    .line 737
    .line 738
    iget-object v1, v14, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    .line 739
    .line 740
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v1, v0, v6}, Ld5/n;->j(Ljava/lang/String;Z)V

    .line 744
    .line 745
    .line 746
    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/b;->d()Landroid/content/Context;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    invoke-static {v1}, Lp2/k0;->d(Landroid/content/Context;)Lp2/k0;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    invoke-virtual {v1, v0}, Lp2/k0;->c(Ljava/util/UUID;)Lp2/o;

    .line 759
    .line 760
    .line 761
    const/4 v0, 0x0

    .line 762
    invoke-interface {v15, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    goto/16 :goto_c

    .line 766
    .line 767
    :sswitch_6
    const-string v2, "open"

    .line 768
    .line 769
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v1

    .line 773
    if-nez v1, :cond_f

    .line 774
    .line 775
    goto/16 :goto_f

    .line 776
    .line 777
    :cond_f
    invoke-static {v0, v7}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    check-cast v0, Ljava/lang/String;

    .line 782
    .line 783
    iget-object v1, v14, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    .line 784
    .line 785
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v1, v0}, Ld5/n;->e(Ljava/lang/String;)Lad/b;

    .line 789
    .line 790
    .line 791
    move-result-object v1

    .line 792
    if-nez v1, :cond_10

    .line 793
    .line 794
    new-instance v1, Ljava/lang/StringBuilder;

    .line 795
    .line 796
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 797
    .line 798
    .line 799
    const-string v2, "not found task with id "

    .line 800
    .line 801
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    const/4 v1, 0x0

    .line 812
    move-object/from16 v4, v22

    .line 813
    .line 814
    invoke-interface {v15, v4, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 815
    .line 816
    .line 817
    goto/16 :goto_c

    .line 818
    .line 819
    :cond_10
    const/4 v0, 0x0

    .line 820
    iget-object v2, v1, Lad/b;->c:Lad/a;

    .line 821
    .line 822
    sget-object v3, Lad/a;->c:Lad/a;

    .line 823
    .line 824
    if-eq v2, v3, :cond_11

    .line 825
    .line 826
    const-string v1, "only completed tasks can be opened"

    .line 827
    .line 828
    move-object/from16 v5, v20

    .line 829
    .line 830
    invoke-interface {v15, v5, v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    goto/16 :goto_c

    .line 834
    .line 835
    :cond_11
    iget-object v0, v1, Lad/b;->e:Ljava/lang/String;

    .line 836
    .line 837
    iget-object v2, v1, Lad/b;->g:Ljava/lang/String;

    .line 838
    .line 839
    iget-object v3, v1, Lad/b;->f:Ljava/lang/String;

    .line 840
    .line 841
    if-nez v3, :cond_12

    .line 842
    .line 843
    const/4 v3, 0x6

    .line 844
    move-object/from16 v8, v24

    .line 845
    .line 846
    invoke-static {v0, v8, v3}, Llc/k;->u0(Ljava/lang/String;Ljava/lang/String;I)I

    .line 847
    .line 848
    .line 849
    move-result v3

    .line 850
    add-int/2addr v3, v6

    .line 851
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 852
    .line 853
    .line 854
    move-result v4

    .line 855
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v3

    .line 859
    move-object/from16 v10, v19

    .line 860
    .line 861
    invoke-static {v3, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    :cond_12
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 869
    .line 870
    invoke-static {v0, v2, v3}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    sget-object v2, Lad/d;->a:Lad/d;

    .line 875
    .line 876
    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/b;->d()Landroid/content/Context;

    .line 877
    .line 878
    .line 879
    move-result-object v3

    .line 880
    iget-object v1, v1, Lad/b;->i:Ljava/lang/String;

    .line 881
    .line 882
    invoke-virtual {v2, v3, v0, v1}, Lad/d;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    if-eqz v0, :cond_13

    .line 887
    .line 888
    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/b;->d()Landroid/content/Context;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 893
    .line 894
    .line 895
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 896
    .line 897
    goto :goto_7

    .line 898
    :cond_13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 899
    .line 900
    :goto_7
    invoke-interface {v15, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 901
    .line 902
    .line 903
    goto/16 :goto_c

    .line 904
    .line 905
    :sswitch_7
    const-string v2, "registerCallback"

    .line 906
    .line 907
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    move-result v1

    .line 911
    if-nez v1, :cond_14

    .line 912
    .line 913
    goto/16 :goto_f

    .line 914
    .line 915
    :cond_14
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 916
    .line 917
    invoke-static {v0, v3}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    check-cast v0, Ljava/util/List;

    .line 921
    .line 922
    const/4 v1, 0x0

    .line 923
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v1

    .line 927
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 932
    .line 933
    .line 934
    move-result-wide v1

    .line 935
    iput-wide v1, v14, Lvn/hunghd/flutterdownloader/b;->d:J

    .line 936
    .line 937
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 946
    .line 947
    .line 948
    move-result v0

    .line 949
    iput v0, v14, Lvn/hunghd/flutterdownloader/b;->e:I

    .line 950
    .line 951
    const/4 v0, 0x0

    .line 952
    invoke-interface {v15, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    goto/16 :goto_c

    .line 956
    .line 957
    :sswitch_8
    move-object/from16 v13, v16

    .line 958
    .line 959
    move-object/from16 v10, v19

    .line 960
    .line 961
    move-object/from16 v5, v20

    .line 962
    .line 963
    move-object/from16 v3, v21

    .line 964
    .line 965
    move-object/from16 v4, v22

    .line 966
    .line 967
    move-object/from16 v2, v23

    .line 968
    .line 969
    move-object/from16 v8, v24

    .line 970
    .line 971
    const-string v11, "resume"

    .line 972
    .line 973
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    move-result v1

    .line 977
    if-nez v1, :cond_15

    .line 978
    .line 979
    goto/16 :goto_f

    .line 980
    .line 981
    :cond_15
    invoke-static {v0, v7}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v1

    .line 985
    move-object v12, v1

    .line 986
    check-cast v12, Ljava/lang/String;

    .line 987
    .line 988
    iget-object v1, v14, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    .line 989
    .line 990
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v1, v12}, Ld5/n;->e(Ljava/lang/String;)Lad/b;

    .line 994
    .line 995
    .line 996
    move-result-object v11

    .line 997
    invoke-static {v0, v9}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v1

    .line 1001
    check-cast v1, Ljava/lang/Boolean;

    .line 1002
    .line 1003
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1004
    .line 1005
    .line 1006
    move-result v9

    .line 1007
    invoke-static {v0, v2}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v1

    .line 1011
    check-cast v1, Ljava/lang/Number;

    .line 1012
    .line 1013
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1014
    .line 1015
    .line 1016
    move-result v16

    .line 1017
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    check-cast v0, Ljava/lang/String;

    .line 1022
    .line 1023
    if-eqz v11, :cond_19

    .line 1024
    .line 1025
    iget-object v1, v11, Lad/b;->c:Lad/a;

    .line 1026
    .line 1027
    sget-object v2, Lad/a;->f:Lad/a;

    .line 1028
    .line 1029
    if-ne v1, v2, :cond_18

    .line 1030
    .line 1031
    iget-object v1, v11, Lad/b;->f:Ljava/lang/String;

    .line 1032
    .line 1033
    if-nez v1, :cond_16

    .line 1034
    .line 1035
    iget-object v1, v11, Lad/b;->e:Ljava/lang/String;

    .line 1036
    .line 1037
    const/4 v2, 0x6

    .line 1038
    invoke-static {v1, v8, v2}, Llc/k;->u0(Ljava/lang/String;Ljava/lang/String;I)I

    .line 1039
    .line 1040
    .line 1041
    move-result v2

    .line 1042
    add-int/2addr v2, v6

    .line 1043
    iget-object v3, v11, Lad/b;->e:Ljava/lang/String;

    .line 1044
    .line 1045
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1046
    .line 1047
    .line 1048
    move-result v3

    .line 1049
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v1

    .line 1053
    invoke-static {v1, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1054
    .line 1055
    .line 1056
    :cond_16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1057
    .line 1058
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1059
    .line 1060
    .line 1061
    iget-object v3, v11, Lad/b;->g:Ljava/lang/String;

    .line 1062
    .line 1063
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1064
    .line 1065
    .line 1066
    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 1067
    .line 1068
    invoke-static {v2, v3, v1}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v1

    .line 1072
    new-instance v2, Ljava/io/File;

    .line 1073
    .line 1074
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 1078
    .line 1079
    .line 1080
    move-result v1

    .line 1081
    if-eqz v1, :cond_17

    .line 1082
    .line 1083
    iget-object v2, v11, Lad/b;->e:Ljava/lang/String;

    .line 1084
    .line 1085
    iget-object v3, v11, Lad/b;->g:Ljava/lang/String;

    .line 1086
    .line 1087
    iget-object v4, v11, Lad/b;->f:Ljava/lang/String;

    .line 1088
    .line 1089
    iget-object v5, v11, Lad/b;->h:Ljava/lang/String;

    .line 1090
    .line 1091
    iget-boolean v6, v11, Lad/b;->k:Z

    .line 1092
    .line 1093
    iget-boolean v7, v11, Lad/b;->l:Z

    .line 1094
    .line 1095
    const/4 v8, 0x1

    .line 1096
    iget-boolean v10, v11, Lad/b;->n:Z

    .line 1097
    .line 1098
    iget-boolean v1, v11, Lad/b;->o:Z

    .line 1099
    .line 1100
    move/from16 v17, v1

    .line 1101
    .line 1102
    move-object/from16 v1, p0

    .line 1103
    .line 1104
    move-object/from16 v29, v11

    .line 1105
    .line 1106
    move/from16 v11, v16

    .line 1107
    .line 1108
    move-object/from16 v30, v12

    .line 1109
    .line 1110
    move/from16 v12, v17

    .line 1111
    .line 1112
    move-object v14, v13

    .line 1113
    move-object v13, v0

    .line 1114
    invoke-virtual/range {v1 .. v13}, Lvn/hunghd/flutterdownloader/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZIZLjava/lang/String;)Lo2/q;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v0

    .line 1118
    iget-object v1, v0, Lo2/q;->a:Ljava/util/UUID;

    .line 1119
    .line 1120
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v1

    .line 1124
    invoke-static {v1, v14}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1125
    .line 1126
    .line 1127
    invoke-interface {v15, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 1128
    .line 1129
    .line 1130
    sget-object v2, Lad/a;->b:Lad/a;

    .line 1131
    .line 1132
    move-object/from16 v3, v29

    .line 1133
    .line 1134
    iget v4, v3, Lad/b;->d:I

    .line 1135
    .line 1136
    move-object/from16 v14, p0

    .line 1137
    .line 1138
    invoke-virtual {v14, v1, v2, v4}, Lvn/hunghd/flutterdownloader/b;->e(Ljava/lang/String;Lad/a;I)V

    .line 1139
    .line 1140
    .line 1141
    iget-object v4, v14, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    .line 1142
    .line 1143
    invoke-static {v4}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1144
    .line 1145
    .line 1146
    iget v3, v3, Lad/b;->d:I

    .line 1147
    .line 1148
    move-object/from16 v5, v30

    .line 1149
    .line 1150
    invoke-virtual {v4, v5, v1, v2, v3}, Ld5/n;->h(Ljava/lang/String;Ljava/lang/String;Lad/a;I)V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/b;->d()Landroid/content/Context;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    invoke-static {v1}, Lp2/k0;->d(Landroid/content/Context;)Lp2/k0;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v1

    .line 1161
    invoke-virtual {v1, v0}, Lo2/p;->a(Lo2/q;)Lo2/m;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1166
    .line 1167
    .line 1168
    goto/16 :goto_c

    .line 1169
    .line 1170
    :cond_17
    move-object v5, v12

    .line 1171
    iget-object v0, v14, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    .line 1172
    .line 1173
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1174
    .line 1175
    .line 1176
    const/4 v1, 0x0

    .line 1177
    invoke-virtual {v0, v5, v1}, Ld5/n;->j(Ljava/lang/String;Z)V

    .line 1178
    .line 1179
    .line 1180
    const-string v4, "invalid_data"

    .line 1181
    .line 1182
    const-string v6, "not found partial downloaded data, this task cannot be resumed"

    .line 1183
    .line 1184
    goto :goto_8

    .line 1185
    :cond_18
    const-string v6, "only paused task can be resumed"

    .line 1186
    .line 1187
    move-object v4, v5

    .line 1188
    goto :goto_8

    .line 1189
    :cond_19
    move-object/from16 v6, v17

    .line 1190
    .line 1191
    :goto_8
    const/4 v0, 0x0

    .line 1192
    invoke-interface {v15, v4, v6, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1193
    .line 1194
    .line 1195
    goto/16 :goto_c

    .line 1196
    .line 1197
    :sswitch_9
    move-object/from16 v10, v19

    .line 1198
    .line 1199
    move-object/from16 v4, v22

    .line 1200
    .line 1201
    move-object/from16 v8, v24

    .line 1202
    .line 1203
    const-string v2, "remove"

    .line 1204
    .line 1205
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v1

    .line 1209
    if-nez v1, :cond_1a

    .line 1210
    .line 1211
    goto/16 :goto_f

    .line 1212
    .line 1213
    :cond_1a
    invoke-static {v0, v7}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v1

    .line 1217
    check-cast v1, Ljava/lang/String;

    .line 1218
    .line 1219
    const-string v2, "should_delete_content"

    .line 1220
    .line 1221
    invoke-static {v0, v2}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    check-cast v0, Ljava/lang/Boolean;

    .line 1226
    .line 1227
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1228
    .line 1229
    .line 1230
    move-result v0

    .line 1231
    iget-object v2, v14, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    .line 1232
    .line 1233
    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v2, v1}, Ld5/n;->e(Ljava/lang/String;)Lad/b;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v2

    .line 1240
    if-eqz v2, :cond_1f

    .line 1241
    .line 1242
    iget-object v3, v2, Lad/b;->c:Lad/a;

    .line 1243
    .line 1244
    sget-object v4, Lad/a;->a:Lad/a;

    .line 1245
    .line 1246
    if-eq v3, v4, :cond_1b

    .line 1247
    .line 1248
    sget-object v4, Lad/a;->b:Lad/a;

    .line 1249
    .line 1250
    if-ne v3, v4, :cond_1c

    .line 1251
    .line 1252
    :cond_1b
    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/b;->d()Landroid/content/Context;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v3

    .line 1256
    invoke-static {v3}, Lp2/k0;->d(Landroid/content/Context;)Lp2/k0;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v3

    .line 1260
    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v4

    .line 1264
    invoke-virtual {v3, v4}, Lp2/k0;->c(Ljava/util/UUID;)Lp2/o;

    .line 1265
    .line 1266
    .line 1267
    :cond_1c
    if-eqz v0, :cond_1e

    .line 1268
    .line 1269
    iget-object v0, v2, Lad/b;->f:Ljava/lang/String;

    .line 1270
    .line 1271
    if-nez v0, :cond_1d

    .line 1272
    .line 1273
    iget-object v0, v2, Lad/b;->e:Ljava/lang/String;

    .line 1274
    .line 1275
    const/4 v3, 0x6

    .line 1276
    invoke-static {v0, v8, v3}, Llc/k;->u0(Ljava/lang/String;Ljava/lang/String;I)I

    .line 1277
    .line 1278
    .line 1279
    move-result v3

    .line 1280
    add-int/2addr v3, v6

    .line 1281
    iget-object v4, v2, Lad/b;->e:Ljava/lang/String;

    .line 1282
    .line 1283
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1284
    .line 1285
    .line 1286
    move-result v4

    .line 1287
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    invoke-static {v0, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1292
    .line 1293
    .line 1294
    :cond_1d
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1295
    .line 1296
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1297
    .line 1298
    .line 1299
    iget-object v4, v2, Lad/b;->g:Ljava/lang/String;

    .line 1300
    .line 1301
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1302
    .line 1303
    .line 1304
    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    .line 1305
    .line 1306
    invoke-static {v3, v4, v0}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v0

    .line 1310
    new-instance v3, Ljava/io/File;

    .line 1311
    .line 1312
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 1316
    .line 1317
    .line 1318
    move-result v0

    .line 1319
    if-eqz v0, :cond_1e

    .line 1320
    .line 1321
    :try_start_0
    invoke-virtual {v14, v3}, Lvn/hunghd/flutterdownloader/b;->b(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1322
    .line 1323
    .line 1324
    goto :goto_9

    .line 1325
    :catch_0
    const-string v0, "FlutterDownloader"

    .line 1326
    .line 1327
    const-string v4, "Failed to delete file in media store, will fall back to normal delete()"

    .line 1328
    .line 1329
    invoke-static {v0, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1330
    .line 1331
    .line 1332
    :goto_9
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 1333
    .line 1334
    .line 1335
    :cond_1e
    iget-object v0, v14, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    .line 1336
    .line 1337
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1338
    .line 1339
    .line 1340
    iget-object v0, v0, Ld5/n;->b:Ljava/lang/Object;

    .line 1341
    .line 1342
    check-cast v0, Lvn/hunghd/flutterdownloader/c;

    .line 1343
    .line 1344
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v3

    .line 1348
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 1349
    .line 1350
    .line 1351
    :try_start_1
    const-string v0, "task_id = ?"

    .line 1352
    .line 1353
    new-array v4, v6, [Ljava/lang/String;

    .line 1354
    .line 1355
    const/4 v5, 0x0

    .line 1356
    aput-object v1, v4, v5

    .line 1357
    .line 1358
    move-object/from16 v10, v18

    .line 1359
    .line 1360
    invoke-virtual {v3, v10, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1364
    .line 1365
    .line 1366
    goto :goto_a

    .line 1367
    :catchall_0
    move-exception v0

    .line 1368
    goto :goto_b

    .line 1369
    :catch_1
    move-exception v0

    .line 1370
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1371
    .line 1372
    .line 1373
    :goto_a
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/b;->d()Landroid/content/Context;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v0

    .line 1380
    new-instance v1, Lu/u;

    .line 1381
    .line 1382
    invoke-direct {v1, v0}, Lu/u;-><init>(Landroid/content/Context;)V

    .line 1383
    .line 1384
    .line 1385
    iget v0, v2, Lad/b;->a:I

    .line 1386
    .line 1387
    iget-object v1, v1, Lu/u;->b:Landroid/app/NotificationManager;

    .line 1388
    .line 1389
    const/4 v2, 0x0

    .line 1390
    invoke-virtual {v1, v2, v0}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    .line 1391
    .line 1392
    .line 1393
    invoke-interface {v15, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 1394
    .line 1395
    .line 1396
    goto :goto_c

    .line 1397
    :goto_b
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 1398
    .line 1399
    .line 1400
    throw v0

    .line 1401
    :cond_1f
    const/4 v0, 0x0

    .line 1402
    move-object/from16 v1, v17

    .line 1403
    .line 1404
    invoke-interface {v15, v4, v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1405
    .line 1406
    .line 1407
    goto :goto_c

    .line 1408
    :sswitch_a
    const-string v2, "cancel"

    .line 1409
    .line 1410
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1411
    .line 1412
    .line 1413
    move-result v1

    .line 1414
    if-nez v1, :cond_20

    .line 1415
    .line 1416
    goto/16 :goto_f

    .line 1417
    .line 1418
    :cond_20
    invoke-static {v0, v7}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v0

    .line 1422
    check-cast v0, Ljava/lang/String;

    .line 1423
    .line 1424
    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/b;->d()Landroid/content/Context;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v1

    .line 1428
    invoke-static {v1}, Lp2/k0;->d(Landroid/content/Context;)Lp2/k0;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v1

    .line 1432
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v0

    .line 1436
    invoke-virtual {v1, v0}, Lp2/k0;->c(Ljava/util/UUID;)Lp2/o;

    .line 1437
    .line 1438
    .line 1439
    const/4 v0, 0x0

    .line 1440
    invoke-interface {v15, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 1441
    .line 1442
    .line 1443
    :goto_c
    move-object v4, v14

    .line 1444
    goto/16 :goto_10

    .line 1445
    .line 1446
    :sswitch_b
    move-object v6, v5

    .line 1447
    move-object/from16 v25, v10

    .line 1448
    .line 1449
    move-object/from16 v26, v16

    .line 1450
    .line 1451
    move-object/from16 v10, v18

    .line 1452
    .line 1453
    move-object/from16 v3, v21

    .line 1454
    .line 1455
    move-object/from16 v2, v23

    .line 1456
    .line 1457
    const-string v5, "enqueue"

    .line 1458
    .line 1459
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1460
    .line 1461
    .line 1462
    move-result v1

    .line 1463
    if-nez v1, :cond_21

    .line 1464
    .line 1465
    goto/16 :goto_f

    .line 1466
    .line 1467
    :cond_21
    invoke-static {v0, v4}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v1

    .line 1471
    move-object v5, v1

    .line 1472
    check-cast v5, Ljava/lang/String;

    .line 1473
    .line 1474
    invoke-static {v0, v6}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v1

    .line 1478
    check-cast v1, Ljava/lang/String;

    .line 1479
    .line 1480
    invoke-virtual {v0, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v16

    .line 1484
    move-object/from16 v14, v16

    .line 1485
    .line 1486
    check-cast v14, Ljava/lang/String;

    .line 1487
    .line 1488
    const-string v15, "headers"

    .line 1489
    .line 1490
    invoke-static {v0, v15}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v16

    .line 1494
    move-object/from16 v17, v15

    .line 1495
    .line 1496
    move-object/from16 v15, v16

    .line 1497
    .line 1498
    check-cast v15, Ljava/lang/String;

    .line 1499
    .line 1500
    invoke-static {v0, v2}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v2

    .line 1504
    check-cast v2, Ljava/lang/Number;

    .line 1505
    .line 1506
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1507
    .line 1508
    .line 1509
    move-result v16

    .line 1510
    const-string v2, "show_notification"

    .line 1511
    .line 1512
    invoke-static {v0, v2}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v18

    .line 1516
    check-cast v18, Ljava/lang/Boolean;

    .line 1517
    .line 1518
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1519
    .line 1520
    .line 1521
    move-result v18

    .line 1522
    move-object/from16 v19, v13

    .line 1523
    .line 1524
    const-string v13, "open_file_from_notification"

    .line 1525
    .line 1526
    invoke-static {v0, v13}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v20

    .line 1530
    check-cast v20, Ljava/lang/Boolean;

    .line 1531
    .line 1532
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1533
    .line 1534
    .line 1535
    move-result v20

    .line 1536
    invoke-static {v0, v9}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v9

    .line 1540
    check-cast v9, Ljava/lang/Boolean;

    .line 1541
    .line 1542
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1543
    .line 1544
    .line 1545
    move-result v9

    .line 1546
    move-object/from16 v21, v13

    .line 1547
    .line 1548
    const-string v13, "save_in_public_storage"

    .line 1549
    .line 1550
    invoke-static {v0, v13}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v22

    .line 1554
    check-cast v22, Ljava/lang/Boolean;

    .line 1555
    .line 1556
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1557
    .line 1558
    .line 1559
    move-result v22

    .line 1560
    invoke-static {v0, v8}, Lvn/hunghd/flutterdownloader/b;->c(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v23

    .line 1564
    check-cast v23, Ljava/lang/Boolean;

    .line 1565
    .line 1566
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1567
    .line 1568
    .line 1569
    move-result v23

    .line 1570
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v0

    .line 1574
    check-cast v0, Ljava/lang/String;

    .line 1575
    .line 1576
    const/16 v24, 0x0

    .line 1577
    .line 1578
    const/16 v27, 0x1

    .line 1579
    .line 1580
    move-object/from16 p1, v1

    .line 1581
    .line 1582
    move-object/from16 v1, p0

    .line 1583
    .line 1584
    move-object v3, v2

    .line 1585
    move-object v2, v5

    .line 1586
    move-object/from16 v31, v3

    .line 1587
    .line 1588
    move-object/from16 v3, p1

    .line 1589
    .line 1590
    move-object/from16 v32, v4

    .line 1591
    .line 1592
    move-object v4, v14

    .line 1593
    move-object/from16 v34, v5

    .line 1594
    .line 1595
    move-object/from16 v33, v6

    .line 1596
    .line 1597
    move-object/from16 v6, v26

    .line 1598
    .line 1599
    move-object v5, v15

    .line 1600
    move-object/from16 v35, v6

    .line 1601
    .line 1602
    move/from16 v6, v18

    .line 1603
    .line 1604
    move-object/from16 v26, v14

    .line 1605
    .line 1606
    move-object v14, v7

    .line 1607
    move/from16 v7, v20

    .line 1608
    .line 1609
    move-object/from16 v36, v8

    .line 1610
    .line 1611
    move/from16 v8, v24

    .line 1612
    .line 1613
    move-object/from16 v24, v10

    .line 1614
    .line 1615
    move-object/from16 v37, v25

    .line 1616
    .line 1617
    move/from16 v10, v22

    .line 1618
    .line 1619
    move-object/from16 v38, v11

    .line 1620
    .line 1621
    move/from16 v11, v16

    .line 1622
    .line 1623
    move-object/from16 v39, v12

    .line 1624
    .line 1625
    move/from16 v12, v23

    .line 1626
    .line 1627
    move-object/from16 v42, v13

    .line 1628
    .line 1629
    move-object/from16 v16, v15

    .line 1630
    .line 1631
    move-object/from16 v15, v19

    .line 1632
    .line 1633
    move-object/from16 v41, v21

    .line 1634
    .line 1635
    move-object/from16 v40, v24

    .line 1636
    .line 1637
    move-object v13, v0

    .line 1638
    invoke-virtual/range {v1 .. v13}, Lvn/hunghd/flutterdownloader/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZIZLjava/lang/String;)Lo2/q;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v0

    .line 1642
    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/b;->d()Landroid/content/Context;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v1

    .line 1646
    invoke-static {v1}, Lp2/k0;->d(Landroid/content/Context;)Lp2/k0;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v1

    .line 1650
    invoke-virtual {v1, v0}, Lo2/p;->a(Lo2/q;)Lo2/m;

    .line 1651
    .line 1652
    .line 1653
    iget-object v0, v0, Lo2/q;->a:Ljava/util/UUID;

    .line 1654
    .line 1655
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v0

    .line 1659
    move-object/from16 v1, v35

    .line 1660
    .line 1661
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1662
    .line 1663
    .line 1664
    move-object/from16 v1, p2

    .line 1665
    .line 1666
    move-object/from16 v2, v17

    .line 1667
    .line 1668
    invoke-interface {v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 1669
    .line 1670
    .line 1671
    sget-object v1, Lad/a;->a:Lad/a;

    .line 1672
    .line 1673
    const/4 v3, 0x0

    .line 1674
    move-object/from16 v4, p0

    .line 1675
    .line 1676
    move-object/from16 v5, v26

    .line 1677
    .line 1678
    invoke-virtual {v4, v0, v1, v3}, Lvn/hunghd/flutterdownloader/b;->e(Ljava/lang/String;Lad/a;I)V

    .line 1679
    .line 1680
    .line 1681
    iget-object v1, v4, Lvn/hunghd/flutterdownloader/b;->b:Ld5/n;

    .line 1682
    .line 1683
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1684
    .line 1685
    .line 1686
    iget-object v1, v1, Ld5/n;->b:Ljava/lang/Object;

    .line 1687
    .line 1688
    check-cast v1, Lvn/hunghd/flutterdownloader/c;

    .line 1689
    .line 1690
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v1

    .line 1694
    new-instance v6, Landroid/content/ContentValues;

    .line 1695
    .line 1696
    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 1697
    .line 1698
    .line 1699
    invoke-virtual {v6, v14, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1700
    .line 1701
    .line 1702
    move-object/from16 v0, v32

    .line 1703
    .line 1704
    move-object/from16 v7, v34

    .line 1705
    .line 1706
    invoke-virtual {v6, v0, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1707
    .line 1708
    .line 1709
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v0

    .line 1713
    move-object/from16 v7, v37

    .line 1714
    .line 1715
    invoke-virtual {v6, v7, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1716
    .line 1717
    .line 1718
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v0

    .line 1722
    move-object/from16 v7, v38

    .line 1723
    .line 1724
    invoke-virtual {v6, v7, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1725
    .line 1726
    .line 1727
    invoke-virtual {v6, v15, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1728
    .line 1729
    .line 1730
    move-object/from16 v5, p1

    .line 1731
    .line 1732
    move-object/from16 v0, v33

    .line 1733
    .line 1734
    invoke-virtual {v6, v0, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1735
    .line 1736
    .line 1737
    move-object/from16 v0, v16

    .line 1738
    .line 1739
    invoke-virtual {v6, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1740
    .line 1741
    .line 1742
    const-string v0, "mime_type"

    .line 1743
    .line 1744
    const-string v2, "unknown"

    .line 1745
    .line 1746
    invoke-virtual {v6, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1747
    .line 1748
    .line 1749
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v0

    .line 1753
    move-object/from16 v2, v31

    .line 1754
    .line 1755
    invoke-virtual {v6, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1756
    .line 1757
    .line 1758
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v0

    .line 1762
    move-object/from16 v2, v41

    .line 1763
    .line 1764
    invoke-virtual {v6, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1765
    .line 1766
    .line 1767
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v0

    .line 1771
    const-string v2, "resumable"

    .line 1772
    .line 1773
    invoke-virtual {v6, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1774
    .line 1775
    .line 1776
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1777
    .line 1778
    .line 1779
    move-result-wide v2

    .line 1780
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v0

    .line 1784
    move-object/from16 v2, v39

    .line 1785
    .line 1786
    invoke-virtual {v6, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1787
    .line 1788
    .line 1789
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v0

    .line 1793
    move-object/from16 v2, v42

    .line 1794
    .line 1795
    invoke-virtual {v6, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1796
    .line 1797
    .line 1798
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v0

    .line 1802
    move-object/from16 v2, v36

    .line 1803
    .line 1804
    invoke-virtual {v6, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1805
    .line 1806
    .line 1807
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 1808
    .line 1809
    .line 1810
    const/4 v0, 0x5

    .line 1811
    const/4 v2, 0x0

    .line 1812
    move-object/from16 v3, v40

    .line 1813
    .line 1814
    :try_start_3
    invoke-virtual {v1, v3, v2, v6, v0}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 1815
    .line 1816
    .line 1817
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1818
    .line 1819
    .line 1820
    goto :goto_d

    .line 1821
    :catchall_1
    move-exception v0

    .line 1822
    goto :goto_e

    .line 1823
    :catch_2
    move-exception v0

    .line 1824
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 1825
    .line 1826
    .line 1827
    :goto_d
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 1828
    .line 1829
    .line 1830
    goto :goto_10

    .line 1831
    :goto_e
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 1832
    .line 1833
    .line 1834
    throw v0

    .line 1835
    :cond_22
    :goto_f
    move-object v4, v14

    .line 1836
    move-object v1, v15

    .line 1837
    invoke-interface/range {p2 .. p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 1838
    .line 1839
    .line 1840
    :goto_10
    return-void

    .line 1841
    :sswitch_data_0
    .sparse-switch
        -0x5f0671f8 -> :sswitch_b
        -0x5185d186 -> :sswitch_a
        -0x37b5077c -> :sswitch_9
        -0x37b237d3 -> :sswitch_8
        -0x18089ff8 -> :sswitch_7
        0x34264a -> :sswitch_6
        0x65825f6 -> :sswitch_5
        0x67622a8 -> :sswitch_4
        0xdbb46ce -> :sswitch_3
        0x1c6788c7 -> :sswitch_2
        0x33ebcb90 -> :sswitch_1
        0x522fe648 -> :sswitch_0
    .end sparse-switch
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
.end method
