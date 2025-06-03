.class public final Li9/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/l1;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Ll3/l;

.field public c:I

.field public d:Lj9/q;

.field public e:J

.field public final f:Li9/w;


# direct methods
.method public constructor <init>(Li9/w;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li9/z;->a:Ljava/util/HashMap;

    new-instance v0, Ll3/l;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ll3/l;-><init>(I)V

    iput-object v0, p0, Li9/z;->b:Ll3/l;

    sget-object v0, Lj9/q;->b:Lj9/q;

    iput-object v0, p0, Li9/z;->d:Lj9/q;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Li9/z;->e:J

    iput-object p1, p0, Li9/z;->f:Li9/w;

    return-void
.end method


# virtual methods
.method public final a(Lg9/k0;)Li9/m1;
    .locals 1

    iget-object v0, p0, Li9/z;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/m1;

    return-object p1
.end method

.method public final b(Lt8/e;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/e<",
            "Lj9/i;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Li9/z;->b:Ll3/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    move-object v2, v1

    .line 11
    check-cast v2, Lt8/e$a;

    .line 12
    .line 13
    invoke-virtual {v2}, Lt8/e$a;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lj9/i;

    .line 24
    .line 25
    new-instance v3, Li9/c;

    .line 26
    .line 27
    invoke-direct {v3, p2, v2}, Li9/c;-><init>(ILj9/i;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Ll3/l;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lt8/e;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lt8/e;->a(Ljava/lang/Object;)Lt8/e;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, v0, Ll3/l;->a:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v2, v0, Ll3/l;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lt8/e;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lt8/e;->a(Ljava/lang/Object;)Lt8/e;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iput-object v2, v0, Ll3/l;->b:Ljava/lang/Object;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object p2, p0, Li9/z;->f:Li9/w;

    .line 52
    .line 53
    iget-object p2, p2, Li9/w;->i:Li9/f0;

    .line 54
    .line 55
    invoke-virtual {p1}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_1
    move-object v0, p1

    .line 60
    check-cast v0, Lt8/e$a;

    .line 61
    .line 62
    invoke-virtual {v0}, Lt8/e$a;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lj9/i;

    .line 73
    .line 74
    invoke-interface {p2, v0}, Li9/f0;->e(Lj9/i;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final c(Li9/m1;)V
    .locals 4

    .line 1
    iget-object v0, p0, Li9/z;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p1, Li9/m1;->a:Lg9/k0;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v0, p1, Li9/m1;->b:I

    .line 9
    .line 10
    iget v1, p0, Li9/z;->c:I

    .line 11
    .line 12
    if-le v0, v1, :cond_0

    .line 13
    .line 14
    iput v0, p0, Li9/z;->c:I

    .line 15
    .line 16
    :cond_0
    iget-wide v0, p1, Li9/m1;->c:J

    .line 17
    .line 18
    iget-wide v2, p0, Li9/z;->e:J

    .line 19
    .line 20
    cmp-long p1, v0, v2

    .line 21
    .line 22
    if-lez p1, :cond_1

    .line 23
    .line 24
    iput-wide v0, p0, Li9/z;->e:J

    .line 25
    .line 26
    :cond_1
    return-void
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

.method public final d()I
    .locals 1

    iget v0, p0, Li9/z;->c:I

    return v0
.end method

.method public final e(Lt8/e;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/e<",
            "Lj9/i;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Li9/z;->b:Ll3/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    move-object v2, v1

    .line 11
    check-cast v2, Lt8/e$a;

    .line 12
    .line 13
    invoke-virtual {v2}, Lt8/e$a;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lj9/i;

    .line 24
    .line 25
    new-instance v3, Li9/c;

    .line 26
    .line 27
    invoke-direct {v3, p2, v2}, Li9/c;-><init>(ILj9/i;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Ll3/l;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lt8/e;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lt8/e;->i(Ljava/lang/Object;)Lt8/e;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, v0, Ll3/l;->a:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v2, v0, Ll3/l;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lt8/e;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lt8/e;->i(Ljava/lang/Object;)Lt8/e;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iput-object v2, v0, Ll3/l;->b:Ljava/lang/Object;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object p2, p0, Li9/z;->f:Li9/w;

    .line 52
    .line 53
    iget-object p2, p2, Li9/w;->i:Li9/f0;

    .line 54
    .line 55
    invoke-virtual {p1}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_1
    move-object v0, p1

    .line 60
    check-cast v0, Lt8/e$a;

    .line 61
    .line 62
    invoke-virtual {v0}, Lt8/e$a;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lj9/i;

    .line 73
    .line 74
    invoke-interface {p2, v0}, Li9/f0;->c(Lj9/i;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final f(I)Lt8/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lt8/e<",
            "Lj9/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li9/z;->b:Ll3/l;

    invoke-virtual {v0, p1}, Ll3/l;->c(I)Lt8/e;

    move-result-object p1

    return-object p1
.end method

.method public final g()Lj9/q;
    .locals 1

    iget-object v0, p0, Li9/z;->d:Lj9/q;

    return-object v0
.end method

.method public final h(Li9/m1;)V
    .locals 0

    invoke-virtual {p0, p1}, Li9/z;->c(Li9/m1;)V

    return-void
.end method

.method public final i(I)V
    .locals 1

    iget-object v0, p0, Li9/z;->b:Ll3/l;

    invoke-virtual {v0, p1}, Ll3/l;->d(I)Lt8/e;

    return-void
.end method

.method public final j(Lj9/q;)V
    .locals 0

    iput-object p1, p0, Li9/z;->d:Lj9/q;

    return-void
.end method
