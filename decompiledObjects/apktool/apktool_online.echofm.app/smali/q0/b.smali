.class public final Lq0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/k;


# static fields
.field public static final f:LF0/L;


# instance fields
.field public final a:LF0/r;

.field public final b:Ld0/q;

.field public final c:Lg0/E;

.field public final d:Lc1/t$a;

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LF0/L;

    .line 2
    .line 3
    invoke-direct {v0}, LF0/L;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq0/b;->f:LF0/L;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LF0/r;Ld0/q;Lg0/E;Lc1/t$a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq0/b;->a:LF0/r;

    .line 5
    .line 6
    iput-object p2, p0, Lq0/b;->b:Ld0/q;

    .line 7
    .line 8
    iput-object p3, p0, Lq0/b;->c:Lg0/E;

    .line 9
    .line 10
    iput-object p4, p0, Lq0/b;->d:Lc1/t$a;

    .line 11
    .line 12
    iput-boolean p5, p0, Lq0/b;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/b;->a:LF0/r;

    .line 2
    .line 3
    invoke-interface {v0}, LF0/r;->d()LF0/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ll1/h;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    instance-of v1, v0, Ll1/b;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    instance-of v1, v0, Ll1/e;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    instance-of v0, v0, LY0/f;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 27
    :goto_1
    return v0
.end method

.method public b(LF0/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/b;->a:LF0/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF0/r;->b(LF0/t;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(LF0/s;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/b;->a:LF0/r;

    .line 2
    .line 3
    sget-object v1, Lq0/b;->f:LF0/L;

    .line 4
    .line 5
    invoke-interface {v0, p1, v1}, LF0/r;->i(LF0/s;LF0/L;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    return p1
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lq0/b;->a:LF0/r;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-interface {v0, v1, v2, v1, v2}, LF0/r;->a(JJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/b;->a:LF0/r;

    .line 2
    .line 3
    invoke-interface {v0}, LF0/r;->d()LF0/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ll1/J;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    instance-of v0, v0, LZ0/h;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    :goto_1
    return v0
.end method

.method public f()Lq0/k;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lq0/b;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    xor-int/2addr v0, v1

    .line 7
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lq0/b;->a:LF0/r;

    .line 11
    .line 12
    invoke-interface {v0}, LF0/r;->d()LF0/r;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v2, p0, Lq0/b;->a:LF0/r;

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "Can\'t recreate wrapped extractors. Outer type: "

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lq0/b;->a:LF0/r;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v1, v0}, Lg0/a;->g(ZLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lq0/b;->a:LF0/r;

    .line 49
    .line 50
    instance-of v1, v0, Lq0/w;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    new-instance v0, Lq0/w;

    .line 55
    .line 56
    iget-object v1, p0, Lq0/b;->b:Ld0/q;

    .line 57
    .line 58
    iget-object v1, v1, Ld0/q;->d:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v2, p0, Lq0/b;->c:Lg0/E;

    .line 61
    .line 62
    iget-object v3, p0, Lq0/b;->d:Lc1/t$a;

    .line 63
    .line 64
    iget-boolean v4, p0, Lq0/b;->e:Z

    .line 65
    .line 66
    invoke-direct {v0, v1, v2, v3, v4}, Lq0/w;-><init>(Ljava/lang/String;Lg0/E;Lc1/t$a;Z)V

    .line 67
    .line 68
    .line 69
    :goto_1
    move-object v2, v0

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    instance-of v1, v0, Ll1/h;

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    new-instance v0, Ll1/h;

    .line 76
    .line 77
    invoke-direct {v0}, Ll1/h;-><init>()V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    instance-of v1, v0, Ll1/b;

    .line 82
    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    new-instance v0, Ll1/b;

    .line 86
    .line 87
    invoke-direct {v0}, Ll1/b;-><init>()V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    instance-of v1, v0, Ll1/e;

    .line 92
    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    new-instance v0, Ll1/e;

    .line 96
    .line 97
    invoke-direct {v0}, Ll1/e;-><init>()V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    instance-of v0, v0, LY0/f;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    new-instance v0, LY0/f;

    .line 106
    .line 107
    invoke-direct {v0}, LY0/f;-><init>()V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :goto_2
    new-instance v0, Lq0/b;

    .line 112
    .line 113
    iget-object v3, p0, Lq0/b;->b:Ld0/q;

    .line 114
    .line 115
    iget-object v4, p0, Lq0/b;->c:Lg0/E;

    .line 116
    .line 117
    iget-object v5, p0, Lq0/b;->d:Lc1/t$a;

    .line 118
    .line 119
    iget-boolean v6, p0, Lq0/b;->e:Z

    .line 120
    .line 121
    move-object v1, v0

    .line 122
    invoke-direct/range {v1 .. v6}, Lq0/b;-><init>(LF0/r;Ld0/q;Lg0/E;Lc1/t$a;Z)V

    .line 123
    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    new-instance v1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v2, "Unexpected extractor type for recreation: "

    .line 134
    .line 135
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v2, p0, Lq0/b;->a:LF0/r;

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v0
.end method
