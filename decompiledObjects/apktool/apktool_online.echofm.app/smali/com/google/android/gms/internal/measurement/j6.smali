.class public final Lcom/google/android/gms/internal/measurement/j6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/g6;


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/S2;

.field public static final b:Lcom/google/android/gms/internal/measurement/S2;

.field public static final c:Lcom/google/android/gms/internal/measurement/S2;

.field public static final d:Lcom/google/android/gms/internal/measurement/S2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/measurement/a3;

    const-string v1, "com.google.android.gms.measurement"

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P2;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/a3;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a3;->f()Lcom/google/android/gms/internal/measurement/a3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a3;->e()Lcom/google/android/gms/internal/measurement/a3;

    move-result-object v0

    const-string v1, "measurement.client.consent_state_v1"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/a3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/j6;->a:Lcom/google/android/gms/internal/measurement/S2;

    const-string v1, "measurement.client.3p_consent_state_v1"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/a3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/j6;->b:Lcom/google/android/gms/internal/measurement/S2;

    const-string v1, "measurement.service.consent_state_v1_W36"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/a3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/j6;->c:Lcom/google/android/gms/internal/measurement/S2;

    const-string v1, "measurement.service.storage_consent_support_version"

    const-wide/32 v2, 0x31b50

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/a3;->b(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/j6;->d:Lcom/google/android/gms/internal/measurement/S2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/j6;->d:Lcom/google/android/gms/internal/measurement/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/S2;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method
