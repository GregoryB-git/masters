.class public abstract LX2/t$a;
.super LX2/t$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field public a:[Ljava/lang/Object;

.field public b:I

.field public c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, LX2/t$b;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "initialCapacity"

    .line 5
    .line 6
    invoke-static {p1, v0}, LX2/i;->b(ILjava/lang/String;)I

    .line 7
    .line 8
    .line 9
    new-array p1, p1, [Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, LX2/t$a;->a:[Ljava/lang/Object;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, LX2/t$a;->b:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Iterable;)LX2/t$b;
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/util/Collection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ljava/util/Collection;

    .line 7
    .line 8
    iget v1, p0, LX2/t$a;->b:I

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    add-int/2addr v1, v2

    .line 15
    invoke-virtual {p0, v1}, LX2/t$a;->g(I)V

    .line 16
    .line 17
    .line 18
    instance-of v1, v0, LX2/t;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast v0, LX2/t;

    .line 23
    .line 24
    iget-object p1, p0, LX2/t$a;->a:[Ljava/lang/Object;

    .line 25
    .line 26
    iget v1, p0, LX2/t$a;->b:I

    .line 27
    .line 28
    invoke-virtual {v0, p1, v1}, LX2/t;->d([Ljava/lang/Object;I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p0, LX2/t$a;->b:I

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    invoke-super {p0, p1}, LX2/t$b;->b(Ljava/lang/Iterable;)LX2/t$b;

    .line 36
    .line 37
    .line 38
    return-object p0
.end method

.method public d(Ljava/lang/Object;)LX2/t$a;
    .locals 3

    .line 1
    invoke-static {p1}, LW2/m;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LX2/t$a;->b:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, LX2/t$a;->g(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LX2/t$a;->a:[Ljava/lang/Object;

    .line 12
    .line 13
    iget v1, p0, LX2/t$a;->b:I

    .line 14
    .line 15
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    iput v2, p0, LX2/t$a;->b:I

    .line 18
    .line 19
    aput-object p1, v0, v1

    .line 20
    .line 21
    return-object p0
.end method

.method public varargs e([Ljava/lang/Object;)LX2/t$b;
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    invoke-virtual {p0, p1, v0}, LX2/t$a;->f([Ljava/lang/Object;I)V

    .line 3
    .line 4
    .line 5
    return-object p0
.end method

.method public final f([Ljava/lang/Object;I)V
    .locals 3

    .line 1
    invoke-static {p1, p2}, LX2/O;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LX2/t$a;->b:I

    .line 5
    .line 6
    add-int/2addr v0, p2

    .line 7
    invoke-virtual {p0, v0}, LX2/t$a;->g(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LX2/t$a;->a:[Ljava/lang/Object;

    .line 11
    .line 12
    iget v1, p0, LX2/t$a;->b:I

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {p1, v2, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, LX2/t$a;->b:I

    .line 19
    .line 20
    add-int/2addr p1, p2

    .line 21
    iput p1, p0, LX2/t$a;->b:I

    .line 22
    .line 23
    return-void
.end method

.method public final g(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LX2/t$a;->a:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ge v1, p1, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    invoke-static {v1, p1}, LX2/t$b;->c(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, LX2/t$a;->a:[Ljava/lang/Object;

    .line 17
    .line 18
    :goto_0
    iput-boolean v2, p0, LX2/t$a;->c:Z

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-boolean p1, p0, LX2/t$a;->c:Z

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, [Ljava/lang/Object;

    .line 30
    .line 31
    iput-object p1, p0, LX2/t$a;->a:[Ljava/lang/Object;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    :goto_1
    return-void
.end method
