.class public final Lcom/google/android/recaptcha/internal/zzbs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lj6/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lj6/f;->b:Lj6/f;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzbs;->zza:Lj6/f;

    return-void
.end method

.method public constructor <init>(Lj6/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzbs;->zza:Lj6/f;

    return-void
.end method


# virtual methods
.method public final zza(Landroid/content/Context;)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzbs;->zza:Lj6/f;

    invoke-virtual {v0, p1}, Lj6/f;->b(Landroid/content/Context;)I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/16 v1, 0x9

    if-eq p1, v1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x4

    return p1
.end method
