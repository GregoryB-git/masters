.class final Lcom/google/android/gms/internal/firebase-auth-api/zzpo;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Ljava/security/SecureRandom;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic initialValue()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp;->zza()Ljava/security/SecureRandom;

    move-result-object v0

    return-object v0
.end method
