.class public final Landroidx/datastore/preferences/protobuf/h$c;
.super Landroidx/datastore/preferences/protobuf/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final f:Ljava/io/InputStream;

.field public final g:[B

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/datastore/preferences/protobuf/h;-><init>(Landroidx/datastore/preferences/protobuf/h$a;)V

    const v0, 0x7fffffff

    iput v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->m:I

    const-string v0, "input"

    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/y;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/h$c;->f:Ljava/io/InputStream;

    new-array p1, p2, [B

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    const/4 p1, 0x0

    iput p1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    iput p1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iput p1, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/InputStream;ILandroidx/datastore/preferences/protobuf/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/h$c;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method private P()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->i:I

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    add-int/2addr v1, v0

    iget v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->m:I

    if-le v1, v2, :cond_0

    sub-int/2addr v1, v2

    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->i:I

    sub-int/2addr v0, v1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->i:I

    :goto_0
    return-void
.end method

.method private U()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    sub-int/2addr v0, v1

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/h$c;->V()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/h$c;->W()V

    :goto_0
    return-void
.end method

.method private V()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    iget v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    aget-byte v1, v1, v2

    if-ltz v1, :cond_0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->e()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v0

    throw v0
.end method

.method private W()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->G()B

    move-result v1

    if-ltz v1, :cond_0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->e()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->M()I

    move-result v0

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iget v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    sub-int v3, v2, v1

    if-gt v0, v3, :cond_0

    if-lez v0, :cond_0

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    add-int v3, v1, v0

    iput v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    const/4 v1, 0x0

    if-gt v0, v2, :cond_2

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/h$c;->Q(I)V

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    iput v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0, v1}, Landroidx/datastore/preferences/protobuf/h$c;->H(IZ)[B

    move-result-object v2

    :goto_0
    invoke-static {v2, v1, v0}, Landroidx/datastore/preferences/protobuf/q0;->e([BII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public B()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->k:I

    return v0

    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->M()I

    move-result v0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->k:I

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/r0;->a(I)I

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->k:I

    return v0

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->b()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v0

    throw v0
.end method

.method public C()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->M()I

    move-result v0

    return v0
.end method

.method public D()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->N()J

    move-result-wide v0

    return-wide v0
.end method

.method public E(I)Z
    .locals 4

    .line 1
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/r0;->b(I)I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    if-eq v0, v1, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    const/4 v3, 0x4

    if-eq v0, v2, :cond_2

    if-eq v0, v3, :cond_1

    const/4 p1, 0x5

    if-ne v0, p1, :cond_0

    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/h$c;->S(I)V

    return v1

    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->d()Landroidx/datastore/preferences/protobuf/z$a;

    move-result-object p1

    throw p1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->R()V

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/r0;->a(I)I

    move-result p1

    invoke-static {p1, v3}, Landroidx/datastore/preferences/protobuf/r0;->c(II)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/h$c;->a(I)V

    return v1

    :cond_3
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->M()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/h$c;->S(I)V

    return v1

    :cond_4
    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/h$c;->S(I)V

    return v1

    :cond_5
    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/h$c;->U()V

    return v1
.end method

.method public final F(I)Landroidx/datastore/preferences/protobuf/g;
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/h$c;->I(I)[B

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/g;->i([B)Landroidx/datastore/preferences/protobuf/g;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    sub-int v2, v1, v0

    iget v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    add-int/2addr v3, v1

    iput v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    const/4 v1, 0x0

    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    sub-int v3, p1, v2

    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/h$c;->J(I)Ljava/util/List;

    move-result-object v3

    new-array p1, p1, [B

    iget-object v4, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    invoke-static {v4, v0, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    array-length v4, v3

    invoke-static {v3, v1, p1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v3, v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_1
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/g;->b0([B)Landroidx/datastore/preferences/protobuf/g;

    move-result-object p1

    return-object p1
.end method

.method public G()B
    .locals 3

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/h$c;->Q(I)V

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    aget-byte v0, v0, v1

    return v0
.end method

.method public final H(IZ)[B
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/h$c;->I(I)[B

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, [B

    :cond_0
    return-object v0

    :cond_1
    iget p2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    sub-int v1, v0, p2

    iget v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    add-int/2addr v2, v0

    iput v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iput v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    sub-int v2, p1, v1

    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/h$c;->J(I)Ljava/util/List;

    move-result-object v2

    new-array p1, p1, [B

    iget-object v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    invoke-static {v3, p2, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    array-length v3, v2

    invoke-static {v2, v0, p1, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v2, v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public final I(I)[B
    .locals 5

    .line 1
    if-nez p1, :cond_0

    sget-object p1, Landroidx/datastore/preferences/protobuf/y;->c:[B

    return-object p1

    :cond_0
    if-ltz p1, :cond_7

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    add-int v2, v0, v1

    add-int/2addr v2, p1

    iget v3, p0, Landroidx/datastore/preferences/protobuf/h;->c:I

    sub-int v3, v2, v3

    if-gtz v3, :cond_6

    iget v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->m:I

    if-gt v2, v3, :cond_5

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    sub-int/2addr v0, v1

    sub-int v1, p1, v0

    const/16 v2, 0x1000

    if-lt v1, v2, :cond_2

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->f:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v2

    if-gt v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :cond_2
    :goto_0
    new-array v1, p1, [B

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    iget v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    iget v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    add-int/2addr v2, v3

    iput v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    iput v4, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iput v4, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    :goto_1
    if-ge v0, p1, :cond_4

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->f:Ljava/io/InputStream;

    sub-int v3, p1, v0

    invoke-virtual {v2, v1, v0, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_3

    iget v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    add-int/2addr v3, v2

    iput v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    add-int/2addr v0, v2

    goto :goto_1

    :cond_3
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->k()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    throw p1

    :cond_4
    return-object v1

    :cond_5
    sub-int/2addr v3, v0

    sub-int/2addr v3, v1

    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/h$c;->S(I)V

    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->k()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    throw p1

    :cond_6
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->j()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    throw p1

    :cond_7
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->f()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    throw p1
.end method

.method public final J(I)Ljava/util/List;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-lez p1, :cond_2

    const/16 v1, 0x1000

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    new-array v2, v1, [B

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    iget-object v4, p0, Landroidx/datastore/preferences/protobuf/h$c;->f:Ljava/io/InputStream;

    sub-int v5, v1, v3

    invoke-virtual {v4, v2, v3, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    iget v5, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    add-int/2addr v5, v4

    iput v5, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    add-int/2addr v3, v4

    goto :goto_1

    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->k()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    throw p1

    :cond_1
    sub-int/2addr p1, v1

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public K()I
    .locals 4

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    sub-int/2addr v1, v0

    const/4 v2, 0x4

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/h$c;->Q(I)V

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    :cond_0
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    add-int/lit8 v2, v0, 0x4

    iput v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    aget-byte v2, v1, v0

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x2

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x3

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v2

    return v0
.end method

.method public L()J
    .locals 9

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    sub-int/2addr v1, v0

    const/16 v2, 0x8

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/h$c;->Q(I)V

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    :cond_0
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    add-int/lit8 v3, v0, 0x8

    iput v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    aget-byte v3, v1, v0

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    add-int/lit8 v7, v0, 0x1

    aget-byte v7, v1, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    shl-long/2addr v7, v2

    or-long v2, v3, v7

    add-int/lit8 v4, v0, 0x2

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x10

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v4, v0, 0x3

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x18

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v4, v0, 0x4

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x20

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v4, v0, 0x5

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x28

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v4, v0, 0x6

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x30

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v0, v0, 0x7

    aget-byte v0, v1, v0

    int-to-long v0, v0

    and-long/2addr v0, v5

    const/16 v4, 0x38

    shl-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public M()I
    .locals 7

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    if-ne v1, v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    add-int/lit8 v3, v0, 0x1

    aget-byte v4, v2, v0

    if-ltz v4, :cond_1

    iput v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    return v4

    :cond_1
    sub-int/2addr v1, v3

    const/16 v5, 0x9

    if-ge v1, v5, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v0, 0x2

    aget-byte v3, v2, v3

    shl-int/lit8 v3, v3, 0x7

    xor-int/2addr v3, v4

    if-gez v3, :cond_3

    xor-int/lit8 v0, v3, -0x80

    goto :goto_3

    :cond_3
    add-int/lit8 v4, v0, 0x3

    aget-byte v1, v2, v1

    shl-int/lit8 v1, v1, 0xe

    xor-int/2addr v1, v3

    if-ltz v1, :cond_4

    xor-int/lit16 v0, v1, 0x3f80

    :goto_0
    move v1, v4

    goto :goto_3

    :cond_4
    add-int/lit8 v3, v0, 0x4

    aget-byte v4, v2, v4

    shl-int/lit8 v4, v4, 0x15

    xor-int/2addr v1, v4

    if-gez v1, :cond_5

    const v0, -0x1fc080

    xor-int/2addr v0, v1

    :goto_1
    move v1, v3

    goto :goto_3

    :cond_5
    add-int/lit8 v4, v0, 0x5

    aget-byte v3, v2, v3

    shl-int/lit8 v5, v3, 0x1c

    xor-int/2addr v1, v5

    const v5, 0xfe03f80

    xor-int/2addr v1, v5

    if-gez v3, :cond_7

    add-int/lit8 v3, v0, 0x6

    aget-byte v4, v2, v4

    if-gez v4, :cond_8

    add-int/lit8 v4, v0, 0x7

    aget-byte v3, v2, v3

    if-gez v3, :cond_7

    add-int/lit8 v3, v0, 0x8

    aget-byte v4, v2, v4

    if-gez v4, :cond_8

    add-int/lit8 v4, v0, 0x9

    aget-byte v3, v2, v3

    if-gez v3, :cond_7

    add-int/lit8 v0, v0, 0xa

    aget-byte v2, v2, v4

    if-gez v2, :cond_6

    :goto_2
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->O()J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :cond_6
    move v6, v1

    move v1, v0

    move v0, v6

    goto :goto_3

    :cond_7
    move v0, v1

    goto :goto_0

    :cond_8
    move v0, v1

    goto :goto_1

    :goto_3
    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    return v0
.end method

.method public N()J
    .locals 12

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    if-ne v1, v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    add-int/lit8 v3, v0, 0x1

    aget-byte v4, v2, v0

    if-ltz v4, :cond_1

    iput v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    int-to-long v0, v4

    return-wide v0

    :cond_1
    sub-int/2addr v1, v3

    const/16 v5, 0x9

    if-ge v1, v5, :cond_2

    goto/16 :goto_2

    :cond_2
    add-int/lit8 v1, v0, 0x2

    aget-byte v3, v2, v3

    shl-int/lit8 v3, v3, 0x7

    xor-int/2addr v3, v4

    if-gez v3, :cond_3

    xor-int/lit8 v0, v3, -0x80

    int-to-long v2, v0

    goto/16 :goto_3

    :cond_3
    add-int/lit8 v4, v0, 0x3

    aget-byte v1, v2, v1

    shl-int/lit8 v1, v1, 0xe

    xor-int/2addr v1, v3

    if-ltz v1, :cond_4

    xor-int/lit16 v0, v1, 0x3f80

    int-to-long v2, v0

    move v1, v4

    goto/16 :goto_3

    :cond_4
    add-int/lit8 v3, v0, 0x4

    aget-byte v4, v2, v4

    shl-int/lit8 v4, v4, 0x15

    xor-int/2addr v1, v4

    if-gez v1, :cond_5

    const v0, -0x1fc080

    xor-int/2addr v0, v1

    int-to-long v0, v0

    move-wide v10, v0

    move v1, v3

    move-wide v2, v10

    goto/16 :goto_3

    :cond_5
    int-to-long v4, v1

    add-int/lit8 v1, v0, 0x5

    aget-byte v3, v2, v3

    int-to-long v6, v3

    const/16 v3, 0x1c

    shl-long/2addr v6, v3

    xor-long v3, v4, v6

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-ltz v7, :cond_6

    const-wide/32 v5, 0xfe03f80

    :goto_0
    xor-long v2, v3, v5

    goto :goto_3

    :cond_6
    add-int/lit8 v7, v0, 0x6

    aget-byte v1, v2, v1

    int-to-long v8, v1

    const/16 v1, 0x23

    shl-long/2addr v8, v1

    xor-long/2addr v3, v8

    cmp-long v1, v3, v5

    if-gez v1, :cond_7

    const-wide v0, -0x7f01fc080L

    :goto_1
    xor-long v2, v3, v0

    move v1, v7

    goto :goto_3

    :cond_7
    add-int/lit8 v1, v0, 0x7

    aget-byte v7, v2, v7

    int-to-long v7, v7

    const/16 v9, 0x2a

    shl-long/2addr v7, v9

    xor-long/2addr v3, v7

    cmp-long v7, v3, v5

    if-ltz v7, :cond_8

    const-wide v5, 0x3f80fe03f80L

    goto :goto_0

    :cond_8
    add-int/lit8 v7, v0, 0x8

    aget-byte v1, v2, v1

    int-to-long v8, v1

    const/16 v1, 0x31

    shl-long/2addr v8, v1

    xor-long/2addr v3, v8

    cmp-long v1, v3, v5

    if-gez v1, :cond_9

    const-wide v0, -0x1fc07f01fc080L

    goto :goto_1

    :cond_9
    add-int/lit8 v1, v0, 0x9

    aget-byte v7, v2, v7

    int-to-long v7, v7

    const/16 v9, 0x38

    shl-long/2addr v7, v9

    xor-long/2addr v3, v7

    const-wide v7, 0xfe03f80fe03f80L

    xor-long/2addr v3, v7

    cmp-long v7, v3, v5

    if-gez v7, :cond_b

    add-int/lit8 v0, v0, 0xa

    aget-byte v1, v2, v1

    int-to-long v1, v1

    cmp-long v1, v1, v5

    if-gez v1, :cond_a

    :goto_2
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->O()J

    move-result-wide v0

    return-wide v0

    :cond_a
    move v1, v0

    :cond_b
    move-wide v2, v3

    :goto_3
    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    return-wide v2
.end method

.method public O()J
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x40

    if-ge v2, v3, :cond_1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->G()B

    move-result v3

    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v2

    or-long/2addr v0, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_0

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x7

    goto :goto_0

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->e()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v0

    throw v0
.end method

.method public final Q(I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/h$c;->X(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h;->c:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    sub-int/2addr v0, v1

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    sub-int/2addr v0, v1

    if-le p1, v0, :cond_0

    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->j()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    throw p1

    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->k()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    throw p1

    :cond_1
    return-void
.end method

.method public R()V
    .locals 1

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->B()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/h$c;->E(I)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    return-void
.end method

.method public S(I)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_0

    if-ltz p1, :cond_0

    add-int/2addr v1, p1

    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/h$c;->T(I)V

    :goto_0
    return-void
.end method

.method public final T(I)V
    .locals 7

    .line 1
    if-ltz p1, :cond_6

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    add-int v2, v0, v1

    add-int/2addr v2, p1

    iget v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->m:I

    if-gt v2, v3, :cond_5

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    :goto_0
    if-ge v0, p1, :cond_2

    sub-int v1, p1, v0

    :try_start_0
    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->f:Ljava/io/InputStream;

    int-to-long v3, v1

    invoke-virtual {v2, v3, v4}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v1

    const-wide/16 v5, 0x0

    cmp-long v5, v1, v5

    if-ltz v5, :cond_1

    cmp-long v3, v1, v3

    if-gtz v3, :cond_1

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    long-to-int v1, v1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Landroidx/datastore/preferences/protobuf/h$c;->f:Ljava/io/InputStream;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "#skip returned invalid result: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "\nThe InputStream implementation is buggy."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    add-int/2addr v1, v0

    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/h$c;->P()V

    throw p1

    :cond_2
    :goto_1
    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    add-int/2addr v1, v0

    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/h$c;->P()V

    if-ge v0, p1, :cond_4

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    sub-int v1, v0, v1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    const/4 v0, 0x1

    :goto_2
    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/h$c;->Q(I)V

    sub-int v2, p1, v1

    iget v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    if-le v2, v3, :cond_3

    add-int/2addr v1, v3

    iput v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    goto :goto_2

    :cond_3
    iput v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    :cond_4
    return-void

    :cond_5
    sub-int/2addr v3, v0

    sub-int/2addr v3, v1

    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/h$c;->S(I)V

    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->k()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    throw p1

    :cond_6
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->f()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    throw p1
.end method

.method public final X(I)Z
    .locals 7

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    add-int v1, v0, p1

    iget v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    if-le v1, v2, :cond_7

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h;->c:I

    iget v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    sub-int/2addr v1, v3

    sub-int/2addr v1, v0

    const/4 v4, 0x0

    if-le p1, v1, :cond_0

    return v4

    :cond_0
    add-int/2addr v3, v0

    add-int/2addr v3, p1

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->m:I

    if-le v3, v1, :cond_1

    return v4

    :cond_1
    if-lez v0, :cond_3

    if-le v2, v0, :cond_2

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    sub-int/2addr v2, v0

    invoke-static {v1, v0, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    add-int/2addr v1, v0

    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    sub-int/2addr v1, v0

    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    iput v4, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    :cond_3
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->f:Ljava/io/InputStream;

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    iget v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    array-length v3, v1

    sub-int/2addr v3, v2

    iget v5, p0, Landroidx/datastore/preferences/protobuf/h;->c:I

    iget v6, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    sub-int/2addr v5, v6

    sub-int/2addr v5, v2

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v1, -0x1

    if-lt v0, v1, :cond_6

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    array-length v1, v1

    if-gt v0, v1, :cond_6

    if-lez v0, :cond_5

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    add-int/2addr v1, v0

    iput v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/h$c;->P()V

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    if-lt v0, p1, :cond_4

    const/4 p1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/h$c;->X(I)Z

    move-result p1

    :goto_0
    return p1

    :cond_5
    return v4

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->f:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "#read(byte[]) returned invalid result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\nThe InputStream implementation is buggy."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "refillBuffer() called when "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes were already available in buffer"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->k:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    throw p1
.end method

.method public d()I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    add-int/2addr v0, v1

    return v0
.end method

.method public e()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/h$c;->X(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/datastore/preferences/protobuf/h$c;->m:I

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/h$c;->P()V

    return-void
.end method

.method public l(I)I
    .locals 2

    .line 1
    if-ltz p1, :cond_1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->l:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    add-int/2addr v0, v1

    add-int/2addr p1, v0

    iget v0, p0, Landroidx/datastore/preferences/protobuf/h$c;->m:I

    if-gt p1, v0, :cond_0

    iput p1, p0, Landroidx/datastore/preferences/protobuf/h$c;->m:I

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/h$c;->P()V

    return v0

    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->k()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    throw p1

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->f()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    throw p1
.end method

.method public m()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->N()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n()Landroidx/datastore/preferences/protobuf/g;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->M()I

    move-result v0

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    iget v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_0

    if-lez v0, :cond_0

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    invoke-static {v1, v2, v0}, Landroidx/datastore/preferences/protobuf/g;->k([BII)Landroidx/datastore/preferences/protobuf/g;

    move-result-object v1

    iget v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    add-int/2addr v2, v0

    iput v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    return-object v1

    :cond_0
    if-nez v0, :cond_1

    sget-object v0, Landroidx/datastore/preferences/protobuf/g;->p:Landroidx/datastore/preferences/protobuf/g;

    return-object v0

    :cond_1
    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/h$c;->F(I)Landroidx/datastore/preferences/protobuf/g;

    move-result-object v0

    return-object v0
.end method

.method public o()D
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->L()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public p()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->M()I

    move-result v0

    return v0
.end method

.method public q()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->K()I

    move-result v0

    return v0
.end method

.method public r()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->L()J

    move-result-wide v0

    return-wide v0
.end method

.method public s()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->K()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public t()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->M()I

    move-result v0

    return v0
.end method

.method public u()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->N()J

    move-result-wide v0

    return-wide v0
.end method

.method public v()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->K()I

    move-result v0

    return v0
.end method

.method public w()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->L()J

    move-result-wide v0

    return-wide v0
.end method

.method public x()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->M()I

    move-result v0

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/h;->b(I)I

    move-result v0

    return v0
.end method

.method public y()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->N()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/datastore/preferences/protobuf/h;->c(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public z()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/h$c;->M()I

    move-result v0

    if-lez v0, :cond_0

    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    iget v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_0

    new-instance v1, Ljava/lang/String;

    iget-object v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    sget-object v4, Landroidx/datastore/preferences/protobuf/y;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, v3, v2, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iget v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    add-int/2addr v2, v0

    iput v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    return-object v1

    :cond_0
    if-nez v0, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    iget v1, p0, Landroidx/datastore/preferences/protobuf/h$c;->h:I

    if-gt v0, v1, :cond_2

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/h$c;->Q(I)V

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->g:[B

    iget v3, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    sget-object v4, Landroidx/datastore/preferences/protobuf/y;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iget v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    add-int/2addr v2, v0

    iput v2, p0, Landroidx/datastore/preferences/protobuf/h$c;->j:I

    return-object v1

    :cond_2
    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Landroidx/datastore/preferences/protobuf/h$c;->H(IZ)[B

    move-result-object v0

    sget-object v2, Landroidx/datastore/preferences/protobuf/y;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v1
.end method
