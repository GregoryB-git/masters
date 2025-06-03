.class public final Lcom/ryanheise/audioservice/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$Result;


# instance fields
.field public final synthetic a:Lg1/c$i;


# direct methods
.method public constructor <init>(Lg1/c$i;)V
    .locals 0

    iput-object p1, p0, Lcom/ryanheise/audioservice/d;->a:Lg1/c$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lcom/ryanheise/audioservice/d;->a:Lg1/c$i;

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, p2}, Lg1/c$i;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public final notImplemented()V
    .locals 2

    iget-object v0, p0, Lcom/ryanheise/audioservice/d;->a:Lg1/c$i;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1}, Lg1/c$i;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public final success(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/util/Map;

    const-string v0, "mediaItem"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/ryanheise/audioservice/b;->a(Ljava/util/Map;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    move-result-object p1

    iget-object v0, p0, Lcom/ryanheise/audioservice/d;->a:Lg1/c$i;

    invoke-virtual {v0, p1}, Lg1/c$i;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/ryanheise/audioservice/d;->a:Lg1/c$i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lg1/c$i;->f(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
