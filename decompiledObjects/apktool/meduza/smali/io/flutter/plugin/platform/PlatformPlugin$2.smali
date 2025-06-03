.class Lio/flutter/plugin/platform/PlatformPlugin$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugin/platform/PlatformPlugin;->setSystemChromeChangeListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/plugin/platform/PlatformPlugin;

.field public final synthetic val$decorView:Landroid/view/View;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/platform/PlatformPlugin;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugin/platform/PlatformPlugin$2;->this$0:Lio/flutter/plugin/platform/PlatformPlugin;

    iput-object p2, p0, Lio/flutter/plugin/platform/PlatformPlugin$2;->val$decorView:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/platform/PlatformPlugin$2;I)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/PlatformPlugin$2;->lambda$onSystemUiVisibilityChange$0(I)V

    return-void
.end method

.method private synthetic lambda$onSystemUiVisibilityChange$0(I)V
    .locals 1

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugin/platform/PlatformPlugin$2;->this$0:Lio/flutter/plugin/platform/PlatformPlugin;

    invoke-static {p1}, Lio/flutter/plugin/platform/PlatformPlugin;->access$1400(Lio/flutter/plugin/platform/PlatformPlugin;)Lio/flutter/embedding/engine/systemchannels/PlatformChannel;

    move-result-object p1

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/flutter/plugin/platform/PlatformPlugin$2;->this$0:Lio/flutter/plugin/platform/PlatformPlugin;

    invoke-static {p1}, Lio/flutter/plugin/platform/PlatformPlugin;->access$1400(Lio/flutter/plugin/platform/PlatformPlugin;)Lio/flutter/embedding/engine/systemchannels/PlatformChannel;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lio/flutter/embedding/engine/systemchannels/PlatformChannel;->systemChromeChanged(Z)V

    return-void
.end method


# virtual methods
.method public onSystemUiVisibilityChange(I)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformPlugin$2;->val$decorView:Landroid/view/View;

    new-instance v1, Lio/flutter/plugin/platform/a;

    invoke-direct {v1, p0, p1}, Lio/flutter/plugin/platform/a;-><init>(Lio/flutter/plugin/platform/PlatformPlugin$2;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
