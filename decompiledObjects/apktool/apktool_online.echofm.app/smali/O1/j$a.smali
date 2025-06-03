.class public final LO1/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO1/j;
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
    invoke-direct {p0}, LO1/j$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONArray;)LO1/j;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONArray;->length()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-lez v3, :cond_7

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    move-object v5, v2

    .line 17
    move-object v6, v5

    .line 18
    move-object v7, v6

    .line 19
    move-object v8, v7

    .line 20
    move-object v9, v8

    .line 21
    move-object v10, v9

    .line 22
    :goto_0
    add-int/lit8 v11, v4, 0x1

    .line 23
    .line 24
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const-string v12, "name"

    .line 32
    .line 33
    invoke-virtual {v4, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v12

    .line 37
    if-nez v12, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const-string v13, "other"

    .line 41
    .line 42
    const/4 v14, 0x1

    .line 43
    invoke-static {v12, v13, v14}, Lkotlin/text/i;->l(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v13

    .line 47
    const-string v15, "recovery_message"

    .line 48
    .line 49
    if-eqz v13, :cond_3

    .line 50
    .line 51
    invoke-virtual {v4, v15, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-virtual {v0, v4}, LO1/j$a;->d(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    const-string v13, "transient"

    .line 61
    .line 62
    invoke-static {v12, v13, v14}, Lkotlin/text/i;->l(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v13

    .line 66
    if-eqz v13, :cond_4

    .line 67
    .line 68
    invoke-virtual {v4, v15, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    invoke-virtual {v0, v4}, LO1/j$a;->d(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    const-string v13, "login_recoverable"

    .line 78
    .line 79
    invoke-static {v12, v13, v14}, Lkotlin/text/i;->l(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    if-eqz v12, :cond_5

    .line 84
    .line 85
    invoke-virtual {v4, v15, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-virtual {v0, v4}, LO1/j$a;->d(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    :cond_5
    :goto_1
    if-lt v11, v3, :cond_6

    .line 94
    .line 95
    move-object v13, v5

    .line 96
    move-object v14, v6

    .line 97
    move-object v15, v7

    .line 98
    move-object/from16 v16, v8

    .line 99
    .line 100
    move-object/from16 v17, v9

    .line 101
    .line 102
    move-object/from16 v18, v10

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    move v4, v11

    .line 106
    goto :goto_0

    .line 107
    :cond_7
    move-object v13, v2

    .line 108
    move-object v14, v13

    .line 109
    move-object v15, v14

    .line 110
    move-object/from16 v16, v15

    .line 111
    .line 112
    move-object/from16 v17, v16

    .line 113
    .line 114
    move-object/from16 v18, v17

    .line 115
    .line 116
    :goto_2
    new-instance v1, LO1/j;

    .line 117
    .line 118
    move-object v12, v1

    .line 119
    invoke-direct/range {v12 .. v18}, LO1/j;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object v1
.end method

.method public final declared-synchronized b()LO1/j;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, LO1/j;->a()LO1/j;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LO1/j$a;->c()LO1/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, LO1/j;->b(LO1/j;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    invoke-static {}, LO1/j;->a()LO1/j;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-object v0

    .line 26
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 27
    .line 28
    const-string v1, "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification"

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    :goto_1
    monitor-exit p0

    .line 35
    throw v0
.end method

.method public final c()LO1/j;
    .locals 17

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v1, v2}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v3, 0x4

    .line 12
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-static {v4, v2}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const/16 v5, 0x9

    .line 21
    .line 22
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-static {v5, v2}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/16 v6, 0x11

    .line 31
    .line 32
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-static {v6, v2}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const/16 v7, 0x155

    .line 41
    .line 42
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-static {v7, v2}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    const/4 v8, 0x5

    .line 51
    new-array v8, v8, [LV5/m;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    aput-object v1, v8, v9

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    aput-object v4, v8, v1

    .line 58
    .line 59
    aput-object v5, v8, v0

    .line 60
    .line 61
    const/4 v4, 0x3

    .line 62
    aput-object v6, v8, v4

    .line 63
    .line 64
    aput-object v7, v8, v3

    .line 65
    .line 66
    invoke-static {v8}, LW5/C;->e([LV5/m;)Ljava/util/HashMap;

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    const/16 v3, 0x66

    .line 71
    .line 72
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {v3, v2}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    const/16 v5, 0xbe

    .line 81
    .line 82
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v5, v2}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    const/16 v6, 0x19c

    .line 91
    .line 92
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-static {v6, v2}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    new-array v4, v4, [LV5/m;

    .line 101
    .line 102
    aput-object v3, v4, v9

    .line 103
    .line 104
    aput-object v5, v4, v1

    .line 105
    .line 106
    aput-object v2, v4, v0

    .line 107
    .line 108
    invoke-static {v4}, LW5/C;->e([LV5/m;)Ljava/util/HashMap;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    new-instance v0, LO1/j;

    .line 113
    .line 114
    const/4 v15, 0x0

    .line 115
    const/16 v16, 0x0

    .line 116
    .line 117
    const/4 v11, 0x0

    .line 118
    const/4 v14, 0x0

    .line 119
    move-object v10, v0

    .line 120
    invoke-direct/range {v10 .. v16}, LO1/j;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-object v0
.end method

.method public final d(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 11

    .line 1
    const-string v0, "items"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_9

    .line 9
    .line 10
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_5

    .line 17
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-lez v2, :cond_8

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    move v4, v3

    .line 30
    :goto_0
    add-int/lit8 v5, v4, 0x1

    .line 31
    .line 32
    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_1
    const-string v6, "code"

    .line 40
    .line 41
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-nez v6, :cond_2

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_2
    const-string v7, "subcodes"

    .line 49
    .line 50
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    if-eqz v4, :cond_5

    .line 55
    .line 56
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-lez v7, :cond_5

    .line 61
    .line 62
    new-instance v7, Ljava/util/HashSet;

    .line 63
    .line 64
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    if-lez v8, :cond_6

    .line 72
    .line 73
    move v9, v3

    .line 74
    :goto_1
    add-int/lit8 v10, v9, 0x1

    .line 75
    .line 76
    invoke-virtual {v4, v9}, Lorg/json/JSONArray;->optInt(I)I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-eqz v9, :cond_3

    .line 81
    .line 82
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-virtual {v7, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    :cond_3
    if-lt v10, v8, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    move v9, v10

    .line 93
    goto :goto_1

    .line 94
    :cond_5
    move-object v7, v0

    .line 95
    :cond_6
    :goto_2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-interface {v1, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :goto_3
    if-lt v5, v2, :cond_7

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_7
    move v4, v5

    .line 106
    goto :goto_0

    .line 107
    :cond_8
    :goto_4
    return-object v1

    .line 108
    :cond_9
    :goto_5
    return-object v0
.end method
