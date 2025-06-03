.class public final La4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LV3/k;

.field public final b:La4/h;


# direct methods
.method public constructor <init>(LV3/k;La4/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La4/i;->a:LV3/k;

    .line 5
    .line 6
    iput-object p2, p0, La4/i;->b:La4/h;

    .line 7
    .line 8
    return-void
.end method

.method public static a(LV3/k;)La4/i;
    .locals 2

    .line 1
    new-instance v0, La4/i;

    .line 2
    .line 3
    sget-object v1, La4/h;->i:La4/h;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, La4/i;-><init>(LV3/k;La4/h;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static b(LV3/k;Ljava/util/Map;)La4/i;
    .locals 1

    .line 1
    invoke-static {p1}, La4/h;->c(Ljava/util/Map;)La4/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La4/i;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, La4/i;-><init>(LV3/k;La4/h;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public c()Ld4/h;
    .locals 1

    .line 1
    iget-object v0, p0, La4/i;->b:La4/h;

    .line 2
    .line 3
    invoke-virtual {v0}, La4/h;->d()Ld4/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d()La4/h;
    .locals 1

    .line 1
    iget-object v0, p0, La4/i;->b:La4/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()LV3/k;
    .locals 1

    .line 1
    iget-object v0, p0, La4/i;->a:LV3/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_4

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, La4/i;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, La4/i;

    .line 18
    .line 19
    iget-object v2, p0, La4/i;->a:LV3/k;

    .line 20
    .line 21
    iget-object v3, p1, La4/i;->a:LV3/k;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, LV3/k;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    iget-object v2, p0, La4/i;->b:La4/h;

    .line 31
    .line 32
    iget-object p1, p1, La4/i;->b:La4/h;

    .line 33
    .line 34
    invoke-virtual {v2, p1}, La4/h;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_3

    .line 39
    .line 40
    return v1

    .line 41
    :cond_3
    return v0

    .line 42
    :cond_4
    :goto_0
    return v1
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, La4/i;->b:La4/h;

    .line 2
    .line 3
    invoke-virtual {v0}, La4/h;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object v0, p0, La4/i;->b:La4/h;

    .line 2
    .line 3
    invoke-virtual {v0}, La4/h;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, La4/i;->a:LV3/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LV3/k;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, La4/i;->b:La4/h;

    .line 10
    .line 11
    invoke-virtual {v1}, La4/h;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La4/i;->a:LV3/k;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ":"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, La4/i;->b:La4/h;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method
