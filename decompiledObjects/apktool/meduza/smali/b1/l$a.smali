.class public final Lb1/l$a;
.super Lb1/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb1/f;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "activity"

    invoke-static {p1, p2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lb1/c0;->b:I

    invoke-static {p1}, Lb1/c0$b;->b(Landroid/app/Activity;)V

    return-void
.end method
