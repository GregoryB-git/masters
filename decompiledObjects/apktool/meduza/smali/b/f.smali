.class public final synthetic Lb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/c$b;


# instance fields
.field public final synthetic a:Lb/j;


# direct methods
.method public synthetic constructor <init>(Lb/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/f;->a:Lb/j;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lb/f;->a:Lb/j;

    invoke-static {v0}, Lb/j;->a(Lb/j;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
