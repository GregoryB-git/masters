.class public final Lm4/b;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field public o:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lm4/b;->o:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lm4/b;->o:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public write(I)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lm4/b;->o:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lm4/b;->o:J

    return-void
.end method

.method public write([B)V
    .locals 4

    .line 2
    iget-wide v0, p0, Lm4/b;->o:J

    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lm4/b;->o:J

    return-void
.end method

.method public write([BII)V
    .locals 2

    .line 3
    if-ltz p2, :cond_0

    array-length v0, p1

    if-gt p2, v0, :cond_0

    if-ltz p3, :cond_0

    add-int/2addr p2, p3

    array-length p1, p1

    if-gt p2, p1, :cond_0

    if-ltz p2, :cond_0

    iget-wide p1, p0, Lm4/b;->o:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lm4/b;->o:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
