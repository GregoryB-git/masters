.class public final Landroid/support/v4/media/MediaBrowserCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/MediaBrowserCompat$f;,
        Landroid/support/v4/media/MediaBrowserCompat$b;,
        Landroid/support/v4/media/MediaBrowserCompat$c;,
        Landroid/support/v4/media/MediaBrowserCompat$e;,
        Landroid/support/v4/media/MediaBrowserCompat$d;,
        Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;,
        Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;,
        Landroid/support/v4/media/MediaBrowserCompat$ItemReceiver;,
        Landroid/support/v4/media/MediaBrowserCompat$h;,
        Landroid/support/v4/media/MediaBrowserCompat$a;,
        Landroid/support/v4/media/MediaBrowserCompat$g;,
        Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
    }
.end annotation


# static fields
.field public static final b:Z


# instance fields
.field public final a:Landroid/support/v4/media/MediaBrowserCompat$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "MediaBrowserCompat"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Landroid/support/v4/media/MediaBrowserCompat;->b:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$b;Landroid/os/Bundle;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$f;

    invoke-direct {v0, p1, p2, p3, p4}, Landroid/support/v4/media/MediaBrowserCompat$f;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$b;Landroid/os/Bundle;)V

    :goto_0
    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat;->a:Landroid/support/v4/media/MediaBrowserCompat$c;

    goto :goto_1

    :cond_0
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$e;

    invoke-direct {v0, p1, p2, p3, p4}, Landroid/support/v4/media/MediaBrowserCompat$e;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$b;Landroid/os/Bundle;)V

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    const-string v0, "MediaBrowserCompat"

    const-string v1, "Connecting to a MediaBrowserService."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat;->a:Landroid/support/v4/media/MediaBrowserCompat$c;

    invoke-interface {v0}, Landroid/support/v4/media/MediaBrowserCompat$c;->a()V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat;->a:Landroid/support/v4/media/MediaBrowserCompat$c;

    invoke-interface {v0}, Landroid/support/v4/media/MediaBrowserCompat$c;->c()V

    return-void
.end method

.method public c()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat;->a:Landroid/support/v4/media/MediaBrowserCompat$c;

    invoke-interface {v0}, Landroid/support/v4/media/MediaBrowserCompat$c;->b()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    return-object v0
.end method
