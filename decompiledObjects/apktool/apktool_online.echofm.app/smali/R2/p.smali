.class public final LR2/p;
.super LR2/C5;
.source "SourceFile"


# static fields
.field public static final f:[Ljava/lang/String;

.field public static final g:[Ljava/lang/String;

.field public static final h:[Ljava/lang/String;

.field public static final i:[Ljava/lang/String;

.field public static final j:[Ljava/lang/String;

.field public static final k:[Ljava/lang/String;

.field public static final l:[Ljava/lang/String;

.field public static final m:[Ljava/lang/String;

.field public static final n:[Ljava/lang/String;

.field public static final o:[Ljava/lang/String;


# instance fields
.field public final d:LR2/v;

.field public final e:LR2/w5;


# direct methods
.method static constructor <clinit>()V
    .locals 73

    .line 1
    const-string v10, "current_session_count"

    .line 2
    .line 3
    const-string v11, "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"

    .line 4
    .line 5
    const-string v0, "last_bundled_timestamp"

    .line 6
    .line 7
    const-string v1, "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;"

    .line 8
    .line 9
    const-string v2, "last_bundled_day"

    .line 10
    .line 11
    const-string v3, "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;"

    .line 12
    .line 13
    const-string v4, "last_sampled_complex_event_id"

    .line 14
    .line 15
    const-string v5, "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;"

    .line 16
    .line 17
    const-string v6, "last_sampling_rate"

    .line 18
    .line 19
    const-string v7, "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;"

    .line 20
    .line 21
    const-string v8, "last_exempt_from_sampling"

    .line 22
    .line 23
    const-string v9, "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, LR2/p;->f:[Ljava/lang/String;

    .line 30
    .line 31
    const-string v0, "origin"

    .line 32
    .line 33
    const-string v1, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"

    .line 34
    .line 35
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, LR2/p;->g:[Ljava/lang/String;

    .line 40
    .line 41
    const-string v71, "attribution_eligibility_status"

    .line 42
    .line 43
    const-string v72, "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"

    .line 44
    .line 45
    const-string v1, "app_version"

    .line 46
    .line 47
    const-string v2, "ALTER TABLE apps ADD COLUMN app_version TEXT;"

    .line 48
    .line 49
    const-string v3, "app_store"

    .line 50
    .line 51
    const-string v4, "ALTER TABLE apps ADD COLUMN app_store TEXT;"

    .line 52
    .line 53
    const-string v5, "gmp_version"

    .line 54
    .line 55
    const-string v6, "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;"

    .line 56
    .line 57
    const-string v7, "dev_cert_hash"

    .line 58
    .line 59
    const-string v8, "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;"

    .line 60
    .line 61
    const-string v9, "measurement_enabled"

    .line 62
    .line 63
    const-string v10, "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;"

    .line 64
    .line 65
    const-string v11, "last_bundle_start_timestamp"

    .line 66
    .line 67
    const-string v12, "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;"

    .line 68
    .line 69
    const-string v13, "day"

    .line 70
    .line 71
    const-string v14, "ALTER TABLE apps ADD COLUMN day INTEGER;"

    .line 72
    .line 73
    const-string v15, "daily_public_events_count"

    .line 74
    .line 75
    const-string v16, "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;"

    .line 76
    .line 77
    const-string v17, "daily_events_count"

    .line 78
    .line 79
    const-string v18, "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;"

    .line 80
    .line 81
    const-string v19, "daily_conversions_count"

    .line 82
    .line 83
    const-string v20, "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;"

    .line 84
    .line 85
    const-string v21, "remote_config"

    .line 86
    .line 87
    const-string v22, "ALTER TABLE apps ADD COLUMN remote_config BLOB;"

    .line 88
    .line 89
    const-string v23, "config_fetched_time"

    .line 90
    .line 91
    const-string v24, "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;"

    .line 92
    .line 93
    const-string v25, "failed_config_fetch_time"

    .line 94
    .line 95
    const-string v26, "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;"

    .line 96
    .line 97
    const-string v27, "app_version_int"

    .line 98
    .line 99
    const-string v28, "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;"

    .line 100
    .line 101
    const-string v29, "firebase_instance_id"

    .line 102
    .line 103
    const-string v30, "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;"

    .line 104
    .line 105
    const-string v31, "daily_error_events_count"

    .line 106
    .line 107
    const-string v32, "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;"

    .line 108
    .line 109
    const-string v33, "daily_realtime_events_count"

    .line 110
    .line 111
    const-string v34, "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;"

    .line 112
    .line 113
    const-string v35, "health_monitor_sample"

    .line 114
    .line 115
    const-string v36, "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;"

    .line 116
    .line 117
    const-string v37, "android_id"

    .line 118
    .line 119
    const-string v38, "ALTER TABLE apps ADD COLUMN android_id INTEGER;"

    .line 120
    .line 121
    const-string v39, "adid_reporting_enabled"

    .line 122
    .line 123
    const-string v40, "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;"

    .line 124
    .line 125
    const-string v41, "ssaid_reporting_enabled"

    .line 126
    .line 127
    const-string v42, "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;"

    .line 128
    .line 129
    const-string v43, "admob_app_id"

    .line 130
    .line 131
    const-string v44, "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;"

    .line 132
    .line 133
    const-string v45, "linked_admob_app_id"

    .line 134
    .line 135
    const-string v46, "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;"

    .line 136
    .line 137
    const-string v47, "dynamite_version"

    .line 138
    .line 139
    const-string v48, "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;"

    .line 140
    .line 141
    const-string v49, "safelisted_events"

    .line 142
    .line 143
    const-string v50, "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;"

    .line 144
    .line 145
    const-string v51, "ga_app_id"

    .line 146
    .line 147
    const-string v52, "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"

    .line 148
    .line 149
    const-string v53, "config_last_modified_time"

    .line 150
    .line 151
    const-string v54, "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"

    .line 152
    .line 153
    const-string v55, "e_tag"

    .line 154
    .line 155
    const-string v56, "ALTER TABLE apps ADD COLUMN e_tag TEXT;"

    .line 156
    .line 157
    const-string v57, "session_stitching_token"

    .line 158
    .line 159
    const-string v58, "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"

    .line 160
    .line 161
    const-string v59, "sgtm_upload_enabled"

    .line 162
    .line 163
    const-string v60, "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;"

    .line 164
    .line 165
    const-string v61, "target_os_version"

    .line 166
    .line 167
    const-string v62, "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"

    .line 168
    .line 169
    const-string v63, "session_stitching_token_hash"

    .line 170
    .line 171
    const-string v64, "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"

    .line 172
    .line 173
    const-string v65, "ad_services_version"

    .line 174
    .line 175
    const-string v66, "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;"

    .line 176
    .line 177
    const-string v67, "unmatched_first_open_without_ad_id"

    .line 178
    .line 179
    const-string v68, "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;"

    .line 180
    .line 181
    const-string v69, "npa_metadata_value"

    .line 182
    .line 183
    const-string v70, "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;"

    .line 184
    .line 185
    filled-new-array/range {v1 .. v72}, [Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    sput-object v0, LR2/p;->h:[Ljava/lang/String;

    .line 190
    .line 191
    const-string v0, "realtime"

    .line 192
    .line 193
    const-string v1, "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"

    .line 194
    .line 195
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sput-object v0, LR2/p;->i:[Ljava/lang/String;

    .line 200
    .line 201
    const-string v0, "retry_count"

    .line 202
    .line 203
    const-string v1, "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"

    .line 204
    .line 205
    const-string v2, "has_realtime"

    .line 206
    .line 207
    const-string v3, "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;"

    .line 208
    .line 209
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    sput-object v0, LR2/p;->j:[Ljava/lang/String;

    .line 214
    .line 215
    const-string v0, "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"

    .line 216
    .line 217
    const-string v1, "session_scoped"

    .line 218
    .line 219
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sput-object v0, LR2/p;->k:[Ljava/lang/String;

    .line 224
    .line 225
    const-string v0, "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"

    .line 226
    .line 227
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sput-object v0, LR2/p;->l:[Ljava/lang/String;

    .line 232
    .line 233
    const-string v0, "previous_install_count"

    .line 234
    .line 235
    const-string v1, "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"

    .line 236
    .line 237
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    sput-object v0, LR2/p;->m:[Ljava/lang/String;

    .line 242
    .line 243
    const-string v0, "dma_consent_settings"

    .line 244
    .line 245
    const-string v1, "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"

    .line 246
    .line 247
    const-string v2, "consent_source"

    .line 248
    .line 249
    const-string v3, "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;"

    .line 250
    .line 251
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    sput-object v0, LR2/p;->n:[Ljava/lang/String;

    .line 256
    .line 257
    const-string v0, "idempotent"

    .line 258
    .line 259
    const-string v1, "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"

    .line 260
    .line 261
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    sput-object v0, LR2/p;->o:[Ljava/lang/String;

    .line 266
    .line 267
    return-void
.end method

.method public constructor <init>(LR2/D5;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, LR2/C5;-><init>(LR2/D5;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LR2/w5;

    .line 5
    .line 6
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p1, v0}, LR2/w5;-><init>(LE2/e;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LR2/p;->e:LR2/w5;

    .line 14
    .line 15
    new-instance p1, LR2/v;

    .line 16
    .line 17
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "google_app_measurement.db"

    .line 22
    .line 23
    invoke-direct {p1, p0, v0, v1}, LR2/v;-><init>(LR2/p;Landroid/content/Context;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, LR2/p;->d:LR2/v;

    .line 27
    .line 28
    return-void
.end method

.method public static synthetic J(Landroid/database/Cursor;)LR2/q3;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {v0, p0}, LR2/q3;->f(Ljava/lang/String;I)LR2/q3;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static bridge synthetic K(LR2/p;)LR2/w5;
    .locals 0

    .line 1
    iget-object p0, p0, LR2/p;->e:LR2/w5;

    .line 2
    .line 3
    return-object p0
.end method

.method public static V(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    instance-of v0, p2, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p2, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v0, p2, Ljava/lang/Long;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Long;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    instance-of v0, p2, Ljava/lang/Double;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast p2, Ljava/lang/Double;

    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    const-string p1, "Invalid value type"

    .line 40
    .line 41
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p0
.end method

.method public static bridge synthetic k0()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LR2/p;->m:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic l0()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LR2/p;->h:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic m0()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LR2/p;->n:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic n0()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LR2/p;->f:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic o0()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LR2/p;->k:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic p0()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LR2/p;->l:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic q0()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LR2/p;->j:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic r0()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LR2/p;->i:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic s0()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LR2/p;->o:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic t0()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LR2/p;->g:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final A()J
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-wide/16 v1, 0x0

    .line 3
    .line 4
    const-string v3, "select max(timestamp) from raw_events"

    .line 5
    .line 6
    invoke-virtual {p0, v3, v0, v1, v2}, LR2/p;->G(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public final A0(Ljava/lang/String;Ljava/lang/String;)LR2/e;
    .locals 35

    .line 1
    move-object/from16 v7, p2

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-static/range {p2 .. p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p0 .. p0}, LR2/C5;->u()V

    .line 13
    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    :try_start_0
    invoke-virtual/range {p0 .. p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 17
    .line 18
    .line 19
    move-result-object v9

    .line 20
    const-string v10, "conditional_properties"

    .line 21
    .line 22
    const/16 v0, 0xb

    .line 23
    .line 24
    new-array v11, v0, [Ljava/lang/String;

    .line 25
    .line 26
    const-string v0, "origin"

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    aput-object v0, v11, v1

    .line 30
    .line 31
    const-string v0, "value"

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    aput-object v0, v11, v2

    .line 35
    .line 36
    const-string v0, "active"

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    aput-object v0, v11, v3

    .line 40
    .line 41
    const-string v0, "trigger_event_name"

    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    aput-object v0, v11, v4

    .line 45
    .line 46
    const-string v0, "trigger_timeout"

    .line 47
    .line 48
    const/4 v5, 0x4

    .line 49
    aput-object v0, v11, v5

    .line 50
    .line 51
    const-string v0, "timed_out_event"

    .line 52
    .line 53
    const/4 v6, 0x5

    .line 54
    aput-object v0, v11, v6

    .line 55
    .line 56
    const-string v0, "creation_timestamp"

    .line 57
    .line 58
    const/4 v15, 0x6

    .line 59
    aput-object v0, v11, v15

    .line 60
    .line 61
    const-string v0, "triggered_event"

    .line 62
    .line 63
    const/4 v14, 0x7

    .line 64
    aput-object v0, v11, v14

    .line 65
    .line 66
    const-string v0, "triggered_timestamp"

    .line 67
    .line 68
    const/16 v13, 0x8

    .line 69
    .line 70
    aput-object v0, v11, v13

    .line 71
    .line 72
    const-string v0, "time_to_live"

    .line 73
    .line 74
    const/16 v12, 0x9

    .line 75
    .line 76
    aput-object v0, v11, v12

    .line 77
    .line 78
    const-string v0, "expired_event"

    .line 79
    .line 80
    const/16 v6, 0xa

    .line 81
    .line 82
    aput-object v0, v11, v6

    .line 83
    .line 84
    const-string v0, "app_id=? and name=?"

    .line 85
    .line 86
    filled-new-array/range {p1 .. p2}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v16

    .line 90
    const/16 v17, 0x0

    .line 91
    .line 92
    const/16 v18, 0x0

    .line 93
    .line 94
    const/16 v19, 0x0

    .line 95
    .line 96
    move v6, v12

    .line 97
    move-object v12, v0

    .line 98
    move v0, v13

    .line 99
    move-object/from16 v13, v16

    .line 100
    .line 101
    move v6, v14

    .line 102
    move-object/from16 v14, v19

    .line 103
    .line 104
    move v0, v15

    .line 105
    move-object/from16 v15, v17

    .line 106
    .line 107
    move-object/from16 v16, v18

    .line 108
    .line 109
    invoke-virtual/range {v9 .. v16}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 110
    .line 111
    .line 112
    move-result-object v9
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 113
    :try_start_1
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    .line 114
    .line 115
    .line 116
    move-result v10
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    if-nez v10, :cond_0

    .line 118
    .line 119
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 120
    .line 121
    .line 122
    return-object v8

    .line 123
    :cond_0
    :try_start_2
    invoke-interface {v9, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    if-nez v10, :cond_1

    .line 128
    .line 129
    const-string v10, ""
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 130
    .line 131
    :cond_1
    move-object/from16 v22, v10

    .line 132
    .line 133
    move-object/from16 v10, p0

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :catchall_0
    move-exception v0

    .line 137
    move-object/from16 v10, p0

    .line 138
    .line 139
    :goto_0
    move-object v8, v9

    .line 140
    goto/16 :goto_5

    .line 141
    .line 142
    :catch_0
    move-exception v0

    .line 143
    move-object/from16 v10, p0

    .line 144
    .line 145
    goto/16 :goto_4

    .line 146
    .line 147
    :goto_1
    :try_start_3
    invoke-virtual {v10, v9, v2}, LR2/p;->M(Landroid/database/Cursor;I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    invoke-interface {v9, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_2

    .line 156
    .line 157
    move/from16 v26, v2

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_2
    move/from16 v26, v1

    .line 161
    .line 162
    :goto_2
    invoke-interface {v9, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v27

    .line 166
    invoke-interface {v9, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 167
    .line 168
    .line 169
    move-result-wide v29

    .line 170
    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    const/4 v2, 0x5

    .line 175
    invoke-interface {v9, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    sget-object v3, LR2/I;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 180
    .line 181
    invoke-virtual {v1, v2, v3}, LR2/N5;->E([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    move-object/from16 v28, v1

    .line 186
    .line 187
    check-cast v28, LR2/I;

    .line 188
    .line 189
    invoke-interface {v9, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 190
    .line 191
    .line 192
    move-result-wide v24

    .line 193
    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-interface {v9, v6}, Landroid/database/Cursor;->getBlob(I)[B

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v0, v1, v3}, LR2/N5;->E([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    move-object/from16 v31, v0

    .line 206
    .line 207
    check-cast v31, LR2/I;

    .line 208
    .line 209
    const/16 v0, 0x8

    .line 210
    .line 211
    invoke-interface {v9, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 212
    .line 213
    .line 214
    move-result-wide v4

    .line 215
    const/16 v0, 0x9

    .line 216
    .line 217
    invoke-interface {v9, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 218
    .line 219
    .line 220
    move-result-wide v32

    .line 221
    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    const/16 v1, 0xa

    .line 226
    .line 227
    invoke-interface {v9, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v0, v1, v3}, LR2/N5;->E([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    move-object/from16 v34, v0

    .line 236
    .line 237
    check-cast v34, LR2/I;

    .line 238
    .line 239
    new-instance v23, LR2/R5;

    .line 240
    .line 241
    move-object/from16 v1, v23

    .line 242
    .line 243
    move-object/from16 v2, p2

    .line 244
    .line 245
    move-wide v3, v4

    .line 246
    move-object v5, v11

    .line 247
    move-object/from16 v6, v22

    .line 248
    .line 249
    invoke-direct/range {v1 .. v6}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    new-instance v0, LR2/e;

    .line 253
    .line 254
    move-object/from16 v20, v0

    .line 255
    .line 256
    move-object/from16 v21, p1

    .line 257
    .line 258
    invoke-direct/range {v20 .. v34}, LR2/e;-><init>(Ljava/lang/String;Ljava/lang/String;LR2/R5;JZLjava/lang/String;LR2/I;JLR2/I;JLR2/I;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-eqz v1, :cond_3

    .line 266
    .line 267
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    const-string v2, "Got multiple records for conditional property, expected one"

    .line 276
    .line 277
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-virtual/range {p0 .. p0}, LR2/m3;->h()LR2/X1;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-virtual {v4, v7}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v1, v2, v3, v4}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :catchall_1
    move-exception v0

    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :catch_1
    move-exception v0

    .line 297
    goto :goto_4

    .line 298
    :cond_3
    :goto_3
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 299
    .line 300
    .line 301
    return-object v0

    .line 302
    :catchall_2
    move-exception v0

    .line 303
    move-object/from16 v10, p0

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :catch_2
    move-exception v0

    .line 307
    move-object/from16 v10, p0

    .line 308
    .line 309
    move-object v9, v8

    .line 310
    :goto_4
    :try_start_4
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    const-string v2, "Error querying conditional property"

    .line 319
    .line 320
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-virtual/range {p0 .. p0}, LR2/m3;->h()LR2/X1;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    invoke-virtual {v4, v7}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    invoke-virtual {v1, v2, v3, v4, v0}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 333
    .line 334
    .line 335
    if-eqz v9, :cond_4

    .line 336
    .line 337
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 338
    .line 339
    .line 340
    :cond_4
    return-object v8

    .line 341
    :goto_5
    if-eqz v8, :cond_5

    .line 342
    .line 343
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 344
    .line 345
    .line 346
    :cond_5
    throw v0
.end method

.method public final B()Landroid/database/sqlite/SQLiteDatabase;
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, LR2/p;->d:LR2/v;

    .line 5
    .line 6
    invoke-virtual {v0}, LR2/v;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 7
    .line 8
    .line 9
    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object v0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, LR2/Y1;->L()LR2/a2;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "Error opening database"

    .line 21
    .line 22
    invoke-virtual {v1, v2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final B0(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 7

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "select parameters from default_event_params where app_id=?"

    .line 13
    .line 14
    filled-new-array {p1}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 19
    .line 20
    .line 21
    move-result-object v1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 22
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v2, "Default event parameters not found"

    .line 37
    .line 38
    invoke-virtual {p1, v2}, LR2/a2;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    move-object v0, v1

    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :catch_0
    move-exception p1

    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_0
    const/4 v2, 0x0

    .line 53
    :try_start_2
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 54
    .line 55
    .line 56
    move-result-object v2
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y1;->Z()Lcom/google/android/gms/internal/measurement/Y1$a;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3, v2}, LR2/N5;->H(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lcom/google/android/gms/internal/measurement/Y1$a;

    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Lcom/google/android/gms/internal/measurement/Y3;

    .line 72
    .line 73
    check-cast v2, Lcom/google/android/gms/internal/measurement/Y1;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 74
    .line 75
    :try_start_4
    invoke-virtual {p0}, LR2/z5;->o()LR2/N5;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/Y1;->c0()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance v2, Landroid/os/Bundle;

    .line 83
    .line 84
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Lcom/google/android/gms/internal/measurement/a2;

    .line 102
    .line 103
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->c0()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->f0()Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-eqz v5, :cond_2

    .line 112
    .line 113
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->G()D

    .line 114
    .line 115
    .line 116
    move-result-wide v5

    .line 117
    invoke-virtual {v2, v4, v5, v6}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->g0()Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_3

    .line 126
    .line 127
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->R()F

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->j0()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_4

    .line 140
    .line 141
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->d0()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_4
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->h0()Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_1

    .line 154
    .line 155
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->X()J

    .line 156
    .line 157
    .line 158
    move-result-wide v5

    .line 159
    invoke-virtual {v2, v4, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 160
    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_5
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 164
    .line 165
    .line 166
    return-object v2

    .line 167
    :catch_1
    move-exception v2

    .line 168
    :try_start_5
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    const-string v4, "Failed to retrieve default event parameters. appId"

    .line 177
    .line 178
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {v3, v4, p1, v2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 183
    .line 184
    .line 185
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 186
    .line 187
    .line 188
    return-object v0

    .line 189
    :catchall_1
    move-exception p1

    .line 190
    goto :goto_2

    .line 191
    :catch_2
    move-exception p1

    .line 192
    move-object v1, v0

    .line 193
    :goto_1
    :try_start_6
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    const-string v3, "Error selecting default event parameters"

    .line 202
    .line 203
    invoke-virtual {v2, v3, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 204
    .line 205
    .line 206
    if-eqz v1, :cond_6

    .line 207
    .line 208
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 209
    .line 210
    .line 211
    :cond_6
    return-object v0

    .line 212
    :goto_2
    if-eqz v0, :cond_7

    .line 213
    .line 214
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 215
    .line 216
    .line 217
    :cond_7
    throw p1
.end method

.method public final C()Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    const-string v2, "select app_id from queue order by has_realtime desc, rowid asc limit 1;"

    .line 7
    .line 8
    invoke-virtual {v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_1

    .line 29
    :catch_0
    move-exception v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    move-object v5, v1

    .line 37
    move-object v1, v0

    .line 38
    move-object v0, v5

    .line 39
    goto :goto_1

    .line 40
    :catch_1
    move-exception v2

    .line 41
    move-object v0, v1

    .line 42
    :goto_0
    :try_start_2
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "Database error getting next bundle app id"

    .line 51
    .line 52
    invoke-virtual {v3, v4, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-object v1

    .line 61
    :goto_1
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 64
    .line 65
    .line 66
    :cond_2
    throw v1
.end method

.method public final C0(Ljava/lang/String;Ljava/lang/String;)LR2/E;
    .locals 28

    .line 1
    invoke-static/range {p1 .. p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static/range {p2 .. p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, LR2/C5;->u()V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    const-string v8, "last_exempt_from_sampling"

    .line 16
    .line 17
    const-string v9, "current_session_count"

    .line 18
    .line 19
    const-string v1, "lifetime_count"

    .line 20
    .line 21
    const-string v2, "current_bundle_count"

    .line 22
    .line 23
    const-string v3, "last_fire_timestamp"

    .line 24
    .line 25
    const-string v4, "last_bundled_timestamp"

    .line 26
    .line 27
    const-string v5, "last_bundled_day"

    .line 28
    .line 29
    const-string v6, "last_sampled_complex_event_id"

    .line 30
    .line 31
    const-string v7, "last_sampling_rate"

    .line 32
    .line 33
    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    :try_start_0
    invoke-virtual/range {p0 .. p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v3, "events"

    .line 50
    .line 51
    const/4 v10, 0x0

    .line 52
    new-array v4, v10, [Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v4, v0

    .line 59
    check-cast v4, [Ljava/lang/String;

    .line 60
    .line 61
    const-string v5, "app_id=? and name=?"

    .line 62
    .line 63
    filled-new-array/range {p1 .. p2}, [Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 71
    .line 72
    .line 73
    move-result-object v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 74
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 75
    .line 76
    .line 77
    move-result v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    if-nez v0, :cond_0

    .line 79
    .line 80
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 81
    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_0
    :try_start_2
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 85
    .line 86
    .line 87
    move-result-wide v14

    .line 88
    const/4 v0, 0x1

    .line 89
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 90
    .line 91
    .line 92
    move-result-wide v16

    .line 93
    const/4 v3, 0x2

    .line 94
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 95
    .line 96
    .line 97
    move-result-wide v20

    .line 98
    const/4 v3, 0x3

    .line 99
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    const-wide/16 v5, 0x0

    .line 104
    .line 105
    if-eqz v4, :cond_1

    .line 106
    .line 107
    move-wide/from16 v22, v5

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 111
    .line 112
    .line 113
    move-result-wide v3

    .line 114
    move-wide/from16 v22, v3

    .line 115
    .line 116
    :goto_0
    const/4 v3, 0x4

    .line 117
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    move-object/from16 v24, v1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    move-object/from16 v24, v3

    .line 135
    .line 136
    :goto_1
    const/4 v3, 0x5

    .line 137
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_3

    .line 142
    .line 143
    move-object/from16 v25, v1

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_3
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 147
    .line 148
    .line 149
    move-result-wide v3

    .line 150
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    move-object/from16 v25, v3

    .line 155
    .line 156
    :goto_2
    const/4 v3, 0x6

    .line 157
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-eqz v4, :cond_4

    .line 162
    .line 163
    move-object/from16 v26, v1

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_4
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 167
    .line 168
    .line 169
    move-result-wide v3

    .line 170
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    move-object/from16 v26, v3

    .line 175
    .line 176
    :goto_3
    const/4 v3, 0x7

    .line 177
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-nez v4, :cond_6

    .line 182
    .line 183
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 184
    .line 185
    .line 186
    move-result-wide v3

    .line 187
    const-wide/16 v7, 0x1

    .line 188
    .line 189
    cmp-long v3, v3, v7

    .line 190
    .line 191
    if-nez v3, :cond_5

    .line 192
    .line 193
    move v10, v0

    .line 194
    :cond_5
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    move-object/from16 v27, v0

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :catchall_0
    move-exception v0

    .line 202
    move-object v1, v2

    .line 203
    goto :goto_7

    .line 204
    :catch_0
    move-exception v0

    .line 205
    goto :goto_6

    .line 206
    :cond_6
    move-object/from16 v27, v1

    .line 207
    .line 208
    :goto_4
    const/16 v0, 0x8

    .line 209
    .line 210
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_7

    .line 215
    .line 216
    move-wide/from16 v18, v5

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_7
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 220
    .line 221
    .line 222
    move-result-wide v3

    .line 223
    move-wide/from16 v18, v3

    .line 224
    .line 225
    :goto_5
    new-instance v0, LR2/E;

    .line 226
    .line 227
    move-object v11, v0

    .line 228
    move-object/from16 v12, p1

    .line 229
    .line 230
    move-object/from16 v13, p2

    .line 231
    .line 232
    invoke-direct/range {v11 .. v27}, LR2/E;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-eqz v3, :cond_8

    .line 240
    .line 241
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    const-string v4, "Got multiple records for event aggregates, expected one. appId"

    .line 250
    .line 251
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    invoke-virtual {v3, v4, v5}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 256
    .line 257
    .line 258
    :cond_8
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 259
    .line 260
    .line 261
    return-object v0

    .line 262
    :catchall_1
    move-exception v0

    .line 263
    goto :goto_7

    .line 264
    :catch_1
    move-exception v0

    .line 265
    move-object v2, v1

    .line 266
    :goto_6
    :try_start_3
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    const-string v4, "Error querying events. appId"

    .line 275
    .line 276
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    invoke-virtual/range {p0 .. p0}, LR2/m3;->h()LR2/X1;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    move-object/from16 v7, p2

    .line 285
    .line 286
    invoke-virtual {v6, v7}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    invoke-virtual {v3, v4, v5, v6, v0}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 291
    .line 292
    .line 293
    if-eqz v2, :cond_9

    .line 294
    .line 295
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 296
    .line 297
    .line 298
    :cond_9
    return-object v1

    .line 299
    :goto_7
    if-eqz v1, :cond_a

    .line 300
    .line 301
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 302
    .line 303
    .line 304
    :cond_a
    throw v0
.end method

.method public final D(Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "conditional_properties"

    .line 18
    .line 19
    const-string v2, "app_id=? and name=?"

    .line 20
    .line 21
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    return p1

    .line 30
    :catch_0
    move-exception v0

    .line 31
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0}, LR2/m3;->h()LR2/X1;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2, p2}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    const-string v2, "Error deleting conditional property"

    .line 52
    .line 53
    invoke-virtual {v1, v2, p1, p2, v0}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    return p1
.end method

.method public final D0(Ljava/lang/String;)LR2/I2;
    .locals 25

    .line 1
    move-object/from16 v1, p1

    invoke-static/range {p1 .. p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    invoke-virtual/range {p0 .. p0}, LR2/C5;->u()V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual/range {p0 .. p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const-string v4, "apps"

    const/16 v0, 0x24

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "app_instance_id"

    const/4 v11, 0x0

    aput-object v0, v5, v11

    const-string v0, "gmp_app_id"

    const/4 v12, 0x1

    aput-object v0, v5, v12

    const-string v0, "resettable_device_id_hash"

    const/4 v13, 0x2

    aput-object v0, v5, v13

    const-string v0, "last_bundle_index"

    const/4 v14, 0x3

    aput-object v0, v5, v14

    const-string v0, "last_bundle_start_timestamp"

    const/4 v15, 0x4

    aput-object v0, v5, v15

    const-string v0, "last_bundle_end_timestamp"

    const/4 v10, 0x5

    aput-object v0, v5, v10

    const-string v0, "app_version"

    const/4 v9, 0x6

    aput-object v0, v5, v9

    const-string v0, "app_store"

    const/4 v8, 0x7

    aput-object v0, v5, v8

    const-string v0, "gmp_version"

    const/16 v7, 0x8

    aput-object v0, v5, v7

    const-string v0, "dev_cert_hash"

    const/16 v6, 0x9

    aput-object v0, v5, v6

    const-string v0, "measurement_enabled"

    const/16 v15, 0xa

    aput-object v0, v5, v15

    const-string v0, "day"

    const/16 v15, 0xb

    aput-object v0, v5, v15

    const-string v0, "daily_public_events_count"

    const/16 v15, 0xc

    aput-object v0, v5, v15

    const-string v0, "daily_events_count"

    const/16 v15, 0xd

    aput-object v0, v5, v15

    const-string v0, "daily_conversions_count"

    const/16 v16, 0xe

    aput-object v0, v5, v16

    const-string v0, "config_fetched_time"

    const/16 v16, 0xf

    aput-object v0, v5, v16

    const-string v0, "failed_config_fetch_time"

    const/16 v16, 0x10

    aput-object v0, v5, v16

    const-string v0, "app_version_int"

    const/16 v15, 0x11

    aput-object v0, v5, v15

    const-string v0, "firebase_instance_id"

    const/16 v17, 0x12

    aput-object v0, v5, v17

    const-string v0, "daily_error_events_count"

    const/16 v17, 0x13

    aput-object v0, v5, v17

    const-string v0, "daily_realtime_events_count"

    const/16 v17, 0x14

    aput-object v0, v5, v17

    const-string v0, "health_monitor_sample"

    const/16 v17, 0x15

    aput-object v0, v5, v17

    const-string v0, "android_id"

    const/16 v17, 0x16

    aput-object v0, v5, v17

    const-string v0, "adid_reporting_enabled"

    const/16 v15, 0x17

    aput-object v0, v5, v15

    const-string v0, "admob_app_id"

    const/16 v18, 0x18

    aput-object v0, v5, v18

    const-string v0, "dynamite_version"

    const/16 v15, 0x19

    aput-object v0, v5, v15

    const-string v0, "safelisted_events"

    const/16 v15, 0x1a

    aput-object v0, v5, v15

    const-string v0, "ga_app_id"

    const/16 v19, 0x1b

    aput-object v0, v5, v19

    const-string v0, "session_stitching_token"

    const/16 v19, 0x1c

    aput-object v0, v5, v19

    const-string v0, "sgtm_upload_enabled"

    const/16 v15, 0x1d

    aput-object v0, v5, v15

    const-string v0, "target_os_version"

    const/16 v20, 0x1e

    aput-object v0, v5, v20

    const-string v0, "session_stitching_token_hash"

    const/16 v20, 0x1f

    aput-object v0, v5, v20

    const-string v0, "ad_services_version"

    const/16 v20, 0x20

    aput-object v0, v5, v20

    const-string v0, "unmatched_first_open_without_ad_id"

    const/16 v15, 0x21

    aput-object v0, v5, v15

    const-string v0, "npa_metadata_value"

    const/16 v15, 0x22

    aput-object v0, v5, v15

    const-string v0, "attribution_eligibility_status"

    const/16 v21, 0x23

    aput-object v0, v5, v21

    const-string v0, "app_id=?"

    filled-new-array/range {p1 .. p1}, [Ljava/lang/String;

    move-result-object v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move v15, v6

    move-object v6, v0

    move v0, v7

    move-object/from16 v7, v21

    move v15, v8

    move-object/from16 v8, v24

    move v0, v9

    move-object/from16 v9, v22

    move v15, v10

    move-object/from16 v10, v23

    invoke-virtual/range {v3 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v4, :cond_0

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    return-object v2

    :cond_0
    :try_start_2
    new-instance v4, LR2/I2;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v5, p0

    :try_start_3
    iget-object v6, v5, LR2/z5;->b:LR2/D5;

    invoke-virtual {v6}, LR2/D5;->i0()LR2/N2;

    move-result-object v6

    invoke-direct {v4, v6, v1}, LR2/I2;-><init>(LR2/N2;Ljava/lang/String;)V

    invoke-interface {v3, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, LR2/I2;->x(Ljava/lang/String;)V

    invoke-interface {v3, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, LR2/I2;->M(Ljava/lang/String;)V

    invoke-interface {v3, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, LR2/I2;->S(Ljava/lang/String;)V

    invoke-interface {v3, v14}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->h0(J)V

    const/4 v6, 0x4

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->j0(J)V

    invoke-interface {v3, v15}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->f0(J)V

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, LR2/I2;->F(Ljava/lang/String;)V

    const/4 v0, 0x7

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, LR2/I2;->B(Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->d0(J)V

    const/16 v0, 0x9

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->X(J)V

    const/16 v0, 0xa

    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v0, v11

    goto :goto_2

    :catchall_0
    move-exception v0

    :goto_0
    move-object v2, v3

    goto/16 :goto_b

    :catch_0
    move-exception v0

    goto/16 :goto_a

    :cond_2
    :goto_1
    move v0, v12

    :goto_2
    invoke-virtual {v4, v0}, LR2/I2;->y(Z)V

    const/16 v0, 0xb

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->U(J)V

    const/16 v0, 0xc

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->O(J)V

    const/16 v0, 0xd

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->L(J)V

    const/16 v0, 0xe

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->E(J)V

    const/16 v0, 0xf

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->A(J)V

    const/16 v0, 0x10

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->b0(J)V

    const/16 v0, 0x11

    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_3

    const-wide/32 v6, -0x80000000

    goto :goto_3

    :cond_3
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v6, v0

    :goto_3
    invoke-virtual {v4, v6, v7}, LR2/I2;->c(J)V

    const/16 v0, 0x12

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, LR2/I2;->J(Ljava/lang/String;)V

    const/16 v0, 0x13

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->I(J)V

    const/16 v0, 0x14

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->R(J)V

    const/16 v0, 0x15

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, LR2/I2;->P(Ljava/lang/String;)V

    const/16 v0, 0x17

    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    move v0, v11

    goto :goto_5

    :cond_5
    :goto_4
    move v0, v12

    :goto_5
    invoke-virtual {v4, v0}, LR2/I2;->g(Z)V

    const/16 v0, 0x18

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, LR2/I2;->e(Ljava/lang/String;)V

    const/16 v0, 0x19

    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_6

    const-wide/16 v6, 0x0

    goto :goto_6

    :cond_6
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    :goto_6
    invoke-virtual {v4, v6, v7}, LR2/I2;->Z(J)V

    const/16 v0, 0x1a

    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-nez v6, :cond_7

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v6, ","

    const/4 v7, -0x1

    invoke-virtual {v0, v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, LR2/I2;->f(Ljava/util/List;)V

    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/s7;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v0

    sget-object v6, LR2/K;->y0:LR2/P1;

    invoke-virtual {v0, v1, v6}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v0

    sget-object v6, LR2/K;->w0:LR2/P1;

    invoke-virtual {v0, v6}, LR2/g;->s(LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_8
    const/16 v0, 0x1c

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, LR2/I2;->V(Ljava/lang/String;)V

    :cond_9
    invoke-static {}, Lcom/google/android/gms/internal/measurement/E7;->a()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v0

    sget-object v6, LR2/K;->A0:LR2/P1;

    invoke-virtual {v0, v6}, LR2/g;->s(LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/16 v0, 0x1d

    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-nez v6, :cond_a

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_a

    move v0, v12

    goto :goto_7

    :cond_a
    move v0, v11

    :goto_7
    invoke-virtual {v4, v0}, LR2/I2;->C(Z)V

    :cond_b
    const/16 v0, 0x1e

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->n0(J)V

    const/16 v0, 0x1f

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->l0(J)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v0

    sget-object v6, LR2/K;->L0:LR2/P1;

    invoke-virtual {v0, v1, v6}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/16 v0, 0x20

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v4, v0}, LR2/I2;->b(I)V

    const/16 v0, 0x23

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LR2/I2;->w(J)V

    :cond_c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/i6;->a()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v0

    sget-object v6, LR2/K;->Y0:LR2/P1;

    invoke-virtual {v0, v1, v6}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/16 v0, 0x21

    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-nez v6, :cond_d

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_d

    move v0, v12

    goto :goto_8

    :cond_d
    move v0, v11

    :goto_8
    invoke-virtual {v4, v0}, LR2/I2;->G(Z)V

    :cond_e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    move-result-object v0

    sget-object v6, LR2/K;->T0:LR2/P1;

    invoke-virtual {v0, v1, v6}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v0

    if-eqz v0, :cond_11

    const/16 v0, 0x22

    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_f

    move-object v0, v2

    goto :goto_9

    :cond_f
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_10

    move v11, v12

    :cond_10
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_9
    invoke-virtual {v4, v0}, LR2/I2;->d(Ljava/lang/Boolean;)V

    :cond_11
    invoke-virtual {v4}, LR2/I2;->o()V

    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    move-result-object v0

    const-string v6, "Got multiple records for app, expected one. appId"

    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_12
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    return-object v4

    :catchall_1
    move-exception v0

    move-object/from16 v5, p0

    goto/16 :goto_0

    :catch_1
    move-exception v0

    move-object/from16 v5, p0

    goto :goto_a

    :catchall_2
    move-exception v0

    move-object/from16 v5, p0

    goto :goto_b

    :catch_2
    move-exception v0

    move-object/from16 v5, p0

    move-object v3, v2

    :goto_a
    :try_start_4
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v4

    invoke-virtual {v4}, LR2/Y1;->G()LR2/a2;

    move-result-object v4

    const-string v6, "Error querying app. appId"

    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4, v6, v1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v3, :cond_13

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_13
    return-object v2

    :goto_b
    if-eqz v2, :cond_14

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_14
    throw v0
.end method

.method public final E(Lcom/google/android/gms/internal/measurement/d2;)J
    .locals 7

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/j3;->h()[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0}, LR2/z5;->o()LR2/N5;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1, v0}, LR2/N5;->A([B)J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    new-instance v3, Landroid/content/ContentValues;

    .line 30
    .line 31
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v4, "app_id"

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "metadata_fingerprint"

    .line 48
    .line 49
    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 50
    .line 51
    .line 52
    const-string v4, "metadata"

    .line 53
    .line 54
    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 55
    .line 56
    .line 57
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v4, "raw_events_metadata"

    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    const/4 v6, 0x4

    .line 65
    invoke-virtual {v0, v4, v5, v3, v6}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    return-wide v1

    .line 69
    :catch_0
    move-exception v0

    .line 70
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const-string v2, "Error storing raw event metadata. appId"

    .line 87
    .line 88
    invoke-virtual {v1, v2, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    throw v0
.end method

.method public final E0(Ljava/lang/String;)LR2/r;
    .locals 12

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "apps"

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    new-array v3, v3, [Ljava/lang/String;

    .line 19
    .line 20
    const-string v4, "remote_config"

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    aput-object v4, v3, v9

    .line 24
    .line 25
    const-string v4, "config_last_modified_time"

    .line 26
    .line 27
    const/4 v10, 0x1

    .line 28
    aput-object v4, v3, v10

    .line 29
    .line 30
    const-string v4, "e_tag"

    .line 31
    .line 32
    const/4 v11, 0x2

    .line 33
    aput-object v4, v3, v11

    .line 34
    .line 35
    const-string v4, "app_id=?"

    .line 36
    .line 37
    filled-new-array {p1}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 45
    .line 46
    .line 47
    move-result-object v1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 48
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 49
    .line 50
    .line 51
    move-result v2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    if-nez v2, :cond_0

    .line 53
    .line 54
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_0
    :try_start_2
    invoke-interface {v1, v9}, Landroid/database/Cursor;->getBlob(I)[B

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v1, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-interface {v1, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_1

    .line 75
    .line 76
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v5}, LR2/Y1;->G()LR2/a2;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    const-string v6, "Got multiple records for app config, expected one. appId"

    .line 85
    .line 86
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {v5, v6, v7}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catchall_0
    move-exception p1

    .line 95
    move-object v0, v1

    .line 96
    goto :goto_2

    .line 97
    :catch_0
    move-exception v2

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 100
    .line 101
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 102
    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_2
    :try_start_3
    new-instance v5, LR2/r;

    .line 106
    .line 107
    invoke-direct {v5, v2, v3, v4}, LR2/r;-><init>([BLjava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 108
    .line 109
    .line 110
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 111
    .line 112
    .line 113
    return-object v5

    .line 114
    :catchall_1
    move-exception p1

    .line 115
    goto :goto_2

    .line 116
    :catch_1
    move-exception v2

    .line 117
    move-object v1, v0

    .line 118
    :goto_1
    :try_start_4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    const-string v4, "Error querying remote config. appId"

    .line 127
    .line 128
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {v3, v4, p1, v2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 133
    .line 134
    .line 135
    if-eqz v1, :cond_3

    .line 136
    .line 137
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 138
    .line 139
    .line 140
    :cond_3
    return-object v0

    .line 141
    :goto_2
    if-eqz v0, :cond_4

    .line 142
    .line 143
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 144
    .line 145
    .line 146
    :cond_4
    throw p1
.end method

.method public final F(Ljava/lang/String;)J
    .locals 4

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, LR2/K;->r:LR2/P1;

    .line 19
    .line 20
    invoke-virtual {v1, p1, v2}, LR2/g;->u(Ljava/lang/String;LR2/P1;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const v2, 0xf4240

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "raw_events"

    .line 41
    .line 42
    const-string v3, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"

    .line 43
    .line 44
    filled-new-array {p1, v1}, [Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    int-to-long v0, p1

    .line 53
    return-wide v0

    .line 54
    :catch_0
    move-exception v0

    .line 55
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v2, "Error deleting over the limit events. appId"

    .line 64
    .line 65
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v1, v2, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const-wide/16 v0, 0x0

    .line 73
    .line 74
    return-wide v0
.end method

.method public final F0(Ljava/lang/String;Ljava/lang/String;)LR2/T5;
    .locals 13

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v3, "user_attributes"

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    new-array v4, v0, [Ljava/lang/String;

    .line 22
    .line 23
    const-string v0, "set_timestamp"

    .line 24
    .line 25
    const/4 v10, 0x0

    .line 26
    aput-object v0, v4, v10

    .line 27
    .line 28
    const-string v0, "value"

    .line 29
    .line 30
    const/4 v11, 0x1

    .line 31
    aput-object v0, v4, v11

    .line 32
    .line 33
    const-string v0, "origin"

    .line 34
    .line 35
    const/4 v12, 0x2

    .line 36
    aput-object v0, v4, v12

    .line 37
    .line 38
    const-string v5, "app_id=? and name=?"

    .line 39
    .line 40
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 48
    .line 49
    .line 50
    move-result-object v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 52
    .line 53
    .line 54
    move-result v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_0
    :try_start_2
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 62
    .line 63
    .line 64
    move-result-wide v7

    .line 65
    invoke-virtual {p0, v2, v11}, LR2/p;->M(Landroid/database/Cursor;I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    if-nez v9, :cond_1

    .line 70
    .line 71
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_1
    :try_start_3
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    new-instance v0, LR2/T5;

    .line 80
    .line 81
    move-object v3, v0

    .line 82
    move-object v4, p1

    .line 83
    move-object v6, p2

    .line 84
    invoke-direct/range {v3 .. v9}, LR2/T5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_2

    .line 92
    .line 93
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    const-string v4, "Got multiple records for user property, expected one. appId"

    .line 102
    .line 103
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v3, v4, v5}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    move-object v1, v2

    .line 113
    goto :goto_2

    .line 114
    :catch_0
    move-exception v0

    .line 115
    goto :goto_1

    .line 116
    :cond_2
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 117
    .line 118
    .line 119
    return-object v0

    .line 120
    :catchall_1
    move-exception v0

    .line 121
    goto :goto_2

    .line 122
    :catch_1
    move-exception v0

    .line 123
    move-object v2, v1

    .line 124
    :goto_1
    :try_start_4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    const-string v4, "Error querying user property. appId"

    .line 133
    .line 134
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-virtual {p0}, LR2/m3;->h()LR2/X1;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-virtual {v6, p2}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v3, v4, v5, v6, v0}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 147
    .line 148
    .line 149
    if-eqz v2, :cond_3

    .line 150
    .line 151
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 152
    .line 153
    .line 154
    :cond_3
    return-object v1

    .line 155
    :goto_2
    if-eqz v1, :cond_4

    .line 156
    .line 157
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 158
    .line 159
    .line 160
    :cond_4
    throw v0
.end method

.method public final G(Ljava/lang/String;[Ljava/lang/String;J)J
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-interface {v1, p2}, Landroid/database/Cursor;->getLong(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 22
    .line 23
    .line 24
    return-wide p1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    move-exception p2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 30
    .line 31
    .line 32
    return-wide p3

    .line 33
    :goto_0
    :try_start_1
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-virtual {p3}, LR2/Y1;->G()LR2/a2;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    const-string p4, "Database error"

    .line 42
    .line 43
    invoke-virtual {p3, p4, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :goto_1
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 50
    .line 51
    .line 52
    :cond_1
    throw p1
.end method

.method public final G0(Ljava/lang/String;)LR2/z;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, LR2/K;->T0:LR2/P1;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 27
    .line 28
    .line 29
    filled-new-array {p1}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, ""

    .line 34
    .line 35
    const-string v1, "select dma_consent_settings from consent_settings where app_id=? limit 1;"

    .line 36
    .line 37
    invoke-virtual {p0, v1, p1, v0}, LR2/p;->P(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, LR2/z;->c(Ljava/lang/String;)LR2/z;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_1
    :goto_0
    sget-object p1, LR2/z;->f:LR2/z;

    .line 47
    .line 48
    return-object p1
.end method

.method public final H(JLjava/lang/String;JZZZZZ)LR2/q;
    .locals 22

    .line 1
    const-string v0, "daily_realtime_events_count"

    .line 2
    .line 3
    const-string v1, "daily_error_events_count"

    .line 4
    .line 5
    const-string v2, "daily_conversions_count"

    .line 6
    .line 7
    const-string v3, "daily_public_events_count"

    .line 8
    .line 9
    const-string v4, "daily_events_count"

    .line 10
    .line 11
    const-string v5, "day"

    .line 12
    .line 13
    invoke-static/range {p3 .. p3}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p0 .. p0}, LR2/C5;->u()V

    .line 20
    .line 21
    .line 22
    filled-new-array/range {p3 .. p3}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    new-instance v7, LR2/q;

    .line 27
    .line 28
    invoke-direct {v7}, LR2/q;-><init>()V

    .line 29
    .line 30
    .line 31
    :try_start_0
    invoke-virtual/range {p0 .. p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 32
    .line 33
    .line 34
    move-result-object v15

    .line 35
    const-string v10, "apps"

    .line 36
    .line 37
    const/4 v9, 0x6

    .line 38
    new-array v11, v9, [Ljava/lang/String;

    .line 39
    .line 40
    const/4 v14, 0x0

    .line 41
    aput-object v5, v11, v14

    .line 42
    .line 43
    const/4 v13, 0x1

    .line 44
    aput-object v4, v11, v13

    .line 45
    .line 46
    const/4 v12, 0x2

    .line 47
    aput-object v3, v11, v12

    .line 48
    .line 49
    const/4 v9, 0x3

    .line 50
    aput-object v2, v11, v9

    .line 51
    .line 52
    const/4 v8, 0x4

    .line 53
    aput-object v1, v11, v8

    .line 54
    .line 55
    const/4 v8, 0x5

    .line 56
    aput-object v0, v11, v8

    .line 57
    .line 58
    const-string v16, "app_id=?"

    .line 59
    .line 60
    filled-new-array/range {p3 .. p3}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v17

    .line 64
    const/16 v18, 0x0

    .line 65
    .line 66
    const/16 v19, 0x0

    .line 67
    .line 68
    const/16 v20, 0x0

    .line 69
    .line 70
    move v8, v9

    .line 71
    move-object v9, v15

    .line 72
    move v8, v12

    .line 73
    move-object/from16 v12, v16

    .line 74
    .line 75
    move v8, v13

    .line 76
    move-object/from16 v13, v17

    .line 77
    .line 78
    move v8, v14

    .line 79
    move-object/from16 v14, v20

    .line 80
    .line 81
    move-object/from16 v21, v15

    .line 82
    .line 83
    move-object/from16 v15, v18

    .line 84
    .line 85
    move-object/from16 v16, v19

    .line 86
    .line 87
    invoke-virtual/range {v9 .. v16}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 88
    .line 89
    .line 90
    move-result-object v9
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 91
    :try_start_1
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    if-nez v10, :cond_0

    .line 96
    .line 97
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v1, "Not updating daily counts, app is not known. appId"

    .line 106
    .line 107
    invoke-static/range {p3 .. p3}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v0, v1, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    .line 113
    .line 114
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 115
    .line 116
    .line 117
    return-object v7

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    move-object v8, v9

    .line 120
    goto/16 :goto_1

    .line 121
    .line 122
    :catch_0
    move-exception v0

    .line 123
    move-object v8, v9

    .line 124
    goto/16 :goto_0

    .line 125
    .line 126
    :cond_0
    :try_start_2
    invoke-interface {v9, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 127
    .line 128
    .line 129
    move-result-wide v10

    .line 130
    cmp-long v8, v10, p1

    .line 131
    .line 132
    if-nez v8, :cond_1

    .line 133
    .line 134
    const/4 v8, 0x1

    .line 135
    invoke-interface {v9, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 136
    .line 137
    .line 138
    move-result-wide v10

    .line 139
    iput-wide v10, v7, LR2/q;->b:J

    .line 140
    .line 141
    const/4 v8, 0x2

    .line 142
    invoke-interface {v9, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 143
    .line 144
    .line 145
    move-result-wide v10

    .line 146
    iput-wide v10, v7, LR2/q;->a:J

    .line 147
    .line 148
    const/4 v8, 0x3

    .line 149
    invoke-interface {v9, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 150
    .line 151
    .line 152
    move-result-wide v10

    .line 153
    iput-wide v10, v7, LR2/q;->c:J

    .line 154
    .line 155
    const/4 v8, 0x4

    .line 156
    invoke-interface {v9, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 157
    .line 158
    .line 159
    move-result-wide v10

    .line 160
    iput-wide v10, v7, LR2/q;->d:J

    .line 161
    .line 162
    const/4 v8, 0x5

    .line 163
    invoke-interface {v9, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 164
    .line 165
    .line 166
    move-result-wide v10

    .line 167
    iput-wide v10, v7, LR2/q;->e:J

    .line 168
    .line 169
    :cond_1
    if-eqz p6, :cond_2

    .line 170
    .line 171
    iget-wide v10, v7, LR2/q;->b:J

    .line 172
    .line 173
    add-long v10, v10, p4

    .line 174
    .line 175
    iput-wide v10, v7, LR2/q;->b:J

    .line 176
    .line 177
    :cond_2
    if-eqz p7, :cond_3

    .line 178
    .line 179
    iget-wide v10, v7, LR2/q;->a:J

    .line 180
    .line 181
    add-long v10, v10, p4

    .line 182
    .line 183
    iput-wide v10, v7, LR2/q;->a:J

    .line 184
    .line 185
    :cond_3
    if-eqz p8, :cond_4

    .line 186
    .line 187
    iget-wide v10, v7, LR2/q;->c:J

    .line 188
    .line 189
    add-long v10, v10, p4

    .line 190
    .line 191
    iput-wide v10, v7, LR2/q;->c:J

    .line 192
    .line 193
    :cond_4
    if-eqz p9, :cond_5

    .line 194
    .line 195
    iget-wide v10, v7, LR2/q;->d:J

    .line 196
    .line 197
    add-long v10, v10, p4

    .line 198
    .line 199
    iput-wide v10, v7, LR2/q;->d:J

    .line 200
    .line 201
    :cond_5
    if-eqz p10, :cond_6

    .line 202
    .line 203
    iget-wide v10, v7, LR2/q;->e:J

    .line 204
    .line 205
    add-long v10, v10, p4

    .line 206
    .line 207
    iput-wide v10, v7, LR2/q;->e:J

    .line 208
    .line 209
    :cond_6
    new-instance v8, Landroid/content/ContentValues;

    .line 210
    .line 211
    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    invoke-virtual {v8, v5, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 219
    .line 220
    .line 221
    iget-wide v10, v7, LR2/q;->a:J

    .line 222
    .line 223
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    invoke-virtual {v8, v3, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 228
    .line 229
    .line 230
    iget-wide v10, v7, LR2/q;->b:J

    .line 231
    .line 232
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-virtual {v8, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 237
    .line 238
    .line 239
    iget-wide v3, v7, LR2/q;->c:J

    .line 240
    .line 241
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-virtual {v8, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 246
    .line 247
    .line 248
    iget-wide v2, v7, LR2/q;->d:J

    .line 249
    .line 250
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-virtual {v8, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 255
    .line 256
    .line 257
    iget-wide v1, v7, LR2/q;->e:J

    .line 258
    .line 259
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 264
    .line 265
    .line 266
    const-string v0, "apps"

    .line 267
    .line 268
    const-string v1, "app_id=?"

    .line 269
    .line 270
    move-object/from16 v2, v21

    .line 271
    .line 272
    invoke-virtual {v2, v0, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 273
    .line 274
    .line 275
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 276
    .line 277
    .line 278
    return-object v7

    .line 279
    :catchall_1
    move-exception v0

    .line 280
    const/4 v8, 0x0

    .line 281
    goto :goto_1

    .line 282
    :catch_1
    move-exception v0

    .line 283
    const/4 v8, 0x0

    .line 284
    :goto_0
    :try_start_3
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    const-string v2, "Error updating daily counts. appId"

    .line 293
    .line 294
    invoke-static/range {p3 .. p3}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v1, v2, v3, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 299
    .line 300
    .line 301
    if-eqz v8, :cond_7

    .line 302
    .line 303
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 304
    .line 305
    .line 306
    :cond_7
    return-object v7

    .line 307
    :catchall_2
    move-exception v0

    .line 308
    :goto_1
    if-eqz v8, :cond_8

    .line 309
    .line 310
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 311
    .line 312
    .line 313
    :cond_8
    throw v0
.end method

.method public final H0(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 12

    .line 1
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lt/a;

    .line 14
    .line 15
    invoke-direct {v0}, Lt/a;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v9, 0x0

    .line 23
    :try_start_0
    const-string v2, "event_filters"

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    new-array v3, v3, [Ljava/lang/String;

    .line 27
    .line 28
    const-string v4, "audience_id"

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    aput-object v4, v3, v10

    .line 32
    .line 33
    const-string v4, "data"

    .line 34
    .line 35
    const/4 v11, 0x1

    .line 36
    aput-object v4, v3, v11

    .line 37
    .line 38
    const-string v4, "app_id=? AND event_name=?"

    .line 39
    .line 40
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-nez p2, :cond_0

    .line 56
    .line 57
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_2

    .line 67
    :catch_0
    move-exception p2

    .line 68
    goto :goto_1

    .line 69
    :cond_0
    :try_start_1
    invoke-interface {v9, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 70
    .line 71
    .line 72
    move-result-object p2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/x1;->M()Lcom/google/android/gms/internal/measurement/x1$a;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1, p2}, LR2/N5;->H(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    check-cast p2, Lcom/google/android/gms/internal/measurement/x1$a;

    .line 82
    .line 83
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    check-cast p2, Lcom/google/android/gms/internal/measurement/Y3;

    .line 88
    .line 89
    check-cast p2, Lcom/google/android/gms/internal/measurement/x1;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    .line 91
    :try_start_3
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Ljava/util/List;

    .line 104
    .line 105
    if-nez v2, :cond_1

    .line 106
    .line 107
    new-instance v2, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    :cond_1
    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :catch_1
    move-exception p2

    .line 124
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const-string v2, "Failed to merge filter. appId"

    .line 133
    .line 134
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v1, v2, v3, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    .line 142
    .line 143
    .line 144
    move-result p2
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 145
    if-nez p2, :cond_0

    .line 146
    .line 147
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :goto_1
    :try_start_4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const-string v1, "Database error querying filters. appId"

    .line 160
    .line 161
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {v0, v1, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 169
    .line 170
    .line 171
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 172
    if-eqz v9, :cond_2

    .line 173
    .line 174
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 175
    .line 176
    .line 177
    :cond_2
    return-object p1

    .line 178
    :goto_2
    if-eqz v9, :cond_3

    .line 179
    .line 180
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 181
    .line 182
    .line 183
    :cond_3
    throw p1
.end method

.method public final I(JLjava/lang/String;ZZZZZ)LR2/q;
    .locals 11

    .line 1
    const/4 v7, 0x0

    .line 2
    const/4 v9, 0x0

    .line 3
    const-wide/16 v4, 0x1

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    move-object v0, p0

    .line 7
    move-wide v1, p1

    .line 8
    move-object v3, p3

    .line 9
    move/from16 v8, p6

    .line 10
    .line 11
    move/from16 v10, p8

    .line 12
    .line 13
    invoke-virtual/range {v0 .. v10}, LR2/p;->H(JLjava/lang/String;JZZZZZ)LR2/q;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final I0(Ljava/lang/String;)LR2/q3;
    .locals 2

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, LR2/K;->T0:LR2/P1;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    filled-new-array {p1}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    sget-object v0, LR2/o;->a:LR2/o;

    .line 33
    .line 34
    const-string v1, "select consent_state, consent_source from consent_settings where app_id=? limit 1;"

    .line 35
    .line 36
    invoke-virtual {p0, v1, p1, v0}, LR2/p;->N(Ljava/lang/String;[Ljava/lang/String;LR2/s;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, LR2/q3;

    .line 41
    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    sget-object p1, LR2/q3;->c:LR2/q3;

    .line 45
    .line 46
    :cond_0
    return-object p1

    .line 47
    :cond_1
    filled-new-array {p1}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "G1"

    .line 52
    .line 53
    const-string v1, "select consent_state from consent_settings where app_id=? limit 1;"

    .line 54
    .line 55
    invoke-virtual {p0, v1, p1, v0}, LR2/p;->P(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, LR2/q3;->e(Ljava/lang/String;)LR2/q3;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1
.end method

.method public final J0(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 12

    .line 1
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lt/a;

    .line 14
    .line 15
    invoke-direct {v0}, Lt/a;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v9, 0x0

    .line 23
    :try_start_0
    const-string v2, "property_filters"

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    new-array v3, v3, [Ljava/lang/String;

    .line 27
    .line 28
    const-string v4, "audience_id"

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    aput-object v4, v3, v10

    .line 32
    .line 33
    const-string v4, "data"

    .line 34
    .line 35
    const/4 v11, 0x1

    .line 36
    aput-object v4, v3, v11

    .line 37
    .line 38
    const-string v4, "app_id=? AND property_name=?"

    .line 39
    .line 40
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-nez p2, :cond_0

    .line 56
    .line 57
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_2

    .line 67
    :catch_0
    move-exception p2

    .line 68
    goto :goto_1

    .line 69
    :cond_0
    :try_start_1
    invoke-interface {v9, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 70
    .line 71
    .line 72
    move-result-object p2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/A1;->J()Lcom/google/android/gms/internal/measurement/A1$a;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1, p2}, LR2/N5;->H(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    check-cast p2, Lcom/google/android/gms/internal/measurement/A1$a;

    .line 82
    .line 83
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    check-cast p2, Lcom/google/android/gms/internal/measurement/Y3;

    .line 88
    .line 89
    check-cast p2, Lcom/google/android/gms/internal/measurement/A1;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    .line 91
    :try_start_3
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Ljava/util/List;

    .line 104
    .line 105
    if-nez v2, :cond_1

    .line 106
    .line 107
    new-instance v2, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    :cond_1
    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :catch_1
    move-exception p2

    .line 124
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const-string v2, "Failed to merge filter"

    .line 133
    .line 134
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v1, v2, v3, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    .line 142
    .line 143
    .line 144
    move-result p2
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 145
    if-nez p2, :cond_0

    .line 146
    .line 147
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :goto_1
    :try_start_4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const-string v1, "Database error querying filters. appId"

    .line 160
    .line 161
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {v0, v1, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 169
    .line 170
    .line 171
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 172
    if-eqz v9, :cond_2

    .line 173
    .line 174
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 175
    .line 176
    .line 177
    :cond_2
    return-object p1

    .line 178
    :goto_2
    if-eqz v9, :cond_3

    .line 179
    .line 180
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 181
    .line 182
    .line 183
    :cond_3
    throw p1
.end method

.method public final K0(Ljava/lang/String;)Ljava/util/List;
    .locals 14

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "trigger_uris"

    .line 21
    .line 22
    const/4 v4, 0x3

    .line 23
    new-array v4, v4, [Ljava/lang/String;

    .line 24
    .line 25
    const-string v5, "trigger_uri"

    .line 26
    .line 27
    const/4 v11, 0x0

    .line 28
    aput-object v5, v4, v11

    .line 29
    .line 30
    const-string v5, "timestamp_millis"

    .line 31
    .line 32
    const/4 v12, 0x1

    .line 33
    aput-object v5, v4, v12

    .line 34
    .line 35
    const-string v5, "source"

    .line 36
    .line 37
    const/4 v13, 0x2

    .line 38
    aput-object v5, v4, v13

    .line 39
    .line 40
    const-string v5, "app_id=?"

    .line 41
    .line 42
    filled-new-array {p1}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    const-string v9, "rowid"

    .line 47
    .line 48
    const/4 v10, 0x0

    .line 49
    const/4 v7, 0x0

    .line 50
    const/4 v8, 0x0

    .line 51
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 56
    .line 57
    .line 58
    move-result v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    if-nez v2, :cond_0

    .line 60
    .line 61
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_0
    :try_start_1
    invoke-interface {v1, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-nez v2, :cond_1

    .line 70
    .line 71
    const-string v2, ""

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    goto :goto_2

    .line 76
    :catch_0
    move-exception v0

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    :goto_0
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    invoke-interface {v1, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    new-instance v6, LR2/v5;

    .line 87
    .line 88
    invoke-direct {v6, v2, v3, v4, v5}, LR2/v5;-><init>(Ljava/lang/String;JI)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 95
    .line 96
    .line 97
    move-result v2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    if-nez v2, :cond_0

    .line 99
    .line 100
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 101
    .line 102
    .line 103
    return-object v0

    .line 104
    :goto_1
    :try_start_2
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    const-string v3, "Error querying trigger uris. appId"

    .line 113
    .line 114
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {v2, v3, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    if-eqz v1, :cond_2

    .line 126
    .line 127
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 128
    .line 129
    .line 130
    :cond_2
    return-object p1

    .line 131
    :goto_2
    if-eqz v1, :cond_3

    .line 132
    .line 133
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 134
    .line 135
    .line 136
    :cond_3
    throw p1
.end method

.method public final L(Ljava/lang/String;Ljava/lang/Long;)Landroid/util/Pair;
    .locals 7

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    new-array v3, v3, [Ljava/lang/String;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    aput-object p1, v3, v4

    .line 19
    .line 20
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const/4 v6, 0x1

    .line 25
    aput-object v5, v3, v6

    .line 26
    .line 27
    invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 28
    .line 29
    .line 30
    move-result-object v1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p2, "Main event not found"

    .line 46
    .line 47
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    move-object v0, v1

    .line 56
    goto :goto_1

    .line 57
    :catch_0
    move-exception p1

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    :try_start_2
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getBlob(I)[B

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v1, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v3
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y1;->Z()Lcom/google/android/gms/internal/measurement/Y1$a;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v4, v2}, LR2/N5;->H(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lcom/google/android/gms/internal/measurement/Y1$a;

    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Lcom/google/android/gms/internal/measurement/Y3;

    .line 86
    .line 87
    check-cast v2, Lcom/google/android/gms/internal/measurement/Y1;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 88
    .line 89
    :try_start_4
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 90
    .line 91
    .line 92
    move-result-object p1
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 93
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 94
    .line 95
    .line 96
    return-object p1

    .line 97
    :catch_1
    move-exception v2

    .line 98
    :try_start_5
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const-string v4, "Failed to merge main event. appId, eventId"

    .line 107
    .line 108
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {v3, v4, p1, p2, v2}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 113
    .line 114
    .line 115
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :catchall_1
    move-exception p1

    .line 120
    goto :goto_1

    .line 121
    :catch_2
    move-exception p1

    .line 122
    move-object v1, v0

    .line 123
    :goto_0
    :try_start_6
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p2}, LR2/Y1;->G()LR2/a2;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    const-string v2, "Error selecting main event"

    .line 132
    .line 133
    invoke-virtual {p2, v2, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 134
    .line 135
    .line 136
    if-eqz v1, :cond_1

    .line 137
    .line 138
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 139
    .line 140
    .line 141
    :cond_1
    return-object v0

    .line 142
    :goto_1
    if-eqz v0, :cond_2

    .line 143
    .line 144
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 145
    .line 146
    .line 147
    :cond_2
    throw p1
.end method

.method public final L0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "user_attributes"

    .line 18
    .line 19
    const-string v2, "app_id=? and name=?"

    .line 20
    .line 21
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0}, LR2/m3;->h()LR2/X1;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2, p2}, LR2/X1;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const-string v2, "Error deleting user property. appId"

    .line 51
    .line 52
    invoke-virtual {v1, v2, p1, p2, v0}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final M(Landroid/database/Cursor;I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getType(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v2, :cond_3

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-eq v0, v2, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x4

    .line 18
    if-eq v0, p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const-string v0, "Loaded invalid unknown value type, ignoring it"

    .line 33
    .line 34
    invoke-virtual {p1, v0, p2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string p2, "Loaded invalid blob type value, ignoring it"

    .line 47
    .line 48
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_1
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_2
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getDouble(I)D

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :cond_3
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getLong(I)J

    .line 67
    .line 68
    .line 69
    move-result-wide p1

    .line 70
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :cond_4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string p2, "Loaded invalid null value from database"

    .line 84
    .line 85
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-object v1
.end method

.method public final M0(Ljava/lang/String;)Ljava/util/List;
    .locals 15

    .line 1
    invoke-static/range {p1 .. p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "user_attributes"

    .line 21
    .line 22
    const/4 v4, 0x4

    .line 23
    new-array v4, v4, [Ljava/lang/String;

    .line 24
    .line 25
    const-string v5, "name"

    .line 26
    .line 27
    const/4 v11, 0x0

    .line 28
    aput-object v5, v4, v11

    .line 29
    .line 30
    const-string v5, "origin"

    .line 31
    .line 32
    const/4 v12, 0x1

    .line 33
    aput-object v5, v4, v12

    .line 34
    .line 35
    const-string v5, "set_timestamp"

    .line 36
    .line 37
    const/4 v13, 0x2

    .line 38
    aput-object v5, v4, v13

    .line 39
    .line 40
    const-string v5, "value"

    .line 41
    .line 42
    const/4 v14, 0x3

    .line 43
    aput-object v5, v4, v14

    .line 44
    .line 45
    const-string v5, "app_id=?"

    .line 46
    .line 47
    filled-new-array/range {p1 .. p1}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    const-string v9, "rowid"

    .line 52
    .line 53
    const-string v10, "1000"

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 62
    .line 63
    .line 64
    move-result v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-nez v2, :cond_0

    .line 66
    .line 67
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_0
    :try_start_1
    invoke-interface {v1, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-nez v2, :cond_1

    .line 80
    .line 81
    const-string v2, ""

    .line 82
    .line 83
    :cond_1
    move-object v5, v2

    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    move-object v2, p0

    .line 87
    goto :goto_3

    .line 88
    :catch_0
    move-exception v0

    .line 89
    move-object v2, p0

    .line 90
    goto :goto_2

    .line 91
    :goto_0
    invoke-interface {v1, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 92
    .line 93
    .line 94
    move-result-wide v7
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    move-object v2, p0

    .line 96
    :try_start_2
    invoke-virtual {p0, v1, v14}, LR2/p;->M(Landroid/database/Cursor;I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    if-nez v9, :cond_2

    .line 101
    .line 102
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    const-string v4, "Read invalid user property value, ignoring it. appId"

    .line 111
    .line 112
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v3, v4, v5}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :catchall_1
    move-exception v0

    .line 121
    goto :goto_3

    .line 122
    :catch_1
    move-exception v0

    .line 123
    goto :goto_2

    .line 124
    :cond_2
    new-instance v10, LR2/T5;

    .line 125
    .line 126
    move-object v3, v10

    .line 127
    move-object/from16 v4, p1

    .line 128
    .line 129
    invoke-direct/range {v3 .. v9}, LR2/T5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :goto_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 136
    .line 137
    .line 138
    move-result v3
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 139
    if-nez v3, :cond_0

    .line 140
    .line 141
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 142
    .line 143
    .line 144
    return-object v0

    .line 145
    :goto_2
    :try_start_3
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    const-string v4, "Error querying user properties. appId"

    .line 154
    .line 155
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-virtual {v3, v4, v5, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 166
    if-eqz v1, :cond_3

    .line 167
    .line 168
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 169
    .line 170
    .line 171
    :cond_3
    return-object v0

    .line 172
    :goto_3
    if-eqz v1, :cond_4

    .line 173
    .line 174
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 175
    .line 176
    .line 177
    :cond_4
    throw v0
.end method

.method public final N(Ljava/lang/String;[Ljava/lang/String;LR2/s;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 7
    .line 8
    .line 9
    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2}, LR2/Y1;->K()LR2/a2;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const-string p3, "No data found"

    .line 25
    .line 26
    invoke-virtual {p2, p3}, LR2/a2;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :catchall_0
    move-exception p2

    .line 34
    move-object v0, p1

    .line 35
    goto :goto_1

    .line 36
    :catch_0
    move-exception p2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    :try_start_2
    invoke-interface {p3, p1}, LR2/s;->a(Landroid/database/Cursor;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    :catchall_1
    move-exception p2

    .line 47
    goto :goto_1

    .line 48
    :catch_1
    move-exception p2

    .line 49
    move-object p1, v0

    .line 50
    :goto_0
    :try_start_3
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    invoke-virtual {p3}, LR2/Y1;->G()LR2/a2;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    const-string v1, "Error querying database."

    .line 59
    .line 60
    invoke-virtual {p3, v1, p2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 61
    .line 62
    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-object v0

    .line 69
    :goto_1
    if-eqz v0, :cond_2

    .line 70
    .line 71
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 72
    .line 73
    .line 74
    :cond_2
    throw p2
.end method

.method public final N0(Ljava/lang/String;)Ljava/util/Map;
    .locals 11

    .line 1
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v8, 0x0

    .line 15
    :try_start_0
    const-string v1, "audience_filter_values"

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    new-array v2, v2, [Ljava/lang/String;

    .line 19
    .line 20
    const-string v3, "audience_id"

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    aput-object v3, v2, v9

    .line 24
    .line 25
    const-string v3, "current_results"

    .line 26
    .line 27
    const/4 v10, 0x1

    .line 28
    aput-object v3, v2, v10

    .line 29
    .line 30
    const-string v3, "app_id=?"

    .line 31
    .line 32
    filled-new-array {p1}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    goto :goto_2

    .line 59
    :catch_0
    move-exception v0

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    :try_start_1
    new-instance v0, Lt/a;

    .line 62
    .line 63
    invoke-direct {v0}, Lt/a;-><init>()V

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-interface {v8, v9}, Landroid/database/Cursor;->getInt(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getBlob(I)[B

    .line 71
    .line 72
    .line 73
    move-result-object v2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/f2;->V()Lcom/google/android/gms/internal/measurement/f2$a;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v3, v2}, LR2/N5;->H(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lcom/google/android/gms/internal/measurement/f2$a;

    .line 83
    .line 84
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Lcom/google/android/gms/internal/measurement/Y3;

    .line 89
    .line 90
    check-cast v2, Lcom/google/android/gms/internal/measurement/f2;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    .line 92
    :try_start_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catch_1
    move-exception v2

    .line 101
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const-string v4, "Failed to merge filter results. appId, audienceId, error"

    .line 110
    .line 111
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v3, v4, v5, v1, v2}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    .line 123
    .line 124
    .line 125
    move-result v1
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 126
    if-nez v1, :cond_1

    .line 127
    .line 128
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :goto_1
    :try_start_4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    const-string v2, "Database error querying filter results. appId"

    .line 141
    .line 142
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {v1, v2, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 150
    .line 151
    .line 152
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 153
    if-eqz v8, :cond_2

    .line 154
    .line 155
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 156
    .line 157
    .line 158
    :cond_2
    return-object p1

    .line 159
    :goto_2
    if-eqz v8, :cond_3

    .line 160
    .line 161
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 162
    .line 163
    .line 164
    :cond_3
    throw p1
.end method

.method public final O(J)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    new-array v3, v3, [Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 p2, 0x0

    .line 22
    aput-object p1, v3, p2

    .line 23
    .line 24
    invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, LR2/Y1;->K()LR2/a2;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const-string v1, "No expired configs for apps with pending events"

    .line 43
    .line 44
    invoke-virtual {p2, v1}, LR2/a2;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :catchall_0
    move-exception p2

    .line 52
    move-object v0, p1

    .line 53
    goto :goto_1

    .line 54
    :catch_0
    move-exception p2

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    :try_start_2
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 61
    .line 62
    .line 63
    return-object p2

    .line 64
    :catchall_1
    move-exception p2

    .line 65
    goto :goto_1

    .line 66
    :catch_1
    move-exception p2

    .line 67
    move-object p1, v0

    .line 68
    :goto_0
    :try_start_3
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v2, "Error selecting expired configs"

    .line 77
    .line 78
    invoke-virtual {v1, v2, p2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    .line 80
    .line 81
    if-eqz p1, :cond_1

    .line 82
    .line 83
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 84
    .line 85
    .line 86
    :cond_1
    return-object v0

    .line 87
    :goto_1
    if-eqz v0, :cond_2

    .line 88
    .line 89
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 90
    .line 91
    .line 92
    :cond_2
    throw p2
.end method

.method public final O0(Ljava/lang/String;)Ljava/util/Map;
    .locals 12

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt/a;

    .line 5
    .line 6
    invoke-direct {v0}, Lt/a;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v9, 0x0

    .line 14
    :try_start_0
    const-string v2, "event_filters"

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    new-array v3, v3, [Ljava/lang/String;

    .line 18
    .line 19
    const-string v4, "audience_id"

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    aput-object v4, v3, v10

    .line 23
    .line 24
    const-string v4, "data"

    .line 25
    .line 26
    const/4 v11, 0x1

    .line 27
    aput-object v4, v3, v11

    .line 28
    .line 29
    const-string v4, "app_id=?"

    .line 30
    .line 31
    filled-new-array {p1}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :catch_0
    move-exception v0

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    :try_start_1
    invoke-interface {v9, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 62
    .line 63
    .line 64
    move-result-object v1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/x1;->M()Lcom/google/android/gms/internal/measurement/x1$a;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v2, v1}, LR2/N5;->H(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Lcom/google/android/gms/internal/measurement/x1$a;

    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lcom/google/android/gms/internal/measurement/Y3;

    .line 80
    .line 81
    check-cast v1, Lcom/google/android/gms/internal/measurement/x1;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    .line 83
    :try_start_3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/x1;->U()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_2

    .line 88
    .line 89
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Ljava/util/List;

    .line 102
    .line 103
    if-nez v3, :cond_1

    .line 104
    .line 105
    new-instance v3, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    :cond_1
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :catch_1
    move-exception v1

    .line 122
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const-string v3, "Failed to merge filter. appId"

    .line 131
    .line 132
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v2, v3, v4, v1}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_2
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    .line 140
    .line 141
    .line 142
    move-result v1
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 143
    if-nez v1, :cond_0

    .line 144
    .line 145
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 146
    .line 147
    .line 148
    return-object v0

    .line 149
    :goto_1
    :try_start_4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const-string v2, "Database error querying filters. appId"

    .line 158
    .line 159
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {v1, v2, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 167
    .line 168
    .line 169
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 170
    if-eqz v9, :cond_3

    .line 171
    .line 172
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 173
    .line 174
    .line 175
    :cond_3
    return-object p1

    .line 176
    :goto_2
    if-eqz v9, :cond_4

    .line 177
    .line 178
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 179
    .line 180
    .line 181
    :cond_4
    throw p1
.end method

.method public final P(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-interface {v1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    move-exception p2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 30
    .line 31
    .line 32
    return-object p3

    .line 33
    :goto_0
    :try_start_1
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-virtual {p3}, LR2/Y1;->G()LR2/a2;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    const-string v0, "Database error"

    .line 42
    .line 43
    invoke-virtual {p3, v0, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :goto_1
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 50
    .line 51
    .line 52
    :cond_1
    throw p1
.end method

.method public final P0(Ljava/lang/String;)Ljava/util/Map;
    .locals 5

    .line 1
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    new-instance v0, Lt/a;

    .line 11
    .line 12
    invoke-direct {v0}, Lt/a;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :try_start_0
    const-string v3, "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"

    .line 21
    .line 22
    filled-new-array {p1, p1}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :catch_0
    move-exception v0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v1, 0x0

    .line 49
    :try_start_1
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/util/List;

    .line 62
    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    new-instance v3, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_1
    const/4 v1, 0x1

    .line 78
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    if-nez v1, :cond_0

    .line 94
    .line 95
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :goto_0
    :try_start_2
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const-string v3, "Database error querying scoped filters. appId"

    .line 108
    .line 109
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v1, v3, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 117
    .line 118
    .line 119
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    if-eqz v2, :cond_2

    .line 121
    .line 122
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 123
    .line 124
    .line 125
    :cond_2
    return-object p1

    .line 126
    :goto_1
    if-eqz v2, :cond_3

    .line 127
    .line 128
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 129
    .line 130
    .line 131
    :cond_3
    throw p1
.end method

.method public final Q(Ljava/lang/String;II)Ljava/util/List;
    .locals 19

    .line 1
    move/from16 v1, p3

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, LR2/C5;->u()V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-lez p2, :cond_0

    .line 12
    .line 13
    move v0, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v3

    .line 16
    :goto_0
    invoke-static {v0}, LA2/n;->a(Z)V

    .line 17
    .line 18
    .line 19
    if-lez v1, :cond_1

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, v3

    .line 24
    :goto_1
    invoke-static {v0}, LA2/n;->a(Z)V

    .line 25
    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    :try_start_0
    invoke-virtual/range {p0 .. p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string v6, "queue"

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    new-array v7, v0, [Ljava/lang/String;

    .line 39
    .line 40
    const-string v0, "rowid"

    .line 41
    .line 42
    aput-object v0, v7, v3

    .line 43
    .line 44
    const-string v0, "data"

    .line 45
    .line 46
    aput-object v0, v7, v2

    .line 47
    .line 48
    const-string v0, "retry_count"

    .line 49
    .line 50
    const/4 v14, 0x2

    .line 51
    aput-object v0, v7, v14

    .line 52
    .line 53
    const-string v8, "app_id=?"

    .line 54
    .line 55
    filled-new-array/range {p1 .. p1}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    const-string v12, "rowid"

    .line 60
    .line 61
    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    const/4 v10, 0x0

    .line 66
    const/4 v11, 0x0

    .line 67
    invoke-virtual/range {v5 .. v13}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    goto/16 :goto_9

    .line 87
    .line 88
    :catch_0
    move-exception v0

    .line 89
    goto/16 :goto_8

    .line 90
    .line 91
    :cond_2
    :try_start_1
    new-instance v5, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    move v6, v3

    .line 97
    :goto_2
    invoke-interface {v4, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 98
    .line 99
    .line 100
    move-result-wide v7
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    :try_start_2
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    invoke-virtual {v9, v0}, LR2/N5;->i0([B)[B

    .line 110
    .line 111
    .line 112
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 113
    :try_start_3
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    if-nez v9, :cond_3

    .line 118
    .line 119
    array-length v9, v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 120
    add-int/2addr v9, v6

    .line 121
    if-gt v9, v1, :cond_b

    .line 122
    .line 123
    :cond_3
    :try_start_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/d2;->A3()Lcom/google/android/gms/internal/measurement/d2$a;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    invoke-static {v9, v0}, LR2/N5;->H(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    check-cast v9, Lcom/google/android/gms/internal/measurement/d2$a;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 132
    .line 133
    :try_start_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-eqz v10, :cond_8

    .line 138
    .line 139
    invoke-virtual/range {p0 .. p0}, LR2/m3;->f()LR2/g;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    sget-object v11, LR2/K;->X0:LR2/P1;

    .line 144
    .line 145
    invoke-virtual {v10, v11}, LR2/g;->s(LR2/P1;)Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-eqz v10, :cond_8

    .line 150
    .line 151
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    if-nez v10, :cond_8

    .line 156
    .line 157
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    check-cast v10, Landroid/util/Pair;

    .line 162
    .line 163
    iget-object v10, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v10, Lcom/google/android/gms/internal/measurement/d2;

    .line 166
    .line 167
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    check-cast v11, Lcom/google/android/gms/internal/measurement/Y3;

    .line 172
    .line 173
    check-cast v11, Lcom/google/android/gms/internal/measurement/d2;

    .line 174
    .line 175
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d2;->f0()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d2;->f0()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v12

    .line 187
    if-eqz v12, :cond_b

    .line 188
    .line 189
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d2;->e0()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d2;->e0()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v13

    .line 197
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    if-eqz v12, :cond_b

    .line 202
    .line 203
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d2;->v0()Z

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d2;->v0()Z

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    if-ne v12, v13, :cond_b

    .line 212
    .line 213
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d2;->g0()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d2;->g0()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v13

    .line 221
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    if-eqz v12, :cond_b

    .line 226
    .line 227
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d2;->t0()Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v12
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 239
    const-string v13, "_npa"

    .line 240
    .line 241
    const-wide/16 v15, -0x1

    .line 242
    .line 243
    if-eqz v12, :cond_5

    .line 244
    .line 245
    :try_start_6
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v12

    .line 249
    check-cast v12, Lcom/google/android/gms/internal/measurement/h2;

    .line 250
    .line 251
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/h2;->Z()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_4

    .line 260
    .line 261
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/h2;->U()J

    .line 262
    .line 263
    .line 264
    move-result-wide v17

    .line 265
    goto :goto_4

    .line 266
    :cond_4
    const/4 v2, 0x1

    .line 267
    goto :goto_3

    .line 268
    :cond_5
    move-wide/from16 v17, v15

    .line 269
    .line 270
    :goto_4
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d2;->t0()Ljava/util/List;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    if-eqz v10, :cond_7

    .line 283
    .line 284
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    check-cast v10, Lcom/google/android/gms/internal/measurement/h2;

    .line 289
    .line 290
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/h2;->Z()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    if-eqz v11, :cond_6

    .line 299
    .line 300
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/h2;->U()J

    .line 301
    .line 302
    .line 303
    move-result-wide v15

    .line 304
    :cond_7
    cmp-long v2, v17, v15

    .line 305
    .line 306
    if-nez v2, :cond_b

    .line 307
    .line 308
    :cond_8
    invoke-interface {v4, v14}, Landroid/database/Cursor;->isNull(I)Z

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-nez v2, :cond_9

    .line 313
    .line 314
    invoke-interface {v4, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/measurement/d2$a;->q0(I)Lcom/google/android/gms/internal/measurement/d2$a;

    .line 319
    .line 320
    .line 321
    :cond_9
    array-length v0, v0

    .line 322
    add-int/2addr v6, v0

    .line 323
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    check-cast v0, Lcom/google/android/gms/internal/measurement/Y3;

    .line 328
    .line 329
    check-cast v0, Lcom/google/android/gms/internal/measurement/d2;

    .line 330
    .line 331
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-static {v0, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    goto :goto_6

    .line 343
    :catch_1
    move-exception v0

    .line 344
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    const-string v7, "Failed to merge queued bundle. appId"

    .line 353
    .line 354
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v8

    .line 358
    :goto_5
    invoke-virtual {v2, v7, v8, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    goto :goto_6

    .line 362
    :catch_2
    move-exception v0

    .line 363
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    const-string v7, "Failed to unzip queued bundle. appId"

    .line 372
    .line 373
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    goto :goto_5

    .line 378
    :goto_6
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 379
    .line 380
    .line 381
    move-result v0
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 382
    if-eqz v0, :cond_b

    .line 383
    .line 384
    if-le v6, v1, :cond_a

    .line 385
    .line 386
    goto :goto_7

    .line 387
    :cond_a
    const/4 v2, 0x1

    .line 388
    goto/16 :goto_2

    .line 389
    .line 390
    :cond_b
    :goto_7
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 391
    .line 392
    .line 393
    return-object v5

    .line 394
    :goto_8
    :try_start_7
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    const-string v2, "Error querying bundles. appId"

    .line 403
    .line 404
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-virtual {v1, v2, v3, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 412
    .line 413
    .line 414
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 415
    if-eqz v4, :cond_c

    .line 416
    .line 417
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 418
    .line 419
    .line 420
    :cond_c
    return-object v0

    .line 421
    :goto_9
    if-eqz v4, :cond_d

    .line 422
    .line 423
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 424
    .line 425
    .line 426
    :cond_d
    throw v0
.end method

.method public final Q0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    new-instance p1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v1, "app_id=?"

    .line 22
    .line 23
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    const-string p2, " and origin=?"

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-nez p2, :cond_1

    .line 45
    .line 46
    new-instance p2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p3, "*"

    .line 55
    .line 56
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    const-string p2, " and name glob ?"

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    new-array p2, p2, [Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {v0, p2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    check-cast p2, [Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p0, p1, p2}, LR2/p;->S(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1
.end method

.method public final R0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final S(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-virtual/range {p0 .. p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "conditional_properties"

    .line 17
    .line 18
    const/16 v4, 0xd

    .line 19
    .line 20
    new-array v4, v4, [Ljava/lang/String;

    .line 21
    .line 22
    const-string v5, "app_id"

    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    aput-object v5, v4, v11

    .line 26
    .line 27
    const-string v5, "origin"

    .line 28
    .line 29
    const/4 v12, 0x1

    .line 30
    aput-object v5, v4, v12

    .line 31
    .line 32
    const-string v5, "name"

    .line 33
    .line 34
    const/4 v13, 0x2

    .line 35
    aput-object v5, v4, v13

    .line 36
    .line 37
    const-string v5, "value"

    .line 38
    .line 39
    const/4 v14, 0x3

    .line 40
    aput-object v5, v4, v14

    .line 41
    .line 42
    const-string v5, "active"

    .line 43
    .line 44
    const/4 v15, 0x4

    .line 45
    aput-object v5, v4, v15

    .line 46
    .line 47
    const-string v5, "trigger_event_name"

    .line 48
    .line 49
    const/4 v10, 0x5

    .line 50
    aput-object v5, v4, v10

    .line 51
    .line 52
    const-string v5, "trigger_timeout"

    .line 53
    .line 54
    const/4 v9, 0x6

    .line 55
    aput-object v5, v4, v9

    .line 56
    .line 57
    const-string v5, "timed_out_event"

    .line 58
    .line 59
    const/4 v8, 0x7

    .line 60
    aput-object v5, v4, v8

    .line 61
    .line 62
    const-string v5, "creation_timestamp"

    .line 63
    .line 64
    const/16 v7, 0x8

    .line 65
    .line 66
    aput-object v5, v4, v7

    .line 67
    .line 68
    const-string v5, "triggered_event"

    .line 69
    .line 70
    const/16 v6, 0x9

    .line 71
    .line 72
    aput-object v5, v4, v6

    .line 73
    .line 74
    const-string v5, "triggered_timestamp"

    .line 75
    .line 76
    const/16 v1, 0xa

    .line 77
    .line 78
    aput-object v5, v4, v1

    .line 79
    .line 80
    const-string v5, "time_to_live"

    .line 81
    .line 82
    const/16 v1, 0xb

    .line 83
    .line 84
    aput-object v5, v4, v1

    .line 85
    .line 86
    const-string v5, "expired_event"

    .line 87
    .line 88
    const/16 v1, 0xc

    .line 89
    .line 90
    aput-object v5, v4, v1

    .line 91
    .line 92
    const-string v19, "rowid"

    .line 93
    .line 94
    const-string v20, "1001"

    .line 95
    .line 96
    const/16 v21, 0x0

    .line 97
    .line 98
    const/16 v22, 0x0

    .line 99
    .line 100
    move-object/from16 v5, p1

    .line 101
    .line 102
    move v1, v6

    .line 103
    move-object/from16 v6, p2

    .line 104
    .line 105
    move v1, v7

    .line 106
    move-object/from16 v7, v21

    .line 107
    .line 108
    move v1, v8

    .line 109
    move-object/from16 v8, v22

    .line 110
    .line 111
    move v1, v9

    .line 112
    move-object/from16 v9, v19

    .line 113
    .line 114
    move v1, v10

    .line 115
    move-object/from16 v10, v20

    .line 116
    .line 117
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 118
    .line 119
    .line 120
    move-result-object v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 121
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 122
    .line 123
    .line 124
    move-result v3
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    if-nez v3, :cond_0

    .line 126
    .line 127
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 128
    .line 129
    .line 130
    return-object v0

    .line 131
    :cond_0
    :goto_0
    :try_start_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    const/16 v4, 0x3e8

    .line 136
    .line 137
    if-lt v3, v4, :cond_1

    .line 138
    .line 139
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const-string v3, "Read more than the max allowed conditional properties, ignoring extra"

    .line 148
    .line 149
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v1, v3, v4}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_2

    .line 157
    .line 158
    :catchall_0
    move-exception v0

    .line 159
    move-object v1, v2

    .line 160
    goto/16 :goto_4

    .line 161
    .line 162
    :catch_0
    move-exception v0

    .line 163
    move-object v1, v2

    .line 164
    goto/16 :goto_3

    .line 165
    .line 166
    :cond_1
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    move-object/from16 v9, p0

    .line 179
    .line 180
    invoke-virtual {v9, v2, v14}, LR2/p;->M(Landroid/database/Cursor;I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-eqz v4, :cond_2

    .line 189
    .line 190
    move/from16 v24, v12

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_2
    move/from16 v24, v11

    .line 194
    .line 195
    :goto_1
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v25

    .line 199
    const/4 v6, 0x6

    .line 200
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 201
    .line 202
    .line 203
    move-result-wide v26

    .line 204
    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    const/4 v7, 0x7

    .line 209
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getBlob(I)[B

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    sget-object v6, LR2/I;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 214
    .line 215
    invoke-virtual {v4, v1, v6}, LR2/N5;->E([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, LR2/I;

    .line 220
    .line 221
    const/16 v4, 0x8

    .line 222
    .line 223
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 224
    .line 225
    .line 226
    move-result-wide v20

    .line 227
    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    const/16 v11, 0x9

    .line 232
    .line 233
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    invoke-virtual {v4, v7, v6}, LR2/N5;->E([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    move-object/from16 v28, v4

    .line 242
    .line 243
    check-cast v28, LR2/I;

    .line 244
    .line 245
    const/16 v7, 0xa

    .line 246
    .line 247
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 248
    .line 249
    .line 250
    move-result-wide v29

    .line 251
    const/16 v4, 0xb

    .line 252
    .line 253
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 254
    .line 255
    .line 256
    move-result-wide v31

    .line 257
    invoke-virtual/range {p0 .. p0}, LR2/z5;->o()LR2/N5;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    const/16 v11, 0xc

    .line 262
    .line 263
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    invoke-virtual {v4, v7, v6}, LR2/N5;->E([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    move-object/from16 v33, v4

    .line 272
    .line 273
    check-cast v33, LR2/I;

    .line 274
    .line 275
    new-instance v23, LR2/R5;

    .line 276
    .line 277
    const/16 v34, 0x8

    .line 278
    .line 279
    const/16 v35, 0xb

    .line 280
    .line 281
    move-object/from16 v4, v23

    .line 282
    .line 283
    const/16 v36, 0x6

    .line 284
    .line 285
    const/16 v37, 0x7

    .line 286
    .line 287
    const/16 v38, 0xa

    .line 288
    .line 289
    move-wide/from16 v6, v29

    .line 290
    .line 291
    move-object v9, v10

    .line 292
    invoke-direct/range {v4 .. v9}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    new-instance v4, LR2/e;

    .line 296
    .line 297
    move-object/from16 v16, v4

    .line 298
    .line 299
    move-object/from16 v17, v3

    .line 300
    .line 301
    move-object/from16 v18, v10

    .line 302
    .line 303
    move-object/from16 v19, v23

    .line 304
    .line 305
    move/from16 v22, v24

    .line 306
    .line 307
    move-object/from16 v23, v25

    .line 308
    .line 309
    move-object/from16 v24, v1

    .line 310
    .line 311
    move-wide/from16 v25, v26

    .line 312
    .line 313
    move-object/from16 v27, v28

    .line 314
    .line 315
    move-wide/from16 v28, v31

    .line 316
    .line 317
    move-object/from16 v30, v33

    .line 318
    .line 319
    invoke-direct/range {v16 .. v30}, LR2/e;-><init>(Ljava/lang/String;Ljava/lang/String;LR2/R5;JZLjava/lang/String;LR2/I;JLR2/I;JLR2/I;)V

    .line 320
    .line 321
    .line 322
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 326
    .line 327
    .line 328
    move-result v1
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 329
    if-nez v1, :cond_3

    .line 330
    .line 331
    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 332
    .line 333
    .line 334
    return-object v0

    .line 335
    :cond_3
    const/4 v1, 0x5

    .line 336
    const/4 v11, 0x0

    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :catchall_1
    move-exception v0

    .line 340
    const/4 v1, 0x0

    .line 341
    goto :goto_4

    .line 342
    :catch_1
    move-exception v0

    .line 343
    const/4 v1, 0x0

    .line 344
    :goto_3
    :try_start_3
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-virtual {v2}, LR2/Y1;->G()LR2/a2;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    const-string v3, "Error querying conditional user property value"

    .line 353
    .line 354
    invoke-virtual {v2, v3, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 361
    if-eqz v1, :cond_4

    .line 362
    .line 363
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 364
    .line 365
    .line 366
    :cond_4
    return-object v0

    .line 367
    :catchall_2
    move-exception v0

    .line 368
    :goto_4
    if-eqz v1, :cond_5

    .line 369
    .line 370
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 371
    .line 372
    .line 373
    :cond_5
    throw v0
.end method

.method public final S0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/p;->u0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, LR2/z5;->s()LR2/g5;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, LR2/g5;->e:LR2/q2;

    .line 19
    .line 20
    invoke-virtual {v0}, LR2/q2;->a()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v2}, LE2/e;->b()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    sub-long v0, v2, v0

    .line 33
    .line 34
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    sget-object v4, LR2/K;->A:LR2/P1;

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-virtual {v4, v5}, LR2/P1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ljava/lang/Long;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    cmp-long v0, v0, v4

    .line 52
    .line 53
    if-lez v0, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, LR2/z5;->s()LR2/g5;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v0, v0, LR2/g5;->e:LR2/q2;

    .line 60
    .line 61
    invoke-virtual {v0, v2, v3}, LR2/q2;->b(J)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, LR2/p;->u0()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_1

    .line 75
    .line 76
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-interface {v1}, LE2/e;->a()J

    .line 85
    .line 86
    .line 87
    move-result-wide v1

    .line 88
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {}, LR2/g;->M()J

    .line 93
    .line 94
    .line 95
    move-result-wide v2

    .line 96
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const-string v2, "queue"

    .line 105
    .line 106
    const-string v3, "abs(bundle_end_timestamp - ?) > cast(? as integer)"

    .line 107
    .line 108
    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-lez v0, :cond_1

    .line 113
    .line 114
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, LR2/Y1;->K()LR2/a2;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v2, "Deleted stale rows. rowsDeleted"

    .line 127
    .line 128
    invoke-virtual {v1, v2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_1
    return-void
.end method

.method public final T(LR2/E;)V
    .locals 5

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/content/ContentValues;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v1, p1, LR2/E;->a:Ljava/lang/String;

    .line 16
    .line 17
    const-string v2, "app_id"

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "name"

    .line 23
    .line 24
    iget-object v2, p1, LR2/E;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-wide v1, p1, LR2/E;->c:J

    .line 30
    .line 31
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "lifetime_count"

    .line 36
    .line 37
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 38
    .line 39
    .line 40
    iget-wide v1, p1, LR2/E;->d:J

    .line 41
    .line 42
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "current_bundle_count"

    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 49
    .line 50
    .line 51
    iget-wide v1, p1, LR2/E;->f:J

    .line 52
    .line 53
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v2, "last_fire_timestamp"

    .line 58
    .line 59
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 60
    .line 61
    .line 62
    iget-wide v1, p1, LR2/E;->g:J

    .line 63
    .line 64
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "last_bundled_timestamp"

    .line 69
    .line 70
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 71
    .line 72
    .line 73
    const-string v1, "last_bundled_day"

    .line 74
    .line 75
    iget-object v2, p1, LR2/E;->h:Ljava/lang/Long;

    .line 76
    .line 77
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 78
    .line 79
    .line 80
    const-string v1, "last_sampled_complex_event_id"

    .line 81
    .line 82
    iget-object v2, p1, LR2/E;->i:Ljava/lang/Long;

    .line 83
    .line 84
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 85
    .line 86
    .line 87
    const-string v1, "last_sampling_rate"

    .line 88
    .line 89
    iget-object v2, p1, LR2/E;->j:Ljava/lang/Long;

    .line 90
    .line 91
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 92
    .line 93
    .line 94
    iget-wide v1, p1, LR2/E;->e:J

    .line 95
    .line 96
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v2, "current_session_count"

    .line 101
    .line 102
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, p1, LR2/E;->k:Ljava/lang/Boolean;

    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    if-eqz v1, :cond_0

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_0

    .line 115
    .line 116
    const-wide/16 v3, 0x1

    .line 117
    .line 118
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    goto :goto_0

    .line 123
    :cond_0
    move-object v1, v2

    .line 124
    :goto_0
    const-string v3, "last_exempt_from_sampling"

    .line 125
    .line 126
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 127
    .line 128
    .line 129
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v3, "events"

    .line 134
    .line 135
    const/4 v4, 0x5

    .line 136
    invoke-virtual {v1, v3, v2, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    const-wide/16 v2, -0x1

    .line 141
    .line 142
    cmp-long v0, v0, v2

    .line 143
    .line 144
    if-nez v0, :cond_1

    .line 145
    .line 146
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    const-string v1, "Failed to insert/update event aggregates (got -1). appId"

    .line 155
    .line 156
    iget-object v2, p1, LR2/E;->a:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v0, v1, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :catch_0
    move-exception v0

    .line 167
    goto :goto_2

    .line 168
    :cond_1
    :goto_1
    return-void

    .line 169
    :goto_2
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    iget-object p1, p1, LR2/E;->a:Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    const-string v2, "Error storing event aggregates. appId"

    .line 184
    .line 185
    invoke-virtual {v1, v2, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public final T0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final U(LR2/I2;)V
    .locals 8

    .line 1
    const-string v0, "apps"

    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, LR2/m3;->n()V

    invoke-virtual {p0}, LR2/C5;->u()V

    invoke-virtual {p1}, LR2/I2;->t0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "app_id"

    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "app_instance_id"

    invoke-virtual {p1}, LR2/I2;->u0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "gmp_app_id"

    invoke-virtual {p1}, LR2/I2;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "resettable_device_id_hash"

    invoke-virtual {p1}, LR2/I2;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LR2/I2;->k0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "last_bundle_index"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->m0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "last_bundle_start_timestamp"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->i0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "last_bundle_end_timestamp"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v3, "app_version"

    invoke-virtual {p1}, LR2/I2;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "app_store"

    invoke-virtual {p1}, LR2/I2;->v0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LR2/I2;->g0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "gmp_version"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->a0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "dev_cert_hash"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->r()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "measurement_enabled"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p1}, LR2/I2;->Y()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "day"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->T()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "daily_public_events_count"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->Q()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "daily_events_count"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->K()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "daily_conversions_count"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->H()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "config_fetched_time"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->e0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "failed_config_fetch_time"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->z()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "app_version_int"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v3, "firebase_instance_id"

    invoke-virtual {p1}, LR2/I2;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LR2/I2;->N()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "daily_error_events_count"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->W()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "daily_realtime_events_count"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v3, "health_monitor_sample"

    invoke-virtual {p1}, LR2/I2;->k()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LR2/I2;->v()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "android_id"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->q()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "adid_reporting_enabled"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v3, "admob_app_id"

    invoke-virtual {p1}, LR2/I2;->r0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LR2/I2;->c0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "dynamite_version"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v3, "session_stitching_token"

    invoke-virtual {p1}, LR2/I2;->m()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LR2/I2;->t()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "sgtm_upload_enabled"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p1}, LR2/I2;->p0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "target_os_version"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, LR2/I2;->o0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "session_stitching_token_hash"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    move-result-object v3

    sget-object v4, LR2/K;->L0:LR2/P1;

    invoke-virtual {v3, v1, v4}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, LR2/I2;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "ad_services_version"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p1}, LR2/I2;->D()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "attribution_eligibility_status"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/i6;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    move-result-object v3

    sget-object v4, LR2/K;->Y0:LR2/P1;

    invoke-virtual {v3, v1, v4}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, LR2/I2;->u()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "unmatched_first_open_without_ad_id"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    :cond_1
    invoke-virtual {p1}, LR2/I2;->n()Ljava/util/List;

    move-result-object v3

    const-string v4, "safelisted_events"

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->L()LR2/a2;

    move-result-object v3

    const-string v5, "Safelisted events should not be an empty list. appId"

    invoke-virtual {v3, v5, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    const-string v5, ","

    invoke-static {v5, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/o6;->a()Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_4

    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    move-result-object v3

    sget-object v6, LR2/K;->u0:LR2/P1;

    invoke-virtual {v3, v6}, LR2/g;->s(LR2/P1;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2, v4}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v2, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    move-result-object v3

    sget-object v4, LR2/K;->T0:LR2/P1;

    invoke-virtual {v3, v1, v4}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "npa_metadata_value"

    invoke-virtual {p1}, LR2/I2;->q0()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    :cond_5
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    const-string v3, "app_id = ?"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    int-to-long v3, v3

    const-wide/16 v6, 0x0

    cmp-long v3, v3, v6

    if-nez v3, :cond_6

    const/4 v3, 0x5

    invoke-virtual {p1, v0, v5, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long p1, v2, v4

    if-nez p1, :cond_6

    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    move-result-object p1

    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    move-result-object p1

    const-string v0, "Failed to insert/update app (got -1). appId"

    invoke-static {v1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_6
    :goto_1
    return-void

    :goto_2
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    move-result-object v0

    const-string v2, "Error storing app. appId"

    invoke-static {v1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1, p1}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final U0()Z
    .locals 4

    .line 1
    const-string v0, "select count(1) > 0 from raw_events"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, LR2/p;->x0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public final V0()Z
    .locals 4

    .line 1
    const-string v0, "select count(1) > 0 from queue where has_realtime = 1"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, LR2/p;->x0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public final W(Ljava/lang/String;LR2/z;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, LR2/K;->T0:LR2/P1;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LR2/g;->s(LR2/P1;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-static {p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 30
    .line 31
    .line 32
    new-instance v0, Landroid/content/ContentValues;

    .line 33
    .line 34
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v1, "app_id"

    .line 38
    .line 39
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string p1, "dma_consent_settings"

    .line 43
    .line 44
    invoke-virtual {p2}, LR2/z;->i()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string p1, "consent_settings"

    .line 52
    .line 53
    invoke-virtual {p0, p1, v1, v0}, LR2/p;->Y(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    return-void
.end method

.method public final W0()Z
    .locals 4

    .line 1
    const-string v0, "select count(1) > 0 from raw_events where realtime = 1"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, LR2/p;->x0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public final X(Ljava/lang/String;LR2/q3;)V
    .locals 5

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroid/content/ContentValues;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "app_id"

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, LR2/q3;->v()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "consent_state"

    .line 28
    .line 29
    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const-string v3, "consent_settings"

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    sget-object v4, LR2/K;->T0:LR2/P1;

    .line 45
    .line 46
    invoke-virtual {v2, v4}, LR2/g;->s(LR2/P1;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2}, LR2/q3;->b()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string p2, "consent_source"

    .line 61
    .line 62
    invoke-virtual {v0, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v3, v1, v0}, LR2/p;->Y(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    const/4 v1, 0x0

    .line 74
    const/4 v2, 0x5

    .line 75
    invoke-virtual {p2, v3, v1, v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    const-wide/16 v2, -0x1

    .line 80
    .line 81
    cmp-long p2, v0, v2

    .line 82
    .line 83
    if-nez p2, :cond_1

    .line 84
    .line 85
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p2}, LR2/Y1;->G()LR2/a2;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    const-string v0, "Failed to insert/update consent setting (got -1). appId"

    .line 94
    .line 95
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {p2, v0, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :catch_0
    move-exception p2

    .line 104
    goto :goto_1

    .line 105
    :cond_1
    :goto_0
    return-void

    .line 106
    :goto_1
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v1, "Error storing consent setting. appId, error"

    .line 115
    .line 116
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {v0, v1, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public final Y(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)V
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p3, p2}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {p3}, LR2/Y1;->H()LR2/a2;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const-string v0, "Value of the primary key is not set."

    .line 20
    .line 21
    invoke-static {p2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p3, v0, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception p3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v3, " = ?"

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    filled-new-array {v1}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, p1, p3, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    int-to-long v1, v1

    .line 57
    const-wide/16 v3, 0x0

    .line 58
    .line 59
    cmp-long v1, v1, v3

    .line 60
    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    const/4 v2, 0x5

    .line 65
    invoke-virtual {v0, p1, v1, p3, v2}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    const-wide/16 v2, -0x1

    .line 70
    .line 71
    cmp-long p3, v0, v2

    .line 72
    .line 73
    if-nez p3, :cond_1

    .line 74
    .line 75
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    invoke-virtual {p3}, LR2/Y1;->G()LR2/a2;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    const-string v0, "Failed to insert/update table (got -1). key"

    .line 84
    .line 85
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {p2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {p3, v0, v1, v2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    .line 96
    :cond_1
    return-void

    .line 97
    :goto_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {p2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    const-string v1, "Error storing into table. key"

    .line 114
    .line 115
    invoke-virtual {v0, v1, p1, p2, p3}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final Z(Ljava/lang/String;Ljava/util/List;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "app_id=? and audience_id=?"

    .line 8
    .line 9
    const-string v4, "event_filters"

    .line 10
    .line 11
    const-string v5, "app_id=?"

    .line 12
    .line 13
    const-string v6, "property_filters"

    .line 14
    .line 15
    invoke-static/range {p2 .. p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    :goto_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v9

    .line 23
    if-ge v8, v9, :cond_7

    .line 24
    .line 25
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    check-cast v9, Lcom/google/android/gms/internal/measurement/w1;

    .line 30
    .line 31
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    check-cast v9, Lcom/google/android/gms/internal/measurement/w1$a;

    .line 36
    .line 37
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/w1$a;->w()I

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    if-eqz v11, :cond_4

    .line 42
    .line 43
    const/4 v11, 0x0

    .line 44
    :goto_1
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/w1$a;->w()I

    .line 45
    .line 46
    .line 47
    move-result v12

    .line 48
    if-ge v11, v12, :cond_4

    .line 49
    .line 50
    invoke-virtual {v9, v11}, Lcom/google/android/gms/internal/measurement/w1$a;->z(I)Lcom/google/android/gms/internal/measurement/x1;

    .line 51
    .line 52
    .line 53
    move-result-object v12

    .line 54
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    .line 55
    .line 56
    .line 57
    move-result-object v12

    .line 58
    check-cast v12, Lcom/google/android/gms/internal/measurement/x1$a;

    .line 59
    .line 60
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/k3;->clone()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    check-cast v13, Lcom/google/android/gms/internal/measurement/Y3$b;

    .line 65
    .line 66
    check-cast v13, Lcom/google/android/gms/internal/measurement/x1$a;

    .line 67
    .line 68
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/x1$a;->A()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v14

    .line 72
    invoke-static {v14}, LR2/r3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v14

    .line 76
    if-eqz v14, :cond_0

    .line 77
    .line 78
    invoke-virtual {v13, v14}, Lcom/google/android/gms/internal/measurement/x1$a;->y(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x1$a;

    .line 79
    .line 80
    .line 81
    const/4 v14, 0x1

    .line 82
    goto :goto_2

    .line 83
    :cond_0
    const/4 v14, 0x0

    .line 84
    :goto_2
    const/4 v15, 0x0

    .line 85
    :goto_3
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/x1$a;->w()I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    if-ge v15, v10, :cond_2

    .line 90
    .line 91
    invoke-virtual {v12, v15}, Lcom/google/android/gms/internal/measurement/x1$a;->z(I)Lcom/google/android/gms/internal/measurement/y1;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/y1;->M()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v16

    .line 99
    invoke-static/range {v16 .. v16}, LR2/t3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    if-eqz v7, :cond_1

    .line 104
    .line 105
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    check-cast v10, Lcom/google/android/gms/internal/measurement/y1$a;

    .line 110
    .line 111
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/measurement/y1$a;->w(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/y1$a;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    check-cast v7, Lcom/google/android/gms/internal/measurement/Y3;

    .line 120
    .line 121
    check-cast v7, Lcom/google/android/gms/internal/measurement/y1;

    .line 122
    .line 123
    invoke-virtual {v13, v15, v7}, Lcom/google/android/gms/internal/measurement/x1$a;->x(ILcom/google/android/gms/internal/measurement/y1;)Lcom/google/android/gms/internal/measurement/x1$a;

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x1

    .line 127
    :cond_1
    add-int/lit8 v15, v15, 0x1

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_2
    if-eqz v14, :cond_3

    .line 131
    .line 132
    invoke-virtual {v9, v11, v13}, Lcom/google/android/gms/internal/measurement/w1$a;->x(ILcom/google/android/gms/internal/measurement/x1$a;)Lcom/google/android/gms/internal/measurement/w1$a;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    check-cast v9, Lcom/google/android/gms/internal/measurement/Y3;

    .line 141
    .line 142
    check-cast v9, Lcom/google/android/gms/internal/measurement/w1;

    .line 143
    .line 144
    invoke-interface {v2, v8, v9}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-object v9, v7

    .line 148
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_4
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/w1$a;->A()I

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    if-eqz v7, :cond_6

    .line 156
    .line 157
    const/4 v7, 0x0

    .line 158
    :goto_4
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/w1$a;->A()I

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-ge v7, v10, :cond_6

    .line 163
    .line 164
    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/measurement/w1$a;->B(I)Lcom/google/android/gms/internal/measurement/A1;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/A1;->L()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    invoke-static {v11}, LR2/s3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    if-eqz v11, :cond_5

    .line 177
    .line 178
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/Y3;->x()Lcom/google/android/gms/internal/measurement/Y3$b;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    check-cast v10, Lcom/google/android/gms/internal/measurement/A1$a;

    .line 183
    .line 184
    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/measurement/A1$a;->w(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/A1$a;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    invoke-virtual {v9, v7, v10}, Lcom/google/android/gms/internal/measurement/w1$a;->y(ILcom/google/android/gms/internal/measurement/A1$a;)Lcom/google/android/gms/internal/measurement/w1$a;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/Y3$b;->p()Lcom/google/android/gms/internal/measurement/I4;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    check-cast v10, Lcom/google/android/gms/internal/measurement/Y3;

    .line 197
    .line 198
    check-cast v10, Lcom/google/android/gms/internal/measurement/w1;

    .line 199
    .line 200
    invoke-interface {v2, v8, v10}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_7
    invoke-virtual/range {p0 .. p0}, LR2/C5;->u()V

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    .line 214
    .line 215
    .line 216
    invoke-static/range {p1 .. p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    invoke-static/range {p2 .. p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {p0 .. p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-virtual {v7}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 227
    .line 228
    .line 229
    :try_start_0
    invoke-virtual/range {p0 .. p0}, LR2/C5;->u()V

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    .line 233
    .line 234
    .line 235
    invoke-static/range {p1 .. p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {p0 .. p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    filled-new-array/range {p1 .. p1}, [Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    invoke-virtual {v8, v6, v5, v9}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 247
    .line 248
    .line 249
    filled-new-array/range {p1 .. p1}, [Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    invoke-virtual {v8, v4, v5, v9}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 254
    .line 255
    .line 256
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    if-eqz v8, :cond_12

    .line 265
    .line 266
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    check-cast v8, Lcom/google/android/gms/internal/measurement/w1;

    .line 271
    .line 272
    invoke-virtual/range {p0 .. p0}, LR2/C5;->u()V

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    .line 276
    .line 277
    .line 278
    invoke-static/range {p1 .. p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    invoke-static {v8}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/w1;->R()Z

    .line 285
    .line 286
    .line 287
    move-result v9

    .line 288
    if-nez v9, :cond_8

    .line 289
    .line 290
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    invoke-virtual {v8}, LR2/Y1;->L()LR2/a2;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    const-string v9, "Audience with no ID. appId"

    .line 299
    .line 300
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-virtual {v8, v9, v10}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    goto :goto_5

    .line 308
    :catchall_0
    move-exception v0

    .line 309
    goto/16 :goto_b

    .line 310
    .line 311
    :cond_8
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/w1;->k()I

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/w1;->P()Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v10

    .line 319
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v10

    .line 323
    :cond_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    if-eqz v11, :cond_a

    .line 328
    .line 329
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v11

    .line 333
    check-cast v11, Lcom/google/android/gms/internal/measurement/x1;

    .line 334
    .line 335
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/x1;->V()Z

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    if-nez v11, :cond_9

    .line 340
    .line 341
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    invoke-virtual {v8}, LR2/Y1;->L()LR2/a2;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    const-string v10, "Event filter with no ID. Audience definition ignored. appId, audienceId"

    .line 350
    .line 351
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v11

    .line 355
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object v9

    .line 359
    :goto_6
    invoke-virtual {v8, v10, v11, v9}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    goto :goto_5

    .line 363
    :cond_a
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/w1;->Q()Ljava/util/List;

    .line 364
    .line 365
    .line 366
    move-result-object v10

    .line 367
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    :cond_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v11

    .line 375
    if-eqz v11, :cond_c

    .line 376
    .line 377
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v11

    .line 381
    check-cast v11, Lcom/google/android/gms/internal/measurement/A1;

    .line 382
    .line 383
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/A1;->P()Z

    .line 384
    .line 385
    .line 386
    move-result v11

    .line 387
    if-nez v11, :cond_b

    .line 388
    .line 389
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    invoke-virtual {v8}, LR2/Y1;->L()LR2/a2;

    .line 394
    .line 395
    .line 396
    move-result-object v8

    .line 397
    const-string v10, "Property filter with no ID. Audience definition ignored. appId, audienceId"

    .line 398
    .line 399
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v11

    .line 403
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object v9

    .line 407
    goto :goto_6

    .line 408
    :cond_c
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/w1;->P()Ljava/util/List;

    .line 409
    .line 410
    .line 411
    move-result-object v10

    .line 412
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 413
    .line 414
    .line 415
    move-result-object v10

    .line 416
    :cond_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 417
    .line 418
    .line 419
    move-result v11

    .line 420
    if-eqz v11, :cond_e

    .line 421
    .line 422
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v11

    .line 426
    check-cast v11, Lcom/google/android/gms/internal/measurement/x1;

    .line 427
    .line 428
    invoke-virtual {v1, v0, v9, v11}, LR2/p;->f0(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/x1;)Z

    .line 429
    .line 430
    .line 431
    move-result v11

    .line 432
    if-nez v11, :cond_d

    .line 433
    .line 434
    const/4 v10, 0x0

    .line 435
    goto :goto_7

    .line 436
    :cond_e
    const/4 v10, 0x1

    .line 437
    :goto_7
    if-eqz v10, :cond_10

    .line 438
    .line 439
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/w1;->Q()Ljava/util/List;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 444
    .line 445
    .line 446
    move-result-object v8

    .line 447
    :cond_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v11

    .line 451
    if-eqz v11, :cond_10

    .line 452
    .line 453
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v11

    .line 457
    check-cast v11, Lcom/google/android/gms/internal/measurement/A1;

    .line 458
    .line 459
    invoke-virtual {v1, v0, v9, v11}, LR2/p;->g0(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/A1;)Z

    .line 460
    .line 461
    .line 462
    move-result v11

    .line 463
    if-nez v11, :cond_f

    .line 464
    .line 465
    goto :goto_8

    .line 466
    :cond_10
    if-nez v10, :cond_11

    .line 467
    .line 468
    :goto_8
    invoke-virtual/range {p0 .. p0}, LR2/C5;->u()V

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    .line 472
    .line 473
    .line 474
    invoke-static/range {p1 .. p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {p0 .. p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 478
    .line 479
    .line 480
    move-result-object v8

    .line 481
    const/4 v10, 0x2

    .line 482
    new-array v11, v10, [Ljava/lang/String;

    .line 483
    .line 484
    const/4 v12, 0x0

    .line 485
    aput-object v0, v11, v12

    .line 486
    .line 487
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v13

    .line 491
    const/4 v14, 0x1

    .line 492
    aput-object v13, v11, v14

    .line 493
    .line 494
    invoke-virtual {v8, v6, v3, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 495
    .line 496
    .line 497
    new-array v10, v10, [Ljava/lang/String;

    .line 498
    .line 499
    aput-object v0, v10, v12

    .line 500
    .line 501
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v9

    .line 505
    aput-object v9, v10, v14

    .line 506
    .line 507
    invoke-virtual {v8, v4, v3, v10}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 508
    .line 509
    .line 510
    goto/16 :goto_5

    .line 511
    .line 512
    :cond_11
    const/4 v12, 0x0

    .line 513
    const/4 v14, 0x1

    .line 514
    goto/16 :goto_5

    .line 515
    .line 516
    :cond_12
    new-instance v3, Ljava/util/ArrayList;

    .line 517
    .line 518
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 519
    .line 520
    .line 521
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 526
    .line 527
    .line 528
    move-result v4

    .line 529
    if-eqz v4, :cond_14

    .line 530
    .line 531
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v4

    .line 535
    check-cast v4, Lcom/google/android/gms/internal/measurement/w1;

    .line 536
    .line 537
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/w1;->R()Z

    .line 538
    .line 539
    .line 540
    move-result v5

    .line 541
    if-eqz v5, :cond_13

    .line 542
    .line 543
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/w1;->k()I

    .line 544
    .line 545
    .line 546
    move-result v4

    .line 547
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    goto :goto_a

    .line 552
    :cond_13
    const/4 v4, 0x0

    .line 553
    :goto_a
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    goto :goto_9

    .line 557
    :cond_14
    invoke-virtual {v1, v0, v3}, LR2/p;->z0(Ljava/lang/String;Ljava/util/List;)Z

    .line 558
    .line 559
    .line 560
    invoke-virtual {v7}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 561
    .line 562
    .line 563
    invoke-virtual {v7}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 564
    .line 565
    .line 566
    return-void

    .line 567
    :goto_b
    invoke-virtual {v7}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 568
    .line 569
    .line 570
    throw v0
.end method

.method public final a0(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, LA2/n;->k(I)I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LR2/p;->u0()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string v0, ","

    .line 25
    .line 26
    invoke-static {v0, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "("

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, ")"

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "SELECT COUNT(1) FROM queue WHERE rowid IN "

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, " AND retry_count =  2147483647 LIMIT 1"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-virtual {p0, v0, v1}, LR2/p;->x0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    const-wide/16 v2, 0x0

    .line 74
    .line 75
    cmp-long v0, v0, v2

    .line 76
    .line 77
    if-lez v0, :cond_1

    .line 78
    .line 79
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v1, "The number of upload retries exceeds the limit. Will remain unchanged."

    .line 88
    .line 89
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    new-instance v1, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v2, "UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN "

    .line 99
    .line 100
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p1, " AND (retry_count IS NULL OR retry_count < 2147483647)"

    .line 107
    .line 108
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :catch_0
    move-exception p1

    .line 120
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-string v1, "Error incrementing retry count. error"

    .line 129
    .line 130
    invoke-virtual {v0, v1, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public final b0(LR2/e;)Z
    .locals 5

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, LR2/e;->o:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object v1, p1, LR2/e;->q:LR2/R5;

    .line 16
    .line 17
    iget-object v1, v1, LR2/R5;->p:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, LR2/p;->F0(Ljava/lang/String;Ljava/lang/String;)LR2/T5;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const-string v1, "SELECT COUNT(1) FROM conditional_properties WHERE app_id=?"

    .line 26
    .line 27
    filled-new-array {v0}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0, v1, v2}, LR2/p;->x0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    const-wide/16 v3, 0x3e8

    .line 36
    .line 37
    cmp-long v1, v1, v3

    .line 38
    .line 39
    if-ltz v1, :cond_0

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    return p1

    .line 43
    :cond_0
    new-instance v1, Landroid/content/ContentValues;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v2, "app_id"

    .line 49
    .line 50
    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v2, "origin"

    .line 54
    .line 55
    iget-object v3, p1, LR2/e;->p:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v2, p1, LR2/e;->q:LR2/R5;

    .line 61
    .line 62
    iget-object v2, v2, LR2/R5;->p:Ljava/lang/String;

    .line 63
    .line 64
    const-string v3, "name"

    .line 65
    .line 66
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p1, LR2/e;->q:LR2/R5;

    .line 70
    .line 71
    invoke-virtual {v2}, LR2/R5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const-string v3, "value"

    .line 80
    .line 81
    invoke-static {v1, v3, v2}, LR2/p;->V(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-boolean v2, p1, LR2/e;->s:Z

    .line 85
    .line 86
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const-string v3, "active"

    .line 91
    .line 92
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 93
    .line 94
    .line 95
    const-string v2, "trigger_event_name"

    .line 96
    .line 97
    iget-object v3, p1, LR2/e;->t:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-wide v2, p1, LR2/e;->v:J

    .line 103
    .line 104
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    const-string v3, "trigger_timeout"

    .line 109
    .line 110
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 114
    .line 115
    .line 116
    iget-object v2, p1, LR2/e;->u:LR2/I;

    .line 117
    .line 118
    invoke-static {v2}, LR2/S5;->p0(Landroid/os/Parcelable;)[B

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    const-string v3, "timed_out_event"

    .line 123
    .line 124
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 125
    .line 126
    .line 127
    iget-wide v2, p1, LR2/e;->r:J

    .line 128
    .line 129
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    const-string v3, "creation_timestamp"

    .line 134
    .line 135
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 139
    .line 140
    .line 141
    iget-object v2, p1, LR2/e;->w:LR2/I;

    .line 142
    .line 143
    invoke-static {v2}, LR2/S5;->p0(Landroid/os/Parcelable;)[B

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const-string v3, "triggered_event"

    .line 148
    .line 149
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 150
    .line 151
    .line 152
    iget-object v2, p1, LR2/e;->q:LR2/R5;

    .line 153
    .line 154
    iget-wide v2, v2, LR2/R5;->q:J

    .line 155
    .line 156
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const-string v3, "triggered_timestamp"

    .line 161
    .line 162
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 163
    .line 164
    .line 165
    iget-wide v2, p1, LR2/e;->x:J

    .line 166
    .line 167
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const-string v3, "time_to_live"

    .line 172
    .line 173
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, LR2/m3;->k()LR2/S5;

    .line 177
    .line 178
    .line 179
    iget-object p1, p1, LR2/e;->y:LR2/I;

    .line 180
    .line 181
    invoke-static {p1}, LR2/S5;->p0(Landroid/os/Parcelable;)[B

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    const-string v2, "expired_event"

    .line 186
    .line 187
    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 188
    .line 189
    .line 190
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    const-string v2, "conditional_properties"

    .line 195
    .line 196
    const/4 v3, 0x0

    .line 197
    const/4 v4, 0x5

    .line 198
    invoke-virtual {p1, v2, v3, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 199
    .line 200
    .line 201
    move-result-wide v1

    .line 202
    const-wide/16 v3, -0x1

    .line 203
    .line 204
    cmp-long p1, v1, v3

    .line 205
    .line 206
    if-nez p1, :cond_1

    .line 207
    .line 208
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    const-string v1, "Failed to insert/update conditional user property (got -1)"

    .line 217
    .line 218
    invoke-static {v0}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-virtual {p1, v1, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 223
    .line 224
    .line 225
    goto :goto_0

    .line 226
    :catch_0
    move-exception p1

    .line 227
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    const-string v2, "Error storing conditional user property"

    .line 236
    .line 237
    invoke-static {v0}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v1, v2, v0, p1}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 245
    return p1
.end method

.method public final c0(LR2/A;JZ)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, LR2/A;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LR2/z5;->o()LR2/N5;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p1}, LR2/N5;->F(LR2/A;)Lcom/google/android/gms/internal/measurement/Y1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/j3;->h()[B

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Landroid/content/ContentValues;

    .line 28
    .line 29
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "app_id"

    .line 33
    .line 34
    iget-object v3, p1, LR2/A;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v2, "name"

    .line 40
    .line 41
    iget-object v3, p1, LR2/A;->b:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-wide v2, p1, LR2/A;->d:J

    .line 47
    .line 48
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v3, "timestamp"

    .line 53
    .line 54
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    const-string p3, "metadata_fingerprint"

    .line 62
    .line 63
    invoke-virtual {v1, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 64
    .line 65
    .line 66
    const-string p2, "data"

    .line 67
    .line 68
    invoke-virtual {v1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    const-string p3, "realtime"

    .line 76
    .line 77
    invoke-virtual {v1, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 78
    .line 79
    .line 80
    const/4 p2, 0x0

    .line 81
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    const-string p4, "raw_events"

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    invoke-virtual {p3, p4, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 89
    .line 90
    .line 91
    move-result-wide p3

    .line 92
    const-wide/16 v0, -0x1

    .line 93
    .line 94
    cmp-long p3, p3, v0

    .line 95
    .line 96
    if-nez p3, :cond_0

    .line 97
    .line 98
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    invoke-virtual {p3}, LR2/Y1;->G()LR2/a2;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    const-string p4, "Failed to insert raw event (got -1). appId"

    .line 107
    .line 108
    iget-object v0, p1, LR2/A;->a:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v0}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {p3, p4, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    .line 117
    return p2

    .line 118
    :catch_0
    move-exception p3

    .line 119
    goto :goto_0

    .line 120
    :cond_0
    const/4 p1, 0x1

    .line 121
    return p1

    .line 122
    :goto_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    invoke-virtual {p4}, LR2/Y1;->G()LR2/a2;

    .line 127
    .line 128
    .line 129
    move-result-object p4

    .line 130
    iget-object p1, p1, LR2/A;->a:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const-string v0, "Error storing raw event. appId"

    .line 137
    .line 138
    invoke-virtual {p4, v0, p1, p3}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return p2
.end method

.method public final d0(LR2/T5;)Z
    .locals 8

    .line 1
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, LR2/T5;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v1, p1, LR2/T5;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, LR2/p;->F0(Ljava/lang/String;Ljava/lang/String;)LR2/T5;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p1, LR2/T5;->c:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0}, LR2/S5;->J0(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p1, LR2/T5;->a:Ljava/lang/String;

    .line 30
    .line 31
    filled-new-array {v0}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v2, "select count(1) from user_attributes where app_id=? and name not like \'!_%\' escape \'!\'"

    .line 36
    .line 37
    invoke-virtual {p0, v2, v0}, LR2/p;->x0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v4, p1, LR2/T5;->a:Ljava/lang/String;

    .line 46
    .line 47
    sget-object v5, LR2/K;->I:LR2/P1;

    .line 48
    .line 49
    const/16 v6, 0x19

    .line 50
    .line 51
    const/16 v7, 0x64

    .line 52
    .line 53
    invoke-virtual {v0, v4, v5, v6, v7}, LR2/g;->q(Ljava/lang/String;LR2/P1;II)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    int-to-long v4, v0

    .line 58
    cmp-long v0, v2, v4

    .line 59
    .line 60
    if-ltz v0, :cond_1

    .line 61
    .line 62
    return v1

    .line 63
    :cond_0
    const-string v0, "_npa"

    .line 64
    .line 65
    iget-object v2, p1, LR2/T5;->c:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_1

    .line 72
    .line 73
    iget-object v0, p1, LR2/T5;->a:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v2, p1, LR2/T5;->b:Ljava/lang/String;

    .line 76
    .line 77
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v2, "select count(1) from user_attributes where app_id=? and origin=? AND name like \'!_%\' escape \'!\'"

    .line 82
    .line 83
    invoke-virtual {p0, v2, v0}, LR2/p;->x0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    const-wide/16 v4, 0x19

    .line 88
    .line 89
    cmp-long v0, v2, v4

    .line 90
    .line 91
    if-ltz v0, :cond_1

    .line 92
    .line 93
    return v1

    .line 94
    :cond_1
    new-instance v0, Landroid/content/ContentValues;

    .line 95
    .line 96
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v1, "app_id"

    .line 100
    .line 101
    iget-object v2, p1, LR2/T5;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const-string v1, "origin"

    .line 107
    .line 108
    iget-object v2, p1, LR2/T5;->b:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v1, "name"

    .line 114
    .line 115
    iget-object v2, p1, LR2/T5;->c:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-wide v1, p1, LR2/T5;->d:J

    .line 121
    .line 122
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const-string v2, "set_timestamp"

    .line 127
    .line 128
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 129
    .line 130
    .line 131
    const-string v1, "value"

    .line 132
    .line 133
    iget-object v2, p1, LR2/T5;->e:Ljava/lang/Object;

    .line 134
    .line 135
    invoke-static {v0, v1, v2}, LR2/p;->V(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    const-string v2, "user_attributes"

    .line 143
    .line 144
    const/4 v3, 0x0

    .line 145
    const/4 v4, 0x5

    .line 146
    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 147
    .line 148
    .line 149
    move-result-wide v0

    .line 150
    const-wide/16 v2, -0x1

    .line 151
    .line 152
    cmp-long v0, v0, v2

    .line 153
    .line 154
    if-nez v0, :cond_2

    .line 155
    .line 156
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    const-string v1, "Failed to insert/update user property (got -1). appId"

    .line 165
    .line 166
    iget-object v2, p1, LR2/T5;->a:Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {v2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v0, v1, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :catch_0
    move-exception v0

    .line 177
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    iget-object p1, p1, LR2/T5;->a:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    const-string v2, "Error storing user property. appId"

    .line 192
    .line 193
    invoke-virtual {v1, v2, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 197
    return p1
.end method

.method public final e0(Lcom/google/android/gms/internal/measurement/d2;Z)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->T0()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, LA2/n;->l(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, LR2/p;->S0()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, LE2/e;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->X2()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    invoke-static {}, LR2/g;->M()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    sub-long v4, v0, v4

    .line 44
    .line 45
    cmp-long v2, v2, v4

    .line 46
    .line 47
    if-ltz v2, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->X2()J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    invoke-static {}, LR2/g;->M()J

    .line 54
    .line 55
    .line 56
    move-result-wide v4

    .line 57
    add-long/2addr v4, v0

    .line 58
    cmp-long v2, v2, v4

    .line 59
    .line 60
    if-lez v2, :cond_1

    .line 61
    .line 62
    :cond_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, LR2/Y1;->L()LR2/a2;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v3}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->X2()J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v4, "Storing bundle outside of the max uploading time span. appId, now, timestamp"

    .line 91
    .line 92
    invoke-virtual {v2, v4, v3, v0, v1}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/j3;->h()[B

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const/4 v1, 0x0

    .line 100
    :try_start_0
    invoke-virtual {p0}, LR2/z5;->o()LR2/N5;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2, v0}, LR2/N5;->g0([B)[B

    .line 105
    .line 106
    .line 107
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 108
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, LR2/Y1;->K()LR2/a2;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    array-length v3, v0

    .line 117
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const-string v4, "Saving bundle, size"

    .line 122
    .line 123
    invoke-virtual {v2, v4, v3}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    new-instance v2, Landroid/content/ContentValues;

    .line 127
    .line 128
    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v3, "app_id"

    .line 132
    .line 133
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->X2()J

    .line 141
    .line 142
    .line 143
    move-result-wide v3

    .line 144
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    const-string v4, "bundle_end_timestamp"

    .line 149
    .line 150
    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 151
    .line 152
    .line 153
    const-string v3, "data"

    .line 154
    .line 155
    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 156
    .line 157
    .line 158
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    const-string v0, "has_realtime"

    .line 163
    .line 164
    invoke-virtual {v2, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->a1()Z

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    if-eqz p2, :cond_2

    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->e2()I

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    const-string v0, "retry_count"

    .line 182
    .line 183
    invoke-virtual {v2, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 184
    .line 185
    .line 186
    :cond_2
    :try_start_1
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    const-string v0, "queue"

    .line 191
    .line 192
    const/4 v3, 0x0

    .line 193
    invoke-virtual {p2, v0, v3, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 194
    .line 195
    .line 196
    move-result-wide v2

    .line 197
    const-wide/16 v4, -0x1

    .line 198
    .line 199
    cmp-long p2, v2, v4

    .line 200
    .line 201
    if-nez p2, :cond_3

    .line 202
    .line 203
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    invoke-virtual {p2}, LR2/Y1;->G()LR2/a2;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    const-string v0, "Failed to insert bundle (got -1). appId"

    .line 212
    .line 213
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-static {v2}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {p2, v0, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 222
    .line 223
    .line 224
    return v1

    .line 225
    :catch_0
    move-exception p2

    .line 226
    goto :goto_0

    .line 227
    :cond_3
    const/4 p1, 0x1

    .line 228
    return p1

    .line 229
    :goto_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    const-string v2, "Error storing bundle. appId"

    .line 246
    .line 247
    :goto_1
    invoke-virtual {v0, v2, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    return v1

    .line 251
    :catch_1
    move-exception p2

    .line 252
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d2;->D3()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    const-string v2, "Data loss. Failed to serialize bundle. appId"

    .line 269
    .line 270
    goto :goto_1
.end method

.method public final f0(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/x1;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/x1;->P()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/x1;->V()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/x1;->L()I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    const-string v2, "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"

    .line 60
    .line 61
    invoke-virtual {v0, v2, p1, p2, p3}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return v1

    .line 65
    :cond_1
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/j3;->h()[B

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v3, Landroid/content/ContentValues;

    .line 70
    .line 71
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v4, "app_id"

    .line 75
    .line 76
    invoke-virtual {v3, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const-string v4, "audience_id"

    .line 84
    .line 85
    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/x1;->V()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_2

    .line 93
    .line 94
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/x1;->L()I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    goto :goto_0

    .line 103
    :cond_2
    move-object p2, v2

    .line 104
    :goto_0
    const-string v4, "filter_id"

    .line 105
    .line 106
    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 107
    .line 108
    .line 109
    const-string p2, "event_name"

    .line 110
    .line 111
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/x1;->P()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v3, p2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/x1;->W()Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-eqz p2, :cond_3

    .line 123
    .line 124
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/x1;->T()Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    goto :goto_1

    .line 133
    :cond_3
    move-object p2, v2

    .line 134
    :goto_1
    const-string p3, "session_scoped"

    .line 135
    .line 136
    invoke-virtual {v3, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 137
    .line 138
    .line 139
    const-string p2, "data"

    .line 140
    .line 141
    invoke-virtual {v3, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 142
    .line 143
    .line 144
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    const-string p3, "event_filters"

    .line 149
    .line 150
    const/4 v0, 0x5

    .line 151
    invoke-virtual {p2, p3, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 152
    .line 153
    .line 154
    move-result-wide p2

    .line 155
    const-wide/16 v2, -0x1

    .line 156
    .line 157
    cmp-long p2, p2, v2

    .line 158
    .line 159
    if-nez p2, :cond_4

    .line 160
    .line 161
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p2}, LR2/Y1;->G()LR2/a2;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    const-string p3, "Failed to insert event filter (got -1). appId"

    .line 170
    .line 171
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {p2, p3, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :catch_0
    move-exception p2

    .line 180
    goto :goto_3

    .line 181
    :cond_4
    :goto_2
    const/4 p1, 0x1

    .line 182
    return p1

    .line 183
    :goto_3
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 184
    .line 185
    .line 186
    move-result-object p3

    .line 187
    invoke-virtual {p3}, LR2/Y1;->G()LR2/a2;

    .line 188
    .line 189
    .line 190
    move-result-object p3

    .line 191
    const-string v0, "Error storing event filter. appId"

    .line 192
    .line 193
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p3, v0, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    return v1
.end method

.method public final g0(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/A1;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/A1;->L()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/A1;->P()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/A1;->k()I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    const-string v2, "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"

    .line 60
    .line 61
    invoke-virtual {v0, v2, p1, p2, p3}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return v1

    .line 65
    :cond_1
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/j3;->h()[B

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v3, Landroid/content/ContentValues;

    .line 70
    .line 71
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v4, "app_id"

    .line 75
    .line 76
    invoke-virtual {v3, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const-string v4, "audience_id"

    .line 84
    .line 85
    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/A1;->P()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_2

    .line 93
    .line 94
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/A1;->k()I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    goto :goto_0

    .line 103
    :cond_2
    move-object p2, v2

    .line 104
    :goto_0
    const-string v4, "filter_id"

    .line 105
    .line 106
    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 107
    .line 108
    .line 109
    const-string p2, "property_name"

    .line 110
    .line 111
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/A1;->L()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v3, p2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/A1;->Q()Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-eqz p2, :cond_3

    .line 123
    .line 124
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/A1;->O()Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    goto :goto_1

    .line 133
    :cond_3
    move-object p2, v2

    .line 134
    :goto_1
    const-string p3, "session_scoped"

    .line 135
    .line 136
    invoke-virtual {v3, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 137
    .line 138
    .line 139
    const-string p2, "data"

    .line 140
    .line 141
    invoke-virtual {v3, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 142
    .line 143
    .line 144
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    const-string p3, "property_filters"

    .line 149
    .line 150
    const/4 v0, 0x5

    .line 151
    invoke-virtual {p2, p3, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 152
    .line 153
    .line 154
    move-result-wide p2

    .line 155
    const-wide/16 v2, -0x1

    .line 156
    .line 157
    cmp-long p2, p2, v2

    .line 158
    .line 159
    if-nez p2, :cond_4

    .line 160
    .line 161
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p2}, LR2/Y1;->G()LR2/a2;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    const-string p3, "Failed to insert property filter (got -1). appId"

    .line 170
    .line 171
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {p2, p3, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    .line 177
    .line 178
    return v1

    .line 179
    :catch_0
    move-exception p2

    .line 180
    goto :goto_2

    .line 181
    :cond_4
    const/4 p1, 0x1

    .line 182
    return p1

    .line 183
    :goto_2
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 184
    .line 185
    .line 186
    move-result-object p3

    .line 187
    invoke-virtual {p3}, LR2/Y1;->G()LR2/a2;

    .line 188
    .line 189
    .line 190
    move-result-object p3

    .line 191
    const-string v0, "Error storing property filter. appId"

    .line 192
    .line 193
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p3, v0, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    return v1
.end method

.method public final h0(Ljava/lang/String;LR2/v5;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, LR2/m3;->b()LE2/e;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, LE2/e;->a()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget-wide v2, p2, LR2/v5;->p:J

    .line 22
    .line 23
    invoke-static {}, LR2/g;->M()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    sub-long v4, v0, v4

    .line 28
    .line 29
    cmp-long v2, v2, v4

    .line 30
    .line 31
    if-ltz v2, :cond_0

    .line 32
    .line 33
    iget-wide v2, p2, LR2/v5;->p:J

    .line 34
    .line 35
    invoke-static {}, LR2/g;->M()J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    add-long/2addr v4, v0

    .line 40
    cmp-long v2, v2, v4

    .line 41
    .line 42
    if-lez v2, :cond_1

    .line 43
    .line 44
    :cond_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, LR2/Y1;->L()LR2/a2;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-wide v4, p2, LR2/v5;->p:J

    .line 61
    .line 62
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v4, "Storing trigger URI outside of the max retention time span. appId, now, timestamp"

    .line 67
    .line 68
    invoke-virtual {v2, v4, v3, v0, v1}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v1, "Saving trigger URI"

    .line 80
    .line 81
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Landroid/content/ContentValues;

    .line 85
    .line 86
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v1, "app_id"

    .line 90
    .line 91
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string v1, "trigger_uri"

    .line 95
    .line 96
    iget-object v2, p2, LR2/v5;->o:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget v1, p2, LR2/v5;->q:I

    .line 102
    .line 103
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const-string v2, "source"

    .line 108
    .line 109
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 110
    .line 111
    .line 112
    iget-wide v1, p2, LR2/v5;->p:J

    .line 113
    .line 114
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    const-string v1, "timestamp_millis"

    .line 119
    .line 120
    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 121
    .line 122
    .line 123
    const/4 p2, 0x0

    .line 124
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const-string v2, "trigger_uris"

    .line 129
    .line 130
    const/4 v3, 0x0

    .line 131
    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 132
    .line 133
    .line 134
    move-result-wide v0

    .line 135
    const-wide/16 v2, -0x1

    .line 136
    .line 137
    cmp-long v0, v0, v2

    .line 138
    .line 139
    if-nez v0, :cond_2

    .line 140
    .line 141
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const-string v1, "Failed to insert trigger URI (got -1). appId"

    .line 150
    .line 151
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v0, v1, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    .line 157
    .line 158
    return p2

    .line 159
    :catch_0
    move-exception v0

    .line 160
    goto :goto_0

    .line 161
    :cond_2
    const/4 p1, 0x1

    .line 162
    return p1

    .line 163
    :goto_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    const-string v2, "Error storing trigger URI. appId"

    .line 172
    .line 173
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {v1, v2, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    return p2
.end method

.method public final i0(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    new-instance v10, LR2/A;

    .line 8
    .line 9
    iget-object v1, p0, LR2/m3;->a:LR2/N2;

    .line 10
    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    const-wide/16 v7, 0x0

    .line 14
    .line 15
    const-string v2, ""

    .line 16
    .line 17
    const-string v4, "dep"

    .line 18
    .line 19
    move-object v0, v10

    .line 20
    move-object v3, p1

    .line 21
    move-object v9, p2

    .line 22
    invoke-direct/range {v0 .. v9}, LR2/A;-><init>(LR2/N2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, LR2/z5;->o()LR2/N5;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2, v10}, LR2/N5;->F(LR2/A;)Lcom/google/android/gms/internal/measurement/Y1;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/j3;->h()[B

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p0}, LR2/m3;->h()LR2/X1;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, p1}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    array-length v2, p2

    .line 54
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const-string v3, "Saving default event parameters, appId, data size"

    .line 59
    .line 60
    invoke-virtual {v0, v3, v1, v2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v0, Landroid/content/ContentValues;

    .line 64
    .line 65
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v1, "app_id"

    .line 69
    .line 70
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v1, "parameters"

    .line 74
    .line 75
    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 76
    .line 77
    .line 78
    const/4 p2, 0x0

    .line 79
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const-string v2, "default_event_params"

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    const/4 v4, 0x5

    .line 87
    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    const-wide/16 v2, -0x1

    .line 92
    .line 93
    cmp-long v0, v0, v2

    .line 94
    .line 95
    if-nez v0, :cond_0

    .line 96
    .line 97
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v1, "Failed to insert default event parameters (got -1). appId"

    .line 106
    .line 107
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v0, v1, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    .line 113
    .line 114
    return p2

    .line 115
    :catch_0
    move-exception v0

    .line 116
    goto :goto_0

    .line 117
    :cond_0
    const/4 p1, 0x1

    .line 118
    return p1

    .line 119
    :goto_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const-string v2, "Error storing default event parameters. appId"

    .line 128
    .line 129
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {v1, v2, p1, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    return p2
.end method

.method public final j0(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/Y1;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    invoke-static {p5}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p5}, Lcom/google/android/gms/internal/measurement/j3;->h()[B

    .line 17
    .line 18
    .line 19
    move-result-object p5

    .line 20
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0}, LR2/m3;->h()LR2/X1;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1, p1}, LR2/X1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    array-length v2, p5

    .line 37
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "Saving complex main event, appId, data size"

    .line 42
    .line 43
    invoke-virtual {v0, v3, v1, v2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Landroid/content/ContentValues;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v1, "app_id"

    .line 52
    .line 53
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v1, "event_id"

    .line 57
    .line 58
    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    const-string p3, "children_to_process"

    .line 66
    .line 67
    invoke-virtual {v0, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 68
    .line 69
    .line 70
    const-string p2, "main_event"

    .line 71
    .line 72
    invoke-virtual {v0, p2, p5}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 73
    .line 74
    .line 75
    const/4 p2, 0x0

    .line 76
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    const-string p4, "main_event_params"

    .line 81
    .line 82
    const/4 p5, 0x0

    .line 83
    const/4 v1, 0x5

    .line 84
    invoke-virtual {p3, p4, p5, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 85
    .line 86
    .line 87
    move-result-wide p3

    .line 88
    const-wide/16 v0, -0x1

    .line 89
    .line 90
    cmp-long p3, p3, v0

    .line 91
    .line 92
    if-nez p3, :cond_0

    .line 93
    .line 94
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    invoke-virtual {p3}, LR2/Y1;->G()LR2/a2;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    const-string p4, "Failed to insert complex main event (got -1). appId"

    .line 103
    .line 104
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p5

    .line 108
    invoke-virtual {p3, p4, p5}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    .line 111
    return p2

    .line 112
    :catch_0
    move-exception p3

    .line 113
    goto :goto_0

    .line 114
    :cond_0
    const/4 p1, 0x1

    .line 115
    return p1

    .line 116
    :goto_0
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 117
    .line 118
    .line 119
    move-result-object p4

    .line 120
    invoke-virtual {p4}, LR2/Y1;->G()LR2/a2;

    .line 121
    .line 122
    .line 123
    move-result-object p4

    .line 124
    const-string p5, "Error storing complex main event. appId"

    .line 125
    .line 126
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p4, p5, p1, p3}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return p2
.end method

.method public final u0()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/m3;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "google_app_measurement.db"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public final v0(Ljava/lang/String;)J
    .locals 3

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    filled-new-array {p1}, [Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    const-string v2, "select count(1) from events where app_id=? and name not like \'!_%\' escape \'!\'"

    .line 11
    .line 12
    invoke-virtual {p0, v2, p1, v0, v1}, LR2/p;->G(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
.end method

.method public final w0(Ljava/lang/String;Ljava/lang/String;)J
    .locals 13

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 18
    .line 19
    .line 20
    const-wide/16 v1, 0x0

    .line 21
    .line 22
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v4, "select "

    .line 25
    .line 26
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v4, " from app2 where app_id=?"

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    filled-new-array {p1}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const-wide/16 v5, -0x1

    .line 46
    .line 47
    invoke-virtual {p0, v3, v4, v5, v6}, LR2/p;->G(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v3
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    cmp-long v7, v3, v5

    .line 52
    .line 53
    const-string v8, "app2"

    .line 54
    .line 55
    const-string v9, "app_id"

    .line 56
    .line 57
    if-nez v7, :cond_1

    .line 58
    .line 59
    :try_start_1
    new-instance v3, Landroid/content/ContentValues;

    .line 60
    .line 61
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v9, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v4, "first_open_count"

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    invoke-virtual {v3, v4, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 75
    .line 76
    .line 77
    const-string v4, "previous_install_count"

    .line 78
    .line 79
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v3, v4, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 84
    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    const/4 v7, 0x5

    .line 88
    invoke-virtual {v0, v8, v4, v3, v7}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    cmp-long v3, v3, v5

    .line 93
    .line 94
    if-nez v3, :cond_0

    .line 95
    .line 96
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v3}, LR2/Y1;->G()LR2/a2;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const-string v4, "Failed to insert column (got -1). appId"

    .line 105
    .line 106
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v3, v4, v7, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 114
    .line 115
    .line 116
    return-wide v5

    .line 117
    :catchall_0
    move-exception p1

    .line 118
    goto :goto_2

    .line 119
    :catch_0
    move-exception v3

    .line 120
    goto :goto_0

    .line 121
    :cond_0
    move-wide v3, v1

    .line 122
    :cond_1
    :try_start_2
    new-instance v7, Landroid/content/ContentValues;

    .line 123
    .line 124
    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7, v9, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const-wide/16 v9, 0x1

    .line 131
    .line 132
    add-long/2addr v9, v3

    .line 133
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    invoke-virtual {v7, p2, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 138
    .line 139
    .line 140
    const-string v9, "app_id = ?"

    .line 141
    .line 142
    filled-new-array {p1}, [Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    invoke-virtual {v0, v8, v7, v9, v10}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    int-to-long v7, v7

    .line 151
    cmp-long v1, v7, v1

    .line 152
    .line 153
    if-nez v1, :cond_2

    .line 154
    .line 155
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const-string v2, "Failed to update column (got 0). appId"

    .line 164
    .line 165
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-virtual {v1, v2, v7, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 173
    .line 174
    .line 175
    return-wide v5

    .line 176
    :catch_1
    move-exception v1

    .line 177
    move-wide v11, v3

    .line 178
    move-object v3, v1

    .line 179
    move-wide v1, v11

    .line 180
    goto :goto_0

    .line 181
    :cond_2
    :try_start_3
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :goto_0
    :try_start_4
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v4}, LR2/Y1;->G()LR2/a2;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    const-string v5, "Error inserting column. appId"

    .line 197
    .line 198
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {v4, v5, p1, p2, v3}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 206
    .line 207
    .line 208
    move-wide v3, v1

    .line 209
    :goto_1
    return-wide v3

    .line 210
    :goto_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 211
    .line 212
    .line 213
    throw p1
.end method

.method public final x()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final x0(Ljava/lang/String;[Ljava/lang/String;)J
    .locals 3

    .line 1
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-interface {v1, p2}, Landroid/database/Cursor;->getLong(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 22
    .line 23
    .line 24
    return-wide p1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    move-exception p2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_1
    new-instance p2, Landroid/database/sqlite/SQLiteException;

    .line 30
    .line 31
    const-string v0, "Database returned empty set"

    .line 32
    .line 33
    invoke-direct {p2, v0}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    :goto_0
    :try_start_2
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v2, "Database error"

    .line 46
    .line 47
    invoke-virtual {v0, v2, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    :goto_1
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 54
    .line 55
    .line 56
    :cond_1
    throw p1
.end method

.method public final y()J
    .locals 6

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 5
    .line 6
    .line 7
    move-result-object v3

    .line 8
    const-string v4, "select rowid from raw_events order by rowid desc limit 1;"

    .line 9
    .line 10
    invoke-virtual {v3, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 15
    .line 16
    .line 17
    move-result v3
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 21
    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_0
    const/4 v3, 0x0

    .line 25
    :try_start_1
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 30
    .line 31
    .line 32
    return-wide v0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v3

    .line 36
    :try_start_2
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, LR2/Y1;->G()LR2/a2;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v5, "Error querying raw events"

    .line 45
    .line 46
    invoke-virtual {v4, v5, v3}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-wide v0

    .line 55
    :goto_0
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 58
    .line 59
    .line 60
    :cond_2
    throw v0
.end method

.method public final y0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 22

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, LR2/m3;->n()V

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, LR2/C5;->u()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/4 v4, 0x3

    .line 21
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v12, p1

    .line 25
    .line 26
    :try_start_1
    invoke-interface {v3, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v6, "app_id=?"

    .line 32
    .line 33
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v6
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    if-nez v6, :cond_0

    .line 41
    .line 42
    move-object/from16 v6, p2

    .line 43
    .line 44
    :try_start_2
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    const-string v7, " and origin=?"

    .line 48
    .line 49
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object/from16 v3, p0

    .line 55
    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :catch_0
    move-exception v0

    .line 59
    move-object/from16 v3, p0

    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_0
    move-object/from16 v6, p2

    .line 64
    .line 65
    :goto_0
    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-nez v7, :cond_1

    .line 70
    .line 71
    new-instance v7, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v8, "*"

    .line 80
    .line 81
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    const-string v7, " and name glob ?"

    .line 92
    .line 93
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    new-array v7, v7, [Ljava/lang/String;

    .line 101
    .line 102
    invoke-interface {v3, v7}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    move-object/from16 v17, v3

    .line 107
    .line 108
    check-cast v17, [Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual/range {p0 .. p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    const-string v14, "user_attributes"

    .line 115
    .line 116
    const/4 v3, 0x4

    .line 117
    new-array v15, v3, [Ljava/lang/String;

    .line 118
    .line 119
    const-string v3, "name"

    .line 120
    .line 121
    const/4 v11, 0x0

    .line 122
    aput-object v3, v15, v11

    .line 123
    .line 124
    const-string v3, "set_timestamp"

    .line 125
    .line 126
    const/4 v9, 0x1

    .line 127
    aput-object v3, v15, v9

    .line 128
    .line 129
    const-string v3, "value"

    .line 130
    .line 131
    const/4 v10, 0x2

    .line 132
    aput-object v3, v15, v10

    .line 133
    .line 134
    const-string v3, "origin"

    .line 135
    .line 136
    aput-object v3, v15, v4

    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v16

    .line 142
    const-string v20, "rowid"

    .line 143
    .line 144
    const-string v21, "1001"

    .line 145
    .line 146
    const/16 v18, 0x0

    .line 147
    .line 148
    const/16 v19, 0x0

    .line 149
    .line 150
    invoke-virtual/range {v13 .. v21}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 155
    .line 156
    .line 157
    move-result v3
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 158
    if-nez v3, :cond_2

    .line 159
    .line 160
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 161
    .line 162
    .line 163
    return-object v1

    .line 164
    :cond_2
    :goto_1
    :try_start_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    const/16 v5, 0x3e8

    .line 169
    .line 170
    if-lt v3, v5, :cond_3

    .line 171
    .line 172
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    const-string v3, "Read more than the max allowed user properties, ignoring excess"

    .line 181
    .line 182
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-virtual {v0, v3, v4}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object/from16 v3, p0

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_3
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 197
    .line 198
    .line 199
    move-result-wide v13
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 200
    move-object/from16 v3, p0

    .line 201
    .line 202
    :try_start_4
    invoke-virtual {v3, v2, v10}, LR2/p;->M(Landroid/database/Cursor;I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v15

    .line 206
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v7
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 210
    if-nez v15, :cond_4

    .line 211
    .line 212
    :try_start_5
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-virtual {v5}, LR2/Y1;->G()LR2/a2;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    const-string v6, "(2)Read invalid user property value, ignoring it"

    .line 221
    .line 222
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    invoke-virtual {v5, v6, v8, v7, v0}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 227
    .line 228
    .line 229
    move-object/from16 v17, v7

    .line 230
    .line 231
    move/from16 v18, v9

    .line 232
    .line 233
    move/from16 v19, v10

    .line 234
    .line 235
    move v13, v11

    .line 236
    goto :goto_2

    .line 237
    :catchall_1
    move-exception v0

    .line 238
    goto/16 :goto_7

    .line 239
    .line 240
    :catch_1
    move-exception v0

    .line 241
    move-object v6, v7

    .line 242
    goto :goto_6

    .line 243
    :cond_4
    :try_start_6
    new-instance v6, LR2/T5;
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 244
    .line 245
    move-object v5, v6

    .line 246
    move-object v4, v6

    .line 247
    move-object/from16 v6, p1

    .line 248
    .line 249
    move-object/from16 v17, v7

    .line 250
    .line 251
    move/from16 v18, v9

    .line 252
    .line 253
    move/from16 v19, v10

    .line 254
    .line 255
    move-wide v9, v13

    .line 256
    move v13, v11

    .line 257
    move-object v11, v15

    .line 258
    :try_start_7
    invoke-direct/range {v5 .. v11}, LR2/T5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 265
    .line 266
    .line 267
    move-result v4
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 268
    if-nez v4, :cond_5

    .line 269
    .line 270
    :goto_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 271
    .line 272
    .line 273
    return-object v1

    .line 274
    :cond_5
    move v11, v13

    .line 275
    move-object/from16 v6, v17

    .line 276
    .line 277
    move/from16 v9, v18

    .line 278
    .line 279
    move/from16 v10, v19

    .line 280
    .line 281
    const/4 v4, 0x3

    .line 282
    goto :goto_1

    .line 283
    :catch_2
    move-exception v0

    .line 284
    :goto_4
    move-object/from16 v6, v17

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :catch_3
    move-exception v0

    .line 288
    move-object/from16 v17, v7

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :catch_4
    move-exception v0

    .line 292
    goto :goto_6

    .line 293
    :catch_5
    move-exception v0

    .line 294
    move-object/from16 v3, p0

    .line 295
    .line 296
    :goto_5
    move-object/from16 v6, p2

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :catch_6
    move-exception v0

    .line 300
    move-object/from16 v3, p0

    .line 301
    .line 302
    move-object/from16 v12, p1

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :goto_6
    :try_start_8
    invoke-virtual/range {p0 .. p0}, LR2/m3;->j()LR2/Y1;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    const-string v4, "(2)Error querying user properties"

    .line 314
    .line 315
    invoke-static/range {p1 .. p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    invoke-virtual {v1, v4, v5, v6, v0}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 326
    if-eqz v2, :cond_6

    .line 327
    .line 328
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 329
    .line 330
    .line 331
    :cond_6
    return-object v0

    .line 332
    :goto_7
    if-eqz v2, :cond_7

    .line 333
    .line 334
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 335
    .line 336
    .line 337
    :cond_7
    throw v0
.end method

.method public final z()J
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-wide/16 v1, 0x0

    .line 3
    .line 4
    const-string v3, "select max(bundle_end_timestamp) from queue"

    .line 5
    .line 6
    invoke-virtual {p0, v3, v0, v1, v2}, LR2/p;->G(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public final z0(Ljava/lang/String;Ljava/util/List;)Z
    .locals 7

    .line 1
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LR2/C5;->u()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LR2/m3;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :try_start_0
    const-string v2, "select count(1) from audience_filter_values where app_id=?"

    .line 16
    .line 17
    filled-new-array {p1}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {p0, v2, v3}, LR2/p;->x0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    invoke-virtual {p0}, LR2/m3;->f()LR2/g;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    sget-object v5, LR2/K;->H:LR2/P1;

    .line 30
    .line 31
    invoke-virtual {v4, p1, v5}, LR2/g;->u(Ljava/lang/String;LR2/P1;)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/16 v5, 0x7d0

    .line 36
    .line 37
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    int-to-long v5, v4

    .line 46
    cmp-long v2, v2, v5

    .line 47
    .line 48
    if-gtz v2, :cond_0

    .line 49
    .line 50
    return v1

    .line 51
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    move v3, v1

    .line 57
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-ge v3, v5, :cond_2

    .line 62
    .line 63
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Ljava/lang/Integer;

    .line 68
    .line 69
    if-nez v5, :cond_1

    .line 70
    .line 71
    return v1

    .line 72
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    const-string p2, ","

    .line 87
    .line 88
    invoke-static {p2, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v3, "("

    .line 95
    .line 96
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string p2, ")"

    .line 103
    .line 104
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    new-instance v2, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v3, "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "

    .line 114
    .line 115
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p2, " order by rowid desc limit -1 offset ?)"

    .line 122
    .line 123
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    filled-new-array {p1, v2}, [Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string v2, "audience_filter_values"

    .line 139
    .line 140
    invoke-virtual {v0, v2, p2, p1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-lez p1, :cond_3

    .line 145
    .line 146
    const/4 p1, 0x1

    .line 147
    return p1

    .line 148
    :cond_3
    return v1

    .line 149
    :catch_0
    move-exception p2

    .line 150
    invoke-virtual {p0}, LR2/m3;->j()LR2/Y1;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const-string v2, "Database error querying filters. appId"

    .line 159
    .line 160
    invoke-static {p1}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {v0, v2, p1, p2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    return v1
.end method
