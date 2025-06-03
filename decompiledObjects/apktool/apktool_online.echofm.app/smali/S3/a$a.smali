.class public LS3/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS3/a;->Y(IZ)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public o:I

.field public final synthetic p:I

.field public final synthetic q:Z

.field public final synthetic r:LS3/a;


# direct methods
.method public constructor <init>(LS3/a;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, LS3/a$a;->r:LS3/a;

    .line 2
    .line 3
    iput p2, p0, LS3/a$a;->p:I

    .line 4
    .line 5
    iput-boolean p3, p0, LS3/a$a;->q:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput p2, p0, LS3/a$a;->o:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public b()Ljava/util/Map$Entry;
    .locals 4

    .line 1
    iget-object v0, p0, LS3/a$a;->r:LS3/a;

    .line 2
    .line 3
    invoke-static {v0}, LS3/a;->M(LS3/a;)[Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, LS3/a$a;->o:I

    .line 8
    .line 9
    aget-object v0, v0, v1

    .line 10
    .line 11
    iget-object v1, p0, LS3/a$a;->r:LS3/a;

    .line 12
    .line 13
    invoke-static {v1}, LS3/a;->S(LS3/a;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, p0, LS3/a$a;->o:I

    .line 18
    .line 19
    aget-object v1, v1, v2

    .line 20
    .line 21
    iget-boolean v3, p0, LS3/a$a;->q:Z

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    add-int/lit8 v2, v2, -0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    :goto_0
    iput v2, p0, LS3/a$a;->o:I

    .line 31
    .line 32
    new-instance v2, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 33
    .line 34
    invoke-direct {v2, v0, v1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object v2
.end method

.method public hasNext()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, LS3/a$a;->q:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, LS3/a$a;->o:I

    .line 8
    .line 9
    if-ltz v0, :cond_1

    .line 10
    .line 11
    :goto_0
    move v1, v2

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget v0, p0, LS3/a$a;->o:I

    .line 14
    .line 15
    iget-object v3, p0, LS3/a$a;->r:LS3/a;

    .line 16
    .line 17
    invoke-static {v3}, LS3/a;->M(LS3/a;)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    array-length v3, v3

    .line 22
    if-ge v0, v3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    :goto_1
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LS3/a$a;->b()Ljava/util/Map$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Can\'t remove elements from ImmutableSortedMap"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
