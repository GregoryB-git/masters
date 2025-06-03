.class public final Lcom/google/android/recaptcha/internal/zzbq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzbq;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/recaptcha/internal/zzbq;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzbq;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzbq;->zza:Lcom/google/android/recaptcha/internal/zzbq;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ldc/l;JJDLdc/l;Lub/e;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p9

    instance-of v1, v0, Lcom/google/android/recaptcha/internal/zzbp;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/google/android/recaptcha/internal/zzbp;

    iget v2, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzh:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzh:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/recaptcha/internal/zzbp;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lcom/google/android/recaptcha/internal/zzbp;-><init>(Lcom/google/android/recaptcha/internal/zzbq;Lub/e;)V

    :goto_0
    iget-object v0, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzf:Ljava/lang/Object;

    sget-object v3, Lvb/a;->a:Lvb/a;

    iget v4, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzh:I

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eqz v4, :cond_3

    if-eq v4, v5, :cond_2

    if-ne v4, v6, :cond_1

    iget-wide v7, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzd:J

    iget-wide v9, v1, Lcom/google/android/recaptcha/internal/zzbp;->zze:D

    iget-wide v11, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzc:J

    iget-object v4, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzb:Ljava/lang/Object;

    check-cast v4, Ldc/l;

    iget-object v13, v1, Lcom/google/android/recaptcha/internal/zzbp;->zza:Ljava/lang/Object;

    check-cast v13, Ldc/l;

    invoke-static {v0}, Lrb/f;->b(Ljava/lang/Object;)V

    :goto_1
    move-wide v15, v11

    move-object v12, v1

    move-object v11, v4

    move-object v1, v13

    move-object v13, v3

    move-wide v3, v7

    move-wide v7, v15

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v7, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzd:J

    iget-wide v9, v1, Lcom/google/android/recaptcha/internal/zzbp;->zze:D

    iget-wide v11, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzc:J

    iget-object v4, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzb:Ljava/lang/Object;

    check-cast v4, Ldc/l;

    iget-object v13, v1, Lcom/google/android/recaptcha/internal/zzbp;->zza:Ljava/lang/Object;

    check-cast v13, Ldc/l;

    :try_start_0
    invoke-static {v0}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_4

    :cond_3
    invoke-static {v0}, Lrb/f;->b(Ljava/lang/Object;)V

    move-wide/from16 v7, p4

    move-wide/from16 v9, p6

    move-object/from16 v11, p8

    move-object v12, v1

    move-object v13, v3

    move-object/from16 v1, p1

    move-wide/from16 v3, p2

    :goto_2
    :try_start_1
    iput-object v1, v12, Lcom/google/android/recaptcha/internal/zzbp;->zza:Ljava/lang/Object;

    iput-object v11, v12, Lcom/google/android/recaptcha/internal/zzbp;->zzb:Ljava/lang/Object;

    iput-wide v7, v12, Lcom/google/android/recaptcha/internal/zzbp;->zzc:J

    iput-wide v9, v12, Lcom/google/android/recaptcha/internal/zzbp;->zze:D

    iput-wide v3, v12, Lcom/google/android/recaptcha/internal/zzbp;->zzd:J

    iput v5, v12, Lcom/google/android/recaptcha/internal/zzbp;->zzh:I

    invoke-interface {v11, v12}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne v0, v13, :cond_4

    return-object v13

    :cond_4
    :goto_3
    return-object v0

    :catch_1
    move-exception v0

    move-object v15, v13

    move-object v13, v1

    move-object v1, v12

    move-wide/from16 v16, v3

    move-object v4, v11

    move-wide v11, v7

    move-object v3, v15

    move-wide/from16 v7, v16

    :goto_4
    invoke-interface {v13, v0}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    if-eqz v14, :cond_7

    long-to-double v7, v7

    mul-double/2addr v7, v9

    double-to-long v7, v7

    cmp-long v0, v7, v11

    if-lez v0, :cond_5

    move-wide v7, v11

    :cond_5
    iput-object v13, v1, Lcom/google/android/recaptcha/internal/zzbp;->zza:Ljava/lang/Object;

    iput-object v4, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzb:Ljava/lang/Object;

    iput-wide v11, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzc:J

    iput-wide v9, v1, Lcom/google/android/recaptcha/internal/zzbp;->zze:D

    iput-wide v7, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzd:J

    iput v6, v1, Lcom/google/android/recaptcha/internal/zzbp;->zzh:I

    invoke-static {v7, v8, v1}, Lnc/m0;->a(JLwb/c;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v3, :cond_6

    goto :goto_1

    :cond_6
    return-object v3

    :cond_7
    throw v0
.end method
