.class public final Lcom/google/android/gms/internal/measurement/k2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/g4;


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/g4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/k2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/k2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/k2;->a:Lcom/google/android/gms/internal/measurement/g4;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(I)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/j2;->c(I)Lcom/google/android/gms/internal/measurement/j2;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
