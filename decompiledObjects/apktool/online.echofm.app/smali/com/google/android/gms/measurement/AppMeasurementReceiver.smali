.class public final Lcom/google/android/gms/measurement/AppMeasurementReceiver;
.super LV/a;
.source "SourceFile"

# interfaces
.implements LR2/v2$a;


# instance fields
.field public q:LR2/v2;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LV/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, LV/a;->c(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->q:LR2/v2;

    if-nez v0, :cond_0

    new-instance v0, LR2/v2;

    invoke-direct {v0, p0}, LR2/v2;-><init>(LR2/v2$a;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->q:LR2/v2;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->q:LR2/v2;

    invoke-virtual {v0, p1, p2}, LR2/v2;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
