.class public LX2/k$d;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic o:LX2/k;


# direct methods
.method public constructor <init>(LX2/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX2/k$d;->o:LX2/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, LX2/k$d;->o:LX2/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LX2/k;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LX2/k$d;->o:LX2/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LX2/k;->w()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    check-cast p1, Ljava/util/Map$Entry;

    .line 24
    .line 25
    iget-object v0, p0, LX2/k$d;->o:LX2/k;

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v0, v2}, LX2/k;->i(LX2/k;Ljava/lang/Object;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v2, -0x1

    .line 36
    if-eq v0, v2, :cond_1

    .line 37
    .line 38
    iget-object v2, p0, LX2/k$d;->o:LX2/k;

    .line 39
    .line 40
    invoke-static {v2, v0}, LX2/k;->j(LX2/k;I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {v0, p1}, LW2/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    :cond_1
    return v1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, LX2/k$d;->o:LX2/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LX2/k;->y()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    iget-object v0, p0, LX2/k$d;->o:LX2/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LX2/k;->w()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    check-cast p1, Ljava/util/Map$Entry;

    .line 24
    .line 25
    iget-object v0, p0, LX2/k$d;->o:LX2/k;

    .line 26
    .line 27
    invoke-virtual {v0}, LX2/k;->J()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    return v1

    .line 34
    :cond_1
    iget-object v0, p0, LX2/k$d;->o:LX2/k;

    .line 35
    .line 36
    invoke-static {v0}, LX2/k;->k(LX2/k;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object p1, p0, LX2/k$d;->o:LX2/k;

    .line 49
    .line 50
    invoke-static {p1}, LX2/k;->l(LX2/k;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    iget-object p1, p0, LX2/k$d;->o:LX2/k;

    .line 55
    .line 56
    invoke-static {p1}, LX2/k;->m(LX2/k;)[I

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    iget-object p1, p0, LX2/k$d;->o:LX2/k;

    .line 61
    .line 62
    invoke-static {p1}, LX2/k;->c(LX2/k;)[Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    iget-object p1, p0, LX2/k$d;->o:LX2/k;

    .line 67
    .line 68
    invoke-static {p1}, LX2/k;->d(LX2/k;)[Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    move v4, v0

    .line 73
    invoke-static/range {v2 .. v8}, LX2/l;->f(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    const/4 v2, -0x1

    .line 78
    if-ne p1, v2, :cond_2

    .line 79
    .line 80
    return v1

    .line 81
    :cond_2
    iget-object v1, p0, LX2/k$d;->o:LX2/k;

    .line 82
    .line 83
    invoke-virtual {v1, p1, v0}, LX2/k;->I(II)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, LX2/k$d;->o:LX2/k;

    .line 87
    .line 88
    invoke-static {p1}, LX2/k;->e(LX2/k;)I

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, LX2/k$d;->o:LX2/k;

    .line 92
    .line 93
    invoke-virtual {p1}, LX2/k;->C()V

    .line 94
    .line 95
    .line 96
    const/4 p1, 0x1

    .line 97
    return p1

    .line 98
    :cond_3
    return v1
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, LX2/k$d;->o:LX2/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LX2/k;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
