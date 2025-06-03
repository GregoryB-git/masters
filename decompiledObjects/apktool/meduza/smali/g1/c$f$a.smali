.class public Lg1/c$f$a;
.super Lg1/c$e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/c$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic b:Lg1/c$f;


# direct methods
.method public constructor <init>(Lg1/c$f;Lg1/c;)V
    .locals 0

    iput-object p1, p0, Lg1/c$f$a;->b:Lg1/c$f;

    invoke-direct {p0, p1, p2}, Lg1/c$e$a;-><init>(Lg1/c$e;Lg1/c;)V

    return-void
.end method


# virtual methods
.method public final onLoadItem(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/service/media/MediaBrowserService$Result<",
            "Landroid/media/browse/MediaBrowser$MediaItem;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lg1/c$f$a;->b:Lg1/c$f;

    new-instance v1, Lg1/c$j;

    invoke-direct {v1, p2}, Lg1/c$j;-><init>(Landroid/service/media/MediaBrowserService$Result;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lg1/i;

    invoke-direct {p2, p1, v1}, Lg1/i;-><init>(Ljava/lang/Object;Lg1/c$j;)V

    iget-object v1, v0, Lg1/c$f;->e:Lg1/c;

    iget-object v2, v1, Lg1/c;->b:Lg1/c$c;

    invoke-virtual {v1, p1, p2}, Lg1/c;->e(Ljava/lang/String;Lg1/c$i;)V

    iget-object p1, v0, Lg1/c$f;->e:Lg1/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
