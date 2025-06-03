.class Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/renderer/FlutterUiDisplayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$1;->this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFlutterUiDisplayed()V
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$1;->this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;

    invoke-static {v0}, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;->access$000(Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;)Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$Host;

    move-result-object v0

    invoke-interface {v0}, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$Host;->onFlutterUiDisplayed()V

    iget-object v0, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$1;->this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;->access$102(Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;Z)Z

    iget-object v0, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$1;->this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;

    invoke-static {v0, v1}, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;->access$202(Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;Z)Z

    return-void
.end method

.method public onFlutterUiNoLongerDisplayed()V
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$1;->this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;

    invoke-static {v0}, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;->access$000(Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;)Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$Host;

    move-result-object v0

    invoke-interface {v0}, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$Host;->onFlutterUiNoLongerDisplayed()V

    iget-object v0, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$1;->this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;->access$102(Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;Z)Z

    return-void
.end method
