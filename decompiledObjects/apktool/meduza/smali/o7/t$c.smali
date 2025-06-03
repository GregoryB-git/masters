.class public final Lo7/t$c;
.super Lo7/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo7/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo7/t<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient c:I

.field public final transient d:I

.field public final synthetic e:Lo7/t;


# direct methods
.method public constructor <init>(Lo7/t;II)V
    .locals 0

    iput-object p1, p0, Lo7/t$c;->e:Lo7/t;

    invoke-direct {p0}, Lo7/t;-><init>()V

    iput p2, p0, Lo7/t$c;->c:I

    iput p3, p0, Lo7/t$c;->d:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lo7/t$c;->d:I

    invoke-static {p1, v0}, Lx6/b;->v(II)V

    iget-object v0, p0, Lo7/t$c;->e:Lo7/t;

    iget v1, p0, Lo7/t$c;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo7/t$c;->e:Lo7/t;

    invoke-virtual {v0}, Lo7/r;->i()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo7/t;->r(I)Lo7/t$b;

    move-result-object v0

    return-object v0
.end method

.method public final k()I
    .locals 2

    iget-object v0, p0, Lo7/t$c;->e:Lo7/t;

    invoke-virtual {v0}, Lo7/r;->l()I

    move-result v0

    iget v1, p0, Lo7/t$c;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lo7/t$c;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final l()I
    .locals 2

    iget-object v0, p0, Lo7/t$c;->e:Lo7/t;

    invoke-virtual {v0}, Lo7/r;->l()I

    move-result v0

    iget v1, p0, Lo7/t$c;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lo7/t;->r(I)Lo7/t$b;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-virtual {p0, p1}, Lo7/t;->r(I)Lo7/t$b;

    move-result-object p1

    return-object p1
.end method

.method public final m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lo7/t$c;->d:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lo7/t$c;->x(II)Lo7/t;

    move-result-object p1

    return-object p1
.end method

.method public final x(II)Lo7/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lo7/t<",
            "TE;>;"
        }
    .end annotation

    iget v0, p0, Lo7/t$c;->d:I

    invoke-static {p1, p2, v0}, Lx6/b;->E(III)V

    iget-object v0, p0, Lo7/t$c;->e:Lo7/t;

    iget v1, p0, Lo7/t$c;->c:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lo7/t;->x(II)Lo7/t;

    move-result-object p1

    return-object p1
.end method
