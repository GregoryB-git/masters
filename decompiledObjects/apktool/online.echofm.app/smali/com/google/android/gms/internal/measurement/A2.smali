.class public final synthetic Lcom/google/android/gms/internal/measurement/A2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/G2;


# instance fields
.field public synthetic a:Lcom/google/android/gms/internal/measurement/B2;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/B2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/A2;->a:Lcom/google/android/gms/internal/measurement/B2;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/A2;->a:Lcom/google/android/gms/internal/measurement/B2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/B2;->c()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
