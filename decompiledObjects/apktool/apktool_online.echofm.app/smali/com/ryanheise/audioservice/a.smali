.class public Lcom/ryanheise/audioservice/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/a;
.implements LB5/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ryanheise/audioservice/a$c;,
        Lcom/ryanheise/audioservice/a$d;,
        Lcom/ryanheise/audioservice/a$e;
    }
.end annotation


# static fields
.field public static g:Ljava/lang/String; = "audio_service_engine"

.field public static final h:Ljava/util/Set;

.field public static i:Lcom/ryanheise/audioservice/a$d;

.field public static j:Lcom/ryanheise/audioservice/a$c;

.field public static final k:J

.field public static l:LE5/k$d;

.field public static m:Z

.field public static n:Landroid/support/v4/media/MediaBrowserCompat;

.field public static o:Landroid/support/v4/media/session/MediaControllerCompat;

.field public static final p:Landroid/support/v4/media/session/MediaControllerCompat$a;


# instance fields
.field public a:Landroid/content/Context;

.field public b:LA5/a$b;

.field public c:LB5/c;

.field public d:LE5/n;

.field public e:Lcom/ryanheise/audioservice/a$d;

.field public final f:Landroid/support/v4/media/MediaBrowserCompat$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/ryanheise/audioservice/a;->h:Ljava/util/Set;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    sput-wide v0, Lcom/ryanheise/audioservice/a;->k:J

    new-instance v0, Lcom/ryanheise/audioservice/a$a;

    invoke-direct {v0}, Lcom/ryanheise/audioservice/a$a;-><init>()V

    sput-object v0, Lcom/ryanheise/audioservice/a;->p:Landroid/support/v4/media/session/MediaControllerCompat$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/ryanheise/audioservice/a$b;

    invoke-direct {v0, p0}, Lcom/ryanheise/audioservice/a$b;-><init>(Lcom/ryanheise/audioservice/a;)V

    iput-object v0, p0, Lcom/ryanheise/audioservice/a;->f:Landroid/support/v4/media/MediaBrowserCompat$b;

    return-void
.end method

.method public static declared-synchronized A()V
    .locals 3

    .line 1
    const-class v0, Lcom/ryanheise/audioservice/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/ryanheise/audioservice/a;->h:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ryanheise/audioservice/a$d;

    invoke-static {v2}, Lcom/ryanheise/audioservice/a$d;->a(Lcom/ryanheise/audioservice/a$d;)Landroid/app/Activity;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-static {}, Lv5/a;->b()Lv5/a;

    move-result-object v1

    sget-object v2, Lcom/ryanheise/audioservice/a;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lv5/a;->a(Ljava/lang/String;)Lio/flutter/embedding/engine/a;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->g()V

    invoke-static {}, Lv5/a;->b()Lv5/a;

    move-result-object v1

    sget-object v2, Lcom/ryanheise/audioservice/a;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lv5/a;->d(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized B(Landroid/content/Context;)Lio/flutter/embedding/engine/a;
    .locals 4

    .line 1
    const-class v0, Lcom/ryanheise/audioservice/a;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lv5/a;->b()Lv5/a;

    move-result-object v1

    sget-object v2, Lcom/ryanheise/audioservice/a;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lv5/a;->a(Ljava/lang/String;)Lio/flutter/embedding/engine/a;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Lio/flutter/embedding/engine/a;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;)V

    instance-of v2, p0, Lu5/i;

    if-eqz v2, :cond_0

    check-cast p0, Lu5/i;

    invoke-virtual {p0}, Lu5/i;->i()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lu5/i;->y()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "?"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    if-nez v2, :cond_2

    const-string v2, "/"

    :cond_2
    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->o()LD5/n;

    move-result-object p0

    invoke-virtual {p0, v2}, LD5/n;->c(Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->k()Lw5/a;

    move-result-object p0

    invoke-static {}, Lw5/a$c;->a()Lw5/a$c;

    move-result-object v2

    invoke-virtual {p0, v2}, Lw5/a;->j(Lw5/a$c;)V

    invoke-static {}, Lv5/a;->b()Lv5/a;

    move-result-object p0

    sget-object v2, Lcom/ryanheise/audioservice/a;->g:Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Lv5/a;->c(Ljava/lang/String;Lio/flutter/embedding/engine/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method public static C(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_1

    :cond_1
    :goto_0
    check-cast p0, Ljava/lang/Integer;

    :goto_1
    return-object p0
.end method

.method public static D(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    int-to-long v0, p0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    goto :goto_1

    :cond_1
    :goto_0
    check-cast p0, Ljava/lang/Long;

    :goto_1
    return-object p0
.end method

.method public static varargs F([Ljava/lang/Object;)Ljava/util/Map;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-object v2, p0, v1

    check-cast v2, Ljava/lang/String;

    add-int/lit8 v3, v1, 0x1

    aget-object v3, p0, v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static G(Ljava/util/Map;)Landroid/os/Bundle;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Integer;

    if-eqz v4, :cond_2

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    instance-of v4, v3, Ljava/lang/Long;

    if-eqz v4, :cond_3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_0

    :cond_3
    instance-of v4, v3, Ljava/lang/Double;

    if-eqz v4, :cond_4

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    goto :goto_0

    :cond_4
    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_5

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_5
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_1

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    return-object v0
.end method

.method public static H(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;
    .locals 6

    .line 1
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/media/MediaMetadataCompat;->e()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->g()Ljava/lang/String;

    move-result-object v2

    const-string v3, "id"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "android.media.metadata.TITLE"

    invoke-static {p0, v2}, Lcom/ryanheise/audioservice/a;->I(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "title"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "android.media.metadata.ALBUM"

    invoke-static {p0, v2}, Lcom/ryanheise/audioservice/a;->I(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "album"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->e()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->e()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "artUri"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string v0, "android.media.metadata.ARTIST"

    invoke-static {p0, v0}, Lcom/ryanheise/audioservice/a;->I(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "artist"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.media.metadata.GENRE"

    invoke-static {p0, v0}, Lcom/ryanheise/audioservice/a;->I(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "genre"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.media.metadata.DURATION"

    invoke-virtual {p0, v0}, Landroid/support/v4/media/MediaMetadataCompat;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v0}, Landroid/support/v4/media/MediaMetadataCompat;->f(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v2, "duration"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string v0, "playable_long"

    invoke-virtual {p0, v0}, Landroid/support/v4/media/MediaMetadataCompat;->f(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v2, "playable"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.media.metadata.DISPLAY_TITLE"

    invoke-static {p0, v0}, Lcom/ryanheise/audioservice/a;->I(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "displayTitle"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.media.metadata.DISPLAY_SUBTITLE"

    invoke-static {p0, v0}, Lcom/ryanheise/audioservice/a;->I(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "displaySubtitle"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.media.metadata.DISPLAY_DESCRIPTION"

    invoke-static {p0, v0}, Lcom/ryanheise/audioservice/a;->I(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "displayDescription"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.media.metadata.RATING"

    invoke-virtual {p0, v0}, Landroid/support/v4/media/MediaMetadataCompat;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v0}, Landroid/support/v4/media/MediaMetadataCompat;->h(Ljava/lang/String;)Landroid/support/v4/media/RatingCompat;

    move-result-object v0

    invoke-static {v0}, Lcom/ryanheise/audioservice/a;->J(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;

    move-result-object v0

    const-string v2, "rating"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {p0}, Landroid/support/v4/media/MediaMetadataCompat;->d()Landroid/os/Bundle;

    move-result-object p0

    invoke-static {p0}, Lcom/ryanheise/audioservice/a;->w(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_5

    const-string v0, "extras"

    invoke-interface {v1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-object v1
.end method

.method public static I(Landroid/support/v4/media/MediaMetadataCompat;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/support/v4/media/MediaMetadataCompat;->j(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static J(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "type"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->g()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "value"

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->d()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->b()F

    move-result p0

    :goto_0
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    :goto_1
    invoke-virtual {v0, v3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :pswitch_1
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->e()F

    move-result p0

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->h()Z

    move-result p0

    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->f()Z

    move-result p0

    goto :goto_2

    :cond_0
    :pswitch_4
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static K(Ljava/util/List;)Ljava/util/List;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-static {v2}, Lcom/ryanheise/audioservice/a;->y(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/media/MediaMetadataCompat;->e()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v3

    const-string v4, "extras"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-static {v3, v2}, Lcom/ryanheise/audioservice/a;->v(Landroid/support/v4/media/MediaDescriptionCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v2

    new-instance v3, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    int-to-long v4, v1

    invoke-direct {v3, v2, v4, v5}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/support/v4/media/MediaDescriptionCompat;J)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static L(Ljava/util/Map;)Landroid/support/v4/media/RatingCompat;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "type"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const-string v1, "value"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Landroid/support/v4/media/RatingCompat;->m(I)Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0

    :pswitch_0
    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->floatValue()F

    move-result p0

    invoke-static {p0}, Landroid/support/v4/media/RatingCompat;->j(F)Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0

    :pswitch_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    int-to-float p0, p0

    invoke-static {v0, p0}, Landroid/support/v4/media/RatingCompat;->k(IF)Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0

    :pswitch_2
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {p0}, Landroid/support/v4/media/RatingCompat;->l(Z)Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0

    :pswitch_3
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {p0}, Landroid/support/v4/media/RatingCompat;->i(Z)Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Landroid/support/v4/media/RatingCompat;->m(I)Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static M(Ljava/util/Map;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/a;->y(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/media/MediaMetadataCompat;->e()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v0

    const-string v1, "extras"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/ryanheise/audioservice/a;->v(Landroid/support/v4/media/MediaDescriptionCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v0

    const-string v1, "playable"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    new-instance v1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x2

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    invoke-direct {v1, v0, p0}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    return-object v1
.end method

.method public static synthetic a(Lcom/ryanheise/audioservice/a;Landroid/content/Intent;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/ryanheise/audioservice/a;->E(Landroid/content/Intent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/ryanheise/audioservice/a;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ryanheise/audioservice/a;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic c()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/ryanheise/audioservice/a;->m:Z

    return v0
.end method

.method public static synthetic d(Z)Z
    .locals 0

    .line 1
    sput-boolean p0, Lcom/ryanheise/audioservice/a;->m:Z

    return p0
.end method

.method public static synthetic e()Lcom/ryanheise/audioservice/a$c;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/a;->j:Lcom/ryanheise/audioservice/a$c;

    return-object v0
.end method

.method public static synthetic f(Lcom/ryanheise/audioservice/a$c;)Lcom/ryanheise/audioservice/a$c;
    .locals 0

    .line 1
    sput-object p0, Lcom/ryanheise/audioservice/a;->j:Lcom/ryanheise/audioservice/a$c;

    return-object p0
.end method

.method public static synthetic g(Ljava/util/Map;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/a;->M(Ljava/util/Map;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/a;->H(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/a;->J(Landroid/support/v4/media/RatingCompat;)Ljava/util/HashMap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/ryanheise/audioservice/a;->k:J

    return-wide v0
.end method

.method public static synthetic k(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/a;->K(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ryanheise/audioservice/a;->y(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m()Landroid/support/v4/media/MediaBrowserCompat;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/a;->n:Landroid/support/v4/media/MediaBrowserCompat;

    return-object v0
.end method

.method public static synthetic n()Landroid/support/v4/media/session/MediaControllerCompat;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/a;->o:Landroid/support/v4/media/session/MediaControllerCompat;

    return-object v0
.end method

.method public static synthetic o(Landroid/support/v4/media/session/MediaControllerCompat;)Landroid/support/v4/media/session/MediaControllerCompat;
    .locals 0

    .line 1
    sput-object p0, Lcom/ryanheise/audioservice/a;->o:Landroid/support/v4/media/session/MediaControllerCompat;

    return-object p0
.end method

.method public static synthetic p()Lcom/ryanheise/audioservice/a$d;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/a;->i:Lcom/ryanheise/audioservice/a$d;

    return-object v0
.end method

.method public static synthetic q(Lcom/ryanheise/audioservice/a$d;)Lcom/ryanheise/audioservice/a$d;
    .locals 0

    .line 1
    sput-object p0, Lcom/ryanheise/audioservice/a;->i:Lcom/ryanheise/audioservice/a$d;

    return-object p0
.end method

.method public static synthetic r()Landroid/support/v4/media/session/MediaControllerCompat$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/a;->p:Landroid/support/v4/media/session/MediaControllerCompat$a;

    return-object v0
.end method

.method public static synthetic s()LE5/k$d;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/a;->l:LE5/k$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic t(LE5/k$d;)LE5/k$d;
    .locals 0

    .line 1
    sput-object p0, Lcom/ryanheise/audioservice/a;->l:LE5/k$d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic u(Lcom/ryanheise/audioservice/a;)Lcom/ryanheise/audioservice/a$d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    return-object p0
.end method

.method public static v(Landroid/support/v4/media/MediaDescriptionCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaDescriptionCompat;
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->c()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->c()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_1
    invoke-static {p1}, Lcom/ryanheise/audioservice/a;->G(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    new-instance p1, Landroid/support/v4/media/MediaDescriptionCompat$d;

    invoke-direct {p1}, Landroid/support/v4/media/MediaDescriptionCompat$d;-><init>()V

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->j()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/support/v4/media/MediaDescriptionCompat$d;->i(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$d;

    move-result-object p1

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->i()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/support/v4/media/MediaDescriptionCompat$d;->h(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$d;

    move-result-object p1

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->b()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/support/v4/media/MediaDescriptionCompat$d;->b(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$d;

    move-result-object p1

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->d()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/support/v4/media/MediaDescriptionCompat$d;->d(Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaDescriptionCompat$d;

    move-result-object p1

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->e()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/support/v4/media/MediaDescriptionCompat$d;->e(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$d;

    move-result-object p1

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/support/v4/media/MediaDescriptionCompat$d;->f(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$d;

    move-result-object p1

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->h()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/support/v4/media/MediaDescriptionCompat$d;->g(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$d;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/support/v4/media/MediaDescriptionCompat$d;->c(Landroid/os/Bundle;)Landroid/support/v4/media/MediaDescriptionCompat$d;

    move-result-object p0

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat$d;->a()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p0

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static w(Landroid/os/Bundle;)Ljava/util/Map;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static y(Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 14

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->R:Lcom/ryanheise/audioservice/AudioService;

    const-string v1, "id"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "title"

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "album"

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "artist"

    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "genre"

    invoke-interface {p0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "duration"

    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/ryanheise/audioservice/a;->D(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v6

    const-string v7, "artUri"

    invoke-interface {p0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "playable"

    invoke-interface {p0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    const-string v9, "displayTitle"

    invoke-interface {p0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    const-string v10, "displaySubtitle"

    invoke-interface {p0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    const-string v11, "displayDescription"

    invoke-interface {p0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const-string v12, "rating"

    invoke-interface {p0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map;

    invoke-static {v12}, Lcom/ryanheise/audioservice/a;->L(Ljava/util/Map;)Landroid/support/v4/media/RatingCompat;

    move-result-object v12

    const-string v13, "extras"

    invoke-interface {p0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object v13, p0

    check-cast v13, Ljava/util/Map;

    invoke-virtual/range {v0 .. v13}, Lcom/ryanheise/audioservice/AudioService;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/support/v4/media/RatingCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final synthetic E(Landroid/content/Intent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a$d;->a(Lcom/ryanheise/audioservice/a$d;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/ryanheise/audioservice/a;->O()V

    const/4 p1, 0x1

    return p1
.end method

.method public final N()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->c:LB5/c;

    new-instance v1, Ll5/i;

    invoke-direct {v1, p0}, Ll5/i;-><init>(Lcom/ryanheise/audioservice/a;)V

    iput-object v1, p0, Lcom/ryanheise/audioservice/a;->d:LE5/n;

    invoke-interface {v0, v1}, LB5/c;->g(LE5/n;)V

    return-void
.end method

.method public final O()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    invoke-static {v0}, Lcom/ryanheise/audioservice/a$d;->a(Lcom/ryanheise/audioservice/a$d;)Landroid/app/Activity;

    move-result-object v0

    sget-object v1, Lcom/ryanheise/audioservice/a;->j:Lcom/ryanheise/audioservice/a$c;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.ryanheise.audioservice.NOTIFICATION_CLICK"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    sget-object v1, Lcom/ryanheise/audioservice/a;->j:Lcom/ryanheise/audioservice/a$c;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "clicked"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v0, v2, v3

    invoke-static {v2}, Lcom/ryanheise/audioservice/a;->F([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "onNotificationClicked"

    invoke-virtual {v1, v2, v0}, Lcom/ryanheise/audioservice/a$c;->R(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onAttachedToActivity(LB5/c;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/a;->c:LB5/c;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    .line 4
    .line 5
    invoke-interface {p1}, LB5/c;->c()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lcom/ryanheise/audioservice/a$d;->b(Lcom/ryanheise/audioservice/a$d;Landroid/app/Activity;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    .line 13
    .line 14
    invoke-interface {p1}, LB5/c;->c()Landroid/app/Activity;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v0, v1}, Lcom/ryanheise/audioservice/a$d;->c(Lcom/ryanheise/audioservice/a$d;Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, LB5/c;->c()Landroid/app/Activity;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lcom/ryanheise/audioservice/a;->B(Landroid/content/Context;)Lio/flutter/embedding/engine/a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/ryanheise/audioservice/a;->b:LA5/a$b;

    .line 32
    .line 33
    invoke-virtual {v1}, LA5/a$b;->b()LE5/c;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p1}, Lio/flutter/embedding/engine/a;->k()Lw5/a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eq v1, p1, :cond_0

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    :goto_0
    invoke-virtual {v0, p1}, Lcom/ryanheise/audioservice/a$d;->g(Z)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    .line 50
    .line 51
    sput-object p1, Lcom/ryanheise/audioservice/a;->i:Lcom/ryanheise/audioservice/a$d;

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/a;->N()V

    .line 54
    .line 55
    .line 56
    sget-object p1, Lcom/ryanheise/audioservice/a;->o:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    sget-object p1, Lcom/ryanheise/audioservice/a;->i:Lcom/ryanheise/audioservice/a$d;

    .line 61
    .line 62
    invoke-static {p1}, Lcom/ryanheise/audioservice/a$d;->a(Lcom/ryanheise/audioservice/a$d;)Landroid/app/Activity;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    sget-object v0, Lcom/ryanheise/audioservice/a;->o:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 67
    .line 68
    invoke-static {p1, v0}, Landroid/support/v4/media/session/MediaControllerCompat;->f(Landroid/app/Activity;Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    sget-object p1, Lcom/ryanheise/audioservice/a;->n:Landroid/support/v4/media/MediaBrowserCompat;

    .line 72
    .line 73
    if-nez p1, :cond_2

    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/a;->x()V

    .line 76
    .line 77
    .line 78
    :cond_2
    sget-object p1, Lcom/ryanheise/audioservice/a;->i:Lcom/ryanheise/audioservice/a$d;

    .line 79
    .line 80
    invoke-static {p1}, Lcom/ryanheise/audioservice/a$d;->a(Lcom/ryanheise/audioservice/a$d;)Landroid/app/Activity;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/ryanheise/audioservice/a$d;->h()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    new-instance v0, Landroid/content/Intent;

    .line 93
    .line 94
    const-string v1, "android.intent.action.MAIN"

    .line 95
    .line 96
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/a;->O()V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public onAttachedToEngine(LA5/a$b;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/a;->b:LA5/a$b;

    .line 2
    .line 3
    new-instance v0, Lcom/ryanheise/audioservice/a$d;

    .line 4
    .line 5
    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {v0, p1}, Lcom/ryanheise/audioservice/a$d;-><init>(LE5/c;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    .line 13
    .line 14
    iget-object p1, p0, Lcom/ryanheise/audioservice/a;->b:LA5/a$b;

    .line 15
    .line 16
    invoke-virtual {p1}, LA5/a$b;->a()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {v0, p1}, Lcom/ryanheise/audioservice/a$d;->c(Lcom/ryanheise/audioservice/a$d;Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lcom/ryanheise/audioservice/a;->h:Ljava/util/Set;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    .line 26
    .line 27
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/ryanheise/audioservice/a;->a:Landroid/content/Context;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    iget-object p1, p0, Lcom/ryanheise/audioservice/a;->b:LA5/a$b;

    .line 35
    .line 36
    invoke-virtual {p1}, LA5/a$b;->a()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lcom/ryanheise/audioservice/a;->a:Landroid/content/Context;

    .line 41
    .line 42
    :cond_0
    sget-object p1, Lcom/ryanheise/audioservice/a;->j:Lcom/ryanheise/audioservice/a$c;

    .line 43
    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    new-instance p1, Lcom/ryanheise/audioservice/a$c;

    .line 47
    .line 48
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->b:LA5/a$b;

    .line 49
    .line 50
    invoke-virtual {v0}, LA5/a$b;->b()LE5/c;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {p1, v0}, Lcom/ryanheise/audioservice/a$c;-><init>(LE5/c;)V

    .line 55
    .line 56
    .line 57
    sput-object p1, Lcom/ryanheise/audioservice/a;->j:Lcom/ryanheise/audioservice/a$c;

    .line 58
    .line 59
    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioService;->Q(Lcom/ryanheise/audioservice/AudioService$e;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    sget-object p1, Lcom/ryanheise/audioservice/a;->n:Landroid/support/v4/media/MediaBrowserCompat;

    .line 63
    .line 64
    if-nez p1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/a;->x()V

    .line 67
    .line 68
    .line 69
    :cond_2
    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 3

    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->c:LB5/c;

    iget-object v1, p0, Lcom/ryanheise/audioservice/a;->d:LE5/n;

    invoke-interface {v0, v1}, LB5/c;->i(LE5/n;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ryanheise/audioservice/a;->c:LB5/c;

    iput-object v0, p0, Lcom/ryanheise/audioservice/a;->d:LE5/n;

    iget-object v1, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    invoke-static {v1, v0}, Lcom/ryanheise/audioservice/a$d;->b(Lcom/ryanheise/audioservice/a$d;Landroid/app/Activity;)V

    iget-object v1, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    iget-object v2, p0, Lcom/ryanheise/audioservice/a;->b:LA5/a$b;

    invoke-virtual {v2}, LA5/a$b;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ryanheise/audioservice/a$d;->c(Lcom/ryanheise/audioservice/a$d;Landroid/content/Context;)V

    sget-object v1, Lcom/ryanheise/audioservice/a;->h:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lcom/ryanheise/audioservice/a;->z()V

    :cond_0
    iget-object v1, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    sget-object v2, Lcom/ryanheise/audioservice/a;->i:Lcom/ryanheise/audioservice/a$d;

    if-ne v1, v2, :cond_1

    sput-object v0, Lcom/ryanheise/audioservice/a;->i:Lcom/ryanheise/audioservice/a$d;

    :cond_1
    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 2

    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->c:LB5/c;

    iget-object v1, p0, Lcom/ryanheise/audioservice/a;->d:LE5/n;

    invoke-interface {v0, v1}, LB5/c;->i(LE5/n;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ryanheise/audioservice/a;->c:LB5/c;

    iget-object v1, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    invoke-static {v1, v0}, Lcom/ryanheise/audioservice/a$d;->b(Lcom/ryanheise/audioservice/a$d;Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    iget-object v1, p0, Lcom/ryanheise/audioservice/a;->b:LA5/a$b;

    invoke-virtual {v1}, LA5/a$b;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ryanheise/audioservice/a$d;->c(Lcom/ryanheise/audioservice/a$d;Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromEngine(LA5/a$b;)V
    .locals 2

    .line 1
    sget-object p1, Lcom/ryanheise/audioservice/a;->h:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/a;->z()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p1, v0}, Lcom/ryanheise/audioservice/a$d;->c(Lcom/ryanheise/audioservice/a$d;Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/ryanheise/audioservice/a;->a:Landroid/content/Context;

    .line 27
    .line 28
    sget-object p1, Lcom/ryanheise/audioservice/a;->j:Lcom/ryanheise/audioservice/a$c;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p1, Lcom/ryanheise/audioservice/a$c;->a:LE5/c;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/ryanheise/audioservice/a;->b:LA5/a$b;

    .line 35
    .line 36
    invoke-virtual {v1}, LA5/a$b;->b()LE5/c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-ne p1, v1, :cond_1

    .line 41
    .line 42
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 43
    .line 44
    const-string v1, "### destroying audio handler interface"

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lcom/ryanheise/audioservice/a;->j:Lcom/ryanheise/audioservice/a$c;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/ryanheise/audioservice/a$c;->P(Lcom/ryanheise/audioservice/a$c;)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lcom/ryanheise/audioservice/a;->j:Lcom/ryanheise/audioservice/a$c;

    .line 55
    .line 56
    :cond_1
    iput-object v0, p0, Lcom/ryanheise/audioservice/a;->b:LA5/a$b;

    .line 57
    .line 58
    return-void
.end method

.method public onReattachedToActivityForConfigChanges(LB5/c;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/a;->c:LB5/c;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    .line 4
    .line 5
    invoke-interface {p1}, LB5/c;->c()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lcom/ryanheise/audioservice/a$d;->b(Lcom/ryanheise/audioservice/a$d;Landroid/app/Activity;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/ryanheise/audioservice/a;->e:Lcom/ryanheise/audioservice/a$d;

    .line 13
    .line 14
    invoke-interface {p1}, LB5/c;->c()Landroid/app/Activity;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, Lcom/ryanheise/audioservice/a$d;->c(Lcom/ryanheise/audioservice/a$d;Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/a;->N()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final x()V
    .locals 5

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/a;->n:Landroid/support/v4/media/MediaBrowserCompat;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat;

    iget-object v1, p0, Lcom/ryanheise/audioservice/a;->a:Landroid/content/Context;

    new-instance v2, Landroid/content/ComponentName;

    iget-object v3, p0, Lcom/ryanheise/audioservice/a;->a:Landroid/content/Context;

    const-class v4, Lcom/ryanheise/audioservice/AudioService;

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v3, p0, Lcom/ryanheise/audioservice/a;->f:Landroid/support/v4/media/MediaBrowserCompat$b;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v4/media/MediaBrowserCompat;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$b;Landroid/os/Bundle;)V

    sput-object v0, Lcom/ryanheise/audioservice/a;->n:Landroid/support/v4/media/MediaBrowserCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat;->a()V

    :cond_0
    return-void
.end method

.method public final z()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/a;->i:Lcom/ryanheise/audioservice/a$d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/ryanheise/audioservice/a$d;->a(Lcom/ryanheise/audioservice/a$d;)Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.MAIN"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    :cond_1
    sget-object v0, Lcom/ryanheise/audioservice/a;->o:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz v0, :cond_2

    sget-object v2, Lcom/ryanheise/audioservice/a;->p:Landroid/support/v4/media/session/MediaControllerCompat$a;

    invoke-virtual {v0, v2}, Landroid/support/v4/media/session/MediaControllerCompat;->g(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    sput-object v1, Lcom/ryanheise/audioservice/a;->o:Landroid/support/v4/media/session/MediaControllerCompat;

    :cond_2
    sget-object v0, Lcom/ryanheise/audioservice/a;->n:Landroid/support/v4/media/MediaBrowserCompat;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat;->b()V

    sput-object v1, Lcom/ryanheise/audioservice/a;->n:Landroid/support/v4/media/MediaBrowserCompat;

    :cond_3
    return-void
.end method
