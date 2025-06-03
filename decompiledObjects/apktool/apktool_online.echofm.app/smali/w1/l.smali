.class public final Lw1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$c;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lw1/a;

.field public final c:Lw1/q;

.field public final d:Lw1/y;

.field public e:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lw1/a;Lw1/q;Lw1/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw1/l;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lw1/l;->b:Lw1/a;

    .line 7
    .line 8
    iput-object p3, p0, Lw1/l;->c:Lw1/q;

    .line 9
    .line 10
    iput-object p4, p0, Lw1/l;->d:Lw1/y;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a(LE5/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lw1/l;->e(LE5/k$d;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(LE5/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lw1/l;->f(LE5/k$d;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(LE5/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lw1/l;->g(LE5/k$d;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(LE5/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lw1/l;->h(LE5/k$d;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(LE5/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, p2, v0}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic f(LE5/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, p2, v0}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic g(LE5/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, p2, v0}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic h(LE5/k$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, p2, v0}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public i(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw1/l;->e:Landroid/app/Activity;

    .line 2
    .line 3
    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 4

    .line 1
    iget-object v0, p1, LE5/j;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, -0x1

    .line 11
    sparse-switch v1, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :sswitch_0
    const-string v1, "requestPermissions"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x4

    .line 25
    goto :goto_0

    .line 26
    :sswitch_1
    const-string v1, "openAppSettings"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v2, 0x3

    .line 36
    goto :goto_0

    .line 37
    :sswitch_2
    const-string v1, "checkPermissionStatus"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v2, 0x2

    .line 47
    goto :goto_0

    .line 48
    :sswitch_3
    const-string v1, "shouldShowRequestPermissionRationale"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const/4 v2, 0x1

    .line 58
    goto :goto_0

    .line 59
    :sswitch_4
    const-string v1, "checkServiceStatus"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    const/4 v2, 0x0

    .line 69
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 70
    .line 71
    .line 72
    invoke-interface {p2}, LE5/k$d;->c()V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :pswitch_0
    invoke-virtual {p1}, LE5/j;->b()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Ljava/util/List;

    .line 82
    .line 83
    iget-object v0, p0, Lw1/l;->c:Lw1/q;

    .line 84
    .line 85
    iget-object v1, p0, Lw1/l;->e:Landroid/app/Activity;

    .line 86
    .line 87
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    new-instance v2, Lw1/f;

    .line 91
    .line 92
    invoke-direct {v2, p2}, Lw1/f;-><init>(LE5/k$d;)V

    .line 93
    .line 94
    .line 95
    new-instance v3, Lw1/g;

    .line 96
    .line 97
    invoke-direct {v3, p2}, Lw1/g;-><init>(LE5/k$d;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, p1, v1, v2, v3}, Lw1/q;->h(Ljava/util/List;Landroid/app/Activity;Lw1/q$b;Lw1/b;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_1
    iget-object p1, p0, Lw1/l;->b:Lw1/a;

    .line 105
    .line 106
    iget-object v0, p0, Lw1/l;->a:Landroid/content/Context;

    .line 107
    .line 108
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    new-instance v1, Lw1/j;

    .line 112
    .line 113
    invoke-direct {v1, p2}, Lw1/j;-><init>(LE5/k$d;)V

    .line 114
    .line 115
    .line 116
    new-instance v2, Lw1/k;

    .line 117
    .line 118
    invoke-direct {v2, p2}, Lw1/k;-><init>(LE5/k$d;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0, v1, v2}, Lw1/a;->a(Landroid/content/Context;Lw1/a$a;Lw1/b;)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :pswitch_2
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    iget-object v0, p0, Lw1/l;->c:Lw1/q;

    .line 136
    .line 137
    iget-object v1, p0, Lw1/l;->a:Landroid/content/Context;

    .line 138
    .line 139
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    new-instance v2, Lw1/e;

    .line 143
    .line 144
    invoke-direct {v2, p2}, Lw1/e;-><init>(LE5/k$d;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, p1, v1, v2}, Lw1/q;->e(ILandroid/content/Context;Lw1/q$a;)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :pswitch_3
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    iget-object v0, p0, Lw1/l;->c:Lw1/q;

    .line 162
    .line 163
    iget-object v1, p0, Lw1/l;->e:Landroid/app/Activity;

    .line 164
    .line 165
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    new-instance v2, Lw1/h;

    .line 169
    .line 170
    invoke-direct {v2, p2}, Lw1/h;-><init>(LE5/k$d;)V

    .line 171
    .line 172
    .line 173
    new-instance v3, Lw1/i;

    .line 174
    .line 175
    invoke-direct {v3, p2}, Lw1/i;-><init>(LE5/k$d;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, p1, v1, v2, v3}, Lw1/q;->i(ILandroid/app/Activity;Lw1/q$c;Lw1/b;)V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :pswitch_4
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    iget-object v0, p0, Lw1/l;->d:Lw1/y;

    .line 193
    .line 194
    iget-object v1, p0, Lw1/l;->a:Landroid/content/Context;

    .line 195
    .line 196
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    new-instance v2, Lw1/c;

    .line 200
    .line 201
    invoke-direct {v2, p2}, Lw1/c;-><init>(LE5/k$d;)V

    .line 202
    .line 203
    .line 204
    new-instance v3, Lw1/d;

    .line 205
    .line 206
    invoke-direct {v3, p2}, Lw1/d;-><init>(LE5/k$d;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, p1, v1, v2, v3}, Lw1/y;->a(ILandroid/content/Context;Lw1/y$a;Lw1/b;)V

    .line 210
    .line 211
    .line 212
    :goto_1
    return-void

    .line 213
    :sswitch_data_0
    .sparse-switch
        -0x5c086121 -> :sswitch_4
        -0x3ca2ffb7 -> :sswitch_3
        -0x22583c37 -> :sswitch_2
        0x14b278ba -> :sswitch_1
        0x637dca75 -> :sswitch_0
    .end sparse-switch

    .line 214
    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
