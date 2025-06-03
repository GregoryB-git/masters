.class public final LV3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# static fields
.field public static final p:LV3/b;


# instance fields
.field public final o:LY3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LV3/b;

    .line 2
    .line 3
    new-instance v1, LY3/d;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2}, LY3/d;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, LV3/b;-><init>(LY3/d;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, LV3/b;->p:LV3/b;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(LY3/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/b;->o:LY3/d;

    .line 5
    .line 6
    return-void
.end method

.method public static D(Ljava/util/Map;)LV3/b;
    .locals 4

    .line 1
    invoke-static {}, LY3/d;->d()LY3/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/util/Map$Entry;

    .line 24
    .line 25
    new-instance v2, LY3/d;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ld4/n;

    .line 32
    .line 33
    invoke-direct {v2, v3}, LY3/d;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, LV3/k;

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, LY3/d;->X(LV3/k;LY3/d;)LY3/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p0, LV3/b;

    .line 48
    .line 49
    invoke-direct {p0, v0}, LV3/b;-><init>(LY3/d;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public static M(Ljava/util/Map;)LV3/b;
    .locals 4

    .line 1
    invoke-static {}, LY3/d;->d()LY3/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/util/Map$Entry;

    .line 24
    .line 25
    new-instance v2, LY3/d;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, Ld4/o;->a(Ljava/lang/Object;)Ld4/n;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-direct {v2, v3}, LY3/d;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance v3, LV3/k;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {v3, v1}, LV3/k;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v3, v2}, LY3/d;->X(LV3/k;LY3/d;)LY3/d;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p0, LV3/b;

    .line 55
    .line 56
    invoke-direct {p0, v0}, LV3/b;-><init>(LY3/d;)V

    .line 57
    .line 58
    .line 59
    return-object p0
.end method

.method public static s()LV3/b;
    .locals 1

    .line 1
    sget-object v0, LV3/b;->p:LV3/b;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public S()Ljava/util/List;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LV3/b;->o:LY3/d;

    .line 7
    .line 8
    invoke-virtual {v1}, LY3/d;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, LV3/b;->o:LY3/d;

    .line 15
    .line 16
    invoke-virtual {v1}, LY3/d;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ld4/n;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ld4/m;

    .line 37
    .line 38
    new-instance v3, Ld4/m;

    .line 39
    .line 40
    invoke-virtual {v2}, Ld4/m;->c()Ld4/b;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v2}, Ld4/m;->d()Ld4/n;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-direct {v3, v4, v2}, Ld4/m;-><init>(Ld4/b;Ld4/n;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object v1, p0, LV3/b;->o:LY3/d;

    .line 56
    .line 57
    invoke-virtual {v1}, LY3/d;->M()LS3/c;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, LS3/c;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ljava/util/Map$Entry;

    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, LY3/d;

    .line 82
    .line 83
    invoke-virtual {v3}, LY3/d;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    if-eqz v4, :cond_1

    .line 88
    .line 89
    new-instance v4, Ld4/m;

    .line 90
    .line 91
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Ld4/b;

    .line 96
    .line 97
    invoke-virtual {v3}, LY3/d;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Ld4/n;

    .line 102
    .line 103
    invoke-direct {v4, v2, v3}, Ld4/m;-><init>(Ld4/b;Ld4/n;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    return-object v0
.end method

.method public T(LV3/k;)Ld4/n;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/b;->o:LY3/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LY3/d;->g(LV3/k;)LV3/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, LV3/b;->o:LY3/d;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, LY3/d;->s(LV3/k;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ld4/n;

    .line 16
    .line 17
    invoke-static {v0, p1}, LV3/k;->b0(LV3/k;LV3/k;)LV3/k;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {v1, p1}, Ld4/n;->A(LV3/k;)Ld4/n;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return-object p1
.end method

.method public U(Z)Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LV3/b;->o:LY3/d;

    .line 7
    .line 8
    new-instance v2, LV3/b$b;

    .line 9
    .line 10
    invoke-direct {v2, p0, v0, p1}, LV3/b$b;-><init>(LV3/b;Ljava/util/Map;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, LY3/d;->q(LY3/d$c;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public V(LV3/k;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LV3/b;->T(LV3/k;)Ld4/n;

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

.method public W(LV3/k;)LV3/b;
    .locals 2

    .line 1
    invoke-virtual {p1}, LV3/k;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p1, LV3/b;->p:LV3/b;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-object v0, p0, LV3/b;->o:LY3/d;

    .line 11
    .line 12
    invoke-static {}, LY3/d;->d()LY3/d;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, p1, v1}, LY3/d;->X(LV3/k;LY3/d;)LY3/d;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, LV3/b;

    .line 21
    .line 22
    invoke-direct {v0, p1}, LV3/b;-><init>(LY3/d;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public X()Ld4/n;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/b;->o:LY3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LY3/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld4/n;

    .line 8
    .line 9
    return-object v0
.end method

.method public a(LV3/k;Ld4/n;)LV3/b;
    .locals 3

    .line 1
    invoke-virtual {p1}, LV3/k;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance p1, LV3/b;

    .line 8
    .line 9
    new-instance v0, LY3/d;

    .line 10
    .line 11
    invoke-direct {v0, p2}, LY3/d;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p1, v0}, LV3/b;-><init>(LY3/d;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object v0, p0, LV3/b;->o:LY3/d;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LY3/d;->g(LV3/k;)LV3/k;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-static {v0, p1}, LV3/k;->b0(LV3/k;LV3/k;)LV3/k;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v1, p0, LV3/b;->o:LY3/d;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, LY3/d;->s(LV3/k;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ld4/n;

    .line 37
    .line 38
    invoke-virtual {p1}, LV3/k;->X()Ld4/b;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v2}, Ld4/b;->s()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1}, LV3/k;->a0()LV3/k;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v1, v2}, Ld4/n;->A(LV3/k;)Ld4/n;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-interface {v2}, Ld4/n;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_1
    invoke-interface {v1, p1, p2}, Ld4/n;->y(LV3/k;Ld4/n;)Ld4/n;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance p2, LV3/b;

    .line 70
    .line 71
    iget-object v1, p0, LV3/b;->o:LY3/d;

    .line 72
    .line 73
    invoke-virtual {v1, v0, p1}, LY3/d;->W(LV3/k;Ljava/lang/Object;)LY3/d;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p2, p1}, LV3/b;-><init>(LY3/d;)V

    .line 78
    .line 79
    .line 80
    return-object p2

    .line 81
    :cond_2
    new-instance v0, LY3/d;

    .line 82
    .line 83
    invoke-direct {v0, p2}, LY3/d;-><init>(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object p2, p0, LV3/b;->o:LY3/d;

    .line 87
    .line 88
    invoke-virtual {p2, p1, v0}, LY3/d;->X(LV3/k;LY3/d;)LY3/d;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance p2, LV3/b;

    .line 93
    .line 94
    invoke-direct {p2, p1}, LV3/b;-><init>(LY3/d;)V

    .line 95
    .line 96
    .line 97
    return-object p2
.end method

.method public d(Ld4/b;Ld4/n;)LV3/b;
    .locals 3

    .line 1
    new-instance v0, LV3/k;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [Ld4/b;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object p1, v1, v2

    .line 8
    .line 9
    invoke-direct {v0, v1}, LV3/k;-><init>([Ld4/b;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0, p2}, LV3/b;->a(LV3/k;Ld4/n;)LV3/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-class v2, LV3/b;

    .line 12
    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, LV3/b;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, LV3/b;->U(Z)Ljava/util/Map;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, v0}, LV3/b;->U(Z)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p1, v0}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 32
    return p1
.end method

.method public f(LV3/k;LV3/b;)LV3/b;
    .locals 1

    .line 1
    iget-object p2, p2, LV3/b;->o:LY3/d;

    .line 2
    .line 3
    new-instance v0, LV3/b$a;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, LV3/b$a;-><init>(LV3/b;LV3/k;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, p0, v0}, LY3/d;->k(Ljava/lang/Object;LY3/d$c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LV3/b;

    .line 13
    .line 14
    return-object p1
.end method

.method public g(Ld4/n;)Ld4/n;
    .locals 2

    .line 1
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LV3/b;->o:LY3/d;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, p1}, LV3/b;->i(LV3/k;LY3/d;Ld4/n;)Ld4/n;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, LV3/b;->U(Z)Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public final i(LV3/k;LY3/d;Ld4/n;)Ld4/n;
    .locals 4

    .line 1
    invoke-virtual {p2}, LY3/d;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, LY3/d;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Ld4/n;

    .line 12
    .line 13
    invoke-interface {p3, p1, p2}, Ld4/n;->y(LV3/k;Ld4/n;)Ld4/n;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-virtual {p2}, LY3/d;->M()LS3/c;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2}, LS3/c;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const/4 v0, 0x0

    .line 27
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, LY3/d;

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ld4/b;

    .line 50
    .line 51
    invoke-virtual {v1}, Ld4/b;->s()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-virtual {v2}, LY3/d;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const/4 v0, 0x0

    .line 66
    :goto_1
    const-string v1, "Priority writes must always be leaf nodes"

    .line 67
    .line 68
    invoke-static {v0, v1}, LY3/m;->g(ZLjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, LY3/d;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Ld4/n;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {p1, v1}, LV3/k;->U(Ld4/b;)LV3/k;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p0, v1, v2, p3}, LV3/b;->i(LV3/k;LY3/d;Ld4/n;)Ld4/n;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    goto :goto_0

    .line 87
    :cond_3
    invoke-interface {p3, p1}, Ld4/n;->A(LV3/k;)Ld4/n;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-interface {p2}, Ld4/n;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-nez p2, :cond_4

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    invoke-static {}, Ld4/b;->o()Ld4/b;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p1, p2}, LV3/k;->U(Ld4/b;)LV3/k;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {p3, p1, v0}, Ld4/n;->y(LV3/k;Ld4/n;)Ld4/n;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    :cond_4
    return-object p3
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, LV3/b;->o:LY3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LY3/d;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/b;->o:LY3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LY3/d;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public k(LV3/k;)LV3/b;
    .locals 2

    .line 1
    invoke-virtual {p1}, LV3/k;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, LV3/b;->T(LV3/k;)Ld4/n;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance p1, LV3/b;

    .line 15
    .line 16
    new-instance v1, LY3/d;

    .line 17
    .line 18
    invoke-direct {v1, v0}, LY3/d;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, v1}, LV3/b;-><init>(LY3/d;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    new-instance v0, LV3/b;

    .line 26
    .line 27
    iget-object v1, p0, LV3/b;->o:LY3/d;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, LY3/d;->Y(LV3/k;)LY3/d;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v0, p1}, LV3/b;-><init>(LY3/d;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public q()Ljava/util/Map;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LV3/b;->o:LY3/d;

    .line 7
    .line 8
    invoke-virtual {v1}, LY3/d;->M()LS3/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, LS3/c;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ld4/b;

    .line 33
    .line 34
    new-instance v4, LV3/b;

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, LY3/d;

    .line 41
    .line 42
    invoke-direct {v4, v2}, LV3/b;-><init>(LY3/d;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-object v0
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
    const-string v1, "CompoundWrite{"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {p0, v1}, LV3/b;->U(Z)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "}"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method
