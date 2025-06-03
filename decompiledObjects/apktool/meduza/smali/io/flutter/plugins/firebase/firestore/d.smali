.class public final synthetic Lio/flutter/plugins/firebase/firestore/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

.field public final synthetic c:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;I)V
    .locals 0

    iput p3, p0, Lio/flutter/plugins/firebase/firestore/d;->a:I

    iput-object p1, p0, Lio/flutter/plugins/firebase/firestore/d;->b:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

    iput-object p2, p0, Lio/flutter/plugins/firebase/firestore/d;->c:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lio/flutter/plugins/firebase/firestore/d;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/d;->b:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/d;->c:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->b(Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/firestore/d;->b:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;

    iget-object v1, p0, Lio/flutter/plugins/firebase/firestore/d;->c:Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestorePlugin;->n(Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp;Lio/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$Result;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
