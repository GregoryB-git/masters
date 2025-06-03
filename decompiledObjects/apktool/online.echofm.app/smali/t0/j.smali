.class public final Lt0/j;
.super Lj0/i;
.source "SourceFile"


# instance fields
.field public x:J

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lj0/i;-><init>(I)V

    .line 3
    .line 4
    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    iput v0, p0, Lt0/j;->z:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public H(Lj0/i;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lj0/i;->D()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    xor-int/2addr v0, v1

    .line 7
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lj0/a;->o()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    xor-int/2addr v0, v1

    .line 15
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lj0/a;->p()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    xor-int/2addr v0, v1

    .line 23
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lt0/j;->K(Lj0/i;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    return p1

    .line 34
    :cond_0
    iget v0, p0, Lt0/j;->y:I

    .line 35
    .line 36
    add-int/lit8 v2, v0, 0x1

    .line 37
    .line 38
    iput v2, p0, Lt0/j;->y:I

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    iget-wide v2, p1, Lj0/i;->t:J

    .line 43
    .line 44
    iput-wide v2, p0, Lj0/i;->t:J

    .line 45
    .line 46
    invoke-virtual {p1}, Lj0/a;->s()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0, v1}, Lj0/a;->w(I)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, p1, Lj0/i;->r:Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {p0, v2}, Lj0/i;->z(I)V

    .line 64
    .line 65
    .line 66
    iget-object v2, p0, Lj0/i;->r:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    .line 71
    :cond_2
    iget-wide v2, p1, Lj0/i;->t:J

    .line 72
    .line 73
    iput-wide v2, p0, Lt0/j;->x:J

    .line 74
    .line 75
    return v1
.end method

.method public final K(Lj0/i;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lt0/j;->U()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget v0, p0, Lt0/j;->y:I

    .line 10
    .line 11
    iget v2, p0, Lt0/j;->z:I

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-lt v0, v2, :cond_1

    .line 15
    .line 16
    return v3

    .line 17
    :cond_1
    iget-object p1, p1, Lj0/i;->r:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lj0/i;->r:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    add-int/2addr v0, p1

    .line 34
    const p1, 0x2ee000

    .line 35
    .line 36
    .line 37
    if-le v0, p1, :cond_2

    .line 38
    .line 39
    return v3

    .line 40
    :cond_2
    return v1
.end method

.method public M()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lj0/i;->t:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public S()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lt0/j;->x:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public T()I
    .locals 1

    .line 1
    iget v0, p0, Lt0/j;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public U()Z
    .locals 1

    .line 1
    iget v0, p0, Lt0/j;->y:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

.method public V(I)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lt0/j;->z:I

    .line 10
    .line 11
    return-void
.end method

.method public m()V
    .locals 1

    .line 1
    invoke-super {p0}, Lj0/i;->m()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lt0/j;->y:I

    .line 6
    .line 7
    return-void
.end method
