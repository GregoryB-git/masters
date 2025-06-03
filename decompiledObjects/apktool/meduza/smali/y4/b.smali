.class public final Ly4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/f0$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ly4/a<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Lt5/f0$a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lt5/f0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt5/f0$a<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly4/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt5/f0$a;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt5/f0$a<",
            "+TT;>;",
            "Ljava/util/List<",
            "Ly4/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/b;->a:Lt5/f0$a;

    iput-object p2, p0, Ly4/b;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Landroid/net/Uri;Lt5/m;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly4/b;->a:Lt5/f0$a;

    invoke-interface {v0, p1, p2}, Lt5/f0$a;->a(Landroid/net/Uri;Lt5/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly4/a;

    iget-object p2, p0, Ly4/b;->b:Ljava/util/List;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Ly4/b;->b:Ljava/util/List;

    invoke-interface {p1, p2}, Ly4/a;->a(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly4/a;

    :cond_1
    :goto_0
    return-object p1
.end method
