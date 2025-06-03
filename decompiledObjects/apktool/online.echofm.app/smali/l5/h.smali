.class public Ll5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/SharedPreferences;

.field public b:Z

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:I

.field public g:Ljava/lang/String;

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "audio_service_preferences"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    const-string v0, "androidResumeOnClick"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput-boolean p1, p0, Ll5/h;->b:Z

    .line 21
    .line 22
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 23
    .line 24
    const-string v0, "androidNotificationChannelId"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Ll5/h;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 34
    .line 35
    const-string v0, "androidNotificationChannelName"

    .line 36
    .line 37
    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Ll5/h;->d:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 44
    .line 45
    const-string v0, "androidNotificationChannelDescription"

    .line 46
    .line 47
    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Ll5/h;->e:Ljava/lang/String;

    .line 52
    .line 53
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 54
    .line 55
    const-string v0, "notificationColor"

    .line 56
    .line 57
    const/4 v4, -0x1

    .line 58
    invoke-interface {p1, v0, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iput p1, p0, Ll5/h;->f:I

    .line 63
    .line 64
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 65
    .line 66
    const-string v0, "androidNotificationIcon"

    .line 67
    .line 68
    const-string v5, "mipmap/ic_launcher"

    .line 69
    .line 70
    invoke-interface {p1, v0, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Ll5/h;->g:Ljava/lang/String;

    .line 75
    .line 76
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 77
    .line 78
    const-string v0, "androidShowNotificationBadge"

    .line 79
    .line 80
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    iput-boolean p1, p0, Ll5/h;->h:Z

    .line 85
    .line 86
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 87
    .line 88
    const-string v0, "androidNotificationClickStartsActivity"

    .line 89
    .line 90
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    iput-boolean p1, p0, Ll5/h;->i:Z

    .line 95
    .line 96
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 97
    .line 98
    const-string v0, "androidNotificationOngoing"

    .line 99
    .line 100
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    iput-boolean p1, p0, Ll5/h;->j:Z

    .line 105
    .line 106
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 107
    .line 108
    const-string v0, "androidStopForegroundOnPause"

    .line 109
    .line 110
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    iput-boolean p1, p0, Ll5/h;->k:Z

    .line 115
    .line 116
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 117
    .line 118
    const-string v0, "artDownscaleWidth"

    .line 119
    .line 120
    invoke-interface {p1, v0, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    iput p1, p0, Ll5/h;->l:I

    .line 125
    .line 126
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 127
    .line 128
    const-string v0, "artDownscaleHeight"

    .line 129
    .line 130
    invoke-interface {p1, v0, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    iput p1, p0, Ll5/h;->m:I

    .line 135
    .line 136
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 137
    .line 138
    const-string v0, "activityClassName"

    .line 139
    .line 140
    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iput-object p1, p0, Ll5/h;->n:Ljava/lang/String;

    .line 145
    .line 146
    iget-object p1, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 147
    .line 148
    const-string v0, "androidBrowsableRootExtras"

    .line 149
    .line 150
    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iput-object p1, p0, Ll5/h;->o:Ljava/lang/String;

    .line 155
    .line 156
    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 8

    .line 1
    iget-object v0, p0, Ll5/h;->o:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 8
    .line 9
    iget-object v2, p0, Ll5/h;->o:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 34
    .line 35
    :try_start_1
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v2, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    :try_start_2
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-virtual {v2, v4, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catch_1
    :try_start_3
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    invoke-virtual {v2, v4, v5, v6}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_2
    :try_start_4
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v2, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catch_3
    :try_start_5
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 68
    .line 69
    new-instance v6, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v7, "Unsupported extras value for key "

    .line 75
    .line 76
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v5, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catch_4
    move-exception v0

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    return-object v2

    .line 93
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 94
    .line 95
    .line 96
    return-object v1
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Ll5/h;->a:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "androidResumeOnClick"

    .line 8
    .line 9
    iget-boolean v2, p0, Ll5/h;->b:Z

    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "androidNotificationChannelId"

    .line 16
    .line 17
    iget-object v2, p0, Ll5/h;->c:Ljava/lang/String;

    .line 18
    .line 19
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "androidNotificationChannelName"

    .line 24
    .line 25
    iget-object v2, p0, Ll5/h;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "androidNotificationChannelDescription"

    .line 32
    .line 33
    iget-object v2, p0, Ll5/h;->e:Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "notificationColor"

    .line 40
    .line 41
    iget v2, p0, Ll5/h;->f:I

    .line 42
    .line 43
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "androidNotificationIcon"

    .line 48
    .line 49
    iget-object v2, p0, Ll5/h;->g:Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "androidShowNotificationBadge"

    .line 56
    .line 57
    iget-boolean v2, p0, Ll5/h;->h:Z

    .line 58
    .line 59
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "androidNotificationClickStartsActivity"

    .line 64
    .line 65
    iget-boolean v2, p0, Ll5/h;->i:Z

    .line 66
    .line 67
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v1, "androidNotificationOngoing"

    .line 72
    .line 73
    iget-boolean v2, p0, Ll5/h;->j:Z

    .line 74
    .line 75
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v1, "androidStopForegroundOnPause"

    .line 80
    .line 81
    iget-boolean v2, p0, Ll5/h;->k:Z

    .line 82
    .line 83
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v1, "artDownscaleWidth"

    .line 88
    .line 89
    iget v2, p0, Ll5/h;->l:I

    .line 90
    .line 91
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v1, "artDownscaleHeight"

    .line 96
    .line 97
    iget v2, p0, Ll5/h;->m:I

    .line 98
    .line 99
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v1, "activityClassName"

    .line 104
    .line 105
    iget-object v2, p0, Ll5/h;->n:Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const-string v1, "androidBrowsableRootExtras"

    .line 112
    .line 113
    iget-object v2, p0, Ll5/h;->o:Ljava/lang/String;

    .line 114
    .line 115
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public c(Ljava/util/Map;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    iput-object p1, p0, Ll5/h;->o:Ljava/lang/String;

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :goto_1
    return-void
.end method
