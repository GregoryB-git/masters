.class public final synthetic Lio/flutter/plugins/firebase/auth/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;I)V
    .locals 0

    iput p2, p0, Lio/flutter/plugins/firebase/auth/h;->a:I

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/h;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget v0, p0, Lio/flutter/plugins/firebase/auth/h;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/h;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->e(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/h;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->f(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/h;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->q(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/h;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;->g(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/h;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseMultiFactor;->a(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
