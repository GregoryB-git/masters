.class public La0/d$c;
.super La0/d$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/d;->q(Ljava/lang/String;Landroid/os/Bundle;La0/d$f;Lb/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic f:Lb/b;

.field public final synthetic g:La0/d;


# direct methods
.method public constructor <init>(La0/d;Ljava/lang/Object;Lb/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$c;->g:La0/d;

    .line 2
    .line 3
    iput-object p3, p0, La0/d$c;->f:Lb/b;

    .line 4
    .line 5
    invoke-direct {p0, p2}, La0/d$l;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La0/d$c;->h(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La0/d$l;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v0, v0, 0x4

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    new-array v2, v1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 19
    .line 20
    invoke-interface {p1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, [Landroid/os/Parcelable;

    .line 25
    .line 26
    const-string v2, "search_results"

    .line 27
    .line 28
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, La0/d$c;->f:Lb/b;

    .line 32
    .line 33
    invoke-virtual {p1, v1, v0}, Lb/b;->b(ILandroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    :goto_0
    iget-object p1, p0, La0/d$c;->f:Lb/b;

    .line 38
    .line 39
    const/4 v0, -0x1

    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {p1, v0, v1}, Lb/b;->b(ILandroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
