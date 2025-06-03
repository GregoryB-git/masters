.class public final Lv3/h1;
.super Lv3/a;
.source "SourceFile"


# instance fields
.field public final f:I

.field public final o:I

.field public final p:[I

.field public final q:[I

.field public final r:[Lv3/r1;

.field public final s:[Ljava/lang/Object;

.field public final t:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lz4/e0;)V
    .locals 5

    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Lv3/a;-><init>(ZLz4/e0;)V

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p2

    new-array v1, p2, [I

    iput-object v1, p0, Lv3/h1;->p:[I

    new-array v1, p2, [I

    iput-object v1, p0, Lv3/h1;->q:[I

    new-array v1, p2, [Lv3/r1;

    iput-object v1, p0, Lv3/h1;->r:[Lv3/r1;

    new-array p2, p2, [Ljava/lang/Object;

    iput-object p2, p0, Lv3/h1;->s:[Ljava/lang/Object;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lv3/h1;->t:Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move p2, v0

    move v1, p2

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv3/t0;

    iget-object v3, p0, Lv3/h1;->r:[Lv3/r1;

    invoke-interface {v2}, Lv3/t0;->b()Lv3/r1;

    move-result-object v4

    aput-object v4, v3, v1

    iget-object v3, p0, Lv3/h1;->q:[I

    aput v0, v3, v1

    iget-object v3, p0, Lv3/h1;->p:[I

    aput p2, v3, v1

    iget-object v3, p0, Lv3/h1;->r:[Lv3/r1;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Lv3/r1;->o()I

    move-result v3

    add-int/2addr v0, v3

    iget-object v3, p0, Lv3/h1;->r:[Lv3/r1;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Lv3/r1;->h()I

    move-result v3

    add-int/2addr p2, v3

    iget-object v3, p0, Lv3/h1;->s:[Ljava/lang/Object;

    invoke-interface {v2}, Lv3/t0;->a()Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v3, v1

    iget-object v2, p0, Lv3/h1;->t:Ljava/util/HashMap;

    iget-object v3, p0, Lv3/h1;->s:[Ljava/lang/Object;

    aget-object v3, v3, v1

    add-int/lit8 v4, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v4

    goto :goto_0

    :cond_0
    iput v0, p0, Lv3/h1;->f:I

    iput p2, p0, Lv3/h1;->o:I

    return-void
.end method


# virtual methods
.method public final h()I
    .locals 1

    iget v0, p0, Lv3/h1;->o:I

    return v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lv3/h1;->f:I

    return v0
.end method

.method public final q(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lv3/h1;->t:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final r(I)I
    .locals 2

    iget-object v0, p0, Lv3/h1;->p:[I

    add-int/lit8 p1, p1, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1}, Lv5/e0;->e([IIZZ)I

    move-result p1

    return p1
.end method

.method public final s(I)I
    .locals 2

    iget-object v0, p0, Lv3/h1;->q:[I

    add-int/lit8 p1, p1, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1}, Lv5/e0;->e([IIZZ)I

    move-result p1

    return p1
.end method

.method public final t(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv3/h1;->s:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final u(I)I
    .locals 1

    iget-object v0, p0, Lv3/h1;->p:[I

    aget p1, v0, p1

    return p1
.end method

.method public final v(I)I
    .locals 1

    iget-object v0, p0, Lv3/h1;->q:[I

    aget p1, v0, p1

    return p1
.end method

.method public final x(I)Lv3/r1;
    .locals 1

    iget-object v0, p0, Lv3/h1;->r:[Lv3/r1;

    aget-object p1, v0, p1

    return-object p1
.end method
