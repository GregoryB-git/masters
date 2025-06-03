.class public final Lma/c0;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/nio/ByteBuffer;

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public o:[B

.field public p:I

.field public q:J


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 2

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lma/c0;->a:Ljava/util/Iterator;

    const/4 v0, 0x0

    iput v0, p0, Lma/c0;->c:I

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    iget v1, p0, Lma/c0;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lma/c0;->c:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    iput p1, p0, Lma/c0;->d:I

    invoke-virtual {p0}, Lma/c0;->f()Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lma/a0;->c:Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lma/c0;->b:Ljava/nio/ByteBuffer;

    iput v0, p0, Lma/c0;->d:I

    iput v0, p0, Lma/c0;->e:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lma/c0;->q:J

    :cond_1
    return-void
.end method


# virtual methods
.method public final f()Z
    .locals 5

    .line 1
    iget v0, p0, Lma/c0;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lma/c0;->d:I

    .line 6
    .line 7
    iget-object v0, p0, Lma/c0;->a:Ljava/util/Iterator;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return v2

    .line 17
    :cond_0
    iget-object v0, p0, Lma/c0;->a:Ljava/util/Iterator;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    iput-object v0, p0, Lma/c0;->b:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, Lma/c0;->e:I

    .line 32
    .line 33
    iget-object v0, p0, Lma/c0;->b:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iput-boolean v1, p0, Lma/c0;->f:Z

    .line 42
    .line 43
    iget-object v0, p0, Lma/c0;->b:Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lma/c0;->o:[B

    .line 50
    .line 51
    iget-object v0, p0, Lma/c0;->b:Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iput v0, p0, Lma/c0;->p:I

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iput-boolean v2, p0, Lma/c0;->f:Z

    .line 61
    .line 62
    iget-object v0, p0, Lma/c0;->b:Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    sget-object v2, Lma/t1;->c:Lma/t1$e;

    .line 65
    .line 66
    sget-wide v3, Lma/t1;->g:J

    .line 67
    .line 68
    invoke-virtual {v2, v0, v3, v4}, Lma/t1$e;->j(Ljava/lang/Object;J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    iput-wide v2, p0, Lma/c0;->q:J

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    iput-object v0, p0, Lma/c0;->o:[B

    .line 76
    .line 77
    :goto_0
    return v1
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final g(I)V
    .locals 1

    iget v0, p0, Lma/c0;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Lma/c0;->e:I

    iget-object p1, p0, Lma/c0;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p1

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Lma/c0;->f()Z

    :cond_0
    return-void
.end method

.method public final read()I
    .locals 6

    iget v0, p0, Lma/c0;->d:I

    iget v1, p0, Lma/c0;->c:I

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-boolean v0, p0, Lma/c0;->f:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lma/c0;->o:[B

    iget v2, p0, Lma/c0;->e:I

    iget v3, p0, Lma/c0;->p:I

    add-int/2addr v2, v3

    aget-byte v0, v0, v2

    :goto_0
    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v1}, Lma/c0;->g(I)V

    return v0

    :cond_1
    iget v0, p0, Lma/c0;->e:I

    int-to-long v2, v0

    iget-wide v4, p0, Lma/c0;->q:J

    add-long/2addr v2, v4

    invoke-static {v2, v3}, Lma/t1;->h(J)B

    move-result v0

    goto :goto_0
.end method

.method public final read([BII)I
    .locals 3

    iget v0, p0, Lma/c0;->d:I

    iget v1, p0, Lma/c0;->c:I

    if-ne v0, v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, Lma/c0;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    iget v1, p0, Lma/c0;->e:I

    sub-int/2addr v0, v1

    if-le p3, v0, :cond_1

    move p3, v0

    :cond_1
    iget-boolean v0, p0, Lma/c0;->f:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lma/c0;->o:[B

    iget v2, p0, Lma/c0;->p:I

    add-int/2addr v1, v2

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lma/c0;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    iget-object v1, p0, Lma/c0;->b:Ljava/nio/ByteBuffer;

    iget v2, p0, Lma/c0;->e:I

    .line 1
    invoke-virtual {v1, v2}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 2
    iget-object v1, p0, Lma/c0;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1, p2, p3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object p1, p0, Lma/c0;->b:Ljava/nio/ByteBuffer;

    .line 3
    invoke-virtual {p1, v0}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 4
    :goto_0
    invoke-virtual {p0, p3}, Lma/c0;->g(I)V

    return p3
.end method
