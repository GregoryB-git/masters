.class public Lma/h$h;
.super Lma/h$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public final d:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Lma/h$g;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lma/h$h;->d:[B

    return-void
.end method


# virtual methods
.method public final A(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lma/h$h;->d:[B

    invoke-virtual {p0}, Lma/h$h;->D()I

    move-result v2

    invoke-virtual {p0}, Lma/h$h;->size()I

    move-result v3

    invoke-direct {v0, v1, v2, v3, p1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public final B(Lm/e;)V
    .locals 3

    iget-object v0, p0, Lma/h$h;->d:[B

    invoke-virtual {p0}, Lma/h$h;->D()I

    move-result v1

    invoke-virtual {p0}, Lma/h$h;->size()I

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lm/e;->s([BII)V

    return-void
.end method

.method public final C(Lma/h;II)Z
    .locals 5

    invoke-virtual {p1}, Lma/h;->size()I

    move-result v0

    if-gt p3, v0, :cond_4

    add-int v0, p2, p3

    invoke-virtual {p1}, Lma/h;->size()I

    move-result v1

    if-gt v0, v1, :cond_3

    instance-of v1, p1, Lma/h$h;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lma/h$h;

    iget-object v0, p0, Lma/h$h;->d:[B

    iget-object v1, p1, Lma/h$h;->d:[B

    invoke-virtual {p0}, Lma/h$h;->D()I

    move-result v3

    add-int/2addr v3, p3

    invoke-virtual {p0}, Lma/h$h;->D()I

    move-result p3

    invoke-virtual {p1}, Lma/h$h;->D()I

    move-result p1

    add-int/2addr p1, p2

    :goto_0
    if-ge p3, v3, :cond_1

    aget-byte p2, v0, p3

    aget-byte v4, v1, p1

    if-eq p2, v4, :cond_0

    return v2

    :cond_0
    add-int/lit8 p3, p3, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    invoke-virtual {p1, p2, v0}, Lma/h;->y(II)Lma/h;

    move-result-object p1

    invoke-virtual {p0, v2, p3}, Lma/h$h;->y(II)Lma/h;

    move-result-object p2

    invoke-virtual {p1, p2}, Lma/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ran off end of other: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lma/h;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Length too large: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lma/h$h;->size()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public D()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final a()Ljava/nio/ByteBuffer;
    .locals 3

    iget-object v0, p0, Lma/h$h;->d:[B

    invoke-virtual {p0}, Lma/h$h;->D()I

    move-result v1

    invoke-virtual {p0}, Lma/h$h;->size()I

    move-result v2

    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lma/h;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-virtual {p0}, Lma/h$h;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, Lma/h;

    .line 17
    .line 18
    invoke-virtual {v3}, Lma/h;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eq v1, v3, :cond_2

    .line 23
    .line 24
    return v2

    .line 25
    :cond_2
    invoke-virtual {p0}, Lma/h$h;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    return v0

    .line 32
    :cond_3
    instance-of v0, p1, Lma/h$h;

    .line 33
    .line 34
    if-eqz v0, :cond_5

    .line 35
    .line 36
    check-cast p1, Lma/h$h;

    .line 37
    .line 38
    iget v0, p0, Lma/h;->a:I

    .line 39
    .line 40
    iget v1, p1, Lma/h;->a:I

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    if-eqz v1, :cond_4

    .line 45
    .line 46
    if-eq v0, v1, :cond_4

    .line 47
    .line 48
    return v2

    .line 49
    :cond_4
    invoke-virtual {p0}, Lma/h$h;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {p0, p1, v2, v0}, Lma/h$h;->C(Lma/h;II)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1

    .line 58
    :cond_5
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    return p1
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public i(I)B
    .locals 1

    iget-object v0, p0, Lma/h$h;->d:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public n(I[BII)V
    .locals 1

    iget-object v0, p0, Lma/h$h;->d:[B

    invoke-static {v0, p1, p2, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public p(I)B
    .locals 1

    iget-object v0, p0, Lma/h$h;->d:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public final r()Z
    .locals 3

    invoke-virtual {p0}, Lma/h$h;->D()I

    move-result v0

    iget-object v1, p0, Lma/h$h;->d:[B

    invoke-virtual {p0}, Lma/h$h;->size()I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {v1, v0, v2}, Lma/u1;->e([BII)Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lma/h$h;->d:[B

    array-length v0, v0

    return v0
.end method

.method public final t()Lma/i;
    .locals 4

    iget-object v0, p0, Lma/h$h;->d:[B

    invoke-virtual {p0}, Lma/h$h;->D()I

    move-result v1

    invoke-virtual {p0}, Lma/h$h;->size()I

    move-result v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lma/i;->f([BIIZ)Lma/i$a;

    move-result-object v0

    return-object v0
.end method

.method public final u(III)I
    .locals 3

    iget-object v0, p0, Lma/h$h;->d:[B

    invoke-virtual {p0}, Lma/h$h;->D()I

    move-result v1

    add-int/2addr v1, p2

    sget-object p2, Lma/a0;->a:Ljava/nio/charset/Charset;

    move p2, v1

    :goto_0
    add-int v2, v1, p3

    if-ge p2, v2, :cond_0

    mul-int/lit8 p1, p1, 0x1f

    aget-byte v2, v0, p2

    add-int/2addr p1, v2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return p1
.end method

.method public final x(III)I
    .locals 2

    invoke-virtual {p0}, Lma/h$h;->D()I

    move-result v0

    add-int/2addr v0, p2

    iget-object p2, p0, Lma/h$h;->d:[B

    add-int/2addr p3, v0

    sget-object v1, Lma/u1;->a:Lma/u1$b;

    invoke-virtual {v1, p1, p2, v0, p3}, Lma/u1$b;->e(I[BII)I

    move-result p1

    return p1
.end method

.method public final y(II)Lma/h;
    .locals 3

    invoke-virtual {p0}, Lma/h$h;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lma/h;->l(III)I

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, Lma/h;->b:Lma/h$h;

    return-object p1

    :cond_0
    new-instance v0, Lma/h$d;

    iget-object v1, p0, Lma/h$h;->d:[B

    invoke-virtual {p0}, Lma/h$h;->D()I

    move-result v2

    add-int/2addr v2, p1

    invoke-direct {v0, v1, v2, p2}, Lma/h$d;-><init>([BII)V

    return-object v0
.end method
