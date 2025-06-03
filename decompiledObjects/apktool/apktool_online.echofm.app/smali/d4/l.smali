.class public Ld4/l;
.super Ld4/k;
.source "SourceFile"


# instance fields
.field public final q:J


# direct methods
.method public constructor <init>(Ljava/lang/Long;Ld4/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ld4/k;-><init>(Ld4/n;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 5
    .line 6
    .line 7
    move-result-wide p1

    .line 8
    iput-wide p1, p0, Ld4/l;->q:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic J(Ld4/n;)Ld4/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ld4/l;->W(Ld4/n;)Ld4/l;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public O(Ld4/n$b;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ld4/k;->T(Ld4/n$b;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p1, "number:"

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-wide v1, p0, Ld4/l;->q:J

    .line 31
    .line 32
    long-to-double v1, v1

    .line 33
    invoke-static {v1, v2}, LY3/m;->c(D)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
.end method

.method public S()Ld4/k$b;
    .locals 1

    .line 1
    sget-object v0, Ld4/k$b;->q:Ld4/k$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public V(Ld4/l;)I
    .locals 4

    .line 1
    iget-wide v0, p0, Ld4/l;->q:J

    .line 2
    .line 3
    iget-wide v2, p1, Ld4/l;->q:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, LY3/m;->b(JJ)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public W(Ld4/n;)Ld4/l;
    .locals 3

    .line 1
    new-instance v0, Ld4/l;

    .line 2
    .line 3
    iget-wide v1, p0, Ld4/l;->q:J

    .line 4
    .line 5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1, p1}, Ld4/l;-><init>(Ljava/lang/Long;Ld4/n;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    instance-of v0, p1, Ld4/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Ld4/l;

    .line 8
    .line 9
    iget-wide v2, p0, Ld4/l;->q:J

    .line 10
    .line 11
    iget-wide v4, p1, Ld4/l;->q:J

    .line 12
    .line 13
    cmp-long v0, v2, v4

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Ld4/k;->o:Ld4/n;

    .line 18
    .line 19
    iget-object p1, p1, Ld4/k;->o:Ld4/n;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    :cond_1
    return v1
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-wide v0, p0, Ld4/l;->q:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Ld4/l;->q:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    ushr-long v2, v0, v2

    .line 6
    .line 7
    xor-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    iget-object v1, p0, Ld4/k;->o:Ld4/n;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0
.end method

.method public bridge synthetic s(Ld4/k;)I
    .locals 0

    .line 1
    check-cast p1, Ld4/l;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld4/l;->V(Ld4/l;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
