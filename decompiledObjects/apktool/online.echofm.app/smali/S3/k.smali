.class public LS3/k;
.super LS3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS3/k$b;
    }
.end annotation


# instance fields
.field public o:LS3/h;

.field public p:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(LS3/h;Ljava/util/Comparator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LS3/c;-><init>()V

    iput-object p1, p0, LS3/k;->o:LS3/h;

    iput-object p2, p0, LS3/k;->p:Ljava/util/Comparator;

    return-void
.end method

.method public synthetic constructor <init>(LS3/h;Ljava/util/Comparator;LS3/k$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LS3/k;-><init>(LS3/h;Ljava/util/Comparator;)V

    return-void
.end method

.method public static M(Ljava/util/List;Ljava/util/Map;LS3/c$a$a;Ljava/util/Comparator;)LS3/k;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LS3/k$b;->b(Ljava/util/List;Ljava/util/Map;LS3/c$a$a;Ljava/util/Comparator;)LS3/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static S(Ljava/util/Map;Ljava/util/Comparator;)LS3/k;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, LS3/c$a;->e()LS3/c$a$a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0, p0, v1, p1}, LS3/k$b;->b(Ljava/util/List;Ljava/util/Map;LS3/c$a$a;Ljava/util/Comparator;)LS3/k;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method


# virtual methods
.method public D(Ljava/lang/Object;)LS3/c;
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, LS3/k;->a(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, LS3/k;->o:LS3/h;

    .line 9
    .line 10
    iget-object v1, p0, LS3/k;->p:Ljava/util/Comparator;

    .line 11
    .line 12
    invoke-interface {v0, p1, v1}, LS3/h;->g(Ljava/lang/Object;Ljava/util/Comparator;)LS3/h;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v5, LS3/h$a;->p:LS3/h$a;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-interface/range {v2 .. v7}, LS3/h;->c(Ljava/lang/Object;Ljava/lang/Object;LS3/h$a;LS3/h;LS3/h;)LS3/h;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v0, LS3/k;

    .line 27
    .line 28
    iget-object v1, p0, LS3/k;->p:Ljava/util/Comparator;

    .line 29
    .line 30
    invoke-direct {v0, p1, v1}, LS3/k;-><init>(LS3/h;Ljava/util/Comparator;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public P()Ljava/util/Iterator;
    .locals 5

    .line 1
    new-instance v0, LS3/d;

    .line 2
    .line 3
    iget-object v1, p0, LS3/k;->o:LS3/h;

    .line 4
    .line 5
    iget-object v2, p0, LS3/k;->p:Ljava/util/Comparator;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    invoke-direct {v0, v1, v4, v2, v3}, LS3/d;-><init>(LS3/h;Ljava/lang/Object;Ljava/util/Comparator;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final T(Ljava/lang/Object;)LS3/h;
    .locals 3

    .line 1
    iget-object v0, p0, LS3/k;->o:LS3/h;

    .line 2
    .line 3
    :goto_0
    invoke-interface {v0}, LS3/h;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    iget-object v1, p0, LS3/k;->p:Ljava/util/Comparator;

    .line 10
    .line 11
    invoke-interface {v0}, LS3/h;->getKey()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v1, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-gez v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, LS3/h;->a()LS3/h;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-nez v1, :cond_1

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    invoke-interface {v0}, LS3/h;->f()LS3/h;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LS3/k;->T(Ljava/lang/Object;)LS3/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    :goto_0
    return p1
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LS3/k;->T(Ljava/lang/Object;)LS3/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, LS3/h;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    return-object p1
.end method

.method public f()Ljava/util/Comparator;
    .locals 1

    .line 1
    iget-object v0, p0, LS3/k;->p:Ljava/util/Comparator;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LS3/k;->o:LS3/h;

    .line 2
    .line 3
    invoke-interface {v0}, LS3/h;->i()LS3/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LS3/h;->getKey()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public i()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LS3/k;->o:LS3/h;

    .line 2
    .line 3
    invoke-interface {v0}, LS3/h;->h()LS3/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LS3/h;->getKey()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, LS3/k;->o:LS3/h;

    .line 2
    .line 3
    invoke-interface {v0}, LS3/h;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 5

    .line 1
    new-instance v0, LS3/d;

    .line 2
    .line 3
    iget-object v1, p0, LS3/k;->o:LS3/h;

    .line 4
    .line 5
    iget-object v2, p0, LS3/k;->p:Ljava/util/Comparator;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    invoke-direct {v0, v1, v4, v2, v3}, LS3/d;-><init>(LS3/h;Ljava/lang/Object;Ljava/util/Comparator;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LS3/k;->o:LS3/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move-object v2, v1

    .line 5
    :goto_0
    invoke-interface {v0}, LS3/h;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-nez v3, :cond_5

    .line 10
    .line 11
    iget-object v3, p0, LS3/k;->p:Ljava/util/Comparator;

    .line 12
    .line 13
    invoke-interface {v0}, LS3/h;->getKey()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-interface {v3, p1, v4}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_3

    .line 22
    .line 23
    invoke-interface {v0}, LS3/h;->a()LS3/h;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, LS3/h;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, LS3/h;->a()LS3/h;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_1
    invoke-interface {p1}, LS3/h;->f()LS3/h;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0}, LS3/h;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    invoke-interface {p1}, LS3/h;->f()LS3/h;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    invoke-interface {p1}, LS3/h;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_1
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-interface {v2}, LS3/h;->getKey()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_2
    return-object v1

    .line 65
    :cond_3
    if-gez v3, :cond_4

    .line 66
    .line 67
    invoke-interface {v0}, LS3/h;->a()LS3/h;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_0

    .line 72
    :cond_4
    invoke-interface {v0}, LS3/h;->f()LS3/h;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    move-object v5, v2

    .line 77
    move-object v2, v0

    .line 78
    move-object v0, v5

    .line 79
    goto :goto_0

    .line 80
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 81
    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v2, "Couldn\'t find predecessor key of non-present key: "

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v0
.end method

.method public q(LS3/h$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS3/k;->o:LS3/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LS3/h;->e(LS3/h$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public s(Ljava/lang/Object;Ljava/lang/Object;)LS3/c;
    .locals 8

    .line 1
    iget-object v0, p0, LS3/k;->o:LS3/h;

    .line 2
    .line 3
    iget-object v1, p0, LS3/k;->p:Ljava/util/Comparator;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, v1}, LS3/h;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)LS3/h;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sget-object v5, LS3/h$a;->p:LS3/h$a;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-interface/range {v2 .. v7}, LS3/h;->c(Ljava/lang/Object;Ljava/lang/Object;LS3/h$a;LS3/h;LS3/h;)LS3/h;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance p2, LS3/k;

    .line 20
    .line 21
    iget-object v0, p0, LS3/k;->p:Ljava/util/Comparator;

    .line 22
    .line 23
    invoke-direct {p2, p1, v0}, LS3/k;-><init>(LS3/h;Ljava/util/Comparator;)V

    .line 24
    .line 25
    .line 26
    return-object p2
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, LS3/k;->o:LS3/h;

    .line 2
    .line 3
    invoke-interface {v0}, LS3/h;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
