.class public final Lcom/google/android/gms/internal/measurement/V6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/W6;


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

    const-string v1, "measurement.sdk.collection.enable_extend_user_property_size"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/a3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/V6;->a:Lcom/google/android/gms/internal/measurement/S2;

    const-string v1, "measurement.sdk.collection.last_deep_link_referrer2"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/a3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/V6;->b:Lcom/google/android/gms/internal/measurement/S2;

    const-string v1, "measurement.sdk.collection.last_deep_link_referrer_campaign2"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/a3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/V6;->c:Lcom/google/android/gms/internal/measurement/S2;

    const-string v1, "measurement.id.sdk.collection.last_deep_link_referrer2"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/a3;->b(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/V6;->d:Lcom/google/android/gms/internal/measurement/S2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/V6;->c:Lcom/google/android/gms/internal/measurement/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/S2;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
