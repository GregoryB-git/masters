.class Landroidx/media2/common/MediaParcelUtils$MediaItemParcelImpl;
.super Landroidx/versionedparcelable/ParcelImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/common/MediaParcelUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MediaItemParcelImpl"
.end annotation


# instance fields
.field public final b:Landroidx/media2/common/MediaItem;


# direct methods
.method public constructor <init>(Landroidx/media2/common/MediaItem;)V
    .locals 7

    .line 1
    new-instance v6, Landroidx/media2/common/MediaItem;

    .line 2
    .line 3
    iget-object v1, p1, Landroidx/media2/common/MediaItem;->b:Landroidx/media2/common/MediaMetadata;

    .line 4
    .line 5
    iget-wide v2, p1, Landroidx/media2/common/MediaItem;->c:J

    .line 6
    .line 7
    iget-wide v4, p1, Landroidx/media2/common/MediaItem;->d:J

    .line 8
    .line 9
    move-object v0, v6

    .line 10
    invoke-direct/range {v0 .. v5}, Landroidx/media2/common/MediaItem;-><init>(Landroidx/media2/common/MediaMetadata;JJ)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v6}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Lb2/e;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/media2/common/MediaParcelUtils$MediaItemParcelImpl;->b:Landroidx/media2/common/MediaItem;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method


# virtual methods
.method public final a()Lb2/e;
    .locals 1

    iget-object v0, p0, Landroidx/media2/common/MediaParcelUtils$MediaItemParcelImpl;->b:Landroidx/media2/common/MediaItem;

    return-object v0
.end method
