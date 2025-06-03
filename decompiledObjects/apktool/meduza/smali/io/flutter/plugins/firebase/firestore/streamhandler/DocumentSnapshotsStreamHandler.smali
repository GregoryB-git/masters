.class public Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field public documentReference:Lcom/google/firebase/firestore/c;

.field public firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

.field public listenerRegistration:Ld9/b0;

.field public metadataChanges:Ld9/j0;

.field public serverTimestampBehavior:Lcom/google/firebase/firestore/d$a;

.field public source:Ld9/a0;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/c;Ljava/lang/Boolean;Lcom/google/firebase/firestore/d$a;Ld9/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p2, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->documentReference:Lcom/google/firebase/firestore/c;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ld9/j0;->b:Ld9/j0;

    goto :goto_0

    :cond_0
    sget-object p1, Ld9/j0;->a:Ld9/j0;

    :goto_0
    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->metadataChanges:Ld9/j0;

    iput-object p4, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->serverTimestampBehavior:Lcom/google/firebase/firestore/d$a;

    iput-object p5, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->source:Ld9/a0;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/firestore/d;Lcom/google/firebase/firestore/f;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/firestore/d;Lcom/google/firebase/firestore/f;)V

    return-void
.end method

.method private synthetic lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/firestore/d;Lcom/google/firebase/firestore/f;)V
    .locals 1

    if-eqz p3, :cond_0

    invoke-static {p3}, Lio/flutter/plugins/firebase/firestore/utils/ExceptionConverter;->createDetails(Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    const-string v0, "firebase_firestore"

    invoke-interface {p1, v0, p3, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->endOfStream()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->onCancel(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->serverTimestampBehavior:Lcom/google/firebase/firestore/d$a;

    invoke-static {p2, p3}, Lio/flutter/plugins/firebase/firestore/utils/PigeonParser;->toPigeonDocumentSnapshot(Lcom/google/firebase/firestore/d;Lcom/google/firebase/firestore/d$a;)Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonDocumentSnapshot;

    move-result-object p2

    invoke-virtual {p2}, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$PigeonDocumentSnapshot;->toList()Ljava/util/ArrayList;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->listenerRegistration:Ld9/b0;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ld9/b0;->remove()V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->listenerRegistration:Ld9/b0;

    :cond_0
    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 8

    .line 1
    sget-object p1, Ln9/f;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->metadataChanges:Ld9/j0;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->source:Ld9/a0;

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->documentReference:Lcom/google/firebase/firestore/c;

    .line 12
    .line 13
    new-instance v3, Lio/flutter/plugins/firebase/firestore/streamhandler/a;

    .line 14
    .line 15
    invoke-direct {v3, p0, p2}, Lio/flutter/plugins/firebase/firestore/streamhandler/a;-><init>(Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p2, Lg9/k$a;

    .line 22
    .line 23
    invoke-direct {p2}, Lg9/k$a;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v4, Ld9/j0;->b:Ld9/j0;

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    const/4 v6, 0x0

    .line 30
    if-ne v0, v4, :cond_0

    .line 31
    .line 32
    move v7, v5

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v7, v6

    .line 35
    :goto_0
    iput-boolean v7, p2, Lg9/k$a;->a:Z

    .line 36
    .line 37
    if-ne v0, v4, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v5, v6

    .line 41
    :goto_1
    iput-boolean v5, p2, Lg9/k$a;->b:Z

    .line 42
    .line 43
    iput-boolean v6, p2, Lg9/k$a;->c:Z

    .line 44
    .line 45
    iput-object v1, p2, Lg9/k$a;->d:Ld9/a0;

    .line 46
    .line 47
    invoke-virtual {v2, p1, p2, v3}, Lcom/google/firebase/firestore/c;->a(Ljava/util/concurrent/Executor;Lg9/k$a;Ld9/l;)Ld9/b0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->listenerRegistration:Ld9/b0;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 55
    .line 56
    const-string p2, "listen source must not be null."

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 63
    .line 64
    const-string p2, "metadataChanges must not be null."

    .line 65
    .line 66
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1
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
