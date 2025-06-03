.class public final LX0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX0/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX0/a$b;
    }
.end annotation


# instance fields
.field public final a:[B

.field public final b:Ljava/util/ArrayDeque;

.field public final c:LX0/g;

.field public d:LX0/b;

.field public e:I

.field public f:I

.field public g:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, LX0/a;->a:[B

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LX0/a;->b:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    new-instance v0, LX0/g;

    .line 18
    .line 19
    invoke-direct {v0}, LX0/g;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, LX0/a;->c:LX0/g;

    .line 23
    .line 24
    return-void
.end method

.method public static g(LF0/s;I)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-array v0, p1, [B

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-interface {p0, v0, v1, p1}, LF0/s;->readFully([BII)V

    .line 10
    .line 11
    .line 12
    :goto_0
    if-lez p1, :cond_1

    .line 13
    .line 14
    add-int/lit8 p0, p1, -0x1

    .line 15
    .line 16
    aget-byte p0, v0, p0

    .line 17
    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    add-int/lit8 p1, p1, -0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {p0, v0, v1, p1}, Ljava/lang/String;-><init>([BII)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method


# virtual methods
.method public final a(LF0/s;)J
    .locals 4

    .line 1
    invoke-interface {p1}, LF0/s;->h()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget-object v0, p0, LX0/a;->a:[B

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x4

    .line 8
    invoke-interface {p1, v0, v1, v2}, LF0/s;->n([BII)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LX0/a;->a:[B

    .line 12
    .line 13
    aget-byte v0, v0, v1

    .line 14
    .line 15
    invoke-static {v0}, LX0/g;->c(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v3, -0x1

    .line 20
    if-eq v0, v3, :cond_0

    .line 21
    .line 22
    if-gt v0, v2, :cond_0

    .line 23
    .line 24
    iget-object v2, p0, LX0/a;->a:[B

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, LX0/g;->a([BIZ)J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    long-to-int v1, v1

    .line 31
    iget-object v2, p0, LX0/a;->d:LX0/b;

    .line 32
    .line 33
    invoke-interface {v2, v1}, LX0/b;->d(I)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-interface {p1, v0}, LF0/s;->i(I)V

    .line 40
    .line 41
    .line 42
    int-to-long v0, v1

    .line 43
    return-wide v0

    .line 44
    :cond_0
    const/4 v0, 0x1

    .line 45
    invoke-interface {p1, v0}, LF0/s;->i(I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LX0/a;->e:I

    .line 3
    .line 4
    iget-object v0, p0, LX0/a;->b:Ljava/util/ArrayDeque;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LX0/a;->c:LX0/g;

    .line 10
    .line 11
    invoke-virtual {v0}, LX0/g;->e()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public c(LF0/s;)Z
    .locals 12

    .line 1
    iget-object v0, p0, LX0/a;->d:LX0/b;

    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, LX0/a;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX0/a$b;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p1}, LF0/s;->p()J

    move-result-wide v2

    invoke-static {v0}, LX0/a$b;->a(LX0/a$b;)J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-ltz v0, :cond_0

    iget-object p1, p0, LX0/a;->d:LX0/b;

    iget-object v0, p0, LX0/a;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX0/a$b;

    invoke-static {v0}, LX0/a$b;->b(LX0/a$b;)I

    move-result v0

    invoke-interface {p1, v0}, LX0/b;->a(I)V

    return v1

    :cond_0
    iget v0, p0, LX0/a;->e:I

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-nez v0, :cond_3

    iget-object v0, p0, LX0/a;->c:LX0/g;

    invoke-virtual {v0, p1, v1, v3, v2}, LX0/g;->d(LF0/s;ZZI)J

    move-result-wide v4

    const-wide/16 v6, -0x2

    cmp-long v0, v4, v6

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, LX0/a;->a(LF0/s;)J

    move-result-wide v4

    :cond_1
    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    return v3

    :cond_2
    long-to-int v0, v4

    iput v0, p0, LX0/a;->f:I

    iput v1, p0, LX0/a;->e:I

    :cond_3
    iget v0, p0, LX0/a;->e:I

    const/4 v4, 0x2

    if-ne v0, v1, :cond_4

    iget-object v0, p0, LX0/a;->c:LX0/g;

    const/16 v5, 0x8

    invoke-virtual {v0, p1, v3, v1, v5}, LX0/g;->d(LF0/s;ZZI)J

    move-result-wide v5

    iput-wide v5, p0, LX0/a;->g:J

    iput v4, p0, LX0/a;->e:I

    :cond_4
    iget-object v0, p0, LX0/a;->d:LX0/b;

    iget v5, p0, LX0/a;->f:I

    invoke-interface {v0, v5}, LX0/b;->b(I)I

    move-result v0

    if-eqz v0, :cond_e

    const/4 v5, 0x0

    if-eq v0, v1, :cond_d

    const-wide/16 v6, 0x8

    if-eq v0, v4, :cond_b

    const/4 v4, 0x3

    if-eq v0, v4, :cond_9

    if-eq v0, v2, :cond_8

    const/4 v2, 0x5

    if-ne v0, v2, :cond_7

    iget-wide v8, p0, LX0/a;->g:J

    const-wide/16 v10, 0x4

    cmp-long v0, v8, v10

    if-eqz v0, :cond_6

    cmp-long v0, v8, v6

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid float size: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, LX0/a;->g:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_6
    :goto_1
    iget-object v0, p0, LX0/a;->d:LX0/b;

    iget v2, p0, LX0/a;->f:I

    long-to-int v4, v8

    invoke-virtual {p0, p1, v4}, LX0/a;->e(LF0/s;I)D

    move-result-wide v4

    invoke-interface {v0, v2, v4, v5}, LX0/b;->c(ID)V

    iput v3, p0, LX0/a;->e:I

    return v1

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid element type "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_8
    iget-object v0, p0, LX0/a;->d:LX0/b;

    iget v2, p0, LX0/a;->f:I

    iget-wide v4, p0, LX0/a;->g:J

    long-to-int v4, v4

    invoke-interface {v0, v2, v4, p1}, LX0/b;->e(IILF0/s;)V

    iput v3, p0, LX0/a;->e:I

    return v1

    :cond_9
    iget-wide v6, p0, LX0/a;->g:J

    const-wide/32 v8, 0x7fffffff

    cmp-long v0, v6, v8

    if-gtz v0, :cond_a

    iget-object v0, p0, LX0/a;->d:LX0/b;

    iget v2, p0, LX0/a;->f:I

    long-to-int v4, v6

    invoke-static {p1, v4}, LX0/a;->g(LF0/s;I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, p1}, LX0/b;->f(ILjava/lang/String;)V

    iput v3, p0, LX0/a;->e:I

    return v1

    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "String element size: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, LX0/a;->g:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_b
    iget-wide v8, p0, LX0/a;->g:J

    cmp-long v0, v8, v6

    if-gtz v0, :cond_c

    iget-object v0, p0, LX0/a;->d:LX0/b;

    iget v2, p0, LX0/a;->f:I

    long-to-int v4, v8

    invoke-virtual {p0, p1, v4}, LX0/a;->f(LF0/s;I)J

    move-result-wide v4

    invoke-interface {v0, v2, v4, v5}, LX0/b;->h(IJ)V

    iput v3, p0, LX0/a;->e:I

    return v1

    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid integer size: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, LX0/a;->g:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_d
    invoke-interface {p1}, LF0/s;->p()J

    move-result-wide v6

    iget-wide v8, p0, LX0/a;->g:J

    add-long/2addr v8, v6

    iget-object p1, p0, LX0/a;->b:Ljava/util/ArrayDeque;

    new-instance v0, LX0/a$b;

    iget v2, p0, LX0/a;->f:I

    invoke-direct {v0, v2, v8, v9, v5}, LX0/a$b;-><init>(IJLX0/a$a;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-object v4, p0, LX0/a;->d:LX0/b;

    iget v5, p0, LX0/a;->f:I

    iget-wide v8, p0, LX0/a;->g:J

    invoke-interface/range {v4 .. v9}, LX0/b;->g(IJJ)V

    iput v3, p0, LX0/a;->e:I

    return v1

    :cond_e
    iget-wide v0, p0, LX0/a;->g:J

    long-to-int v0, v0

    invoke-interface {p1, v0}, LF0/s;->i(I)V

    iput v3, p0, LX0/a;->e:I

    goto/16 :goto_0
.end method

.method public d(LX0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX0/a;->d:LX0/b;

    .line 2
    .line 3
    return-void
.end method

.method public final e(LF0/s;I)D
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, LX0/a;->f(LF0/s;I)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 p1, 0x4

    .line 6
    if-ne p2, p1, :cond_0

    .line 7
    .line 8
    long-to-int p1, v0

    .line 9
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    float-to-double p1, p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    :goto_0
    return-wide p1
.end method

.method public final f(LF0/s;I)J
    .locals 6

    .line 1
    iget-object v0, p0, LX0/a;->a:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p1, v0, v1, p2}, LF0/s;->readFully([BII)V

    .line 5
    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    :goto_0
    if-ge v1, p2, :cond_0

    .line 10
    .line 11
    const/16 p1, 0x8

    .line 12
    .line 13
    shl-long/2addr v2, p1

    .line 14
    iget-object p1, p0, LX0/a;->a:[B

    .line 15
    .line 16
    aget-byte p1, p1, v1

    .line 17
    .line 18
    and-int/lit16 p1, p1, 0xff

    .line 19
    .line 20
    int-to-long v4, p1

    .line 21
    or-long/2addr v2, v4

    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-wide v2
.end method
