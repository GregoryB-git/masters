.class public final LA0/n$h;
.super LA0/n$i;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# instance fields
.field public final A:Z

.field public final s:I

.field public final t:Z

.field public final u:Z

.field public final v:Z

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(ILd0/J;ILA0/n$e;ILjava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, LA0/n$i;-><init>(ILd0/J;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p5, p1}, Lk0/Z0;->k(IZ)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iput-boolean p2, p0, LA0/n$h;->t:Z

    .line 10
    .line 11
    iget-object p2, p0, LA0/n$i;->r:Ld0/q;

    .line 12
    .line 13
    iget p2, p2, Ld0/q;->e:I

    .line 14
    .line 15
    iget p3, p4, Ld0/K;->v:I

    .line 16
    .line 17
    not-int p3, p3

    .line 18
    and-int/2addr p2, p3

    .line 19
    and-int/lit8 p3, p2, 0x1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    move p3, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p3, p1

    .line 27
    :goto_0
    iput-boolean p3, p0, LA0/n$h;->u:Z

    .line 28
    .line 29
    and-int/lit8 p2, p2, 0x2

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    move p2, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move p2, p1

    .line 36
    :goto_1
    iput-boolean p2, p0, LA0/n$h;->v:Z

    .line 37
    .line 38
    iget-object p2, p4, Ld0/K;->t:LX2/v;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    const-string p2, ""

    .line 47
    .line 48
    invoke-static {p2}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    iget-object p2, p4, Ld0/K;->t:LX2/v;

    .line 54
    .line 55
    :goto_2
    move p3, p1

    .line 56
    :goto_3
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-ge p3, v1, :cond_4

    .line 61
    .line 62
    iget-object v1, p0, LA0/n$i;->r:Ld0/q;

    .line 63
    .line 64
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Ljava/lang/String;

    .line 69
    .line 70
    iget-boolean v3, p4, Ld0/K;->w:Z

    .line 71
    .line 72
    invoke-static {v1, v2, v3}, LA0/n;->G(Ld0/q;Ljava/lang/String;Z)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-lez v1, :cond_3

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_3
    add-int/lit8 p3, p3, 0x1

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    const p3, 0x7fffffff

    .line 83
    .line 84
    .line 85
    move v1, p1

    .line 86
    :goto_4
    iput p3, p0, LA0/n$h;->w:I

    .line 87
    .line 88
    iput v1, p0, LA0/n$h;->x:I

    .line 89
    .line 90
    iget-object p2, p0, LA0/n$i;->r:Ld0/q;

    .line 91
    .line 92
    iget p2, p2, Ld0/q;->f:I

    .line 93
    .line 94
    iget p3, p4, Ld0/K;->u:I

    .line 95
    .line 96
    invoke-static {p2, p3}, LA0/n;->y(II)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    iput p2, p0, LA0/n$h;->y:I

    .line 101
    .line 102
    iget-object p3, p0, LA0/n$i;->r:Ld0/q;

    .line 103
    .line 104
    iget p3, p3, Ld0/q;->f:I

    .line 105
    .line 106
    and-int/lit16 p3, p3, 0x440

    .line 107
    .line 108
    if-eqz p3, :cond_5

    .line 109
    .line 110
    move p3, v0

    .line 111
    goto :goto_5

    .line 112
    :cond_5
    move p3, p1

    .line 113
    :goto_5
    iput-boolean p3, p0, LA0/n$h;->A:Z

    .line 114
    .line 115
    invoke-static {p6}, LA0/n;->X(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    if-nez p3, :cond_6

    .line 120
    .line 121
    move p3, v0

    .line 122
    goto :goto_6

    .line 123
    :cond_6
    move p3, p1

    .line 124
    :goto_6
    iget-object v2, p0, LA0/n$i;->r:Ld0/q;

    .line 125
    .line 126
    invoke-static {v2, p6, p3}, LA0/n;->G(Ld0/q;Ljava/lang/String;Z)I

    .line 127
    .line 128
    .line 129
    move-result p3

    .line 130
    iput p3, p0, LA0/n$h;->z:I

    .line 131
    .line 132
    if-gtz v1, :cond_9

    .line 133
    .line 134
    iget-object p6, p4, Ld0/K;->t:LX2/v;

    .line 135
    .line 136
    invoke-virtual {p6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result p6

    .line 140
    if-eqz p6, :cond_7

    .line 141
    .line 142
    if-gtz p2, :cond_9

    .line 143
    .line 144
    :cond_7
    iget-boolean p2, p0, LA0/n$h;->u:Z

    .line 145
    .line 146
    if-nez p2, :cond_9

    .line 147
    .line 148
    iget-boolean p2, p0, LA0/n$h;->v:Z

    .line 149
    .line 150
    if-eqz p2, :cond_8

    .line 151
    .line 152
    if-lez p3, :cond_8

    .line 153
    .line 154
    goto :goto_7

    .line 155
    :cond_8
    move p2, p1

    .line 156
    goto :goto_8

    .line 157
    :cond_9
    :goto_7
    move p2, v0

    .line 158
    :goto_8
    iget-boolean p3, p4, LA0/n$e;->u0:Z

    .line 159
    .line 160
    invoke-static {p5, p3}, Lk0/Z0;->k(IZ)Z

    .line 161
    .line 162
    .line 163
    move-result p3

    .line 164
    if-eqz p3, :cond_a

    .line 165
    .line 166
    if-eqz p2, :cond_a

    .line 167
    .line 168
    move p1, v0

    .line 169
    :cond_a
    iput p1, p0, LA0/n$h;->s:I

    .line 170
    .line 171
    return-void
.end method

.method public static h(Ljava/util/List;Ljava/util/List;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, LA0/n$h;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LA0/n$h;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, LA0/n$h;->j(LA0/n$h;)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public static l(ILd0/J;LA0/n$e;[ILjava/lang/String;)LX2/v;
    .locals 10

    .line 1
    invoke-static {}, LX2/v;->M()LX2/v$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    iget v2, p1, Ld0/J;->a:I

    .line 7
    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    new-instance v9, LA0/n$h;

    .line 11
    .line 12
    aget v7, p3, v1

    .line 13
    .line 14
    move-object v2, v9

    .line 15
    move v3, p0

    .line 16
    move-object v4, p1

    .line 17
    move v5, v1

    .line 18
    move-object v6, p2

    .line 19
    move-object v8, p4

    .line 20
    invoke-direct/range {v2 .. v8}, LA0/n$h;-><init>(ILd0/J;ILA0/n$e;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v9}, LX2/v$a;->h(Ljava/lang/Object;)LX2/v$a;

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v0}, LX2/v$a;->k()LX2/v;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    iget v0, p0, LA0/n$h;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LA0/n$h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA0/n$h;->j(LA0/n$h;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic e(LA0/n$i;)Z
    .locals 0

    .line 1
    check-cast p1, LA0/n$h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA0/n$h;->m(LA0/n$h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public j(LA0/n$h;)I
    .locals 4

    .line 1
    invoke-static {}, LX2/n;->j()LX2/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p0, LA0/n$h;->t:Z

    .line 6
    .line 7
    iget-boolean v2, p1, LA0/n$h;->t:Z

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, LX2/n;->g(ZZ)LX2/n;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, LA0/n$h;->w:I

    .line 14
    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v2, p1, LA0/n$h;->w:I

    .line 20
    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {}, LX2/P;->d()LX2/P;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, LX2/P;->g()LX2/P;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v0, v1, v2, v3}, LX2/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)LX2/n;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget v1, p0, LA0/n$h;->x:I

    .line 38
    .line 39
    iget v2, p1, LA0/n$h;->x:I

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, LX2/n;->d(II)LX2/n;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget v1, p0, LA0/n$h;->y:I

    .line 46
    .line 47
    iget v2, p1, LA0/n$h;->y:I

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, LX2/n;->d(II)LX2/n;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-boolean v1, p0, LA0/n$h;->u:Z

    .line 54
    .line 55
    iget-boolean v2, p1, LA0/n$h;->u:Z

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, LX2/n;->g(ZZ)LX2/n;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-boolean v1, p0, LA0/n$h;->v:Z

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-boolean v2, p1, LA0/n$h;->v:Z

    .line 68
    .line 69
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget v3, p0, LA0/n$h;->x:I

    .line 74
    .line 75
    if-nez v3, :cond_0

    .line 76
    .line 77
    invoke-static {}, LX2/P;->d()LX2/P;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    invoke-static {}, LX2/P;->d()LX2/P;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v3}, LX2/P;->g()LX2/P;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    :goto_0
    invoke-virtual {v0, v1, v2, v3}, LX2/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)LX2/n;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget v1, p0, LA0/n$h;->z:I

    .line 95
    .line 96
    iget v2, p1, LA0/n$h;->z:I

    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, LX2/n;->d(II)LX2/n;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget v1, p0, LA0/n$h;->y:I

    .line 103
    .line 104
    if-nez v1, :cond_1

    .line 105
    .line 106
    iget-boolean v1, p0, LA0/n$h;->A:Z

    .line 107
    .line 108
    iget-boolean p1, p1, LA0/n$h;->A:Z

    .line 109
    .line 110
    invoke-virtual {v0, v1, p1}, LX2/n;->h(ZZ)LX2/n;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :cond_1
    invoke-virtual {v0}, LX2/n;->i()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    return p1
.end method

.method public m(LA0/n$h;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method
