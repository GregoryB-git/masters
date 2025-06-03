.class public final synthetic Lio/flutter/plugins/firebase/messaging/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager$RequestPermissionsSuccessCallback;


# instance fields
.field public final synthetic a:Ljava/util/Map;

.field public final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Ljava/util/HashMap;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/c;->a:Ljava/util/Map;

    iput-object p2, p0, Lio/flutter/plugins/firebase/messaging/c;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final onSuccess(I)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/c;->a:Ljava/util/Map;

    iget-object v1, p0, Lio/flutter/plugins/firebase/messaging/c;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, p1}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;->e(Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    return-void
.end method
