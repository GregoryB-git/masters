.class public Lcom/ryanheise/audioservice/a$b;
.super Landroid/support/v4/media/MediaBrowserCompat$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/ryanheise/audioservice/a;


# direct methods
.method public constructor <init>(Lcom/ryanheise/audioservice/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ryanheise/audioservice/a$b;->c:Lcom/ryanheise/audioservice/a;

    invoke-direct {p0}, Landroid/support/v4/media/MediaBrowserCompat$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$b;->c:Lcom/ryanheise/audioservice/a;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->b(Lcom/ryanheise/audioservice/a;)Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/ryanheise/audioservice/a;->m()Landroid/support/v4/media/MediaBrowserCompat;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/MediaBrowserCompat;->c()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v1

    new-instance v2, Landroid/support/v4/media/session/MediaControllerCompat;

    iget-object v3, p0, Lcom/ryanheise/audioservice/a$b;->c:Lcom/ryanheise/audioservice/a;

    invoke-static {v3}, Lcom/ryanheise/audioservice/a;->b(Lcom/ryanheise/audioservice/a;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Landroid/support/v4/media/session/MediaControllerCompat;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    invoke-static {v2}, Lcom/ryanheise/audioservice/a;->o(Landroid/support/v4/media/session/MediaControllerCompat;)Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-static {}, Lcom/ryanheise/audioservice/a;->p()Lcom/ryanheise/audioservice/a$d;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/ryanheise/audioservice/a;->p()Lcom/ryanheise/audioservice/a$d;

    move-result-object v1

    invoke-static {v1}, Lcom/ryanheise/audioservice/a$d;->a(Lcom/ryanheise/audioservice/a$d;)Landroid/app/Activity;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_2

    invoke-static {}, Lcom/ryanheise/audioservice/a;->n()Landroid/support/v4/media/session/MediaControllerCompat;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/support/v4/media/session/MediaControllerCompat;->f(Landroid/app/Activity;Landroid/support/v4/media/session/MediaControllerCompat;)V

    :cond_2
    invoke-static {}, Lcom/ryanheise/audioservice/a;->n()Landroid/support/v4/media/session/MediaControllerCompat;

    move-result-object v1

    invoke-static {}, Lcom/ryanheise/audioservice/a;->r()Landroid/support/v4/media/session/MediaControllerCompat$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/session/MediaControllerCompat;->d(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    invoke-static {}, Lcom/ryanheise/audioservice/a;->s()LE5/k$d;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {}, Lcom/ryanheise/audioservice/a;->s()LE5/k$d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v2}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v1, v2}, LE5/k$d;->a(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->t(LE5/k$d;)LE5/k$d;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onConnected error: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {}, Lcom/ryanheise/audioservice/a;->s()LE5/k$d;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {}, Lcom/ryanheise/audioservice/a;->s()LE5/k$d;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1, v0, v0}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$b;->c:Lcom/ryanheise/audioservice/a;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->u(Lcom/ryanheise/audioservice/a;)Lcom/ryanheise/audioservice/a$d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ryanheise/audioservice/a$d;->f(Z)V

    :cond_4
    :goto_2
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/a;->s()LE5/k$d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/ryanheise/audioservice/a;->s()LE5/k$d;

    move-result-object v0

    const-string v1, "Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README."

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, v2}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$b;->c:Lcom/ryanheise/audioservice/a;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->u(Lcom/ryanheise/audioservice/a;)Lcom/ryanheise/audioservice/a$d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ryanheise/audioservice/a$d;->f(Z)V

    :goto_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "### UNHANDLED: onConnectionSuspended"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method
