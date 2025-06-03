.class public final synthetic Lio/flutter/plugins/googlesignin/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lio/flutter/plugins/googlesignin/a;->a:I

    iput-object p2, p0, Lio/flutter/plugins/googlesignin/a;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/flutter/plugins/googlesignin/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lio/flutter/plugins/googlesignin/a;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/googlesignin/a;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/a;->c:Ljava/lang/Object;

    check-cast v1, Ls7/e;

    invoke-static {v0, v1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->b(Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;Ls7/e;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/googlesignin/a;->b:Ljava/lang/Object;

    check-cast v0, Lu7/f;

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/a;->c:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;->h(Lu7/f;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
