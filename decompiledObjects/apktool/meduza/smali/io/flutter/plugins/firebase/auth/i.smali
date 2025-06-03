.class public final synthetic Lio/flutter/plugins/firebase/auth/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;I)V
    .locals 0

    iput p2, p0, Lio/flutter/plugins/firebase/auth/i;->a:I

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/i;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget v0, p0, Lio/flutter/plugins/firebase/auth/i;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/i;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->r(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/i;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->j(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/i;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->d(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/i;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;->f(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/i;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;->b(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/i;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseMultiFactor;->c(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
