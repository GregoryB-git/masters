.class public final Lgb/v2$b;
.super Lgb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/v2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public final b:I

.field public final c:[B

.field public d:I


# direct methods
.method public constructor <init>([BII)V
    .locals 4

    invoke-direct {p0}, Lgb/b;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lgb/v2$b;->d:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "offset must be >= 0"

    invoke-static {v3, v2}, Lx6/b;->s(Ljava/lang/String;Z)V

    if-ltz p3, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    const-string v3, "length must be >= 0"

    invoke-static {v3, v2}, Lx6/b;->s(Ljava/lang/String;Z)V

    add-int/2addr p3, p2

    array-length v2, p1

    if-gt p3, v2, :cond_2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    const-string v1, "offset + length exceeds array boundary"

    invoke-static {v1, v0}, Lx6/b;->s(Ljava/lang/String;Z)V

    iput-object p1, p0, Lgb/v2$b;->c:[B

    iput p2, p0, Lgb/v2$b;->a:I

    iput p3, p0, Lgb/v2$b;->b:I

    return-void
.end method


# virtual methods
.method public final U([BII)V
    .locals 2

    iget-object v0, p0, Lgb/v2$b;->c:[B

    iget v1, p0, Lgb/v2$b;->a:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lgb/v2$b;->a:I

    add-int/2addr p1, p3

    iput p1, p0, Lgb/v2$b;->a:I

    return-void
.end method

.method public final Z()V
    .locals 1

    iget v0, p0, Lgb/v2$b;->a:I

    iput v0, p0, Lgb/v2$b;->d:I

    return-void
.end method

.method public final b()I
    .locals 2

    iget v0, p0, Lgb/v2$b;->b:I

    iget v1, p0, Lgb/v2$b;->a:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final m0(Ljava/io/OutputStream;I)V
    .locals 2

    invoke-virtual {p0, p2}, Lgb/b;->f(I)V

    iget-object v0, p0, Lgb/v2$b;->c:[B

    iget v1, p0, Lgb/v2$b;->a:I

    invoke-virtual {p1, v0, v1, p2}, Ljava/io/OutputStream;->write([BII)V

    iget p1, p0, Lgb/v2$b;->a:I

    add-int/2addr p1, p2

    iput p1, p0, Lgb/v2$b;->a:I

    return-void
.end method

.method public final r(I)Lgb/u2;
    .locals 3

    invoke-virtual {p0, p1}, Lgb/b;->f(I)V

    iget v0, p0, Lgb/v2$b;->a:I

    add-int v1, v0, p1

    iput v1, p0, Lgb/v2$b;->a:I

    new-instance v1, Lgb/v2$b;

    iget-object v2, p0, Lgb/v2$b;->c:[B

    invoke-direct {v1, v2, v0, p1}, Lgb/v2$b;-><init>([BII)V

    return-object v1
.end method

.method public final readUnsignedByte()I
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lgb/b;->f(I)V

    iget-object v0, p0, Lgb/v2$b;->c:[B

    iget v1, p0, Lgb/v2$b;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lgb/v2$b;->a:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final reset()V
    .locals 2

    iget v0, p0, Lgb/v2$b;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iput v0, p0, Lgb/v2$b;->a:I

    return-void

    :cond_0
    new-instance v0, Ljava/nio/InvalidMarkException;

    invoke-direct {v0}, Ljava/nio/InvalidMarkException;-><init>()V

    throw v0
.end method

.method public final skipBytes(I)V
    .locals 1

    invoke-virtual {p0, p1}, Lgb/b;->f(I)V

    iget v0, p0, Lgb/v2$b;->a:I

    add-int/2addr v0, p1

    iput v0, p0, Lgb/v2$b;->a:I

    return-void
.end method

.method public final v0(Ljava/nio/ByteBuffer;)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-virtual {p0, v0}, Lgb/b;->f(I)V

    iget-object v1, p0, Lgb/v2$b;->c:[B

    iget v2, p0, Lgb/v2$b;->a:I

    invoke-virtual {p1, v1, v2, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    iget p1, p0, Lgb/v2$b;->a:I

    add-int/2addr p1, v0

    iput p1, p0, Lgb/v2$b;->a:I

    return-void
.end method
