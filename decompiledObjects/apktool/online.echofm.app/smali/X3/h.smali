.class public final LX3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:La4/i;

.field public final c:J

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(JLa4/i;JZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LX3/h;->a:J

    .line 5
    .line 6
    invoke-virtual {p3}, La4/i;->g()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p3}, La4/i;->f()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string p2, "Can\'t create TrackedQuery for a non-default query that loads all data"

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    :goto_0
    iput-object p3, p0, LX3/h;->b:La4/i;

    .line 28
    .line 29
    iput-wide p4, p0, LX3/h;->c:J

    .line 30
    .line 31
    iput-boolean p6, p0, LX3/h;->d:Z

    .line 32
    .line 33
    iput-boolean p7, p0, LX3/h;->e:Z

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public a(Z)LX3/h;
    .locals 9

    .line 1
    new-instance v8, LX3/h;

    .line 2
    .line 3
    iget-wide v1, p0, LX3/h;->a:J

    .line 4
    .line 5
    iget-object v3, p0, LX3/h;->b:La4/i;

    .line 6
    .line 7
    iget-wide v4, p0, LX3/h;->c:J

    .line 8
    .line 9
    iget-boolean v6, p0, LX3/h;->d:Z

    .line 10
    .line 11
    move-object v0, v8

    .line 12
    move v7, p1

    .line 13
    invoke-direct/range {v0 .. v7}, LX3/h;-><init>(JLa4/i;JZZ)V

    .line 14
    .line 15
    .line 16
    return-object v8
.end method

.method public b()LX3/h;
    .locals 9

    .line 1
    new-instance v8, LX3/h;

    .line 2
    .line 3
    iget-wide v1, p0, LX3/h;->a:J

    .line 4
    .line 5
    iget-object v3, p0, LX3/h;->b:La4/i;

    .line 6
    .line 7
    iget-wide v4, p0, LX3/h;->c:J

    .line 8
    .line 9
    const/4 v6, 0x1

    .line 10
    iget-boolean v7, p0, LX3/h;->e:Z

    .line 11
    .line 12
    move-object v0, v8

    .line 13
    invoke-direct/range {v0 .. v7}, LX3/h;-><init>(JLa4/i;JZZ)V

    .line 14
    .line 15
    .line 16
    return-object v8
.end method

.method public c(J)LX3/h;
    .locals 9

    .line 1
    new-instance v8, LX3/h;

    .line 2
    .line 3
    iget-wide v1, p0, LX3/h;->a:J

    .line 4
    .line 5
    iget-object v3, p0, LX3/h;->b:La4/i;

    .line 6
    .line 7
    iget-boolean v6, p0, LX3/h;->d:Z

    .line 8
    .line 9
    iget-boolean v7, p0, LX3/h;->e:Z

    .line 10
    .line 11
    move-object v0, v8

    .line 12
    move-wide v4, p1

    .line 13
    invoke-direct/range {v0 .. v7}, LX3/h;-><init>(JLa4/i;JZZ)V

    .line 14
    .line 15
    .line 16
    return-object v8
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, LX3/h;

    .line 13
    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    check-cast p1, LX3/h;

    .line 18
    .line 19
    iget-wide v2, p0, LX3/h;->a:J

    .line 20
    .line 21
    iget-wide v4, p1, LX3/h;->a:J

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, LX3/h;->b:La4/i;

    .line 28
    .line 29
    iget-object v3, p1, LX3/h;->b:La4/i;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, La4/i;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-wide v2, p0, LX3/h;->c:J

    .line 38
    .line 39
    iget-wide v4, p1, LX3/h;->c:J

    .line 40
    .line 41
    cmp-long v2, v2, v4

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    iget-boolean v2, p0, LX3/h;->d:Z

    .line 46
    .line 47
    iget-boolean v3, p1, LX3/h;->d:Z

    .line 48
    .line 49
    if-ne v2, v3, :cond_2

    .line 50
    .line 51
    iget-boolean v2, p0, LX3/h;->e:Z

    .line 52
    .line 53
    iget-boolean p1, p1, LX3/h;->e:Z

    .line 54
    .line 55
    if-ne v2, p1, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move v0, v1

    .line 59
    :goto_0
    return v0

    .line 60
    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, LX3/h;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Long;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget-object v1, p0, LX3/h;->b:La4/i;

    .line 14
    .line 15
    invoke-virtual {v1}, La4/i;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-wide v1, p0, LX3/h;->c:J

    .line 23
    .line 24
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Long;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v0, v1

    .line 33
    mul-int/lit8 v0, v0, 0x1f

    .line 34
    .line 35
    iget-boolean v1, p0, LX3/h;->d:Z

    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    add-int/2addr v0, v1

    .line 46
    mul-int/lit8 v0, v0, 0x1f

    .line 47
    .line 48
    iget-boolean v1, p0, LX3/h;->e:Z

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/2addr v0, v1

    .line 59
    return v0
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
    const-string v1, "TrackedQuery{id="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-wide v1, p0, LX3/h;->a:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", querySpec="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, LX3/h;->b:La4/i;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", lastUse="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-wide v1, p0, LX3/h;->c:J

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", complete="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-boolean v1, p0, LX3/h;->d:Z

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", active="

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-boolean v1, p0, LX3/h;->e:Z

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, "}"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
.end method
