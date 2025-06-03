.class public final synthetic Lio/flutter/plugins/urllauncher/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/urllauncher/UrlLauncher$IntentResolver;
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;


# instance fields
.field public final synthetic a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/urllauncher/c;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getHandlerComponentName(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/urllauncher/c;->a:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-static {v0, p1}, Lio/flutter/plugins/urllauncher/UrlLauncher;->a(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/urllauncher/c;->a:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/urllauncher/b;->c(Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method
