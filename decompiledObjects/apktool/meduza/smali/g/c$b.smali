.class public final Lg/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg/c;->initDelegate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg/c;


# direct methods
.method public constructor <init>(Lg/c;)V
    .locals 0

    iput-object p1, p0, Lg/c$b;->a:Lg/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 2

    iget-object p1, p0, Lg/c$b;->a:Lg/c;

    invoke-virtual {p1}, Lg/c;->getDelegate()Lg/f;

    move-result-object p1

    invoke-virtual {p1}, Lg/f;->k()V

    iget-object v0, p0, Lg/c$b;->a:Lg/c;

    invoke-virtual {v0}, Lb/j;->getSavedStateRegistry()Ls1/c;

    move-result-object v0

    const-string v1, "androidx:appcompat"

    invoke-virtual {v0, v1}, Ls1/c;->a(Ljava/lang/String;)Landroid/os/Bundle;

    invoke-virtual {p1}, Lg/f;->o()V

    return-void
.end method
