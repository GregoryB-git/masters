.class public final Landroidx/media2/session/PlaybackInfoParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lb2/c;)Landroidx/media2/session/MediaController$PlaybackInfo;
    .locals 3

    new-instance v0, Landroidx/media2/session/MediaController$PlaybackInfo;

    invoke-direct {v0}, Landroidx/media2/session/MediaController$PlaybackInfo;-><init>()V

    iget v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->a:I

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    move-result v1

    iput v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->a:I

    iget v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->b:I

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    move-result v1

    iput v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->b:I

    iget v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->c:I

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    move-result v1

    iput v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->c:I

    iget v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->d:I

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    move-result v1

    iput v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->d:I

    iget-object v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->e:Landroidx/media/AudioAttributesCompat;

    const/4 v2, 0x5

    invoke-virtual {p0, v1, v2}, Lb2/c;->x(Lb2/e;I)Lb2/e;

    move-result-object p0

    check-cast p0, Landroidx/media/AudioAttributesCompat;

    iput-object p0, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->e:Landroidx/media/AudioAttributesCompat;

    return-object v0
.end method

.method public static write(Landroidx/media2/session/MediaController$PlaybackInfo;Lb2/c;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->a:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    iget v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->b:I

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    iget v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->c:I

    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    iget v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->d:I

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    iget-object p0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->e:Landroidx/media/AudioAttributesCompat;

    const/4 v0, 0x5

    invoke-virtual {p1, p0, v0}, Lb2/c;->R(Lb2/e;I)V

    return-void
.end method
