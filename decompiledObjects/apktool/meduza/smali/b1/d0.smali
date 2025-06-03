.class public final synthetic Lb1/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/c$b;


# instance fields
.field public final synthetic a:Lb1/e0;


# direct methods
.method public synthetic constructor <init>(Lb1/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/d0;->a:Lb1/e0;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lb1/d0;->a:Lb1/e0;

    invoke-static {v0}, Lb1/e0;->a(Lb1/e0;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
