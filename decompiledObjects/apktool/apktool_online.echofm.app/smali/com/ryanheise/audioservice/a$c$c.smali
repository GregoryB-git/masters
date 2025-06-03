.class public Lcom/ryanheise/audioservice/a$c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ryanheise/audioservice/a$c;->i(Ljava/lang/String;Landroid/os/Bundle;La0/d$l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La0/d$l;

.field public final synthetic b:Lcom/ryanheise/audioservice/a$c;


# direct methods
.method public constructor <init>(Lcom/ryanheise/audioservice/a$c;La0/d$l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/a$c$c;->b:Lcom/ryanheise/audioservice/a$c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/ryanheise/audioservice/a$c$c;->a:La0/d$l;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    .line 1
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

    invoke-static {v1}, Lcom/ryanheise/audioservice/a;->g(Ljava/util/Map;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/ryanheise/audioservice/a$c$c;->a:La0/d$l;

    invoke-virtual {p1, v0}, La0/d$l;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/ryanheise/audioservice/a$c$c;->a:La0/d$l;

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, p2}, La0/d$l;->f(Landroid/os/Bundle;)V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$c$c;->a:La0/d$l;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1}, La0/d$l;->f(Landroid/os/Bundle;)V

    return-void
.end method
