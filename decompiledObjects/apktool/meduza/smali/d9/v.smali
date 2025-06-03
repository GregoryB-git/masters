.class public final synthetic Ld9/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/firebase/firestore/FirebaseFirestore;

.field public final synthetic b:Lcom/google/firebase/firestore/l$a;

.field public final synthetic c:Lg9/m0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/l$a;Lg9/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/v;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p2, p0, Ld9/v;->b:Lcom/google/firebase/firestore/l$a;

    iput-object p3, p0, Ld9/v;->c:Lg9/m0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ld9/v;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v1, p0, Ld9/v;->b:Lcom/google/firebase/firestore/l$a;

    iget-object v2, p0, Ld9/v;->c:Lg9/m0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lcom/google/firebase/firestore/l;

    invoke-direct {v3, v2, v0}, Lcom/google/firebase/firestore/l;-><init>(Lg9/m0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    check-cast v1, Lq3/h;

    iget-object v0, v1, Lq3/h;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;

    iget-object v1, v1, Lq3/h;->c:Ljava/lang/Object;

    check-cast v1, Lio/flutter/plugin/common/EventChannel$EventSink;

    invoke-static {v0, v1, v3}, Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;->a(Lio/flutter/plugins/firebase/firestore/streamhandler/TransactionStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/firestore/l;)Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreTransactionResult;

    move-result-object v0

    return-object v0
.end method
