.class public Lio/flutter/plugins/firebase/firestore/streamhandler/LoadBundleStreamHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field private final bundle:[B

.field private eventSink:Lio/flutter/plugin/common/EventChannel$EventSink;

.field private final firestore:Lcom/google/firebase/firestore/FirebaseFirestore;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/LoadBundleStreamHandler;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p2, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/LoadBundleStreamHandler;->bundle:[B

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/firebase/firestore/streamhandler/LoadBundleStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/firestore/streamhandler/LoadBundleStreamHandler;->lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Exception;)V
    .locals 2

    invoke-static {p2}, Lio/flutter/plugins/firebase/firestore/utils/ExceptionConverter;->createDetails(Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string v1, "firebase_firestore"

    invoke-interface {p1, v1, p2, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lio/flutter/plugins/firebase/firestore/streamhandler/LoadBundleStreamHandler;->onCancel(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/LoadBundleStreamHandler;->eventSink:Lio/flutter/plugin/common/EventChannel$EventSink;

    invoke-interface {p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->endOfStream()V

    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 6

    .line 1
    iput-object p2, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/LoadBundleStreamHandler;->eventSink:Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 2
    .line 3
    iget-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/LoadBundleStreamHandler;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 4
    .line 5
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/LoadBundleStreamHandler;->bundle:[B

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Ld9/c0;

    .line 16
    .line 17
    invoke-direct {v0}, Ld9/c0;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p1, Lcom/google/firebase/firestore/FirebaseFirestore;->k:Ld9/x;

    .line 21
    .line 22
    monitor-enter p1

    .line 23
    :try_start_0
    invoke-virtual {p1}, Ld9/x;->b()V

    .line 24
    .line 25
    .line 26
    iget-object v2, p1, Ld9/x;->b:Lg9/u;

    .line 27
    .line 28
    invoke-virtual {v2}, Lg9/u;->d()V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lf9/f;

    .line 32
    .line 33
    iget-object v4, v2, Lg9/u;->e:Lf9/g;

    .line 34
    .line 35
    invoke-direct {v3, v4, v1}, Lf9/f;-><init>(Lf9/g;Ljava/io/InputStream;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v2, Lg9/u;->d:Ln9/a;

    .line 39
    .line 40
    new-instance v4, Lv3/x0;

    .line 41
    .line 42
    const/4 v5, 0x4

    .line 43
    invoke-direct {v4, v2, v3, v0, v5}, Lv3/x0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v4}, Ln9/a;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    .line 48
    .line 49
    monitor-exit p1

    .line 50
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    new-instance p1, Le;

    .line 54
    .line 55
    const/16 v1, 0xf

    .line 56
    .line 57
    invoke-direct {p1, p2, v1}, Le;-><init>(Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Ld9/c0$a;

    .line 61
    .line 62
    invoke-direct {v1, p1}, Ld9/c0$a;-><init>(Le;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, v0, Ld9/c0;->a:Ljava/lang/Object;

    .line 66
    .line 67
    monitor-enter v2

    .line 68
    :try_start_1
    iget-object p1, v0, Ld9/c0;->e:Ljava/util/ArrayDeque;

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    new-instance p1, Lk1/a;

    .line 75
    .line 76
    const/16 v1, 0xd

    .line 77
    .line 78
    invoke-direct {p1, v1, p0, p2}, Lk1/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p1}, Ld9/c0;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    throw p1

    .line 88
    :catchall_1
    move-exception p2

    .line 89
    monitor-exit p1

    .line 90
    throw p2
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
