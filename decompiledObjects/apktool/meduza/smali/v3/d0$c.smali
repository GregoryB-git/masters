.class public final Lv3/d0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw5/i;
.implements Lx5/a;
.implements Lv3/g1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public a:Lw5/i;

.field public b:Lx5/a;

.field public c:Lw5/i;

.field public d:Lx5/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(J[F)V
    .locals 1

    iget-object v0, p0, Lv3/d0$c;->d:Lx5/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lx5/a;->a(J[F)V

    :cond_0
    iget-object v0, p0, Lv3/d0$c;->b:Lx5/a;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Lx5/a;->a(J[F)V

    :cond_1
    return-void
.end method

.method public final c(JJLv3/i0;Landroid/media/MediaFormat;)V
    .locals 8

    iget-object v0, p0, Lv3/d0$c;->c:Lw5/i;

    if-eqz v0, :cond_0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lw5/i;->c(JJLv3/i0;Landroid/media/MediaFormat;)V

    :cond_0
    iget-object v1, p0, Lv3/d0$c;->a:Lw5/i;

    if-eqz v1, :cond_1

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lw5/i;->c(JJLv3/i0;Landroid/media/MediaFormat;)V

    :cond_1
    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lv3/d0$c;->d:Lx5/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx5/a;->f()V

    :cond_0
    iget-object v0, p0, Lv3/d0$c;->b:Lx5/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lx5/a;->f()V

    :cond_1
    return-void
.end method

.method public final q(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_3

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x2710

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p2, Lx5/j;

    if-nez p2, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lv3/d0$c;->c:Lw5/i;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lx5/j;->getVideoFrameMetadataListener()Lw5/i;

    move-result-object p1

    iput-object p1, p0, Lv3/d0$c;->c:Lw5/i;

    invoke-virtual {p2}, Lx5/j;->getCameraMotionListener()Lx5/a;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lv3/d0$c;->d:Lx5/a;

    goto :goto_1

    :cond_2
    check-cast p2, Lx5/a;

    iput-object p2, p0, Lv3/d0$c;->b:Lx5/a;

    goto :goto_1

    :cond_3
    check-cast p2, Lw5/i;

    iput-object p2, p0, Lv3/d0$c;->a:Lw5/i;

    :goto_1
    return-void
.end method
