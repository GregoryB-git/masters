.class public Ld4/a;
.super Ld4/k;
.source "SourceFile"


# instance fields
.field public final q:Z


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Ld4/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ld4/k;-><init>(Ld4/n;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput-boolean p1, p0, Ld4/a;->q:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic J(Ld4/n;)Ld4/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ld4/a;->W(Ld4/n;)Ld4/a;

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
    const-string p1, "boolean:"

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean p1, p0, Ld4/a;->q:Z

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

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
    sget-object v0, Ld4/k$b;->p:Ld4/k$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public V(Ld4/a;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Ld4/a;->q:Z

    .line 2
    .line 3
    iget-boolean p1, p1, Ld4/a;->q:Z

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 p1, -0x1

    .line 14
    :goto_0
    return p1
.end method

.method public W(Ld4/n;)Ld4/a;
    .locals 2

    .line 1
    new-instance v0, Ld4/a;

    .line 2
    .line 3
    iget-boolean v1, p0, Ld4/a;->q:Z

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1, p1}, Ld4/a;-><init>(Ljava/lang/Boolean;Ld4/n;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ld4/a;

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
    check-cast p1, Ld4/a;

    .line 8
    .line 9
    iget-boolean v0, p0, Ld4/a;->q:Z

    .line 10
    .line 11
    iget-boolean v2, p1, Ld4/a;->q:Z

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Ld4/k;->o:Ld4/n;

    .line 16
    .line 17
    iget-object p1, p1, Ld4/k;->o:Ld4/n;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    :cond_1
    return v1
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, Ld4/a;->q:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Ld4/a;->q:Z

    .line 2
    .line 3
    iget-object v1, p0, Ld4/k;->o:Ld4/n;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    return v0
.end method

.method public bridge synthetic s(Ld4/k;)I
    .locals 0

    .line 1
    check-cast p1, Ld4/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld4/a;->V(Ld4/a;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
