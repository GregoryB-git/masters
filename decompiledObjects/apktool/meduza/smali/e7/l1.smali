.class public final Le7/l1;
.super Le7/d3;
.source "SourceFile"


# static fields
.field public static final J:Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Le7/q1;

.field public B:Z

.field public C:Le7/o1;

.field public D:Le7/o1;

.field public E:Le7/q1;

.field public final F:Le7/r1;

.field public final G:Le7/r1;

.field public final H:Le7/q1;

.field public final I:Le7/n1;

.field public d:Landroid/content/SharedPreferences;

.field public e:Ljava/lang/Object;

.field public f:Landroid/content/SharedPreferences;

.field public o:Le7/p1;

.field public final p:Le7/q1;

.field public final q:Le7/r1;

.field public r:Ljava/lang/String;

.field public s:Z

.field public t:J

.field public final u:Le7/q1;

.field public final v:Le7/o1;

.field public final w:Le7/r1;

.field public final x:Le7/n1;

.field public final y:Le7/o1;

.field public final z:Le7/q1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/Pair;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, ""

    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Le7/l1;->J:Landroid/util/Pair;

    return-void
.end method

.method public constructor <init>(Le7/j2;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Le7/d3;-><init>(Le7/j2;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Le7/l1;->e:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance p1, Le7/q1;

    .line 12
    .line 13
    const-string v0, "session_timeout"

    .line 14
    .line 15
    const-wide/32 v1, 0x1b7740

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, p0, v0, v1, v2}, Le7/q1;-><init>(Le7/l1;Ljava/lang/String;J)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Le7/l1;->u:Le7/q1;

    .line 22
    .line 23
    new-instance p1, Le7/o1;

    .line 24
    .line 25
    const-string v0, "start_new_session"

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {p1, p0, v0, v1}, Le7/o1;-><init>(Le7/l1;Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Le7/l1;->v:Le7/o1;

    .line 32
    .line 33
    new-instance p1, Le7/q1;

    .line 34
    .line 35
    const-string v0, "last_pause_time"

    .line 36
    .line 37
    const-wide/16 v1, 0x0

    .line 38
    .line 39
    invoke-direct {p1, p0, v0, v1, v2}, Le7/q1;-><init>(Le7/l1;Ljava/lang/String;J)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Le7/l1;->z:Le7/q1;

    .line 43
    .line 44
    new-instance p1, Le7/q1;

    .line 45
    .line 46
    const-string v0, "session_id"

    .line 47
    .line 48
    invoke-direct {p1, p0, v0, v1, v2}, Le7/q1;-><init>(Le7/l1;Ljava/lang/String;J)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Le7/l1;->A:Le7/q1;

    .line 52
    .line 53
    new-instance p1, Le7/r1;

    .line 54
    .line 55
    const-string v0, "non_personalized_ads"

    .line 56
    .line 57
    invoke-direct {p1, p0, v0}, Le7/r1;-><init>(Le7/l1;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Le7/l1;->w:Le7/r1;

    .line 61
    .line 62
    new-instance p1, Le7/n1;

    .line 63
    .line 64
    const-string v0, "last_received_uri_timestamps_by_source"

    .line 65
    .line 66
    invoke-direct {p1, p0, v0}, Le7/n1;-><init>(Le7/l1;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Le7/l1;->x:Le7/n1;

    .line 70
    .line 71
    new-instance p1, Le7/o1;

    .line 72
    .line 73
    const-string v0, "allow_remote_dynamite"

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-direct {p1, p0, v0, v3}, Le7/o1;-><init>(Le7/l1;Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Le7/l1;->y:Le7/o1;

    .line 80
    .line 81
    new-instance p1, Le7/q1;

    .line 82
    .line 83
    const-string v0, "first_open_time"

    .line 84
    .line 85
    invoke-direct {p1, p0, v0, v1, v2}, Le7/q1;-><init>(Le7/l1;Ljava/lang/String;J)V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Le7/l1;->p:Le7/q1;

    .line 89
    .line 90
    const-string p1, "app_install_time"

    .line 91
    .line 92
    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance p1, Le7/r1;

    .line 96
    .line 97
    const-string v0, "app_instance_id"

    .line 98
    .line 99
    invoke-direct {p1, p0, v0}, Le7/r1;-><init>(Le7/l1;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, Le7/l1;->q:Le7/r1;

    .line 103
    .line 104
    new-instance p1, Le7/o1;

    .line 105
    .line 106
    const-string v0, "app_backgrounded"

    .line 107
    .line 108
    invoke-direct {p1, p0, v0, v3}, Le7/o1;-><init>(Le7/l1;Ljava/lang/String;Z)V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, Le7/l1;->C:Le7/o1;

    .line 112
    .line 113
    new-instance p1, Le7/o1;

    .line 114
    .line 115
    const-string v0, "deep_link_retrieval_complete"

    .line 116
    .line 117
    invoke-direct {p1, p0, v0, v3}, Le7/o1;-><init>(Le7/l1;Ljava/lang/String;Z)V

    .line 118
    .line 119
    .line 120
    iput-object p1, p0, Le7/l1;->D:Le7/o1;

    .line 121
    .line 122
    new-instance p1, Le7/q1;

    .line 123
    .line 124
    const-string v0, "deep_link_retrieval_attempts"

    .line 125
    .line 126
    invoke-direct {p1, p0, v0, v1, v2}, Le7/q1;-><init>(Le7/l1;Ljava/lang/String;J)V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Le7/l1;->E:Le7/q1;

    .line 130
    .line 131
    new-instance p1, Le7/r1;

    .line 132
    .line 133
    const-string v0, "firebase_feature_rollouts"

    .line 134
    .line 135
    invoke-direct {p1, p0, v0}, Le7/r1;-><init>(Le7/l1;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iput-object p1, p0, Le7/l1;->F:Le7/r1;

    .line 139
    .line 140
    new-instance p1, Le7/r1;

    .line 141
    .line 142
    const-string v0, "deferred_attribution_cache"

    .line 143
    .line 144
    invoke-direct {p1, p0, v0}, Le7/r1;-><init>(Le7/l1;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iput-object p1, p0, Le7/l1;->G:Le7/r1;

    .line 148
    .line 149
    new-instance p1, Le7/q1;

    .line 150
    .line 151
    const-string v0, "deferred_attribution_cache_timestamp"

    .line 152
    .line 153
    invoke-direct {p1, p0, v0, v1, v2}, Le7/q1;-><init>(Le7/l1;Ljava/lang/String;J)V

    .line 154
    .line 155
    .line 156
    iput-object p1, p0, Le7/l1;->H:Le7/q1;

    .line 157
    .line 158
    new-instance p1, Le7/n1;

    .line 159
    .line 160
    const-string v0, "default_event_parameters"

    .line 161
    .line 162
    invoke-direct {p1, p0, v0}, Le7/n1;-><init>(Le7/l1;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    iput-object p1, p0, Le7/l1;->I:Le7/n1;

    .line 166
    .line 167
    return-void
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method


# virtual methods
.method public final o()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final p(Ljava/lang/Boolean;)V
    .locals 2

    invoke-virtual {p0}, Ld2/q;->l()V

    invoke-virtual {p0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "measurement_enabled"

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final q(I)Z
    .locals 3

    invoke-virtual {p0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "consent_source"

    const/16 v2, 0x64

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {p1, v0}, Le7/e3;->i(II)Z

    move-result p1

    return p1
.end method

.method public final r(J)Z
    .locals 2

    iget-object v0, p0, Le7/l1;->u:Le7/q1;

    invoke-virtual {v0}, Le7/q1;->a()J

    move-result-wide v0

    sub-long/2addr p1, v0

    iget-object v0, p0, Le7/l1;->z:Le7/q1;

    invoke-virtual {v0}, Le7/q1;->a()J

    move-result-wide v0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final s()V
    .locals 5

    invoke-virtual {p0}, Ld2/q;->zza()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.google.android.gms.measurement.prefs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Le7/l1;->d:Landroid/content/SharedPreferences;

    const-string v1, "has_been_opened"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Le7/l1;->B:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Le7/l1;->d:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    new-instance v0, Le7/p1;

    const-wide/16 v1, 0x0

    sget-object v3, Le7/h0;->d:Le7/m0;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Le7/m0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-direct {v0, p0, v1, v2}, Le7/p1;-><init>(Le7/l1;J)V

    iput-object v0, p0, Le7/l1;->o:Le7/p1;

    return-void
.end method

.method public final t(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ld2/q;->l()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Le7/a1;->w:Le7/b1;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "App measurement setting deferred collection"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "deferred_analytics_collection"

    .line 28
    .line 29
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final u()Landroid/content/SharedPreferences;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ld2/q;->l()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le7/d3;->m()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Le7/l1;->f:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Le7/l1;->e:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v1, p0, Le7/l1;->f:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ld2/q;->zza()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "_preferences"

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v2, v2, Le7/a1;->w:Le7/b1;

    .line 48
    .line 49
    const-string v3, "Default prefs file"

    .line 50
    .line 51
    invoke-virtual {v2, v3, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ld2/q;->zza()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-virtual {v2, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, p0, Le7/l1;->f:Landroid/content/SharedPreferences;

    .line 64
    .line 65
    :cond_0
    monitor-exit v0

    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v1

    .line 68
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    throw v1

    .line 70
    :cond_1
    :goto_0
    iget-object v0, p0, Le7/l1;->f:Landroid/content/SharedPreferences;

    .line 71
    .line 72
    return-object v0
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final v()Landroid/content/SharedPreferences;
    .locals 1

    invoke-virtual {p0}, Ld2/q;->l()V

    invoke-virtual {p0}, Le7/d3;->m()V

    iget-object v0, p0, Le7/l1;->d:Landroid/content/SharedPreferences;

    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Le7/l1;->d:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public final w()Landroid/util/SparseArray;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le7/l1;->x:Le7/n1;

    .line 2
    .line 3
    invoke-virtual {v0}, Le7/n1;->a()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "uriSources"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "uriTimestamps"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    array-length v2, v1

    .line 25
    array-length v3, v0

    .line 26
    if-eq v2, v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 33
    .line 34
    const-string v1, "Trigger URI source and timestamp array lengths do not match"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Landroid/util/SparseArray;

    .line 40
    .line 41
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_1
    new-instance v2, Landroid/util/SparseArray;

    .line 46
    .line 47
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    :goto_0
    array-length v4, v1

    .line 52
    if-ge v3, v4, :cond_2

    .line 53
    .line 54
    aget v4, v1, v3

    .line 55
    .line 56
    aget-wide v5, v0, v3

    .line 57
    .line 58
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v2, v4, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-object v2

    .line 69
    :cond_3
    :goto_1
    new-instance v0, Landroid/util/SparseArray;

    .line 70
    .line 71
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 72
    .line 73
    .line 74
    return-object v0
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final x()Le7/x;
    .locals 3

    invoke-virtual {p0}, Ld2/q;->l()V

    invoke-virtual {p0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "dma_consent_settings"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le7/x;->b(Ljava/lang/String;)Le7/x;

    move-result-object v0

    return-object v0
.end method

.method public final y()Le7/e3;
    .locals 4

    invoke-virtual {p0}, Ld2/q;->l()V

    invoke-virtual {p0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "consent_settings"

    const-string v2, "G1"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "consent_source"

    const/16 v3, 0x64

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1, v0}, Le7/e3;->c(ILjava/lang/String;)Le7/e3;

    move-result-object v0

    return-object v0
.end method

.method public final z()Ljava/lang/Boolean;
    .locals 3

    invoke-virtual {p0}, Ld2/q;->l()V

    invoke-virtual {p0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "measurement_enabled"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
