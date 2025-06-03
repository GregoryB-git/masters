.class public final Lj9/b;
.super Lj9/k$a;
.source "SourceFile"


# instance fields
.field public final c:Lj9/q;

.field public final d:Lj9/i;

.field public final e:I


# direct methods
.method public constructor <init>(Lj9/q;Lj9/i;I)V
    .locals 0

    invoke-direct {p0}, Lj9/k$a;-><init>()V

    if-eqz p1, :cond_1

    iput-object p1, p0, Lj9/b;->c:Lj9/q;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lj9/b;->d:Lj9/i;

    iput p3, p0, Lj9/b;->e:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null documentKey"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null readTime"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj9/k$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lj9/k$a;

    iget-object v1, p0, Lj9/b;->c:Lj9/q;

    invoke-virtual {p1}, Lj9/k$a;->l()Lj9/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lj9/q;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj9/b;->d:Lj9/i;

    invoke-virtual {p1}, Lj9/k$a;->h()Lj9/i;

    move-result-object v3

    invoke-virtual {v1, v3}, Lj9/i;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lj9/b;->e:I

    invoke-virtual {p1}, Lj9/k$a;->i()I

    move-result p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public final h()Lj9/i;
    .locals 1

    iget-object v0, p0, Lj9/b;->d:Lj9/i;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lj9/b;->c:Lj9/q;

    invoke-virtual {v0}, Lj9/q;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lj9/b;->d:Lj9/i;

    invoke-virtual {v2}, Lj9/i;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, Lj9/b;->e:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lj9/b;->e:I

    return v0
.end method

.method public final l()Lj9/q;
    .locals 1

    iget-object v0, p0, Lj9/b;->c:Lj9/q;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "IndexOffset{readTime="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lj9/b;->c:Lj9/q;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
    iget-object v1, p0, Lj9/b;->d:Lj9/i;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", largestBatchId="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget v1, p0, Lj9/b;->e:I

    .line 28
    .line 29
    const-string v2, "}"

    .line 30
    .line 31
    invoke-static {v0, v1, v2}, La0/j;->m(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
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
.end method
