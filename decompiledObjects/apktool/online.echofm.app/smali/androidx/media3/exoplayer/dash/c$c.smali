.class public final Landroidx/media3/exoplayer/dash/c$c;
.super Ly0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final e:Landroidx/media3/exoplayer/dash/c$b;

.field public final f:J


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/dash/c$b;JJJ)V
    .locals 0

    invoke-direct {p0, p2, p3, p4, p5}, Ly0/b;-><init>(JJ)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/c$c;->e:Landroidx/media3/exoplayer/dash/c$b;

    iput-wide p6, p0, Landroidx/media3/exoplayer/dash/c$c;->f:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 3

    .line 1
    invoke-virtual {p0}, Ly0/b;->c()V

    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c$c;->e:Landroidx/media3/exoplayer/dash/c$b;

    invoke-virtual {p0}, Ly0/b;->d()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/dash/c$b;->i(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()J
    .locals 3

    .line 1
    invoke-virtual {p0}, Ly0/b;->c()V

    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c$c;->e:Landroidx/media3/exoplayer/dash/c$b;

    invoke-virtual {p0}, Ly0/b;->d()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/dash/c$b;->k(J)J

    move-result-wide v0

    return-wide v0
.end method
