.class public LV3/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV3/u$c;,
        LV3/u$d;
    }
.end annotation


# instance fields
.field public a:Ld4/n;

.field public b:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, LV3/u;->a:Ld4/n;

    .line 6
    .line 7
    iput-object v0, p0, LV3/u;->b:Ljava/util/Map;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public a(LV3/u$c;)V
    .locals 3

    .line 1
    iget-object v0, p0, LV3/u;->b:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/util/Map$Entry;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ld4/b;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, LV3/u;

    .line 36
    .line 37
    invoke-interface {p1, v2, v1}, LV3/u$c;->a(Ld4/b;LV3/u;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void
.end method

.method public b(LV3/k;LV3/u$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LV3/u;->a:Ld4/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p2, p1, v0}, LV3/u$d;->a(LV3/k;Ld4/n;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, LV3/u$b;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, LV3/u$b;-><init>(LV3/u;LV3/k;LV3/u$d;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, LV3/u;->a(LV3/u$c;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
.end method

.method public c(LV3/k;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, LV3/k;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object v2, p0, LV3/u;->a:Ld4/n;

    .line 10
    .line 11
    iput-object v2, p0, LV3/u;->b:Ljava/util/Map;

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    iget-object v0, p0, LV3/u;->a:Ld4/n;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ld4/n;->B()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return v3

    .line 26
    :cond_1
    iget-object v0, p0, LV3/u;->a:Ld4/n;

    .line 27
    .line 28
    check-cast v0, Ld4/c;

    .line 29
    .line 30
    iput-object v2, p0, LV3/u;->a:Ld4/n;

    .line 31
    .line 32
    new-instance v1, LV3/u$a;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, LV3/u$a;-><init>(LV3/u;LV3/k;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ld4/c;->M(Ld4/c$c;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, LV3/u;->c(LV3/k;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :cond_2
    iget-object v0, p0, LV3/u;->b:Ljava/util/Map;

    .line 46
    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    invoke-virtual {p1}, LV3/k;->Z()Ld4/b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1}, LV3/k;->c0()LV3/k;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object v4, p0, LV3/u;->b:Ljava/util/Map;

    .line 58
    .line 59
    invoke-interface {v4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    iget-object v4, p0, LV3/u;->b:Ljava/util/Map;

    .line 66
    .line 67
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, LV3/u;

    .line 72
    .line 73
    invoke-virtual {v4, p1}, LV3/u;->c(LV3/k;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    iget-object p1, p0, LV3/u;->b:Ljava/util/Map;

    .line 80
    .line 81
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :cond_3
    iget-object p1, p0, LV3/u;->b:Ljava/util/Map;

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_4

    .line 91
    .line 92
    iput-object v2, p0, LV3/u;->b:Ljava/util/Map;

    .line 93
    .line 94
    return v1

    .line 95
    :cond_4
    return v3

    .line 96
    :cond_5
    return v1
.end method

.method public d(LV3/k;Ld4/n;)V
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
    iput-object p2, p0, LV3/u;->a:Ld4/n;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, LV3/u;->b:Ljava/util/Map;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, LV3/u;->a:Ld4/n;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0, p1, p2}, Ld4/n;->y(LV3/k;Ld4/n;)Ld4/n;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, LV3/u;->a:Ld4/n;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, LV3/u;->b:Ljava/util/Map;

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    new-instance v0, Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, LV3/u;->b:Ljava/util/Map;

    .line 34
    .line 35
    :cond_2
    invoke-virtual {p1}, LV3/k;->Z()Ld4/b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, p0, LV3/u;->b:Ljava/util/Map;

    .line 40
    .line 41
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    iget-object v1, p0, LV3/u;->b:Ljava/util/Map;

    .line 48
    .line 49
    new-instance v2, LV3/u;

    .line 50
    .line 51
    invoke-direct {v2}, LV3/u;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v1, p0, LV3/u;->b:Ljava/util/Map;

    .line 58
    .line 59
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, LV3/u;

    .line 64
    .line 65
    invoke-virtual {p1}, LV3/k;->c0()LV3/k;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v0, p1, p2}, LV3/u;->d(LV3/k;Ld4/n;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    return-void
.end method
