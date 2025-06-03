.class public final Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/x$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/HlsMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field public final a:Lq0/g;

.field public b:Lq0/h;

.field public c:Lr0/j;

.field public d:Lr0/k$a;

.field public e:Lx0/j;

.field public f:Lp0/A;

.field public g:LB0/m;

.field public h:Z

.field public i:I

.field public j:Z

.field public k:J

.field public l:J


# direct methods
.method public constructor <init>(Li0/g$a;)V
    .locals 1

    .line 1
    new-instance v0, Lq0/c;

    invoke-direct {v0, p1}, Lq0/c;-><init>(Li0/g$a;)V

    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;-><init>(Lq0/g;)V

    return-void
.end method

.method public constructor <init>(Lq0/g;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq0/g;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:Lq0/g;

    new-instance p1, Lp0/l;

    invoke-direct {p1}, Lp0/l;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f:Lp0/A;

    new-instance p1, Lr0/a;

    invoke-direct {p1}, Lr0/a;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:Lr0/j;

    sget-object p1, Lr0/c;->D:Lr0/k$a;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:Lr0/k$a;

    sget-object p1, Lq0/h;->a:Lq0/h;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:Lq0/h;

    new-instance p1, LB0/k;

    invoke-direct {p1}, LB0/k;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g:LB0/m;

    new-instance p1, Lx0/m;

    invoke-direct {p1}, Lx0/m;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:Lx0/j;

    const/4 p1, 0x1

    iput p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k:J

    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h:Z

    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b(Z)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    return-void
.end method


# virtual methods
.method public a(Ld0/u;)Landroidx/media3/exoplayer/hls/HlsMediaSource;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v1, v2, Ld0/u;->b:Ld0/u$h;

    .line 6
    .line 7
    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:Lr0/j;

    .line 11
    .line 12
    iget-object v3, v2, Ld0/u;->b:Ld0/u$h;

    .line 13
    .line 14
    iget-object v3, v3, Ld0/u$h;->d:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    new-instance v4, Lr0/e;

    .line 23
    .line 24
    invoke-direct {v4, v1, v3}, Lr0/e;-><init>(Lr0/j;Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    move-object v6, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v6, v1

    .line 30
    :goto_0
    new-instance v18, Landroidx/media3/exoplayer/hls/HlsMediaSource;

    .line 31
    .line 32
    move-object/from16 v1, v18

    .line 33
    .line 34
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:Lq0/g;

    .line 35
    .line 36
    iget-object v4, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:Lq0/h;

    .line 37
    .line 38
    iget-object v5, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:Lx0/j;

    .line 39
    .line 40
    iget-object v7, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f:Lp0/A;

    .line 41
    .line 42
    invoke-interface {v7, v2}, Lp0/A;->a(Ld0/u;)Lp0/x;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    iget-object v9, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g:LB0/m;

    .line 47
    .line 48
    move-object v8, v9

    .line 49
    iget-object v10, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:Lr0/k$a;

    .line 50
    .line 51
    iget-object v11, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:Lq0/g;

    .line 52
    .line 53
    invoke-interface {v10, v11, v9, v6}, Lr0/k$a;->a(Lq0/g;LB0/m;Lr0/j;)Lr0/k;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    iget-wide v10, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k:J

    .line 58
    .line 59
    iget-boolean v12, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h:Z

    .line 60
    .line 61
    iget v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i:I

    .line 62
    .line 63
    iget-boolean v14, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:Z

    .line 64
    .line 65
    move-object/from16 v19, v1

    .line 66
    .line 67
    iget-wide v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->l:J

    .line 68
    .line 69
    move-wide v15, v1

    .line 70
    const/16 v17, 0x0

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    move-object/from16 v2, p1

    .line 74
    .line 75
    move-object/from16 v1, v19

    .line 76
    .line 77
    invoke-direct/range {v1 .. v17}, Landroidx/media3/exoplayer/hls/HlsMediaSource;-><init>(Ld0/u;Lq0/g;Lq0/h;Lx0/j;LB0/f;Lp0/x;LB0/m;Lr0/k;JZIZJLandroidx/media3/exoplayer/hls/HlsMediaSource$a;)V

    .line 78
    .line 79
    .line 80
    return-object v18
.end method

.method public b(Z)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:Lq0/h;

    invoke-interface {v0, p1}, Lq0/h;->a(Z)Lq0/h;

    return-object p0
.end method
