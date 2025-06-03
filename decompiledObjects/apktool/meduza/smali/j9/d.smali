.class public final Lj9/d;
.super Lj9/k$c;
.source "SourceFile"


# instance fields
.field public final a:Lj9/l;

.field public final b:I


# direct methods
.method public constructor <init>(Lj9/l;I)V
    .locals 0

    invoke-direct {p0}, Lj9/k$c;-><init>()V

    if-eqz p1, :cond_1

    iput-object p1, p0, Lj9/d;->a:Lj9/l;

    if-eqz p2, :cond_0

    iput p2, p0, Lj9/d;->b:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null kind"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null fieldPath"

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
    instance-of v1, p1, Lj9/k$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lj9/k$c;

    iget-object v1, p0, Lj9/d;->a:Lj9/l;

    invoke-virtual {p1}, Lj9/k$c;->f()Lj9/l;

    move-result-object v3

    invoke-virtual {v1, v3}, Lj9/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lj9/d;->b:I

    invoke-virtual {p1}, Lj9/k$c;->g()I

    move-result p1

    invoke-static {v1, p1}, Lq0/g;->b(II)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public final f()Lj9/l;
    .locals 1

    iget-object v0, p0, Lj9/d;->a:Lj9/l;

    return-object v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lj9/d;->b:I

    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lj9/d;->a:Lj9/l;

    invoke-virtual {v0}, Lj9/e;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v1, p0, Lj9/d;->b:I

    invoke-static {v1}, Lq0/g;->c(I)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "Segment{fieldPath="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lj9/d;->a:Lj9/l;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, ", kind="

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lj9/d;->b:I

    .line 18
    .line 19
    invoke-static {v1}, Lf;->r(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, "}"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
