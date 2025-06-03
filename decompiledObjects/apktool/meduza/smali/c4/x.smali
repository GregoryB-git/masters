.class public final Lc4/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v0, v0, [I

    iput-object v0, p0, Lc4/x;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/x;->d:Ljava/lang/Object;

    array-length p1, p1

    iput p1, p0, Lc4/x;->a:I

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 2

    const/4 v0, 0x1

    shl-int p1, v0, p1

    iget v1, p0, Lc4/x;->a:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Lc4/x;->d:Ljava/lang/Object;

    check-cast v0, [B

    iget v1, p0, Lc4/x;->b:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    iget v1, p0, Lc4/x;->c:I

    shr-int/2addr v0, v1

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v1}, Lc4/x;->e(I)V

    return v0
.end method

.method public final c(I)I
    .locals 6

    iget v0, p0, Lc4/x;->b:I

    iget v1, p0, Lc4/x;->c:I

    rsub-int/lit8 v1, v1, 0x8

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, p0, Lc4/x;->d:Ljava/lang/Object;

    check-cast v2, [B

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v2, v0

    const/16 v2, 0xff

    and-int/2addr v0, v2

    iget v4, p0, Lc4/x;->c:I

    shr-int/2addr v0, v4

    rsub-int/lit8 v4, v1, 0x8

    shr-int v4, v2, v4

    and-int/2addr v0, v4

    :goto_0
    if-ge v1, p1, :cond_0

    iget-object v4, p0, Lc4/x;->d:Ljava/lang/Object;

    check-cast v4, [B

    add-int/lit8 v5, v3, 0x1

    aget-byte v3, v4, v3

    and-int/2addr v3, v2

    shl-int/2addr v3, v1

    or-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x8

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    rsub-int/lit8 v2, p1, 0x20

    ushr-int/2addr v1, v2

    and-int/2addr v0, v1

    invoke-virtual {p0, p1}, Lc4/x;->e(I)V

    return v0
.end method

.method public final d(II)V
    .locals 4

    iget-object v0, p0, Lc4/x;->d:Ljava/lang/Object;

    check-cast v0, [I

    array-length v1, v0

    if-lt p1, v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    shl-int/2addr v1, p1

    iget v2, p0, Lc4/x;->a:I

    or-int/2addr v2, v1

    iput v2, p0, Lc4/x;->a:I

    iget v2, p0, Lc4/x;->b:I

    not-int v3, v1

    and-int/2addr v2, v3

    iput v2, p0, Lc4/x;->b:I

    iget v2, p0, Lc4/x;->c:I

    not-int v1, v1

    and-int/2addr v1, v2

    iput v1, p0, Lc4/x;->c:I

    aput p2, v0, p1

    return-void
.end method

.method public final e(I)V
    .locals 3

    div-int/lit8 v0, p1, 0x8

    iget v1, p0, Lc4/x;->b:I

    add-int/2addr v1, v0

    iput v1, p0, Lc4/x;->b:I

    iget v2, p0, Lc4/x;->c:I

    mul-int/lit8 v0, v0, 0x8

    sub-int/2addr p1, v0

    add-int/2addr p1, v2

    iput p1, p0, Lc4/x;->c:I

    const/4 v0, 0x1

    const/4 v2, 0x7

    if-le p1, v2, :cond_0

    add-int/2addr v1, v0

    iput v1, p0, Lc4/x;->b:I

    add-int/lit8 p1, p1, -0x8

    iput p1, p0, Lc4/x;->c:I

    :cond_0
    iget p1, p0, Lc4/x;->b:I

    if-ltz p1, :cond_1

    iget v1, p0, Lc4/x;->a:I

    if-lt p1, v1, :cond_2

    if-ne p1, v1, :cond_1

    iget p1, p0, Lc4/x;->c:I

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    invoke-static {v0}, Lx6/b;->H(Z)V

    return-void
.end method
