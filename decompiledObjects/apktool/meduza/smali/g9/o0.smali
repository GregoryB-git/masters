.class public final Lg9/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le7/p3;

.field public final b:Lj9/l;

.field public final c:Z


# direct methods
.method public constructor <init>(Le7/p3;Lj9/l;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/o0;->a:Le7/p3;

    iput-object p2, p0, Lg9/o0;->b:Lj9/l;

    iput-boolean p3, p0, Lg9/o0;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Lj9/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg9/o0;->a:Le7/p3;

    .line 2
    .line 3
    iget-object v0, v0, Le7/p3;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
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
.end method

.method public final b(Lj9/l;)Lg9/o0;
    .locals 3

    iget-object v0, p0, Lg9/o0;->b:Lj9/l;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lj9/e;->f(Lj9/e;)Lj9/e;

    move-result-object p1

    check-cast p1, Lj9/l;

    :goto_0
    new-instance v0, Lg9/o0;

    iget-object v1, p0, Lg9/o0;->a:Le7/p3;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lg9/o0;-><init>(Le7/p3;Lj9/l;Z)V

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    iget-object p1, v0, Lg9/o0;->b:Lj9/l;

    invoke-virtual {p1}, Lj9/e;->q()I

    move-result p1

    if-ge v2, p1, :cond_2

    iget-object p1, v0, Lg9/o0;->b:Lj9/l;

    invoke-virtual {p1, v2}, Lj9/e;->n(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg9/o0;->e(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;
    .locals 3

    .line 1
    iget-object v0, p0, Lg9/o0;->b:Lj9/l;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lj9/e;->o()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, " (found in field "

    .line 13
    .line 14
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lg9/o0;->b:Lj9/l;

    .line 19
    .line 20
    invoke-virtual {v1}, Lj9/l;->h()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ")"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :goto_0
    const-string v0, ""

    .line 38
    .line 39
    :goto_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string v2, "Invalid data. "

    .line 42
    .line 43
    invoke-static {v2, p1, v0}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v1
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
.end method

.method public final d()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lg9/o0;->a:Le7/p3;

    .line 2
    .line 3
    iget-object v0, v0, Le7/p3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lg9/p0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_2

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eq v0, v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    if-ne v0, v2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-array v0, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v1, p0, Lg9/o0;->a:Le7/p3;

    .line 30
    .line 31
    iget-object v1, v1, Le7/p3;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lg9/p0;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    aput-object v1, v0, v3

    .line 40
    .line 41
    const-string v1, "Unexpected case for UserDataSource: %s"

    .line 42
    .line 43
    invoke-static {v1, v0}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    throw v0

    .line 48
    :cond_1
    :goto_0
    return v3

    .line 49
    :cond_2
    return v1
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

.method public final e(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lg9/o0;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "__"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Document fields cannot begin and end with \"__\""

    invoke-virtual {p0, p1}, Lg9/o0;->c(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void

    :cond_2
    const-string p1, "Document fields must not be empty"

    invoke-virtual {p0, p1}, Lg9/o0;->c(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1
.end method
