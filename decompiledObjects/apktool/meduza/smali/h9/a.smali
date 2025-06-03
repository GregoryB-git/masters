.class public final Lh9/a;
.super Lh9/d;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lj9/i;

.field public final c:[B

.field public final d:[B


# direct methods
.method public constructor <init>(ILj9/i;[B[B)V
    .locals 0

    invoke-direct {p0}, Lh9/d;-><init>()V

    iput p1, p0, Lh9/a;->a:I

    if-eqz p2, :cond_2

    iput-object p2, p0, Lh9/a;->b:Lj9/i;

    if-eqz p3, :cond_1

    iput-object p3, p0, Lh9/a;->c:[B

    if-eqz p4, :cond_0

    iput-object p4, p0, Lh9/a;->d:[B

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null directionalValue"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null arrayValue"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null documentKey"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh9/d;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast p1, Lh9/d;

    iget v1, p0, Lh9/a;->a:I

    invoke-virtual {p1}, Lh9/d;->i()I

    move-result v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lh9/a;->b:Lj9/i;

    invoke-virtual {p1}, Lh9/d;->h()Lj9/i;

    move-result-object v3

    invoke-virtual {v1, v3}, Lj9/i;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lh9/a;->c:[B

    instance-of v3, p1, Lh9/a;

    if-eqz v3, :cond_1

    move-object v4, p1

    check-cast v4, Lh9/a;

    iget-object v4, v4, Lh9/a;->c:[B

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lh9/d;->f()[B

    move-result-object v4

    :goto_0
    invoke-static {v1, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lh9/a;->d:[B

    if-eqz v3, :cond_2

    check-cast p1, Lh9/a;

    iget-object p1, p1, Lh9/a;->d:[B

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lh9/d;->g()[B

    move-result-object p1

    :goto_1
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    move v0, v2

    :goto_2
    return v0

    :cond_4
    return v2
.end method

.method public final f()[B
    .locals 1

    iget-object v0, p0, Lh9/a;->c:[B

    return-object v0
.end method

.method public final g()[B
    .locals 1

    iget-object v0, p0, Lh9/a;->d:[B

    return-object v0
.end method

.method public final h()Lj9/i;
    .locals 1

    iget-object v0, p0, Lh9/a;->b:Lj9/i;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lh9/a;->a:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lh9/a;->b:Lj9/i;

    invoke-virtual {v2}, Lj9/i;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lh9/a;->c:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lh9/a;->d:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lh9/a;->a:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "IndexEntry{indexId="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lh9/a;->a:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, ", documentKey="

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lh9/a;->b:Lj9/i;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", arrayValue="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lh9/a;->c:[B

    .line 28
    .line 29
    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", directionalValue="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lh9/a;->d:[B

    .line 42
    .line 43
    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, "}"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
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
.end method
