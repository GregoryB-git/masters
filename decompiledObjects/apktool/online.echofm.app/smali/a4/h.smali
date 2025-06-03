.class public final La4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La4/h$b;
    }
.end annotation


# static fields
.field public static final i:La4/h;


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:La4/h$b;

.field public c:Ld4/n;

.field public d:Ld4/b;

.field public e:Ld4/n;

.field public f:Ld4/b;

.field public g:Ld4/h;

.field public h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La4/h;

    .line 2
    .line 3
    invoke-direct {v0}, La4/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La4/h;->i:La4/h;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, La4/h;->c:Ld4/n;

    .line 6
    .line 7
    iput-object v0, p0, La4/h;->d:Ld4/b;

    .line 8
    .line 9
    iput-object v0, p0, La4/h;->e:Ld4/n;

    .line 10
    .line 11
    iput-object v0, p0, La4/h;->f:Ld4/b;

    .line 12
    .line 13
    invoke-static {}, Ld4/q;->j()Ld4/q;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, La4/h;->g:Ld4/h;

    .line 18
    .line 19
    iput-object v0, p0, La4/h;->h:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method public static c(Ljava/util/Map;)La4/h;
    .locals 4

    .line 1
    new-instance v0, La4/h;

    .line 2
    .line 3
    invoke-direct {v0}, La4/h;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "l"

    .line 7
    .line 8
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ljava/lang/Integer;

    .line 13
    .line 14
    iput-object v2, v0, La4/h;->a:Ljava/lang/Integer;

    .line 15
    .line 16
    const-string v2, "sp"

    .line 17
    .line 18
    invoke-interface {p0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, Ld4/o;->a(Ljava/lang/Object;)Ld4/n;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, La4/h;->v(Ld4/n;)Ld4/n;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iput-object v2, v0, La4/h;->c:Ld4/n;

    .line 37
    .line 38
    const-string v2, "sn"

    .line 39
    .line 40
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-static {v2}, Ld4/b;->j(Ljava/lang/String;)Ld4/b;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, v0, La4/h;->d:Ld4/b;

    .line 53
    .line 54
    :cond_0
    const-string v2, "ep"

    .line 55
    .line 56
    invoke-interface {p0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {v2}, Ld4/o;->a(Ljava/lang/Object;)Ld4/n;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v2}, La4/h;->v(Ld4/n;)Ld4/n;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iput-object v2, v0, La4/h;->e:Ld4/n;

    .line 75
    .line 76
    const-string v2, "en"

    .line 77
    .line 78
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Ljava/lang/String;

    .line 83
    .line 84
    if-eqz v2, :cond_1

    .line 85
    .line 86
    invoke-static {v2}, Ld4/b;->j(Ljava/lang/String;)Ld4/b;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iput-object v2, v0, La4/h;->f:Ld4/b;

    .line 91
    .line 92
    :cond_1
    const-string v2, "vf"

    .line 93
    .line 94
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Ljava/lang/String;

    .line 99
    .line 100
    if-eqz v2, :cond_3

    .line 101
    .line 102
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    sget-object v1, La4/h$b;->o:La4/h$b;

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    sget-object v1, La4/h$b;->p:La4/h$b;

    .line 112
    .line 113
    :goto_0
    iput-object v1, v0, La4/h;->b:La4/h$b;

    .line 114
    .line 115
    :cond_3
    const-string v1, "i"

    .line 116
    .line 117
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz p0, :cond_4

    .line 124
    .line 125
    invoke-static {p0}, Ld4/h;->b(Ljava/lang/String;)Ld4/h;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    iput-object p0, v0, La4/h;->g:Ld4/h;

    .line 130
    .line 131
    :cond_4
    return-object v0
.end method

.method public static v(Ld4/n;)Ld4/n;
    .locals 3

    .line 1
    instance-of v0, p0, Ld4/t;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    instance-of v0, p0, Ld4/a;

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    instance-of v0, p0, Ld4/f;

    .line 10
    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    instance-of v0, p0, Ld4/g;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of v0, p0, Ld4/l;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Ld4/f;

    .line 23
    .line 24
    invoke-interface {p0}, Ld4/n;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/lang/Long;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Long;->doubleValue()D

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {}, Ld4/r;->a()Ld4/n;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v0, p0, v1}, Ld4/f;-><init>(Ljava/lang/Double;Ld4/n;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v2, "Unexpected value passed to normalizeValue: "

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-interface {p0}, Ld4/n;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_2
    :goto_0
    return-object p0
.end method


# virtual methods
.method public final a()La4/h;
    .locals 2

    .line 1
    new-instance v0, La4/h;

    .line 2
    .line 3
    invoke-direct {v0}, La4/h;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La4/h;->a:Ljava/lang/Integer;

    .line 7
    .line 8
    iput-object v1, v0, La4/h;->a:Ljava/lang/Integer;

    .line 9
    .line 10
    iget-object v1, p0, La4/h;->c:Ld4/n;

    .line 11
    .line 12
    iput-object v1, v0, La4/h;->c:Ld4/n;

    .line 13
    .line 14
    iget-object v1, p0, La4/h;->d:Ld4/b;

    .line 15
    .line 16
    iput-object v1, v0, La4/h;->d:Ld4/b;

    .line 17
    .line 18
    iget-object v1, p0, La4/h;->e:Ld4/n;

    .line 19
    .line 20
    iput-object v1, v0, La4/h;->e:Ld4/n;

    .line 21
    .line 22
    iget-object v1, p0, La4/h;->f:Ld4/b;

    .line 23
    .line 24
    iput-object v1, v0, La4/h;->f:Ld4/b;

    .line 25
    .line 26
    iget-object v1, p0, La4/h;->b:La4/h$b;

    .line 27
    .line 28
    iput-object v1, v0, La4/h;->b:La4/h$b;

    .line 29
    .line 30
    iget-object v1, p0, La4/h;->g:Ld4/h;

    .line 31
    .line 32
    iput-object v1, v0, La4/h;->g:Ld4/h;

    .line 33
    .line 34
    return-object v0
.end method

.method public b(Ld4/n;Ld4/b;)La4/h;
    .locals 2

    .line 1
    invoke-interface {p1}, Ld4/n;->B()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p1}, Ld4/n;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    move v0, v1

    .line 18
    :goto_1
    invoke-static {v0}, LY3/m;->f(Z)V

    .line 19
    .line 20
    .line 21
    instance-of v0, p1, Ld4/l;

    .line 22
    .line 23
    xor-int/2addr v0, v1

    .line 24
    invoke-static {v0}, LY3/m;->f(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La4/h;->a()La4/h;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object p1, v0, La4/h;->e:Ld4/n;

    .line 32
    .line 33
    iput-object p2, v0, La4/h;->f:Ld4/b;

    .line 34
    .line 35
    return-object v0
.end method

.method public d()Ld4/h;
    .locals 1

    .line 1
    iget-object v0, p0, La4/h;->g:Ld4/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ld4/b;
    .locals 2

    .line 1
    invoke-virtual {p0}, La4/h;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, La4/h;->f:Ld4/b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {}, Ld4/b;->m()Ld4/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string v1, "Cannot get index end name if start has not been set"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_f

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, La4/h;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto/16 :goto_6

    .line 17
    .line 18
    :cond_1
    check-cast p1, La4/h;

    .line 19
    .line 20
    iget-object v2, p0, La4/h;->a:Ljava/lang/Integer;

    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    iget-object v3, p1, La4/h;->a:Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    iget-object v2, p1, La4/h;->a:Ljava/lang/Integer;

    .line 34
    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    :goto_0
    return v1

    .line 38
    :cond_3
    iget-object v2, p0, La4/h;->g:Ld4/h;

    .line 39
    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    iget-object v3, p1, La4/h;->g:Ld4/h;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    iget-object v2, p1, La4/h;->g:Ld4/h;

    .line 52
    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    :goto_1
    return v1

    .line 56
    :cond_5
    iget-object v2, p0, La4/h;->f:Ld4/b;

    .line 57
    .line 58
    if-eqz v2, :cond_6

    .line 59
    .line 60
    iget-object v3, p1, La4/h;->f:Ld4/b;

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ld4/b;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_7

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_6
    iget-object v2, p1, La4/h;->f:Ld4/b;

    .line 70
    .line 71
    if-eqz v2, :cond_7

    .line 72
    .line 73
    :goto_2
    return v1

    .line 74
    :cond_7
    iget-object v2, p0, La4/h;->e:Ld4/n;

    .line 75
    .line 76
    if-eqz v2, :cond_8

    .line 77
    .line 78
    iget-object v3, p1, La4/h;->e:Ld4/n;

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_9

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_8
    iget-object v2, p1, La4/h;->e:Ld4/n;

    .line 88
    .line 89
    if-eqz v2, :cond_9

    .line 90
    .line 91
    :goto_3
    return v1

    .line 92
    :cond_9
    iget-object v2, p0, La4/h;->d:Ld4/b;

    .line 93
    .line 94
    if-eqz v2, :cond_a

    .line 95
    .line 96
    iget-object v3, p1, La4/h;->d:Ld4/b;

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ld4/b;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_b

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_a
    iget-object v2, p1, La4/h;->d:Ld4/b;

    .line 106
    .line 107
    if-eqz v2, :cond_b

    .line 108
    .line 109
    :goto_4
    return v1

    .line 110
    :cond_b
    iget-object v2, p0, La4/h;->c:Ld4/n;

    .line 111
    .line 112
    if-eqz v2, :cond_c

    .line 113
    .line 114
    iget-object v3, p1, La4/h;->c:Ld4/n;

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-nez v2, :cond_d

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_c
    iget-object v2, p1, La4/h;->c:Ld4/n;

    .line 124
    .line 125
    if-eqz v2, :cond_d

    .line 126
    .line 127
    :goto_5
    return v1

    .line 128
    :cond_d
    invoke-virtual {p0}, La4/h;->r()Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    invoke-virtual {p1}, La4/h;->r()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eq v2, p1, :cond_e

    .line 137
    .line 138
    return v1

    .line 139
    :cond_e
    return v0

    .line 140
    :cond_f
    :goto_6
    return v1
.end method

.method public f()Ld4/n;
    .locals 2

    .line 1
    invoke-virtual {p0}, La4/h;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La4/h;->e:Ld4/n;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v1, "Cannot get index end value if start has not been set"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public g()Ld4/b;
    .locals 2

    .line 1
    invoke-virtual {p0}, La4/h;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, La4/h;->d:Ld4/b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {}, Ld4/b;->n()Ld4/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string v1, "Cannot get index start name if start has not been set"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public h()Ld4/n;
    .locals 2

    .line 1
    invoke-virtual {p0}, La4/h;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La4/h;->c:Ld4/n;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v1, "Cannot get index start value if start has not been set"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La4/h;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    invoke-virtual {p0}, La4/h;->r()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    const/16 v2, 0x4cf

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/16 v2, 0x4d5

    .line 24
    .line 25
    :goto_1
    add-int/2addr v0, v2

    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-object v2, p0, La4/h;->c:Ld4/n;

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move v2, v1

    .line 38
    :goto_2
    add-int/2addr v0, v2

    .line 39
    mul-int/lit8 v0, v0, 0x1f

    .line 40
    .line 41
    iget-object v2, p0, La4/h;->d:Ld4/b;

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {v2}, Ld4/b;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    move v2, v1

    .line 51
    :goto_3
    add-int/2addr v0, v2

    .line 52
    mul-int/lit8 v0, v0, 0x1f

    .line 53
    .line 54
    iget-object v2, p0, La4/h;->e:Ld4/n;

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    goto :goto_4

    .line 63
    :cond_4
    move v2, v1

    .line 64
    :goto_4
    add-int/2addr v0, v2

    .line 65
    mul-int/lit8 v0, v0, 0x1f

    .line 66
    .line 67
    iget-object v2, p0, La4/h;->f:Ld4/b;

    .line 68
    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    invoke-virtual {v2}, Ld4/b;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    goto :goto_5

    .line 76
    :cond_5
    move v2, v1

    .line 77
    :goto_5
    add-int/2addr v0, v2

    .line 78
    mul-int/lit8 v0, v0, 0x1f

    .line 79
    .line 80
    iget-object v2, p0, La4/h;->g:Ld4/h;

    .line 81
    .line 82
    if-eqz v2, :cond_6

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    :cond_6
    add-int/2addr v0, v1

    .line 89
    return v0
.end method

.method public i()I
    .locals 2

    .line 1
    invoke-virtual {p0}, La4/h;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La4/h;->a:Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v1, "Cannot get limit if limit has not been set"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public j()Lb4/d;
    .locals 2

    .line 1
    invoke-virtual {p0}, La4/h;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lb4/b;

    .line 8
    .line 9
    invoke-virtual {p0}, La4/h;->d()Ld4/h;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, v1}, Lb4/b;-><init>(Ld4/h;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    invoke-virtual {p0}, La4/h;->n()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Lb4/c;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lb4/c;-><init>(La4/h;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    new-instance v0, Lb4/e;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lb4/e;-><init>(La4/h;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public k()Ljava/util/Map;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La4/h;->o()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, La4/h;->c:Ld4/n;

    .line 13
    .line 14
    invoke-interface {v1}, Ld4/n;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "sp"

    .line 19
    .line 20
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, La4/h;->d:Ld4/b;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const-string v2, "sn"

    .line 28
    .line 29
    invoke-virtual {v1}, Ld4/b;->e()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, La4/h;->m()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, La4/h;->e:Ld4/n;

    .line 43
    .line 44
    invoke-interface {v1}, Ld4/n;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-string v2, "ep"

    .line 49
    .line 50
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, La4/h;->f:Ld4/b;

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    const-string v2, "en"

    .line 58
    .line 59
    invoke-virtual {v1}, Ld4/b;->e()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_1
    iget-object v1, p0, La4/h;->a:Ljava/lang/Integer;

    .line 67
    .line 68
    if-eqz v1, :cond_6

    .line 69
    .line 70
    const-string v2, "l"

    .line 71
    .line 72
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, La4/h;->b:La4/h$b;

    .line 76
    .line 77
    if-nez v1, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0}, La4/h;->o()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    sget-object v1, La4/h$b;->o:La4/h$b;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    sget-object v1, La4/h$b;->p:La4/h$b;

    .line 89
    .line 90
    :cond_3
    :goto_0
    sget-object v3, La4/h$a;->a:[I

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    aget v1, v3, v1

    .line 97
    .line 98
    const/4 v3, 0x1

    .line 99
    const-string v4, "vf"

    .line 100
    .line 101
    if-eq v1, v3, :cond_5

    .line 102
    .line 103
    const/4 v2, 0x2

    .line 104
    if-eq v1, v2, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    const-string v1, "r"

    .line 108
    .line 109
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_6
    :goto_1
    iget-object v1, p0, La4/h;->g:Ld4/h;

    .line 117
    .line 118
    invoke-static {}, Ld4/q;->j()Ld4/q;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_7

    .line 127
    .line 128
    iget-object v1, p0, La4/h;->g:Ld4/h;

    .line 129
    .line 130
    invoke-virtual {v1}, Ld4/h;->c()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const-string v2, "i"

    .line 135
    .line 136
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    :cond_7
    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, La4/h;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La4/h;->b:La4/h$b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    return v0
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-object v0, p0, La4/h;->e:Ld4/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-object v0, p0, La4/h;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, La4/h;->c:Ld4/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

.method public p()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, La4/h;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La4/h;->g:Ld4/h;

    .line 8
    .line 9
    invoke-static {}, Ld4/q;->j()Ld4/q;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    return v0
.end method

.method public q()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, La4/h;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, La4/h;->m()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, La4/h;->n()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, La4/h;->l()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 29
    :goto_1
    return v0
.end method

.method public r()Z
    .locals 2

    .line 1
    iget-object v0, p0, La4/h;->b:La4/h$b;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v1, La4/h$b;->o:La4/h$b;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    invoke-virtual {p0}, La4/h;->o()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :goto_0
    return v0
.end method

.method public s(I)La4/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, La4/h;->a()La4/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, La4/h;->a:Ljava/lang/Integer;

    .line 10
    .line 11
    sget-object p1, La4/h$b;->o:La4/h$b;

    .line 12
    .line 13
    iput-object p1, v0, La4/h;->b:La4/h$b;

    .line 14
    .line 15
    return-object v0
.end method

.method public t(I)La4/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, La4/h;->a()La4/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, La4/h;->a:Ljava/lang/Integer;

    .line 10
    .line 11
    sget-object p1, La4/h$b;->p:La4/h$b;

    .line 12
    .line 13
    iput-object p1, v0, La4/h;->b:La4/h$b;

    .line 14
    .line 15
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, La4/h;->k()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public u()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, La4/h;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La4/h;->m()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La4/h;->n()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    return v0
.end method

.method public w(Ld4/h;)La4/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, La4/h;->a()La4/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object p1, v0, La4/h;->g:Ld4/h;

    .line 6
    .line 7
    return-object v0
.end method

.method public x(Ld4/n;Ld4/b;)La4/h;
    .locals 2

    .line 1
    invoke-interface {p1}, Ld4/n;->B()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p1}, Ld4/n;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    move v0, v1

    .line 18
    :goto_1
    invoke-static {v0}, LY3/m;->f(Z)V

    .line 19
    .line 20
    .line 21
    instance-of v0, p1, Ld4/l;

    .line 22
    .line 23
    xor-int/2addr v0, v1

    .line 24
    invoke-static {v0}, LY3/m;->f(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La4/h;->a()La4/h;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object p1, v0, La4/h;->c:Ld4/n;

    .line 32
    .line 33
    iput-object p2, v0, La4/h;->d:Ld4/b;

    .line 34
    .line 35
    return-object v0
.end method

.method public y()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, La4/h;->h:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, La4/h;->k()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lf4/b;->c(Ljava/util/Map;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La4/h;->h:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    new-instance v1, Ljava/lang/RuntimeException;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    throw v1

    .line 23
    :cond_0
    :goto_0
    iget-object v0, p0, La4/h;->h:Ljava/lang/String;

    .line 24
    .line 25
    return-object v0
.end method
