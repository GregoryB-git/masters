.class public final Lx0/i$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/i;->performCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx0/i;


# direct methods
.method public constructor <init>(Lx0/i;)V
    .locals 0

    iput-object p1, p0, Lx0/i$g;->a:Lx0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb1/o;Lb1/k$a;)V
    .locals 0

    sget-object p1, Lb1/k$a;->ON_STOP:Lb1/k$a;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lx0/i$g;->a:Lx0/i;

    iget-object p1, p1, Lx0/i;->mView:Landroid/view/View;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_0
    return-void
.end method
