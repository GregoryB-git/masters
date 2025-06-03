.class public final Lf5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/i;


# instance fields
.field public final a:Lf5/i;

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
.method public constructor <init>(Lf5/a;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/c;->a:Lf5/i;

    iput-object p2, p0, Lf5/c;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lf5/f;Lf5/e;)Lt5/f0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf5/f;",
            "Lf5/e;",
            ")",
            "Lt5/f0$a<",
            "Lf5/g;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly4/b;

    iget-object v1, p0, Lf5/c;->a:Lf5/i;

    invoke-interface {v1, p1, p2}, Lf5/i;->a(Lf5/f;Lf5/e;)Lt5/f0$a;

    move-result-object p1

    iget-object p2, p0, Lf5/c;->b:Ljava/util/List;

    invoke-direct {v0, p1, p2}, Ly4/b;-><init>(Lt5/f0$a;Ljava/util/List;)V

    return-object v0
.end method

.method public final b()Lt5/f0$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt5/f0$a<",
            "Lf5/g;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly4/b;

    iget-object v1, p0, Lf5/c;->a:Lf5/i;

    invoke-interface {v1}, Lf5/i;->b()Lt5/f0$a;

    move-result-object v1

    iget-object v2, p0, Lf5/c;->b:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Ly4/b;-><init>(Lt5/f0$a;Ljava/util/List;)V

    return-object v0
.end method
