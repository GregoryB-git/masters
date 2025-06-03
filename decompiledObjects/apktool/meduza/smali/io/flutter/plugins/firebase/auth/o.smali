.class public final synthetic Lio/flutter/plugins/firebase/auth/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/flutter/plugins/firebase/auth/o;->a:I

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/o;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget v0, p0, Lio/flutter/plugins/firebase/auth/o;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/o;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->l(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/o;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    invoke-static {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->a(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
