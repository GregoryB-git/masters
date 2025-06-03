.class public LQ3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ld4/i;

.field public final b:LQ3/e;


# direct methods
.method public constructor <init>(LQ3/e;Ld4/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LQ3/b;->a:Ld4/i;

    .line 5
    .line 6
    iput-object p1, p0, LQ3/b;->b:LQ3/e;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(LQ3/b;)LQ3/e;
    .locals 0

    .line 1
    iget-object p0, p0, LQ3/b;->b:LQ3/e;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/b;->a:Ld4/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld4/i;->k()Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ld4/n;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    return v0
.end method

.method public c()Ljava/lang/Iterable;
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/b;->a:Ld4/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld4/i;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LQ3/b$a;

    .line 8
    .line 9
    invoke-direct {v1, p0, v0}, LQ3/b$a;-><init>(LQ3/b;Ljava/util/Iterator;)V

    .line 10
    .line 11
    .line 12
    return-object v1
.end method

.method public d()J
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/b;->a:Ld4/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld4/i;->k()Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ld4/n;->E()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-long v0, v0

    .line 12
    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/b;->b:LQ3/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ3/e;->X()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/b;->a:Ld4/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld4/i;->k()Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ld4/n;->t()Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ld4/n;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v1, v0, Ljava/lang/Long;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    long-to-double v0, v0

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_0
    return-object v0
.end method

.method public g()LQ3/e;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/b;->b:LQ3/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/b;->a:Ld4/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld4/i;->k()Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ld4/n;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public i(Z)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/b;->a:Ld4/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld4/i;->k()Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Ld4/n;->L(Z)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "DataSnapshot { key = "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LQ3/b;->b:LQ3/e;

    .line 12
    .line 13
    invoke-virtual {v1}, LQ3/e;->X()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", value = "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, LQ3/b;->a:Ld4/i;

    .line 26
    .line 27
    invoke-virtual {v1}, Ld4/i;->k()Ld4/n;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-interface {v1, v2}, Ld4/n;->L(Z)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, " }"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0
.end method
