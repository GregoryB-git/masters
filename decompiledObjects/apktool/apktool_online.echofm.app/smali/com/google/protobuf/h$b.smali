.class public Lcom/google/protobuf/h$b;
.super Lcom/google/protobuf/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final e:[B

.field public final f:I

.field public final g:I

.field public h:I


# direct methods
.method public constructor <init>([BII)V
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/protobuf/h;-><init>(Lcom/google/protobuf/h$a;)V

    if-eqz p1, :cond_1

    or-int v0, p2, p3

    array-length v1, p1

    add-int v2, p2, p3

    sub-int/2addr v1, v2

    or-int/2addr v0, v1

    if-ltz v0, :cond_0

    iput-object p1, p0, Lcom/google/protobuf/h$b;->e:[B

    iput p2, p0, Lcom/google/protobuf/h$b;->f:I

    iput p2, p0, Lcom/google/protobuf/h$b;->h:I

    iput v2, p0, Lcom/google/protobuf/h$b;->g:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    array-length p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    const/4 p1, 0x2

    aput-object p3, v1, p1

    const-string p1, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "buffer"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final A0(Lcom/google/protobuf/K;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/google/protobuf/K;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/h$b;->P0(I)V

    invoke-interface {p1, p0}, Lcom/google/protobuf/K;->j(Lcom/google/protobuf/h;)V

    return-void
.end method

.method public final B0(ILcom/google/protobuf/K;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/h$b;->N0(II)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1}, Lcom/google/protobuf/h$b;->O0(II)V

    invoke-virtual {p0, v1, p2}, Lcom/google/protobuf/h$b;->T0(ILcom/google/protobuf/K;)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/google/protobuf/h$b;->N0(II)V

    return-void
.end method

.method public final C0(ILcom/google/protobuf/f;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/h$b;->N0(II)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1}, Lcom/google/protobuf/h$b;->O0(II)V

    invoke-virtual {p0, v1, p2}, Lcom/google/protobuf/h$b;->f0(ILcom/google/protobuf/f;)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/google/protobuf/h$b;->N0(II)V

    return-void
.end method

.method public final L0(ILjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/h$b;->N0(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/h$b;->M0(Ljava/lang/String;)V

    return-void
.end method

.method public final M0(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/protobuf/h$b;->h:I

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    invoke-static {v1}, Lcom/google/protobuf/h;->Q(I)I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Lcom/google/protobuf/h;->Q(I)I

    move-result v2

    if-ne v2, v1, :cond_0

    add-int v1, v0, v2

    iput v1, p0, Lcom/google/protobuf/h$b;->h:I

    iget-object v3, p0, Lcom/google/protobuf/h$b;->e:[B

    invoke-virtual {p0}, Lcom/google/protobuf/h$b;->Z()I

    move-result v4

    invoke-static {p1, v3, v1, v4}, Lcom/google/protobuf/l0;->e(Ljava/lang/CharSequence;[BII)I

    move-result v1

    iput v0, p0, Lcom/google/protobuf/h$b;->h:I

    sub-int v3, v1, v0

    sub-int/2addr v3, v2

    invoke-virtual {p0, v3}, Lcom/google/protobuf/h$b;->P0(I)V

    :goto_0
    iput v1, p0, Lcom/google/protobuf/h$b;->h:I

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :cond_0
    invoke-static {p1}, Lcom/google/protobuf/l0;->f(Ljava/lang/CharSequence;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/google/protobuf/h$b;->P0(I)V

    iget-object v1, p0, Lcom/google/protobuf/h$b;->e:[B

    iget v2, p0, Lcom/google/protobuf/h$b;->h:I

    invoke-virtual {p0}, Lcom/google/protobuf/h$b;->Z()I

    move-result v3

    invoke-static {p1, v1, v2, v3}, Lcom/google/protobuf/l0;->e(Ljava/lang/CharSequence;[BII)I

    move-result v1
    :try_end_0
    .catch Lcom/google/protobuf/l0$c; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    new-instance v0, Lcom/google/protobuf/h$c;

    invoke-direct {v0, p1}, Lcom/google/protobuf/h$c;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_2
    iput v0, p0, Lcom/google/protobuf/h$b;->h:I

    invoke-virtual {p0, p1, v1}, Lcom/google/protobuf/h;->V(Ljava/lang/String;Lcom/google/protobuf/l0$c;)V

    :goto_3
    return-void
.end method

.method public final N0(II)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/google/protobuf/m0;->c(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/h$b;->P0(I)V

    return-void
.end method

.method public final O0(II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/h$b;->N0(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/h$b;->P0(I)V

    return-void
.end method

.method public final P0(I)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    :goto_0
    and-int/lit8 v1, p1, -0x80

    if-nez v1, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/google/protobuf/h$b;->e:[B

    iget v2, p0, Lcom/google/protobuf/h$b;->h:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/google/protobuf/h$b;->h:I

    int-to-byte p1, p1

    aput-byte p1, v1, v2

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/google/protobuf/h$b;->e:[B

    iget v2, p0, Lcom/google/protobuf/h$b;->h:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/google/protobuf/h$b;->h:I

    and-int/lit8 v3, p1, 0x7f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v1, v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :goto_1
    new-instance v1, Lcom/google/protobuf/h$c;

    iget v2, p0, Lcom/google/protobuf/h$b;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Lcom/google/protobuf/h$b;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    aput-object v3, v5, v0

    const/4 v0, 0x2

    aput-object v4, v5, v0

    const-string v0, "Pos: %d, limit: %d, len: %d"

    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/google/protobuf/h$c;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final Q0(IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/h$b;->N0(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/h$b;->R0(J)V

    return-void
.end method

.method public final R0(J)V
    .locals 10

    .line 1
    const/4 v0, 0x1

    invoke-static {}, Lcom/google/protobuf/h;->b()Z

    move-result v1

    const/4 v2, 0x7

    const-wide/16 v3, 0x0

    const-wide/16 v5, -0x80

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/google/protobuf/h$b;->Z()I

    move-result v1

    const/16 v7, 0xa

    if-lt v1, v7, :cond_1

    :goto_0
    and-long v7, p1, v5

    cmp-long v1, v7, v3

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/protobuf/h$b;->e:[B

    iget v2, p0, Lcom/google/protobuf/h$b;->h:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/google/protobuf/h$b;->h:I

    int-to-long v2, v2

    long-to-int p1, p1

    int-to-byte p1, p1

    invoke-static {v1, v2, v3, p1}, Lcom/google/protobuf/k0;->K([BJB)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/protobuf/h$b;->e:[B

    iget v7, p0, Lcom/google/protobuf/h$b;->h:I

    add-int/lit8 v8, v7, 0x1

    iput v8, p0, Lcom/google/protobuf/h$b;->h:I

    int-to-long v7, v7

    long-to-int v9, p1

    and-int/lit8 v9, v9, 0x7f

    or-int/lit16 v9, v9, 0x80

    int-to-byte v9, v9

    invoke-static {v1, v7, v8, v9}, Lcom/google/protobuf/k0;->K([BJB)V

    ushr-long/2addr p1, v2

    goto :goto_0

    :cond_1
    :goto_1
    and-long v7, p1, v5

    cmp-long v1, v7, v3

    if-nez v1, :cond_2

    :try_start_0
    iget-object v1, p0, Lcom/google/protobuf/h$b;->e:[B

    iget v2, p0, Lcom/google/protobuf/h$b;->h:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/google/protobuf/h$b;->h:I

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v1, v2

    return-void

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lcom/google/protobuf/h$b;->e:[B

    iget v7, p0, Lcom/google/protobuf/h$b;->h:I

    add-int/lit8 v8, v7, 0x1

    iput v8, p0, Lcom/google/protobuf/h$b;->h:I

    long-to-int v8, p1

    and-int/lit8 v8, v8, 0x7f

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    aput-byte v8, v1, v7
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    ushr-long/2addr p1, v2

    goto :goto_1

    :goto_2
    new-instance p2, Lcom/google/protobuf/h$c;

    iget v1, p0, Lcom/google/protobuf/h$b;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lcom/google/protobuf/h$b;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    aput-object v2, v4, v0

    const/4 v0, 0x2

    aput-object v3, v4, v0

    const-string v0, "Pos: %d, limit: %d, len: %d"

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lcom/google/protobuf/h$c;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final S0([BII)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/protobuf/h$b;->e:[B

    iget v1, p0, Lcom/google/protobuf/h$b;->h:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/google/protobuf/h$b;->h:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/protobuf/h$b;->h:I
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/protobuf/h$c;

    iget v0, p0, Lcom/google/protobuf/h$b;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lcom/google/protobuf/h$b;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object p3, v2, v0

    const-string p3, "Pos: %d, limit: %d, len: %d"

    invoke-static {p3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Lcom/google/protobuf/h$c;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final T0(ILcom/google/protobuf/K;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/h$b;->N0(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/h$b;->A0(Lcom/google/protobuf/K;)V

    return-void
.end method

.method public final Z()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/h$b;->g:I

    iget v1, p0, Lcom/google/protobuf/h$b;->h:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final a([BII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/h$b;->S0([BII)V

    return-void
.end method

.method public final a0(B)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lcom/google/protobuf/h$b;->e:[B

    iget v2, p0, Lcom/google/protobuf/h$b;->h:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/google/protobuf/h$b;->h:I

    aput-byte p1, v1, v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v1, Lcom/google/protobuf/h$c;

    iget v2, p0, Lcom/google/protobuf/h$b;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Lcom/google/protobuf/h$b;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    aput-object v3, v5, v0

    const/4 v0, 0x2

    aput-object v4, v5, v0

    const-string v0, "Pos: %d, limit: %d, len: %d"

    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/google/protobuf/h$c;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final b0(IZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/h$b;->N0(II)V

    int-to-byte p1, p2

    invoke-virtual {p0, p1}, Lcom/google/protobuf/h$b;->a0(B)V

    return-void
.end method

.method public final e0([BII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/protobuf/h$b;->P0(I)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/h$b;->S0([BII)V

    return-void
.end method

.method public final f0(ILcom/google/protobuf/f;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/h$b;->N0(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/h$b;->g0(Lcom/google/protobuf/f;)V

    return-void
.end method

.method public final g0(Lcom/google/protobuf/f;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/f;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/h$b;->P0(I)V

    invoke-virtual {p1, p0}, Lcom/google/protobuf/f;->b0(Lcom/google/protobuf/e;)V

    return-void
.end method

.method public final l0(II)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/h$b;->N0(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/h$b;->m0(I)V

    return-void
.end method

.method public final m0(I)V
    .locals 8

    .line 1
    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    :try_start_0
    iget-object v3, p0, Lcom/google/protobuf/h$b;->e:[B

    iget v4, p0, Lcom/google/protobuf/h$b;->h:I

    add-int/lit8 v5, v4, 0x1

    and-int/lit16 v6, p1, 0xff

    int-to-byte v6, v6

    aput-byte v6, v3, v4

    add-int/lit8 v6, v4, 0x2

    shr-int/lit8 v7, p1, 0x8

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    aput-byte v7, v3, v5

    add-int/lit8 v5, v4, 0x3

    shr-int/lit8 v7, p1, 0x10

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    aput-byte v7, v3, v6

    add-int/lit8 v4, v4, 0x4

    iput v4, p0, Lcom/google/protobuf/h$b;->h:I

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v3, v5
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v3, Lcom/google/protobuf/h$c;

    iget v4, p0, Lcom/google/protobuf/h$b;->h:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Lcom/google/protobuf/h$b;->g:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v4, v0, v7

    aput-object v5, v0, v2

    aput-object v6, v0, v1

    const-string v1, "Pos: %d, limit: %d, len: %d"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0, p1}, Lcom/google/protobuf/h$c;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
.end method

.method public final n0(IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/h$b;->N0(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/h$b;->o0(J)V

    return-void
.end method

.method public final o0(J)V
    .locals 10

    .line 1
    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    :try_start_0
    iget-object v3, p0, Lcom/google/protobuf/h$b;->e:[B

    iget v4, p0, Lcom/google/protobuf/h$b;->h:I

    add-int/lit8 v5, v4, 0x1

    long-to-int v6, p1

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v3, v4

    add-int/lit8 v6, v4, 0x2

    const/16 v7, 0x8

    shr-long v8, p1, v7

    long-to-int v8, v8

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    aput-byte v8, v3, v5

    add-int/lit8 v5, v4, 0x3

    const/16 v8, 0x10

    shr-long v8, p1, v8

    long-to-int v8, v8

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    aput-byte v8, v3, v6

    add-int/lit8 v6, v4, 0x4

    const/16 v8, 0x18

    shr-long v8, p1, v8

    long-to-int v8, v8

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    aput-byte v8, v3, v5

    add-int/lit8 v5, v4, 0x5

    const/16 v8, 0x20

    shr-long v8, p1, v8

    long-to-int v8, v8

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    aput-byte v8, v3, v6

    add-int/lit8 v6, v4, 0x6

    const/16 v8, 0x28

    shr-long v8, p1, v8

    long-to-int v8, v8

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    aput-byte v8, v3, v5

    add-int/lit8 v5, v4, 0x7

    const/16 v8, 0x30

    shr-long v8, p1, v8

    long-to-int v8, v8

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    aput-byte v8, v3, v6

    add-int/2addr v4, v7

    iput v4, p0, Lcom/google/protobuf/h$b;->h:I

    const/16 v4, 0x38

    shr-long/2addr p1, v4

    long-to-int p1, p1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v3, v5
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/protobuf/h$c;

    iget v3, p0, Lcom/google/protobuf/h$b;->h:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, p0, Lcom/google/protobuf/h$b;->g:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v3, v0, v6

    aput-object v4, v0, v2

    aput-object v5, v0, v1

    const-string v1, "Pos: %d, limit: %d, len: %d"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lcom/google/protobuf/h$c;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final v0(II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/h$b;->N0(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/h$b;->w0(I)V

    return-void
.end method

.method public final w0(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/h$b;->P0(I)V

    goto :goto_0

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/h$b;->R0(J)V

    :goto_0
    return-void
.end method

.method public final z0(ILcom/google/protobuf/K;Lcom/google/protobuf/Z;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/h$b;->N0(II)V

    move-object p1, p2

    check-cast p1, Lcom/google/protobuf/a;

    invoke-virtual {p1, p3}, Lcom/google/protobuf/a;->h(Lcom/google/protobuf/Z;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/h$b;->P0(I)V

    iget-object p1, p0, Lcom/google/protobuf/h;->a:Lcom/google/protobuf/i;

    invoke-interface {p3, p2, p1}, Lcom/google/protobuf/Z;->h(Ljava/lang/Object;Lcom/google/protobuf/n0;)V

    return-void
.end method
