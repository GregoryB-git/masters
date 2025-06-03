.class public final Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/x$a;


# instance fields
.field public final a:Lw0/b;

.field public final b:Li0/g$a;

.field public c:Lx0/j;

.field public d:Lp0/A;

.field public e:LB0/m;

.field public f:J


# direct methods
.method public constructor <init>(Li0/g$a;)V
    .locals 1

    .line 1
    new-instance v0, Lw0/a;

    invoke-direct {v0, p1}, Lw0/a;-><init>(Li0/g$a;)V

    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;-><init>(Lw0/b;Li0/g$a;)V

    return-void
.end method

.method public constructor <init>(Lw0/b;Li0/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw0/b;

    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->a:Lw0/b;

    iput-object p2, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->b:Li0/g$a;

    new-instance p1, Lp0/l;

    invoke-direct {p1}, Lp0/l;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->d:Lp0/A;

    new-instance p1, LB0/k;

    invoke-direct {p1}, LB0/k;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->e:LB0/m;

    const-wide/16 p1, 0x7530

    iput-wide p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->f:J

    new-instance p1, Lx0/m;

    invoke-direct {p1}, Lx0/m;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->c:Lx0/j;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->a(Z)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;

    return-void
.end method


# virtual methods
.method public a(Z)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->a:Lw0/b;

    invoke-interface {v0, p1}, Lw0/b;->a(Z)Lw0/b;

    return-object p0
.end method
