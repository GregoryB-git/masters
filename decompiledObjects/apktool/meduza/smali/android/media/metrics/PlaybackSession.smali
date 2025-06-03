.class public final synthetic Landroid/media/metrics/PlaybackSession;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    throw v0
.end method


# virtual methods
.method public native synthetic getSessionId()Landroid/media/metrics/LogSessionId;
    .annotation build Landroid/annotation/NonNull;
    .end annotation
.end method

.method public native synthetic reportNetworkEvent(Landroid/media/metrics/NetworkEvent;)V
    .param p1    # Landroid/media/metrics/NetworkEvent;
        .annotation build Landroid/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public native synthetic reportPlaybackErrorEvent(Landroid/media/metrics/PlaybackErrorEvent;)V
    .param p1    # Landroid/media/metrics/PlaybackErrorEvent;
        .annotation build Landroid/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public native synthetic reportPlaybackMetrics(Landroid/media/metrics/PlaybackMetrics;)V
    .param p1    # Landroid/media/metrics/PlaybackMetrics;
        .annotation build Landroid/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public native synthetic reportPlaybackStateEvent(Landroid/media/metrics/PlaybackStateEvent;)V
    .param p1    # Landroid/media/metrics/PlaybackStateEvent;
        .annotation build Landroid/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public native synthetic reportTrackChangeEvent(Landroid/media/metrics/TrackChangeEvent;)V
    .param p1    # Landroid/media/metrics/TrackChangeEvent;
        .annotation build Landroid/annotation/NonNull;
        .end annotation
    .end param
.end method
