.class public final synthetic Lio/flutter/plugins/urllauncher/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;I)V
    .locals 0

    iput p2, p0, Lio/flutter/plugins/urllauncher/a;->a:I

    iput-object p1, p0, Lio/flutter/plugins/urllauncher/a;->b:Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    iget v0, p0, Lio/flutter/plugins/urllauncher/a;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugins/urllauncher/a;->b:Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/urllauncher/b;->b(Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/urllauncher/a;->b:Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/urllauncher/b;->f(Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
