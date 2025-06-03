.class public LX2/v$e;
.super LX2/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final transient q:I

.field public final transient r:I

.field public final synthetic s:LX2/v;


# direct methods
.method public constructor <init>(LX2/v;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LX2/v$e;->s:LX2/v;

    .line 2
    .line 3
    invoke-direct {p0}, LX2/v;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, LX2/v$e;->q:I

    .line 7
    .line 8
    iput p3, p0, LX2/v$e;->r:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public f()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LX2/v$e;->s:LX2/v;

    .line 2
    .line 3
    invoke-virtual {v0}, LX2/t;->f()[Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()I
    .locals 2

    .line 1
    iget-object v0, p0, LX2/v$e;->s:LX2/v;

    .line 2
    .line 3
    invoke-virtual {v0}, LX2/t;->i()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, LX2/v$e;->q:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    iget v1, p0, LX2/v$e;->r:I

    .line 11
    .line 12
    add-int/2addr v0, v1

    .line 13
    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LX2/v$e;->r:I

    .line 2
    .line 3
    invoke-static {p1, v0}, LW2/m;->h(II)I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX2/v$e;->s:LX2/v;

    .line 7
    .line 8
    iget v1, p0, LX2/v$e;->q:I

    .line 9
    .line 10
    add-int/2addr p1, v1

    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public h0(II)LX2/v;
    .locals 2

    .line 1
    iget v0, p0, LX2/v$e;->r:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, LW2/m;->n(III)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX2/v$e;->s:LX2/v;

    .line 7
    .line 8
    iget v1, p0, LX2/v$e;->q:I

    .line 9
    .line 10
    add-int/2addr p1, v1

    .line 11
    add-int/2addr p2, v1

    .line 12
    invoke-virtual {v0, p1, p2}, LX2/v;->h0(II)LX2/v;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public i()I
    .locals 2

    .line 1
    iget-object v0, p0, LX2/v$e;->s:LX2/v;

    .line 2
    .line 3
    invoke-virtual {v0}, LX2/t;->i()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, LX2/v$e;->q:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-super {p0}, LX2/v;->q()LX2/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public k()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-super {p0}, LX2/v;->W()LX2/h0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 2
    invoke-super {p0, p1}, LX2/v;->X(I)LX2/h0;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, LX2/v$e;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LX2/v$e;->h0(II)LX2/v;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, LX2/v;->writeReplace()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
