.class public final Landroidx/media2/session/MediaController$PlaybackInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb2/e;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Landroidx/media/AudioAttributesCompat;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Landroidx/media2/session/MediaController$PlaybackInfo;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Landroidx/media2/session/MediaController$PlaybackInfo;

    iget v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->a:I

    iget v2, p1, Landroidx/media2/session/MediaController$PlaybackInfo;->a:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->b:I

    iget v2, p1, Landroidx/media2/session/MediaController$PlaybackInfo;->b:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->c:I

    iget v2, p1, Landroidx/media2/session/MediaController$PlaybackInfo;->c:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->d:I

    iget v2, p1, Landroidx/media2/session/MediaController$PlaybackInfo;->d:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->e:Landroidx/media/AudioAttributesCompat;

    iget-object p1, p1, Landroidx/media2/session/MediaController$PlaybackInfo;->e:Landroidx/media/AudioAttributesCompat;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget v1, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->e:Landroidx/media/AudioAttributesCompat;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
