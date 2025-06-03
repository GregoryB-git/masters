.class public final Lcom/ryanheise/audioservice/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$Result;


# instance fields
.field public final synthetic a:Lg1/c$i;


# direct methods
.method public constructor <init>(Lg1/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ryanheise/audioservice/e;->a:Lg1/c$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lcom/ryanheise/audioservice/e;->a:Lg1/c$i;

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, p2}, Lg1/c$i;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public final notImplemented()V
    .locals 2

    iget-object v0, p0, Lcom/ryanheise/audioservice/e;->a:Lg1/c$i;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1}, Lg1/c$i;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public final success(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Ljava/util/Map;

    const-string v0, "mediaItems"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-static {v1}, Lcom/ryanheise/audioservice/b;->a(Ljava/util/Map;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/ryanheise/audioservice/e;->a:Lg1/c$i;

    invoke-virtual {p1, v0}, Lg1/c$i;->f(Ljava/lang/Object;)V

    return-void
.end method
