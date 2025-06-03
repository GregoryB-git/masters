.class public final Landroid/support/v4/os/a$b;
.super Landroid/support/v4/os/IResultReceiver$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/os/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Landroid/support/v4/os/a;


# direct methods
.method public constructor <init>(Landroid/support/v4/os/a;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/os/a$b;->a:Landroid/support/v4/os/a;

    invoke-direct {p0}, Landroid/support/v4/os/IResultReceiver$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public final a3(ILandroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/os/a$b;->a:Landroid/support/v4/os/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Landroid/support/v4/os/a$b;->a:Landroid/support/v4/os/a;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/os/a;->a(ILandroid/os/Bundle;)V

    return-void
.end method
