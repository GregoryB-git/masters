.class public final Lj9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj9/g;


# instance fields
.field public final b:Lj9/i;

.field public c:I

.field public d:Lj9/q;

.field public e:Lj9/q;

.field public f:Lj9/n;

.field public g:I


# direct methods
.method public constructor <init>(Lj9/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj9/m;->b:Lj9/i;

    sget-object p1, Lj9/q;->b:Lj9/q;

    iput-object p1, p0, Lj9/m;->e:Lj9/q;

    return-void
.end method

.method public constructor <init>(Lj9/i;ILj9/q;Lj9/q;Lj9/n;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj9/m;->b:Lj9/i;

    iput-object p3, p0, Lj9/m;->d:Lj9/q;

    iput-object p4, p0, Lj9/m;->e:Lj9/q;

    iput p2, p0, Lj9/m;->c:I

    iput p6, p0, Lj9/m;->g:I

    iput-object p5, p0, Lj9/m;->f:Lj9/n;

    return-void
.end method

.method public static m(Lj9/i;)Lj9/m;
    .locals 8

    new-instance v7, Lj9/m;

    sget-object v4, Lj9/q;->b:Lj9/q;

    new-instance v5, Lj9/n;

    invoke-direct {v5}, Lj9/n;-><init>()V

    const/4 v2, 0x1

    const/4 v6, 0x3

    move-object v0, v7

    move-object v1, p0

    move-object v3, v4

    invoke-direct/range {v0 .. v6}, Lj9/m;-><init>(Lj9/i;ILj9/q;Lj9/q;Lj9/n;I)V

    return-object v7
.end method

.method public static n(Lj9/i;Lj9/q;)Lj9/m;
    .locals 1

    new-instance v0, Lj9/m;

    invoke-direct {v0, p0}, Lj9/m;-><init>(Lj9/i;)V

    invoke-virtual {v0, p1}, Lj9/m;->l(Lj9/q;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lj9/m;
    .locals 8

    .line 1
    new-instance v7, Lj9/m;

    .line 2
    .line 3
    iget-object v1, p0, Lj9/m;->b:Lj9/i;

    .line 4
    .line 5
    iget v2, p0, Lj9/m;->c:I

    .line 6
    .line 7
    iget-object v3, p0, Lj9/m;->d:Lj9/q;

    .line 8
    .line 9
    iget-object v4, p0, Lj9/m;->e:Lj9/q;

    .line 10
    .line 11
    iget-object v0, p0, Lj9/m;->f:Lj9/n;

    .line 12
    .line 13
    new-instance v5, Lj9/n;

    .line 14
    .line 15
    invoke-virtual {v0}, Lj9/n;->b()Lka/d0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v5, v0}, Lj9/n;-><init>(Lka/d0;)V

    .line 20
    .line 21
    .line 22
    iget v6, p0, Lj9/m;->g:I

    .line 23
    .line 24
    move-object v0, v7

    .line 25
    invoke-direct/range {v0 .. v6}, Lj9/m;-><init>(Lj9/i;ILj9/q;Lj9/q;Lj9/n;I)V

    .line 26
    .line 27
    .line 28
    return-object v7
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final b()Z
    .locals 2

    iget v0, p0, Lj9/m;->c:I

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lq0/g;->b(II)Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 2

    iget v0, p0, Lj9/m;->g:I

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lq0/g;->b(II)Z

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 2

    iget v0, p0, Lj9/m;->g:I

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lq0/g;->b(II)Z

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 1

    invoke-virtual {p0}, Lj9/m;->d()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lj9/m;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_6

    const-class v1, Lj9/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lj9/m;

    iget-object v1, p0, Lj9/m;->b:Lj9/i;

    iget-object v2, p1, Lj9/m;->b:Lj9/i;

    invoke-virtual {v1, v2}, Lj9/i;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    iget-object v1, p0, Lj9/m;->d:Lj9/q;

    iget-object v2, p1, Lj9/m;->d:Lj9/q;

    invoke-virtual {v1, v2}, Lj9/q;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    iget v1, p0, Lj9/m;->c:I

    iget v2, p1, Lj9/m;->c:I

    invoke-static {v1, v2}, Lq0/g;->b(II)Z

    move-result v1

    if-nez v1, :cond_4

    return v0

    :cond_4
    iget v1, p0, Lj9/m;->g:I

    iget v2, p1, Lj9/m;->g:I

    invoke-static {v1, v2}, Lq0/g;->b(II)Z

    move-result v1

    if-nez v1, :cond_5

    return v0

    :cond_5
    iget-object v0, p0, Lj9/m;->f:Lj9/n;

    iget-object p1, p1, Lj9/m;->f:Lj9/n;

    invoke-virtual {v0, p1}, Lj9/n;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    :goto_0
    return v0
.end method

.method public final f()Lj9/q;
    .locals 1

    iget-object v0, p0, Lj9/m;->e:Lj9/q;

    return-object v0
.end method

.method public final g(Lj9/l;)Lka/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lj9/m;->f:Lj9/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj9/n;->b()Lka/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Lj9/n;->d(Lj9/l;Lka/d0;)Lka/d0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method public final getData()Lj9/n;
    .locals 1

    iget-object v0, p0, Lj9/m;->f:Lj9/n;

    return-object v0
.end method

.method public final getKey()Lj9/i;
    .locals 1

    iget-object v0, p0, Lj9/m;->b:Lj9/i;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    iget v0, p0, Lj9/m;->c:I

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lq0/g;->b(II)Z

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lj9/m;->b:Lj9/i;

    invoke-virtual {v0}, Lj9/i;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Z
    .locals 2

    iget v0, p0, Lj9/m;->c:I

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lq0/g;->b(II)Z

    move-result v0

    return v0
.end method

.method public final j()Lj9/q;
    .locals 1

    iget-object v0, p0, Lj9/m;->d:Lj9/q;

    return-object v0
.end method

.method public final k(Lj9/q;Lj9/n;)V
    .locals 0

    iput-object p1, p0, Lj9/m;->d:Lj9/q;

    const/4 p1, 0x2

    iput p1, p0, Lj9/m;->c:I

    iput-object p2, p0, Lj9/m;->f:Lj9/n;

    const/4 p1, 0x3

    iput p1, p0, Lj9/m;->g:I

    return-void
.end method

.method public final l(Lj9/q;)V
    .locals 1

    iput-object p1, p0, Lj9/m;->d:Lj9/q;

    const/4 p1, 0x3

    iput p1, p0, Lj9/m;->c:I

    new-instance v0, Lj9/n;

    invoke-direct {v0}, Lj9/n;-><init>()V

    iput-object v0, p0, Lj9/m;->f:Lj9/n;

    iput p1, p0, Lj9/m;->g:I

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "Document{key="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lj9/m;->b:Lj9/i;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, ", version="

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lj9/m;->d:Lj9/q;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", readTime="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lj9/m;->e:Lj9/q;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ", type="

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget v1, p0, Lj9/m;->c:I

    .line 38
    .line 39
    invoke-static {v1}, La0/j;->v(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", documentState="

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget v1, p0, Lj9/m;->g:I

    .line 52
    .line 53
    invoke-static {v1}, Lg;->q(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", value="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lj9/m;->f:Lj9/n;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const/16 v1, 0x7d

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0
    .line 80
    .line 81
    .line 82
    .line 83
.end method
