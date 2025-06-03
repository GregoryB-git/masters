.class public final Lb1/c0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/c0$c$a;
    }
.end annotation


# static fields
.field public static final Companion:Lb1/c0$c$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb1/c0$c$a;

    invoke-direct {v0}, Lb1/c0$c$a;-><init>()V

    sput-object v0, Lb1/c0$c;->Companion:Lb1/c0$c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final registerIn(Landroid/app/Activity;)V
    .locals 1

    sget-object v0, Lb1/c0$c;->Companion:Lb1/c0$c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "activity"

    invoke-static {p0, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb1/c0$c;

    invoke-direct {v0}, Lb1/c0$c;-><init>()V

    invoke-static {p0, v0}, Laa/v;->k(Landroid/app/Activity;Lb1/c0$c;)V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "activity"

    invoke-static {p1, p2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "activity"

    invoke-static {p1, p2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lb1/c0;->b:I

    sget-object p2, Lb1/k$a;->ON_CREATE:Lb1/k$a;

    invoke-static {p1, p2}, Lb1/c0$b;->a(Landroid/app/Activity;Lb1/k$a;)V

    return-void
.end method

.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lb1/c0;->b:I

    sget-object v0, Lb1/k$a;->ON_RESUME:Lb1/k$a;

    invoke-static {p1, v0}, Lb1/c0$b;->a(Landroid/app/Activity;Lb1/k$a;)V

    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lb1/c0;->b:I

    sget-object v0, Lb1/k$a;->ON_START:Lb1/k$a;

    invoke-static {p1, v0}, Lb1/c0$b;->a(Landroid/app/Activity;Lb1/k$a;)V

    return-void
.end method

.method public onActivityPreDestroyed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lb1/c0;->b:I

    sget-object v0, Lb1/k$a;->ON_DESTROY:Lb1/k$a;

    invoke-static {p1, v0}, Lb1/c0$b;->a(Landroid/app/Activity;Lb1/k$a;)V

    return-void
.end method

.method public onActivityPrePaused(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lb1/c0;->b:I

    sget-object v0, Lb1/k$a;->ON_PAUSE:Lb1/k$a;

    invoke-static {p1, v0}, Lb1/c0$b;->a(Landroid/app/Activity;Lb1/k$a;)V

    return-void
.end method

.method public onActivityPreStopped(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lb1/c0;->b:I

    sget-object v0, Lb1/k$a;->ON_STOP:Lb1/k$a;

    invoke-static {p1, v0}, Lb1/c0$b;->a(Landroid/app/Activity;Lb1/k$a;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bundle"

    invoke-static {p2, p1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
