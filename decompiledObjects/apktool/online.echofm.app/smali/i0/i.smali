.class public final Li0/i;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final o:Li0/g;

.field public final p:Li0/k;

.field public final q:[B

.field public r:Z

.field public s:Z

.field public t:J


# direct methods
.method public constructor <init>(Li0/g;Li0/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Li0/i;->r:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Li0/i;->s:Z

    .line 8
    .line 9
    iput-object p1, p0, Li0/i;->o:Li0/g;

    .line 10
    .line 11
    iput-object p2, p0, Li0/i;->p:Li0/k;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    new-array p1, p1, [B

    .line 15
    .line 16
    iput-object p1, p0, Li0/i;->q:[B

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Li0/i;->r:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Li0/i;->o:Li0/g;

    .line 6
    .line 7
    iget-object v1, p0, Li0/i;->p:Li0/k;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Li0/g;->e(Li0/k;)J

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Li0/i;->r:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li0/i;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Li0/i;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Li0/i;->o:Li0/g;

    .line 6
    .line 7
    invoke-interface {v0}, Li0/g;->close()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Li0/i;->s:Z

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public read()I
    .locals 2

    .line 1
    iget-object v0, p0, Li0/i;->q:[B

    invoke-virtual {p0, v0}, Li0/i;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li0/i;->q:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    and-int/lit16 v1, v0, 0xff

    :goto_0
    return v1
.end method

.method public read([B)I
    .locals 2

    .line 2
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Li0/i;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .locals 2

    .line 3
    iget-boolean v0, p0, Li0/i;->s:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lg0/a;->f(Z)V

    invoke-virtual {p0}, Li0/i;->a()V

    iget-object v0, p0, Li0/i;->o:Li0/g;

    invoke-interface {v0, p1, p2, p3}, Ld0/i;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-wide p2, p0, Li0/i;->t:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Li0/i;->t:J

    return p1
.end method
