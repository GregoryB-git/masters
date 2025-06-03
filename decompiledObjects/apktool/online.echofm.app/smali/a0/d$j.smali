.class public La0/d$j;
.super La0/d$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La0/d$j$b;
    }
.end annotation


# instance fields
.field public final synthetic f:La0/d;


# direct methods
.method public constructor <init>(La0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$j;->f:La0/d;

    .line 2
    .line 3
    invoke-direct {p0, p1}, La0/d$i;-><init>(La0/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    new-instance v0, La0/d$j$b;

    .line 2
    .line 3
    iget-object v1, p0, La0/d$j;->f:La0/d;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, La0/d$j$b;-><init>(La0/d$j;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, La0/d$h;->b:Landroid/service/media/MediaBrowserService;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService;->onCreate()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public g(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, La0/d$h;->b:Landroid/service/media/MediaBrowserService;

    .line 4
    .line 5
    invoke-static {v0, p1, p2}, La0/e;->a(Landroid/service/media/MediaBrowserService;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-super {p0, p1, p2}, La0/d$h;->g(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    :goto_0
    return-void
.end method

.method public l(Ljava/lang/String;La0/d$m;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    new-instance v0, La0/d$j$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, La0/d$j$a;-><init>(La0/d$j;Ljava/lang/Object;La0/d$m;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, La0/d$j;->f:La0/d;

    .line 7
    .line 8
    iget-object v1, p2, La0/d;->q:La0/d$f;

    .line 9
    .line 10
    iput-object v1, p2, La0/d;->t:La0/d$f;

    .line 11
    .line 12
    invoke-virtual {p2, p1, v0, p3}, La0/d;->i(Ljava/lang/String;La0/d$l;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, La0/d$j;->f:La0/d;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    iput-object p2, p1, La0/d;->t:La0/d$f;

    .line 19
    .line 20
    return-void
.end method
