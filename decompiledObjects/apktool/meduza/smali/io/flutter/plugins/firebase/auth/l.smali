.class public final synthetic Lio/flutter/plugins/firebase/auth/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILb8/r;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;)V
    .locals 0

    .line 1
    iput p1, p0, Lio/flutter/plugins/firebase/auth/l;->a:I

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/l;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/flutter/plugins/firebase/auth/l;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Lio/flutter/plugins/firebase/auth/l;->a:I

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/l;->c:Ljava/lang/Object;

    iput-object p3, p0, Lio/flutter/plugins/firebase/auth/l;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget v0, p0, Lio/flutter/plugins/firebase/auth/l;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/l;->b:Ljava/lang/Object;

    check-cast v0, Lb8/r;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/l;->c:Ljava/lang/Object;

    check-cast v1, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    invoke-static {v0, v1, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->h(Lb8/r;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/l;->b:Ljava/lang/Object;

    check-cast v0, Lb8/r;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/l;->c:Ljava/lang/Object;

    check-cast v1, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    invoke-static {v0, v1, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->m(Lb8/r;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/l;->b:Ljava/lang/Object;

    check-cast v1, Lb8/r;

    invoke-static {v1, v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->n(Lb8/r;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/l;->c:Ljava/lang/Object;

    check-cast v0, Lg9/n0;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/l;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, v0, Lg9/n0;->f:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p1}, Lg9/n0;->a(Lcom/google/android/gms/tasks/Task;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
