.class public final synthetic Lio/flutter/plugins/firebase/firestore/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

.field public final synthetic c:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest;

.field public final synthetic d:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lio/flutter/plugins/firebase/firestore/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/b;->c:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest;

    iput-object p2, p0, Lio/flutter/plugins/firebase/firestore/b;->b:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

    iput-object p3, p0, Lio/flutter/plugins/firebase/firestore/b;->d:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;

    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lio/flutter/plugins/firebase/firestore/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/b;->b:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

    iput-object p2, p0, Lio/flutter/plugins/firebase/firestore/b;->c:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest;

    iput-object p3, p0, Lio/flutter/plugins/firebase/firestore/b;->d:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lio/flutter/plugins/firebase/firestore/b;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/b;->c:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest;

    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/b;->b:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

    iget-object v2, p0, Lio/flutter/plugins/firebase/firestore/b;->d:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->e(Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/b;->b:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/b;->c:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest;

    iget-object v2, p0, Lio/flutter/plugins/firebase/firestore/b;->d:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;

    invoke-static {v1, v0, v2}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->g(Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
