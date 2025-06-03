.class Lcom/google/android/gms/internal/firebase-auth-api/zzaeg$zza;
.super Ll6/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/firebase-auth-api/zzaeg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# instance fields
.field private final zza:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb8/f0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ll6/g;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll6/g;",
            "Ljava/util/List<",
            "Lb8/f0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ll6/f;-><init>(Ll6/g;)V

    iget-object p1, p0, Ll6/f;->mLifecycleFragment:Ll6/g;

    const-string v0, "PhoneAuthActivityStopCallback"

    invoke-interface {p1, v0, p0}, Ll6/g;->c(Ljava/lang/String;Ll6/f;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeg$zza;->zza:Ljava/util/List;

    return-void
.end method

.method public static zza(Landroid/app/Activity;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Lb8/f0;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0}, Ll6/f;->getFragment(Landroid/app/Activity;)Ll6/g;

    move-result-object p0

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeg$zza;

    const-string v1, "PhoneAuthActivityStopCallback"

    invoke-interface {p0, v0, v1}, Ll6/g;->a(Ljava/lang/Class;Ljava/lang/String;)Ll6/f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeg$zza;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeg$zza;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaeg$zza;-><init>(Ll6/g;Ljava/util/List;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onStop()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeg$zza;->zza:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeg$zza;->zza:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
