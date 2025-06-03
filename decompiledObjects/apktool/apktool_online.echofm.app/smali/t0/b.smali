.class public final Lt0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt0/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt0/b$b;
    }
.end annotation


# instance fields
.field public final a:Landroid/media/MediaCodec;

.field public final b:Lt0/i;

.field public final c:Lt0/n;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Lt0/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    new-instance p1, Lt0/i;

    invoke-direct {p1, p2}, Lt0/i;-><init>(Landroid/os/HandlerThread;)V

    iput-object p1, p0, Lt0/b;->b:Lt0/i;

    iput-object p3, p0, Lt0/b;->c:Lt0/n;

    const/4 p1, 0x0

    iput p1, p0, Lt0/b;->e:I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Lt0/n;Lt0/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lt0/b;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Lt0/n;)V

    return-void
.end method

.method public static synthetic p(Lt0/b;Lt0/m$d;Landroid/media/MediaCodec;JJ)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lt0/b;->x(Lt0/m$d;Landroid/media/MediaCodec;JJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic q(Lt0/b;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lt0/b;->w(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lt0/b;->u(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic s(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lt0/b;->t(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static t(I)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ExoPlayer:MediaCodecAsyncAdapter:"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lt0/b;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static u(I)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ExoPlayer:MediaCodecQueueingThread:"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lt0/b;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static v(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    if-ne p0, p1, :cond_0

    .line 8
    .line 9
    const-string p0, "Audio"

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 p1, 0x2

    .line 16
    if-ne p0, p1, :cond_1

    .line 17
    .line 18
    const-string p0, "Video"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string p1, "Unknown("

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, ")"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method


# virtual methods
.method public a(IILj0/c;JI)V
    .locals 7

    .line 1
    iget-object v0, p0, Lt0/b;->c:Lt0/n;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-wide v4, p4

    .line 7
    move v6, p6

    .line 8
    invoke-interface/range {v0 .. v6}, Lt0/n;->a(IILj0/c;JI)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(IIIJI)V
    .locals 7

    .line 1
    iget-object v0, p0, Lt0/b;->c:Lt0/n;

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
    invoke-interface/range {v0 .. v6}, Lt0/n;->b(IIIJI)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/b;->c:Lt0/n;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lt0/n;->c(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/b;->c:Lt0/n;

    .line 2
    .line 3
    invoke-interface {v0}, Lt0/n;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/b;->b:Lt0/i;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lt0/i;->d(Landroid/media/MediaCodec$BufferInfo;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
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
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

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
    iget-object v0, p0, Lt0/b;->c:Lt0/n;

    .line 2
    .line 3
    invoke-interface {v0}, Lt0/n;->flush()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lt0/b;->b:Lt0/i;

    .line 12
    .line 13
    invoke-virtual {v0}, Lt0/i;->e()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public g(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

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
    iget-object v0, p0, Lt0/b;->b:Lt0/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt0/i;->g()Landroid/media/MediaFormat;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public j(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public l(Lt0/m$c;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/b;->b:Lt0/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt0/i;->p(Lt0/m$c;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1
.end method

.method public m(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public n()I
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/b;->c:Lt0/n;

    .line 2
    .line 3
    invoke-interface {v0}, Lt0/n;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/b;->b:Lt0/i;

    .line 7
    .line 8
    invoke-virtual {v0}, Lt0/i;->c()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public o(Lt0/m$d;Landroid/os/Handler;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 2
    .line 3
    new-instance v1, Lt0/a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lt0/a;-><init>(Lt0/b;Lt0/m$d;)V

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
    .locals 5

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    :try_start_0
    iget v3, p0, Lt0/b;->e:I

    .line 7
    .line 8
    if-ne v3, v2, :cond_0

    .line 9
    .line 10
    iget-object v3, p0, Lt0/b;->c:Lt0/n;

    .line 11
    .line 12
    invoke-interface {v3}, Lt0/n;->shutdown()V

    .line 13
    .line 14
    .line 15
    iget-object v3, p0, Lt0/b;->b:Lt0/i;

    .line 16
    .line 17
    invoke-virtual {v3}, Lt0/i;->q()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v3

    .line 22
    goto :goto_4

    .line 23
    :cond_0
    :goto_0
    const/4 v3, 0x2

    .line 24
    iput v3, p0, Lt0/b;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    iget-boolean v3, p0, Lt0/b;->d:Z

    .line 27
    .line 28
    if-nez v3, :cond_2

    .line 29
    .line 30
    :try_start_1
    sget v3, Lg0/M;->a:I

    .line 31
    .line 32
    if-lt v3, v1, :cond_1

    .line 33
    .line 34
    if-ge v3, v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_1
    move-exception v0

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    :goto_1
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 47
    .line 48
    .line 49
    iput-boolean v2, p0, Lt0/b;->d:Z

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :goto_2
    iget-object v1, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 55
    .line 56
    .line 57
    iput-boolean v2, p0, Lt0/b;->d:Z

    .line 58
    .line 59
    throw v0

    .line 60
    :cond_2
    :goto_3
    return-void

    .line 61
    :goto_4
    iget-boolean v4, p0, Lt0/b;->d:Z

    .line 62
    .line 63
    if-nez v4, :cond_4

    .line 64
    .line 65
    :try_start_2
    sget v4, Lg0/M;->a:I

    .line 66
    .line 67
    if-lt v4, v1, :cond_3

    .line 68
    .line 69
    if-ge v4, v0, :cond_3

    .line 70
    .line 71
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 74
    .line 75
    .line 76
    goto :goto_5

    .line 77
    :catchall_2
    move-exception v0

    .line 78
    goto :goto_6

    .line 79
    :cond_3
    :goto_5
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 82
    .line 83
    .line 84
    iput-boolean v2, p0, Lt0/b;->d:Z

    .line 85
    .line 86
    goto :goto_7

    .line 87
    :goto_6
    iget-object v1, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 90
    .line 91
    .line 92
    iput-boolean v2, p0, Lt0/b;->d:Z

    .line 93
    .line 94
    throw v0

    .line 95
    :cond_4
    :goto_7
    throw v3
.end method

.method public final w(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/b;->b:Lt0/i;

    .line 2
    .line 3
    iget-object v1, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lt0/i;->h(Landroid/media/MediaCodec;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "configureCodec"

    .line 9
    .line 10
    invoke-static {v0}, Lg0/F;->a(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lg0/F;->b()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lt0/b;->c:Lt0/n;

    .line 22
    .line 23
    invoke-interface {p1}, Lt0/n;->start()V

    .line 24
    .line 25
    .line 26
    const-string p1, "startCodec"

    .line 27
    .line 28
    invoke-static {p1}, Lg0/F;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lt0/b;->a:Landroid/media/MediaCodec;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/media/MediaCodec;->start()V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lg0/F;->b()V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    iput p1, p0, Lt0/b;->e:I

    .line 41
    .line 42
    return-void
.end method

.method public final synthetic x(Lt0/m$d;Landroid/media/MediaCodec;JJ)V
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
