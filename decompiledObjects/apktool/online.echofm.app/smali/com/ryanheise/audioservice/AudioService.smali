.class public Lcom/ryanheise/audioservice/AudioService;
.super La0/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ryanheise/audioservice/AudioService$e;,
        Lcom/ryanheise/audioservice/AudioService$d;
    }
.end annotation


# static fields
.field public static R:Lcom/ryanheise/audioservice/AudioService;

.field public static S:Landroid/app/PendingIntent;

.field public static T:Lcom/ryanheise/audioservice/AudioService$e;

.field public static U:Ljava/util/List;

.field public static final V:Ljava/util/Map;


# instance fields
.field public A:Landroid/support/v4/media/session/MediaSessionCompat;

.field public B:Lcom/ryanheise/audioservice/AudioService$d;

.field public C:Ljava/util/List;

.field public D:Ljava/util/List;

.field public E:Ljava/util/List;

.field public F:[I

.field public G:Landroid/support/v4/media/MediaMetadataCompat;

.field public H:Landroid/graphics/Bitmap;

.field public I:Ljava/lang/String;

.field public J:Landroid/util/LruCache;

.field public K:Z

.field public L:Ll5/a;

.field public M:I

.field public N:I

.field public O:Z

.field public final P:Landroid/os/Handler;

.field public Q:La0/o;

.field public x:Lio/flutter/embedding/engine/a;

.field public y:Ll5/h;

.field public z:Landroid/os/PowerManager$WakeLock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/ryanheise/audioservice/AudioService;->U:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/ryanheise/audioservice/AudioService;->V:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, La0/d;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->C:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->D:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->E:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->K:Z

    sget-object v0, Ll5/a;->o:Ll5/a;

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->L:Ll5/a;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->P:Landroid/os/Handler;

    return-void
.end method

.method public static A(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 3

    .line 1
    iget v0, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget p0, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    const/4 v1, 0x1

    if-gt v0, p2, :cond_0

    if-le p0, p1, :cond_1

    :cond_0
    div-int/lit8 v0, v0, 0x2

    div-int/lit8 p0, p0, 0x2

    :goto_0
    div-int v2, v0, v1

    if-lt v2, p2, :cond_1

    div-int v2, p0, v1

    if-lt v2, p1, :cond_1

    mul-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static K(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->V:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/MediaMetadataCompat;

    return-object p0
.end method

.method public static Q(Lcom/ryanheise/audioservice/AudioService$e;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/ryanheise/audioservice/AudioService;->T:Lcom/ryanheise/audioservice/AudioService$e;

    return-void
.end method

.method public static d0(J)I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/16 p0, 0x5b

    return p0

    :cond_0
    const-wide/16 v0, 0x2

    cmp-long v0, p0, v0

    if-nez v0, :cond_1

    const/16 p0, 0x82

    return p0

    :cond_1
    invoke-static {p0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->h(J)I

    move-result p0

    return p0
.end method

.method public static synthetic t(Lcom/ryanheise/audioservice/AudioService;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->e0()V

    return-void
.end method

.method public static synthetic u()Lcom/ryanheise/audioservice/AudioService$e;
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->T:Lcom/ryanheise/audioservice/AudioService$e;

    return-object v0
.end method

.method public static synthetic v(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/MediaSessionCompat;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    return-object p0
.end method


# virtual methods
.method public B(Ll5/h;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    .line 2
    .line 3
    iget-object v0, p1, Ll5/h;->c:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ".channel"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->I:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v0, p1, Ll5/h;->n:Ljava/lang/String;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v2, Landroid/content/Intent;

    .line 45
    .line 46
    invoke-direct {v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Landroid/content/ComponentName;

    .line 50
    .line 51
    iget-object v4, p1, Ll5/h;->n:Ljava/lang/String;

    .line 52
    .line 53
    invoke-direct {v3, v0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    const-string v3, "com.ryanheise.audioservice.NOTIFICATION_CLICK"

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    const/16 v3, 0x3e8

    .line 65
    .line 66
    const/high16 v4, 0xc000000

    .line 67
    .line 68
    invoke-static {v0, v3, v2, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lcom/ryanheise/audioservice/AudioService;->S:Landroid/app/PendingIntent;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    sput-object v1, Lcom/ryanheise/audioservice/AudioService;->S:Landroid/app/PendingIntent;

    .line 76
    .line 77
    :goto_1
    iget-boolean p1, p1, Ll5/h;->b:Z

    .line 78
    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 82
    .line 83
    invoke-virtual {p1, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->l(Landroid/app/PendingIntent;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    return-void
.end method

.method public C(Ljava/lang/String;Ljava/lang/String;J)Lw/h$a;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ryanheise/audioservice/AudioService;->O(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    new-instance v0, Lw/h$a;

    .line 6
    .line 7
    invoke-virtual {p0, p3, p4}, Lcom/ryanheise/audioservice/AudioService;->y(J)Landroid/app/PendingIntent;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-direct {v0, p1, p2, p3}, Lw/h$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final D()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->M()Landroid/app/NotificationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->I:Ljava/lang/String;

    invoke-static {v0, v1}, Lx2/e;->a(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {}, Ll5/c;->a()V

    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->I:Ljava/lang/String;

    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    iget-object v2, v2, Ll5/h;->d:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-static {v1, v2, v3}, Lx2/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    move-result-object v1

    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    iget-boolean v2, v2, Ll5/h;->h:Z

    invoke-static {v1, v2}, Ll5/d;->a(Landroid/app/NotificationChannel;Z)V

    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    iget-object v2, v2, Ll5/h;->e:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-static {v1, v2}, Ll5/e;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    :cond_0
    invoke-static {v0, v1}, Lx2/f;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    :cond_1
    return-void
.end method

.method public E(Ll5/r;)Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
    .locals 5

    .line 1
    iget-object v0, p1, Ll5/r;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/ryanheise/audioservice/AudioService;->O(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p1, Ll5/r;->d:Ll5/p;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v2, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;

    .line 12
    .line 13
    iget-object v1, v1, Ll5/p;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Ll5/r;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v2, v1, v3, v0}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p1, Ll5/r;->d:Ll5/p;

    .line 21
    .line 22
    iget-object p1, p1, Ll5/p;->b:Ljava/util/Map;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/ryanheise/audioservice/AudioService;->U(Ljava/util/Map;)Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v2, p1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;->b(Landroid/os/Bundle;)Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;->a()Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v2, 0x21

    .line 40
    .line 41
    if-lt v1, v2, :cond_3

    .line 42
    .line 43
    iget-wide v1, p1, Ll5/r;->c:J

    .line 44
    .line 45
    const-wide/16 v3, 0x1

    .line 46
    .line 47
    cmp-long v3, v1, v3

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    new-instance v1, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;

    .line 52
    .line 53
    const-string v2, "com.ryanheise.audioservice.action.STOP"

    .line 54
    .line 55
    iget-object p1, p1, Ll5/r;->b:Ljava/lang/String;

    .line 56
    .line 57
    invoke-direct {v1, v2, p1, v0}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;->a()Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_1
    const-wide/16 v3, 0x40

    .line 66
    .line 67
    cmp-long v3, v1, v3

    .line 68
    .line 69
    if-nez v3, :cond_2

    .line 70
    .line 71
    new-instance v1, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;

    .line 72
    .line 73
    const-string v2, "com.ryanheise.audioservice.action.FAST_FORWARD"

    .line 74
    .line 75
    iget-object p1, p1, Ll5/r;->b:Ljava/lang/String;

    .line 76
    .line 77
    invoke-direct {v1, v2, p1, v0}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;->a()Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :cond_2
    const-wide/16 v3, 0x8

    .line 86
    .line 87
    cmp-long v1, v1, v3

    .line 88
    .line 89
    if-nez v1, :cond_3

    .line 90
    .line 91
    new-instance v1, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;

    .line 92
    .line 93
    const-string v2, "com.ryanheise.audioservice.action.REWIND"

    .line 94
    .line 95
    iget-object p1, p1, Ll5/r;->b:Ljava/lang/String;

    .line 96
    .line 97
    invoke-direct {v1, v2, p1, v0}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$b;->a()Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1

    .line 105
    :cond_3
    const/4 p1, 0x0

    .line 106
    return-object p1
.end method

.method public F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/support/v4/media/RatingCompat;Ljava/util/Map;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 2

    .line 1
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat$b;

    invoke-direct {v0}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>()V

    const-string v1, "android.media.metadata.MEDIA_ID"

    invoke-virtual {v0, v1, p1}, Landroid/support/v4/media/MediaMetadataCompat$b;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    move-result-object v0

    const-string v1, "android.media.metadata.TITLE"

    invoke-virtual {v0, v1, p2}, Landroid/support/v4/media/MediaMetadataCompat$b;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    move-result-object p2

    if-eqz p3, :cond_0

    const-string v0, "android.media.metadata.ALBUM"

    invoke-virtual {p2, v0, p3}, Landroid/support/v4/media/MediaMetadataCompat$b;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    :cond_0
    if-eqz p4, :cond_1

    const-string p3, "android.media.metadata.ARTIST"

    invoke-virtual {p2, p3, p4}, Landroid/support/v4/media/MediaMetadataCompat$b;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    :cond_1
    if-eqz p5, :cond_2

    const-string p3, "android.media.metadata.GENRE"

    invoke-virtual {p2, p3, p5}, Landroid/support/v4/media/MediaMetadataCompat$b;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    :cond_2
    if-eqz p6, :cond_3

    const-string p3, "android.media.metadata.DURATION"

    invoke-virtual {p6}, Ljava/lang/Long;->longValue()J

    move-result-wide p4

    invoke-virtual {p2, p3, p4, p5}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat$b;

    :cond_3
    if-eqz p7, :cond_4

    const-string p3, "android.media.metadata.DISPLAY_ICON_URI"

    invoke-virtual {p2, p3, p7}, Landroid/support/v4/media/MediaMetadataCompat$b;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    :cond_4
    const-wide/16 p3, 0x0

    const-wide/16 p5, 0x1

    if-eqz p8, :cond_6

    invoke-virtual {p8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p7

    if-eqz p7, :cond_5

    move-wide p7, p5

    goto :goto_0

    :cond_5
    move-wide p7, p3

    :goto_0
    const-string v0, "playable_long"

    invoke-virtual {p2, v0, p7, p8}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat$b;

    :cond_6
    if-eqz p9, :cond_7

    const-string p7, "android.media.metadata.DISPLAY_TITLE"

    invoke-virtual {p2, p7, p9}, Landroid/support/v4/media/MediaMetadataCompat$b;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    :cond_7
    if-eqz p10, :cond_8

    const-string p7, "android.media.metadata.DISPLAY_SUBTITLE"

    invoke-virtual {p2, p7, p10}, Landroid/support/v4/media/MediaMetadataCompat$b;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    :cond_8
    if-eqz p11, :cond_9

    const-string p7, "android.media.metadata.DISPLAY_DESCRIPTION"

    invoke-virtual {p2, p7, p11}, Landroid/support/v4/media/MediaMetadataCompat$b;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    :cond_9
    if-eqz p12, :cond_a

    const-string p7, "android.media.metadata.RATING"

    invoke-virtual {p2, p7, p12}, Landroid/support/v4/media/MediaMetadataCompat$b;->d(Ljava/lang/String;Landroid/support/v4/media/RatingCompat;)Landroid/support/v4/media/MediaMetadataCompat$b;

    :cond_a
    if-eqz p13, :cond_11

    invoke-interface {p13}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p7

    invoke-interface {p7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p7

    :cond_b
    :goto_1
    invoke-interface {p7}, Ljava/util/Iterator;->hasNext()Z

    move-result p8

    if-eqz p8, :cond_11

    invoke-interface {p7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p8

    check-cast p8, Ljava/lang/String;

    invoke-interface {p13, p8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p9

    instance-of p10, p9, Ljava/lang/Long;

    if-eqz p10, :cond_c

    check-cast p9, Ljava/lang/Long;

    invoke-virtual {p9}, Ljava/lang/Long;->longValue()J

    move-result-wide p9

    :goto_2
    invoke-virtual {p2, p8, p9, p10}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat$b;

    goto :goto_1

    :cond_c
    instance-of p10, p9, Ljava/lang/Integer;

    if-eqz p10, :cond_d

    check-cast p9, Ljava/lang/Integer;

    invoke-virtual {p9}, Ljava/lang/Integer;->intValue()I

    move-result p9

    int-to-long p9, p9

    goto :goto_2

    :cond_d
    instance-of p10, p9, Ljava/lang/String;

    if-eqz p10, :cond_e

    check-cast p9, Ljava/lang/String;

    :goto_3
    invoke-virtual {p2, p8, p9}, Landroid/support/v4/media/MediaMetadataCompat$b;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    goto :goto_1

    :cond_e
    instance-of p10, p9, Ljava/lang/Boolean;

    if-eqz p10, :cond_10

    check-cast p9, Ljava/lang/Boolean;

    invoke-virtual {p9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p9

    if-eqz p9, :cond_f

    move-wide p9, p5

    goto :goto_2

    :cond_f
    move-wide p9, p3

    goto :goto_2

    :cond_10
    instance-of p10, p9, Ljava/lang/Double;

    if-eqz p10, :cond_b

    invoke-virtual {p9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p9

    goto :goto_3

    :cond_11
    invoke-virtual {p2}, Landroid/support/v4/media/MediaMetadataCompat$b;->a()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p2

    sget-object p3, Lcom/ryanheise/audioservice/AudioService;->V:Ljava/util/Map;

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final G()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->g(Z)V

    :cond_0
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->M()Landroid/app/NotificationManager;

    move-result-object v0

    const/16 v1, 0x464

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    return-void
.end method

.method public final H()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ryanheise/audioservice/AudioService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {p0, v0}, Lx/a;->k(Landroid/content/Context;Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->g(Z)V

    :cond_0
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->w()V

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    sget-object v1, Lcom/ryanheise/audioservice/AudioService;->S:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->s(Landroid/app/PendingIntent;)V

    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->R()V

    return-void
.end method

.method public final I()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/ryanheise/audioservice/AudioService;->S(Z)V

    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->X()V

    return-void
.end method

.method public final J()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    iget-boolean v0, v0, Ll5/h;->k:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->I()V

    :cond_0
    return-void
.end method

.method public final L()Lw/h$e;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->D()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Lw/h$e;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->I:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lw/h$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lw/h$e;->C(I)Lw/h$e;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Lw/h$e;->v(Z)Lw/h$e;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->x()Landroid/app/PendingIntent;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lw/h$e;->n(Landroid/app/PendingIntent;)Lw/h$e;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    .line 36
    .line 37
    iget-object v1, v1, Ll5/h;->g:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Lcom/ryanheise/audioservice/AudioService;->O(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {v0, v1}, Lw/h$e;->w(I)Lw/h$e;

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method public final M()Landroid/app/NotificationManager;
    .locals 1

    .line 1
    const-string v0, "notification"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    return-object v0
.end method

.method public N()I
    .locals 5

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService$c;->a:[I

    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->L:Ll5/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v2, 0x6

    const/4 v3, 0x3

    if-eq v0, v3, :cond_5

    const/4 v4, 0x4

    if-eq v0, v4, :cond_3

    const/4 v4, 0x5

    if-eq v0, v4, :cond_1

    if-eq v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x7

    return v0

    :cond_1
    iget-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->K:Z

    if-eqz v0, :cond_2

    move v1, v3

    :cond_2
    return v1

    :cond_3
    iget-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->K:Z

    if-eqz v0, :cond_4

    move v1, v3

    :cond_4
    return v1

    :cond_5
    return v2

    :cond_6
    const/16 v0, 0x8

    return v0
.end method

.method public O(Ljava/lang/String;)I
    .locals 3

    .line 1
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object p1, p1, v1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public P()V
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->T:Lcom/ryanheise/audioservice/AudioService$e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$e;->b()V

    return-void
.end method

.method public final R()V
    .locals 2

    .line 1
    const/16 v0, 0x464

    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->z()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->O:Z

    return-void
.end method

.method public final S(Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Ll5/b;->a(Lcom/ryanheise/audioservice/AudioService;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/app/Service;->stopForeground(Z)V

    :goto_0
    return-void
.end method

.method public T(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->J:Landroid/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    const-string v3, "content"

    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, -0x1

    if-eqz v3, :cond_5

    if-eqz p2, :cond_3

    :try_start_1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt p2, v5, :cond_3

    new-instance p2, Landroid/util/Size;

    const/16 v0, 0xc0

    invoke-direct {p2, v0, v0}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    new-instance v5, Landroid/util/Size;

    iget-object v6, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    iget v6, v6, Ll5/h;->l:I

    if-ne v6, v4, :cond_1

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v6

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    :goto_0
    iget-object v7, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    iget v7, v7, Ll5/h;->m:I

    if-ne v7, v4, :cond_2

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result v7

    :cond_2
    invoke-direct {v5, v6, v7}, Landroid/util/Size;-><init>(II)V

    invoke-static {v0, v2, v5, v1}, Ll5/f;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_5

    return-object v1

    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    const-string v5, "r"

    invoke-virtual {p2, v2, v5}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p2
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_1
    :cond_4
    return-object v1

    :cond_5
    move-object p2, v1

    :goto_1
    if-eqz v3, :cond_6

    if-eqz p2, :cond_b

    :cond_6
    :try_start_2
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    iget v0, v0, Ll5/h;->l:I

    if-eq v0, v4, :cond_9

    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v3, 0x1

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    if-eqz p2, :cond_7

    invoke-static {p2, v1, v0}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    goto :goto_2

    :cond_7
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    :goto_2
    iget-object v3, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    iget v4, v3, Ll5/h;->l:I

    iget v3, v3, Ll5/h;->m:I

    invoke-static {v0, v4, v3}, Lcom/ryanheise/audioservice/AudioService;->A(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v3

    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v3, 0x0

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    if-eqz p2, :cond_8

    invoke-static {p2, v1, v0}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p2

    :goto_3
    move-object v0, p2

    goto :goto_4

    :cond_8
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p2

    goto :goto_3

    :cond_9
    if-eqz p2, :cond_a

    invoke-static {p2}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_4

    :cond_a
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_b
    :goto_4
    iget-object p2, p0, Lcom/ryanheise/audioservice/AudioService;->J:Landroid/util/LruCache;

    invoke-virtual {p2, p1, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v1
.end method

.method public final U(Ljava/util/Map;)Landroid/os/Bundle;
    .locals 5

    .line 1
    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Integer;

    if-eqz v3, :cond_1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    instance-of v3, v1, Ljava/lang/Long;

    if-eqz v3, :cond_2

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public final V(Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaMetadataCompat;
    .locals 2

    .line 1
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat$b;

    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>(Landroid/support/v4/media/MediaMetadataCompat;)V

    const-string p1, "android.media.metadata.ALBUM_ART"

    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->H:Landroid/graphics/Bitmap;

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$b;

    move-result-object p1

    const-string v0, "android.media.metadata.DISPLAY_ICON"

    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->H:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat$b;->a()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p1

    return-object p1
.end method

.method public final W()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->G()V

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->f()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    return-void
.end method

.method public final X()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->z:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->z:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_0
    return-void
.end method

.method public declared-synchronized Y(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 3

    .line 1
    monitor-enter p0

    :try_start_0
    const-string v0, "artCacheFile"

    invoke-virtual {p1, v0}, Landroid/support/v4/media/MediaMetadataCompat;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, v1}, Lcom/ryanheise/audioservice/AudioService;->T(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->H:Landroid/graphics/Bitmap;

    :goto_0
    invoke-virtual {p0, p1}, Lcom/ryanheise/audioservice/AudioService;->V(Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const-string v0, "android.media.metadata.DISPLAY_ICON_URI"

    invoke-virtual {p1, v0}, Landroid/support/v4/media/MediaMetadataCompat;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v2, "content:"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "loadThumbnailUri"

    invoke-virtual {p1, v2}, Landroid/support/v4/media/MediaMetadataCompat;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lcom/ryanheise/audioservice/AudioService;->T(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->H:Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_1
    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->H:Landroid/graphics/Bitmap;

    :goto_1
    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->G:Landroid/support/v4/media/MediaMetadataCompat;

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->m(Landroid/support/v4/media/MediaMetadataCompat;)V

    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->P:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->P:Landroid/os/Handler;

    new-instance v0, Ll5/g;

    invoke-direct {v0, p0}, Ll5/g;-><init>(Lcom/ryanheise/audioservice/AudioService;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public Z(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat;->o(I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->Q:La0/o;

    goto :goto_2

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->Q:La0/o;

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->Q:La0/o;

    invoke-virtual {v0}, La0/o;->b()I

    move-result v0

    if-ne p1, v0, :cond_2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->Q:La0/o;

    invoke-virtual {v0}, La0/o;->a()I

    move-result v0

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->Q:La0/o;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, La0/o;->f(I)V

    goto :goto_1

    :cond_2
    :goto_0
    new-instance p1, Lcom/ryanheise/audioservice/AudioService$b;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    invoke-direct {p1, p0, p2, p3, p4}, Lcom/ryanheise/audioservice/AudioService$b;-><init>(Lcom/ryanheise/audioservice/AudioService;III)V

    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->Q:La0/o;

    :goto_1
    iget-object p1, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object p2, p0, Lcom/ryanheise/audioservice/AudioService;->Q:La0/o;

    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat;->p(La0/o;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public declared-synchronized a0(Ljava/util/List;)V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    sput-object p1, Lcom/ryanheise/audioservice/AudioService;->U:Ljava/util/List;

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->q(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b0(Ljava/util/List;J[ILl5/a;ZJJFJLjava/lang/Integer;Ljava/lang/String;IIZLjava/lang/Long;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move/from16 v4, p6

    move-object/from16 v5, p15

    move/from16 v6, p16

    move/from16 v7, p17

    iget-object v8, v0, Lcom/ryanheise/audioservice/AudioService;->F:[I

    invoke-static {v2, v8}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v8

    const/4 v9, 0x1

    xor-int/2addr v8, v9

    iget-object v10, v0, Lcom/ryanheise/audioservice/AudioService;->C:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_0

    goto :goto_0

    :cond_0
    move v9, v8

    :goto_0
    iput-object v1, v0, Lcom/ryanheise/audioservice/AudioService;->C:Ljava/util/List;

    iget-object v8, v0, Lcom/ryanheise/audioservice/AudioService;->D:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->clear()V

    iget-object v8, v0, Lcom/ryanheise/audioservice/AudioService;->E:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->clear()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll5/r;

    invoke-virtual {v0, v8}, Lcom/ryanheise/audioservice/AudioService;->E(Ll5/r;)Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    move-result-object v10

    if-eqz v10, :cond_1

    iget-object v8, v0, Lcom/ryanheise/audioservice/AudioService;->E:Ljava/util/List;

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v10, v0, Lcom/ryanheise/audioservice/AudioService;->D:Ljava/util/List;

    iget-object v11, v8, Ll5/r;->a:Ljava/lang/String;

    iget-object v12, v8, Ll5/r;->b:Ljava/lang/String;

    iget-wide v13, v8, Ll5/r;->c:J

    invoke-virtual {v0, v11, v12, v13, v14}, Lcom/ryanheise/audioservice/AudioService;->C(Ljava/lang/String;Ljava/lang/String;J)Lw/h$a;

    move-result-object v8

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iput-object v2, v0, Lcom/ryanheise/audioservice/AudioService;->F:[I

    iget-boolean v1, v0, Lcom/ryanheise/audioservice/AudioService;->K:Z

    iget-object v2, v0, Lcom/ryanheise/audioservice/AudioService;->L:Ll5/a;

    iput-object v3, v0, Lcom/ryanheise/audioservice/AudioService;->L:Ll5/a;

    iput-boolean v4, v0, Lcom/ryanheise/audioservice/AudioService;->K:Z

    iput v6, v0, Lcom/ryanheise/audioservice/AudioService;->M:I

    iput v7, v0, Lcom/ryanheise/audioservice/AudioService;->N:I

    new-instance v8, Landroid/support/v4/media/session/PlaybackStateCompat$d;

    invoke-direct {v8}, Landroid/support/v4/media/session/PlaybackStateCompat$d;-><init>()V

    const-wide/32 v10, 0x37fecf

    or-long v10, p2, v10

    invoke-virtual {v8, v10, v11}, Landroid/support/v4/media/session/PlaybackStateCompat$d;->c(J)Landroid/support/v4/media/session/PlaybackStateCompat$d;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/ryanheise/audioservice/AudioService;->N()I

    move-result v13

    move-wide/from16 v14, p7

    move/from16 v16, p11

    move-wide/from16 v17, p12

    invoke-virtual/range {v12 .. v18}, Landroid/support/v4/media/session/PlaybackStateCompat$d;->h(IJFJ)Landroid/support/v4/media/session/PlaybackStateCompat$d;

    move-result-object v8

    move-wide/from16 v10, p9

    invoke-virtual {v8, v10, v11}, Landroid/support/v4/media/session/PlaybackStateCompat$d;->e(J)Landroid/support/v4/media/session/PlaybackStateCompat$d;

    move-result-object v8

    iget-object v10, v0, Lcom/ryanheise/audioservice/AudioService;->E:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    invoke-virtual {v8, v11}, Landroid/support/v4/media/session/PlaybackStateCompat$d;->a(Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;)Landroid/support/v4/media/session/PlaybackStateCompat$d;

    goto :goto_2

    :cond_3
    if-eqz p19, :cond_4

    invoke-virtual/range {p19 .. p19}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-virtual {v8, v10, v11}, Landroid/support/v4/media/session/PlaybackStateCompat$d;->d(J)Landroid/support/v4/media/session/PlaybackStateCompat$d;

    :cond_4
    if-eqz p14, :cond_5

    if-eqz v5, :cond_5

    invoke-virtual/range {p14 .. p14}, Ljava/lang/Integer;->intValue()I

    move-result v10

    :goto_3
    invoke-virtual {v8, v10, v5}, Landroid/support/v4/media/session/PlaybackStateCompat$d;->f(ILjava/lang/CharSequence;)Landroid/support/v4/media/session/PlaybackStateCompat$d;

    goto :goto_4

    :cond_5
    if-eqz v5, :cond_6

    const v10, -0xf1206

    goto :goto_3

    :cond_6
    :goto_4
    iget-object v5, v0, Lcom/ryanheise/audioservice/AudioService;->G:Landroid/support/v4/media/MediaMetadataCompat;

    if-eqz v5, :cond_7

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    iget-object v10, v0, Lcom/ryanheise/audioservice/AudioService;->G:Landroid/support/v4/media/MediaMetadataCompat;

    invoke-virtual {v10}, Landroid/support/v4/media/MediaMetadataCompat;->e()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v10

    invoke-virtual {v10}, Landroid/support/v4/media/MediaDescriptionCompat;->g()Ljava/lang/String;

    move-result-object v10

    const-string v11, "androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID"

    invoke-virtual {v5, v11, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Landroid/support/v4/media/session/PlaybackStateCompat$d;->g(Landroid/os/Bundle;)Landroid/support/v4/media/session/PlaybackStateCompat$d;

    :cond_7
    iget-object v5, v0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v8}, Landroid/support/v4/media/session/PlaybackStateCompat$d;->b()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v8

    invoke-virtual {v5, v8}, Landroid/support/v4/media/session/MediaSessionCompat;->n(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    iget-object v5, v0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v5, v6}, Landroid/support/v4/media/session/MediaSessionCompat;->r(I)V

    iget-object v5, v0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v5, v7}, Landroid/support/v4/media/session/MediaSessionCompat;->t(I)V

    iget-object v5, v0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    move/from16 v6, p18

    invoke-virtual {v5, v6}, Landroid/support/v4/media/session/MediaSessionCompat;->j(Z)V

    if-nez v1, :cond_8

    if-eqz v4, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/ryanheise/audioservice/AudioService;->H()V

    goto :goto_5

    :cond_8
    if-eqz v1, :cond_9

    if-nez v4, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/ryanheise/audioservice/AudioService;->J()V

    :cond_9
    :goto_5
    sget-object v1, Ll5/a;->o:Ll5/a;

    if-eq v2, v1, :cond_a

    if-ne v3, v1, :cond_a

    invoke-virtual/range {p0 .. p0}, Lcom/ryanheise/audioservice/AudioService;->c0()V

    goto :goto_6

    :cond_a
    if-eq v3, v1, :cond_b

    if-eqz v9, :cond_b

    invoke-virtual/range {p0 .. p0}, Lcom/ryanheise/audioservice/AudioService;->e0()V

    :cond_b
    :goto_6
    return-void
.end method

.method public c0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->G()V

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return-void
.end method

.method public final e0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->O:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->M()Landroid/app/NotificationManager;

    move-result-object v0

    const/16 v1, 0x464

    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->z()Landroid/app/Notification;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    :cond_0
    return-void
.end method

.method public g(Ljava/lang/String;ILandroid/os/Bundle;)La0/d$e;
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const-string p1, "android.service.media.extra.RECENT"

    .line 6
    .line 7
    invoke-virtual {p3, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    if-nez p1, :cond_1

    .line 16
    .line 17
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    :cond_1
    iget-object p2, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    .line 20
    .line 21
    invoke-virtual {p2}, Ll5/h;->a()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    new-instance p3, La0/d$e;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    const-string p1, "recent"

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    const-string p1, "root"

    .line 37
    .line 38
    :goto_1
    invoke-direct {p3, p1, p2}, La0/d$e;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    return-object p3
.end method

.method public h(Ljava/lang/String;La0/d$l;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/ryanheise/audioservice/AudioService;->i(Ljava/lang/String;La0/d$l;Landroid/os/Bundle;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public i(Ljava/lang/String;La0/d$l;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->T:Lcom/ryanheise/audioservice/AudioService$e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p1}, La0/d$l;->g(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-interface {v0, p1, p2, p3}, Lcom/ryanheise/audioservice/AudioService$e;->s(Ljava/lang/String;La0/d$l;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public j(Ljava/lang/String;La0/d$l;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->T:Lcom/ryanheise/audioservice/AudioService$e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p2, p1}, La0/d$l;->g(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$e;->m(Ljava/lang/String;La0/d$l;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public k(Ljava/lang/String;Landroid/os/Bundle;La0/d$l;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->T:Lcom/ryanheise/audioservice/AudioService$e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3, p1}, La0/d$l;->g(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-interface {v0, p1, p2, p3}, Lcom/ryanheise/audioservice/AudioService$e;->i(Ljava/lang/String;Landroid/os/Bundle;La0/d$l;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onCreate()V
    .locals 4

    invoke-super {p0}, La0/d;->onCreate()V

    sput-object p0, Lcom/ryanheise/audioservice/AudioService;->R:Lcom/ryanheise/audioservice/AudioService;

    const/4 v0, 0x0

    iput v0, p0, Lcom/ryanheise/audioservice/AudioService;->M:I

    iput v0, p0, Lcom/ryanheise/audioservice/AudioService;->N:I

    iput-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->O:Z

    iput-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->K:Z

    sget-object v0, Ll5/a;->o:Ll5/a;

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->L:Ll5/a;

    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat;

    const-string v1, "media-session"

    invoke-direct {v0, p0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    new-instance v0, Ll5/h;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ll5/h;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/ryanheise/audioservice/AudioService;->B(Ll5/h;)V

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->k(I)V

    new-instance v0, Landroid/support/v4/media/session/PlaybackStateCompat$d;

    invoke-direct {v0}, Landroid/support/v4/media/session/PlaybackStateCompat$d;-><init>()V

    const-wide/32 v1, 0x37fecf

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/media/session/PlaybackStateCompat$d;->c(J)Landroid/support/v4/media/session/PlaybackStateCompat$d;

    move-result-object v0

    iget-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat$d;->b()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v4/media/session/MediaSessionCompat;->n(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    new-instance v1, Lcom/ryanheise/audioservice/AudioService$d;

    invoke-direct {v1, p0}, Lcom/ryanheise/audioservice/AudioService$d;-><init>(Lcom/ryanheise/audioservice/AudioService;)V

    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->B:Lcom/ryanheise/audioservice/AudioService$d;

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->h(Landroid/support/v4/media/session/MediaSessionCompat$b;)V

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->c()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    invoke-virtual {p0, v0}, La0/d;->s(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    sget-object v1, Lcom/ryanheise/audioservice/AudioService;->U:Ljava/util/List;

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->q(Ljava/util/List;)V

    const-string v0, "power"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    const-class v1, Lcom/ryanheise/audioservice/AudioService;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->z:Landroid/os/PowerManager$WakeLock;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    const-wide/16 v2, 0x400

    div-long/2addr v0, v2

    long-to-int v0, v0

    div-int/lit8 v0, v0, 0x8

    new-instance v1, Lcom/ryanheise/audioservice/AudioService$a;

    invoke-direct {v1, p0, v0}, Lcom/ryanheise/audioservice/AudioService$a;-><init>(Lcom/ryanheise/audioservice/AudioService;I)V

    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->J:Landroid/util/LruCache;

    invoke-static {p0}, Lcom/ryanheise/audioservice/a;->B(Landroid/content/Context;)Lio/flutter/embedding/engine/a;

    move-result-object v0

    iput-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->x:Lio/flutter/embedding/engine/a;

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "flutterEngine warmed up"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, La0/d;->onDestroy()V

    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->T:Lcom/ryanheise/audioservice/AudioService$e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$e;->D()V

    sput-object v1, Lcom/ryanheise/audioservice/AudioService;->T:Lcom/ryanheise/audioservice/AudioService$e;

    :cond_0
    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->G:Landroid/support/v4/media/MediaMetadataCompat;

    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->H:Landroid/graphics/Bitmap;

    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->V:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->J:Landroid/util/LruCache;

    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    iput-object v1, p0, Lcom/ryanheise/audioservice/AudioService;->F:[I

    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->W()V

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    iget-boolean v0, v0, Ll5/h;->b:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/ryanheise/audioservice/AudioService;->S(Z)V

    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->X()V

    sput-object v1, Lcom/ryanheise/audioservice/AudioService;->R:Lcom/ryanheise/audioservice/AudioService;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ryanheise/audioservice/AudioService;->O:Z

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    iget-object p2, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-static {p2, p1}, Lc0/d;->c(Landroid/support/v4/media/session/MediaSessionCompat;Landroid/content/Intent;)Landroid/view/KeyEvent;

    const/4 p1, 0x2

    return p1
.end method

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 1

    sget-object v0, Lcom/ryanheise/audioservice/AudioService;->T:Lcom/ryanheise/audioservice/AudioService$e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$e;->y()V

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Service;->onTaskRemoved(Landroid/content/Intent;)V

    return-void
.end method

.method public final w()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->z:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->z:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    :cond_0
    return-void
.end method

.method public x()Landroid/app/PendingIntent;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ryanheise/audioservice/MediaButtonReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, 0x0

    const/high16 v2, 0x4000000

    invoke-static {p0, v1, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method public y(J)Landroid/app/PendingIntent;
    .locals 2

    .line 1
    invoke-static {p1, p2}, Lcom/ryanheise/audioservice/AudioService;->d0(J)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/ryanheise/audioservice/MediaButtonReceiver;

    invoke-direct {p2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "android.intent.action.MEDIA_BUTTON"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v0, Landroid/view/KeyEvent;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    const-string v1, "android.intent.extra.KEY_EVENT"

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/high16 v0, 0x4000000

    invoke-static {p0, p1, p2, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public final z()Landroid/app/Notification;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->F:[I

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aput v2, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    move-object v0, v1

    :cond_1
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService;->L()Lw/h$e;

    move-result-object v1

    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->G:Landroid/support/v4/media/MediaMetadataCompat;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Landroid/support/v4/media/MediaMetadataCompat;->e()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/media/MediaDescriptionCompat;->j()Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Landroid/support/v4/media/MediaDescriptionCompat;->j()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v1, v3}, Lw/h$e;->l(Ljava/lang/CharSequence;)Lw/h$e;

    :cond_2
    invoke-virtual {v2}, Landroid/support/v4/media/MediaDescriptionCompat;->i()Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Landroid/support/v4/media/MediaDescriptionCompat;->i()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v1, v3}, Lw/h$e;->k(Ljava/lang/CharSequence;)Lw/h$e;

    :cond_3
    invoke-virtual {v2}, Landroid/support/v4/media/MediaDescriptionCompat;->b()Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Landroid/support/v4/media/MediaDescriptionCompat;->b()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Lw/h$e;->z(Ljava/lang/CharSequence;)Lw/h$e;

    :cond_4
    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->H:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_5

    invoke-virtual {v1, v2}, Lw/h$e;->p(Landroid/graphics/Bitmap;)Lw/h$e;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_5
    :goto_1
    monitor-exit p0

    goto :goto_3

    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_6
    :goto_3
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    iget-boolean v2, v2, Ll5/h;->i:Z

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaSessionCompat;->b()Landroid/support/v4/media/session/MediaControllerCompat;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaControllerCompat;->b()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v1, v2}, Lw/h$e;->j(Landroid/app/PendingIntent;)Lw/h$e;

    :cond_7
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    iget v2, v2, Ll5/h;->f:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_8

    invoke-virtual {v1, v2}, Lw/h$e;->i(I)Lw/h$e;

    :cond_8
    iget-object v2, p0, Lcom/ryanheise/audioservice/AudioService;->D:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw/h$a;

    invoke-virtual {v1, v3}, Lw/h$e;->b(Lw/h$a;)Lw/h$e;

    goto :goto_4

    :cond_9
    new-instance v2, Lb0/c;

    invoke-direct {v2}, Lb0/c;-><init>()V

    iget-object v3, p0, Lcom/ryanheise/audioservice/AudioService;->A:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaSessionCompat;->c()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v3

    invoke-virtual {v2, v3}, Lb0/c;->i(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Lb0/c;

    move-result-object v2

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-ge v3, v4, :cond_a

    invoke-virtual {v2, v0}, Lb0/c;->j([I)Lb0/c;

    :cond_a
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService;->y:Ll5/h;

    iget-boolean v0, v0, Ll5/h;->j:Z

    if-eqz v0, :cond_b

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lb0/c;->k(Z)Lb0/c;

    const-wide/16 v3, 0x1

    invoke-virtual {p0, v3, v4}, Lcom/ryanheise/audioservice/AudioService;->y(J)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v2, v3}, Lb0/c;->h(Landroid/app/PendingIntent;)Lb0/c;

    invoke-virtual {v1, v0}, Lw/h$e;->t(Z)Lw/h$e;

    :cond_b
    invoke-virtual {v1, v2}, Lw/h$e;->y(Lw/h$f;)Lw/h$e;

    invoke-virtual {v1}, Lw/h$e;->c()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method
