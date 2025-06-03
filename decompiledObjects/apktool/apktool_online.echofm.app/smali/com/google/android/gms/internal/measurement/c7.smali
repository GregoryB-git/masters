.class public final Lcom/google/android/gms/internal/measurement/c7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/d7;


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/S2;

.field public static final b:Lcom/google/android/gms/internal/measurement/S2;

.field public static final c:Lcom/google/android/gms/internal/measurement/S2;

.field public static final d:Lcom/google/android/gms/internal/measurement/S2;

.field public static final e:Lcom/google/android/gms/internal/measurement/S2;


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

    const-string v1, "measurement.test.boolean_flag"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/a3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/c7;->a:Lcom/google/android/gms/internal/measurement/S2;

    const-string v1, "measurement.test.double_flag"

    const-wide/high16 v2, -0x3ff8000000000000L    # -3.0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/a3;->a(Ljava/lang/String;D)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/c7;->b:Lcom/google/android/gms/internal/measurement/S2;

    const-string v1, "measurement.test.int_flag"

    const-wide/16 v2, -0x2

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/a3;->b(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/c7;->c:Lcom/google/android/gms/internal/measurement/S2;

    const-string v1, "measurement.test.long_flag"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/a3;->b(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/c7;->d:Lcom/google/android/gms/internal/measurement/S2;

    const-string v1, "measurement.test.string_flag"

    const-string v2, "---"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/a3;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/c7;->e:Lcom/google/android/gms/internal/measurement/S2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()D
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/c7;->b:Lcom/google/android/gms/internal/measurement/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/S2;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public final b()J
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/c7;->c:Lcom/google/android/gms/internal/measurement/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/S2;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()J
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/c7;->d:Lcom/google/android/gms/internal/measurement/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/S2;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/c7;->e:Lcom/google/android/gms/internal/measurement/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/S2;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/c7;->a:Lcom/google/android/gms/internal/measurement/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/S2;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
