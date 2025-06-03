.class public final LR2/e5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/a5;


# direct methods
.method public constructor <init>(LR2/a5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/e5;->o:LR2/a5;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LR2/e5;->o:LR2/a5;

    .line 2
    .line 3
    iget-object v0, v0, LR2/a5;->c:LR2/D4;

    .line 4
    .line 5
    new-instance v1, Landroid/content/ComponentName;

    .line 6
    .line 7
    iget-object v2, p0, LR2/e5;->o:LR2/a5;

    .line 8
    .line 9
    iget-object v2, v2, LR2/a5;->c:LR2/D4;

    .line 10
    .line 11
    invoke-virtual {v2}, LR2/m3;->a()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    .line 16
    .line 17
    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, LR2/D4;->I(LR2/D4;Landroid/content/ComponentName;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
