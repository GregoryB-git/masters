.class public final synthetic Lio/flutter/embedding/engine/loader/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/io/Serializable;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p6, p0, Lio/flutter/embedding/engine/loader/a;->a:I

    iput-object p1, p0, Lio/flutter/embedding/engine/loader/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lio/flutter/embedding/engine/loader/a;->c:Ljava/lang/Object;

    iput-object p3, p0, Lio/flutter/embedding/engine/loader/a;->d:Ljava/io/Serializable;

    iput-object p4, p0, Lio/flutter/embedding/engine/loader/a;->e:Ljava/lang/Object;

    iput-object p5, p0, Lio/flutter/embedding/engine/loader/a;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lio/flutter/embedding/engine/loader/a;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/embedding/engine/loader/a;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/embedding/engine/loader/FlutterLoader;

    iget-object v1, p0, Lio/flutter/embedding/engine/loader/a;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lio/flutter/embedding/engine/loader/a;->d:Ljava/io/Serializable;

    check-cast v2, [Ljava/lang/String;

    iget-object v3, p0, Lio/flutter/embedding/engine/loader/a;->e:Ljava/lang/Object;

    check-cast v3, Landroid/os/Handler;

    iget-object v4, p0, Lio/flutter/embedding/engine/loader/a;->f:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3, v4}, Lio/flutter/embedding/engine/loader/FlutterLoader;->a(Lio/flutter/embedding/engine/loader/FlutterLoader;Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/embedding/engine/loader/a;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;

    iget-object v1, p0, Lio/flutter/embedding/engine/loader/a;->c:Ljava/lang/Object;

    check-cast v1, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

    iget-object v2, p0, Lio/flutter/embedding/engine/loader/a;->d:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lio/flutter/embedding/engine/loader/a;->e:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lio/flutter/embedding/engine/loader/a;->f:Ljava/lang/Object;

    check-cast v4, Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;

    invoke-static {v0, v1, v2, v3, v4}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->h(Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
