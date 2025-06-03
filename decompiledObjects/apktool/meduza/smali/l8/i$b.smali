.class public final Ll8/i$b;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public final synthetic c:Ll8/i;


# direct methods
.method public constructor <init>(Ll8/i;Ll8/i$a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ll8/i$b;->c:Ll8/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v0, p2, Ll8/i$a;->a:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x4

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ll8/i;->c0(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Ll8/i$b;->a:I

    .line 15
    .line 16
    iget p1, p2, Ll8/i$a;->b:I

    .line 17
    .line 18
    iput p1, p0, Ll8/i$b;->b:I

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method


# virtual methods
.method public final read()I
    .locals 3

    iget v0, p0, Ll8/i$b;->b:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-object v0, p0, Ll8/i$b;->c:Ll8/i;

    .line 1
    iget-object v0, v0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    .line 2
    iget v1, p0, Ll8/i$b;->a:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object v0, p0, Ll8/i$b;->c:Ll8/i;

    .line 3
    iget-object v0, v0, Ll8/i;->a:Ljava/io/RandomAccessFile;

    .line 4
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->read()I

    move-result v0

    iget-object v1, p0, Ll8/i$b;->c:Ll8/i;

    iget v2, p0, Ll8/i$b;->a:I

    add-int/lit8 v2, v2, 0x1

    .line 5
    invoke-virtual {v1, v2}, Ll8/i;->c0(I)I

    move-result v1

    .line 6
    iput v1, p0, Ll8/i$b;->a:I

    iget v1, p0, Ll8/i$b;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll8/i$b;->b:I

    return v0
.end method

.method public final read([BII)I
    .locals 2

    if-eqz p1, :cond_3

    or-int v0, p2, p3

    if-ltz v0, :cond_2

    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_2

    iget v0, p0, Ll8/i$b;->b:I

    if-lez v0, :cond_1

    if-le p3, v0, :cond_0

    move p3, v0

    :cond_0
    iget-object v0, p0, Ll8/i$b;->c:Ll8/i;

    iget v1, p0, Ll8/i$b;->a:I

    .line 7
    invoke-virtual {v0, v1, p1, p2, p3}, Ll8/i;->M(I[BII)V

    .line 8
    iget-object p1, p0, Ll8/i$b;->c:Ll8/i;

    iget p2, p0, Ll8/i$b;->a:I

    add-int/2addr p2, p3

    .line 9
    invoke-virtual {p1, p2}, Ll8/i;->c0(I)I

    move-result p1

    .line 10
    iput p1, p0, Ll8/i$b;->a:I

    iget p1, p0, Ll8/i$b;->b:I

    sub-int/2addr p1, p3

    iput p1, p0, Ll8/i$b;->b:I

    return p3

    :cond_1
    const/4 p1, -0x1

    return p1

    :cond_2
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1

    .line 11
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "buffer"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
