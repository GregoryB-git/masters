.class public final Lcom/google/android/gms/internal/measurement/z4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/J4;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/G4;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This should never be called."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Ljava/lang/Class;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method
