.class public final synthetic Lio/flutter/plugins/firebase/firestore/streamhandler/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/b;->a:I

    iput-object p2, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/b;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/b;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/b;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Intent;

    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;->a(Landroid/content/Intent;Ljava/util/concurrent/CountDownLatch;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/b;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugin/common/EventChannel$EventSink;

    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->b(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/Map;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/b;->b:Ljava/lang/Object;

    check-cast v0, Lio/meduza/meduza/MainActivity;

    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/streamhandler/b;->c:Ljava/lang/Object;

    check-cast v1, Lec/s;

    iget-object v0, v0, Lio/meduza/meduza/MainActivity;->b:Lio/flutter/plugin/common/MethodChannel;

    if-eqz v0, :cond_0

    iget-object v1, v1, Lec/s;->a:Ljava/lang/Object;

    const-string v2, "wakeUp"

    invoke-virtual {v0, v2, v1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
