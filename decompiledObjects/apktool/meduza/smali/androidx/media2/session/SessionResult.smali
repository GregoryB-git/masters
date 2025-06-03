.class public Landroidx/media2/session/SessionResult;
.super Landroidx/versionedparcelable/CustomVersionedParcelable;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:Landroid/os/Bundle;

.field public d:Landroidx/media2/common/MediaItem;

.field public e:Landroidx/media2/common/MediaItem;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V

    return-void
.end method

.method public constructor <init>(ILandroid/os/Bundle;)V
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-direct {p0}, Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V

    iput p1, p0, Landroidx/media2/session/SessionResult;->a:I

    iput-object p2, p0, Landroidx/media2/session/SessionResult;->c:Landroid/os/Bundle;

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/media2/session/SessionResult;->d:Landroidx/media2/common/MediaItem;

    iput-wide v0, p0, Landroidx/media2/session/SessionResult;->b:J

    return-void
.end method
