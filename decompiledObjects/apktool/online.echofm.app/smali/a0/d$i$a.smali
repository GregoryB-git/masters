.class public La0/d$i$a;
.super La0/d$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/d$i;->k(Ljava/lang/String;La0/d$m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic f:La0/d$m;

.field public final synthetic g:La0/d$i;


# direct methods
.method public constructor <init>(La0/d$i;Ljava/lang/Object;La0/d$m;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$i$a;->g:La0/d$i;

    .line 2
    .line 3
    iput-object p3, p0, La0/d$i$a;->f:La0/d$m;

    .line 4
    .line 5
    invoke-direct {p0, p2}, La0/d$l;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, La0/d$i$a;->f:La0/d$m;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/d$m;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La0/d$i$a;->h(Landroid/support/v4/media/MediaBrowserCompat$MediaItem;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h(Landroid/support/v4/media/MediaBrowserCompat$MediaItem;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, La0/d$i$a;->f:La0/d$m;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-virtual {p1, v0}, La0/d$m;->c(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->writeToParcel(Landroid/os/Parcel;I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, La0/d$i$a;->f:La0/d$m;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :goto_1
    return-void
.end method
