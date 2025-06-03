.class public final synthetic Lio/flutter/plugins/firebase/auth/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lu7/f;

.field public final synthetic c:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lu7/f;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    .locals 0

    iput p3, p0, Lio/flutter/plugins/firebase/auth/f;->a:I

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/f;->b:Lu7/f;

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/f;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lio/flutter/plugins/firebase/auth/f;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/f;->b:Lu7/f;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/f;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;->k(Lu7/f;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/f;->b:Lu7/f;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/f;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->a(Lu7/f;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
