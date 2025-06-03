.class public final Lk0/f0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/p;
.implements LE0/a;
.implements Lk0/V0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public o:LD0/p;

.field public p:LE0/a;

.field public q:LD0/p;

.field public r:LE0/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk0/f0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk0/f0$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J[F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/f0$e;->r:LE0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, LE0/a;->a(J[F)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lk0/f0$e;->p:LE0/a;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {v0, p1, p2, p3}, LE0/a;->a(J[F)V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/f0$e;->r:LE0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LE0/a;->h()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lk0/f0$e;->p:LE0/a;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {v0}, LE0/a;->h()V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method

.method public k(JJLd0/q;Landroid/media/MediaFormat;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lk0/f0$e;->q:LD0/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-wide v1, p1

    .line 6
    move-wide v3, p3

    .line 7
    move-object v5, p5

    .line 8
    move-object v6, p6

    .line 9
    invoke-interface/range {v0 .. v6}, LD0/p;->k(JJLd0/q;Landroid/media/MediaFormat;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v1, p0, Lk0/f0$e;->o:LD0/p;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    move-wide v2, p1

    .line 17
    move-wide v4, p3

    .line 18
    move-object v6, p5

    .line 19
    move-object v7, p6

    .line 20
    invoke-interface/range {v1 .. v7}, LD0/p;->k(JJLd0/q;Landroid/media/MediaFormat;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public t(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    if-eq p1, v0, :cond_2

    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/16 v0, 0x2710

    .line 9
    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p2}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lk0/f0$e;->q:LD0/p;

    .line 18
    .line 19
    iput-object p1, p0, Lk0/f0$e;->r:LE0/a;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    check-cast p2, LE0/a;

    .line 23
    .line 24
    iput-object p2, p0, Lk0/f0$e;->p:LE0/a;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    check-cast p2, LD0/p;

    .line 28
    .line 29
    iput-object p2, p0, Lk0/f0$e;->o:LD0/p;

    .line 30
    .line 31
    :goto_0
    return-void
.end method
