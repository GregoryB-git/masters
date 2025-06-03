.class public Lb4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb4/d;


# instance fields
.field public final a:Ld4/h;


# direct methods
.method public constructor <init>(Ld4/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb4/b;->a:Ld4/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ld4/i;Ld4/n;)Ld4/i;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ld4/i;->k()Ld4/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ld4/n;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-virtual {p1, p2}, Ld4/i;->M(Ld4/n;)Ld4/i;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public b()Lb4/d;
    .locals 0

    .line 1
    return-object p0
.end method

.method public c(Ld4/i;Ld4/b;Ld4/n;LV3/k;Lb4/d$a;Lb4/a;)Ld4/i;
    .locals 2

    .line 1
    iget-object p5, p0, Lb4/b;->a:Ld4/h;

    .line 2
    .line 3
    invoke-virtual {p1, p5}, Ld4/i;->s(Ld4/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p5

    .line 7
    const-string v0, "The index must match the filter"

    .line 8
    .line 9
    invoke-static {p5, v0}, LY3/m;->g(ZLjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ld4/i;->k()Ld4/n;

    .line 13
    .line 14
    .line 15
    move-result-object p5

    .line 16
    invoke-interface {p5, p2}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, p4}, Ld4/n;->A(LV3/k;)Ld4/n;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {p3, p4}, Ld4/n;->A(LV3/k;)Ld4/n;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    invoke-virtual {v1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p4

    .line 32
    if-eqz p4, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ld4/n;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    invoke-interface {p3}, Ld4/n;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-ne p4, v1, :cond_0

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_0
    if-eqz p6, :cond_4

    .line 46
    .line 47
    invoke-interface {p3}, Ld4/n;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result p4

    .line 51
    if-eqz p4, :cond_2

    .line 52
    .line 53
    invoke-interface {p5, p2}, Ld4/n;->Q(Ld4/b;)Z

    .line 54
    .line 55
    .line 56
    move-result p4

    .line 57
    if-eqz p4, :cond_1

    .line 58
    .line 59
    invoke-static {p2, v0}, La4/c;->h(Ld4/b;Ld4/n;)La4/c;

    .line 60
    .line 61
    .line 62
    move-result-object p4

    .line 63
    :goto_0
    invoke-virtual {p6, p4}, Lb4/a;->b(La4/c;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-interface {p5}, Ld4/n;->B()Z

    .line 68
    .line 69
    .line 70
    move-result p4

    .line 71
    const-string p6, "A child remove without an old child only makes sense on a leaf node"

    .line 72
    .line 73
    invoke-static {p4, p6}, LY3/m;->g(ZLjava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-interface {v0}, Ld4/n;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result p4

    .line 81
    if-eqz p4, :cond_3

    .line 82
    .line 83
    invoke-static {p2, p3}, La4/c;->c(Ld4/b;Ld4/n;)La4/c;

    .line 84
    .line 85
    .line 86
    move-result-object p4

    .line 87
    goto :goto_0

    .line 88
    :cond_3
    invoke-static {p2, p3, v0}, La4/c;->e(Ld4/b;Ld4/n;Ld4/n;)La4/c;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    goto :goto_0

    .line 93
    :cond_4
    :goto_1
    invoke-interface {p5}, Ld4/n;->B()Z

    .line 94
    .line 95
    .line 96
    move-result p4

    .line 97
    if-eqz p4, :cond_5

    .line 98
    .line 99
    invoke-interface {p3}, Ld4/n;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result p4

    .line 103
    if-eqz p4, :cond_5

    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_5
    invoke-virtual {p1, p2, p3}, Ld4/i;->D(Ld4/b;Ld4/n;)Ld4/i;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1
.end method

.method public d()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public e()Ld4/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/b;->a:Ld4/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public f(Ld4/i;Ld4/i;Lb4/a;)Ld4/i;
    .locals 4

    .line 1
    iget-object v0, p0, Lb4/b;->a:Ld4/h;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ld4/i;->s(Ld4/h;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "Can\'t use IndexedNode that doesn\'t have filter\'s index"

    .line 8
    .line 9
    invoke-static {v0, v1}, LY3/m;->g(ZLjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    if-eqz p3, :cond_4

    .line 13
    .line 14
    invoke-virtual {p1}, Ld4/i;->k()Ld4/n;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ld4/m;

    .line 33
    .line 34
    invoke-virtual {p2}, Ld4/i;->k()Ld4/n;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v2, v3}, Ld4/n;->Q(Ld4/b;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1}, Ld4/m;->d()Ld4/n;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v2, v1}, La4/c;->h(Ld4/b;Ld4/n;)La4/c;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p3, v1}, Lb4/a;->b(La4/c;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {p2}, Ld4/i;->k()Ld4/n;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v0}, Ld4/n;->B()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {p2}, Ld4/i;->k()Ld4/n;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Ld4/m;

    .line 93
    .line 94
    invoke-virtual {p1}, Ld4/i;->k()Ld4/n;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-interface {v2, v3}, Ld4/n;->Q(Ld4/b;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_3

    .line 107
    .line 108
    invoke-virtual {p1}, Ld4/i;->k()Ld4/n;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-interface {v2, v3}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v1}, Ld4/m;->d()Ld4/n;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-nez v3, :cond_2

    .line 129
    .line 130
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v1}, Ld4/m;->d()Ld4/n;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v3, v1, v2}, La4/c;->e(Ld4/b;Ld4/n;Ld4/n;)La4/c;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    :goto_2
    invoke-virtual {p3, v1}, Lb4/a;->b(La4/c;)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    invoke-virtual {v1}, Ld4/m;->c()Ld4/b;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v1}, Ld4/m;->d()Ld4/n;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-static {v2, v1}, La4/c;->c(Ld4/b;Ld4/n;)La4/c;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    goto :goto_2

    .line 159
    :cond_4
    return-object p2
.end method
