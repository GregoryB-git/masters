.class public LO3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO3/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lorg/json/JSONObject;)LO3/d$a;
    .locals 4

    .line 1
    const-string v0, "collect_reports"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v1, "collect_anrs"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const-string v3, "collect_build_ids"

    .line 16
    .line 17
    invoke-virtual {p0, v3, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    new-instance v2, LO3/d$a;

    .line 22
    .line 23
    invoke-direct {v2, v0, v1, p0}, LO3/d$a;-><init>(ZZZ)V

    .line 24
    .line 25
    .line 26
    return-object v2
.end method

.method public static c(Lorg/json/JSONObject;)LO3/d$b;
    .locals 2

    .line 1
    const-string v0, "max_custom_exception_events"

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    new-instance v0, LO3/d$b;

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-direct {v0, p0, v1}, LO3/d$b;-><init>(II)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static d(LH3/x;JLorg/json/JSONObject;)J
    .locals 4

    .line 1
    const-string v0, "expires_at"

    .line 2
    .line 3
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {p0}, LH3/x;->a()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    const-wide/16 v2, 0x3e8

    .line 19
    .line 20
    mul-long/2addr p1, v2

    .line 21
    add-long p0, v0, p1

    .line 22
    .line 23
    :goto_0
    return-wide p0
.end method


# virtual methods
.method public a(LH3/x;Lorg/json/JSONObject;)LO3/d;
    .locals 15

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const-string v1, "settings_version"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result v8

    .line 10
    const-string v1, "cache_duration"

    .line 11
    .line 12
    const/16 v2, 0xe10

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v9

    .line 18
    const-string v1, "on_demand_upload_rate_per_minute"

    .line 19
    .line 20
    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 23
    .line 24
    .line 25
    move-result-wide v10

    .line 26
    const-string v1, "on_demand_backoff_base"

    .line 27
    .line 28
    const-wide v2, 0x3ff3333333333333L    # 1.2

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 34
    .line 35
    .line 36
    move-result-wide v12

    .line 37
    const-string v1, "on_demand_backoff_step_duration_seconds"

    .line 38
    .line 39
    const/16 v2, 0x3c

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 42
    .line 43
    .line 44
    move-result v14

    .line 45
    const-string v1, "session"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :goto_0
    invoke-static {v1}, LO3/l;->c(Lorg/json/JSONObject;)LO3/d$b;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    move-object v6, v1

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    .line 64
    .line 65
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :goto_1
    const-string v1, "features"

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v1}, LO3/l;->b(Lorg/json/JSONObject;)LO3/d$a;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    int-to-long v1, v9

    .line 80
    move-object/from16 v3, p1

    .line 81
    .line 82
    invoke-static {v3, v1, v2, v0}, LO3/l;->d(LH3/x;JLorg/json/JSONObject;)J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    new-instance v0, LO3/d;

    .line 87
    .line 88
    move-object v3, v0

    .line 89
    invoke-direct/range {v3 .. v14}, LO3/d;-><init>(JLO3/d$b;LO3/d$a;IIDDI)V

    .line 90
    .line 91
    .line 92
    return-object v0
.end method
