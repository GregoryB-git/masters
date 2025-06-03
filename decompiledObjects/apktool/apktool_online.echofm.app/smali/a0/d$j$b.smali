.class public La0/d$j$b;
.super La0/d$i$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La0/d$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic q:La0/d$j;


# direct methods
.method public constructor <init>(La0/d$j;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$j$b;->q:La0/d$j;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, La0/d$i$b;-><init>(La0/d$i;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onLoadChildren(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-static {p3}, Landroid/support/v4/media/session/MediaSessionCompat;->a(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La0/d$j$b;->q:La0/d$j;

    .line 5
    .line 6
    iget-object v1, v0, La0/d$j;->f:La0/d;

    .line 7
    .line 8
    iget-object v2, v1, La0/d;->q:La0/d$f;

    .line 9
    .line 10
    iput-object v2, v1, La0/d;->t:La0/d$f;

    .line 11
    .line 12
    new-instance v1, La0/d$m;

    .line 13
    .line 14
    invoke-direct {v1, p2}, La0/d$m;-><init>(Landroid/service/media/MediaBrowserService$Result;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, v1, p3}, La0/d$j;->l(Ljava/lang/String;La0/d$m;Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, La0/d$j$b;->q:La0/d$j;

    .line 21
    .line 22
    iget-object p1, p1, La0/d$j;->f:La0/d;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    iput-object p2, p1, La0/d;->t:La0/d$f;

    .line 26
    .line 27
    return-void
.end method
