.class public final Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field public final a:Le5/h;

.field public b:Le5/d;

.field public c:Lf5/a;

.field public d:Lw3/v;

.field public e:Lz4/i;

.field public f:La4/i;

.field public g:Lt5/u;

.field public h:Z

.field public i:I

.field public j:J


# direct methods
.method public constructor <init>(Lt5/k$a;)V
    .locals 2

    new-instance v0, Le5/c;

    invoke-direct {v0, p1}, Le5/c;-><init>(Lt5/k$a;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a:Le5/h;

    new-instance p1, La4/c;

    invoke-direct {p1}, La4/c;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->f:La4/i;

    new-instance p1, Lf5/a;

    invoke-direct {p1}, Lf5/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->c:Lf5/a;

    sget-object p1, Lf5/b;->w:Lw3/v;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->d:Lw3/v;

    sget-object p1, Le5/i;->a:Le5/d;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->b:Le5/d;

    new-instance p1, Lt5/u;

    invoke-direct {p1}, Lt5/u;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->g:Lt5/u;

    new-instance p1, Lz4/i;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lz4/i;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->e:Lz4/i;

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->i:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->j:J

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->h:Z

    return-void
.end method


# virtual methods
.method public final a(Lv3/o0;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;
    .locals 14

    .line 1
    iget-object v0, p1, Lv3/o0;->b:Lv3/o0$g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->c:Lf5/a;

    .line 7
    .line 8
    iget-object v1, p1, Lv3/o0;->b:Lv3/o0$g;

    .line 9
    .line 10
    iget-object v1, v1, Lv3/o0$f;->d:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    new-instance v2, Lf5/c;

    .line 19
    .line 20
    invoke-direct {v2, v0, v1}, Lf5/c;-><init>(Lf5/a;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    move-object v0, v2

    .line 24
    :cond_0
    new-instance v13, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    .line 25
    .line 26
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a:Le5/h;

    .line 27
    .line 28
    iget-object v4, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->b:Le5/d;

    .line 29
    .line 30
    iget-object v5, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->e:Lz4/i;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->f:La4/i;

    .line 33
    .line 34
    invoke-interface {v1, p1}, La4/i;->a(Lv3/o0;)La4/h;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget-object v7, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->g:Lt5/u;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->d:Lw3/v;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a:Le5/h;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v8, Lf5/b;

    .line 48
    .line 49
    invoke-direct {v8, v2, v7, v0}, Lf5/b;-><init>(Le5/h;Lt5/u;Lf5/i;)V

    .line 50
    .line 51
    .line 52
    iget-wide v9, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->j:J

    .line 53
    .line 54
    iget-boolean v11, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->h:Z

    .line 55
    .line 56
    iget v12, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->i:I

    .line 57
    .line 58
    move-object v1, v13

    .line 59
    move-object v2, p1

    .line 60
    invoke-direct/range {v1 .. v12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;-><init>(Lv3/o0;Le5/h;Le5/d;Lz4/i;La4/h;Lt5/u;Lf5/b;JZI)V

    .line 61
    .line 62
    .line 63
    return-object v13
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
