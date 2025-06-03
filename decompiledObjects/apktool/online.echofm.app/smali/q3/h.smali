.class public final Lq3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/a;


# instance fields
.field public final a:Lq3/l;

.field public final b:Lc3/t;

.field public final c:I


# direct methods
.method public constructor <init>(Lq3/l;Lc3/t;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq3/h;->a:Lq3/l;

    .line 5
    .line 6
    iput-object p2, p0, Lq3/h;->b:Lc3/t;

    .line 7
    .line 8
    iput p3, p0, Lq3/h;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a([B[B)[B
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, Lq3/h;->a:Lq3/l;

    .line 5
    .line 6
    invoke-interface {v3, p1}, Lq3/l;->a([B)[B

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    new-array p2, v2, [B

    .line 13
    .line 14
    :cond_0
    const/16 v3, 0x8

    .line 15
    .line 16
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    array-length v5, p2

    .line 21
    int-to-long v5, v5

    .line 22
    const-wide/16 v7, 0x8

    .line 23
    .line 24
    mul-long/2addr v5, v7

    .line 25
    invoke-virtual {v4, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v4, p0, Lq3/h;->b:Lc3/t;

    .line 38
    .line 39
    const/4 v5, 0x3

    .line 40
    new-array v5, v5, [[B

    .line 41
    .line 42
    aput-object p2, v5, v2

    .line 43
    .line 44
    aput-object p1, v5, v1

    .line 45
    .line 46
    aput-object v3, v5, v0

    .line 47
    .line 48
    invoke-static {v5}, Lq3/f;->a([[B)[B

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-interface {v4, p2}, Lc3/t;->b([B)[B

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    new-array v0, v0, [[B

    .line 57
    .line 58
    aput-object p1, v0, v2

    .line 59
    .line 60
    aput-object p2, v0, v1

    .line 61
    .line 62
    invoke-static {v0}, Lq3/f;->a([[B)[B

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1
.end method

.method public b([B[B)[B
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    array-length v1, p1

    .line 3
    iget v2, p0, Lq3/h;->c:I

    .line 4
    .line 5
    if-lt v1, v2, :cond_1

    .line 6
    .line 7
    array-length v1, p1

    .line 8
    sub-int/2addr v1, v2

    .line 9
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    array-length v2, p1

    .line 14
    iget v3, p0, Lq3/h;->c:I

    .line 15
    .line 16
    sub-int/2addr v2, v3

    .line 17
    array-length v3, p1

    .line 18
    invoke-static {p1, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    new-array p2, v0, [B

    .line 25
    .line 26
    :cond_0
    const/16 v2, 0x8

    .line 27
    .line 28
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    array-length v4, p2

    .line 33
    int-to-long v4, v4

    .line 34
    const-wide/16 v6, 0x8

    .line 35
    .line 36
    mul-long/2addr v4, v6

    .line 37
    invoke-virtual {v3, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v3, p0, Lq3/h;->b:Lc3/t;

    .line 50
    .line 51
    const/4 v4, 0x3

    .line 52
    new-array v4, v4, [[B

    .line 53
    .line 54
    aput-object p2, v4, v0

    .line 55
    .line 56
    const/4 p2, 0x1

    .line 57
    aput-object v1, v4, p2

    .line 58
    .line 59
    const/4 p2, 0x2

    .line 60
    aput-object v2, v4, p2

    .line 61
    .line 62
    invoke-static {v4}, Lq3/f;->a([[B)[B

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-interface {v3, p1, p2}, Lc3/t;->a([B[B)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lq3/h;->a:Lq3/l;

    .line 70
    .line 71
    invoke-interface {p1, v1}, Lq3/l;->b([B)[B

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 77
    .line 78
    const-string p2, "ciphertext too short"

    .line 79
    .line 80
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1
.end method
