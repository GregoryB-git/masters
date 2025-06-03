.class public Lio/flutter/plugins/firebase/firestore/streamhandler/SnapshotsInSyncStreamHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field public firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

.field public listenerRegistration:Ld9/b0;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/SnapshotsInSyncStreamHandler;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/firebase/firestore/streamhandler/SnapshotsInSyncStreamHandler;->lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    return-void
.end method

.method private static synthetic lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/SnapshotsInSyncStreamHandler;->listenerRegistration:Ld9/b0;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ld9/b0;->remove()V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/SnapshotsInSyncStreamHandler;->listenerRegistration:Ld9/b0;

    :cond_0
    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 4

    .line 1
    new-instance p1, Lu/a;

    .line 2
    .line 3
    const/16 v0, 0x13

    .line 4
    .line 5
    invoke-direct {p1, p2, v0}, Lu/a;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/SnapshotsInSyncStreamHandler;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, Ln9/f;->a:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    new-instance v1, Ld9/u;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Ld9/u;-><init>(Lu/a;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lg9/d;

    .line 21
    .line 22
    invoke-direct {p1, v0, v1}, Lg9/d;-><init>(Ljava/util/concurrent/Executor;Ld9/l;)V

    .line 23
    .line 24
    .line 25
    iget-object p2, p2, Lcom/google/firebase/firestore/FirebaseFirestore;->k:Ld9/x;

    .line 26
    .line 27
    monitor-enter p2

    .line 28
    :try_start_0
    invoke-virtual {p2}, Ld9/x;->b()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p2, Ld9/x;->b:Lg9/u;

    .line 32
    .line 33
    invoke-virtual {v0}, Lg9/u;->d()V

    .line 34
    .line 35
    .line 36
    iget-object v1, v0, Lg9/u;->d:Ln9/a;

    .line 37
    .line 38
    new-instance v2, Lx0/q0;

    .line 39
    .line 40
    const/16 v3, 0xc

    .line 41
    .line 42
    invoke-direct {v2, v3, v0, p1}, Lx0/q0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ln9/a;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 46
    .line 47
    .line 48
    new-instance v1, Ld9/w;

    .line 49
    .line 50
    invoke-direct {v1, p1, v0}, Ld9/w;-><init>(Lg9/d;Lg9/u;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    monitor-exit p2

    .line 54
    iput-object v1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/SnapshotsInSyncStreamHandler;->listenerRegistration:Ld9/b0;

    .line 55
    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    monitor-exit p2

    .line 59
    throw p1
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
