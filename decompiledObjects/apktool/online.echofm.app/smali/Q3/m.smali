.class public LQ3/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LV3/t;

.field public final b:LV3/k;


# direct methods
.method public constructor <init>(LV3/t;LV3/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ3/m;->a:LV3/t;

    iput-object p2, p0, LQ3/m;->b:LV3/k;

    invoke-virtual {p0}, LQ3/m;->c()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, LV3/C;->g(LV3/k;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ld4/n;)V
    .locals 2

    .line 2
    new-instance v0, LV3/t;

    invoke-direct {v0, p1}, LV3/t;-><init>(Ld4/n;)V

    new-instance p1, LV3/k;

    const-string v1, ""

    invoke-direct {p1, v1}, LV3/k;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, LQ3/m;-><init>(LV3/t;LV3/k;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/m;->b:LV3/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LV3/k;->X()Ld4/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LQ3/m;->b:LV3/k;

    .line 10
    .line 11
    invoke-virtual {v0}, LV3/k;->X()Ld4/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ld4/b;->e()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    return-object v0
.end method

.method public b()Ld4/n;
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/m;->a:LV3/t;

    .line 2
    .line 3
    iget-object v1, p0, LQ3/m;->b:LV3/k;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LV3/t;->a(LV3/k;)Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LQ3/m;->b()Ld4/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ld4/n;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public d(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/m;->b:LV3/k;

    .line 2
    .line 3
    invoke-static {v0, p1}, LV3/C;->g(LV3/k;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LZ3/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, LY3/n;->k(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LQ3/m;->a:LV3/t;

    .line 14
    .line 15
    iget-object v1, p0, LQ3/m;->b:LV3/k;

    .line 16
    .line 17
    invoke-static {p1}, Ld4/o;->a(Ljava/lang/Object;)Ld4/n;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, v1, p1}, LV3/t;->c(LV3/k;Ld4/n;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LQ3/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LQ3/m;->a:LV3/t;

    .line 6
    .line 7
    check-cast p1, LQ3/m;

    .line 8
    .line 9
    iget-object v1, p1, LQ3/m;->a:LV3/t;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LQ3/m;->b:LV3/k;

    .line 18
    .line 19
    iget-object p1, p1, LQ3/m;->b:LV3/k;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, LV3/k;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, LQ3/m;->b:LV3/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LV3/k;->Z()Ld4/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "MutableData { key = "

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Ld4/b;->e()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v0, "<none>"

    .line 25
    .line 26
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ", value = "

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LQ3/m;->a:LV3/t;

    .line 35
    .line 36
    invoke-virtual {v0}, LV3/t;->b()Ld4/n;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-interface {v0, v2}, Ld4/n;->L(Z)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, " }"

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method
