.class public final synthetic Lio/flutter/plugins/firebase/firestore/streamhandler/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld9/l;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;

.field public final synthetic b:Lio/flutter/plugin/common/EventChannel$EventSink;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/a;->a:Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;

    iput-object p2, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/a;->b:Lio/flutter/plugin/common/EventChannel$EventSink;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/a;->a:Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;

    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/a;->b:Lio/flutter/plugin/common/EventChannel$EventSink;

    check-cast p1, Lcom/google/firebase/firestore/d;

    invoke-static {v0, v1, p1, p2}, Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;->a(Lio/flutter/plugins/firebase/firestore/streamhandler/DocumentSnapshotsStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/firestore/d;Lcom/google/firebase/firestore/f;)V

    return-void
.end method
