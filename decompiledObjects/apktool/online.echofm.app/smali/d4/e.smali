.class public Ld4/e;
.super Ld4/k;
.source "SourceFile"


# instance fields
.field public q:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Map;Ld4/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ld4/k;-><init>(Ld4/n;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld4/e;->q:Ljava/util/Map;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic J(Ld4/n;)Ld4/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ld4/e;->W(Ld4/n;)Ld4/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public O(Ld4/n$b;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ld4/k;->T(Ld4/n$b;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p1, "deferredValue:"

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Ld4/e;->q:Ljava/util/Map;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public S()Ld4/k$b;
    .locals 1

    .line 1
    sget-object v0, Ld4/k$b;->o:Ld4/k$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public V(Ld4/e;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public W(Ld4/n;)Ld4/e;
    .locals 2

    .line 1
    invoke-static {p1}, Ld4/r;->b(Ld4/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, LY3/m;->f(Z)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ld4/e;

    .line 9
    .line 10
    iget-object v1, p0, Ld4/e;->q:Ljava/util/Map;

    .line 11
    .line 12
    invoke-direct {v0, v1, p1}, Ld4/e;-><init>(Ljava/util/Map;Ld4/n;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ld4/e;

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
    check-cast p1, Ld4/e;

    .line 8
    .line 9
    iget-object v0, p0, Ld4/e;->q:Ljava/util/Map;

    .line 10
    .line 11
    iget-object v2, p1, Ld4/e;->q:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0, v2}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Ld4/k;->o:Ld4/n;

    .line 20
    .line 21
    iget-object p1, p1, Ld4/k;->o:Ld4/n;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    :cond_1
    return v1
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ld4/e;->q:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Ld4/e;->q:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Ld4/k;->o:Ld4/n;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v0, v1

    .line 14
    return v0
.end method

.method public bridge synthetic s(Ld4/k;)I
    .locals 0

    .line 1
    check-cast p1, Ld4/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld4/e;->V(Ld4/e;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
