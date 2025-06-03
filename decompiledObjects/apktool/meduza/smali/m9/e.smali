.class public final Lm9/e;
.super Lm9/m0$a;
.source "SourceFile"


# instance fields
.field public final a:Lm9/g;

.field public final b:Z

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(Lm9/g;ZIII)V
    .locals 0

    invoke-direct {p0}, Lm9/m0$a;-><init>()V

    iput-object p1, p0, Lm9/e;->a:Lm9/g;

    iput-boolean p2, p0, Lm9/e;->b:Z

    iput p3, p0, Lm9/e;->c:I

    iput p4, p0, Lm9/e;->d:I

    iput p5, p0, Lm9/e;->e:I

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lm9/e;->b:Z

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lm9/e;->d:I

    return v0
.end method

.method public final c()Lm9/g;
    .locals 1

    iget-object v0, p0, Lm9/e;->a:Lm9/g;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lm9/e;->c:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lm9/e;->e:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm9/m0$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, Lm9/m0$a;

    iget-object v1, p0, Lm9/e;->a:Lm9/g;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lm9/m0$a;->c()Lm9/g;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lm9/m0$a;->c()Lm9/g;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iget-boolean v1, p0, Lm9/e;->b:Z

    invoke-virtual {p1}, Lm9/m0$a;->a()Z

    move-result v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Lm9/e;->c:I

    invoke-virtual {p1}, Lm9/m0$a;->d()I

    move-result v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Lm9/e;->d:I

    invoke-virtual {p1}, Lm9/m0$a;->b()I

    move-result v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Lm9/e;->e:I

    invoke-virtual {p1}, Lm9/m0$a;->e()I

    move-result p1

    if-ne v1, p1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    return v0

    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lm9/e;->a:Lm9/g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lm9/e;->b:Z

    if-eqz v2, :cond_1

    const/16 v2, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v2, 0x4d5

    :goto_1
    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lm9/e;->c:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lm9/e;->d:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, Lm9/e;->e:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "ExistenceFilterBloomFilterInfo{bloomFilter="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lm9/e;->a:Lm9/g;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, ", applied="

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-boolean v1, p0, Lm9/e;->b:Z

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", hashCount="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget v1, p0, Lm9/e;->c:I

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ", bitmapLength="

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget v1, p0, Lm9/e;->d:I

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", padding="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget v1, p0, Lm9/e;->e:I

    .line 48
    .line 49
    const-string v2, "}"

    .line 50
    .line 51
    invoke-static {v0, v1, v2}, La0/j;->m(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
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
.end method
