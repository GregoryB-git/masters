.class public final Lh5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[[B

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    filled-new-array {p2, p1}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, [[B

    .line 15
    .line 16
    iput-object v0, p0, Lh5/b;->a:[[B

    .line 17
    .line 18
    iput p1, p0, Lh5/b;->b:I

    .line 19
    .line 20
    iput p2, p0, Lh5/b;->c:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a(B)V
    .locals 4

    .line 1
    iget-object v0, p0, Lh5/b;->a:[[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-static {v3, p1}, Ljava/util/Arrays;->fill([BB)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public b(II)B
    .locals 1

    .line 1
    iget-object v0, p0, Lh5/b;->a:[[B

    .line 2
    .line 3
    aget-object p2, v0, p2

    .line 4
    .line 5
    aget-byte p1, p2, p1

    .line 6
    .line 7
    return p1
.end method

.method public c()[[B
    .locals 1

    .line 1
    iget-object v0, p0, Lh5/b;->a:[[B

    .line 2
    .line 3
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lh5/b;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lh5/b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public f(III)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh5/b;->a:[[B

    .line 2
    .line 3
    aget-object p2, v0, p2

    .line 4
    .line 5
    int-to-byte p3, p3

    .line 6
    aput-byte p3, p2, p1

    .line 7
    .line 8
    return-void
.end method

.method public g(IIZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh5/b;->a:[[B

    .line 2
    .line 3
    aget-object p2, v0, p2

    .line 4
    .line 5
    int-to-byte p3, p3

    .line 6
    aput-byte p3, p2, p1

    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget v1, p0, Lh5/b;->b:I

    .line 4
    .line 5
    mul-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    iget v2, p0, Lh5/b;->c:I

    .line 8
    .line 9
    mul-int/2addr v1, v2

    .line 10
    add-int/lit8 v1, v1, 0x2

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    iget v3, p0, Lh5/b;->c:I

    .line 18
    .line 19
    if-ge v2, v3, :cond_3

    .line 20
    .line 21
    iget-object v3, p0, Lh5/b;->a:[[B

    .line 22
    .line 23
    aget-object v3, v3, v2

    .line 24
    .line 25
    move v4, v1

    .line 26
    :goto_1
    iget v5, p0, Lh5/b;->b:I

    .line 27
    .line 28
    if-ge v4, v5, :cond_2

    .line 29
    .line 30
    aget-byte v5, v3, v4

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    if-eq v5, v6, :cond_0

    .line 36
    .line 37
    const-string v5, "  "

    .line 38
    .line 39
    :goto_2
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_0
    const-string v5, " 1"

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string v5, " 0"

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/16 v3, 0xa

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0
.end method
