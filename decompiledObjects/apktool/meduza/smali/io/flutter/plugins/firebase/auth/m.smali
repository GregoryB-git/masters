.class public final synthetic Lio/flutter/plugins/firebase/auth/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

.field public final synthetic c:Lb8/r;


# direct methods
.method public synthetic constructor <init>(ILb8/r;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;)V
    .locals 0

    iput p1, p0, Lio/flutter/plugins/firebase/auth/m;->a:I

    iput-object p3, p0, Lio/flutter/plugins/firebase/auth/m;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/m;->c:Lb8/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget v0, p0, Lio/flutter/plugins/firebase/auth/m;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/m;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/m;->c:Lb8/r;

    invoke-static {v1, v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->a(Lb8/r;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/m;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/m;->c:Lb8/r;

    invoke-static {v1, v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->g(Lb8/r;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
