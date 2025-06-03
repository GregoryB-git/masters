.class public final synthetic Lio/flutter/plugins/firebase/auth/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lio/flutter/plugins/firebase/auth/n;->a:I

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/n;->c:Ljava/lang/Object;

    iput-object p3, p0, Lio/flutter/plugins/firebase/auth/n;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lb8/r;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lio/flutter/plugins/firebase/auth/n;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/n;->b:Ljava/lang/Object;

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/n;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget v0, p0, Lio/flutter/plugins/firebase/auth/n;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/n;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/n;->c:Ljava/lang/Object;

    check-cast v1, Lb8/r;

    invoke-static {v1, v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->o(Lb8/r;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/n;->c:Ljava/lang/Object;

    check-cast v0, Lb8/r;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/n;->b:Ljava/lang/Object;

    check-cast v1, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    invoke-static {v0, v1, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->k(Lb8/r;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/n;->c:Ljava/lang/Object;

    check-cast v0, Laa/h;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/n;->b:Ljava/lang/Object;

    check-cast v1, Landroid/content/Intent;

    invoke-static {v0, v1, p1}, Laa/h;->a(Laa/h;Landroid/content/Intent;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
