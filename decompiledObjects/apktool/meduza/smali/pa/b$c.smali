.class public final Lpa/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/f1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpa/b;->i(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lpa/b;


# direct methods
.method public constructor <init>(Lpa/b;)V
    .locals 0

    iput-object p1, p0, Lpa/b$c;->a:Lpa/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic D(Z)V
    .locals 0

    return-void
.end method

.method public final synthetic F(Lv3/f1$a;)V
    .locals 0

    return-void
.end method

.method public final synthetic G(ILv3/f1$d;Lv3/f1$d;)V
    .locals 0

    return-void
.end method

.method public final synthetic I(Z)V
    .locals 0

    return-void
.end method

.method public final synthetic K(IZ)V
    .locals 0

    return-void
.end method

.method public final synthetic L(F)V
    .locals 0

    return-void
.end method

.method public final N(I)V
    .locals 6

    .line 1
    iget-object p1, p0, Lpa/b$c;->a:Lpa/b;

    .line 2
    .line 3
    iget-object p1, p1, Lpa/b;->n:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 4
    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    new-instance v0, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "android.media.metadata.DURATION"

    .line 13
    .line 14
    iget-object v2, p0, Lpa/b$c;->a:Lpa/b;

    .line 15
    .line 16
    iget-object v2, v2, Lpa/b;->c:Lv3/d0;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Lv3/d0;->getDuration()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    :goto_0
    sget-object v4, Landroid/support/v4/media/MediaMetadataCompat;->d:Lr/b;

    .line 28
    .line 29
    invoke-virtual {v4, v1}, Lr/h;->containsKey(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-virtual {v4, v1, v5}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    const-string v0, "The android.media.metadata.DURATION key cannot be used to put a long"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    :goto_1
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Landroid/support/v4/media/MediaMetadataCompat;

    .line 61
    .line 62
    invoke-direct {v1, v0}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Bundle;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->g(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    return-void
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

.method public final synthetic R(Lv3/p0;)V
    .locals 0

    return-void
.end method

.method public final synthetic T(Z)V
    .locals 0

    return-void
.end method

.method public final synthetic W(IZ)V
    .locals 0

    return-void
.end method

.method public final synthetic X(Lv3/n;)V
    .locals 0

    return-void
.end method

.method public final synthetic Y(Lv3/r1;I)V
    .locals 0

    return-void
.end method

.method public final synthetic Z(Lv3/s1;)V
    .locals 0

    return-void
.end method

.method public final synthetic a0(Lv3/n;)V
    .locals 0

    return-void
.end method

.method public final synthetic b(Lw5/o;)V
    .locals 0

    return-void
.end method

.method public final synthetic b0(IZ)V
    .locals 0

    return-void
.end method

.method public final synthetic c0(Lv3/e1;)V
    .locals 0

    return-void
.end method

.method public final synthetic d(I)V
    .locals 0

    return-void
.end method

.method public final synthetic d0(Lx3/d;)V
    .locals 0

    return-void
.end method

.method public final synthetic e0(Lv3/f1;Lv3/f1$b;)V
    .locals 0

    return-void
.end method

.method public final synthetic f()V
    .locals 0

    return-void
.end method

.method public final synthetic j(Lh5/c;)V
    .locals 0

    return-void
.end method

.method public final synthetic k0(Lv3/o0;I)V
    .locals 0

    return-void
.end method

.method public final synthetic l0(Lv3/m;)V
    .locals 0

    return-void
.end method

.method public final synthetic m()V
    .locals 0

    return-void
.end method

.method public final synthetic m0(II)V
    .locals 0

    return-void
.end method

.method public final synthetic o(Z)V
    .locals 0

    return-void
.end method

.method public final synthetic p0(Z)V
    .locals 0

    return-void
.end method

.method public final synthetic q(I)V
    .locals 0

    return-void
.end method

.method public final synthetic r(Ljava/util/List;)V
    .locals 0

    return-void
.end method

.method public final synthetic w(Lp4/a;)V
    .locals 0

    return-void
.end method

.method public final synthetic x(I)V
    .locals 0

    return-void
.end method
