.class public final synthetic Lio/flutter/plugins/firebase/auth/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb8/r;

.field public final synthetic c:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;


# direct methods
.method public synthetic constructor <init>(Lb8/r;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lio/flutter/plugins/firebase/auth/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/k;->b:Lb8/r;

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/k;->c:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lb8/r;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lio/flutter/plugins/firebase/auth/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/k;->c:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/k;->b:Lb8/r;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget v0, p0, Lio/flutter/plugins/firebase/auth/k;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/k;->c:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/k;->b:Lb8/r;

    invoke-static {v1, v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->t(Lb8/r;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/k;->b:Lb8/r;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/k;->c:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    invoke-static {v0, v1, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->i(Lb8/r;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
