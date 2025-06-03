.class public La0/d$i$b;
.super La0/d$h$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La0/d$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic p:La0/d$i;


# direct methods
.method public constructor <init>(La0/d$i;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$i$b;->p:La0/d$i;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, La0/d$h$d;-><init>(La0/d$h;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onLoadItem(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .locals 2

    .line 1
    iget-object v0, p0, La0/d$i$b;->p:La0/d$i;

    .line 2
    .line 3
    new-instance v1, La0/d$m;

    .line 4
    .line 5
    invoke-direct {v1, p2}, La0/d$m;-><init>(Landroid/service/media/MediaBrowserService$Result;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, v1}, La0/d$i;->k(Ljava/lang/String;La0/d$m;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
