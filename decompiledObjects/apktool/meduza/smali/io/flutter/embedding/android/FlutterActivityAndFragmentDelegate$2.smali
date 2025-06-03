.class Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;->delayFirstAndroidViewDraw(Lio/flutter/embedding/android/FlutterView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;

.field public final synthetic val$flutterView:Lio/flutter/embedding/android/FlutterView;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;Lio/flutter/embedding/android/FlutterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$2;->this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;

    iput-object p2, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$2;->val$flutterView:Lio/flutter/embedding/android/FlutterView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$2;->this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;

    invoke-static {v0}, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;->access$100(Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$2;->this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;

    iget-object v0, v0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;->activePreDrawListener:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$2;->val$flutterView:Lio/flutter/embedding/android/FlutterView;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    iget-object v0, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$2;->this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;

    const/4 v1, 0x0

    iput-object v1, v0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;->activePreDrawListener:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate$2;->this$0:Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;

    invoke-static {v0}, Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;->access$100(Lio/flutter/embedding/android/FlutterActivityAndFragmentDelegate;)Z

    move-result v0

    return v0
.end method
