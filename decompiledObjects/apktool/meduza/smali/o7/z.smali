.class public final Lo7/z;
.super Lo7/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo7/b<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic c:Ljava/util/Iterator;

.field public final synthetic d:Ln7/j;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Ln7/j;)V
    .locals 0

    iput-object p1, p0, Lo7/z;->c:Ljava/util/Iterator;

    iput-object p2, p0, Lo7/z;->d:Ln7/j;

    invoke-direct {p0}, Lo7/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, Lo7/z;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo7/z;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lo7/z;->d:Ln7/j;

    invoke-interface {v1, v0}, Ln7/j;->apply(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    const/4 v0, 0x3

    iput v0, p0, Lo7/b;->a:I

    const/4 v0, 0x0

    return-object v0
.end method
