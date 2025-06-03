.class public final Lm8/b0;
.super Lm8/g0;
.source "SourceFile"


# instance fields
.field public final a:Lm8/g0$a;

.field public final b:Lm8/g0$c;

.field public final c:Lm8/g0$b;


# direct methods
.method public constructor <init>(Lm8/c0;Lm8/e0;Lm8/d0;)V
    .locals 0

    invoke-direct {p0}, Lm8/g0;-><init>()V

    iput-object p1, p0, Lm8/b0;->a:Lm8/g0$a;

    iput-object p2, p0, Lm8/b0;->b:Lm8/g0$c;

    iput-object p3, p0, Lm8/b0;->c:Lm8/g0$b;

    return-void
.end method


# virtual methods
.method public final a()Lm8/g0$a;
    .locals 1

    iget-object v0, p0, Lm8/b0;->a:Lm8/g0$a;

    return-object v0
.end method

.method public final b()Lm8/g0$b;
    .locals 1

    iget-object v0, p0, Lm8/b0;->c:Lm8/g0$b;

    return-object v0
.end method

.method public final c()Lm8/g0$c;
    .locals 1

    iget-object v0, p0, Lm8/b0;->b:Lm8/g0$c;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm8/g0;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lm8/g0;

    iget-object v1, p0, Lm8/b0;->a:Lm8/g0$a;

    invoke-virtual {p1}, Lm8/g0;->a()Lm8/g0$a;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lm8/b0;->b:Lm8/g0$c;

    invoke-virtual {p1}, Lm8/g0;->c()Lm8/g0$c;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lm8/b0;->c:Lm8/g0$b;

    invoke-virtual {p1}, Lm8/g0;->b()Lm8/g0$b;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lm8/b0;->a:Lm8/g0$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm8/b0;->b:Lm8/g0$c;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lm8/b0;->c:Lm8/g0$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "StaticSessionData{appData="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lm8/b0;->a:Lm8/g0$a;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, ", osData="

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lm8/b0;->b:Lm8/g0$c;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", deviceData="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lm8/b0;->c:Lm8/g0$b;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, "}"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
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
