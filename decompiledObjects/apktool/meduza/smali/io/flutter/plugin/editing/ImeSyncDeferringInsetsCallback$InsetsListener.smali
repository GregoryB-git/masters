.class Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback$InsetsListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "InsetsListener"
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;


# direct methods
.method private constructor <init>(Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback$InsetsListener;->this$0:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback$InsetsListener;-><init>(Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;)V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback$InsetsListener;->this$0:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    invoke-static {v0, p1}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;->access$402(Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;Landroid/view/View;)Landroid/view/View;

    iget-object v0, p0, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback$InsetsListener;->this$0:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    invoke-static {v0}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;->access$100(Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback$InsetsListener;->this$0:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    invoke-static {v0, p2}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;->access$502(Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    iget-object v0, p0, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback$InsetsListener;->this$0:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;->access$102(Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;Z)Z

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback$InsetsListener;->this$0:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    invoke-static {v0}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;->access$300(Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    return-object p1

    :cond_1
    invoke-virtual {p1, p2}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
