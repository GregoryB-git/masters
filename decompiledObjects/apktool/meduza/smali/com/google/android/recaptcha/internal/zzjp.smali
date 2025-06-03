.class final Lcom/google/android/recaptcha/internal/zzjp;
.super Lcom/google/android/recaptcha/internal/zzjk;
.source "SourceFile"


# instance fields
.field public final synthetic zza:Ljava/lang/Iterable;

.field public final synthetic zzb:I


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzjp;->zza:Ljava/lang/Iterable;

    iput p2, p0, Lcom/google/android/recaptcha/internal/zzjp;->zzb:I

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzjk;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 5

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzjp;->zza:Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lcom/google/android/recaptcha/internal/zzjp;->zzb:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzjp;->zzb:I

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    if-ltz v1, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    const-string v4, "numberToAdvance must be nonnegative"

    invoke-static {v3, v4}, Lcom/google/android/recaptcha/internal/zzjf;->zzb(ZLjava/lang/Object;)V

    :goto_1
    if-ge v2, v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    new-instance v1, Lcom/google/android/recaptcha/internal/zzjo;

    invoke-direct {v1, p0, v0}, Lcom/google/android/recaptcha/internal/zzjo;-><init>(Lcom/google/android/recaptcha/internal/zzjp;Ljava/util/Iterator;)V

    return-object v1
.end method
