.class public final LR2/N4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lcom/google/android/gms/internal/measurement/y0;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/y0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/N4;->r:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 2
    .line 3
    iput-object p2, p0, LR2/N4;->o:Lcom/google/android/gms/internal/measurement/y0;

    .line 4
    .line 5
    iput-object p3, p0, LR2/N4;->p:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, LR2/N4;->q:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LR2/N4;->r:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:LR2/N2;

    .line 4
    .line 5
    invoke-virtual {v0}, LR2/N2;->J()LR2/D4;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LR2/N4;->o:Lcom/google/android/gms/internal/measurement/y0;

    .line 10
    .line 11
    iget-object v2, p0, LR2/N4;->p:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, p0, LR2/N4;->q:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2, v3}, LR2/D4;->N(Lcom/google/android/gms/internal/measurement/y0;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
