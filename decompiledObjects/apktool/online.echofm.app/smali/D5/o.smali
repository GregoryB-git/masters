.class public LD5/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD5/o$j;,
        LD5/o$k;,
        LD5/o$c;,
        LD5/o$h;,
        LD5/o$f;,
        LD5/o$l;,
        LD5/o$d;,
        LD5/o$e;,
        LD5/o$g;,
        LD5/o$i;
    }
.end annotation


# instance fields
.field public final a:LE5/k;

.field public b:LD5/o$h;

.field public final c:LE5/k$c;


# direct methods
.method public constructor <init>(Lw5/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LD5/o$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LD5/o$a;-><init>(LD5/o;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LD5/o;->c:LE5/k$c;

    .line 10
    .line 11
    new-instance v1, LE5/k;

    .line 12
    .line 13
    const-string v2, "flutter/platform"

    .line 14
    .line 15
    sget-object v3, LE5/g;->a:LE5/g;

    .line 16
    .line 17
    invoke-direct {v1, p1, v2, v3}, LE5/k;-><init>(LE5/c;Ljava/lang/String;LE5/l;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, LD5/o;->a:LE5/k;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(LD5/o;)LD5/o$h;
    .locals 0

    .line 1
    iget-object p0, p0, LD5/o;->b:LD5/o$h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(LD5/o;Lorg/json/JSONArray;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD5/o;->h(Lorg/json/JSONArray;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(LD5/o;Lorg/json/JSONObject;)LD5/o$c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD5/o;->g(Lorg/json/JSONObject;)LD5/o$c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(LD5/o;Lorg/json/JSONArray;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD5/o;->k(Lorg/json/JSONArray;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(LD5/o;Ljava/lang/String;)LD5/o$k;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD5/o;->j(Ljava/lang/String;)LD5/o$k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(LD5/o;Lorg/json/JSONObject;)LD5/o$j;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD5/o;->i(Lorg/json/JSONObject;)LD5/o$j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final g(Lorg/json/JSONObject;)LD5/o$c;
    .locals 2

    .line 1
    const-string v0, "primaryColor"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/high16 v1, -0x1000000

    .line 10
    .line 11
    or-int/2addr v0, v1

    .line 12
    :cond_0
    const-string v1, "label"

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v1, LD5/o$c;

    .line 19
    .line 20
    invoke-direct {v1, v0, p1}, LD5/o$c;-><init>(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v1
.end method

.method public final h(Lorg/json/JSONArray;)I
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    const/4 v5, 0x4

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x1

    .line 12
    if-ge v1, v4, :cond_5

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-static {v4}, LD5/o$f;->e(Ljava/lang/String;)LD5/o$f;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    sget-object v8, LD5/o$b;->a:[I

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    aget v4, v8, v4

    .line 29
    .line 30
    if-eq v4, v7, :cond_3

    .line 31
    .line 32
    if-eq v4, v6, :cond_2

    .line 33
    .line 34
    const/4 v6, 0x3

    .line 35
    if-eq v4, v6, :cond_1

    .line 36
    .line 37
    if-eq v4, v5, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    or-int/lit8 v2, v2, 0x8

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    or-int/lit8 v2, v2, 0x2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    or-int/lit8 v2, v2, 0x4

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    or-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    :goto_1
    if-nez v3, :cond_4

    .line 52
    .line 53
    move v3, v2

    .line 54
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    if-eqz v2, :cond_9

    .line 58
    .line 59
    const/16 p1, 0x9

    .line 60
    .line 61
    const/16 v1, 0x8

    .line 62
    .line 63
    packed-switch v2, :pswitch_data_0

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :pswitch_0
    const/16 p1, 0xd

    .line 68
    .line 69
    return p1

    .line 70
    :pswitch_1
    return v6

    .line 71
    :pswitch_2
    const/16 p1, 0xb

    .line 72
    .line 73
    return p1

    .line 74
    :pswitch_3
    return v1

    .line 75
    :pswitch_4
    const/16 p1, 0xc

    .line 76
    .line 77
    :pswitch_5
    return p1

    .line 78
    :pswitch_6
    if-eq v3, v6, :cond_8

    .line 79
    .line 80
    if-eq v3, v5, :cond_7

    .line 81
    .line 82
    if-eq v3, v1, :cond_6

    .line 83
    .line 84
    :goto_2
    return v7

    .line 85
    :cond_6
    return v1

    .line 86
    :cond_7
    return p1

    .line 87
    :cond_8
    :pswitch_7
    return v0

    .line 88
    :cond_9
    const/4 p1, -0x1

    .line 89
    return p1

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_6
        :pswitch_3
        :pswitch_6
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lorg/json/JSONObject;)LD5/o$j;
    .locals 11

    .line 1
    const-string v0, "statusBarColor"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-object v4, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v4, v2

    .line 21
    :goto_0
    const-string v0, "statusBarIconBrightness"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, LD5/o$d;->e(Ljava/lang/String;)LD5/o$d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v5, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v5, v2

    .line 40
    :goto_1
    const-string v0, "systemStatusBarContrastEnforced"

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object v6, v0

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move-object v6, v2

    .line 59
    :goto_2
    const-string v0, "systemNavigationBarColor"

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move-object v7, v0

    .line 76
    goto :goto_3

    .line 77
    :cond_3
    move-object v7, v2

    .line 78
    :goto_3
    const-string v0, "systemNavigationBarIconBrightness"

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_4

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, LD5/o$d;->e(Ljava/lang/String;)LD5/o$d;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    move-object v8, v0

    .line 95
    goto :goto_4

    .line 96
    :cond_4
    move-object v8, v2

    .line 97
    :goto_4
    const-string v0, "systemNavigationBarDividerColor"

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-nez v1, :cond_5

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    move-object v9, v0

    .line 114
    goto :goto_5

    .line 115
    :cond_5
    move-object v9, v2

    .line 116
    :goto_5
    const-string v0, "systemNavigationBarContrastEnforced"

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_6

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    :cond_6
    move-object v10, v2

    .line 133
    new-instance p1, LD5/o$j;

    .line 134
    .line 135
    move-object v3, p1

    .line 136
    invoke-direct/range {v3 .. v10}, LD5/o$j;-><init>(Ljava/lang/Integer;LD5/o$d;Ljava/lang/Boolean;Ljava/lang/Integer;LD5/o$d;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    .line 137
    .line 138
    .line 139
    return-object p1
.end method

.method public final j(Ljava/lang/String;)LD5/o$k;
    .locals 1

    .line 1
    invoke-static {p1}, LD5/o$k;->e(Ljava/lang/String;)LD5/o$k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, LD5/o$b;->c:[I

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    aget p1, v0, p1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p1, v0, :cond_3

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-eq p1, v0, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    if-eq p1, v0, :cond_0

    .line 24
    .line 25
    sget-object p1, LD5/o$k;->s:LD5/o$k;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, LD5/o$k;->s:LD5/o$k;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    sget-object p1, LD5/o$k;->r:LD5/o$k;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_2
    sget-object p1, LD5/o$k;->q:LD5/o$k;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    sget-object p1, LD5/o$k;->p:LD5/o$k;

    .line 38
    .line 39
    return-object p1
.end method

.method public final k(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_2

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, LD5/o$l;->e(Ljava/lang/String;)LD5/o$l;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, LD5/o$b;->b:[I

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    aget v2, v3, v2

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    if-eq v2, v3, :cond_1

    .line 31
    .line 32
    const/4 v3, 0x2

    .line 33
    if-eq v2, v3, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    sget-object v2, LD5/o$l;->q:LD5/o$l;

    .line 37
    .line 38
    :goto_1
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    sget-object v2, LD5/o$l;->p:LD5/o$l;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    return-object v0
.end method

.method public l(LD5/o$h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD5/o;->b:LD5/o$h;

    .line 2
    .line 3
    return-void
.end method

.method public m(Z)V
    .locals 3

    .line 1
    const-string v0, "PlatformChannel"

    .line 2
    .line 3
    const-string v1, "Sending \'systemUIChange\' message."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LD5/o;->a:LE5/k;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x1

    .line 15
    new-array v1, v1, [Ljava/lang/Boolean;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aput-object p1, v1, v2

    .line 19
    .line 20
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "SystemChrome.systemUIChange"

    .line 25
    .line 26
    invoke-virtual {v0, v1, p1}, LE5/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
