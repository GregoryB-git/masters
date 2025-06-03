.class public final Ld0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv5/u;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lv5/u;-><init>(I)V

    iput-object v0, p0, Ld0/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ld0/c;->b:Ljava/lang/Object;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The max pool size must be > 0"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ld0/c;->a:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    iget-object v2, p0, Ld0/c;->b:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    aget-object v2, v2, v0

    const-string v3, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool"

    invoke-static {v2, v3}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Ld0/c;->b:Ljava/lang/Object;

    check-cast v3, [Ljava/lang/Object;

    aput-object v1, v3, v0

    iget v0, p0, Ld0/c;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ld0/c;->a:I

    return-object v2

    :cond_0
    return-object v1
.end method

.method public final b(Lc4/e;)J
    .locals 6

    .line 1
    iget-object v0, p0, Ld0/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv5/u;

    .line 4
    .line 5
    iget-object v0, v0, Lv5/u;->a:[B

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {p1, v0, v1, v2, v1}, Lc4/e;->c([BIIZ)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ld0/c;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lv5/u;

    .line 15
    .line 16
    iget-object v0, v0, Lv5/u;->a:[B

    .line 17
    .line 18
    aget-byte v0, v0, v1

    .line 19
    .line 20
    and-int/lit16 v0, v0, 0xff

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const-wide/high16 v0, -0x8000000000000000L

    .line 25
    .line 26
    return-wide v0

    .line 27
    :cond_0
    const/16 v3, 0x80

    .line 28
    .line 29
    move v4, v1

    .line 30
    :goto_0
    and-int v5, v0, v3

    .line 31
    .line 32
    if-nez v5, :cond_1

    .line 33
    .line 34
    shr-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    add-int/lit8 v4, v4, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    not-int v3, v3

    .line 40
    and-int/2addr v0, v3

    .line 41
    iget-object v3, p0, Ld0/c;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lv5/u;

    .line 44
    .line 45
    iget-object v3, v3, Lv5/u;->a:[B

    .line 46
    .line 47
    invoke-virtual {p1, v3, v2, v4, v1}, Lc4/e;->c([BIIZ)Z

    .line 48
    .line 49
    .line 50
    :goto_1
    if-ge v1, v4, :cond_2

    .line 51
    .line 52
    shl-int/lit8 p1, v0, 0x8

    .line 53
    .line 54
    iget-object v0, p0, Ld0/c;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lv5/u;

    .line 57
    .line 58
    iget-object v0, v0, Lv5/u;->a:[B

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    aget-byte v0, v0, v1

    .line 63
    .line 64
    and-int/lit16 v0, v0, 0xff

    .line 65
    .line 66
    add-int/2addr v0, p1

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iget p1, p0, Ld0/c;->a:I

    .line 69
    .line 70
    add-int/2addr v4, v2

    .line 71
    add-int/2addr v4, p1

    .line 72
    iput v4, p0, Ld0/c;->a:I

    .line 73
    .line 74
    int-to-long v0, v0

    .line 75
    return-wide v0
    .line 76
    .line 77
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 5

    .line 1
    const-string v0, "instance"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ld0/c;->a:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    const/4 v3, 0x1

    .line 11
    if-ge v2, v0, :cond_1

    .line 12
    .line 13
    iget-object v4, p0, Ld0/c;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, [Ljava/lang/Object;

    .line 16
    .line 17
    aget-object v4, v4, v2

    .line 18
    .line 19
    if-ne v4, p1, :cond_0

    .line 20
    .line 21
    move v1, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    :goto_1
    xor-int/lit8 v0, v1, 0x1

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget v0, p0, Ld0/c;->a:I

    .line 31
    .line 32
    iget-object v1, p0, Ld0/c;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, [Ljava/lang/Object;

    .line 35
    .line 36
    array-length v2, v1

    .line 37
    if-ge v0, v2, :cond_2

    .line 38
    .line 39
    aput-object p1, v1, v0

    .line 40
    .line 41
    add-int/2addr v0, v3

    .line 42
    iput v0, p0, Ld0/c;->a:I

    .line 43
    .line 44
    :cond_2
    return-void

    .line 45
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "Already in the pool!"

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
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
.end method
