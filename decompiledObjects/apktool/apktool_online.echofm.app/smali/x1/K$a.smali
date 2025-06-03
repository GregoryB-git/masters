.class public final Lx1/K$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx1/K$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/net/HttpURLConnection;Lx1/o;)Ljava/util/List;
    .locals 4

    .line 1
    const-string v0, "requests"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    invoke-static {p1, v1}, LW5/m;->l(Ljava/lang/Iterable;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lx1/F;

    .line 34
    .line 35
    new-instance v2, Lx1/K;

    .line 36
    .line 37
    new-instance v3, Lx1/r;

    .line 38
    .line 39
    invoke-direct {v3, p2, p3}, Lx1/r;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v2, v1, p2, v3}, Lx1/K;-><init>(Lx1/F;Ljava/net/HttpURLConnection;Lx1/r;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-object v0
.end method

.method public final b(Lx1/F;Ljava/net/HttpURLConnection;Ljava/lang/Object;Ljava/lang/Object;)Lx1/K;
    .locals 2

    .line 1
    instance-of v0, p3, Lorg/json/JSONObject;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    sget-object v0, Lx1/r;->C:Lx1/r$c;

    .line 7
    .line 8
    check-cast p3, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-virtual {v0, p3, p4, p2}, Lx1/r$c;->a(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Lx1/r;

    .line 11
    .line 12
    .line 13
    move-result-object p4

    .line 14
    if-eqz p4, :cond_3

    .line 15
    .line 16
    invoke-static {}, Lx1/K;->a()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-virtual {p4}, Lx1/r;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p4}, Lx1/r;->b()I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    const/16 v0, 0xbe

    .line 32
    .line 33
    if-ne p3, v0, :cond_2

    .line 34
    .line 35
    sget-object p3, LO1/P;->a:LO1/P;

    .line 36
    .line 37
    invoke-virtual {p1}, Lx1/F;->m()Lx1/a;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-static {p3}, LO1/P;->Y(Lx1/a;)Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-eqz p3, :cond_2

    .line 46
    .line 47
    invoke-virtual {p4}, Lx1/r;->g()I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    const/16 v0, 0x1ed

    .line 52
    .line 53
    if-eq p3, v0, :cond_0

    .line 54
    .line 55
    sget-object p3, Lx1/a;->z:Lx1/a$c;

    .line 56
    .line 57
    invoke-virtual {p3, v1}, Lx1/a$c;->h(Lx1/a;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    sget-object p3, Lx1/a;->z:Lx1/a$c;

    .line 62
    .line 63
    invoke-virtual {p3}, Lx1/a$c;->e()Lx1/a;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-nez v0, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v0}, Lx1/a;->n()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-virtual {p3}, Lx1/a$c;->d()V

    .line 87
    .line 88
    .line 89
    :cond_2
    :goto_1
    new-instance p3, Lx1/K;

    .line 90
    .line 91
    invoke-direct {p3, p1, p2, p4}, Lx1/K;-><init>(Lx1/F;Ljava/net/HttpURLConnection;Lx1/r;)V

    .line 92
    .line 93
    .line 94
    return-object p3

    .line 95
    :cond_3
    const-string p4, "body"

    .line 96
    .line 97
    const-string v0, "FACEBOOK_NON_JSON_RESULT"

    .line 98
    .line 99
    invoke-static {p3, p4, v0}, LO1/P;->O(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    instance-of p4, p3, Lorg/json/JSONObject;

    .line 104
    .line 105
    if-eqz p4, :cond_4

    .line 106
    .line 107
    new-instance p4, Lx1/K;

    .line 108
    .line 109
    check-cast p3, Lorg/json/JSONObject;

    .line 110
    .line 111
    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-direct {p4, p1, p2, v0, p3}, Lx1/K;-><init>(Lx1/F;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 116
    .line 117
    .line 118
    return-object p4

    .line 119
    :cond_4
    instance-of p4, p3, Lorg/json/JSONArray;

    .line 120
    .line 121
    if-eqz p4, :cond_5

    .line 122
    .line 123
    new-instance p4, Lx1/K;

    .line 124
    .line 125
    check-cast p3, Lorg/json/JSONArray;

    .line 126
    .line 127
    invoke-virtual {p3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-direct {p4, p1, p2, v0, p3}, Lx1/K;-><init>(Lx1/F;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 132
    .line 133
    .line 134
    return-object p4

    .line 135
    :cond_5
    sget-object p3, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 136
    .line 137
    const-string p4, "NULL"

    .line 138
    .line 139
    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    sget-object p4, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 143
    .line 144
    if-ne p3, p4, :cond_7

    .line 145
    .line 146
    new-instance p4, Lx1/K;

    .line 147
    .line 148
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    invoke-direct {p4, p1, p2, p3, v1}, Lx1/K;-><init>(Lx1/F;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 153
    .line 154
    .line 155
    return-object p4

    .line 156
    :cond_7
    new-instance p1, Lx1/o;

    .line 157
    .line 158
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    const-string p3, "Got unexpected object type in response, class: "

    .line 167
    .line 168
    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-direct {p1, p2}, Lx1/o;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p1
.end method

.method public final c(Ljava/net/HttpURLConnection;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;
    .locals 8

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-ne v0, v2, :cond_1

    .line 13
    .line 14
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lx1/F;

    .line 19
    .line 20
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    .line 21
    .line 22
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v5, "body"

    .line 26
    .line 27
    invoke-virtual {v4, v5, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    const/16 v5, 0xc8

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    :goto_0
    const-string v6, "code"

    .line 40
    .line 41
    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    new-instance v5, Lorg/json/JSONArray;

    .line 45
    .line 46
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto :goto_5

    .line 53
    :catch_0
    move-exception v4

    .line 54
    goto :goto_1

    .line 55
    :catch_1
    move-exception v4

    .line 56
    goto :goto_3

    .line 57
    :goto_1
    new-instance v5, Lx1/K;

    .line 58
    .line 59
    new-instance v6, Lx1/r;

    .line 60
    .line 61
    invoke-direct {v6, p1, v4}, Lx1/r;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v5, v2, p1, v6}, Lx1/K;-><init>(Lx1/F;Ljava/net/HttpURLConnection;Lx1/r;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_4

    .line 71
    :goto_3
    new-instance v5, Lx1/K;

    .line 72
    .line 73
    new-instance v6, Lx1/r;

    .line 74
    .line 75
    invoke-direct {v6, p1, v4}, Lx1/r;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    .line 76
    .line 77
    .line 78
    invoke-direct {v5, v2, p1, v6}, Lx1/K;-><init>(Lx1/F;Ljava/net/HttpURLConnection;Lx1/r;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_1
    :goto_4
    move-object v5, p3

    .line 83
    :goto_5
    instance-of v2, v5, Lorg/json/JSONArray;

    .line 84
    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    move-object v2, v5

    .line 88
    check-cast v2, Lorg/json/JSONArray;

    .line 89
    .line 90
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-ne v4, v0, :cond_4

    .line 95
    .line 96
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-lez v0, :cond_3

    .line 101
    .line 102
    :goto_6
    add-int/lit8 v2, v3, 0x1

    .line 103
    .line 104
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, Lx1/F;

    .line 109
    .line 110
    :try_start_1
    move-object v6, v5

    .line 111
    check-cast v6, Lorg/json/JSONArray;

    .line 112
    .line 113
    invoke-virtual {v6, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    const-string v6, "obj"

    .line 118
    .line 119
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v4, p1, v3, p3}, Lx1/K$a;->b(Lx1/F;Ljava/net/HttpURLConnection;Ljava/lang/Object;Ljava/lang/Object;)Lx1/K;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lx1/o; {:try_start_1 .. :try_end_1} :catch_2

    .line 127
    .line 128
    .line 129
    goto :goto_a

    .line 130
    :catch_2
    move-exception v3

    .line 131
    goto :goto_7

    .line 132
    :catch_3
    move-exception v3

    .line 133
    goto :goto_9

    .line 134
    :goto_7
    new-instance v6, Lx1/K;

    .line 135
    .line 136
    new-instance v7, Lx1/r;

    .line 137
    .line 138
    invoke-direct {v7, p1, v3}, Lx1/r;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    .line 139
    .line 140
    .line 141
    invoke-direct {v6, v4, p1, v7}, Lx1/K;-><init>(Lx1/F;Ljava/net/HttpURLConnection;Lx1/r;)V

    .line 142
    .line 143
    .line 144
    :goto_8
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_a

    .line 148
    :goto_9
    new-instance v6, Lx1/K;

    .line 149
    .line 150
    new-instance v7, Lx1/r;

    .line 151
    .line 152
    invoke-direct {v7, p1, v3}, Lx1/r;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    .line 153
    .line 154
    .line 155
    invoke-direct {v6, v4, p1, v7}, Lx1/K;-><init>(Lx1/F;Ljava/net/HttpURLConnection;Lx1/r;)V

    .line 156
    .line 157
    .line 158
    goto :goto_8

    .line 159
    :goto_a
    if-lt v2, v0, :cond_2

    .line 160
    .line 161
    goto :goto_b

    .line 162
    :cond_2
    move v3, v2

    .line 163
    goto :goto_6

    .line 164
    :cond_3
    :goto_b
    return-object v1

    .line 165
    :cond_4
    new-instance p1, Lx1/o;

    .line 166
    .line 167
    const-string p2, "Unexpected number of results"

    .line 168
    .line 169
    invoke-direct {p1, p2}, Lx1/o;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p1
.end method

.method public final d(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lx1/J;)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "requests"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LO1/P;->s0(Ljava/io/InputStream;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, LO1/C;->e:LO1/C$a;

    .line 11
    .line 12
    sget-object v1, Lx1/N;->q:Lx1/N;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    aput-object v2, v3, v4

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    aput-object p1, v3, v2

    .line 30
    .line 31
    const-string v2, "Response"

    .line 32
    .line 33
    const-string v4, "Response (raw)\n  Size: %d\n  Response:\n%s\n"

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2, v4, v3}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, p3}, Lx1/K$a;->e(Ljava/lang/String;Ljava/net/HttpURLConnection;Lx1/J;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method public final e(Ljava/lang/String;Ljava/net/HttpURLConnection;Lx1/J;)Ljava/util/List;
    .locals 4

    .line 1
    const-string v0, "responseString"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "requests"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lorg/json/JSONTokener;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "resultObject"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p2, p3, v0}, Lx1/K$a;->c(Ljava/net/HttpURLConnection;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    sget-object v0, LO1/C;->e:LO1/C$a;

    .line 30
    .line 31
    sget-object v1, Lx1/N;->o:Lx1/N;

    .line 32
    .line 33
    invoke-virtual {p3}, Lx1/J;->U()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 v2, 0x3

    .line 46
    new-array v2, v2, [Ljava/lang/Object;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    aput-object p3, v2, v3

    .line 50
    .line 51
    const/4 p3, 0x1

    .line 52
    aput-object p1, v2, p3

    .line 53
    .line 54
    const/4 p1, 0x2

    .line 55
    aput-object p2, v2, p1

    .line 56
    .line 57
    const-string p1, "Response"

    .line 58
    .line 59
    const-string p3, "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n"

    .line 60
    .line 61
    invoke-virtual {v0, v1, p1, p3, v2}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-object p2
.end method

.method public final f(Ljava/net/HttpURLConnection;Lx1/J;)Ljava/util/List;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "Response <Error>: %s"

    .line 4
    .line 5
    const-string v3, "Response"

    .line 6
    .line 7
    const-string v4, "connection"

    .line 8
    .line 9
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v4, "requests"

    .line 13
    .line 14
    invoke-static {p2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    :try_start_0
    invoke-static {}, Lx1/B;->E()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/16 v6, 0x190

    .line 29
    .line 30
    if-lt v5, v6, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_5

    .line 39
    :catch_0
    move-exception v5

    .line 40
    goto :goto_2

    .line 41
    :catch_1
    move-exception v5

    .line 42
    goto :goto_3

    .line 43
    :cond_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    :goto_0
    invoke-virtual {p0, v4, p1, p2}, Lx1/K$a;->d(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lx1/J;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1
    :try_end_0
    .catch Lx1/o; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :goto_1
    invoke-static {v4}, LO1/P;->j(Ljava/io/Closeable;)V

    .line 52
    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_1
    :try_start_1
    const-string v5, "GraphRequest can\'t be used when Facebook SDK isn\'t fully initialized"

    .line 56
    .line 57
    invoke-static {}, Lx1/K;->a()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-static {v6, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    new-instance v6, Lx1/o;

    .line 65
    .line 66
    invoke-direct {v6, v5}, Lx1/o;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v6
    :try_end_1
    .catch Lx1/o; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    :goto_2
    :try_start_2
    sget-object v6, LO1/C;->e:LO1/C$a;

    .line 71
    .line 72
    sget-object v7, Lx1/N;->o:Lx1/N;

    .line 73
    .line 74
    new-array v1, v1, [Ljava/lang/Object;

    .line 75
    .line 76
    aput-object v5, v1, v0

    .line 77
    .line 78
    invoke-virtual {v6, v7, v3, v2, v1}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Lx1/o;

    .line 82
    .line 83
    invoke-direct {v0, v5}, Lx1/o;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p2, p1, v0}, Lx1/K$a;->a(Ljava/util/List;Ljava/net/HttpURLConnection;Lx1/o;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    goto :goto_1

    .line 91
    :goto_3
    sget-object v6, LO1/C;->e:LO1/C$a;

    .line 92
    .line 93
    sget-object v7, Lx1/N;->o:Lx1/N;

    .line 94
    .line 95
    new-array v1, v1, [Ljava/lang/Object;

    .line 96
    .line 97
    aput-object v5, v1, v0

    .line 98
    .line 99
    invoke-virtual {v6, v7, v3, v2, v1}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p2, p1, v5}, Lx1/K$a;->a(Ljava/util/List;Ljava/net/HttpURLConnection;Lx1/o;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    goto :goto_1

    .line 107
    :goto_4
    return-object p1

    .line 108
    :goto_5
    invoke-static {v4}, LO1/P;->j(Ljava/io/Closeable;)V

    .line 109
    .line 110
    .line 111
    throw p1
.end method
