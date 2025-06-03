.class public Lcom/ryanheise/audioservice/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$c;
.implements Lcom/ryanheise/audioservice/AudioService$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:LE5/c;

.field public b:LE5/k;

.field public c:Landroid/media/AudioTrack;

.field public final d:Landroid/os/Handler;

.field public e:Ljava/util/List;


# direct methods
.method public constructor <init>(LE5/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/ryanheise/audioservice/a$c;->d:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Ljava/util/LinkedList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/ryanheise/audioservice/a$c;->e:Ljava/util/List;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/ryanheise/audioservice/a$c;->a:LE5/c;

    .line 23
    .line 24
    new-instance v0, LE5/k;

    .line 25
    .line 26
    const-string v1, "com.ryanheise.audio_service.handler.methods"

    .line 27
    .line 28
    invoke-direct {v0, p1, v1}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/ryanheise/audioservice/a$c;->b:LE5/k;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, LE5/k;->e(LE5/k$c;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static synthetic K(LE5/k$d;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/ryanheise/audioservice/a$c;->Y(LE5/k$d;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic L(LE5/k$d;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/a$c;->U(LE5/k$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic M(LE5/k$d;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/ryanheise/audioservice/a$c;->V(LE5/k$d;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic N(LE5/k$d;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/a$c;->X(LE5/k$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic O(Lcom/ryanheise/audioservice/a$c;Ljava/util/Map;LE5/k$d;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/ryanheise/audioservice/a$c;->Z(Ljava/util/Map;LE5/k$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic P(Lcom/ryanheise/audioservice/a$c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/a$c;->Q()V

    return-void
.end method

.method public static synthetic U(LE5/k$d;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic V(LE5/k$d;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "Unexpected error"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v1, "UNEXPECTED_ERROR"

    .line 8
    .line 9
    invoke-interface {p0, v1, v0, p1}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic X(LE5/k$d;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic Y(LE5/k$d;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "Unexpected error"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v1, "UNEXPECTED_ERROR"

    .line 8
    .line 9
    invoke-interface {p0, v1, v0, p1}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a(Lcom/ryanheise/audioservice/a$c;Ljava/util/Map;LE5/k$d;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/ryanheise/audioservice/a$c;->W(Ljava/util/Map;LE5/k$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "fastForward"

    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public B(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x3e8

    mul-long/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "position"

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const/4 v0, 0x1

    aput-object p1, p2, v0

    invoke-static {p2}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "seek"

    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public C(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/ryanheise/audioservice/a;->h(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "mediaItem"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "addQueueItem"

    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public D()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/a;->A()V

    return-void
.end method

.method public E(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lcom/ryanheise/audioservice/a;->w(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object p2

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "name"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "extras"

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const/4 p1, 0x3

    aput-object p2, v0, p1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "customAction"

    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public F(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lcom/ryanheise/audioservice/a;->w(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object p2

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "query"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "extras"

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const/4 p1, 0x3

    aput-object p2, v0, p1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "prepareFromSearch"

    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public G(J)V
    .locals 2

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "index"

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const/4 v0, 0x1

    aput-object p1, p2, v0

    invoke-static {p2}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "skipToQueueItem"

    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public H(I)V
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "direction"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "androidAdjustRemoteVolume"

    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public I(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lcom/ryanheise/audioservice/a;->w(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object p2

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "uri"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "extras"

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const/4 p1, 0x3

    aput-object p2, v0, p1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "playFromUri"

    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public J(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/ryanheise/audioservice/a;->i(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;

    move-result-object p1

    invoke-static {p2}, Lcom/ryanheise/audioservice/a;->w(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object p2

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "rating"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "extras"

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const/4 p1, 0x3

    aput-object p2, v0, p1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "setRating"

    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final Q()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$c;->c:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    :cond_0
    return-void
.end method

.method public R(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/ryanheise/audioservice/a$c;->S(Ljava/lang/String;Ljava/lang/Object;LE5/k$d;)V

    return-void
.end method

.method public S(Ljava/lang/String;Ljava/lang/Object;LE5/k$d;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/a;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$c;->b:LE5/k;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, LE5/k;->d(Ljava/lang/String;Ljava/lang/Object;LE5/k$d;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$c;->e:Ljava/util/List;

    .line 14
    .line 15
    new-instance v1, Lcom/ryanheise/audioservice/a$e;

    .line 16
    .line 17
    invoke-direct {v1, p1, p2, p3}, Lcom/ryanheise/audioservice/a$e;-><init>(Ljava/lang/String;Ljava/lang/Object;LE5/k$d;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void
.end method

.method public T()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ryanheise/audioservice/a$e;

    iget-object v2, p0, Lcom/ryanheise/audioservice/a$c;->b:LE5/k;

    iget-object v3, v1, Lcom/ryanheise/audioservice/a$e;->a:Ljava/lang/String;

    iget-object v4, v1, Lcom/ryanheise/audioservice/a$e;->b:Ljava/lang/Object;

    iget-object v1, v1, Lcom/ryanheise/audioservice/a$e;->c:LE5/k$d;

    invoke-virtual {v2, v3, v4, v1}, LE5/k;->d(Ljava/lang/String;Ljava/lang/Object;LE5/k$d;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final synthetic W(Ljava/util/Map;LE5/k$d;)V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "mediaItem"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/Map;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/ryanheise/audioservice/a;->l(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->R:Lcom/ryanheise/audioservice/AudioService;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/ryanheise/audioservice/AudioService;->Y(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/ryanheise/audioservice/a$c;->d:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v0, Ll5/n;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ll5/n;-><init>(LE5/k$d;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception p1

    .line 30
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$c;->d:Landroid/os/Handler;

    .line 31
    .line 32
    new-instance v1, Ll5/o;

    .line 33
    .line 34
    invoke-direct {v1, p2, p1}, Ll5/o;-><init>(LE5/k$d;Ljava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
.end method

.method public final synthetic Z(Ljava/util/Map;LE5/k$d;)V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "queue"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/List;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/ryanheise/audioservice/a;->k(Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->R:Lcom/ryanheise/audioservice/AudioService;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/ryanheise/audioservice/AudioService;->a0(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/ryanheise/audioservice/a$c;->d:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v0, Ll5/l;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ll5/l;-><init>(LE5/k$d;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception p1

    .line 30
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$c;->d:Landroid/os/Handler;

    .line 31
    .line 32
    new-instance v1, Ll5/m;

    .line 33
    .line 34
    invoke-direct {v1, p2, p1}, Ll5/m;-><init>(LE5/k$d;Ljava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
.end method

.method public a0(LE5/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/a$c;->b:LE5/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, LE5/k;->e(LE5/k$c;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/ryanheise/audioservice/a$c;->a:LE5/c;

    .line 8
    .line 9
    new-instance v0, LE5/k;

    .line 10
    .line 11
    const-string v1, "com.ryanheise.audio_service.handler.methods"

    .line 12
    .line 13
    invoke-direct {v0, p1, v1}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/ryanheise/audioservice/a$c;->b:LE5/k;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, LE5/k;->e(LE5/k$c;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "onNotificationDeleted"

    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public c(I)V
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "repeatMode"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "setRepeatMode"

    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public d(I)V
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "shuffleMode"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "setShuffleMode"

    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "play"

    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public f(Z)V
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "enabled"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "setCaptioningEnabled"

    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public g()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "stop"

    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public h(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lcom/ryanheise/audioservice/a;->w(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object p2

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "mediaId"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "extras"

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const/4 p1, 0x3

    aput-object p2, v0, p1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "prepareFromMediaId"

    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public i(Ljava/lang/String;Landroid/os/Bundle;La0/d$l;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/a;->e()Lcom/ryanheise/audioservice/a$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "query"

    .line 13
    .line 14
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    const-string p1, "extras"

    .line 18
    .line 19
    invoke-static {p2}, Lcom/ryanheise/audioservice/a;->w(Landroid/os/Bundle;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/ryanheise/audioservice/a;->e()Lcom/ryanheise/audioservice/a$c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance p2, Lcom/ryanheise/audioservice/a$c$c;

    .line 31
    .line 32
    invoke-direct {p2, p0, p3}, Lcom/ryanheise/audioservice/a$c$c;-><init>(Lcom/ryanheise/audioservice/a$c;La0/d$l;)V

    .line 33
    .line 34
    .line 35
    const-string v1, "search"

    .line 36
    .line 37
    invoke-virtual {p1, v1, v0, p2}, Lcom/ryanheise/audioservice/a$c;->S(Ljava/lang/String;Ljava/lang/Object;LE5/k$d;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p3}, La0/d$l;->a()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public j(Ll5/q;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x2

    .line 10
    new-array v0, v0, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v1, "button"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aput-object v1, v0, v2

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aput-object p1, v0, v1

    .line 19
    .line 20
    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "click"

    .line 25
    .line 26
    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public k()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "skipToPrevious"

    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "skipToNext"

    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public m(Ljava/lang/String;La0/d$l;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/a;->e()Lcom/ryanheise/audioservice/a$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "mediaId"

    .line 13
    .line 14
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/ryanheise/audioservice/a;->e()Lcom/ryanheise/audioservice/a$c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v1, Lcom/ryanheise/audioservice/a$c$b;

    .line 22
    .line 23
    invoke-direct {v1, p0, p2}, Lcom/ryanheise/audioservice/a$c$b;-><init>(Lcom/ryanheise/audioservice/a$c;La0/d$l;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "getMediaItem"

    .line 27
    .line 28
    invoke-virtual {p1, v2, v0, v1}, Lcom/ryanheise/audioservice/a$c;->S(Ljava/lang/String;Ljava/lang/Object;LE5/k$d;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p2}, La0/d$l;->a()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public n(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/ryanheise/audioservice/a;->h(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "mediaItem"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "removeQueueItem"

    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public o(F)V
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "speed"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "setSpeed"

    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "updateTime"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :try_start_0
    iget-object v5, v0, LE5/j;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v5, Ljava/util/Map;

    .line 13
    .line 14
    iget-object v0, v0, LE5/j;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x1

    .line 22
    sparse-switch v6, :sswitch_data_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :sswitch_0
    const-string v6, "notifyChildrenChanged"

    .line 27
    .line 28
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x4

    .line 35
    goto :goto_1

    .line 36
    :catch_0
    move-exception v0

    .line 37
    goto/16 :goto_9

    .line 38
    .line 39
    :sswitch_1
    const-string v6, "setState"

    .line 40
    .line 41
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    goto :goto_1

    .line 49
    :sswitch_2
    const-string v6, "setQueue"

    .line 50
    .line 51
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    move v0, v9

    .line 58
    goto :goto_1

    .line 59
    :sswitch_3
    const-string v6, "stopService"

    .line 60
    .line 61
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    const/4 v0, 0x6

    .line 68
    goto :goto_1

    .line 69
    :sswitch_4
    const-string v6, "setAndroidPlaybackInfo"

    .line 70
    .line 71
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    const/4 v0, 0x3

    .line 78
    goto :goto_1

    .line 79
    :sswitch_5
    const-string v6, "androidForceEnableMediaButtons"

    .line 80
    .line 81
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_0

    .line 86
    .line 87
    const/4 v0, 0x5

    .line 88
    goto :goto_1

    .line 89
    :sswitch_6
    const-string v6, "setMediaItem"

    .line 90
    .line 91
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_0

    .line 96
    .line 97
    move v0, v8

    .line 98
    goto :goto_1

    .line 99
    :cond_0
    :goto_0
    const/4 v0, -0x1

    .line 100
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 101
    .line 102
    .line 103
    goto/16 :goto_a

    .line 104
    .line 105
    :pswitch_0
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->R:Lcom/ryanheise/audioservice/AudioService;

    .line 106
    .line 107
    if-eqz v0, :cond_1

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/ryanheise/audioservice/AudioService;->c0()V

    .line 110
    .line 111
    .line 112
    :cond_1
    :goto_2
    invoke-interface {v2, v4}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_a

    .line 116
    .line 117
    :pswitch_1
    iget-object v0, v1, Lcom/ryanheise/audioservice/a$c;->c:Landroid/media/AudioTrack;

    .line 118
    .line 119
    if-nez v0, :cond_2

    .line 120
    .line 121
    const/16 v0, 0x800

    .line 122
    .line 123
    new-array v3, v0, [B

    .line 124
    .line 125
    new-instance v5, Landroid/media/AudioTrack;

    .line 126
    .line 127
    const/4 v15, 0x0

    .line 128
    const/4 v10, 0x3

    .line 129
    const v11, 0xac44

    .line 130
    .line 131
    .line 132
    const/4 v12, 0x2

    .line 133
    const/4 v13, 0x3

    .line 134
    move-object v9, v5

    .line 135
    move v14, v0

    .line 136
    invoke-direct/range {v9 .. v15}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    .line 137
    .line 138
    .line 139
    iput-object v5, v1, Lcom/ryanheise/audioservice/a$c;->c:Landroid/media/AudioTrack;

    .line 140
    .line 141
    invoke-virtual {v5, v3, v8, v0}, Landroid/media/AudioTrack;->write([BII)I

    .line 142
    .line 143
    .line 144
    :cond_2
    iget-object v0, v1, Lcom/ryanheise/audioservice/a$c;->c:Landroid/media/AudioTrack;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/media/AudioTrack;->reloadStaticData()I

    .line 147
    .line 148
    .line 149
    iget-object v0, v1, Lcom/ryanheise/audioservice/a$c;->c:Landroid/media/AudioTrack;

    .line 150
    .line 151
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :pswitch_2
    const-string v0, "parentMediaId"

    .line 156
    .line 157
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, Ljava/lang/String;

    .line 162
    .line 163
    const-string v3, "options"

    .line 164
    .line 165
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Ljava/util/Map;

    .line 170
    .line 171
    sget-object v5, Lcom/ryanheise/audioservice/AudioService;->R:Lcom/ryanheise/audioservice/AudioService;

    .line 172
    .line 173
    invoke-static {v3}, Lcom/ryanheise/audioservice/a;->G(Ljava/util/Map;)Landroid/os/Bundle;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v5, v0, v3}, La0/d;->e(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :pswitch_3
    const-string v0, "playbackInfo"

    .line 182
    .line 183
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v0, Ljava/util/Map;

    .line 188
    .line 189
    const-string v3, "playbackType"

    .line 190
    .line 191
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    check-cast v3, Ljava/lang/Integer;

    .line 196
    .line 197
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    const-string v5, "volumeControlType"

    .line 202
    .line 203
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    check-cast v5, Ljava/lang/Integer;

    .line 208
    .line 209
    const-string v6, "maxVolume"

    .line 210
    .line 211
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    check-cast v6, Ljava/lang/Integer;

    .line 216
    .line 217
    const-string v7, "volume"

    .line 218
    .line 219
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Ljava/lang/Integer;

    .line 224
    .line 225
    sget-object v7, Lcom/ryanheise/audioservice/AudioService;->R:Lcom/ryanheise/audioservice/AudioService;

    .line 226
    .line 227
    invoke-virtual {v7, v3, v5, v6, v0}, Lcom/ryanheise/audioservice/AudioService;->Z(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :pswitch_4
    const-string v0, "state"

    .line 232
    .line 233
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    check-cast v0, Ljava/util/Map;

    .line 238
    .line 239
    invoke-static {}, Ll5/a;->values()[Ll5/a;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    const-string v6, "processingState"

    .line 244
    .line 245
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    check-cast v6, Ljava/lang/Integer;

    .line 250
    .line 251
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    aget-object v15, v5, v6

    .line 256
    .line 257
    const-string v5, "playing"

    .line 258
    .line 259
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    check-cast v5, Ljava/lang/Boolean;

    .line 264
    .line 265
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 266
    .line 267
    .line 268
    move-result v16

    .line 269
    const-string v5, "controls"

    .line 270
    .line 271
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    check-cast v5, Ljava/util/List;

    .line 276
    .line 277
    const-string v6, "androidCompactActionIndices"

    .line 278
    .line 279
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    check-cast v6, Ljava/util/List;

    .line 284
    .line 285
    const-string v10, "systemActions"

    .line 286
    .line 287
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    check-cast v10, Ljava/util/List;

    .line 292
    .line 293
    const-string v11, "updatePosition"

    .line 294
    .line 295
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    invoke-static {v11}, Lcom/ryanheise/audioservice/a;->D(Ljava/lang/Object;)Ljava/lang/Long;

    .line 300
    .line 301
    .line 302
    move-result-object v11

    .line 303
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 304
    .line 305
    .line 306
    move-result-wide v17

    .line 307
    const-string v11, "bufferedPosition"

    .line 308
    .line 309
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    invoke-static {v11}, Lcom/ryanheise/audioservice/a;->D(Ljava/lang/Object;)Ljava/lang/Long;

    .line 314
    .line 315
    .line 316
    move-result-object v11

    .line 317
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 318
    .line 319
    .line 320
    move-result-wide v19

    .line 321
    const-string v11, "speed"

    .line 322
    .line 323
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v11

    .line 327
    check-cast v11, Ljava/lang/Double;

    .line 328
    .line 329
    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    .line 330
    .line 331
    .line 332
    move-result-wide v11

    .line 333
    double-to-float v14, v11

    .line 334
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v11

    .line 338
    if-nez v11, :cond_3

    .line 339
    .line 340
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 341
    .line 342
    .line 343
    move-result-wide v11

    .line 344
    goto :goto_3

    .line 345
    :cond_3
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    invoke-static {v3}, Lcom/ryanheise/audioservice/a;->D(Ljava/lang/Object;)Ljava/lang/Long;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 354
    .line 355
    .line 356
    move-result-wide v11

    .line 357
    :goto_3
    const-string v3, "errorCode"

    .line 358
    .line 359
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    move-object/from16 v24, v3

    .line 364
    .line 365
    check-cast v24, Ljava/lang/Integer;

    .line 366
    .line 367
    const-string v3, "errorMessage"

    .line 368
    .line 369
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    move-object/from16 v25, v3

    .line 374
    .line 375
    check-cast v25, Ljava/lang/String;

    .line 376
    .line 377
    const-string v3, "repeatMode"

    .line 378
    .line 379
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    check-cast v3, Ljava/lang/Integer;

    .line 384
    .line 385
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 386
    .line 387
    .line 388
    move-result v26

    .line 389
    const-string v3, "shuffleMode"

    .line 390
    .line 391
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    check-cast v3, Ljava/lang/Integer;

    .line 396
    .line 397
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 398
    .line 399
    .line 400
    move-result v27

    .line 401
    const-string v3, "queueIndex"

    .line 402
    .line 403
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    invoke-static {v3}, Lcom/ryanheise/audioservice/a;->D(Ljava/lang/Object;)Ljava/lang/Long;

    .line 408
    .line 409
    .line 410
    move-result-object v29

    .line 411
    const-string v3, "captioningEnabled"

    .line 412
    .line 413
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    check-cast v0, Ljava/lang/Boolean;

    .line 418
    .line 419
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 420
    .line 421
    .line 422
    move-result v28

    .line 423
    invoke-static {}, Lcom/ryanheise/audioservice/a;->j()J

    .line 424
    .line 425
    .line 426
    move-result-wide v21

    .line 427
    sub-long v22, v11, v21

    .line 428
    .line 429
    new-instance v11, Ljava/util/ArrayList;

    .line 430
    .line 431
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 432
    .line 433
    .line 434
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    const-wide/16 v12, 0x0

    .line 439
    .line 440
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    if-eqz v3, :cond_5

    .line 445
    .line 446
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    check-cast v3, Ljava/util/Map;

    .line 451
    .line 452
    const-string v5, "androidIcon"

    .line 453
    .line 454
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    move-object/from16 v31, v5

    .line 459
    .line 460
    check-cast v31, Ljava/lang/String;

    .line 461
    .line 462
    const-string v5, "label"

    .line 463
    .line 464
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v5

    .line 468
    move-object/from16 v32, v5

    .line 469
    .line 470
    check-cast v32, Ljava/lang/String;

    .line 471
    .line 472
    const-string v5, "action"

    .line 473
    .line 474
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    check-cast v5, Ljava/lang/Integer;

    .line 479
    .line 480
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 481
    .line 482
    .line 483
    move-result v5

    .line 484
    shl-int v5, v9, v5

    .line 485
    .line 486
    int-to-long v4, v5

    .line 487
    or-long/2addr v12, v4

    .line 488
    const-string v8, "customAction"

    .line 489
    .line 490
    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    check-cast v3, Ljava/util/Map;

    .line 495
    .line 496
    if-eqz v3, :cond_4

    .line 497
    .line 498
    const-string v8, "name"

    .line 499
    .line 500
    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v8

    .line 504
    check-cast v8, Ljava/lang/String;

    .line 505
    .line 506
    const-string v7, "extras"

    .line 507
    .line 508
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    check-cast v3, Ljava/util/Map;

    .line 513
    .line 514
    new-instance v7, Ll5/p;

    .line 515
    .line 516
    invoke-direct {v7, v8, v3}, Ll5/p;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 517
    .line 518
    .line 519
    move-object/from16 v35, v7

    .line 520
    .line 521
    goto :goto_5

    .line 522
    :cond_4
    const/16 v35, 0x0

    .line 523
    .line 524
    :goto_5
    new-instance v3, Ll5/r;

    .line 525
    .line 526
    move-object/from16 v30, v3

    .line 527
    .line 528
    move-wide/from16 v33, v4

    .line 529
    .line 530
    invoke-direct/range {v30 .. v35}, Ll5/r;-><init>(Ljava/lang/String;Ljava/lang/String;JLl5/p;)V

    .line 531
    .line 532
    .line 533
    invoke-interface {v11, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    const/4 v4, 0x0

    .line 537
    const/4 v8, 0x0

    .line 538
    goto :goto_4

    .line 539
    :cond_5
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    if-eqz v3, :cond_6

    .line 548
    .line 549
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    check-cast v3, Ljava/lang/Integer;

    .line 554
    .line 555
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    shl-int v3, v9, v3

    .line 560
    .line 561
    int-to-long v3, v3

    .line 562
    or-long/2addr v12, v3

    .line 563
    goto :goto_6

    .line 564
    :cond_6
    if-eqz v6, :cond_7

    .line 565
    .line 566
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    const/4 v3, 0x3

    .line 571
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    new-array v3, v0, [I

    .line 576
    .line 577
    const/4 v8, 0x0

    .line 578
    :goto_7
    if-ge v8, v0, :cond_8

    .line 579
    .line 580
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    check-cast v4, Ljava/lang/Integer;

    .line 585
    .line 586
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 587
    .line 588
    .line 589
    move-result v4

    .line 590
    aput v4, v3, v8

    .line 591
    .line 592
    add-int/lit8 v8, v8, 0x1

    .line 593
    .line 594
    goto :goto_7

    .line 595
    :cond_7
    const/4 v3, 0x0

    .line 596
    :cond_8
    sget-object v10, Lcom/ryanheise/audioservice/AudioService;->R:Lcom/ryanheise/audioservice/AudioService;

    .line 597
    .line 598
    move v0, v14

    .line 599
    move-object v14, v3

    .line 600
    move/from16 v21, v0

    .line 601
    .line 602
    invoke-virtual/range {v10 .. v29}, Lcom/ryanheise/audioservice/AudioService;->b0(Ljava/util/List;J[ILl5/a;ZJJFJLjava/lang/Integer;Ljava/lang/String;IIZLjava/lang/Long;)V

    .line 603
    .line 604
    .line 605
    const/4 v3, 0x0

    .line 606
    invoke-interface {v2, v3}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    goto :goto_a

    .line 610
    :pswitch_5
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    new-instance v3, Ll5/k;

    .line 615
    .line 616
    invoke-direct {v3, v1, v5, v2}, Ll5/k;-><init>(Lcom/ryanheise/audioservice/a$c;Ljava/util/Map;LE5/k$d;)V

    .line 617
    .line 618
    .line 619
    :goto_8
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 620
    .line 621
    .line 622
    goto :goto_a

    .line 623
    :pswitch_6
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    new-instance v3, Ll5/j;

    .line 628
    .line 629
    invoke-direct {v3, v1, v5, v2}, Ll5/j;-><init>(Lcom/ryanheise/audioservice/a$c;Ljava/util/Map;LE5/k$d;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 630
    .line 631
    .line 632
    goto :goto_8

    .line 633
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    const/4 v3, 0x0

    .line 641
    invoke-interface {v2, v0, v3, v3}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    :goto_a
    return-void

    .line 645
    :sswitch_data_0
    .sparse-switch
        -0x24af012b -> :sswitch_6
        -0x325d04 -> :sswitch_5
        0x1fdd21b6 -> :sswitch_4
        0x29afb053 -> :sswitch_3
        0x539ad9cf -> :sswitch_2
        0x53b6854f -> :sswitch_1
        0x67d5352c -> :sswitch_0
    .end sparse-switch

    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "prepare"

    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public q(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lcom/ryanheise/audioservice/a;->w(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object p2

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "uri"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "extras"

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const/4 p1, 0x3

    aput-object p2, v0, p1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "prepareFromUri"

    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "rewind"

    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public s(Ljava/lang/String;La0/d$l;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/a;->e()Lcom/ryanheise/audioservice/a$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "parentMediaId"

    .line 13
    .line 14
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    const-string p1, "options"

    .line 18
    .line 19
    invoke-static {p3}, Lcom/ryanheise/audioservice/a;->w(Landroid/os/Bundle;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/ryanheise/audioservice/a;->e()Lcom/ryanheise/audioservice/a$c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance p3, Lcom/ryanheise/audioservice/a$c$a;

    .line 31
    .line 32
    invoke-direct {p3, p0, p2}, Lcom/ryanheise/audioservice/a$c$a;-><init>(Lcom/ryanheise/audioservice/a$c;La0/d$l;)V

    .line 33
    .line 34
    .line 35
    const-string v1, "getChildren"

    .line 36
    .line 37
    invoke-virtual {p1, v1, v0, p3}, Lcom/ryanheise/audioservice/a$c;->S(Ljava/lang/String;Ljava/lang/Object;LE5/k$d;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p2}, La0/d$l;->a()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public t(Landroid/support/v4/media/RatingCompat;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/ryanheise/audioservice/a;->i(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;

    move-result-object p1

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "rating"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "extras"

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const/4 p1, 0x0

    const/4 v1, 0x3

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "setRating"

    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public u(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lcom/ryanheise/audioservice/a;->w(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object p2

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "query"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "extras"

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const/4 p1, 0x3

    aput-object p2, v0, p1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "playFromSearch"

    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public v(Landroid/support/v4/media/MediaMetadataCompat;I)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/ryanheise/audioservice/a;->h(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "mediaItem"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "index"

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const/4 p1, 0x3

    aput-object p2, v0, p1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "insertQueueItem"

    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public w()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "pause"

    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public x(I)V
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "volumeIndex"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "androidSetRemoteVolume"

    invoke-virtual {p0, v0, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public y()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "onTaskRemoved"

    invoke-virtual {p0, v1, v0}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public z(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lcom/ryanheise/audioservice/a;->w(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object p2

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "mediaId"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "extras"

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const/4 p1, 0x3

    aput-object p2, v0, p1

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "playFromMediaId"

    invoke-virtual {p0, p2, p1}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
