.class public final Lt0/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt0/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt0/K$b;
    }
.end annotation


# instance fields
.field public final a:Landroid/media/MediaCodec;

.field public b:[Ljava/nio/ByteBuffer;

.field public c:[Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Landroid/media/MediaCodec;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    sget v0, Lg0/M;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lt0/K;->b:[Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lt0/K;->c:[Ljava/nio/ByteBuffer;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Landroid/media/MediaCodec;Lt0/K$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lt0/K;-><init>(Landroid/media/MediaCodec;)V

    return-void
.end method

.method public static synthetic p(Lt0/K;Lt0/m$d;Landroid/media/MediaCodec;JJ)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lt0/K;->q(Lt0/m$d;Landroid/media/MediaCodec;JJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic q(Lt0/m$d;Landroid/media/MediaCodec;JJ)V
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    move-object v1, p0

    .line 3
    move-wide v2, p3

    .line 4
    move-wide v4, p5

    .line 5
    invoke-interface/range {v0 .. v5}, Lt0/m$d;->a(Lt0/m;JJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(IILj0/c;JI)V
    .locals 7

    .line 1
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {p3}, Lj0/c;->a()Landroid/media/MediaCodec$CryptoInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    move v1, p1

    .line 8
    move v2, p2

    .line 9
    move-wide v4, p4

    .line 10
    move v6, p6

    .line 11
    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public b(IIIJI)V
    .locals 7

    .line 1
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move-wide v4, p4

    .line 7
    move v6, p6

    .line 8
    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 4

    .line 1
    :cond_0
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1, v2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x3

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    sget v2, Lg0/M;->a:I

    .line 13
    .line 14
    const/16 v3, 0x15

    .line 15
    .line 16
    if-ge v2, v3, :cond_1

    .line 17
    .line 18
    iget-object v2, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, p0, Lt0/K;->c:[Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    :cond_1
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public f(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h()Landroid/media/MediaFormat;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i(I)Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    sget v0, Lg0/M;->a:I

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Lt0/K;->b:[Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, [Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    aget-object p1, v0, p1

    .line 23
    .line 24
    return-object p1
.end method

.method public j(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(I)Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    sget v0, Lg0/M;->a:I

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Lt0/K;->c:[Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, [Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    aget-object p1, v0, p1

    .line 23
    .line 24
    return-object p1
.end method

.method public synthetic l(Lt0/m$c;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lt0/l;->a(Lt0/m;Lt0/m$c;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public m(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public n()I
    .locals 3

    .line 1
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public o(Lt0/m$d;Landroid/os/Handler;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    new-instance v1, Lt0/J;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lt0/J;-><init>(Lt0/K;Lt0/m$d;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public release()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lt0/K;->b:[Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    iput-object v0, p0, Lt0/K;->c:[Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    :try_start_0
    sget v0, Lg0/M;->a:I

    .line 7
    .line 8
    const/16 v1, 0x1e

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    const/16 v1, 0x21

    .line 13
    .line 14
    if-ge v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    iget-object v0, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :goto_1
    iget-object v1, p0, Lt0/K;->a:Landroid/media/MediaCodec;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 33
    .line 34
    .line 35
    throw v0
.end method
