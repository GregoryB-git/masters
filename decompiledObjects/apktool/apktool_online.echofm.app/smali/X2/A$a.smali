.class public final LX2/A$a;
.super LX2/y$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final f:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LX2/y$a;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LW2/m;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/util/Comparator;

    .line 9
    .line 10
    iput-object p1, p0, LX2/A$a;->f:Ljava/util/Comparator;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)LX2/t$b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LX2/A$a;->m(Ljava/lang/Object;)LX2/A$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Object;)LX2/y$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LX2/A$a;->m(Ljava/lang/Object;)LX2/A$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic i([Ljava/lang/Object;)LX2/y$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LX2/A$a;->n([Ljava/lang/Object;)LX2/A$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Iterable;)LX2/y$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LX2/A$a;->o(Ljava/lang/Iterable;)LX2/A$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic l()LX2/y;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/A$a;->p()LX2/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public m(Ljava/lang/Object;)LX2/A$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LX2/y$a;->h(Ljava/lang/Object;)LX2/y$a;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public varargs n([Ljava/lang/Object;)LX2/A$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LX2/y$a;->i([Ljava/lang/Object;)LX2/y$a;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public o(Ljava/lang/Iterable;)LX2/A$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LX2/y$a;->j(Ljava/lang/Iterable;)LX2/y$a;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public p()LX2/A;
    .locals 3

    .line 1
    iget-object v0, p0, LX2/t$a;->a:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LX2/A$a;->f:Ljava/util/Comparator;

    .line 4
    .line 5
    iget v2, p0, LX2/t$a;->b:I

    .line 6
    .line 7
    invoke-static {v1, v2, v0}, LX2/A;->e0(Ljava/util/Comparator;I[Ljava/lang/Object;)LX2/A;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, LX2/t$a;->b:I

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, p0, LX2/t$a;->c:Z

    .line 19
    .line 20
    return-object v0
.end method
